package p435q2;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.AbstractC2253u;
import androidx.work.C2138c;
import androidx.work.C2149h0;
import androidx.work.InterfaceC2141d0;
import androidx.work.impl.C2155a0;
import androidx.work.impl.C2157b0;
import androidx.work.impl.C2226u;
import androidx.work.impl.InterfaceC2189f;
import androidx.work.impl.InterfaceC2215o0;
import androidx.work.impl.InterfaceC2233w;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlinx.coroutines.Job;
import p470r2.AbstractC25616b;
import p470r2.AbstractC25620f;
import p470r2.C25619e;
import p470r2.InterfaceC25618d;
import p515t2.C26463n;
import p535u2.AbstractC26979z;
import p535u2.C26967n;
import p535u2.C26976w;
import p565v2.AbstractC27467u;
import p595w2.InterfaceC28696c;

/* renamed from: q2.b */
/* loaded from: classes.dex */
public class C25075b implements InterfaceC2233w, InterfaceC25618d, InterfaceC2189f {

    /* renamed from: D */
    private static final String f120455D = AbstractC2253u.m11897i("GreedyScheduler");

    /* renamed from: A */
    private final C25619e f120456A;

    /* renamed from: B */
    private final InterfaceC28696c f120457B;

    /* renamed from: C */
    private final C25077d f120458C;

    /* renamed from: p */
    private final Context f120459p;

    /* renamed from: r */
    private C25074a f120461r;

    /* renamed from: s */
    private boolean f120462s;

    /* renamed from: v */
    private final C2226u f120465v;

    /* renamed from: w */
    private final InterfaceC2215o0 f120466w;

    /* renamed from: x */
    private final C2138c f120467x;

    /* renamed from: z */
    Boolean f120469z;

    /* renamed from: q */
    private final Map f120460q = new HashMap();

    /* renamed from: t */
    private final Object f120463t = new Object();

    /* renamed from: u */
    private final C2157b0 f120464u = new C2157b0();

    /* renamed from: y */
    private final Map f120468y = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q2.b$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        final int f120470a;

        /* renamed from: b */
        final long f120471b;

        private b(int i11, long j11) {
            this.f120470a = i11;
            this.f120471b = j11;
        }
    }

    public C25075b(Context context, C2138c c2138c, C26463n c26463n, C2226u c2226u, InterfaceC2215o0 interfaceC2215o0, InterfaceC28696c interfaceC28696c) {
        this.f120459p = context;
        InterfaceC2141d0 m11480k = c2138c.m11480k();
        this.f120461r = new C25074a(this, m11480k, c2138c.m11470a());
        this.f120458C = new C25077d(m11480k, interfaceC2215o0);
        this.f120457B = interfaceC28696c;
        this.f120456A = new C25619e(c26463n);
        this.f120467x = c2138c;
        this.f120465v = c2226u;
        this.f120466w = interfaceC2215o0;
    }

    /* renamed from: f */
    private void m129991f() {
        this.f120469z = Boolean.valueOf(AbstractC27467u.m140522b(this.f120459p, this.f120467x));
    }

    /* renamed from: g */
    private void m129992g() {
        if (!this.f120462s) {
            this.f120465v.m11764e(this);
            this.f120462s = true;
        }
    }

    /* renamed from: h */
    private void m129993h(C26967n c26967n) {
        Job job;
        synchronized (this.f120463t) {
            job = (Job) this.f120460q.remove(c26967n);
        }
        if (job != null) {
            AbstractC2253u.m11895e().mo11898a(f120455D, "Stopping tracking for " + c26967n);
            job.mo112734a(null);
        }
    }

    /* renamed from: i */
    private long m129994i(C26976w c26976w) {
        long max;
        synchronized (this.f120463t) {
            try {
                C26967n m139035a = AbstractC26979z.m139035a(c26976w);
                b bVar = (b) this.f120468y.get(m139035a);
                if (bVar == null) {
                    bVar = new b(c26976w.f127507k, this.f120467x.m11470a().mo11468a());
                    this.f120468y.put(m139035a, bVar);
                }
                max = bVar.f120471b + (Math.max((c26976w.f127507k - bVar.f120470a) - 5, 0) * 30000);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return max;
    }

    @Override // androidx.work.impl.InterfaceC2233w
    /* renamed from: a */
    public void mo11640a(String str) {
        if (this.f120469z == null) {
            m129991f();
        }
        if (!this.f120469z.booleanValue()) {
            AbstractC2253u.m11895e().mo11902f(f120455D, "Ignoring schedule request in non-main process");
            return;
        }
        m129992g();
        AbstractC2253u.m11895e().mo11898a(f120455D, "Cancelling work ID " + str);
        C25074a c25074a = this.f120461r;
        if (c25074a != null) {
            c25074a.m129990b(str);
        }
        for (C2155a0 c2155a0 : this.f120464u.m11586c(str)) {
            this.f120458C.m129997b(c2155a0);
            this.f120466w.mo11724e(c2155a0);
        }
    }

    @Override // p470r2.InterfaceC25618d
    /* renamed from: b */
    public void mo11624b(C26976w c26976w, AbstractC25616b abstractC25616b) {
        C26967n m139035a = AbstractC26979z.m139035a(c26976w);
        if (abstractC25616b instanceof AbstractC25616b.a) {
            if (!this.f120464u.m11584a(m139035a)) {
                AbstractC2253u.m11895e().mo11898a(f120455D, "Constraints met: Scheduling work ID " + m139035a);
                C2155a0 m11587d = this.f120464u.m11587d(m139035a);
                this.f120458C.m129998c(m11587d);
                this.f120466w.mo11722c(m11587d);
                return;
            }
            return;
        }
        AbstractC2253u.m11895e().mo11898a(f120455D, "Constraints not met: Cancelling work ID " + m139035a);
        C2155a0 m11585b = this.f120464u.m11585b(m139035a);
        if (m11585b != null) {
            this.f120458C.m129997b(m11585b);
            this.f120466w.mo11721b(m11585b, ((AbstractC25616b.b) abstractC25616b).m132299a());
        }
    }

    @Override // androidx.work.impl.InterfaceC2233w
    /* renamed from: c */
    public boolean mo11641c() {
        return false;
    }

    @Override // androidx.work.impl.InterfaceC2233w
    /* renamed from: d */
    public void mo11642d(C26976w... c26976wArr) {
        if (this.f120469z == null) {
            m129991f();
        }
        if (!this.f120469z.booleanValue()) {
            AbstractC2253u.m11895e().mo11902f(f120455D, "Ignoring schedule request in a secondary process");
            return;
        }
        m129992g();
        HashSet<C26976w> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C26976w c26976w : c26976wArr) {
            if (!this.f120464u.m11584a(AbstractC26979z.m139035a(c26976w))) {
                long max = Math.max(c26976w.m138973c(), m129994i(c26976w));
                long mo11468a = this.f120467x.m11470a().mo11468a();
                if (c26976w.f127498b == C2149h0.c.ENQUEUED) {
                    if (mo11468a < max) {
                        C25074a c25074a = this.f120461r;
                        if (c25074a != null) {
                            c25074a.m129989a(c26976w, max);
                        }
                    } else if (c26976w.m138980k()) {
                        int i11 = Build.VERSION.SDK_INT;
                        if (i11 >= 23 && c26976w.f127506j.m11511h()) {
                            AbstractC2253u.m11895e().mo11898a(f120455D, "Ignoring " + c26976w + ". Requires device idle.");
                        } else if (i11 >= 24 && c26976w.f127506j.m11508e()) {
                            AbstractC2253u.m11895e().mo11898a(f120455D, "Ignoring " + c26976w + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(c26976w);
                            hashSet2.add(c26976w.f127497a);
                        }
                    } else if (!this.f120464u.m11584a(AbstractC26979z.m139035a(c26976w))) {
                        AbstractC2253u.m11895e().mo11898a(f120455D, "Starting work for " + c26976w.f127497a);
                        C2155a0 m11588e = this.f120464u.m11588e(c26976w);
                        this.f120458C.m129998c(m11588e);
                        this.f120466w.mo11722c(m11588e);
                    }
                }
            }
        }
        synchronized (this.f120463t) {
            try {
                if (!hashSet.isEmpty()) {
                    AbstractC2253u.m11895e().mo11898a(f120455D, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    for (C26976w c26976w2 : hashSet) {
                        C26967n m139035a = AbstractC26979z.m139035a(c26976w2);
                        if (!this.f120460q.containsKey(m139035a)) {
                            this.f120460q.put(m139035a, AbstractC25620f.m132310b(this.f120456A, c26976w2, this.f120457B.mo143750b(), this));
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.work.impl.InterfaceC2189f
    /* renamed from: e */
    public void mo11614e(C26967n c26967n, boolean z11) {
        C2155a0 m11585b = this.f120464u.m11585b(c26967n);
        if (m11585b != null) {
            this.f120458C.m129997b(m11585b);
        }
        m129993h(c26967n);
        if (!z11) {
            synchronized (this.f120463t) {
                this.f120468y.remove(c26967n);
            }
        }
    }
}
