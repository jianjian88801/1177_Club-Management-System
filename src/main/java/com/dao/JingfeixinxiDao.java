package com.dao;

import com.entity.JingfeixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JingfeixinxiVO;
import com.entity.view.JingfeixinxiView;


/**
 * 经费信息
 * 
 * @author 
 * @email 
 * @date 2021-05-18 20:05:36
 */
public interface JingfeixinxiDao extends BaseMapper<JingfeixinxiEntity> {
	
	List<JingfeixinxiVO> selectListVO(@Param("ew") Wrapper<JingfeixinxiEntity> wrapper);
	
	JingfeixinxiVO selectVO(@Param("ew") Wrapper<JingfeixinxiEntity> wrapper);
	
	List<JingfeixinxiView> selectListView(@Param("ew") Wrapper<JingfeixinxiEntity> wrapper);

	List<JingfeixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JingfeixinxiEntity> wrapper);
	
	JingfeixinxiView selectView(@Param("ew") Wrapper<JingfeixinxiEntity> wrapper);
	
}
