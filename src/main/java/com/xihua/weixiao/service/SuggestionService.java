package com.xihua.weixiao.service;

import com.xihua.weixiao.entity.Suggestion;
import com.baomidou.mybatisplus.service.IService;
import com.xihua.weixiao.query.SuggestionQuery;
import com.xihua.weixiao.vo.request.IdQueryRequest;
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
   public List<Suggestion> getSuggestionByMyId(SuggestionQuery query);
   public int addSuggestion(Suggestion suggestion, MultipartFile[] files);

}
