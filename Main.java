import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;



class Main {

  public static void main(String[] args) {

    Integer integerList[] = { 7, 8, 9, 10 ,11,12,13,14,15};

    

    List<String> stringList = fizzBuzzList(integerList);

    

    System.out.println(stringList);  


  }

  public static List<String> fizzBuzzList(Integer[] integerArray) {

    List<String> result = new ArrayList<>();

    for (Integer integer : integerArray) {

      if (integer % 3 == 0 && integer % 5 !=0) {

        result.add("Fizz");

 }else if (integer % 5 == 0 && integer % 3 != 0) {

        result.add("Buzz");

      }else if (integer % 15 == 0) {

        result.add("FizzBuzz");

      }else{

        result.add(integer.toString());

      }

    

      

    }

    return result;

  }

  

}