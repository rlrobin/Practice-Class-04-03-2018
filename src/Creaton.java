
public class Creaton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int list1[]={2,4,1};
int list2[]={9,2,3};
int list3[] = new int [list1.length];
	for (int i=0; i<=list1.length-1; i++)
	{
		list3[i]= list1[i]+list2[i];
		System.out.println(list3[i]);
	}
	

	}

}
