BEGIN TRANSACTION;

DROP TABLE IF EXISTS plants;
DROP TABLE IF EXISTS gardens;
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

INSERT INTO users (user_id, username, password_hash, role) VALUES (1, 'user', 'pass', 'admin');

CREATE TABLE gardens (
        id serial NOT NULL,
        user_id int NOT NULL,
        plot1 boolean,
        plot2 boolean,
        plot3 boolean,
        plot4 boolean,
        plot5 boolean,
        plot6 boolean,
        plot7 boolean,
        plot8 boolean,
        plot9 boolean,
        plot10 boolean,
        plot11 boolean,
        plot12 boolean,
        plot13 boolean,
        plot14 boolean,
        plot15 boolean,
        plot16 boolean,
        plot17 boolean,
        plot18 boolean,
        plot19 boolean,
        plot20 boolean,
        plot21 boolean,
        plot22 boolean,
        plot23 boolean,
        plot24 boolean,
        plot25 boolean,
        plot26 boolean,
        plot27 boolean,
        plot28 boolean,
        plot29 boolean,
        plot30 boolean,
        plot31 boolean,
        plot32 boolean,
        plot33 boolean,
        plot34 boolean,
        plot35 boolean,
        plot36 boolean,
        plot37 boolean,
        plot38 boolean,
        plot39 boolean,
        plot40 boolean,
        plot41 boolean,
        plot42 boolean,
        plot43 boolean,
        plot44 boolean,
        plot45 boolean,
        plot46 boolean,
        plot47 boolean,
        plot48 boolean,
        plot49 boolean,
        plot50 boolean,
        plot51 boolean,
        plot52 boolean,
        plot53 boolean,
        plot54 boolean,
        plot55 boolean,
        plot56 boolean,
        plot57 boolean,
        plot58 boolean,
        plot59 boolean,
        plot60 boolean,
        plot61 boolean,
        plot62 boolean,
        plot63 boolean,
        plot64 boolean,
        plot65 boolean,
        plot66 boolean,
        plot67 boolean,
        plot68 boolean,
        plot69 boolean,
        plot70 boolean,
        plot71 boolean,
        plot72 boolean,
        plot73 boolean,
        plot74 boolean,
        plot75 boolean,
        plot76 boolean,
        plot77 boolean,
        plot78 boolean,
        plot79 boolean,
        plot80 boolean,
        plot81 boolean,
        plot82 boolean,
        plot83 boolean,
        plot84 boolean,
        plot85 boolean,
        plot86 boolean,
        plot87 boolean,
        plot88 boolean,
        plot89 boolean,
        plot90 boolean,
        plot91 boolean,
        plot92 boolean,
        plot93 boolean,
        plot94 boolean,
        plot95 boolean,
        plot96 boolean,
        plot97 boolean,
        plot98 boolean,
        plot99 boolean,
        plot100 boolean, 
        CONSTRAINT pk_gardens_id PRIMARY KEY (id),
        CONSTRAINT fk_gardens_user_id foreign key (user_id) references users (user_id)
);

INSERT INTO gardens (user_id) VALUES (1);

CREATE TABLE plants (
        id serial NOT NULL,
        user_id int NOT NULL,
        garden_id int,
        name varchar(64) NOT NULL,
        water_rate int,
        sunlight_pref varchar (64),
        --date_planted date,
        --date_flowered date,
        --date_produced date,
        plot int,
        CONSTRAINT PK_id PRIMARY KEY (id),
        CONSTRAINT fk_user_id foreign key (user_id) references users (user_id)
);

INSERT INTO plants (user_id, garden_id, name, water_rate, plot) VALUES (1, 1, 'Jeff', 2, 7);

COMMIT TRANSACTION;
