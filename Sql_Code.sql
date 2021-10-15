CREATE DATABASE  IF NOT EXISTS `siscontrole` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `siscontrole`;
-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: siscontrole
-- ------------------------------------------------------
-- Server version	5.7.31

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
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `clicod` int(11) NOT NULL AUTO_INCREMENT,
  `clinome` varchar(45) NOT NULL,
  `clicpf` varchar(45) NOT NULL,
  `clitelefone` varchar(45) NOT NULL,
  `cliemail` varchar(45) DEFAULT NULL,
  `clicep` varchar(45) NOT NULL,
  `clilogadouro` varchar(45) NOT NULL,
  `clinumero` varchar(45) NOT NULL,
  `clicomplemento` varchar(45) NOT NULL,
  `clibairro` varchar(45) DEFAULT NULL,
  `climunicipio` varchar(45) NOT NULL,
  `cliestado` varchar(45) NOT NULL,
  PRIMARY KEY (`clicod`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (3,'adenilson ','543.543.543.-54','(54) 3 5435-4353','345435','43543-543','34534','5345','43543','5435','43543','5'),(4,'amilton','435.435.435.-43','(43) 5 3454-3534','34534543','43543-543','4534534','543','5435','435','43543','5'),(5,'Benigo','435.435.435.-43','(43) 5 4354-3543','345345','34543-543','5435','345','4353','4543','54354','3'),(6,'Caio','456.456.456.-54','(45) 6 4565-4645','456456456','34543-543','654','6546546456','645645','6546','456456','45665'),(7,'jorge','456.456.456.-54','(45) 6 4565-4645','435435435','43543-543','43543','5435','435','435','43543','543'),(8,'Aurelio','456.456.456.-54','(45) 6 4565-4645','4354354','34534-543','4354','3543','543','543','5435','3'),(9,'aademils','543.543.534.-53','(34) 5 3453-4543','5345345','34543-543','5345345','43534','5345345','43534','5345','345'),(10,'COMPRAS A VISTA','000.000.000.-00','(00) 0 0000-0000','0000000000000','00000-000','00000000','00000','0000000','00000000000','0000000','0000000');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fornecedor`
--

DROP TABLE IF EXISTS `fornecedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fornecedor` (
  `forcodigo` int(11) NOT NULL AUTO_INCREMENT,
  `fornome` varchar(100) NOT NULL,
  `forcnpj` varchar(40) DEFAULT NULL,
  `fortelefone` varchar(30) DEFAULT NULL,
  `forfax` varchar(60) DEFAULT NULL,
  `foremail` varchar(100) DEFAULT NULL,
  `forsite` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`forcodigo`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fornecedor`
--

LOCK TABLES `fornecedor` WRITE;
/*!40000 ALTER TABLE `fornecedor` DISABLE KEYS */;
INSERT INTO `fornecedor` VALUES (1,'Ambev','34.543.534/5435-43','(43) - 5 4354-3543','345345','435','435345435');
/*!40000 ALTER TABLE `fornecedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedido`
--

DROP TABLE IF EXISTS `pedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pedido` (
  `pedcod` int(11) NOT NULL AUTO_INCREMENT,
  `peddata` date NOT NULL,
  `clicod` int(11) NOT NULL,
  PRIMARY KEY (`pedcod`),
  KEY `ped_clicod_idx` (`clicod`),
  CONSTRAINT `ped_clicod` FOREIGN KEY (`clicod`) REFERENCES `cliente` (`clicod`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedido`
--

LOCK TABLES `pedido` WRITE;
/*!40000 ALTER TABLE `pedido` DISABLE KEYS */;
INSERT INTO `pedido` VALUES (2,'2021-09-10',9),(3,'2021-09-10',8),(4,'2021-09-11',10),(5,'2021-09-11',10);
/*!40000 ALTER TABLE `pedido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedido_item`
--

DROP TABLE IF EXISTS `pedido_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pedido_item` (
  `pedcod` int(11) DEFAULT NULL,
  `procod` varchar(100) DEFAULT NULL,
  `pedproquantidade` int(11) NOT NULL,
  KEY `pedido_item_pedcod_idx` (`pedcod`),
  KEY `pedido_item_procod` (`procod`),
  CONSTRAINT `pedido_item_pedcod` FOREIGN KEY (`pedcod`) REFERENCES `pedido` (`pedcod`),
  CONSTRAINT `pedido_item_procod` FOREIGN KEY (`procod`) REFERENCES `produto` (`procodigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedido_item`
--

LOCK TABLES `pedido_item` WRITE;
/*!40000 ALTER TABLE `pedido_item` DISABLE KEYS */;
INSERT INTO `pedido_item` VALUES (3,'4545465',1),(3,'4654654654',1),(3,'4545465',1),(3,'4654654654',1),(3,'4545465',2),(3,'4654654654',1),(3,'4545465',1),(4,'7898904869815',1),(4,'7891000242483',1),(4,'7891000242483',2),(5,'7891000242483',1),(5,'7891000242483',1),(5,'7891000242483',1),(5,'7891000242483',1),(5,'7891000242483',1),(5,'7891000242483',1),(5,'7891000242483',1),(5,'7891000242483',1),(5,'7891000242483',1),(5,'7891000242483',1),(5,'7891000242483',1),(5,'7891000242483',1),(5,'7891000242483',1),(5,'7891000242483',1),(5,'7891000242483',1),(5,'7891000242483',1),(5,'7891000242483',1),(5,'7891000242483',1),(5,'7891000242483',1),(5,'7891000242483',1),(5,'7891000242483',1),(5,'7891000242483',1);
/*!40000 ALTER TABLE `pedido_item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produto`
--

DROP TABLE IF EXISTS `produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `produto` (
  `procodigo` varchar(100) NOT NULL,
  `forcod` int(11) NOT NULL,
  `pronome` varchar(100) NOT NULL,
  `prodescricao` text,
  `prounidademedida` varchar(45) DEFAULT NULL,
  `provalorunitario` float NOT NULL,
  PRIMARY KEY (`procodigo`),
  KEY `forcod_idx` (`forcod`),
  CONSTRAINT `pro_forcod` FOREIGN KEY (`forcod`) REFERENCES `fornecedor` (`forcodigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produto`
--

LOCK TABLES `produto` WRITE;
/*!40000 ALTER TABLE `produto` DISABLE KEYS */;
INSERT INTO `produto` VALUES ('4545465',1,'Doce de Leite','Comida','g',4.6),('4654654654',1,'Biscoito','comida','g',4.5),('7891000242483',1,'Caldo de Galinha','Alimeto','g',0.5),('7898904869815',1,'Tek Bond','Cola','g',4.7);
/*!40000 ALTER TABLE `produto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `usucodigo` int(11) NOT NULL AUTO_INCREMENT,
  `usunome` varchar(45) NOT NULL,
  `usulogin` varchar(45) NOT NULL,
  `ususenha` varchar(45) NOT NULL,
  `ususetor` varchar(45) NOT NULL,
  PRIMARY KEY (`usucodigo`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'jailton','jailton','123','CAIXA'),(10,'jailton de araujo Santos','jailton','456','ADMINISTRADOR'),(11,'jailton araujo Santos','jailton','123','ADMINISTRADOR');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-09-11  1:18:03
