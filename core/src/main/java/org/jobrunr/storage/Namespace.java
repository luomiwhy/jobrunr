package org.jobrunr.storage;

import org.jobrunr.utils.StringUtils;

public class Namespace {
    private final String name;

    private Namespace(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Namespace of(String name) {
        return new Namespace(StringUtils.isNullOrEmpty(name) ? defaultNamespaceName() : name);
    }

    public static String defaultNamespaceName() {
        return "default";
    }

    public static String andClause() {
        return " and namespace = :namespace ";
    }
    public static String whereClause() {
        return " where namespace = :namespace ";
    }
}
