package p378o2;

import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import on0.AbstractC24341v;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: o2.h */
/* loaded from: classes2.dex */
public final class C23987h implements Comparable {

    /* renamed from: u */
    public static final a f116079u = new a(null);

    /* renamed from: v */
    private static final C23987h f116080v = new C23987h(0, 0, 0, "");

    /* renamed from: w */
    private static final C23987h f116081w = new C23987h(0, 1, 0, "");

    /* renamed from: x */
    private static final C23987h f116082x;

    /* renamed from: y */
    private static final C23987h f116083y;

    /* renamed from: p */
    private final int f116084p;

    /* renamed from: q */
    private final int f116085q;

    /* renamed from: r */
    private final int f116086r;

    /* renamed from: s */
    private final String f116087s;

    /* renamed from: t */
    private final InterfaceC24854k f116088t;

    /* renamed from: o2.h$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C23987h m125505a() {
            return C23987h.f116081w;
        }

        /* renamed from: b */
        public final C23987h m125506b(String str) {
            boolean m127128x;
            Integer valueOf;
            Integer valueOf2;
            Integer valueOf3;
            String str2;
            if (str != null) {
                m127128x = AbstractC24341v.m127128x(str);
                if (!m127128x) {
                    Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
                    if (!matcher.matches()) {
                        return null;
                    }
                    String group = matcher.group(1);
                    if (group == null) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(Integer.parseInt(group));
                    }
                    if (valueOf == null) {
                        return null;
                    }
                    int intValue = valueOf.intValue();
                    String group2 = matcher.group(2);
                    if (group2 == null) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Integer.valueOf(Integer.parseInt(group2));
                    }
                    if (valueOf2 == null) {
                        return null;
                    }
                    int intValue2 = valueOf2.intValue();
                    String group3 = matcher.group(3);
                    if (group3 == null) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Integer.valueOf(Integer.parseInt(group3));
                    }
                    if (valueOf3 == null) {
                        return null;
                    }
                    int intValue3 = valueOf3.intValue();
                    if (matcher.group(4) != null) {
                        str2 = matcher.group(4);
                    } else {
                        str2 = "";
                    }
                    String str3 = str2;
                    AbstractC19074t.m100207e(str3, "description");
                    return new C23987h(intValue, intValue2, intValue3, str3, null);
                }
            }
            return null;
        }
    }

    /* renamed from: o2.h$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {
        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BigInteger mo12V4() {
            return BigInteger.valueOf(C23987h.this.m125502e()).shiftLeft(32).or(BigInteger.valueOf(C23987h.this.m125503g())).shiftLeft(32).or(BigInteger.valueOf(C23987h.this.m125504h()));
        }
    }

    static {
        C23987h c23987h = new C23987h(1, 0, 0, "");
        f116082x = c23987h;
        f116083y = c23987h;
    }

    public /* synthetic */ C23987h(int i11, int i12, int i13, String str, AbstractC19060k abstractC19060k) {
        this(i11, i12, i13, str);
    }

    /* renamed from: d */
    private final BigInteger m125500d() {
        Object value = this.f116088t.getValue();
        AbstractC19074t.m100207e(value, "<get-bigInteger>(...)");
        return (BigInteger) value;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(C23987h c23987h) {
        AbstractC19074t.m100208f(c23987h, "other");
        return m125500d().compareTo(c23987h.m125500d());
    }

    /* renamed from: e */
    public final int m125502e() {
        return this.f116084p;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C23987h)) {
            return false;
        }
        C23987h c23987h = (C23987h) obj;
        if (this.f116084p != c23987h.f116084p || this.f116085q != c23987h.f116085q || this.f116086r != c23987h.f116086r) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final int m125503g() {
        return this.f116085q;
    }

    /* renamed from: h */
    public final int m125504h() {
        return this.f116086r;
    }

    public int hashCode() {
        return ((((527 + this.f116084p) * 31) + this.f116085q) * 31) + this.f116086r;
    }

    public String toString() {
        boolean m127128x;
        String str;
        m127128x = AbstractC24341v.m127128x(this.f116087s);
        if (!m127128x) {
            str = AbstractC19074t.m100216n("-", this.f116087s);
        } else {
            str = "";
        }
        return this.f116084p + '.' + this.f116085q + '.' + this.f116086r + str;
    }

    private C23987h(int i11, int i12, int i13, String str) {
        InterfaceC24854k m129210a;
        this.f116084p = i11;
        this.f116085q = i12;
        this.f116086r = i13;
        this.f116087s = str;
        m129210a = AbstractC24856m.m129210a(new b());
        this.f116088t = m129210a;
    }
}
