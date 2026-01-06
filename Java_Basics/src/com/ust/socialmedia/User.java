package com.ust.socialmedia;


import java.util.ArrayList;
import java.util.List;

public class User {
	
	private int id;
    private String name;
    private List<User> friends;
    private List<Post> posts;
    
    
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.friends = new ArrayList<>();
		this.posts = new ArrayList<>();
	}
	
	
	public List<User> getFriends() {
		return friends;
	}


	public List<Post> getPosts() {
		return posts;
	}
	
	public void addFriend(User user) {
		if(!friends.contains(user)) {
            friends.add(user);
            user.addFriend(this);
        }
	}
	
	public void addPost(Post post) {
		posts.add(post);
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	

	
	
    
	
    

}
