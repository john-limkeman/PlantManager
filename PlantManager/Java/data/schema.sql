BEGIN TRANSACTION;

DROP TABLE IF EXISTS plants;
DROP TABLE IF EXISTS users;
DROP SEQUENCE IF EXISTS seq_user_id;

CREATE SEQUENCE seq_user_id
  INCREMENT BY 1
  NO MAXVALUE
  NO MINVALUE
  CACHE 1;

CREATE TABLE users (
	user_id int DEFAULT nextval('seq_user_id'::regclass) NOT NULL,
	username varchar(50) NOT NULL,
	password_hash varchar(200) NOT NULL,
	role varchar(50) NOT NULL,
	CONSTRAINT PK_user PRIMARY KEY (user_id)
);

CREATE TABLE plants (
        id serial NOT NULL,
        user_id int NOT NULL,
        name varchar(64) NOT NULL,
        water_rate int,
        sunlight_pref varchar {64},
        date_planted date,
        date_flowered date,
        date_produced date,
        plot,
        CONSTRAINT PK_id PRIMARY KEY (id),
        CONSTRAINT fk_user_id foreign key (user_id) references users (user_id)
);

COMMIT TRANSACTION;
