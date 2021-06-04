package com.chengcainiao.entity;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import com.chengcainiao.utils.Entity;
import java.util.Date;

/**
 * 
 * @author chengcainiao
 * @time 2021-05-31 16:23:31
 */
public class Experience extends Entity{

	/**
	 * 
	 */
	private Integer id;
	/**
	 * 
	 */
	@Length(max = 100)
	private String company;
	/**
	 * 
	 */
	@Length(max = 100)
	private String post;
	/**
	 * 
	 */
	@Length(max = 100)
	private String salary;
	/**
	 * 
	 */
	@Length(max = 0)
	private String description;
	/**
	 * 
	 */
	private Date joinDate;
	/**
	 * 
	 */
	private Date leaveDate;
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
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public Date getLeaveDate() {
		return leaveDate;
	}
	public void setLeaveDate(Date leaveDate) {
		this.leaveDate = leaveDate;
	}
	public Integer getResumeId() {
		return resumeId;
	}
	public void setResumeId(Integer resumeId) {
		this.resumeId = resumeId;
	}
}