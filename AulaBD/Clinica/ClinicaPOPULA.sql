USE CLINICA2;
INSERT INTO MEDICO ( NUMEROCRM, ESTADOCRM,NOMEMED) 
VALUES (784348,'BA','JOÃO JOSE'),
	   (852415,'PE', 'ANA MARIA'),
        (852419,'BA', 'JOANA SILVA');
        
	INSERT INTO PACIENTE ( NOMEPAC, DATANASCIMENTO, SEXO, CEP, CIDADE, ESTADO, COMPLEMENTO )
    VALUES ( 'ROSILDA', '1987-06-09', 'F', '70564300', 'BRASILIA','DF',''),
          ( 'LUZIA ', '1987-08-29', 'F', '70564310', 'BRASILIA','DF',''),
         ( 'LUANA ', '1997-03-11', 'F', '70564620', 'BRASILIA','DF',''),
         ( 'JOSEFA ', '1999-01-19', 'F', '7056484', 'BRASILIA','DF',''),
          ( 'JULIA ', '1999-01-19', 'F', '7056484', 'BRASILIA','DF',''),
		  ( 'GABRIEL', '1999-01-19', 'F', '7056484', 'BRASILIA','DF','');      
          
INSERT INTO ESPECIALIDADE (	NOMEESPEC)
VALUES ( 'CLINICO GERAL'),
       ( 'PEDIATRA'),
       ( 'GINECOLOGISTA');
       
       INSERT INTO POSSUIESPECIALIDADE (IDESPEC, NUMEROCRM, ESTADOCRM)
       VALUES (2,852419,'BA');
       
       INSERT INTO CONSULTA ( DATAHORA, ESTADOCRM, NUMEROCRM, IDPACIENTE)
         VALUES ( ' 2024-07-02','PE','852415',' 2');
         
             INSERT INTO TELEFONE ( TELEFONE,IDPACIENTE )
             VALUES ( '61985468767 ',8),
                     ( '61987674534',9),
                     (' 61999342567',3);
                     
	INSERT INTO RECEITA ( IDCONS,DESCRICAO)
    VALUES ( 1,''),
            (1,'REPOUSO 3 DIAS ');
            
            INSERT INTO MEDICAMENTOPRES ( MEDICAMENTO, IDRECEITA )
                 VALUES ( 'SETRALINA ',1),
                        ( 'NIMESULIDA',1);
            
            
             