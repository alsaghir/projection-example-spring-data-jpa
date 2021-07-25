INSERT INTO PERSON (ID, FIRST_NAME, LAST_NAME)
VALUES (1, 'Ali', 'Hamed'),
       (2, 'Amr', 'Mahmoud'),
       (3, 'Mona', 'Fikri');

INSERT INTO ADDRESS (ID, STREET, COUNTRY)
VALUES (1, 'mohsen', 'USA'),
       (2, 'Salah Salem', 'EGYPT'),
       (3, 'Fahd Kind', 'KSA');

UPDATE PERSON SET ADDRESS_ID =1;