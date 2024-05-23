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
import tn0.C26783d0;
import tn0.InterfaceC26842x;

/* loaded from: classes4.dex */
public final class NumberTheme$$serializer implements InterfaceC26842x {
    public static final NumberTheme$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        NumberTheme$$serializer numberTheme$$serializer = new NumberTheme$$serializer();
        INSTANCE = numberTheme$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.feed.data.NumberTheme", numberTheme$$serializer, 2);
        pluginGeneratedSerialDescriptor.m114047n("l", true);
        pluginGeneratedSerialDescriptor.m114047n("d", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private NumberTheme$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26783d0 c26783d0 = C26783d0.f126989a;
        return new KSerializer[]{c26783d0, c26783d0};
    }

    @Override // qn0.InterfaceC25386a
    public NumberTheme deserialize(Decoder decoder) {
        int i11;
        int i12;
        int i13;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            i11 = mo113968b.mo114011i(descriptor2, 0);
            i12 = mo113968b.mo114011i(descriptor2, 1);
            i13 = 3;
        } else {
            i11 = 0;
            int i14 = 0;
            int i15 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    i11 = mo113968b.mo114011i(descriptor2, 0);
                    i15 |= 1;
                } else {
                    if (mo114037p != 1) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    i14 = mo113968b.mo114011i(descriptor2, 1);
                    i15 |= 2;
                }
            }
            i12 = i14;
            i13 = i15;
        }
        mo113968b.mo114009c(descriptor2);
        return new NumberTheme(i13, i11, i12, (AbstractC26805k1) null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, NumberTheme numberTheme) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(numberTheme, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        NumberTheme.write$Self$app_release(numberTheme, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
