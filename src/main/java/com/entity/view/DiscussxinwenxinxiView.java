package com.entity.view;

import com.entity.DiscussxinwenxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 新闻信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-18 20:05:36
 */
@TableName("discussxinwenxinxi")
public class DiscussxinwenxinxiView  extends DiscussxinwenxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussxinwenxinxiView(){
	}
 
 	public DiscussxinwenxinxiView(DiscussxinwenxinxiEntity discussxinwenxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussxinwenxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
