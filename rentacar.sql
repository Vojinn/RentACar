/*
SQLyog Community v13.1.6 (64 bit)
MySQL - 10.1.36-MariaDB : Database - rentacar
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`rentacar` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `rentacar`;

/*Table structure for table `automobil` */

DROP TABLE IF EXISTS `automobil`;

CREATE TABLE `automobil` (
  `AutomobilID` int(12) NOT NULL AUTO_INCREMENT,
  `RegistarskiBroj` varchar(100) DEFAULT NULL,
  `Marka` varchar(100) DEFAULT NULL,
  `Model` varchar(100) DEFAULT NULL,
  `GodinaProizvodnje` int(10) DEFAULT NULL,
  `BrojVrata` int(10) DEFAULT NULL,
  `Gorivo` varchar(100) DEFAULT NULL,
  `CenaNaDan` int(10) DEFAULT NULL,
  `Raspoloziv` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`AutomobilID`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4;

/*Data for the table `automobil` */

insert  into `automobil`(`AutomobilID`,`RegistarskiBroj`,`Marka`,`Model`,`GodinaProizvodnje`,`BrojVrata`,`Gorivo`,`CenaNaDan`,`Raspoloziv`) values 
(1,'SD-055-VF','Fiat','Punto',2011,5,'Benzin',17,0),
(2,'BG-123-AA','Volkswagen','Golf 7',2015,5,'Dizel',23,1),
(3,'BG-456-BB','Peugeot','308',2017,3,'Benzin',20,1),
(4,'BG-789-CC','Opel','Astra',2010,5,'Dizel',18,1),
(5,'SD-072-GG','Volkswagen','Up',2015,3,'Benzin',14,1),
(6,'BG-143-KK','Renault','Clio',2019,5,'Dizel',26,1),
(7,'BG-876-YY','Opel','Insignia',2019,5,'Dizel',30,1),
(8,'BG-555-ZZ','Mercedes','E class',2018,5,'Benzin',40,0),
(9,'BG-111-IK','Nissan','X-trail',2015,5,'Dizel',35,0),
(10,'SD-787-GH','Opel','Corsa',2015,5,'Dizel',16,0),
(11,'SD-123-DF','Volkswagen','Golf 4',2004,5,'Dizel',14,1);

/*Table structure for table `banka` */

DROP TABLE IF EXISTS `banka`;

CREATE TABLE `banka` (
  `BankaID` int(12) NOT NULL AUTO_INCREMENT,
  `NazivBanke` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`BankaID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4;

/*Data for the table `banka` */

insert  into `banka`(`BankaID`,`NazivBanke`) values 
(1,'BANCA INTESA'),
(2,'CREDIT AGRICOLE '),
(3,'ERSTE BANK'),
(4,'EUROBANK'),
(5,'HALKBANK'),
(6,'KOMERCIJALNA BANKA'),
(7,'MOBI BANKA'),
(8,'MTS BANKA'),
(9,'NLB BANKA'),
(10,'RAIFFEISEN BANKA');

/*Table structure for table `iznajmljivanje` */

DROP TABLE IF EXISTS `iznajmljivanje`;

CREATE TABLE `iznajmljivanje` (
  `IznajmljivanjeID` int(12) NOT NULL AUTO_INCREMENT,
  `KlijentID` int(12) DEFAULT NULL,
  `DatumOd` date DEFAULT NULL,
  `DatumDo` date DEFAULT NULL,
  `Napomena` varchar(100) DEFAULT NULL,
  `Ukupno` double DEFAULT NULL,
  PRIMARY KEY (`IznajmljivanjeID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;

/*Data for the table `iznajmljivanje` */

insert  into `iznajmljivanje`(`IznajmljivanjeID`,`KlijentID`,`DatumOd`,`DatumDo`,`Napomena`,`Ukupno`) values 
(4,4,'2021-06-10','2021-06-15','Razduženo',104),
(5,6,'2021-06-19','2021-06-20','Razduženo',110),
(6,5,'2021-06-20','2021-07-20','Iznajmljeno',2538.9);

/*Table structure for table `klijent` */

DROP TABLE IF EXISTS `klijent`;

CREATE TABLE `klijent` (
  `KlijentID` int(12) NOT NULL AUTO_INCREMENT,
  `Jmbg` varchar(100) DEFAULT NULL,
  `Ime` varchar(100) DEFAULT NULL,
  `Prezime` varchar(100) DEFAULT NULL,
  `Adresa` varchar(100) DEFAULT NULL,
  `BrojTelefona` varchar(100) DEFAULT NULL,
  `BankaID` int(12) DEFAULT NULL,
  PRIMARY KEY (`KlijentID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;

/*Data for the table `klijent` */

insert  into `klijent`(`KlijentID`,`Jmbg`,`Ime`,`Prezime`,`Adresa`,`BrojTelefona`,`BankaID`) values 
(1,'1234567891011','Stefan','Komatovic','Nusiceva 10, Smederevo','654322',1),
(2,'1204997563101','Milica','Golubovic','Debelo brdo 12, Bajina Basta','354691',5),
(3,'1505996201810','Vanja','Vlahovic','Karadjordjeva 20, Obrenovac','874104',7),
(4,'0303997309381','Nikola','Blagojevic','Kralja Petra 5, Smederevo','471084',8),
(5,'1908997383710','Dusan','Radovic','Dimitrija Davidovica 20, Smederevo','284901',2),
(8,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `radnik` */

DROP TABLE IF EXISTS `radnik`;

CREATE TABLE `radnik` (
  `RadnikID` int(12) NOT NULL AUTO_INCREMENT,
  `KorisnickoIme` varchar(100) NOT NULL,
  `Password` varchar(100) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Telefon` varchar(100) NOT NULL,
  `Ime` varchar(100) NOT NULL,
  `Prezime` varchar(100) NOT NULL,
  PRIMARY KEY (`RadnikID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

/*Data for the table `radnik` */

insert  into `radnik`(`RadnikID`,`KorisnickoIme`,`Password`,`Email`,`Telefon`,`Ime`,`Prezime`) values 
(1,'Vojin','Vojin','dvojinovic38@gmail.com','+381644901122','Dusan','Vojinovic'),
(2,'Marko','Marko','marko123@gmail.com','+381659015445','Marko','Markovic');

/*Table structure for table `stavka_iznajmljivanja` */

DROP TABLE IF EXISTS `stavka_iznajmljivanja`;

CREATE TABLE `stavka_iznajmljivanja` (
  `SifraIznajmljivanja` int(12) NOT NULL,
  `StavkaID` int(12) NOT NULL AUTO_INCREMENT,
  `VrednostStavke` int(10) DEFAULT NULL,
  `Popust` double DEFAULT NULL,
  `CenaAutomobila` double DEFAULT NULL,
  `SifraAutomobila` int(12) DEFAULT NULL,
  PRIMARY KEY (`SifraIznajmljivanja`,`StavkaID`),
  KEY `StavkaID` (`StavkaID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4;

/*Data for the table `stavka_iznajmljivanja` */

insert  into `stavka_iznajmljivanja`(`SifraIznajmljivanja`,`StavkaID`,`VrednostStavke`,`Popust`,`CenaAutomobila`,`SifraAutomobila`) values 
(4,2,17,0,34,1),
(4,3,35,0,70,9),
(5,4,15,0,110,2),
(6,5,16,0.1,446.40000000000003,10),
(6,6,40,0.1,1116,8),
(6,7,35,0.1,976.5,9);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
