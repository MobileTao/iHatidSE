package org.mobiletao.ihatid.beans;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-04-14T02:07:37")
@StaticMetamodel(DataUserProfile.class)
public class DataUserProfile_ { 

    public static volatile SingularAttribute<DataUserProfile, Integer> id;
    public static volatile SingularAttribute<DataUserProfile, String> lastName;
    public static volatile SingularAttribute<DataUserProfile, Integer> createdBy;
    public static volatile SingularAttribute<DataUserProfile, Integer> modifiedBy;
    public static volatile SingularAttribute<DataUserProfile, Date> regDate;
    public static volatile SingularAttribute<DataUserProfile, String> regIp;
    public static volatile SingularAttribute<DataUserProfile, String> firstName;
    public static volatile SingularAttribute<DataUserProfile, String> emailAdd;
    public static volatile SingularAttribute<DataUserProfile, Date> createdDate;
    public static volatile SingularAttribute<DataUserProfile, Date> modifiedDate;

}