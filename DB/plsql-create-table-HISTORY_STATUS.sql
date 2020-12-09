CREATE TABLE HISTORY_STATUS
(
    id   serial primary key,
    value Text NOT NULL unique
        check (value != '')
);

COMMENT ON TABLE HISTORY_STATUS IS 'Статус записи истории';
COMMENT ON COLUMN HISTORY_STATUS.value IS 'Значение статуса';