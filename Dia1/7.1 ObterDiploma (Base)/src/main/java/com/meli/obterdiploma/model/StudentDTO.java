package com.meli.obterdiploma.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter @Setter
public class StudentDTO {

    @NotBlank
    @NotNull
    @Length(min = 3)
    String studentName;

    @NotBlank
    @NotNull
    @Length(min = 3)
    String message;

    @NotNull
    Double averageScore;

    @Valid
    List<SubjectDTO> subjects;
}
