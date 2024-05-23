package kotlinx.serialization.encoding;

import fn0.AbstractC19074t;
import kotlinx.serialization.descriptors.SerialDescriptor;
import qn0.InterfaceC25386a;
import wn0.AbstractC29112b;

/* renamed from: kotlinx.serialization.encoding.c */
/* loaded from: classes7.dex */
public interface InterfaceC21885c {

    /* renamed from: kotlinx.serialization.encoding.c$a */
    /* loaded from: classes7.dex */
    public static final class a {
        /* renamed from: a */
        public static int m114038a(InterfaceC21885c interfaceC21885c, SerialDescriptor serialDescriptor) {
            AbstractC19074t.m100208f(serialDescriptor, "descriptor");
            return -1;
        }

        /* renamed from: b */
        public static boolean m114039b(InterfaceC21885c interfaceC21885c) {
            return false;
        }

        /* renamed from: c */
        public static /* synthetic */ Object m114040c(InterfaceC21885c interfaceC21885c, SerialDescriptor serialDescriptor, int i11, InterfaceC25386a interfaceC25386a, Object obj, int i12, Object obj2) {
            if (obj2 == null) {
                if ((i12 & 8) != 0) {
                    obj = null;
                }
                return interfaceC21885c.mo114012l(serialDescriptor, i11, interfaceC25386a, obj);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
        }
    }

    /* renamed from: B */
    char mo114002B(SerialDescriptor serialDescriptor, int i11);

    /* renamed from: C */
    byte mo114003C(SerialDescriptor serialDescriptor, int i11);

    /* renamed from: D */
    boolean mo114004D(SerialDescriptor serialDescriptor, int i11);

    /* renamed from: F */
    short mo114005F(SerialDescriptor serialDescriptor, int i11);

    /* renamed from: G */
    double mo114006G(SerialDescriptor serialDescriptor, int i11);

    /* renamed from: a */
    AbstractC29112b mo114036a();

    /* renamed from: c */
    void mo114009c(SerialDescriptor serialDescriptor);

    /* renamed from: f */
    long mo114010f(SerialDescriptor serialDescriptor, int i11);

    /* renamed from: i */
    int mo114011i(SerialDescriptor serialDescriptor, int i11);

    /* renamed from: l */
    Object mo114012l(SerialDescriptor serialDescriptor, int i11, InterfaceC25386a interfaceC25386a, Object obj);

    /* renamed from: m */
    int mo114013m(SerialDescriptor serialDescriptor);

    /* renamed from: o */
    String mo114014o(SerialDescriptor serialDescriptor, int i11);

    /* renamed from: p */
    int mo114037p(SerialDescriptor serialDescriptor);

    /* renamed from: q */
    boolean mo114015q();

    /* renamed from: s */
    Decoder mo114016s(SerialDescriptor serialDescriptor, int i11);

    /* renamed from: v */
    float mo114017v(SerialDescriptor serialDescriptor, int i11);

    /* renamed from: x */
    Object mo114018x(SerialDescriptor serialDescriptor, int i11, InterfaceC25386a interfaceC25386a, Object obj);
}
