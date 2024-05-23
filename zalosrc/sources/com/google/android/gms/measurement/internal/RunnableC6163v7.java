package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC4205o;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p230i6.InterfaceC20314f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.v7 */
/* loaded from: classes2.dex */
public final class RunnableC6163v7 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ AtomicReference f34536p;

    /* renamed from: q */
    final /* synthetic */ String f34537q;

    /* renamed from: r */
    final /* synthetic */ String f34538r;

    /* renamed from: s */
    final /* synthetic */ zzq f34539s;

    /* renamed from: t */
    final /* synthetic */ C5977e8 f34540t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6163v7(C5977e8 c5977e8, AtomicReference atomicReference, String str, String str2, String str3, zzq zzqVar) {
        this.f34540t = c5977e8;
        this.f34536p = atomicReference;
        this.f34537q = str2;
        this.f34538r = str3;
        this.f34539s = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        C5977e8 c5977e8;
        InterfaceC20314f interfaceC20314f;
        synchronized (this.f34536p) {
            try {
                try {
                    c5977e8 = this.f34540t;
                    interfaceC20314f = c5977e8.f33980d;
                } catch (RemoteException e11) {
                    this.f34540t.f34158a.mo31033c().m31197q().m31111d("(legacy) Failed to get conditional properties; remote exception", null, this.f34537q, e11);
                    this.f34536p.set(Collections.emptyList());
                    atomicReference = this.f34536p;
                }
                if (interfaceC20314f == null) {
                    c5977e8.f34158a.mo31033c().m31197q().m31111d("(legacy) Failed to get conditional properties; not connected to service", null, this.f34537q, this.f34538r);
                    this.f34536p.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    AbstractC4205o.m19722k(this.f34539s);
                    this.f34536p.set(interfaceC20314f.mo30897M3(this.f34537q, this.f34538r, this.f34539s));
                } else {
                    this.f34536p.set(interfaceC20314f.mo30905g3(null, this.f34537q, this.f34538r));
                }
                this.f34540t.m30860E();
                atomicReference = this.f34536p;
                atomicReference.notify();
            } finally {
                this.f34536p.notify();
            }
        }
    }
}
