CREATE TABLE BRAND
(
    id   serial primary key,
    name Text NOT NULL unique
        check (name != '')
);

COMMENT ON TABLE BRAND IS 'Марки автомобилей';
COMMENT ON COLUMN BRAND.name IS 'Название марки автомобиля';