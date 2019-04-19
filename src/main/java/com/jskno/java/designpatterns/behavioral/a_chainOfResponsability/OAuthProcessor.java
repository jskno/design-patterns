package com.jskno.java.designpatterns.behavioral.a_chainOfResponsability;

import com.jskno.java.designpatterns.behavioral.a_chainOfResponsability.providers.AuthenticationProvider;
import com.jskno.java.designpatterns.behavioral.a_chainOfResponsability.providers.OAuthTokenProvider;

public class OAuthProcessor extends AuthenticationProcessor {

    public OAuthProcessor(AuthenticationProcessor nextProcessor) {
        super(nextProcessor);
    }
    @Override
    public boolean isAuthorized(AuthenticationProvider authProvider) {
        if(authProvider instanceof OAuthTokenProvider) {
            return processAuthentication(authProvider);
        } else if(this.nextProcessor != null) {
            return this.nextProcessor.isAuthorized(authProvider);
        }
        return false;

    }

    private boolean processAuthentication(AuthenticationProvider authProvider) {
        // Whatever process with provider and something else...
        return true;
    }
}
