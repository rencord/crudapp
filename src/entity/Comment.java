package entity;

public class Comment {
	public String content;
	public User owner;
	public Post attachedPost;
	public int likes;
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public User getOwner() {
		return owner;
	}
	public void setOwner(User owner) {
		this.owner = owner;
	}
	public Post getAttachedPost() {
		return attachedPost;
	}
	public void setAttachedPost(Post attachedPost) {
		this.attachedPost = attachedPost;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	} 
	
	
	
}
