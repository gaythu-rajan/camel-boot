
package com.royalmail.subscriptions.webservice.envelope;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.0
 * 2016-01-06T13:57:48.088Z
 * Generated source version: 3.1.0
 */

@WebFault(name = "FaultResponse", targetNamespace = "http://www.royalmailgroup.com/soap/extensions/V1")
public class FaultResponse extends Exception {
    
    private com.royalmailgroup.soap.extensions.v1.ExceptionDetails faultResponse;

    public FaultResponse() {
        super();
    }
    
    public FaultResponse(String message) {
        super(message);
    }
    
    public FaultResponse(String message, Throwable cause) {
        super(message, cause);
    }

    public FaultResponse(String message, com.royalmailgroup.soap.extensions.v1.ExceptionDetails faultResponse) {
        super(message);
        this.faultResponse = faultResponse;
    }

    public FaultResponse(String message, com.royalmailgroup.soap.extensions.v1.ExceptionDetails faultResponse, Throwable cause) {
        super(message, cause);
        this.faultResponse = faultResponse;
    }

    public com.royalmailgroup.soap.extensions.v1.ExceptionDetails getFaultInfo() {
        return this.faultResponse;
    }
}
