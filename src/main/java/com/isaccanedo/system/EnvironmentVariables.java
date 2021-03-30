package com.isaccanedo.system;

public class EnvironmentVariables {
    public String getPath() {
        return System.getenv("PATH");
    }
}
