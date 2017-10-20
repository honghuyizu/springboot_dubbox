package com.dubbox.rsfservice.service;


import com.dubbox.rsfservice.service.model.MemberDto;

/**
 * Created by Lee on 2017/10/12.
 */
public interface MemberService {

    /**
     * 根据手机号获取会员信息
     * @param mobile
     * @return
     */
    public MemberDto getMember(String mobile);

}
