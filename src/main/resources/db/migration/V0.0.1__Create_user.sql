
CREATE TABLE users(
   id  SERIAL PRIMARY KEY ,
   email TEXT NOT NULL,
   username TEXT NOT NULL ,
   password TEXT NOT NULL ,
   name TEXT NOT NULL
);