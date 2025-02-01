package com.subham.SpringConcept;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    //@Autowired
    //Qualifier("laptop")/*this decides the bean which is used here*/
    @Autowired
    @Qualifier("desktop")
    private Computer computer;

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public Computer getComputer() {
        return computer;
    }

    public void callLaptop() {
        computer.compile();
    }
}
