import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*Реализовать 2 метода класса
Удалить все четные элементы из списка
Понять, что строка является числом,*/

public class HW3 {
            public static void main(String[] args) {
            List<String> strings = new ArrayList<>();
            strings.add("string");
            strings.add("40");
            strings.add("-5");
            strings.add("my_string");
            System.out.println(strings);
    
            }
        static void removeEvenNumber(List<Integer> numbers) {
        
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
        try {
        
        Integer.parseInt(element);
            iterator.remove();
        } 
        catch
        (NumberFormatException e) {
        System.out.println("не число");
        }
    }
    }	
}
