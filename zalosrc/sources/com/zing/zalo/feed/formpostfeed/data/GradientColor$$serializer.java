package com.zing.zalo.feed.formpostfeed.data;

import com.zing.zalo.feed.data.NumberTheme;
import com.zing.zalo.feed.data.NumberTheme$$serializer;
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
import tn0.InterfaceC26842x;

/* loaded from: classes4.dex */
public final class GradientColor$$serializer implements InterfaceC26842x {
    public static final GradientColor$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        GradientColor$$serializer gradientColor$$serializer = new GradientColor$$serializer();
        INSTANCE = gradientColor$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.feed.formpostfeed.data.GradientColor", gradientColor$$serializer, 2);
        pluginGeneratedSerialDescriptor.m114047n("start", true);
        pluginGeneratedSerialDescriptor.m114047n("end", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GradientColor$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        NumberTheme$$serializer numberTheme$$serializer = NumberTheme$$serializer.INSTANCE;
        return new KSerializer[]{numberTheme$$serializer, numberTheme$$serializer};
    }

    @Override // qn0.InterfaceC25386a
    public GradientColor deserialize(Decoder decoder) {
        NumberTheme numberTheme;
        int i11;
        NumberTheme numberTheme2;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            NumberTheme$$serializer numberTheme$$serializer = NumberTheme$$serializer.INSTANCE;
            numberTheme2 = (NumberTheme) mo113968b.mo114012l(descriptor2, 0, numberTheme$$serializer, null);
            numberTheme = (NumberTheme) mo113968b.mo114012l(descriptor2, 1, numberTheme$$serializer, null);
            i11 = 3;
        } else {
            numberTheme = null;
            NumberTheme numberTheme3 = null;
            int i12 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    numberTheme3 = (NumberTheme) mo113968b.mo114012l(descriptor2, 0, NumberTheme$$serializer.INSTANCE, numberTheme3);
                    i12 |= 1;
                } else {
                    if (mo114037p != 1) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    numberTheme = (NumberTheme) mo113968b.mo114012l(descriptor2, 1, NumberTheme$$serializer.INSTANCE, numberTheme);
                    i12 |= 2;
                }
            }
            i11 = i12;
            numberTheme2 = numberTheme3;
        }
        mo113968b.mo114009c(descriptor2);
        return new GradientColor(i11, numberTheme2, numberTheme, (AbstractC26805k1) null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, GradientColor gradientColor) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(gradientColor, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        GradientColor.write$Self$app_release(gradientColor, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
