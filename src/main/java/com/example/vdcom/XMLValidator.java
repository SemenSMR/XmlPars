package com.example.vdcom;


import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class XMLValidator {
    public static void main(String[] args) throws JAXBException {

        try {


            SystemData systemData = parseXML(SystemData.class, "SystemData.xml");
            ApplicationData appData = parseXML(ApplicationData.class, "ApplicationData.xml");

            // Выполнение проверок
            if (!validateBorrowerAge(appData.getBorrower())) {
                System.out.println("It was not possible to confirm the age: The age of the borrower exceeds 85 years.");
            } else if (!validateLoanParameters(appData.getLoan(), systemData)) {
                System.out.println("The loan receipt could not be confirmed: the amount or expiration date is outside the acceptable range.");
            } else if (!validateTIN(appData.getBorrower().getTin())) {
                System.out.println("TIN verification error: incorrect TIN.");
            } else {
                System.out.println("All checks have been passed.");
            }

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }


    //Парсинг
    private static <T> T parseXML(Class<T> clazz, String fileName) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(clazz);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        File xmlFile = new File(fileName);
        return (T) unmarshaller.unmarshal(xmlFile);
    }
    // Проверка суммы и срока кредита
    private static boolean validateLoanParameters(Loan loan, SystemData systemData) {
        Product product = systemData.getLoanProducts().getProduct();
        return loan.getAmount() >= product.getMinAmount() &&
                loan.getAmount() <= product.getMaxAmount() &&
                loan.getTerm() >= product.getMinTerm() &&
                loan.getTerm() <= product.getMaxTerm();
    }
    // Проверка корректности ИНН
    private static boolean validateTIN(String tin) {
        return tin.length() == 10 && tin.matches("\\d+");
    }
    // Проверка возраста заемщика
    private static boolean validateBorrowerAge(Borrower borrower) {
        return borrower.getAge() <= 85;
    }

}