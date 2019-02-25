package com.gaurav.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "Hotels")
@Data
@AllArgsConstructor
public class Hotel {
    @Id
    private String hotelId;
    private String name;
    @Indexed(direction = IndexDirection.ASCENDING)
    private Double price;
    private Address address;
    private List<Review> reviewList;

    protected Hotel() {
        this.reviewList = new ArrayList<>();
    }

    public Hotel(String name, Double price, Address address, List<Review> reviewList) {
        this.name = name;
        this.price = price;
        this.address = address;
        this.reviewList = reviewList;
    }
}
