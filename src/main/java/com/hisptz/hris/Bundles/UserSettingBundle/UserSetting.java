package com.hisptz.hris.Bundles.UserSettingBundle;

import com.hisptz.hris.Bundles.UserBundle.User;
import com.hisptz.hris.core.Model.main.Model;
import javax.persistence.*;
import lombok.Data;


@Entity
@Table(name = "usersetting")
@Data
public class UserSetting extends Model {

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Basic
    @Column(name = "emailnotification")
    private boolean emailNotification;
    
    @Basic
    @Column(name = "smsnotification")
    private boolean smsNotification;

    @Basic
    @Column(name = "completenessalert")
    private boolean completenessAlert;

    @Basic
    @Column(name = "qualitycheckalert")
    private boolean qualitycheckAlert;

}
