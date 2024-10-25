CREATE TABLE IF NOT EXISTS Ideia(

    id_Mensagem BIGINT NOT NULL auto_increment PRIMARY KEY,
    titulo VARCHAR(200),
    curtidas BIGINT not NULL,
    data_hora VARCHAR(50),
    destinatario VARCHAR(250),
    texto VARCHAR(500)

)