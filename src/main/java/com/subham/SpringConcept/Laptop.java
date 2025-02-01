package com.subham.SpringConcept;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component()
public class Laptop implements Computer{
    @Override
    public void compile() {
        System.out.println("hello Laptop brand how are you ");
    }
}
