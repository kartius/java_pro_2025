CREATE TABLE students
(
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(256) NOT NULL,
    phone_number VARCHAR(10)
);

DROP TABLE students;

ALTER TABLE students
    ADD description VARCHAR(512);


CREATE TABLE hillel_groups (
                               id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
                               name VARCHAR(256) NOT NULL
);


ALTER TABLE students
    ADD hillel_group_id INT;

ALTER TABLE students
    ADD FOREIGN KEY (hillel_group_id) REFERENCES hillel_groups(id);


INSERT INTO students(name, phone_number, description)
VALUES ('Vasil', '3432423', 'student Vasil');

INSERT INTO students(name, phone_number, description)
VALUES ('Vadim', '3432423232', 'student Vadim'),
       ('Vadim', '3432423232', 'student Vadim');

UPDATE students SET name='Ivan', description='student Ivan' WHERE id=2;

SELECT * FROM students;

INSERT INTO hillel_groups(name)
VALUES ('JAVA_PRO');


select * from hillel_groups
