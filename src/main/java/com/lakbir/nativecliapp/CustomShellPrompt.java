package com.lakbir.nativecliapp;

import org.jline.utils.AttributedString;
import org.springframework.context.annotation.Configuration;
import org.springframework.shell.jline.PromptProvider;

/**
 * lakbir.abderrahim - 14/08/2024
 */
@Configuration
public class CustomShellPrompt implements PromptProvider {
    @Override
    public AttributedString getPrompt() {
        return new AttributedString("lakbir :>");
    }
}
