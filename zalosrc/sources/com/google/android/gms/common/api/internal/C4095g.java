package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C4086d;
import com.google.android.gms.common.internal.AbstractC4205o;
import p704z4.AbstractC31219b0;
import p704z4.AbstractC31221c0;
import p704z4.InterfaceC31230h;

/* renamed from: com.google.android.gms.common.api.internal.g */
/* loaded from: classes2.dex */
public class C4095g {

    /* renamed from: a */
    public final AbstractC4092f f16304a;

    /* renamed from: b */
    public final AbstractC4101i f16305b;

    /* renamed from: c */
    public final Runnable f16306c;

    /* renamed from: com.google.android.gms.common.api.internal.g$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        private InterfaceC31230h f16307a;

        /* renamed from: b */
        private InterfaceC31230h f16308b;

        /* renamed from: d */
        private C4086d f16310d;

        /* renamed from: e */
        private Feature[] f16311e;

        /* renamed from: g */
        private int f16313g;

        /* renamed from: c */
        private Runnable f16309c = new Runnable() { // from class: z4.a0
            @Override // java.lang.Runnable
            public final void run() {
            }
        };

        /* renamed from: f */
        private boolean f16312f = true;

        /* synthetic */ a(AbstractC31219b0 abstractC31219b0) {
        }

        /* renamed from: a */
        public C4095g m19412a() {
            boolean z11;
            boolean z12;
            boolean z13 = false;
            if (this.f16307a != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            AbstractC4205o.m19713b(z11, "Must set register function");
            if (this.f16308b != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            AbstractC4205o.m19713b(z12, "Must set unregister function");
            if (this.f16310d != null) {
                z13 = true;
            }
            AbstractC4205o.m19713b(z13, "Must set holder");
            return new C4095g(new C4141w0(this, this.f16310d, this.f16311e, this.f16312f, this.f16313g), new C4143x0(this, (C4086d.a) AbstractC4205o.m19723l(this.f16310d.m19391b(), "Key must not be null")), this.f16309c, null);
        }

        /* renamed from: b */
        public a m19413b(InterfaceC31230h interfaceC31230h) {
            this.f16307a = interfaceC31230h;
            return this;
        }

        /* renamed from: c */
        public a m19414c(int i11) {
            this.f16313g = i11;
            return this;
        }

        /* renamed from: d */
        public a m19415d(InterfaceC31230h interfaceC31230h) {
            this.f16308b = interfaceC31230h;
            return this;
        }

        /* renamed from: e */
        public a m19416e(C4086d c4086d) {
            this.f16310d = c4086d;
            return this;
        }
    }

    /* synthetic */ C4095g(AbstractC4092f abstractC4092f, AbstractC4101i abstractC4101i, Runnable runnable, AbstractC31221c0 abstractC31221c0) {
        this.f16304a = abstractC4092f;
        this.f16305b = abstractC4101i;
        this.f16306c = runnable;
    }

    /* renamed from: a */
    public static a m19409a() {
        return new a(null);
    }
}
