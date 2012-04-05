package org.mobiletao.ihatid;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-04-05T23:07:22")
@StaticMetamodel(DataRideIn.class)
public class DataRideIn_ { 

    public static volatile SingularAttribute<DataRideIn, Integer> id;
    public static volatile SingularAttribute<DataRideIn, String> message;
    public static volatile SingularAttribute<DataRideIn, byte[]> isTwitterPosted;
    public static volatile SingularAttribute<DataRideIn, byte[]> isFbposted;
    public static volatile SingularAttribute<DataRideIn, Integer> createdBy;
    public static volatile SingularAttribute<DataRideIn, Integer> modifiedBy;
    public static volatile SingularAttribute<DataRideIn, Integer> userId;
    public static volatile SingularAttribute<DataRideIn, Date> createdDate;
    public static volatile SingularAttribute<DataRideIn, Integer> cabId;
    public static volatile SingularAttribute<DataRideIn, Date> modifiedDate;

}