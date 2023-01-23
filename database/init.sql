CREATE TABLE IF NOT EXISTS postdb (
    id bigint,
    authorId bigint,
    text varchar(255),
    postedAt timestamp,
    PRIMARY KEY (id)
);