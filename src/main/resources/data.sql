INSERT INTO user (id,createdat,enabled,password,updatedat, username) VALUES(1, "2020-03-22 00:00:01", 1, "$2a$10$K.f.ngFv7MMbt/7MoTiQKOVukLWTJ4/AF82Ntl9Z/T34EOSEdhyai", "2020-03-22 00:00:01", "cliente");
INSERT INTO user (id,createdat,enabled,password,updatedat, username) VALUES(2, "2020-03-22 00:00:01", 1, "$2a$10$52wlrwEjLnoYujLGpWuV/OeIFnQKGZkJfbomnBXtHVKcrip7Y3eg2", "2020-03-22 00:00:01", "admin");
INSERT INTO user_role (id,createdat,role,updatedat,user_id) VALUES(1, "2020-03-22 00:00:01", "ROLE_USER", "2020-03-22 00:00:01", 1);
INSERT INTO user_role (id,createdat,role,updatedat,user_id) VALUES(2, "2020-03-22 00:00:01", "ROLE_ADMIN", "2020-03-22 00:00:01", 2);

INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (1,"Aeropuerto de Londres Heathrow","Reino Unido",20,20);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (2,"Aeropuerto de Frankfurt","Alemania",25,25);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (3,"Aeropuerto Amsterdam Schiphol","Paises Bajos",30,30);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (4,"Aeropuerto de Madrid-Barajas Adolfo Suárez","España",35,35);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (5,"Aeropuerto de Estambul","Turquia",40,40);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (6,"Aeropuerto Roma Fiumicino","Italia",45,45);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (7,"Aeropuerto Internacional Jorge Newbery","Argentina",50,50);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (8,"Aeropuerto Internacional Ezeiza","Argentina",55,55);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (9,"Aeropuerto de Zúrich","Suiza",60,60);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (10,"Aeropuerto Internacional de Tokio","Japon",65,65);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (11,"Aeropuerto Internacional de Hong Kong","China",70,70);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (12,"Aeropuerto Internacional de Singapur","Singapur",75,75);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (13,"Aeropuerto Internacional Kingsford Smith","Australia",80,80);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (14,"Aeropuerto Internacional de Dubái","Emiratos Arabes Unidos",85,85);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (15,"Aeropuerto de la Ciudad de Londres","Reino Unido",90,90);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (16,"Aeropuerto de París-Charles de Gaulle","Francia",10,10);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (17,"Atenas-Eleftherios Venizelos","Grecia",15,15);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (18,"Aeropuerto Internacional de San Francisco","Estados Unidos",30,20);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (19,"Aeropuerto Internacional Mariscal Sucre","Ecuador",20,30);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (20,"Aeropuerto Arturo Merino Benítez","Chile",25,45);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (21,"Aeropuerto Internacional Jorge Chávez","Perú",45,25);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (22,"Aeropuerto El Dorado","Colombia",30,50);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (23,"Aeropuerto Internacional de Oruro","Bolivia",50,20);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (24,"Aeropuerto Internacional de Cancún","Mexico",50,30);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (25,"Aeropuerto Internacional de Carrasco","Uruguay",10,80);

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

INSERT INTO clase (id,nombre,porcentaje_aumento) values (1,"Economica",0.05);
INSERT INTO clase (id,nombre,porcentaje_aumento) values (2,"Premium Economy",0.15);
INSERT INTO clase (id,nombre,porcentaje_aumento) values (3,"Ejecutiva/Business",0.20);
INSERT INTO clase (id,nombre,porcentaje_aumento) values (4,"Primera Clase",0.30);




