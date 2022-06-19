package com.bgp.report.service;

import java.util.List;

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
	
	public int deleteBatch(String ids) {
		StringBuilder sb = new StringBuilder(ids);
		sb.deleteCharAt(0).deleteCharAt(sb.length()-1);
		return reportMapper.deleteBatch(sb.toString());
	}
	
	public DailyReport selectOne(int id) {
		return reportMapper.selectOne(id);
	}
	
	public List<DailyReport> getReportList(int page,int limit){
		return reportMapper.getReportList();
	}
	
	public DataTable getReportListByPage(int page,int limit){
		DataTable table = new DataTable();
		table.setCount(reportMapper.count(null));
		Object[] data = reportMapper.getReportListByPage(page, limit).toArray();
		table.setData(data);
		return table;
	}
	

}
