show databases;
use defaultdb;
create table if not exists persons (
    person_id int auto_increment primary key,
    name varchar(100) not null,
    date_of_birth date not null,
    gender enum('male', 'female') not null
);

-- tạo bảng 'lecturers'
create table if not exists lecturers (
    lecturer_id int auto_increment primary key,
    person_id int not null,
    foreign key (person_id) references persons(person_id) on delete cascade
);

-- tạo bảng 'students'
create table if not exists students (
    student_id int auto_increment primary key,
    person_id int not null,
    foreign key (person_id) references persons(person_id) on delete cascade
);

-- bảng auto_subjects với id tự sinh
create table if not exists auto_subjects (
    auto_subject_id int auto_increment primary key,
    subject_name varchar(255) not null,
    credits int not null,
    lecturer_id int,
    foreign key (lecturer_id) references lecturers(lecturer_id) on delete cascade
);

-- bảng custom_subjects với id tự nhập
create table if not exists custom_subjects (
    custom_subject_id int primary key,
    auto_subject_id int,
    foreign key (auto_subject_id) references auto_subjects(auto_subject_id) on delete cascade
);

-- tạo bảng 'grades'
create table if not exists grades (
    student_id int,
    custom_subject_id int,
    score decimal(3, 2),
    primary key (student_id, custom_subject_id),
    foreign key (student_id) references students(student_id),
    foreign key (custom_subject_id) references custom_subjects(custom_subject_id) on delete cascade
);

-- tạo bảng 'enrollments'
create table if not exists enrollments (
    student_id int,
    custom_subject_id int,
    primary key (student_id, custom_subject_id),
    foreign key (student_id) references students(student_id) on delete cascade,
    foreign key (custom_subject_id) references custom_subjects(custom_subject_id) on delete cascade
);

insert into persons (name, date_of_birth, gender) values
('Nguyen Van A', '1980-01-01', 'male'),
('Tran Thi B', '1985-02-02', 'female'),
('Le Van C', '1975-03-03', 'male'),
('Pham Thi D', '1990-04-04', 'female'),
('Nguyen Van E', '1982-05-05', 'male');

insert into lecturers (person_id) values
(1), (2), (3), (4), (5);

insert into students (person_id) values
(1), (2), (3), (4), (5);

insert into auto_subjects (subject_name, credits, lecturer_id) values
('mathematics', 3, 1),
('physics', 4, 2),
('chemistry', 3, 3),
('biology', 4, 4),
('computer science', 3, 5);

insert into custom_subjects (custom_subject_id, auto_subject_id) values
(101, 1),
(102, 2),
(103, 3),
(104, 4),
(105, 5);

insert into grades (student_id, custom_subject_id, score) values
(1, 101, 8.5),
(2, 102, 7.0),
(3, 103, 9.0),
(4, 104, 8.5),
(5, 105, 9.0);

insert into enrollments (student_id, custom_subject_id) values
(1, 101),
(2, 102),
(3, 103),
(4, 104),
(5, 105);
