/*
Aiden Russo
11/26/22
I believe this deserves a 100 because it makes all the requirements
*/
public class SaleRusso 
 {
  public static void main(String[] args) {
    SaleRep e1 = new SaleRep(100000, 100, "Nathaniel Daniel"); // Nate D the hip hop star is a homie

    e1.addSale(8000);
    e1.addSale(2000);
    e1.addSale(900);
    e1.returnItem(1);
    e1.addSale(100000); // he felt determined after his first return
    System.out.println(e1);
    e1.getRaise(20);
    System.out.println(e1.toString());
    System.out.println("-------------------------------------------------------------------------");
    SaleRep e2 = new SaleRep(200, 20, "Zach Burnash");
    e2.addSale(50);
    e2.addSale(90);
    e2.addSale(20);
    e2.returnItem(150);
    e2.addSale(5); // Zach sucks at his job
    System.out.println(e2.toString());
    e2.getRaise(.5);
    System.out.println(e2);
    System.out.println(
        "---------------------------------------------------------------------------");
  }
}

class SaleRep {
  // instance variables
  double comissionRate;
  double sales;
  String fullname;
  double startingSalary;
  // constructor
  public SaleRep(double salary, double comissionRate, String fullname) {
    this.startingSalary = salary;
    this.comissionRate = comissionRate;
    this.fullname = fullname;
    this.sales = 0;
  }
  // getter methods
  public String getFullName() {
    return fullname;
  }

  public double getstartingSalary() {
    return startingSalary;
  }

  public double getCommissionRate() {
    return comissionRate;
  }

  // setter methods
  public void setSalary(double newSalary) {
    startingSalary = newSalary;
  }

  public void setFullname(String newFullname) {
    fullname = newFullname;
  }

  public void setComissionRate(double newComissionRate) {
    comissionRate = newComissionRate;
  }

  // calculate the total monthly pay by calculating the commission that the person recived
  public double paycheck() {
    return calcCommission() + startingSalary;
  }
  // calculates the commission
  public double calcCommission() {
    return sales * comissionRate / 100.0;
  }
  // this method is called every time the employee has a new sale
  public void addSale(double newSale) {
    sales += newSale;
  }
  // reducing the sale
  public void returnItem(double amountReturned) {
    sales -= amountReturned;
  }

  public void getRaise(double raiseRate) {
    startingSalary = startingSalary + startingSalary * raiseRate / 100;
  }
  // toString method// changed the format, I removed the new lines
  public String toString() {
    String s = " ";
    s = s + "\nFull name: " + fullname + "| ";
    s = s + "Starting salary: " + startingSalary + "| ";
    s = s + "Comission rate: " + comissionRate + " | ";
    s = s + "Sales amount: " + sales + "| ";
    s = s + "pay check: " + paycheck();
    s = s + "\nThe commission you made: " + getCommissionRate();
    s = s + "\nTotal paid this month: " + paycheck();

    return s;
  }
}
