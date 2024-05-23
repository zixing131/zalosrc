package com.android.billingclient.api;

/* renamed from: com.android.billingclient.api.b */
/* loaded from: classes2.dex */
public final class C3882b {

    /* renamed from: a */
    private String f15474a;

    /* renamed from: com.android.billingclient.api.b$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        private String f15475a;

        /* synthetic */ a(AbstractC3961y abstractC3961y) {
        }

        /* renamed from: a */
        public C3882b m18525a() {
            String str = this.f15475a;
            if (str != null) {
                C3882b c3882b = new C3882b(null);
                c3882b.f15474a = str;
                return c3882b;
            }
            throw new IllegalArgumentException("Purchase token must be set");
        }

        /* renamed from: b */
        public a m18526b(String str) {
            this.f15475a = str;
            return this;
        }
    }

    /* synthetic */ C3882b(AbstractC3919k0 abstractC3919k0) {
    }

    /* renamed from: b */
    public static a m18522b() {
        return new a(null);
    }

    /* renamed from: a */
    public String m18524a() {
        return this.f15474a;
    }
}
