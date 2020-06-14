INSERT INTO carrito(id) VALUES (1);
INSERT INTO carrito(id) VALUES (2);

INSERT INTO user (id,createdat,enabled,password,updatedat,username,nombre,apellido,nacionalidad,domicilio,mail,telefono,dni,carrito_id) VALUES(1, "2020-03-22 00:00:01", 1, "$2a$10$K.f.ngFv7MMbt/7MoTiQKOVukLWTJ4/AF82Ntl9Z/T34EOSEdhyai", "2020-03-22 00:00:01", "cliente","cliente","de_prueba","argentina","unla","cliente@gmail.com","1122334455",40000000,1);
INSERT INTO user (id,createdat,enabled,password,updatedat,username,nombre,apellido,nacionalidad,domicilio,mail,telefono,dni,carrito_id) VALUES(2, "2020-03-22 00:00:01", 1, "$2a$10$52wlrwEjLnoYujLGpWuV/OeIFnQKGZkJfbomnBXtHVKcrip7Y3eg2", "2020-03-22 00:00:01", "admin","admin","de_prueba","argentina","unla","admin@gmail.com","5544332211",28000000,2);
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
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (26,"Aeropuerto Internacional de Katmandú","Nepal",27.69,85.35);
INSERT INTO destino (id,nombre,pais,latitud,longitud) VALUES (27,"Aeropuerto Internacional de São Paulo-Guarulhos","Brasil",-23.43,-46.47);

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

INSERT INTO tipo_regimen (id,tipo,porcentaje_aumento) values (1,"Solo alojamiento",0);
INSERT INTO tipo_regimen (id,tipo,porcentaje_aumento) values (2,"Alojamiento y Desayuno",0.2);
INSERT INTO tipo_regimen (id,tipo,porcentaje_aumento) values (3,"Media Pension",0.3);
INSERT INTO tipo_regimen (id,tipo,porcentaje_aumento) values (4,"Pension Completa",0.5);
INSERT INTO tipo_regimen (id,tipo,porcentaje_aumento) values (5,"Todo Incluido",0.6);

INSERT INTO tipo_servicio (id,tipo) values (1,"Wifi");
INSERT INTO tipo_servicio (id,tipo) values (2,"Limpieza");
INSERT INTO tipo_servicio (id,tipo) values (3,"Atencion al cliente");

INSERT INTO hotel (id,nombre,accesibilidad,cant_estrellas,tipo_alojamiento_id_tipo_alojamiento,tipo_habitacion_id_tipo_habitacion,tipo_regimen_id_tipo_regimen,cant_personas,precio,img_path,pais) VALUES (1,"Hotel Mystic Mountain",true,4,9,1,1,1,8000,"/assets/img/hoteles/nepal-hotel.jpg","Nepal");
INSERT INTO hotel (id,nombre,accesibilidad,cant_estrellas,tipo_alojamiento_id_tipo_alojamiento,tipo_habitacion_id_tipo_habitacion,tipo_regimen_id_tipo_regimen,cant_personas,precio,img_path,pais) VALUES (2,"Hotel Imperiale",true,4,5,1,1,1,15000,"/assets/img/hoteles/roma-hotel.jpg","Italia");
INSERT INTO hotel (id,nombre,accesibilidad,cant_estrellas,tipo_alojamiento_id_tipo_alojamiento,tipo_habitacion_id_tipo_habitacion,tipo_regimen_id_tipo_regimen,cant_personas,precio,img_path,pais) VALUES (3,"Centromar Hotel",true,3,2,1,1,1,7500,"/assets/img/hoteles/brasil-hotel.jpg","Brasil");
INSERT INTO hotel (id,nombre,accesibilidad,cant_estrellas,tipo_alojamiento_id_tipo_alojamiento,tipo_habitacion_id_tipo_habitacion,tipo_regimen_id_tipo_regimen,cant_personas,precio,img_path,pais) VALUES (4,"The Ritz-Carlton",true,5,4,1,1,1,36000,"/assets/img/hoteles/tokyo-hotel.jpg","Japon");
INSERT INTO hotel (id,nombre,accesibilidad,cant_estrellas,tipo_alojamiento_id_tipo_alojamiento,tipo_habitacion_id_tipo_habitacion,tipo_regimen_id_tipo_regimen,cant_personas,precio,img_path,pais) VALUES (5,"Concorde Hotel",false,3,2,1,1,1,2500,"/assets/img/hoteles/2.jpg","Estados unidos");
INSERT INTO hotel (id,nombre,accesibilidad,cant_estrellas,tipo_alojamiento_id_tipo_alojamiento,tipo_habitacion_id_tipo_habitacion,tipo_regimen_id_tipo_regimen,cant_personas,precio,img_path,pais) VALUES (6,"Hotel Real Santa Marta",false,5,3,1,1,1,1000,"/assets/img/hoteles/colombia-hotel.jpg","Colombia");
INSERT INTO hotel (id,nombre,accesibilidad,cant_estrellas,tipo_alojamiento_id_tipo_alojamiento,tipo_habitacion_id_tipo_habitacion,tipo_regimen_id_tipo_regimen,cant_personas,precio,img_path,pais) VALUES (7,"Hotel San Lucas",true,4,4,1,1,1,1500,"/assets/img/hoteles/3.jpg","Mexico");
INSERT INTO hotel (id,nombre,accesibilidad,cant_estrellas,tipo_alojamiento_id_tipo_alojamiento,tipo_habitacion_id_tipo_habitacion,tipo_regimen_id_tipo_regimen,cant_personas,precio,img_path,pais) VALUES (8,"Ayasultan Hotel",true,4,1,1,1,1,3000,"/assets/img/hoteles/1.jpg","Turquia");

INSERT INTO actividad (id,nombre,accesibilidad,precio,img_path,valoracion,destino_id) VALUES (1,"Parapente",false,1500,"/assets/img/actividades/nepal-1.jpg",9,26);
INSERT INTO actividad (id,nombre,accesibilidad,precio,img_path,valoracion,destino_id) VALUES (2,"Puentismo (bungee jumping)",false,1500,"/assets/img/actividades/nepal-2.jpg",8,26);
INSERT INTO actividad (id,nombre,accesibilidad,precio,img_path,valoracion,destino_id) VALUES (3,"Visita guiada al coliseo de roma",false,1500,"/assets/img/actividades/roma-1.jpg",8,6);
INSERT INTO actividad (id,nombre,accesibilidad,precio,img_path,valoracion,destino_id) VALUES (4,"Visita a la Bocca della Veritá",false,1500,"/assets/img/actividades/roma-2.jpg",10,6);
INSERT INTO actividad (id,nombre,accesibilidad,precio,img_path,valoracion,destino_id) VALUES (5,"Visita guiada al Cristo Redentor",false,2000,"/assets/img/actividades/brasil-2.jpg",8,27);
INSERT INTO actividad (id,nombre,accesibilidad,precio,img_path,valoracion,destino_id) VALUES (6,"Visita al Pinacoteca do Estado",false,500,"/assets/img/actividades/brasil-1.jpg",10,27);
INSERT INTO actividad (id,nombre,accesibilidad,precio,img_path,valoracion,destino_id) VALUES (7,"Visita guiada al Tokyo-Skytree",false,2000,"/assets/img/actividades/tokyo-1.jpg",10,10);
INSERT INTO actividad (id,nombre,accesibilidad,precio,img_path,valoracion,destino_id) VALUES (8,"Visita al Pinacoteca do Estado",false,500,"/assets/img/actividades/tokyo-2.jpg",10,10);
INSERT INTO actividad (id,nombre,accesibilidad,precio,img_path,valoracion,destino_id) VALUES (9,"Esquiar",false,1500,"/assets/img/actividades/1.jpg",9,9);
INSERT INTO actividad (id,nombre,accesibilidad,precio,img_path,valoracion,destino_id) VALUES (10,"Acampar",true,1000,"/assets/img/actividades/2.jpg",8,5);
INSERT INTO actividad (id,nombre,accesibilidad,precio,img_path,valoracion,destino_id) VALUES (11,"Escalar",false,2000,"/assets/img/actividades/3.jpg",9,1);
INSERT INTO actividad (id,nombre,accesibilidad,precio,img_path,valoracion,destino_id) VALUES (12,"Paracaidismo",false,3500,"/assets/img/actividades/4.jpg",10,14);

INSERT INTO vuelo (id,destino_id,origen_id,cant_personas,aerolinea_id,clase_id,escala_incluida,precio) values (1,26,7,1,1,1,true,1);
INSERT INTO vuelo (id,destino_id,origen_id,cant_personas,aerolinea_id,clase_id,escala_incluida,precio) values (2,6,8,1,1,1,true,1);
INSERT INTO vuelo (id,destino_id,origen_id,cant_personas,aerolinea_id,clase_id,escala_incluida,precio) values (3,27,8,1,1,1,false,1);
INSERT INTO vuelo (id,destino_id,origen_id,cant_personas,aerolinea_id,clase_id,escala_incluida,precio) values (4,10,7,1,1,1,false,1);
INSERT INTO vuelo (id,destino_id,origen_id,cant_personas,aerolinea_id,clase_id,escala_incluida,precio) values (5,25,7,1,1,1,false,1);
INSERT INTO vuelo (id,destino_id,origen_id,cant_personas,aerolinea_id,clase_id,escala_incluida,precio) values (6,24,8,1,1,1,false,1);
INSERT INTO vuelo (id,destino_id,origen_id,cant_personas,aerolinea_id,clase_id,escala_incluida,precio) values (7,23,7,1,1,1,false,1);
INSERT INTO vuelo (id,destino_id,origen_id,cant_personas,aerolinea_id,clase_id,escala_incluida,precio) values (8,2,8,1,1,1,false,1);
INSERT INTO vuelo (id,destino_id,origen_id,cant_personas,aerolinea_id,clase_id,escala_incluida,precio) values (9,4,7,1,1,1,false,1);
INSERT INTO vuelo (id,destino_id,origen_id,cant_personas,aerolinea_id,clase_id,escala_incluida,precio) values (10,6,7,1,1,1,false,1);
INSERT INTO vuelo (id,destino_id,origen_id,cant_personas,aerolinea_id,clase_id,escala_incluida,precio) values (11,1,7,1,1,1,false,1);
INSERT INTO vuelo (id,destino_id,origen_id,cant_personas,aerolinea_id,clase_id,escala_incluida,precio) values (12,19,8,1,1,1,false,1);
INSERT INTO vuelo (id,destino_id,origen_id,cant_personas,aerolinea_id,clase_id,escala_incluida,precio) values (13,25,7,1,1,1,false,1);
INSERT INTO vuelo (id,destino_id,origen_id,cant_personas,aerolinea_id,clase_id,escala_incluida,precio) values (14,24,8,1,1,1,false,1);
INSERT INTO vuelo (id,destino_id,origen_id,cant_personas,aerolinea_id,clase_id,escala_incluida,precio) values (15,23,7,1,1,1,false,1);

INSERT INTO paquete(id,hotel_id,vuelo_id) VALUES (1,1,1);
INSERT INTO paquete(id,hotel_id,vuelo_id) VALUES (2,2,2);
INSERT INTO paquete(id,hotel_id,vuelo_id) VALUES (3,3,3);
INSERT INTO paquete(id,hotel_id,vuelo_id) VALUES (4,4,4);

INSERT INTO actividadxpaquete(id_actividad, id_paquete) VALUES (1,1);
INSERT INTO actividadxpaquete(id_actividad, id_paquete) VALUES (2,1);
INSERT INTO actividadxpaquete(id_actividad, id_paquete) VALUES (3,2);
INSERT INTO actividadxpaquete(id_actividad, id_paquete) VALUES (4,2);
INSERT INTO actividadxpaquete(id_actividad, id_paquete) VALUES (5,3);
INSERT INTO actividadxpaquete(id_actividad, id_paquete) VALUES (6,3);
INSERT INTO actividadxpaquete(id_actividad, id_paquete) VALUES (7,4);
INSERT INTO actividadxpaquete(id_actividad, id_paquete) VALUES (8,4);


