package variables;

class Variables{
    // variables are containers for storing data values
    public static void main (String[] args){
        int num = 1;
        final String word = "Hello";
        char letter = 'a';
        float point = 1.23f;// both float and double represent numbers with decimal points , double can hold up to 15 decimal points while float only holds 7 decimal points
        double dees = 1.23d;
        boolean isIt = true;

        // declaring variables means introducing a variable
        // initializing is giving the variable a value

        // final keyword is used when you dont want the value of a variable to be overwritenn
        System.out.println(word);
        //word = "world"; //throws an error because the final keyword was used on declaration of the variable word
        System.out.println(word);

    }
}