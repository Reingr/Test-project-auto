CREATE TABLE AUTO_POSITION
(
    id        serial primary key,
    auto_id   integer   NOT NULL REFERENCES auto (id),
    point_id  integer   NOT NULL REFERENCES point (id)
);

COMMENT ON TABLE AUTO_POSITION IS 'Местонахождение машины';
COMMENT ON COLUMN AUTO_POSITION.auto_id IS 'Автомобиль';
COMMENT ON COLUMN AUTO_POSITION.point_id IS 'Точка';