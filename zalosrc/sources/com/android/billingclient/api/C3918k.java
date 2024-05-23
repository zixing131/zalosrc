package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.AbstractC5856w;

/* renamed from: com.android.billingclient.api.k */
/* loaded from: classes2.dex */
public final class C3918k {

    /* renamed from: a */
    private int f15575a;

    /* renamed from: b */
    private String f15576b;

    /* renamed from: com.android.billingclient.api.k$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        private int f15577a;

        /* renamed from: b */
        private String f15578b = "";

        /* synthetic */ a(AbstractC3947t0 abstractC3947t0) {
        }

        /* renamed from: a */
        public C3918k m18653a() {
            C3918k c3918k = new C3918k();
            c3918k.f15575a = this.f15577a;
            c3918k.f15576b = this.f15578b;
            return c3918k;
        }

        /* renamed from: b */
        public a m18654b(String str) {
            this.f15578b = str;
            return this;
        }

        /* renamed from: c */
        public a m18655c(int i11) {
            this.f15577a = i11;
            return this;
        }
    }

    /* renamed from: c */
    public static a m18648c() {
        return new a(null);
    }

    /* renamed from: a */
    public String m18651a() {
        return this.f15576b;
    }

    /* renamed from: b */
    public int m18652b() {
        return this.f15575a;
    }

    public String toString() {
        return "Response Code: " + AbstractC5856w.m30539h(this.f15575a) + ", Debug Message: " + this.f15576b;
    }
}
