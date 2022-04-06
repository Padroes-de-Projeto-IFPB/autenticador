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

    @Id
    @GeneratedValue
    private Long id;

    private Boolean adminPermission = false;
    private Boolean listPermission = false;
    private Boolean updatePermission = false;
    private Boolean insertPermission = false;
    private Boolean deletePermission = false;

    public Permissions() { }

    public Permissions(Permissions target) {
        if (target != null){
            this.adminPermission = target.adminPermission;
            this.listPermission = target.listPermission;
            this.updatePermission = target.updatePermission;
            this.insertPermission = target.insertPermission;
            this.deletePermission = target.deletePermission;
        }
    }

    public Permissions clone(){
        return null;
    };
}


