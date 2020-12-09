CREATE TABLE POINT
(
    id   serial primary key,
    address Text NOT NULL unique
        check (address != '')
);

COMMENT ON TABLE POINT IS 'Точка где стоят автомобили';
COMMENT ON COLUMN POINT.address IS 'Адрес точки';