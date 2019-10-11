package service;

import bean.Friend;
import dao.FriendDao;
import dao.ImplFriendDao;

import java.util.List;

public class ImplFriendService implements FriendService {

    FriendDao fd = new ImplFriendDao();

    @Override
    public List<Friend> listFriendService() {
        return fd.list();
    }

    @Override
    public void addFriendService(Friend f) {
        fd.addFriend(f);

    }

    @Override
    public void deleteFriendService(int id) {
        fd.deleteFriend(id);

    }

    @Override
    public void updateFriendService(Friend f) {
        fd.updateFriend(f);

    }

    @Override
    public Friend getFriendService(int id) {
        return fd.getFriend(id);
    }

    @Override
    public List<Friend> searchFriendService(String info) {
        return fd.searchFriends(info);
    }
}
