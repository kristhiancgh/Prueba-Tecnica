/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  KRISTHIAN
 */
CREATE TABLE TBL_USER(
    USER_ID            NUMERIC(4) NOT NULL,
    NAME       VARCHAR2(60) NOT NULL,
    LAST_NAME     VARCHAR2(60) NOT NULL,
    AGE          INTEGER NOT NULL,
    EMAIL        VARCHAR2(50),
    CONSTRAINT PK_TBL_USER PRIMARY KEY (USER_ID)
);

CREATE SEQUENCE SEQ_TBL_USER;

INSERT INTO TBL_USER (USER_ID, NAME, LASTNAME, AGE, EMAIL) VALUES (SEQ_TBL_USER.NEXTVAL, 'GEOVANNY', 'MENDOZA', 28,'G@a.com');
INSERT INTO TBL_USER (USER_ID, NAME, LASTNAME, AGE, EMAIL) VALUES (SEQ_TBL_USER.NEXTVAL, 'OMAR', 'BERROTERAN', 27,'O@a.com');
COMMIT;
