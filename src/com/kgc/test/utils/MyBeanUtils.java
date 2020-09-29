package com.kgc.test.utils;

import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

public class MyBeanUtils {
	public static <T> T copyMapToBean(Map map,T target) {
		
		try {
			BeanUtils.populate(target, map);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return target;
		
		
		
	}
}
