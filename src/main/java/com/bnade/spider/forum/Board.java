package com.bnade.spider.forum;

/**
 * 版块
 * 
 * @author liufeng0103
 *
 */
public interface Board {

	/**
	 * 获取版块id
	 * 
	 * @return 版块id
	 */
	public int getId();
	
	/**
	 * 获取版块id
	 * 
	 * @param id 版块id
	 */
	public void setId(int id);
	
	/**
	 * 获取版块名称
	 * 
	 * @return 版块名称
	 */
	public String getName();
	
	/**
	 * 设置版块名称
	 * 
	 * @param name 版块名称
	 */
	public void setName(String name);
	
	/**
	 * 获取版块url路径
	 * @return 版块url路径
	 */
	public String getPath();
	
	/**
	 * 设置版块url路径
	 * @param path 版块url路径
	 */
	public void setPath(String path);
	
}
