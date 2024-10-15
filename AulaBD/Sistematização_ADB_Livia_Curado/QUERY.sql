USE CEUBINHO;
-- query para achar o nome 'Joao Batista ' na tabela professor e apresentar juntamente com o id 
SELECT ID_PROF,NOME_PROF
	FROM PROFESSOR
		WHERE NOME_PROF = 'Joao Batista';
        -- query que faz junção de duas tabelas
	SELECT *
	FROM MATRICULA_DISCIPLINA 
    CROSS JOIN ESTUDANTE;
    
    -- CRIA UMA VIEWS QUE JUNTA AS DUAS TABELAS 
    CREATE VIEW LISTA AS
    SELECT NOME_PROF,NOME_ALUNO
	FROM ESTUDANTE, PROFESSOR
		

        