INSERT INTO user (id,createdat,enabled,password,updatedat, username) VALUES(1, "2020-03-22 00:00:01", 1, "$2a$10$K.f.ngFv7MMbt/7MoTiQKOVukLWTJ4/AF82Ntl9Z/T34EOSEdhyai", "2020-03-22 00:00:01", "cliente");
INSERT INTO user (id,createdat,enabled,password,updatedat, username) VALUES(2, "2020-03-22 00:00:01", 1, "$2a$10$52wlrwEjLnoYujLGpWuV/OeIFnQKGZkJfbomnBXtHVKcrip7Y3eg2", "2020-03-22 00:00:01", "admin");
INSERT INTO user_role (id,createdat,role,updatedat,user_id) VALUES(1, "2020-03-22 00:00:01", "ROLE_USER", "2020-03-22 00:00:01", 1);
INSERT INTO user_role (id,createdat,role,updatedat,user_id) VALUES(2, "2020-03-22 00:00:01", "ROLE_ADMIN", "2020-03-22 00:00:01", 2);

INSERT INTO destino (id,nombre,pais) VALUES (1,"Aeropuerto de Londres Heathrow","Reino Unido");
INSERT INTO destino (id,nombre,pais) VALUES (2,"Aeropuerto de Frankfurt","Alemania");
INSERT INTO destino (id,nombre,pais) VALUES (3,"Aeropuerto Amsterdam Schiphol","Paises Bajos");
INSERT INTO destino (id,nombre,pais) VALUES (4,"Aeropuerto de Madrid-Barajas Adolfo Suárez","España");
INSERT INTO destino (id,nombre,pais) VALUES (5,"Aeropuerto de Estambul","Turquia");
INSERT INTO destino (id,nombre,pais) VALUES (6,"Aeropuerto Roma Fiumicino","Italia");
INSERT INTO destino (id,nombre,pais) VALUES (7,"Aeropuerto Internacional Jorge Newbery","Argentina");
INSERT INTO destino (id,nombre,pais) VALUES (8,"Aeropuerto Internacional Ezeiza","Argentina");
INSERT INTO destino (id,nombre,pais) VALUES (9,"Aeropuerto de Zúrich","Suiza");
INSERT INTO destino (id,nombre,pais) VALUES (10,"Aeropuerto Internacional de Tokio","Japon");
INSERT INTO destino (id,nombre,pais) VALUES (11,"Aeropuerto Internacional de Hong Kong","China");
INSERT INTO destino (id,nombre,pais) VALUES (12,"Aeropuerto Internacional de Singapur","Singapur");
INSERT INTO destino (id,nombre,pais) VALUES (13,"Aeropuerto Internacional Kingsford Smith","Australia");
INSERT INTO destino (id,nombre,pais) VALUES (14,"Aeropuerto Internacional de Dubái","Emiratos Arabes Unidos");
INSERT INTO destino (id,nombre,pais) VALUES (15,"Aeropuerto de la Ciudad de Londres","Reino Unido");
INSERT INTO destino (id,nombre,pais) VALUES (16,"Aeropuerto de París-Charles de Gaulle","Francia");
INSERT INTO destino (id,nombre,pais) VALUES (17,"Atenas-Eleftherios Venizelos","Grecia");
INSERT INTO destino (id,nombre,pais) VALUES (18,"Aeropuerto Internacional de San Francisco","Estados Unidos");
INSERT INTO destino (id,nombre,pais) VALUES (19,"Aeropuerto Internacional Mariscal Sucre","Ecuador");
INSERT INTO destino (id,nombre,pais) VALUES (20,"Aeropuerto Arturo Merino Benítez","Chile");
INSERT INTO destino (id,nombre,pais) VALUES (21,"Aeropuerto Internacional Jorge Chávez","Perú");
INSERT INTO destino (id,nombre,pais) VALUES (22,"Aeropuerto El Dorado","Colombia");
INSERT INTO destino (id,nombre,pais) VALUES (23,"Aeropuerto Internacional de Oruro","Bolivia");
INSERT INTO destino (id,nombre,pais) VALUES (24,"Aeropuerto Internacional de Cancún","Mexico");
INSERT INTO destino (id,nombre,pais) VALUES (25,"Aeropuerto Internacional de Carrasco","Uruguay");

INSERT INTO aerolinea (id,nombre,valoracion) VALUES (1,"LATAM",7);
INSERT INTO aerolinea (id,nombre,valoracion) VALUES (2,"KLM",8);
INSERT INTO aerolinea (id,nombre,valoracion) VALUES (3,"Avianca Airlines",9);
INSERT INTO aerolinea (id,nombre,valoracion) VALUES (4,"Flybondi",1);
INSERT INTO aerolinea (id,nombre,valoracion) VALUES (5,"Qatar Airways",10);
INSERT INTO aerolinea (id,nombre,valoracion) VALUES (6,"United Airlines",3);
INSERT INTO aerolinea (id,nombre,valoracion) VALUES (7,"Aeromexico",6);
INSERT INTO aerolinea (id,nombre,valoracion) VALUES (8,"Gol",2);
INSERT INTO aerolinea (id,nombre,valoracion) VALUES (9,"Aerolineas Argentinas",5);
INSERT INTO aerolinea (id,nombre,valoracion) VALUES (10,"Delta Airlines",4);

INSERT INTO clase (id,nombre,porcentajeAumento) values (1,"Economica",0.05);
INSERT INTO clase (id,nombre,porcentajeAumento) values (2,"Premium Economy",0.15);
INSERT INTO clase (id,nombre,porcentajeAumento) values (3,"Ejecutiva/Business",0.20);
INSERT INTO clase (id,nombre,porcentajeAumento) values (4,"Primera Clase",0.30);




