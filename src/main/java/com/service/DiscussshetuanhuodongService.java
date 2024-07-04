package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshetuanhuodongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshetuanhuodongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshetuanhuodongView;


/**
 * 社团活动评论表
 *
 * @author 
 * @email 
 * @date 2021-05-18 20:05:36
 */
public interface DiscussshetuanhuodongService extends IService<DiscussshetuanhuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshetuanhuodongVO> selectListVO(Wrapper<DiscussshetuanhuodongEntity> wrapper);
   	
   	DiscussshetuanhuodongVO selectVO(@Param("ew") Wrapper<DiscussshetuanhuodongEntity> wrapper);
   	
   	List<DiscussshetuanhuodongView> selectListView(Wrapper<DiscussshetuanhuodongEntity> wrapper);
   	
   	DiscussshetuanhuodongView selectView(@Param("ew") Wrapper<DiscussshetuanhuodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshetuanhuodongEntity> wrapper);
   	
}

