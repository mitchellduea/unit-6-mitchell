import java.Util.Scanner;
public class FrequencyChart {
  //class stuff
private int[] list;

public FrequencyChart(int[] list){
  this.list = list;
}

//methods
public String makeChart(){

}

//helper methods

  //end class stuff

  //main method to make the FrequencyChart
  public static void main (String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("How many values in your data set");
    int sze = scan.nextInt();
    int[] data = new int[size];
    system.out.println("Enter data value one at a time, followed by enter");
    int val= 0;
    for (int i = 0; i < data.length; i++){
      val= scan.nextInt();
      data[i] = val;
    }
    FrequencyChart = new FrequencyChart(data);
    System.out.println(chart.makeChart());
  }
}
