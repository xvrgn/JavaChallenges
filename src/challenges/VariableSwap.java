package challenges;

public class VariableSwap {
  private int a;
  private int b;

  // constructor
  VariableSwap(int a, int b) {
      this.a = a;
      this.b = b;
  }

  // swapa variable using XOR
  public void swapVariable() {
      a = a ^ b;
      b = a ^ b;
      a = a ^ b;
  }

  // display variable
  public void displayVar() {
      System.out.println("variable 1: " +a +"\nvariable 2: " +b);
  }

  // setter
  public void setVariableOne(int a) {
      this.a = a;
  }

  // setter
  public void setVariableTwo(int b) {
      this.b = b;
  }

  // getter
    public int getVarOne() {
      return this.a;
    }

    // getter
    public int getVarTwo() {
      return this.b;
    }

}
