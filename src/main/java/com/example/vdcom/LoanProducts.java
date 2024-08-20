package com.example.vdcom;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Getter;



@XmlAccessorType(XmlAccessType.FIELD)
@Getter
class LoanProducts {
    @XmlElement(name = "Product")
    private Product product;
}
