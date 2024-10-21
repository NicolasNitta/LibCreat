CREATE TABLE IF NOT EXISTS Ideia{

    id_Mensagem BIGINT NOT NULL auto_increment PRIMARY KEY,
    titulo VARCHAR(200),
    curtidas BIGINT not NULL,
    dataHora DATETIME,
    destinatario VARCHAR(250),
    texto VARCHAR(500)

}