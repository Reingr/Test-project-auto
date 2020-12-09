CREATE TABLE AUTO
(
    id             serial primary key,
    number         Text NOT NULL
        check (number != ''),
    brand_id       integer NOT NULL REFERENCES brand (id)
    );

COMMENT ON TABLE AUTO IS 'Автомобили';
COMMENT ON COLUMN AUTO.number IS 'Номер автомобиля';
COMMENT ON COLUMN AUTO.brand_id IS 'Марка автомобиля';