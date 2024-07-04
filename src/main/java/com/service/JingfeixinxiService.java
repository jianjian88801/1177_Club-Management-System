package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JingfeixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JingfeixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JingfeixinxiView;


/**
 * 经费信息
 *
 * @author 
 * @email 
 * @date 2021-05-18 20:05:36
 */
public interface JingfeixinxiService extends IService<JingfeixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JingfeixinxiVO> selectListVO(Wrapper<JingfeixinxiEntity> wrapper);
   	
   	JingfeixinxiVO selectVO(@Param("ew") Wrapper<JingfeixinxiEntity> wrapper);
   	
   	List<JingfeixinxiView> selectListView(Wrapper<JingfeixinxiEntity> wrapper);
   	
   	JingfeixinxiView selectView(@Param("ew") Wrapper<JingfeixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JingfeixinxiEntity> wrapper);
   	
}

