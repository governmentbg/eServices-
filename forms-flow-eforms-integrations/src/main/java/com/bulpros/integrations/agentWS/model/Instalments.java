package com.bulpros.integrations.agentWS.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Instalments {

    private int debtinstalmentId;
    private int paidInstalmentSum;
    private int paidInterestSum;
}
