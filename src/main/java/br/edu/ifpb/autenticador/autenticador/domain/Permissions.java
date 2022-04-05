package br.edu.ifpb.autenticador.autenticador.domain;

import lombok.AllArgsConstructor;
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

    private Boolean adminPermission;
    private Boolean listPermission;
    private Boolean updatePermission;
    private Boolean insertPermission;
    private Boolean deletePermission;

    public Permissions(){

    }

    public Permissions(Permissions target){
        if(target != null){
            this.adminPermission= target.adminPermission;
            this.listPermission = target.listPermission;
            this.updatePermission = target.updatePermission;
            this.insertPermission = target.insertPermission;
            this.deletePermission =target.deletePermission;
        }
    }
    public Permissions clone() {
        return new Permissions(this);
    }
}
