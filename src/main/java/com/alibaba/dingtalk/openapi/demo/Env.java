package com.alibaba.dingtalk.openapi.demo;


/**
 * 企业应用接入时的常量定义
 */
public class Env {

    /**
     * 企业应用接入秘钥相关
     */
    public static final String CORP_ID = "ding543ed8b29c60ad0235c2f4657eb6378f";
    public static final String CORP_SECRET = "n-w0F8tmhkJyZJaTMqQhmJqyTE430watBFW9po16AB4rUMdpZHfhdhoQNq_Yf5Ut";
    public static final String SSO_Secret = "v7tasCYCGFEbhntPgT48OCUCCqBSz-qjvFZvlo3hoX6xpw0qF4MB8epPU8bMVmpE";

    /**
     * DING API地址
     */
	public static final String OAPI_HOST = "https://oapi.dingtalk.com";
    /**
     * 企业应用后台地址，用户管理后台免登使用
     */
	public static final String OA_BACKGROUND_URL = "http://192.168.3.186:8080/admin.jsp";


    /**
     * 企业通讯回调加密Token，注册事件回调接口时需要传递给钉钉服务器
     */
	public static final String TOKEN = "";
	public static final String ENCODING_AES_KEY = "";
	
}
