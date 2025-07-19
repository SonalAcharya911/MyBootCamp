package com.xworkz.flounder.config;

import com.xworkz.flounder.bean.Bottle;
import com.xworkz.flounder.bean.Crop;
import com.xworkz.flounder.bean.Curtain;
import com.xworkz.flounder.component.Fan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
@ComponentScan(basePackages = {"com.xworkz.flounder.component", "com.xworkz.flounder.bean"})
public class SpringConfiguration {
    public SpringConfiguration(){
        System.out.println("created SpringConfiguration...");
    }

    //String
    @Bean
    public String getName(){
        System.out.println("registering getName with Spring Container");
        return new String("Sonal");
    }

    @Bean
    public String getString(){
        System.out.println("registering getString with Spring Container");
        return new String();
    }

    @Bean
    public String getAuthor(){
        System.out.println("registering getAuthor with Spring Container");
        return "Shakespeare";

    }

    @Bean
    public String registerStudent(){
        System.out.println("registering registerStudent method into Spring Container");
        String studentName=new String("Saahil");
        return studentName;
    }

    @Bean
    public String checkStringPresent(){
        System.out.println("registering checkStringPresent into Spring Container");
        return null;
    }

    //Object
    @Bean
    public Object getObject(){
        System.out.println("registering getObject into Spring Container");
        return new Object();
    }

    @Bean
    public Object getObjectChildCrop(){
        System.out.println("registering getObjectChild into Spring Container");
        return new Crop();
    }

    @Bean
    public Object getBottle(){
        System.out.println("registering getBottle into Spring Container");
        return new Bottle[3];
    }

    @Bean
    public Object getSystem(){
        System.out.println("registering getSystem with Spring Container");
        return new System[1];
    }

    @Bean
    public Object getScanner(){
        System.out.println("registering getScanner with Spring Container");
        return new Scanner(System.in);
    }

    //WrapperClasses

    @Bean
    public Integer getInteger(){
        System.out.println("registering getInteger with Spring Container");
        return 0;
    }

    @Bean
    public Integer getPincode(){
        System.out.println("registering getPincode with Spring Container");
        return new Integer(560037);
    }

    @Bean
    public Byte getAge(){
        System.out.println("registering getAge with Spring Container");
        byte age=21;
        return age;
    }

    @Bean
    public Byte getByte(){
        System.out.println("registering getByte with Spring Container");
        return new Byte((byte) 1);
    }

    @Bean
    public Short getShort(){
        System.out.println("registering getShort with Spring Container");
        return new Short((short)123);
    }

    @Bean
    public Short getHouseNumber(){
        System.out.println("registering getHouseNumber with Spring Container");
        return new Short((short)205);
    }

    @Bean
    public Long getLong(){
        System.out.println("registering getLong into Spring Container");
        return new Long(1234567890L);
    }

    @Bean
    public Long getPhoneNumber(){
        System.out.println("registering getPhoneNumber into Spring Container");
        return new Long(9739257715L);
    }

    @Bean
    public Float getFloat(){
        System.out.println("registering getFloat into Spring Container");
        return new Float((float) 10.00);
    }

    @Bean
    public Float getPercentage(){
        System.out.println("registering getPercentage into Spring Container");
        return new Float((float) 93.2);
    }

    @Bean
    public Double getDouble(){
        System.out.println("registering getDouble into Spring Container");
        return new Double( 10.00);
    }

    @Bean
    public Double getSalary(){
        System.out.println("registering getSalary into Spring Container");
        Double salary=679000.00;
        return salary;
    }

    @Bean Boolean getTrue(){
        System.out.println("registering getTrue into Spring Container");
        return true;
    }

    @Bean Boolean getFalse(){
        System.out.println("registering getFalse into Spring Container");
        return false;
    }

    @Bean
    public Character getCharacter(){
        System.out.println("registering getCharacter into Spring Container");
        return new Character('A');
    }

    @Bean
    public Character getSize(){
        System.out.println("registering getSize into Spring Container");
        return new Character('L');
    }

    @Bean
    public Curtain getCurtain(){
        System.out.println("registering getCurtain into Spring Container");
        return new Curtain();
    }

    @Bean
    public Fan getFan(){
        return new Fan();
    }






}
