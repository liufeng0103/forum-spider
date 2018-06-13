package com.bnade.spider.forum.nga;

import java.util.HashMap;
import java.util.Map;

import com.bnade.spider.forum.Board;

/**
 * NGA版块
 * 
 * @author liufeng0103
 *
 */
public class NgaBoard implements Board {
	
	public final static String PAGE = "/thread.php";

	public final static int DISCOUNT_INFORMATION = 570;
	
	private static Map<Integer, Board> boardMap;
	
	static {
		boardMap = new HashMap<>();
		boardMap.put(DISCOUNT_INFORMATION, new NgaBoard(DISCOUNT_INFORMATION, "优惠信息 购物指南", PAGE + "?fid=570"));
	}
	
	public static Board get(int id) {
		return boardMap.get(id);
	}
	
	private int id;

	private String name;
	
	private String path;

	public NgaBoard(int id, String name, String path) {
		super();
		this.id = id;
		this.name = name;
		this.path = path;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@Override
	public String toString() {
		return "NgaBoard [id=" + id + ", name=" + name + ", path=" + path + "]";
	}

}
