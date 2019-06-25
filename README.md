url = https://github.com/srijan2000/java_examples.git  change to below one in .git/config file
url = https://username:password@github.com/srijan2000/java_examples.git


create table employee(
	id INT NOT NULL AUTO_INCREMENT,
	first_name VARCHAR(50),
    last_name VARCHAR(50),
    email_id VARCHAR(128),
	salary double,
	PRIMARY KEY (id)
)
create table customer(
	id INT NOT NULL AUTO_INCREMENT,
	first_name VARCHAR(50),
    last_name VARCHAR(50),
    email_id VARCHAR(128),
	amount double,
	customer_id VARCHAR(10),

	PRIMARY KEY (id)
)