package com.example.vdcom;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Getter;



@XmlAccessorType(XmlAccessType.FIELD)
@Getter
class Loan {
    @XmlElement(name = "ProductId")
    private String productId;

    @XmlElement(name = "Amount")
    private int amount;

    @XmlElement(name = "Term")
    private int term;
}