package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC4205o;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p230i6.InterfaceC20314f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.x7 */
/* loaded from: classes2.dex */
public final class RunnableC6185x7 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ AtomicReference f34595p;

    /* renamed from: q */
    final /* synthetic */ String f34596q;

    /* renamed from: r */
    final /* synthetic */ String f34597r;

    /* renamed from: s */
    final /* synthetic */ zzq f34598s;

    /* renamed from: t */
    final /* synthetic */ boolean f34599t;

    /* renamed from: u */
    final /* synthetic */ C5977e8 f34600u;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6185x7(C5977e8 c5977e8, AtomicReference atomicReference, String str, String str2, String str3, zzq zzqVar, boolean z11) {
        this.f34600u = c5977e8;
        this.f34595p = atomicReference;
        this.f34596q = str2;
        this.f34597r = str3;
        this.f34598s = zzqVar;
        this.f34599t = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        C5977e8 c5977e8;
        InterfaceC20314f interfaceC20314f;
        synchronized (this.f34595p) {
            try {
                try {
                    c5977e8 = this.f34600u;
                    interfaceC20314f = c5977e8.f33980d;
                } catch (RemoteException e11) {
                    this.f34600u.f34158a.mo31033c().m31197q().m31111d("(legacy) Failed to get user properties; remote exception", null, this.f34596q, e11);
                    this.f34595p.set(Collections.emptyList());
                    atomicReference = this.f34595p;
                }
                if (interfaceC20314f == null) {
                    c5977e8.f34158a.mo31033c().m31197q().m31111d("(legacy) Failed to get user properties; not connected to service", null, this.f34596q, this.f34597r);
                    this.f34595p.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    AbstractC4205o.m19722k(this.f34598s);
                    this.f34595p.set(interfaceC20314f.mo30898N1(this.f34596q, this.f34597r, this.f34599t, this.f34598s));
                } else {
                    this.f34595p.set(interfaceC20314f.mo30896K2(null, this.f34596q, this.f34597r, this.f34599t));
                }
                this.f34600u.m30860E();
                atomicReference = this.f34595p;
                atomicReference.notify();
            } finally {
                this.f34595p.notify();
            }
        }
    }
}
