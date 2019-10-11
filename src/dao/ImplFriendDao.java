package dao;

import bean.Friend;
import util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ImplFriendDao implements FriendDao {
   public List<Friend> list(){
        Connection con = JDBCUtil.getConnection();
        List<Friend> list = null;
        ResultSet rs = null;
        String sql = "select * from friend";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs!=null){
                list = new ArrayList<>();
                while(rs.next()){
                    Friend f = pGetFriend(rs);
                    list.add(f);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;

    }

    public void addFriend(Friend f){
        Connection con = JDBCUtil.getConnection();
        String sql = "insert into friend (name,locate,phonenum) values (?,?,?)";

         try {
             PreparedStatement ps = con.prepareStatement(sql);
             ps.setString(1,f.getName());
             ps.setString(2,f.getLocation());
             ps.setString(3,f.getPhoneNum());
             ps.executeUpdate();

         } catch (SQLException e) {
             e.printStackTrace();
         }

     }

    public void deleteFriend(int id){
        Connection con = JDBCUtil.getConnection();
        String sql = "delete from friend where id = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public void updateFriend(Friend f){
        Connection con = JDBCUtil.getConnection();
        String sql = "Update friend set name = ?,locate = ?,phonenum = ? where id = ?";

        int id = f.getId();
        String name = f.getName();
        String locate = f.getLocation();
        String phonenum = f.getPhoneNum();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,name);
            ps.setString(2,locate);
            ps.setString(3,phonenum);
            ps.setInt(4,id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    //当进行删除或者修改信息的时候需要该方法
    public Friend getFriend(int id){
        Connection con = JDBCUtil.getConnection();
        Friend f = null;
        String sql = "select * from friend where id = ?";
        ResultSet rs = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            rs = ps.executeQuery();
            while(rs.next()) {
                f = new Friend();
                f.setId(rs.getInt("id"));
                f.setName(rs.getString("name"));
                f.setLocation(rs.getString("locate"));
                f.setPhoneNum(rs.getString("phonenum"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return f;
    }

    //将ResultSet中的一条结果封装到一个Javabean中
    private Friend pGetFriend(ResultSet rs){
       Friend f = new Friend();
        try {
            f.setId(rs.getInt("id"));
            f.setName(rs.getString("name"));
            f.setLocation(rs.getString("locate"));
            f.setPhoneNum(rs.getString("phonenum"));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return f;

    }

    //按照特定关键词查找对应的朋友
    public List<Friend> searchFriends(String info){
        Connection con = JDBCUtil.getConnection();
        String sql = "select * from friend where name = ? or locate = ? or phonenum = ?";
        ResultSet rs = null;
        List<Friend> list = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,info);
            ps.setString(2,info);
            ps.setString(3,info);
            rs = ps.executeQuery();
            if(rs!=null){
                list = new ArrayList<>();
                while(rs.next()){
                    Friend friend = pGetFriend(rs);
                    list.add(friend);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

}
