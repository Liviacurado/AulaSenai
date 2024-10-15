USE CEUBINHO;

INSERT INTO ESTUDANTE (NOME_ALUNO,EMAIL,ENDERECO,TELEFONE)
VALUES ('Livia','livia.soares@gmail.com','RUA DAS FLORES,34',61985468767),
		('Pedro Oliveira','pedro.oliveira@email.com','Travessa C 789', 61985745621),
        ('Ana Souza', 'ana.souza@email.com','Praça D, 321', 618542138484);
        
        INSERT INTO PROFESSOR (NOME_PROF,EMAIL,TELEFONE)
        VALUES  ('Carlos Pereira','carlos.pereira@email.com',6184759624),
				('Joao Batista','joao.batista@gmail.com',6194548523),
                ('Matilda Fernandes','matilda.fernandes@gmail.com',61985421632);
                
                INSERT INTO DISCIPLINA (NOME_DISCI,CREDITOS,ID_PROF)
                        VALUES ('Programação orientada a objetos',8,2),
                               ('Programação de dispositivos moveis',9,3),
							  ('Administrador de Bancos de dados',7,1);
                              
                              INSERT INTO DEPARTAMENTO (NOME_DEPARTAMENTO)
                                 VALUES ('Ciência da computação',1),
                                          ('Psicologia',1),
                                          ('Matemática',1);
							   INSERT INTO MATRICULA_DISCIPLINA (ID_DISCI,ID_MATRICULA,SEMESTRE,SALA,TURNO)
                                VALUES (100,2,4,208,'TARDE'),
                                       (101,3,5,210,'MATUTINO'),
                                        (102,2,42,209,'TARDE');
                                