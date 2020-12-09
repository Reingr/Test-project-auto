CREATE TABLE HISTORY
(
    id        serial primary key,
    status_id integer   NOT NULL REFERENCES history_status (id),
    auto_id   integer   NOT NULL REFERENCES auto (id),
    point_id  integer   NOT NULL REFERENCES point (id),
    date      TIMESTAMP NOT NULL
);

COMMENT ON TABLE HISTORY IS 'История проката';
COMMENT ON COLUMN HISTORY.status_id IS 'Статус записи (взят в прокат, поставлен на точку)';
COMMENT ON COLUMN HISTORY.auto_id IS 'Автомобиль';
COMMENT ON COLUMN HISTORY.point_id IS 'Точка';
COMMENT ON COLUMN HISTORY.date IS 'Дата и время';