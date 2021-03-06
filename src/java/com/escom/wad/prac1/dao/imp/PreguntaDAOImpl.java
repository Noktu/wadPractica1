/*
 * This java source file is generated by DAO4J v1.19
 * Generated on Tue Sep 16 16:53:36 CDT 2014
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
import com.escom.wad.prac1.dto.Pregunta;
import com.escom.wad.prac1.dto.PreguntaKey;
import com.escom.wad.prac1.dao.PreguntaDAO;
/**
 * This class provides methods to populate DB Table of pregunta
 */
public class PreguntaDAOImpl implements PreguntaDAO {
    /* SQL to insert data */
    private static final String SQL_INSERT =
        "INSERT INTO pregunta ("
        + "idpregunta, pregunta, idexamen"
        + ") VALUES (?, ?, ?)";

    /* SQL to select data */
    private static final String SQL_SELECT =
        "SELECT "
        + "idpregunta, pregunta, idexamen "
        + "FROM pregunta WHERE "
        + "idpregunta = ?";

    /* SQL to update data */
    private static final String SQL_UPDATE =
        "UPDATE pregunta SET "
        + "pregunta = ?, idexamen = ? "
        + "WHERE "
        + "idpregunta = ?";

    /* SQL to delete data */
    private static final String SQL_DELETE =
        "DELETE FROM pregunta WHERE "
        + "idpregunta = ?";

    /**
     * Create a new record in Database.
     * @param bean   The Object to be inserted.
     * @param conn   JDBC Connection.
     * @exception    SQLException if something is wrong.
     */
    public void create(Pregunta bean, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQL_INSERT);
            ps.setInt(1, bean.getIdpregunta());
            ps.setString(2, bean.getPregunta());
            ps.setInt(3, bean.getIdexamen());
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
    public Pregunta load(PreguntaKey key, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(SQL_SELECT);
            ps.setInt(1, key.getIdpregunta());
            rs = ps.executeQuery();
            List results = getResults(rs);
            if (results.size() > 0)
                return (Pregunta) results.get(0);
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
    public void update(Pregunta bean, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQL_UPDATE);
            ps.setString(1, bean.getPregunta());
            ps.setInt(2, bean.getIdexamen());
            ps.setInt(3, bean.getIdpregunta());
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
    public void delete(PreguntaKey key, Connection conn) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(SQL_DELETE);
            ps.setInt(1, key.getIdpregunta());
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
    protected List<Pregunta> getResults(ResultSet rs) throws SQLException {
        List results = new ArrayList<Pregunta>();
        while (rs.next()) {
            Pregunta bean = new Pregunta();
            bean.setIdpregunta(rs.getInt("idpregunta"));
            bean.setPregunta(rs.getString("pregunta"));
            bean.setIdexamen(rs.getInt("idexamen"));
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