package com.ust.socialmedia;

public class Comment {
	private int id;
    private String content;
    private User author;
    private Post post;

    public Comment(int id, String content, User author, Post post) {
        if (author == null || post == null) {
            throw new IllegalArgumentException("Comment must have author and post");
        }
        this.id = id;
        this.content = content;
        this.author = author;
        this.post = post;

        
        post.addComment(this);
    }

    public User getAuthor() {
        return author;
    }

    public Post getPost() {
        return post;
    }

    @Override
    public String toString() {
        return "Comment{id=" + id + ", content='" + content + "'}";
    }
}
