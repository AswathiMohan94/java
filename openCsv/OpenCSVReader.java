package com.bridgelabz.open;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class OpenCSVReader {

    private static final String SAMPLE_CSV_FILE_PATH = "C:\\Users\\user\\Desktop\\csv\\open.csv" ;


    public static void main(String[] args) throws IOException {
        try (
                Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
                // CSVReader csvReader = new CSVReader(reader);
                CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();
        ) {
            // Reading Records One by One in a String array
            String[] nextRecord;
            while ((nextRecord = csvReader.readNext()) != null) {
                System.out.println("Name : " + nextRecord[0]);
                System.out.println("Email : " + nextRecord[1]);
                System.out.println("Phone : " + nextRecord[2]);
                System.out.println("Country : " + nextRecord[3]);
                System.out.println("==========================");
            }
        }
    }
    public static class CSVUser {
        private String name;
        private String email;
        private String phoneNo;
        private String country;

        public CSVUser() {

        }

        public CSVUser(String name, String email, String phoneNo, String country) {
            this.name = name;
            this.email = email;
            this.phoneNo = phoneNo;
            this.country = country;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhoneNo() {
            return phoneNo;
        }

        public void setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }
    }

}