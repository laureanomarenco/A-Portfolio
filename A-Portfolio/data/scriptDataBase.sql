-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema PortfolioDataBase
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema PortfolioDataBase
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `PortfolioDataBase` DEFAULT CHARACTER SET utf8 ;
USE `PortfolioDataBase` ;

-- -----------------------------------------------------
-- Table `PortfolioDataBase`.`person`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PortfolioDataBase`.`person` (
  `idperson` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(60) NULL,
  `lastname` VARCHAR(45) NULL,
  `age` INT NULL,
  `title1` VARCHAR(100) NULL,
  `title2` VARCHAR(100) NULL,
  `location` VARCHAR(45) NULL,
  `about` MEDIUMTEXT NULL,
  PRIMARY KEY (`idperson`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `PortfolioDataBase`.`experience`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PortfolioDataBase`.`experience` (
  `idexperience` INT NOT NULL AUTO_INCREMENT,
  `nameofjob` VARCHAR(120) NULL,
  `description` VARCHAR(255) NULL,
  `others` VARCHAR(255) NULL,
  `others2` VARCHAR(160) NULL,
  `startandend` VARCHAR(45) NULL,
  `urlimg` VARCHAR(255) NULL,
  `person_idperson` INT NOT NULL,
  PRIMARY KEY (`idexperience`),
  CONSTRAINT `fk_education_person`
    FOREIGN KEY (`person_idperson`)
    REFERENCES `PortfolioDataBase`.`person` (`idperson`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `PortfolioDataBase`.`education`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PortfolioDataBase`.`education` (
  `ideducation` INT NOT NULL AUTO_INCREMENT,
  `nameofed` VARCHAR(120) NULL,
  `description` VARCHAR(255) NULL,
  `others` VARCHAR(255) NULL,
  `others2` VARCHAR(180) NULL,
  `startandend` VARCHAR(45) NULL,
  `educationcol` VARCHAR(45) NULL,
  `imgurl` VARCHAR(255) NULL,
  `person_idperson` INT NOT NULL,
  PRIMARY KEY (`ideducation`),
  CONSTRAINT `fk_education_person1`
    FOREIGN KEY (`person_idperson`)
    REFERENCES `PortfolioDataBase`.`person` (`idperson`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `PortfolioDataBase`.`skills`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PortfolioDataBase`.`skills` (
  `idskills` INT NOT NULL AUTO_INCREMENT,
  `nameskill` VARCHAR(45) NULL,
  `progress` VARCHAR(45) NULL,
  `person_idperson` INT NOT NULL,
  PRIMARY KEY (`idskills`),
  CONSTRAINT `fk_skills_person1`
    FOREIGN KEY (`person_idperson`)
    REFERENCES `PortfolioDataBase`.`person` (`idperson`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `PortfolioDataBase`.`lenguajes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PortfolioDataBase`.`lenguajes` (
  `idlenguajes` INT NOT NULL,
  `nameoflenguaje` VARCHAR(45) NULL,
  `progress` VARCHAR(45) NULL,
  `person_idperson` INT NOT NULL,
  PRIMARY KEY (`idlenguajes`),
  CONSTRAINT `fk_lenguajes_person1`
    FOREIGN KEY (`person_idperson`)
    REFERENCES `PortfolioDataBase`.`person` (`idperson`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `PortfolioDataBase`.`projects`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PortfolioDataBase`.`projects` (
  `idprojects` INT NOT NULL AUTO_INCREMENT,
  `nameofproject` VARCHAR(255) NULL,
  `description` VARCHAR(160) NULL,
  `others` VARCHAR(160) NULL,
  `others2` VARCHAR(160) NULL,
  `date` VARCHAR(45) NULL,
  `urlimg` VARCHAR(255) NULL,
  `person_idperson` INT NOT NULL,
  PRIMARY KEY (`idprojects`),
  CONSTRAINT `fk_projects_person1`
    FOREIGN KEY (`person_idperson`)
    REFERENCES `PortfolioDataBase`.`person` (`idperson`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `PortfolioDataBase`.`hobbies`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PortfolioDataBase`.`hobbies` (
  `idhobbies` INT NOT NULL,
  `nameofhobbie` VARCHAR(180) NULL,
  `description` VARCHAR(255) NULL,
  `others` VARCHAR(180) NULL,
  `others2` VARCHAR(180) NULL,
  `date` VARCHAR(45) NULL,
  `urlimg` VARCHAR(255) NULL,
  `person_idperson` INT NOT NULL,
  PRIMARY KEY (`idhobbies`),
  CONSTRAINT `fk_hobbies_person1`
    FOREIGN KEY (`person_idperson`)
    REFERENCES `PortfolioDataBase`.`person` (`idperson`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
