package com.bgp.report.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bgp.report.entity.DailyReport;
import com.bgp.report.entity.DataTable;
import com.bgp.report.mapper.DailyReportMapper;

@Service
public class DailyReportService {
	@Autowired
	DailyReportMapper reportMapper;
	
	public int insert(DailyReport report) {
		return reportMapper.insert(report);
	}
	
	public DataTable getReportListByPage(int page,int limit){
		DataTable table = new DataTable();
		table.setCount(reportMapper.count(null));
		table.setData(reportMapper.getReportListByPage(page, limit).toArray());
		return table;
	}
}
