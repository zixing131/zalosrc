package mg;

import ag0.AbstractRunnableC0823i0;
import ag0.InterfaceC0806b1;
import bg0.AbstractC2796b;
import bg0.C2797c;
import bg0.InterfaceC2798d;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import ng.C23742a;
import p141ex.AbstractC18630e;
import p323lg.C22475a;
import p391og.AbstractC24249a;
import p667y2.C30268e;

/* renamed from: mg.a */
/* loaded from: classes3.dex */
public final class C23288a implements InterfaceC2798d {

    /* renamed from: a */
    public static final C23288a f113033a = new C23288a();

    /* renamed from: b */
    private static final InterfaceC0806b1 f113034b;

    /* renamed from: c */
    private static final c f113035c;

    /* renamed from: d */
    private static final Map f113036d;

    /* renamed from: mg.a$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC2796b {
        a(InterfaceC0806b1 interfaceC0806b1) {
            super(interfaceC0806b1);
        }

        @Override // bg0.AbstractC2796b
        /* renamed from: j */
        public void mo13477j(Exception exc) {
            AbstractC19074t.m100208f(exc, C30268e.f140632a);
            AbstractC20110a.f98889a.mo104552e(exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: mg.a$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final b f113037q = new b();

        b() {
            super(2);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractRunnableC0823i0 mo240pC(Runnable runnable, InterfaceC18494a interfaceC18494a) {
            AbstractC19074t.m100208f(runnable, "targetTask");
            AbstractC19074t.m100208f(interfaceC18494a, "processBlock");
            return C22475a.Companion.m116220a(runnable, interfaceC18494a);
        }
    }

    /* renamed from: mg.a$c */
    /* loaded from: classes3.dex */
    public static final class c extends C2797c {
        c(InterfaceC0806b1 interfaceC0806b1) {
            super(interfaceC0806b1);
        }

        @Override // bg0.C2797c
        /* renamed from: i */
        public void mo12810i(Exception exc) {
            AbstractC19074t.m100208f(exc, C30268e.f140632a);
            AbstractC20110a.f98889a.mo104552e(exc);
        }
    }

    /* renamed from: mg.a$d */
    /* loaded from: classes3.dex */
    static final class d extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final d f113038q = new d();

        d() {
            super(2);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractRunnableC0823i0 mo240pC(Runnable runnable, InterfaceC18494a interfaceC18494a) {
            AbstractC19074t.m100208f(runnable, "targetTask");
            AbstractC19074t.m100208f(interfaceC18494a, "processBlock");
            return C22475a.Companion.m116220a(runnable, interfaceC18494a);
        }
    }

    static {
        C23742a c23742a = new C23742a();
        f113034b = c23742a;
        c cVar = new c(c23742a);
        cVar.m13469d(d.f113038q);
        f113035c = cVar;
        f113036d = new HashMap();
    }

    private C23288a() {
    }

    /* renamed from: c */
    private final AbstractC2796b m120385c() {
        a aVar = new a(f113034b);
        aVar.m13469d(b.f113037q);
        return aVar;
    }

    /* renamed from: e */
    private final AbstractC2796b m120386e(String str) {
        AbstractC2796b abstractC2796b;
        Map map = f113036d;
        Object obj = map.get(str);
        if (obj == null) {
            synchronized (map) {
                abstractC2796b = (AbstractC2796b) map.get(str);
                if (abstractC2796b == null) {
                    abstractC2796b = f113033a.m120385c();
                    map.put(str, abstractC2796b);
                }
            }
            return abstractC2796b;
        }
        return (AbstractC2796b) obj;
    }

    /* renamed from: b */
    public final synchronized void m120387b() {
        Iterator it = f113036d.values().iterator();
        while (it.hasNext()) {
            ((AbstractC2796b) it.next()).m13475f();
        }
    }

    @Override // bg0.InterfaceC2798d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public synchronized void mo13474a(AbstractC24249a abstractC24249a) {
        AbstractC19074t.m100208f(abstractC24249a, "task");
        String m126589f = abstractC24249a.m126589f();
        if (m126589f.length() == 0) {
            AbstractC20110a.f98889a.mo104552e(new IllegalArgumentException("ChatTaskDispatcher#dispatch: Empty task id\n"));
            return;
        }
        if (AbstractC19074t.m100204b(m126589f, "SERIAL_TASK_ID")) {
            f113035c.mo13474a(abstractC24249a);
        } else {
            m120386e(m126589f).mo13474a(abstractC24249a);
        }
        AbstractC18630e.m98439b(m120390g(abstractC24249a.m126589f()), abstractC24249a.m126586c(), -1L, -1L, abstractC24249a.m126588e(), false, abstractC24249a.m126589f());
    }

    /* renamed from: f */
    public final synchronized int m120389f() {
        int i11;
        Iterator it = f113036d.values().iterator();
        i11 = 0;
        while (it.hasNext()) {
            i11 += ((AbstractC2796b) it.next()).m13478k();
        }
        return i11;
    }

    /* renamed from: g */
    public final synchronized int m120390g(String str) {
        int i11;
        AbstractC19074t.m100208f(str, "id");
        AbstractC2796b abstractC2796b = (AbstractC2796b) f113036d.get(str);
        if (abstractC2796b != null) {
            i11 = abstractC2796b.m13478k();
        } else {
            i11 = 0;
        }
        return i11;
    }
}
