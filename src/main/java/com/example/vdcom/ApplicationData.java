package com.example.vdcom;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.Setter;



@XmlRootElement(name = "ApplicationData")
@XmlAccessorType(XmlAccessType.FIELD)
@Getter
  class ApplicationData {
    @XmlElement(name = "Borrower")
    private Borrower borrower;

    @XmlElement(name = "Loan")
    private Loan loan;
}
