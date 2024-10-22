CREATE TABLE IF NOT EXISTS Desenho(
    
    id_Mensagem BIGINT NOT NULL auto_increment PRIMARY KEY,
    título VARCHAR(200),
    curtidas BIGINT not NULL,
    dataHora DATE,
    destinatario VARCHAR(250),
    id_ideia BIGINT,
    FOREIGN KEY (id_ideia) REFERENCES Ideia(id_ideia)

)