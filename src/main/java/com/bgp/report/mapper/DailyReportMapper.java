package com.bgp.report.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bgp.report.entity.DailyReport;

@Repository
public interface DailyReportMapper {

	 int insert(DailyReport report);
	 
	 int deleteBatch(String ids);
	 
	 
	 DailyReport selectOne(int id);
	
	 int count(DailyReport report);
	 
	 List<DailyReport>  getReportList();
	
	 List<DailyReport>  getReportListByPage(int page, int limit);
	 
	 
}
