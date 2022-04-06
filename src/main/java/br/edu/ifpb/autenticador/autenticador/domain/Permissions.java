package br.edu.ifpb.autenticador.autenticador.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Permissions {

    @Id
    @GeneratedValue
    private Long id;

    private Boolean adminPermission;
    private Boolean listPermission;
    private Boolean updatePermission;
    private Boolean insertPermission;
    private Boolean deletePermission;


    public Permissions clone() {
        // Como estamos usando JPA, o ID precisa ser passado nulo para que o clone seja criado efetivamente
        return new Permissions(null, this.getAdminPermission(), this.getListPermission(), this.getUpdatePermission(), this.getInsertPermission(), this.getDeletePermission());
    }

}
