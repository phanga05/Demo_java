
package Tuan5;

import java.util.ArrayList;
import java.util.Scanner;

public class Tuan5Bai6 {
    private static Scanner sc = new Scanner(System.in);

    public static class Student {
        private String studentId;
        private String name;
        private float diem;

        public Student(String studentId, String name, float diem) {
            this.studentId = studentId;
            this.name = name;
            this.diem = diem;
        }

        public String getStudentId() {
            return studentId;
        }

        public void setStudentId(String studentId) {
            this.studentId = studentId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public float getDiem() {
            return diem;
        }

        public void setDiem(float diem) {
            this.diem = diem;
        }

        @Override
        public String toString() {
            return studentId + "\t | \t" + name + "\t | \t" + diem;
        }
    }

        public static void Nhap(ArrayList<Student> st, int x) {
            for (int i = 0; i < x; i++) {
                System.out.println("Nhập thông tin sinh viên thứ " + i);
                System.out.print("\t Msv: ");
                String studentId = sc.nextLine();
                System.out.print("\t Họ và tên: ");
                String name = sc.nextLine();
                System.out.print("\t Điểm TB: ");
                float diem = sc.nextFloat();
                sc.nextLine();
                
                Student student = new Student(studentId, name, diem);
                st.add(student);
            }
        }

        public static void Xuat(ArrayList<Student> st) {
            System.out.println("Danh sách sinh viên gồm có: ");
            System.out.println("\t Msv \t | \t Họ và tên \t | \t Điểm");
            for (Student student : st) {
                System.out.println("\t" + student);
            }
        }

        public static void Xoa(ArrayList<Student> st) {
            System.out.println("Bạn muốn xóa sinh viên ở vị trí nào");
            int y = sc.nextInt();
            sc.nextLine();
            
            if (y < 0 || y >= st.size())
                System.out.println("Vị trí bạn chọn không tồn tại!!!");
            else
                st.remove(y);
        }

        public static void ThayThe(ArrayList<Student> st) {
            System.out.println("Bạn muốn thay thế sinh viên có mã sinh viên là: ");
            int y = sc.nextInt();
            sc.nextLine();
            if (y < 0 || y >= st.size())
                System.out.println("Vị trí bạn chọn không tồn tại!!!");
            else {
                System.out.print("Nhập thông tin sinh viên mới: ");
                System.out.print("\t Msv: ");
                String studentId = sc.nextLine();
                System.out.print("\t Họ và tên: ");
                String name = sc.nextLine();
                System.out.print("\t Điểm TB: ");
                float diem = sc.nextFloat();
                sc.nextLine();

                Student student = new Student(studentId, name, diem);
                st.set(y, student);
            }
        }
        
        public static void Timkiem(ArrayList<Student> st, String idStudent) {
        	for (Student student : st) {
				if(student.getStudentId().equals(idStudent))
					System.out.println(student);
        	}
        }

    public static void main(String[] args) {
        ArrayList<Student> ListStudent = new ArrayList<>();
        System.out.println("Số sinh viên bạn muốn nhập là: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        Nhap(ListStudent, n);
        Xuat(ListStudent);
     	Xoa(ListStudent);
        ThayThe(ListStudent);
        System.out.print("Nhập mã sinh viên cần tìm: ");
        String searchId = sc.nextLine();
        Timkiem(ListStudent, searchId);
}
}

