package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UnorderLinkedList<E> {
	private int size;
	private Node<E> start;

	public UnorderLinkedList() {
		size = 0;
		start = null;
	}

	public int search(E input) {
		int flag = 0, loc = 0;
		if (start == null) {
			return 0;
		} else {
			Node<E> t;
			t = start;
			loc = 0;
			flag = 0;
			while (t != null) {
				loc++;
				if (t.getdata().equals(input)) {
					flag = 1;
					break;
				}
				t = t.getNext();
			}

		}
		if (flag == 1) {
			return loc;
		} else {
			return 0;
		}
	}

	public void add(E word) {
		Node<E> n, t;
		n = new Node<E>();
		n.setdata(word);
		n.setNext(start);

		if (start == null) {
			start = n;
			;
		} else {
			t = start;
			while (t.getNext() != null) {
				t = t.getNext();
			}

			t.setNext(n);
			n.setNext(null);
		}
		size++;
	}
	
	
	public void viewList() {
		Node<E> t;
		t = start;
		if (start == null) {
			System.out.println("No any kind of Data here");
		} else {
			while (t.getNext() != null) {
				System.out.print(" " + t.getdata());
				t = t.getNext();

			}

			System.out.println(" " + t.getdata());
		}
	}

	public void delete(int loc) {
		Node<E> t, t1;
		t1 = start;
		t = t1;
		if (start == null) {
			System.out.println("List is Empty............");
		} else if (loc == 1) {
			start = start.getNext();
		} else {
			for (int i = 1; i < loc; i++) {
				t = t1;
				t1 = t1.getNext();
			}
			t.setNext(t1.getNext());
		}
		size--;
	}

	public String[] collectLinkedListData() {
		System.out.println("size " + size);

		String str[] = new String[size];
		Node<E> t;
		t = start;
		int index = 0;
		while (t.getNext() != null) {
			str[index] = (String) t.getdata();
			index++;
			t = t.getNext();
		}
		str[index] = (String) t.getdata();
		index++;

		return str;
	}

	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}

	// Read the data from file to LinkedLIst
	@SuppressWarnings("unchecked")
	public void fileTOLinkedList() throws IOException {
		File f = new File("/home/admin2/Narayan Mestry/chetan.txt");
		FileReader fr;
		BufferedReader br;
		E words[] = null;
		String str;
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			while ((str = br.readLine()) != null) {
				words = (E[]) str.split("[./,/?/ ]");

				for (E word : words) {
					// Thread.sleep(500);
					System.out.println(" " + word);
					add(word);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	// Write the Data to File

	public void LinkedListToFile(String[] list) {
		File f = new File("/home/admin2/Narayan Mestry/chetan.txt");
		FileWriter fw;
		BufferedWriter bw = null;
		try {

			fw = new FileWriter(f);
			bw = new BufferedWriter(fw);

			for (int i = 0; i <= getSize() - 1; i++) {
				bw.write(list[i] + " ");
			}

			System.out.println("File written Successfully");

		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
			} catch (Exception ex) {
				System.out.println("Error in closing the BufferedWriter" + ex);
			}
		}
	}

	public void addAtMiddle(E data) {
		Node<E> n ,t,t1 ;
		n = new Node<>();
		n.setdata(data);
		n.setNext(start);
		t = start;
		int loc =0, mid;
		
		
		if(start == null)
		{
			start = t;
		}
		else
		{
			while(t.getNext()!=null)
			{
				t = t.getNext();
				loc++;
			}
			loc++;
			t1 = start;
			t = t1;
			mid = loc/2;
			for(int i=0;i<mid;i++)
			{	t = t1;
				t1 = t1.getNext();
			}
			n.setNext(t1);
			t.setNext(n);
		}
		
		
		
	}
}
