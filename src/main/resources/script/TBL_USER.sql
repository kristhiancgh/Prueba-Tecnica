/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  KRISTHIAN
 */
CREATE TABLE TBL_USER(
    USER_ID     INT(4) NOT NULL AUTO_INCREMENT,
    NAME       VARCHAR(60) NOT NULL,
    LAST_NAME     VARCHAR(60) NOT NULL,
    AGE          INT NOT NULL,
    EMAIL        VARCHAR(50),
    CONSTRAINT PK_TBL_USER PRIMARY KEY (USER_ID)
);

INSERT INTO TBL_USER (NAME, LAST_NAME, AGE, EMAIL) VALUES ('GEOVANNY', 'MENDOZA', 28,'G@a.com');
INSERT INTO TBL_USER (NAME, LAST_NAME, AGE, EMAIL) VALUES ('OMAR', 'BERROTERAN', 27,'O@a.com');
COMMIT;
