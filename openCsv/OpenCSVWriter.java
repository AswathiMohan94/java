package com.bridgelabz.file;

import com.bridgelabz.open.OpenCSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class OpenCSVWriter {
    private static final String OBJECT_WRITE_FILE_PATH = "C:\\Users\\User\\IdeaProjects\\OpenCSV\\src\\main\\java\\com\\bridgelabz\\file\\opencsv.csv";

    public static void main(String[] args) throws IOException {
        try (
                Writer writer = Files.newBufferedWriter(Paths.get(OBJECT_WRITE_FILE_PATH));
        ) {
            StatefulBeanToCsv<OpenCSVReader.CSVUser> beanToCsv = new StatefulBeanToCsvBuilder(writer).withQuotechar(CSVWriter.NO_QUOTE_CHARACTER).build();
            List<OpenCSVReader.CSVUser> csvUsers = new ArrayList<>();
            csvUsers.add(new OpenCSVReader.CSVUser("Aswathi","aswathimohantly@gmail.com","1234567890","India"));
            csvUsers.add(new OpenCSVReader.CSVUser("Aswathi","aswathimohantly@gmail.com","1234567890","India"));
            csvUsers.add(new OpenCSVReader.CSVUser("Aswathi","aswathimohantly@gmail.com","1234567890","India"));
            csvUsers.add(new OpenCSVReader.CSVUser("Aswathi","aswathimohantly@gmail.com","1234567890","India"));
            beanToCsv.write(csvUsers);
        } catch (CsvRequiredFieldEmptyException e) {
            e.printStackTrace();
        } catch (CsvDataTypeMismatchException e) {
            e.printStackTrace();
        }

    }
}
