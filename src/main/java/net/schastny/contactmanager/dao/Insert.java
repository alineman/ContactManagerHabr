package net.schastny.contactmanager.dao;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;

import javax.sql.DataSource;
import java.sql.Types;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by ivan on 20.05.14.
 */
public class Insert extends StoredProcedure {
    public Insert(DataSource ds, String name, Boolean isFunction) {
        super(ds, name);
        declareParameter(new SqlParameter("name", Types.VARCHAR));
        Types.class.getDeclaredFields();
        setFunction(isFunction);
    }

//    public void execute(Map<String, String> inParams){
    public void execute(){
        Map<String,Object> inParams = new HashMap<String, Object>();
        inParams.put("name", "name");
        Map<String, Object> outParams;
        outParams = execute(inParams);
        System.out.println("Success!");
//        return outParams;
    }
}
