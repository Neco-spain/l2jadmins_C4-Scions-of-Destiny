DROP TABLE IF EXISTS mdt_bets;
CREATE TABLE IF NOT EXISTS `mdt_bets` (
  `lane_id` tinyint(1) DEFAULT 0,
  `bet` int DEFAULT 0,
  PRIMARY KEY (`lane_id`)
);

INSERT INTO `mdt_bets` VALUES
('1','0'),
('2','0'),
('3','0'),
('4','0'),
('5','0'),
('6','0'),
('7','0'),
('8','0');