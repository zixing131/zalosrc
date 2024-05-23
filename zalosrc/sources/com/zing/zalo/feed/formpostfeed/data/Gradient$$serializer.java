package com.zing.zalo.feed.formpostfeed.data;

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
public final class Gradient$$serializer implements InterfaceC26842x {
    public static final Gradient$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Gradient$$serializer gradient$$serializer = new Gradient$$serializer();
        INSTANCE = gradient$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.feed.formpostfeed.data.Gradient", gradient$$serializer, 2);
        pluginGeneratedSerialDescriptor.m114047n("direction", true);
        pluginGeneratedSerialDescriptor.m114047n("color", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Gradient$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        return new KSerializer[]{C26783d0.f126989a, GradientColor$$serializer.INSTANCE};
    }

    @Override // qn0.InterfaceC25386a
    public Gradient deserialize(Decoder decoder) {
        int i11;
        GradientColor gradientColor;
        int i12;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            i11 = mo113968b.mo114011i(descriptor2, 0);
            gradientColor = (GradientColor) mo113968b.mo114012l(descriptor2, 1, GradientColor$$serializer.INSTANCE, null);
            i12 = 3;
        } else {
            GradientColor gradientColor2 = null;
            i11 = 0;
            int i13 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    i11 = mo113968b.mo114011i(descriptor2, 0);
                    i13 |= 1;
                } else {
                    if (mo114037p != 1) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    gradientColor2 = (GradientColor) mo113968b.mo114012l(descriptor2, 1, GradientColor$$serializer.INSTANCE, gradientColor2);
                    i13 |= 2;
                }
            }
            gradientColor = gradientColor2;
            i12 = i13;
        }
        mo113968b.mo114009c(descriptor2);
        return new Gradient(i12, i11, gradientColor, (AbstractC26805k1) null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, Gradient gradient) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(gradient, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        Gradient.write$Self$app_release(gradient, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
