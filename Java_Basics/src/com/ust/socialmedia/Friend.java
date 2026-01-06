package com.ust.socialmedia;

public class Friend {
	
	private User user1;
    private User user2;

    public Friend(User user1, User user2) {
        if (user1 == null || user2 == null) {
            throw new IllegalArgumentException("Users cannot be null");
        }
        this.user1 = user1;
        this.user2 = user2;
        user1.addFriend(user2);
    }

    public User getUser1() {
        return user1;
    }

    public User getUser2() {
        return user2;
    }

    @Override
    public String toString() {
        return "Friend{" + user1 + " ↔ " + user2 + "}";
    }

}
