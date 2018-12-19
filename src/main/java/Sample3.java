import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Created by qiuzhanghua on 2017/2/7.
 */
public class Sample3 {
  public static void main(String[] args) throws IOException {
//old
      List<String> list = Arrays.asList("java", "scala", "python", "shell", "ruby");
      int num = 0;
      for(String lan: list) {
          if(lan.length() < 5) {
              num++;
          }
      }
      System.out.println(num);
//stream
      List<String> list1 = Arrays.asList("java", "scala", "python", "shell", "ruby");
      long num1 = list1.parallelStream().filter(x -> x.length() < 5).count();
      System.out.println(num1);
      list1.parallelStream().filter(x -> x.length() < 5).forEach(e -> System.out.println(e.toString()));
      list1.parallelStream().filter(x -> x.length() < 5).forEach(System.out::println);
      System.out.println(

      );
      System.out.println();
      System.out.println("1");
      System.out.println("2");
      System.out.println("3");
      System.out.println("4");
      System.out.println("5");
      System.out.println("6");
  }
}
