package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.AbstractC4150d;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.InterfaceC5434j1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p198h5.C19879b;
import p230i6.InterfaceC20314f;

/* renamed from: com.google.android.gms.measurement.internal.e8 */
/* loaded from: classes.dex */
public final class C5977e8 extends AbstractC6148u3 {

    /* renamed from: c */
    private final ServiceConnectionC5966d8 f33979c;

    /* renamed from: d */
    private InterfaceC20314f f33980d;

    /* renamed from: e */
    private volatile Boolean f33981e;

    /* renamed from: f */
    private final AbstractC6067n f33982f;

    /* renamed from: g */
    private final C6164v8 f33983g;

    /* renamed from: h */
    private final List f33984h;

    /* renamed from: i */
    private final AbstractC6067n f33985i;

    public C5977e8(C6127s4 c6127s4) {
        super(c6127s4);
        this.f33984h = new ArrayList();
        this.f33983g = new C6164v8(c6127s4.mo31031a());
        this.f33979c = new ServiceConnectionC5966d8(this);
        this.f33982f = new C6086o7(this, c6127s4);
        this.f33985i = new C6108q7(this, c6127s4);
    }

    /* renamed from: C */
    private final zzq m30858C(boolean z11) {
        Pair m30791a;
        this.f34158a.mo31035f();
        C5994g3 m31370B = this.f34158a.m31370B();
        String str = null;
        if (z11) {
            C6082o3 mo31033c = this.f34158a.mo31033c();
            if (mo31033c.f34158a.m31374F().f33808d != null && (m30791a = mo31033c.f34158a.m31374F().f33808d.m30791a()) != null && m30791a != C5950c4.f33806y) {
                str = String.valueOf(m30791a.second) + ":" + ((String) m30791a.first);
            }
        }
        return m31370B.m30939p(str);
    }

    /* renamed from: D */
    public final void m30859D() {
        mo31036g();
        this.f34158a.mo31033c().m31201u().m31109b("Processing queued up service tasks", Integer.valueOf(this.f33984h.size()));
        Iterator it = this.f33984h.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e11) {
                this.f34158a.mo31033c().m31197q().m31109b("Task exception while flushing queue", e11);
            }
        }
        this.f33984h.clear();
        this.f33985i.m31146b();
    }

    /* renamed from: E */
    public final void m30860E() {
        mo31036g();
        this.f33983g.m31468b();
        AbstractC6067n abstractC6067n = this.f33982f;
        this.f34158a.m31401z();
        abstractC6067n.m31148d(((Long) AbstractC5972e3.f33892L.m30827a(null)).longValue());
    }

    /* renamed from: F */
    private final void m30861F(Runnable runnable) {
        mo31036g();
        if (m30892z()) {
            runnable.run();
            return;
        }
        long size = this.f33984h.size();
        this.f34158a.m31401z();
        if (size >= 1000) {
            this.f34158a.mo31033c().m31197q().m31108a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.f33984h.add(runnable);
        this.f33985i.m31148d(60000L);
        m30873P();
    }

    /* renamed from: G */
    private final boolean m30862G() {
        this.f34158a.mo31035f();
        return true;
    }

    /* renamed from: K */
    public static /* bridge */ /* synthetic */ void m30865K(C5977e8 c5977e8, InterfaceC20314f interfaceC20314f) {
        c5977e8.f33980d = null;
    }

    /* renamed from: L */
    public static /* bridge */ /* synthetic */ void m30866L(C5977e8 c5977e8) {
        c5977e8.m30859D();
    }

    /* renamed from: M */
    public static /* bridge */ /* synthetic */ void m30867M(C5977e8 c5977e8, ComponentName componentName) {
        c5977e8.mo31036g();
        if (c5977e8.f33980d != null) {
            c5977e8.f33980d = null;
            c5977e8.f34158a.mo31033c().m31201u().m31109b("Disconnected from device MeasurementService", componentName);
            c5977e8.mo31036g();
            c5977e8.m30873P();
        }
    }

    /* renamed from: A */
    public final boolean m30869A() {
        mo31036g();
        m31455h();
        if (!m30870B() || this.f34158a.m31381N().m31350q0() >= ((Integer) AbstractC5972e3.f33926j0.m30827a(null)).intValue()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x012c  */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m30870B() {
        Boolean valueOf;
        mo31036g();
        m31455h();
        if (this.f33981e == null) {
            mo31036g();
            m31455h();
            C5950c4 m31374F = this.f34158a.m31374F();
            m31374F.mo31036g();
            boolean z11 = false;
            if (!m31374F.m30817n().contains("use_service")) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(m31374F.m30817n().getBoolean("use_service", false));
            }
            boolean z12 = true;
            if (valueOf == null || !valueOf.booleanValue()) {
                this.f34158a.mo31035f();
                if (this.f34158a.m31370B().m30937n() != 1) {
                    this.f34158a.mo31033c().m31201u().m31108a("Checking service availability");
                    int m31352r0 = this.f34158a.m31381N().m31352r0(AbstractC4150d.f16480a);
                    if (m31352r0 != 0) {
                        if (m31352r0 != 1) {
                            if (m31352r0 != 2) {
                                if (m31352r0 != 3) {
                                    if (m31352r0 != 9) {
                                        if (m31352r0 != 18) {
                                            this.f34158a.mo31033c().m31202w().m31109b("Unexpected service status", Integer.valueOf(m31352r0));
                                        } else {
                                            this.f34158a.mo31033c().m31202w().m31108a("Service updating");
                                        }
                                    } else {
                                        this.f34158a.mo31033c().m31202w().m31108a("Service invalid");
                                    }
                                } else {
                                    this.f34158a.mo31033c().m31202w().m31108a("Service disabled");
                                }
                            } else {
                                this.f34158a.mo31033c().m31196p().m31108a("Service container out of date");
                                if (this.f34158a.m31381N().m31350q0() >= 17443) {
                                    if (valueOf != null) {
                                        z12 = false;
                                    }
                                    z11 = z12;
                                }
                            }
                            z12 = false;
                        } else {
                            this.f34158a.mo31033c().m31201u().m31108a("Service missing");
                        }
                        if (z11 && this.f34158a.m31401z().m30918G()) {
                            this.f34158a.mo31033c().m31197q().m31108a("No way to upload. Consider using the full version of Analytics");
                        } else if (z12) {
                            C5950c4 m31374F2 = this.f34158a.m31374F();
                            m31374F2.mo31036g();
                            SharedPreferences.Editor edit = m31374F2.m30817n().edit();
                            edit.putBoolean("use_service", z11);
                            edit.apply();
                        }
                        z12 = z11;
                    } else {
                        this.f34158a.mo31033c().m31201u().m31108a("Service available");
                    }
                }
                z11 = true;
                if (z11) {
                }
                if (z12) {
                }
                z12 = z11;
            }
            this.f33981e = Boolean.valueOf(z12);
        }
        return this.f33981e.booleanValue();
    }

    /* renamed from: J */
    public final Boolean m30871J() {
        return this.f33981e;
    }

    /* renamed from: O */
    public final void m30872O() {
        mo31036g();
        m31455h();
        zzq m30858C = m30858C(true);
        this.f34158a.m31371C().m30954q();
        m30861F(new RunnableC6053l7(this, m30858C));
    }

    /* renamed from: P */
    public final void m30873P() {
        mo31036g();
        m31455h();
        if (m30892z()) {
            return;
        }
        if (!m30870B()) {
            if (!this.f34158a.m31401z().m30918G()) {
                this.f34158a.mo31035f();
                List<ResolveInfo> queryIntentServices = this.f34158a.mo31032b().getPackageManager().queryIntentServices(new Intent().setClassName(this.f34158a.mo31032b(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                    Intent intent = new Intent("com.google.android.gms.measurement.START");
                    Context mo31032b = this.f34158a.mo31032b();
                    this.f34158a.mo31035f();
                    intent.setComponent(new ComponentName(mo31032b, "com.google.android.gms.measurement.AppMeasurementService"));
                    this.f33979c.m30830b(intent);
                    return;
                }
                this.f34158a.mo31033c().m31197q().m31108a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                return;
            }
            return;
        }
        this.f33979c.m30831c();
    }

    /* renamed from: Q */
    public final void m30874Q() {
        mo31036g();
        m31455h();
        this.f33979c.m30832d();
        try {
            C19879b.m103558b().m103564c(this.f34158a.mo31032b(), this.f33979c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f33980d = null;
    }

    /* renamed from: R */
    public final void m30875R(InterfaceC5434j1 interfaceC5434j1) {
        mo31036g();
        m31455h();
        m30861F(new RunnableC6042k7(this, m30858C(false), interfaceC5434j1));
    }

    /* renamed from: S */
    public final void m30876S(AtomicReference atomicReference) {
        mo31036g();
        m31455h();
        m30861F(new RunnableC6031j7(this, atomicReference, m30858C(false)));
    }

    /* renamed from: T */
    public final void m30877T(InterfaceC5434j1 interfaceC5434j1, String str, String str2) {
        mo31036g();
        m31455h();
        m30861F(new RunnableC6174w7(this, str, str2, m30858C(false), interfaceC5434j1));
    }

    /* renamed from: U */
    public final void m30878U(AtomicReference atomicReference, String str, String str2, String str3) {
        mo31036g();
        m31455h();
        m30861F(new RunnableC6163v7(this, atomicReference, null, str2, str3, m30858C(false)));
    }

    /* renamed from: V */
    public final void m30879V(InterfaceC5434j1 interfaceC5434j1, String str, String str2, boolean z11) {
        mo31036g();
        m31455h();
        m30861F(new RunnableC5987f7(this, str, str2, m30858C(false), z11, interfaceC5434j1));
    }

    /* renamed from: W */
    public final void m30880W(AtomicReference atomicReference, String str, String str2, String str3, boolean z11) {
        mo31036g();
        m31455h();
        m30861F(new RunnableC6185x7(this, atomicReference, null, str2, str3, m30858C(false), z11));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6148u3
    /* renamed from: m */
    protected final boolean mo30852m() {
        return false;
    }

    /* renamed from: n */
    public final void m30881n(zzaw zzawVar, String str) {
        AbstractC4205o.m19722k(zzawVar);
        mo31036g();
        m31455h();
        m30862G();
        m30861F(new RunnableC6141t7(this, true, m30858C(true), this.f34158a.m31371C().m30958u(zzawVar), zzawVar, str));
    }

    /* renamed from: o */
    public final void m30882o(InterfaceC5434j1 interfaceC5434j1, zzaw zzawVar, String str) {
        mo31036g();
        m31455h();
        if (this.f34158a.m31381N().m31352r0(AbstractC4150d.f16480a) != 0) {
            this.f34158a.mo31033c().m31202w().m31108a("Not bundling data. Service unavailable or out of date");
            this.f34158a.m31381N().m31322H(interfaceC5434j1, new byte[0]);
        } else {
            m30861F(new RunnableC6097p7(this, zzawVar, str, interfaceC5434j1));
        }
    }

    /* renamed from: p */
    public final void m30883p() {
        mo31036g();
        m31455h();
        zzq m30858C = m30858C(false);
        m30862G();
        this.f34158a.m31371C().m30953p();
        m30861F(new RunnableC6020i7(this, m30858C));
    }

    /* renamed from: q */
    public final void m30884q(InterfaceC20314f interfaceC20314f, AbstractSafeParcelable abstractSafeParcelable, zzq zzqVar) {
        int i11;
        mo31036g();
        m31455h();
        m30862G();
        this.f34158a.m31401z();
        int i12 = 0;
        int i13 = 100;
        while (i12 < 1001 && i13 == 100) {
            ArrayList arrayList = new ArrayList();
            List m30952o = this.f34158a.m31371C().m30952o(100);
            if (m30952o != null) {
                arrayList.addAll(m30952o);
                i11 = m30952o.size();
            } else {
                i11 = 0;
            }
            if (abstractSafeParcelable != null && i11 < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList.get(i14);
                if (abstractSafeParcelable2 instanceof zzaw) {
                    try {
                        interfaceC20314f.mo30903b1((zzaw) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e11) {
                        this.f34158a.mo31033c().m31197q().m31109b("Failed to send event to the service", e11);
                    }
                } else if (abstractSafeParcelable2 instanceof zzli) {
                    try {
                        interfaceC20314f.mo30900X1((zzli) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e12) {
                        this.f34158a.mo31033c().m31197q().m31109b("Failed to send user property to the service", e12);
                    }
                } else if (abstractSafeParcelable2 instanceof zzac) {
                    try {
                        interfaceC20314f.mo30907z4((zzac) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e13) {
                        this.f34158a.mo31033c().m31197q().m31109b("Failed to send conditional user property to the service", e13);
                    }
                } else {
                    this.f34158a.mo31033c().m31197q().m31108a("Discarding data. Unrecognized parcel type.");
                }
            }
            i12++;
            i13 = i11;
        }
    }

    /* renamed from: r */
    public final void m30885r(zzac zzacVar) {
        AbstractC4205o.m19722k(zzacVar);
        mo31036g();
        m31455h();
        this.f34158a.mo31035f();
        m30861F(new RunnableC6152u7(this, true, m30858C(true), this.f34158a.m31371C().m30957t(zzacVar), new zzac(zzacVar), zzacVar));
    }

    /* renamed from: s */
    public final void m30886s(boolean z11) {
        mo31036g();
        m31455h();
        if (z11) {
            m30862G();
            this.f34158a.m31371C().m30953p();
        }
        if (m30869A()) {
            m30861F(new RunnableC6130s7(this, m30858C(false)));
        }
    }

    /* renamed from: t */
    public final void m30887t(C6184x6 c6184x6) {
        mo31036g();
        m31455h();
        m30861F(new RunnableC6064m7(this, c6184x6));
    }

    /* renamed from: u */
    public final void m30888u(Bundle bundle) {
        mo31036g();
        m31455h();
        m30861F(new RunnableC6075n7(this, m30858C(false), bundle));
    }

    /* renamed from: w */
    public final void m30889w() {
        mo31036g();
        m31455h();
        m30861F(new RunnableC6119r7(this, m30858C(true)));
    }

    /* renamed from: x */
    public final void m30890x(InterfaceC20314f interfaceC20314f) {
        mo31036g();
        AbstractC4205o.m19722k(interfaceC20314f);
        this.f33980d = interfaceC20314f;
        m30860E();
        m30859D();
    }

    /* renamed from: y */
    public final void m30891y(zzli zzliVar) {
        mo31036g();
        m31455h();
        m30862G();
        m30861F(new RunnableC6009h7(this, m30858C(true), this.f34158a.m31371C().m30959w(zzliVar), zzliVar));
    }

    /* renamed from: z */
    public final boolean m30892z() {
        mo31036g();
        m31455h();
        if (this.f33980d != null) {
            return true;
        }
        return false;
    }
}
