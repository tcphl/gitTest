package com.shop.service;

import com.shop.service.base.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * Description:
 * Author: LZ
 * Date:2018/6/28 16:04
 */
@Service("testService")
public class TestServiceImpl extends BaseServiceImpl implements ITestService {

    @Override
    public void test() {
        String sql = "select * from tbl_user";
        System.out.println(this.findFirstBySql(sql));
    }
}
