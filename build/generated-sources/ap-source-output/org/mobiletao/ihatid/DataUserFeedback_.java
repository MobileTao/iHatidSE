package org.mobiletao.ihatid;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-04-05T23:07:22")
@StaticMetamodel(DataUserFeedback.class)
public class DataUserFeedback_ { 

    public static volatile SingularAttribute<DataUserFeedback, Integer> id;
    public static volatile SingularAttribute<DataUserFeedback, String> message;
    public static volatile SingularAttribute<DataUserFeedback, Integer> cabDriverId;
    public static volatile SingularAttribute<DataUserFeedback, Integer> createdBy;
    public static volatile SingularAttribute<DataUserFeedback, Integer> requestId;
    public static volatile SingularAttribute<DataUserFeedback, Integer> modifiedBy;
    public static volatile SingularAttribute<DataUserFeedback, Integer> userId;
    public static volatile SingularAttribute<DataUserFeedback, Integer> rating;
    public static volatile SingularAttribute<DataUserFeedback, Date> createdDate;
    public static volatile SingularAttribute<DataUserFeedback, Date> modifiedDate;

}