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
	public float getSqkm() {
		return sqkm;
	}

	/**
	 * @param sqkm the sqkm to set
	 */
	public void setSqkm(float sqkm) {
		this.sqkm = sqkm;
	}

	/**
	 * @return the sqkmWeek
	 */
	public float getSqkmWeek() {
		return sqkmWeek;
	}

	/**
	 * @param sqkmWeek the sqkmWeek to set
	 */
	public void setSqkmWeek(float sqkmWeek) {
		this.sqkmWeek = sqkmWeek;
	}

	/**
	 * @return the dtTime
	 */
	public float getDtTime() {
		return dtTime;
	}

	/**
	 * @param dtTime the dtTime to set
	 */
	public void setDtTime(float dtTime) {
		this.dtTime = dtTime;
	}

	/**
	 * @return the paySB
	 */
	public float getPaySB() {
		return paySB;
	}

	/**
	 * @param paySB the paySB to set
	 */
	public void setPaySB(float paySB) {
		this.paySB = paySB;
	}

	/**
	 * @return the noPaySB
	 */
	public float getNoPaySB() {
		return noPaySB;
	}

	/**
	 * @param noPaySB the noPaySB to set
	 */
	public void setNoPaySB(float noPaySB) {
		this.noPaySB = noPaySB;
	}

	/**
	 * @return the captureTime
	 */
	public float getCaptureTime() {
		return captureTime;
	}

	/**
	 * @param captureTime the captureTime to set
	 */
	public void setCaptureTime(float captureTime) {
		this.captureTime = captureTime;
	}

	/**
	 * @return the dailyIn
	 */
	public float getDailyIn() {
		return dailyIn;
	}

	/**
	 * @param dailyIn the dailyIn to set
	 */
	public void setDailyIn(float dailyIn) {
		this.dailyIn = dailyIn;
	}

	/**
	 * @return the weeklyIn
	 */
	public float getWeeklyIn() {
		return weeklyIn;
	}

	/**
	 * @param weeklyIn the weeklyIn to set
	 */
	public void setWeeklyIn(float weeklyIn) {
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
