package org.example.stream.array;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindNumberStartingWithOne {

    public static void main(String[] args) {

        int[] arr = {10,8,49,25,15,98,32};


        //"Provided: Collector<Object, capture of ?, java.util.List<java.lang.Object>>" - This part of the error message is stating what type you actually provided.
        // It's saying that you provided a Collector with specific type arguments: <Object, capture of ?, java.util.List<java.lang.Object>>. The key issue here is that Object is too general, and it's not what's expected when collecting elements into a List<Integer>.
        //This resulted in the mismatch between the expected List<Integer> and the inferred List<Object>.

//        Arrays.stream(arr).filter(num->num/10==1).collect(Collectors.toList());

//        Arrays.stream(arr).filter(num->num/10==1).boxed().collect(Collectors.toList());

//        Arrays.stream(arr).mapToObj(num->num+"").peek(e-> System.out.println("present element: "+e)).filter(str->str.startsWith("1")).forEach(e-> System.out.println(e));

        //here it will not throw null point exception because array is not null rather than it is empty
        int[] arr1 ={};
        Optional<int[]> first = Optional.of(arr1).stream().findFirst();
        System.out.println(Arrays.toString(first.get()));

        //here it will throw exception and to avoid it we can use .orElse || .ifPresent
//        int[] arr2 ={};
//        int firstElement = Arrays.stream(arr2)
//                .findFirst()
//                .getAsInt();
//        System.out.println("first element: "+firstElement);

                Arrays.stream(arr1)
                .findFirst()
                .ifPresent(System.out::print);


// 4.       if we stream array then in the stream we have int not integer

//                int firstElement = Arrays.stream(arr1)
//                .findFirst().stream().boxed().findFirst().get();




    }
}
