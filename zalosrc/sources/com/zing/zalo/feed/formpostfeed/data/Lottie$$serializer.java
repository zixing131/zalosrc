package com.zing.zalo.feed.formpostfeed.data;

import com.zing.zalo.feed.data.StringTheme;
import com.zing.zalo.feed.data.StringTheme$$serializer;
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
public final class Lottie$$serializer implements InterfaceC26842x {
    public static final Lottie$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Lottie$$serializer lottie$$serializer = new Lottie$$serializer();
        INSTANCE = lottie$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.feed.formpostfeed.data.Lottie", lottie$$serializer, 2);
        pluginGeneratedSerialDescriptor.m114047n("id", true);
        pluginGeneratedSerialDescriptor.m114047n("repeat", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Lottie$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        return new KSerializer[]{StringTheme$$serializer.INSTANCE, C26783d0.f126989a};
    }

    @Override // qn0.InterfaceC25386a
    public Lottie deserialize(Decoder decoder) {
        StringTheme stringTheme;
        int i11;
        int i12;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            stringTheme = (StringTheme) mo113968b.mo114012l(descriptor2, 0, StringTheme$$serializer.INSTANCE, null);
            i11 = mo113968b.mo114011i(descriptor2, 1);
            i12 = 3;
        } else {
            stringTheme = null;
            int i13 = 0;
            int i14 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    stringTheme = (StringTheme) mo113968b.mo114012l(descriptor2, 0, StringTheme$$serializer.INSTANCE, stringTheme);
                    i14 |= 1;
                } else {
                    if (mo114037p != 1) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    i13 = mo113968b.mo114011i(descriptor2, 1);
                    i14 |= 2;
                }
            }
            i11 = i13;
            i12 = i14;
        }
        mo113968b.mo114009c(descriptor2);
        return new Lottie(i12, stringTheme, i11, (AbstractC26805k1) null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, Lottie lottie) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(lottie, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        Lottie.write$Self$app_release(lottie, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
