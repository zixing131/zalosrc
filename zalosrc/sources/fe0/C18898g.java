package fe0;

import ag0.AbstractC0837p0;
import au.EnumC2363o;
import au.EnumC2382z;
import ci.AbstractC3498e;
import ci.C3499e0;
import ci.C3525t;
import ci.C3526u;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.p077ui.mediastore.search.MediaStoreSearchPage;
import dm.C18027a;
import fe0.C18898g;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import me0.C23250w4;
import mm0.AbstractC23350e;
import p185gc.AbstractC19383g;
import p300kk.C21753c;
import qm0.AbstractC25332a0;
import qm0.AbstractC25376w;
import sm0.AbstractC26327c;

/* renamed from: fe0.g */
/* loaded from: classes4.dex */
public final class C18898g extends AbstractC19383g {

    /* renamed from: fe0.g$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final C3499e0 f94342a;

        /* renamed from: b */
        private final C3526u f94343b;

        /* renamed from: c */
        private final EnumC2382z f94344c;

        /* renamed from: d */
        private final MediaStoreSearchPage.EnumC12391a f94345d;

        /* renamed from: e */
        private final long f94346e;

        /* renamed from: f */
        private final long f94347f;

        /* renamed from: g */
        private final boolean f94348g;

        public a(C3499e0 c3499e0, C3526u c3526u, EnumC2382z enumC2382z, MediaStoreSearchPage.EnumC12391a enumC12391a, long j11, long j12, boolean z11) {
            AbstractC19074t.m100208f(c3499e0, "mediaStore");
            AbstractC19074t.m100208f(enumC2382z, "mediaStoreType");
            AbstractC19074t.m100208f(enumC12391a, "searchMode");
            this.f94342a = c3499e0;
            this.f94343b = c3526u;
            this.f94344c = enumC2382z;
            this.f94345d = enumC12391a;
            this.f94346e = j11;
            this.f94347f = j12;
            this.f94348g = z11;
        }

        /* renamed from: a */
        public final C3499e0 m99081a() {
            return this.f94342a;
        }

        /* renamed from: b */
        public final EnumC2382z m99082b() {
            return this.f94344c;
        }

        /* renamed from: c */
        public final MediaStoreSearchPage.EnumC12391a m99083c() {
            return this.f94345d;
        }

        /* renamed from: d */
        public final C3526u m99084d() {
            return this.f94343b;
        }

        /* renamed from: e */
        public final boolean m99085e() {
            return this.f94348g;
        }

        public /* synthetic */ a(C3499e0 c3499e0, C3526u c3526u, EnumC2382z enumC2382z, MediaStoreSearchPage.EnumC12391a enumC12391a, long j11, long j12, boolean z11, int i11, AbstractC19060k abstractC19060k) {
            this(c3499e0, (i11 & 2) != 0 ? null : c3526u, enumC2382z, enumC12391a, (i11 & 16) != 0 ? 0L : j11, (i11 & 32) != 0 ? 0L : j12, (i11 & 64) != 0 ? true : z11);
        }
    }

    /* renamed from: fe0.g$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f94349a;

        static {
            int[] iArr = new int[MediaStoreSearchPage.EnumC12391a.values().length];
            try {
                iArr[MediaStoreSearchPage.EnumC12391a.f64469p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaStoreSearchPage.EnumC12391a.f64470q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f94349a = iArr;
        }
    }

    /* renamed from: fe0.g$c */
    /* loaded from: classes4.dex */
    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b(Long.valueOf(((MediaStoreItem) obj2).m40599m().m94974P4()), Long.valueOf(((MediaStoreItem) obj).m40599m().m94974P4()));
            return m135478b;
        }
    }

    /* renamed from: d */
    private final void m99076d(C3499e0 c3499e0, boolean z11, C21753c c21753c, EnumC2382z enumC2382z) {
        List m131187O0;
        List m112206b = c21753c.m112206b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : m112206b) {
            if (!((MediaStoreItem) obj).m40591g0()) {
                arrayList.add(obj);
            }
        }
        m131187O0 = AbstractC25332a0.m131187O0(arrayList);
        C3526u m17610O = c3499e0.m17610O();
        if (m17610O == null) {
            return;
        }
        AbstractC3498e m17846e = m17610O.m17846e(enumC2382z);
        if (!z11) {
            m17846e.mo17553f();
            m17610O.m17847f().clear();
        }
        if (m131187O0.isEmpty()) {
            c3499e0.m17642v(enumC2382z);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        if (m131187O0.size() > 1) {
            AbstractC25376w.m131534w(m131187O0, new c());
        }
        int size = m131187O0.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 != m131187O0.size() - 1) {
                MediaStoreItem mediaStoreItem = (MediaStoreItem) m131187O0.get(i11);
                MediaStoreItem mediaStoreItem2 = (MediaStoreItem) m131187O0.get(i11 + 1);
                if (!C23250w4.m119793U(mediaStoreItem, mediaStoreItem2)) {
                    arrayList2.add(mediaStoreItem);
                    m17846e.m17551c(EnumC2363o.f9889p, C23250w4.f112644a.m119830c(arrayList2, mediaStoreItem, m17610O.m17847f(), false, enumC2382z), true, true, C3499e0.Companion.m17646b());
                    arrayList2.clear();
                } else if (C23250w4.m119790R(mediaStoreItem, mediaStoreItem2)) {
                    arrayList2.add(mediaStoreItem);
                } else {
                    arrayList2.add(mediaStoreItem);
                    m17846e.m17551c(EnumC2363o.f9889p, C23250w4.f112644a.m119830c(arrayList2, mediaStoreItem, m17610O.m17847f(), false, enumC2382z), true, true, C3499e0.Companion.m17646b());
                    arrayList2.clear();
                }
            } else {
                arrayList2.add(m131187O0.get(i11));
            }
        }
        if (arrayList2.size() > 0) {
            m17846e.m17551c(EnumC2363o.f9889p, C23250w4.f112644a.m119830c(arrayList2, (MediaStoreItem) arrayList2.get(0), m17610O.m17847f(), false, enumC2382z), true, true, C3499e0.Companion.m17646b());
            arrayList2.clear();
        }
        m17846e.m17549H();
        c3499e0.m17642v(enumC2382z);
    }

    /* renamed from: f */
    public static final void m99077f(C3526u c3526u, a aVar, C18898g c18898g) {
        C21753c m99078g;
        AbstractC19074t.m100208f(c3526u, "$searchResultCollection");
        AbstractC19074t.m100208f(aVar, "$params");
        AbstractC19074t.m100208f(c18898g, "this$0");
        try {
            AbstractC3498e m17846e = c3526u.m17846e(aVar.m99082b());
            if ((aVar.m99085e() && !m17846e.m17556i()) || m17846e.m17567u()) {
                return;
            }
            boolean z11 = true;
            m17846e.m17547D(true);
            if (!aVar.m99085e()) {
                m17846e.m17548E(0);
            }
            int m17562o = m17846e.m17562o();
            int i11 = b.f94349a[aVar.m99083c().ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    m99078g = c18898g.m99079h(aVar.m99081a(), c3526u, aVar.m99082b(), m17562o);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                m99078g = c18898g.m99078g(aVar.m99081a(), c3526u, aVar.m99082b(), m17562o);
            }
            c18898g.m99076d(aVar.m99081a(), aVar.m99085e(), m99078g, aVar.m99082b());
            m17846e.m17548E(m99078g.m112207c());
            if (m99078g.m112207c() - m17562o != 40) {
                z11 = false;
            }
            m17846e.m17545B(z11);
            m17846e.m17547D(false);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: g */
    private final C21753c m99078g(C3499e0 c3499e0, C3526u c3526u, EnumC2382z enumC2382z, int i11) {
        return C18027a.Companion.m95862a().m95858l(c3526u.f14803a, c3499e0.m17608M(), null, enumC2382z, i11, 40, null);
    }

    /* renamed from: h */
    private final C21753c m99079h(C3499e0 c3499e0, C3526u c3526u, EnumC2382z enumC2382z, int i11) {
        try {
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        if (c3526u.m17850i() == null) {
            return new C21753c(i11);
        }
        C3525t m17850i = c3526u.m17850i();
        if (m17850i != null) {
            return C18027a.Companion.m95862a().m95859m(c3499e0.m17608M(), enumC2382z, m17850i.m17837b(), m17850i.m17836a(), i11, 40);
        }
        return new C21753c(i11);
    }

    @Override // p185gc.AbstractC19383g
    /* renamed from: e */
    public void mo12006b(a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        C3526u m99084d = aVar.m99084d();
        if (m99084d == null) {
            return;
        }
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: fe0.f

            /* renamed from: q */
            public final /* synthetic */ C18898g.a f94340q;

            /* renamed from: r */
            public final /* synthetic */ C18898g f94341r;

            public /* synthetic */ RunnableC18897f(C18898g.a aVar2, C18898g this) {
                r2 = aVar2;
                r3 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C18898g.m99077f(C3526u.this, r2, r3);
            }
        });
    }
}
