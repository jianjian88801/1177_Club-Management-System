package com.entity.view;

import com.entity.DiscussshetuanhuodongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 社团活动评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-18 20:05:36
 */
@TableName("discussshetuanhuodong")
public class DiscussshetuanhuodongView  extends DiscussshetuanhuodongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussshetuanhuodongView(){
	}
 
 	public DiscussshetuanhuodongView(DiscussshetuanhuodongEntity discussshetuanhuodongEntity){
 	try {
			BeanUtils.copyProperties(this, discussshetuanhuodongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
