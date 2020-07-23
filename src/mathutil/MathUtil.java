/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathutil;

import static fu.util.MathUti.computeFactorial;

/**
 *
 * @author HP
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("5! = " + computeFactorial(5));
        
        //khi ta viết code xong, ta/dev phải test xem hàm/class/app chạy có
        //đúng ko, việc này gọi là UnitTest, test mức hàm, mức class, mức đvi
        //test - cách đưa data vào hàm, class, chạy hàm, xem kết quả trả về
        //(actual value) rồi ra so kết quả trả về có đúng như ta đả mong
        //đợi /tính toàn trước đó, mong đợi: expected value
        //nếu actual - expected hàm chạy đúng/xử lí đúng như mong đợi
        //nếu ko bằng, hàm sai rồi, hoặc ta mong đợi sai
        //trong main() ta sout() kết quả actual so sánh với mong đợi expected
        //việc này gọi là kiểm thử bằng mắt, tự dùng mắt so sánh và luận kq
        
        //expected: 1, tao hy vọng hàm này xuất ra màn hình con số 1
        //nếu khi chạy mày ko in ra 1 mà in ra 10(ví dụ), 10 dc gọi là actual
        System.out.println("1! = " + computeFactorial(1));
        
        //expected: 1; hy vọng hàm tính 01 sẽ là 1, thực tế(actual) phải ra dc
        System.out.println("01! = " + computeFactorial(01));
        //expected: 2
        System.out.println("2! = " + computeFactorial(2));
        //expected: 6
        System.out.println("6! = " + computeFactorial(3));
        //expected: chửi cà chớn nếu đưa vào cà chớn
        System.out.println("-5! = " + computeFactorial(-5));
        
        
    }
    //cách test = mắt có rủi ro nhỏ: tự so sánh data, luận, nhiều kq quá
    //dễ bị rối mắt và sai sót
    //trong giang hồ người ta độ ra 1 kĩ thuật để test app/hàm chạy có đúng ko
    //bằng cách: gọi hàm với data đưa vào, lấy kq server tự so sánh luôn với
    //expected, nếu đúng, khớp , bằng, in ra màu xanh
    //              sai, lệch, ko bằng, in ra màu đỏ
    //quan trọng hơn
    //nếu gọi nhiều hàm, goi nhiều lần như đoạn code trên thì
    //XANH: TẤT CẢ MÀU XANH
    //ĐỎ : TRONG ĐÁM BỊ ĐỎ, COI NHƯ CẢ ĐÁM ĐỎ
    //màu xanh: khớp giữa expected và value, do đó nếu có 1 cái không khớp
    //màu đỏ -> chứng minh 1 điều hàm lúc đúng lúc sai -> ko tốt
    //để làm điều này ta cần 1 đồ chơi/thư viện phụ trợ
    //để nó tự so sánh  giữa expected vs actual, in ra màu sắc
    //thư viện này là: JUnit, TestNG(java)
    //                  xUnit, NUnit, MSUnit (C#)
    //                  PHPUnit
    //                  CPUnit
    //                  ...
    //.jar, .dll, ...
}
