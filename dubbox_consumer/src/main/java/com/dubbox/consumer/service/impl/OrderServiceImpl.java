package com.dubbox.consumer.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbox.common.response.ResponseMessageUtil;
import com.dubbox.consumer.service.OrderService;
import com.dubbox.rsfservice.service.MemberService;
import com.dubbox.rsfservice.service.model.MemberDto;


import javax.annotation.Resource;
import javax.ws.rs.core.Response;

/**
 * Created by Administrator on 2017/10/12.
 */
@Service
public class OrderServiceImpl implements OrderService {
   @Resource
   MemberService memberService;

    @Override
    public Response getOrderList(String mobile) {
        MemberDto memberDto = memberService.getMember(mobile);
        return  new ResponseMessageUtil().success(memberDto);
    }
}
