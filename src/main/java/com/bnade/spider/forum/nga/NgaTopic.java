package com.bnade.spider.forum.nga;

import com.bnade.spider.forum.Topic;

public class NgaTopic implements Topic {

	private int id;
	private String title;
	private String author;
	
	private String link;
	private Integer replies;
	private Long postDate;

	public NgaTopic() {
	}

	public NgaTopic(Integer id, String link, String title, Integer replies, String author, Long postDate) {
		this.id = id;
		this.link = link;
		this.title = title;
		this.replies = replies;
		this.author = author;
		this.postDate = postDate;
	}

	@Override
	public String toString() {
		return "Topic{" + "id=" + id + ", link='" + link + '\'' + ", title='" + title + '\'' + ", replies=" + replies
				+ ", author='" + author + '\'' + ", postDate=" + postDate + '}';
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	/* (non-Javadoc)
	 * @see com.bnade.idea.nga.Topic#getTitle()
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/* (non-Javadoc)
	 * @see com.bnade.idea.nga.Topic#setTitle(java.lang.String)
	 */
	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getReplies() {
		return replies;
	}

	public void setReplies(Integer replies) {
		this.replies = replies;
	}

	/* (non-Javadoc)
	 * @see com.bnade.idea.nga.Topic#getAuthor()
	 */
	@Override
	public String getAuthor() {
		return author;
	}

	/* (non-Javadoc)
	 * @see com.bnade.idea.nga.Topic#setAuthor(java.lang.String)
	 */
	@Override
	public void setAuthor(String author) {
		this.author = author;
	}

	public Long getPostDate() {
		return postDate;
	}

	public void setPostDate(Long postDate) {
		this.postDate = postDate;
	}
}
