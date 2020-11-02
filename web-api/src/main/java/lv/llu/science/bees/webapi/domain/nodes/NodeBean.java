package lv.llu.science.bees.webapi.domain.nodes;

import lombok.Data;
import lv.llu.science.bees.webapi.dwh.DwhValueBean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class NodeBean {
    private String id;
    private String name;
    private String type;
    private String parentId;
    private String location;
    private String clientId;
    private Boolean isActive;
    private String hwConfigId;
    private Map<String, List<DwhValueBean>> lastValues = new HashMap<>();
}
