package com.xihua.weixiao.dao;

import com.xihua.weixiao.entity.Suggestion;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.xihua.weixiao.query.SuggestionQuery;
import com.xihua.weixiao.vo.request.IdQueryRequest;
import com.xihua.weixiao.vo.request.IdRequest;
import com.xihua.weixiao.vo.response.DonationDetailResponse;
import com.xihua.weixiao.vo.response.SuggestionDetailResponse;
import com.xihua.weixiao.vo.response.SuggestionResponse;
import com.xihua.weixiao.vo.response.SuggestionTimeLine;

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
    public List<SuggestionResponse> getSuggestionByMyId(IdRequest query);

    public List<SuggestionTimeLine> getSuggestionTimeLineByMyId(IdRequest query);

    public SuggestionDetailResponse getSuggestionDetail(IdRequest idRequest);
}
