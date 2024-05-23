package kotlinx.serialization.encoding;

import fn0.AbstractC19074t;
import kotlinx.serialization.descriptors.SerialDescriptor;
import qn0.InterfaceC25393h;

/* renamed from: kotlinx.serialization.encoding.d */
/* loaded from: classes7.dex */
public interface InterfaceC21886d {

    /* renamed from: kotlinx.serialization.encoding.d$a */
    /* loaded from: classes7.dex */
    public static final class a {
        /* renamed from: a */
        public static boolean m114041a(InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor, int i11) {
            AbstractC19074t.m100208f(serialDescriptor, "descriptor");
            return true;
        }
    }

    /* renamed from: A */
    boolean mo114019A(SerialDescriptor serialDescriptor, int i11);

    /* renamed from: C */
    void mo114020C(SerialDescriptor serialDescriptor, int i11, short s7);

    /* renamed from: D */
    void mo114021D(SerialDescriptor serialDescriptor, int i11, double d11);

    /* renamed from: E */
    void mo114022E(SerialDescriptor serialDescriptor, int i11, long j11);

    /* renamed from: c */
    void mo114026c(SerialDescriptor serialDescriptor);

    /* renamed from: e */
    Encoder mo114027e(SerialDescriptor serialDescriptor, int i11);

    /* renamed from: h */
    void mo114028h(SerialDescriptor serialDescriptor, int i11, InterfaceC25393h interfaceC25393h, Object obj);

    /* renamed from: i */
    void mo114029i(SerialDescriptor serialDescriptor, int i11, InterfaceC25393h interfaceC25393h, Object obj);

    /* renamed from: o */
    void mo114030o(SerialDescriptor serialDescriptor, int i11, char c11);

    /* renamed from: q */
    void mo114031q(SerialDescriptor serialDescriptor, int i11, byte b11);

    /* renamed from: t */
    void mo114032t(SerialDescriptor serialDescriptor, int i11, float f11);

    /* renamed from: x */
    void mo114033x(SerialDescriptor serialDescriptor, int i11, int i12);

    /* renamed from: y */
    void mo114034y(SerialDescriptor serialDescriptor, int i11, boolean z11);

    /* renamed from: z */
    void mo114035z(SerialDescriptor serialDescriptor, int i11, String str);
}
