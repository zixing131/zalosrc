package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;

/* renamed from: com.android.billingclient.api.e */
/* loaded from: classes2.dex */
public abstract class AbstractC3894e {

    /* renamed from: com.android.billingclient.api.e$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        private volatile C3904g1 f15491a;

        /* renamed from: b */
        private final Context f15492b;

        /* renamed from: c */
        private volatile InterfaceC3949u f15493c;

        /* renamed from: d */
        private volatile boolean f15494d;

        /* synthetic */ a(Context context, AbstractC3881a2 abstractC3881a2) {
            this.f15492b = context;
        }

        /* renamed from: a */
        public AbstractC3894e m18539a() {
            if (this.f15492b != null) {
                if (this.f15493c == null) {
                    if (this.f15494d) {
                        return new C3898f(null, this.f15492b, null, null);
                    }
                    throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
                }
                if (this.f15491a != null) {
                    if (this.f15493c != null) {
                        return new C3898f(null, this.f15491a, this.f15492b, this.f15493c, null, null, null);
                    }
                    return new C3898f(null, this.f15491a, this.f15492b, null, null, null);
                }
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }

        /* renamed from: b */
        public a m18540b() {
            C3896e1 c3896e1 = new C3896e1(null);
            c3896e1.m18542a();
            this.f15491a = c3896e1.m18543b();
            return this;
        }

        /* renamed from: c */
        public a m18541c(InterfaceC3949u interfaceC3949u) {
            this.f15493c = interfaceC3949u;
            return this;
        }
    }

    /* renamed from: h */
    public static a m18528h(Context context) {
        return new a(context, null);
    }

    /* renamed from: a */
    public abstract void mo18529a(C3882b c3882b, InterfaceC3886c interfaceC3886c);

    /* renamed from: b */
    public abstract void mo18530b(C3922l c3922l, InterfaceC3925m interfaceC3925m);

    /* renamed from: c */
    public abstract void mo18531c();

    /* renamed from: d */
    public abstract void mo18532d(C3928n c3928n, InterfaceC3910i interfaceC3910i);

    /* renamed from: e */
    public abstract int mo18533e();

    /* renamed from: f */
    public abstract C3918k mo18534f(String str);

    /* renamed from: g */
    public abstract C3918k mo18535g(Activity activity, C3914j c3914j);

    /* renamed from: i */
    public abstract void mo18536i(C3952v c3952v, InterfaceC3937q interfaceC3937q);

    /* renamed from: j */
    public abstract void mo18537j(C3955w c3955w, InterfaceC3946t interfaceC3946t);

    /* renamed from: k */
    public abstract void mo18538k(InterfaceC3902g interfaceC3902g);
}
