package com.melot.talkee.agent.domain;

/**
 * Title: TalkCommonEnum
 * Description: 公共枚举
 * @author  董毅<a href="mailto:yi.dong@melot.cn">
 * @version V1.0
 * @since 2017-04-05 15:25:53 
 */
public class TalkAgentCommonEnum {

	/**
	 * 发布类型 普通课
	 */
	public static final int PUBLISH_TYPE_GENNEL = 1;
	
	/**
	 * 发布类型 公开课
	 */
	public static final int PUBLISH_TYPE_PUBLIC = 2;
	
	/**
	 * 发布类型 调试课
	 */
	public static final int PUBLISH_TYPE_TRY = 3;
	
	
	/**
	 * 发布类型 普通课
	 */
	public static final int PERIOD_TYPE_GENNEL = 1;
	
	/**
	 * 发布类型 试听课
	 */
	public static final int PERIOD_TYPE_DEMO = 3;
	
	/**
	 * 发布类型 公开课
	 */
	public static final int PERIOD_TYPE_PUBLIC = 2;
	

	/**
	 * 发布类型 辅课
	 */
	public static final int PERIOD_TYPE_SUB = 4;

	/**
	 * 发布类型 测评课时
	 */
	public static final int PERIOD_TYPE_TEST = 5;
	
	/**
	 * 学生用户账号类型
	 */
	public static final int USER_ACCOUNT_TYPE_STUDENT = 1;
	
	/**
	 * 老师用账号类型
	 */
	public static final int USER_ACCOUNT_TYPE_TEACHER = 2;
	
	/**
	 * 管理员用户账号类型
	 */
	public static final int USER_ACCOUNT_TYPE_ADMIN = 3;
	
	/**
	 * 发布课程状态 可预约
	 */
	public static final int PUBLISH_LESSON_STATE_FREE = 1;
	
	/**
	 * 发布课程状态 已预约
	 */
	public static final int PUBLISH_LESSON_STATE_ORDER = 2;

	/**
	 * 订单状态 待付款
	 */
	public static final int TRADE_ORDER_STATUS_WAITPAY=0;

	/**
	 * 订单状态 付款中
	 */
	public static final int TRADE_ORDER_STATUS_PAYING=1;

	/**
	 * 订单状态 已付款
	 */
	public static final int TRADE_ORDER_STATUS_PAYED=2;

	/**
	 * 订单状态 已关闭
	 */
	public static final int TRADE_ORDER_STATUS_CLOSE=3;
	/**
	 * 支付方式 现金
	 */
	public static final int TRADE_ORDER_PAY_MODE_CASH=0;
	/**
	 * 支付方式 支付宝
	 */
	public static final int TRADE_ORDER_PAY_MODE_ALIPAY=1;
	/**
	 * 支付方式 微信
	 */
	public static final int TRADE_ORDER_PAY_MODE_WXPAY=2;

	/**
	 * 订单类型 线上支付
	 */
    public static final Integer TRADE_ORDER_TYPE_ONLINE =1 ;
/**
	 * 订单类型 线下支付
	 */
    public static final Integer TRADE_ORDER_TYPE_OFFLINE =2 ;

	/**
	 * 付款方式 一次性
	 */
	public static final Integer TRADE_ORDER_PAY_TYPE_ONCE =1 ;

	/**
	 * 付款方式 一次性
	 */
	public static final Integer TRADE_ORDER_PAY_TYPE_EARNEST  =2 ;


	public static String getPeriodName(int periodType){
	    String periodName = null;
	    switch (periodType) {
        case 1:
            periodName = "常规课";
            break;
        case 4:
            periodName = "测评课";
            break;
        default:
            break;
        }
	    return periodName;
	}

}
