package vn0;

import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractC21884b;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21886d;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import p227i3.C20215s;
import pm0.C24838b0;
import pm0.C24844e0;
import pm0.C24848g0;
import pm0.C24867x;
import pm0.C24869z;
import qn0.AbstractC25389d;
import qn0.InterfaceC25393h;
import sn0.AbstractC26337d;
import sn0.AbstractC26338e;
import sn0.AbstractC26341h;
import sn0.AbstractC26342i;
import tn0.AbstractC26776b;
import tn0.AbstractC26825r0;
import un0.AbstractC27323a;
import un0.AbstractC27331i;
import un0.C27328f;
import un0.C27337o;
import un0.InterfaceC27334l;
import wn0.AbstractC29112b;

/* renamed from: vn0.d */
/* loaded from: classes7.dex */
public abstract class AbstractC28312d extends AbstractC26825r0 implements InterfaceC27334l {

    /* renamed from: b */
    private final AbstractC27323a f132029b;

    /* renamed from: c */
    private final InterfaceC18505l f132030c;

    /* renamed from: d */
    protected final C27328f f132031d;

    /* renamed from: e */
    private String f132032e;

    /* renamed from: vn0.d$a */
    /* loaded from: classes7.dex */
    static final class a extends AbstractC19075u implements InterfaceC18505l {
        a() {
            super(1);
        }

        /* renamed from: a */
        public final void m142694a(JsonElement jsonElement) {
            AbstractC19074t.m100208f(jsonElement, "node");
            AbstractC28312d abstractC28312d = AbstractC28312d.this;
            abstractC28312d.mo142693u0(AbstractC28312d.m142676d0(abstractC28312d), jsonElement);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m142694a((JsonElement) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: vn0.d$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC21884b {

        /* renamed from: b */
        final /* synthetic */ String f132035b;

        /* renamed from: c */
        final /* synthetic */ SerialDescriptor f132036c;

        b(String str, SerialDescriptor serialDescriptor) {
            this.f132035b = str;
            this.f132036c = serialDescriptor;
        }

        @Override // kotlinx.serialization.encoding.AbstractC21884b, kotlinx.serialization.encoding.Encoder
        /* renamed from: F */
        public void mo113982F(String str) {
            AbstractC19074t.m100208f(str, "value");
            AbstractC28312d.this.mo142693u0(this.f132035b, new C27337o(str, false, this.f132036c));
        }

        @Override // kotlinx.serialization.encoding.Encoder
        /* renamed from: a */
        public AbstractC29112b mo113983a() {
            return AbstractC28312d.this.mo139938d().mo131586a();
        }
    }

    /* renamed from: vn0.d$c */
    /* loaded from: classes7.dex */
    public static final class c extends AbstractC21884b {

        /* renamed from: a */
        private final AbstractC29112b f132037a;

        /* renamed from: c */
        final /* synthetic */ String f132039c;

        c(String str) {
            this.f132039c = str;
            this.f132037a = AbstractC28312d.this.mo139938d().mo131586a();
        }

        @Override // kotlinx.serialization.encoding.AbstractC21884b, kotlinx.serialization.encoding.Encoder
        /* renamed from: B */
        public void mo113981B(int i11) {
            m142695J(AbstractC28316f.m142704a(C24869z.m129260c(i11)));
        }

        /* renamed from: J */
        public final void m142695J(String str) {
            AbstractC19074t.m100208f(str, C20215s.f99966b);
            AbstractC28312d.this.mo142693u0(this.f132039c, new C27337o(str, false, null, 4, null));
        }

        @Override // kotlinx.serialization.encoding.Encoder
        /* renamed from: a */
        public AbstractC29112b mo113983a() {
            return this.f132037a;
        }

        @Override // kotlinx.serialization.encoding.AbstractC21884b, kotlinx.serialization.encoding.Encoder
        /* renamed from: g */
        public void mo113986g(byte b11) {
            m142695J(C24867x.m129240g(C24867x.m129237c(b11)));
        }

        @Override // kotlinx.serialization.encoding.AbstractC21884b, kotlinx.serialization.encoding.Encoder
        /* renamed from: n */
        public void mo113991n(long j11) {
            String m142705a;
            m142705a = AbstractC28318g.m142705a(C24838b0.m129150c(j11), 10);
            m142695J(m142705a);
        }

        @Override // kotlinx.serialization.encoding.AbstractC21884b, kotlinx.serialization.encoding.Encoder
        /* renamed from: r */
        public void mo113993r(short s7) {
            m142695J(C24844e0.m129180g(C24844e0.m129177c(s7)));
        }
    }

    public /* synthetic */ AbstractC28312d(AbstractC27323a abstractC27323a, InterfaceC18505l interfaceC18505l, AbstractC19060k abstractC19060k) {
        this(abstractC27323a, interfaceC18505l);
    }

    /* renamed from: d0 */
    public static final /* synthetic */ String m142676d0(AbstractC28312d abstractC28312d) {
        return (String) abstractC28312d.m137929U();
    }

    /* renamed from: s0 */
    private final b m142677s0(String str, SerialDescriptor serialDescriptor) {
        return new b(str, serialDescriptor);
    }

    /* renamed from: t0 */
    private final c m142678t0(String str) {
        return new c(str);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21886d
    /* renamed from: A */
    public boolean mo114019A(SerialDescriptor serialDescriptor, int i11) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        return this.f132031d.m139888e();
    }

    @Override // tn0.AbstractC26820p1
    /* renamed from: T */
    protected void mo137928T(SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        this.f132030c.mo205i9(mo142691q0());
    }

    @Override // tn0.AbstractC26825r0
    /* renamed from: Z */
    protected String mo137950Z(String str, String str2) {
        AbstractC19074t.m100208f(str, "parentName");
        AbstractC19074t.m100208f(str2, "childName");
        return str2;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: a */
    public final AbstractC29112b mo113983a() {
        return this.f132029b.mo131586a();
    }

    @Override // tn0.AbstractC26825r0
    /* renamed from: a0 */
    protected String mo137951a0(SerialDescriptor serialDescriptor, int i11) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        return AbstractC28311c0.m142669f(serialDescriptor, this.f132029b, i11);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: b */
    public InterfaceC21886d mo113984b(SerialDescriptor serialDescriptor) {
        InterfaceC18505l aVar;
        AbstractC28312d c28329l0;
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        if (m137930V() == null) {
            aVar = this.f132030c;
        } else {
            aVar = new a();
        }
        AbstractC26341h mo113948d = serialDescriptor.mo113948d();
        if (AbstractC19074t.m100204b(mo113948d, AbstractC26342i.b.f125057a) || (mo113948d instanceof AbstractC26337d)) {
            c28329l0 = new C28329l0(this.f132029b, aVar);
        } else if (AbstractC19074t.m100204b(mo113948d, AbstractC26342i.c.f125058a)) {
            AbstractC27323a abstractC27323a = this.f132029b;
            SerialDescriptor m142632a = AbstractC28307a1.m142632a(serialDescriptor.mo113952h(0), abstractC27323a.mo131586a());
            AbstractC26341h mo113948d2 = m142632a.mo113948d();
            if (!(mo113948d2 instanceof AbstractC26338e) && !AbstractC19074t.m100204b(mo113948d2, AbstractC26341h.b.f125055a)) {
                if (abstractC27323a.m139869f().m139885b()) {
                    c28329l0 = new C28329l0(this.f132029b, aVar);
                } else {
                    throw AbstractC28309b0.m142639d(m142632a);
                }
            } else {
                c28329l0 = new C28333n0(this.f132029b, aVar);
            }
        } else {
            c28329l0 = new C28325j0(this.f132029b, aVar);
        }
        String str = this.f132032e;
        if (str != null) {
            AbstractC19074t.m100205c(str);
            c28329l0.mo142693u0(str, AbstractC27331i.m139906c(serialDescriptor.mo113953i()));
            this.f132032e = null;
        }
        return c28329l0;
    }

    @Override // un0.InterfaceC27334l
    /* renamed from: d */
    public final AbstractC27323a mo139938d() {
        return this.f132029b;
    }

    @Override // tn0.AbstractC26820p1
    /* renamed from: e0 */
    public void mo137917I(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "tag");
        mo142693u0(str, AbstractC27331i.m139904a(Boolean.valueOf(z11)));
    }

    @Override // tn0.AbstractC26820p1
    /* renamed from: f0 */
    public void mo137918J(String str, byte b11) {
        AbstractC19074t.m100208f(str, "tag");
        mo142693u0(str, AbstractC27331i.m139905b(Byte.valueOf(b11)));
    }

    @Override // tn0.AbstractC26820p1
    /* renamed from: g0 */
    public void mo137919K(String str, char c11) {
        AbstractC19074t.m100208f(str, "tag");
        mo142693u0(str, AbstractC27331i.m139906c(String.valueOf(c11)));
    }

    @Override // tn0.AbstractC26820p1
    /* renamed from: h0 */
    public void mo137920L(String str, double d11) {
        AbstractC19074t.m100208f(str, "tag");
        mo142693u0(str, AbstractC27331i.m139905b(Double.valueOf(d11)));
        if (!this.f132031d.m139884a()) {
            if (Double.isInfinite(d11) || Double.isNaN(d11)) {
                throw AbstractC28309b0.m142638c(Double.valueOf(d11), str, mo142691q0().toString());
            }
        }
    }

    @Override // tn0.AbstractC26820p1
    /* renamed from: i0 */
    public void mo137921M(String str, SerialDescriptor serialDescriptor, int i11) {
        AbstractC19074t.m100208f(str, "tag");
        AbstractC19074t.m100208f(serialDescriptor, "enumDescriptor");
        mo142693u0(str, AbstractC27331i.m139906c(serialDescriptor.mo113950f(i11)));
    }

    @Override // tn0.AbstractC26820p1, kotlinx.serialization.encoding.Encoder
    /* renamed from: j */
    public void mo113987j(InterfaceC25393h interfaceC25393h, Object obj) {
        boolean m142802b;
        AbstractC19074t.m100208f(interfaceC25393h, "serializer");
        if (m137930V() == null) {
            m142802b = AbstractC28355y0.m142802b(AbstractC28307a1.m142632a(interfaceC25393h.getDescriptor(), mo113983a()));
            if (m142802b) {
                new C28317f0(this.f132029b, this.f132030c).mo113987j(interfaceC25393h, obj);
                return;
            }
        }
        if ((interfaceC25393h instanceof AbstractC26776b) && !mo139938d().m139869f().m139895l()) {
            AbstractC26776b abstractC26776b = (AbstractC26776b) interfaceC25393h;
            String m142764c = AbstractC28339q0.m142764c(interfaceC25393h.getDescriptor(), mo139938d());
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Any");
            InterfaceC25393h m131578b = AbstractC25389d.m131578b(abstractC26776b, this, obj);
            AbstractC28339q0.m142767f(abstractC26776b, m131578b, m142764c);
            AbstractC28339q0.m142763b(m131578b.getDescriptor().mo113948d());
            this.f132032e = m142764c;
            m131578b.serialize(this, obj);
            return;
        }
        interfaceC25393h.serialize(this, obj);
    }

    @Override // tn0.AbstractC26820p1
    /* renamed from: j0 */
    public void mo137922N(String str, float f11) {
        AbstractC19074t.m100208f(str, "tag");
        mo142693u0(str, AbstractC27331i.m139905b(Float.valueOf(f11)));
        if (!this.f132031d.m139884a()) {
            if (Float.isInfinite(f11) || Float.isNaN(f11)) {
                throw AbstractC28309b0.m142638c(Float.valueOf(f11), str, mo142691q0().toString());
            }
        }
    }

    @Override // tn0.AbstractC26820p1
    /* renamed from: k0 */
    public Encoder mo137923O(String str, SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(str, "tag");
        AbstractC19074t.m100208f(serialDescriptor, "inlineDescriptor");
        if (AbstractC28347u0.m142787b(serialDescriptor)) {
            return m142678t0(str);
        }
        if (AbstractC28347u0.m142786a(serialDescriptor)) {
            return m142677s0(str, serialDescriptor);
        }
        return super.mo137923O(str, serialDescriptor);
    }

    @Override // tn0.AbstractC26820p1
    /* renamed from: l0 */
    public void mo137924P(String str, int i11) {
        AbstractC19074t.m100208f(str, "tag");
        mo142693u0(str, AbstractC27331i.m139905b(Integer.valueOf(i11)));
    }

    @Override // tn0.AbstractC26820p1, kotlinx.serialization.encoding.Encoder
    /* renamed from: m */
    public Encoder mo113990m(SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        if (m137930V() != null) {
            return super.mo113990m(serialDescriptor);
        }
        return new C28317f0(this.f132029b, this.f132030c).mo113990m(serialDescriptor);
    }

    @Override // tn0.AbstractC26820p1
    /* renamed from: m0 */
    public void mo137925Q(String str, long j11) {
        AbstractC19074t.m100208f(str, "tag");
        mo142693u0(str, AbstractC27331i.m139905b(Long.valueOf(j11)));
    }

    /* renamed from: n0 */
    protected void m142688n0(String str) {
        AbstractC19074t.m100208f(str, "tag");
        mo142693u0(str, JsonNull.INSTANCE);
    }

    @Override // tn0.AbstractC26820p1
    /* renamed from: o0 */
    public void mo137926R(String str, short s7) {
        AbstractC19074t.m100208f(str, "tag");
        mo142693u0(str, AbstractC27331i.m139905b(Short.valueOf(s7)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: p */
    public void mo113992p() {
        String str = (String) m137930V();
        if (str == null) {
            this.f132030c.mo205i9(JsonNull.INSTANCE);
        } else {
            m142688n0(str);
        }
    }

    @Override // tn0.AbstractC26820p1
    /* renamed from: p0 */
    public void mo137927S(String str, String str2) {
        AbstractC19074t.m100208f(str, "tag");
        AbstractC19074t.m100208f(str2, "value");
        mo142693u0(str, AbstractC27331i.m139906c(str2));
    }

    /* renamed from: q0 */
    public abstract JsonElement mo142691q0();

    /* renamed from: r0 */
    public final InterfaceC18505l m142692r0() {
        return this.f132030c;
    }

    /* renamed from: u0 */
    public abstract void mo142693u0(String str, JsonElement jsonElement);

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: w */
    public void mo113997w() {
    }

    private AbstractC28312d(AbstractC27323a abstractC27323a, InterfaceC18505l interfaceC18505l) {
        this.f132029b = abstractC27323a;
        this.f132030c = interfaceC18505l;
        this.f132031d = abstractC27323a.m139869f();
    }
}
