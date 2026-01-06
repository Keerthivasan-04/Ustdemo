package com.ust.socialmedia;

public class SocialMediaDemo {

	public static void main(String[] args) {
		 // Create users
        User albert = new User(1, "Albert");
        User baskar   = new User(2, "Baskar");
        User charan = new User(3, "Charan");

        // Create friendships
        Friend f1 = new Friend(albert, baskar);
        Friend f2 = new Friend(albert, charan);

        // Albert creates a post
        Post post1 = new Post(101, "Hello everyone!", albert);

        // Baskar and Charan comment on Alice's post
        Comment c1 =  new Comment(201, "Nice post!", baskar, post1);
        Comment c2 =  new Comment(202, "Welcome!", charan, post1);

        // Output
        System.out.println("Albert's Friends:");
        System.out.println(albert.getFriends());

        System.out.println("\nAlbert's Posts:");
        System.out.println(albert.getPosts());

        System.out.println("\nComments on Albert's Post:" + post1.getId());
        System.out.println(post1.getComments());

	}

}
