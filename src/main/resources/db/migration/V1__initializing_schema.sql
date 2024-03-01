CREATE TABLE IF NOT EXISTS tasks (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    complete BOOLEAN NOT NULL,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    comments TEXT
);