/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practiceday7;

/**
 *
 * @author tangh
 */
public class DemoPatternMatching {
    public static void main(String[] args) {
        Object obj = "Hello";

        //k cần cast
        if (obj instanceof String s){
            System.out.println(s.length());
        }
    }
}

/*
 * PATTERN MATCHING (Java 16+):
 *
 * if (obj instanceof String s) {
 *   - Kiểm tra obj có phải String không
 *   - Nếu đúng: tự động gán obj vào biến s kiểu String (không cần cast)
 *   - Biến s chỉ tồn tại trong scope if
 *
 * Ưu điểm:
 *   ✓ Gọn gàng, dễ đọc
 *   ✓ Không cần cast thủ công như: String s = (String) obj;
 *   ✓ An toàn hơn, ít lỗi ClassCastException
 */
