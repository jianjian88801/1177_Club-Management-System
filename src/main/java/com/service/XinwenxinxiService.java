package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XinwenxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XinwenxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XinwenxinxiView;


/**
 * 新闻信息
 *
 * @author 
 * @email 
 * @date 2021-05-18 20:05:36
 */
public interface XinwenxinxiService extends IService<XinwenxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinwenxinxiVO> selectListVO(Wrapper<XinwenxinxiEntity> wrapper);
   	
   	XinwenxinxiVO selectVO(@Param("ew") Wrapper<XinwenxinxiEntity> wrapper);
   	
   	List<XinwenxinxiView> selectListView(Wrapper<XinwenxinxiEntity> wrapper);
   	
   	XinwenxinxiView selectView(@Param("ew") Wrapper<XinwenxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinwenxinxiEntity> wrapper);
   	
}

