package com.example.vdcom;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Getter;



@XmlAccessorType(XmlAccessType.FIELD)
@Getter
class Product {
    @XmlAttribute(name = "id")
    private String id;

    @XmlElement(name = "MinAmount")
    private int minAmount;

    @XmlElement(name = "MaxAmount")
    private int maxAmount;

    @XmlElement(name = "MinTerm")
    private int minTerm;

    @XmlElement(name = "MaxTerm")
    private int maxTerm;
}
