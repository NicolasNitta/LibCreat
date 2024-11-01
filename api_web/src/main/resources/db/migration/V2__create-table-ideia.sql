CREATE TABLE IF NOT EXISTS Ideia(

    id_mensagem BIGINT NOT NULL auto_increment PRIMARY KEY,
    titulo VARCHAR(200),
    curtidas BIGINT not NULL,
    data_hora VARCHAR(50),
    destinatario VARCHAR(250),
    texto VARCHAR(500),
    usuario_id BIGINT,

    FOREIGN KEY (usuario_id) REFERENCES Usuario(id_usuario) ON DELETE SET NULL
)