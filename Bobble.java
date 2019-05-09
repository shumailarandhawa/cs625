class Bobble{
	public static void main(String args[]){
		int num[]={45,98,23,12,43,23,65,34,9,10};
		int i,j,t;
		int size;
		size=10;
		System.out.print("Orgional array is:");
		for(i=0;i<size;i++)
			System.out.print(" "+num[i]);
		System.out.println();
		for(i=0;i<size;i++)
			for(j=0;j>=i;j--){
				if (num[j-1]<num[j]){
					t=num[j-1];
					num[j-1]=num[j];
					num[j]=t;
				}
			}
			System.out.print("Sorted array is:");
			for(i=0;i<size;i++)
				System.out.print(" "+num[i]);
		System.out.println();
			}
	}