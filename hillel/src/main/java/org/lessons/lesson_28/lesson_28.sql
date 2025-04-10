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
VALUES ('Maria', '3432423232', 'student Maria'),
('Konstantin', '3432423232', 'student Konstantin');

UPDATE students SET name='Ivan', description='student Ivan' WHERE id=2;

SELECT * FROM students;

INSERT INTO hillel_groups(name)
VALUES ('JAVA_BASICS');


select * from hillel_groups


SELECT name, COUNT(id) FROM students
GROUP BY name;

SELECT name, students.hillel_group_id, COUNT(id) FROM students
GROUP BY name, students.hillel_group_id;

SELECT name, students.hillel_group_id, COUNT(id) FROM students
GROUP BY name, students.hillel_group_id
HAVING students.hillel_group_id IS NOT NULL;


SELECT s.name, s.phone_number, hg.name FROM students s
JOIN hillel_groups hg on s.hillel_group_id = hg.id;


SELECT * FROM students s
JOIN hillel_groups hg on s.hillel_group_id = hg.id;

SELECT * FROM students s
LEFT JOIN hillel_groups hg on s.hillel_group_id = hg.id;

SELECT * FROM students s
RIGHT JOIN hillel_groups hg on s.hillel_group_id = hg.id;

SELECT * FROM students s
CROSS JOIN hillel_groups hg on s.hillel_group_id = hg.id;

SELECT * FROM students s
LEFT JOIN hillel_groups hg on s.hillel_group_id = hg.id
UNION
SELECT * FROM students s
RIGHT JOIN hillel_groups hg on s.hillel_group_id = hg.id


SET TRANSACTION ISOLATION LEVEL SERIALIZABLE;

