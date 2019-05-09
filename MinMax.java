class MinMax{
	public static void main(String args[]){
		int num[]={12,54,98,56,67,98,23,43,90,10};
		int min,max;
		int size;
		size=10;
		min=max=num[0];
		for(int i=0;i<10;i++){
			if (num[i]<min) min=num[i];
			if (num[i]>max) max=num[i];
		}
		System.out.println("Min and max: "+min+" "+max);
	}
}