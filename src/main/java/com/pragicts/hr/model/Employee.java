package com.pragicts.hr.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(NON_DEFAULT)
@Document(collection = "Employee")
public class Employee {
    @Id
    private String id = UUID.randomUUID().toString().replace("-", "");
    private String firstName;
    private String lastName;
    private String designation;
    private String department;
    private String phone;
    private String photoUrl;
}
