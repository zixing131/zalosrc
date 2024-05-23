package p363nh;

import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import pm0.AbstractC24855l;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;

/* renamed from: nh.a */
/* loaded from: classes.dex */
public final class C23744a {
    public static final b Companion = new b(null);

    /* renamed from: b */
    private static final InterfaceC24854k f114849b = AbstractC24855l.m129208a(a.f114851q);

    /* renamed from: a */
    private final Map f114850a;

    /* renamed from: nh.a$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f114851q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C23744a mo12V4() {
            return d.f114852a.m124120a();
        }
    }

    /* renamed from: nh.a$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C23744a m124119a() {
            return (C23744a) C23744a.f114849b.getValue();
        }
    }

    /* renamed from: nh.a$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: x */
        void mo17795x(int i11, Object... objArr);
    }

    /* renamed from: nh.a$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public static final d f114852a = new d();

        /* renamed from: b */
        private static final C23744a f114853b = new C23744a(null);

        private d() {
        }

        /* renamed from: a */
        public final C23744a m124120a() {
            return f114853b;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f114851q);
        f114849b = m129210a;
    }

    public /* synthetic */ C23744a(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: c */
    public static final C23744a m124114c() {
        return Companion.m124119a();
    }

    /* renamed from: b */
    public final void m124115b(c cVar, int i11) {
        AbstractC19074t.m100208f(cVar, "observer");
        synchronized (this.f114850a) {
            try {
                List list = (List) this.f114850a.get(Integer.valueOf(i11));
                if (list == null) {
                    list = new ArrayList();
                    this.f114850a.put(Integer.valueOf(i11), list);
                }
                if (list.contains(cVar)) {
                    return;
                }
                list.add(cVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public final void m124116d(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        ArrayList arrayList = new ArrayList();
        synchronized (this.f114850a) {
            try {
                List list = (List) this.f114850a.get(Integer.valueOf(i11));
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add((c) it.next());
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((c) it2.next()).mo17795x(i11, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* renamed from: e */
    public final void m124117e(c cVar, int i11) {
        AbstractC19074t.m100208f(cVar, "observer");
        synchronized (this.f114850a) {
            try {
                List list = (List) this.f114850a.get(Integer.valueOf(i11));
                if (list != null) {
                    list.remove(cVar);
                    if (list.size() == 0) {
                        this.f114850a.remove(Integer.valueOf(i11));
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private C23744a() {
        this.f114850a = new LinkedHashMap();
    }
}
