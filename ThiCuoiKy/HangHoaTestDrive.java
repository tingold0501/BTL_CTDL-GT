package ThiCuoiKy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HangHoaTestDrive {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String nN1 = "20/12/2021";
        Date ngayNhap = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        ListHangHoa listHangHoa = new ListHangHoa();
        listHangHoa.DuLieuMacDinh();
        int yn;
        do{
            System.out.println("===========================MENU===========================");
            System.out.println("=1====================Thêm Hàng Hoá=======================");
            System.out.println("=2=====================Xoá Hàng Hoá=======================");
            System.out.println("=3=====================Sửa Hàng Hoá=======================");
            System.out.println("=4===================Sắp Xếp Hàng Hoá=====================");
            System.out.println("=5==================Thống Kê Hàng Hoá=====================");
            System.out.println("=6===============Xem Danh Sách Hàng Hoá===================");
            System.out.println("=7==================Tìm Kiếm Hàng Hoá=====================");
            System.out.println("Mời Nhập Lựa Chọn:");
            int lc = sc.nextInt();
            switch(lc)
            {
                case 1:
                String loaiHh = null;
                sc.nextLine();
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
                HangHoa hangHoa1 = new HangHoa(soLuong, ten, loaiHh, gia, ngayNhap);
                listHangHoa.ThemHangHoa(hangHoa1);
                    break;
                case 2:
                System.out.println("Nhâp ID Muốn Xoá:");
                int id1 = sc.nextInt();
                listHangHoa.XoaHangHoa(id1);
                    break;
                case 3:
                System.out.println("Nhập ID Cần Sửa:");
                int id = sc.nextInt();
                listHangHoa.SuaThongTin(id);
                    break;
                case 4:
                    System.out.println("Muốn Sắp Xếp [1: Tăng Dần];[2: Giảm Dần]; [3: Theo Ngày]");
                    int llll_ = sc.nextInt();
                    switch(llll_){
                        case 1:
                        listHangHoa.SapXepTangDan();
                        break;
                        case 2:
                        listHangHoa.SapXepGiamDan();
                        break;
                        case 3:
                        System.out.println("Nhập Loại Muốn Sắp Xếp: [1: Thực Phẩm]; [2: Sành Sứ]; [3: Điện Máy]");
                        int loaiInt = sc.nextInt();
                        System.out.println();
                        String loaString = null;
                        switch(loaiInt){
                            case 1: loaString = "Thực Phẩm";
                            break;
                            case 2: loaString = "Sành Sứ";
                            break;
                            case 3: loaString = "Điện Máy";
                            break;
                            default: System.out.println("Loại Không Hợp Lê!!!");
                            break;
                        }
                        Date dF = new Date();
                        Date dT = new Date();
                        System.out.println("Nhập Ngày Muốn Tìm: (Kết Quả Được Tính {Từ Khoảng... Đến Khoảng})");
                        sc.nextLine();
                        System.out.println("Từ Khoảng Ngày:");
                        try {
                            System.out.println("Nhập Có Định Dạng [dd/MM/yyyy]");
                            dF = df.parse(sc.nextLine());
                        } catch (Exception e) {
                            System.out.println("Ngày Không Hợp Lệ!!!!");
                        }
                        System.out.println("Đến Khoảng Ngày:");
                        try {
                            System.out.println("Nhập Có Định Dạng [dd/MM/yyyy]");
                            dT = df.parse(sc.nextLine());
                        } catch (Exception e) {
                            System.out.println("Ngày Không Hợp Lệ!!!!");
                        }
                        listHangHoa.SapXepTheoNgayVaLoai(dF, dT, loaString);
                        break;
                    }
                    break;
                case 5:
                listHangHoa.ThongKe();
                    break;
                case 6:
                listHangHoa.HienThiHangHoa();
                    break;
                case 7:
                System.out.println("Muốn Tìm Theo [1:Loại] ; [2:Ký Tự] ; [3:Giá] ; [4:Ngày]; [5: Mã Hàng]");
                int lll = sc.nextInt();
                switch(lll)
                {
                    case 1:
                    System.out.println("Nhập Loại Muốn Tìm [1: Thực Phẩm; 2: Sành Sứ; 3: Điện Máy]");
                    System.out.println("Nhập Loại Muốn Tìm:");
                    int l1 = sc.nextInt();
                    String ll = null;
                    switch(l1){
                        case 1: ll = "Thực Phẩm";
                        break;
                        case 2: ll = "Sành Sứ";
                        break;
                        case 3: ll = "Điện Máy";
                        break;
                        default: System.out.println("Loại Không Hợp Lệ!!");
                        break;
                    }
                    listHangHoa.TimKiemTheoLoai(ll);
                    break;
                        case 2:
                        sc.nextLine();
                        System.out.println("Nhập Từ Khoá Muốn Tìm:");
                        String kyTu = sc.nextLine();
                        listHangHoa.TimKiemTheoKyTu(kyTu);
                            break;
                        default:
                        System.out.println("Lựa Chọn Không Hợp Lệ!!!");
                        System.out.println("Vui Lòng Nhập Lại Lựa Chọn");
                        break;
                        case 3:
                        System.out.println("Nhập Giá Muốn Tìm: (Kết Quả Được Tính {Từ Khoảng... Đến Khoảng})");
                        System.out.println("Từ Khoảng:");
                        float gF = sc.nextFloat();
                        System.out.println("Đến Khoảng:");
                        float gT = sc.nextFloat();
                        listHangHoa.TimKiemTheoGia(gF, gT);
                        break;
                        case 4:
                        Date dF = new Date();
                        Date dT = new Date();
                        System.out.println("Nhập Ngày Muốn Tìm: (Kết Quả Được Tính {Từ Khoảng... Đến Khoảng})");
                        sc.nextLine();
                        System.out.println("Từ Khoảng Ngày:");
                        try {
                            System.out.println("Nhập Có Định Dạng [dd/MM/yyyy]");
                            dF = df.parse(sc.nextLine());
                        } catch (Exception e) {
                            System.out.println("Ngày Không Hợp Lệ!!!!");
                        }
                        System.out.println("Đến Khoảng Ngày:");
                        try {
                            System.out.println("Nhập Có Định Dạng [dd/MM/yyyy]");
                            dT = df.parse(sc.nextLine());
                        } catch (Exception e) {
                            System.out.println("Ngày Không Hợp Lệ!!!!");
                        }
                        listHangHoa.TimKiemTheoNgay(dF, dT);
                        break;
                        case 5:
                        System.out.println("Nhập Mã Cần Tìm:");
                        int id2 = sc.nextInt();
                        listHangHoa.TimKiemTheoMa(id2);
                        break;
                }
                break;
            }
            System.out.println("Tiếp Tục ??? [1:YES] [0:NO]");
            yn = sc.nextInt();
        }while(yn == 1);
    }
}
