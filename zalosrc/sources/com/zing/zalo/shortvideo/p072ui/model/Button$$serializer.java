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
public final class Button$$serializer implements InterfaceC26842x {
    public static final Button$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Button$$serializer button$$serializer = new Button$$serializer();
        INSTANCE = button$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.ui.model.Button", button$$serializer, 4);
        pluginGeneratedSerialDescriptor.m114047n("actionLink", false);
        pluginGeneratedSerialDescriptor.m114047n("text", false);
        pluginGeneratedSerialDescriptor.m114047n("textColor", false);
        pluginGeneratedSerialDescriptor.m114047n("bgColor", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Button$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26814n1 c26814n1 = C26814n1.f127034a;
        C26783d0 c26783d0 = C26783d0.f126989a;
        return new KSerializer[]{AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26783d0), AbstractC25935a.m133630u(c26783d0)};
    }

    @Override // qn0.InterfaceC25386a
    public Button deserialize(Decoder decoder) {
        int i11;
        String str;
        String str2;
        Integer num;
        Integer num2;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        String str3 = null;
        if (mo113968b.mo114015q()) {
            C26814n1 c26814n1 = C26814n1.f127034a;
            String str4 = (String) mo113968b.mo114018x(descriptor2, 0, c26814n1, null);
            String str5 = (String) mo113968b.mo114018x(descriptor2, 1, c26814n1, null);
            C26783d0 c26783d0 = C26783d0.f126989a;
            Integer num3 = (Integer) mo113968b.mo114018x(descriptor2, 2, c26783d0, null);
            str2 = str5;
            num2 = (Integer) mo113968b.mo114018x(descriptor2, 3, c26783d0, null);
            num = num3;
            str = str4;
            i11 = 15;
        } else {
            String str6 = null;
            Integer num4 = null;
            Integer num5 = null;
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
                    num4 = (Integer) mo113968b.mo114018x(descriptor2, 2, C26783d0.f126989a, num4);
                    i12 |= 4;
                } else {
                    if (mo114037p != 3) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    num5 = (Integer) mo113968b.mo114018x(descriptor2, 3, C26783d0.f126989a, num5);
                    i12 |= 8;
                }
            }
            i11 = i12;
            str = str3;
            str2 = str6;
            num = num4;
            num2 = num5;
        }
        mo113968b.mo114009c(descriptor2);
        return new Button(i11, str, str2, num, num2, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, Button button) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(button, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        Button.m52783e(button, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
