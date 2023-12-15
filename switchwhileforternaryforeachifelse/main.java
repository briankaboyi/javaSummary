class Main {

  public static void main(String[] args) {
    int num = 10;
    //Switch
    switch (num) {
      case 1:
        System.out.println("Switch " + num);
        break;
      case 2:
        System.out.println("Switch " + num);
        break;
      case 3:
        System.out.println("Switch " + num);
        break;
      case 4:
        System.out.println("Switch " + num);
        break;
      case 5:
        System.out.println("Switch " + num);
        break;
      case 6:
        System.out.println("Switch " + num);
        break;
      case 7:
        System.out.println("Switch " + num);
        break;
      case 8:
        System.out.println("Switch " + num);
        break;
      case 9:
        System.out.println("Switch " + num);
        break;
      case 10:
        System.out.println("Switch " + num);
        break;
    }
    //while
    while (num > 0) {
      System.out.println("while " + num);
      num--;
    }
    //for loop
    for (int i = 10; i > num; num++) {
      System.out.println("for " + num);
    }
    System.out.println(num + " current value");
    //if else
    if (num == 10) {
      System.out.println("num is equal to 10");
    } else {
      System.out.println("num is equal to " + num);
    }
    // ternary
    String result = (num == 10)
      ? "num is equal to 10"
      : "num is equal to " + num;
    System.out.println("ternary result = " + result);

    //for each
    int[] numArr = new int[num];
    for (int i = 0 ; i < num; i++) {
      numArr[i] = i+1;
    }
for (int i:numArr){
    System.out.println(i);
}
  }
}
