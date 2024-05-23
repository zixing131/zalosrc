package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class DependencyCycleException extends DependencyException {

    /* renamed from: p */
    private final List f36405p;

    public DependencyCycleException(List list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f36405p = list;
    }
}
