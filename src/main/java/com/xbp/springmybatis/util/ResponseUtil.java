package com.xbp.springmybatis.util;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @des:
 * @author: 薛宝鹏
 * @date: 2018/5/23 15:42
 */
public class ResponseUtil {

    public static void write(HttpServletResponse response,Object o) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        response.addHeader("Access-Control-Allow-Origin", "*");
        PrintWriter out = response.getWriter();
        out.println(o.toString());
        out.flush();
        out.close();
    }
}
