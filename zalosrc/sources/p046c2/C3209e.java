package p046c2;

import com.google.android.gms.ads.AdError;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import p008a2.EnumC0077n;
import p119e2.InterfaceC18182g;

/* renamed from: c2.e */
/* loaded from: classes2.dex */
public final class C3209e {

    /* renamed from: e */
    public static final b f13703e = new b(null);

    /* renamed from: a */
    public final String f13704a;

    /* renamed from: b */
    public final Map f13705b;

    /* renamed from: c */
    public final Set f13706c;

    /* renamed from: d */
    public final Set f13707d;

    /* renamed from: c2.e$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: h */
        public static final C32688a f13708h = new C32688a(null);

        /* renamed from: a */
        public final String f13709a;

        /* renamed from: b */
        public final String f13710b;

        /* renamed from: c */
        public final boolean f13711c;

        /* renamed from: d */
        public final int f13712d;

        /* renamed from: e */
        public final String f13713e;

        /* renamed from: f */
        public final int f13714f;

        /* renamed from: g */
        public final int f13715g;

        /* renamed from: c2.e$a$a */
        /* loaded from: classes2.dex */
        public static final class C32688a {
            private C32688a() {
            }

            public /* synthetic */ C32688a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            private final boolean m16313a(String str) {
                if (str.length() == 0) {
                    return false;
                }
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i11 < str.length()) {
                    char charAt = str.charAt(i11);
                    int i14 = i13 + 1;
                    if (i13 == 0 && charAt != '(') {
                        return false;
                    }
                    if (charAt == '(') {
                        i12++;
                    } else if (charAt == ')' && i12 - 1 == 0 && i13 != str.length() - 1) {
                        return false;
                    }
                    i11++;
                    i13 = i14;
                }
                if (i12 != 0) {
                    return false;
                }
                return true;
            }

            /* renamed from: b */
            public final boolean m16314b(String str, String str2) {
                CharSequence m127168X0;
                AbstractC19074t.m100208f(str, "current");
                if (AbstractC19074t.m100204b(str, str2)) {
                    return true;
                }
                if (m16313a(str)) {
                    String substring = str.substring(1, str.length() - 1);
                    AbstractC19074t.m100207e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    m127168X0 = AbstractC24342w.m127168X0(substring);
                    return AbstractC19074t.m100204b(m127168X0.toString(), str2);
                }
                return false;
            }
        }

        public a(String str, String str2, boolean z11, int i11, String str3, int i12) {
            AbstractC19074t.m100208f(str, "name");
            AbstractC19074t.m100208f(str2, ZinstantMetaConstant.IMPRESSION_META_TYPE);
            this.f13709a = str;
            this.f13710b = str2;
            this.f13711c = z11;
            this.f13712d = i11;
            this.f13713e = str3;
            this.f13714f = i12;
            this.f13715g = m16312a(str2);
        }

        /* renamed from: a */
        private final int m16312a(String str) {
            boolean m127149O;
            boolean m127149O2;
            boolean m127149O3;
            boolean m127149O4;
            boolean m127149O5;
            boolean m127149O6;
            boolean m127149O7;
            boolean m127149O8;
            if (str == null) {
                return 5;
            }
            Locale locale = Locale.US;
            AbstractC19074t.m100207e(locale, "US");
            String upperCase = str.toUpperCase(locale);
            AbstractC19074t.m100207e(upperCase, "this as java.lang.String).toUpperCase(locale)");
            m127149O = AbstractC24342w.m127149O(upperCase, "INT", false, 2, null);
            if (!m127149O) {
                m127149O2 = AbstractC24342w.m127149O(upperCase, "CHAR", false, 2, null);
                if (!m127149O2) {
                    m127149O3 = AbstractC24342w.m127149O(upperCase, "CLOB", false, 2, null);
                    if (!m127149O3) {
                        m127149O4 = AbstractC24342w.m127149O(upperCase, "TEXT", false, 2, null);
                        if (!m127149O4) {
                            m127149O5 = AbstractC24342w.m127149O(upperCase, "BLOB", false, 2, null);
                            if (m127149O5) {
                                return 5;
                            }
                            m127149O6 = AbstractC24342w.m127149O(upperCase, "REAL", false, 2, null);
                            if (!m127149O6) {
                                m127149O7 = AbstractC24342w.m127149O(upperCase, "FLOA", false, 2, null);
                                if (!m127149O7) {
                                    m127149O8 = AbstractC24342w.m127149O(upperCase, "DOUB", false, 2, null);
                                    if (!m127149O8) {
                                        return 1;
                                    }
                                    return 4;
                                }
                                return 4;
                            }
                            return 4;
                        }
                    }
                }
                return 2;
            }
            return 3;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a) || this.f13712d != ((a) obj).f13712d) {
                return false;
            }
            a aVar = (a) obj;
            if (!AbstractC19074t.m100204b(this.f13709a, aVar.f13709a) || this.f13711c != aVar.f13711c) {
                return false;
            }
            if (this.f13714f == 1 && aVar.f13714f == 2 && (str3 = this.f13713e) != null && !f13708h.m16314b(str3, aVar.f13713e)) {
                return false;
            }
            if (this.f13714f == 2 && aVar.f13714f == 1 && (str2 = aVar.f13713e) != null && !f13708h.m16314b(str2, this.f13713e)) {
                return false;
            }
            int i11 = this.f13714f;
            if ((i11 == 0 || i11 != aVar.f13714f || ((str = this.f13713e) == null ? aVar.f13713e == null : f13708h.m16314b(str, aVar.f13713e))) && this.f13715g == aVar.f13715g) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i11;
            int hashCode = ((this.f13709a.hashCode() * 31) + this.f13715g) * 31;
            if (this.f13711c) {
                i11 = 1231;
            } else {
                i11 = 1237;
            }
            return ((hashCode + i11) * 31) + this.f13712d;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Column{name='");
            sb2.append(this.f13709a);
            sb2.append("', type='");
            sb2.append(this.f13710b);
            sb2.append("', affinity='");
            sb2.append(this.f13715g);
            sb2.append("', notNull=");
            sb2.append(this.f13711c);
            sb2.append(", primaryKeyPosition=");
            sb2.append(this.f13712d);
            sb2.append(", defaultValue='");
            String str = this.f13713e;
            if (str == null) {
                str = AdError.UNDEFINED_DOMAIN;
            }
            sb2.append(str);
            sb2.append("'}");
            return sb2.toString();
        }
    }

    /* renamed from: c2.e$b */
    /* loaded from: classes2.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C3209e m16315a(InterfaceC18182g interfaceC18182g, String str) {
            AbstractC19074t.m100208f(interfaceC18182g, "database");
            AbstractC19074t.m100208f(str, "tableName");
            return AbstractC3210f.m16325f(interfaceC18182g, str);
        }
    }

    /* renamed from: c2.e$c */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a */
        public final String f13716a;

        /* renamed from: b */
        public final String f13717b;

        /* renamed from: c */
        public final String f13718c;

        /* renamed from: d */
        public final List f13719d;

        /* renamed from: e */
        public final List f13720e;

        public c(String str, String str2, String str3, List list, List list2) {
            AbstractC19074t.m100208f(str, "referenceTable");
            AbstractC19074t.m100208f(str2, "onDelete");
            AbstractC19074t.m100208f(str3, "onUpdate");
            AbstractC19074t.m100208f(list, "columnNames");
            AbstractC19074t.m100208f(list2, "referenceColumnNames");
            this.f13716a = str;
            this.f13717b = str2;
            this.f13718c = str3;
            this.f13719d = list;
            this.f13720e = list2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!AbstractC19074t.m100204b(this.f13716a, cVar.f13716a) || !AbstractC19074t.m100204b(this.f13717b, cVar.f13717b) || !AbstractC19074t.m100204b(this.f13718c, cVar.f13718c) || !AbstractC19074t.m100204b(this.f13719d, cVar.f13719d)) {
                return false;
            }
            return AbstractC19074t.m100204b(this.f13720e, cVar.f13720e);
        }

        public int hashCode() {
            return (((((((this.f13716a.hashCode() * 31) + this.f13717b.hashCode()) * 31) + this.f13718c.hashCode()) * 31) + this.f13719d.hashCode()) * 31) + this.f13720e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f13716a + "', onDelete='" + this.f13717b + " +', onUpdate='" + this.f13718c + "', columnNames=" + this.f13719d + ", referenceColumnNames=" + this.f13720e + '}';
        }
    }

    /* renamed from: c2.e$d */
    /* loaded from: classes2.dex */
    public static final class d implements Comparable {

        /* renamed from: p */
        private final int f13721p;

        /* renamed from: q */
        private final int f13722q;

        /* renamed from: r */
        private final String f13723r;

        /* renamed from: s */
        private final String f13724s;

        public d(int i11, int i12, String str, String str2) {
            AbstractC19074t.m100208f(str, "from");
            AbstractC19074t.m100208f(str2, "to");
            this.f13721p = i11;
            this.f13722q = i12;
            this.f13723r = str;
            this.f13724s = str2;
        }

        @Override // java.lang.Comparable
        /* renamed from: b */
        public int compareTo(d dVar) {
            AbstractC19074t.m100208f(dVar, "other");
            int i11 = this.f13721p - dVar.f13721p;
            if (i11 == 0) {
                return this.f13722q - dVar.f13722q;
            }
            return i11;
        }

        /* renamed from: c */
        public final String m16317c() {
            return this.f13723r;
        }

        /* renamed from: d */
        public final int m16318d() {
            return this.f13721p;
        }

        /* renamed from: e */
        public final String m16319e() {
            return this.f13724s;
        }
    }

    /* renamed from: c2.e$e */
    /* loaded from: classes2.dex */
    public static final class e {

        /* renamed from: e */
        public static final a f13725e = new a(null);

        /* renamed from: a */
        public final String f13726a;

        /* renamed from: b */
        public final boolean f13727b;

        /* renamed from: c */
        public final List f13728c;

        /* renamed from: d */
        public List f13729d;

        /* renamed from: c2.e$e$a */
        /* loaded from: classes2.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
        public e(String str, boolean z11, List list, List list2) {
            AbstractC19074t.m100208f(str, "name");
            AbstractC19074t.m100208f(list, "columns");
            AbstractC19074t.m100208f(list2, "orders");
            this.f13726a = str;
            this.f13727b = z11;
            this.f13728c = list;
            this.f13729d = list2;
            List list3 = list2;
            if (list3.isEmpty()) {
                int size = list.size();
                list3 = new ArrayList(size);
                for (int i11 = 0; i11 < size; i11++) {
                    list3.add(EnumC0077n.ASC.name());
                }
            }
            this.f13729d = (List) list3;
        }

        public boolean equals(Object obj) {
            boolean m127120J;
            boolean m127120J2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (this.f13727b == eVar.f13727b && AbstractC19074t.m100204b(this.f13728c, eVar.f13728c) && AbstractC19074t.m100204b(this.f13729d, eVar.f13729d)) {
                m127120J = AbstractC24341v.m127120J(this.f13726a, "index_", false, 2, null);
                if (m127120J) {
                    m127120J2 = AbstractC24341v.m127120J(eVar.f13726a, "index_", false, 2, null);
                    return m127120J2;
                }
                return AbstractC19074t.m100204b(this.f13726a, eVar.f13726a);
            }
            return false;
        }

        public int hashCode() {
            boolean m127120J;
            int hashCode;
            m127120J = AbstractC24341v.m127120J(this.f13726a, "index_", false, 2, null);
            if (m127120J) {
                hashCode = -1184239155;
            } else {
                hashCode = this.f13726a.hashCode();
            }
            return (((((hashCode * 31) + (this.f13727b ? 1 : 0)) * 31) + this.f13728c.hashCode()) * 31) + this.f13729d.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f13726a + "', unique=" + this.f13727b + ", columns=" + this.f13728c + ", orders=" + this.f13729d + "'}";
        }
    }

    public C3209e(String str, Map map, Set set, Set set2) {
        AbstractC19074t.m100208f(str, "name");
        AbstractC19074t.m100208f(map, "columns");
        AbstractC19074t.m100208f(set, "foreignKeys");
        this.f13704a = str;
        this.f13705b = map;
        this.f13706c = set;
        this.f13707d = set2;
    }

    /* renamed from: a */
    public static final C3209e m16311a(InterfaceC18182g interfaceC18182g, String str) {
        return f13703e.m16315a(interfaceC18182g, str);
    }

    public boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3209e)) {
            return false;
        }
        C3209e c3209e = (C3209e) obj;
        if (!AbstractC19074t.m100204b(this.f13704a, c3209e.f13704a) || !AbstractC19074t.m100204b(this.f13705b, c3209e.f13705b) || !AbstractC19074t.m100204b(this.f13706c, c3209e.f13706c)) {
            return false;
        }
        Set set2 = this.f13707d;
        if (set2 == null || (set = c3209e.f13707d) == null) {
            return true;
        }
        return AbstractC19074t.m100204b(set2, set);
    }

    public int hashCode() {
        return (((this.f13704a.hashCode() * 31) + this.f13705b.hashCode()) * 31) + this.f13706c.hashCode();
    }

    public String toString() {
        return "TableInfo{name='" + this.f13704a + "', columns=" + this.f13705b + ", foreignKeys=" + this.f13706c + ", indices=" + this.f13707d + '}';
    }
}
