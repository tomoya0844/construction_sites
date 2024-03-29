DROP TABLE IF EXISTS construction_sites;

CREATE TABLE construction_sites (
  id INT unsigned AUTO_INCREMENT,
  site_name VARCHAR(100) NOT NULL,
  zipcode　VARCHAR(8) NOT NULL,
  address　VARCHAR(100) NOT NULL,
  created_at DATETIME NOT NULL CURRENT_TIMESTAMP,
  updated_at DATETIME NOT NULL CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY(id)
);
