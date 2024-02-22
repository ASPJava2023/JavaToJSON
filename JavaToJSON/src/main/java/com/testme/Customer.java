package com.testme;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
private Integer cid;
private String cName;
private String CLastName;
private Address address;
}
