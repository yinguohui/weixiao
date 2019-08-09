package com.xihua.weixiao.query;

import com.xihua.weixiao.entity.Constants;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 批量查询条件，有其他参数集成此类即可 @Author: zhangbing
 * @date: 2018/10/30 14:05
 */
public class ObjectQuery {
  /** 每页显示记录数 */
  private int pageSize = Constants.DEFAULT_PAGESIZE;

  /** 当前页页码 */
  private int currentPage = Constants.DEFAULT_PAGE;

  /** 当前页页码 */
  private Integer pageOffset ;

  public int getPageSize() {
    return pageSize;
  }

  public void setPageSize(int pageSize) {
    this.pageSize = pageSize;
  }

  public int getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(int currentPage) {
    this.currentPage = currentPage;
  }

  public int getPageOffset() {
    return (currentPage - 1) * pageSize;
  }
}
