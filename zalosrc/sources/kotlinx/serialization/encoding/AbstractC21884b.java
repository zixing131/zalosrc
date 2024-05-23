package kotlinx.serialization.encoding;

import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25393h;
import tn0.C26828s0;

/* renamed from: kotlinx.serialization.encoding.b */
/* loaded from: classes7.dex */
public abstract class AbstractC21884b implements Encoder, InterfaceC21886d {
    @Override // kotlinx.serialization.encoding.InterfaceC21886d
    /* renamed from: A */
    public boolean mo114019A(SerialDescriptor serialDescriptor, int i11) {
        return InterfaceC21886d.a.m114041a(this, serialDescriptor, i11);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: B */
    public void mo113981B(int i11) {
        mo114025I(Integer.valueOf(i11));
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21886d
    /* renamed from: C */
    public final void mo114020C(SerialDescriptor serialDescriptor, int i11, short s7) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        if (mo114023G(serialDescriptor, i11)) {
            mo113993r(s7);
        }
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21886d
    /* renamed from: D */
    public final void mo114021D(SerialDescriptor serialDescriptor, int i11, double d11) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        if (mo114023G(serialDescriptor, i11)) {
            mo113985f(d11);
        }
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21886d
    /* renamed from: E */
    public final void mo114022E(SerialDescriptor serialDescriptor, int i11, long j11) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        if (mo114023G(serialDescriptor, i11)) {
            mo113991n(j11);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: F */
    public void mo113982F(String str) {
        AbstractC19074t.m100208f(str, "value");
        mo114025I(str);
    }

    /* renamed from: G */
    public boolean mo114023G(SerialDescriptor serialDescriptor, int i11) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        return true;
    }

    /* renamed from: H */
    public void m114024H(InterfaceC25393h interfaceC25393h, Object obj) {
        Encoder.C21882a.m114000c(this, interfaceC25393h, obj);
    }

    /* renamed from: I */
    public void mo114025I(Object obj) {
        AbstractC19074t.m100208f(obj, "value");
        throw new SerializationException("Non-serializable " + AbstractC19061k0.m100169b(obj.getClass()) + " is not supported by " + AbstractC19061k0.m100169b(getClass()) + " encoder");
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: b */
    public InterfaceC21886d mo113984b(SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21886d
    /* renamed from: c */
    public void mo114026c(SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21886d
    /* renamed from: e */
    public final Encoder mo114027e(SerialDescriptor serialDescriptor, int i11) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        if (mo114023G(serialDescriptor, i11)) {
            return mo113990m(serialDescriptor.mo113952h(i11));
        }
        return C26828s0.f127069a;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: f */
    public void mo113985f(double d11) {
        mo114025I(Double.valueOf(d11));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: g */
    public void mo113986g(byte b11) {
        mo114025I(Byte.valueOf(b11));
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21886d
    /* renamed from: h */
    public void mo114028h(SerialDescriptor serialDescriptor, int i11, InterfaceC25393h interfaceC25393h, Object obj) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        AbstractC19074t.m100208f(interfaceC25393h, "serializer");
        if (mo114023G(serialDescriptor, i11)) {
            m114024H(interfaceC25393h, obj);
        }
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21886d
    /* renamed from: i */
    public void mo114029i(SerialDescriptor serialDescriptor, int i11, InterfaceC25393h interfaceC25393h, Object obj) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        AbstractC19074t.m100208f(interfaceC25393h, "serializer");
        if (mo114023G(serialDescriptor, i11)) {
            mo113987j(interfaceC25393h, obj);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: j */
    public void mo113987j(InterfaceC25393h interfaceC25393h, Object obj) {
        Encoder.C21882a.m114001d(this, interfaceC25393h, obj);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: k */
    public InterfaceC21886d mo113988k(SerialDescriptor serialDescriptor, int i11) {
        return Encoder.C21882a.m113998a(this, serialDescriptor, i11);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: l */
    public void mo113989l(SerialDescriptor serialDescriptor, int i11) {
        AbstractC19074t.m100208f(serialDescriptor, "enumDescriptor");
        mo114025I(Integer.valueOf(i11));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: m */
    public Encoder mo113990m(SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: n */
    public void mo113991n(long j11) {
        mo114025I(Long.valueOf(j11));
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21886d
    /* renamed from: o */
    public final void mo114030o(SerialDescriptor serialDescriptor, int i11, char c11) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        if (mo114023G(serialDescriptor, i11)) {
            mo113996v(c11);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: p */
    public void mo113992p() {
        throw new SerializationException("'null' is not supported by default");
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21886d
    /* renamed from: q */
    public final void mo114031q(SerialDescriptor serialDescriptor, int i11, byte b11) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        if (mo114023G(serialDescriptor, i11)) {
            mo113986g(b11);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: r */
    public void mo113993r(short s7) {
        mo114025I(Short.valueOf(s7));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: s */
    public void mo113994s(boolean z11) {
        mo114025I(Boolean.valueOf(z11));
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21886d
    /* renamed from: t */
    public final void mo114032t(SerialDescriptor serialDescriptor, int i11, float f11) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        if (mo114023G(serialDescriptor, i11)) {
            mo113995u(f11);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: u */
    public void mo113995u(float f11) {
        mo114025I(Float.valueOf(f11));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: v */
    public void mo113996v(char c11) {
        mo114025I(Character.valueOf(c11));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: w */
    public void mo113997w() {
        Encoder.C21882a.m113999b(this);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21886d
    /* renamed from: x */
    public final void mo114033x(SerialDescriptor serialDescriptor, int i11, int i12) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        if (mo114023G(serialDescriptor, i11)) {
            mo113981B(i12);
        }
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21886d
    /* renamed from: y */
    public final void mo114034y(SerialDescriptor serialDescriptor, int i11, boolean z11) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        if (mo114023G(serialDescriptor, i11)) {
            mo113994s(z11);
        }
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21886d
    /* renamed from: z */
    public final void mo114035z(SerialDescriptor serialDescriptor, int i11, String str) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        AbstractC19074t.m100208f(str, "value");
        if (mo114023G(serialDescriptor, i11)) {
            mo113982F(str);
        }
    }
}
