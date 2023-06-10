package com.a01062023.bintangrestuapp;
import java.util.ArrayList;
public class Constraint_FriendsList {
    public static ArrayList<FriendsList> getFriendsListData() {
        ArrayList<FriendsList> friendsList
                = new ArrayList<FriendsList>();
        FriendsList emp1 = new FriendsList(R.drawable.img_account_circle_24,
                "Zidane");
        friendsList.add(emp1);
        FriendsList emp2
                = new FriendsList(R.drawable.img_account_circle_24, "Taufik");
        friendsList.add(emp2);
        FriendsList emp3 = new FriendsList(R.drawable.img_account_circle_24,
                "Andreas");
        friendsList.add(emp3);
        return friendsList;
    }

}
