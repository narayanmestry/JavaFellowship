package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utility {

	static String REGEX_uname = "<<user name>>";
	static String REGEX_name = "<<name>>";
	static String REGEX_fullname = "<<full name>>";
	static String REGEX_mobile = "xxxxxxxxxx";
	static String REGEX_date = "XX/XX/XXXX";

	static Scanner sc = new Scanner(System.in);
	static File file;
	static FileReader fr;
	static FileWriter fw;

	static BufferedReader br;
	static BufferedWriter bw;
	static int recursion = 0, iteration = 0;

	static int arr[][] = new int[10][100];
	static int angram[][] = new int[10][100];
	static int col0 = 0, col1 = 0, col2 = 0, col3 = 0, col4 = 0, col5 = 0, col6 = 0, col7 = 0, col8 = 0, col9 = 0;
	static int ana0 = 0, ana1 = 0, ana2 = 0, ana3 = 0, ana4 = 0, ana5 = 0, ana6 = 0, ana7 = 0, ana8 = 0, ana9 = 0;

	public Utility() {

	}

	// Used to input the String:
	public static String inputString() {
		/// Scanner sc = new Scanner(System.in);
		String str = sc.next();
		// sc.close();
		return str;
	}

	// To Read the String with Space
	public static String inputStringWithSpace() {
		String fullname = sc.nextLine();
		fullname = fullname + sc.nextLine();
		return fullname;
	}

	// Used to input the Integer:
	public static int inputNumber() {
		int number = sc.nextInt();
		return number;
	}

	// Used to Input the Float or Read the Float Value
	public static float inputFloat() {
		float f = sc.nextFloat();
		return f;
	}

	// to Read the Doble input:
	public static double inputDouble() {
		double number = sc.nextDouble();
		return number;
	}

	// TO Input the Character
	public static char inputChar() {
		char c = sc.next().charAt(0);
		return c;
	}

	// Used to Replace the String using Regex :
	public static String replaceString(String name, String userinput) {
		Pattern p;
		Matcher m;
		p = Pattern.compile(REGEX_uname);
		m = p.matcher(userinput);
		return m.replaceAll(name);
	}

	// Calculate Tail Percentage
	public static float tailperCalculator(float tailcount, int flipcount) {
		return (100 * tailcount) / flipcount;
	}

	// Calculate Head Percentage
	public static float headperCalculator(float headcount, int flipcount) {
		return (100 * headcount) / flipcount;
	}

	// To check Leap year or Not
	public static boolean leapOrNotleap(int year) {
		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			return true;
		} else {
			return false;
		}
	}

	// To Calculate the Power
	public static int calculatePower(int i, int n) {
		int power = 2;
		for (int j = 1; j < i; j++) {
			power = power * 2;
		}
		return power;
	}

	// To Claculate Harmonic Number
	public static float calculateHarmonic(int limit) {
		float sum = 0;
		for (int n = 1; n <= limit; n++) {
			if (n == 1) {
				System.out.print("1+");
			} else if (n == limit) {
				System.out.println("1/" + n);
			} else {
				System.out.print("1/" + n + "+");
			}
			sum = sum + (float) 1 / n;
		}
		return sum;
	}

	// To Calculate the Prime Factor
	public static ArrayList<Integer> getPrimeFactor(int num) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		int i = 2;
		while (num != 1) {
			if (num % i == 0) {
				while (num % i == 0) {
					al.add(i);
					num = num / i;
				}

			}
			i++;
		}
		return al;
	}

	// To print Triplet which Sum is 0
	public static void getTriplet(int[] a) {
		// ArrayList<Object> main = new ArrayList<Object>();
		// ArrayList<Integer> al = new ArrayList<Integer>();
		int i, j, k, len;
		len = a.length;
		for (i = 0; i < len - 2; i++) {
			for (j = i + 1; j < len - 1; j++) {
				for (k = j + 1; k < len; k++) {
					if ((a[i] + a[j] + a[k]) == 0) {
						System.out.println("{" + a[i] + "," + a[j] + "," + a[k] + "}");
					}
				}
			}
		}
		// return main;
	}

	// To Calculate Distance
	public static double getDistance(int x1, int x2, int y1, int y2) {
		return Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
	}

	// Calculate the Roots
	public static double[] getRoots(double a, double b, double c) {
		double determinant, real, imaginary, root1, root2;
		double x[] = new double[2];
		if (a == 0 || b == 0 || c == 0) {
			System.out.println("Root cant be Determine...");
			x[0] = 0.0;
			x[1] = 0.0;
			return x;

		} else {
			// Now Calculate determinant
			determinant = (b * b + 4 * a * c);
			/*
			 * Now check if determinant < 0 OR determinant==0 OR determinant>0 if
			 * determinant < 0 , then there roots are imaginary number , no real_number
			 * 
			 * to calculate real part of root we use : -b/2a to calculate imaginary part
			 * root we use : sqrt(abs(determinant)*2a)
			 * 
			 * 
			 * if determinant == 0 , then there roots are real number and they are equal
			 * 
			 * to calucate root real part : -b/2a
			 * 
			 * 
			 * if determinant > 0 , then there roots are real number , they are distinct
			 * 
			 * to calulate root 1 : (-b+sqrt(abs(determinant)/2a)/2a) to calulate root 2 :
			 * (-b-sqrt(abs(determinant)2a)/2a)
			 * 
			 * 
			 */

			if (determinant < 0) {
				System.out.println("Roots are imaginary number not a real number");
				real = (-b / 2 * a);
				imaginary = (float) Math.sqrt((determinant) / (2 * a));
				// System.out.println("Root 1 : "+real+"+i"+imaginary);
				/// System.out.println("Root 2 : "+real+"-i"+imaginary);
				x[0] = real;
				x[1] = imaginary;
				return x;
			} else if (determinant == 0) {
				System.out.println("Roots are real number and Equal ");
				root1 = (-b / 2 * a);
				root2 = root1;
//				System.out.println("Root 1 : "+root1);
//				System.out.println("Root 2 : "+root2);
				x[0] = root1;
				x[1] = root2;
				return x;
			} else {
				System.out.println("Roots are the Real number and Distinct ");
				root1 = (float) (-b + Math.sqrt((determinant) / (2 * a)) / (2 * a));
				root2 = (float) (-b - Math.sqrt((determinant) / (2 * a)) / (2 * a));
//				System.out.println("Root 1 : "+root1);
//				System.out.println("Root 2 : "+root2);
				x[0] = root1;
				x[1] = root2;
				return x;
			}
		}

	}

	// Calculate WindChill
	public static double getWindChill(double t, double v) {
		return 35.75 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
	}

	public static int playGame(int stake, int trail, int goal) {
		int cash, wins = 0;
		for (int i = 0; i < trail; i++) {
			for (cash = stake; cash > 0 && cash < goal;) {
				if (Math.random() > 0.5) {
					cash++;
				} else {
					cash--;
				}
			}
			if (cash == goal) {
				wins++;
			} else {
			}

		}

		return wins;
	}

	// To Calculate Win Percentage
	public static int winPerc(int wins, int trail) {
		return (100 * wins) / trail;
	}

	// To Calculate Loss Percentage
	public static int lossPerc(int loss, int trail) {
		return (100 * loss) / trail;
	}

	// To Genereate the Distinct coupon
	public static int[] distinctCouponGenerator(int N) {
		Random rand = new Random();
		int i, j, flag = 1;
		int nums[] = new int[N];
		for (i = 0; i < N;) {
			int number = 1000 + rand.nextInt(2000);
			flag = 0;
			for (j = 0; j < N; j++) {
				if (nums[j] == number) {
					flag = 1;
				}
			}

			if (flag == 0) {
				nums[i] = number;
				i++;
			}

		}
		return nums;

	}

	// To calculate Chenge
	public static void calculateChenge(int money, int[] note) {
		int index = 0, totalnotes;
		while (money != 0) {
			totalnotes = 0;
			totalnotes = money / note[index];
			if (totalnotes != 0) {
				System.out.println(note[index] + "*" + totalnotes + " : " + (totalnotes + note[index]));
			}
			money = money % note[index];
			if (money != 0) {
				index++;
			}
		}
		System.out.println("Thank you......");

	}

	// To Calculate Day of the Week
	public static int dayCalculator(int d, int m, int y) {
		int day, month, year, x;
		year = y - (14 - m) / 12;
		x = year + year / 4 - year / 100 + year / 400;
		month = m + 12 * ((14 - m) / 12) - 2;
		day = (d + x + 31 * month / 12) % 7;
		return day;
	}

	// To Convert Temp to Fahrenheit
	public static float celciousToFahrenheit(float c_Temp) {
		return (c_Temp * 9 / 5) + 32;
	}

	// To Convert Fahrenheit to Celcious
	public static float fahrenheitToCelcious(float f_Temp) {
		return (f_Temp - 32) * 5 / 9;
	}

	// Ta Calculate the monthly Payment
	public static double paymentCalculator(int year, int principleAmount, float percent) {
		float n, r;
		double monthlyPayment;
		n = 12 * year;
		r = percent / (12 * 100);
		monthlyPayment = ((principleAmount * r) / 1 - (Math.pow((1 + r), -n)));
		return monthlyPayment;
	}

	// To Calculate SQRT
	public static double sqrt(int num) {
		double t = num;
		double epsilon = 1e-15;

		while (Math.abs(t - num / t) > epsilon * t) {
			t = (num / t + t) / 2.0;
		}
		return t;
	}

	// To Covert to Decimal to Binary
	public static int[] toBinary(int num) {
		int dummy, i = 0, mod;
		dummy = num; // store the number into dummy variable for modifiction purpose

		int size = (int) countBit(num);

		System.out.println("number of bit required :" + size);
		int bin[] = new int[size];

		dummy = num;
		while (dummy > 0) {
			mod = dummy % 2;
			bin[i] = mod;
			i++; // COnvert the data into Binary
			dummy = dummy / 2;
		}
		return bin;
	}

	// to count how many bit Required for binary represention
	private static long countBit(int num) {
		int n = 0;
		long size = 0;
		while (Math.pow(2, n) <= num) {
			n++;
		}

		if (n >= 1 && n <= 4) {
			size = 4;
		} else if (n >= 5 && n <= 8) {
			size = 8;
		}
		if (n >= 8 && n <= 16) {
			size = 16;
		}
		if (n >= 16 && n <= 32) {
			size = 32;
		}
		if (n >= 32 && n <= 64) {
			size = 64;
		}
		if (n >= 64 && n <= 128) {
			size = 128;
		}
		return size;
	}

	// To swap the nibble of binary number
	// To Swap the Nibble of Array
	public static int[] swapNibblesBinary(int[] b) {
		int mid, i, j, temp;
		mid = b.length / 2;
		for (i = 0, j = mid; i < mid; i++, j++) {
			temp = b[i];
			b[i] = b[j];
			b[j] = temp;
		}
		return b;
	}

	// To Covert Binary to Decimal
	// TO convert the Binary to Decimanl
	public static int binaryTODecimal(int[] b) {
		int i, decimal = 0, n = 0, bit;
		for (i = b.length - 1; i >= 0; i--) {
			bit = b[i];
			decimal = (int) (decimal + (bit * (Math.pow(2, n))));
			n++;
		}
		return decimal;
	}

	// Binary Search
	// Binary Search
	public static boolean binarySearch(String[] words, String input) {
		int low = 0;
		int high = words.length - 1;
		int mid;
		int flag = 0;

		while (low < high) {
			mid = (low + high) / 2;
			if (input.compareTo(words[mid]) < 0) {
				high = mid;
			} else if (input.compareTo(words[mid]) == 0) {
				flag = 1;
				break;
			} else if (input.compareTo(words[mid]) > 0) {
				low = mid + 1;
			}

		}
		if (flag == 1) {
			return true;
		} else {
			return false;
		}

	}

	// Insertion Sort
	// Insertion Sort
	public static String[] insertionSort(String[] a) {
		int len = a.length;
		int i, j;
		String key;

		for (i = 1; i < len; i++) {
			key = a[i];
			j = i - 1;
			while (j >= 0 && a[j].compareTo(key) > 0) {
				a[j + 1] = a[j];
				j = j - 1;
			}
			a[j + 1] = key;
		}

		return a;
	}

	// buble sort
	public static String[] bubbleSort(String[] a) {
		int i, j;
		String temp;
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < (a.length - 1); j++) {

				int result = a[j].compareTo(a[j + 1]);
				if (result > 0) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		return a;
	}

	// MergeSort ...............
	// Merge Sort
	public static String[] mergeSort(String[] name) {
		int length = name.length;
		if (length > 2) {
			String left[] = new String[length / 2];
			String right[] = new String[length - length / 2];
			for (int i = 0; i < left.length; i++) {
				left[i] = name[i];
			}

			for (int i = 0; i < right.length; i++) {
				right[i] = name[i + name.length / 2];
			}

			mergeSort(left);
			mergeSort(right);

			merge(name, left, right);
		}
		return name;
	}

	// Merge
	private static String[] merge(String[] name, String[] left, String[] right) {
		int a = 0;
		int b = 0;
		for (int i = 0; i < name.length; i++) {
			if (b >= right.length || (a < left.length && left[a].compareToIgnoreCase(right[b]) < 0)) {
				name[i] = left[a];
				a++;
			} else {
				name[i] = right[b];
				b++;
			}
		}
		return name;
	}

	// To Check the String Anagram or not
	// Anagram checker
	public static boolean anagramChecker(String str1, String str2) {
		char c1[] = str1.toCharArray();
		char c2[] = str2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		boolean equal = Arrays.equals(c1, c2);
		if (equal) {
			return true;
		} else {
			return false;
		}
	}

	// To check Palindrome or not
	// Check Palindrom or not
	public static boolean isPalimdrome(int n) {
		int temp, rem, reverse = 0;
		temp = n;
		while (temp > 0) {
			rem = temp % 10;
			reverse = reverse * 10 + rem;
			temp = temp / 10;
		}
		if (n == reverse) {
			return true;
		} else {
			return false;
		}

	}

	// To Find / Guess number
	// to number find
	public static int find(int[] a) {
		int low, mid, high;
		low = 0;
		high = a.length;

		while (low != high) {
			mid = (low + high) / 2;
			System.out.println("Press 1 : if your number is between " + low + " to " + mid + ": ");
			System.out.println("Press 2 : if your number is between " + (mid + 1) + " to " + high + ": ");

			int press = Utility.inputNumber();

			if (press == 1) {
				high = mid;
			} else if (press == 2) {
				low = mid + 1;
			}
		}

		return low;
	}

	// To replace the String by using Regex
	// To replace the String using Regex
	public static String replaceString(String name, String fullname, String mobile, String date, String msg) {
		Pattern p;
		Matcher m;

		p = Pattern.compile(REGEX_name);
		m = p.matcher(msg);
		msg = m.replaceAll(name);

		p = Pattern.compile(REGEX_fullname);
		m = p.matcher(msg);
		msg = m.replaceAll(fullname);

		p = Pattern.compile(REGEX_mobile);
		m = p.matcher(msg);
		msg = m.replaceAll(mobile);

		p = Pattern.compile(REGEX_date);
		m = p.matcher(msg);
		msg = m.replaceAll(date);

		return msg;
	}

	/****************************************
	 * Permutaion logic start
	 **********************************/

//******************Iteration*********************//

	// Iteration method
	public static void iteratePermutation(String str, int n) {
		int i;
		char[] s = str.toCharArray();
		Arrays.sort(s);

		while (true) {
			System.out.println(String.valueOf(s) + " ");
			iteration++;
			i = n - 1;
			while (s[i - 1] >= s[i]) {
				i = i - 1;
				if (i == 0) {

					return;
				}
			}

			int j = n - 1;

			while (j > i && s[j] <= s[i - 1]) {
				j--;
			}

			swap(s, i - 1, j);
			reverse(s, i, n - 1);

		}

	}

	/* Use for Reverse */
	// Reverse the
	private static void reverse(char[] s, int i, int j) {
		while (i < j) {
			swap(s, i++, j--);
		}
	}

	/* Use for Swap */
	// swap
	private static void swap(char[] s, int i, int j) {
		char temp = s[i];
		s[i] = s[j];
		s[j] = temp;
	}
///////////////////////////////////////////End Of Using Iteration///////////////////////	

/////////////// Recursion///////////////////////	

	public static void permute(String str, int start, int end) {
		if (start == end - 1) {
			System.out.println(str + " ");
			recursion++;

		} else {
			for (int i = start; i < end; i++) {
				str = swap(str, start, i);
				permute(str, start + 1, end);
				str = swap(str, start, i); // backtracking

			}
		}

	}

	private static String swap(String str, int i, int j) {
		char c[] = str.toCharArray();
		char temp;

		temp = c[i];
		c[i] = c[j];
		c[j] = temp;

		String s = String.valueOf(c);
		return s;

	}

////////////End Of Using Recursion///////////////////////
	// check iteration and recursion Result that same or Different
	public static boolean isEqual() {

		if (iteration == recursion) {
			return true;
		} else {
			return false;

		}
	}

	/**************************** Permutation Logic End ***********************/

	/******************************* Data Structure ****************************/
	// 1. Prime And Anagram in 2D matrix
	// To Show the prime
	public static void showPrime() {
		int i, j;
		for (i = 0; i < 10; i++) {
			for (j = 0; j < 100; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}

	}

	// To show prime As well as prime as well as Prime and Anagram
	public static void showPrimeAndAnagram() {
		int i, j;
		for (i = 0; i < 10; i++) {
			for (j = 0; j < 100; j++) {
				System.out.print(" " + angram[i][j]);
			}
			System.out.println();
		}

	}

	// To check if number is Anagram or not
	public static int isAnagram(int n1) {

		int revno = reverseNo(n1);
		int rowno = getRowNum(n1);

		int flag = 0;

		for (int i = 0; i < 100; i++) {
			if (revno == (arr[rowno][i])) {

				flag = 1;
				break;
			}
		}

		if (flag == 1) {
			return n1;
		} else {
			return 0;
		}

	}

	// To revese the number
	public static int reverseNo(int n1) {
		int rem, rev = 0;
		while (n1 > 0) {
			rem = n1 % 10;
			rev = rem + (rev * 10);
			n1 = n1 / 10;
		}
		return rev;
	}

	// to get reverse tnumber
	public static int getRowNum(int prime) {
		if (prime > 100 && prime <= 200) {
			return 1;
		} else if (prime > 200 && prime <= 300) {
			return 2;
		} else if (prime > 300 && prime <= 400) {
			return 3;
		} else if (prime > 400 && prime <= 500) {
			return 4;
		} else if (prime > 500 && prime <= 600) {
			return 5;
		} else if (prime > 600 && prime <= 700) {
			return 6;
		} else if (prime > 700 && prime <= 800) {
			return 7;
		} else if (prime > 800 && prime <= 900) {
			return 8;
		} else if (prime > 900 && prime <= 1000) {
			return 9;
		} else {
			return 0;
		}
	}

	// Use to Store the 2D matrix
	public static void make2Dmatrix(int prime) {

		if (prime > 0 && prime <= 100) {
			arr[0][col0] = prime;
			col0++;

		} else if (prime > 100 && prime <= 200) {
			arr[1][col1] = prime;
			col1++;
		} else if (prime > 200 && prime <= 300) {
			arr[2][col2] = prime;
			col2++;
		} else if (prime > 300 && prime <= 400) {
			arr[3][col3] = prime;
			col3++;
		} else if (prime > 400 && prime <= 500) {
			arr[4][col4] = prime;
			col4++;
		} else if (prime > 500 && prime <= 600) {
			arr[5][col5] = prime;
			col5++;
		} else if (prime > 600 && prime <= 700) {
			arr[6][col6] = prime;
			col6++;
		} else if (prime > 700 && prime <= 800) {
			arr[7][col7] = prime;
			col7++;
		} else if (prime > 800 && prime <= 900) {
			arr[8][col8] = prime;
			col8++;
		} else if (prime > 900 && prime <= 1000) {
			arr[9][col9] = prime;
			col9++;
		}

	}

	// to Store the 2 D matrix
	public static void anagram2Dmatrix(int prime) {

		if (prime > 0 && prime <= 100) {
			angram[0][ana0] = prime;
			ana0++;

		} else if (prime > 100 && prime <= 200) {
			angram[1][ana1] = prime;
			ana1++;
		} else if (prime > 200 && prime <= 300) {
			angram[2][ana2] = prime;
			ana2++;
		} else if (prime > 300 && prime <= 400) {
			angram[3][ana3] = prime;
			ana3++;
		} else if (prime > 400 && prime <= 500) {
			angram[4][ana4] = prime;
			ana4++;
		} else if (prime > 500 && prime <= 600) {
			angram[5][ana5] = prime;
			ana5++;
		} else if (prime > 600 && prime <= 700) {
			angram[6][ana6] = prime;
			ana6++;
		} else if (prime > 700 && prime <= 800) {
			angram[7][ana7] = prime;
			ana7++;
		} else if (prime > 800 && prime <= 900) {
			angram[8][ana8] = prime;
			ana8++;
		} else if (prime > 900 && prime <= 1000) {
			angram[9][ana9] = prime;
			ana9++;
		}
	}

	// OrderLinkedList :
	// Nested Class For Order List
	// Read the File 
	public static String[] getDataFromFile(String filepath) throws IOException {
		file = new File(filepath);
		String str ;
		String data[]  = null;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			while((str=br.readLine())!=null)
			{
				data = str.split(" ");
			}			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return data;
	}
	// Convert the String Array into Integer
	public static Integer[] convertToInteger(String[] data) {
		Integer num[] = new Integer[data.length] ;
		for(int i = 0; i<data.length;i++)
		{
			//num[i] = Integer.parseInt(data[i]);
			num[i] = Integer.valueOf(data[i]);
			//System.out.println(num[i]+"@ "+data[i]);
		}
		return num;
	}
	// static class orderLinkedList
	
	// Check Paranthes Balance
	// Nested class for Balance parantheses check
	public static class Paracheck {

		public boolean paraCheckFun(String str) {
			Stack st = new Stack();
			char exp[] = new char[100];
			int flag = 0;

			exp = str.toCharArray();

			if (exp[0] == '}' || exp[0] == ']' || exp[0] == ')') { // check starting of expression IF we got
				return false; // open paranthes then Not balance
			} else {
				for (char c : exp) {
					if (c == '{' || c == '[' || c == '(') {
						st.push(c); // if open paranthese them push on stack
					} else if (c == '}' || c == ']' || c == ')') {
						/*
						 * IF we got close paranthes we does not pop direct becoz the open paranthese
						 * might be any type so we have to check that top element of the stack if it
						 * corresponding to given close paranthese then we have to do POP() operation...
						 */
						boolean pair = pairCheck(st.peek(), c);
						if (st.isEmpty()) {
							flag = 1;
							break;
						} else if (pair) {
							st.pop();
						} else {
							st.push(c);
						}
					}
				}

				if (flag == 0 && st.isEmpty()) {
					return true;
				} else {
					return false;
				}

			}

		}

		public boolean pairCheck(char open, char close) {
			if (open == '{' && close == '}') {
				return true;
			} else if (open == '[' && close == ']') {
				return true;
			} else if (open == '(' && close == ')') {
				return true;
			} else {
				return false;

			}

		}

	}

	// BAnkCash Counter Queue Logic
	// Nested classs for Queue
	public static class QueueLogic {
		public QNode front, rear;
		public int size = 0;
		static int bankamount = 500;

		public QueueLogic() {
			front = null;
			rear = null;
			size = 0;
		}

		public int deposit() {

			int amount;
			System.out.println("Enter the Ammount :");
			amount = sc.nextInt();
			if (amount > 500) {
				bankamount = bankamount + amount;
			} else {
				System.out.println("Please Enter the Amount >= 500");
				deposit();
			}
			return bankamount;
		}

		public int widtdraw() {
			int amount;
			System.out.println("Enter the Ammount :");
			amount = sc.nextInt();
			if (amount < bankamount) {
				bankamount = bankamount - amount;
			} else {
				System.out.println("Please enter the amount < " + bankamount);
				widtdraw();
			}
			return amount;
		}

		public void enQueue(int no, String name) {
			QNode n = new QNode();
			n.setNo(no);
			n.setName(name);
			n.setNext(rear);

			if (front == null) {
				front = n;
				rear = n;
				n.setNext(rear);
			} else {
				rear.setNext(n);
				rear = n;
				rear.setNext(null);
			}

			size++;
			System.out.println("user " + rear.getNo() + " :" + rear.getName() + " has added.......please next!!!! ");
		}

		public void dequeue() {
			if (front == null) {
				System.out.println("Queue is Empty");
			} else {
				QNode t;
				t = front;
				System.out.println("Enter the user " + t.getNo() + " choice :");
				System.out.println("1. Deposit :");
				System.out.println("2. Widthrow : ");
				int ch = sc.nextInt();
				switch (ch) {
				case 1:
					deposit();
					front = front.getNext();
					System.out.println("please next!!!! ");
					size--;
					System.out.println("Amount is : " + bankamount);
					break;
				case 2:
					if (widtdraw() > 0) {
						front = front.getNext();
						size--;
						System.out.println("Amount is : " + bankamount);
						System.out.println("please next!!!! ");
					} else {
						System.out.println("Not Have enough cash..Please Deposit First....!!!!!!:");
					}
					break;
				default:
					System.out.println("Enter valid  choice :");
				}
			}

		}

		public int getSize() {
			return size;

		}

		public void show() {
			QNode t;
			t = front;
			if (front == null) {
				System.out.println("Queue is Empty");
			} else {
				System.out.println("Next User is : " + front.getName());

				System.out.println("User List .................");

				while (t != rear) {
					System.out.println(" User " + t.getNo() + " : " + t.getName());
					t = t.getNext();
				}
				System.out.println(" User " + t.getNo() + " : " + t.getName());
			}
		}

	}

	// DeQueue logic for Palindrome Checker
	// Nested class For Deque
	public static class DequeueLogic<E> {
		public static int size = 0;
		public Node<E> front, rear;

		public void show() throws InterruptedException {
			Node<E> t;
			t = front;
			while (t.getNext() != null) {
				Thread.sleep(600);
				System.out.print(" " + t.getdata());
				t = t.getNext();
			}
			Thread.sleep(600);
			System.out.println(" " + t.getdata());

		}

		public void addRear(E c) {
			Node<E> n = new Node<E>();
			n.setdata(c);
			n.setNext(null);
			if (front == null) {
				front = n;
				rear = n;
				rear.setNext(null);
			} else {
				rear.setNext(n);
				rear = n;
				rear.setNext(null);
			}
			size++;

		}

		public boolean palindromchecker() {
			Node<E> t1, t2;
			t1 = front;
			t2 = front;
			int i, j, k, flag = 0;

			// Iterate i and j for moving t1 forword and t2 backword
			for (i = 1, j = size; i < j; i++, j--) {
				for (k = 1; k < j; k++) {
					t2 = t2.getNext();
				}

				// After reaching t2 at j'th POsition it conpeare t1 and t2 data ,
				// its like , it compare frist and last character if same the flag set 1
				// otherwise it break , means String is nOt Palindrom.

				if (t1.getdata() == t2.getdata()) {
					flag = 1;
				} else {
					flag = 0;
					break;
				}
				t1 = t1.getNext();
				t2 = front;
			}

			System.out.println("flag == :" + flag);

			if (flag == 1) {
				return true;
			} else {
				return false;
			}

		}

	}

	// Prime and anagram using Stack with LinkedList
	// Nested Class using Stack linkedList # this class also Used for Calendar using
	// Stack using linkedlist -
	public static class StackLinkedList<E> {
		public static int size;
		private Node<E> top;
		private Weekday wd;

		public StackLinkedList() {
			size = 0;
			top = null;
		}

		public void push(E data) {
			// TODO Auto-generated method stub
			Node<E> n = new Node<E>();
			n.setdata(data);
			n.setNext(top);

			if (top == null) {
				top = n;
			} else {
				n.setNext(top);
				top = n;

			}
			size++;
		}

		public void show() {
			Node<E> t;
			t = top;
			while (t != null) {
				System.out.print(t.getdata() + "==>");
				t = t.getNext();
			}

		}

		public int getSize() {
			// TODO Auto-generated method stub
			return size;
		}

		public void showReverse() {
			Node<E> t;
			t = top;
			int i, j;
			for (i = size; i > 0; i--) {
				for (j = 1; j < i; j++) {
					t = t.getNext();
				}
				System.out.print(t.getdata() + "==>");
				t = top;
			}
		}

		public Weekday pop() {
			if (top != null) {
				wd = (Weekday) top.getdata();
				top = top.getNext();
				size--;
				return wd;
			} else {
				return null;
			}

		}
	}

	// Reverse the Array
	public static String[] reverseArray(String[] monthData) {
		String rev[] = new String[monthData.length];
		int i, j;
		j = monthData.length - 1;
		for (i = 0; i < monthData.length; i++) {
			rev[i] = monthData[j];
			j--;
		}
		return rev;
	}

	public static boolean isAnagramPrime(int n, int[] prime) {
		int rev = reverser(n);
		int flag = 0;

		if (rev > 9 && n != rev) {
			for (int i = 0; i < prime.length; i++) {
				if (prime[i] != 0) {
					if (rev == prime[i]) {
						flag = 1;
						break;
					}

				}
			}
		}

		if (flag == 1) {
			return true;
		} else {
			return false;
		}

	}

	private static int reverser(int num) {
		int rem, rev = 0;
		while (num > 0) {
			rem = num % 10;
			rev = rem + (rev * 10);
			num = num / 10;
		}
		return rev;
	}

	// Nested class using Queue Linkedlist
	public static class QueueLinkedList<E> {
		private int size;
		private Node<E> front, rear;

		public QueueLinkedList() {
			size = 0;
			front = rear = null;
		}

		public int getSize() {
			return size;
		}

		public void addToRear(E data) {
			Node<E> n = new Node<E>();
			n.setdata(data);
			n.setNext(rear);

			if (front == null) {
				front = n;
				rear = n;
				rear.setNext(null);
			} else {
				rear.setNext(n);
				rear = n;
			}
			size++;
		}

		public void show() {
			Node<E> t;
			t = front;
			while (t != rear) {
				System.out.print(t.getdata() + "--->");
				t = t.getNext();
			}
		}

	}

	// ******************** Calender Programs ***************//

	// To get Day number 0 - 6
	public static int getDayNumber(int d, int m, int y) {
		int year, month, day, x;
		year = y - (14 - m) / 12;
		x = year + year / 4 - year / 100 + year / 400;
		month = m + 12 * ((14 - m) / 12) - 2;
		day = (d + x + 31 * month / 12) % 7;

		return day;
	}

	// To check Year is Leaf or Not
	public static boolean isLeaf(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}

		} else {
			return false;
		}

	}

	// To get Corresponding month
	public static String[] getMonthData(int month, int year) {
		String nonleaf[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
				"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28" };
		// if nonleaf 28 dates of month

		String leaf[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17",
				"18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29" };
		// if leaf year 29 dates of month

		String month_30[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
				"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" };

		String month_31[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
				"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			return month_31;
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			return month_30;
		} else {

			if ((month == 2) && isLeaf(year)) {
				return leaf;
			} else {
				return nonleaf;
			}
		}
	}

	// Static class Queue with LinkedList for Calender
	public static class QueLinkedList<E> {
		public E weekday;
		public Node<E> start;
		int c = 0;
		Weekday wd = null;

		public QueLinkedList() {
			weekday = null;
			start = null;

		}

		public void add(E wd) {
			Node<E> n = new Node<E>();

			n.setdata(wd);
			n.setNext(start);

			if (start == null) {
				start = n;
			} else {
				Node<E> t;
				t = start;
				while (t.getNext() != null) {
					t = t.getNext();
				}
				t.setNext(n);
				n.setNext(null);
			}
		}

		public Weekday remove() {
			if (start != null) {
				wd = (Weekday) start.getdata();
				start = start.getNext();
				return wd;
			} else {
				return null;
			}
		}

	}

	public static int[] getPrimeData(int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void writeToFile(String filepath, String[] lldata) {
		file = new File(filepath);
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			for(int i=0;i<lldata.length;i++)
			{
				bw.write(lldata[i]+" ");
			}
			System.out.println("File written Successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
