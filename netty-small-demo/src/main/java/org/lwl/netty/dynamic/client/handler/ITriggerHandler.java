package org.lwl.netty.dynamic.client.handler;

import io.netty.channel.ChannelHandlerContext;

/**
 * @author thinking_fioa
 * @createTime 2018/8/12
 * @description
 */


public interface ITriggerHandler {
    void launch(ChannelHandlerContext ctx);
}
