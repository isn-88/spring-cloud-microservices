package com.javastart.account.controller.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.List;


@Getter
@NoArgsConstructor
public class AccountRequestDTO {

    private Long accountId;

    private String name;

    private String email;

    private String phone;

    private OffsetDateTime creationDate;

    private List<Long> bills;
}
