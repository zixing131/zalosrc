package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.c */
/* loaded from: classes2.dex */
public final class C5313c {

    /* renamed from: a */
    private C5296b f32298a;

    /* renamed from: b */
    private C5296b f32299b;

    /* renamed from: c */
    private final List f32300c;

    public C5313c() {
        this.f32298a = new C5296b("", 0L, null);
        this.f32299b = new C5296b("", 0L, null);
        this.f32300c = new ArrayList();
    }

    /* renamed from: a */
    public final C5296b m28954a() {
        return this.f32298a;
    }

    /* renamed from: b */
    public final C5296b m28955b() {
        return this.f32299b;
    }

    /* renamed from: c */
    public final List m28956c() {
        return this.f32300c;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        C5313c c5313c = new C5313c(this.f32298a.clone());
        Iterator it = this.f32300c.iterator();
        while (it.hasNext()) {
            c5313c.f32300c.add(((C5296b) it.next()).clone());
        }
        return c5313c;
    }

    /* renamed from: d */
    public final void m28957d(C5296b c5296b) {
        this.f32298a = c5296b;
        this.f32299b = c5296b.clone();
        this.f32300c.clear();
    }

    /* renamed from: e */
    public final void m28958e(String str, long j11, Map map) {
        this.f32300c.add(new C5296b(str, j11, map));
    }

    /* renamed from: f */
    public final void m28959f(C5296b c5296b) {
        this.f32299b = c5296b;
    }

    public C5313c(C5296b c5296b) {
        this.f32298a = c5296b;
        this.f32299b = c5296b.clone();
        this.f32300c = new ArrayList();
    }
}
