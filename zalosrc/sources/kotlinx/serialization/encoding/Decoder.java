package kotlinx.serialization.encoding;

import fn0.AbstractC19074t;
import kotlinx.serialization.descriptors.SerialDescriptor;
import qn0.InterfaceC25386a;

/* loaded from: classes7.dex */
public interface Decoder {

    /* renamed from: kotlinx.serialization.encoding.Decoder$a */
    /* loaded from: classes7.dex */
    public static final class C21881a {
        /* renamed from: a */
        public static Object m113980a(Decoder decoder, InterfaceC25386a interfaceC25386a) {
            AbstractC19074t.m100208f(interfaceC25386a, "deserializer");
            return interfaceC25386a.deserialize(decoder);
        }
    }

    /* renamed from: A */
    String mo113965A();

    /* renamed from: E */
    boolean mo113966E();

    /* renamed from: H */
    byte mo113967H();

    /* renamed from: b */
    InterfaceC21885c mo113968b(SerialDescriptor serialDescriptor);

    /* renamed from: e */
    int mo113969e(SerialDescriptor serialDescriptor);

    /* renamed from: h */
    int mo113970h();

    /* renamed from: j */
    Void mo113971j();

    /* renamed from: k */
    Object mo113972k(InterfaceC25386a interfaceC25386a);

    /* renamed from: n */
    long mo113973n();

    /* renamed from: r */
    Decoder mo113974r(SerialDescriptor serialDescriptor);

    /* renamed from: t */
    short mo113975t();

    /* renamed from: u */
    float mo113976u();

    /* renamed from: w */
    double mo113977w();

    /* renamed from: y */
    boolean mo113978y();

    /* renamed from: z */
    char mo113979z();
}
