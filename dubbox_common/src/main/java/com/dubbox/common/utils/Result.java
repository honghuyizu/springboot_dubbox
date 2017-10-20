package com.dubbox.common.utils;


import com.dubbox.common.enums.ResultEnum;

/**
 * api返回接口结果
 *Created by Lee on 2017/10/12.
 */
public class Result<T> {
	private int code;
	private String text;
	private T data;

	public Result() {
		code = ResultEnum.SUCCESS.getCode();
		text = ResultEnum.SUCCESS.getText();
	}

	public Result(ResultEnum resultEnum) {
		code = resultEnum.getCode();
		text = resultEnum.getText();
	}

	public Result(T data) {
		code = ResultEnum.SUCCESS.getCode();
		text = ResultEnum.SUCCESS.getText();
		this.data = data;
	}

	public Result(ResultEnum result, T data) {
		code = result.getCode();
		text = result.getText();
		this.data = data;
	}

	public Result(int code, String text) {
		this.code = code;
		this.text = text;
	}

	public Result(int code, String text, T data) {
		this.code = code;
		this.text = text;
		this.data = data;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
