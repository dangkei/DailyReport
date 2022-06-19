package com.bgp.report.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.bgp.report.entity.DailyReport;
import com.bgp.report.entity.DataTable;
import com.bgp.report.service.DailyReportService;

@RestController
public class ReportController {

	@Autowired
	DailyReportService reportService;
	
	@RequestMapping("/report/create")
	public String createReport(String info) {
		DailyReport report = new DailyReport();
		report = JSONObject.parseObject(info,report.getClass());
		reportService.insert(report);
		return "ok";
	}
	@RequestMapping("/report/deleteBatch")
	public String deleteReportBatch(String ids) {
		//String[] arrIds = ids.split(",");
		
		reportService.deleteBatch(ids);
		return "ok";
	}
	
	@RequestMapping("/report/selectOne")
	public DailyReport selectOne(int id) {
		//String[] arrIds = ids.split(",");
		DailyReport data = reportService.selectOne(id);
		return data;
	}
	
	@RequestMapping("/report/getReportListByPage")
	public DataTable getReportListByPage(@RequestParam int page,@RequestParam int limit){
		return reportService.getReportListByPage(page, limit);
	}
}
