package com.jskno.java.designpatterns.behavioral.a_chainOfResponsability;

import com.jskno.java.designpatterns.behavioral.a_chainOfResponsability.providers.AuthenticationProvider;

public abstract class AuthenticationProcessor {

    protected AuthenticationProcessor nextProcessor;

    public AuthenticationProcessor(AuthenticationProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public abstract boolean isAuthorized(AuthenticationProvider authProvider);
}
