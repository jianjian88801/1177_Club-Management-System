package com.entity.view;

import com.entity.XinwenxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 新闻信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-18 20:05:36
 */
@TableName("xinwenxinxi")
public class XinwenxinxiView  extends XinwenxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XinwenxinxiView(){
	}
 
 	public XinwenxinxiView(XinwenxinxiEntity xinwenxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, xinwenxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
