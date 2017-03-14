package com.example.service.impl.conditions;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by piotr on 14.03.17.
 */
public class LinuxCondition implements Condition{
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return context.getEnvironment().getProperty("os.name").equalsIgnoreCase("Linux");
    }
}
