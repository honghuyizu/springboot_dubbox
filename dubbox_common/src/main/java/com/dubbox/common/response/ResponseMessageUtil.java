package com.dubbox.common.response;


import com.alibaba.fastjson.JSON;
import com.dubbox.common.utils.DateTimeHelper;

import javax.ws.rs.core.Response;

/**
 * 异步记录日志.
 * <p>使用MQ记录日志信息</p>
 */
public   class ResponseMessageUtil {

    private ResponseMessage responseMessage = new ResponseMessage();

    public void setResponseMessage(String code, String text, String response_time, Object data) {
        responseMessage.setCode(code);
        responseMessage.setText(text);
        responseMessage.setResponse_time(response_time);
        responseMessage.setData(data);
    }

    public void setResponseMessage(String code, String text, String data) {
        this.setResponseMessage(code, text, DateTimeHelper.getCurrentDateTime(), data);
    }


    public void setResponseMessage(String code, String text, Object data) {
        this.setResponseMessage(code, text, DateTimeHelper.getCurrentDateTime(), data);
    }

    public String getResponseMessage() {
        return JSON.toJSONString(responseMessage);
    }

    public void setResponseMessage(String code) {
        String text = "";
        String data = "";
        if (null != code && code.equals(IConstant.Status.PARA_ERROR.getCode())) {
            text = IConstant.Status.PARA_ERROR.getText();
        }
        if (null != code && code.equals(IConstant.Status.EXCEPTION.getCode())) {
            text = IConstant.Status.EXCEPTION.getText();
        }
        this.setResponseMessage(code, text, DateTimeHelper.getCurrentDateTime(), data);
    }

    public String successResult(Object object){
        this.setResponseMessage(IConstant.Status.SUCCESS.getCode(), IConstant.Status.SUCCESS.getText(), object);
        return this.getResponseMessage();
    }

    public final  Response success(Object object){
        Response.Status st = IConstant.Status.SUCCESS.getHttpStatus();
        return Response.status(st).entity(successResult(object)).build();
    }
}
