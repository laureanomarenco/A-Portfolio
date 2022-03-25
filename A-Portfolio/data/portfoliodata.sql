-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 22-03-2022 a las 19:51:51
-- Versión del servidor: 5.7.36
-- Versión de PHP: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `portfoliodata`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `education`
--

DROP TABLE IF EXISTS `education`;
CREATE TABLE IF NOT EXISTS `education` (
  `ided` bigint(20) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `imgurl` varchar(255) DEFAULT NULL,
  `nameofed` varchar(255) DEFAULT NULL,
  `others` varchar(255) DEFAULT NULL,
  `others2` varchar(255) DEFAULT NULL,
  `startandend` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ided`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `education`
--

INSERT INTO `education` (`ided`, `description`, `imgurl`, `nameofed`, `others`, `others2`, `startandend`) VALUES
(4, 'Conocimientos en gestión de proyectos agropecuarios y gestión en general.', 'assets/img/eea.jpg', 'Bachiller con Tecnicatura en Agronomía en la Escuela de Educación Agropecuaria Nº1.', 'Trabajos agroepcuarios en general.', NULL, 'Finalizado en 2011.'),
(10, 'Diseño, ejecución y evaluación de estrategias de comunicación en medios e instituciones.', 'assets/img/unr.jpg', 'Licenciatura en Comunicación Social en la Universidad Nacional de Rosario.', 'Diseño y edición de piezas escritas, visuales, sonoras y multimediales.', NULL, 'Finalizado en 2022. Título en trámite.');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `experience`
--

DROP TABLE IF EXISTS `experience`;
CREATE TABLE IF NOT EXISTS `experience` (
  `idexp` bigint(20) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `nameofjob` varchar(255) DEFAULT NULL,
  `others` varchar(255) DEFAULT NULL,
  `others2` varchar(255) DEFAULT NULL,
  `startandend` varchar(255) DEFAULT NULL,
  `urlimg` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idexp`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `experience`
--

INSERT INTO `experience` (`idexp`, `description`, `nameofjob`, `others`, `others2`, `startandend`, `urlimg`) VALUES
(5, 'Atención al público y gestión de datos personales en la Oficina de Transito.', 'Pasantía en el Distrito Sudeoste de la Municipalidad de Rosario.', 'Sebastián Borrelli contacto: 341-6191630', NULL, 'Marzo del 2018 a Marzo del 2019', 'assets/img/municipalidad.png'),
(9, 'Creación de piezas gráficas y logos para marcas. Asesorias en Comunicación. Community Manager', 'Trabajos freelance de diseño gráfico, comunicación y edición.', 'Ediciónes de audio, video e imagén.', NULL, 'Desde 2017 a la actualidad. Para referencias ver proyectos.', 'assets/img/freelance.jpg');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(44);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hobbies`
--

DROP TABLE IF EXISTS `hobbies`;
CREATE TABLE IF NOT EXISTS `hobbies` (
  `idhb` bigint(20) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `imgurl` varchar(255) DEFAULT NULL,
  `nameohobbie` varchar(255) DEFAULT NULL,
  `others` varchar(255) DEFAULT NULL,
  `others2` varchar(255) DEFAULT NULL,
  `startandend` varchar(255) DEFAULT NULL,
  `routerlink` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idhb`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `hobbies`
--

INSERT INTO `hobbies` (`idhb`, `description`, `imgurl`, `nameohobbie`, `others`, `others2`, `startandend`, `routerlink`) VALUES
(35, 'Fotos raras. Tramas. Colores. Alguna animación.', 'assets/proyectos/colors.png', NULL, 'Cosas que suelo hacer jugando con programas.', NULL, NULL, '/hobbie1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lenguajes`
--

DROP TABLE IF EXISTS `lenguajes`;
CREATE TABLE IF NOT EXISTS `lenguajes` (
  `idlg` bigint(20) NOT NULL,
  `nameoflenguajes` varchar(255) DEFAULT NULL,
  `progress` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idlg`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `lenguajes`
--

INSERT INTO `lenguajes` (`idlg`, `nameoflenguajes`, `progress`) VALUES
(23, 'Photoshop', 'width: 80%'),
(24, 'inDesign', 'width: 90%'),
(25, 'HTML + CSS', 'width: 90%'),
(26, 'Javascript', 'width: 80%'),
(27, 'Bootstrap', 'width: 90%'),
(28, 'Angular', 'width: 80%'),
(29, 'MySQL', 'width: 80%'),
(30, 'Typescript', 'width: 80%');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `person`
--

DROP TABLE IF EXISTS `person`;
CREATE TABLE IF NOT EXISTS `person` (
  `idperson` bigint(20) NOT NULL,
  `about` varchar(255) DEFAULT NULL,
  `lastname` varchar(255) DEFAULT NULL,
  `location` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `title1` varchar(255) DEFAULT NULL,
  `title2` varchar(255) DEFAULT NULL,
  `urlimg` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idperson`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `person`
--

INSERT INTO `person` (`idperson`, `about`, `lastname`, `location`, `name`, `title1`, `title2`, `urlimg`) VALUES
(1, 'Me encanta trabajar en equipo, el diseño y seguir aprendiendo a codear.', 'Marenco', 'Rosario, Argentina', 'Laureano', 'Full-Stack Wev Developer', 'Lic. en Comunicación Social', 'assets/img/foto.jpg');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `projects`
--

DROP TABLE IF EXISTS `projects`;
CREATE TABLE IF NOT EXISTS `projects` (
  `idpr` bigint(20) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `nameofproject` varchar(255) DEFAULT NULL,
  `others` varchar(255) DEFAULT NULL,
  `others2` varchar(255) DEFAULT NULL,
  `startandend` varchar(255) DEFAULT NULL,
  `urlimg` varchar(255) DEFAULT NULL,
  `routerlink` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idpr`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `projects`
--

INSERT INTO `projects` (`idpr`, `description`, `nameofproject`, `others`, `others2`, `startandend`, `urlimg`, `routerlink`) VALUES
(31, 'Spot realizado en equipo para el Banco de Alimentos de Rosario.', 'Spot Audiovisual Institucional para BAR', 'Planificación integral del proyecto. Coordinación de grupo.', 'Guion y edición.', 'Hecho en 2022.', 'assets/proyectos/logo-bar.png', '/project1'),
(42, 'Diseño integral de la revista literaria Torrente.', 'Edición y diseño Revista Torrente', 'Planificación integral del proyecto. Coordinación de grupo. Diseño adecuado al cliente.', NULL, 'Hecho en 2020.', 'assets/proyectos/torrente.png', '/project2'),
(43, 'Diseño gráfico freelance.', 'Diseños de logos y piezas para marcas', 'Planificación integral del proyecto. Diseño adecuado al cliente.', NULL, 'Hechos entre 2017 y 2021.', 'assets/proyectos/PG.png', '/project3');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `skills`
--

DROP TABLE IF EXISTS `skills`;
CREATE TABLE IF NOT EXISTS `skills` (
  `idsk` bigint(20) NOT NULL,
  `nameofskill` varchar(255) DEFAULT NULL,
  `progress` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idsk`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `skills`
--

INSERT INTO `skills` (`idsk`, `nameofskill`, `progress`) VALUES
(13, 'Organización', 'width: 80%'),
(14, 'Creatividad', 'width: 90%'),
(15, 'Trabajo en equipo', 'width: 90%'),
(16, 'Comunicaciones', 'width: 90%'),
(17, 'Diseño Gráfico', 'width: 90%'),
(18, 'Escritura y edición', 'width: 95%'),
(19, 'Programación', 'width: 70%'),
(20, 'Gestión de Proyectos', 'width: 80%');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
