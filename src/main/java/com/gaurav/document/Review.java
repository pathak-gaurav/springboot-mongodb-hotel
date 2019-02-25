package com.gaurav.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    private String username;
    private Rating rating;
    private boolean approved;

}
