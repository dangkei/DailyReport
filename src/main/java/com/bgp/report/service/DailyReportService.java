package com.bgp.report.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bgp.report.entity.DailyReport;
import com.bgp.report.mapper.DailyReportMapper;

@Service
public class DailyReportService {
	@Autowired
	DailyReportMapper reportMapper;
	
	public Object insert(DailyReport report) {
		return reportMapper.insert(report);
	}
}
