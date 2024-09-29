/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapThucHanh;

/**
 *
 * @author PHUC AN
 */
public class Tuan5_bai4 {
    public static void main(String[] args) 
    {
        int[] array = {1, 5, 5, 5, 4, 3, 1};
        int maxCount = 0;
        int mostFrequent = array[0];

        for (int i = 0; i < array.length; i++) 
        {
            int count = 0;
            for (int j = 0; j < array.length; j++) 
                if (array[j] == array[i])            
                    count++;

            if (count > maxCount) 
            {
                maxCount = count;
                mostFrequent = array[i];
            }
        }

        System.out.println("Phần tử xuất hiện nhiều nhất là: " + mostFrequent);
    }
}
