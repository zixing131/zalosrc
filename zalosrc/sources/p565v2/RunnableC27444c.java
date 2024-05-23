package p565v2;

import android.text.TextUtils;
import androidx.work.AbstractC2241j0;
import androidx.work.AbstractC2253u;
import androidx.work.C2149h0;
import androidx.work.EnumC2242k;
import androidx.work.InterfaceC2257y;
import androidx.work.impl.AbstractC2239z;
import androidx.work.impl.C2184c0;
import androidx.work.impl.C2218q;
import androidx.work.impl.C2221r0;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p535u2.C26949a;
import p535u2.C26968o;
import p535u2.C26976w;
import p535u2.InterfaceC26951b;
import p535u2.InterfaceC26977x;

/* renamed from: v2.c */
/* loaded from: classes.dex */
public class RunnableC27444c implements Runnable {

    /* renamed from: r */
    private static final String f129149r = AbstractC2253u.m11897i("EnqueueRunnable");

    /* renamed from: p */
    private final C2184c0 f129150p;

    /* renamed from: q */
    private final C2218q f129151q;

    public RunnableC27444c(C2184c0 c2184c0) {
        this(c2184c0, new C2218q());
    }

    /* renamed from: b */
    private static boolean m140475b(C2184c0 c2184c0) {
        boolean m140476c = m140476c(c2184c0.m11679g(), c2184c0.m11678f(), (String[]) C2184c0.m11672l(c2184c0).toArray(new String[0]), c2184c0.m11676d(), c2184c0.m11674b());
        c2184c0.m11682k();
        return m140476c;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0163  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean m140476c(C2221r0 c2221r0, List list, String[] strArr, String str, EnumC2242k enumC2242k) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        Iterator it;
        InterfaceC26951b interfaceC26951b;
        boolean z15;
        boolean z16;
        String[] strArr2 = strArr;
        long mo11468a = c2221r0.m11735p().m11470a().mo11468a();
        WorkDatabase m11740w = c2221r0.m11740w();
        boolean z17 = true;
        if (strArr2 != null && strArr2.length > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            z12 = true;
            z13 = false;
            z14 = false;
            for (String str2 : strArr2) {
                C26976w mo139008j = m11740w.mo11565L().mo139008j(str2);
                if (mo139008j == null) {
                    AbstractC2253u.m11895e().mo11900c(f129149r, "Prerequisite " + str2 + " doesn't exist; not enqueuing");
                    return false;
                }
                C2149h0.c cVar = mo139008j.f127498b;
                if (cVar == C2149h0.c.SUCCEEDED) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z12 &= z16;
                if (cVar == C2149h0.c.FAILED) {
                    z14 = true;
                } else if (cVar == C2149h0.c.CANCELLED) {
                    z13 = true;
                }
            }
        } else {
            z12 = true;
            z13 = false;
            z14 = false;
        }
        boolean z18 = !TextUtils.isEmpty(str);
        if (z18 && !z11) {
            List<C26976w.b> mo139016r = m11740w.mo11565L().mo139016r(str);
            if (!mo139016r.isEmpty()) {
                if (enumC2242k != EnumC2242k.APPEND && enumC2242k != EnumC2242k.APPEND_OR_REPLACE) {
                    if (enumC2242k == EnumC2242k.KEEP) {
                        Iterator it2 = mo139016r.iterator();
                        while (it2.hasNext()) {
                            C2149h0.c cVar2 = ((C26976w.b) it2.next()).f127521b;
                            if (cVar2 == C2149h0.c.ENQUEUED || cVar2 == C2149h0.c.RUNNING) {
                                return false;
                            }
                        }
                    }
                    AbstractRunnableC27442b.m140467c(str, c2221r0, false).run();
                    InterfaceC26977x mo11565L = m11740w.mo11565L();
                    Iterator it3 = mo139016r.iterator();
                    while (it3.hasNext()) {
                        mo11565L.mo139000b(((C26976w.b) it3.next()).f127520a);
                    }
                    it = list.iterator();
                    while (it.hasNext()) {
                    }
                    return z17;
                }
                InterfaceC26951b mo11560G = m11740w.mo11560G();
                List arrayList = new ArrayList();
                for (C26976w.b bVar : mo139016r) {
                    if (!mo11560G.mo138908d(bVar.f127520a)) {
                        C2149h0.c cVar3 = bVar.f127521b;
                        interfaceC26951b = mo11560G;
                        if (cVar3 == C2149h0.c.SUCCEEDED) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        boolean z19 = z15 & z12;
                        if (cVar3 == C2149h0.c.FAILED) {
                            z14 = true;
                        } else if (cVar3 == C2149h0.c.CANCELLED) {
                            z13 = true;
                        }
                        arrayList.add(bVar.f127520a);
                        z12 = z19;
                    } else {
                        interfaceC26951b = mo11560G;
                    }
                    mo11560G = interfaceC26951b;
                }
                if (enumC2242k == EnumC2242k.APPEND_OR_REPLACE && (z13 || z14)) {
                    InterfaceC26977x mo11565L2 = m11740w.mo11565L();
                    Iterator it4 = mo11565L2.mo139016r(str).iterator();
                    while (it4.hasNext()) {
                        mo11565L2.mo139000b(((C26976w.b) it4.next()).f127520a);
                    }
                    arrayList = Collections.emptyList();
                    z13 = false;
                    z14 = false;
                }
                strArr2 = (String[]) arrayList.toArray(strArr2);
                if (strArr2.length > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z17 = false;
                it = list.iterator();
                while (it.hasNext()) {
                    AbstractC2241j0 abstractC2241j0 = (AbstractC2241j0) it.next();
                    C26976w m11861d = abstractC2241j0.m11861d();
                    if (z11 && !z12) {
                        if (z14) {
                            m11861d.f127498b = C2149h0.c.FAILED;
                        } else if (z13) {
                            m11861d.f127498b = C2149h0.c.CANCELLED;
                        } else {
                            m11861d.f127498b = C2149h0.c.BLOCKED;
                        }
                    } else {
                        m11861d.f127510n = mo11468a;
                    }
                    Iterator it5 = it;
                    if (m11861d.f127498b == C2149h0.c.ENQUEUED) {
                        z17 = true;
                    }
                    m11740w.mo11565L().mo139004f(AbstractC27446d.m140484d(c2221r0.m11738u(), m11861d));
                    if (z11) {
                        int length = strArr2.length;
                        int i11 = 0;
                        while (i11 < length) {
                            m11740w.mo11560G().mo138907c(new C26949a(abstractC2241j0.m11859b(), strArr2[i11]));
                            i11++;
                            length = length;
                            strArr2 = strArr2;
                        }
                    }
                    String[] strArr3 = strArr2;
                    m11740w.mo11566M().mo138916d(abstractC2241j0.m11859b(), abstractC2241j0.m11860c());
                    if (z18) {
                        m11740w.mo11563J().mo138959b(new C26968o(str, abstractC2241j0.m11859b()));
                    }
                    it = it5;
                    strArr2 = strArr3;
                }
                return z17;
            }
        }
        z17 = false;
        it = list.iterator();
        while (it.hasNext()) {
        }
        return z17;
    }

    /* renamed from: e */
    private static boolean m140477e(C2184c0 c2184c0) {
        List<C2184c0> m11677e = c2184c0.m11677e();
        boolean z11 = false;
        if (m11677e != null) {
            for (C2184c0 c2184c02 : m11677e) {
                if (!c2184c02.m11681j()) {
                    z11 |= m140477e(c2184c02);
                } else {
                    AbstractC2253u.m11895e().mo11905k(f129149r, "Already enqueued work ids (" + TextUtils.join(", ", c2184c02.m11675c()) + ")");
                }
            }
        }
        return m140475b(c2184c0) | z11;
    }

    /* renamed from: a */
    public boolean m140478a() {
        C2221r0 m11679g = this.f129150p.m11679g();
        WorkDatabase m11740w = m11679g.m11740w();
        m11740w.m342e();
        try {
            AbstractC27446d.m140481a(m11740w, m11679g.m11735p(), this.f129150p);
            boolean m140477e = m140477e(this.f129150p);
            m11740w.m339E();
            return m140477e;
        } finally {
            m11740w.m347j();
        }
    }

    /* renamed from: d */
    public InterfaceC2257y m140479d() {
        return this.f129151q;
    }

    /* renamed from: f */
    public void m140480f() {
        C2221r0 m11679g = this.f129150p.m11679g();
        AbstractC2239z.m11855h(m11679g.m11735p(), m11679g.m11740w(), m11679g.m11738u());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (!this.f129150p.m11680h()) {
                if (m140478a()) {
                    AbstractC27465s.m140515c(this.f129150p.m11679g().m11734o(), RescheduleReceiver.class, true);
                    m140480f();
                }
                this.f129151q.m11725a(InterfaceC2257y.f9481a);
                return;
            }
            throw new IllegalStateException("WorkContinuation has cycles (" + this.f129150p + ")");
        } catch (Throwable th2) {
            this.f129151q.m11725a(new InterfaceC2257y.b.a(th2));
        }
    }

    public RunnableC27444c(C2184c0 c2184c0, C2218q c2218q) {
        this.f129150p = c2184c0;
        this.f129151q = c2218q;
    }
}
