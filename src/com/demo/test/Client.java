package com.demo.test;

public class Client {

	public static void main(String[] args) {
		Graphic gra,copyGra=null;
		DataSet dataSet=new DataSet();
		dataSet.setData("旧图表数据");
		gra=new Graphic();
		gra.setId(1);
		gra.setColor("red");
		gra.setDataSet(dataSet);
		System.out.println("旧图表："+"编号："+gra.getId()+"  颜色："+gra.getColor()+"  数据："+gra.getDataSet().getData());
		
		copyGra=(Graphic) gra.clone();
		System.out.println("复制得到的新图表："+"编号："+copyGra.getId()+"  颜色："+copyGra.getColor()+"  数据："+copyGra.getDataSet().getData());
		
		
		copyGra.setColor("blue");
		copyGra.setId(2);
		dataSet.setData("修改后的图表");
		copyGra.setDataSet(dataSet);
		System.out.println("修改后的新图表："+"编号："+copyGra.getId()+"  颜色："+copyGra.getColor()+"  数据："+copyGra.getDataSet().getData());
	}
}
