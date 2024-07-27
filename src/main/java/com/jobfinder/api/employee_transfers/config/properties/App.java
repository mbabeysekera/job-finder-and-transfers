package com.jobfinder.api.employee_transfers.config.properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class App {
    private API api;
    private String databaseURL;
}
