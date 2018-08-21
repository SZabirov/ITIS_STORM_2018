CREATE TABLE poll(
	id SERIAL,
	question VARCHAR(255)
);

CREATE TABLE option(
	id SERIAL,
	text VARCHAR(255),
	poll_id INTEGER,
	votes_count INTEGER
);

INSERT INTO poll (question) VALUES ('Ваш возраст');
INSERT INTO poll (question) VALUES ('Ваше образование');

INSERT INTO option (text, poll_id, votes_count) VALUES ('<=18', 1, 0);
INSERT INTO option (text, poll_id, votes_count) VALUES ('>18', 1, 0);
INSERT INTO option (text, poll_id, votes_count) VALUES ('Неоконченное среднее', 2, 0);
INSERT INTO option (text, poll_id, votes_count) VALUES ('Среднее', 2, 0);