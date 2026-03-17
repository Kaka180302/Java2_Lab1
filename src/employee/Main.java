package employee;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

        ArrayList<Employee> ds = new ArrayList<>();

        FullTimeEmployee nv1 = new FullTimeEmployee("E01", "An", 1000, 200, 50);
        FullTimeEmployee nv2 = new FullTimeEmployee("E02", "Binh", 1200, 150, 30);

        PartTimeEmployee nv3 = new PartTimeEmployee("E03", "Cuong", 80, 10);
        PartTimeEmployee nv4 = new PartTimeEmployee("E04", "Dung", 60, 12);

        FullTimeEmployee nv5 = new FullTimeEmployee("E05", "Huy", 900, 100, 20);

        ds.add(nv1);
        ds.add(nv2);
        ds.add(nv3);
        ds.add(nv4);
        ds.add(nv5);

        System.out.println("Danh sach nhan vien:");

        for (int i = 0; i < ds.size(); i++) {
            Employee e = ds.get(i);
            System.out.println(e.toString() + " | Income = " + e.income());
        }

        Employee max = ds.get(0);

        for (int i = 1; i < ds.size(); i++) {
            if (ds.get(i).income() > max.income()) {
                max = ds.get(i);
            }
        }

        System.out.println("\nNhan vien co thu nhap cao nhat:");
        System.out.println(max.toString() + " | Income = " + max.income());
    }
}
