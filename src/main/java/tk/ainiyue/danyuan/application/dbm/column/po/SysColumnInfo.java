package tk.ainiyue.danyuan.application.dbm.column.po;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

/**
 * The persistent class for the sys_column_info database table.
 */
@Entity
@Table(name = "sys_column_info")
@NamedQuery(name = "SysColumnInfo.findAll", query = "SELECT s FROM SysColumnInfo s")
public class SysColumnInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GenericGenerator(name = "idGenerator", strategy = "uuid")
	@Column(unique = true, nullable = false, length = 36)
	private String			  uuid;
	
	@Column(name = "COLD_LENGTH")
	private int				  coldLength;
	
	@Column(name = "COLS_DESC", length = 100)
	private String			  colsDesc;
	
	@Column(name = "cols_name", length = 30)
	private String			  colsName;
	
	@Column(name = "COLS_ORDER")
	private int				  colsOrder;
	
	@Column(name = "cols_type", length = 10)
	private String			  colsType;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_time")
	private Date			  createTime;
	
	@Column(name = "create_user", length = 50)
	private String			  createUser;
	
	@Column(name = "delete_flag")
	private int				  deleteFlag;
	
	@Column(length = 200)
	private String			  discription;
	
	@Column(name = "table_uuid", length = 36)
	private String			  tableUuid;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updata_time")
	private Date			  updataTime;
	
	@Column(name = "updata_user", length = 50)
	private String			  updataUser;
	
	public SysColumnInfo() {
	}
	
	public String getUuid() {
		return this.uuid;
	}
	
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	
	public int getColdLength() {
		return this.coldLength;
	}
	
	public void setColdLength(int coldLength) {
		this.coldLength = coldLength;
	}
	
	public String getColsDesc() {
		return this.colsDesc;
	}
	
	public void setColsDesc(String colsDesc) {
		this.colsDesc = colsDesc;
	}
	
	public String getColsName() {
		return this.colsName;
	}
	
	public void setColsName(String colsName) {
		this.colsName = colsName;
	}
	
	public int getColsOrder() {
		return this.colsOrder;
	}
	
	public void setColsOrder(int colsOrder) {
		this.colsOrder = colsOrder;
	}
	
	public String getColsType() {
		return this.colsType;
	}
	
	public void setColsType(String colsType) {
		this.colsType = colsType;
	}
	
	public Date getCreateTime() {
		return this.createTime;
	}
	
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public String getCreateUser() {
		return this.createUser;
	}
	
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	
	public int getDeleteFlag() {
		return this.deleteFlag;
	}
	
	public void setDeleteFlag(int deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
	
	public String getDiscription() {
		return this.discription;
	}
	
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	
	public String getTableUuid() {
		return this.tableUuid;
	}
	
	public void setTableUuid(String tableUuid) {
		this.tableUuid = tableUuid;
	}
	
	public Date getUpdataTime() {
		return this.updataTime;
	}
	
	public void setUpdataTime(Date updataTime) {
		this.updataTime = updataTime;
	}
	
	public String getUpdataUser() {
		return this.updataUser;
	}
	
	public void setUpdataUser(String updataUser) {
		this.updataUser = updataUser;
	}
	
}