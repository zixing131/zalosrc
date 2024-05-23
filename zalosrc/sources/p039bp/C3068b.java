package p039bp;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1754a;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1798u0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.C1780l0;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.TrackingSource;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import es.AbstractC18591b;
import es.C18593d;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p089d2.InterfaceC17712d;
import p167fs.C19137b;
import p167fs.C19140e;
import p205hc.AbstractC19963b;
import p205hc.C19964c;
import p691yr.AbstractC31052b;
import p691yr.C31060j;
import p691yr.EnumC31051a;
import p716zh.C32002l4;
import p716zh.C32017m4;
import p726zr.C32547c;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: bp.b */
/* loaded from: classes4.dex */
public final class C3068b extends AbstractC19963b {

    /* renamed from: t */
    private final C1780l0 f12435t;

    /* renamed from: u */
    private final InterfaceC24854k f12436u;

    /* renamed from: v */
    private final C1761c0 f12437v;

    /* renamed from: bp.b$a */
    /* loaded from: classes4.dex */
    public interface a {
    }

    /* renamed from: bp.b$b */
    /* loaded from: classes4.dex */
    public static final class b implements a {

        /* renamed from: a */
        private final String f12438a;

        /* renamed from: b */
        private final C32547c f12439b;

        /* renamed from: c */
        private final boolean f12440c;

        public b(String str, C32547c c32547c, boolean z11) {
            AbstractC19074t.m100208f(str, "photoId");
            AbstractC19074t.m100208f(c32547c, "reactInfoResult");
            this.f12438a = str;
            this.f12439b = c32547c;
            this.f12440c = z11;
        }

        /* renamed from: a */
        public final String m14782a() {
            return this.f12438a;
        }

        /* renamed from: b */
        public final C32547c m14783b() {
            return this.f12439b;
        }

        /* renamed from: c */
        public final boolean m14784c() {
            return this.f12440c;
        }
    }

    /* renamed from: bp.b$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC1754a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC17712d interfaceC17712d, Bundle bundle) {
            super(interfaceC17712d, bundle);
            AbstractC19074t.m100208f(interfaceC17712d, "owner");
        }

        @Override // androidx.lifecycle.AbstractC1754a
        /* renamed from: e */
        protected AbstractC1796t0 mo9255e(String str, Class cls, C1780l0 c1780l0) {
            AbstractC19074t.m100208f(str, "key");
            AbstractC19074t.m100208f(cls, "modelClass");
            AbstractC19074t.m100208f(c1780l0, "handle");
            if (cls.isAssignableFrom(C3068b.class)) {
                return new C3068b(c1780l0);
            }
            throw new IllegalArgumentException("Unknown ViewModel class: " + cls.getName());
        }
    }

    /* renamed from: bp.b$d */
    /* loaded from: classes4.dex */
    public static final class d implements a {

        /* renamed from: a */
        private final ItemAlbumMobile f12441a;

        /* renamed from: b */
        private final int f12442b;

        /* renamed from: c */
        private final int f12443c;

        /* renamed from: d */
        private final int f12444d;

        /* renamed from: e */
        private final List f12445e;

        public d(ItemAlbumMobile itemAlbumMobile, int i11, int i12, int i13, List list) {
            AbstractC19074t.m100208f(itemAlbumMobile, "photoItem");
            AbstractC19074t.m100208f(list, "listReactionDrawable");
            this.f12441a = itemAlbumMobile;
            this.f12442b = i11;
            this.f12443c = i12;
            this.f12444d = i13;
            this.f12445e = list;
        }

        /* renamed from: a */
        public final List m14785a() {
            return this.f12445e;
        }

        /* renamed from: b */
        public final int m14786b() {
            return this.f12444d;
        }

        /* renamed from: c */
        public final int m14787c() {
            return this.f12442b;
        }

        /* renamed from: d */
        public final int m14788d() {
            return this.f12443c;
        }
    }

    /* renamed from: bp.b$e */
    /* loaded from: classes4.dex */
    public static final class e implements a {

        /* renamed from: a */
        private final String f12446a;

        public e(String str) {
            AbstractC19074t.m100208f(str, "message");
            this.f12446a = str;
        }

        /* renamed from: a */
        public final String m14789a() {
            return this.f12446a;
        }
    }

    /* renamed from: bp.b$f */
    /* loaded from: classes4.dex */
    public static final class f implements a {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bp.b$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f12447t;

        /* renamed from: u */
        final /* synthetic */ AbstractC18591b.a f12448u;

        /* renamed from: v */
        final /* synthetic */ C3068b f12449v;

        /* renamed from: w */
        final /* synthetic */ String f12450w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(AbstractC18591b.a aVar, C3068b c3068b, String str, Continuation continuation) {
            super(2, continuation);
            this.f12448u = aVar;
            this.f12449v = c3068b;
            this.f12450w = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new g(this.f12448u, this.f12449v, this.f12450w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f12447t == 0) {
                AbstractC24862s.m129228b(obj);
                AbstractC18591b.a aVar = this.f12448u;
                if (!(aVar instanceof AbstractC18591b.a.c)) {
                    this.f12449v.m14777W(this.f12450w, aVar.mo98147a(), this.f12448u instanceof AbstractC18591b.a.d);
                }
                AbstractC18591b.a aVar2 = this.f12448u;
                if (aVar2 instanceof AbstractC18591b.a.C32819a) {
                    this.f12449v.m14776V(C19140e.f95172a.m100452b(((AbstractC18591b.a.C32819a) aVar2).m98148b()));
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bp.b$h */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f12451t;

        /* renamed from: v */
        final /* synthetic */ String f12453v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, Continuation continuation) {
            super(2, continuation);
            this.f12453v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new h(this.f12453v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f12451t == 0) {
                AbstractC24862s.m129228b(obj);
                C3068b.this.m14778T().mo9224q(new C19964c(new e(this.f12453v)));
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bp.b$i */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f12454t;

        /* renamed from: v */
        final /* synthetic */ String f12456v;

        /* renamed from: w */
        final /* synthetic */ C32547c f12457w;

        /* renamed from: x */
        final /* synthetic */ boolean f12458x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, C32547c c32547c, boolean z11, Continuation continuation) {
            super(2, continuation);
            this.f12456v = str;
            this.f12457w = c32547c;
            this.f12458x = z11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new i(this.f12456v, this.f12457w, this.f12458x, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f12454t == 0) {
                AbstractC24862s.m129228b(obj);
                C3068b.this.m14778T().mo9224q(new C19964c(new b(this.f12456v, this.f12457w, this.f12458x)));
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: bp.b$j */
    /* loaded from: classes4.dex */
    static final class j extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f12459t;

        /* renamed from: u */
        final /* synthetic */ ItemAlbumMobile f12460u;

        /* renamed from: v */
        final /* synthetic */ C32002l4 f12461v;

        /* renamed from: w */
        final /* synthetic */ C3068b f12462w;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: bp.b$j$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C3068b f12463p;

            /* renamed from: q */
            final /* synthetic */ ItemAlbumMobile f12464q;

            a(C3068b c3068b, ItemAlbumMobile itemAlbumMobile) {
                this.f12463p = c3068b;
                this.f12464q = itemAlbumMobile;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC18591b.a aVar, Continuation continuation) {
                C3068b c3068b = this.f12463p;
                String str = this.f12464q.f42595r;
                AbstractC19074t.m100207e(str, "picid");
                c3068b.m14775U(str, aVar);
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(ItemAlbumMobile itemAlbumMobile, C32002l4 c32002l4, C3068b c3068b, Continuation continuation) {
            super(2, continuation);
            this.f12460u = itemAlbumMobile;
            this.f12461v = c32002l4;
            this.f12462w = c3068b;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new j(this.f12460u, this.f12461v, this.f12462w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Object bVar;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f12459t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                boolean m100204b = AbstractC19074t.m100204b(this.f12460u.f42552E, "1");
                TrackingSource m154334F = C32017m4.m154326S().m154334F(this.f12461v, !m100204b);
                if (m154334F != null) {
                    C19137b c19137b = C19137b.f95167a;
                    c19137b.m100439a(m154334F, c19137b.m100441c(this.f12460u));
                }
                if (m100204b) {
                    ItemAlbumMobile itemAlbumMobile = this.f12460u;
                    if (m154334F == null) {
                        m154334F = new TrackingSource(-1);
                    }
                    bVar = new C18593d.d(itemAlbumMobile, m154334F);
                } else {
                    ItemAlbumMobile itemAlbumMobile2 = this.f12460u;
                    if (m154334F == null) {
                        m154334F = new TrackingSource(-1);
                    }
                    bVar = new C18593d.b(itemAlbumMobile2, 1, m154334F);
                }
                C18593d m14774S = this.f12462w.m14774S();
                this.f12459t = 1;
                obj = m14774S.m101498a(bVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar = new a(this.f12462w, this.f12460u);
                this.f12459t = 2;
                if (flow.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: bp.b$k */
    /* loaded from: classes4.dex */
    static final class k extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f12465t;

        /* renamed from: u */
        final /* synthetic */ int f12466u;

        /* renamed from: v */
        final /* synthetic */ ItemAlbumMobile f12467v;

        /* renamed from: w */
        final /* synthetic */ C32002l4 f12468w;

        /* renamed from: x */
        final /* synthetic */ C3068b f12469x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: bp.b$k$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C3068b f12470p;

            /* renamed from: q */
            final /* synthetic */ ItemAlbumMobile f12471q;

            a(C3068b c3068b, ItemAlbumMobile itemAlbumMobile) {
                this.f12470p = c3068b;
                this.f12471q = itemAlbumMobile;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC18591b.a aVar, Continuation continuation) {
                C3068b c3068b = this.f12470p;
                String str = this.f12471q.f42595r;
                AbstractC19074t.m100207e(str, "picid");
                c3068b.m14775U(str, aVar);
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(int i11, ItemAlbumMobile itemAlbumMobile, C32002l4 c32002l4, C3068b c3068b, Continuation continuation) {
            super(2, continuation);
            this.f12466u = i11;
            this.f12467v = itemAlbumMobile;
            this.f12468w = c32002l4;
            this.f12469x = c3068b;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new k(this.f12466u, this.f12467v, this.f12468w, this.f12469x, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Object bVar;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f12465t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                int m150930F = C31060j.f143193a.m150930F(this.f12466u);
                boolean m100204b = AbstractC19074t.m100204b(this.f12467v.f42552E, "1");
                TrackingSource m154334F = C32017m4.m154326S().m154334F(this.f12468w, !m100204b);
                if (m154334F != null) {
                    C19137b c19137b = C19137b.f95167a;
                    c19137b.m100439a(m154334F, c19137b.m100443e(this.f12467v, m150930F));
                }
                if (m100204b) {
                    ItemAlbumMobile itemAlbumMobile = this.f12467v;
                    if (m154334F == null) {
                        m154334F = new TrackingSource(-1);
                    }
                    bVar = new C18593d.a(itemAlbumMobile, m150930F, m154334F);
                } else {
                    ItemAlbumMobile itemAlbumMobile2 = this.f12467v;
                    if (m154334F == null) {
                        m154334F = new TrackingSource(-1);
                    }
                    bVar = new C18593d.b(itemAlbumMobile2, m150930F, m154334F);
                }
                C18593d m14774S = this.f12469x.m14774S();
                this.f12465t = 1;
                obj = m14774S.m101498a(bVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar = new a(this.f12469x, this.f12467v);
                this.f12465t = 2;
                if (flow.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((k) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: bp.b$l */
    /* loaded from: classes4.dex */
    static final class l extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final l f12472q = new l();

        l() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C18593d mo12V4() {
            return new C18593d(null, 1, null);
        }
    }

    public C3068b(C1780l0 c1780l0) {
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(c1780l0, "savedStateHandle");
        this.f12435t = c1780l0;
        m129210a = AbstractC24856m.m129210a(l.f12472q);
        this.f12436u = m129210a;
        this.f12437v = new C1761c0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public final C18593d m14774S() {
        return (C18593d) this.f12436u.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public final void m14775U(String str, AbstractC18591b.a aVar) {
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new g(aVar, this, str, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public final void m14776V(String str) {
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new h(str, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public final void m14777W(String str, C32547c c32547c, boolean z11) {
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new i(str, c32547c, z11, null), 3, null);
    }

    /* renamed from: T */
    public final C1761c0 m14778T() {
        return this.f12437v;
    }

    /* renamed from: X */
    public final void m14779X(ItemAlbumMobile itemAlbumMobile, C32002l4 c32002l4) {
        AbstractC19074t.m100208f(itemAlbumMobile, "photoItem");
        AbstractC19074t.m100208f(c32002l4, "entryPointChain");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new j(itemAlbumMobile, c32002l4, this, null), 3, null);
    }

    /* renamed from: Y */
    public final void m14780Y(ItemAlbumMobile itemAlbumMobile, int i11, int i12, int i13) {
        AbstractC19074t.m100208f(itemAlbumMobile, "photoItem");
        EnumC31051a m150916c = C31060j.m150916c(itemAlbumMobile);
        if (AbstractC31052b.m150889b(m150916c)) {
            C1761c0 c1761c0 = this.f12437v;
            C31060j c31060j = C31060j.f143193a;
            c1761c0.mo9224q(new C19964c(new d(itemAlbumMobile, i11, i12, i13, c31060j.m150944q())));
            c31060j.m150942h();
            return;
        }
        if (AbstractC31052b.m150888a(m150916c)) {
            this.f12437v.mo9224q(new C19964c(new f()));
        }
    }

    /* renamed from: Z */
    public final void m14781Z(ItemAlbumMobile itemAlbumMobile, int i11, C32002l4 c32002l4) {
        AbstractC19074t.m100208f(itemAlbumMobile, "photoItem");
        AbstractC19074t.m100208f(c32002l4, "entryPointChain");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new k(i11, itemAlbumMobile, c32002l4, this, null), 3, null);
    }
}
