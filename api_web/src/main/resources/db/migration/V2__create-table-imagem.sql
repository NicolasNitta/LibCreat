CREATE TABLE IF NOT EXISTS Imagem (

    id_Mensagem BIGINT NOT NULL auto_increment PRIMARY KEY,
    título VARCHAR(200),
    curtidas BIGINT not NULL,
    dataHora DATETIME,
    destinatario VARCHAR(250),
    texto_url VARCHAR(500)

)