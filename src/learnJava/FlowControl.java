package learnJava;

public class FlowControl {

	public static void main(String[] args){
//        int value1 = 1;
//        int value2 = 2;
//        int result;
//        boolean someCondition = true;
//        result = someCondition ? value2 : value1;
//        
//        System.out.println(result);
//		  int i = 10;
//		  int n = i++ % 5;
//		  System.out.println(i);
//		  System.out.println(n);
		  int cadence = 25;
		  boolean isMoving = false;
		  
		  if (isMoving) {
			cadence--;
			System.out.println(cadence);
		} else {
			System.err.println("cannot apply breaks when not in motion");
		}
    }

}
