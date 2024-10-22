CREATE TABLE IF NOT EXISTS Ideia(

    id_ideia BIGINT NOT NULL auto_increment PRIMARY KEY,
    titulo VARCHAR(200),
    curtidas BIGINT not NULL,
    dataHora DATE,
    destinatario VARCHAR(250),
    texto VARCHAR(500)

)