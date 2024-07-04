package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxinwenxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxinwenxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxinwenxinxiView;


/**
 * 新闻信息评论表
 *
 * @author 
 * @email 
 * @date 2021-05-18 20:05:36
 */
public interface DiscussxinwenxinxiService extends IService<DiscussxinwenxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxinwenxinxiVO> selectListVO(Wrapper<DiscussxinwenxinxiEntity> wrapper);
   	
   	DiscussxinwenxinxiVO selectVO(@Param("ew") Wrapper<DiscussxinwenxinxiEntity> wrapper);
   	
   	List<DiscussxinwenxinxiView> selectListView(Wrapper<DiscussxinwenxinxiEntity> wrapper);
   	
   	DiscussxinwenxinxiView selectView(@Param("ew") Wrapper<DiscussxinwenxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxinwenxinxiEntity> wrapper);
   	
}

