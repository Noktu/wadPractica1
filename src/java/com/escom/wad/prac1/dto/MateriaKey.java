/*
 * This java source file is generated by DAO4J v1.19
 * Generated on Tue Sep 16 16:53:36 CDT 2014
 * For more information, please contact b-i-d@163.com
 * Please check http://sourceforge.net/projects/dao4j/ for the latest version.
 */

package com.escom.wad.prac1.dto;

public class MateriaKey implements java.io.Serializable, Cloneable {
    /* idmateria */
    protected int idmateria;

    /* idmateria */
    public int getIdmateria() {
        return idmateria;
    }

    /* idmateria */
    public void setIdmateria(int idmateria) {
        this.idmateria = idmateria;
    }

    /* Calculate hash code */
    public int hashCode() {
        int hashCode = 0;
        hashCode += new Integer(idmateria).hashCode();
        return hashCode;
    }
    
    /* Indicates whether some other object is "equal to" this one. */
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || !(obj instanceof MateriaKey))
            return false;

        MateriaKey key = (MateriaKey) obj;

        if (this.idmateria != key.idmateria)
            return false;

        return true;
    }

    /* Creates and returns a copy of this object. */
    public Object clone()
    {
        MateriaKey key = new MateriaKey();
        key.idmateria = this.idmateria;
        return key;
    }

    /* Returns a string representation of the object. */
    public String toString() {
        String sep = "\r\n";
        StringBuffer sb = new StringBuffer();
        sb.append(this.getClass().getName()).append(sep);
        sb.append("[").append("idmateria").append(" = ").append(idmateria).append("]");
        return sb.toString();
    }
}