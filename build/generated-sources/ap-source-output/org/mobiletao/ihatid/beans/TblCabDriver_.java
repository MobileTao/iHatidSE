package org.mobiletao.ihatid.beans;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-04-14T02:07:37")
@StaticMetamodel(TblCabDriver.class)
public class TblCabDriver_ { 

    public static volatile SingularAttribute<TblCabDriver, Integer> id;
    public static volatile SingularAttribute<TblCabDriver, String> licenseNo;
    public static volatile SingularAttribute<TblCabDriver, Integer> createdBy;
    public static volatile SingularAttribute<TblCabDriver, Integer> modifiedBy;
    public static volatile SingularAttribute<TblCabDriver, String> dutySched;
    public static volatile SingularAttribute<TblCabDriver, Integer> userProfileId;
    public static volatile SingularAttribute<TblCabDriver, Date> createdDate;
    public static volatile SingularAttribute<TblCabDriver, Integer> cabId;
    public static volatile SingularAttribute<TblCabDriver, Date> modifiedDate;

}