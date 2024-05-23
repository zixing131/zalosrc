package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.AbstractC5766h;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.android.billingclient.api.v */
/* loaded from: classes2.dex */
public final class C3952v {

    /* renamed from: a */
    private final AbstractC5766h f15661a;

    /* renamed from: com.android.billingclient.api.v$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        private AbstractC5766h f15662a;

        /* synthetic */ a(AbstractC3939q1 abstractC3939q1) {
        }

        /* renamed from: a */
        public C3952v m18706a() {
            return new C3952v(this, null);
        }

        /* renamed from: b */
        public a m18707b(List list) {
            if (list != null && !list.isEmpty()) {
                HashSet hashSet = new HashSet();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    if (!"play_pass_subs".equals(bVar.m18710c())) {
                        hashSet.add(bVar.m18710c());
                    }
                }
                if (hashSet.size() <= 1) {
                    this.f15662a = AbstractC5766h.m30236p(list);
                    return this;
                }
                throw new IllegalArgumentException("All products should be of the same product type.");
            }
            throw new IllegalArgumentException("Product list cannot be empty.");
        }
    }

    /* renamed from: com.android.billingclient.api.v$b */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a */
        private final String f15663a;

        /* renamed from: b */
        private final String f15664b;

        /* renamed from: com.android.billingclient.api.v$b$a */
        /* loaded from: classes2.dex */
        public static class a {

            /* renamed from: a */
            private String f15665a;

            /* renamed from: b */
            private String f15666b;

            /* synthetic */ a(AbstractC3942r1 abstractC3942r1) {
            }

            /* renamed from: a */
            public b m18713a() {
                if (!"first_party".equals(this.f15666b)) {
                    if (this.f15665a != null) {
                        if (this.f15666b != null) {
                            return new b(this, null);
                        }
                        throw new IllegalArgumentException("Product type must be provided.");
                    }
                    throw new IllegalArgumentException("Product id must be provided.");
                }
                throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
            }

            /* renamed from: b */
            public a m18714b(String str) {
                this.f15665a = str;
                return this;
            }

            /* renamed from: c */
            public a m18715c(String str) {
                this.f15666b = str;
                return this;
            }
        }

        /* synthetic */ b(a aVar, AbstractC3945s1 abstractC3945s1) {
            this.f15663a = aVar.f15665a;
            this.f15664b = aVar.f15666b;
        }

        /* renamed from: a */
        public static a m18708a() {
            return new a(null);
        }

        /* renamed from: b */
        public final String m18709b() {
            return this.f15663a;
        }

        /* renamed from: c */
        public final String m18710c() {
            return this.f15664b;
        }
    }

    /* synthetic */ C3952v(a aVar, AbstractC3948t1 abstractC3948t1) {
        this.f15661a = aVar.f15662a;
    }

    /* renamed from: a */
    public static a m18702a() {
        return new a(null);
    }

    /* renamed from: b */
    public final AbstractC5766h m18703b() {
        return this.f15661a;
    }

    /* renamed from: c */
    public final String m18704c() {
        return ((b) this.f15661a.get(0)).m18710c();
    }
}
