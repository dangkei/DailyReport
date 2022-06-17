package com.bgp.report.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bgp.report.entity.DailyReport;

@Repository
public interface DailyReportMapper {

	 List<DailyReport>  getReportList();
	
	 List<DailyReport>  getReportListByPage(int page, int limit);
}
