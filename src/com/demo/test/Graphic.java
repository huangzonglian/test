package com.demo.test;


import java.io.*;

public class Graphic implements Serializable {
	private int id;
	private DataSet dataSet;
	private String color;
	
	public Object clone(){
		ByteArrayOutputStream bao=new ByteArrayOutputStream();
		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(bao);
			oos.writeObject(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		ByteArrayInputStream bis=new ByteArrayInputStream(bao.toByteArray());
		ObjectInputStream ois;
		try {
			ois = new ObjectInputStream(bis);
				return (ois.readObject());
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public DataSet getDataSet() {
		return dataSet;
	}

	public void setDataSet(DataSet dataSet) {
		this.dataSet = dataSet;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}	
}
