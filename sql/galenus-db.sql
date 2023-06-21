DROP SCHEMA IF EXISTS galenus;

CREATE SCHEMA galenus;

CREATE TABLE galenus.paciente(
	documento			varchar(14),
	nome				varchar(50),
	nascimento			date,
	sexo				char,
	telefone			varchar(11),
    	endereco			varchar(50),
	CONSTRAINT PK_Paciente PRIMARY KEY(documento)
);

CREATE TABLE galenus.funcionario(
	documento			varchar(14),
	nome				varchar(50),
    	nascimento			date,
	telefone			varchar(11),
    endereco			varchar(50),
	email				varchar(50),
    senha				varchar(30),
	CONSTRAINT PK_Paciente PRIMARY KEY(documento)
);

CREATE TABLE galenus.medico(
	crm					varchar(8),
    especialidade		varchar(50),
	documento 			varchar(14),
	CONSTRAINT PK_Medico PRIMARY KEY(crm),
    CONSTRAINT FK_Func_Doc FOREIGN KEY(documento)
		REFERENCES galenus.funcionario(documento)
		ON DELETE CASCADE
);

CREATE TABLE galenus.agenda(
	id					int auto_increment,
    telefone			varchar(11),
	data_hora			timestamp,
	medico_crm			varchar(8),
    paciente_doc		varchar(14),
    pagamento			varchar(20),
	CONSTRAINT PK_Agenda PRIMARY KEY(id),
	CONSTRAINT FK_Med_Crm FOREIGN KEY(medico_crm)
		REFERENCES galenus.medico(crm),
	CONSTRAINT FK_Pac_Doc FOREIGN KEY(paciente_doc)
		REFERENCES galenus.paciente(documento)
);

CREATE INDEX Idx_Data_Hora ON galenus.agenda(data_hora);

CREATE TABLE galenus.agenda_primeira(
	id					int auto_increment,
    telefone			varchar(11),
	data_hora			timestamp,
	medico_crm			varchar(8),
    paciente_nome		varchar(40),
	CONSTRAINT PK_Agenda PRIMARY KEY(id),
	CONSTRAINT FK_Med_Crm_Primeira FOREIGN KEY(medico_crm)
		REFERENCES galenus.medico(crm)
);

CREATE TABLE galenus.consulta(
	id					int auto_increment,
    conduta				text,
    tratamento			text,
    hist_clinica		text,
    motivo_cons			text,
	diagostico			text,
    doencas_cron		text,
    medico_crm			varchar(8),
	data_hora			timestamp,
	paciente_documento	varchar(14),
    CONSTRAINT PK_Consulta PRIMARY KEY(id),
    CONSTRAINT FK_Data_Hora_Agenda FOREIGN KEY(data_hora)
		REFERENCES galenus.agenda(data_hora),
	CONSTRAINT FK_Pac_Doc_Cons FOREIGN KEY(paciente_documento)
		REFERENCES galenus.paciente(documento),
	CONSTRAINT FK_Med_Doc_Cons FOREIGN KEY(medico_crm)
		REFERENCES galenus.medico(crm)
);

CREATE TABLE galenus.log_data(
	id					int auto_increment,
    data_hora			timestamp,
    ip_maquina			varchar(20),
    func_doc			varchar(14),
    CONSTRAINT PK_Log PRIMARY KEY(id),
    CONSTRAINT FK_Func_Doc_Log FOREIGN KEY(func_doc)
		REFERENCES galenus.funcionario(documento)
);