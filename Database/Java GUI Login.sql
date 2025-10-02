-- Database: loginapp
-- Tabel users untuk aplikasi Java GUI Login

CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(50) NOT NULL
);

-- Data awal
INSERT INTO users (username, password) VALUES
('admin', '12345'),
('mahasiswa', 'pbo2025');

-- Tambah kolom role
ALTER TABLE users ADD COLUMN role VARCHAR(20);

-- Update role sesuai user
UPDATE users SET role='admin' WHERE username='admin';
UPDATE users SET role='mahasiswa' WHERE username='mahasiswa';

-- Cek data
SELECT * FROM users;
