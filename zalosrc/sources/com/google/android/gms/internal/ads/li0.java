package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;

/* loaded from: classes2.dex */
public final class li0 implements InterfaceC4880pp {

    /* renamed from: p */
    private final Context f23927p;

    /* renamed from: q */
    private final Object f23928q;

    /* renamed from: r */
    private final String f23929r;

    /* renamed from: s */
    private boolean f23930s;

    public li0(Context context, String str) {
        this.f23927p = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f23929r = str;
        this.f23930s = false;
        this.f23928q = new Object();
    }

    /* renamed from: a */
    public final String m24294a() {
        return this.f23929r;
    }

    /* renamed from: c */
    public final void m24295c(boolean z11) {
        if (!zzt.zzn().m21425z(this.f23927p)) {
            return;
        }
        synchronized (this.f23928q) {
            try {
                if (this.f23930s == z11) {
                    return;
                }
                this.f23930s = z11;
                if (TextUtils.isEmpty(this.f23929r)) {
                    return;
                }
                if (this.f23930s) {
                    zzt.zzn().m21412m(this.f23927p, this.f23929r);
                } else {
                    zzt.zzn().m21413n(this.f23927p, this.f23929r);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4880pp
    /* renamed from: m0 */
    public final void mo21778m0(C4842op c4842op) {
        m24295c(c4842op.f25735j);
    }
}
