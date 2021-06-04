package com.chengcainiao.entity;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import com.chengcainiao.utils.Entity;
import java.util.Date;


/**
 * 
 * @author chengcainiao
 * @time 2021-05-31 16:23:38
 */
public class UserMenu extends Entity{

	/**
	 * 
	 */
	private Integer userId;
	/**
	 * 
	 */
	private Integer menuId;

	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getMenuId() {
		return menuId;
	}
	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}
}