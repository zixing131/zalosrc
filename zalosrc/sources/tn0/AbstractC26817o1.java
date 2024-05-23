package tn0;

import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.InterfaceC21885c;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;
import qn0.InterfaceC25386a;

/* renamed from: tn0.o1 */
/* loaded from: classes7.dex */
public abstract class AbstractC26817o1 implements Decoder, InterfaceC21885c {

    /* renamed from: a */
    private final ArrayList f127040a = new ArrayList();

    /* renamed from: b */
    private boolean f127041b;

    /* renamed from: tn0.o1$a */
    /* loaded from: classes7.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ InterfaceC25386a f127043r;

        /* renamed from: s */
        final /* synthetic */ Object f127044s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC25386a interfaceC25386a, Object obj) {
            super(0);
            this.f127043r = interfaceC25386a;
            this.f127044s = obj;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public final Object mo12V4() {
            if (AbstractC26817o1.this.mo113966E()) {
                return AbstractC26817o1.this.m137893I(this.f127043r, this.f127044s);
            }
            return AbstractC26817o1.this.mo113971j();
        }
    }

    /* renamed from: tn0.o1$b */
    /* loaded from: classes7.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ InterfaceC25386a f127046r;

        /* renamed from: s */
        final /* synthetic */ Object f127047s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC25386a interfaceC25386a, Object obj) {
            super(0);
            this.f127046r = interfaceC25386a;
            this.f127047s = obj;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public final Object mo12V4() {
            return AbstractC26817o1.this.m137893I(this.f127046r, this.f127047s);
        }
    }

    /* renamed from: Y */
    private final Object m137892Y(Object obj, InterfaceC18494a interfaceC18494a) {
        m137908X(obj);
        Object mo12V4 = interfaceC18494a.mo12V4();
        if (!this.f127041b) {
            m137907W();
        }
        this.f127041b = false;
        return mo12V4;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: A */
    public final String mo113965A() {
        return mo137904T(m137907W());
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21885c
    /* renamed from: B */
    public final char mo114002B(SerialDescriptor serialDescriptor, int i11) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        return mo137896L(mo137906V(serialDescriptor, i11));
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21885c
    /* renamed from: C */
    public final byte mo114003C(SerialDescriptor serialDescriptor, int i11) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        return mo137895K(mo137906V(serialDescriptor, i11));
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21885c
    /* renamed from: D */
    public final boolean mo114004D(SerialDescriptor serialDescriptor, int i11) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        return mo137894J(mo137906V(serialDescriptor, i11));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: E */
    public abstract boolean mo113966E();

    @Override // kotlinx.serialization.encoding.InterfaceC21885c
    /* renamed from: F */
    public final short mo114005F(SerialDescriptor serialDescriptor, int i11) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        return mo137903S(mo137906V(serialDescriptor, i11));
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21885c
    /* renamed from: G */
    public final double mo114006G(SerialDescriptor serialDescriptor, int i11) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        return mo137897M(mo137906V(serialDescriptor, i11));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: H */
    public final byte mo113967H() {
        return mo137895K(m137907W());
    }

    /* renamed from: I */
    protected Object m137893I(InterfaceC25386a interfaceC25386a, Object obj) {
        AbstractC19074t.m100208f(interfaceC25386a, "deserializer");
        return mo113972k(interfaceC25386a);
    }

    /* renamed from: J */
    protected abstract boolean mo137894J(Object obj);

    /* renamed from: K */
    protected abstract byte mo137895K(Object obj);

    /* renamed from: L */
    protected abstract char mo137896L(Object obj);

    /* renamed from: M */
    protected abstract double mo137897M(Object obj);

    /* renamed from: N */
    protected abstract int mo137898N(Object obj, SerialDescriptor serialDescriptor);

    /* renamed from: O */
    protected abstract float mo137899O(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: P */
    public Decoder mo137900P(Object obj, SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(serialDescriptor, "inlineDescriptor");
        m137908X(obj);
        return this;
    }

    /* renamed from: Q */
    protected abstract int mo137901Q(Object obj);

    /* renamed from: R */
    protected abstract long mo137902R(Object obj);

    /* renamed from: S */
    protected abstract short mo137903S(Object obj);

    /* renamed from: T */
    protected abstract String mo137904T(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: U */
    public final Object m137905U() {
        Object m131217q0;
        m131217q0 = AbstractC25332a0.m131217q0(this.f127040a);
        return m131217q0;
    }

    /* renamed from: V */
    protected abstract Object mo137906V(SerialDescriptor serialDescriptor, int i11);

    /* renamed from: W */
    protected final Object m137907W() {
        int m131504l;
        ArrayList arrayList = this.f127040a;
        m131504l = AbstractC25368s.m131504l(arrayList);
        Object remove = arrayList.remove(m131504l);
        this.f127041b = true;
        return remove;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: X */
    public final void m137908X(Object obj) {
        this.f127040a.add(obj);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: e */
    public final int mo113969e(SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(serialDescriptor, "enumDescriptor");
        return mo137898N(m137907W(), serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21885c
    /* renamed from: f */
    public final long mo114010f(SerialDescriptor serialDescriptor, int i11) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        return mo137902R(mo137906V(serialDescriptor, i11));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: h */
    public final int mo113970h() {
        return mo137901Q(m137907W());
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21885c
    /* renamed from: i */
    public final int mo114011i(SerialDescriptor serialDescriptor, int i11) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        return mo137901Q(mo137906V(serialDescriptor, i11));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: j */
    public final Void mo113971j() {
        return null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: k */
    public abstract Object mo113972k(InterfaceC25386a interfaceC25386a);

    @Override // kotlinx.serialization.encoding.InterfaceC21885c
    /* renamed from: l */
    public final Object mo114012l(SerialDescriptor serialDescriptor, int i11, InterfaceC25386a interfaceC25386a, Object obj) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        AbstractC19074t.m100208f(interfaceC25386a, "deserializer");
        return m137892Y(mo137906V(serialDescriptor, i11), new b(interfaceC25386a, obj));
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21885c
    /* renamed from: m */
    public int mo114013m(SerialDescriptor serialDescriptor) {
        return InterfaceC21885c.a.m114038a(this, serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: n */
    public final long mo113973n() {
        return mo137902R(m137907W());
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21885c
    /* renamed from: o */
    public final String mo114014o(SerialDescriptor serialDescriptor, int i11) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        return mo137904T(mo137906V(serialDescriptor, i11));
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21885c
    /* renamed from: q */
    public boolean mo114015q() {
        return InterfaceC21885c.a.m114039b(this);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: r */
    public Decoder mo113974r(SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        return mo137900P(m137907W(), serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21885c
    /* renamed from: s */
    public final Decoder mo114016s(SerialDescriptor serialDescriptor, int i11) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        return mo137900P(mo137906V(serialDescriptor, i11), serialDescriptor.mo113952h(i11));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: t */
    public final short mo113975t() {
        return mo137903S(m137907W());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: u */
    public final float mo113976u() {
        return mo137899O(m137907W());
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21885c
    /* renamed from: v */
    public final float mo114017v(SerialDescriptor serialDescriptor, int i11) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        return mo137899O(mo137906V(serialDescriptor, i11));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: w */
    public final double mo113977w() {
        return mo137897M(m137907W());
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21885c
    /* renamed from: x */
    public final Object mo114018x(SerialDescriptor serialDescriptor, int i11, InterfaceC25386a interfaceC25386a, Object obj) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        AbstractC19074t.m100208f(interfaceC25386a, "deserializer");
        return m137892Y(mo137906V(serialDescriptor, i11), new a(interfaceC25386a, obj));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: y */
    public final boolean mo113978y() {
        return mo137894J(m137907W());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: z */
    public final char mo113979z() {
        return mo137896L(m137907W());
    }
}
