package com.gs.alipay;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradePayModel;
import com.alipay.api.request.AlipayTradePayRequest;
import com.alipay.api.response.AlipayTradePayResponse;
import com.alipay.api.response.AlipayTradePrecreateResponse;

public class AlipayTest {

    public static void main(String... args) {
        AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipaydev.com/gateway.do",
                "2016091500515685",
                "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCSd9mnETqn3f2QszJgtqHwgGKvqIVKK7NH/vTtku9tQsGh2wquKy8mOWaXrdoI8RAxZRZpDQvSeSjH+vK8eTp1q/nPE70FD8DcZf4v7N+QBRKBTXxKN6bDRgTn+K2lDOkZ9LQrUwm3o7jV7VMeYJpt5nv+mU3r2TpFKtx9/ifQMUpD1joSoV6XlivpM7/97Zoz8OopNgIyIWOOPzoXh1AmnWNzVD2XlmDwPOndLGneOsj3ocOHVCw0T1CrcWTSP134C8bwyXY/XjKV26CDhVz7CwYYHIPgKWR94uu0uvJ08kBQM94qkQk+XmsPU4tL9X5oZQBRsdQtUOszyYR2BJIhAgMBAAECggEAP5EqcjqlBVPwB4vuMlExKSrfKbNu3cjnjziU3kLmDLprRS7GjN6LIQDKiMvYFAdjaryfpEoYNmmFDH3aOXg3qfhQe9HqODclEcJmNjCMunmpFVsmtSNACgHqgS7JVherVyt/wknQrtWsk5PjfgyZGVdtuwqX6eMmSfyXI0tZxh3kiyknyot/QSZrbgIW6zIHrZWekPwLpIZKG5XEWRTNu7+eW7WUipSMy2xqvC/D5S5BNKCEjEnDkTzmSv+kV5nxCLUu2EwkxxRPS2d9M5eQngEUC+8P9zkpIvEt03QZ2xEB94LBXbMK8tkmNDygObW2Spu0bk4dipF0ZvA1aUasnQKBgQDe0dsmD8zYCug9gcFMKb+MygJJ8OpPpfZvyWtD7r/012AgUjDPYeiZ+V6PnXKzYJ3ewsERlo6JggFDHU2ishxxql7+7gcyCchApO25Sz+mJzlemSb1zacJwrNnv60zsr6X/J7iL6MsiRMMIMFixAFoeT+TLZy4JRayEYI6nJ9ImwKBgQCoR2Jixtk5wsQfBU0qCl9CUB27nvC9//7KUFqsCGu06cGIL99pa4TLdK8d4J9CgJTtkJX7D92kHAwMPfkjWKXR6s/cL3tzPmMrjj3CQROtwkMGCWBRvVrP6o1bNymnHOaPLv0VrnCIsJ0BJxYZ0kC3LvftvUiHznQa+pS5qqDl8wKBgDHkxfDA6vqZfqV/L5xxYL4S4e5SrvUE0aj4bjd496zIqXKzVNCrON15lG4OMIfwI4mlDHx2vRYXcVbo8eBzh6EAKGNnQ182B4xKIh0yt17qO5NuMeYqlbO+0FNz/UGtTbZUz/MP/bbUPtqhXwxRnYsaU10OgqBNVcar2wBq39PvAoGAA+HhuzWrPVHpBG4y4Y1rtTPz+6gnFbsaPcCs1ts64OmjtWilVuFMJwWCJMZR5k7hILn9O9WZ33dmL8IeRVp+OOGZ+hJ+XqJJ129orVqjAZdBxJnixv//YFyg9kHHjDt2dkc3P5DOt9ibRrOIJwBazd8fiTScv8VbmGO/mqj9HVECgYAphfVoHUN9FwQiiSGAbUl7ZZkA+bbSGQdAq5Fr/iFf/8AJ/5j5z+AfxxM+qM89PoHzQ3onTMEN5E5JL+o2mljtV9trKk9H2bc+nLN3M9huzyKkF3sDbvsmfOAqk4V4r2IUXTZQJUybmyBWo9nD3cnOzHkhD3TKDO1mE+/clFeGbw==",
                "json",
                "utf-8",
                "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxOdtih67MwttBvlA9OoFKWqw7x0YJ82g/dfjx2//ssfuxaj2b/P8L/TpYVf6rv2cvLFVwz+ClUHICZbDeQ4fcLvadUa6H6NFvqrkJlleVkGIvw22pDvGcFY++YddbBB6Xbk+8gvwTPFlMBPJxU7QV/p2ZqPZ46ehesvdT0I0qqnucqIyJr7c4SZhF006IyntTirM5OcW6BDyraDSnwGBPeonBK4Xibj+igKZMeSjkRDjmXfBslGNaAPIxO6QL75TyQVzSKyPs6J/Sp3ZG+dm3f+o1P7GzgYGDNPBJBqPY4cdUEDX4UMALkKld+Ue4dJKggBaE+ZVRtICtGColEqgnQIDAQAB",
                "RSA2");
        AlipayTradePayRequest request = new AlipayTradePayRequest();
        AlipayTradePayModel model = new AlipayTradePayModel();
        request.setBizModel(model); // business
        model.setOutTradeNo(System.currentTimeMillis()+"");
        model.setSubject("Iphone6 16G");
        model.setTotalAmount("100000.00");
        model.setAuthCode("288649996922864940");//沙箱钱包中的付款码
        model.setScene("bar_code"); // 设置条码场景
        try {
            AlipayTradePayResponse response = alipayClient.execute(request);; // execute 执行支付请求，把基础参数和支付参数发送到支持宝后台，返回支付响应结果
            System.out.print(response.getBody());
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }

    }

}
