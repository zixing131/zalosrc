package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class j31 implements l91, InterfaceC4880pp {

    /* renamed from: p */
    private final iq2 f22609p;

    /* renamed from: q */
    private final o81 f22610q;

    /* renamed from: r */
    private final u91 f22611r;

    /* renamed from: s */
    private final AtomicBoolean f22612s = new AtomicBoolean();

    /* renamed from: t */
    private final AtomicBoolean f22613t = new AtomicBoolean();

    public j31(iq2 iq2Var, o81 o81Var, u91 u91Var) {
        this.f22609p = iq2Var;
        this.f22610q = o81Var;
        this.f22611r = u91Var;
    }

    /* renamed from: a */
    private final void m23512a() {
        if (this.f22612s.compareAndSet(false, true)) {
            this.f22610q.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4880pp
    /* renamed from: m0 */
    public final void mo21778m0(C4842op c4842op) {
        if (this.f22609p.f22323f == 1 && c4842op.f25735j) {
            m23512a();
        }
        if (c4842op.f25735j && this.f22613t.compareAndSet(false, true)) {
            this.f22611r.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final synchronized void zzn() {
        if (this.f22609p.f22323f != 1) {
            m23512a();
        }
    }
}
