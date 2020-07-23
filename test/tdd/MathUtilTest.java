/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import fu.util.MathUti;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class MathUtilTest {

    //class này muốn chạy thì nó có main() riêng, nhấn SHift-F6 để chạy
    //mỗi hàm trong class này sẽ biến main() //nhiều main() trong
    //1 class luôn, thì hàm cần phải kí hiệu/chỉ dẫn/anotation
    @Test
    public void testSuccessfullCases() {
        //test các tính huống tham số dựa vào hàm cần test
//        Assert.assertEquals(30, 40);
        Assert.assertEquals(1, MathUti.computeFactorial(0));
        Assert.assertEquals(1, MathUti.computeFactorial(1));
        Assert.assertEquals(2, MathUti.computeFactorial(2));
        Assert.assertEquals(6, MathUti.computeFactorial(3));
        Assert.assertEquals(24, MathUti.computeFactorial(4));
        Assert.assertEquals(120, MathUti.computeFactorial(5));

    }

    @Test(expected = IllegalArgumentException.class)
    public void testFailedCases() {
        //test các tính huống đầu vào cà chớn
        //điều gì xảy ra nếu người dùng mún tính cF(-5)
        //xin lỗi, tính ko dc, quăng ra msg chửi người dùng, đưa âm sao tính
        //ném ra 1 ngoại lệ/Exception bảo rằng: tham số đầu vào vớ vẩn, cà chớn
        //và ngoại lệ là 1 tính huống bất thường ko như dự định
        //và nó ko phải là 1 value để có thể so sánh dc
        //ko thể xài hàm assrtEquals()
        //ta phải xài chiêu khác
        MathUti.computeFactorial(-5);
    }
//hàm trả về màu đỏ do ko ném về ngoại lệ(nhập số âm)
    //hàm còn sai login, ko sai cú pháp, hàm cF()
    //nhưng cho dù viết kiểu cũ sout() bên main() hay assertE() benJUnit
    //thì code sai login /màu đỏ vẫn ko ngăn dc việc ta nhấn nút clean and build 
    //tức là vẫn ra file.jar, .war
    //điều này ko hay, ko tốt
    //JUNIT CÓ THỂ KẾT HƠP VỚI NGƯỜI KIẾN ĐỂ CẤM RA FILE.JAR, .WAR NẾU CODE CÒN
    //MÀU ĐỎ,  DISABLE NÚT BẤM CLEAN AND BUILD NẾU MÀU ĐỎ VẪN CÒN TRONG LÚC CHẠY
    //@TEST
    //HÃY NHỚ 2 CON SỐ: 10005 NETBEAN 5, 1204 NETBEANS 10 TRỞ LÊN
}
