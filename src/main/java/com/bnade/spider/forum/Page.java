package com.bnade.spider.forum;

import java.util.List;

/**
 * 论坛页面
 * 
 * @author liufeng0103
 *
 */
public interface Page {
	
	/**
	 * 获取页面的帖子列表
	 * 
	 * return 页面的帖子列表
	 */
	List<Topic> getTopics();

	/**
	 * 设置页面帖子列表
	 * 
	 * @param topics 页面帖子列表
	 */
	void setTopics(List<Topic> topics);
	
}
