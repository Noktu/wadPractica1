/*
 * This java source file is generated by DAO4J v1.19
 * Generated on Tue Sep 16 16:53:37 CDT 2014
 * For more information, please contact b-i-d@163.com
 * Please check http://sourceforge.net/projects/dao4j/ for the latest version.
 */

package com.escom.wad.prac1.dto;

public class RespuestaKey implements java.io.Serializable, Cloneable {
    /* idrespuesta */
    protected int idrespuesta;

    /* idrespuesta */
    public int getIdrespuesta() {
        return idrespuesta;
    }

    /* idrespuesta */
    public void setIdrespuesta(int idrespuesta) {
        this.idrespuesta = idrespuesta;
    }

    /* Calculate hash code */
    public int hashCode() {
        int hashCode = 0;
        hashCode += new Integer(idrespuesta).hashCode();
        return hashCode;
    }
    
    /* Indicates whether some other object is "equal to" this one. */
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || !(obj instanceof RespuestaKey))
            return false;

        RespuestaKey key = (RespuestaKey) obj;

        if (this.idrespuesta != key.idrespuesta)
            return false;

        return true;
    }

    /* Creates and returns a copy of this object. */
    public Object clone()
    {
        RespuestaKey key = new RespuestaKey();
        key.idrespuesta = this.idrespuesta;
        return key;
    }

    /* Returns a string representation of the object. */
    public String toString() {
        String sep = "\r\n";
        StringBuffer sb = new StringBuffer();
        sb.append(this.getClass().getName()).append(sep);
        sb.append("[").append("idrespuesta").append(" = ").append(idrespuesta).append("]");
        return sb.toString();
    }
}