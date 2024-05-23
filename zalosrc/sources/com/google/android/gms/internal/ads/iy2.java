package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class iy2 {

    /* renamed from: c */
    private static final iy2 f22556c = new iy2();

    /* renamed from: a */
    private final ArrayList f22557a = new ArrayList();

    /* renamed from: b */
    private final ArrayList f22558b = new ArrayList();

    private iy2() {
    }

    /* renamed from: a */
    public static iy2 m23465a() {
        return f22556c;
    }

    /* renamed from: b */
    public final Collection m23466b() {
        return Collections.unmodifiableCollection(this.f22558b);
    }

    /* renamed from: c */
    public final Collection m23467c() {
        return Collections.unmodifiableCollection(this.f22557a);
    }

    /* renamed from: d */
    public final void m23468d(xx2 xx2Var) {
        this.f22557a.add(xx2Var);
    }

    /* renamed from: e */
    public final void m23469e(xx2 xx2Var) {
        boolean m23471g = m23471g();
        this.f22557a.remove(xx2Var);
        this.f22558b.remove(xx2Var);
        if (m23471g && !m23471g()) {
            oy2.m25357b().m25362f();
        }
    }

    /* renamed from: f */
    public final void m23470f(xx2 xx2Var) {
        boolean m23471g = m23471g();
        this.f22558b.add(xx2Var);
        if (!m23471g) {
            oy2.m25357b().m25361e();
        }
    }

    /* renamed from: g */
    public final boolean m23471g() {
        if (this.f22558b.size() > 0) {
            return true;
        }
        return false;
    }
}
