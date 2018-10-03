package model;

public class Response <T>{
	
	private String msg;
	
	private T type;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getType() {
		return type;
	}

	public void setType(T type) {
		this.type = type;
	}
	
	

}
