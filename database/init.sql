CREATE TABLE IF NOT EXISTS post (
    id serial not null,
    authorId bigint,
    text varchar(255),
    title varchar(255),
    postedAt timestamp,
    PRIMARY KEY (id)
);