package tasks.classwork.day9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

    public static void main(String[] args) {


        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");
        long y = list.stream().filter("мама"::equals).count();
        System.out.println(y);

        String str = list.stream().findFirst().orElse("мама");
        System.out.println(str);


        String str2 = list.stream().filter("мама"::equals).findFirst().get();
        System.out.println(str2);

        String str3 = list.stream().skip(4).findFirst().get();
        System.out.println(str3);

        System.out.println(list.stream().skip(2).limit(2).toArray());

        List<String> str5 = list.stream().filter(s -> s.contains("м")).distinct().collect(Collectors.toList());
        System.out.println(str5);
    }

}