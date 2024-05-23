package com.zing.zalo.shortvideo.p072ui.model;

import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.encoding.InterfaceC21886d;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import rn0.AbstractC25935a;
import tn0.C26783d0;
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes5.dex */
public final class Ended$$serializer implements InterfaceC26842x {
    public static final Ended$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Ended$$serializer ended$$serializer = new Ended$$serializer();
        INSTANCE = ended$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.ui.model.Ended", ended$$serializer, 7);
        pluginGeneratedSerialDescriptor.m114047n("avatar", false);
        pluginGeneratedSerialDescriptor.m114047n("name", false);
        pluginGeneratedSerialDescriptor.m114047n("message", false);
        pluginGeneratedSerialDescriptor.m114047n("actionLink", false);
        pluginGeneratedSerialDescriptor.m114047n("actionText", false);
        pluginGeneratedSerialDescriptor.m114047n("actionTextColor", false);
        pluginGeneratedSerialDescriptor.m114047n("actionBgColor", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Ended$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26814n1 c26814n1 = C26814n1.f127034a;
        C26783d0 c26783d0 = C26783d0.f126989a;
        return new KSerializer[]{AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26783d0), AbstractC25935a.m133630u(c26783d0)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x006e. Please report as an issue. */
    @Override // qn0.InterfaceC25386a
    public Ended deserialize(Decoder decoder) {
        int i11;
        Integer num;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Integer num2;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        int i12 = 6;
        String str6 = null;
        if (mo113968b.mo114015q()) {
            C26814n1 c26814n1 = C26814n1.f127034a;
            String str7 = (String) mo113968b.mo114018x(descriptor2, 0, c26814n1, null);
            String str8 = (String) mo113968b.mo114018x(descriptor2, 1, c26814n1, null);
            String str9 = (String) mo113968b.mo114018x(descriptor2, 2, c26814n1, null);
            String str10 = (String) mo113968b.mo114018x(descriptor2, 3, c26814n1, null);
            String str11 = (String) mo113968b.mo114018x(descriptor2, 4, c26814n1, null);
            C26783d0 c26783d0 = C26783d0.f126989a;
            Integer num3 = (Integer) mo113968b.mo114018x(descriptor2, 5, c26783d0, null);
            str5 = str11;
            num = (Integer) mo113968b.mo114018x(descriptor2, 6, c26783d0, null);
            num2 = num3;
            str4 = str10;
            str3 = str9;
            str2 = str8;
            str = str7;
            i11 = 127;
        } else {
            Integer num4 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            Integer num5 = null;
            int i13 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                switch (mo114037p) {
                    case -1:
                        i12 = 6;
                        z11 = false;
                    case 0:
                        str6 = (String) mo113968b.mo114018x(descriptor2, 0, C26814n1.f127034a, str6);
                        i13 |= 1;
                        i12 = 6;
                    case 1:
                        str12 = (String) mo113968b.mo114018x(descriptor2, 1, C26814n1.f127034a, str12);
                        i13 |= 2;
                        i12 = 6;
                    case 2:
                        str13 = (String) mo113968b.mo114018x(descriptor2, 2, C26814n1.f127034a, str13);
                        i13 |= 4;
                    case 3:
                        str14 = (String) mo113968b.mo114018x(descriptor2, 3, C26814n1.f127034a, str14);
                        i13 |= 8;
                    case 4:
                        str15 = (String) mo113968b.mo114018x(descriptor2, 4, C26814n1.f127034a, str15);
                        i13 |= 16;
                    case 5:
                        num5 = (Integer) mo113968b.mo114018x(descriptor2, 5, C26783d0.f126989a, num5);
                        i13 |= 32;
                    case 6:
                        num4 = (Integer) mo113968b.mo114018x(descriptor2, i12, C26783d0.f126989a, num4);
                        i13 |= 64;
                    default:
                        throw new UnknownFieldException(mo114037p);
                }
            }
            i11 = i13;
            num = num4;
            str = str6;
            str2 = str12;
            str3 = str13;
            str4 = str14;
            str5 = str15;
            num2 = num5;
        }
        mo113968b.mo114009c(descriptor2);
        return new Ended(i11, str, str2, str3, str4, str5, num2, num, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, Ended ended) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(ended, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        Ended.m52790h(ended, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
