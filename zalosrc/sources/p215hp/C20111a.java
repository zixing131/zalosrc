package p215hp;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1754a;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1798u0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.C1780l0;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3023p3;
import bo.C3025q0;
import com.zing.zalo.feed.mvp.feedzshort.data.ExceptionNotFoundZShort;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p089d2.InterfaceC17712d;
import p138ep.C18537g;
import p138ep.C18540j;
import p138ep.EnumC18536f;
import p138ep.EnumC18539i;
import p165fp.AbstractC19099e;
import p165fp.C19096b;
import p165fp.C19097c;
import p165fp.C19098d;
import p205hc.AbstractC19963b;
import p205hc.C19964c;
import p458qr.AbstractC25468a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: hp.a */
/* loaded from: classes4.dex */
public final class C20111a extends AbstractC19963b {

    /* renamed from: t */
    private final C19098d f98893t;

    /* renamed from: u */
    private final C19097c f98894u;

    /* renamed from: v */
    private final C19096b f98895v;

    /* renamed from: w */
    private final C1761c0 f98896w;

    /* renamed from: x */
    private Map f98897x;

    /* renamed from: hp.a$a */
    /* loaded from: classes4.dex */
    public interface a {
    }

    /* renamed from: hp.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC1754a {

        /* renamed from: d */
        private final C19098d f98898d;

        /* renamed from: e */
        private final C19097c f98899e;

        /* renamed from: f */
        private final C19096b f98900f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC17712d interfaceC17712d, Bundle bundle, C19098d c19098d, C19097c c19097c, C19096b c19096b) {
            super(interfaceC17712d, bundle);
            AbstractC19074t.m100208f(interfaceC17712d, "owner");
            AbstractC19074t.m100208f(c19098d, "loadZShortVideoInfoUseCase");
            AbstractC19074t.m100208f(c19097c, "getZShortVideoStreamingUseCase");
            AbstractC19074t.m100208f(c19096b, "clearZShortInfoWhenNotFoundUseCase");
            this.f98898d = c19098d;
            this.f98899e = c19097c;
            this.f98900f = c19096b;
        }

        @Override // androidx.lifecycle.AbstractC1754a
        /* renamed from: e */
        protected AbstractC1796t0 mo9255e(String str, Class cls, C1780l0 c1780l0) {
            AbstractC19074t.m100208f(str, "key");
            AbstractC19074t.m100208f(cls, "modelClass");
            AbstractC19074t.m100208f(c1780l0, "handle");
            if (cls.isAssignableFrom(C20111a.class)) {
                return new C20111a(this.f98898d, this.f98899e, this.f98900f);
            }
            throw new IllegalArgumentException("Unknown ViewModel class: " + cls.getName());
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC17712d interfaceC17712d, Bundle bundle) {
            this(interfaceC17712d, bundle, new C19098d(null, null, null, 7, null), new C19097c(null, null, null, 7, null), new C19096b(null, null, null, 7, null));
            AbstractC19074t.m100208f(interfaceC17712d, "owner");
        }
    }

    /* renamed from: hp.a$c */
    /* loaded from: classes4.dex */
    public static final class c implements a {

        /* renamed from: a */
        private final String f98901a;

        public c(String str) {
            AbstractC19074t.m100208f(str, "feedId");
            this.f98901a = str;
        }

        /* renamed from: a */
        public final String m104577a() {
            return this.f98901a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hp.a$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f98902t;

        /* renamed from: u */
        /* synthetic */ Object f98903u;

        /* renamed from: v */
        final /* synthetic */ String f98904v;

        /* renamed from: w */
        final /* synthetic */ C20111a f98905w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, C20111a c20111a, Continuation continuation) {
            super(2, continuation);
            this.f98904v = str;
            this.f98905w = c20111a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            d dVar = new d(this.f98904v, this.f98905w, continuation);
            dVar.f98903u = obj;
            return dVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f98902t == 0) {
                AbstractC24862s.m129228b(obj);
                AbstractC25468a abstractC25468a = (AbstractC25468a) this.f98903u;
                if (abstractC25468a instanceof AbstractC25468a.b) {
                    C18537g c18537g = C18537g.f93231a;
                    String str = this.f98904v;
                    AbstractC19074t.m100207e(str, "$feedId");
                    c18537g.m97933b(str, EnumC18536f.f93225q);
                } else if (abstractC25468a instanceof AbstractC25468a.c) {
                    C18537g c18537g2 = C18537g.f93231a;
                    String str2 = this.f98904v;
                    AbstractC19074t.m100207e(str2, "$feedId");
                    c18537g2.m97933b(str2, EnumC18536f.f93226r);
                } else if (abstractC25468a instanceof AbstractC25468a.a) {
                    C18537g c18537g3 = C18537g.f93231a;
                    String str3 = this.f98904v;
                    AbstractC19074t.m100207e(str3, "$feedId");
                    c18537g3.m97933b(str3, EnumC18536f.f93227s);
                }
                C1761c0 m104575Q = this.f98905w.m104575Q();
                String str4 = this.f98904v;
                AbstractC19074t.m100207e(str4, "$feedId");
                m104575Q.mo9224q(new C19964c(new c(str4)));
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(AbstractC25468a abstractC25468a, Continuation continuation) {
            return ((d) mo238a(abstractC25468a, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hp.a$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ String f98906q;

        /* renamed from: r */
        final /* synthetic */ C20111a f98907r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, C20111a c20111a) {
            super(1);
            this.f98906q = str;
            this.f98907r = c20111a;
        }

        /* renamed from: a */
        public final void m104579a(Throwable th2) {
            AbstractC19074t.m100208f(th2, "exception");
            if (th2 instanceof ExceptionNotFoundZShort) {
                C18537g c18537g = C18537g.f93231a;
                String str = this.f98906q;
                AbstractC19074t.m100207e(str, "$feedId");
                c18537g.m97933b(str, EnumC18536f.f93228t);
            } else {
                C18537g c18537g2 = C18537g.f93231a;
                String str2 = this.f98906q;
                AbstractC19074t.m100207e(str2, "$feedId");
                c18537g2.m97933b(str2, EnumC18536f.f93227s);
            }
            C1761c0 m104575Q = this.f98907r.m104575Q();
            String str3 = this.f98906q;
            AbstractC19074t.m100207e(str3, "$feedId");
            m104575Q.mo9224q(new C19964c(new c(str3)));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m104579a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hp.a$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f98908t;

        /* renamed from: u */
        /* synthetic */ Object f98909u;

        /* renamed from: v */
        final /* synthetic */ String f98910v;

        /* renamed from: w */
        final /* synthetic */ C20111a f98911w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, C20111a c20111a, Continuation continuation) {
            super(2, continuation);
            this.f98910v = str;
            this.f98911w = c20111a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            f fVar = new f(this.f98910v, this.f98911w, continuation);
            fVar.f98909u = obj;
            return fVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f98908t == 0) {
                AbstractC24862s.m129228b(obj);
                AbstractC25468a abstractC25468a = (AbstractC25468a) this.f98909u;
                if (abstractC25468a instanceof AbstractC25468a.b) {
                    C18540j c18540j = C18540j.f93240a;
                    String str = this.f98910v;
                    AbstractC19074t.m100207e(str, "$feedId");
                    c18540j.m97949b(str, EnumC18539i.f93234q);
                } else if (abstractC25468a instanceof AbstractC25468a.c) {
                    C18537g c18537g = C18537g.f93231a;
                    String str2 = this.f98910v;
                    AbstractC19074t.m100207e(str2, "$feedId");
                    c18537g.m97933b(str2, EnumC18536f.f93226r);
                    C18540j c18540j2 = C18540j.f93240a;
                    String str3 = this.f98910v;
                    AbstractC19074t.m100207e(str3, "$feedId");
                    c18540j2.m97949b(str3, EnumC18539i.f93235r);
                } else if (abstractC25468a instanceof AbstractC25468a.a) {
                    C18537g c18537g2 = C18537g.f93231a;
                    String str4 = this.f98910v;
                    AbstractC19074t.m100207e(str4, "$feedId");
                    c18537g2.m97933b(str4, EnumC18536f.f93227s);
                    C18540j c18540j3 = C18540j.f93240a;
                    String str5 = this.f98910v;
                    AbstractC19074t.m100207e(str5, "$feedId");
                    c18540j3.m97949b(str5, EnumC18539i.f93236s);
                }
                C1761c0 m104575Q = this.f98911w.m104575Q();
                String str6 = this.f98910v;
                AbstractC19074t.m100207e(str6, "$feedId");
                m104575Q.mo9224q(new C19964c(new c(str6)));
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(AbstractC25468a abstractC25468a, Continuation continuation) {
            return ((f) mo238a(abstractC25468a, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hp.a$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ String f98912q;

        /* renamed from: r */
        final /* synthetic */ C20111a f98913r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, C20111a c20111a) {
            super(1);
            this.f98912q = str;
            this.f98913r = c20111a;
        }

        /* renamed from: a */
        public final void m104581a(Throwable th2) {
            AbstractC19074t.m100208f(th2, "exception");
            if (th2 instanceof ExceptionNotFoundZShort) {
                C18537g c18537g = C18537g.f93231a;
                String str = this.f98912q;
                AbstractC19074t.m100207e(str, "$feedId");
                c18537g.m97933b(str, EnumC18536f.f93228t);
                C18540j c18540j = C18540j.f93240a;
                String str2 = this.f98912q;
                AbstractC19074t.m100207e(str2, "$feedId");
                c18540j.m97949b(str2, EnumC18539i.f93237t);
            } else {
                C18537g c18537g2 = C18537g.f93231a;
                String str3 = this.f98912q;
                AbstractC19074t.m100207e(str3, "$feedId");
                c18537g2.m97933b(str3, EnumC18536f.f93227s);
                C18540j c18540j2 = C18540j.f93240a;
                String str4 = this.f98912q;
                AbstractC19074t.m100207e(str4, "$feedId");
                c18540j2.m97949b(str4, EnumC18539i.f93236s);
            }
            C1761c0 m104575Q = this.f98913r.m104575Q();
            String str5 = this.f98912q;
            AbstractC19074t.m100207e(str5, "$feedId");
            m104575Q.mo9224q(new C19964c(new c(str5)));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m104581a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    public C20111a(C19098d c19098d, C19097c c19097c, C19096b c19096b) {
        AbstractC19074t.m100208f(c19098d, "loadZShortVideoInfoUseCase");
        AbstractC19074t.m100208f(c19097c, "getZShortVideoStreamingUseCase");
        AbstractC19074t.m100208f(c19096b, "clearZShortInfoWhenNotFoundUseCase");
        this.f98893t = c19098d;
        this.f98894u = c19097c;
        this.f98895v = c19096b;
        this.f98896w = new C1761c0();
        this.f98897x = new LinkedHashMap();
    }

    /* renamed from: O */
    public final void m104573O(C3000l0 c3000l0) {
        AbstractC19074t.m100208f(c3000l0, "feedContent");
        C3020p0 m14322a0 = c3000l0.m14322a0();
        if (m14322a0 != null) {
            String str = m14322a0.f12057p;
            C18537g c18537g = C18537g.f93231a;
            AbstractC19074t.m100205c(str);
            c18537g.m97933b(str, EnumC18536f.f93228t);
            if (!this.f98897x.containsKey(m14322a0.f12057p)) {
                Map map = this.f98897x;
                String str2 = m14322a0.f12057p;
                AbstractC19074t.m100207e(str2, "fid");
                map.put(str2, new C19098d.a(m14322a0));
            } else {
                C19098d.a aVar = (C19098d.a) this.f98897x.get(m14322a0.f12057p);
                if (aVar != null) {
                    aVar.m100319b(m14322a0);
                }
            }
            this.f98895v.m101508a(new C19096b.a(str, (C19098d.a) this.f98897x.get(str)));
        }
    }

    /* renamed from: P */
    public final void m104574P(C3000l0 c3000l0) {
        C3023p3 c3023p3;
        Flow m113272H;
        Flow m100324a;
        boolean z11;
        Flow flow;
        Flow m113272H2;
        Flow m100324a2;
        AbstractC19074t.m100208f(c3000l0, "feedContent");
        C3020p0 m14322a0 = c3000l0.m14322a0();
        if (m14322a0 != null && !m14322a0.m14493X()) {
            String str = m14322a0.f12057p;
            if (!this.f98897x.containsKey(str)) {
                Map map = this.f98897x;
                String str2 = m14322a0.f12057p;
                AbstractC19074t.m100207e(str2, "fid");
                map.put(str2, new C19098d.a(m14322a0));
            } else {
                C19098d.a aVar = (C19098d.a) this.f98897x.get(m14322a0.f12057p);
                if (aVar != null) {
                    aVar.m100319b(m14322a0);
                }
            }
            C3025q0 c3025q0 = m14322a0.f12023C;
            if (c3025q0 != null) {
                c3023p3 = c3025q0.f12100I;
            } else {
                c3023p3 = null;
            }
            if (c3023p3 != null) {
                String m14554k = c3023p3.m14554k();
                if (c3023p3.m14558o() && !c3023p3.m14557n()) {
                    C18540j c18540j = C18540j.f93240a;
                    AbstractC19074t.m100205c(str);
                    boolean z12 = false;
                    if (c18540j.m97948a(str) == EnumC18539i.f93234q) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (c18540j.m97948a(str) == EnumC18539i.f93237t) {
                        z12 = true;
                    }
                    if (!z11 && !z12 && (flow = (Flow) this.f98894u.m101509a(new C19097c.a(m14554k, c3023p3.m14550g(), str, (C19098d.a) this.f98897x.get(str)))) != null && (m113272H2 = FlowKt.m113272H(flow, new f(str, this, null))) != null && (m100324a2 = AbstractC19099e.m100324a(m113272H2, new g(str, this))) != null) {
                        FlowKt.m113270F(m100324a2, AbstractC1798u0.m9374a(this));
                        return;
                    }
                    return;
                }
                C19098d c19098d = this.f98893t;
                AbstractC19074t.m100205c(str);
                Flow flow2 = (Flow) c19098d.m101509a(new C19098d.b(m14554k, str, (C19098d.a) this.f98897x.get(str)));
                if (flow2 != null && (m113272H = FlowKt.m113272H(flow2, new d(str, this, null))) != null && (m100324a = AbstractC19099e.m100324a(m113272H, new e(str, this))) != null) {
                    FlowKt.m113270F(m100324a, AbstractC1798u0.m9374a(this));
                }
            }
        }
    }

    /* renamed from: Q */
    public final C1761c0 m104575Q() {
        return this.f98896w;
    }

    /* renamed from: R */
    public final void m104576R(C3000l0 c3000l0) {
        C3023p3 c3023p3;
        boolean z11;
        AbstractC19074t.m100208f(c3000l0, "feedContent");
        C3020p0 m14322a0 = c3000l0.m14322a0();
        if (m14322a0 != null && !m14322a0.m14493X()) {
            String str = m14322a0.f12057p;
            if (!this.f98897x.containsKey(str)) {
                Map map = this.f98897x;
                String str2 = m14322a0.f12057p;
                AbstractC19074t.m100207e(str2, "fid");
                map.put(str2, new C19098d.a(m14322a0));
            } else {
                C19098d.a aVar = (C19098d.a) this.f98897x.get(m14322a0.f12057p);
                if (aVar != null) {
                    aVar.m100319b(m14322a0);
                }
            }
            C3025q0 c3025q0 = m14322a0.f12023C;
            if (c3025q0 != null) {
                c3023p3 = c3025q0.f12100I;
            } else {
                c3023p3 = null;
            }
            if (c3023p3 != null) {
                C18537g c18537g = C18537g.f93231a;
                AbstractC19074t.m100205c(str);
                boolean z12 = false;
                if (c18537g.m97932a(str) == EnumC18536f.f93225q) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c18537g.m97932a(str) == EnumC18536f.f93228t) {
                    z12 = true;
                }
                if (!z11 && !z12) {
                    m104574P(c3000l0);
                }
            }
        }
    }
}
