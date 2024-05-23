package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C4071a;
import com.google.android.gms.common.internal.AbstractC4205o;
import p342m6.C22890k;
import p704z4.AbstractC31231h0;
import p704z4.InterfaceC31230h;

/* renamed from: com.google.android.gms.common.api.internal.h */
/* loaded from: classes2.dex */
public abstract class AbstractC4098h {

    /* renamed from: a */
    private final Feature[] f16339a;

    /* renamed from: b */
    private final boolean f16340b;

    /* renamed from: c */
    private final int f16341c;

    /* renamed from: com.google.android.gms.common.api.internal.h$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        private InterfaceC31230h f16342a;

        /* renamed from: c */
        private Feature[] f16344c;

        /* renamed from: b */
        private boolean f16343b = true;

        /* renamed from: d */
        private int f16345d = 0;

        /* synthetic */ a(AbstractC31231h0 abstractC31231h0) {
        }

        /* renamed from: a */
        public AbstractC4098h m19436a() {
            boolean z11;
            if (this.f16342a != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            AbstractC4205o.m19713b(z11, "execute parameter required");
            return new C4145y0(this, this.f16344c, this.f16343b, this.f16345d);
        }

        /* renamed from: b */
        public a m19437b(InterfaceC31230h interfaceC31230h) {
            this.f16342a = interfaceC31230h;
            return this;
        }

        /* renamed from: c */
        public a m19438c(boolean z11) {
            this.f16343b = z11;
            return this;
        }

        /* renamed from: d */
        public a m19439d(Feature... featureArr) {
            this.f16344c = featureArr;
            return this;
        }

        /* renamed from: e */
        public a m19440e(int i11) {
            this.f16345d = i11;
            return this;
        }
    }

    public AbstractC4098h() {
        this.f16339a = null;
        this.f16340b = false;
        this.f16341c = 0;
    }

    /* renamed from: a */
    public static a m19430a() {
        return new a(null);
    }

    /* renamed from: b */
    public abstract void mo19431b(C4071a.b bVar, C22890k c22890k);

    /* renamed from: c */
    public boolean m19432c() {
        return this.f16340b;
    }

    /* renamed from: d */
    public final int m19433d() {
        return this.f16341c;
    }

    /* renamed from: e */
    public final Feature[] m19434e() {
        return this.f16339a;
    }

    public AbstractC4098h(Feature[] featureArr, boolean z11, int i11) {
        this.f16339a = featureArr;
        boolean z12 = false;
        if (featureArr != null && z11) {
            z12 = true;
        }
        this.f16340b = z12;
        this.f16341c = i11;
    }
}
