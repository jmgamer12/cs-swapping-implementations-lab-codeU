package com.flatironschool.javacs;

//import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class ListClientExample {
	private List<String> list;
	
	public ListClientExample() {
		list = new ArrayList<String>();
	}

	public List<String> getList() {
		return list;		
	}

	public static void main(String[] args) {
		ListClientExample lce = new ListClientExample();
		List<String> list = lce.getList();
		System.out.println(list);
	}
}
