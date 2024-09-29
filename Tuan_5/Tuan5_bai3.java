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
public class Tuan5_bai3 {
    public static void main(String[] args) 
    {
        int[] M = {5, 3, 1, 4, 2};
        for (int i = 0; i < M.length; i++)
            for(int j = 0; j < M.length-1;j++)
                if(M[j] > M[j+1])
                {
                    int temp = M[j];
                    M[j] = M[j+1];
                    M[j+1] = temp;
                }
        System.out.println("Sorted array: " + Arrays.toString(M));
    }
}
