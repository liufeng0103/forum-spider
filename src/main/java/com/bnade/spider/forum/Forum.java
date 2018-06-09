package com.bnade.spider.forum;

/**
 * 论坛
 * 
 * @author liufeng0103
 *
 */
public interface Forum {
	
	/**
	 * 获取当前版块
	 * 
	 * @return 版块信息
	 */
	Board getBoard();
	
	/**
	 * 设置版块
	 * 
	 * @param board 版块
	 */
	void setBoard(Board board);

	/**
	 * 获取论坛某版块某页的页面信息
	 * 
	 * @param board 版块
	 * @param pageNum 页码 
	 * @return 论坛页面信息
	 */
	Page getPage(Board board, int pageNum);
	
	/**
	 * 获取论坛某页的页面信息，版块如果之前指定过则为上一次访问的版块，否则使用默认版块
	 * 
	 * @param pageNum 页码
	 * @return 论坛页面信息
	 */
	Page getPage(int pageNum);
	
}
