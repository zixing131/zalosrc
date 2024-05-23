package ci;

import ag0.AbstractC0837p0;
import android.util.LongSparseArray;
import au.EnumC2363o;
import au.EnumC2381y;
import au.EnumC2382z;
import ci.C3508j;
import ci.C3521p0;
import com.zing.zalo.control.C7906d;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.control.mediastore.CreateMediaStoreParam;
import com.zing.zalo.control.mediastore.MSFilterData;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.mediastore.search.MediaStoreSearchPage;
import dg0.AbstractC17930e;
import dm.C18027a;
import en0.InterfaceC18494a;
import fe0.C18895d;
import fe0.C18898g;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hm0.C20096c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import mm0.AbstractC23350e;
import p300kk.C21753c;
import p348mi.AbstractC23306f;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import qm0.AbstractC25376w;
import sm0.AbstractC26327c;

/* renamed from: ci.e0 */
/* loaded from: classes3.dex */
public class C3499e0 {
    public static final a Companion = new a(null);

    /* renamed from: l */
    private static final EnumC2381y f14650l = EnumC2381y.f9941r;

    /* renamed from: a */
    private final CreateMediaStoreParam f14651a;

    /* renamed from: b */
    private boolean f14652b;

    /* renamed from: c */
    private final InterfaceC24854k f14653c;

    /* renamed from: d */
    private final InterfaceC24854k f14654d;

    /* renamed from: e */
    private final InterfaceC24854k f14655e;

    /* renamed from: f */
    private final InterfaceC24854k f14656f;

    /* renamed from: g */
    private final InterfaceC24854k f14657g;

    /* renamed from: h */
    private C3526u f14658h;

    /* renamed from: i */
    private final List f14659i;

    /* renamed from: j */
    private final List f14660j;

    /* renamed from: k */
    private final List f14661k;

    /* renamed from: ci.e0$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final String m17645a(CreateMediaStoreParam createMediaStoreParam) {
            String str;
            AbstractC19074t.m100208f(createMediaStoreParam, "param");
            String m40908a = createMediaStoreParam.m40908a();
            if (createMediaStoreParam.m40910c() == EnumC2363o.f9889p) {
                return m40908a;
            }
            EnumC2363o m40910c = createMediaStoreParam.m40910c();
            MSFilterData m40909b = createMediaStoreParam.m40909b();
            if (m40909b != null) {
                str = m40909b.m40917a();
            } else {
                str = null;
            }
            return m40908a + "_filterMode: " + m40910c + "_filterData: " + str;
        }

        /* renamed from: b */
        public final EnumC2381y m17646b() {
            return C3499e0.f14650l;
        }
    }

    /* renamed from: ci.e0$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14662a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f14663b;

        static {
            int[] iArr = new int[EnumC2363o.values().length];
            try {
                iArr[EnumC2363o.f9890q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2363o.f9891r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2363o.f9892s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f14662a = iArr;
            int[] iArr2 = new int[EnumC2382z.values().length];
            try {
                iArr2[EnumC2382z.f9945r.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC2382z.f9946s.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC2382z.f9947t.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f14663b = iArr2;
        }
    }

    /* renamed from: ci.e0$c */
    /* loaded from: classes3.dex */
    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b(Long.valueOf(((MediaStoreItem) obj2).m40599m().m95313z4()), Long.valueOf(((MediaStoreItem) obj).m40599m().m95313z4()));
            return m135478b;
        }
    }

    /* renamed from: ci.e0$d */
    /* loaded from: classes3.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {
        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3500f mo12V4() {
            return new C3500f(C3499e0.this.m17608M());
        }
    }

    /* renamed from: ci.e0$e */
    /* loaded from: classes3.dex */
    static final class e extends AbstractC19075u implements InterfaceC18494a {
        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3502g mo12V4() {
            return new C3502g(C3499e0.this.m17608M());
        }
    }

    /* renamed from: ci.e0$f */
    /* loaded from: classes3.dex */
    static final class f extends AbstractC19075u implements InterfaceC18494a {
        f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3504h mo12V4() {
            return new C3504h(C3499e0.this.m17608M());
        }
    }

    /* renamed from: ci.e0$g */
    /* loaded from: classes3.dex */
    static final class g extends AbstractC19075u implements InterfaceC18494a {
        g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3506i mo12V4() {
            return new C3506i(C3499e0.this.m17608M());
        }
    }

    /* renamed from: ci.e0$h */
    /* loaded from: classes3.dex */
    static final class h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final h f14668q = new h();

        h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HashSet mo12V4() {
            return new HashSet();
        }
    }

    public C3499e0(CreateMediaStoreParam createMediaStoreParam) {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        AbstractC19074t.m100208f(createMediaStoreParam, "createMediaStoreParam");
        this.f14651a = createMediaStoreParam;
        m129210a = AbstractC24856m.m129210a(new g());
        this.f14653c = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new f());
        this.f14654d = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new e());
        this.f14655e = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(new d());
        this.f14656f = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(h.f14668q);
        this.f14657g = m129210a5;
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        AbstractC19074t.m100207e(synchronizedList, "synchronizedList(...)");
        this.f14659i = synchronizedList;
        List synchronizedList2 = Collections.synchronizedList(new ArrayList());
        AbstractC19074t.m100207e(synchronizedList2, "synchronizedList(...)");
        this.f14660j = synchronizedList2;
        this.f14661k = Collections.synchronizedList(new ArrayList());
    }

    /* renamed from: G */
    private final C21753c m17572G(C3490a c3490a, int i11, int i12) {
        String str;
        int i13 = b.f14662a[m17612Q().ordinal()];
        if (i13 != 1) {
            if (i13 != 2) {
                if (i13 != 3) {
                    return C18027a.Companion.m95862a().m95857i(m17608M(), c3490a.m17520a(), i11, i12);
                }
                return C18027a.Companion.m95862a().m95854f(m17608M(), i11, i12);
            }
            return C18027a.Companion.m95862a().m95856h(m17608M(), i11, i12);
        }
        C18027a m95862a = C18027a.Companion.m95862a();
        String m17608M = m17608M();
        MSFilterData m17611P = m17611P();
        if (m17611P == null || (str = m17611P.m40918b()) == null) {
            str = "";
        }
        return m95862a.m95855g(m17608M, str, c3490a.m17520a(), i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public static final void m17573J(C3499e0 c3499e0, C3529x c3529x, EnumC2382z enumC2382z) {
        AbstractC19074t.m100208f(c3499e0, "this$0");
        AbstractC19074t.m100208f(c3529x, "$targetInfo");
        AbstractC19074t.m100208f(enumC2382z, "$mediaType");
        synchronized (c3499e0) {
            c3499e0.m17577Y().m17550b(c3529x);
            c3499e0.m17623g0(new C3490a(enumC2382z, false, 2, null));
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: V */
    private final C3500f m17574V() {
        return (C3500f) this.f14656f.getValue();
    }

    /* renamed from: W */
    private final C3502g m17575W() {
        return (C3502g) this.f14655e.getValue();
    }

    /* renamed from: X */
    private final C3504h m17576X() {
        return (C3504h) this.f14654d.getValue();
    }

    /* renamed from: Y */
    private final C3506i m17577Y() {
        return (C3506i) this.f14653c.getValue();
    }

    /* renamed from: Z */
    private final long m17578Z(long j11) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j11);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    /* renamed from: b0 */
    private final Set m17581b0() {
        return (Set) this.f14657g.getValue();
    }

    /* renamed from: d0 */
    private final boolean m17584d0() {
        boolean z11;
        synchronized (this.f14660j) {
            z11 = !this.f14660j.isEmpty();
        }
        return z11;
    }

    /* renamed from: h */
    private final void m17586h(EnumC2382z enumC2382z, List list, boolean z11) {
        int i11;
        MediaStoreItem mediaStoreItem;
        this.f14652b = true;
        try {
            AbstractC3498e m17615T = m17615T(enumC2382z);
            if (!z11 && m17615T != null) {
                m17615T.mo17553f();
            }
            Calendar calendar = Calendar.getInstance();
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                MediaStoreItem mediaStoreItem2 = (MediaStoreItem) it.next();
                if (!mediaStoreItem2.m40591g0()) {
                    long m95313z4 = mediaStoreItem2.m40599m().m95313z4();
                    if (m95313z4 > 0) {
                        calendar.setTimeInMillis(m95313z4);
                        calendar.set(11, 0);
                        calendar.set(12, 0);
                        calendar.set(13, 0);
                        calendar.set(14, 0);
                        mediaStoreItem2.m40618z0(calendar.getTimeInMillis());
                    }
                    if (m17615T != null) {
                        mediaStoreItem = m17615T.m17557j(mediaStoreItem2.m40571M());
                    } else {
                        mediaStoreItem = null;
                    }
                    if (mediaStoreItem == null) {
                        if (m17615T != null) {
                            m17615T.mo17568v(mediaStoreItem2);
                        }
                        arrayList.add(mediaStoreItem2);
                    } else {
                        arrayList.add(mediaStoreItem);
                    }
                }
            }
            LongSparseArray longSparseArray = new LongSparseArray();
            int size = arrayList.size();
            for (i11 = 0; i11 < size; i11++) {
                MediaStoreItem mediaStoreItem3 = (MediaStoreItem) arrayList.get(i11);
                long m40573Q = mediaStoreItem3.m40573Q();
                C7906d c7906d = (C7906d) longSparseArray.get(m40573Q);
                if (c7906d == null) {
                    c7906d = C7906d.Companion.m40837a(m40573Q);
                    C7906d.b m40819h = c7906d.m40819h();
                    if (m40819h != null) {
                        m40819h.m40845h(m40573Q);
                    }
                    longSparseArray.put(m40573Q, c7906d);
                }
                c7906d.m40814c(mediaStoreItem3);
            }
            ArrayList arrayList2 = new ArrayList();
            for (int size2 = longSparseArray.size() - 1; -1 < size2; size2--) {
                C7906d c7906d2 = (C7906d) longSparseArray.get(longSparseArray.keyAt(size2));
                if (c7906d2 != null) {
                    arrayList2.add(c7906d2);
                }
            }
            m17588i(enumC2382z, arrayList2, z11);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0065 A[Catch: Exception -> 0x0074, TryCatch #0 {Exception -> 0x0074, blocks: (B:3:0x0015, B:6:0x0022, B:9:0x0053, B:11:0x0065, B:13:0x006b, B:14:0x0077, B:15:0x0094, B:17:0x009a, B:21:0x00b3, B:22:0x00b9, B:33:0x00c6, B:29:0x00d0, B:38:0x00d4, B:42:0x0035, B:45:0x003d, B:48:0x001e), top: B:2:0x0015 }] */
    /* renamed from: h0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m17587h0(C3490a c3490a, AbstractC3498e abstractC3498e, C3499e0 c3499e0) {
        int m17562o;
        boolean z11;
        Object m131216p0;
        AbstractC19074t.m100208f(c3490a, "$param");
        AbstractC19074t.m100208f(abstractC3498e, "$msCategory");
        AbstractC19074t.m100208f(c3499e0, "this$0");
        try {
            if (!c3490a.m17521b()) {
                m17562o = 0;
            } else {
                m17562o = abstractC3498e.m17562o();
            }
            C21753c m17572G = c3499e0.m17572G(c3490a, m17562o, 100);
            List<MediaStoreItem> m112206b = m17572G.m112206b();
            if (m112206b.size() < 100 && (m17572G.m112205a() || c3499e0.m17572G(c3490a, m17572G.m112207c(), 2).m112206b().isEmpty())) {
                z11 = false;
                abstractC3498e.m17545B(z11);
                ArrayList arrayList = new ArrayList();
                if (!m112206b.isEmpty()) {
                    if (m112206b.size() > 1) {
                        AbstractC25376w.m131534w(m112206b, new c());
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                    m131216p0 = AbstractC25332a0.m131216p0(m112206b);
                    long m17578Z = c3499e0.m17578Z(((MediaStoreItem) m131216p0).m40599m().m95313z4());
                    int i11 = 0;
                    int i12 = 0;
                    for (MediaStoreItem mediaStoreItem : m112206b) {
                        i11++;
                        long m17578Z2 = c3499e0.m17578Z(mediaStoreItem.m40599m().m95313z4());
                        if (i12 == 0 && m17578Z == m17578Z2) {
                            i12 = (m112206b.size() - i11) + 1;
                        }
                        if (abstractC3498e.m17556i() && i12 != 0 && i12 < 50) {
                            m17572G.m112209e(m17572G.m112207c() - 1);
                        }
                        arrayList.add(mediaStoreItem);
                    }
                }
                c3499e0.m17586h(c3490a.m17520a(), arrayList, c3490a.m17521b());
                abstractC3498e.m17547D(false);
                abstractC3498e.m17548E(m17572G.m112207c());
                int m17562o2 = abstractC3498e.m17562o();
                int size = arrayList.size();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("loadPaginatedDataFromDb offset: ");
                sb2.append(m17562o2);
                sb2.append("\tresultSize: ");
                sb2.append(size);
                c3499e0.m17594q(c3490a.m17520a(), c3490a.m17521b(), C3521p0.Companion.m17797b());
                c3499e0.m17596y(c3490a.m17520a());
            }
            z11 = true;
            abstractC3498e.m17545B(z11);
            ArrayList arrayList2 = new ArrayList();
            if (!m112206b.isEmpty()) {
            }
            c3499e0.m17586h(c3490a.m17520a(), arrayList2, c3490a.m17521b());
            abstractC3498e.m17547D(false);
            abstractC3498e.m17548E(m17572G.m112207c());
            int m17562o22 = abstractC3498e.m17562o();
            int size2 = arrayList2.size();
            StringBuilder sb22 = new StringBuilder();
            sb22.append("loadPaginatedDataFromDb offset: ");
            sb22.append(m17562o22);
            sb22.append("\tresultSize: ");
            sb22.append(size2);
            c3499e0.m17594q(c3490a.m17520a(), c3490a.m17521b(), C3521p0.Companion.m17797b());
            c3499e0.m17596y(c3490a.m17520a());
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: i */
    private final void m17588i(EnumC2382z enumC2382z, List list, boolean z11) {
        AbstractC3498e m17615T = m17615T(enumC2382z);
        if (m17615T != null) {
            int size = list.size();
            if (!z11) {
                while (true) {
                    size--;
                    if (-1 >= size) {
                        break;
                    } else {
                        AbstractC3498e.m17541d(m17615T, m17612Q(), (C7906d) list.get(size), false, false, null, 24, null);
                    }
                }
            } else {
                for (int i11 = 0; i11 < size; i11++) {
                    AbstractC3498e.m17541d(m17615T, m17612Q(), (C7906d) list.get(i11), true, false, null, 24, null);
                }
            }
            m17615T.m17549H();
        }
    }

    /* renamed from: j */
    private final void m17589j(EnumC2382z enumC2382z, long j11) {
        List list = this.f14661k;
        AbstractC19074t.m100207e(list, "mMsCollectionListeners");
        synchronized (list) {
            try {
                Iterator it = this.f14661k.iterator();
                while (it.hasNext()) {
                    ((AbstractC3512l) it.next()).mo17751a(m17608M(), enumC2382z, j11);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public static final void m17590j0(C3499e0 c3499e0) {
        AbstractC19074t.m100208f(c3499e0, "this$0");
        AbstractC23306f.m120638Z0().m101508a(new C18895d.a(c3499e0.m17574V().m17657e()));
    }

    /* renamed from: k */
    private final void m17591k(EnumC2382z enumC2382z) {
        List list = this.f14661k;
        AbstractC19074t.m100207e(list, "mMsCollectionListeners");
        synchronized (list) {
            try {
                Iterator it = this.f14661k.iterator();
                while (it.hasNext()) {
                    ((AbstractC3512l) it.next()).mo17752b(m17608M(), enumC2382z);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: l */
    private final void m17592l(EnumC2382z enumC2382z, C3529x c3529x, boolean z11) {
        synchronized (this.f14659i) {
            try {
                Iterator it = this.f14659i.iterator();
                while (it.hasNext()) {
                    ((AbstractC3501f0) it.next()).mo17659a(m17608M(), enumC2382z, c3529x, z11);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: m */
    private final void m17593m(EnumC2382z enumC2382z, List list, boolean z11) {
        synchronized (this.f14659i) {
            try {
                Iterator it = this.f14659i.iterator();
                while (it.hasNext()) {
                    ((AbstractC3501f0) it.next()).mo17660b(m17608M(), enumC2382z, list, z11);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: q */
    private final void m17594q(EnumC2382z enumC2382z, boolean z11, C20096c c20096c) {
        synchronized (this.f14659i) {
            try {
                Iterator it = this.f14659i.iterator();
                while (it.hasNext()) {
                    ((AbstractC3501f0) it.next()).mo17662d(m17608M(), enumC2382z, z11, c20096c);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: r */
    private final void m17595r(EnumC2382z enumC2382z, boolean z11) {
        synchronized (this.f14659i) {
            try {
                Iterator it = this.f14659i.iterator();
                while (it.hasNext()) {
                    ((AbstractC3501f0) it.next()).mo17663e(m17608M(), enumC2382z, z11);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: y */
    private final void m17596y(final EnumC2382z enumC2382z) {
        AbstractC17930e.Companion.m94551d().mo94528b(new Runnable() { // from class: ci.d0
            @Override // java.lang.Runnable
            public final void run() {
                C3499e0.m17597z(C3499e0.this, enumC2382z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public static final void m17597z(C3499e0 c3499e0, EnumC2382z enumC2382z) {
        AbstractC19074t.m100208f(c3499e0, "this$0");
        AbstractC19074t.m100208f(enumC2382z, "$mediaType");
        AbstractC3498e m17615T = c3499e0.m17615T(enumC2382z);
        if (m17615T == null || m17615T.m17560m().isEmpty()) {
            return;
        }
        synchronized (m17615T.m17560m()) {
            try {
                Iterator it = m17615T.m17560m().iterator();
                while (it.hasNext()) {
                    C3529x c3529x = (C3529x) it.next();
                    String m17880b = c3529x.m17880b();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("checkFindTargetItemResult, START targetInfo: ");
                    sb2.append(m17880b);
                    if (m17615T.m17555h(c3529x)) {
                        c3499e0.m17592l(enumC2382z, c3529x, true);
                        it.remove();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("checkFindTargetItemResult FOUND, RETURN!: ");
                        sb3.append(c3529x);
                    } else if (!c3529x.m17879a()) {
                        c3499e0.m17592l(enumC2382z, c3529x, false);
                        it.remove();
                    } else {
                        MediaStoreItem m17558k = m17615T.m17558k();
                        if (m17558k != null && m17558k.m40599m().m95313z4() < c3529x.m17882d()) {
                            c3499e0.m17592l(enumC2382z, c3529x, false);
                            it.remove();
                        } else if (!m17615T.m17556i()) {
                            c3499e0.m17592l(enumC2382z, c3529x, false);
                            it.remove();
                        }
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!m17615T.m17560m().isEmpty()) {
            c3499e0.m17623g0(new C3490a(enumC2382z, m17615T.m17565r()));
        }
    }

    /* renamed from: A */
    public final void m17598A(EnumC2382z enumC2382z, MessageId messageId) {
        C3526u c3526u;
        long j11;
        long j12;
        AbstractC19074t.m100208f(enumC2382z, "mediaStoreType");
        if (m17584d0() && messageId != null && messageId.m41059z() && (c3526u = this.f14658h) != null && c3526u.m17842a(enumC2382z, messageId)) {
            AbstractC3498e m17846e = c3526u.m17846e(enumC2382z);
            if (m17846e.m17556i() && m17846e.mo17561n().size() <= AbstractC3527v.m17873a(enumC2382z)) {
                C18898g m120682k1 = AbstractC23306f.m120682k1();
                C3526u c3526u2 = this.f14658h;
                MediaStoreSearchPage.EnumC12391a m17849h = c3526u.m17849h();
                C3525t m17850i = c3526u.m17850i();
                if (m17850i != null) {
                    j11 = m17850i.m17837b();
                } else {
                    j11 = 0;
                }
                C3525t m17850i2 = c3526u.m17850i();
                if (m17850i2 != null) {
                    j12 = m17850i2.m17836a();
                } else {
                    j12 = 0;
                }
                m120682k1.m101508a(new C18898g.a(this, c3526u2, enumC2382z, m17849h, j11, j12, true));
                return;
            }
            m17642v(enumC2382z);
        }
    }

    /* renamed from: B */
    public final void m17599B() {
        List list = this.f14661k;
        AbstractC19074t.m100207e(list, "mMsCollectionListeners");
        synchronized (list) {
            this.f14661k.clear();
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: C */
    public final void m17600C() {
        synchronized (this.f14659i) {
            this.f14659i.clear();
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: D */
    public final void m17601D() {
        synchronized (this.f14660j) {
            this.f14660j.clear();
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: E */
    public final List m17602E(List list, boolean z11) {
        AbstractC19074t.m100208f(list, "outsideList");
        return m17577Y().m17679K(list, z11);
    }

    /* renamed from: F */
    public final void m17603F(EnumC2382z enumC2382z, List list, boolean z11) {
        AbstractC19074t.m100208f(enumC2382z, "mediaType");
        AbstractC19074t.m100208f(list, "deletedMsgIds");
        AbstractC3498e m17615T = m17615T(enumC2382z);
        if (m17615T == null) {
            return;
        }
        int mo17564q = m17615T.mo17564q();
        m17615T.m17571z(list);
        m17593m(enumC2382z, list, z11);
        if (mo17564q > 0 && !m17615T.m17565r()) {
            m17623g0(new C3490a(enumC2382z, false, 2, null));
        }
        m17641u0(enumC2382z, list);
    }

    /* renamed from: H */
    public final MediaStoreItem m17604H(MessageId messageId) {
        AbstractC19074t.m100208f(messageId, "messageId");
        MediaStoreItem m17554g = m17577Y().m17554g(messageId);
        if (m17554g != null) {
            return m17554g;
        }
        MediaStoreItem m17554g2 = m17575W().m17554g(messageId);
        if (m17554g2 != null) {
            return m17554g2;
        }
        MediaStoreItem m17554g3 = m17576X().m17554g(messageId);
        if (m17554g3 != null) {
            return m17554g3;
        }
        return null;
    }

    /* renamed from: I */
    public final void m17605I(final EnumC2382z enumC2382z, final C3529x c3529x) {
        AbstractC19074t.m100208f(enumC2382z, "mediaType");
        AbstractC19074t.m100208f(c3529x, "targetInfo");
        AbstractC0837p0.Companion.m2236a().mo2040a(new Runnable() { // from class: ci.b0
            @Override // java.lang.Runnable
            public final void run() {
                C3499e0.m17573J(C3499e0.this, c3529x, enumC2382z);
            }
        });
    }

    /* renamed from: K */
    public final C3510k m17606K(C3508j.b bVar) {
        AbstractC19074t.m100208f(bVar, "collectionSubType");
        return m17574V().m17655c(bVar);
    }

    /* renamed from: L */
    public final C3508j m17607L(CreateMediaStoreParam createMediaStoreParam) {
        AbstractC19074t.m100208f(createMediaStoreParam, "createMediaStoreParam");
        return m17574V().m17656d(createMediaStoreParam);
    }

    /* renamed from: M */
    public final String m17608M() {
        return this.f14651a.m40908a();
    }

    /* renamed from: N */
    public final CreateMediaStoreParam m17609N() {
        return this.f14651a;
    }

    /* renamed from: O */
    public final C3526u m17610O() {
        return this.f14658h;
    }

    /* renamed from: P */
    public final MSFilterData m17611P() {
        return this.f14651a.m40909b();
    }

    /* renamed from: Q */
    public final EnumC2363o m17612Q() {
        return this.f14651a.m40910c();
    }

    /* renamed from: R */
    public final List m17613R() {
        return m17577Y().m17680L();
    }

    /* renamed from: S */
    public final String m17614S() {
        return Companion.m17645a(new CreateMediaStoreParam(m17608M(), m17612Q(), m17611P()));
    }

    /* renamed from: T */
    public final AbstractC3498e m17615T(EnumC2382z enumC2382z) {
        AbstractC19074t.m100208f(enumC2382z, "mediaType");
        int i11 = b.f14663b[enumC2382z.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return null;
                }
                return m17575W();
            }
            return m17576X();
        }
        return m17577Y();
    }

    /* renamed from: U */
    public final EnumC2381y m17616U() {
        return m17577Y().m17681M();
    }

    /* renamed from: a0 */
    public final EnumC2381y m17617a0() {
        return m17577Y().m17683P();
    }

    /* renamed from: c0 */
    public final boolean m17618c0(EnumC2382z enumC2382z) {
        AbstractC19074t.m100208f(enumC2382z, "mediaType");
        AbstractC3498e m17615T = m17615T(enumC2382z);
        if (m17615T != null) {
            return m17615T.m17556i();
        }
        return false;
    }

    /* renamed from: e0 */
    public final boolean m17619e0() {
        return !m17581b0().isEmpty();
    }

    /* renamed from: f */
    public final void m17620f(C3508j c3508j) {
        AbstractC19074t.m100208f(c3508j, "collectionItem");
        m17574V().m17653a(c3508j);
    }

    /* renamed from: f0 */
    public final void m17621f0() {
        m17577Y().m17684Q();
    }

    /* renamed from: g */
    public final boolean m17622g(EnumC2382z enumC2382z) {
        AbstractC19074t.m100208f(enumC2382z, "mediaType");
        return m17618c0(enumC2382z);
    }

    /* renamed from: g0 */
    public final void m17623g0(final C3490a c3490a) {
        AbstractC19074t.m100208f(c3490a, "param");
        final AbstractC3498e m17615T = m17615T(c3490a.m17520a());
        if (m17615T != null && !m17615T.m17567u()) {
            if (!c3490a.m17521b() || m17615T.m17556i()) {
                m17615T.m17547D(true);
                m17595r(c3490a.m17520a(), c3490a.m17521b());
                AbstractC17930e.Companion.m94551d().mo94528b(new Runnable() { // from class: ci.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3499e0.m17587h0(C3490a.this, m17615T, this);
                    }
                });
            }
        }
    }

    /* renamed from: i0 */
    public final void m17624i0() {
        AbstractC17930e.Companion.m94551d().mo94528b(new Runnable() { // from class: ci.c0
            @Override // java.lang.Runnable
            public final void run() {
                C3499e0.m17590j0(C3499e0.this);
            }
        });
    }

    /* renamed from: k0 */
    public final void m17625k0(AbstractC3512l abstractC3512l) {
        AbstractC19074t.m100208f(abstractC3512l, "listener");
        List list = this.f14661k;
        AbstractC19074t.m100207e(list, "mMsCollectionListeners");
        synchronized (list) {
            this.f14661k.add(abstractC3512l);
        }
    }

    /* renamed from: l0 */
    public final void m17626l0(C3521p0.d dVar) {
        AbstractC19074t.m100208f(dVar, "listener");
        synchronized (this.f14660j) {
            this.f14660j.add(new WeakReference(dVar));
        }
    }

    /* renamed from: m0 */
    public final void m17627m0(AbstractC3501f0 abstractC3501f0) {
        AbstractC19074t.m100208f(abstractC3501f0, "mediaStoreListener");
        synchronized (this.f14659i) {
            this.f14659i.add(abstractC3501f0);
        }
    }

    /* renamed from: n */
    public final void m17628n(EnumC2382z enumC2382z, List list) {
        AbstractC19074t.m100208f(enumC2382z, "mediaStoreType");
        AbstractC19074t.m100208f(list, "rolledIds");
        synchronized (this.f14659i) {
            try {
                Iterator it = this.f14659i.iterator();
                while (it.hasNext()) {
                    ((AbstractC3501f0) it.next()).mo17661c(m17608M(), enumC2382z, list);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: n0 */
    public final C3526u m17629n0(String str, MediaStoreSearchPage.EnumC12391a enumC12391a) {
        AbstractC19074t.m100208f(str, "input");
        AbstractC19074t.m100208f(enumC12391a, "searchMode");
        C3526u c3526u = this.f14658h;
        if (c3526u != null) {
            c3526u.m17864y(1);
            if (!AbstractC19074t.m100204b(c3526u.f14803a, str) || c3526u.m17849h() != enumC12391a) {
                c3526u.f14803a = str;
                c3526u.m17861v(enumC12391a);
                c3526u.m17857r();
            }
            c3526u.m17864y(0);
        }
        C3526u c3526u2 = this.f14658h;
        if (c3526u2 == null) {
            C3526u c3526u3 = new C3526u(str, m17608M(), enumC12391a);
            this.f14658h = c3526u3;
            return c3526u3;
        }
        return c3526u2;
    }

    /* renamed from: o */
    public final void m17630o(EnumC2382z enumC2382z, C3510k c3510k, C20096c c20096c) {
        AbstractC19074t.m100208f(enumC2382z, "mediaStoreType");
        List list = this.f14661k;
        AbstractC19074t.m100207e(list, "mMsCollectionListeners");
        synchronized (list) {
            try {
                Iterator it = this.f14661k.iterator();
                while (it.hasNext()) {
                    ((AbstractC3512l) it.next()).mo17753c(m17608M(), enumC2382z, c3510k, c20096c);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: o0 */
    public final void m17631o0(Object obj) {
        m17581b0().add(obj);
    }

    /* renamed from: p */
    public final void m17632p(String str, EnumC2382z enumC2382z, C3510k c3510k) {
        AbstractC19074t.m100208f(str, "conversationId");
        AbstractC19074t.m100208f(enumC2382z, "mediaStoreType");
        List list = this.f14661k;
        AbstractC19074t.m100207e(list, "mMsCollectionListeners");
        synchronized (list) {
            try {
                Iterator it = this.f14661k.iterator();
                while (it.hasNext()) {
                    ((AbstractC3512l) it.next()).mo17754d(str, enumC2382z, c3510k);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: p0 */
    public final boolean m17633p0(C3508j.b bVar) {
        AbstractC19074t.m100208f(bVar, "collectionSubtype");
        C3510k m17655c = m17574V().m17655c(bVar);
        if (m17655c.m17744a1() && !m17655c.m17741X0() && m17655c.m17742Y0().isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: q0 */
    public final void m17634q0(AbstractC3512l abstractC3512l) {
        AbstractC19074t.m100208f(abstractC3512l, "listener");
        List list = this.f14661k;
        AbstractC19074t.m100207e(list, "mMsCollectionListeners");
        synchronized (list) {
            this.f14661k.remove(abstractC3512l);
        }
    }

    /* renamed from: r0 */
    public final void m17635r0(C3521p0.d dVar) {
        AbstractC19074t.m100208f(dVar, "listener");
        synchronized (this.f14660j) {
            try {
                Iterator it = this.f14660j.iterator();
                while (it.hasNext()) {
                    if (((WeakReference) it.next()).get() == dVar) {
                        it.remove();
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: s */
    public final void m17636s() {
        synchronized (this.f14659i) {
            try {
                Iterator it = this.f14659i.iterator();
                while (it.hasNext()) {
                    ((AbstractC3501f0) it.next()).mo17664f();
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: s0 */
    public final void m17637s0(AbstractC3501f0 abstractC3501f0) {
        AbstractC19074t.m100208f(abstractC3501f0, "mediaStoreListener");
        synchronized (this.f14659i) {
            this.f14659i.remove(abstractC3501f0);
        }
    }

    /* renamed from: t */
    public final void m17638t(EnumC2382z enumC2382z, C20096c c20096c, List list) {
        AbstractC19074t.m100208f(enumC2382z, "mediaStoreType");
        synchronized (this.f14659i) {
            try {
                Iterator it = this.f14659i.iterator();
                while (it.hasNext()) {
                    ((AbstractC3501f0) it.next()).mo17665g(m17608M(), enumC2382z, c20096c, list);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: t0 */
    public final void m17639t0(Object obj) {
        m17581b0().remove(obj);
    }

    /* renamed from: u */
    public final void m17640u(EnumC2382z enumC2382z) {
        AbstractC19074t.m100208f(enumC2382z, "mediaStoreType");
        synchronized (this.f14659i) {
            try {
                Iterator it = this.f14659i.iterator();
                while (it.hasNext()) {
                    ((AbstractC3501f0) it.next()).mo17666h(m17608M(), enumC2382z);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: u0 */
    public final void m17641u0(EnumC2382z enumC2382z, List list) {
        AbstractC19074t.m100208f(enumC2382z, "mediaType");
        AbstractC19074t.m100208f(list, "deletedMsgIds");
        List m17658f = m17574V().m17658f(list, enumC2382z);
        if (!m17658f.isEmpty()) {
            AbstractC23306f.m120638Z0().m101508a(new C18895d.a(m17658f));
            m17574V().m17654b();
            Iterator it = m17658f.iterator();
            while (it.hasNext()) {
                m17589j(enumC2382z, ((C3508j) it.next()).m17711w0());
            }
            m17591k(enumC2382z);
        }
    }

    /* renamed from: v */
    public final void m17642v(EnumC2382z enumC2382z) {
        AbstractC19074t.m100208f(enumC2382z, "mediaType");
        C3526u c3526u = this.f14658h;
        if (c3526u != null && c3526u.m17853l() == 0) {
            synchronized (this.f14660j) {
                try {
                    Iterator it = this.f14660j.iterator();
                    while (it.hasNext()) {
                        C3521p0.d dVar = (C3521p0.d) ((WeakReference) it.next()).get();
                        if (dVar != null) {
                            dVar.mo17803a(this, enumC2382z);
                        }
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: w */
    public final void m17643w(EnumC2381y enumC2381y) {
        AbstractC19074t.m100208f(enumC2381y, "mediaLayoutMode");
        m17577Y().m17678J(enumC2381y);
    }

    /* renamed from: x */
    public final void m17644x(EnumC2381y enumC2381y) {
        AbstractC19074t.m100208f(enumC2381y, "undoDeleteMediaLayoutMode");
        m17577Y().m17686U(enumC2381y);
    }
}
