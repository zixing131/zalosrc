package p010a4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p010a4.C0109b;

/* renamed from: a4.i */
/* loaded from: classes.dex */
public abstract class AbstractC0116i {

    /* renamed from: a4.i$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* renamed from: a */
        public final a m537a(String str, int i11) {
            mo495e().put(str, String.valueOf(i11));
            return this;
        }

        /* renamed from: b */
        public final a m538b(String str, long j11) {
            mo495e().put(str, String.valueOf(j11));
            return this;
        }

        /* renamed from: c */
        public final a m539c(String str, String str2) {
            mo495e().put(str, str2);
            return this;
        }

        /* renamed from: d */
        public abstract AbstractC0116i mo494d();

        /* renamed from: e */
        protected abstract Map mo495e();

        /* renamed from: f */
        protected abstract a mo496f(Map map);

        /* renamed from: g */
        public abstract a mo497g(Integer num);

        /* renamed from: h */
        public abstract a mo498h(C0115h c0115h);

        /* renamed from: i */
        public abstract a mo499i(long j11);

        /* renamed from: j */
        public abstract a mo500j(String str);

        /* renamed from: k */
        public abstract a mo501k(long j11);
    }

    /* renamed from: a */
    public static a m531a() {
        return new C0109b.b().mo496f(new HashMap());
    }

    /* renamed from: b */
    public final String m532b(String str) {
        String str2 = (String) mo488c().get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    /* renamed from: c */
    public abstract Map mo488c();

    /* renamed from: d */
    public abstract Integer mo489d();

    /* renamed from: e */
    public abstract C0115h mo490e();

    /* renamed from: f */
    public abstract long mo491f();

    /* renamed from: g */
    public final int m533g(String str) {
        String str2 = (String) mo488c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* renamed from: h */
    public final long m534h(String str) {
        String str2 = (String) mo488c().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    /* renamed from: i */
    public final Map m535i() {
        return Collections.unmodifiableMap(mo488c());
    }

    /* renamed from: j */
    public abstract String mo492j();

    /* renamed from: k */
    public abstract long mo493k();

    /* renamed from: l */
    public a m536l() {
        return new C0109b.b().mo500j(mo492j()).mo497g(mo489d()).mo498h(mo490e()).mo499i(mo491f()).mo501k(mo493k()).mo496f(new HashMap(mo488c()));
    }
}
