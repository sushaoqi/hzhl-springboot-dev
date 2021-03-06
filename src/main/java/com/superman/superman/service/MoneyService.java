package com.superman.superman.service;

import com.alibaba.fastjson.JSONObject;
import com.superman.superman.model.Userinfo;

import java.util.Map;

/**
 * Created by liujupeng on 2018/12/13.
 */
public interface MoneyService {
    /**
     * 获取已结算待结算
     *
     * @param status 0未结算  1已结算
     * @return
     */
    Long queryCashMoney(Integer status, Userinfo user);
    /**
     * 获取预估收入
     *
     * @param user
     * @return
     */
    Long queryCashMoney(Userinfo user);



}
