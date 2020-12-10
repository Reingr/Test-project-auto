CREATE TABLE PERSON
(
    id   serial primary key,
    fio Text NOT NULL unique
        check (fio != '')
);

COMMENT ON TABLE PERSON IS 'Таблица с арендаторами';
COMMENT ON COLUMN PERSON.fio IS 'ФИО человека';