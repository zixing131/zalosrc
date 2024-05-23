package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.LinkedList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ns2 {

    /* renamed from: b */
    private final int f25324b;

    /* renamed from: c */
    private final int f25325c;

    /* renamed from: a */
    private final LinkedList f25323a = new LinkedList();

    /* renamed from: d */
    private final mt2 f25326d = new mt2();

    public ns2(int i11, int i12) {
        this.f25324b = i11;
        this.f25325c = i12;
    }

    /* renamed from: i */
    private final void m24995i() {
        while (!this.f25323a.isEmpty()) {
            if (zzt.zzB().mo105913a() - ((ws2) this.f25323a.getFirst()).f30094d >= this.f25325c) {
                this.f25326d.m24721g();
                this.f25323a.remove();
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final int m24996a() {
        return this.f25326d.m24715a();
    }

    /* renamed from: b */
    public final int m24997b() {
        m24995i();
        return this.f25323a.size();
    }

    /* renamed from: c */
    public final long m24998c() {
        return this.f25326d.m24716b();
    }

    /* renamed from: d */
    public final long m24999d() {
        return this.f25326d.m24717c();
    }

    /* renamed from: e */
    public final ws2 m25000e() {
        this.f25326d.m24720f();
        m24995i();
        if (this.f25323a.isEmpty()) {
            return null;
        }
        ws2 ws2Var = (ws2) this.f25323a.remove();
        if (ws2Var != null) {
            this.f25326d.m24722h();
        }
        return ws2Var;
    }

    /* renamed from: f */
    public final lt2 m25001f() {
        return this.f25326d.m24718d();
    }

    /* renamed from: g */
    public final String m25002g() {
        return this.f25326d.m24719e();
    }

    /* renamed from: h */
    public final boolean m25003h(ws2 ws2Var) {
        this.f25326d.m24720f();
        m24995i();
        if (this.f25323a.size() == this.f25324b) {
            return false;
        }
        this.f25323a.add(ws2Var);
        return true;
    }
}
