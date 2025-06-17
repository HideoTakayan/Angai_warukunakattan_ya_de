# Group11_OOP_N02_term3_2025

#Group 11: OOP Term 3 2025 K17

# Thành viên:

1. Đỗ Như Minh Hiếu - 23010291;
2. Phan Minh Trúc - 23010818;
3. Triệu Tuấn Duy -23010449

## Tiêu đề : Quản lý đại học

##Link Readme giới thiệu project

Link: https://hideotakayan.github.io/Group11_OOP_N02_term3_2025/

# Đối tượng

## Đối tượng

class Student {
String studentId;
String name;
String dateOfBirth;
String gender;
}
class Lecturer {
String lecturerId;
String name;
String dateOfBirth;
String gender;
}
class Subject {
String subjectId;
String subjectName;
int credit;
String lecturerId;
List<String> studentIds;
}

class Grade {
String studentId;
String subjectId;
double score;
}

## Xây dựng ứng dụng Quản lý đại học ( University Management )

# Yêu cầu:

- Giao diện : Java Spring Boot.
- Chức năng chính:
  Thêm, sửa, xóa, truy vấn Môn học, Học sinh, Giảng viên.y
  Đăng kí môn học, gán môn học cho giảng viên phụ trách.
  Cập nhật và truy vấn điểm của sinh viên cho từng môn học.

# Cụ thể:

- Thêm, sửa, xóa Môn học ( Subject )

* Liệt kê thông tin về môn học, có thể lọc theo tên môn học ( SubjectName ) hoặc mã môn học ( SubjectId )
  -> Có chức năng quản lý môn học.

- Thêm, sửa, xóa Giảng viên ( Lecturer ).

* Liệt kê thông tin về giảng viên, có thể tìm kiểm giảng viên qua LecturerId.
  -> Có chức năng gán môn học cho giảng viên phụ trách

- Thêm, sửa, xóa Học sinh ( Student ).

* Liệt kê thông tin về học sinh, có thể tìm kiểm học sinh qua studentId.
  -> Có chức năng gán môn học cho sinh viên ( Sinh viên có thể đăng kí môn học )

- Thêm, sửa, xóa Lớp học(Grade).

* Tra cứu thông tin về môn học qua SubjectID, liệt kê các sinh viên trong lớp qua studentId.
  -> Có chức năng gán sinh viên, môn học cho lớp học.
* Dữ liệu được lưu trữ xuống file nhị phân

- Cần tạo các lớp liên quan đến " môn học ", " giảng viên ", " học sinh " để đọc, ghi xuống 1 hay nhiều file.

* Khi làm việc với dữ liệu trong bộ nhớ, dữ liệu cần được lưu trữ dưới dạng các Collection tùy chọn như ArrayList, LinkedList, Map, ....

* Truy vấn và cập nhật điểm của sinh viên của từng môn học.

Nội dung 02:

01 sơ đồ Class Diagram của bài tập lớn

- Sơ đồ Class Diagram:
- ![Untitledllll](https://github.com/user-attachments/assets/b6ddcb33-e368-4b1a-a1a5-7c7e37983b71)

Nội dung 03:

03 sơ đồ Behavioural Diagram của bài tập lớn

- Sequence Diagram ![Ảnh chụp màn hình 2025-05-20 113942](https://github.com/user-attachments/assets/ae52c239-d422-4f8f-9c4b-05a7d7ea7ccb)

# Các phương thức hiện có:
1. Phương thức đăng kí môn học.
2. Phương thức hiển thị,tìm kiếm Lịch thi
3. Phương thức tra cứu điểm, thông tin sinh viên thông qua mã sinh viên
# Lưu đồ phương thức đăng kí môn học ( Phương thức chính ):
![luudothuattoan](https://github.com/user-attachments/assets/4a3a7d8e-fbe3-446e-89c8-60d6e76fc119)
Quản lý đăng kí môn học: Cho phép sv đăng kí môn học, Kiểm tra xem học sinh đã đki được môn học hay chưa, Hủy đăng kí môn học
Phân chia công việc:
## Trần Tuấn Duy: Hoàn thành phương thức đăng kí môn học
## Phan Minh Trúc: Hoàn thành phương thức kiểm tra xem học sinh đã đăng kí môn học chưa.
## Đỗ Như Minh HIếu: Hoàn thành phương thức hủy đăng kí môn học

# Phương thức hủy đk môn học
## Trình bày ý tưởng phương thức hủy đăng kí môn học: Phương thức này được sử dụng khi học sinh muốn hủy đăng ký một môn học do đăng ký nhầm hoặc vì các lý do cá nhân khác, chẳng hạn như thay đổi kế hoạch học tập hoặc trùng lịch học.
## Mô tả phương thức: 
## Phương thức cancelEnrollment có nhiệm vụ hủy đăng ký một môn học cụ thể cho một học sinh, dựa trên studentID và subjectID được truyền vào.
## Khi được gọi, phương thức sẽ:
Duyệt qua danh sách các đối tượng Enrollment hiện có.
Tìm kiếm một đăng ký trùng với studentID và subjectID.
Nếu tìm thấy, phương thức sẽ xóa đăng ký khỏi danh sách và in ra thông báo xác nhận đã hủy thành công.
Nếu không tìm thấy, sẽ in ra thông báo không tìm thấy đăng ký tương ứng.
Phương thức trả về true nếu hủy thành công, ngược lại trả về false. Đây là phương thức thường dùng khi học sinh cần rút lại đăng ký vì chọn nhầm môn hoặc vì lý do cá nhân không thể tiếp tục học môn đó.



