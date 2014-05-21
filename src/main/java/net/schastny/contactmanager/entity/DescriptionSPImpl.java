package net.schastny.contactmanager.entity;

import javafx.util.Pair;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * Created by ivan on 20.05.14.
 */
@Data
public class DescriptionSPImpl implements DescriptionSP {
    List<Map.Entry<String, Integer>> inParams;
    List<Map.Entry<String, Integer>> outParams;
    String procedureName;
    Boolean isFunction;
    String description;


}

