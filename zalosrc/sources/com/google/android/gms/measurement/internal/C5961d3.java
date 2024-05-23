package com.google.android.gms.measurement.internal;

import java.util.List;
import p230i6.AbstractC20311d;

/* renamed from: com.google.android.gms.measurement.internal.d3 */
/* loaded from: classes.dex */
public final class C5961d3 {

    /* renamed from: h */
    private static final Object f33846h = new Object();

    /* renamed from: a */
    private final String f33847a;

    /* renamed from: b */
    private final InterfaceC5937b3 f33848b;

    /* renamed from: c */
    private final Object f33849c;

    /* renamed from: d */
    private final Object f33850d;

    /* renamed from: e */
    private final Object f33851e = new Object();

    /* renamed from: f */
    private volatile Object f33852f = null;

    /* renamed from: g */
    private volatile Object f33853g = null;

    public /* synthetic */ C5961d3(String str, Object obj, Object obj2, InterfaceC5937b3 interfaceC5937b3, AbstractC20311d abstractC20311d) {
        this.f33847a = str;
        this.f33849c = obj;
        this.f33850d = obj2;
        this.f33848b = interfaceC5937b3;
    }

    /* renamed from: a */
    public final Object m30827a(Object obj) {
        List<C5961d3> list;
        Object obj2;
        synchronized (this.f33851e) {
        }
        if (obj != null) {
            return obj;
        }
        if (AbstractC5949c3.f33805a == null) {
            return this.f33849c;
        }
        synchronized (f33846h) {
            try {
                if (!C5945c.m30814a()) {
                    try {
                        list = AbstractC5972e3.f33907a;
                        for (C5961d3 c5961d3 : list) {
                            if (!C5945c.m30814a()) {
                                Object obj3 = null;
                                try {
                                    InterfaceC5937b3 interfaceC5937b3 = c5961d3.f33848b;
                                    if (interfaceC5937b3 != null) {
                                        obj3 = interfaceC5937b3.zza();
                                    }
                                } catch (IllegalStateException unused) {
                                }
                                synchronized (f33846h) {
                                    c5961d3.f33853g = obj3;
                                }
                            } else {
                                throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                            }
                        }
                    } catch (SecurityException unused2) {
                    }
                    InterfaceC5937b3 interfaceC5937b32 = this.f33848b;
                    if (interfaceC5937b32 == null) {
                        return this.f33849c;
                    }
                    try {
                        return interfaceC5937b32.zza();
                    } catch (IllegalStateException unused3) {
                        return this.f33849c;
                    } catch (SecurityException unused4) {
                        return this.f33849c;
                    }
                }
                if (this.f33853g == null) {
                    obj2 = this.f33849c;
                } else {
                    obj2 = this.f33853g;
                }
                return obj2;
            } finally {
            }
        }
    }

    /* renamed from: b */
    public final String m30828b() {
        return this.f33847a;
    }
}
