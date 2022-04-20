import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(21, 33, 22, 21, 45, 21);

        Map<Integer, Long> list = integerList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Set<Integer> integers = list.entrySet().stream().filter(s -> s.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toSet());
        integers.forEach(integer -> System.out.println(integer));


        A a =new A();
        a.display(null);
    }
}
    
    class A {

    public void display(Object o){
        System.out.println(o);
    }
    public void display(String o){
        System.out.println(o);
        }

    }
