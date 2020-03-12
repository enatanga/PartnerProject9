-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: employee
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `deportment`
--

DROP TABLE IF EXISTS `deportment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `deportment` (
  `DEPORTMENT_ID` int NOT NULL AUTO_INCREMENT,
  `DEPORTMENT_NAME` varchar(35) NOT NULL,
  PRIMARY KEY (`DEPORTMENT_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=382 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `deportment`
--

LOCK TABLES `deportment` WRITE;
/*!40000 ALTER TABLE `deportment` DISABLE KEYS */;
INSERT INTO `deportment` VALUES (74,'wewe'),(75,'qwqw'),(76,'Ghulam'),(77,'Ghulam'),(78,'Ghulam'),(79,'Ghulam'),(80,'Ghulam'),(81,'Ghulam'),(82,'Ghulam'),(83,'Ghulam'),(84,''),(85,'wew'),(86,'wqw'),(87,'wq'),(88,''),(89,''),(90,''),(91,''),(92,''),(93,''),(94,''),(95,''),(96,''),(97,''),(98,''),(99,''),(100,''),(101,''),(102,''),(103,''),(104,''),(105,''),(106,'ewewe'),(107,'ewewe'),(108,'ewewe'),(109,'dsd'),(110,'dsd'),(111,'dsd'),(112,'dsd'),(113,'dsd'),(114,'dsd'),(115,'dsd'),(116,'dsd'),(117,'dsd'),(118,'dsd'),(119,'dsd'),(120,'dsd'),(121,'dsd'),(122,'dsd'),(123,'dsd'),(124,'dsd'),(125,'dsd'),(126,'dsd'),(127,'dsd'),(128,'dsd'),(129,'dsd'),(130,'dsd'),(131,'dsd'),(132,'dsd'),(133,'dsd'),(134,'dsd'),(135,'dsd'),(136,'dsd'),(137,'dsd'),(138,'dsd'),(139,'dsd'),(140,'dsd'),(141,'dsd'),(142,'dsd'),(143,'dsd'),(144,'dsd'),(145,'dsd'),(146,'dsd'),(147,'dsd'),(148,'dsd'),(149,'dsd'),(150,'dsd'),(151,'qwwq'),(152,'qwqw'),(153,'qwqw'),(154,'qwqw'),(155,'qwqw'),(156,'qwqw'),(157,'qwqw'),(158,'qwqw'),(159,'qwqw'),(160,'qwqw'),(161,'qwqw'),(162,'qwqw'),(163,'qwqw'),(164,'qwqw'),(165,'qwqw'),(166,'qwqw'),(167,'qwqw'),(168,'qwqw'),(169,'qwqw'),(170,'qwqw'),(171,'qwqw'),(172,'qwqw'),(173,'qwqw'),(174,'qwqw'),(175,'qwqw'),(176,'qwqw'),(177,'qwqw'),(178,'qwqw'),(179,'qwqw'),(180,'qwqw'),(181,'qwqw'),(182,'qwqw'),(183,'qwqw'),(184,'qwqw'),(185,'qwqw'),(186,'qwqw'),(187,'qwqw'),(188,'weew'),(189,'weew'),(190,'weew'),(191,'weew'),(192,'weew'),(193,'weew'),(194,'weew'),(195,'weew'),(196,'weew'),(197,'weew'),(198,'weew'),(199,'weew'),(200,'weew'),(201,'weew'),(202,'weew'),(203,'weew'),(204,'weew'),(205,'weew'),(206,'weew'),(207,'weew'),(208,'weew'),(209,'weew'),(210,'weew'),(211,'weew'),(212,'weew'),(213,'weew'),(214,'weew'),(215,'weew'),(216,'weew'),(217,'weew'),(218,'weew'),(219,'wqwq'),(220,'wqwq'),(221,'wqwq'),(222,'wqwq'),(223,'wqwq'),(224,'wqwq'),(225,'wqwq'),(226,'wqwq'),(227,'wqwq'),(228,'wqwq'),(229,'wqwq'),(230,'wqwq'),(231,'wqwq'),(232,'wqwq'),(233,'wqwq'),(234,'wqwq'),(235,'wqwq'),(236,'wqwq'),(237,'wqwq'),(238,'wqwq'),(239,'wqwq'),(240,'wqwq'),(241,'wqwq'),(242,'wqwq'),(243,'wqwq'),(244,'wqwq'),(245,'wqwq'),(246,'wqwq'),(247,'wqwq'),(248,'wqwq'),(249,'wqwq'),(250,'wqwq'),(251,'wqwq'),(252,'wqwq'),(253,'wqwq'),(254,'wqwq'),(255,'wqwq'),(256,'wqwq'),(257,'wqwq'),(258,'wqwq'),(259,'wqwq'),(260,'wqwq'),(261,'wqwq'),(262,'wqwq'),(263,'wqwq'),(264,'wqwq'),(265,'wqwq'),(266,'wqwq'),(267,'wqwq'),(268,'wqwq'),(269,'wqwq'),(270,'wqwq'),(271,'wqwq'),(272,'wqwq'),(273,'wqwq'),(274,'wqwq'),(275,'wqwq'),(276,'wqwq'),(277,'wqwq'),(278,'wqwq'),(279,'wqwq'),(280,'wqwq'),(281,'wqwq'),(282,'wqwq'),(283,'wqwq'),(284,'wqwq'),(285,'wqwq'),(286,'wqwq'),(287,'wqwq'),(288,'wqwq'),(289,'wqwq'),(290,'wqwq'),(291,'wqwq'),(292,'wqwq'),(293,'wqwq'),(294,'wqwq'),(295,'wqwq'),(296,'wqwq'),(297,'wqwq'),(298,'wqwq'),(299,'wqwq'),(300,'wqwq'),(301,'wqwq'),(302,'wqwq'),(303,'wqwq'),(304,'wqwq'),(305,'wqwq'),(306,'wqwq'),(307,'wqwq'),(308,'wqwq'),(309,'wqwq'),(310,'wqwq'),(311,'wqwq'),(312,'wqwq'),(313,'wqwq'),(314,'wqwq'),(315,'wqwq'),(316,'wqwq'),(317,'wqwq'),(318,'wqwq'),(319,'wqwq'),(320,'wqwq'),(321,'wqwq'),(322,'wqwq'),(323,'wqwq'),(324,'wqwq'),(325,'wqwq'),(326,'wqwq'),(327,'wqwq'),(328,'wqwq'),(329,'wqwq'),(330,'wqwq'),(331,'wqwq'),(332,'wqwq'),(333,'wqwq'),(334,'wqwq'),(335,'wqwq'),(336,'wqwq'),(337,'wqwq'),(338,'wqwq'),(339,'wqwq'),(340,'wqwq'),(341,'wqwq'),(342,'wqwq'),(343,'wqwq'),(344,'wqwq'),(345,'wqwq'),(346,'wqwq'),(347,'ewe'),(348,'ewe'),(349,'ewe'),(350,'Ghulam'),(351,''),(352,''),(353,''),(354,'wewewe'),(355,'sdsdsds'),(356,'sdsdsds'),(357,'sdsdsds'),(358,'Ahmad'),(359,''),(360,'Ghulam'),(361,''),(362,''),(363,''),(364,'dsds'),(365,'dsds'),(366,'dsds'),(367,'dsds'),(368,'dsds'),(369,'dsds'),(370,'asasa'),(371,'asasa'),(372,'sdsds'),(373,'sdsds'),(374,'sdsds'),(375,''),(376,''),(377,'ewewe'),(378,'wqw'),(379,'qwqw'),(380,'ew'),(381,'Mike');
/*!40000 ALTER TABLE `deportment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee_details`
--

DROP TABLE IF EXISTS `employee_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee_details` (
  `LIST_ID` int NOT NULL AUTO_INCREMENT,
  `LIST_NAME` varchar(30) DEFAULT NULL,
  `HIRED_DATE` date DEFAULT NULL,
  `DEPORTMENT_ID` int DEFAULT NULL,
  PRIMARY KEY (`LIST_ID`),
  KEY `DEPORTMENT_ID` (`DEPORTMENT_ID`),
  CONSTRAINT `employee_details_ibfk_1` FOREIGN KEY (`DEPORTMENT_ID`) REFERENCES `deportment` (`DEPORTMENT_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=309 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee_details`
--

LOCK TABLES `employee_details` WRITE;
/*!40000 ALTER TABLE `employee_details` DISABLE KEYS */;
INSERT INTO `employee_details` VALUES (1,'wew','2020-11-13',74),(2,'wqq','2020-11-12',75),(3,'supervisor','2019-12-11',76),(4,'supervisor','2019-12-11',77),(5,'Manager','2020-11-12',78),(6,'Manager','2020-11-12',79),(7,'Manager','2020-11-12',80),(8,'Manager','2020-11-12',81),(9,'Manager','2020-11-12',82),(10,'Manager','2020-11-12',83),(11,'','2020-03-04',84),(12,'wew','2020-11-12',85),(13,'ww','2020-12-11',86),(14,'qwq','2020-12-11',87),(15,'wqw','2020-11-11',88),(16,'wqw','2020-11-11',89),(17,'wqw','2020-11-11',90),(18,'wqw','2020-11-11',91),(19,'wqw','2020-11-11',92),(20,'wqw','2020-11-11',93),(21,'wqw','2020-11-11',94),(22,'wqw','2020-11-11',95),(23,'wqw','2020-11-11',96),(24,'wqw','2020-11-11',97),(25,'wqw','2020-11-11',98),(26,'wqw','2020-11-11',99),(27,'wqw','2020-11-11',100),(28,'wqw','2020-11-11',101),(29,'wqw','2020-11-11',102),(30,'wqw','2020-11-11',103),(31,'wqw','2020-11-11',104),(32,'wqw','2020-11-11',105),(33,'dsd','2020-11-11',106),(34,'dsd','2020-11-11',107),(35,'dsd','2020-11-11',108),(36,'dsd','2020-11-11',109),(37,'dsd','2020-11-11',110),(38,'dsd','2020-11-11',111),(39,'dsd','2020-11-11',112),(40,'dsd','2020-11-11',113),(41,'dsd','2020-11-11',114),(42,'dsd','2020-11-11',115),(43,'dsd','2020-11-11',116),(44,'dsd','2020-11-11',117),(45,'dsd','2020-11-11',118),(46,'dsd','2020-11-11',119),(47,'dsd','2020-11-11',120),(48,'dsd','2020-11-11',121),(49,'dsd','2020-11-11',122),(50,'dsd','2020-11-11',123),(51,'dsd','2020-11-11',124),(52,'dsd','2020-11-11',125),(53,'dsd','2020-11-11',126),(54,'dsd','2020-11-11',127),(55,'dsd','2020-11-11',128),(56,'dsd','2020-11-11',129),(57,'dsd','2020-11-11',130),(58,'dsd','2020-11-11',131),(59,'dsd','2020-11-11',132),(60,'dsd','2020-11-11',133),(61,'dsd','2020-11-11',134),(62,'dsd','2020-11-11',135),(63,'dsd','2020-11-11',136),(64,'dsd','2020-11-11',137),(65,'dsd','2020-11-11',138),(66,'dsd','2020-11-11',139),(67,'dsd','2020-11-11',140),(68,'dsd','2020-11-11',141),(69,'dsd','2020-11-11',142),(70,'dsd','2020-11-11',143),(71,'dsd','2020-11-11',144),(72,'dsd','2020-11-11',145),(73,'dsd','2020-11-11',146),(74,'dsd','2020-11-11',147),(75,'dsd','2020-11-11',148),(76,'dsd','2020-11-11',149),(77,'dsd','2020-11-11',150),(78,'wqw','2020-11-12',151),(79,'wqw','2019-11-11',152),(80,'wqw','2019-11-11',153),(81,'wqw','2019-11-11',154),(82,'wqw','2019-11-11',155),(83,'wqw','2019-11-11',156),(84,'wqw','2019-11-11',157),(85,'wqw','2019-11-11',158),(86,'wqw','2019-11-11',159),(87,'wqw','2019-11-11',160),(88,'wqw','2019-11-11',161),(89,'wqw','2019-11-11',162),(90,'wqw','2019-11-11',163),(91,'wqw','2019-11-11',164),(92,'wqw','2019-11-11',165),(93,'wqw','2019-11-11',166),(94,'wqw','2019-11-11',167),(95,'wqw','2019-11-11',168),(96,'wqw','2019-11-11',169),(97,'wqw','2019-11-11',170),(98,'wqw','2019-11-11',171),(99,'wqw','2019-11-11',172),(100,'wqw','2019-11-11',173),(101,'wqw','2019-11-11',174),(102,'wqw','2019-11-11',175),(103,'wqw','2019-11-11',176),(104,'wqw','2019-11-11',177),(105,'wqw','2019-11-11',181),(106,'wqw','2019-11-11',179),(107,'wqw','2019-11-11',178),(108,'wqw','2019-11-11',180),(109,'wqw','2019-11-11',185),(110,'wqw','2019-11-11',184),(111,'wqw','2019-11-11',182),(112,'wqw','2019-11-11',186),(113,'wqw','2019-11-11',183),(114,'wqw','2019-11-11',187),(115,'we','2017-11-12',188),(116,'we','2017-11-12',189),(117,'we','2017-11-12',190),(118,'we','2017-11-12',191),(119,'we','2017-11-12',192),(120,'we','2017-11-12',193),(121,'we','2017-11-12',194),(122,'we','2017-11-12',195),(123,'we','2017-11-12',196),(124,'we','2017-11-12',197),(125,'we','2017-11-12',198),(126,'we','2017-11-12',199),(127,'we','2017-11-12',200),(128,'we','2017-11-12',201),(129,'we','2017-11-12',202),(130,'we','2017-11-12',203),(131,'we','2017-11-12',204),(132,'we','2017-11-12',205),(133,'we','2017-11-12',206),(134,'we','2017-11-12',207),(135,'we','2017-11-12',208),(136,'we','2017-11-12',209),(137,'we','2017-11-12',210),(138,'we','2017-11-12',211),(139,'we','2017-11-12',212),(140,'we','2017-11-12',213),(141,'we','2017-11-12',214),(142,'we','2017-11-12',215),(143,'we','2017-11-12',216),(144,'we','2017-11-12',217),(145,'we','2017-11-12',218),(146,'qwqw','0209-11-12',219),(147,'qwqw','0209-11-12',220),(148,'qwqw','0209-11-12',221),(149,'qwqw','0209-11-12',222),(150,'qwqw','0209-11-12',223),(151,'qwqw','0209-11-12',224),(152,'qwqw','0209-11-12',225),(153,'qwqw','0209-11-12',226),(154,'qwqw','0209-11-12',227),(155,'qwqw','0209-11-12',228),(156,'qwqw','0209-11-12',229),(157,'qwqw','0209-11-12',230),(158,'qwqw','0209-11-12',231),(159,'qwqw','0209-11-12',232),(160,'qwqw','0209-11-12',233),(161,'qwqw','0209-11-12',234),(162,'qwqw','0209-11-12',235),(163,'qwqw','0209-11-12',236),(164,'qwqw','0209-11-12',237),(165,'qwqw','0209-11-12',238),(166,'qwqw','0209-11-12',239),(167,'qwqw','0209-11-12',240),(168,'qwqw','0209-11-12',241),(169,'qwqw','0209-11-12',242),(170,'qwqw','0209-11-12',243),(171,'qwqw','0209-11-12',244),(172,'qwqw','0209-11-12',245),(173,'qwqw','0209-11-12',246),(174,'qwqw','0209-11-12',247),(175,'qwqw','0209-11-12',248),(176,'qwqw','0209-11-12',249),(177,'qwqw','0209-11-12',250),(178,'qwqw','0209-11-12',251),(179,'qwqw','0209-11-12',252),(180,'qwqw','0209-11-12',253),(181,'qwqw','0209-11-12',254),(182,'qwqw','0209-11-12',255),(183,'qwqw','0209-11-12',256),(184,'qwqw','0209-11-12',257),(185,'qwqw','0209-11-12',258),(186,'qwqw','0209-11-12',259),(187,'qwqw','0209-11-12',260),(188,'qwqw','0209-11-12',261),(189,'qwqw','0209-11-12',262),(190,'qwqw','0209-11-12',263),(191,'qwqw','0209-11-12',264),(192,'qwqw','0209-11-12',265),(193,'qwqw','0209-11-12',266),(194,'qwqw','0209-11-12',267),(195,'qwqw','0209-11-12',268),(196,'qwqw','0209-11-12',269),(197,'qwqw','0209-11-12',270),(198,'qwqw','0209-11-12',271),(199,'qwqw','0209-11-12',272),(200,'qwqw','0209-11-12',273),(201,'qwqw','0209-11-12',274),(202,'qwqw','0209-11-12',275),(203,'qwqw','0209-11-12',276),(204,'qwqw','0209-11-12',277),(205,'qwqw','0209-11-12',278),(206,'qwqw','0209-11-12',279),(207,'qwqw','0209-11-12',280),(208,'qwqw','0209-11-12',281),(209,'qwqw','0209-11-12',282),(210,'qwqw','0209-11-12',283),(211,'qwqw','0209-11-12',284),(212,'qwqw','0209-11-12',285),(213,'qwqw','0209-11-12',286),(214,'qwqw','0209-11-12',287),(215,'qwqw','0209-11-12',288),(216,'qwqw','0209-11-12',289),(217,'qwqw','0209-11-12',290),(218,'qwqw','0209-11-12',291),(219,'qwqw','0209-11-12',292),(220,'qwqw','0209-11-12',293),(221,'qwqw','0209-11-12',294),(222,'qwqw','0209-11-12',295),(223,'qwqw','0209-11-12',296),(224,'qwqw','0209-11-12',297),(225,'qwqw','0209-11-12',298),(226,'qwqw','0209-11-12',299),(227,'qwqw','0209-11-12',300),(228,'qwqw','0209-11-12',301),(229,'qwqw','0209-11-12',302),(230,'qwqw','0209-11-12',303),(231,'qwqw','0209-11-12',304),(232,'qwqw','0209-11-12',305),(233,'qwqw','0209-11-12',306),(234,'qwqw','0209-11-12',307),(235,'qwqw','0209-11-12',308),(236,'qwqw','0209-11-12',309),(237,'qwqw','0209-11-12',310),(238,'qwqw','0209-11-12',311),(239,'qwqw','0209-11-12',312),(240,'qwqw','0209-11-12',313),(241,'qwqw','0209-11-12',314),(242,'qwqw','0209-11-12',315),(243,'qwqw','0209-11-12',316),(244,'qwqw','0209-11-12',317),(245,'qwqw','0209-11-12',318),(246,'qwqw','0209-11-12',319),(247,'qwqw','0209-11-12',320),(248,'qwqw','0209-11-12',321),(249,'qwqw','0209-11-12',322),(250,'qwqw','0209-11-12',323),(251,'qwqw','0209-11-12',324),(252,'qwqw','0209-11-12',325),(253,'qwqw','0209-11-12',326),(254,'qwqw','0209-11-12',327),(255,'qwqw','0209-11-12',328),(256,'qwqw','0209-11-12',329),(257,'qwqw','0209-11-12',330),(258,'qwqw','0209-11-12',331),(259,'qwqw','0209-11-12',332),(260,'qwqw','0209-11-12',333),(261,'qwqw','0209-11-12',334),(262,'qwqw','0209-11-12',335),(263,'qwqw','0209-11-12',336),(264,'qwqw','0209-11-12',337),(265,'qwqw','0209-11-12',338),(266,'qwqw','0209-11-12',339),(267,'qwqw','0209-11-12',340),(268,'qwqw','0209-11-12',341),(269,'qwqw','0209-11-12',342),(270,'qwqw','0209-11-12',343),(271,'qwqw','0209-11-12',344),(272,'qwqw','0209-11-12',345),(273,'qwqw','0209-11-12',346),(274,'eew','2020-11-13',347),(275,'eew','2020-11-13',348),(276,'eew','2020-11-13',349),(277,'Supervisr','2018-11-03',350),(278,'','2020-03-04',351),(279,'','2020-03-04',352),(280,'','2020-03-04',353),(281,'ewew','2018-11-22',354),(282,'dsds','2019-01-12',355),(283,'dsds','2019-01-12',356),(284,'dsds','2019-01-12',357),(285,'supervisore','2020-09-12',358),(286,'','2020-03-04',359),(287,'manager','2020-11-12',360),(288,'','2020-03-04',361),(289,'','2020-03-04',362),(290,'','2020-03-04',363),(291,'sddsd','2020-01-13',364),(292,'sddsd','2020-01-13',365),(293,'sddsd','2020-01-13',366),(294,'dsds','2020-12-22',367),(295,'dsds','2020-12-22',368),(296,'dsds','2020-12-22',369),(297,'asas','2020-11-12',370),(298,'asas','2020-11-12',371),(299,'sdsd','2020-11-12',372),(300,'sdsd','2020-11-12',373),(301,'sdsd','2020-11-12',374),(302,'','2020-03-04',375),(303,'','2020-03-04',376),(304,'wewew','2020-11-11',377),(305,'wqwq','2020-11-12',378),(306,'qwqw','2020-01-09',379),(307,'ewe','2020-01-01',380),(308,'Marnager','2020-01-01',381);
/*!40000 ALTER TABLE `employee_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee_on_list`
--

DROP TABLE IF EXISTS `employee_on_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee_on_list` (
  `ITEM_ID` int NOT NULL,
  `LIST_ID` int NOT NULL,
  KEY `LIST_ID` (`LIST_ID`),
  KEY `ITEM_ID` (`ITEM_ID`),
  CONSTRAINT `employee_on_list_ibfk_1` FOREIGN KEY (`LIST_ID`) REFERENCES `employee_details` (`LIST_ID`),
  CONSTRAINT `employee_on_list_ibfk_2` FOREIGN KEY (`ITEM_ID`) REFERENCES `employees` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee_on_list`
--

LOCK TABLES `employee_on_list` WRITE;
/*!40000 ALTER TABLE `employee_on_list` DISABLE KEYS */;
/*!40000 ALTER TABLE `employee_on_list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employees`
--

DROP TABLE IF EXISTS `employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employees` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `DEPORTMENT` varchar(35) NOT NULL,
  `EMPLOYEE` varchar(35) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employees`
--

LOCK TABLES `employees` WRITE;
/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
INSERT INTO `employees` VALUES (2,'Manager','JAMES'),(3,'supervisor','ROBERT'),(4,'supervisor','MICHAEL'),(5,'Omar','Manager'),(7,'Ghulam','supervisor'),(8,'Ghulam','supervisor'),(10,'Mike','Manager'),(11,'Mike','Manager'),(12,'Jaweed','supervisor'),(17,'omarghulam','manager'),(18,'jaweedomar','Manager'),(20,'OmarGhulam','Supervisore'),(49,'Supervisor','Mike John'),(52,'Supervisor','Ghulam'),(57,'Supevisor','Ghulam');
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-03-11 20:13:28
