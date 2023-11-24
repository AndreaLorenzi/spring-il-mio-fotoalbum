INSERT INTO roles (id, name) VALUES(1, 'ADMIN');

INSERT INTO users (email, first_name, last_name, registered_at, password) VALUES('andrea@email.com', 'Andrea', 'Lorenzi', '2023-11-20 16:00', '{noop}andrea');

INSERT INTO users_roles (user_id, roles_id) VALUES(1, 1);

INSERT INTO db_photo.photos(description, Title, Url, visible)VALUES('Sea photo',  'America','https://img.freepik.com/premium-photo/sunset-view-sea-with-coming-surf-waves_396254-359.jpg', true);
INSERT INTO db_photo.photos(description, Title, Url, visible)VALUES('Montaign photo',  'Alpi','https://www.alleghefunivie.com/wp-content/uploads/2019/04/montecivetta-1-1600x900.jpg', true);
INSERT INTO db_photo.photos(description, Title, Url, visible)VALUES('Desert photo',  'Sahara','https://statics.cedscdn.it/photos/MED_HIGH/53/11/3575311_1647_sahara.jpg', true);
INSERT INTO db_photo.photos(description, Title, Url, visible)VALUES('Black forest photo',  'Friburg','https://hips.hearstapps.com/hmg-prod/images/panoramic-view-of-pine-trees-and-mountains-against-royalty-free-image-1646668634.jpg', true);
INSERT INTO db_photo.photos(description, Title, Url, visible)VALUES('Nba game photo',  'L.Angeles','https://hoopshype.com/wp-content/uploads/sites/92/2023/10/1747764971.jpg?w=1000&h=600&crop=1', true);
INSERT INTO db_photo.photos(description, Title, Url, visible)VALUES('Champions final photo',  'Turchey','https://images2-gazzanet.gazzettaobjects.it/cd63l8R5xhG-NEWHEwITtYCx4u4=/712x402/smart/www.pianetamilan.it/assets/uploads/202306/bbe27b0789c7b54f3861db93282a44bd.jpg', true);
INSERT INTO db_photo.photos(description, Title, Url, visible)VALUES('Wimbledon final photo',  'London, UK','https://www.repstatic.it/content/nazionale/img/2023/07/16/102041485-9d477129-e24f-4600-86f5-f85a92120949.jpg', true);
INSERT INTO db_photo.photos(description, Title, Url, visible)VALUES('La gioconda',  'Luvre, Paris','https://cdn.studenti.stbm.it/images/2017/01/10/gioconda-orig.jpeg', true);



INSERT INTO categories(name)VALUES('Paesaggi Naturali');
INSERT INTO categories(name)VALUES('Sport');
INSERT INTO categories(name)VALUES('Alimenti');
INSERT INTO categories(name)VALUES('Arte');


INSERT INTO photos_categories (photo_id, categories_id)VALUES(1,1)
INSERT INTO photos_categories (photo_id, categories_id)VALUES(2,1)
INSERT INTO photos_categories (photo_id, categories_id)VALUES(3,1)
INSERT INTO photos_categories (photo_id, categories_id)VALUES(4,1)
INSERT INTO photos_categories (photo_id, categories_id)VALUES(5,2)
INSERT INTO photos_categories (photo_id, categories_id)VALUES(6,2)
INSERT INTO photos_categories (photo_id, categories_id)VALUES(7,2)
INSERT INTO photos_categories (photo_id, categories_id)VALUES(8,4)