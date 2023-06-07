import ra.model.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Khởi tạo mảng student có 100 phần tử
        Student[] listStudents = new Student[100];
        int choice;
        // tạo menu
        while (true) {
            System.out.println(
                    "1. Hiển thị danh sách tất cả học sinh\n" +
                            "2. Thêm mới học sinh\n" +
                            "3. Sửa thông tin học sinh dựa vào mã học sinh\n" +
                            "4. Xoá học sinh\n" +
                            "5. Thoát"
            );
            choice = Integer.parseInt(sc.nextLine());
            // điều hướng lựa chọn theo menu chức năng
            switch (choice) {
                case 1:
                    // hiển thị danh sách tất cả học sinh
                    displayListStudent(listStudents);
                    break;
                case 2:
                    addNewStudent(listStudents,sc);
                    // thêm mơi 1 học sinh
                    break;
                case 3:
                    // sửa thông tin dự theo mã học sinh
                    editStudent(listStudents,sc);
                    break;
                case 4:
                    deleteStuent(listStudents,sc);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Choice must be 1 to 5");
            }

        }
    }
    // hiển thị danh sách
    public static void displayListStudent(Student[] list){
        for (Student stu: list) {
            if (stu!=null) {
                stu.displayData();
            }
        }
    }

    // thêm mới
    public  static  void addNewStudent(Student[] list, Scanner sc){
        Student newStudent = new Student();
        newStudent.inputData(sc);
        boolean flag = true;
        for (int i = 0; i <list.length ; i++) {
            if(list[i] == null){
                flag = false;
                list[i] = newStudent;
                break;
            }
        }
        if(flag){
            System.err.println("Mảng đã đầy");
        }else {
            System.out.println("thêm mới thành công");
        }
    }
    public static void editStudent(Student[] list, Scanner sc){
        System.out.print("enter studentid to edit");
        int idEdit = Integer.parseInt(sc.nextLine());
        boolean flag = true;
        for (int i = 0; i < list.length; i++) {
            // kiểm tra nếu phần tử null thì bỏ qua phần tử đấy
            if (list[i]==null) {
                continue;
            }
            if(list[i].getStudentId() == idEdit){
                flag = false;
                // tiến hành update lại thông tin
                System.out.println("Enter new name ["+list[i].getStudentName()+"]");
                list[i].setStudentName(sc.nextLine());
                System.out.print("enter new age ["+list[i].getAge()+"]");
                list[i].setAge(Integer.parseInt(sc.nextLine()));
                System.out.print("enter new sex ["+(list[i].isSex()?"Nam":"Nu")+"]");
                list[i].setSex(Boolean.parseBoolean(sc.nextLine()));
                System.out.print("enter new address ["+list[i].getAddress()+"]");
                list[i].setAddress(sc.nextLine());
                System.out.print("enter new phone number ["+list[i].getPhoneNumber()+"]");
                list[i].setPhoneNumber(sc.nextLine());
                break;
            }
        }
        if (flag){
            System.err.println("Khong tim thay id");
        }else {
            System.out.println("Cap nhạt thanh cong");
        }

    }
    public static void deleteStuent(Student[] list, Scanner sc) {
        System.out.print("enter studentid to delete");
        int idDel = Integer.parseInt(sc.nextLine());
        boolean flag = true;
        for (int i = 0; i < list.length; i++) {
            // kiểm tra nếu phần tử null thì bỏ qua phần tử đấy
            if (list[i]==null) {
                continue;
            }
            if(list[i].getStudentId() == idDel){
                flag = false;
                // tiến hành xóa
                list[i] = null;
                break;
            }
        }
        if (flag){
            System.err.println("Khong tim thay id");
        }else {
            System.out.println("Xóa thanh cong");
        }
    }

}