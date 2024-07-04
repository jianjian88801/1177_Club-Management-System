package com.entity.view;

import com.entity.ShetuanhuodongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 社团活动
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-18 20:05:36
 */
@TableName("shetuanhuodong")
public class ShetuanhuodongView  extends ShetuanhuodongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShetuanhuodongView(){
	}
 
 	public ShetuanhuodongView(ShetuanhuodongEntity shetuanhuodongEntity){
 	try {
			BeanUtils.copyProperties(this, shetuanhuodongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
