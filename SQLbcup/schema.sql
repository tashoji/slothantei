
/* Drop Tables */

DROP TABLE IF EXISTS MACHINE_TABLE;




/* Create Tables */

CREATE TABLE MACHINE_TABLE
(
	ID serial NOT NULL,
	MACHINE_NAME varchar NOT NULL,
	CEILING int,
	ZONES varchar,
	RISET varchar,
	FINISH varchar,
	TOTAL_GAME int,
	BIG_GAME int,
	REG_GAME int,
	SET_DIF1 varchar,
	SET_DIF2 varchar,
	SETTING_1 int,
	SETTING_2 int,
	SETTING_3 int,
	SETTING_4 int,
	SETTING_5 int,
	SETTING_6 int
);



