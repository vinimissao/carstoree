package br.com.carstore.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
public class CarDTO {

    @NotBlank(message = "O nome é obrigatório.")
    @Size(min = 3, max = 50, message = "O nome deve ter entre 3 e 50 caracteres.")
    private String name;

    @NotBlank(message = "A cor é obrigatória.")
    private String color;

    @NotBlank(message = "A id é obrigatória.")
    private String id;

    // Getters e Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getid() {
        return id;

    }

    public void setid(String id) {
        this.id = id;
    }
}