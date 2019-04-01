package com.shop.model;

/**
 * 把所有的表列在这边，方便维护
 * @Date  2016/7/25 17:13
 * @Author linyb
 */
public class TableList {
    // 交易流水表
    public static final String TRANSLS = " tbl_transls ";

    //退款流水表
    public static final String REFUNDLS = " tbl_refundls";

    //撤单流水表
    public static final String CANCELLS = " tbl_cancells";

    //终端表
    public static final String CLINET = " mc_client";

    //支付账户配置表
    public static final String PAYACCOUNT = " mc_pay_account";

    //设备与支付方式的关联表
    public static final String PAY_ACCOUNT_CLIENT = " mc_pay_account_client";

    //支付类型表
    public static final String PAY_ACCOUNT_TYPE = " mc_pay_account_type";
}