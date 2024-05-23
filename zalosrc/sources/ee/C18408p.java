package ee;

import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.AbstractC0837p0;
import ag0.C0824j;
import am.AbstractC0939u;
import android.text.TextUtils;
import androidx.core.util.C1483e;
import com.zing.zalocore.CoreUtility;
import dg0.AbstractC17930e;
import ee.C18408p;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19059j0;
import ge.C19409a;
import ge.C19411c;
import ge.C19414f;
import ge.C19420l;
import ge.C19421m;
import ge.C19424p;
import ge.C19425q;
import ge.C19426r;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Semaphore;
import me0.AbstractC23059e9;
import me0.AbstractC23160o0;
import mm0.AbstractC23350e;
import nh0.C23793c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p304ks.C21927m;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p461qu.AbstractC25495a;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25358n;
import qm0.AbstractC25368s;
import vg.C28023b6;

/* renamed from: ee.p */
/* loaded from: classes3.dex */
public final class C18408p {
    public static final a Companion = new a(null);

    /* renamed from: m */
    private static final InterfaceC24854k f92812m;

    /* renamed from: n */
    private static final InterfaceC24854k f92813n;

    /* renamed from: o */
    private static final InterfaceC24854k f92814o;

    /* renamed from: p */
    private static final InterfaceC24854k f92815p;

    /* renamed from: q */
    private static volatile C18408p f92816q;

    /* renamed from: r */
    private static volatile boolean f92817r;

    /* renamed from: s */
    private static Semaphore f92818s;

    /* renamed from: t */
    private static final List f92819t;

    /* renamed from: u */
    private static boolean f92820u;

    /* renamed from: v */
    private static long f92821v;

    /* renamed from: d */
    private int f92825d;

    /* renamed from: f */
    private int f92827f;

    /* renamed from: g */
    private boolean f92828g;

    /* renamed from: h */
    private int f92829h;

    /* renamed from: i */
    private ArrayList f92830i;

    /* renamed from: j */
    private ArrayList f92831j;

    /* renamed from: k */
    private final InterfaceC24854k f92832k;

    /* renamed from: l */
    private boolean f92833l;

    /* renamed from: a */
    public final Map f92822a = new LinkedHashMap();

    /* renamed from: b */
    public final Set f92823b = new LinkedHashSet();

    /* renamed from: c */
    private final CopyOnWriteArrayList f92824c = new CopyOnWriteArrayList(Companion.m97537h());

    /* renamed from: e */
    private boolean f92826e = true;

    /* renamed from: ee.p$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: ee.p$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public interface InterfaceC32814a {
            /* renamed from: a */
            void mo2271a(C18408p c18408p);
        }

        /* renamed from: ee.p$a$b */
        /* loaded from: classes3.dex */
        public static final class b extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ArrayList f92834a;

            b(ArrayList arrayList) {
                this.f92834a = arrayList;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C18412t.m97566F().m97586s(this.f92834a);
            }
        }

        /* renamed from: ee.p$a$c */
        /* loaded from: classes3.dex */
        public static final class c extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ C18408p f92835a;

            /* renamed from: b */
            final /* synthetic */ a f92836b;

            c(C18408p c18408p, a aVar) {
                this.f92835a = c18408p;
                this.f92836b = aVar;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                this.f92835a.m97478a0();
                C18408p.f92818s.release();
                C18408p.f92817r = true;
            }
        }

        /* renamed from: ee.p$a$d */
        /* loaded from: classes3.dex */
        public static final class d extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ InterfaceC32814a f92837a;

            /* renamed from: b */
            final /* synthetic */ C18408p f92838b;

            d(InterfaceC32814a interfaceC32814a, C18408p c18408p) {
                this.f92837a = interfaceC32814a;
                this.f92838b = c18408p;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                this.f92837a.mo2271a(this.f92838b);
            }
        }

        /* renamed from: ee.p$a$e */
        /* loaded from: classes3.dex */
        public static final class e extends AbstractC0939u {
            e() {
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C18412t.m97566F().m97580a();
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public final ArrayList m97537h() {
            Calendar calendar = Calendar.getInstance();
            calendar.set(5, 15);
            calendar.setTimeZone(m97546g());
            calendar.add(2, -1);
            ArrayList arrayList = new ArrayList();
            for (int i11 = 1; i11 < 4; i11++) {
                AbstractC23160o0.m119286r1(calendar);
                long timeInMillis = calendar.getTimeInMillis();
                AbstractC23160o0.m119295u1(calendar);
                arrayList.add(new C19420l(timeInMillis, calendar.getTimeInMillis()));
                calendar.add(2, 1);
            }
            return arrayList;
        }

        /* renamed from: k */
        private final long m97538k() {
            ArrayList m131500h;
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            m131500h = AbstractC25368s.m131500h("CALENDAR_000");
            Iterator it = C18412t.m97566F().m97575G(m131500h).iterator();
            long j11 = -2;
            while (it.hasNext()) {
                C19421m c19421m = (C19421m) it.next();
                long j12 = c19421m.f96358c;
                if (j12 <= currentTimeMillis) {
                    long j13 = c19421m.f96359d;
                    if (j12 + j13 >= currentTimeMillis) {
                        if (c19421m.f96357b == 1) {
                            j11 = j12 + j13;
                        }
                    }
                }
                arrayList.add(new C1483e(c19421m.f96356a, Integer.valueOf(c19421m.f96357b)));
            }
            C0824j.m2153b(new b(arrayList));
            if (j11 == -2) {
                return 0L;
            }
            return j11;
        }

        /* renamed from: m */
        private final ArrayList m97539m() {
            long j11;
            C19409a c19409a;
            C19411c.a aVar;
            C19411c.a.C32826a c32826a;
            ArrayList arrayList = new ArrayList();
            try {
                long currentTimeMillis = System.currentTimeMillis();
                long j12 = currentTimeMillis - 86400000;
                long j13 = 86400000 + currentTimeMillis;
                int m119255h0 = AbstractC23160o0.m119255h0(m97546g(), TimeZone.getDefault(), currentTimeMillis);
                if (m119255h0 > 0) {
                    j12 -= m119255h0;
                    j11 = j13;
                } else {
                    j11 = j13 - m119255h0;
                }
                Iterator it = m97537h().iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    C19420l c19420l = (C19420l) it.next();
                    if (j11 >= c19420l.f96350a && j12 <= c19420l.f96351b) {
                        ArrayList m97573A = C18412t.m97566F().m97573A(c19420l.f96350a, c19420l.f96351b);
                        c19420l.m101557a();
                        i11++;
                        c19420l.m101566j(m97573A, i11);
                        c19420l.f96354e = true;
                        Iterator it2 = c19420l.m101559c().iterator();
                        while (it2.hasNext()) {
                            C19411c c19411c = (C19411c) it2.next();
                            long j14 = c19411c.f96262b;
                            if (j12 <= j14 && j14 <= j11) {
                                AbstractC19074t.m100205c(c19411c);
                                if (!m97541r(c19411c) && ((c19409a = c19411c.f96285y) == null || c19409a.f96250b != 2)) {
                                    if (c19411c.f96279s != 2 || (aVar = c19411c.f96281u) == null || (c32826a = aVar.f96290d) == null || c32826a.m101535a()) {
                                        if (c19411c.m101529d() == 0) {
                                            arrayList.add(c19411c);
                                        }
                                        if (c19411c.m101529d() == 0 || c19411c.m101529d() == 1) {
                                            long m101527b = c19411c.m101527b();
                                            if (m101527b < j13) {
                                                j13 = m101527b;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                AbstractC17930e.Companion.m94550a().mo94531e(new Runnable() { // from class: ee.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        C18408p.a.m97540n();
                    }
                }, j13 - System.currentTimeMillis());
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public static final void m97540n() {
            C18408p.f92820u = true;
            C19669z.Companion.m103232a().m103198O0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: r */
        public final boolean m97541r(C19411c c19411c) {
            String str;
            C19411c.a aVar;
            C19411c.a.e eVar;
            if (!(!TextUtils.isEmpty(AbstractC23309i.m122303q0()))) {
                return false;
            }
            if (c19411c.f96277q == 2) {
                str = "group_" + c19411c.f96278r;
            } else if (c19411c.f96279s == 3 && (aVar = c19411c.f96281u) != null && (eVar = aVar.f96289c) != null) {
                if (AbstractC19074t.m100204b(CoreUtility.f89233i, eVar.f96308c)) {
                    str = c19411c.f96281u.f96289c.f96310e;
                } else {
                    str = c19411c.f96281u.f96289c.f96308c;
                }
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str) && C21927m.m114302u().m114345m(str)) {
                return true;
            }
            return false;
        }

        /* renamed from: u */
        private final void m97542u() {
            try {
                C18408p.f92818s.acquire();
                C18408p.f92818s.release();
            } catch (InterruptedException e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: d */
        public final Comparator m97543d() {
            return (Comparator) C18408p.f92815p.getValue();
        }

        /* renamed from: e */
        public final Comparator m97544e() {
            return (Comparator) C18408p.f92814o.getValue();
        }

        /* renamed from: f */
        public final Comparator m97545f() {
            return (Comparator) C18408p.f92813n.getValue();
        }

        /* renamed from: g */
        public final TimeZone m97546g() {
            Object value = C18408p.f92812m.getValue();
            AbstractC19074t.m100207e(value, "getValue(...)");
            return (TimeZone) value;
        }

        /* renamed from: i */
        public final long m97547i() {
            return AbstractC23309i.m121332Q3();
        }

        /* renamed from: j */
        public final long m97548j() {
            if (C18408p.f92821v == -2) {
                C18408p.f92821v = m97538k();
            }
            return C18408p.f92821v;
        }

        /* renamed from: l */
        public final ArrayList m97549l() {
            if (C18408p.f92820u) {
                C18408p.f92820u = false;
                C18408p.f92819t.clear();
                C18408p.f92819t.addAll(m97539m());
            }
            return new ArrayList(C18408p.f92819t);
        }

        /* renamed from: o */
        public final C18408p m97550o() {
            C18408p c18408p = C18408p.f92816q;
            if (c18408p == null) {
                synchronized (this) {
                    c18408p = C18408p.f92816q;
                    if (c18408p == null) {
                        a aVar = C18408p.Companion;
                        C18408p c18408p2 = new C18408p();
                        C0824j.m2153b(new c(c18408p2, aVar));
                        C18408p.f92816q = c18408p2;
                        c18408p = c18408p2;
                    }
                }
            }
            return c18408p;
        }

        /* renamed from: p */
        public final C18408p m97551p(InterfaceC32814a interfaceC32814a) {
            AbstractC19074t.m100208f(interfaceC32814a, "listener");
            C18408p m97550o = m97550o();
            if (!C18408p.f92817r) {
                C0824j.m2153b(new d(interfaceC32814a, m97550o));
            } else {
                interfaceC32814a.mo2271a(m97550o);
            }
            return m97550o;
        }

        /* renamed from: q */
        public final C18408p m97552q() {
            C18408p m97550o = m97550o();
            if (!C18408p.f92817r) {
                C18408p.Companion.m97542u();
            }
            return m97550o;
        }

        /* renamed from: s */
        public final boolean m97553s() {
            long m97548j = m97548j();
            if (m97548j != -1 && System.currentTimeMillis() > m97548j) {
                return false;
            }
            return true;
        }

        /* renamed from: t */
        public final void m97554t() {
            C0824j.m2153b(new e());
            C18403k.m97443p().m97456C();
            C18408p.f92816q = null;
            C18408p.f92821v = -2L;
            C18408p.f92819t.clear();
            C18408p.f92820u = true;
        }
    }

    /* renamed from: ee.p$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f92839q = new b();

        b() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final int m97556c(C19426r c19426r, C19426r c19426r2) {
            AbstractC19074t.m100208f(c19426r, "event1");
            AbstractC19074t.m100208f(c19426r2, "event2");
            try {
                long j11 = c19426r.f96380C;
                long j12 = c19426r2.f96380C;
                if (j11 == j12) {
                    int m100210h = AbstractC19074t.m100210h(c19426r.f96267g, c19426r2.f96267g);
                    if (m100210h == 0) {
                        String str = c19426r.f96261a;
                        AbstractC19074t.m100207e(str, "eventId");
                        long parseLong = Long.parseLong(str);
                        String str2 = c19426r2.f96261a;
                        AbstractC19074t.m100207e(str2, "eventId");
                        return AbstractC19074t.m100210h(parseLong, Long.parseLong(str2));
                    }
                    return m100210h;
                }
                if (j11 > j12) {
                    return 1;
                }
                return -1;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return 0;
            }
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Comparator mo12V4() {
            return new Comparator() { // from class: ee.q
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m97556c;
                    m97556c = C18408p.b.m97556c((C19426r) obj, (C19426r) obj2);
                    return m97556c;
                }
            };
        }
    }

    /* renamed from: ee.p$c */
    /* loaded from: classes3.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f92840q = new c();

        c() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[Catch: Exception -> 0x0023, TRY_LEAVE, TryCatch #0 {Exception -> 0x0023, blocks: (B:3:0x000c, B:5:0x001a, B:7:0x001e, B:11:0x0030, B:13:0x0034, B:15:0x0038, B:19:0x003d, B:21:0x0047, B:25:0x0025, B:27:0x0029), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x005e A[RETURN] */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final int m97559c(C19411c c19411c, C19411c c19411c2) {
            int m100210h;
            AbstractC19074t.m100208f(c19411c, "event1");
            AbstractC19074t.m100208f(c19411c2, "event2");
            try {
                long m101528c = c19411c.m101528c();
                long m101528c2 = c19411c2.m101528c();
                if (m101528c == m101528c2) {
                    int i11 = c19411c.f96266f;
                    if (i11 != 1) {
                        if (c19411c.f96260B == 1) {
                        }
                        if (i11 == 1 && c19411c.f96260B != 1 && (c19411c2.f96266f == 1 || c19411c2.f96260B == 1)) {
                            return 1;
                        }
                        m100210h = AbstractC19074t.m100210h(c19411c.f96267g, c19411c2.f96267g);
                        if (m100210h != 0) {
                            String str = c19411c.f96261a;
                            AbstractC19074t.m100207e(str, "eventId");
                            long parseLong = Long.parseLong(str);
                            String str2 = c19411c2.f96261a;
                            AbstractC19074t.m100207e(str2, "eventId");
                            return AbstractC19074t.m100210h(parseLong, Long.parseLong(str2));
                        }
                        return m100210h;
                    }
                    if (c19411c2.f96266f != 1 && c19411c2.f96260B != 1) {
                        return -1;
                    }
                    if (i11 == 1) {
                    }
                    m100210h = AbstractC19074t.m100210h(c19411c.f96267g, c19411c2.f96267g);
                    if (m100210h != 0) {
                    }
                } else {
                    if (m101528c <= m101528c2) {
                        return -1;
                    }
                    return 1;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return 0;
            }
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Comparator mo12V4() {
            return new Comparator() { // from class: ee.r
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m97559c;
                    m97559c = C18408p.c.m97559c((C19411c) obj, (C19411c) obj2);
                    return m97559c;
                }
            };
        }
    }

    /* renamed from: ee.p$d */
    /* loaded from: classes3.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f92841q = new d();

        d() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0043 A[Catch: Exception -> 0x001f, TRY_LEAVE, TryCatch #0 {Exception -> 0x001f, blocks: (B:3:0x000c, B:5:0x0016, B:7:0x001a, B:11:0x002c, B:13:0x0030, B:15:0x0034, B:19:0x0039, B:21:0x0043, B:25:0x0021, B:27:0x0025), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x005a A[RETURN] */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final int m97562c(C19411c c19411c, C19411c c19411c2) {
            int m100210h;
            AbstractC19074t.m100208f(c19411c, "event1");
            AbstractC19074t.m100208f(c19411c2, "event2");
            try {
                long j11 = c19411c.f96262b;
                long j12 = c19411c2.f96262b;
                if (j11 == j12) {
                    int i11 = c19411c.f96266f;
                    if (i11 != 1) {
                        if (c19411c.f96260B == 1) {
                        }
                        if (i11 == 1 && c19411c.f96260B != 1 && (c19411c2.f96266f == 1 || c19411c2.f96260B == 1)) {
                            return 1;
                        }
                        m100210h = AbstractC19074t.m100210h(c19411c.f96267g, c19411c2.f96267g);
                        if (m100210h != 0) {
                            String str = c19411c.f96261a;
                            AbstractC19074t.m100207e(str, "eventId");
                            long parseLong = Long.parseLong(str);
                            String str2 = c19411c2.f96261a;
                            AbstractC19074t.m100207e(str2, "eventId");
                            return AbstractC19074t.m100210h(parseLong, Long.parseLong(str2));
                        }
                        return m100210h;
                    }
                    if (c19411c2.f96266f != 1 && c19411c2.f96260B != 1) {
                        return -1;
                    }
                    if (i11 == 1) {
                    }
                    m100210h = AbstractC19074t.m100210h(c19411c.f96267g, c19411c2.f96267g);
                    if (m100210h != 0) {
                    }
                } else {
                    if (j11 <= j12) {
                        return -1;
                    }
                    return 1;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return 0;
            }
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Comparator mo12V4() {
            return new Comparator() { // from class: ee.s
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m97562c;
                    m97562c = C18408p.d.m97562c((C19411c) obj, (C19411c) obj2);
                    return m97562c;
                }
            };
        }
    }

    /* renamed from: ee.p$e */
    /* loaded from: classes3.dex */
    static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final e f92842q = new e();

        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TimeZone mo12V4() {
            return TimeZone.getTimeZone("GMT+7:00");
        }
    }

    /* renamed from: ee.p$f */
    /* loaded from: classes3.dex */
    public static final class f extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f92843a;

        f(String str) {
            this.f92843a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            ArrayList m131500h;
            C18412t m97566F = C18412t.m97566F();
            m131500h = AbstractC25368s.m131500h(this.f92843a);
            m97566F.m97582i(m131500h);
        }
    }

    /* renamed from: ee.p$g */
    /* loaded from: classes3.dex */
    public static final class g extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ ArrayList f92844a;

        g(ArrayList arrayList) {
            this.f92844a = arrayList;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C18412t.m97566F().m97583o(this.f92844a);
        }
    }

    /* renamed from: ee.p$h */
    /* loaded from: classes3.dex */
    public static final class h extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f92845a;

        h(String str) {
            this.f92845a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C18412t.m97566F().m97585r(this.f92845a);
        }
    }

    /* renamed from: ee.p$i */
    /* loaded from: classes3.dex */
    static final class i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final i f92846q = new i();

        i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList mo12V4() {
            return new ArrayList();
        }
    }

    /* renamed from: ee.p$j */
    /* loaded from: classes3.dex */
    public static final class j extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ ArrayList f92847a;

        /* renamed from: b */
        final /* synthetic */ C18408p f92848b;

        j(ArrayList arrayList, C18408p c18408p) {
            this.f92847a = arrayList;
            this.f92848b = c18408p;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f92847a.iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                C19420l c19420l = (C19420l) it.next();
                if (!c19420l.f96354e) {
                    ArrayList m97573A = C18412t.m97566F().m97573A(c19420l.f96350a, c19420l.f96351b);
                    c19420l.m101557a();
                    C18408p c18408p = this.f92848b;
                    c18408p.f92827f++;
                    c19420l.m101566j(m97573A, c18408p.f92827f);
                    c19420l.f96354e = true;
                    z11 = true;
                }
                if (!c19420l.f96355f) {
                    arrayList.add(c19420l);
                }
            }
            if (z11) {
                this.f92848b.m97481c0();
            }
            this.f92848b.m97526g0(arrayList);
        }
    }

    /* renamed from: ee.p$k */
    /* loaded from: classes3.dex */
    public static final class k implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ int f92850b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC0765j f92851c;

        k(int i11, InterfaceC0765j interfaceC0765j) {
            this.f92850b = i11;
            this.f92851c = interfaceC0765j;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            ArrayList arrayList = C18408p.this.f92831j;
            if (arrayList == null) {
                AbstractC19074t.m100223u("lastGetRangeRequests");
                arrayList = null;
            }
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                ArrayList arrayList2 = C18408p.this.f92831j;
                if (arrayList2 == null) {
                    AbstractC19074t.m100223u("lastGetRangeRequests");
                    arrayList2 = null;
                }
                Object obj = arrayList2.get(i11);
                AbstractC19074t.m100207e(obj, "get(...)");
                C19414f c19414f = (C19414f) obj;
                C19420l m97511H = C18408p.this.m97511H(c19414f.f96323b, c19414f.f96324c);
                if (m97511H != null) {
                    m97511H.f96355f = false;
                }
            }
            C18408p.this.f92833l = false;
            C18408p.this.m97527h0();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            ArrayList arrayList;
            JSONObject jSONObject;
            int i11;
            boolean z11;
            long j11;
            int i12;
            long j12;
            long j13;
            JSONObject jSONObject2;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                int i13 = 0;
                if (optJSONObject == null) {
                    ArrayList arrayList2 = C18408p.this.f92831j;
                    if (arrayList2 == null) {
                        AbstractC19074t.m100223u("lastGetRangeRequests");
                        arrayList2 = null;
                    }
                    int size = arrayList2.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        ArrayList arrayList3 = C18408p.this.f92831j;
                        if (arrayList3 == null) {
                            AbstractC19074t.m100223u("lastGetRangeRequests");
                            arrayList3 = null;
                        }
                        Object obj2 = arrayList3.get(i14);
                        AbstractC19074t.m100207e(obj2, "get(...)");
                        C19414f c19414f = (C19414f) obj2;
                        C19420l m97511H = C18408p.this.m97511H(c19414f.f96323b, c19414f.f96324c);
                        if (m97511H != null) {
                            m97511H.f96355f = false;
                        }
                    }
                    C18408p.this.f92833l = false;
                    C18408p.this.m97527h0();
                    return;
                }
                int i15 = 0;
                boolean z12 = false;
                while (true) {
                    ArrayList arrayList4 = C18408p.this.f92831j;
                    if (arrayList4 == null) {
                        AbstractC19074t.m100223u("lastGetRangeRequests");
                        arrayList4 = null;
                    }
                    if (i15 >= arrayList4.size()) {
                        break;
                    }
                    ArrayList arrayList5 = C18408p.this.f92831j;
                    if (arrayList5 == null) {
                        AbstractC19074t.m100223u("lastGetRangeRequests");
                        arrayList5 = null;
                    }
                    Object obj3 = arrayList5.get(i15);
                    AbstractC19074t.m100207e(obj3, "get(...)");
                    C19414f c19414f2 = (C19414f) obj3;
                    int i16 = c19414f2.f96322a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i16);
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject(sb2.toString());
                    if (optJSONObject2 != null) {
                        long optLong = optJSONObject2.optLong("lastTimestamp", 0L);
                        String optString = optJSONObject2.optString("lastEventId", "");
                        boolean m100204b = AbstractC19074t.m100204b(optJSONObject2.optString("isLoadMore", "0"), "1");
                        int optInt = optJSONObject2.optInt("eventHashStatus", i13);
                        int i17 = i15;
                        C19420l m97511H2 = C18408p.this.m97511H(c19414f2.f96323b, c19414f2.f96324c);
                        if (m97511H2 == null) {
                            z11 = z12;
                            m97511H2 = new C19420l(c19414f2.f96323b, c19414f2.f96324c);
                            m97511H2.f96355f = true;
                            C18408p.this.f92824c.add(m97511H2);
                        } else {
                            z11 = z12;
                        }
                        if (optInt == 1) {
                            long j14 = c19414f2.f96326e;
                            if (j14 == 0) {
                                j12 = c19414f2.f96323b;
                            } else {
                                j12 = j14 + 1;
                            }
                            long j15 = j12;
                            if (m100204b) {
                                j13 = optLong;
                            } else {
                                j13 = c19414f2.f96324c;
                            }
                            C18408p.this.m97509F(j15, j13, m97511H2, this.f92850b);
                            JSONArray optJSONArray = optJSONObject2.optJSONArray("events");
                            if (optJSONArray != null) {
                                ArrayList arrayList6 = new ArrayList();
                                int length = optJSONArray.length();
                                int i18 = 0;
                                while (i18 < length) {
                                    Object obj4 = optJSONArray.get(i18);
                                    AbstractC19074t.m100206d(obj4, "null cannot be cast to non-null type org.json.JSONObject");
                                    C19411c c19411c = new C19411c((JSONObject) obj4);
                                    StringBuilder sb3 = new StringBuilder(c19411c.f96261a);
                                    long j16 = optLong;
                                    sb3.append(c19411c.f96262b);
                                    Iterator it = arrayList6.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            C19411c c19411c2 = (C19411c) it.next();
                                            jSONObject2 = optJSONObject;
                                            StringBuilder sb4 = new StringBuilder(c19411c2.f96261a);
                                            Iterator it2 = it;
                                            sb4.append(c19411c2.f96262b);
                                            if (AbstractC19074t.m100204b(sb3.toString(), sb4.toString())) {
                                                break;
                                            }
                                            it = it2;
                                            optJSONObject = jSONObject2;
                                        } else {
                                            jSONObject2 = optJSONObject;
                                            arrayList6.add(c19411c);
                                            break;
                                        }
                                    }
                                    i18++;
                                    optLong = j16;
                                    optJSONObject = jSONObject2;
                                }
                                jSONObject = optJSONObject;
                                j11 = optLong;
                                C18408p.this.m97533q0(arrayList6, m97511H2, this.f92850b);
                            } else {
                                jSONObject = optJSONObject;
                                j11 = optLong;
                            }
                            z12 = true;
                        } else {
                            jSONObject = optJSONObject;
                            j11 = optLong;
                            z12 = z11;
                        }
                        if (!m100204b) {
                            ArrayList arrayList7 = C18408p.this.f92831j;
                            if (arrayList7 == null) {
                                AbstractC19074t.m100223u("lastGetRangeRequests");
                                i12 = i17;
                                arrayList7 = null;
                            } else {
                                i12 = i17;
                            }
                            arrayList7.remove(i12);
                            i11 = i12 - 1;
                        } else {
                            c19414f2.f96325d = optString;
                            c19414f2.f96326e = j11;
                            i11 = i17;
                        }
                    } else {
                        jSONObject = optJSONObject;
                        int i19 = i15;
                        boolean z13 = z12;
                        ArrayList arrayList8 = C18408p.this.f92831j;
                        if (arrayList8 == null) {
                            AbstractC19074t.m100223u("lastGetRangeRequests");
                            arrayList8 = null;
                        }
                        arrayList8.remove(i19);
                        i11 = i19 - 1;
                        z12 = z13;
                    }
                    i15 = i11 + 1;
                    optJSONObject = jSONObject;
                    i13 = 0;
                }
                boolean z14 = z12;
                ArrayList arrayList9 = C18408p.this.f92831j;
                if (arrayList9 == null) {
                    AbstractC19074t.m100223u("lastGetRangeRequests");
                    arrayList9 = null;
                }
                if (arrayList9.size() > 0) {
                    InterfaceC0765j interfaceC0765j = this.f92851c;
                    ArrayList arrayList10 = C18408p.this.f92831j;
                    if (arrayList10 == null) {
                        AbstractC19074t.m100223u("lastGetRangeRequests");
                        arrayList = null;
                    } else {
                        arrayList = arrayList10;
                    }
                    interfaceC0765j.mo1460J6(arrayList, C18408p.this.f92825d, C18408p.this.f92826e);
                    return;
                }
                if (z14) {
                    C18408p.this.m97481c0();
                    C18403k.m97443p().m97460G(System.currentTimeMillis());
                }
                C18408p.this.f92833l = false;
                C18408p.this.m97527h0();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: ee.p$l */
    /* loaded from: classes3.dex */
    public static final class l extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ ArrayList f92852a;

        l(ArrayList arrayList) {
            this.f92852a = arrayList;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C18412t.m97566F().m97579N(this.f92852a);
        }
    }

    /* renamed from: ee.p$m */
    /* loaded from: classes3.dex */
    public static final class m implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ int f92854b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC0765j f92855c;

        m(int i11, InterfaceC0765j interfaceC0765j) {
            this.f92854b = i11;
            this.f92855c = interfaceC0765j;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            C18408p c18408p = C18408p.this;
            c18408p.f92829h++;
            AbstractC23309i.m121389Rn(AbstractC23160o0.m119261j0(c18408p.f92829h, 1800L));
            C18408p.this.f92828g = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int i11;
            String str;
            ArrayList arrayList3;
            int i12;
            long j11;
            long j12;
            JSONArray jSONArray;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                int i13 = 1;
                int i14 = 0;
                if (optJSONObject != null) {
                    int i15 = 0;
                    boolean z11 = false;
                    while (true) {
                        ArrayList arrayList4 = C18408p.this.f92830i;
                        String str2 = "lastSyncRangeRequests";
                        if (arrayList4 == null) {
                            AbstractC19074t.m100223u("lastSyncRangeRequests");
                            arrayList4 = null;
                        }
                        if (i15 >= arrayList4.size()) {
                            break;
                        }
                        ArrayList arrayList5 = C18408p.this.f92830i;
                        if (arrayList5 == null) {
                            AbstractC19074t.m100223u("lastSyncRangeRequests");
                            arrayList5 = null;
                        }
                        Object obj2 = arrayList5.get(i15);
                        AbstractC19074t.m100207e(obj2, "get(...)");
                        C19414f c19414f = (C19414f) obj2;
                        int i16 = c19414f.f96322a;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i16);
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject(sb2.toString());
                        if (optJSONObject2 != null) {
                            long optLong = optJSONObject2.optLong("lastTimestamp", 0L);
                            String optString = optJSONObject2.optString("lastEventId", "");
                            boolean m100204b = AbstractC19074t.m100204b(optJSONObject2.optString("isLoadMore", "0"), "1");
                            int optInt = optJSONObject2.optInt("eventHashStatus", i14);
                            int i17 = i15;
                            boolean z12 = z11;
                            C19420l m97511H = C18408p.this.m97511H(c19414f.f96323b, c19414f.f96324c);
                            if (m97511H == null) {
                                m97511H = new C19420l(c19414f.f96323b, c19414f.f96324c);
                                C18408p.this.f92824c.add(m97511H);
                            }
                            if (optInt != i13) {
                                str = "lastSyncRangeRequests";
                                z11 = z12;
                            } else {
                                long j13 = c19414f.f96326e;
                                if (j13 == 0) {
                                    j11 = c19414f.f96323b;
                                } else {
                                    j11 = j13 + 1;
                                }
                                long j14 = j11;
                                if (m100204b) {
                                    j12 = optLong;
                                } else {
                                    j12 = c19414f.f96324c;
                                }
                                C18408p.this.m97509F(j14, j12, m97511H, this.f92854b);
                                JSONArray optJSONArray = optJSONObject2.optJSONArray("events");
                                if (optJSONArray == null) {
                                    str = "lastSyncRangeRequests";
                                } else {
                                    ArrayList arrayList6 = new ArrayList();
                                    int length = optJSONArray.length();
                                    int i18 = 0;
                                    while (i18 < length) {
                                        Object obj3 = optJSONArray.get(i18);
                                        AbstractC19074t.m100206d(obj3, "null cannot be cast to non-null type org.json.JSONObject");
                                        C19411c c19411c = new C19411c((JSONObject) obj3);
                                        StringBuilder sb3 = new StringBuilder(c19411c.f96261a);
                                        String str3 = str2;
                                        int i19 = length;
                                        sb3.append(c19411c.f96262b);
                                        Iterator it = arrayList6.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                C19411c c19411c2 = (C19411c) it.next();
                                                jSONArray = optJSONArray;
                                                Iterator it2 = it;
                                                if (AbstractC19074t.m100204b(sb3.toString(), c19411c2.f96261a + c19411c2.f96262b)) {
                                                    break;
                                                }
                                                optJSONArray = jSONArray;
                                                it = it2;
                                            } else {
                                                jSONArray = optJSONArray;
                                                arrayList6.add(c19411c);
                                                break;
                                            }
                                        }
                                        i18++;
                                        str2 = str3;
                                        length = i19;
                                        optJSONArray = jSONArray;
                                    }
                                    str = str2;
                                    C18408p.this.m97533q0(arrayList6, m97511H, this.f92854b);
                                }
                                z11 = true;
                            }
                            if (m100204b) {
                                c19414f.f96325d = optString;
                                c19414f.f96326e = optLong;
                                i11 = i17;
                            } else {
                                m97511H.f96355f = true;
                                ArrayList arrayList7 = C18408p.this.f92830i;
                                if (arrayList7 == null) {
                                    AbstractC19074t.m100223u(str);
                                    i12 = i17;
                                    arrayList3 = null;
                                } else {
                                    arrayList3 = arrayList7;
                                    i12 = i17;
                                }
                                arrayList3.remove(i12);
                                i11 = i12 - 1;
                            }
                        } else {
                            int i21 = i15;
                            boolean z13 = z11;
                            ArrayList arrayList8 = C18408p.this.f92830i;
                            if (arrayList8 == null) {
                                AbstractC19074t.m100223u("lastSyncRangeRequests");
                                arrayList2 = null;
                            } else {
                                arrayList2 = arrayList8;
                            }
                            arrayList2.remove(i21);
                            i11 = i21 - 1;
                            z11 = z13;
                        }
                        i13 = 1;
                        i15 = i11 + 1;
                        i14 = 0;
                    }
                    boolean z14 = z11;
                    ArrayList arrayList9 = C18408p.this.f92830i;
                    if (arrayList9 == null) {
                        AbstractC19074t.m100223u("lastSyncRangeRequests");
                        arrayList9 = null;
                    }
                    if (arrayList9.size() > 0) {
                        InterfaceC0765j interfaceC0765j = this.f92855c;
                        ArrayList arrayList10 = C18408p.this.f92830i;
                        if (arrayList10 == null) {
                            AbstractC19074t.m100223u("lastSyncRangeRequests");
                            arrayList = null;
                        } else {
                            arrayList = arrayList10;
                        }
                        interfaceC0765j.mo1664j4(arrayList);
                        return;
                    }
                    if (z14) {
                        C18408p.this.m97481c0();
                        C18403k.m97443p().m97460G(System.currentTimeMillis());
                    }
                    AbstractC23309i.m121389Rn(optJSONObject.optLong("expiredDuration", 604800L));
                    C18408p.this.f92829h = 0;
                    C19669z.Companion.m103232a().m103198O0();
                    C18408p.this.f92828g = false;
                    return;
                }
                C18408p c18408p = C18408p.this;
                c18408p.f92829h++;
                AbstractC23309i.m121389Rn(AbstractC23160o0.m119261j0(c18408p.f92829h, 1800L));
                C18408p.this.f92828g = false;
            } catch (JSONException e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: ee.p$n */
    /* loaded from: classes3.dex */
    public static final class n extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ ArrayList f92856a;

        n(ArrayList arrayList) {
            this.f92856a = arrayList;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C18412t.m97566F().m97586s(this.f92856a);
        }
    }

    /* renamed from: ee.p$o */
    /* loaded from: classes3.dex */
    public static final class o extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ ArrayList f92857a;

        o(ArrayList arrayList) {
            this.f92857a = arrayList;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C18412t.m97566F().m97577L(this.f92857a);
        }
    }

    /* renamed from: ee.p$p */
    /* loaded from: classes3.dex */
    public static final class p extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C19411c f92858a;

        p(C19411c c19411c) {
            this.f92858a = c19411c;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            ArrayList m131500h;
            ArrayList m131500h2;
            C18412t m97566F = C18412t.m97566F();
            m131500h = AbstractC25368s.m131500h(this.f92858a.f96261a);
            m97566F.m97582i(m131500h);
            C18412t m97566F2 = C18412t.m97566F();
            m131500h2 = AbstractC25368s.m131500h(this.f92858a);
            m97566F2.m97577L(m131500h2);
        }
    }

    /* renamed from: ee.p$q */
    /* loaded from: classes3.dex */
    public static final class q extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ ArrayList f92859a;

        q(ArrayList arrayList) {
            this.f92859a = arrayList;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C18412t.m97566F().m97577L(this.f92859a);
        }
    }

    static {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        m129210a = AbstractC24856m.m129210a(e.f92842q);
        f92812m = m129210a;
        m129210a2 = AbstractC24856m.m129210a(d.f92841q);
        f92813n = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(c.f92840q);
        f92814o = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(b.f92839q);
        f92815p = m129210a4;
        f92818s = new Semaphore(0);
        f92819t = Collections.synchronizedList(new ArrayList());
        f92820u = true;
        f92821v = -2L;
    }

    public C18408p() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(i.f92846q);
        this.f92832k = m129210a;
    }

    /* renamed from: I */
    public static final Comparator m97469I() {
        return Companion.m97543d();
    }

    /* renamed from: J */
    public static final Comparator m97470J() {
        return Companion.m97545f();
    }

    /* renamed from: K */
    public static final TimeZone m97471K() {
        return Companion.m97546g();
    }

    /* renamed from: L */
    private final ArrayList m97472L() {
        return (ArrayList) this.f92832k.getValue();
    }

    /* renamed from: P */
    public static final long m97473P() {
        return Companion.m97547i();
    }

    /* renamed from: Q */
    public static final C18408p m97474Q() {
        return Companion.m97550o();
    }

    /* renamed from: R */
    public static final C18408p m97475R(a.InterfaceC32814a interfaceC32814a) {
        return Companion.m97551p(interfaceC32814a);
    }

    /* renamed from: S */
    public static final C18408p m97476S() {
        return Companion.m97552q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public final void m97478a0() {
        Iterator it = this.f92824c.iterator();
        while (it.hasNext()) {
            C19420l c19420l = (C19420l) it.next();
            if (!c19420l.f96354e) {
                ArrayList m97573A = C18412t.m97566F().m97573A(c19420l.f96350a, c19420l.f96351b);
                c19420l.m101557a();
                int i11 = this.f92827f + 1;
                this.f92827f = i11;
                c19420l.m101566j(m97573A, i11);
                c19420l.f96354e = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public final void m97481c0() {
        f92820u = true;
        C23744a.Companion.m124119a().m124116d(3050, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public static final void m97488i0(C19059j0 c19059j0, C18408p c18408p) {
        AbstractC19074t.m100208f(c19059j0, "$currentGetEventQueue");
        AbstractC19074t.m100208f(c18408p, "this$0");
        ArrayList arrayList = new ArrayList();
        while (((ArrayList) c19059j0.f94941p).size() > 0) {
            Object obj = ((ArrayList) c19059j0.f94941p).get(0);
            AbstractC19074t.m100207e(obj, "get(...)");
            C19420l c19420l = (C19420l) obj;
            ((ArrayList) c19059j0.f94941p).remove(0);
            C19420l m97511H = c18408p.m97511H(c19420l.f96350a, c19420l.f96351b);
            if (m97511H != null && !m97511H.f96355f) {
                arrayList.add(new C19414f(arrayList.size(), c19420l.f96350a, c19420l.f96351b, "", 0L, c19420l.m101558b()));
                m97511H.f96355f = true;
            }
        }
        if (arrayList.size() > 0) {
            c18408p.m97516U(arrayList);
        } else {
            c18408p.f92833l = false;
            c18408p.m97527h0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0 */
    public static final void m97492l0(Calendar calendar, int i11, C18408p c18408p) {
        AbstractC19074t.m100208f(calendar, "$fromMonth");
        AbstractC19074t.m100208f(c18408p, "this$0");
        ArrayList arrayList = new ArrayList();
        Object clone = calendar.clone();
        AbstractC19074t.m100206d(clone, "null cannot be cast to non-null type java.util.Calendar");
        Calendar calendar2 = (Calendar) clone;
        calendar2.set(5, 15);
        calendar2.setTimeZone(Companion.m97546g());
        for (int i12 = 0; i12 < i11; i12++) {
            AbstractC23160o0.m119286r1(calendar2);
            long timeInMillis = calendar2.getTimeInMillis();
            AbstractC23160o0.m119295u1(calendar2);
            long timeInMillis2 = calendar2.getTimeInMillis();
            C19420l m97511H = c18408p.m97511H(timeInMillis, timeInMillis2);
            if (m97511H == null) {
                m97511H = new C19420l(timeInMillis, timeInMillis2);
                c18408p.f92824c.add(m97511H);
            }
            if (!m97511H.f96354e) {
                ArrayList m97573A = C18412t.m97566F().m97573A(m97511H.f96350a, m97511H.f96351b);
                m97511H.m101557a();
                int i13 = c18408p.f92827f + 1;
                c18408p.f92827f = i13;
                m97511H.m101566j(m97573A, i13);
                m97511H.f96354e = true;
            }
            arrayList.add(new C19414f(arrayList.size(), m97511H.f96350a, m97511H.f96351b, "", 0L, m97511H.m101558b()));
            calendar2.add(2, 1);
        }
        c18408p.m97528j0(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p0 */
    public static final void m97497p0(C18408p c18408p, C19411c c19411c) {
        ArrayList m131500h;
        AbstractC19074t.m100208f(c18408p, "this$0");
        AbstractC19074t.m100208f(c19411c, "$event");
        Iterator it = c18408p.f92824c.iterator();
        while (it.hasNext()) {
            ((C19420l) it.next()).m101562f(c19411c.f96261a);
        }
        C18403k.m97443p().m97454A(c19411c.f96261a);
        Calendar calendar = Calendar.getInstance(Companion.m97546g());
        calendar.setTimeInMillis(c19411c.f96262b);
        AbstractC23160o0.m119286r1(calendar);
        long timeInMillis = calendar.getTimeInMillis();
        AbstractC23160o0.m119295u1(calendar);
        long timeInMillis2 = calendar.getTimeInMillis();
        C19420l m97511H = c18408p.m97511H(timeInMillis, timeInMillis2);
        if (m97511H == null) {
            m97511H = new C19420l(timeInMillis, timeInMillis2);
            c18408p.f92824c.add(m97511H);
        }
        m131500h = AbstractC25368s.m131500h(c19411c);
        int i11 = c18408p.f92827f + 1;
        c18408p.f92827f = i11;
        ArrayList m101566j = m97511H.m101566j(m131500h, i11);
        c18408p.m97481c0();
        C18403k.m97443p().m97461j(m101566j);
    }

    /* renamed from: E */
    public final void m97508E(String str) {
        AbstractC19074t.m100208f(str, "eventId");
        C0824j.m2153b(new f(str));
        Iterator it = this.f92824c.iterator();
        while (it.hasNext()) {
            ((C19420l) it.next()).m101562f(str);
        }
        m97481c0();
    }

    /* renamed from: F */
    public final void m97509F(long j11, long j12, C19420l c19420l, int i11) {
        AbstractC19074t.m100208f(c19420l, "eventTimeRange");
        synchronized (this) {
            C0824j.m2153b(new g(c19420l.m101563g(j11, j12, i11)));
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: G */
    public final void m97510G(String str) {
        C0824j.m2153b(new h(str));
        Iterator it = this.f92824c.iterator();
        while (it.hasNext()) {
            ((C19420l) it.next()).m101564h(str);
        }
        m97481c0();
        C18403k.m97443p().m97460G(System.currentTimeMillis());
    }

    /* renamed from: H */
    public final C19420l m97511H(long j11, long j12) {
        Iterator it = this.f92824c.iterator();
        while (it.hasNext()) {
            C19420l c19420l = (C19420l) it.next();
            if (c19420l.f96350a == j11 && c19420l.f96351b == j12) {
                return c19420l;
            }
        }
        return null;
    }

    /* renamed from: M */
    public final ArrayList m97512M() {
        C19411c.a aVar;
        C19411c.a.C32826a c32826a;
        C19411c.a aVar2;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f92824c.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((C19420l) it.next()).m101559c());
        }
        int i11 = 0;
        while (i11 < arrayList.size()) {
            Object obj = arrayList.get(i11);
            AbstractC19074t.m100207e(obj, "get(...)");
            C19411c c19411c = (C19411c) obj;
            if (Companion.m97541r(c19411c)) {
                arrayList.remove(i11);
            } else {
                C19409a c19409a = c19411c.f96285y;
                if (c19409a != null && c19409a.f96250b == 2 && ((c19411c.f96279s != 1 || (aVar2 = c19411c.f96281u) == null || !this.f92823b.contains(aVar2.f96287a)) && !this.f92823b.contains(c19411c.f96261a))) {
                    arrayList.remove(i11);
                } else if (c19411c.f96279s == 2 && (aVar = c19411c.f96281u) != null && (c32826a = aVar.f96290d) != null && !c32826a.m101535a()) {
                    arrayList.remove(i11);
                } else {
                    i11++;
                }
            }
        }
        Collections.sort(arrayList, Companion.m97544e());
        return arrayList;
    }

    /* renamed from: N */
    public final ArrayList m97513N(String str) {
        C19411c.a aVar;
        AbstractC19074t.m100208f(str, "ownerId");
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f92824c.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((C19420l) it.next()).m101559c().iterator();
            while (it2.hasNext()) {
                C19411c c19411c = (C19411c) it2.next();
                if (TextUtils.isEmpty(str) || (AbstractC19074t.m100204b(c19411c.f96278r, str) && ((aVar = c19411c.f96281u) == null || !aVar.f96293g))) {
                    arrayList.add(c19411c);
                }
            }
        }
        Collections.sort(arrayList, Companion.m97544e());
        return arrayList;
    }

    /* renamed from: O */
    public final ArrayList m97514O(long j11, long j12) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f92824c.iterator();
        while (it.hasNext()) {
            C19420l c19420l = (C19420l) it.next();
            if (j12 >= c19420l.f96350a - 864000000 && j11 <= c19420l.f96351b + 864000000) {
                arrayList.addAll(C18415w.m97599l(c19420l.m101561e(), j11, j12));
            }
        }
        return arrayList;
    }

    /* renamed from: T */
    public final void m97515T(Calendar calendar, int i11) {
        AbstractC19074t.m100208f(calendar, "fromMonth");
        if (i11 <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Object clone = calendar.clone();
        AbstractC19074t.m100206d(clone, "null cannot be cast to non-null type java.util.Calendar");
        Calendar calendar2 = (Calendar) clone;
        calendar2.set(5, 15);
        calendar2.setTimeZone(Companion.m97546g());
        for (int i12 = 0; i12 < i11; i12++) {
            AbstractC23160o0.m119286r1(calendar2);
            long timeInMillis = calendar2.getTimeInMillis();
            AbstractC23160o0.m119295u1(calendar2);
            long timeInMillis2 = calendar2.getTimeInMillis();
            C19420l m97511H = m97511H(timeInMillis, timeInMillis2);
            if (m97511H == null) {
                m97511H = new C19420l(timeInMillis, timeInMillis2);
                this.f92824c.add(m97511H);
            }
            if (m97511H.f96354e) {
                if (!m97511H.f96355f) {
                    arrayList.add(m97511H);
                }
            } else {
                arrayList2.add(m97511H);
            }
            calendar2.add(2, 1);
        }
        C0824j.m2153b(new j(arrayList2, this));
        m97526g0(arrayList);
    }

    /* renamed from: U */
    public final void m97516U(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "rangeRequests");
        int i11 = this.f92827f + 1;
        this.f92827f = i11;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new k(i11, c0766k));
        this.f92831j = arrayList;
        if (arrayList == null) {
            AbstractC19074t.m100223u("lastGetRangeRequests");
            arrayList = null;
        }
        c0766k.mo1460J6(arrayList, this.f92825d, this.f92826e);
        this.f92826e = false;
    }

    /* renamed from: V */
    public final int m97517V() {
        return this.f92825d;
    }

    /* renamed from: W */
    public final ArrayList m97518W(String str, int i11, int[] iArr) {
        long currentTimeMillis;
        long timeInMillis;
        boolean m131388u;
        AbstractC19074t.m100208f(str, "ownerId");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (i11 > 0) {
            try {
                currentTimeMillis = System.currentTimeMillis();
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(currentTimeMillis);
                calendar.add(2, 1);
                AbstractC23160o0.m119295u1(calendar);
                timeInMillis = calendar.getTimeInMillis();
            } catch (Exception e11) {
                e = e11;
            }
            try {
                Iterator it = this.f92824c.iterator();
                while (it.hasNext()) {
                    C19420l c19420l = (C19420l) it.next();
                    if (timeInMillis >= c19420l.f96350a && currentTimeMillis <= c19420l.f96351b) {
                        Iterator it2 = c19420l.m101559c().iterator();
                        while (it2.hasNext()) {
                            C19411c c19411c = (C19411c) it2.next();
                            long j11 = c19411c.f96262b;
                            if (currentTimeMillis <= j11 && j11 <= timeInMillis) {
                                if (!TextUtils.isEmpty(str)) {
                                    if (AbstractC19074t.m100204b(c19411c.f96278r, str)) {
                                        C19411c.a aVar = c19411c.f96281u;
                                        if (aVar != null && aVar.f96293g) {
                                        }
                                    }
                                }
                                int i12 = c19411c.f96260B;
                                if (i12 != 1 && i12 != 2) {
                                    if (iArr != null) {
                                        m131388u = AbstractC25358n.m131388u(iArr, c19411c.f96279s);
                                        if (m131388u) {
                                        }
                                    }
                                    arrayList2.add(c19411c);
                                }
                            }
                        }
                    }
                }
                Collections.sort(arrayList2, Companion.m97544e());
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    C19411c c19411c2 = (C19411c) it3.next();
                    Iterator it4 = arrayList.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            if (AbstractC19074t.m100204b(((C19411c) it4.next()).f96261a, c19411c2.f96261a)) {
                                break;
                            }
                        } else {
                            arrayList.add(c19411c2);
                            if (arrayList.size() >= i11) {
                                return arrayList;
                            }
                        }
                    }
                }
            } catch (Exception e12) {
                e = e12;
                AbstractC23350e.m122778h(e);
                return arrayList;
            }
        }
        return arrayList;
    }

    /* renamed from: X */
    public final ArrayList m97519X(String str, int i11, int[] iArr) {
        C19424p c19424p;
        int i12;
        boolean m131388u;
        C19411c.a.e eVar;
        AbstractC19074t.m100208f(str, "conversationId");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            calendar.add(6, 7);
            long timeInMillis = calendar.getTimeInMillis();
            try {
                Iterator it = this.f92824c.iterator();
                while (it.hasNext()) {
                    C19420l c19420l = (C19420l) it.next();
                    if (timeInMillis >= c19420l.f96350a && currentTimeMillis <= c19420l.f96351b) {
                        Iterator it2 = c19420l.m101559c().iterator();
                        while (it2.hasNext()) {
                            C19411c c19411c = (C19411c) it2.next();
                            long j11 = c19411c.f96262b;
                            if (currentTimeMillis <= j11 && j11 <= timeInMillis) {
                                if (!TextUtils.isEmpty(str)) {
                                    if (c19411c.f96277q == 2) {
                                        if (AbstractC25495a.m132079d(str) && AbstractC19074t.m100204b(c19411c.f96278r, AbstractC25495a.m132088m(str))) {
                                        }
                                    } else if (c19411c.f96279s == 3) {
                                        if (!TextUtils.equals(c19411c.f96278r, str)) {
                                            C19411c.a aVar = c19411c.f96281u;
                                            if (aVar != null && (eVar = aVar.f96289c) != null && !TextUtils.isEmpty(eVar.f96310e) && TextUtils.equals(c19411c.f96281u.f96289c.f96310e, str)) {
                                            }
                                        }
                                    } else if (!AbstractC19074t.m100204b(c19411c.f96278r, str)) {
                                    }
                                }
                                C19411c.a aVar2 = c19411c.f96281u;
                                if (aVar2 == null || !aVar2.f96293g) {
                                    int i13 = c19411c.f96260B;
                                    if (i13 != 1 && i13 != 2) {
                                        if (iArr != null) {
                                            m131388u = AbstractC25358n.m131388u(iArr, c19411c.f96279s);
                                            if (m131388u) {
                                            }
                                        }
                                        arrayList2.add(c19411c);
                                    }
                                }
                            }
                        }
                    }
                }
                Collections.sort(arrayList2, Companion.m97544e());
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    C19411c c19411c2 = (C19411c) it3.next();
                    JSONArray jSONArray = c19411c2.f96270j;
                    if (jSONArray != null && jSONArray.length() > 0 && (c19424p = new C19425q(c19411c2.f96270j, c19411c2.f96272l).f96376a) != null && (i12 = c19424p.f96370a) != -1) {
                        if (i12 != 0) {
                            if (i12 != 1) {
                                if (i12 != 2) {
                                    if (i12 != 3) {
                                        if (i12 == 4) {
                                            if (c19424p.f96371b.size() >= 4) {
                                                if (c19411c2.f96262b - System.currentTimeMillis() > 1800000) {
                                                    continue;
                                                }
                                            } else if (c19411c2.f96262b - System.currentTimeMillis() > 86400000) {
                                                continue;
                                            }
                                        }
                                    } else if (c19411c2.f96262b - System.currentTimeMillis() > 604800000) {
                                        continue;
                                    }
                                } else if (c19411c2.f96262b - System.currentTimeMillis() > 259200000) {
                                    continue;
                                }
                            } else if (c19411c2.f96262b - System.currentTimeMillis() > 86400000) {
                                continue;
                            }
                        } else if (c19411c2.f96262b - System.currentTimeMillis() > 1800000) {
                            continue;
                        }
                    }
                    arrayList.add(c19411c2);
                    if (arrayList.size() >= i11) {
                        return arrayList;
                    }
                }
            } catch (Exception e11) {
                e = e11;
                AbstractC23350e.m122778h(e);
                return arrayList;
            }
        } catch (Exception e12) {
            e = e12;
        }
        return arrayList;
    }

    /* renamed from: Y */
    public final void m97520Y(JSONObject jSONObject) {
        boolean z11;
        boolean z12;
        String str;
        String str2;
        String str3;
        AbstractC19074t.m100208f(jSONObject, "data");
        try {
            boolean z13 = true;
            if (jSONObject.optInt("notify", 1) == 1) {
                long optLong = jSONObject.optLong("remindTime");
                int optInt = jSONObject.optInt("expiredTime");
                if (jSONObject.optInt("showTime") == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                long mo124311f = C23793c.Companion.m124321a().mo124311f();
                if (optLong + (optInt * 60000) > mo124311f) {
                    JSONObject optJSONObject = jSONObject.optJSONObject("event");
                    String optString = jSONObject.optString("icon", "https://res-zalo.zadn.vn/upload/media/2019/5/14/thumb_notification_calendar_1557805416309_206776.png");
                    if (optJSONObject != null) {
                        C19411c c19411c = new C19411c(optJSONObject);
                        if (Companion.m97541r(c19411c)) {
                            return;
                        }
                        C19409a c19409a = c19411c.f96285y;
                        if (c19409a != null && c19409a.f96250b == 2) {
                            return;
                        }
                        if (!AbstractC23059e9.m118329h() && (c19411c.f96279s != 2 || c19411c.f96277q != 1)) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        if (!z12) {
                            str = "";
                            str2 = str;
                        } else {
                            if (TextUtils.isEmpty(c19411c.f96286z)) {
                                str3 = "";
                            } else {
                                str3 = c19411c.f96286z;
                            }
                            long j11 = c19411c.f96262b;
                            if (c19411c.f96266f == 1) {
                                j11 += AbstractC23160o0.m119255h0(r1.m97546g(), TimeZone.getDefault(), j11);
                                z13 = false;
                            }
                            long j12 = j11;
                            String m119228X0 = AbstractC23160o0.m119228X0(c19411c.f96279s, mo124311f, j12, str3, z13);
                            C19411c.b bVar = c19411c.f96282v;
                            if (bVar != null && !TextUtils.isEmpty(bVar.f96314a)) {
                                m119228X0 = c19411c.f96282v.f96314a + " " + m119228X0;
                            }
                            if (z11) {
                                String m119214Q0 = AbstractC23160o0.m119214Q0(j12, z13, false);
                                AbstractC19074t.m100207e(m119214Q0, "getTimeStringNotifText(...)");
                                str = m119228X0;
                                str2 = m119214Q0;
                            } else {
                                str = m119228X0;
                                str2 = "";
                            }
                        }
                        C28023b6.m141250h0().m141365n1(str, str2, optString, c19411c, z12);
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: Z */
    public final void m97521Z(JSONObject jSONObject) {
        long j11;
        long j12;
        boolean z11;
        boolean z12;
        String str;
        String str2;
        String str3;
        C19411c.a.d dVar;
        boolean z13;
        C19411c.a.d dVar2;
        AbstractC19074t.m100208f(jSONObject, "jsEvent");
        try {
            long currentTimeMillis = System.currentTimeMillis();
            C19426r c19426r = new C19426r(jSONObject);
            C19411c.a aVar = c19426r.f96281u;
            if (aVar != null && (dVar2 = aVar.f96292f) != null) {
                z11 = dVar2.f96303a;
                j11 = c19426r.f96380C;
                j12 = dVar2.f96305c;
            } else {
                j11 = c19426r.f96262b;
                j12 = 0;
                z11 = false;
            }
            if (!z11) {
                return;
            }
            if ((j12 > 0 && j11 + (j12 * 60 * 1000) <= currentTimeMillis) || Companion.m97541r(c19426r)) {
                return;
            }
            C19409a c19409a = c19426r.f96285y;
            if (c19409a != null && c19409a.f96250b == 2) {
                return;
            }
            if (!AbstractC23059e9.m118329h() && (c19426r.f96279s != 2 || c19426r.f96277q != 1)) {
                z12 = false;
            } else {
                z12 = true;
            }
            String str4 = "";
            if (!z12) {
                str = "";
                str2 = str;
            } else {
                if (!TextUtils.isEmpty(c19426r.f96286z)) {
                    str4 = c19426r.f96286z;
                }
                String str5 = str4;
                long j13 = c19426r.f96262b;
                if (c19426r.f96266f == 1) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                String m119228X0 = AbstractC23160o0.m119228X0(c19426r.f96279s, currentTimeMillis, j13, str5, z13);
                C19411c.b bVar = c19426r.f96282v;
                if (bVar != null && !TextUtils.isEmpty(bVar.f96314a)) {
                    m119228X0 = c19426r.f96282v.f96314a + " " + m119228X0;
                }
                String m119214Q0 = AbstractC23160o0.m119214Q0(j13, z13, false);
                AbstractC19074t.m100207e(m119214Q0, "getTimeStringNotifText(...)");
                str2 = m119214Q0;
                str = m119228X0;
            }
            C19411c.a aVar2 = c19426r.f96281u;
            if (aVar2 != null && (dVar = aVar2.f96292f) != null && !TextUtils.isEmpty(dVar.f96304b)) {
                str3 = c19426r.f96281u.f96292f.f96304b;
            } else {
                str3 = "https://res-zalo.zadn.vn/upload/media/2019/5/14/thumb_notification_calendar_1557805416309_206776.png";
            }
            C28023b6.m141250h0().m141365n1(str, str2, str3, c19426r, z12);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: b0 */
    public final void m97522b0(long j11, long j12) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C19421m("CALENDAR_000", 1, j11, j12));
        C0824j.m2153b(new l(arrayList));
        f92821v = j11 + j12;
        C23744a.Companion.m124119a().m124116d(3053, Boolean.valueOf(Companion.m97553s()));
        C19669z.Companion.m103232a().m103198O0();
    }

    /* renamed from: d0 */
    public final void m97523d0() {
        Iterator it = this.f92824c.iterator();
        while (it.hasNext()) {
            ((C19420l) it.next()).f96355f = false;
        }
    }

    /* renamed from: e0 */
    public final void m97524e0() {
        this.f92823b.clear();
    }

    /* renamed from: f0 */
    public final void m97525f0(int i11) {
        this.f92825d = i11;
        this.f92826e = true;
    }

    /* renamed from: g0 */
    public final void m97526g0(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "rangesGet");
        synchronized (m97472L()) {
            m97472L().addAll(arrayList);
        }
        m97527h0();
    }

    /* renamed from: h0 */
    public final void m97527h0() {
        if (m97472L().size() != 0 && !this.f92833l) {
            this.f92833l = true;
            final C19059j0 c19059j0 = new C19059j0();
            synchronized (m97472L()) {
                c19059j0.f94941p = new ArrayList(m97472L());
                m97472L().clear();
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ee.l
                @Override // java.lang.Runnable
                public final void run() {
                    C18408p.m97488i0(C19059j0.this, this);
                }
            });
        }
    }

    /* renamed from: j0 */
    public final void m97528j0(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "rangeRequests");
        if (this.f92828g) {
            return;
        }
        this.f92828g = true;
        int i11 = this.f92827f + 1;
        this.f92827f = i11;
        AbstractC23309i.m122478ur(C23793c.Companion.m124321a().mo124311f());
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new m(i11, c0766k));
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.f92830i = arrayList2;
        c0766k.mo1664j4(arrayList2);
    }

    /* renamed from: k0 */
    public final void m97529k0(final Calendar calendar, final int i11) {
        AbstractC19074t.m100208f(calendar, "fromMonth");
        if (!this.f92828g && i11 > 0) {
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ee.m
                @Override // java.lang.Runnable
                public final void run() {
                    C18408p.m97492l0(calendar, i11, this);
                }
            });
        }
    }

    /* renamed from: m0 */
    public final void m97530m0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1483e("CALENDAR_000", 1));
        C0824j.m2153b(new n(arrayList));
        f92821v = 0L;
        C23744a.Companion.m124119a().m124116d(3053, Boolean.FALSE);
        C19669z.Companion.m103232a().m103198O0();
    }

    /* renamed from: n0 */
    public final void m97531n0(int i11, String str, int i12, int i13, boolean z11) {
        ArrayList m97588y = C18412t.m97566F().m97588y(i11, str, i12);
        ArrayList arrayList = new ArrayList();
        Iterator it = m97588y.iterator();
        while (it.hasNext()) {
            C19411c c19411c = (C19411c) it.next();
            if (c19411c.m101526a(i13, z11)) {
                arrayList.add(c19411c);
            }
        }
        C0824j.m2153b(new o(arrayList));
        Iterator it2 = this.f92824c.iterator();
        boolean z12 = false;
        while (it2.hasNext()) {
            if (((C19420l) it2.next()).m101565i(i11, str, i12, i13, z11)) {
                z12 = true;
            }
        }
        if (z12) {
            m97481c0();
            C18403k.m97443p().m97460G(System.currentTimeMillis());
        }
    }

    /* renamed from: o0 */
    public final void m97532o0(final C19411c c19411c) {
        AbstractC19074t.m100208f(c19411c, "event");
        C0824j.m2153b(new p(c19411c));
        C18403k.m97443p().m97457D(new Runnable() { // from class: ee.n
            @Override // java.lang.Runnable
            public final void run() {
                C18408p.m97497p0(C18408p.this, c19411c);
            }
        });
    }

    /* renamed from: q0 */
    public final void m97533q0(ArrayList arrayList, C19420l c19420l, int i11) {
        AbstractC19074t.m100208f(arrayList, "events");
        AbstractC19074t.m100208f(c19420l, "eventTimeRangeToPut");
        C0824j.m2153b(new q(arrayList));
        c19420l.m101566j(arrayList, i11);
    }
}
