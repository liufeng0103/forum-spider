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
	 * 获取页面页码
	 * 
	 * @return 页面页码
	 */
	int getNumber();
	
	/**
	 * 获取总页数
	 * 
	 * @return 总页数
	 */
	int getTotalNumber();
	
	/**
	 * 获取页面版块
	 * 
	 * @return 页面版块
	 */
	Board getBoard();
	
	/**
	 * 获取页面的帖子列表
	 * 
	 * return 页面的帖子列表
	 */
	List<Topic> getTopics();
	
	/**
	 * 设置当前第几页
	 * 
	 * @param number 当前页面的页数
	 */
	void setNumber(int number);
	
	/**
	 * 设置总页数
	 * 
	 * @param totalNumber 总页数
	 */
	void setTotalNumber(int totalNumber);

	/**
	 * 设置页面帖子列表
	 * 
	 * @param topics 页面帖子列表
	 */
	void setTopics(List<Topic> topics);
	
}
