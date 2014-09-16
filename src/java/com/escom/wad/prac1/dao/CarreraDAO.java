/*
 * This java source file is generated by DAO4J v1.19
 * Generated on Tue Sep 16 16:53:36 CDT 2014
 * For more information, please contact b-i-d@163.com
 * Please check http://sourceforge.net/projects/dao4j/ for the latest version.
 */

package com.escom.wad.prac1.dao;
import java.sql.Connection;
import java.sql.SQLException;
import com.escom.wad.prac1.dto.Carrera;
import com.escom.wad.prac1.dto.CarreraKey;

/**
 * This interface provides methods to populate DB Table of carrera
 */
public interface CarreraDAO {
    /**
     * Create a new record in Database.
     * @param bean   The Object to be inserted.
     * @param conn   JDBC Connection.
     * @exception    SQLException if something is wrong.
     */
    public void create(Carrera bean, Connection conn) throws SQLException;

    /**
     * Retrive a record from Database.
     * @param beanKey   The PK Object to be retrived.
     * @param conn      JDBC Connection.
     * @exception       SQLException if something is wrong.
     */
    public Carrera load(CarreraKey key, Connection conn) throws SQLException;

    /**
     * Update a record in Database.
     * @param bean   The Object to be saved.
     * @param conn   JDBC Connection.
     * @exception    SQLException if something is wrong.
     */
    public void update(Carrera bean, Connection conn) throws SQLException;

    /**
     * Create a new record in Database.
     * @param bean   The PK Object to be deleted.
     * @param conn   JDBC Connection.
     * @exception    SQLException if something is wrong.
     */
    public void delete(CarreraKey key, Connection conn) throws SQLException;
}