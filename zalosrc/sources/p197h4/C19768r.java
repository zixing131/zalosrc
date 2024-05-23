package p197h4;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p010a4.AbstractC0116i;
import p010a4.AbstractC0123p;
import p010a4.C0115h;
import p030b4.AbstractC2512f;
import p030b4.AbstractC2513g;
import p030b4.InterfaceC2511e;
import p030b4.InterfaceC2519m;
import p091d4.C17730a;
import p091d4.C17732c;
import p121e4.AbstractC18197a;
import p228i4.AbstractC20244k;
import p228i4.InterfaceC20228c;
import p228i4.InterfaceC20230d;
import p255j4.InterfaceC20913a;
import p288k4.InterfaceC21460a;
import p668y3.C30276b;

/* renamed from: h4.r */
/* loaded from: classes.dex */
public class C19768r {

    /* renamed from: a */
    private final Context f97896a;

    /* renamed from: b */
    private final InterfaceC2511e f97897b;

    /* renamed from: c */
    private final InterfaceC20230d f97898c;

    /* renamed from: d */
    private final InterfaceC19774x f97899d;

    /* renamed from: e */
    private final Executor f97900e;

    /* renamed from: f */
    private final InterfaceC20913a f97901f;

    /* renamed from: g */
    private final InterfaceC21460a f97902g;

    /* renamed from: h */
    private final InterfaceC21460a f97903h;

    /* renamed from: i */
    private final InterfaceC20228c f97904i;

    public C19768r(Context context, InterfaceC2511e interfaceC2511e, InterfaceC20230d interfaceC20230d, InterfaceC19774x interfaceC19774x, Executor executor, InterfaceC20913a interfaceC20913a, InterfaceC21460a interfaceC21460a, InterfaceC21460a interfaceC21460a2, InterfaceC20228c interfaceC20228c) {
        this.f97896a = context;
        this.f97897b = interfaceC2511e;
        this.f97898c = interfaceC20230d;
        this.f97899d = interfaceC19774x;
        this.f97900e = executor;
        this.f97901f = interfaceC20913a;
        this.f97902g = interfaceC21460a;
        this.f97903h = interfaceC21460a2;
        this.f97904i = interfaceC20228c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ Boolean m103501l(AbstractC0123p abstractC0123p) {
        return Boolean.valueOf(this.f97898c.mo105723j0(abstractC0123p));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ Iterable m103502m(AbstractC0123p abstractC0123p) {
        return this.f97898c.mo105721V(abstractC0123p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ Object m103503n(Iterable iterable, AbstractC0123p abstractC0123p, long j11) {
        this.f97898c.mo105720S(iterable);
        this.f97898c.mo105719I(abstractC0123p, this.f97902g.mo111045a() + j11);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ Object m103504o(Iterable iterable) {
        this.f97898c.mo105726p(iterable);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ Object m103505p() {
        this.f97904i.mo105716a();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ Object m103506q(Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            this.f97904i.mo105717b(((Integer) r0.getValue()).intValue(), C17732c.b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ Object m103507r(AbstractC0123p abstractC0123p, long j11) {
        this.f97898c.mo105719I(abstractC0123p, this.f97902g.mo111045a() + j11);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ Object m103508s(AbstractC0123p abstractC0123p, int i11) {
        this.f97899d.mo103478b(abstractC0123p, i11 + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m103509t(final AbstractC0123p abstractC0123p, final int i11, Runnable runnable) {
        try {
            try {
                InterfaceC20913a interfaceC20913a = this.f97901f;
                final InterfaceC20230d interfaceC20230d = this.f97898c;
                Objects.requireNonNull(interfaceC20230d);
                interfaceC20913a.mo105819d(new InterfaceC20913a.a() { // from class: h4.i
                    @Override // p255j4.InterfaceC20913a.a
                    /* renamed from: d */
                    public final Object mo100860d() {
                        return Integer.valueOf(InterfaceC20230d.this.mo105725n());
                    }
                });
                if (!m103511k()) {
                    this.f97901f.mo105819d(new InterfaceC20913a.a() { // from class: h4.j
                        @Override // p255j4.InterfaceC20913a.a
                        /* renamed from: d */
                        public final Object mo100860d() {
                            Object m103508s;
                            m103508s = C19768r.this.m103508s(abstractC0123p, i11);
                            return m103508s;
                        }
                    });
                } else {
                    m103512u(abstractC0123p, i11);
                }
            } catch (SynchronizationException unused) {
                this.f97899d.mo103478b(abstractC0123p, i11 + 1);
            }
            runnable.run();
        } catch (Throwable th2) {
            runnable.run();
            throw th2;
        }
    }

    /* renamed from: j */
    public AbstractC0116i m103510j(InterfaceC2519m interfaceC2519m) {
        InterfaceC20913a interfaceC20913a = this.f97901f;
        final InterfaceC20228c interfaceC20228c = this.f97904i;
        Objects.requireNonNull(interfaceC20228c);
        return interfaceC2519m.mo12618b(AbstractC0116i.m531a().mo499i(this.f97902g.mo111045a()).mo501k(this.f97903h.mo111045a()).mo500j("GDT_CLIENT_METRICS").mo498h(new C0115h(C30276b.m149414b("proto"), ((C17730a) interfaceC20913a.mo105819d(new InterfaceC20913a.a() { // from class: h4.h
            @Override // p255j4.InterfaceC20913a.a
            /* renamed from: d */
            public final Object mo100860d() {
                return InterfaceC20228c.this.mo105718c();
            }
        })).m93853f())).mo494d());
    }

    /* renamed from: k */
    boolean m103511k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f97896a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public AbstractC2513g m103512u(final AbstractC0123p abstractC0123p, int i11) {
        AbstractC2513g mo12617a;
        InterfaceC2519m mo12599a = this.f97897b.mo12599a(abstractC0123p.mo513b());
        long j11 = 0;
        AbstractC2513g m12603e = AbstractC2513g.m12603e(0L);
        while (true) {
            final long j12 = j11;
            while (((Boolean) this.f97901f.mo105819d(new InterfaceC20913a.a() { // from class: h4.k
                @Override // p255j4.InterfaceC20913a.a
                /* renamed from: d */
                public final Object mo100860d() {
                    Boolean m103501l;
                    m103501l = C19768r.this.m103501l(abstractC0123p);
                    return m103501l;
                }
            })).booleanValue()) {
                final Iterable iterable = (Iterable) this.f97901f.mo105819d(new InterfaceC20913a.a() { // from class: h4.l
                    @Override // p255j4.InterfaceC20913a.a
                    /* renamed from: d */
                    public final Object mo100860d() {
                        Iterable m103502m;
                        m103502m = C19768r.this.m103502m(abstractC0123p);
                        return m103502m;
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return m12603e;
                }
                if (mo12599a == null) {
                    AbstractC18197a.m96964b("Uploader", "Unknown backend for %s, deleting event batch for it...", abstractC0123p);
                    mo12617a = AbstractC2513g.m12601a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((AbstractC20244k) it.next()).mo105713b());
                    }
                    if (abstractC0123p.m550e()) {
                        arrayList.add(m103510j(mo12599a));
                    }
                    mo12617a = mo12599a.mo12617a(AbstractC2512f.m12600a().mo12591b(arrayList).mo12592c(abstractC0123p.mo514c()).mo12590a());
                }
                m12603e = mo12617a;
                if (m12603e.mo12594c() == AbstractC2513g.a.TRANSIENT_ERROR) {
                    this.f97901f.mo105819d(new InterfaceC20913a.a() { // from class: h4.m
                        @Override // p255j4.InterfaceC20913a.a
                        /* renamed from: d */
                        public final Object mo100860d() {
                            Object m103503n;
                            m103503n = C19768r.this.m103503n(iterable, abstractC0123p, j12);
                            return m103503n;
                        }
                    });
                    this.f97899d.mo103477a(abstractC0123p, i11 + 1, true);
                    return m12603e;
                }
                this.f97901f.mo105819d(new InterfaceC20913a.a() { // from class: h4.n
                    @Override // p255j4.InterfaceC20913a.a
                    /* renamed from: d */
                    public final Object mo100860d() {
                        Object m103504o;
                        m103504o = C19768r.this.m103504o(iterable);
                        return m103504o;
                    }
                });
                if (m12603e.mo12594c() == AbstractC2513g.a.OK) {
                    j11 = Math.max(j12, m12603e.mo12593b());
                    if (abstractC0123p.m550e()) {
                        this.f97901f.mo105819d(new InterfaceC20913a.a() { // from class: h4.o
                            @Override // p255j4.InterfaceC20913a.a
                            /* renamed from: d */
                            public final Object mo100860d() {
                                Object m103505p;
                                m103505p = C19768r.this.m103505p();
                                return m103505p;
                            }
                        });
                    }
                } else if (m12603e.mo12594c() == AbstractC2513g.a.INVALID_PAYLOAD) {
                    final HashMap hashMap = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String mo492j = ((AbstractC20244k) it2.next()).mo105713b().mo492j();
                        if (!hashMap.containsKey(mo492j)) {
                            hashMap.put(mo492j, 1);
                        } else {
                            hashMap.put(mo492j, Integer.valueOf(((Integer) hashMap.get(mo492j)).intValue() + 1));
                        }
                    }
                    this.f97901f.mo105819d(new InterfaceC20913a.a() { // from class: h4.p
                        @Override // p255j4.InterfaceC20913a.a
                        /* renamed from: d */
                        public final Object mo100860d() {
                            Object m103506q;
                            m103506q = C19768r.this.m103506q(hashMap);
                            return m103506q;
                        }
                    });
                }
            }
            this.f97901f.mo105819d(new InterfaceC20913a.a() { // from class: h4.q
                @Override // p255j4.InterfaceC20913a.a
                /* renamed from: d */
                public final Object mo100860d() {
                    Object m103507r;
                    m103507r = C19768r.this.m103507r(abstractC0123p, j12);
                    return m103507r;
                }
            });
            return m12603e;
        }
    }

    /* renamed from: v */
    public void m103513v(final AbstractC0123p abstractC0123p, final int i11, final Runnable runnable) {
        this.f97900e.execute(new Runnable() { // from class: h4.g
            @Override // java.lang.Runnable
            public final void run() {
                C19768r.this.m103509t(abstractC0123p, i11, runnable);
            }
        });
    }
}
