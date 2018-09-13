package com.hisptz.hris.core.rest.QueryStructure;

/**
 * Created by Guest on 9/12/18.
 */
public enum MutationType {
    CREATE, DELETE, UPDATE;

    String mutationType;

    MutationType(String mutationType) {
        this.mutationType = mutationType;
    }

    MutationType() {
    }
}
