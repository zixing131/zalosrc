package kotlinx.serialization.encoding;

import fn0.AbstractC19074t;
import kotlinx.serialization.descriptors.SerialDescriptor;
import qn0.InterfaceC25393h;
import wn0.AbstractC29112b;

/* loaded from: classes7.dex */
public interface Encoder {

    /* renamed from: kotlinx.serialization.encoding.Encoder$a */
    /* loaded from: classes7.dex */
    public static final class C21882a {
        /* renamed from: a */
        public static InterfaceC21886d m113998a(Encoder encoder, SerialDescriptor serialDescriptor, int i11) {
            AbstractC19074t.m100208f(serialDescriptor, "descriptor");
            return encoder.mo113984b(serialDescriptor);
        }

        /* renamed from: b */
        public static void m113999b(Encoder encoder) {
        }

        /* renamed from: c */
        public static void m114000c(Encoder encoder, InterfaceC25393h interfaceC25393h, Object obj) {
            AbstractC19074t.m100208f(interfaceC25393h, "serializer");
            if (interfaceC25393h.getDescriptor().mo113946b()) {
                encoder.mo113987j(interfaceC25393h, obj);
            } else if (obj == null) {
                encoder.mo113992p();
            } else {
                encoder.mo113997w();
                encoder.mo113987j(interfaceC25393h, obj);
            }
        }

        /* renamed from: d */
        public static void m114001d(Encoder encoder, InterfaceC25393h interfaceC25393h, Object obj) {
            AbstractC19074t.m100208f(interfaceC25393h, "serializer");
            interfaceC25393h.serialize(encoder, obj);
        }
    }

    /* renamed from: B */
    void mo113981B(int i11);

    /* renamed from: F */
    void mo113982F(String str);

    /* renamed from: a */
    AbstractC29112b mo113983a();

    /* renamed from: b */
    InterfaceC21886d mo113984b(SerialDescriptor serialDescriptor);

    /* renamed from: f */
    void mo113985f(double d11);

    /* renamed from: g */
    void mo113986g(byte b11);

    /* renamed from: j */
    void mo113987j(InterfaceC25393h interfaceC25393h, Object obj);

    /* renamed from: k */
    InterfaceC21886d mo113988k(SerialDescriptor serialDescriptor, int i11);

    /* renamed from: l */
    void mo113989l(SerialDescriptor serialDescriptor, int i11);

    /* renamed from: m */
    Encoder mo113990m(SerialDescriptor serialDescriptor);

    /* renamed from: n */
    void mo113991n(long j11);

    /* renamed from: p */
    void mo113992p();

    /* renamed from: r */
    void mo113993r(short s7);

    /* renamed from: s */
    void mo113994s(boolean z11);

    /* renamed from: u */
    void mo113995u(float f11);

    /* renamed from: v */
    void mo113996v(char c11);

    /* renamed from: w */
    void mo113997w();
}
