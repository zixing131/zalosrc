package com.zing.zalo.shortvideo.data.model;

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
import tn0.C26810m0;
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes5.dex */
public final class Footer$$serializer implements InterfaceC26842x {
    public static final Footer$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Footer$$serializer footer$$serializer = new Footer$$serializer();
        INSTANCE = footer$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.model.Footer", footer$$serializer, 4);
        pluginGeneratedSerialDescriptor.m114047n("thumb", true);
        pluginGeneratedSerialDescriptor.m114047n("title", true);
        pluginGeneratedSerialDescriptor.m114047n("timeoutMillis", true);
        pluginGeneratedSerialDescriptor.m114047n("action", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Footer$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26814n1 c26814n1 = C26814n1.f127034a;
        return new KSerializer[]{AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(C26810m0.f127024a), AbstractC25935a.m133630u(Action$$serializer.INSTANCE)};
    }

    @Override // qn0.InterfaceC25386a
    public Footer deserialize(Decoder decoder) {
        int i11;
        String str;
        String str2;
        Long l11;
        Action action;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        String str3 = null;
        if (mo113968b.mo114015q()) {
            C26814n1 c26814n1 = C26814n1.f127034a;
            String str4 = (String) mo113968b.mo114018x(descriptor2, 0, c26814n1, null);
            String str5 = (String) mo113968b.mo114018x(descriptor2, 1, c26814n1, null);
            Long l12 = (Long) mo113968b.mo114018x(descriptor2, 2, C26810m0.f127024a, null);
            str2 = str5;
            action = (Action) mo113968b.mo114018x(descriptor2, 3, Action$$serializer.INSTANCE, null);
            l11 = l12;
            str = str4;
            i11 = 15;
        } else {
            String str6 = null;
            Long l13 = null;
            Action action2 = null;
            int i12 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    str3 = (String) mo113968b.mo114018x(descriptor2, 0, C26814n1.f127034a, str3);
                    i12 |= 1;
                } else if (mo114037p == 1) {
                    str6 = (String) mo113968b.mo114018x(descriptor2, 1, C26814n1.f127034a, str6);
                    i12 |= 2;
                } else if (mo114037p == 2) {
                    l13 = (Long) mo113968b.mo114018x(descriptor2, 2, C26810m0.f127024a, l13);
                    i12 |= 4;
                } else {
                    if (mo114037p != 3) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    action2 = (Action) mo113968b.mo114018x(descriptor2, 3, Action$$serializer.INSTANCE, action2);
                    i12 |= 8;
                }
            }
            i11 = i12;
            str = str3;
            str2 = str6;
            l11 = l13;
            action = action2;
        }
        mo113968b.mo114009c(descriptor2);
        return new Footer(i11, str, str2, l11, action, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, Footer footer) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(footer, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        Footer.m50936d(footer, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
