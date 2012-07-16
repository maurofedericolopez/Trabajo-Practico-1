/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer4.sol;

import ar.edu.untdf.labprog.tp1.ejer2.sol.SQLFactory;
import ar.edu.untdf.labprog.tp1.ejer2.sol.SQLFactoryMethod;

/**
 *
 * @author Mauro
 */
public class Testing {

    public static void main(String[] args) {
        SQLFactoryMethod factoria = new SQLFactory();

        // Crear una conexion MsSQLServer.
        ar.edu.untdf.labprog.tp1.ejer2.sol.Conn conexion = factoria.createConnection("mssql");

        conexion.connect();
        conexion.query();
  }
}
