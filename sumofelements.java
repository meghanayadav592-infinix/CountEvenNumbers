public class sumofelements {
        public static void main(String[] args) {
 int[] elements = {50,50,50,50,50 };
 int sum = 0;
 
 for(int i=0; i<elements.length; i++){
     sum = sum + elements[i];
 }
     double average = (double) sum / elements.length;

     System.out.println("AVERAGE: " + average);
     System.out.println("SUM: " + sum);

    }
}
