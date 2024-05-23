package com.android.billingclient.api;

import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.AbstractC5727a5;
import com.google.android.gms.internal.play_billing.AbstractC5766h;
import java.util.ArrayList;
import java.util.List;
import p664y.AbstractC30228a;

/* renamed from: com.android.billingclient.api.j */
/* loaded from: classes2.dex */
public class C3914j {

    /* renamed from: a */
    private boolean f15544a;

    /* renamed from: b */
    private String f15545b;

    /* renamed from: c */
    private String f15546c;

    /* renamed from: d */
    private c f15547d;

    /* renamed from: e */
    private AbstractC5766h f15548e;

    /* renamed from: f */
    private ArrayList f15549f;

    /* renamed from: g */
    private boolean f15550g;

    /* renamed from: com.android.billingclient.api.j$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        private String f15551a;

        /* renamed from: b */
        private String f15552b;

        /* renamed from: c */
        private List f15553c;

        /* renamed from: d */
        private ArrayList f15554d;

        /* renamed from: e */
        private boolean f15555e;

        /* renamed from: f */
        private c.a f15556f;

        /* synthetic */ a(AbstractC3923l0 abstractC3923l0) {
            c.a m18630a = c.m18630a();
            c.a.m18640g(m18630a);
            this.f15556f = m18630a;
        }

        /* renamed from: a */
        public C3914j m18618a() {
            boolean z11;
            boolean z12;
            ArrayList arrayList;
            AbstractC5766h m30237r;
            ArrayList arrayList2 = this.f15554d;
            boolean z13 = true;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                z11 = true;
            } else {
                z11 = false;
            }
            List list = this.f15553c;
            if (list != null && !list.isEmpty()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z11 && !z12) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
            if (z11 && z12) {
                throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            }
            AbstractC3938q0 abstractC3938q0 = null;
            if (z11) {
                if (!this.f15554d.contains(null)) {
                    if (this.f15554d.size() > 1) {
                        AbstractC30228a.m149044a(this.f15554d.get(0));
                        throw null;
                    }
                } else {
                    throw new IllegalArgumentException("SKU cannot be null.");
                }
            } else {
                b bVar = (b) this.f15553c.get(0);
                for (int i11 = 0; i11 < this.f15553c.size(); i11++) {
                    b bVar2 = (b) this.f15553c.get(i11);
                    if (bVar2 != null) {
                        if (i11 != 0 && !bVar2.m18623b().m18670c().equals(bVar.m18623b().m18670c()) && !bVar2.m18623b().m18670c().equals("play_pass_subs")) {
                            throw new IllegalArgumentException("All products should have same ProductType.");
                        }
                    } else {
                        throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                    }
                }
                String m18672e = bVar.m18623b().m18672e();
                for (b bVar3 : this.f15553c) {
                    if (!bVar.m18623b().m18670c().equals("play_pass_subs") && !bVar3.m18623b().m18670c().equals("play_pass_subs") && !m18672e.equals(bVar3.m18623b().m18672e())) {
                        throw new IllegalArgumentException("All products must have the same package name.");
                    }
                }
            }
            C3914j c3914j = new C3914j(abstractC3938q0);
            if (!z11) {
                if (!z12 || ((b) this.f15553c.get(0)).m18623b().m18672e().isEmpty()) {
                    z13 = false;
                }
                c3914j.f15544a = z13;
                c3914j.f15545b = this.f15551a;
                c3914j.f15546c = this.f15552b;
                c3914j.f15547d = this.f15556f.m18641a();
                ArrayList arrayList3 = this.f15554d;
                if (arrayList3 != null) {
                    arrayList = new ArrayList(arrayList3);
                } else {
                    arrayList = new ArrayList();
                }
                c3914j.f15549f = arrayList;
                c3914j.f15550g = this.f15555e;
                List list2 = this.f15553c;
                if (list2 != null) {
                    m30237r = AbstractC5766h.m30236p(list2);
                } else {
                    m30237r = AbstractC5766h.m30237r();
                }
                c3914j.f15548e = m30237r;
                return c3914j;
            }
            AbstractC30228a.m149044a(this.f15554d.get(0));
            throw null;
        }

        /* renamed from: b */
        public a m18619b(String str) {
            this.f15551a = str;
            return this;
        }

        /* renamed from: c */
        public a m18620c(List list) {
            this.f15553c = new ArrayList(list);
            return this;
        }

        /* renamed from: d */
        public a m18621d(c cVar) {
            this.f15556f = c.m18631d(cVar);
            return this;
        }
    }

    /* renamed from: com.android.billingclient.api.j$b */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        private final C3934p f15557a;

        /* renamed from: b */
        private final String f15558b;

        /* renamed from: com.android.billingclient.api.j$b$a */
        /* loaded from: classes2.dex */
        public static class a {

            /* renamed from: a */
            private C3934p f15559a;

            /* renamed from: b */
            private String f15560b;

            /* synthetic */ a(AbstractC3926m0 abstractC3926m0) {
            }

            /* renamed from: a */
            public b m18627a() {
                AbstractC5727a5.m30168c(this.f15559a, "ProductDetails is required for constructing ProductDetailsParams.");
                AbstractC5727a5.m30168c(this.f15560b, "offerToken is required for constructing ProductDetailsParams.");
                return new b(this, null);
            }

            /* renamed from: b */
            public a m18628b(String str) {
                this.f15560b = str;
                return this;
            }

            /* renamed from: c */
            public a m18629c(C3934p c3934p) {
                this.f15559a = c3934p;
                if (c3934p.m18668a() != null) {
                    c3934p.m18668a().getClass();
                    this.f15560b = c3934p.m18668a().m18675a();
                }
                return this;
            }
        }

        /* synthetic */ b(a aVar, AbstractC3929n0 abstractC3929n0) {
            this.f15557a = aVar.f15559a;
            this.f15558b = aVar.f15560b;
        }

        /* renamed from: a */
        public static a m18622a() {
            return new a(null);
        }

        /* renamed from: b */
        public final C3934p m18623b() {
            return this.f15557a;
        }

        /* renamed from: c */
        public final String m18624c() {
            return this.f15558b;
        }
    }

    /* renamed from: com.android.billingclient.api.j$c */
    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a */
        private String f15561a;

        /* renamed from: b */
        private String f15562b;

        /* renamed from: c */
        private int f15563c = 0;

        /* renamed from: d */
        private int f15564d = 0;

        /* renamed from: com.android.billingclient.api.j$c$a */
        /* loaded from: classes2.dex */
        public static class a {

            /* renamed from: a */
            private String f15565a;

            /* renamed from: b */
            private String f15566b;

            /* renamed from: c */
            private boolean f15567c;

            /* renamed from: d */
            private int f15568d = 0;

            /* renamed from: e */
            private int f15569e = 0;

            /* synthetic */ a(AbstractC3932o0 abstractC3932o0) {
            }

            /* renamed from: g */
            static /* synthetic */ a m18640g(a aVar) {
                aVar.f15567c = true;
                return aVar;
            }

            /* renamed from: a */
            public c m18641a() {
                boolean z11;
                AbstractC3935p0 abstractC3935p0 = null;
                if (!TextUtils.isEmpty(this.f15565a) || !TextUtils.isEmpty(null)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean isEmpty = true ^ TextUtils.isEmpty(this.f15566b);
                if (z11 && isEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.f15567c && !z11 && !isEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                c cVar = new c(abstractC3935p0);
                cVar.f15561a = this.f15565a;
                cVar.f15563c = this.f15568d;
                cVar.f15564d = this.f15569e;
                cVar.f15562b = this.f15566b;
                return cVar;
            }

            /* renamed from: b */
            public a m18642b(String str) {
                this.f15565a = str;
                return this;
            }

            /* renamed from: c */
            public a m18643c(String str) {
                this.f15565a = str;
                return this;
            }

            /* renamed from: d */
            public a m18644d(String str) {
                this.f15566b = str;
                return this;
            }

            /* renamed from: e */
            public a m18645e(int i11) {
                this.f15568d = i11;
                return this;
            }

            /* renamed from: f */
            public a m18646f(int i11) {
                this.f15569e = i11;
                return this;
            }
        }

        /* synthetic */ c(AbstractC3935p0 abstractC3935p0) {
        }

        /* renamed from: a */
        public static a m18630a() {
            return new a(null);
        }

        /* renamed from: d */
        static /* bridge */ /* synthetic */ a m18631d(c cVar) {
            a m18630a = m18630a();
            m18630a.m18643c(cVar.f15561a);
            m18630a.m18645e(cVar.f15563c);
            m18630a.m18646f(cVar.f15564d);
            m18630a.m18644d(cVar.f15562b);
            return m18630a;
        }

        /* renamed from: b */
        final int m18636b() {
            return this.f15563c;
        }

        /* renamed from: c */
        final int m18637c() {
            return this.f15564d;
        }

        /* renamed from: e */
        final String m18638e() {
            return this.f15561a;
        }

        /* renamed from: f */
        final String m18639f() {
            return this.f15562b;
        }
    }

    /* synthetic */ C3914j(AbstractC3938q0 abstractC3938q0) {
    }

    /* renamed from: a */
    public static a m18600a() {
        return new a(null);
    }

    /* renamed from: b */
    public final int m18608b() {
        return this.f15547d.m18636b();
    }

    /* renamed from: c */
    public final int m18609c() {
        return this.f15547d.m18637c();
    }

    /* renamed from: d */
    public final String m18610d() {
        return this.f15545b;
    }

    /* renamed from: e */
    public final String m18611e() {
        return this.f15546c;
    }

    /* renamed from: f */
    public final String m18612f() {
        return this.f15547d.m18638e();
    }

    /* renamed from: g */
    public final String m18613g() {
        return this.f15547d.m18639f();
    }

    /* renamed from: h */
    public final ArrayList m18614h() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f15549f);
        return arrayList;
    }

    /* renamed from: i */
    public final List m18615i() {
        return this.f15548e;
    }

    /* renamed from: q */
    public final boolean m18616q() {
        return this.f15550g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public final boolean m18617r() {
        if (this.f15545b == null && this.f15546c == null && this.f15547d.m18639f() == null && this.f15547d.m18636b() == 0 && this.f15547d.m18637c() == 0 && !this.f15544a && !this.f15550g) {
            return false;
        }
        return true;
    }
}
