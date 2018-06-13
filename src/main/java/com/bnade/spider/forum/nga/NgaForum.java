package com.bnade.spider.forum.nga;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.bnade.spider.forum.Board;
import com.bnade.spider.forum.Forum;
import com.bnade.spider.forum.Page;
import com.bnade.spider.forum.Topic;

public class NgaForum implements Forum {

	private static final String HOST = "http://bbs.nga.cn";

	private Board defaultBoard = NgaBoard.get(NgaBoard.DISCOUNT_INFORMATION);
	
	private Board board = defaultBoard;
	
	private int pageNumber = 1;

	/**
	 * 生成页面访问的url
	 * 
	 * @return
	 */
	protected String generateUrl() {
		String url =  HOST + board.getPath();
		if (pageNumber > 1) {
			url += "&page=" + pageNumber;
		}
		return url;
	}

	/**
	 * 生成NGA论坛需要的cookie
	 * 
	 * @return cookie
	 */
	protected String generateCookie() {
		// NGA会校验cookie,通过参数校验时间，这里设置当前时间-5s来满足论坛校验
		long currentTime = new Date().getTime() / 1000 - 65;
		String cookie = "ngaPassportUid=guest05b1e921ae1580; UM_distinctid=163ef6ad07164e-0db83e7057d71b-47e1e39-306000-163ef6ad0726de; CNZZDATA30043604=cnzz_eid%3D673032606-1528724921-http%253A%252F%252Fbbs.nga.cn%252F%26ntime%3D1528724921; CNZZDATA30039253=cnzz_eid%3D1359631632-1528724895-http%253A%252F%252Fbbs.nga.cn%252F%26ntime%3D1528724895; lastpath=/thread.php?fid=570&lite=xml; bbsmisccookies=%7B%7D; Hm_lvt_5adc78329e14807f050ce131992ae69b=1528730147; Hm_lpvt_5adc78329e14807f050ce131992ae69b=1528730147; lastvisit="
//				+ currentTime 
//				+ "; lastvisit="
//				+ currentTime 
//				+ "; Hm_lvt_5adc78329e14807f050ce131992ae69b="
//				+ currentTime 
				+ "; guestJs=" + currentTime
				;
		return cookie;
	}
	
	protected Page convertUrlToPage() {
		Page page = new NgaPage(board, pageNumber);
		try {
			Document doc = Jsoup
					.connect(generateUrl())
					.header("Cookie", generateCookie())
					.header("Upgrade-Insecure-Requests", "1")
					.get();
			Elements rows = doc.getElementsByClass("topicrow");
			List<Topic> topics = new ArrayList<>();
			page.setTopics(topics);
			for (Element row : rows) {
				String link = HOST + row.select(".c1 a").attr("href");
				int id = Integer.valueOf(link.substring(link.indexOf("tid=") + 4));
				String replies = row.select(".c1 a").text();
				String title = row.select(".c2 a").text();
				String author = row.select(".c3 a").text();
				String postDate = row.select(".c3 span").text();
				Topic topic = new NgaTopic(id, link, title, Integer.valueOf(replies), author,
						Long.valueOf(postDate) * 1000);
				topics.add(topic);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return page;
	}

	@Override
	public Board getBoard() {
		return board;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public Page getPage(int pageNumber) {
		this.pageNumber = pageNumber;
		return convertUrlToPage();
	}

	@Override
	public Page getPage(int boardId, int pageNumber) {
		this.board = NgaBoard.get(boardId);
		this.pageNumber = pageNumber;
		return convertUrlToPage();
	}

	@Override
	public void setBoard(Board board) {
		this.board = board;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

}
