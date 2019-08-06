package com.xihua.weixiao.dao;

import com.xihua.weixiao.entity.Suggestion;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.xihua.weixiao.vo.request.IdQueryRequest;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author YGH123
 * @since 2019-07-24
 */
public interface SuggestionMapper extends BaseMapper<Suggestion> {
    public List<Suggestion> getSuggestionByMyId(IdQueryRequest request);
}
