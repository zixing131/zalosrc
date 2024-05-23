package androidx.work.impl;

import android.text.TextUtils;
import androidx.work.AbstractC2145f0;
import androidx.work.AbstractC2241j0;
import androidx.work.AbstractC2253u;
import androidx.work.EnumC2242k;
import androidx.work.InterfaceC2257y;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p565v2.RunnableC27444c;

/* renamed from: androidx.work.impl.c0 */
/* loaded from: classes.dex */
public class C2184c0 extends AbstractC2145f0 {

    /* renamed from: j */
    private static final String f9233j = AbstractC2253u.m11897i("WorkContinuationImpl");

    /* renamed from: a */
    private final C2221r0 f9234a;

    /* renamed from: b */
    private final String f9235b;

    /* renamed from: c */
    private final EnumC2242k f9236c;

    /* renamed from: d */
    private final List f9237d;

    /* renamed from: e */
    private final List f9238e;

    /* renamed from: f */
    private final List f9239f;

    /* renamed from: g */
    private final List f9240g;

    /* renamed from: h */
    private boolean f9241h;

    /* renamed from: i */
    private InterfaceC2257y f9242i;

    public C2184c0(C2221r0 c2221r0, List list) {
        this(c2221r0, null, EnumC2242k.KEEP, list, null);
    }

    /* renamed from: i */
    private static boolean m11671i(C2184c0 c2184c0, Set set) {
        set.addAll(c2184c0.m11675c());
        Set m11672l = m11672l(c2184c0);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (m11672l.contains((String) it.next())) {
                return true;
            }
        }
        List m11677e = c2184c0.m11677e();
        if (m11677e != null && !m11677e.isEmpty()) {
            Iterator it2 = m11677e.iterator();
            while (it2.hasNext()) {
                if (m11671i((C2184c0) it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(c2184c0.m11675c());
        return false;
    }

    /* renamed from: l */
    public static Set m11672l(C2184c0 c2184c0) {
        HashSet hashSet = new HashSet();
        List m11677e = c2184c0.m11677e();
        if (m11677e != null && !m11677e.isEmpty()) {
            Iterator it = m11677e.iterator();
            while (it.hasNext()) {
                hashSet.addAll(((C2184c0) it.next()).m11675c());
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public InterfaceC2257y m11673a() {
        if (!this.f9241h) {
            RunnableC27444c runnableC27444c = new RunnableC27444c(this);
            this.f9234a.m11741x().mo143752d(runnableC27444c);
            this.f9242i = runnableC27444c.m140479d();
        } else {
            AbstractC2253u.m11895e().mo11905k(f9233j, "Already enqueued work ids (" + TextUtils.join(", ", this.f9238e) + ")");
        }
        return this.f9242i;
    }

    /* renamed from: b */
    public EnumC2242k m11674b() {
        return this.f9236c;
    }

    /* renamed from: c */
    public List m11675c() {
        return this.f9238e;
    }

    /* renamed from: d */
    public String m11676d() {
        return this.f9235b;
    }

    /* renamed from: e */
    public List m11677e() {
        return this.f9240g;
    }

    /* renamed from: f */
    public List m11678f() {
        return this.f9237d;
    }

    /* renamed from: g */
    public C2221r0 m11679g() {
        return this.f9234a;
    }

    /* renamed from: h */
    public boolean m11680h() {
        return m11671i(this, new HashSet());
    }

    /* renamed from: j */
    public boolean m11681j() {
        return this.f9241h;
    }

    /* renamed from: k */
    public void m11682k() {
        this.f9241h = true;
    }

    public C2184c0(C2221r0 c2221r0, String str, EnumC2242k enumC2242k, List list) {
        this(c2221r0, str, enumC2242k, list, null);
    }

    public C2184c0(C2221r0 c2221r0, String str, EnumC2242k enumC2242k, List list, List list2) {
        this.f9234a = c2221r0;
        this.f9235b = str;
        this.f9236c = enumC2242k;
        this.f9237d = list;
        this.f9240g = list2;
        this.f9238e = new ArrayList(list.size());
        this.f9239f = new ArrayList();
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                this.f9239f.addAll(((C2184c0) it.next()).f9239f);
            }
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (enumC2242k == EnumC2242k.REPLACE && ((AbstractC2241j0) list.get(i11)).m11861d().m138976g() != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String m11859b = ((AbstractC2241j0) list.get(i11)).m11859b();
            this.f9238e.add(m11859b);
            this.f9239f.add(m11859b);
        }
    }
}
