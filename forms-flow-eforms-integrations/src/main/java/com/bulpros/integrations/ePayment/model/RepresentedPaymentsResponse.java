package com.bulpros.integrations.ePayment.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RepresentedPaymentsResponse {

    private List<PaymentModel> payments;

}

