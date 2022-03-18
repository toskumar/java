package com.dp.creational.prototype;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class Document implements Cloneable, Serializable {

	private static final long serialVersionUID = 3285139480250989317L;
	private int id;
	private String name;
	private String author;
	private Date publishedOn;
	private BarCode barCode;

	Document(int id, String name, String author, Date publishedOn, BarCode barCode) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publishedOn = publishedOn;
		this.barCode = barCode;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public Object deepClone() throws Exception {

		File f = File.createTempFile("obj", "txt");
		ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(f));
		oout.writeObject(this);
		oout.close();

		ObjectInputStream oin = new ObjectInputStream(new FileInputStream(f));
		Object obj = oin.readObject();
		oin.close();
		return obj;
	}

}

class BarCode implements Serializable {

	private static final long serialVersionUID = 5213573747634557494L;
	String id;

	public BarCode(String id) {
		this.id = id;
	}

}
