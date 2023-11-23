INSERT INTO roles (id, name) VALUES(1, 'ADMIN');

INSERT INTO users (email, first_name, last_name, registered_at, password) VALUES('andrea@email.com', 'Andrea', 'Lorenzi', '2023-11-20 16:00', '{noop}andrea');

INSERT INTO users_roles (user_id, roles_id) VALUES(1, 1);