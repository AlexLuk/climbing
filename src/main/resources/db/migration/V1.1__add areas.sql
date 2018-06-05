INSERT INTO area (title)
VALUES ('Paltcevo');
INSERT INTO area (title)
VALUES ('Vozrojdenie');
INSERT INTO crag (title , area_id)
VALUES ('Nizhniy', (SELECT DISTINCT area.area_id from area where area.title = 'Paltcevo' LIMIT 1));
INSERT INTO crag (title , area_id)
VALUES ('Verhniy', (SELECT DISTINCT area.area_id from area where area.title = 'Paltcevo' LIMIT 1));
INSERT INTO crag (title , area_id)
VALUES ('Turist', (SELECT DISTINCT area.area_id from area where area.title = 'Paltcevo' LIMIT 1));
INSERT INTO crag (title , area_id)
VALUES ('Centralny', (SELECT DISTINCT area.area_id from area where area.title = 'Vozrojdenie' LIMIT 1));
