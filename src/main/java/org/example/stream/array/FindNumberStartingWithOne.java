package org.example.stream.array;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class FindNumberStartingWithOne {

    public static void main(String[] args) {

        int[] arr = {10,8,49,25,15,98,32};
        findNumberStartWithOne(arr);

    }
    public static void findNumberStartWithOne(int[] arr){
         Arrays.stream(arr)
                 .mapToObj(num->num+"")
//                 .peek(e-> System.out.println("present element: "+e))
                 .filter(str->str.startsWith("1"))
                 .forEach(e-> System.out.println(e));

    }
    public static void learning1(){
        // Arrays.stream(arr).filter(num->num/10==1).collect(Collectors.toList());

        //explanation:->
        //"Provided: Collector<Object, capture of ?, java.util.List<java.lang.Object>>" - This part of the error message is stating what type you actually provided.
        // It's saying that you provided a Collector with specific type arguments: <Object, capture of ?, java.util.List<java.lang.Object>>. The key issue here is that Object is too general, and it's not what's expected when collecting elements into a List<Integer>.
        //This resulted in the mismatch between the expected List<Integer> and the inferred List<Object>.


        //correction:->
        //Arrays.stream(arr).filter(num->num/10==1).boxed().collect(Collectors.toList());
    }
    public static void learning2(){

        //The Optional.of(arr2) part is perfectly fine because it's creating an Optional from an array,
        //and the array itself can contain null elements without causing a NullPointerException

        Object[] arr2 ={10,8,49,25,null,98,32};
        Optional<Object[]> first = Optional.of(arr2).stream().findFirst();
        System.out.println(Arrays.toString(first.get()));


        //it will throw nullPointerException
        Object[] arr3 =null;
        Optional<Object[]> first1 = Optional.of(arr3).stream().findFirst();
        System.out.println(first1);

        //following code will throw nullPointerException
        int[] arr4=null;
        Arrays.stream(arr4).findFirst();

        //following code will not throw nullPointerException rather than it will throw
        //NoSuchElementException:
        int[] arr5 ={};
        int firstElement = Arrays.stream(arr5)
                .findFirst()
                .getAsInt();  //here we are trying to get the integer which is not present
        System.out.println("first element: "+firstElement);

        //in the following code it will execute perfectly because we are not performing any
        //operation on the element present in optional
        int[] arr6 ={};
        OptionalInt optionalFirst = Arrays.stream(arr5)
                .findFirst();
        System.out.println("first element: "+optionalFirst);

        //if we stream array then in the stream we have int not Integer
        int[] arr7 = {10,8,49,25,15,98,32};
        Arrays.stream(arr7)
                .findFirst().stream().boxed().findFirst().get();

        //here it will throw exception and to avoid it we can use .orElse || .ifPresent
        int[] arr8 ={};
        Arrays.stream(arr8)
                .findFirst()
                .ifPresent(System.out::print);
    }
}
