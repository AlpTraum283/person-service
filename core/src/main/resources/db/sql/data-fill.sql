Insert into contact (id, phone_number, email, profile_link)
values (2, 22222222, 'user2@gmail.ru', '2userlink'),
       (3, 33333333, 'user3@gmail.ru', '3userlink'),
       (4, 44444444, 'user4@gmail.ru', '4userlink'),
       (5, 55555555, 'user5@gmail.ru', '5userlink');

Insert into medical_card (id, client_status, med_status, registry_dt, comment)
values (2, 'a', 'a', '2020-02-02', 'comment2'),
       (3, 'b', 'b', '2020-03-03', 'comment3'),
       (4, 'c', 'c', '2020-04-04', 'comment4'),
       (5, 'd', 'd', '2020-05-05', 'comment5');

Insert into address (id, contact_id, country_id, city, index, street, building, flat)
values (2, 2, 2, '2city', 222, '2street', '2building', '2flat'),
       (3, 3, 3, '3city', 333, '3street', '3building', '3flat'),
       (4, 4, 4, '4city', 444, '4street', '4building', '4flat'),
       (5, 5, 5, '5city', 555, '5street', '5building', '5flat');

Insert into illness (id, medical_card_id, type_id, heaviness, appearance_dttm, recovery_dt)
values (2, 2, 22, 'a', '2002-02-02', '2007-02-02'),
       (3, 3, 33, 'b', '2003-03-03', '2008-03-03'),
       (4, 4, 44, 'c', '2004-04-04', '2009-04-04'),
       (5, 5, 55, 'd', '2005-05-05', '2010-05-05');

Insert into person_data (id, last_name, first_name, birth_dt, age, sex, contact_id, medical_card_id, parent_id)
values (2, '2last_name', '2first_name', '1982-02-02', 40, 'm', 2, 2, 3),
       (3, '3last_name', '3first_name', '1983-03-03', 40, 'f', 3, 3, 4),
       (4, '4last_name', '4first_name', '1984-04-04', 40, 'f', 4, 4, 5),
       (5, '5last_name', '5first_name', '1985-05-05', 40, 'm', 5, 5, 2)

Insert into users (id, login, password, role)
values (2, 'user2', 'dXNlcjI=', 'ADMIN'),
       (3, 'user3', 'dXNlcjM=', 'ADMIN'),
       (4, 'user4', 'dXNlcjQ=', 'USER'),
       (5, 'user5', 'dXNlcjU=', 'USER');

Insert into signals (id, person_data_id, description, type)
values (2, 2, 'description2', 'alert'),
       (3, 3, 'description3', 'error'),
       (4, 4, 'description4', 'daily'),
       (5, 5, 'description5', 'daily');

