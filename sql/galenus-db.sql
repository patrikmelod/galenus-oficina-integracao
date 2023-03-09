CREATE SCHEMA galenus;

CREATE TABLE galenus.medico(
	crm					varchar(8),
	nome 				varchar(50),
	especialidade		varchar(50),
	telefone			varchar(11),
	email				varchar(50),
	CONSTRAINT PK_Medico PRIMARY KEY(crm)
);

CREATE TABLE galenus.paciente(
	documento			varchar(14),
	nome				varchar(50),
	idade				int,
	sexo				char,
	plano_saude			varchar(50),
	telefone			varchar(11),
	email				varchar(50),
	CONSTRAINT PK_Paciente PRIMARY KEY(documento)
);

CREATE TABLE galenus.funcionario(
	documento			varchar(14),
	nome				varchar(50),
	telefone			varchar(11),
	email				varchar(50),
	CONSTRAINT PK_Paciente PRIMARY KEY(documento)
);

CREATE TABLE galenus.consulta(
	id					serial,
	data				date,
	hora				hour,
	medico_nome			varchar(50),
	medico_crm			varchar(8),
	paciente_nome		varchar(50),
	paciente_documento	varchar(14),
	sintomas			text,
	diagostico			text,
	CONSTRAINT PK_Consulta PRIMARY KEY(id),
	CONSTRAINT FK_Med_Nome FOREIGN KEY(medico_nome)
		REFERENCES galenus.medico(nome)
		ON DELETE CASCADE,
	CONSTRAINT FK_Med_Crm FOREIGN KEY(medico_crm)
		REFERENCES galenus.medico(crm)
		ON DELETE CASCADE,
	CONSTRAINT FK_Pac_Nome FOREIGN KEY(paciente_nome)
		REFERENCES galenus.paciente(nome)
		ON DELETE CASCADE,
	CONSTRAINT FK_Pac_Doc FOREIGN KEY(paciente_documento)
		REFERENCES galenus.paciente(documento)
		ON DELETE CASCADE
);

CREATE TABLE galenus.login(
	email		varchar(50),
	senha		varchar(30)
	CONSTRAINT PK_Login PRIMARY KEY(email)
);