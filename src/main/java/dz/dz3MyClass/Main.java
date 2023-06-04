package dz.dz3MyClass;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        LinkedList087<String> list = new LinkedList087<>();
        Iterator<String> iterator;
        list.add("первый элемент");
        list.add("второй элемент");
        list.add("третий элемент");
        list.add("четвертый элемент");
        list.add("первый элемент");
        list.add("первый элемент");
        list.add("первый элемент");
        list.add("первый элемент");
        for (String item: list) {
            System.out.println(item);
        }

        list.remove("первый элемент", false);
        System.out.println("\n__remove__");
        iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        list.remove("первый элемент", true);
        System.out.println("\n__remove__all");
        for (String item: list) {
            System.out.println(item);
        }
        System.out.printf("длина списка - %d\n",list.size());

        list.addFirst("новый элемент");
        System.out.println("\n--addFirst--");
        for (String item: list) {
            System.out.println(item);
        }

        System.out.println("\n--get--");
        System.out.println(list.get(2));
        System.out.println(list.get(-2));

        list.removeFirst();;
        System.out.println("\n--removeFirst--");
        for (String item: list) {
            System.out.println(item);
        }
        System.out.printf("длина списка - %d\n",list.size());

        list.removeLast();;
        System.out.println("\n--removeLast--");
        iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.printf("длина списка - %d\n",list.size());

        list.add("первый элемент");
        list.add("второй элемент");
        list.add("первый элемент");
        list.add("первый элемент");
        list.add("третий элемент");
        list.add("первый элемент");
        list.add("первый элемент");
        list.add("четвертый элемент");
        System.out.println("\n---пополнили список");
        for (String item: list) {
            System.out.println(item);
        }

        list.clear();;
        System.out.println("\n--clear--");
        iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.printf("длина списка - %d\n",list.size());

        System.out.println("есть значения в списке? - " + list.isEmpty());

        list.add("четвертый элемент");
        list.add("пятый элемент");
        list.add("шестой элемент");
        list.add("седьмой элемент");
        System.out.println("\n---пополнили список");
        for (String item: list) {
            System.out.println(item);
        }
        System.out.printf("длина списка - %d\n",list.size());
        System.out.println("есть значения в списке? - " + list.isEmpty());

        list.set(2, "элемент");
        System.out.println("\n--set--");


        iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
