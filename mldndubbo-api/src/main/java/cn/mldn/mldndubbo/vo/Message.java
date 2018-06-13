package cn.mldn.mldndubbo.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Message implements Serializable {
	private String title ;
	private String content ;
	private String sender ;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	@Override
	public String toString() {
		return "Message [title=" + title + ", content=" + content + ", sender=" + sender + "]";
	}
}
