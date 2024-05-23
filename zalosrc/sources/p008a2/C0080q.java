package p008a2;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import androidx.lifecycle.LiveData;
import bn0.AbstractC2933b;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import on0.AbstractC24341v;
import p119e2.C18176a;
import p119e2.InterfaceC18182g;
import p119e2.InterfaceC18186k;
import p376o0.C23974b;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import qm0.AbstractC25363p0;
import qm0.AbstractC25377w0;
import qm0.AbstractC25379x0;

/* renamed from: a2.q */
/* loaded from: classes.dex */
public class C0080q {

    /* renamed from: q */
    public static final a f317q = new a(null);

    /* renamed from: r */
    private static final String[] f318r = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a */
    private final AbstractC0086w f319a;

    /* renamed from: b */
    private final Map f320b;

    /* renamed from: c */
    private final Map f321c;

    /* renamed from: d */
    private final Map f322d;

    /* renamed from: e */
    private final String[] f323e;

    /* renamed from: f */
    private C0059c f324f;

    /* renamed from: g */
    private final AtomicBoolean f325g;

    /* renamed from: h */
    private volatile boolean f326h;

    /* renamed from: i */
    private volatile InterfaceC18186k f327i;

    /* renamed from: j */
    private final b f328j;

    /* renamed from: k */
    private final C0078o f329k;

    /* renamed from: l */
    private final C23974b f330l;

    /* renamed from: m */
    private C0083t f331m;

    /* renamed from: n */
    private final Object f332n;

    /* renamed from: o */
    private final Object f333o;

    /* renamed from: p */
    public final Runnable f334p;

    /* renamed from: a2.q$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final void m299a(InterfaceC18182g interfaceC18182g) {
            AbstractC19074t.m100208f(interfaceC18182g, "database");
            if (interfaceC18182g.mo203x0()) {
                interfaceC18182g.mo190D();
            } else {
                interfaceC18182g.mo194e();
            }
        }

        /* renamed from: b */
        public final String m300b(String str, String str2) {
            AbstractC19074t.m100208f(str, "tableName");
            AbstractC19074t.m100208f(str2, "triggerType");
            return "`room_table_modification_trigger_" + str + '_' + str2 + '`';
        }
    }

    /* renamed from: a2.q$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: e */
        public static final a f335e = new a(null);

        /* renamed from: a */
        private final long[] f336a;

        /* renamed from: b */
        private final boolean[] f337b;

        /* renamed from: c */
        private final int[] f338c;

        /* renamed from: d */
        private boolean f339d;

        /* renamed from: a2.q$b$a */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        public b(int i11) {
            this.f336a = new long[i11];
            this.f337b = new boolean[i11];
            this.f338c = new int[i11];
        }

        /* renamed from: a */
        public final int[] m301a() {
            boolean z11;
            synchronized (this) {
                try {
                    if (!this.f339d) {
                        return null;
                    }
                    long[] jArr = this.f336a;
                    int length = jArr.length;
                    int i11 = 0;
                    int i12 = 0;
                    while (i11 < length) {
                        int i13 = i12 + 1;
                        int i14 = 1;
                        if (jArr[i11] > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        boolean[] zArr = this.f337b;
                        if (z11 != zArr[i12]) {
                            int[] iArr = this.f338c;
                            if (!z11) {
                                i14 = 2;
                            }
                            iArr[i12] = i14;
                        } else {
                            this.f338c[i12] = 0;
                        }
                        zArr[i12] = z11;
                        i11++;
                        i12 = i13;
                    }
                    this.f339d = false;
                    return (int[]) this.f338c.clone();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: b */
        public final boolean m302b(int... iArr) {
            boolean z11;
            AbstractC19074t.m100208f(iArr, "tableIds");
            synchronized (this) {
                try {
                    z11 = false;
                    for (int i11 : iArr) {
                        long[] jArr = this.f336a;
                        long j11 = jArr[i11];
                        jArr[i11] = 1 + j11;
                        if (j11 == 0) {
                            z11 = true;
                            this.f339d = true;
                        }
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return z11;
        }

        /* renamed from: c */
        public final boolean m303c(int... iArr) {
            boolean z11;
            AbstractC19074t.m100208f(iArr, "tableIds");
            synchronized (this) {
                try {
                    z11 = false;
                    for (int i11 : iArr) {
                        long[] jArr = this.f336a;
                        long j11 = jArr[i11];
                        jArr[i11] = j11 - 1;
                        if (j11 == 1) {
                            z11 = true;
                            this.f339d = true;
                        }
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return z11;
        }

        /* renamed from: d */
        public final void m304d() {
            synchronized (this) {
                Arrays.fill(this.f337b, false);
                this.f339d = true;
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
        }
    }

    /* renamed from: a2.q$c */
    /* loaded from: classes2.dex */
    public static abstract class c {

        /* renamed from: a */
        private final String[] f340a;

        public c(String[] strArr) {
            AbstractC19074t.m100208f(strArr, "tables");
            this.f340a = strArr;
        }

        /* renamed from: a */
        public final String[] m305a() {
            return this.f340a;
        }

        /* renamed from: b */
        public boolean mo306b() {
            return false;
        }

        /* renamed from: c */
        public abstract void mo185c(Set set);
    }

    /* renamed from: a2.q$d */
    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: a */
        private final c f341a;

        /* renamed from: b */
        private final int[] f342b;

        /* renamed from: c */
        private final String[] f343c;

        /* renamed from: d */
        private final Set f344d;

        public d(c cVar, int[] iArr, String[] strArr) {
            boolean z11;
            AbstractC19074t.m100208f(cVar, "observer");
            AbstractC19074t.m100208f(iArr, "tableIds");
            AbstractC19074t.m100208f(strArr, "tableNames");
            this.f341a = cVar;
            this.f342b = iArr;
            this.f343c = strArr;
            if (strArr.length == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f344d = z11 ^ true ? AbstractC25377w0.m131538d(strArr[0]) : AbstractC25379x0.m131551e();
            if (iArr.length == strArr.length) {
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }

        /* renamed from: a */
        public final int[] m307a() {
            return this.f342b;
        }

        /* renamed from: b */
        public final void m308b(Set set) {
            Set m131551e;
            Set m131536b;
            AbstractC19074t.m100208f(set, "invalidatedTablesIds");
            int[] iArr = this.f342b;
            int length = iArr.length;
            if (length == 0) {
                m131551e = AbstractC25379x0.m131551e();
            } else {
                int i11 = 0;
                if (length != 1) {
                    m131536b = AbstractC25377w0.m131536b();
                    int[] iArr2 = this.f342b;
                    int length2 = iArr2.length;
                    int i12 = 0;
                    while (i11 < length2) {
                        int i13 = i12 + 1;
                        if (set.contains(Integer.valueOf(iArr2[i11]))) {
                            m131536b.add(this.f343c[i12]);
                        }
                        i11++;
                        i12 = i13;
                    }
                    m131551e = AbstractC25377w0.m131535a(m131536b);
                } else {
                    m131551e = set.contains(Integer.valueOf(iArr[0])) ? this.f344d : AbstractC25379x0.m131551e();
                }
            }
            if (!m131551e.isEmpty()) {
                this.f341a.mo185c(m131551e);
            }
        }

        /* renamed from: c */
        public final void m309c(String[] strArr) {
            Set m131551e;
            boolean m127126v;
            Set m131536b;
            boolean m127126v2;
            AbstractC19074t.m100208f(strArr, "tables");
            int length = this.f343c.length;
            if (length == 0) {
                m131551e = AbstractC25379x0.m131551e();
            } else if (length != 1) {
                m131536b = AbstractC25377w0.m131536b();
                for (String str : strArr) {
                    for (String str2 : this.f343c) {
                        m127126v2 = AbstractC24341v.m127126v(str2, str, true);
                        if (m127126v2) {
                            m131536b.add(str2);
                        }
                    }
                }
                m131551e = AbstractC25377w0.m131535a(m131536b);
            } else {
                int length2 = strArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length2) {
                        m127126v = AbstractC24341v.m127126v(strArr[i11], this.f343c[0], true);
                        if (m127126v) {
                            m131551e = this.f344d;
                            break;
                        }
                        i11++;
                    } else {
                        m131551e = AbstractC25379x0.m131551e();
                        break;
                    }
                }
            }
            if (!m131551e.isEmpty()) {
                this.f341a.mo185c(m131551e);
            }
        }
    }

    /* renamed from: a2.q$e */
    /* loaded from: classes2.dex */
    public static final class e extends c {

        /* renamed from: b */
        private final C0080q f345b;

        /* renamed from: c */
        private final WeakReference f346c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C0080q c0080q, c cVar) {
            super(cVar.m305a());
            AbstractC19074t.m100208f(c0080q, "tracker");
            AbstractC19074t.m100208f(cVar, "delegate");
            this.f345b = c0080q;
            this.f346c = new WeakReference(cVar);
        }

        @Override // p008a2.C0080q.c
        /* renamed from: c */
        public void mo185c(Set set) {
            AbstractC19074t.m100208f(set, "tables");
            c cVar = (c) this.f346c.get();
            if (cVar == null) {
                this.f345b.m294o(this);
            } else {
                cVar.mo185c(set);
            }
        }
    }

    /* renamed from: a2.q$f */
    /* loaded from: classes.dex */
    public static final class f implements Runnable {
        f() {
        }

        /* renamed from: a */
        private final Set m310a() {
            Set m131536b;
            Set m131535a;
            C0080q c0080q = C0080q.this;
            m131536b = AbstractC25377w0.m131536b();
            Cursor m330B = AbstractC0086w.m330B(c0080q.m286g(), new C18176a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null, 2, null);
            while (m330B.moveToNext()) {
                try {
                    m131536b.add(Integer.valueOf(m330B.getInt(0)));
                } finally {
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            AbstractC2933b.m13890a(m330B, null);
            m131535a = AbstractC25377w0.m131535a(m131536b);
            if (!m131535a.isEmpty()) {
                if (C0080q.this.m285f() != null) {
                    InterfaceC18186k m285f = C0080q.this.m285f();
                    if (m285f != null) {
                        m285f.mo223w();
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
            return m131535a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:            if (r0 != null) goto L26;     */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:            r0.m168e();     */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00b5, code lost:            if ((!r3.isEmpty()) == false) goto L55;     */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00b7, code lost:            r0 = r4.f347p.m287h();        r1 = r4.f347p;     */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00bf, code lost:            monitor-enter(r0);     */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00c0, code lost:            r1 = r1.m287h().iterator();     */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00cc, code lost:            if (r1.hasNext() == false) goto L65;     */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00ce, code lost:            ((p008a2.C0080q.d) ((java.util.Map.Entry) r1.next()).getValue()).m308b(r3);     */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00e0, code lost:            r1 = pm0.C24848g0.f119245a;     */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00e2, code lost:            monitor-exit(r0);     */
        /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:            return;     */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00de, code lost:            r1 = move-exception;     */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00e5, code lost:            throw r1;     */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00e6, code lost:            return;     */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00aa, code lost:            if (r0 == null) goto L40;     */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x009a, code lost:            if (r0 == null) goto L40;     */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            Set m131551e;
            C0059c c0059c;
            C0059c c0059c2;
            Lock m350m = C0080q.this.m286g().m350m();
            m350m.lock();
            try {
                try {
                    try {
                        if (!C0080q.this.m284e()) {
                            if (c0059c2 != null) {
                                return;
                            } else {
                                return;
                            }
                        }
                        if (!C0080q.this.m288i().compareAndSet(true, false)) {
                            m350m.unlock();
                            C0059c c0059c3 = C0080q.this.f324f;
                            if (c0059c3 != null) {
                                c0059c3.m168e();
                                return;
                            }
                            return;
                        }
                        if (C0080q.this.m286g().m357t()) {
                            m350m.unlock();
                            C0059c c0059c4 = C0080q.this.f324f;
                            if (c0059c4 != null) {
                                c0059c4.m168e();
                                return;
                            }
                            return;
                        }
                        InterfaceC18182g mo187p0 = C0080q.this.m286g().m352o().mo187p0();
                        mo187p0.mo190D();
                        try {
                            m131551e = m310a();
                            mo187p0.mo196k();
                            m350m.unlock();
                            c0059c = C0080q.this.f324f;
                        } finally {
                            mo187p0.mo197l();
                        }
                    } catch (SQLiteException unused) {
                        m131551e = AbstractC25379x0.m131551e();
                        m350m.unlock();
                        c0059c = C0080q.this.f324f;
                    }
                } catch (IllegalStateException unused2) {
                    m131551e = AbstractC25379x0.m131551e();
                    m350m.unlock();
                    c0059c = C0080q.this.f324f;
                }
            } finally {
                m350m.unlock();
                c0059c2 = C0080q.this.f324f;
                if (c0059c2 != null) {
                    c0059c2.m168e();
                }
            }
        }
    }

    public C0080q(AbstractC0086w abstractC0086w, Map map, Map map2, String... strArr) {
        Object m131405j;
        String str;
        AbstractC19074t.m100208f(abstractC0086w, "database");
        AbstractC19074t.m100208f(map, "shadowTablesMap");
        AbstractC19074t.m100208f(map2, "viewTables");
        AbstractC19074t.m100208f(strArr, "tableNames");
        this.f319a = abstractC0086w;
        this.f320b = map;
        this.f321c = map2;
        this.f325g = new AtomicBoolean(false);
        this.f328j = new b(strArr.length);
        this.f329k = new C0078o(abstractC0086w);
        this.f330l = new C23974b();
        this.f332n = new Object();
        this.f333o = new Object();
        this.f322d = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i11 = 0; i11 < length; i11++) {
            String str2 = strArr[i11];
            Locale locale = Locale.US;
            AbstractC19074t.m100207e(locale, "US");
            String lowerCase = str2.toLowerCase(locale);
            AbstractC19074t.m100207e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.f322d.put(lowerCase, Integer.valueOf(i11));
            String str3 = (String) this.f320b.get(strArr[i11]);
            if (str3 != null) {
                AbstractC19074t.m100207e(locale, "US");
                str = str3.toLowerCase(locale);
                AbstractC19074t.m100207e(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i11] = lowerCase;
        }
        this.f323e = strArr2;
        for (Map.Entry entry : this.f320b.entrySet()) {
            String str4 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            AbstractC19074t.m100207e(locale2, "US");
            String lowerCase2 = str4.toLowerCase(locale2);
            AbstractC19074t.m100207e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f322d.containsKey(lowerCase2)) {
                String str5 = (String) entry.getKey();
                AbstractC19074t.m100207e(locale2, "US");
                String lowerCase3 = str5.toLowerCase(locale2);
                AbstractC19074t.m100207e(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                Map map3 = this.f322d;
                m131405j = AbstractC25363p0.m131405j(map3, lowerCase2);
                map3.put(lowerCase3, m131405j);
            }
        }
        this.f334p = new f();
    }

    /* renamed from: p */
    private final String[] m277p(String[] strArr) {
        Set m131536b;
        Set m131535a;
        m131536b = AbstractC25377w0.m131536b();
        for (String str : strArr) {
            Map map = this.f321c;
            Locale locale = Locale.US;
            AbstractC19074t.m100207e(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            AbstractC19074t.m100207e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map map2 = this.f321c;
                AbstractC19074t.m100207e(locale, "US");
                String lowerCase2 = str.toLowerCase(locale);
                AbstractC19074t.m100207e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Object obj = map2.get(lowerCase2);
                AbstractC19074t.m100205c(obj);
                m131536b.addAll((Collection) obj);
            } else {
                m131536b.add(str);
            }
        }
        m131535a = AbstractC25377w0.m131535a(m131536b);
        Object[] array = m131535a.toArray(new String[0]);
        AbstractC19074t.m100206d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    /* renamed from: s */
    private final void m278s(InterfaceC18182g interfaceC18182g, int i11) {
        interfaceC18182g.mo201u("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i11 + ", 0)");
        String str = this.f323e[i11];
        for (String str2 : f318r) {
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + f317q.m300b(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i11 + " AND invalidated = 0; END";
            AbstractC19074t.m100207e(str3, "StringBuilder().apply(builderAction).toString()");
            interfaceC18182g.mo201u(str3);
        }
    }

    /* renamed from: t */
    private final void m279t(InterfaceC18182g interfaceC18182g, int i11) {
        String str = this.f323e[i11];
        for (String str2 : f318r) {
            String str3 = "DROP TRIGGER IF EXISTS " + f317q.m300b(str, str2);
            AbstractC19074t.m100207e(str3, "StringBuilder().apply(builderAction).toString()");
            interfaceC18182g.mo201u(str3);
        }
    }

    /* renamed from: w */
    private final String[] m280w(String[] strArr) {
        String[] m277p = m277p(strArr);
        for (String str : m277p) {
            Map map = this.f322d;
            Locale locale = Locale.US;
            AbstractC19074t.m100207e(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            AbstractC19074t.m100207e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!map.containsKey(lowerCase)) {
                throw new IllegalArgumentException(("There is no table with name " + str).toString());
            }
        }
        return m277p;
    }

    /* renamed from: b */
    public void m281b(c cVar) {
        int[] m131184L0;
        d dVar;
        AbstractC19074t.m100208f(cVar, "observer");
        String[] m277p = m277p(cVar.m305a());
        ArrayList arrayList = new ArrayList(m277p.length);
        for (String str : m277p) {
            Map map = this.f322d;
            Locale locale = Locale.US;
            AbstractC19074t.m100207e(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            AbstractC19074t.m100207e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = (Integer) map.get(lowerCase);
            if (num != null) {
                arrayList.add(Integer.valueOf(num.intValue()));
            } else {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
        }
        m131184L0 = AbstractC25332a0.m131184L0(arrayList);
        d dVar2 = new d(cVar, m131184L0, m277p);
        synchronized (this.f330l) {
            dVar = (d) this.f330l.mo125458l(cVar, dVar2);
        }
        if (dVar == null && this.f328j.m302b(Arrays.copyOf(m131184L0, m131184L0.length))) {
            m297u();
        }
    }

    /* renamed from: c */
    public void m282c(c cVar) {
        AbstractC19074t.m100208f(cVar, "observer");
        m281b(new e(this, cVar));
    }

    /* renamed from: d */
    public LiveData m283d(String[] strArr, boolean z11, Callable callable) {
        AbstractC19074t.m100208f(strArr, "tableNames");
        AbstractC19074t.m100208f(callable, "computeFunction");
        return this.f329k.m273a(m280w(strArr), z11, callable);
    }

    /* renamed from: e */
    public final boolean m284e() {
        if (!this.f319a.m361z()) {
            return false;
        }
        if (!this.f326h) {
            this.f319a.m352o().mo187p0();
        }
        if (!this.f326h) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final InterfaceC18186k m285f() {
        return this.f327i;
    }

    /* renamed from: g */
    public final AbstractC0086w m286g() {
        return this.f319a;
    }

    /* renamed from: h */
    public final C23974b m287h() {
        return this.f330l;
    }

    /* renamed from: i */
    public final AtomicBoolean m288i() {
        return this.f325g;
    }

    /* renamed from: j */
    public final Map m289j() {
        return this.f322d;
    }

    /* renamed from: k */
    public final void m290k(InterfaceC18182g interfaceC18182g) {
        AbstractC19074t.m100208f(interfaceC18182g, "database");
        synchronized (this.f333o) {
            if (this.f326h) {
                return;
            }
            interfaceC18182g.mo201u("PRAGMA temp_store = MEMORY;");
            interfaceC18182g.mo201u("PRAGMA recursive_triggers='ON';");
            interfaceC18182g.mo201u("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            m298v(interfaceC18182g);
            this.f327i = interfaceC18182g.mo193b0("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            this.f326h = true;
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: l */
    public final void m291l(String... strArr) {
        AbstractC19074t.m100208f(strArr, "tables");
        synchronized (this.f330l) {
            try {
                for (Map.Entry entry : this.f330l) {
                    AbstractC19074t.m100207e(entry, "(observer, wrapper)");
                    c cVar = (c) entry.getKey();
                    d dVar = (d) entry.getValue();
                    if (!cVar.mo306b()) {
                        dVar.m309c(strArr);
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: m */
    public final void m292m() {
        synchronized (this.f333o) {
            this.f326h = false;
            this.f328j.m304d();
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: n */
    public void m293n() {
        if (this.f325g.compareAndSet(false, true)) {
            C0059c c0059c = this.f324f;
            if (c0059c != null) {
                c0059c.m172j();
            }
            this.f319a.m353p().execute(this.f334p);
        }
    }

    /* renamed from: o */
    public void m294o(c cVar) {
        d dVar;
        AbstractC19074t.m100208f(cVar, "observer");
        synchronized (this.f330l) {
            dVar = (d) this.f330l.mo125459m(cVar);
        }
        if (dVar != null) {
            b bVar = this.f328j;
            int[] m307a = dVar.m307a();
            if (bVar.m303c(Arrays.copyOf(m307a, m307a.length))) {
                m297u();
            }
        }
    }

    /* renamed from: q */
    public final void m295q(C0059c c0059c) {
        AbstractC19074t.m100208f(c0059c, "autoCloser");
        this.f324f = c0059c;
        c0059c.m175m(new Runnable() { // from class: a2.p
            @Override // java.lang.Runnable
            public final void run() {
                C0080q.this.m292m();
            }
        });
    }

    /* renamed from: r */
    public final void m296r(Context context, String str, Intent intent) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(str, "name");
        AbstractC19074t.m100208f(intent, "serviceIntent");
        this.f331m = new C0083t(context, str, intent, this, this.f319a.m353p());
    }

    /* renamed from: u */
    public final void m297u() {
        if (!this.f319a.m361z()) {
            return;
        }
        m298v(this.f319a.m352o().mo187p0());
    }

    /* renamed from: v */
    public final void m298v(InterfaceC18182g interfaceC18182g) {
        AbstractC19074t.m100208f(interfaceC18182g, "database");
        if (interfaceC18182g.mo202v0()) {
            return;
        }
        try {
            Lock m350m = this.f319a.m350m();
            m350m.lock();
            try {
                synchronized (this.f332n) {
                    int[] m301a = this.f328j.m301a();
                    if (m301a == null) {
                        return;
                    }
                    f317q.m299a(interfaceC18182g);
                    try {
                        int length = m301a.length;
                        int i11 = 0;
                        int i12 = 0;
                        while (i11 < length) {
                            int i13 = m301a[i11];
                            int i14 = i12 + 1;
                            if (i13 != 1) {
                                if (i13 == 2) {
                                    m279t(interfaceC18182g, i12);
                                }
                            } else {
                                m278s(interfaceC18182g, i12);
                            }
                            i11++;
                            i12 = i14;
                        }
                        interfaceC18182g.mo196k();
                        interfaceC18182g.mo197l();
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    } catch (Throwable th2) {
                        interfaceC18182g.mo197l();
                        throw th2;
                    }
                }
            } finally {
                m350m.unlock();
            }
        } catch (SQLiteException | IllegalStateException unused) {
        }
    }
}
