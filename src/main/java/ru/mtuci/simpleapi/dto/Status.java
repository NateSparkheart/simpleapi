package ru.mtuci.simpleapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Status {
    String hostName;
    String helloWord;
}
