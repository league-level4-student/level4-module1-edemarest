package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T[] arr;
	public ArrayList() {
		arr = (T[]) new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		return arr[loc];
	}
	
	public void add(T val) {
		T[] arr2 = (T[]) new Object[arr.length+1];
		for(int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}
		arr2[arr2.length-1] = val;
		arr=arr2;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] arr2 = (T[]) new Object[arr.length+1];
		for(int i = 0; i < loc; i++) {
			arr2[i] = arr[i];
			System.out.println(arr2[i]);
		}
		arr2[loc] = val;
		System.out.println(arr2[loc]);
		for(int i = loc+1; i < arr2.length; i++) {
			arr2[i] = arr[i-1];
			System.out.println(arr2[i]);
		}
		arr = arr2;
		
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		arr[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] arr2 = (T[]) new Object[arr.length-1];
		for(int i = 0; i < loc; i++) {
			arr2[i] = arr[i];
		}
		for(int i = loc; i < arr2.length; i++) {
			arr2[i] = arr[i+1];
			
		}
		arr = arr2;
	}
	
	public boolean contains(T val) {
		for(int i = 0; i < arr.length; i++) {
			if(val.equals(arr[i])) {
				return true;
			}
		}
		return false;
	}

	public int size() {
		// TODO Auto-generated method stub
		return arr.length;
	}
}