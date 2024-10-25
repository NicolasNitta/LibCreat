CREATE TABLE IF NOT EXISTS Usuario (

    id_Usuario BIGINT NOT NULL auto_increment,
    nickname VARCHAR(250) NOT NULL,
    email VARCHAR(50) NOT NULL,
    nome VARCHAR(250) NOT NULL,
    descricao VARCHAR (500) NOT NULL,
    seguidores BIGINT NOT NULL,
    senha VARCHAR(30) NOT NULL,
    
    PRIMARY KEY(id_Usuario)
)