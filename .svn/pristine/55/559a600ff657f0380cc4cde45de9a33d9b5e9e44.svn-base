package cn.com.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Address")
public class Address {
	@Id
	private String id;
	private String parentid;
	private int sectiontype;
	private String name;
	private String group;
	private String abbreviation;
	private XY xy;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getParentid() {
		return parentid;
	}

	public void setParentid(String parentid) {
		this.parentid = parentid;
	}

	public int getSectiontype() {
		return sectiontype;
	}

	public void setSectiontype(int sectiontype) {
		this.sectiontype = sectiontype;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public XY getXY() {
		return xy;
	}

	public void setXY(XY xy) {
		this.xy = xy;
	}


}