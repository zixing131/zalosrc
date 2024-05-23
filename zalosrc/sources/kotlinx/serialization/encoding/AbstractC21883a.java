package kotlinx.serialization.encoding;

import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.InterfaceC21885c;
import qn0.InterfaceC25386a;

/* renamed from: kotlinx.serialization.encoding.a */
/* loaded from: classes7.dex */
public abstract class AbstractC21883a implements Decoder, InterfaceC21885c {
    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: A */
    public String mo113965A() {
        Object m114008J = m114008J();
        AbstractC19074t.m100206d(m114008J, "null cannot be cast to non-null type kotlin.String");
        return (String) m114008J;
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21885c
    /* renamed from: B */
    public final char mo114002B(SerialDescriptor serialDescriptor, int i11) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        return mo113979z();
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21885c
    /* renamed from: C */
    public final byte mo114003C(SerialDescriptor serialDescriptor, int i11) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        return mo113967H();
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21885c
    /* renamed from: D */
    public final boolean mo114004D(SerialDescriptor serialDescriptor, int i11) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        return mo113978y();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: E */
    public boolean mo113966E() {
        return true;
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21885c
    /* renamed from: F */
    public final short mo114005F(SerialDescriptor serialDescriptor, int i11) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        return mo113975t();
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21885c
    /* renamed from: G */
    public final double mo114006G(SerialDescriptor serialDescriptor, int i11) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        return mo113977w();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: H */
    public abstract byte mo113967H();

    /* renamed from: I */
    public Object m114007I(InterfaceC25386a interfaceC25386a, Object obj) {
        AbstractC19074t.m100208f(interfaceC25386a, "deserializer");
        return mo113972k(interfaceC25386a);
    }

    /* renamed from: J */
    public Object m114008J() {
        throw new SerializationException(AbstractC19061k0.m100169b(getClass()) + " can't retrieve untyped values");
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: b */
    public InterfaceC21885c mo113968b(SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21885c
    /* renamed from: c */
    public void mo114009c(SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: e */
    public int mo113969e(SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(serialDescriptor, "enumDescriptor");
        Object m114008J = m114008J();
        AbstractC19074t.m100206d(m114008J, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) m114008J).intValue();
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21885c
    /* renamed from: f */
    public final long mo114010f(SerialDescriptor serialDescriptor, int i11) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        return mo113973n();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: h */
    public abstract int mo113970h();

    @Override // kotlinx.serialization.encoding.InterfaceC21885c
    /* renamed from: i */
    public final int mo114011i(SerialDescriptor serialDescriptor, int i11) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        return mo113970h();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: j */
    public Void mo113971j() {
        return null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: k */
    public Object mo113972k(InterfaceC25386a interfaceC25386a) {
        return Decoder.C21881a.m113980a(this, interfaceC25386a);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21885c
    /* renamed from: l */
    public Object mo114012l(SerialDescriptor serialDescriptor, int i11, InterfaceC25386a interfaceC25386a, Object obj) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        AbstractC19074t.m100208f(interfaceC25386a, "deserializer");
        return m114007I(interfaceC25386a, obj);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21885c
    /* renamed from: m */
    public int mo114013m(SerialDescriptor serialDescriptor) {
        return InterfaceC21885c.a.m114038a(this, serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: n */
    public abstract long mo113973n();

    @Override // kotlinx.serialization.encoding.InterfaceC21885c
    /* renamed from: o */
    public final String mo114014o(SerialDescriptor serialDescriptor, int i11) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        return mo113965A();
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
        return this;
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21885c
    /* renamed from: s */
    public Decoder mo114016s(SerialDescriptor serialDescriptor, int i11) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        return mo113974r(serialDescriptor.mo113952h(i11));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: t */
    public abstract short mo113975t();

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: u */
    public float mo113976u() {
        Object m114008J = m114008J();
        AbstractC19074t.m100206d(m114008J, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) m114008J).floatValue();
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21885c
    /* renamed from: v */
    public final float mo114017v(SerialDescriptor serialDescriptor, int i11) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        return mo113976u();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: w */
    public double mo113977w() {
        Object m114008J = m114008J();
        AbstractC19074t.m100206d(m114008J, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) m114008J).doubleValue();
    }

    @Override // kotlinx.serialization.encoding.InterfaceC21885c
    /* renamed from: x */
    public final Object mo114018x(SerialDescriptor serialDescriptor, int i11, InterfaceC25386a interfaceC25386a, Object obj) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        AbstractC19074t.m100208f(interfaceC25386a, "deserializer");
        if (!interfaceC25386a.getDescriptor().mo113946b() && !mo113966E()) {
            return mo113971j();
        }
        return m114007I(interfaceC25386a, obj);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: y */
    public boolean mo113978y() {
        Object m114008J = m114008J();
        AbstractC19074t.m100206d(m114008J, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) m114008J).booleanValue();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* renamed from: z */
    public char mo113979z() {
        Object m114008J = m114008J();
        AbstractC19074t.m100206d(m114008J, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) m114008J).charValue();
    }
}
