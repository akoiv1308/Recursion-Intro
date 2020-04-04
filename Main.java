class Main {

  public static void main(String[] args) {
    int num = 5;
    System.out.println("Recursive of " + num + " : " + recursive(num));
    System.out.println("Factorial of " + num + " : " + factorial(num));
  }

  public static int recursive(int num) {
    if(num == 0) {
      return 1;
    }
    else {
      return recursive(num - 1) + 4;
    }
  }

  public static int factorial(int num) {
    if(num == 1) {
      return 1;
    }
    else {
      return factorial(num - 1) * num;
    }
  }

}