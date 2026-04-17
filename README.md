# Java OOP Practice — 70 Exercises

A structured Java OOP practice series covering 70 management-system exercises, from fundamentals to advanced patterns.

## What's Inside

Every exercise enforces the same mandatory checklist:

| Category | Topics |
|---|---|
| OOP Core | Inheritance, polymorphism, abstract class, interface |
| Data Structures | 1D array, `ArrayList`, fixed-size array |
| Control Flow | `if/else`, `switch`, `for`, `while`, `do-while`, ternary |
| Exception Handling | `try-catch`, `finally`, `throw`, `throws`, multi-catch |
| Modern Java | Switch expression, Text Block (Java 14+) |
| Algorithms | Applied LeetCode Easy problems per exercise |

## Tech Stack

- **Java** (JDK 17+), Apache NetBeans
- Pure Java console — no frameworks

## Project Layout

```
Java Practice/
├── README.md               ← you are here
│
├── SchoolSystem/           ← Ex 12: School Management
├── StudentManager/         ← Ex 03: Student Management
├── VehicleManager/         ← Ex 04: Vehicle Management
├── ProductManager/         ← Ex 05: Store Products
├── BankAccountSystem/      ← Ex 07: Banking System
├── BookLibrary/            ← Ex 08: Library
├── HospitalSystem/         ← Ex 09: Hospital
├── HotelSystem/            ← Ex 10: Hotel
└── ...
```

---

## Roadmap

Progress is tracked per exercise. Each entry shows: exercise title, algorithm level, and key Java concepts introduced.

**Legend:** ✅ Code + notes done &nbsp;|&nbsp; 🔨 In progress &nbsp;|&nbsp; ⬜ Not started

---

### Group 1 — OOP Foundations · Algorithm Level 1 (find max/min, count)

| # | Exercise | Concepts | Status |
|---|---|---|---|
| 01 | Quản Lý Thú Cưng Nâng Cao | Inheritance (3 subclasses), ArrayList, FindByName | ⬜ |
| 02 | Quản Lý Nhân Viên | Polymorphism, CalcSalary override, TotalSalary | ⬜ |
| 03 | Quản Lý Sinh Viên | Inheritance, GPA sort, FindAboveGPA | ✅ |
| 04 | Quản Lý Phương Tiện Giao Thông | Abstract CalcFuelCost, FilterByFuel | ✅ |
| 05 | Quản Lý Sản Phẩm Cửa Hàng | Multi-subclass, TotalValue, SearchByName | ✅ |
| 06 | Quản Lý Học Sinh Và Xếp Loại | scores[] array, CalcAverage, GetRank | ⬜ |

---

### Group 2 — Interface + Abstract · Algorithm Level 2 (grouped max/min, count by type)

| # | Exercise | Concepts | Status |
|---|---|---|---|
| 07 | Quản Lý Ngân Hàng | `IBankable`, abstract `CalcInterest`, fixed array | ✅ |
| 08 | Quản Lý Thư Viện Sách | `ILibraryItem`, abstract `GetDescription`, FilterByYear | ✅ |
| 09 | Quản Lý Bệnh Viện | `IHospitalPerson`, instanceof filter, fixed array | ✅ |
| 10 | Quản Lý Khách Sạn | `IBookable`, try-catch basics, BookRoom | ✅ |

---

### Group 3 — Exception Handling · Algorithm Level 3 (sort, 2nd max)

| # | Exercise | Concepts | Status |
|---|---|---|---|
| 11 | Quản Lý Nhà Hàng | Bubble Sort, 2nd max, try-catch crash prevention | ✅ |
| 12 | Quản Lý Trường Học | Selection Sort, multi-catch, `IllegalArgumentException` | ✅ |
| 13 | Quản Lý Siêu Thị | Insertion Sort, `InputMismatchException`, scanner buffer | ✅ |
| 14 | Quản Lý Đội Bóng | Bubble Sort (descending), `InputMismatchException` vs `NumberFormatException` | ✅ |
| 15 | Quản Lý Phòng Gym | Selection Sort (ascending), `ArithmeticException`, Fail Fast | ✅ |

---

### Group 4 — while + try-catch Loop · Algorithm Level 4 (linear search, filter, reverse)

| # | Exercise | Concepts | Status |
|---|---|---|---|
| 16 | Quản Lý Hãng Hàng Không | while+try-catch input loop, `RuntimeException`, switch expression intro | ✅ |
| 17 | Quản Lý Xe Hơi Showroom | Linear search multi-result, `IllegalArgumentException`, switch expression | ✅ |
| 18 | Quản Lý Phim Rạp | Subarray filter, null return vs throw, switch expression (multi-label) | ✅ |
| 19 | Quản Lý Trang Trại | Multi-field validation loop, `FilterBySpecies`, switch expression + `yield` | ⬜ |
| 20 | Quản Lý Dự Án IT | `finally` block, reverse order, switch expression in `@Override` | ⬜ |

---

### Group 5 — throw / throws · Algorithm Level 5 (median, mode, group by range)

| # | Exercise | Concepts | Status |
|---|---|---|---|
| 21 | Quản Lý Kho Hàng | `finally` for logging, `IllegalStateException`, switch expression + default | ⬜ |
| 22 | Quản Lý Khóa Học Online | `throw` Fail Fast pattern, `IllegalArgumentException`, switch in `@Override` | ⬜ |
| 23 | Quản Lý Bưu Điện | `throws Exception` (checked), `throw` vs `throws`, switch expression best practice | ⬜ |
| 24 | Quản Lý Cây Trồng Nông Nghiệp | Checked exception flow review, Text Block intro | ⬜ |
| 25 | Quản Lý Tiệm Thuốc | Mode of array, Text Block table header | ⬜ |

---

### Group 6 — Text Block + String Algorithms · Algorithm Level 6 (palindrome, frequency)

| # | Exercise | Concepts | Status |
|---|---|---|---|
| 26 | Quản Lý Phòng Trọ | Palindrome check, char frequency, Text Block JSON-like | ⬜ |
| 27 | Quản Lý Điểm Đến Du Lịch | | ⬜ |
| 28 | Quản Lý Nhà Xuất Bản | | ⬜ |
| 29 | Quản Lý Cuộc Thi Lập Trình | | ⬜ |
| 30 | Quản Lý Tiệm Nail | | ⬜ |

---

### Group 7 — Exercises 31–40

| # | Exercise | Status |
|---|---|---|
| 31 | Quản Lý Câu Lạc Bộ Sách | ⬜ |
| 32 | Quản Lý Hệ Thống Điện | ⬜ |
| 33 | Quản Lý Trung Tâm Thể Thao | ⬜ |
| 34 | Quản Lý Hội Nghị | ⬜ |
| 35 | Quản Lý Tiệm Cà Phê | ⬜ |
| 36 | Quản Lý Văn Phòng Phẩm | ⬜ |
| 37 | Quản Lý Câu Lạc Bộ Âm Nhạc | ⬜ |
| 38 | Quản Lý Trạm Xăng | ⬜ |
| 39 | Quản Lý Phòng Khám Nha Khoa | ⬜ |
| 40 | Quản Lý Sân Golf | ⬜ |

---

### Group 8 — Exercises 41–50

| # | Exercise | Status |
|---|---|---|
| 41 | Quản Lý Hệ Thống Pháp Lý | ⬜ |
| 42 | Quản Lý Hội Từ Thiện | ⬜ |
| 43 | Quản Lý Trung Tâm Dạy Nghề | ⬜ |
| 44 | Quản Lý Hệ Thống Bán Vé Xe | ⬜ |
| 45 | Quản Lý Nhà Máy Sản Xuất | ⬜ |
| 46 | Quản Lý Spa & Làm Đẹp | ⬜ |
| 47 | Quản Lý Đại Lý Bảo Hiểm | ⬜ |
| 48 | Quản Lý Hệ Thống Bãi Đỗ Xe | ⬜ |
| 49 | Quản Lý Sân Chơi Trẻ Em | ⬜ |
| 50 | Quản Lý Hệ Thống Thi Đấu Cờ Vua | ⬜ |

---

### Group 9 — Advanced Exercises 51–60

| # | Exercise | Status |
|---|---|---|
| 51 | Quản Lý ATM | ⬜ |
| 52 | Quản Lý Đặt Phòng Khách Sạn | ⬜ |
| 53 | Hệ Thống Đặt Món Ăn | ⬜ |
| 54 | Quản Lý Bệnh Viện Nâng Cao | ⬜ |
| 55 | Hệ Thống Đăng Nhập & Phân Quyền | ⬜ |
| 56 | Quản Lý File Dữ Liệu Sinh Viên | ⬜ |
| 57 | Hệ Thống Chuyển Khoản Ngân Hàng | ⬜ |
| 58 | Quản Lý Lịch Thi | ⬜ |
| 59 | Hệ Thống Giao Hàng | ⬜ |
| 60 | Quản Lý Chuỗi Nhà Hàng | ⬜ |

---

### Group 10 — Advanced Exercises 61–70

| # | Exercise | Status |
|---|---|---|
| 61 | Hệ Thống Điểm Thưởng Khách Hàng | ⬜ |
| 62 | Quản Lý Hóa Đơn Điện Tử | ⬜ |
| 63 | Hệ Thống Quản Lý Lớp Học Trực Tuyến | ⬜ |
| 64 | Quản Lý Học Bổng | ⬜ |
| 65 | Hệ Thống Quản Lý Kho Hàng | ⬜ |
| 66 | Quản Lý Dự Án Phần Mềm | ⬜ |
| 67 | Hệ Thống Thi Trực Tuyến | ⬜ |
| 68 | Quản Lý Phòng Gym | ⬜ |
| 69 | Hệ Thống Đặt Vé Xem Phim | ⬜ |
| 70 | Hệ Thống Ngân Hàng Nâng Cao | ⬜ |

---

**Progress: 13 / 70 completed**
