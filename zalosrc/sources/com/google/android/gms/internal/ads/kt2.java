package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayDeque;

/* loaded from: classes2.dex */
public final class kt2 {

    /* renamed from: a */
    private final os2 f23480a;

    /* renamed from: b */
    private final it2 f23481b;

    /* renamed from: c */
    private final ks2 f23482c;

    /* renamed from: e */
    private qt2 f23484e;

    /* renamed from: f */
    private int f23485f = 1;

    /* renamed from: d */
    private final ArrayDeque f23483d = new ArrayDeque();

    public kt2(os2 os2Var, ks2 ks2Var, it2 it2Var) {
        this.f23480a = os2Var;
        this.f23482c = ks2Var;
        this.f23481b = it2Var;
        ks2Var.m24025b(new ft2(this));
    }

    /* renamed from: h */
    public final synchronized void m24040h() {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21372s5)).booleanValue() && !zzt.zzo().m22936h().zzh().m20560h()) {
            this.f23483d.clear();
            return;
        }
        if (m24041i()) {
            while (!this.f23483d.isEmpty()) {
                jt2 jt2Var = (jt2) this.f23483d.pollFirst();
                if (jt2Var == null || (jt2Var.zza() != null && this.f23480a.mo25252b(jt2Var.zza()))) {
                    qt2 qt2Var = new qt2(this.f23480a, this.f23481b, jt2Var);
                    this.f23484e = qt2Var;
                    qt2Var.m25876d(new gt2(this, jt2Var));
                    return;
                }
            }
        }
    }

    /* renamed from: i */
    private final synchronized boolean m24041i() {
        return this.f23484e == null;
    }

    /* renamed from: a */
    public final synchronized tc3 m24042a(jt2 jt2Var) {
        this.f23485f = 2;
        if (m24041i()) {
            return null;
        }
        return this.f23484e.m25873a(jt2Var);
    }

    /* renamed from: e */
    public final synchronized void m24043e(jt2 jt2Var) {
        this.f23483d.add(jt2Var);
    }

    /* renamed from: f */
    public final /* synthetic */ void m24044f() {
        synchronized (this) {
            this.f23485f = 1;
            m24040h();
        }
    }
}
