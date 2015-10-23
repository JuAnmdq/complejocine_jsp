-- phpMyAdmin SQL Dump
-- version 4.4.14
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-10-2015 a las 04:41:54
-- Versión del servidor: 5.6.26
-- Versión de PHP: 5.6.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `cinema_utn`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cine`
--

CREATE TABLE IF NOT EXISTS `cine` (
  `pk_cine` int(11) NOT NULL,
  `nombre_cine` varchar(40) DEFAULT NULL,
  `direccion` varchar(60) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cine`
--

INSERT INTO `cine` (`pk_cine`, `nombre_cine`, `direccion`) VALUES
(1, 'Del Puerto', 'Triunvirato 266'),
(2, 'Constitución', 'Acevedo 428'),
(3, 'Cinema City', 'Del riesgo 3314');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `funcion`
--

CREATE TABLE IF NOT EXISTS `funcion` (
  `pk_funcion` int(11) NOT NULL,
  `fecha_funcion` date DEFAULT NULL,
  `hora_funcion` time DEFAULT NULL,
  `fk_sala` int(11) DEFAULT NULL,
  `fk_pelicula` int(11) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `funcion`
--

INSERT INTO `funcion` (`pk_funcion`, `fecha_funcion`, `hora_funcion`, `fk_sala`, `fk_pelicula`) VALUES
(26, '2015-12-11', '13:30:00', 4, 4),
(27, '2016-12-10', '19:00:00', 2, 3),
(28, '2016-11-10', '14:20:00', 3, 2),
(29, '2016-10-12', '15:30:00', 1, 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pelicula`
--

CREATE TABLE IF NOT EXISTS `pelicula` (
  `pk_pelicula` int(11) NOT NULL,
  `titulo` varchar(40) DEFAULT NULL,
  `director` varchar(40) DEFAULT NULL,
  `duracion` double DEFAULT NULL,
  `genero` varchar(40) DEFAULT NULL,
  `imagen` varchar(160) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `pelicula`
--

INSERT INTO `pelicula` (`pk_pelicula`, `titulo`, `director`, `duracion`, `genero`, `imagen`) VALUES
(2, 'Avatar', 'James Cameron', 120, 'Ciencia Ficción', 'http://cines.com/files/2013/04/avatar-poster.jpg'),
(3, 'Terminator', 'James Cameron', 95, 'Ciencia Ficción', 'http://static.srcdn.com/slir/w786-h393-q90-c786:393/wp-content/uploads/Terminator-Movie-Timeline-Explained.jpg'),
(4, 'Men of Honor', 'George Tillman, Jr.', 100, 'Drama', 'http://resizing.flixster.com/SRT1KjuQSiDZR4y1gbpwfzESbTY=/179x257/dkpu1ddg7pbsk.cloudfront.net/movie/11/16/50/11165034_ori.jpg');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE IF NOT EXISTS `reserva` (
  `pk_reserva` int(11) NOT NULL,
  `fk_usuario` int(11) DEFAULT NULL,
  `fk_funcion` int(11) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `reserva`
--

INSERT INTO `reserva` (`pk_reserva`, `fk_usuario`, `fk_funcion`) VALUES
(3, 8, 26),
(4, 11, 27),
(5, 11, 28),
(6, 13, 29);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sala`
--

CREATE TABLE IF NOT EXISTS `sala` (
  `pk_sala` int(11) NOT NULL,
  `nombre_sala` varchar(40) DEFAULT NULL,
  `filas` int(11) DEFAULT NULL,
  `columnas` int(11) DEFAULT NULL,
  `fk_cine` int(11) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `sala`
--

INSERT INTO `sala` (`pk_sala`, `nombre_sala`, `filas`, `columnas`, `fk_cine`) VALUES
(1, 'Nautilus', 10, 10, 2),
(2, 'Ideal', 8, 8, 1),
(3, 'Hobbies', 12, 8, 2),
(4, 'Cinemark', 10, 6, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
  `pk_usuario` int(11) NOT NULL,
  `nombre` varchar(60) DEFAULT NULL,
  `apellido` varchar(60) DEFAULT NULL,
  `dni` varchar(12) DEFAULT NULL,
  `pass` varchar(40) DEFAULT NULL,
  `email` varchar(80) DEFAULT NULL,
  `telefono` varchar(40) DEFAULT NULL,
  `rol` int(11) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`pk_usuario`, `nombre`, `apellido`, `dni`, `pass`, `email`, `telefono`, `rol`) VALUES
(8, 'Miguel', 'Belloso', '30112332', 'pass', 'miguel@gmail.com', '156221320', 32),
(10, 'Rodrigo', 'de la Serna', '27847389', 'pass', 'rodrigo@gmail.com', '156772612', 32),
(11, 'Martín', 'Cañoli', '32984304', 'pass', 'martin_@gmail.com', '156559305', 32),
(12, 'Marcos', 'Blanco', '27001426', 'pass', 'martin_blanco@gmail.com', '156221200', 32),
(13, 'Florencia', 'Raggi', '18931038', 'pass', 'raggi@gmail.com', '4991546', 32);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cine`
--
ALTER TABLE `cine`
  ADD PRIMARY KEY (`pk_cine`);

--
-- Indices de la tabla `funcion`
--
ALTER TABLE `funcion`
  ADD PRIMARY KEY (`pk_funcion`),
  ADD KEY `fk_pelicula` (`fk_pelicula`),
  ADD KEY `fk_sala` (`fk_sala`);

--
-- Indices de la tabla `pelicula`
--
ALTER TABLE `pelicula`
  ADD PRIMARY KEY (`pk_pelicula`);

--
-- Indices de la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`pk_reserva`),
  ADD KEY `fk_usuario` (`fk_usuario`),
  ADD KEY `fk_funcion` (`fk_funcion`);

--
-- Indices de la tabla `sala`
--
ALTER TABLE `sala`
  ADD PRIMARY KEY (`pk_sala`),
  ADD KEY `fk_cine` (`fk_cine`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`pk_usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cine`
--
ALTER TABLE `cine`
  MODIFY `pk_cine` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT de la tabla `funcion`
--
ALTER TABLE `funcion`
  MODIFY `pk_funcion` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=30;
--
-- AUTO_INCREMENT de la tabla `pelicula`
--
ALTER TABLE `pelicula`
  MODIFY `pk_pelicula` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `reserva`
--
ALTER TABLE `reserva`
  MODIFY `pk_reserva` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT de la tabla `sala`
--
ALTER TABLE `sala`
  MODIFY `pk_sala` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `pk_usuario` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=14;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `funcion`
--
ALTER TABLE `funcion`
  ADD CONSTRAINT `funcion_ibfk_1` FOREIGN KEY (`fk_pelicula`) REFERENCES `pelicula` (`pk_pelicula`),
  ADD CONSTRAINT `funcion_ibfk_2` FOREIGN KEY (`fk_sala`) REFERENCES `sala` (`pk_sala`);

--
-- Filtros para la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `reserva_ibfk_1` FOREIGN KEY (`fk_usuario`) REFERENCES `usuario` (`pk_usuario`),
  ADD CONSTRAINT `reserva_ibfk_2` FOREIGN KEY (`fk_funcion`) REFERENCES `funcion` (`pk_funcion`);

--
-- Filtros para la tabla `sala`
--
ALTER TABLE `sala`
  ADD CONSTRAINT `sala_ibfk_1` FOREIGN KEY (`fk_cine`) REFERENCES `cine` (`pk_cine`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
