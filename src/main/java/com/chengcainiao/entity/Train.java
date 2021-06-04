package com.chengcainiao.entity;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import com.chengcainiao.utils.Entity;
import java.util.Date;


/**
 * 
 * @author chengcainiao
 * @time 2021-05-31 16:23:37
 */
public class Train extends Entity{

	/**
	 * 
	 */
	private Integer id;
	/**
	 * 
	 */
	private Date startDate;
	/**
	 * 
	 */
	private Date endDate;
	/**
	 * 
	 */
	@Length(max = 100)
	private String company;
	/**
	 * 
	 */
	@Length(max = 100)
	private String course;
	/**
	 * 
	 */
	private Integer resumeId;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Integer getResumeId() {
		return resumeId;
	}
	public void setResumeId(Integer resumeId) {
		this.resumeId = resumeId;
	}
}