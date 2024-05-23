package s00;

import ag0.C0824j;
import am.AbstractC0939u;
import android.os.SystemClock;
import android.text.TextUtils;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalocore.CoreUtility;
import fg0.ThreadFactoryC18928a;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import me0.AbstractC23148n;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import s00.C26078m;

/* renamed from: s00.k */
/* loaded from: classes.dex */
public class C26076k {

    /* renamed from: a */
    private final ExecutorService f124247a;

    /* renamed from: b */
    private final f f124248b;

    /* renamed from: c */
    private final Object f124249c;

    /* renamed from: d */
    private final AtomicBoolean f124250d;

    /* renamed from: e */
    private final Runnable f124251e;

    /* renamed from: f */
    private final Runnable f124252f;

    /* renamed from: s00.k$a */
    /* loaded from: classes4.dex */
    public class a extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ JSONArray f124253a;

        a(JSONArray jSONArray) {
            this.f124253a = jSONArray;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                int length = this.f124253a.length();
                System.currentTimeMillis();
                boolean z11 = false;
                for (int i11 = 0; i11 < length; i11++) {
                    JSONObject optJSONObject = this.f124253a.optJSONObject(i11);
                    if (optJSONObject != null && !C26076k.this.m134186E(optJSONObject)) {
                        if (!z11) {
                            z11 = true;
                        }
                        optJSONObject.put("show_time", SystemClock.elapsedRealtime());
                        optJSONObject.put("user_uid", CoreUtility.f89233i);
                        C26071f c26071f = new C26071f(optJSONObject);
                        synchronized (C26076k.this.f124249c) {
                            C26076k.this.m134193M(c26071f, false);
                            C26076k.this.m134210u(2, c26071f.f124227b, c26071f, false);
                            C26076k.this.m134185B(c26071f.f124227b, c26071f);
                        }
                        C7960e.m41971c6().m42304W8(c26071f, optJSONObject.toString());
                    }
                }
                if (z11) {
                    C26076k.this.m134217J();
                    C26076k.this.m134207o();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("SettingReminderManager", e11);
            }
        }
    }

    /* renamed from: s00.k$b */
    /* loaded from: classes4.dex */
    public class b extends AbstractC0939u {
        b() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                System.currentTimeMillis();
                List m42508q6 = C7960e.m41971c6().m42508q6();
                C26078m.m134226e().f124263d = true;
                C26076k.this.f124250d.set(true);
                if (m42508q6 != null && m42508q6.size() > 0) {
                    int size = m42508q6.size();
                    synchronized (C26076k.this.f124249c) {
                        for (int i11 = 0; i11 < size; i11++) {
                            try {
                                C26071f c26071f = (C26071f) m42508q6.get(i11);
                                if (c26071f != null) {
                                    if (!AbstractC26084s.m134275w(c26071f.f124228c)) {
                                        C26076k.this.m134210u(4, c26071f.f124227b, c26071f, true);
                                    } else {
                                        C26076k.this.m134193M(c26071f, true);
                                        C26076k.this.m134210u(2, c26071f.f124227b, c26071f, true);
                                    }
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        C26076k.this.m134211x();
                    }
                    C26076k.this.m134217J();
                    C26076k.this.m134207o();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("SettingReminderManager", e11);
            }
        }
    }

    /* renamed from: s00.k$c */
    /* loaded from: classes4.dex */
    public class c extends AbstractC0939u {
        c() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                synchronized (C26076k.this.f124249c) {
                    C26078m.m134226e().m134230c();
                }
                C7960e.m41971c6().m42137H0();
                C26076k.this.m134217J();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: s00.k$d */
    /* loaded from: classes4.dex */
    public class d extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C26071f f124257a;

        d(C26071f c26071f) {
            this.f124257a = c26071f;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                if (this.f124257a != null) {
                    C7960e m41971c6 = C7960e.m41971c6();
                    C26071f c26071f = this.f124257a;
                    m41971c6.m42324Yd(c26071f.f124227b, c26071f.m134174e());
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("SettingReminderManager", e11);
            }
        }
    }

    /* renamed from: s00.k$e */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a */
        static final C26076k f124259a = new C26076k();
    }

    /* renamed from: s00.k$f */
    /* loaded from: classes.dex */
    public static class f implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C26071f c26071f, C26071f c26071f2) {
            if (c26071f != null && c26071f2 != null) {
                int i11 = c26071f.f124229d;
                int i12 = c26071f2.f124229d;
                if (i11 > i12) {
                    return 1;
                }
                if (i11 < i12) {
                    return -1;
                }
                int i13 = c26071f.f124228c;
                int i14 = c26071f2.f124228c;
                if (i13 > i14) {
                    return 1;
                }
                if (i13 < i14) {
                    return -1;
                }
                long j11 = c26071f.f124235j;
                long j12 = c26071f2.f124235j;
                if (j11 > j12) {
                    return 1;
                }
                if (j11 < j12) {
                    return -1;
                }
            }
            return 0;
        }
    }

    /* synthetic */ C26076k(AbstractC26077l abstractC26077l) {
        this();
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0063, code lost:            if (r10 != 65) goto L126;     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c0 A[Catch: Exception -> 0x00d9, TryCatch #1 {Exception -> 0x00d9, blocks: (B:23:0x00c0, B:25:0x00c4, B:28:0x00cc, B:30:0x00d2, B:33:0x00dd, B:84:0x00b7), top: B:83:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m134185B(int i11, C26071f c26071f) {
        boolean z11;
        boolean m134194N;
        boolean m134194N2;
        boolean m134212y;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17 = true;
        boolean z18 = false;
        try {
            try {
                if (i11 != 10 && i11 != 11 && i11 != 18) {
                    if (i11 != 24) {
                        if (i11 != 58) {
                            if (i11 != 60) {
                                if (i11 != 89) {
                                    if (i11 != 91 && i11 != 112) {
                                        if (i11 != 65 && i11 != 66) {
                                            if (i11 != 70 && i11 != 71) {
                                                m134194N2 = false;
                                            } else {
                                                boolean z19 = !TextUtils.isEmpty(AbstractC23309i.m122303q0());
                                                m134194N = m134194N(70, z19);
                                                m134212y = m134194N(71, z19);
                                            }
                                        } else {
                                            if (AbstractC23148n.m118834h(65, 1000) == 1) {
                                                z16 = true;
                                            } else {
                                                z16 = false;
                                            }
                                            m134194N2 = m134194N(66, z16);
                                        }
                                        z12 = true;
                                        if (c26071f != null) {
                                        }
                                    }
                                }
                            }
                            if (AbstractC23148n.m118834h(58, 1000) == 1) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            m134194N2 = m134194N(i11, z15);
                            z12 = false;
                            if (c26071f != null) {
                            }
                        } else {
                            if (AbstractC23148n.m118834h(58, 1000) == 1) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            m134194N = m134194N(91, z14) | m134194N(60, z14);
                            m134212y = m134194N(112, z14);
                        }
                        m134194N2 = m134212y | m134194N;
                        z12 = true;
                        if (c26071f != null) {
                        }
                    }
                    if (AbstractC23148n.m118834h(24, 1000) == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    m134194N2 = m134194N(89, z13);
                    if (i11 != 24) {
                        z12 = false;
                        if (c26071f != null) {
                        }
                    }
                    z12 = true;
                    if (c26071f != null) {
                    }
                } else {
                    if (AbstractC23148n.m118834h(10, 1000) == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    m134194N = m134194N(11, z11);
                    if (z11) {
                        m134212y = m134212y();
                        m134194N2 = m134212y | m134194N;
                        z12 = true;
                        if (c26071f != null && c26071f.f124227b == i11 && c26071f.m134178i() && z12) {
                            if (!AbstractC26084s.m134266n(i11) || !c26071f.m134173d()) {
                                z17 = false;
                            }
                            return m134194N2 | c26071f.m134181l(z17);
                        }
                        return m134194N2;
                    }
                    m134194N2 = m134194N(18, false) | m134194N;
                    try {
                        m134194N2 |= m134194N(19, false);
                        z12 = true;
                        return c26071f != null ? m134194N2 : m134194N2;
                    } catch (Exception e11) {
                        e = e11;
                        z18 = m134194N2;
                    }
                }
                e = e11;
                z18 = m134194N2;
            } catch (Exception e12) {
                e = e12;
            }
        } catch (Exception e13) {
            e = e13;
            z18 = 11;
        }
        AbstractC23350e.m122776f("SettingReminderManager", e);
        return z18;
    }

    /* renamed from: E */
    public boolean m134186E(JSONObject jSONObject) {
        C26078m.b m134232f;
        if (jSONObject == null) {
            return true;
        }
        try {
            int optInt = jSONObject.optInt("id_setting");
            String optString = jSONObject.optString("id_reminder");
            if (optInt < 0 || TextUtils.isEmpty(optString) || !AbstractC26084s.m134275w(jSONObject.optInt("icon_reminder_type", -1)) || !AbstractC26084s.m134276x(jSONObject.optInt("min_version_support", 1)) || (m134232f = C26078m.m134226e().m134232f(optInt)) == null) {
                return true;
            }
            C26071f m134241d = m134232f.m134241d();
            if (m134241d != null && m134241d.f124227b == optInt && !AbstractC26084s.m134246C(m134241d.f124226a, optString) && !TextUtils.isEmpty(m134241d.f124236k) && m134241d.f124236k.equals(CoreUtility.f89233i)) {
                return true;
            }
            C26071f m42210N6 = C7960e.m41971c6().m42210N6(optInt);
            if (m42210N6 != null) {
                if (!AbstractC26084s.m134246C(m42210N6.f124226a, optString)) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SettingReminderManager", e11);
            return true;
        }
    }

    /* renamed from: F */
    public /* synthetic */ void m134187F() {
        C26078m.b m134233g;
        try {
            C26078m m134226e = C26078m.m134226e();
            if (m134226e == null || (m134233g = m134226e.m134233g()) == null) {
                return;
            }
            System.currentTimeMillis();
            synchronized (this.f124249c) {
                m134190I(m134233g);
            }
            m134206n();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SettingReminderManager", e11);
        }
    }

    /* renamed from: G */
    public /* synthetic */ void m134188G() {
        C26071f m134241d;
        try {
            Collection<C26078m.b> values = C26078m.m134226e().m134234h().values();
            if (values != null && (r0 = values.iterator()) != null) {
                boolean z11 = false;
                for (C26078m.b bVar : values) {
                    if (bVar != null && bVar.m134241d() != null && (m134241d = bVar.m134241d()) != null && m134241d.m134178i() && m134241d.m134179j() && m134241d.m134177h()) {
                        synchronized (this.f124249c) {
                            m134210u(3, m134241d.f124227b, m134241d, true);
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expired: ");
                        sb2.append(m134241d);
                        if (!z11) {
                            z11 = true;
                        }
                    }
                }
                if (z11) {
                    m134217J();
                }
            }
            m134192L();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SettingReminderManager", e11);
        }
    }

    /* renamed from: H */
    private void m134189H() {
        C26078m m134226e;
        if (!TextUtils.isEmpty(CoreUtility.f89233i) && (m134226e = C26078m.m134226e()) != null && m134226e.m134228a()) {
            C0824j.m2153b(new b());
        }
    }

    /* renamed from: I */
    private C26078m.b m134190I(C26078m.b bVar) {
        C26071f c26071f = null;
        if (bVar == null) {
            return null;
        }
        if (bVar.m134243f()) {
            return bVar;
        }
        int m134242e = bVar.m134242e();
        C26071f c26071f2 = null;
        for (int i11 = 0; i11 < m134242e; i11++) {
            C26078m.b m134190I = m134190I((C26078m.b) bVar.f124270e.get(i11));
            if (m134190I != null) {
                if (m134190I.f124267b != null && m134190I.f124267b.m134171a() && (c26071f == null || this.f124248b.compare(m134190I.f124267b, c26071f) > 0)) {
                    c26071f = m134190I.f124267b;
                }
                C26071f m134241d = m134190I.m134241d();
                if (m134241d != null && m134241d.m134171a() && m134241d.m134176g() && (c26071f2 == null || this.f124248b.compare(m134241d, c26071f2) > 0)) {
                    c26071f2 = m134241d;
                }
            }
        }
        bVar.f124267b = bVar.m134241d();
        if (c26071f != null && (bVar.f124267b == null || !bVar.f124267b.m134171a() || this.f124248b.compare(c26071f, bVar.f124267b) > 0)) {
            bVar.f124267b = c26071f;
        }
        bVar.f124269d = c26071f2;
        return bVar;
    }

    /* renamed from: K */
    private void m134191K() {
        try {
            C26078m m134226e = C26078m.m134226e();
            if (m134226e != null && m134226e.m134229b() && this.f124247a != null) {
                m134226e.m134231d();
                this.f124247a.execute(this.f124251e);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SettingReminderManager", e11);
        }
    }

    /* renamed from: L */
    public void m134192L() {
        C26071f m134241d;
        try {
            Collection<C26078m.b> values = C26078m.m134226e().m134234h().values();
            if (values != null && (r0 = values.iterator()) != null) {
                long j11 = Long.MAX_VALUE;
                for (C26078m.b bVar : values) {
                    if (bVar != null && bVar.m134241d() != null && (m134241d = bVar.m134241d()) != null && m134241d.m134178i() && m134241d.m134179j()) {
                        j11 = Math.min(m134241d.m134172b(), j11);
                    }
                }
                if (j11 == Long.MAX_VALUE) {
                    j11 = 0;
                }
                AbstractC23309i.m121762bo(j11);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SettingReminderManager", e11);
        }
    }

    /* renamed from: M */
    public boolean m134193M(C26071f c26071f, boolean z11) {
        if (c26071f == null) {
            return false;
        }
        return C26078m.m134226e().m134236k(c26071f.f124227b, c26071f, z11);
    }

    /* renamed from: N */
    private boolean m134194N(int i11, boolean z11) {
        boolean z12;
        try {
            C26071f m134209t = m134209t(i11);
            if (m134209t != null && m134209t.m134178i()) {
                if (AbstractC26084s.m134266n(i11) && z11) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                return m134209t.m134181l(z12);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SettingReminderManager", e11);
        }
        return false;
    }

    /* renamed from: n */
    private void m134206n() {
        try {
            C23744a.m124114c().m124116d(6000, new Object[0]);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SettingReminderManager", e11);
        }
    }

    /* renamed from: o */
    public void m134207o() {
        ExecutorService executorService = this.f124247a;
        if (executorService != null) {
            executorService.execute(new Runnable() { // from class: s00.j
                public /* synthetic */ RunnableC26075j() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C26076k.this.m134192L();
                }
            });
        }
    }

    /* renamed from: q */
    public static C26076k m134208q() {
        return e.f124259a;
    }

    /* renamed from: t */
    private C26071f m134209t(int i11) {
        C26078m.b m134232f;
        try {
            C26078m m134226e = C26078m.m134226e();
            if (m134226e == null || (m134232f = m134226e.m134232f(i11)) == null) {
                return null;
            }
            return m134232f.m134241d();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SettingReminderManager", e11);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0078 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m134210u(int i11, int i12, C26071f c26071f, boolean z11) {
        int m118834h;
        boolean z12 = false;
        if (c26071f != null) {
            try {
                if (c26071f.m134178i()) {
                    if (c26071f.f124227b != i12) {
                        return false;
                    }
                    int m134174e = c26071f.m134174e();
                    if (m134174e != 0) {
                        if (m134174e != 1) {
                            if (z12 && z11) {
                                C0824j.m2153b(new d(c26071f));
                            }
                        }
                    } else {
                        if (i11 == 2) {
                            if (c26071f.f124230e == 1000) {
                                c26071f.m134182m(1);
                            } else {
                                m118834h = AbstractC23148n.m118834h(i12, 1000);
                                if (m118834h == c26071f.f124230e) {
                                    c26071f.m134182m(1);
                                    z12 = true;
                                }
                                if (c26071f.m134174e() == 1) {
                                    if (i11 == 2) {
                                        if (c26071f.f124233h != 1000) {
                                            if (m118834h == Integer.MIN_VALUE) {
                                                m118834h = AbstractC23148n.m118834h(i12, 1000);
                                            }
                                            if (m118834h == c26071f.f124233h) {
                                                c26071f.m134182m(2);
                                                z12 = true;
                                            }
                                        }
                                    } else {
                                        if ((i11 == 0 && c26071f.f124231f == 1) || (i11 == 1 && c26071f.f124231f == 2)) {
                                            c26071f.m134182m(2);
                                        } else if (i11 == 3 || i11 == 4) {
                                            c26071f.m134182m(2);
                                        }
                                        z12 = true;
                                    }
                                }
                                if (z12) {
                                    C0824j.m2153b(new d(c26071f));
                                }
                            }
                        } else if (i11 == 3 || i11 == 4) {
                            c26071f.m134182m(2);
                        }
                        z12 = true;
                    }
                    m118834h = Integer.MIN_VALUE;
                    if (c26071f.m134174e() == 1) {
                    }
                    if (z12) {
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("SettingReminderManager", e11);
            }
        }
        return z12;
    }

    /* renamed from: x */
    public void m134211x() {
        try {
            Collection<C26078m.b> values = C26078m.m134226e().m134234h().values();
            if (values != null && (r0 = values.iterator()) != null) {
                for (C26078m.b bVar : values) {
                    if (bVar != null) {
                        m134185B(bVar.f124266a, bVar.m134241d());
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SettingReminderManager", e11);
        }
    }

    /* renamed from: y */
    private boolean m134212y() {
        boolean z11;
        boolean m134194N;
        boolean z12 = false;
        try {
            if (AbstractC23148n.m118834h(11, 1000) == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = m134194N(18, z11);
            if (z11) {
                m134194N = m134213z();
            } else {
                m134194N = m134194N(19, z11);
            }
            return m134194N | z12;
        } catch (Exception e11) {
            e11.printStackTrace();
            return z12;
        }
    }

    /* renamed from: z */
    private boolean m134213z() {
        boolean z11 = true;
        if (AbstractC23148n.m118834h(18, 1000) != 1) {
            z11 = false;
        }
        return m134194N(19, z11);
    }

    /* renamed from: A */
    public boolean m134214A(int i11) {
        boolean m134185B;
        try {
            if (!this.f124250d.get()) {
                return false;
            }
            synchronized (this.f124249c) {
                m134185B = m134185B(i11, m134209t(i11));
            }
            return m134185B;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SettingReminderManager", e11);
            return false;
        }
    }

    /* renamed from: C */
    public void m134215C() {
        try {
            C26078m.m134226e();
            m134189H();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SettingReminderManager", e11);
        }
    }

    /* renamed from: D */
    public void m134216D(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() != 0) {
            try {
                C0824j.m2153b(new a(jSONArray));
            } catch (Exception e11) {
                AbstractC23350e.m122776f("SettingReminderManager", e11);
            }
        }
    }

    /* renamed from: J */
    public void m134217J() {
        C26078m.m134226e().m134235i();
        m134191K();
    }

    /* renamed from: l */
    public void m134218l() {
        ExecutorService executorService;
        try {
            if (TextUtils.isEmpty(CoreUtility.f89233i) || !this.f124250d.get()) {
                return;
            }
            C26078m m134226e = C26078m.m134226e();
            if (m134226e.f124261b && m134226e.f124263d) {
                long m121703a4 = AbstractC23309i.m121703a4();
                if (m121703a4 != 0 && SystemClock.elapsedRealtime() >= m121703a4 && (executorService = this.f124247a) != null) {
                    executorService.execute(this.f124252f);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SettingReminderManager", e11);
        }
    }

    /* renamed from: m */
    public void m134219m() {
        C0824j.m2153b(new c());
    }

    /* renamed from: p */
    public ExecutorService m134220p() {
        return this.f124247a;
    }

    /* renamed from: r */
    public C26071f m134221r(int i11) {
        C26078m m134226e;
        C26078m.b m134232f;
        try {
            if (!this.f124250d.get() || (m134226e = C26078m.m134226e()) == null || (m134232f = m134226e.m134232f(i11)) == null) {
                return null;
            }
            return m134232f.f124267b;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SettingReminderManager", e11);
        }
        return null;
    }

    /* renamed from: s */
    public C26071f m134222s(int i11) {
        C26078m m134226e;
        C26078m.b m134232f;
        try {
            if (!this.f124250d.get() || (m134226e = C26078m.m134226e()) == null || (m134232f = m134226e.m134232f(i11)) == null) {
                return null;
            }
            return m134232f.f124269d;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SettingReminderManager", e11);
        }
        return null;
    }

    /* renamed from: v */
    public boolean m134223v(int i11, int i12) {
        try {
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SettingReminderManager", e11);
        }
        if (!this.f124250d.get()) {
            return false;
        }
        synchronized (this.f124249c) {
            try {
                C26071f m134209t = m134209t(i12);
                if (m134209t == null) {
                    return false;
                }
                return m134210u(i11, i12, m134209t, true);
            } finally {
            }
        }
    }

    /* renamed from: w */
    public void m134224w() {
        try {
            synchronized (this.f124249c) {
                C26078m.m134226e().m134230c();
            }
            C26078m.m134226e().f124263d = false;
            this.f124250d.set(false);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SettingReminderManager", e11);
        }
    }

    private C26076k() {
        this.f124249c = new Object();
        this.f124250d = new AtomicBoolean(false);
        this.f124251e = new Runnable() { // from class: s00.h
            public /* synthetic */ RunnableC26073h() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C26076k.this.m134187F();
            }
        };
        this.f124252f = new Runnable() { // from class: s00.i
            public /* synthetic */ RunnableC26074i() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C26076k.this.m134188G();
            }
        };
        this.f124247a = Executors.newSingleThreadExecutor(new ThreadFactoryC18928a("SettingReminder"));
        this.f124248b = new f();
    }
}
