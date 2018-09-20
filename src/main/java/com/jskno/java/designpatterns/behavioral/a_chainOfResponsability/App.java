package com.jskno.java.designpatterns.behavioral.a_chainOfResponsability;

import com.jskno.java.designpatterns.behavioral.a_chainOfResponsability.providers.OAuthTokenProvider;
import com.jskno.java.designpatterns.behavioral.a_chainOfResponsability.providers.SamlTokenProvider;

public class App {

    public static void main(String[] args) {
        AuthenticationProcessor authProcessorChain = getChainOfAuthProcessor();
        System.out.println(authProcessorChain.isAuthorized(new OAuthTokenProvider()));
        System.out.println(authProcessorChain.isAuthorized(new SamlTokenProvider()));
    }

    private static AuthenticationProcessor getChainOfAuthProcessor() {
        AuthenticationProcessor oAuthProcessor = new OAuthProcessor(null);
        return new UsernamePasswordProcessor(oAuthProcessor);
    }
}
