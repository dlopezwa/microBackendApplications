CREATE SEQUENCE HIBERNATE_SEQUENCE START WITH 100 INCREMENT BY 1;

INSERT INTO application (description)
VALUES 
('Trabajos'),
('Incidencias');

INSERT INTO functionality (description, url, applicationid)
VALUES
('Function1','http://localhost:4200/app1/function1', 1),
('Function2', 'http://localhost:4200/app1/function2',1),
('Function1', 'http://localhost:4202/app1/function1',2),
('Function2', 'http://localhost:4202/app2/function2',2),
('Function3', 'http://localhost:4202/app3/function3',2);