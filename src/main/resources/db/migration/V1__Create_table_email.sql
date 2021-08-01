CREATE TABLE email
(
    id        SERIAL PRIMARY KEY,
    "from"    VARCHAR(255) NOT NULL,
    "to"      VARCHAR(255) NOT NULL,
    subject   VARCHAR(255) NOT NULL,
    text      TEXT         NOT NULL,
    sent_date TIMESTAMP    NOT NULL,
    success   BOOLEAN      NOT NULL
);