package com.dubbox.consumer.service;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/**
 * Created by Administrator on 2017/10/12.
 */
@Path("order")
@Produces({ContentType.APPLICATION_JSON_UTF_8})
public interface OrderService {

    @GET
    @Path("orderList/{mobile}")
    public Response getOrderList(@PathParam("mobile") String mobile);
}
