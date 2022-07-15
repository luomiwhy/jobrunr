package org.jobrunr.configuration;

import org.jobrunr.utils.StringUtils;

public class Namespace {
    public static final String DEFAULT_NAME = "default";
    private volatile static Namespace instance;


    private final String name;

    private Namespace(String name) {
        this.name = name;
    }

    public static Namespace getInstance() {
        return instance;
    }

    public static Namespace of(String name) {
        if (instance == null) {
            synchronized (Namespace.class) {
                if (instance == null) {
                    instance = new Namespace(StringUtils.isNullOrEmpty(name) ? DEFAULT_NAME : name);
                }
            }
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public static String andClause() {
        return " and namespace = :namespace ";
    }
    public static String whereClause() {
        return " where namespace = :namespace ";
    }
}
