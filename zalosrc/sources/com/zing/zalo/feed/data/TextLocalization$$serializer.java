package com.zing.zalo.feed.data;

import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.encoding.InterfaceC21886d;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import tn0.AbstractC26805k1;
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes4.dex */
public final class TextLocalization$$serializer implements InterfaceC26842x {
    public static final TextLocalization$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        TextLocalization$$serializer textLocalization$$serializer = new TextLocalization$$serializer();
        INSTANCE = textLocalization$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.feed.data.TextLocalization", textLocalization$$serializer, 2);
        pluginGeneratedSerialDescriptor.m114047n("vi", true);
        pluginGeneratedSerialDescriptor.m114047n("en", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TextLocalization$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26814n1 c26814n1 = C26814n1.f127034a;
        return new KSerializer[]{c26814n1, c26814n1};
    }

    @Override // qn0.InterfaceC25386a
    public TextLocalization deserialize(Decoder decoder) {
        String str;
        String str2;
        int i11;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            str = mo113968b.mo114014o(descriptor2, 0);
            str2 = mo113968b.mo114014o(descriptor2, 1);
            i11 = 3;
        } else {
            str = null;
            String str3 = null;
            int i12 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    str = mo113968b.mo114014o(descriptor2, 0);
                    i12 |= 1;
                } else {
                    if (mo114037p != 1) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    str3 = mo113968b.mo114014o(descriptor2, 1);
                    i12 |= 2;
                }
            }
            str2 = str3;
            i11 = i12;
        }
        mo113968b.mo114009c(descriptor2);
        return new TextLocalization(i11, str, str2, (AbstractC26805k1) null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, TextLocalization textLocalization) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(textLocalization, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        TextLocalization.m44976c(textLocalization, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
