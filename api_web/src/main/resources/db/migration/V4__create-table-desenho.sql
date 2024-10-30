CREATE TABLE IF NOT EXISTS Desenho(
    
    id_mensagem BIGINT NOT NULL auto_increment PRIMARY KEY,
    titulo VARCHAR(200),
    curtidas BIGINT not NULL,
    data_hora DATE,
    destinatario VARCHAR(250),
    tag VARCHAR(250),
    ideia_id BIGINT,

    FOREIGN KEY (ideia_id) REFERENCES Ideia(id_mensagem) ON DELETE CASCADE
)