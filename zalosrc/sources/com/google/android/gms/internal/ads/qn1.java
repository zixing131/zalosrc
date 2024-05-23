package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class qn1 {

    /* renamed from: a */
    private final Executor f26891a;

    /* renamed from: b */
    private final i01 f26892b;

    /* renamed from: c */
    private final kf1 f26893c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public qn1(Executor executor, i01 i01Var, kf1 kf1Var) {
        this.f26891a = executor;
        this.f26893c = kf1Var;
        this.f26892b = i01Var;
    }

    /* renamed from: a */
    public final void m25817a(final zq0 zq0Var) {
        if (zq0Var == null) {
            return;
        }
        this.f26893c.m23936B0(zq0Var.mo23737i());
        this.f26893c.m23890s0(new InterfaceC4880pp() { // from class: com.google.android.gms.internal.ads.mn1
            @Override // com.google.android.gms.internal.ads.InterfaceC4880pp
            /* renamed from: m0 */
            public final void mo21778m0(C4842op c4842op) {
                ns0 zzP = zq0.this.zzP();
                Rect rect = c4842op.f25729d;
                zzP.mo23361I(rect.left, rect.top, false);
            }
        }, this.f26891a);
        this.f26893c.m23890s0(new InterfaceC4880pp() { // from class: com.google.android.gms.internal.ads.nn1
            @Override // com.google.android.gms.internal.ads.InterfaceC4880pp
            /* renamed from: m0 */
            public final void mo21778m0(C4842op c4842op) {
                String str;
                zq0 zq0Var2 = zq0.this;
                HashMap hashMap = new HashMap();
                if (true != c4842op.f25735j) {
                    str = "0";
                } else {
                    str = "1";
                }
                hashMap.put("isVisible", str);
                zq0Var2.mo23552V("onAdVisibilityChanged", hashMap);
            }
        }, this.f26891a);
        this.f26893c.m23890s0(this.f26892b, this.f26891a);
        this.f26892b.m23101k(zq0Var);
        zq0Var.mo26687S("/trackActiveViewUnit", new c40() { // from class: com.google.android.gms.internal.ads.on1
            @Override // com.google.android.gms.internal.ads.c40
            /* renamed from: a */
            public final void mo19973a(Object obj, Map map) {
                qn1.this.m25818b((zq0) obj, map);
            }
        });
        zq0Var.mo26687S("/untrackActiveViewUnit", new c40() { // from class: com.google.android.gms.internal.ads.pn1
            @Override // com.google.android.gms.internal.ads.c40
            /* renamed from: a */
            public final void mo19973a(Object obj, Map map) {
                qn1.this.m25819c((zq0) obj, map);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void m25818b(zq0 zq0Var, Map map) {
        this.f26892b.m23098c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void m25819c(zq0 zq0Var, Map map) {
        this.f26892b.m23097a();
    }
}
