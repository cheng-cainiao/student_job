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
public class Dict extends Entity{

	/**
	 * 
	 */
	private Integer id;
	/**
	 * 
	 */
	@Length(max = 100)
	private String dictKey;
	/**
	 * 
	 */
	@Length(max = 100)
	private String dictVal;
	/**
	 * 
	 */
	private Integer sort;
	/**
	 * 0正常|1删除
	 */
	private Integer status;
	/**
	 * 
	 */
	private Integer typeId;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDictKey() {
		return dictKey;
	}
	public void setDictKey(String dictKey) {
		this.dictKey = dictKey;
	}
	public String getDictVal() {
		return dictVal;
	}
	public void setDictVal(String dictVal) {
		this.dictVal = dictVal;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
}