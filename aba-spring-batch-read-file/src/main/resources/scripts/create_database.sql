-- Drop de la table 
DROP TABLE MODEL1 IF EXISTS;

-- creation de la tble
CREATE TABLE MODEL1 (
  ID           BIGINT IDENTITY   NOT NULL,
  NOM 	       VARCHAR(255)      NOT NULL,
  UNEDATE      DATE 		     NOT NULL,
  VAL          VARCHAR(255)      NOT NULL,
  PRIMARY KEY (ID)
 );
 


 


