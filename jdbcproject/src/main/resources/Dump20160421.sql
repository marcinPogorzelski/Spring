CREATE DATABASE  IF NOT EXISTS `HOTEL_RESERVATION_DB` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `HOTEL_RESERVATION_DB`;
-- MySQL dump 10.13  Distrib 5.5.47, for debian-linux-gnu (x86_64)
--
-- Host: 127.0.0.1    Database: HOTEL_RESERVATION_DB
-- ------------------------------------------------------
-- Server version	5.5.47-0ubuntu0.14.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `GUEST_T`
--

DROP TABLE IF EXISTS `GUEST_T`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `GUEST_T` (
  `name` varchar(100) NOT NULL,
  `address` varchar(200) DEFAULT NULL,
  `age` int(11) NOT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `GUEST_T`
--

LOCK TABLES `GUEST_T` WRITE;
/*!40000 ALTER TABLE `GUEST_T` DISABLE KEYS */;
/*!40000 ALTER TABLE `GUEST_T` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `RESERVATION_T`
--

DROP TABLE IF EXISTS `RESERVATION_T`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `RESERVATION_T` (
  `res_id` int(11) NOT NULL AUTO_INCREMENT,
  `guest_name` varchar(100) NOT NULL,
  `room_no` int(11) NOT NULL,
  `reserved_from` date NOT NULL,
  `reserved_to` date NOT NULL,
  PRIMARY KEY (`res_id`),
  KEY `guest_name` (`guest_name`),
  KEY `room_no` (`room_no`),
  CONSTRAINT `RESERVATION_T_ibfk_1` FOREIGN KEY (`guest_name`) REFERENCES `GUEST_T` (`name`),
  CONSTRAINT `RESERVATION_T_ibfk_2` FOREIGN KEY (`room_no`) REFERENCES `ROOM_T` (`room_number`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `RESERVATION_T`
--

LOCK TABLES `RESERVATION_T` WRITE;
/*!40000 ALTER TABLE `RESERVATION_T` DISABLE KEYS */;
/*!40000 ALTER TABLE `RESERVATION_T` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ROOM_T`
--

DROP TABLE IF EXISTS `ROOM_T`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ROOM_T` (
  `room_number` int(11) NOT NULL,
  `room_type` varchar(100) NOT NULL,
  `room_size` varchar(100) NOT NULL,
  PRIMARY KEY (`room_number`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ROOM_T`
--

LOCK TABLES `ROOM_T` WRITE;
/*!40000 ALTER TABLE `ROOM_T` DISABLE KEYS */;
/*!40000 ALTER TABLE `ROOM_T` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `CUST_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `NAME` varchar(100) NOT NULL,
  `AGE` int(10) unsigned NOT NULL,
  PRIMARY KEY (`CUST_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` (`CUST_ID`, `NAME`, `AGE`) VALUES (1,'MP',33);
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-04-21 19:30:35
