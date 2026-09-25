package org.Tjokro;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <l>Run</l> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }

        //validList int avec size

System.out.println(twoSum());

        System.out.println(Anagram());

        System.out.println(Duplicate());

        System.out.println(fizzBuzz(15));
        System.out.println(decrease(20, 3));
        System.out.println(Parantheses("(}[}()"));

    }

//method two sum qui retourne un validList de int
    public static List<Integer> twoSum() {
        List<Integer> nums = List.of(2,7,11,15);

        Integer target = 9;

        //mutable validList avec. add
        List<Integer> outputList = new ArrayList<>();


//nested loops
        for(int i = 0; i < nums.size(); i++) {

            for(int j = i + 1; j < nums.size(); j++){

                if(nums.get(i) + nums.get(j) == target){
                    //add the index
                    //nums.get(i) = value
                    outputList.add(i);
                    outputList.add(j);
                }
            }
        }
        return outputList;
    }

public static boolean Anagram(){

      String s = "anagram";
      String t = "nagaram";

   char[] ArrayS =   s.toCharArray();
    char[] ArrayT =   t.toCharArray();

    Arrays.sort(ArrayS);
    Arrays.sort(ArrayT);

   if(!Arrays.equals(ArrayS, ArrayT)){

       return false;
   }
return true;

}


    public static boolean Duplicate(){
        int[] nums = {1,2,3,4, 5};

      for(int i = 0; i < nums.length; i++){

          for(int j = i + 1; j < nums.length; j++ ){

              if(nums[i] == nums[j]){return true;}
          }
      }
        return false;
    }


    public static List<String> fizzBuzz(int n) {
        // Write your code here

        List<String> validList = new ArrayList<>();

        for( int i = 0; i < n; i++ ){

            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
                validList.add("fizzbuzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
                validList.add("fizz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
                validList.add("buzz");
            }else{
                System.out.println(i);
                validList.add(String.valueOf(i));
            }



        };

return validList;

    }


    public static List<Integer> decrease(Integer d, Integer n ){

        List<Integer> nums = new ArrayList<>();

        for(int i = d; i >= n; i--){

            if(i > n){
                nums.add(i);
                i--;
            }


        }

        return nums;
    }


    public static List<Character> Parantheses(String s){

        List<Character> validList = new ArrayList<>();

       for(int i = 0; i < s.length(); i++){

           char l = s.charAt(i);

           if(l == '(' || l == '{'|| l == '['){
               validList.add(l);
           }else{

               if(validList.isEmpty()){
                   validList.add(l);
                   return validList;
               }
           }

           char lastOpened = validList.remove(validList.size() - 1);


           if (l == ')' && lastOpened != '(') validList.add(')');
           if (l == ']' && lastOpened != '[') validList.add(']');
           if (l == '}' && lastOpened != '{') validList.add('}');
       }


        return validList;
    }

}


