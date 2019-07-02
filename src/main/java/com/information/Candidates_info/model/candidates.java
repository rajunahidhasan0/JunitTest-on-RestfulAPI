package com.information.Candidates_info.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class candidates {
	@Id
	public ObjectId _id;
	
	public String name;
	public String regestration;
	public String college;
	public String session;
	
	
	
	public String get_id() {
		return _id.toHexString();
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public candidates(String name, String regestration, String college, String session) {
		super();
		this.name = name;
		this.regestration = regestration;
		this.college = college;
		this.session = session;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegestration() {
		return regestration;
	}
	public void setRegestration(String regestration) {
		this.regestration = regestration;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	
	
}
