package com.bnade.spider.forum;

/**
 * 论坛帖子信息
 * 
 * @author liufeng0103
 *
 */
public interface Topic {

	/**
	 * 获取帖子id
	 * 
	 * @return 帖子id
	 */
	int getId();

	/**
	 * 获取帖子标题
	 * 
	 * @return 帖子标题
	 */
	String getTitle();

	/**
	 * 获取帖子发布者用户名
	 * @return 帖子发布者用户名
	 */
	String getAuthor();

	/**
	 * 获取帖子链接
	 * 
	 * @return 帖子链接
	 */
	String getLink();

	/**
	 * 设置帖子id
	 * 
	 * @param id 帖子id
	 */
	void setId(int id);

	/**
	 * 设置帖子标题
	 * 
	 * @param title 帖子标题
	 */
	void setTitle(String title);

	/**
	 * 设置帖子发布者用户名
	 * @param author 帖子发布者用户名
	 */
	void setAuthor(String author);
	
	/**
	 * 设置帖子链接
	 * @param link 帖子链接
	 */
	void setLink(String link);
	
}