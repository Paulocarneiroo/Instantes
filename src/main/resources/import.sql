INSERT INTO tb_user(name, email, uri_foto) VALUES ('Paulo Segundo', 'paulo@email.com', 'https://raw.githubusercontent.com/Paulocarneiroo/Instantes-Resources/refs/heads/master/WhatsApp%20Image%202024-09-26%20at%2011.55.58(2).jpeg')
INSERT INTO tb_user(name, email, uri_foto) VALUES ('Ricardo Daniel', 'ricardo@email.com', 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/3-big.jpg')

INSERT INTO tb_album(title, user_id) VALUES ('viagem', 1)
INSERT INTO tb_album(title, user_id) VALUES ('memes', 2)

INSERT INTO tb_user_friends(friends_id, user_id) VALUES (2, 1)
INSERT INTO tb_user_friends(friends_id, user_id) VALUES (1, 2)

INSERT INTO tb_album_pictures(album_id, pictures_uri) VALUES (1, 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/3-big.jpg')
INSERT INTO tb_album_pictures(album_id, pictures_uri) VALUES (1, 'https://raw.githubusercontent.com/devsuperior/dscatalog-resources/master/backend/img/3-big.jpg')
