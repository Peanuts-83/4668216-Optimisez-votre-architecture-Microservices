package com.clientui.exceptions;

import feign.Response;
import feign.codec.ErrorDecoder;

public class CustomErrorDecoder implements ErrorDecoder {
    private final ErrorDecoder defaultErrorDecoder = new Default();

    @Override
    public Exception decode(String invoqueur, Response reponse) {
        switch (reponse.status()) {
            case 400:
                return new ProductBadRequestException("Requête incorrecte");
            case 404:
                return new ProductNotFoundException("Produit non trouvé");
        }
        return defaultErrorDecoder.decode(invoqueur,reponse);
    }
}
