package day5.assignment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProcessFile {

    public static void main(String[] args) throws IOException, InterruptedException {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("MOCK_DATA.csv"));
            // FileReader reader = ;
            // read the file and convert it into a Employee object
            // Employee employee = new Employee(reader); // Assuming Employee class has
            // appropriate constructor

            // Process the CSV file here
            String line = reader.readLine();
            System.out.println(line);

            List<Employee> employees = new ArrayList<>();

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                String[] values = line.split(",");
                // create Employee object from values
                Employee employee = new Employee();
                employee.setId(Integer.parseInt(values[0]));
                employee.setFirst_name(values[1]);
                employee.setLast_name(values[2]);
                employee.setEmail(values[3]);
                employee.setGender(values[4]);
                employee.setIp_address(values[5]);
                employee.setCountry_code(values[6]);
                employee.setSalary(Double.parseDouble(values[7]));

                System.out.println(employee);
                employees.add(employee);
            }

            reader.close();

            // Process List

            // employees.parallelStream()
            // .

            LocalTime startTime = LocalTime.now();
            System.out.println(startTime);

            // List<Thread> threads = new ArrayList<>();

            ExecutorService executorService = Executors.newFixedThreadPool(100);



            for (Employee e : employees) {
                Runnable r = new IncrementSalaryTask(e);
                executorService.submit(r);
                // Thread t = new Thread(r);
                // t.start();
                // threads.add(t);
                // e.incrementSalary();

            }

            // for (Thread t : threads) {
            //     t.join();
            // }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
