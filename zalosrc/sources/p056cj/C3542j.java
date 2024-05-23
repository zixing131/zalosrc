package p056cj;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;
import on0.AbstractC24340u;
import on0.AbstractC24342w;

/* renamed from: cj.j */
/* loaded from: classes3.dex */
public final class C3542j {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private int f14947a;

    /* renamed from: b */
    private String f14948b;

    /* renamed from: cj.j$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C3542j m18007a(String str) {
            List m127132B0;
            Integer m127107m;
            int i11;
            C3542j c3542j = new C3542j(0, null, 3, 0 == true ? 1 : 0);
            if (str != null) {
                m127132B0 = AbstractC24342w.m127132B0(str, new String[]{":"}, false, 0, 6, null);
                if (m127132B0.size() == 3 && AbstractC19074t.m100204b(m127132B0.get(0), "zalo")) {
                    m127107m = AbstractC24340u.m127107m((String) m127132B0.get(1));
                    if (m127107m != null) {
                        i11 = m127107m.intValue();
                    } else {
                        i11 = -1;
                    }
                    c3542j.m18005c(i11);
                    c3542j.m18006d((String) m127132B0.get(2));
                }
                return c3542j;
            }
            return c3542j;
        }
    }

    public C3542j(int i11, String str) {
        AbstractC19074t.m100208f(str, "path");
        this.f14947a = i11;
        this.f14948b = str;
    }

    /* renamed from: a */
    public final int m18003a() {
        return this.f14947a;
    }

    /* renamed from: b */
    public final String m18004b() {
        return this.f14948b;
    }

    /* renamed from: c */
    public final void m18005c(int i11) {
        this.f14947a = i11;
    }

    /* renamed from: d */
    public final void m18006d(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f14948b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3542j)) {
            return false;
        }
        C3542j c3542j = (C3542j) obj;
        return this.f14947a == c3542j.f14947a && AbstractC19074t.m100204b(this.f14948b, c3542j.f14948b);
    }

    public int hashCode() {
        return (this.f14947a * 31) + this.f14948b.hashCode();
    }

    public String toString() {
        return "zalo:" + this.f14947a + ":" + this.f14948b;
    }

    public /* synthetic */ C3542j(int i11, String str, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? -1 : i11, (i12 & 2) != 0 ? "" : str);
    }
}
