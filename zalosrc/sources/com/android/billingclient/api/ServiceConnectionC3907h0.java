package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.AbstractBinderC5843t4;
import com.google.android.gms.internal.play_billing.AbstractC5856w;
import com.google.android.gms.internal.play_billing.C5831r4;
import com.google.android.gms.internal.play_billing.InterfaceC5849u4;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.android.billingclient.api.h0 */
/* loaded from: classes2.dex */
public final class ServiceConnectionC3907h0 implements ServiceConnection {

    /* renamed from: p */
    private final Object f15534p = new Object();

    /* renamed from: q */
    private boolean f15535q = false;

    /* renamed from: r */
    private InterfaceC3902g f15536r;

    /* renamed from: s */
    final /* synthetic */ C3898f f15537s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ServiceConnectionC3907h0(C3898f c3898f, InterfaceC3902g interfaceC3902g, AbstractC3903g0 abstractC3903g0) {
        this.f15537s = c3898f;
        this.f15536r = interfaceC3902g;
    }

    /* renamed from: d */
    private final void m18595d(C3918k c3918k) {
        synchronized (this.f15534p) {
            try {
                InterfaceC3902g interfaceC3902g = this.f15536r;
                if (interfaceC3902g != null) {
                    interfaceC3902g.mo18592c(c3918k);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020e  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ Object m18596a() {
        Bundle bundle;
        int i11;
        int i12;
        InterfaceC3944s0 interfaceC3944s0;
        InterfaceC3944s0 interfaceC3944s02;
        Context context;
        boolean z11;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        int i15;
        boolean z15;
        int i16;
        boolean z16;
        int i17;
        boolean z17;
        int i18;
        boolean z18;
        int i19;
        boolean z19;
        int i21;
        boolean z21;
        int i22;
        boolean z22;
        int i23;
        boolean z23;
        int i24;
        boolean z24;
        int i25;
        boolean z25;
        int i26;
        int i27;
        C3966z1 c3966z1;
        C3966z1 c3966z12;
        Context context2;
        InterfaceC5849u4 interfaceC5849u4;
        int i28;
        InterfaceC5849u4 interfaceC5849u42;
        InterfaceC5849u4 interfaceC5849u43;
        InterfaceC5849u4 interfaceC5849u44;
        synchronized (this.f15534p) {
            try {
                if (!this.f15535q) {
                    if (!TextUtils.isEmpty(null)) {
                        bundle = new Bundle();
                        bundle.putString("accountName", null);
                    } else {
                        bundle = null;
                    }
                    int i29 = 3;
                    try {
                        context = this.f15537s.f15504e;
                        String packageName = context.getPackageName();
                        int i31 = 21;
                        i12 = 3;
                        while (true) {
                            if (i31 >= 3) {
                                if (bundle == null) {
                                    try {
                                        interfaceC5849u43 = this.f15537s.f15506g;
                                        i12 = interfaceC5849u43.mo30477w1(i31, packageName, "subs");
                                    } catch (Exception e11) {
                                        e = e11;
                                        i29 = i12;
                                        AbstractC5856w.m30543l("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
                                        this.f15537s.f15500a = 0;
                                        this.f15537s.f15506g = null;
                                        i11 = 42;
                                        i12 = i29;
                                        if (i12 != 0) {
                                        }
                                        return null;
                                    }
                                } else {
                                    interfaceC5849u44 = this.f15537s.f15506g;
                                    i12 = interfaceC5849u44.mo30469C4(i31, packageName, "subs", bundle);
                                }
                                if (i12 == 0) {
                                    AbstractC5856w.m30541j("BillingClient", "highestLevelSupportedForSubs: " + i31);
                                    break;
                                }
                                i31--;
                            } else {
                                i31 = 0;
                                break;
                            }
                        }
                        C3898f c3898f = this.f15537s;
                        boolean z26 = true;
                        if (i31 >= 5) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        c3898f.f15509j = z11;
                        C3898f c3898f2 = this.f15537s;
                        if (i31 >= 3) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        c3898f2.f15508i = z12;
                        if (i31 < 3) {
                            AbstractC5856w.m30541j("BillingClient", "In-app billing API does not support subscription on this device.");
                            i11 = 9;
                        } else {
                            i11 = 1;
                        }
                        int i32 = 21;
                        while (true) {
                            if (i32 < 3) {
                                break;
                            }
                            if (bundle == null) {
                                interfaceC5849u42 = this.f15537s.f15506g;
                                i12 = interfaceC5849u42.mo30477w1(i32, packageName, "inapp");
                            } else {
                                interfaceC5849u4 = this.f15537s.f15506g;
                                i12 = interfaceC5849u4.mo30469C4(i32, packageName, "inapp", bundle);
                            }
                            if (i12 == 0) {
                                this.f15537s.f15510k = i32;
                                i28 = this.f15537s.f15510k;
                                AbstractC5856w.m30541j("BillingClient", "mHighestLevelSupportedForInApp: " + i28);
                                break;
                            }
                            i32--;
                        }
                        C3898f c3898f3 = this.f15537s;
                        i13 = c3898f3.f15510k;
                        if (i13 >= 21) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        c3898f3.f15523x = z13;
                        C3898f c3898f4 = this.f15537s;
                        i14 = c3898f4.f15510k;
                        if (i14 >= 20) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        c3898f4.f15522w = z14;
                        C3898f c3898f5 = this.f15537s;
                        i15 = c3898f5.f15510k;
                        if (i15 >= 19) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        c3898f5.f15521v = z15;
                        C3898f c3898f6 = this.f15537s;
                        i16 = c3898f6.f15510k;
                        if (i16 >= 18) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        c3898f6.f15520u = z16;
                        C3898f c3898f7 = this.f15537s;
                        i17 = c3898f7.f15510k;
                        if (i17 >= 17) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        c3898f7.f15519t = z17;
                        C3898f c3898f8 = this.f15537s;
                        i18 = c3898f8.f15510k;
                        if (i18 >= 16) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        c3898f8.f15518s = z18;
                        C3898f c3898f9 = this.f15537s;
                        i19 = c3898f9.f15510k;
                        if (i19 >= 15) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        c3898f9.f15517r = z19;
                        C3898f c3898f10 = this.f15537s;
                        i21 = c3898f10.f15510k;
                        if (i21 >= 14) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        c3898f10.f15516q = z21;
                        C3898f c3898f11 = this.f15537s;
                        i22 = c3898f11.f15510k;
                        if (i22 >= 12) {
                            z22 = true;
                        } else {
                            z22 = false;
                        }
                        c3898f11.f15515p = z22;
                        C3898f c3898f12 = this.f15537s;
                        i23 = c3898f12.f15510k;
                        if (i23 >= 10) {
                            z23 = true;
                        } else {
                            z23 = false;
                        }
                        c3898f12.f15514o = z23;
                        C3898f c3898f13 = this.f15537s;
                        i24 = c3898f13.f15510k;
                        if (i24 >= 9) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        c3898f13.f15513n = z24;
                        C3898f c3898f14 = this.f15537s;
                        i25 = c3898f14.f15510k;
                        if (i25 >= 8) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        c3898f14.f15512m = z25;
                        C3898f c3898f15 = this.f15537s;
                        i26 = c3898f15.f15510k;
                        if (i26 < 6) {
                            z26 = false;
                        }
                        c3898f15.f15511l = z26;
                        i27 = this.f15537s.f15510k;
                        if (i27 < 3) {
                            AbstractC5856w.m30542k("BillingClient", "In-app billing API version 3 is not supported on this device.");
                            i11 = 36;
                        }
                        if (i12 == 0) {
                            this.f15537s.f15500a = 2;
                            c3966z1 = this.f15537s.f15503d;
                            if (c3966z1 != null) {
                                c3966z12 = this.f15537s.f15503d;
                                context2 = this.f15537s.f15504e;
                                context2.getPackageName();
                                c3966z12.m18733f(false);
                            }
                        } else {
                            this.f15537s.f15500a = 0;
                            this.f15537s.f15506g = null;
                        }
                    } catch (Exception e12) {
                        e = e12;
                    }
                    if (i12 != 0) {
                        interfaceC3944s02 = this.f15537s.f15505f;
                        interfaceC3944s02.mo18698c(AbstractC3941r0.m18695b(6));
                        m18595d(AbstractC3950u0.f15646l);
                    } else {
                        interfaceC3944s0 = this.f15537s.f15505f;
                        C3918k c3918k = AbstractC3950u0.f15635a;
                        interfaceC3944s0.mo18696a(AbstractC3941r0.m18694a(i11, 6, c3918k));
                        m18595d(c3918k);
                    }
                }
            } finally {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void m18597b() {
        InterfaceC3944s0 interfaceC3944s0;
        this.f15537s.f15500a = 0;
        this.f15537s.f15506g = null;
        interfaceC3944s0 = this.f15537s.f15505f;
        C3918k c3918k = AbstractC3950u0.f15648n;
        interfaceC3944s0.mo18696a(AbstractC3941r0.m18694a(24, 6, c3918k));
        m18595d(c3918k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m18598c() {
        synchronized (this.f15534p) {
            this.f15536r = null;
            this.f15535q = true;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Handler m18545G;
        Future m18550L;
        C3918k m18548J;
        InterfaceC3944s0 interfaceC3944s0;
        AbstractC5856w.m30541j("BillingClient", "Billing service connected.");
        this.f15537s.f15506g = AbstractBinderC5843t4.m30481N(iBinder);
        Callable callable = new Callable() { // from class: com.android.billingclient.api.e0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ServiceConnectionC3907h0.this.m18596a();
                return null;
            }
        };
        Runnable runnable = new Runnable() { // from class: com.android.billingclient.api.f0
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC3907h0.this.m18597b();
            }
        };
        C3898f c3898f = this.f15537s;
        m18545G = c3898f.m18545G();
        m18550L = c3898f.m18550L(callable, 30000L, runnable, m18545G);
        if (m18550L == null) {
            C3898f c3898f2 = this.f15537s;
            m18548J = c3898f2.m18548J();
            interfaceC3944s0 = c3898f2.f15505f;
            interfaceC3944s0.mo18696a(AbstractC3941r0.m18694a(25, 6, m18548J));
            m18595d(m18548J);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        InterfaceC3944s0 interfaceC3944s0;
        AbstractC5856w.m30542k("BillingClient", "Billing service disconnected.");
        interfaceC3944s0 = this.f15537s.f15505f;
        interfaceC3944s0.mo18697b(C5831r4.m30444u());
        this.f15537s.f15506g = null;
        this.f15537s.f15500a = 0;
        synchronized (this.f15534p) {
            try {
                InterfaceC3902g interfaceC3902g = this.f15536r;
                if (interfaceC3902g != null) {
                    interfaceC3902g.mo18593d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
