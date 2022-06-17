/**
 * 
 */
package com.bgp.report.entity;

import com.bgp.report.annotation.Column;
import com.bgp.report.annotation.Table;

/**
 * @author Administrator
 *
 */
@Table("tb_DailyReport")
public class DailyReport {
	
	@Column("id")
	private long id;
	
	@Column("report_date")
	private String reportDate;
	
	@Column("sqkm")
	private float sqkm;
	
	@Column("sqkm_week")
	private float sqkmWeek;
	
	@Column("dt_time")
	private float dtTime;
	
	@Column("pay_sb")
	private float paySB;
	
	@Column("nopay_sb")
	private float noPaySB;
	
	@Column("capture_time")
	private float captureTime;
	
	@Column("daily_in")
	private float dailyIn;
	
	@Column("weekly_in")
	private float weeklyIn;
	
	@Column("remark")
	private String remark;
}
