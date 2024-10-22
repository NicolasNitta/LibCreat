CREATE TABLE IF NOT EXISTS Imagem (

    id_Mensagem BIGINT NOT NULL auto_increment PRIMARY KEY,
    titulo VARCHAR(200),
    curtidas BIGINT not NULL,
    dataHora DATE,
    destinatario VARCHAR(250),
    texto_url VARCHAR(500)

)

