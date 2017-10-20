package com.dubbox.common.enums;

/**
 * api返回code/text枚举
 * Created by Lee on 2017/10/12.
 */
public enum ResultEnum {
	PARAM_ERROR(-4, "参数错误"),
	SUCCESS(0, "OK"),
	OTHER_ERROR(3, "其他错误"),
	EXCEPTION(4, "系统异常");


	private int code;
	private String text;

	ResultEnum(int code, String text) {
		this.code = code;
		this.text = text;
	}

	public int getCode() {
		return code;
	}

	public String getText() {
		return text;
	}

	public static ResultEnum codeOf(int code) {
		for(ResultEnum result : values()) {
			if(result.getCode() == code) {
				return result;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "{\"code\":"+ code + ",\"text\":\"" + text +"\"}";
	}
}
