package com.android.billingclient.api;

/* renamed from: com.android.billingclient.api.l */
/* loaded from: classes2.dex */
public final class C3922l {

    /* renamed from: a */
    private String f15581a;

    /* renamed from: com.android.billingclient.api.l$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        private String f15582a;

        /* synthetic */ a(AbstractC3953v0 abstractC3953v0) {
        }

        /* renamed from: a */
        public C3922l m18659a() {
            String str = this.f15582a;
            if (str != null) {
                C3922l c3922l = new C3922l(null);
                c3922l.f15581a = str;
                return c3922l;
            }
            throw new IllegalArgumentException("Purchase token must be set");
        }

        /* renamed from: b */
        public a m18660b(String str) {
            this.f15582a = str;
            return this;
        }
    }

    /* synthetic */ C3922l(AbstractC3956w0 abstractC3956w0) {
    }

    /* renamed from: b */
    public static a m18656b() {
        return new a(null);
    }

    /* renamed from: a */
    public String m18658a() {
        return this.f15581a;
    }
}
