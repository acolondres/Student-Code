DROP TABLE IF EXISTS events1;
DROP TABLE IF EXISTS group1;
DROP TABLE IF EXISTS member1;




CREATE TABLE member1(
	member_id serial NOT NULL,
	first_name varchar(100) NOT NULL,
	last_name varchar(100) NOT NULL,
	email varchar(100) NULL,
	phone varchar(100) NULL,
	dob date NOT NULL,
	want_email boolean NULL,
	CONSTRAINT PK_member PRIMARY KEY (member_id)
	
);

CREATE TABLE group1(
	group_name varchar(100) NOT NULL,
	member_id int NOT NULL,
	CONSTRAINT PK_group_name PRIMARY KEY (group_name),
	CONSTRAINT FK_member_id FOREIGN KEY(member_id) REFERENCES member1 (member_id)
	
);

CREATE TABLE events1(
	event_id serial NOT NULL, 
	event_name varchar(100) NOT NULL, 
	event_desc varchar(300) NULL, 
	start_date date NOT NULL, 
	duration int NOT NULL, 
	group_name varchar (100) NOT NULL,
	member_id int NOT NULL,
	CONSTRAINT PK_event_id PRIMARY KEY (event_id),
	CONSTRAINT FK_member_id FOREIGN KEY (member_id) REFERENCES member1 (member_id),
	CONSTRAINT FK_group_name FOREIGN KEY (group_name) REFERENCES group1 (group_name)
	);





INSERT INTO member1 (first_name, last_name, email, phone, dob, want_email) VALUES
	('Andy', 'Colondres', 'andy@gmail.com', '4003002020', '10/17/1996', false),
	('Barto', 'Mondungo', 'bartothedestroyer@yahoo.com', '4003202450', '11/01/1976', true),
	('Glenn', 'Smokers', 'glennkidd@icloud.com', '9375431239', '02/25/1954', false),
	('Nubia', 'Verok', 'nubiav00@gmail.com', '7632862517', '12/21/2001', false),
	('Jimminy', 'Crismiss', 'jimminy21@gmail.com', '210300650', '12/25/1802', false),
	('Devious', 'Snevious', NULL, NULL, '06/06/0666', false),
	('Jessica', 'Colondres', 'jessicawife@gmail.com', '9375218643', '08/24/1995', true),
	('Barack', 'Trump', 'unexpectedlovechild@gmail.com', '9753002186', '04/23/2020', true)
	;
	SELECT * FROM member1;
	
	


	
INSERT INTO group1 (group_name, member_id) VALUES
	('The Rivals', (Select member_id from member1 where first_name = 'Devious'));
	SELECT * FROM group1;
	
INSERT INTO events1 (event_name, event_desc, start_date, duration, group_name, member_id) VALUES
					('Showdown', 'Come see the epic battle', '2022-12-25', 60, 'The Rivals', 5);
					SELECT * FROM events1;
	