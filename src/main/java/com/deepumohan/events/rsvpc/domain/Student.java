package com.deepumohan.events.rsvpc.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.json.RooJson;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJson
@RooJpaActiveRecord
public class Student {

    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Event> events = new HashSet<Event>();
    
    private Integer extraPersons;
}
