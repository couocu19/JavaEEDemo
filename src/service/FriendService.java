package service;

import bean.Friend;

import java.util.List;

public interface FriendService {
    List<Friend> listFriendService();
    void addFriendService(Friend f);
    void deleteFriendService(int id);
    void updateFriendService(Friend f);
    Friend getFriendService(int id);
    List<Friend> searchFriendService(String info);

}
