package com.chestermabulela.school.department.entity;

import jakarta.validation.constraints.NotBlank;
import lombok.*;



@jakarta.persistence.Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {

    @jakarta.persistence.Id
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
    private Long departmentId;

    @NotBlank(message = "Please Add Department Name")
    /*@Length(max = 5,min =1)
    @Size(max = 10, min = 0)
    @Email
    @Positive
    @Negative
    @PositiveOrZero
    @NegativeOrZero
    @Future
    @FutureOrPresent
    @Past
    @PastOrPresent*/
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
