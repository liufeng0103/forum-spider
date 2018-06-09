package com.bnade.spider.forum;

import java.util.List;

import com.bnade.spider.forum.nga.Topicx;

/**
 * 论坛页面
 * 
 * @author liufeng0103
 *
 */
public interface Page {
	
	/**
	 * 页面的所有帖子
	 */
	List<Topicx> getTopics();

}
