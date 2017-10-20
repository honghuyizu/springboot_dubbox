package com.dubbox.provider.dao;


import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 数据持久化
 * Created by Lee on 2017/10/12.
 */
@Mapper
public interface BaseDao<T>{
    /**
     * 新增操作
     *
     * @param t
     * @return
     */
    public int insert(T t);


    /**
     * 更新所有字段
     *
     * @param t
     * @return
     */
    public int update(T t);



    /**
     * 根据ID删除记录
     *
     * @param id
     * @return
     */
    public int delete(Integer id);

    /**
     * 根据ID查询记录
     *
     * @param id
     * @return
     */
    public T get(Integer id);

    /**
     * 查询所有的记录，自动分页
     *
     * @return
     */
    public List<T> findList(T t);


    /**
     * 查询所有的记录,不带分页
     *
     * @return
     */
    public List<T> findAllList(T t);


}
