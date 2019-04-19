package com.jskno.java.designpatterns.behavioral.a_chainOfResponsability;

import com.jskno.java.designpatterns.behavioral.a_chainOfResponsability.providers.AuthenticationProvider;
import com.jskno.java.designpatterns.behavioral.a_chainOfResponsability.providers.UsernamePasswordProvider;

public class UsernamePasswordProcessor extends AuthenticationProcessor{

    public UsernamePasswordProcessor(AuthenticationProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public boolean isAuthorized(AuthenticationProvider authProvider) {
        if(authProvider instanceof UsernamePasswordProvider) {
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
