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
	 * 获取当前页码，默认为第一页
	 * 
	 * @return 当前页码
	 */
	int getPageNumber();
	
	/**
	 * 获取论坛某版块某页的页面信息
	 * 
	 * @param boardId 版块id
	 * @param pageNum 页码 
	 * @return 论坛页面信息
	 */
	Page getPage(int boardId, int pageNum);

	/**
	 * 获取论坛某页的页面信息，版块如果之前指定过则为上一次访问的版块，否则使用默认版块
	 * 
	 * @param pageNum 页码
	 * @return 论坛页面信息
	 */
	Page getPage(int pageNum);

	/**
	 * 设置页码
	 * @param pageNumber 页码
	 */
	void setPageNumber(int pageNumber);
	
	/**
	 * 设置版块
	 * 
	 * @param board 版块
	 */
	void setBoard(Board board);
	
}
