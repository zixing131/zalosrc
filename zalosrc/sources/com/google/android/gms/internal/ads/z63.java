package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
abstract class z63 implements x83 {

    /* renamed from: p */
    private transient Set f31386p;

    /* renamed from: q */
    private transient Collection f31387q;

    /* renamed from: r */
    private transient Map f31388r;

    @Override // com.google.android.gms.internal.ads.x83
    /* renamed from: a */
    public final Map mo27863a() {
        Map map = this.f31388r;
        if (map == null) {
            Map mo21977e = mo21977e();
            this.f31388r = mo21977e;
            return mo21977e;
        }
        return map;
    }

    /* renamed from: c */
    abstract Collection mo27545c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract Iterator mo27546d();

    /* renamed from: e */
    abstract Map mo21977e();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x83)) {
            return false;
        }
        return mo27863a().equals(((x83) obj).mo27863a());
    }

    /* renamed from: f */
    abstract Set mo21978f();

    /* renamed from: g */
    public final Set m28439g() {
        Set set = this.f31386p;
        if (set == null) {
            Set mo21978f = mo21978f();
            this.f31386p = mo21978f;
            return mo21978f;
        }
        return set;
    }

    public final int hashCode() {
        return mo27863a().hashCode();
    }

    public final String toString() {
        return mo27863a().toString();
    }

    @Override // com.google.android.gms.internal.ads.x83
    public final Collection zzt() {
        Collection collection = this.f31387q;
        if (collection == null) {
            Collection mo27545c = mo27545c();
            this.f31387q = mo27545c;
            return mo27545c;
        }
        return collection;
    }
}
