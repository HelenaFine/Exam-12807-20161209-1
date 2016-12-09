import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exam_one {
	public static void main(String[] args) {
		int count=0;
		boolean k=true;
		Set set = new HashSet();
		for(int i=101;i<=200;i++){
			for(int j=2;j<i;j++){
			     k=true; 
				if(i%j==0){
				  k=false;
				  break;
				}
			}
			if(k==true){
			count++;
			set.add(i);
			}
		}
		System.out.print("10到200间一共有"+count+"个素数"+",");
		System.out.print("分别是："+set);
	}
}
