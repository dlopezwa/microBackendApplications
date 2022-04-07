CREATE SEQUENCE HIBERNATE_SEQUENCE START WITH 100 INCREMENT BY 1;

INSERT INTO application (description)
VALUES
('whatsapp'),
('instagram'),
('facebook'),
('telegram'),
('zoom'),
('snapchat');

INSERT INTO functionality (description, url, applicationid)
VALUES
('photography', 'http://11.com', 1),
('video', 'http://12.com', 1),
('chat', 'http://13.com', 1),
('message', 'http://21.com', 2),
('story', 'http://22.com', 2),
('post', 'http://23.com', 2);
