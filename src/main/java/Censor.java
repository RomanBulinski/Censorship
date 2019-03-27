import java.util.stream.Collectors;
import java.util.stream.Stream;

import static jdk.nashorn.internal.objects.NativeArray.reduce;

public class Censor {

//    Write a function that takes a string and replaces all the bad words with peeep. Do it using streams.

    public static void main(String[] args) {

        String inputText = "one two shit shit dupa";

        Stream longText = Stream.of("one two shit" );

        Stream.of( inputText.split(" "))
                .filter(word -> !word.equals("shit") )
                .map (elem -> new String(elem))
                .forEach(System.out::println);
//                .collect(Collectors.toList());

        Stream.of( inputText.split(" "))
                .map (elem -> elem.replaceAll("shit", "peeep"))
                .map (elem -> elem.replaceAll("dupa", "peeep"))
                .forEach(System.out::println);


//        Path path = Paths.get("c:\\demo.txt");
//        Stream <String> lines = Files.lines(path);
//        List <String> replaced = lines.map(line -> line.replaceAll("foo", "bar")).collect(Collectors.toList());
//        Files.write(path, replaced);
//        lines.close();

    }

}
