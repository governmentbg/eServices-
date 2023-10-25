
package com.bulpros.integrations.eDelivery.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SendMessageOnBehalfToLegalEntityRequest {

    protected DcMessageDetails message;
    protected String senderUniqueIdentifier;
    protected String receiverUniqueIdentifier;
    protected String serviceOID;
    protected String operatorEGN;
}
