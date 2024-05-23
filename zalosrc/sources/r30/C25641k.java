package r30;

import ag0.C0824j;
import am.AbstractC0906d0;
import am.AbstractC0939u;
import android.text.TextUtils;
import au.AbstractC2347g;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalocore.CoreUtility;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import me0.AbstractC23034c6;
import me0.AbstractC23057e7;
import me0.AbstractC23088h5;
import o70.C24099q0;
import org.json.JSONArray;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p716zh.C31874cb;

/* renamed from: r30.k */
/* loaded from: classes5.dex */
public class C25641k {

    /* renamed from: a */
    private final C25642l f122593a = new C25642l();

    /* renamed from: b */
    private final C25642l f122594b = new C25642l();

    /* renamed from: c */
    private final AtomicBoolean f122595c = new AtomicBoolean(false);

    /* renamed from: d */
    private final AtomicBoolean f122596d = new AtomicBoolean(false);

    /* renamed from: e */
    private long f122597e = 604800000;

    /* renamed from: f */
    private volatile long f122598f = 259200000;

    /* renamed from: g */
    private final AtomicLong f122599g = new AtomicLong(0);

    /* renamed from: h */
    private final Object f122600h = new Object();

    /* renamed from: i */
    private final Object f122601i = new Object();

    /* renamed from: j */
    private final AtomicLong f122602j = new AtomicLong(0);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r30.k$a */
    /* loaded from: classes5.dex */
    public class a extends AbstractC0939u {
        a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x005d A[Catch: all -> 0x007a, Exception -> 0x007c, TryCatch #0 {Exception -> 0x007c, blocks: (B:3:0x0002, B:7:0x004b, B:8:0x0057, B:10:0x005d, B:13:0x006d, B:21:0x007e, B:17:0x0088, B:30:0x0042), top: B:2:0x0002, outer: #1 }] */
        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo928a() {
            boolean z11;
            try {
                try {
                    C25641k.this.f122594b.clear();
                    C25641k.this.f122593a.clear();
                    C25641k.this.f122599g.set(0L);
                    C25641k.this.m132508y();
                    C25641k.this.f122594b.addAll(C7960e.m41971c6().m42276T9(0));
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                if (AbstractC23034c6.m118167n(MainApplication.getAppContext(), AbstractC23034c6.f112032i) == 0 && AbstractC23057e7.m118297d()) {
                    z11 = false;
                    for (C31874cb c31874cb : C7960e.m41971c6().m42276T9(1)) {
                        if (!TextUtils.isEmpty(c31874cb.f146394j) && (z11 || !AbstractC0906d0.m2796b(MainApplication.getAppContext(), c31874cb.f146394j))) {
                            C25637g.m132489q().m132468m(c31874cb.f146385a);
                        }
                        C25641k.this.f122593a.add(c31874cb);
                    }
                    C25641k.this.f122595c.set(false);
                    C25641k.this.f122596d.set(true);
                }
                z11 = true;
                while (r3.hasNext()) {
                }
                C25641k.this.f122595c.set(false);
                C25641k.this.f122596d.set(true);
            } catch (Throwable th2) {
                C25641k.this.f122595c.set(false);
                C25641k.this.f122596d.set(true);
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r30.k$b */
    /* loaded from: classes5.dex */
    public class b extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C31874cb f122604a;

        b(C31874cb c31874cb) {
            this.f122604a = c31874cb;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42515r(this.f122604a, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r30.k$c */
    /* loaded from: classes5.dex */
    public class c extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f122606a;

        c(String str) {
            this.f122606a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42156Ic(this.f122606a, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r30.k$d */
    /* loaded from: classes5.dex */
    public class d extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C31874cb f122608a;

        d(C31874cb c31874cb) {
            this.f122608a = c31874cb;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42515r(this.f122608a, 0);
        }
    }

    /* renamed from: r30.k$e */
    /* loaded from: classes5.dex */
    class e extends AbstractC0939u {
        e() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42148I0(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r30.k$f */
    /* loaded from: classes5.dex */
    public class f extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f122611a;

        f(String str) {
            this.f122611a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42156Ic(this.f122611a, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r30.k$g */
    /* loaded from: classes5.dex */
    public static final class g {

        /* renamed from: a */
        static final C25641k f122613a = new C25641k();
    }

    /* renamed from: m */
    private void m132504m() {
        if (this.f122596d.get() || this.f122595c.get()) {
            return;
        }
        try {
            this.f122595c.set(true);
            C25637g.m132489q().m132464h();
            C25639i.m132496q().m132464h();
            AbstractC23088h5.m118426g();
            C0824j.m2153b(new a());
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f122595c.set(false);
        }
    }

    /* renamed from: n */
    private static ArrayList m132505n(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            if (length > 0) {
                for (int i11 = 0; i11 < length; i11++) {
                    try {
                        arrayList.add(new C31874cb(jSONArray.getJSONObject(i11)));
                    } catch (Exception e11) {
                        AbstractC20110a.m104539h(e11);
                    }
                }
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: o */
    public static C25641k m132506o() {
        return g.f122613a;
    }

    /* renamed from: x */
    private boolean m132507x() {
        return this.f122598f > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public void m132508y() {
        Long l11;
        String m121745b8 = AbstractC23309i.m121745b8(MainApplication.getAppContext());
        if (!TextUtils.isEmpty(m121745b8)) {
            ArrayList m132505n = m132505n(m121745b8);
            if (!m132505n.isEmpty()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = AbstractC25638h.m132492b().iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (!TextUtils.isEmpty(str) && str.contains("_")) {
                        String[] split = TextUtils.split(str, "_");
                        linkedHashMap.put(split[0], Long.valueOf(AbstractC2347g.m12316b(split[1], System.currentTimeMillis())));
                    }
                }
                Iterator it2 = m132505n.iterator();
                while (it2.hasNext()) {
                    C31874cb c31874cb = (C31874cb) it2.next();
                    if (c31874cb.f146383E <= 0) {
                        if (linkedHashMap.containsKey(c31874cb.f146385a) && (l11 = (Long) linkedHashMap.get(c31874cb.f146385a)) != null) {
                            c31874cb.f146383E = l11.longValue();
                        } else {
                            c31874cb.f146383E = System.currentTimeMillis();
                        }
                    }
                    if (c31874cb.f146399o == 2) {
                        m132514g(c31874cb);
                    } else {
                        m132515h(c31874cb);
                    }
                }
            }
            AbstractC23309i.m120839Cs(MainApplication.getAppContext(), "");
        }
    }

    /* renamed from: A */
    public void m132509A() {
        this.f122597e = AbstractC23309i.m121378Rc();
        this.f122598f = AbstractC23309i.m121341Qc();
        m132504m();
    }

    /* renamed from: B */
    public void m132510B(String str) {
        synchronized (this.f122601i) {
            this.f122594b.m132534m(str);
        }
        C25639i.m132496q().m132467l(str);
        C0824j.m2153b(new f(str));
    }

    /* renamed from: C */
    public void m132511C(String str) {
        synchronized (this.f122600h) {
            this.f122593a.m132534m(str);
        }
        AbstractC25636f.m132488r(str);
        C0824j.m2153b(new c(str));
    }

    /* renamed from: D */
    public void m132512D(long j11) {
        if (this.f122602j.get() == 0 || this.f122602j.get() > j11) {
            this.f122602j.set(j11);
        }
    }

    /* renamed from: E */
    public void m132513E(long j11) {
        if (this.f122599g.get() == 0 || j11 < this.f122599g.get()) {
            this.f122599g.set(j11);
        }
    }

    /* renamed from: g */
    public void m132514g(C31874cb c31874cb) {
        m132511C(c31874cb.f146385a);
        synchronized (this.f122601i) {
            this.f122594b.m132534m(c31874cb.f146385a);
            this.f122594b.add(c31874cb);
        }
        C0824j.m2153b(new d(c31874cb));
        C25639i.m132496q().m132466k(c31874cb.f146385a);
        m132513E(c31874cb.f146383E);
    }

    /* renamed from: h */
    public void m132515h(C31874cb c31874cb) {
        synchronized (this.f122600h) {
            this.f122593a.add(c31874cb);
        }
        C0824j.m2153b(new b(c31874cb));
        C25637g.m132489q().m132466k(c31874cb.f146385a);
        m132512D(c31874cb.f146383E);
    }

    /* renamed from: i */
    public void m132516i() {
        try {
            if (this.f122596d.get() && !TextUtils.isEmpty(CoreUtility.f89233i) && !AbstractC23304d.f113427q1.get() && m132507x() && !this.f122594b.isEmpty()) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.f122599g.get() < this.f122598f) {
                    return;
                }
                List<C31874cb> m132519l = m132519l();
                if (m132519l.isEmpty()) {
                    return;
                }
                this.f122599g.set(Long.MAX_VALUE);
                boolean z11 = false;
                for (C31874cb c31874cb : m132519l) {
                    if (c31874cb != null) {
                        long j11 = c31874cb.f146383E;
                        if (j11 != 0) {
                            if (currentTimeMillis - j11 >= this.f122598f) {
                                m132510B(c31874cb.f146385a);
                                z11 = true;
                            } else {
                                m132513E(c31874cb.f146383E);
                            }
                        }
                    }
                }
                if (z11) {
                    AbstractC23088h5.m118431l();
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: j */
    public void m132517j() {
        try {
            if (!this.f122596d.get() || TextUtils.isEmpty(CoreUtility.f89233i) || AbstractC23304d.f113427q1.get()) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (!m132528z(currentTimeMillis)) {
                return;
            }
            this.f122602j.set(Long.MAX_VALUE);
            synchronized (this.f122600h) {
                try {
                    if (this.f122593a.isEmpty()) {
                        return;
                    }
                    for (C31874cb c31874cb : new ArrayList(this.f122593a)) {
                        long j11 = c31874cb.f146383E;
                        if (currentTimeMillis - j11 >= this.f122597e) {
                            if (!C25637g.m132489q().m132460d(c31874cb.f146385a)) {
                                m132511C(c31874cb.f146385a);
                            } else {
                                m132512D(c31874cb.f146383E);
                            }
                        } else {
                            m132512D(j11);
                        }
                    }
                } finally {
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: k */
    public void m132518k() {
        synchronized (this.f122601i) {
            this.f122594b.clear();
        }
        C25639i.m132496q().m132459c();
        C0824j.m2153b(new e());
        this.f122599g.set(0L);
    }

    /* renamed from: l */
    public List m132519l() {
        ArrayList arrayList;
        synchronized (this.f122601i) {
            arrayList = new ArrayList(this.f122594b);
        }
        return arrayList;
    }

    /* renamed from: p */
    public C31874cb m132520p(String str) {
        return this.f122594b.m132532j(str);
    }

    /* renamed from: q */
    public C31874cb m132521q(String str) {
        return this.f122593a.m132532j(str);
    }

    /* renamed from: r */
    public C25642l m132522r() {
        return m132523s();
    }

    /* renamed from: s */
    public C25642l m132523s() {
        C25642l c25642l;
        synchronized (this.f122600h) {
            c25642l = this.f122593a;
        }
        return c25642l;
    }

    /* renamed from: t */
    public int m132524t() {
        return C25639i.m132496q().m132463g() + C25637g.m132489q().m132463g();
    }

    /* renamed from: u */
    public int m132525u() {
        if (MainTabView.m67645lM() != null && MainTabView.m67645lM().m67696kM() == C24099q0.m125958k().m125972p()) {
            return 0;
        }
        return C25639i.m132496q().m132463g();
    }

    /* renamed from: v */
    public void m132526v() {
        this.f122596d.set(false);
    }

    /* renamed from: w */
    public boolean m132527w(String str) {
        boolean m132531g;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        synchronized (this.f122601i) {
            m132531g = this.f122594b.m132531g(str);
        }
        return m132531g;
    }

    /* renamed from: z */
    public boolean m132528z(long j11) {
        if (j11 - this.f122602j.get() > this.f122597e) {
            return true;
        }
        return false;
    }
}
