-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Gostitelj: 127.0.0.1
-- Čas nastanka: 21. apr 2022 ob 12.20
-- Različica strežnika: 10.4.22-MariaDB
-- Različica PHP: 7.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Zbirka podatkov: `vactabel`
--

-- --------------------------------------------------------

--
-- Struktura tabele `gost`
--

CREATE TABLE `gost` (
  `Id_gosta` int(11) NOT NULL,
  `Ime_gosta` varchar(15) DEFAULT NULL,
  `Priimek_gosta` varchar(15) DEFAULT NULL,
  `Kraj_bivanja_gosta` varchar(15) DEFAULT NULL,
  `Spol` char(1) DEFAULT NULL,
  `Starost` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktura tabele `hotel`
--

CREATE TABLE `hotel` (
  `Id_hotela` int(11) NOT NULL,
  `Ime_hotela` varchar(15) DEFAULT NULL,
  `Kraj_hotela` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktura tabele `nocitev`
--

CREATE TABLE `nocitev` (
  `Id_nocitve` int(11) NOT NULL,
  `Id_hotela` int(11) DEFAULT NULL,
  `Id_gosta` int(11) DEFAULT NULL,
  `Datum_od` date DEFAULT NULL,
  `Datum_do` date DEFAULT NULL,
  `Cena` float(6,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indeksi zavrženih tabel
--

--
-- Indeksi tabele `gost`
--
ALTER TABLE `gost`
  ADD PRIMARY KEY (`Id_gosta`);

--
-- Indeksi tabele `hotel`
--
ALTER TABLE `hotel`
  ADD PRIMARY KEY (`Id_hotela`);

--
-- Indeksi tabele `nocitev`
--
ALTER TABLE `nocitev`
  ADD PRIMARY KEY (`Id_nocitve`),
  ADD KEY `Id_hotela` (`Id_hotela`),
  ADD KEY `Id_gosta` (`Id_gosta`);

--
-- Omejitve tabel za povzetek stanja
--

--
-- Omejitve za tabelo `nocitev`
--
ALTER TABLE `nocitev`
  ADD CONSTRAINT `nocitev_ibfk_1` FOREIGN KEY (`Id_hotela`) REFERENCES `hotel` (`Id_hotela`),
  ADD CONSTRAINT `nocitev_ibfk_2` FOREIGN KEY (`Id_gosta`) REFERENCES `gost` (`Id_gosta`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
