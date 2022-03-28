package com.meli.obterdiploma.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter @Setter
public class SubjectDTO {

    @NotBlank
    @NotNull
    @Length(min = 3)
    String name;

    @NotNull
    Double score;
}
