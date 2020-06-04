INSERT INTO user (id,createdat,enabled,password,updatedat, username) VALUES(1, "2020-03-22 00:00:01", 1, "$2a$10$K.f.ngFv7MMbt/7MoTiQKOVukLWTJ4/AF82Ntl9Z/T34EOSEdhyai", "2020-03-22 00:00:01", "cliente");
INSERT INTO user (id,createdat,enabled,password,updatedat, username) VALUES(2, "2020-03-22 00:00:01", 1, "$2a$10$52wlrwEjLnoYujLGpWuV/OeIFnQKGZkJfbomnBXtHVKcrip7Y3eg2", "2020-03-22 00:00:01", "admin");
INSERT INTO user_role (id,createdat,role,updatedat,user_id) VALUES(1, "2020-03-22 00:00:01", "ROLE_USER", "2020-03-22 00:00:01", 1);
INSERT INTO user_role (id,createdat,role,updatedat,user_id) VALUES(2, "2020-03-22 00:00:01", "ROLE_ADMIN", "2020-03-22 00:00:01", 2);

INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (1,"Aeropuerto de Londres Heathrow","Reino Unido",51.46,-0.44);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (2,"Aeropuerto de Frankfurt","Alemania",50.02,8.52);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (3,"Aeropuerto Amsterdam Schiphol","Paises Bajos",52.32,4.74);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (4,"Aeropuerto de Madrid-Barajas Adolfo Suárez","España",40.49,-3.56);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (5,"Aeropuerto de Estambul","Turquia",41.27,28.72);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (6,"Aeropuerto Roma Fiumicino","Italia",41.81,12.22);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (7,"Aeropuerto Internacional Jorge Newbery","Argentina",-36.60,-64.27);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (8,"Aeropuerto Internacional Ezeiza","Argentina",-34.81,-58.54);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (9,"Aeropuerto de Zúrich","Suiza",43.11,-77.05);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (10,"Aeropuerto Internacional de Tokio","Japon",14.51,121.02);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (11,"Aeropuerto Internacional de Hong Kong","China",22.30,113.91);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (12,"Aeropuerto Internacional de Singapur","Singapur",1.35,103.98);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (13,"Aeropuerto Internacional Kingsford Smith","Australia",-33.93,151.17);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (14,"Aeropuerto Internacional de Dubái","Emiratos Arabes Unidos",40.42,-3.56);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (15,"Aeropuerto de la Ciudad de Londres","Reino Unido",51.50,0.04);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (16,"Aeropuerto de París-Charles de Gaulle","Francia",49,2.54);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (17,"Atenas-Eleftherios Venizelos","Grecia",37.93,23.94);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (18,"Aeropuerto Internacional de San Francisco","Estados Unidos",37.62,-122.37);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (19,"Aeropuerto Internacional Mariscal Sucre","Ecuador",-0.12,-78.35);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (20,"Aeropuerto Arturo Merino Benítez","Chile",-33.39,-70.79);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (21,"Aeropuerto Internacional Jorge Chávez","Perú",-12.02,-77.11);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (22,"Aeropuerto El Dorado","Colombia",-12.04,-77.08);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (23,"Aeropuerto Internacional de Oruro","Bolivia",-17.95,-67.07);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (24,"Aeropuerto Internacional de Cancún","Mexico",21.04,-86.87);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (25,"Aeropuerto Internacional de Carrasco","Uruguay",-34.83,-56.01);

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

INSERT INTO tipo_alojamiento (id,tipo) values (1,"Hotel");
INSERT INTO tipo_alojamiento (id,tipo) values (2,"Hostel");
INSERT INTO tipo_alojamiento (id,tipo) values (3,"Apart-hotel");
INSERT INTO tipo_alojamiento (id,tipo) values (4,"Business Hotel");
INSERT INTO tipo_alojamiento (id,tipo) values (5,"Resort");
INSERT INTO tipo_alojamiento (id,tipo) values (6,"Hotel Boutique");
INSERT INTO tipo_alojamiento (id,tipo) values (7,"Resorts");
INSERT INTO tipo_alojamiento (id,tipo) values (8,"Bed&Breakfast");
INSERT INTO tipo_alojamiento (id,tipo) values (9,"Cabaña");

INSERT INTO tipo_habitacion (id,tipo,porcentaje_aumento) values (1,"Habitacion Estandar",0);
INSERT INTO tipo_habitacion (id,tipo,porcentaje_aumento) values (2,"Junior Suite",0.1);
INSERT INTO tipo_habitacion (id,tipo,porcentaje_aumento) values (3,"Suite",0.3);
INSERT INTO tipo_habitacion (id,tipo,porcentaje_aumento) values (4,"Grand Suite",0.5);

INSERT INTO tipo_regimen (id,tipo,porcentaje_aumento) values (1,"Solo alojamiento",0.1);
INSERT INTO tipo_regimen (id,tipo,porcentaje_aumento) values (2,"Alojamiento y Desayuno",0.2);
INSERT INTO tipo_regimen (id,tipo,porcentaje_aumento) values (3,"Media Pension",0.4);
INSERT INTO tipo_regimen (id,tipo,porcentaje_aumento) values (4,"Pension Completa",0.8);
INSERT INTO tipo_regimen (id,tipo,porcentaje_aumento) values (5,"Todo Incluido",0.1);

INSERT INTO tipo_servicio (id,tipo,porcentaje_aumento) values (1,"Wifi",0.02);
INSERT INTO tipo_servicio (id,tipo,porcentaje_aumento) values (2,"Limpieza",0.05);
INSERT INTO tipo_servicio (id,tipo,porcentaje_aumento) values (3,"Atencion al cliente",0.05);

