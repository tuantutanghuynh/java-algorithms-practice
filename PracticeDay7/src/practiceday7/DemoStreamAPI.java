/*
 * @author tangh
 */
package practiceday7;

import java.util.Arrays;
import java.util.List;

public class DemoStreamAPI {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
// trung gian: filter(), map(), sorted()...-> chưa chạy
//kết thúc: forEach(), collect(); count()....--> chạy
        list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 2)
                .forEach(System.out::println);
    }
}
