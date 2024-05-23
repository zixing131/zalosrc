package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zk3 {

    /* renamed from: a */
    private final he3 f31549a;

    /* renamed from: b */
    private final int f31550b;

    /* renamed from: c */
    private final qe3 f31551c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zk3(he3 he3Var, int i11, qe3 qe3Var, yk3 yk3Var) {
        this.f31549a = he3Var;
        this.f31550b = i11;
        this.f31551c = qe3Var;
    }

    /* renamed from: a */
    public final int m28537a() {
        return this.f31550b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zk3)) {
            return false;
        }
        zk3 zk3Var = (zk3) obj;
        if (this.f31549a != zk3Var.f31549a || this.f31550b != zk3Var.f31550b || !this.f31551c.equals(zk3Var.f31551c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31549a, Integer.valueOf(this.f31550b), Integer.valueOf(this.f31551c.hashCode())});
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, parameters='%s')", this.f31549a, Integer.valueOf(this.f31550b), this.f31551c);
    }
}
