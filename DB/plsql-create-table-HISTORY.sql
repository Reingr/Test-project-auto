CREATE TABLE HISTORY
(
    id        serial primary key,
    auto_id   integer   NOT NULL REFERENCES auto (id),
    point_rent_id  integer   NOT NULL REFERENCES point (id),
    point_return_id  integer   NOT NULL REFERENCES point (id),
    person_id integer   NOT NULL REFERENCES person (id),
    date_rent     TIMESTAMP NOT NULL,
    date_return      TIMESTAMP
);

COMMENT ON TABLE HISTORY IS 'История проката';
COMMENT ON COLUMN HISTORY.auto_id IS 'Автомобиль';
COMMENT ON COLUMN HISTORY.point_rent_id IS 'Точка с которой взята машина в прокат';
COMMENT ON COLUMN HISTORY.point_return_id IS 'Точка в которую вернули машину с проката';
COMMENT ON COLUMN HISTORY.person_id IS 'Арендатор';
COMMENT ON COLUMN HISTORY.date_rent IS 'Дата и время взятия машины в прокат';
COMMENT ON COLUMN HISTORY.date_return IS 'Дата и время возврата машины с проката';