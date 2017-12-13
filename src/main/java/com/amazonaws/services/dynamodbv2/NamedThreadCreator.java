package com.amazonaws.services.dynamodbv2;

import java.util.concurrent.ThreadFactory;

public interface NamedThreadCreator {
    ThreadFactory createThreadWithName(String name);
}
