package com.example.vdcom;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Getter;



@XmlRootElement(name = "SystemData")
@XmlAccessorType(XmlAccessType.FIELD)
@Getter
public class SystemData {
    @XmlElement(name = "LoanProducts")
    private LoanProducts loanProducts;
}
