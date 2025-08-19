package com.vaultapp.customer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CustomerRequestDto {

    private int cust_id;
    private String cust_name;
    private String cust_role;

}
