package com.dubbox.provider.dao;


import com.dubbox.provider.entity.Member;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by Lee on 2017/10/12.
 */
@Mapper
public interface MemberDao extends BaseDao<Member> {

    /**
     * 根据手机号获取会员信息
     * @param mobile
     * @return
     */
    public Member getMemberByMobile(String mobile);
}

