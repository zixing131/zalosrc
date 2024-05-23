package ci;

import ag0.AbstractC0837p0;
import android.text.TextUtils;
import au.EnumC2363o;
import au.EnumC2381y;
import au.EnumC2382z;
import bg0.C2797c;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.control.mediastore.CreateMediaStoreParam;
import com.zing.zalo.data.entity.chat.message.MessageId;
import dg0.AbstractC17930e;
import dj.C17945a0;
import en0.InterfaceC18494a;
import fe0.C18896e;
import fe0.C18902k;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gw.AbstractC19646n0;
import hm0.C20096c;
import i60.C20338d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import me0.C23250w4;
import mm0.AbstractC23350e;
import p239ih.C20556f;
import p241ij.C20568e;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;

/* renamed from: ci.p0 */
/* loaded from: classes3.dex */
public final class C3521p0 implements C23744a.c {
    public static final a Companion = new a(null);

    /* renamed from: r */
    private static final C20096c f14770r = new C20096c(0, "");

    /* renamed from: s */
    private static final C20096c f14771s = new C20096c(502, "");

    /* renamed from: p */
    private final ConcurrentHashMap f14772p;

    /* renamed from: q */
    private final InterfaceC24854k f14773q;

    /* renamed from: ci.p0$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C3521p0 m17796a() {
            return b.f14774a.m17799a();
        }

        /* renamed from: b */
        public final C20096c m17797b() {
            return C3521p0.f14770r;
        }

        /* renamed from: c */
        public final C20096c m17798c() {
            return C3521p0.f14771s;
        }
    }

    /* renamed from: ci.p0$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        public static final b f14774a = new b();

        /* renamed from: b */
        private static final C3521p0 f14775b = new C3521p0(null);

        private b() {
        }

        /* renamed from: a */
        public final C3521p0 m17799a() {
            return f14775b;
        }
    }

    /* renamed from: ci.p0$c */
    /* loaded from: classes3.dex */
    public interface c {
        /* renamed from: a */
        void mo17800a(MediaStoreItem mediaStoreItem, C20556f c20556f);

        /* renamed from: b */
        void mo17801b(MediaStoreItem mediaStoreItem, boolean z11);

        /* renamed from: c */
        String mo17802c();
    }

    /* renamed from: ci.p0$d */
    /* loaded from: classes3.dex */
    public interface d {
        /* renamed from: a */
        void mo17803a(C3499e0 c3499e0, EnumC2382z enumC2382z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ci.p0$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final e f14776q = new e();

        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C2797c mo12V4() {
            return new C2797c(AbstractC0837p0.Companion.m2237f());
        }
    }

    public /* synthetic */ C3521p0(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: f */
    public static final void m17777f() {
        C23250w4 c23250w4 = C23250w4.f112644a;
        c23250w4.m119843q();
        c23250w4.m119844s();
        AbstractC23309i.m121411S8();
    }

    /* renamed from: k */
    public static final void m17780k(C3499e0 c3499e0, EnumC2381y enumC2381y) {
        AbstractC19074t.m100208f(c3499e0, "$mediaStore");
        AbstractC19074t.m100208f(enumC2381y, "$targetLayoutMode");
        c3499e0.m17643w(enumC2381y);
        c3499e0.m17644x(enumC2381y);
        c3499e0.m17636s();
    }

    /* renamed from: m */
    public static final void m17781m(int i11, Object[] objArr) {
        boolean z11;
        String str;
        AbstractC19074t.m100208f(objArr, "$args");
        try {
            if (i11 != 9) {
                if (i11 == 93 && objArr.length >= 2) {
                    String str2 = (String) objArr[0];
                    C17945a0 c17945a0 = (C17945a0) objArr[1];
                    if (str2 != null && c17945a0 != null && AbstractC19646n0.m103023r1(c17945a0)) {
                        AbstractC23306f.m120615R1().m101508a(new C18902k.a(c17945a0));
                        return;
                    }
                    return;
                }
                return;
            }
            if (objArr.length == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                Object obj = objArr[0];
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type com.zing.zalo.ui.chat.transfer.EventMessageUndoParam");
                C20338d c20338d = (C20338d) obj;
                int m106049g = c20338d.m106049g();
                C17945a0 m106046d = c20338d.m106046d();
                MessageId m106047e = c20338d.m106047e();
                C20568e m106048f = c20338d.m106048f();
                if (m106048f == null && m106047e != null) {
                    if (m106046d != null) {
                        str = m106046d.mo95039W2();
                        if (str == null) {
                        }
                        m106048f = new C20568e(m106047e, str, m106049g, true, false, false, null, 64, null);
                    }
                    str = "0";
                    m106048f = new C20568e(m106047e, str, m106049g, true, false, false, null, 64, null);
                }
                AbstractC23306f.m120662f1().m101508a(new C18896e.a(m106046d, m106047e, m106048f));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: o */
    public static final C3521p0 m17782o() {
        return Companion.m17796a();
    }

    /* renamed from: r */
    private final C3499e0 m17783r(CreateMediaStoreParam createMediaStoreParam) {
        String m17645a = C3499e0.Companion.m17645a(createMediaStoreParam);
        C3499e0 c3499e0 = (C3499e0) this.f14772p.get(m17645a);
        if (c3499e0 == null) {
            C3499e0 c3499e02 = new C3499e0(createMediaStoreParam);
            c3499e02.m17621f0();
            C3499e0 c3499e03 = (C3499e0) this.f14772p.putIfAbsent(m17645a, c3499e02);
            if (c3499e03 != null) {
                return c3499e03;
            }
            return c3499e02;
        }
        return c3499e0;
    }

    /* renamed from: s */
    private final void m17784s() {
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124115b(this, 9);
        bVar.m124119a().m124115b(this, 93);
    }

    /* renamed from: u */
    public static final void m17785u(C3521p0 c3521p0, String str) {
        AbstractC19074t.m100208f(c3521p0, "this$0");
        synchronized (c3521p0) {
            try {
                Iterator it = c3521p0.m17790n(str).iterator();
                while (it.hasNext()) {
                    c3521p0.f14772p.remove(((C3499e0) it.next()).m17614S());
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: w */
    public static final void m17786w(C3521p0 c3521p0, C3499e0 c3499e0, Object obj) {
        AbstractC19074t.m100208f(c3521p0, "this$0");
        AbstractC19074t.m100208f(c3499e0, "$mediaStore");
        synchronized (c3521p0) {
            c3499e0.m17639t0(obj);
            c3521p0.m17787i();
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: i */
    public final void m17787i() {
        Map.Entry entry;
        synchronized (this) {
            while (this.f14772p.size() > 5) {
                try {
                    Iterator it = this.f14772p.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            entry = (Map.Entry) it.next();
                            Object value = entry.getValue();
                            AbstractC19074t.m100207e(value, "<get-value>(...)");
                            if (!((C3499e0) value).m17619e0()) {
                                break;
                            }
                        } else {
                            entry = null;
                            break;
                        }
                    }
                    if (entry == null) {
                        break;
                    } else {
                        this.f14772p.remove(entry.getKey());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: j */
    public final void m17788j(EnumC2381y enumC2381y) {
        AbstractC19074t.m100208f(enumC2381y, "targetLayoutMode");
        synchronized (this) {
            try {
                Iterator it = this.f14772p.values().iterator();
                while (it.hasNext()) {
                    AbstractC17930e.Companion.m94551d().mo94528b(new Runnable() { // from class: ci.n0

                        /* renamed from: q */
                        public final /* synthetic */ EnumC2381y f14750q;

                        public /* synthetic */ RunnableC3517n0(EnumC2381y enumC2381y2) {
                            r2 = enumC2381y2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C3521p0.m17780k(C3499e0.this, r2);
                        }
                    });
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: l */
    public final void m17789l() {
        synchronized (this) {
            try {
                Collection<C3499e0> values = this.f14772p.values();
                AbstractC19074t.m100207e(values, "<get-values>(...)");
                for (C3499e0 c3499e0 : values) {
                    c3499e0.m17600C();
                    c3499e0.m17599B();
                    c3499e0.m17601D();
                }
                this.f14772p.clear();
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C3509j0.m17728n();
        C3516n.f14745a.m17759b();
    }

    /* renamed from: n */
    public final List m17790n(String str) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f14772p) {
            try {
                Collection values = this.f14772p.values();
                AbstractC19074t.m100207e(values, "<get-values>(...)");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : values) {
                    if (TextUtils.equals(str, ((C3499e0) obj).m17608M())) {
                        arrayList2.add(obj);
                    }
                }
                arrayList.addAll(arrayList2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    /* renamed from: p */
    public final C3499e0 m17791p(CreateMediaStoreParam createMediaStoreParam) {
        AbstractC19074t.m100208f(createMediaStoreParam, "createMediaStoreParam");
        if (createMediaStoreParam.m40910c() == EnumC2363o.f9889p) {
            return m17783r(createMediaStoreParam);
        }
        C3508j m17607L = m17783r(new CreateMediaStoreParam(createMediaStoreParam.m40908a(), null, null, 6, null)).m17607L(createMediaStoreParam);
        if (m17607L != null) {
            return m17607L;
        }
        return m17783r(createMediaStoreParam);
    }

    /* renamed from: q */
    public final C3499e0 m17792q(String str) {
        AbstractC19074t.m100208f(str, "conversationId");
        return m17783r(new CreateMediaStoreParam(str, null, null, 6, null));
    }

    /* renamed from: t */
    public final void m17793t(String str) {
        AbstractC17930e.Companion.m94551d().mo94528b(new Runnable() { // from class: ci.o0

            /* renamed from: q */
            public final /* synthetic */ String f14765q;

            public /* synthetic */ RunnableC3519o0(String str2) {
                r2 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C3521p0.m17785u(C3521p0.this, r2);
            }
        });
    }

    /* renamed from: v */
    public final void m17794v(C3499e0 c3499e0, Object obj) {
        AbstractC19074t.m100208f(c3499e0, "mediaStore");
        AbstractC17930e.Companion.m94551d().mo94528b(new Runnable() { // from class: ci.m0

            /* renamed from: q */
            public final /* synthetic */ C3499e0 f14743q;

            /* renamed from: r */
            public final /* synthetic */ Object f14744r;

            public /* synthetic */ RunnableC3515m0(C3499e0 c3499e02, Object obj2) {
                r2 = c3499e02;
                r3 = obj2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C3521p0.m17786w(C3521p0.this, r2, r3);
            }
        });
    }

    @Override // p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        AbstractC17930e.Companion.m94551d().mo94528b(new Runnable() { // from class: ci.l0

            /* renamed from: p */
            public final /* synthetic */ int f14738p;

            /* renamed from: q */
            public final /* synthetic */ Object[] f14739q;

            public /* synthetic */ RunnableC3513l0(int i112, Object[] objArr2) {
                r1 = i112;
                r2 = objArr2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C3521p0.m17781m(r1, r2);
            }
        });
    }

    private C3521p0() {
        InterfaceC24854k m129210a;
        this.f14772p = new ConcurrentHashMap(5, 0.75f, 1);
        m129210a = AbstractC24856m.m129210a(e.f14776q);
        this.f14773q = m129210a;
        m17784s();
        AbstractC17930e.Companion.m94551d().mo94528b(new Runnable() { // from class: ci.k0
            @Override // java.lang.Runnable
            public final void run() {
                C3521p0.m17777f();
            }
        });
    }
}
