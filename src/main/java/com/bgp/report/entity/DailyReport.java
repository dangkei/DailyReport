/**
 * 
 */
package com.bgp.report.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

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
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private String reportDate;
	
	@Column("sqkm")
	//@NumberFormat()
	private String sqkm;
	
	@Column("sqkm_week")
	private String sqkmWeek;
	
	@Column("dt_time")
	private String dtTime;
	
	@Column("pay_sb")
	private String paySB;
	
	@Column("nopay_sb")
	private String noPaySB;
	
	@Column("capture_time")
	private String captureTime;
	
	@Column("daily_in")
	private String dailyIn;
	
	@Column("weekly_in")
	private String weeklyIn;
	
	@Column("remark")
	private String remark;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the reportDate
	 */
	public String getReportDate() {
		return reportDate;
	}

	/**
	 * @param reportDate the reportDate to set
	 */
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

	/**
	 * @return the sqkm
	 */
	public String getSqkm() {
		return sqkm;
	}

	/**
	 * @param sqkm the sqkm to set
	 */
	public void setSqkm(String sqkm) {
		this.sqkm = sqkm;
	}

	/**
	 * @return the sqkmWeek
	 */
	public String getSqkmWeek() {
		return sqkmWeek;
	}

	/**
	 * @param sqkmWeek the sqkmWeek to set
	 */
	public void setSqkmWeek(String sqkmWeek) {
		this.sqkmWeek = sqkmWeek;
	}

	/**
	 * @return the dtTime
	 */
	public String getDtTime() {
		return dtTime;
	}

	/**
	 * @param dtTime the dtTime to set
	 */
	public void setDtTime(String dtTime) {
		this.dtTime = dtTime;
	}

	/**
	 * @return the paySB
	 */
	public String getPaySB() {
		return paySB;
	}

	/**
	 * @param paySB the paySB to set
	 */
	public void setPaySB(String paySB) {
		this.paySB = paySB;
	}

	/**
	 * @return the noPaySB
	 */
	public String getNoPaySB() {
		return noPaySB;
	}

	/**
	 * @param noPaySB the noPaySB to set
	 */
	public void setNoPaySB(String noPaySB) {
		this.noPaySB = noPaySB;
	}

	/**
	 * @return the captureTime
	 */
	public String getCaptureTime() {
		return captureTime;
	}

	/**
	 * @param captureTime the captureTime to set
	 */
	public void setCaptureTime(String captureTime) {
		this.captureTime = captureTime;
	}

	/**
	 * @return the dailyIn
	 */
	public String getDailyIn() {
		return dailyIn;
	}

	/**
	 * @param dailyIn the dailyIn to set
	 */
	public void setDailyIn(String dailyIn) {
		this.dailyIn = dailyIn;
	}

	/**
	 * @return the weeklyIn
	 */
	public String getWeeklyIn() {
		return weeklyIn;
	}

	/**
	 * @param weeklyIn the weeklyIn to set
	 */
	public void setWeeklyIn(String weeklyIn) {
		this.weeklyIn = weeklyIn;
	}

	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
