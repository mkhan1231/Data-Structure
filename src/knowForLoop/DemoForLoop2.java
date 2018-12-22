package knowForLoop;

public class DemoForLoop2 {

    public static void main(String[] args) {

        for(int i=1; i<10; i++){
            System.out.println("Enter your choice for the following multiple questions: ");
            System.out.print(i);
            for(int j=0; j<1; j++){
                System.out.print(" a.");
                System.out.print(" b.");
                System.out.print(" c.");
                System.out.print(" d.");
            }
            System.out.println();
        }
    }
}
