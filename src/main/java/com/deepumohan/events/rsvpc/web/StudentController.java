package com.deepumohan.events.rsvpc.web;

import com.deepumohan.events.rsvpc.domain.Student;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/admin/students")
@Controller
@RooWebScaffold(path = "admin/students", formBackingObject = Student.class)
public class StudentController {
}
