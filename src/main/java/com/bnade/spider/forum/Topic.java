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
	Integer getId();

	/**
	 * 设置帖子id
	 * 
	 * @param id 帖子id
	 */
	void setId(Integer id);

	/**
	 * 获取帖子标题
	 * 
	 * @return 帖子标题
	 */
	String getTitle();

	/**
	 * 设置帖子标题
	 * 
	 * @param title 帖子标题
	 */
	void setTitle(String title);

	/**
	 * 获取帖子发布者用户名
	 * @return 帖子发布者用户名
	 */
	String getAuthor();

	/**
	 * 设置帖子发布者用户名
	 * @param author 帖子发布者用户名
	 */
	void setAuthor(String author);

}