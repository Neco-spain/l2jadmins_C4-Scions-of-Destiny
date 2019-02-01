CREATE TABLE IF NOT EXISTS characters (
  account_name varchar(45) DEFAULT NULL,
  obj_Id int(11) NOT NULL DEFAULT 0,
  char_name varchar(35) NOT NULL,
  `level` int(11) DEFAULT NULL,
  maxHp int(11) DEFAULT NULL,
  curHp int(11) DEFAULT NULL,
  curCp int(11) DEFAULT NULL,
  maxMp int(11) DEFAULT NULL,
  curMp int(11) DEFAULT NULL,
  face int(11) DEFAULT NULL,
  hairStyle int(11) DEFAULT NULL,
  hairColor int(11) DEFAULT NULL,
  sex int(11) DEFAULT NULL,
  heading int(11) DEFAULT NULL,
  x int(11) DEFAULT NULL,
  y int(11) DEFAULT NULL,
  z int(11) DEFAULT NULL,
  exp bigint(20) DEFAULT NULL,
  sp int(11) DEFAULT NULL,
  karma int(11) DEFAULT NULL,
  pvpkills int(11) DEFAULT NULL,
  pkkills int(11) DEFAULT NULL,
  clanid int(11) DEFAULT NULL,
  race int(11) DEFAULT NULL,
  classid int(11) DEFAULT NULL,
  base_class int(2) NOT NULL DEFAULT 0,
  deletetime bigint(20) DEFAULT NULL,
  title varchar(16) DEFAULT NULL,
  rec_have int(3) NOT NULL DEFAULT 0,
  rec_left int(3) NOT NULL DEFAULT 0,
  accesslevel int(4) DEFAULT NULL,
  online tinyint(1) DEFAULT NULL,
  onlinetime bigint(20) DEFAULT NULL,
  lastAccess bigint(20) DEFAULT NULL,
  clan_privs int(11) DEFAULT 0,
  wantspeace tinyint(1) DEFAULT 0,
  clan_join_expiry_time bigint(20) NOT NULL DEFAULT 0,
  clan_create_expiry_time bigint(20) NOT NULL DEFAULT 0,
  in_jail tinyint(1) DEFAULT 0,
  jail_timer bigint(20) DEFAULT 0,
  nobless tinyint(1) DEFAULT 0,
  last_recom_date bigint(20) NOT NULL DEFAULT 0,
  varka_ketra_ally tinyint(1) NOT NULL DEFAULT 0,
  PRIMARY KEY  (obj_Id),
  KEY `clanid` (`clanid`)
);