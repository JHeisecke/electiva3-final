create table MEDICO (
CI varchar(255) primary key,
APELLIDO varchar(255),
NOMBRE varchar(255),
FEC_NACIMIENTO date
);

create table HOSPITAL (
ID_HOSPITAL bigserial primary key,
NOMBRE varchar(255),
CIUDAD varchar(255),
TELEFONO varchar(255),
DIRECTOR varchar(255) references MEDICO(CI)
);

create table SERVICIO (
ID_SERVICIO varchar(255) primary key,
NOMBRE varchar(255),
COMENTARIO varchar(255)
);

create table MEDICO_HOSPITAL (
CI_MEDICO varchar(255) references MEDICO(CI),
ID_HOSPITAL bigint references HOSPITAL(ID_HOSPITAL),
OCUPA_DIRECCION boolean,
PRIMARY KEY (CI_MEDICO, ID_HOSPITAL)
);

create table HOSPITAL_SERVICIO (
ID_SERVICIO varchar(255) references SERVICIO(ID_SERVICIO),
ID_HOSPITAL bigint references HOSPITAL(ID_HOSPITAL),
CAMAS_DISPONIBLES bigint,
CAMAS_TOTAL bigint,
PRIMARY KEY (ID_SERVICIO, ID_HOSPITAL)
);

create table SERVICIO_MEDICO (
ID_SERVICIO varchar(255) references SERVICIO(ID_SERVICIO),
CI_MEDICO varchar(255) references MEDICO(CI),
PRIMARY KEY (ID_SERVICIO, CI_MEDICO)
);

create table PACIENTE (
CI varchar(255) primary key,
APELLIDO varchar(255),
NOMBRE varchar(255),
FEC_NACIMIENTO date
);

create table CONSULTA_MEDICA (
ID_CONSULTA bigserial primary key,
ID_HOSPITAL bigint references HOSPITAL(ID_HOSPITAL),
ID_SERVICIO varchar(255) references SERVICIO(ID_SERVICIO),
CI_MEDICO varchar(255) references MEDICO(CI),
OBSERVACION varchar(255),
TRATAMIENTO varchar(255),
NRO_HABITACION varchar(255),
FEC_INGRESO time,
FEC_SALIDA time,
INTERNACION boolean
);

create table HISTORIAL_CLINICO (
ID_HISTORIAL bigserial primary key,
CI_PACIENTE varchar(255) references PACIENTE(CI),
ID_CONSULTA bigint references CONSULTA_MEDICA(ID_CONSULTA)
);

