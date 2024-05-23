package tn0;

import fn0.AbstractC19074t;
import java.util.ArrayList;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;
import qn0.InterfaceC25393h;

/* renamed from: tn0.p1 */
/* loaded from: classes7.dex */
public abstract class AbstractC26820p1 implements Encoder, InterfaceC21886d {

    /* renamed from: a */
    private final ArrayList f127052a = new ArrayList();

    /* renamed from: G */
    private final boolean m137915G(SerialDescriptor serialDescriptor, int i11) {
        m137933Y(mo137931W(serialDescriptor, i11));
        return true;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: B */
    public final void mo113981B(int i11) {
        mo137924P(m137932X(), i11);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21886d
    /* renamed from: C */
    public final void mo114020C(SerialDescriptor serialDescriptor, int i11, short s7) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        mo137926R(mo137931W(serialDescriptor, i11), s7);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21886d
    /* renamed from: D */
    public final void mo114021D(SerialDescriptor serialDescriptor, int i11, double d11) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        mo137920L(mo137931W(serialDescriptor, i11), d11);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21886d
    /* renamed from: E */
    public final void mo114022E(SerialDescriptor serialDescriptor, int i11, long j11) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        mo137925Q(mo137931W(serialDescriptor, i11), j11);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: F */
    public final void mo113982F(String str) {
        AbstractC19074t.m100208f(str, "value");
        mo137927S(m137932X(), str);
    }

    /* renamed from: H */
    public void m137916H(InterfaceC25393h interfaceC25393h, Object obj) {
        Encoder.C21882a.m114000c(this, interfaceC25393h, obj);
    }

    /* renamed from: I */
    protected abstract void mo137917I(Object obj, boolean z11);

    /* renamed from: J */
    protected abstract void mo137918J(Object obj, byte b11);

    /* renamed from: K */
    protected abstract void mo137919K(Object obj, char c11);

    /* renamed from: L */
    protected abstract void mo137920L(Object obj, double d11);

    /* renamed from: M */
    protected abstract void mo137921M(Object obj, SerialDescriptor serialDescriptor, int i11);

    /* renamed from: N */
    protected abstract void mo137922N(Object obj, float f11);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: O */
    public Encoder mo137923O(Object obj, SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(serialDescriptor, "inlineDescriptor");
        m137933Y(obj);
        return this;
    }

    /* renamed from: P */
    protected abstract void mo137924P(Object obj, int i11);

    /* renamed from: Q */
    protected abstract void mo137925Q(Object obj, long j11);

    /* renamed from: R */
    protected abstract void mo137926R(Object obj, short s7);

    /* renamed from: S */
    protected abstract void mo137927S(Object obj, String str);

    /* renamed from: T */
    protected abstract void mo137928T(SerialDescriptor serialDescriptor);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: U */
    public final Object m137929U() {
        Object m131216p0;
        m131216p0 = AbstractC25332a0.m131216p0(this.f127052a);
        return m131216p0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: V */
    public final Object m137930V() {
        Object m131217q0;
        m131217q0 = AbstractC25332a0.m131217q0(this.f127052a);
        return m131217q0;
    }

    /* renamed from: W */
    protected abstract Object mo137931W(SerialDescriptor serialDescriptor, int i11);

    /* renamed from: X */
    protected final Object m137932X() {
        int m131504l;
        if (!this.f127052a.isEmpty()) {
            ArrayList arrayList = this.f127052a;
            m131504l = AbstractC25368s.m131504l(arrayList);
            return arrayList.remove(m131504l);
        }
        throw new SerializationException("No tag in stack for requested element");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Y */
    public final void m137933Y(Object obj) {
        this.f127052a.add(obj);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21886d
    /* renamed from: c */
    public final void mo114026c(SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        if (!this.f127052a.isEmpty()) {
            m137932X();
        }
        mo137928T(serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21886d
    /* renamed from: e */
    public final Encoder mo114027e(SerialDescriptor serialDescriptor, int i11) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        return mo137923O(mo137931W(serialDescriptor, i11), serialDescriptor.mo113952h(i11));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: f */
    public final void mo113985f(double d11) {
        mo137920L(m137932X(), d11);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: g */
    public final void mo113986g(byte b11) {
        mo137918J(m137932X(), b11);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21886d
    /* renamed from: h */
    public void mo114028h(SerialDescriptor serialDescriptor, int i11, InterfaceC25393h interfaceC25393h, Object obj) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        AbstractC19074t.m100208f(interfaceC25393h, "serializer");
        if (m137915G(serialDescriptor, i11)) {
            m137916H(interfaceC25393h, obj);
        }
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21886d
    /* renamed from: i */
    public void mo114029i(SerialDescriptor serialDescriptor, int i11, InterfaceC25393h interfaceC25393h, Object obj) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        AbstractC19074t.m100208f(interfaceC25393h, "serializer");
        if (m137915G(serialDescriptor, i11)) {
            mo113987j(interfaceC25393h, obj);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: j */
    public abstract void mo113987j(InterfaceC25393h interfaceC25393h, Object obj);

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: k */
    public InterfaceC21886d mo113988k(SerialDescriptor serialDescriptor, int i11) {
        return Encoder.C21882a.m113998a(this, serialDescriptor, i11);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: l */
    public final void mo113989l(SerialDescriptor serialDescriptor, int i11) {
        AbstractC19074t.m100208f(serialDescriptor, "enumDescriptor");
        mo137921M(m137932X(), serialDescriptor, i11);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: m */
    public Encoder mo113990m(SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        return mo137923O(m137932X(), serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: n */
    public final void mo113991n(long j11) {
        mo137925Q(m137932X(), j11);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21886d
    /* renamed from: o */
    public final void mo114030o(SerialDescriptor serialDescriptor, int i11, char c11) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        mo137919K(mo137931W(serialDescriptor, i11), c11);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21886d
    /* renamed from: q */
    public final void mo114031q(SerialDescriptor serialDescriptor, int i11, byte b11) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        mo137918J(mo137931W(serialDescriptor, i11), b11);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: r */
    public final void mo113993r(short s7) {
        mo137926R(m137932X(), s7);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: s */
    public final void mo113994s(boolean z11) {
        mo137917I(m137932X(), z11);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21886d
    /* renamed from: t */
    public final void mo114032t(SerialDescriptor serialDescriptor, int i11, float f11) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        mo137922N(mo137931W(serialDescriptor, i11), f11);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: u */
    public final void mo113995u(float f11) {
        mo137922N(m137932X(), f11);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: v */
    public final void mo113996v(char c11) {
        mo137919K(m137932X(), c11);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21886d
    /* renamed from: x */
    public final void mo114033x(SerialDescriptor serialDescriptor, int i11, int i12) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        mo137924P(mo137931W(serialDescriptor, i11), i12);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21886d
    /* renamed from: y */
    public final void mo114034y(SerialDescriptor serialDescriptor, int i11, boolean z11) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        mo137917I(mo137931W(serialDescriptor, i11), z11);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21886d
    /* renamed from: z */
    public final void mo114035z(SerialDescriptor serialDescriptor, int i11, String str) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        AbstractC19074t.m100208f(str, "value");
        mo137927S(mo137931W(serialDescriptor, i11), str);
    }
}
