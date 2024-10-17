
package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;


/**
* Classe que representa a tabela INVALIDATED_TOKEN
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"INVALIDATED_TOKEN\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.InvalidatedToken")
public class InvalidatedToken implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "expiration_date", nullable = true, unique = false, insertable=true, updatable=true, columnDefinition = "TIMESTAMP")
        
        private java.util.Date expirationDate;


    /**
    * Construtor
    * @generated
    */
    public InvalidatedToken(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public InvalidatedToken setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém expirationDate
    * return expirationDate
    * @generated
    */
    public java.util.Date getExpirationDate() {
        return this.expirationDate;
    }

    /**
    * Define expirationDate
    * @param expirationDate expirationDate
    * @generated
    */
    public InvalidatedToken setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
InvalidatedToken object = (InvalidatedToken)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}