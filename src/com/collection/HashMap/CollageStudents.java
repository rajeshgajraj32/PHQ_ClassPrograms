package com.collection.HashMap;

public class CollageStudents {
    private int id;
    private String name;
    private String Collage="Saroj Memorial Collage, Sirohi river,Neem Ka Thana";
	public CollageStudents(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCollage() {
		return Collage;
	}
	@Override
	public String toString() {
		return "CollageStudents [id=" + id + ", name=" + name + ", Collage=" + Collage + "]\n";
	}
	
}
