package com.android.billingclient.api;

/* renamed from: com.android.billingclient.api.w */
/* loaded from: classes2.dex */
public final class C3955w {

    /* renamed from: a */
    private final String f15667a;

    /* renamed from: com.android.billingclient.api.w$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        private String f15668a;

        /* synthetic */ a(AbstractC3951u1 abstractC3951u1) {
        }

        /* renamed from: a */
        public C3955w m18719a() {
            if (this.f15668a != null) {
                return new C3955w(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        /* renamed from: b */
        public a m18720b(String str) {
            this.f15668a = str;
            return this;
        }
    }

    /* synthetic */ C3955w(a aVar, AbstractC3954v1 abstractC3954v1) {
        this.f15667a = aVar.f15668a;
    }

    /* renamed from: a */
    public static a m18716a() {
        return new a(null);
    }

    /* renamed from: b */
    public final String m18717b() {
        return this.f15667a;
    }
}
