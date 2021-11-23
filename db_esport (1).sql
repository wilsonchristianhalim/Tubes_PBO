-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 23, 2021 at 01:47 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_esport`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `ID_Admin` varchar(15) NOT NULL,
  `PW_Admin` varchar(15) NOT NULL,
  `Name` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `comment`
--

CREATE TABLE `comment` (
  `ID_Comment` varchar(10) NOT NULL,
  `ID_Post` varchar(10) NOT NULL,
  `Comment` text NOT NULL,
  `Username` varchar(20) NOT NULL,
  `Date_Comment` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `contact`
--

CREATE TABLE `contact` (
  `ID_Contact` varchar(20) NOT NULL,
  `Contact_Name` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `contact`
--

INSERT INTO `contact` (`ID_Contact`, `Contact_Name`) VALUES
('08131234567', 'Panji'),
('085318171000', 'Wilson C.H'),
('darrel123', 'Darrel');

-- --------------------------------------------------------

--
-- Table structure for table `divisigame`
--

CREATE TABLE `divisigame` (
  `Divisi` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `divisigame`
--

INSERT INTO `divisigame` (`Divisi`) VALUES
('Dota2'),
('MobileLegends'),
('PUBG'),
('Valorant');

-- --------------------------------------------------------

--
-- Table structure for table `match`
--

CREATE TABLE `match` (
  `ID_Game` varchar(10) NOT NULL,
  `Match_Name` varchar(20) NOT NULL,
  `Date_Match` date NOT NULL,
  `Result` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `news`
--

CREATE TABLE `news` (
  `ID_News` varchar(10) NOT NULL,
  `Title_News` varchar(20) NOT NULL,
  `Content_News` text NOT NULL,
  `Date_News` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `partner`
--

CREATE TABLE `partner` (
  `ID_Partner` varchar(10) NOT NULL,
  `Partner_Name` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `partner`
--

INSERT INTO `partner` (`ID_Partner`, `Partner_Name`) VALUES
('LGT', 'Logitech'),
('RX', 'Rexus'),
('RZ', 'Razer');

-- --------------------------------------------------------

--
-- Table structure for table `player`
--

CREATE TABLE `player` (
  `ID_Player` varchar(15) NOT NULL,
  `ID_Team` varchar(10) NOT NULL,
  `Username` varchar(20) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Age` varchar(3) NOT NULL,
  `TTL` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `post`
--

CREATE TABLE `post` (
  `ID_Post` varchar(10) NOT NULL,
  `Post_Content` text NOT NULL,
  `Username` varchar(20) NOT NULL,
  `Date_Post` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `team`
--

CREATE TABLE `team` (
  `ID_Team` varchar(10) NOT NULL,
  `Divisi` varchar(30) NOT NULL,
  `Nama_Team` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `Username` varchar(15) NOT NULL,
  `PW_User` varchar(15) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Age` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`Username`, `PW_User`, `Name`, `Email`, `Age`) VALUES
('darrel', 'darrel321', 'Darrel', 'darrel.nihboss@yahoo.com', 19),
('wilson', 'wilson123', 'Wilson', 'wilson.christianhalim@yahoo.com', 19);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`ID_Admin`);

--
-- Indexes for table `comment`
--
ALTER TABLE `comment`
  ADD PRIMARY KEY (`ID_Comment`);

--
-- Indexes for table `contact`
--
ALTER TABLE `contact`
  ADD PRIMARY KEY (`ID_Contact`);

--
-- Indexes for table `divisigame`
--
ALTER TABLE `divisigame`
  ADD PRIMARY KEY (`Divisi`);

--
-- Indexes for table `match`
--
ALTER TABLE `match`
  ADD PRIMARY KEY (`ID_Game`);

--
-- Indexes for table `news`
--
ALTER TABLE `news`
  ADD PRIMARY KEY (`ID_News`);

--
-- Indexes for table `partner`
--
ALTER TABLE `partner`
  ADD PRIMARY KEY (`ID_Partner`);

--
-- Indexes for table `player`
--
ALTER TABLE `player`
  ADD PRIMARY KEY (`ID_Player`);

--
-- Indexes for table `post`
--
ALTER TABLE `post`
  ADD PRIMARY KEY (`ID_Post`);

--
-- Indexes for table `team`
--
ALTER TABLE `team`
  ADD PRIMARY KEY (`ID_Team`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`Username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
