/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapThucHanh;

/**
 *
 * @author PHUC AN
 */
import java.util.Arrays;
public class Tuan5_bai2 {
    public static void main(String[] args) 
    {
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length / 2; i++) 
        {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println("Mang dao nguoc: " + Arrays.toString(array));
    }
}
