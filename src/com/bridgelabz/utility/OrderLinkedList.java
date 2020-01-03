package com.bridgelabz.utility;

public class OrderLinkedList<E> {
	private int size;
	private Node<E> start;

	public OrderLinkedList() {
		size = 0;
		start = null;
	}
	
	public void insert(E data) {

		Node<E> n,t1,t2;
		n = new Node<E>();
		n.setdata(data);
		n.setNext(start);
		int i=0,flag=0;
		
		t2 = start;
		t1= t2;
		if (start == null) {
			start = n;
		} else {
			for(i=0;i<size;i++)
			{
				if((int) n.getdata()<(int)start.getdata()||(int)n.getdata()==0)
				{
					n.setNext(start);
					start=n;
					flag=1;
					break;
				}
				else if((int)n.getdata()<=(int)t2.getdata())
				{
					n.setNext(t2);
					t1.setNext(n);
					flag=1;
					break;
				}	
				
				if(t2.getNext()!=null)
				{
					   t1=t2;
					   t2=t2.getNext();	
				}
				else
				{
					   t1=t2;
				}					
			}
			
			if(flag==0)
			{
				t2.setNext(n);
				n.setNext(null);
			}
		}
		size++;

	}

	
	public void view() throws InterruptedException {
		Node<E> t;
		t = start;
		while (t.getNext() != null) {
			
			System.out.print("-->" + t.getdata());
			t = t.getNext();
			}
		System.out.print("-->" + t.getdata());
		System.out.println();
		
		}

	public void search(E input) {
		Node<E> t ;
		t = start;
		int loc = 0, flag = 0;
		
		if(start==null)
		{
			System.out.println("We cant search");
		}
		else
		{
			t=start;
			flag=0;
			while(t.getNext()!=null)
			{
				
			
				if(t.getdata()==input)
				{
					flag=1;
					System.out.println("Data is Found in list");
					t=t.getNext();
					loc++;
					break;
				}
				
				t=t.getNext();
				loc++;
			}
			
			if(t.getdata()==input)
			{
				flag=1;
				loc++;
			}
			
			if(flag==1)
			{
				System.out.println("pass location is :"+loc);
				delete(loc);
			}
			else
			{
				insert(input);
			}
		}
			
		
	}

	private void delete(int loc) {
		Node<E> t1,t2;
		t2=start;
		t1=t2;
		if(start==null)
		{
			System.out.println("We Can not do Delete Operation");
		}
		else if(loc==1)
		{
			start=start.getNext();
		}
		else if(loc==size)
		{
			while(t2.getNext()!=null)
			{
				t1=t2;
				t2=t2.getNext();
			}
			t1.setNext(null);
		}
		else
		{
			for(int i=1;i<loc;i++)
			{
				t1=t2;
				t2=t2.getNext();
			}
			t1.setNext(t2.getNext());
		}
		size--;
	}

	public String[] collectFromLinkedList() {
		Node<E> t;
		t = start;
		String a[] = new String[size];
		int index=0;
		while (t.getNext() != null) {				
			a[index] = t.getdata().toString();
			index++;
			t = t.getNext();
			}
		a[index] = t.getdata().toString();
		index++;
		return a;
	}
	
	
}
