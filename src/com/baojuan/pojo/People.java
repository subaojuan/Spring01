package com.baojuan.pojo;

import java.util.Set;

public class People {
	private int id;
	private String name;
	private Set<String> sets;
	private Desk desk;

	public Desk getDesk() {
		return desk;
	}

	public void setDesk(Desk desk) {
		this.desk = desk;
	}

	public Set<String> getSets() {
		return sets;
	}

	public void setSets(Set<String> sets) {
		this.sets = sets;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// 无参构造
	public People() {
	}

	// 有参构造
	public People(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("有参构造方法");
	}

	

	@Override
	public String toString() {
		return "People [id=" + id + ", name=" + name + ", sets=" + sets + ", desk=" + desk + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
