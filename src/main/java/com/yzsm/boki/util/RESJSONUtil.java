package com.yzsm.boki.util;

import com.alibaba.fastjson.JSONObject;

public class RESJSONUtil {

	public static String getobj(int code,String content,String msg) {
		JSONObject obj = new JSONObject();
		obj.put("code", code);
		obj.put("content", content);
		obj.put("msg", msg);
		return obj.toJSONString();
	}
	
}
