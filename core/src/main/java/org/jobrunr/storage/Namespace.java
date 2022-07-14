package org.jobrunr.storage;

public class Namespace {
    private final String name;

    private Namespace(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Namespace of(String name) {
        return new Namespace(name);
    }

    public static String getWhereClause() {
        return "namespace = :namespace";
    }
}
