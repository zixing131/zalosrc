package com.zing.zalo.zview;

import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1804x0;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import ho0.AbstractC20110a;
import java.util.HashMap;
import p534u1.AbstractC26941a;

/* renamed from: com.zing.zalo.zview.q0 */
/* loaded from: classes.dex */
public class C17499q0 extends AbstractC1796t0 {

    /* renamed from: v */
    private static final C1802w0.b f89187v = new a();

    /* renamed from: s */
    private final HashMap f89188s = new HashMap();

    /* renamed from: t */
    private final HashMap f89189t = new HashMap();

    /* renamed from: u */
    private boolean f89190u = false;

    /* renamed from: com.zing.zalo.zview.q0$a */
    /* loaded from: classes.dex */
    class a implements C1802w0.b {
        a() {
        }

        @Override // androidx.lifecycle.C1802w0.b
        /* renamed from: a */
        public /* synthetic */ AbstractC1796t0 mo1195a(Class cls, AbstractC26941a abstractC26941a) {
            return AbstractC1804x0.m9390b(this, cls, abstractC26941a);
        }

        @Override // androidx.lifecycle.C1802w0.b
        /* renamed from: b */
        public AbstractC1796t0 mo1196b(Class cls) {
            return new C17499q0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public static C17499q0 m93119O(C1808z0 c1808z0) {
        return (C17499q0) new C1802w0(c1808z0, f89187v).m9378a(C17499q0.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1796t0
    /* renamed from: J */
    public void mo9130J() {
        AbstractC20110a.m104535d("onCleared called for %s", this);
        this.f89190u = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public void m93120M(ZaloView zaloView) {
        AbstractC20110a.m104535d("Clearing non-config state for %s", zaloView);
        C17499q0 c17499q0 = (C17499q0) this.f89188s.get(zaloView.f88781s);
        if (c17499q0 != null) {
            c17499q0.mo9130J();
            this.f89188s.remove(zaloView.f88781s);
        }
        C1808z0 c1808z0 = (C1808z0) this.f89189t.get(zaloView.f88781s);
        if (c1808z0 != null) {
            c1808z0.m9414a();
            this.f89189t.remove(zaloView.f88781s);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public C17499q0 m93121N(ZaloView zaloView) {
        C17499q0 c17499q0 = (C17499q0) this.f89188s.get(zaloView.f88781s);
        if (c17499q0 == null) {
            C17499q0 c17499q02 = new C17499q0();
            this.f89188s.put(zaloView.f88781s, c17499q02);
            return c17499q02;
        }
        return c17499q0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public C1808z0 m93122P(ZaloView zaloView) {
        C1808z0 c1808z0 = (C1808z0) this.f89189t.get(zaloView.f88781s);
        if (c1808z0 == null) {
            C1808z0 c1808z02 = new C1808z0();
            this.f89189t.put(zaloView.f88781s, c1808z02);
            return c1808z02;
        }
        return c1808z0;
    }

    /* renamed from: Q */
    public boolean m93123Q() {
        return this.f89190u;
    }
}
