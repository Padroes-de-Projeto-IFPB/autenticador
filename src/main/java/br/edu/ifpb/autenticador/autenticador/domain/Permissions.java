package br.edu.ifpb.autenticador.autenticador.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Permissions {

    public Permissions() {}

    public Permissions(Permissions permissions) {
        if (permissions != null) {
            this.adminPermission  = permissions.getAdminPermission();
            this.listPermission   = permissions.getListPermission();
            this.updatePermission = permissions.getUpdatePermission();
            this.insertPermission = permissions.getInsertPermission();
            this.deletePermission = permissions.getDeletePermission();
        }
    }

    @Id
    @GeneratedValue
    private Long id;

    private Boolean adminPermission;
    private Boolean listPermission;
    private Boolean updatePermission;
    private Boolean insertPermission;
    private Boolean deletePermission;

    public Permissions clone() {
        return new Permissions(this);
    }
}
