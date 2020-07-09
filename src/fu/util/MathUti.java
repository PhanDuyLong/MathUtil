/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fu.util;

/**
 *
 * @author HP
 */
//đây là class chứa các hàm tiện ích xài chung cho các nơi khác
//nó chứa các hàm tính toán khác bổ trợ cho các class khác
//do là đồ bổ trợ, xái chung, nên chúng là STATIC
public class MathUti {
    //hàm tính n!
    //vì tăng kết quả nhanh mà int chỉ tối đa 2 tỷ 1, phải để long đỡ tràn kết quả
    //mình chỉ nên tính n<=15, vì 20! to lắm
    public static long computeFactorial(int n){
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
