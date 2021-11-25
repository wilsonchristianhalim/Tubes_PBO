-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 25, 2021 at 02:35 AM
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
('Mobile Legend'),
('PUBG'),
('Valorant');

-- --------------------------------------------------------

--
-- Table structure for table `matchs`
--

CREATE TABLE `matchs` (
  `id_match` int(12) NOT NULL,
  `event_match` varchar(30) NOT NULL,
  `id_team` varchar(30) NOT NULL,
  `lawan` varchar(30) NOT NULL,
  `date_match` varchar(30) NOT NULL,
  `result` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `matchs`
--

INSERT INTO `matchs` (`id_match`, `event_match`, `id_team`, `lawan`, `date_match`, `result`) VALUES
(12000, 'MPL SEASON 8 2021', '102', 'ONIC', '21 November 2021', 'WIN 2:1'),
(12001, 'VALORANT ARENA SHOWDOWN', '101', 'EVOS', '21 November 2021', 'LOSE 0:2'),
(12002, 'MPL SEASON 8 2021', '102', 'RRQ', '21 November 2021', 'WIN 2:1'),
(12003, 'VALORANT ARENA SHOWDOWN', '101', 'ONIC', '23 November 2021', 'WIN 2:0'),
(12004, 'PMPL SEASON 4 2021', '103', ' ', '23 November 2021', 'RANK 3'),
(12005, 'MPL SEASON 8 2021', '102', 'EVOS', '22 November 2021', 'LOSE 0:2'),
(12006, 'MPL SEASON 8 2021', '102', 'AURA', '23 November 2021', 'WIN 2:0'),
(12007, 'PMPL SEASON 4 2021', '103', ' ', '23 November 2021', 'RANK 9');

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
  `ID_Player` int(5) NOT NULL,
  `Nama_Team` varchar(30) NOT NULL,
  `Username` varchar(30) DEFAULT NULL,
  `Nama` varchar(30) DEFAULT NULL,
  `Umur` int(5) DEFAULT NULL,
  `TanggalLahir` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `player`
--

INSERT INTO `player` (`ID_Player`, `Nama_Team`, `Username`, `Nama`, `Umur`, `TanggalLahir`) VALUES
(1, 'Valorant', 'pije_10', 'Pije', 18, '11 Oktober 2001'),
(2, 'Valorant', 'WL_201', 'William', 19, '12 November 2002'),
(3, 'Valorant', 'Bill2020', 'Billy', 23, '31 Januari 1999'),
(4, 'Valorant', 'Jeri493', 'Jeremy', 19, '10 November 2001'),
(5, 'Valorant', 'Jasmike20', 'Jason', 20, '21 Agustus 1999'),
(6, 'Mobile Legend', 'salamdaribinjai', 'Binjai', 25, '03 September 1995'),
(7, 'Mobile Legend', 'Vit10', 'Vito', 18, '04 Juli 2002'),
(8, 'Mobile Legend', 'mirrra', 'Mira', 17, '13 September 2004'),
(9, 'Mobile Legend', 'sasuke23', 'Salim', 24, '17 Agustus 1996'),
(10, 'Mobile Legend', 'meyes20', 'Mayo', 22, '24 Desember 1998'),
(11, 'PUBG', 'rick1', 'Ricky', 22, '14 September 1999'),
(12, 'PUBG', 'sofaraway', 'Fara', 20, '27 Oktober 2000'),
(13, 'PUBG', 'ahhay_20', 'Atta', 20, '30 Juni 2000'),
(14, 'PUBG', 'dankamu66', 'Dandi', 20, '07 April 1999'),
(15, 'PUBG', 'milikmu67', 'Milea', 23, '09 Mei 2001');

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
  `Nama_Team` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `team`
--

INSERT INTO `team` (`ID_Team`, `Nama_Team`) VALUES
('101', 'Valorant'),
('102', 'Mobile Legend'),
('103', 'PUBG');

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
-- Indexes for table `matchs`
--
ALTER TABLE `matchs`
  ADD PRIMARY KEY (`id_match`),
  ADD KEY `id_team` (`id_team`);

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

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `matchs`
--
ALTER TABLE `matchs`
  MODIFY `id_match` int(12) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12009;

--
-- AUTO_INCREMENT for table `player`
--
ALTER TABLE `player`
  MODIFY `ID_Player` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `matchs`
--
ALTER TABLE `matchs`
  ADD CONSTRAINT `matchs_ibfk_1` FOREIGN KEY (`id_team`) REFERENCES `team` (`ID_Team`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
