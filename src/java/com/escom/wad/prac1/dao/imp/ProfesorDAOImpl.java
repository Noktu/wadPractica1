/*
 * This java source file is generated by DAO4J v1.19
 * Generated on Tue Sep 16 16:53:37 CDT 2014
 * For more information, please contact b-i-d@163.com
 * Please check http://sourceforge.net/projects/dao4j/ for the latest version.
 */

package com.escom.wad.prac1.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.ArrayList;
import com.escom.wad.prac1.dto.Profesor;
import com.escom.wad.prac1.dto.ProfesorKey;
import com.escom.wad.prac1.dao.ProfesorDAO;

/**
 * This class provides methods to populate DB Table of profesor
 */
public class ProfesorDAOImpl implements ProfesorDAO {
    /* SQL to insert data */
    private static final String SQL_INSERT =
        "INSERT INTO profesor ("
        + "numProfesor, correo"
        + ") VALUES (?, ?)";

    /* SQL to select data */
    private static final String SQL_SELECT =
        "SELECT "
        + "numProfesor, correo "
        + "FROM profesor WHERE "
        + "numProfesor = ?";

    /* SQL to update data */
    private static final String SQL_UPDATE =
        "UPDATE profesor SET "
        + "correo = ? "
        + "WHERE "
        + "numProfesor = ?";

    /* SQL to delete data */
    private static final String SQL_DELETE =
        "DELETE FROM profesor WHERE "
        + "numProfesor = ?";

    /**
     * Create a new record in Database.
     * @param bean   The Object to be inserted.
     * @param conn   JDBC Connection.
     * @exception    SQLException if something is wrong.
     */
    public void create(Profesor bean, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQL_INSERT);
            ps.setString(1, bean.getNumprofesor());
            ps.setString(2, bean.getCorreo());
            ps.executeUpdate();
        }finally {
            close(ps);
        }
    }

    /**
     * Retrive a record from Database.
     * @param beanKey   The PK Object to be retrived.
     * @param conn      JDBC Connection.
     * @exception       SQLException if something is wrong.
     */
    public Profesor load(ProfesorKey key, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(SQL_SELECT);
            ps.setString(1, key.getNumprofesor());
            rs = ps.executeQuery();
            List results = getResults(rs);
            if (results.size() > 0)
                return (Profesor) results.get(0);
            else
                return null;
        }finally {
            close(rs);
            close(ps);
        }
    }

    /**
     * Update a record in Database.
     * @param bean   The Object to be saved.
     * @param conn   JDBC Connection.
     * @exception    SQLException if something is wrong.
     */
    public void update(Profesor bean, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQL_UPDATE);
            ps.setString(1, bean.getCorreo());
            ps.setString(2, bean.getNumprofesor());
            ps.executeUpdate();
        }finally {
            close(ps);
        }
    }

    /**
     * Create a new record in Database.
     * @param bean   The PK Object to be deleted.
     * @param conn   JDBC Connection.
     * @exception    SQLException if something is wrong.
     */
    public void delete(ProfesorKey key, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQL_DELETE);
            ps.setString(1, key.getNumprofesor());
            ps.executeUpdate();
        }finally {
            close(ps);
        }
    }
    
    /**
     * Populate the ResultSet.
     * @param rs     The ResultSet.
     * @return       The Object to retrieve from DB.
     * @exception    SQLException if something is wrong.
     */
    protected List<Profesor> getResults(ResultSet rs) throws SQLException {
        List results = new ArrayList<Profesor>();
        while (rs.next()) {
            Profesor bean = new Profesor();
            bean.setNumprofesor(rs.getString("numProfesor"));
            bean.setCorreo(rs.getString("correo"));
            results.add(bean);
        }
        return results;
    }

    /**
     * Close JDBC Statement.
     * @param stmt  Statement to be closed.
     */
    protected void close(Statement stmt) {
        if (stmt != null) {
            try {
                stmt.close();
            }catch(SQLException e){}
        }
    }

    /**
     * Close JDBC ResultSet.
     * @param rs  ResultSet to be closed.
     */
    protected void close(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            }catch(SQLException e){}
        }
    }
}