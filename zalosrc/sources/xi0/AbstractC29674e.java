package xi0;

import com.android.billingclient.api.AbstractC3894e;
import com.android.billingclient.api.C3918k;
import com.android.billingclient.api.C3934p;
import com.android.billingclient.api.C3940r;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kj0.AbstractC21750g;
import kj0.C21746c;
import kj0.C21748e;
import kj0.C21749f;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import lj0.C22501b;
import p248iy.AbstractC20887g;
import p248iy.C20884d;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: xi0.e */
/* loaded from: classes.dex */
public abstract class AbstractC29674e {

    /* renamed from: a */
    private final InterfaceC24854k f137070a;

    /* renamed from: b */
    private final InterfaceC24854k f137071b;

    /* renamed from: c */
    private final Map f137072c;

    /* renamed from: xi0.e$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f137073q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C22501b mo12V4() {
            return new C22501b();
        }
    }

    /* renamed from: xi0.e$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f137074q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C20884d mo12V4() {
            return new C20884d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xi0.e$c */
    /* loaded from: classes7.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f137075t;

        /* renamed from: u */
        final /* synthetic */ String f137076u;

        /* renamed from: v */
        final /* synthetic */ String f137077v;

        /* renamed from: w */
        final /* synthetic */ AbstractC3894e f137078w;

        /* renamed from: x */
        final /* synthetic */ AbstractC29674e f137079x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, String str2, AbstractC3894e abstractC3894e, AbstractC29674e abstractC29674e, Continuation continuation) {
            super(2, continuation);
            this.f137076u = str;
            this.f137077v = str2;
            this.f137078w = abstractC3894e;
            this.f137079x = abstractC29674e;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f137076u, this.f137077v, this.f137078w, this.f137079x, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            List m131502j;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f137075t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C21748e c21748e = new C21748e(this.f137076u, this.f137077v, this.f137078w, this.f137079x.m147586a());
                C21746c c21746c = new C21746c(this.f137078w, this.f137079x.m147586a());
                C22501b m147586a = this.f137079x.m147586a();
                this.f137075t = 1;
                obj = AbstractC21750g.m112198d(c21748e, c21746c, null, 0, 0L, m147586a, this, 28, null);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            C24860q c24860q = (C24860q) obj;
            C3918k c3918k = (C3918k) c24860q.m129213a();
            List list = (List) c24860q.m129214b();
            if (c3918k.m18652b() == 0) {
                AbstractC20887g.m109217D(79924, null, 2, null);
            } else {
                AbstractC20887g.m109244v(79924, null, 2, null);
                AbstractC20887g.m109236n(79924, c3918k.m18651a(), null, c3918k.m18652b(), 0L, 0, 52, null);
            }
            if (list != null) {
                Map m147587c = this.f137079x.m147587c();
                for (Object obj2 : list) {
                    m147587c.put(((C3934p) obj2).m18669b(), obj2);
                }
            }
            if (list == null) {
                m131502j = AbstractC25368s.m131502j();
                return m131502j;
            }
            return list;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xi0.e$d */
    /* loaded from: classes7.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f137080t;

        /* renamed from: u */
        Object f137081u;

        /* renamed from: v */
        int f137082v;

        /* renamed from: w */
        final /* synthetic */ AbstractC3894e f137083w;

        /* renamed from: x */
        final /* synthetic */ AbstractC29674e f137084x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(AbstractC3894e abstractC3894e, AbstractC29674e abstractC29674e, Continuation continuation) {
            super(2, continuation);
            this.f137083w = abstractC3894e;
            this.f137084x = abstractC29674e;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new d(this.f137083w, this.f137084x, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x00ae  */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            C21746c c21746c;
            Object m112198d;
            C21749f c21749f;
            List list;
            Object m112198d2;
            List list2;
            List m131222v0;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f137082v;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        List list3 = (List) this.f137080t;
                        AbstractC24862s.m129228b(obj);
                        list = list3;
                        m112198d2 = obj;
                        list2 = (List) ((C24860q) m112198d2).m129214b();
                        if (list == null) {
                            list = AbstractC25368s.m131502j();
                        }
                        List list4 = list;
                        if (list2 == null) {
                            list2 = AbstractC25368s.m131502j();
                        }
                        m131222v0 = AbstractC25332a0.m131222v0(list4, list2);
                        return m131222v0;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C21746c c21746c2 = (C21746c) this.f137081u;
                c21749f = (C21749f) this.f137080t;
                AbstractC24862s.m129228b(obj);
                c21746c = c21746c2;
                m112198d = obj;
            } else {
                AbstractC24862s.m129228b(obj);
                C21749f c21749f2 = new C21749f("inapp", this.f137083w, this.f137084x.m147586a());
                C21749f c21749f3 = new C21749f("subs", this.f137083w, this.f137084x.m147586a());
                c21746c = new C21746c(this.f137083w, this.f137084x.m147586a());
                C22501b m147586a = this.f137084x.m147586a();
                this.f137080t = c21749f3;
                this.f137081u = c21746c;
                this.f137082v = 1;
                m112198d = AbstractC21750g.m112198d(c21749f2, c21746c, null, 0, 0L, m147586a, this, 28, null);
                if (m112198d == m142578e) {
                    return m142578e;
                }
                c21749f = c21749f3;
            }
            list = (List) ((C24860q) m112198d).m129214b();
            C22501b m147586a2 = this.f137084x.m147586a();
            this.f137080t = list;
            this.f137081u = null;
            this.f137082v = 2;
            m112198d2 = AbstractC21750g.m112198d(c21749f, c21746c, null, 0, 0L, m147586a2, this, 28, null);
            if (m112198d2 == m142578e) {
                return m142578e;
            }
            list2 = (List) ((C24860q) m112198d2).m129214b();
            if (list == null) {
            }
            List list42 = list;
            if (list2 == null) {
            }
            m131222v0 = AbstractC25332a0.m131222v0(list42, list2);
            return m131222v0;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xi0.e$e */
    /* loaded from: classes7.dex */
    public static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f137085t;

        /* renamed from: u */
        final /* synthetic */ String f137086u;

        /* renamed from: v */
        final /* synthetic */ AbstractC3894e f137087v;

        /* renamed from: w */
        final /* synthetic */ AbstractC29674e f137088w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, AbstractC3894e abstractC3894e, AbstractC29674e abstractC29674e, Continuation continuation) {
            super(2, continuation);
            this.f137086u = str;
            this.f137087v = abstractC3894e;
            this.f137088w = abstractC29674e;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(this.f137086u, this.f137087v, this.f137088w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f137085t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C21749f c21749f = new C21749f(this.f137086u, this.f137087v, this.f137088w.m147586a());
                C21746c c21746c = new C21746c(this.f137087v, this.f137088w.m147586a());
                C22501b m147586a = this.f137088w.m147586a();
                this.f137085t = 1;
                obj = AbstractC21750g.m112198d(c21749f, c21746c, null, 0, 0L, m147586a, this, 28, null);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return (List) ((C24860q) obj).m129214b();
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xi0.e$f */
    /* loaded from: classes7.dex */
    public static final class f extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f137089t;

        /* renamed from: u */
        final /* synthetic */ AbstractC3894e f137090u;

        /* renamed from: v */
        final /* synthetic */ AbstractC29674e f137091v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(AbstractC3894e abstractC3894e, AbstractC29674e abstractC29674e, Continuation continuation) {
            super(2, continuation);
            this.f137090u = abstractC3894e;
            this.f137091v = abstractC29674e;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new f(this.f137090u, this.f137091v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f137089t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C21749f c21749f = new C21749f("subs", this.f137090u, this.f137091v.m147586a());
                C21746c c21746c = new C21746c(this.f137090u, this.f137091v.m147586a());
                C22501b m147586a = this.f137091v.m147586a();
                this.f137089t = 1;
                obj = AbstractC21750g.m112198d(c21749f, c21746c, null, 0, 0L, m147586a, this, 28, null);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            List list = (List) ((C24860q) obj).m129214b();
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((C3940r) obj2).m18693h()) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            }
            return null;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public AbstractC29674e() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(a.f137073q);
        this.f137070a = m129210a;
        m129210a2 = AbstractC24856m.m129210a(b.f137074q);
        this.f137071b = m129210a2;
        this.f137072c = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final C22501b m147586a() {
        return (C22501b) this.f137070a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final Map m147587c() {
        return this.f137072c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final C20884d m147588d() {
        return (C20884d) this.f137071b.getValue();
    }

    /* renamed from: e */
    public final C3934p.d m147589e(List list) {
        AbstractC19074t.m100208f(list, "offerDetailsList");
        Iterator it = list.iterator();
        C3934p.d dVar = null;
        long j11 = Long.MAX_VALUE;
        while (it.hasNext()) {
            C3934p.d dVar2 = (C3934p.d) it.next();
            C3934p.b bVar = (C3934p.b) dVar2.m18682e().m18677a().get(0);
            if (bVar.m18676a() < j11) {
                j11 = bVar.m18676a();
                dVar = dVar2;
            }
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public final Object m147590f(String str, String str2, AbstractC3894e abstractC3894e, Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112680b(), new c(str, str2, abstractC3894e, this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public final Object m147591g(AbstractC3894e abstractC3894e, String str, Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112680b(), new e(str, abstractC3894e, this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public final Object m147592h(AbstractC3894e abstractC3894e, Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112680b(), new d(abstractC3894e, this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final Object m147593i(AbstractC3894e abstractC3894e, Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112680b(), new f(abstractC3894e, this, null), continuation);
    }
}
