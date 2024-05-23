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
import p716zh.C31987k4;
import p716zh.C32002l4;
import p716zh.C32017m4;
import p726zr.C32547c;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: bp.a */
/* loaded from: classes4.dex */
public final class C3067a extends AbstractC19963b {

    /* renamed from: t */
    private final C1780l0 f12397t;

    /* renamed from: u */
    private final InterfaceC24854k f12398u;

    /* renamed from: v */
    private final C1761c0 f12399v;

    /* renamed from: bp.a$a */
    /* loaded from: classes4.dex */
    public interface a {
    }

    /* renamed from: bp.a$b */
    /* loaded from: classes4.dex */
    public static final class b implements a {

        /* renamed from: a */
        private final String f12400a;

        /* renamed from: b */
        private final C32547c f12401b;

        /* renamed from: c */
        private final boolean f12402c;

        public b(String str, C32547c c32547c, boolean z11) {
            AbstractC19074t.m100208f(str, "photoId");
            AbstractC19074t.m100208f(c32547c, "reactInfoResult");
            this.f12400a = str;
            this.f12401b = c32547c;
            this.f12402c = z11;
        }

        /* renamed from: a */
        public final String m14754a() {
            return this.f12400a;
        }

        /* renamed from: b */
        public final C32547c m14755b() {
            return this.f12401b;
        }

        /* renamed from: c */
        public final boolean m14756c() {
            return this.f12402c;
        }
    }

    /* renamed from: bp.a$c */
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
            if (cls.isAssignableFrom(C3067a.class)) {
                return new C3067a(c1780l0);
            }
            throw new IllegalArgumentException("Unknown ViewModel class: " + cls.getName());
        }
    }

    /* renamed from: bp.a$d */
    /* loaded from: classes4.dex */
    public static final class d implements a {

        /* renamed from: a */
        private final ItemAlbumMobile f12403a;

        /* renamed from: b */
        private final int f12404b;

        /* renamed from: c */
        private final int f12405c;

        /* renamed from: d */
        private final int f12406d;

        /* renamed from: e */
        private final List f12407e;

        public d(ItemAlbumMobile itemAlbumMobile, int i11, int i12, int i13, List list) {
            AbstractC19074t.m100208f(itemAlbumMobile, "photoItem");
            AbstractC19074t.m100208f(list, "listReactionDrawable");
            this.f12403a = itemAlbumMobile;
            this.f12404b = i11;
            this.f12405c = i12;
            this.f12406d = i13;
            this.f12407e = list;
        }

        /* renamed from: a */
        public final List m14757a() {
            return this.f12407e;
        }

        /* renamed from: b */
        public final int m14758b() {
            return this.f12406d;
        }

        /* renamed from: c */
        public final int m14759c() {
            return this.f12404b;
        }

        /* renamed from: d */
        public final int m14760d() {
            return this.f12405c;
        }
    }

    /* renamed from: bp.a$e */
    /* loaded from: classes4.dex */
    public static final class e implements a {
    }

    /* renamed from: bp.a$f */
    /* loaded from: classes4.dex */
    public static final class f implements a {

        /* renamed from: a */
        private final String f12408a;

        public f(String str) {
            AbstractC19074t.m100208f(str, "message");
            this.f12408a = str;
        }

        /* renamed from: a */
        public final String m14761a() {
            return this.f12408a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bp.a$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f12409t;

        /* renamed from: u */
        final /* synthetic */ AbstractC18591b.a f12410u;

        /* renamed from: v */
        final /* synthetic */ C3067a f12411v;

        /* renamed from: w */
        final /* synthetic */ String f12412w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(AbstractC18591b.a aVar, C3067a c3067a, String str, Continuation continuation) {
            super(2, continuation);
            this.f12410u = aVar;
            this.f12411v = c3067a;
            this.f12412w = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new g(this.f12410u, this.f12411v, this.f12412w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f12409t == 0) {
                AbstractC24862s.m129228b(obj);
                AbstractC18591b.a aVar = this.f12410u;
                if (!(aVar instanceof AbstractC18591b.a.c)) {
                    this.f12411v.m14748X(this.f12412w, aVar.mo98147a(), this.f12410u instanceof AbstractC18591b.a.d);
                }
                AbstractC18591b.a aVar2 = this.f12410u;
                if (aVar2 instanceof AbstractC18591b.a.C32819a) {
                    this.f12411v.m14747W(C19140e.f95172a.m100452b(((AbstractC18591b.a.C32819a) aVar2).m98148b()));
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
    /* renamed from: bp.a$h */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f12413t;

        /* renamed from: v */
        final /* synthetic */ String f12415v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, Continuation continuation) {
            super(2, continuation);
            this.f12415v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new h(this.f12415v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f12413t == 0) {
                AbstractC24862s.m129228b(obj);
                C3067a.this.m14750U().mo9224q(new C19964c(new f(this.f12415v)));
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
    /* renamed from: bp.a$i */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f12416t;

        /* renamed from: v */
        final /* synthetic */ String f12418v;

        /* renamed from: w */
        final /* synthetic */ C32547c f12419w;

        /* renamed from: x */
        final /* synthetic */ boolean f12420x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, C32547c c32547c, boolean z11, Continuation continuation) {
            super(2, continuation);
            this.f12418v = str;
            this.f12419w = c32547c;
            this.f12420x = z11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new i(this.f12418v, this.f12419w, this.f12420x, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f12416t == 0) {
                AbstractC24862s.m129228b(obj);
                C3067a.this.m14750U().mo9224q(new C19964c(new b(this.f12418v, this.f12419w, this.f12420x)));
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

    /* renamed from: bp.a$j */
    /* loaded from: classes4.dex */
    static final class j extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f12421t;

        /* renamed from: u */
        final /* synthetic */ ItemAlbumMobile f12422u;

        /* renamed from: v */
        final /* synthetic */ TrackingSource f12423v;

        /* renamed from: w */
        final /* synthetic */ C3067a f12424w;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: bp.a$j$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C3067a f12425p;

            /* renamed from: q */
            final /* synthetic */ ItemAlbumMobile f12426q;

            a(C3067a c3067a, ItemAlbumMobile itemAlbumMobile) {
                this.f12425p = c3067a;
                this.f12426q = itemAlbumMobile;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC18591b.a aVar, Continuation continuation) {
                C3067a c3067a = this.f12425p;
                String str = this.f12426q.f42595r;
                AbstractC19074t.m100207e(str, "picid");
                c3067a.m14746V(str, aVar);
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(ItemAlbumMobile itemAlbumMobile, TrackingSource trackingSource, C3067a c3067a, Continuation continuation) {
            super(2, continuation);
            this.f12422u = itemAlbumMobile;
            this.f12423v = trackingSource;
            this.f12424w = c3067a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new j(this.f12422u, this.f12423v, this.f12424w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Object bVar;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f12421t;
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
                boolean m100204b = AbstractC19074t.m100204b(this.f12422u.f42552E, "1");
                TrackingSource trackingSource = this.f12423v;
                if (trackingSource != null) {
                    C19137b c19137b = C19137b.f95167a;
                    c19137b.m100439a(trackingSource, c19137b.m100441c(this.f12422u));
                }
                if (m100204b) {
                    ItemAlbumMobile itemAlbumMobile = this.f12422u;
                    TrackingSource trackingSource2 = this.f12423v;
                    if (trackingSource2 == null) {
                        trackingSource2 = new TrackingSource(-1);
                    }
                    bVar = new C18593d.d(itemAlbumMobile, trackingSource2);
                } else {
                    ItemAlbumMobile itemAlbumMobile2 = this.f12422u;
                    TrackingSource trackingSource3 = this.f12423v;
                    if (trackingSource3 == null) {
                        trackingSource3 = new TrackingSource(-1);
                    }
                    bVar = new C18593d.b(itemAlbumMobile2, 1, trackingSource3);
                }
                C18593d m14745S = this.f12424w.m14745S();
                this.f12421t = 1;
                obj = m14745S.m101498a(bVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar = new a(this.f12424w, this.f12422u);
                this.f12421t = 2;
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

    /* renamed from: bp.a$k */
    /* loaded from: classes4.dex */
    static final class k extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f12427t;

        /* renamed from: u */
        final /* synthetic */ int f12428u;

        /* renamed from: v */
        final /* synthetic */ ItemAlbumMobile f12429v;

        /* renamed from: w */
        final /* synthetic */ TrackingSource f12430w;

        /* renamed from: x */
        final /* synthetic */ C3067a f12431x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: bp.a$k$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C3067a f12432p;

            /* renamed from: q */
            final /* synthetic */ ItemAlbumMobile f12433q;

            a(C3067a c3067a, ItemAlbumMobile itemAlbumMobile) {
                this.f12432p = c3067a;
                this.f12433q = itemAlbumMobile;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC18591b.a aVar, Continuation continuation) {
                C3067a c3067a = this.f12432p;
                String str = this.f12433q.f42595r;
                AbstractC19074t.m100207e(str, "picid");
                c3067a.m14746V(str, aVar);
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(int i11, ItemAlbumMobile itemAlbumMobile, TrackingSource trackingSource, C3067a c3067a, Continuation continuation) {
            super(2, continuation);
            this.f12428u = i11;
            this.f12429v = itemAlbumMobile;
            this.f12430w = trackingSource;
            this.f12431x = c3067a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new k(this.f12428u, this.f12429v, this.f12430w, this.f12431x, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Object bVar;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f12427t;
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
                int m150930F = C31060j.f143193a.m150930F(this.f12428u);
                boolean m100204b = AbstractC19074t.m100204b(this.f12429v.f42552E, "1");
                TrackingSource trackingSource = this.f12430w;
                if (trackingSource != null) {
                    C19137b c19137b = C19137b.f95167a;
                    c19137b.m100439a(trackingSource, c19137b.m100443e(this.f12429v, m150930F));
                }
                if (m100204b) {
                    ItemAlbumMobile itemAlbumMobile = this.f12429v;
                    TrackingSource trackingSource2 = this.f12430w;
                    if (trackingSource2 == null) {
                        trackingSource2 = new TrackingSource(-1);
                    }
                    bVar = new C18593d.a(itemAlbumMobile, m150930F, trackingSource2);
                } else {
                    ItemAlbumMobile itemAlbumMobile2 = this.f12429v;
                    TrackingSource trackingSource3 = this.f12430w;
                    if (trackingSource3 == null) {
                        trackingSource3 = new TrackingSource(-1);
                    }
                    bVar = new C18593d.b(itemAlbumMobile2, m150930F, trackingSource3);
                }
                C18593d m14745S = this.f12431x.m14745S();
                this.f12427t = 1;
                obj = m14745S.m101498a(bVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar = new a(this.f12431x, this.f12429v);
                this.f12427t = 2;
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

    /* renamed from: bp.a$l */
    /* loaded from: classes4.dex */
    static final class l extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final l f12434q = new l();

        l() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C18593d mo12V4() {
            return new C18593d(null, 1, null);
        }
    }

    public C3067a(C1780l0 c1780l0) {
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(c1780l0, "savedStateHandle");
        this.f12397t = c1780l0;
        m129210a = AbstractC24856m.m129210a(l.f12434q);
        this.f12398u = m129210a;
        this.f12399v = new C1761c0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public final C18593d m14745S() {
        return (C18593d) this.f12398u.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public final void m14746V(String str, AbstractC18591b.a aVar) {
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new g(aVar, this, str, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public final void m14747W(String str) {
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new h(str, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public final void m14748X(String str, C32547c c32547c, boolean z11) {
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new i(str, c32547c, z11, null), 3, null);
    }

    /* renamed from: T */
    public final TrackingSource m14749T(ItemAlbumMobile itemAlbumMobile, C32002l4 c32002l4, boolean z11, int i11) {
        C32002l4 m154287a;
        int i12;
        AbstractC19074t.m100208f(itemAlbumMobile, "photoItem");
        if (c32002l4 == null || (m154287a = c32002l4.m154275e()) == null) {
            m154287a = C32002l4.Companion.m154287a(4);
        }
        boolean m100204b = AbstractC19074t.m100204b(itemAlbumMobile.f42552E, "1");
        if (z11 && i11 == 1) {
            C31987k4 m154279o = m154287a.m154279o(10002);
            if (m154279o != null) {
                i12 = m154279o.m154205e();
            } else {
                i12 = 0;
            }
            m154287a.m154283t(10002, new C31987k4(10031, i12));
        }
        return C32017m4.m154326S().m154334F(m154287a, !m100204b);
    }

    /* renamed from: U */
    public final C1761c0 m14750U() {
        return this.f12399v;
    }

    /* renamed from: Y */
    public final void m14751Y(ItemAlbumMobile itemAlbumMobile, TrackingSource trackingSource) {
        AbstractC19074t.m100208f(itemAlbumMobile, "photoItem");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new j(itemAlbumMobile, trackingSource, this, null), 3, null);
    }

    /* renamed from: Z */
    public final void m14752Z(ItemAlbumMobile itemAlbumMobile, int i11, int i12, int i13) {
        AbstractC19074t.m100208f(itemAlbumMobile, "photoItem");
        EnumC31051a m150916c = C31060j.m150916c(itemAlbumMobile);
        if (AbstractC31052b.m150889b(m150916c)) {
            C1761c0 c1761c0 = this.f12399v;
            C31060j c31060j = C31060j.f143193a;
            c1761c0.mo9224q(new C19964c(new d(itemAlbumMobile, i11, i12, i13, c31060j.m150944q())));
            c31060j.m150942h();
            return;
        }
        if (AbstractC31052b.m150888a(m150916c)) {
            this.f12399v.mo9224q(new C19964c(new e()));
        }
    }

    /* renamed from: a0 */
    public final void m14753a0(ItemAlbumMobile itemAlbumMobile, int i11, TrackingSource trackingSource) {
        AbstractC19074t.m100208f(itemAlbumMobile, "photoItem");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new k(i11, itemAlbumMobile, trackingSource, this, null), 3, null);
    }
}
