package com.jaax.jpaprojections.projection.classbased;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductDTO {
    private String name;
    private String brand;
    private float price;
}
