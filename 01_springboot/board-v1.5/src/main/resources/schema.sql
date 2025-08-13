CREATE TABLE users(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE
);

INSERT INTO users (name,email) VALUES
    ('김철수', 'aaaa.aaaa.com'),
    ('이영희', 'bbbb.bbbb.com'),
    ('박민수', 'cccc.cccc.com')