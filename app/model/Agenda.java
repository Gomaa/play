package model;

import java.util.List;

public class Agenda extends Item{

	private List<Reply> replyList;

	public List<Reply> getReplyList() {
		return replyList;
	}

	public void setReplyList(List<Reply> replyList) {
		this.replyList = replyList;
	}
	
	
}
