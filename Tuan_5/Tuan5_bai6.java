/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapThucHanh;

/**
 *
 * @author PHUC AN
 */
import java.util.ArrayList;
import java.util.List;
public class Tuan5_bai6 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(2, 10); 
        System.out.println("Danh sach sau khi them:" + list);

        list.remove(3); 
        System.out.println("Danh sach sau khi xoa: " + list);
    }
}
