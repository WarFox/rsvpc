// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.deepumohan.events.rsvpc.domain;

import com.deepumohan.events.rsvpc.domain.Student;
import com.deepumohan.events.rsvpc.domain.StudentDataOnDemand;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import org.springframework.stereotype.Component;

privileged aspect StudentDataOnDemand_Roo_DataOnDemand {
    
    declare @type: StudentDataOnDemand: @Component;
    
    private Random StudentDataOnDemand.rnd = new SecureRandom();
    
    private List<Student> StudentDataOnDemand.data;
    
    public Student StudentDataOnDemand.getNewTransientStudent(int index) {
        Student obj = new Student();
        setName(obj, index);
        return obj;
    }
    
    public void StudentDataOnDemand.setName(Student obj, int index) {
        String name = "name_" + index;
        obj.setName(name);
    }
    
    public Student StudentDataOnDemand.getSpecificStudent(int index) {
        init();
        if (index < 0) {
            index = 0;
        }
        if (index > (data.size() - 1)) {
            index = data.size() - 1;
        }
        Student obj = data.get(index);
        Long id = obj.getId();
        return Student.findStudent(id);
    }
    
    public Student StudentDataOnDemand.getRandomStudent() {
        init();
        Student obj = data.get(rnd.nextInt(data.size()));
        Long id = obj.getId();
        return Student.findStudent(id);
    }
    
    public boolean StudentDataOnDemand.modifyStudent(Student obj) {
        return false;
    }
    
    public void StudentDataOnDemand.init() {
        int from = 0;
        int to = 10;
        data = Student.findStudentEntries(from, to);
        if (data == null) {
            throw new IllegalStateException("Find entries implementation for 'Student' illegally returned null");
        }
        if (!data.isEmpty()) {
            return;
        }
        
        data = new ArrayList<Student>();
        for (int i = 0; i < 10; i++) {
            Student obj = getNewTransientStudent(i);
            try {
                obj.persist();
            } catch (ConstraintViolationException e) {
                StringBuilder msg = new StringBuilder();
                for (Iterator<ConstraintViolation<?>> iter = e.getConstraintViolations().iterator(); iter.hasNext();) {
                    ConstraintViolation<?> cv = iter.next();
                    msg.append("[").append(cv.getConstraintDescriptor()).append(":").append(cv.getMessage()).append("=").append(cv.getInvalidValue()).append("]");
                }
                throw new RuntimeException(msg.toString(), e);
            }
            obj.flush();
            data.add(obj);
        }
    }
    
}
