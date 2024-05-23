package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import p229i5.InterfaceC20285f;

/* loaded from: classes2.dex */
public final class zk1 implements View.OnClickListener {

    /* renamed from: p */
    private final xo1 f31542p;

    /* renamed from: q */
    private final InterfaceC20285f f31543q;

    /* renamed from: r */
    private f20 f31544r;

    /* renamed from: s */
    private c40 f31545s;

    /* renamed from: t */
    String f31546t;

    /* renamed from: u */
    Long f31547u;

    /* renamed from: v */
    WeakReference f31548v;

    public zk1(xo1 xo1Var, InterfaceC20285f interfaceC20285f) {
        this.f31542p = xo1Var;
        this.f31543q = interfaceC20285f;
    }

    /* renamed from: d */
    private final void m28533d() {
        View view;
        this.f31546t = null;
        this.f31547u = null;
        WeakReference weakReference = this.f31548v;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.f31548v = null;
    }

    /* renamed from: a */
    public final f20 m28534a() {
        return this.f31544r;
    }

    /* renamed from: b */
    public final void m28535b() {
        if (this.f31544r == null || this.f31547u == null) {
            return;
        }
        m28533d();
        try {
            this.f31544r.zze();
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    /* renamed from: c */
    public final void m28536c(final f20 f20Var) {
        this.f31544r = f20Var;
        c40 c40Var = this.f31545s;
        if (c40Var != null) {
            this.f31542p.m27960k("/unconfirmedClick", c40Var);
        }
        c40 c40Var2 = new c40() { // from class: com.google.android.gms.internal.ads.yk1
            @Override // com.google.android.gms.internal.ads.c40
            /* renamed from: a */
            public final void mo19973a(Object obj, Map map) {
                zk1 zk1Var = zk1.this;
                f20 f20Var2 = f20Var;
                try {
                    zk1Var.f31547u = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    yk0.zzg("Failed to call parse unconfirmedClickTimestamp.");
                }
                zk1Var.f31546t = (String) map.get("id");
                String str = (String) map.get("asset_id");
                if (f20Var2 == null) {
                    yk0.zze("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    f20Var2.mo21249j(str);
                } catch (RemoteException e11) {
                    yk0.zzl("#007 Could not call remote method.", e11);
                }
            }
        };
        this.f31545s = c40Var2;
        this.f31542p.m27958i("/unconfirmedClick", c40Var2);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference weakReference = this.f31548v;
        if (weakReference != null && weakReference.get() == view) {
            if (this.f31546t != null && this.f31547u != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("id", this.f31546t);
                hashMap.put("time_interval", String.valueOf(this.f31543q.mo105913a() - this.f31547u.longValue()));
                hashMap.put("messageType", "onePointFiveClick");
                this.f31542p.m27956g("sendMessageToNativeJs", hashMap);
            }
            m28533d();
        }
    }
}
