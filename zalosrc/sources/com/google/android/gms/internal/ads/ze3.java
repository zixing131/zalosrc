package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
public final class ze3 {

    /* renamed from: a */
    private final ConcurrentMap f31477a;

    /* renamed from: b */
    private final te3 f31478b;

    /* renamed from: c */
    private final Class f31479c;

    /* renamed from: d */
    private final uk3 f31480d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ze3(ConcurrentMap concurrentMap, te3 te3Var, uk3 uk3Var, Class cls, ye3 ye3Var) {
        this.f31477a = concurrentMap;
        this.f31478b = te3Var;
        this.f31479c = cls;
        this.f31480d = uk3Var;
    }

    /* renamed from: a */
    public final te3 m28487a() {
        return this.f31478b;
    }

    /* renamed from: b */
    public final uk3 m28488b() {
        return this.f31480d;
    }

    /* renamed from: c */
    public final Class m28489c() {
        return this.f31479c;
    }

    /* renamed from: d */
    public final Collection m28490d() {
        return this.f31477a.values();
    }

    /* renamed from: e */
    public final List m28491e(byte[] bArr) {
        List list = (List) this.f31477a.get(new ve3(bArr, null));
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }

    /* renamed from: f */
    public final boolean m28492f() {
        if (!this.f31480d.m26983a().isEmpty()) {
            return true;
        }
        return false;
    }
}
