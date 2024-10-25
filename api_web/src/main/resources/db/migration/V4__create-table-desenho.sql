CREATE TABLE IF NOT EXISTS Desenho(
    
    id_Mensagem BIGINT NOT NULL auto_increment PRIMARY KEY,
    titulo VARCHAR(200),
    curtidas BIGINT not NULL,
    data_hora DATE,
    destinatario VARCHAR(250),
    id_Ideia BIGINT,
    FOREIGN KEY (id_Ideia) REFERENCES Ideia(id_Mensagem)

)