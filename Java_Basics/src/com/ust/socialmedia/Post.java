package com.ust.socialmedia;

import java.util.ArrayList;
import java.util.List;

public class Post {
	
	private int id;
	private String content;
	private User author;
	private List<Comment> comments;
	
	public Post(int id, String content, User author) {
        if (author == null) {
            throw new IllegalArgumentException("Post must have an author");
        }
        this.id = id;
        this.content = content;
        this.author = author;
        this.comments = new ArrayList<>();

       
        author.addPost(this);
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }
    
    

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getAuthor() {
        return author;
    }

    public List<Comment> getComments() {
        return comments;
    }

    @Override
    public String toString() {
        return "Post{id=" + id + ", content='" + content + "'}";
    }

}
