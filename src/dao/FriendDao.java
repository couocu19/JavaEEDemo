package dao;

import bean.Friend;

import java.util.List;

public interface FriendDao {

    List<Friend> list();
    void addFriend(Friend f);
    void deleteFriend(int id);
    void updateFriend(Friend f);
    Friend getFriend(int id);
    List<Friend> searchFriends(String info);


}
