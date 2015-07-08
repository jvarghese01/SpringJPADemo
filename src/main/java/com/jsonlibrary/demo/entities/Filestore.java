package com.jsonlibrary.demo.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Filestore {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String fileName;
	private String checksum;
	private String fileId;
	private Date timestamp;
	private String type;
	private float width;
	private float height;
	private int status;
	private String source;
	private int iid;
	private String uuid;
	private Date cdate;
	private int size;
	private int quar;
	private Date lastChecked;
	private int fault;
	
	public Filestore(){}

	public Filestore(long id, String fileName, String checksum, String fileID,
			Date timestamp, String type, float width, float height, int status,
			String source, int iid, String uuid, Date cdate, int size,
			int quar, Date lastChecked, int fault) {
		super();
		this.id = id;
		this.fileName = fileName;
		this.checksum = checksum;
		this.fileId = fileId;
		this.timestamp = timestamp;
		this.type = type;
		this.width = width;
		this.height = height;
		this.status = status;
		this.source = source;
		this.iid = iid;
		this.uuid = uuid;
		this.cdate = cdate;
		this.size = size;
		this.quar = quar;
		this.lastChecked = lastChecked;
		this.fault = fault;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getChecksum() {
		return checksum;
	}

	public void setChecksum(String checksum) {
		this.checksum = checksum;
	}

	public String getFileId() {
		return fileId;
	}

	public void setFileID(String fileId) {
		this.fileId = fileId;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public int getIid() {
		return iid;
	}

	public void setIid(int iid) {
		this.iid = iid;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Date getCdate() {
		return cdate;
	}

	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getQuar() {
		return quar;
	}

	public void setQuar(int quar) {
		this.quar = quar;
	}

	public Date getLastChecked() {
		return lastChecked;
	}

	public void setLastChecked(Date lastChecked) {
		this.lastChecked = lastChecked;
	}

	public int getFault() {
		return fault;
	}

	public void setFault(int fault) {
		this.fault = fault;
	}

	@Override
	public String toString() {
		return "Filestore [id=" + id + ", fileName=" + fileName + ", checksum="
				+ checksum + ", fileID=" + fileId + ", timestamp=" + timestamp
				+ ", type=" + type + ", width=" + width + ", height=" + height
				+ ", status=" + status + ", source=" + source + ", iid=" + iid
				+ ", uuid=" + uuid + ", cdate=" + cdate + ", size=" + size
				+ ", quar=" + quar + ", lastChecked=" + lastChecked
				+ ", fault=" + fault + "]";
	}
	
}
