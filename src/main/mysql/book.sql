CREATE DATABASE  IF NOT EXISTS `bookinfo` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `bookinfo`;
-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: bookinfo
-- ------------------------------------------------------
-- Server version	8.0.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admininfo`
--

DROP TABLE IF EXISTS `admininfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admininfo` (
  `AID` int(11) NOT NULL AUTO_INCREMENT,
  `ALoginID` varchar(45) DEFAULT NULL,
  `ALoginPsw` varchar(45) DEFAULT NULL,
  `AName` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`AID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admininfo`
--

LOCK TABLES `admininfo` WRITE;
/*!40000 ALTER TABLE `admininfo` DISABLE KEYS */;
INSERT INTO `admininfo` VALUES (1,'zhangsan','333333','张三'),(2,'lisi','444444','李四');
/*!40000 ALTER TABLE `admininfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bookinfo`
--

DROP TABLE IF EXISTS `bookinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bookinfo` (
  `BID` int(11) NOT NULL AUTO_INCREMENT,
  `BTitle` varchar(50) DEFAULT NULL,
  `BAuthor` varchar(50) DEFAULT NULL,
  `BPrice` double DEFAULT NULL,
  `BCategoryID` int(11) DEFAULT NULL,
  `BPublisher` varchar(50) DEFAULT NULL,
  `BPhoto` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`BID`),
  KEY `d_idx` (`BCategoryID`),
  CONSTRAINT `d` FOREIGN KEY (`BCategoryID`) REFERENCES `categoryinfo` (`CID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bookinfo`
--

LOCK TABLES `bookinfo` WRITE;
/*!40000 ALTER TABLE `bookinfo` DISABLE KEYS */;
INSERT INTO `bookinfo` VALUES (1,'非洲旋律','李艳玲',128,1,'金城出版社','fzdxl.jpg'),(2,'尸鬼(全5册)','（日）小野不由美',170.8,2,'吉林出版集团','sg.jpg'),(3,'红楼小讲','周汝昌',15,3,'北京出版社','hlxj.jpg'),(9,'sss','123',2312,4,'3123123','ad65c112186f082e9fe9a59520b16736..jpg');
/*!40000 ALTER TABLE `bookinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categoryinfo`
--

DROP TABLE IF EXISTS `categoryinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categoryinfo` (
  `CID` int(11) NOT NULL AUTO_INCREMENT,
  `CName` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`CID`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categoryinfo`
--

LOCK TABLES `categoryinfo` WRITE;
/*!40000 ALTER TABLE `categoryinfo` DISABLE KEYS */;
INSERT INTO `categoryinfo` VALUES (1,'诗歌'),(2,'美术'),(3,'科普读物'),(4,'文学'),(5,'恐怖小说'),(6,'小说'),(7,'地理地图'),(8,'哲学'),(26,'再次测试');
/*!40000 ALTER TABLE `categoryinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'bookinfo'
--

--
-- Dumping routines for database 'bookinfo'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-16 18:38:00
