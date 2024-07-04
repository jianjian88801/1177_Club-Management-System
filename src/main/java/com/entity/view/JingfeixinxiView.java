package com.entity.view;

import com.entity.JingfeixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 经费信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-18 20:05:36
 */
@TableName("jingfeixinxi")
public class JingfeixinxiView  extends JingfeixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JingfeixinxiView(){
	}
 
 	public JingfeixinxiView(JingfeixinxiEntity jingfeixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, jingfeixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
