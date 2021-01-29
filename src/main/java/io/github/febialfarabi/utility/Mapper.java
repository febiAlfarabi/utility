package io.github.febialfarabi.utility;


import java.util.HashMap;
import java.util.Map;

public class Mapper {

    Map map ;

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public static Mapper init(){
        Mapper mapper = new Mapper();
        return mapper;
    }

    public Mapper(){
        map = new HashMap();
    }

    public Mapper put(String key, Object value){
        map.put(key, value);
        return this ;
    }

    public Map get(){
        return map ;
    }




}
