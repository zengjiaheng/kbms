package com.shuxin.model;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

/**
*
*诊断目录
*
*/
@TableName("t_diagnostic_catalog_opt")
public class DiagnosticCatalogOpt extends  DiagnosticCatalog implements Serializable{

	
	private static final long serialVersionUID = 6183661815807132033L;
	@TableField(value = "opt_type")
	private String optType;



	public String getOptType() {
		return optType;
	}



	public void setOptType(String optType) {
		this.optType = optType;
	}
	
	
	
}
