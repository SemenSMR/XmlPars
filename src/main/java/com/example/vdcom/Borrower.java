package com.example.vdcom;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Getter;



@XmlAccessorType(XmlAccessType.FIELD)
@Getter

class Borrower {
    @XmlElement(name = "Name")
    private String name;

    @XmlElement(name = "Age")
    private int age;

    @XmlElement(name = "TIN")
    private String tin;
}
