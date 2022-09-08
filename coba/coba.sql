-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Apr 01, 2020 at 04:03 AM
-- Server version: 5.7.24
-- PHP Version: 7.2.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `coba`
--

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `NIM` int(9) NOT NULL,
  `NAMA` varchar(50) NOT NULL,
  `KELAMIN` varchar(15) NOT NULL,
  `FAKULTAS` varchar(10) NOT NULL,
  `TGL_PINJAM` date NOT NULL,
  `JUDUL` varchar(50) NOT NULL,
  `PENGARANG` varchar(30) NOT NULL,
  `TGL_KEMBALI` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mahasiswa`
--

INSERT INTO `mahasiswa` (`NIM`, `NAMA`, `KELAMIN`, `FAKULTAS`, `TGL_PINJAM`, `JUDUL`, `PENGARANG`, `TGL_KEMBALI`) VALUES
(672019202, 'Farid Arya Nugraha', 'Perempuan', 'FTI', '2020-04-20', 'Jejak Langkah', 'Fiersa Besari', '2020-03-28'),
(672019213, 'Alim Budhi Utomo', 'Laki-laki', 'FTI', '2020-03-29', 'Kumis Penyaring Kopi', 'Pinto Anugrah', '2020-06-30'),
(672019218, 'Alpha Fausta', 'Laki-laki', 'FTI', '2020-03-29', 'Perempuan Kedua', 'Labibah Zain', '2020-05-27');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`NIM`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
