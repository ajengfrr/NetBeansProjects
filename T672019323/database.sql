-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 02, 2020 at 02:47 AM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `databaseku`
--

-- --------------------------------------------------------

--
-- Table structure for table `database`
--

CREATE TABLE IF NOT EXISTS `database` (
  `NIM` int(10) NOT NULL,
  `Nama Lengkap` varchar(40) NOT NULL,
  `Jenis Kelamin` enum('Laki-laki','Perempuan') NOT NULL,
  `Fakultas` enum('FTI','FH','FBS','FPSY','FISKOM','FKIP') NOT NULL,
  `Tanggal Pinjam` date NOT NULL,
  `Judul Buku` varchar(30) NOT NULL,
  `Pengarang` varchar(30) NOT NULL,
  `Tanggal Kembali` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `database`
--

INSERT INTO `database` (`NIM`, `Nama Lengkap`, `Jenis Kelamin`, `Fakultas`, `Tanggal Pinjam`, `Judul Buku`, `Pengarang`, `Tanggal Kembali`) VALUES
(672019323, 'Ajeng Febriana Rahmawati', 'Perempuan', 'FTI', '2020-03-02', 'Tentang Kamu', 'Tere Liye', '2020-03-04'),
(802018136, 'Ajeng Yunita Kumalasari', 'Perempuan', 'FPSY', '2018-09-11', 'Brat Farrar', 'Ralph Mowat', '2018-09-14'),
(802018134, 'M. Taufik Akbar', 'Laki-laki', 'FPSY', '2018-10-01', 'The Big Sleep', 'Rosalie Kerr', '2018-10-05'),
(392018054, 'M. Zidane Zain Al-Baihaqi', 'Laki-laki', 'FBS', '2018-11-01', 'Hitler''s War', 'David Irving', '2018-11-05'),
(672019190, 'Adriane Athalia', 'Perempuan', 'FTI', '2019-09-02', 'The Big Sleep', 'Rosalie Kerr', '2019-09-04'),
(372019117, 'Anisa Azhar', 'Perempuan', 'FISKOM', '2020-03-02', 'Dublin People', 'Jennifer Bassett', '2020-03-04'),
(312018123, 'Alif Ismoyo', 'Laki-laki', 'FH', '2019-09-03', 'Oliver Twist', 'Richard Rogers', '2019-09-04'),
(392019034, 'Aurora Diva', 'Perempuan', 'FBS', '2020-02-03', 'Empati', 'David Howe', '2020-02-05'),
(802018131, 'Chantika Mawuntu', 'Perempuan', 'FPSY', '2019-08-15', 'Persuasion', 'Clare West', '2019-08-19'),
(672018332, 'Chatra Widsam Pratama', 'Laki-laki', 'FTI', '2019-04-01', 'Reflex', 'Rowena A.', '2019-04-04'),
(692019090, 'Syarief Bagus Aditya', 'Laki-laki', 'FTI', '2019-12-02', 'After', 'Anne Marie', '2019-12-04'),
(392019003, 'Siradj Mahendra', 'Laki-laki', 'FBS', '2020-03-19', 'Hukum Perjanjian', 'S.B.Marsh', '2020-03-23'),
(372019078, 'Icha Permatasari', 'Perempuan', 'FISKOM', '2020-01-14', 'Decline and Fall', 'Clare West', '2020-01-16'),
(312019272, 'Rahmat Koniyo Saputra', 'Laki-laki', 'FH', '2019-11-04', 'The Enemy', 'Ralph Mowat', '2019-11-05'),
(672019212, 'Ricky Arindra Wijaya', 'Laki-laki', 'FTI', '2019-10-01', 'Nelson Mandela', 'Rowena A.', '2019-10-03'),
(312018066, 'Reyhan Akesa', 'Laki-laki', 'FH', '2019-05-01', 'Cry Freedom', 'Rowena A.', '2019-05-03'),
(292018012, 'Herlinda Santosa', 'Perempuan', 'FKIP', '2019-09-02', 'Pride and Prejudice', 'Clare West', '2019-09-09'),
(372018083, 'Benito Juarez', 'Laki-laki', 'FISKOM', '2019-04-02', 'Nelson Mandela', 'Rowena A.', '2019-04-04'),
(292019102, 'Indra Cahyo Saputra', 'Laki-laki', 'FKIP', '2019-11-18', 'Night Without End', 'Margaret Naudi', '2019-11-20'),
(672019318, 'Epliani Limbong Rara', 'Perempuan', 'FTI', '2020-03-17', 'The Moonspinners', 'Diane Mowat', '2020-03-20');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
