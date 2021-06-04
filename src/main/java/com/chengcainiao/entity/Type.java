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
public class Type extends Entity{

	/**
	 * 
	 */
	private Integer id;
	/**
	 * 
	 */
	@Length(max = 100)
	private String name;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}