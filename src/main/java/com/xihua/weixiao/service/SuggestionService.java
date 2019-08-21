package com.xihua.weixiao.service;

import com.xihua.weixiao.entity.Suggestion;
import com.baomidou.mybatisplus.service.IService;
import com.xihua.weixiao.query.SuggestionQuery;
import com.xihua.weixiao.vo.request.IdQueryRequest;
import com.xihua.weixiao.vo.request.IdRequest;
import com.xihua.weixiao.vo.response.DonationDetailResponse;
import com.xihua.weixiao.vo.response.SuggestionDetailResponse;
import com.xihua.weixiao.vo.response.SuggestionResponse;
import com.xihua.weixiao.vo.response.SuggestionTimeLine;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author YGH123
 * @since 2019-07-24
 */
public interface SuggestionService extends IService<Suggestion> {
   public List<SuggestionResponse> getSuggestionByMyId(IdRequest query);
   public int addSuggestion(Suggestion suggestion, MultipartFile[] files);
   public List<SuggestionTimeLine> getSuggestionTimeLineByMyId(IdRequest query);

    public SuggestionDetailResponse getSuggestionDetail(IdRequest idRequest);
}
