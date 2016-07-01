-- creation de la tble
CREATE TABLE IF NOT EXISTS MODEL1 (
  ID             BIGINT        NOT NULL AUTO_INCREMENT,
  NOM 	         VARCHAR(255)  NOT NULL,
  UNEDATE        DATE 		   NOT NULL,
  VAL            VARCHAR(255)  NOT NULL,
  IDJOBINSTANCE  BIGINT        NOT NULL,
  DATEMODIF      DATE 		   NOT NULL,
  PRIMARY KEY (ID)
 );
 


 


