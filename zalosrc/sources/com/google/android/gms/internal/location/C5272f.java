package com.google.android.gms.internal.location;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.common.api.internal.C4086d;
import com.google.android.gms.common.internal.AbstractC4205o;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p568v5.InterfaceC27534e;
import p568v5.InterfaceC27539j;
import p664y.AbstractC30228a;

/* renamed from: com.google.android.gms.internal.location.f */
/* loaded from: classes2.dex */
public final class C5272f {

    /* renamed from: a */
    private final InterfaceC27539j f32194a;

    /* renamed from: b */
    private final Context f32195b;

    /* renamed from: c */
    private boolean f32196c = false;

    /* renamed from: d */
    private final Map f32197d = new HashMap();

    /* renamed from: e */
    private final Map f32198e = new HashMap();

    /* renamed from: f */
    private final Map f32199f = new HashMap();

    public C5272f(Context context, InterfaceC27539j interfaceC27539j) {
        this.f32195b = context;
        this.f32194a = interfaceC27539j;
    }

    /* renamed from: a */
    public final Location m28843a(String str) {
        ((C5275i) this.f32194a).f32200a.checkConnected();
        return ((C5275i) this.f32194a).m28850a().zzn(str);
    }

    /* renamed from: b */
    public final Location m28844b() {
        ((C5275i) this.f32194a).f32200a.checkConnected();
        return ((C5275i) this.f32194a).m28850a().zzm();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final void m28845c(zzba zzbaVar, C4086d c4086d, InterfaceC27534e interfaceC27534e) {
        BinderC5271e binderC5271e;
        ((C5275i) this.f32194a).f32200a.checkConnected();
        C4086d.a m19391b = c4086d.m19391b();
        if (m19391b == null) {
            binderC5271e = null;
        } else {
            synchronized (this.f32199f) {
                try {
                    BinderC5271e binderC5271e2 = (BinderC5271e) this.f32199f.get(m19391b);
                    if (binderC5271e2 == null) {
                        binderC5271e2 = new BinderC5271e(c4086d);
                    }
                    binderC5271e = binderC5271e2;
                    this.f32199f.put(m19391b, binderC5271e);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        BinderC5271e binderC5271e3 = binderC5271e;
        if (binderC5271e3 == null) {
            return;
        }
        ((C5275i) this.f32194a).m28850a().mo28840f0(new zzbc(1, zzbaVar, null, null, binderC5271e3, interfaceC27534e));
    }

    /* renamed from: d */
    public final void m28846d(C4086d.a aVar, InterfaceC27534e interfaceC27534e) {
        ((C5275i) this.f32194a).f32200a.checkConnected();
        AbstractC4205o.m19723l(aVar, "Invalid null listener key");
        synchronized (this.f32199f) {
            try {
                BinderC5271e binderC5271e = (BinderC5271e) this.f32199f.remove(aVar);
                if (binderC5271e != null) {
                    binderC5271e.zzc();
                    ((C5275i) this.f32194a).m28850a().mo28840f0(zzbc.m28854t(binderC5271e, interfaceC27534e));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public final void m28847e(boolean z11) {
        ((C5275i) this.f32194a).f32200a.checkConnected();
        ((C5275i) this.f32194a).m28850a().mo28839T4(z11);
        this.f32196c = z11;
    }

    /* renamed from: f */
    public final void m28848f() {
        synchronized (this.f32197d) {
            try {
                Iterator it = this.f32197d.values().iterator();
                while (it.hasNext()) {
                    AbstractC30228a.m149044a(it.next());
                }
                this.f32197d.clear();
            } finally {
            }
        }
        synchronized (this.f32199f) {
            try {
                for (BinderC5271e binderC5271e : this.f32199f.values()) {
                    if (binderC5271e != null) {
                        ((C5275i) this.f32194a).m28850a().mo28840f0(zzbc.m28854t(binderC5271e, null));
                    }
                }
                this.f32199f.clear();
            } finally {
            }
        }
        synchronized (this.f32198e) {
            try {
                Iterator it2 = this.f32198e.values().iterator();
                while (it2.hasNext()) {
                    AbstractC30228a.m149044a(it2.next());
                }
                this.f32198e.clear();
            } finally {
            }
        }
    }

    /* renamed from: g */
    public final void m28849g() {
        if (this.f32196c) {
            m28847e(false);
        }
    }
}
