//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static int counter;
    protected int sum;
    public String name;

    public int add(int a, int b){
        sum = a + b;
        counter++;
        return sum;
    }

    protected int subtract(int a, int b){
        sum = a-b;
        counter++;
        return sum;
    }

    private void resetCalculator(){
        sum = 0;
        System.out.println("Calculator has been reset");
    }

    public void monthlyRest(){
        resetCalculator();
    }

    public void  showTotalCalculations(){
        System.out.println(counter);
    }

    public void showLastResult(){
        int sum = 100;
        System.out.println(this.sum);
    }


    public static void main(String[] args) {
        Main main = new Main();
        main.add(1,2);
        main.subtract(50,0);
        main.resetCalculator();
        main.add(10000,100000);
        main.monthlyRest();
        main.showTotalCalculations();
        main.subtract(200,150);
        main.showLastResult();
    }
}