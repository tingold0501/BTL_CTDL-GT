

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class ListHangHoa {
    private Node head, tail;
    HangHoa hangHoa = new HangHoa();
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    Date ngayNhap = new Date();
  
    
    Scanner sc = new Scanner(System.in);
    public ListHangHoa()
    {
        hangHoa.autoId = 1;
        this.head = null;
        this.tail = null;
    }
    public boolean isEmpty()
    {
        return this.head == null;
    }
    public void ThemHangHoa(HangHoa hangHoa)
    {
        if(isEmpty())
        {
            this.head = this.tail = new Node(hangHoa);
            return;
        }
        Node newNode = new Node(hangHoa);
        this.tail.setNext(newNode);
        this.tail = newNode;
    }
    public void DuLieuMacDinh(){
        try {
            String sDate1 = "20/12/2021";  
            String sDate2 = "12/12/2021";  
            String sDate3 = "10/12/2021";  
            String sDate4 = "19/12/2021";  
            String sDate5 = "21/12/2021";  
            String sDate6 = "01/12/2021";  
            SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");  
            Date date1=formatter1.parse(sDate1);  
            Date date2=formatter1.parse(sDate2);  
            Date date3=formatter1.parse(sDate3);  
            Date date4=formatter1.parse(sDate4);  
            Date date5=formatter1.parse(sDate5);  
            Date date6=formatter1.parse(sDate6); 
            HangHoa hangHoa1 = new HangHoa(1000, "bình hoa", "Sành Sứ", 200, date4);
            HangHoa hangHoa2 = new HangHoa(20000, "rau má", "Thực Phẩm", 5, date5);
            HangHoa hangHoa3 = new HangHoa(500, "loa", "Điện Máy", 500, date3);
            HangHoa hangHoa4 = new HangHoa(1500, "tivi", "Điện Máy", 1000, date3);
            HangHoa hangHoa5 = new HangHoa(1000, "rau thơm", "Thực Phẩm", 5, date2);
            HangHoa hangHoa6 = new HangHoa(1000, "rau dền", "Thực Phẩm", 3, date5);
            HangHoa hangHoa7 = new HangHoa(1000, "máy lạnh", "Điện Máy", 15000, date4);
            HangHoa hangHoa8 = new HangHoa(1000, "mỳ gói", "Thực Phẩm", 6, date1);
            HangHoa hangHoa9 = new HangHoa(1000, "dĩa sứ", "Sành Sứ", 15, date3);
            HangHoa hangHoa10 = new HangHoa(1000, "máy nước nóng", "Điện Máy", 2000, date5);
            HangHoa hangHoa11 = new HangHoa(1000, "chén sứ", "Sành Sứ", 10, date1);
            HangHoa hangHoa12 = new HangHoa(1000, "cá thu", "Thực Phẩm", 20, date3);
            HangHoa hangHoa13 = new HangHoa(1000, "cá bóp", "Thực Phẩm", 70, date2);
            HangHoa hangHoa14 = new HangHoa(1000, "chậu nước", "Sành Sứ", 90, date4);
            HangHoa hangHoa15 = new HangHoa(1000, "thịt ba chỉ", "Thực Phẩm", 25, date1);
            HangHoa hangHoa16 = new HangHoa(1000, "sửa tươi", "Thực Phẩm", 60, date4);
            HangHoa hangHoa17 = new HangHoa(1000, "vòi sen", "Điện Máy", 165, date2);
            HangHoa hangHoa18 = new HangHoa(1000, "nồi đất", "Sành Sứ", 75, date6);
            HangHoa hangHoa19 = new HangHoa(1000, "máy giặc", "Điện Máy", 20000, date3);
            HangHoa hangHoa20 = new HangHoa(1000, "máy xấy", "Điện Máy", 21000, date5);
            ThemHangHoa(hangHoa1);
            ThemHangHoa(hangHoa2);
            ThemHangHoa(hangHoa3);
            ThemHangHoa(hangHoa4);
            ThemHangHoa(hangHoa5);
            ThemHangHoa(hangHoa6);
            ThemHangHoa(hangHoa7);
            ThemHangHoa(hangHoa8);
            ThemHangHoa(hangHoa9);
            ThemHangHoa(hangHoa10);
            ThemHangHoa(hangHoa11);
            ThemHangHoa(hangHoa12);
            ThemHangHoa(hangHoa13);
            ThemHangHoa(hangHoa14);
            ThemHangHoa(hangHoa15);
            ThemHangHoa(hangHoa16);
            ThemHangHoa(hangHoa17);
            ThemHangHoa(hangHoa18);
            ThemHangHoa(hangHoa19);
            ThemHangHoa(hangHoa20);
        } catch (Exception e) {
            e.getCause();
        }
    }
    public void HienThiHangHoa()
    {
        System.out.println("===================================================THÔNG TIN HÀNG HOÁ==========================================");
        System.out.printf("%-20S %-20S %-20S %-20S %-20S %-20S\n", "mã hàng", "tên hàng", "số lượng", "giá hàng", "loại hàng", "ngày nhập kho");
        Node node = this.head;
        while(node != null){
            System.out.printf("%-20d %-20S %-15d %-7.3fVNĐ %20S %20S\n",
             node.getHangHoa().iD, node.getHangHoa().tenHangHoa, node.getHangHoa().soLuong, node.getHangHoa().giaHang, 
             node.getHangHoa().getLoai(),df.format(node.getHangHoa().ngayNhap)); 
            node = node.getNext();
        }
    }
    public boolean TimKiemTheoKyTu(String kyTu)
    {
        System.out.println("===================================================THÔNG TIN HÀNG HOÁ==========================================");
        System.out.printf("%-20S %-20S %-20S %-20S %-20S %-20S\n", "mã hàng", "tên hàng", "số lượng", "giá hàng", "loại hàng", "ngày nhập kho");
        boolean isFound = false;
        Node node = this.head;
        while(node != null)
        {
            if(node.getHangHoa().getTenHangHoa().contains(kyTu))
            {
                System.out.printf("%-20d %-20S %-15d %-7.3fVNĐ %20S %20S\n", 
                node.getHangHoa().iD, node.getHangHoa().tenHangHoa, node.getHangHoa().soLuong, 
                node.getHangHoa().giaHang, node.getHangHoa().getLoai(),df.format(node.getHangHoa().ngayNhap)); 
                isFound = true;
            }
            node = node.getNext();
        }
        if(!isFound)
        {
            System.out.println("Ký Tự Muốn Tìm Không Hợp Lệ!!!");
            return false;
        }
        return true;
    }
    public boolean TimKiemTheoLoai(String l){
        System.out.println("===================================================THÔNG TIN HÀNG HOÁ==========================================");
        System.out.printf("%-20S %-20S %-20S %-20S %-20S %-20S\n", "mã hàng", "tên hàng", "số lượng", "giá hàng", "loại hàng", "ngày nhập kho");
        boolean isFound = false;
        Node node = this.head;
        while(node != null)
        {
            if(node.getHangHoa().getLoai().contains(l))
            {
                System.out.printf("%-20d %-20S %-15d %-7.3fVNĐ %20S %20S\n", 
                node.getHangHoa().iD, node.getHangHoa().tenHangHoa, node.getHangHoa().soLuong, 
                node.getHangHoa().giaHang, node.getHangHoa().getLoai(),df.format(node.getHangHoa().ngayNhap)); 
                isFound = true;
            }
            node = node.getNext();
        }
        if(!isFound)
        {
            System.out.println("Loại Muốn Tìm Không Hợp Lệ!!!");
            return false;
        }
        return true;
    }
    public boolean TimKiemTheoGia(float gF, float gT){
        System.out.println("===================================================THÔNG TIN HÀNG HOÁ==========================================");
        System.out.printf("%-20S %-20S %-20S %-20S %-20S %-20S\n", "mã hàng", "tên hàng", "số lượng", "giá hàng", "loại hàng", "ngày nhập kho");
        boolean isFound = false;
        Node node = this.head;
        while(node != null)
        {
            if(node.getHangHoa().getGiaHang() >= gF && node.getHangHoa().getGiaHang() <= gT)
            {
                System.out.printf("%-20d %-20S %-15d %-7.3fVNĐ %20S %20S\n", 
                node.getHangHoa().iD, node.getHangHoa().tenHangHoa, node.getHangHoa().soLuong, 
                node.getHangHoa().giaHang, node.getHangHoa().getLoai(),df.format(node.getHangHoa().ngayNhap)); 
                isFound = true;
            }
            node = node.getNext();
        }
        if(!isFound)
        {
            System.out.println("Giá Muốn Tìm Không Hợp Lệ!!!");
            return false;
        }
        return true;
    }
    public boolean TimKiemTheoNgay(Date dF, Date dT){
        System.out.println("===================================================THÔNG TIN HÀNG HOÁ==========================================");
        System.out.printf("%-20S %-20S %-20S %-20S %-20S %-20S\n", "mã hàng", "tên hàng", "số lượng", "giá hàng", "loại hàng", "ngày nhập kho");
        boolean isFound = false;
        Node node = this.head;
        while(node != null)
        {
            if(node.getHangHoa().getNgayNhap().after(dF) && node.getHangHoa().getNgayNhap().before(dT))
            {
                System.out.printf("%-20d %-20S %-15d %-7.3fVNĐ %20S %20S\n", 
                node.getHangHoa().iD, node.getHangHoa().tenHangHoa, 
                node.getHangHoa().soLuong, node.getHangHoa().giaHang, node.getHangHoa().getLoai(),df.format(node.getHangHoa().ngayNhap)); 
                isFound = true;
            }
            node = node.getNext();
        }
        if(!isFound)
        {
            System.out.println("Ngày Muốn Tìm Không Hợp Lệ!!!");
            return false;
        }
        return true;
    }
    public boolean SapXepTheoNgayVaLoai(Date dF, Date dT , String loaString){
        System.out.println("===================================================THÔNG TIN HÀNG HOÁ==========================================");
        System.out.printf("%-20S %-20S %-20S %-20S %-20S %-20S\n", "mã hàng", "tên hàng", "số lượng", "giá hàng", "loại hàng", "ngày nhập kho");
        boolean isFound = false;
        Node node = this.head;
        while(node != null)
        {
            if(node.getHangHoa().getNgayNhap().after(dF) && node.getHangHoa().getNgayNhap().before(dT) && node.getHangHoa().getLoai().equals(loaString))
            {
                SapXepTheoNgay();
                System.out.printf("%-20d %-20S %-15d %-7.3fVNĐ %20S %20S\n", node.getHangHoa().iD, node.getHangHoa().tenHangHoa, node.getHangHoa().soLuong, node.getHangHoa().giaHang, node.getHangHoa().getLoai(),df.format(node.getHangHoa().ngayNhap)); 
                isFound = true;
            }
            node = node.getNext();
        }
        if(!isFound)
        {
            System.out.println("Ngày Muốn Tìm Không Hợp Lệ!!!");
            return false;
        }
        return true;
    }
    public boolean TimKiemTheoMa(int id){
        System.out.println("===================================================THÔNG TIN HÀNG HOÁ==========================================");
        System.out.printf("%-20S %-20S %-20S %-20S %-20S %-20S\n", "mã hàng", "tên hàng", "số lượng", "giá hàng", "loại hàng", "ngày nhập kho");
        boolean isFound = false;
        Node node = this.head;
        while(node != null)
        {
            if(node.getHangHoa().getiD() == id)
            {
                System.out.printf("%-20d %-20S %-15d %-7.3fVNĐ %20S %20S\n",
                node.getHangHoa().iD, node.getHangHoa().tenHangHoa, node.getHangHoa().soLuong, 
                node.getHangHoa().giaHang, node.getHangHoa().getLoai(),df.format(node.getHangHoa().ngayNhap)); 
                isFound = true;
            }
            node = node.getNext();
        }
        if(!isFound)
        {
            System.out.println("Mã Muốn Tìm Không Hợp Lệ!!!");
            return false;
        }
        return true;
    }
    public void SapXepTangDan(){
        Node node = this.head, node2 = null;
        HangHoa tempHangHoa;
        if(head == null)
        return;
        else{
            while(node != null){
                node2 = node.next;
                while(node2 != null){
                    if(node.hangHoa.giaHang < node2.hangHoa.giaHang){
                        tempHangHoa = node.hangHoa;
                        node.hangHoa = node2.hangHoa;
                        node2.hangHoa = tempHangHoa;
                    }
                    node2 = node2.next;
                }
                node = node.next;
            }
        }
        HienThiHangHoa();
    }
    public void SapXepGiamDan(){
        Node node = this.head, node2 = null;
        HangHoa tempHangHoa;
        if(head == null)
        return;
        else{
            while(node != null){
                node2 = node.next;
                while(node2 != null){
                    if(node.hangHoa.giaHang > node2.hangHoa.giaHang){
                        tempHangHoa = node.hangHoa;
                        node.hangHoa = node2.hangHoa;
                        node2.hangHoa = tempHangHoa;
                    }
                    node2 = node2.next;
                }
                node = node.next;
            }
        }
        HienThiHangHoa();
    }
    public void ThongKe(){
        Node node = this.head;
        int sLtemp = 0;
        float gTtemp = 0;
        while(node != null){
            sLtemp += node.getHangHoa().getSoLuong();
            gTtemp += node.getHangHoa().getGiaHang();
            node = node.getNext();
        }
        System.out.println("=================BẢNG THỐNG KÊ====================");
        System.out.printf("%-30S %-30S\n", "tổng số lượng", "tổng giá trị");
        System.out.printf("%-30d %-15.3fVNĐ\n", sLtemp, gTtemp);
    }
    
    public void SapXepTheoNgay( ){
        Node node = this.head, node2 = null;
        HangHoa tempHangHoa;
        if(head == null)
        return;
        else{
            while(node != null){
                node2 = node.next;
                while(node2 != null){
                    if(node.hangHoa.ngayNhap.before(node2.hangHoa.ngayNhap)){ 
                            tempHangHoa = node.hangHoa;
                            node.hangHoa = node2.hangHoa;
                            node2.hangHoa = tempHangHoa;       
                    }
                    node2 = node2.next;
                }
                node = node.next;
            }
        }
    }
    
    public boolean XoaHangHoa(int id)
    {
        Node node = this.head;
        if(this.head.getHangHoa().getiD() == id){
            this.head = this.head.getNext();
            System.out.println("Đã Xoá Đối Tượng Đầu Tiên!!");
            return true;
        }
        while(node != null)
        {
            if(node.getNext().getHangHoa().getiD() == id){
                node.setNext(node.getNext().getNext());
                System.out.println("Xoá Thành Công!!!");
                return true;
            }
            node = node.getNext();
        }
        System.out.println("Xoá Không Thành Công!!!");
        return false;
    }

    public boolean SuaThongTin(int id){
        Node node = this.head;
        while(node != null)
        {
            if(node.getHangHoa().getiD() == id)
            {
                String loaiHh = null;
                System.out.println("Nhập Tên Hàng:");
                String ten = sc.nextLine();
                System.out.println("Nhập Số Lượng:");
                int soLuong = sc.nextInt();
                System.out.println("Nhập Giá:");
                float gia = sc.nextFloat();
                System.out.println("Nhập Loại Hàng [1: Thực Phẩm; 2: Sành Sứ; 3: Điện Máy]");
                int l = sc.nextInt();
                switch(l)
                {
                    case 1: loaiHh = "Thực Phẩm";
                    break;
                    case 2: loaiHh = "Sành Sứ";
                    break;
                    case 3: loaiHh = "Điện Máy";
                    break;
                    default: System.out.println("Loại Không Hợp Lệ!!!");
                    break;
                }
                sc.nextLine();
                try {
                    System.out.println("Nhập Ngày Vào Kho [dd/MM/yyyy]");
                    ngayNhap = df.parse(sc.nextLine());
                } catch (Exception e) {
                    System.out.println("Ngày Không Hợp Lệ!!!!");
                }
                node.getHangHoa().setTenHangHoa(ten);
                node.getHangHoa().setSoLuong(soLuong);
                node.getHangHoa().setGiaHang(gia);
                node.getHangHoa().setLoai(loaiHh);
                node.getHangHoa().setNgayNhap(ngayNhap);
                return true;
            }
            node = node.getNext();
        }
        System.out.println("Không Thể Sửa!!!");
        return false;
    }

}
