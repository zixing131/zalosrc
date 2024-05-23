package p565v2;

import androidx.work.C2149h0;
import androidx.work.InterfaceC2257y;
import androidx.work.impl.AbstractC2239z;
import androidx.work.impl.C2218q;
import androidx.work.impl.C2221r0;
import androidx.work.impl.InterfaceC2233w;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;
import p535u2.InterfaceC26951b;
import p535u2.InterfaceC26977x;

/* renamed from: v2.b */
/* loaded from: classes2.dex */
public abstract class AbstractRunnableC27442b implements Runnable {

    /* renamed from: p */
    private final C2218q f129139p = new C2218q();

    /* renamed from: v2.b$a */
    /* loaded from: classes2.dex */
    public class a extends AbstractRunnableC27442b {

        /* renamed from: q */
        final /* synthetic */ C2221r0 f129140q;

        /* renamed from: r */
        final /* synthetic */ UUID f129141r;

        a(C2221r0 c2221r0, UUID uuid) {
            this.f129140q = c2221r0;
            this.f129141r = uuid;
        }

        @Override // p565v2.AbstractRunnableC27442b
        /* renamed from: h */
        void mo140473h() {
            WorkDatabase m11740w = this.f129140q.m11740w();
            m11740w.m342e();
            try {
                m140470a(this.f129140q, this.f129141r.toString());
                m11740w.m339E();
                m11740w.m347j();
                m140472g(this.f129140q);
            } catch (Throwable th2) {
                m11740w.m347j();
                throw th2;
            }
        }
    }

    /* renamed from: v2.b$b */
    /* loaded from: classes2.dex */
    public class b extends AbstractRunnableC27442b {

        /* renamed from: q */
        final /* synthetic */ C2221r0 f129142q;

        /* renamed from: r */
        final /* synthetic */ String f129143r;

        b(C2221r0 c2221r0, String str) {
            this.f129142q = c2221r0;
            this.f129143r = str;
        }

        @Override // p565v2.AbstractRunnableC27442b
        /* renamed from: h */
        void mo140473h() {
            WorkDatabase m11740w = this.f129142q.m11740w();
            m11740w.m342e();
            try {
                Iterator it = m11740w.mo11565L().mo139010l(this.f129143r).iterator();
                while (it.hasNext()) {
                    m140470a(this.f129142q, (String) it.next());
                }
                m11740w.m339E();
                m11740w.m347j();
                m140472g(this.f129142q);
            } catch (Throwable th2) {
                m11740w.m347j();
                throw th2;
            }
        }
    }

    /* renamed from: v2.b$c */
    /* loaded from: classes2.dex */
    public class c extends AbstractRunnableC27442b {

        /* renamed from: q */
        final /* synthetic */ C2221r0 f129144q;

        /* renamed from: r */
        final /* synthetic */ String f129145r;

        /* renamed from: s */
        final /* synthetic */ boolean f129146s;

        c(C2221r0 c2221r0, String str, boolean z11) {
            this.f129144q = c2221r0;
            this.f129145r = str;
            this.f129146s = z11;
        }

        @Override // p565v2.AbstractRunnableC27442b
        /* renamed from: h */
        void mo140473h() {
            WorkDatabase m11740w = this.f129144q.m11740w();
            m11740w.m342e();
            try {
                Iterator it = m11740w.mo11565L().mo139006h(this.f129145r).iterator();
                while (it.hasNext()) {
                    m140470a(this.f129144q, (String) it.next());
                }
                m11740w.m339E();
                m11740w.m347j();
                if (this.f129146s) {
                    m140472g(this.f129144q);
                }
            } catch (Throwable th2) {
                m11740w.m347j();
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public static AbstractRunnableC27442b m140466b(UUID uuid, C2221r0 c2221r0) {
        return new a(c2221r0, uuid);
    }

    /* renamed from: c */
    public static AbstractRunnableC27442b m140467c(String str, C2221r0 c2221r0, boolean z11) {
        return new c(c2221r0, str, z11);
    }

    /* renamed from: d */
    public static AbstractRunnableC27442b m140468d(String str, C2221r0 c2221r0) {
        return new b(c2221r0, str);
    }

    /* renamed from: f */
    private void m140469f(WorkDatabase workDatabase, String str) {
        InterfaceC26977x mo11565L = workDatabase.mo11565L();
        InterfaceC26951b mo11560G = workDatabase.mo11560G();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            C2149h0.c mo139007i = mo11565L.mo139007i(str2);
            if (mo139007i != C2149h0.c.SUCCEEDED && mo139007i != C2149h0.c.FAILED) {
                mo11565L.mo139009k(str2);
            }
            linkedList.addAll(mo11560G.mo138905a(str2));
        }
    }

    /* renamed from: a */
    void m140470a(C2221r0 c2221r0, String str) {
        m140469f(c2221r0.m11740w(), str);
        c2221r0.m11737t().m11771t(str, 1);
        Iterator it = c2221r0.m11738u().iterator();
        while (it.hasNext()) {
            ((InterfaceC2233w) it.next()).mo11640a(str);
        }
    }

    /* renamed from: e */
    public InterfaceC2257y m140471e() {
        return this.f129139p;
    }

    /* renamed from: g */
    void m140472g(C2221r0 c2221r0) {
        AbstractC2239z.m11855h(c2221r0.m11735p(), c2221r0.m11740w(), c2221r0.m11738u());
    }

    /* renamed from: h */
    abstract void mo140473h();

    @Override // java.lang.Runnable
    public void run() {
        try {
            mo140473h();
            this.f129139p.m11725a(InterfaceC2257y.f9481a);
        } catch (Throwable th2) {
            this.f129139p.m11725a(new InterfaceC2257y.b.a(th2));
        }
    }
}
