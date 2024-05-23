package com.zing.zalo.feed.formpostfeed.data;

import com.zing.zalo.feed.data.NumberTheme;
import com.zing.zalo.feed.data.NumberTheme$$serializer;
import com.zing.zalo.feed.data.StringTheme;
import com.zing.zalo.feed.data.StringTheme$$serializer;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.encoding.InterfaceC21886d;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import tn0.C26783d0;
import tn0.InterfaceC26842x;

/* loaded from: classes4.dex */
public final class Display$$serializer implements InterfaceC26842x {
    public static final Display$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Display$$serializer display$$serializer = new Display$$serializer();
        INSTANCE = display$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.feed.formpostfeed.data.Display", display$$serializer, 6);
        pluginGeneratedSerialDescriptor.m114047n(ZinstantMetaConstant.IMPRESSION_META_TYPE, true);
        pluginGeneratedSerialDescriptor.m114047n("solidColor", true);
        pluginGeneratedSerialDescriptor.m114047n("gradient", true);
        pluginGeneratedSerialDescriptor.m114047n("imageUrl", true);
        pluginGeneratedSerialDescriptor.m114047n("lottie", true);
        pluginGeneratedSerialDescriptor.m114047n("size", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Display$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26783d0 c26783d0 = C26783d0.f126989a;
        return new KSerializer[]{c26783d0, NumberTheme$$serializer.INSTANCE, Gradient$$serializer.INSTANCE, StringTheme$$serializer.INSTANCE, Lottie$$serializer.INSTANCE, c26783d0};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0064. Please report as an issue. */
    @Override // qn0.InterfaceC25386a
    public Display deserialize(Decoder decoder) {
        int i11;
        int i12;
        int i13;
        NumberTheme numberTheme;
        Gradient gradient;
        StringTheme stringTheme;
        Lottie lottie;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            int mo114011i = mo113968b.mo114011i(descriptor2, 0);
            NumberTheme numberTheme2 = (NumberTheme) mo113968b.mo114012l(descriptor2, 1, NumberTheme$$serializer.INSTANCE, null);
            Gradient gradient2 = (Gradient) mo113968b.mo114012l(descriptor2, 2, Gradient$$serializer.INSTANCE, null);
            StringTheme stringTheme2 = (StringTheme) mo113968b.mo114012l(descriptor2, 3, StringTheme$$serializer.INSTANCE, null);
            Lottie lottie2 = (Lottie) mo113968b.mo114012l(descriptor2, 4, Lottie$$serializer.INSTANCE, null);
            i11 = mo114011i;
            i12 = mo113968b.mo114011i(descriptor2, 5);
            stringTheme = stringTheme2;
            lottie = lottie2;
            gradient = gradient2;
            numberTheme = numberTheme2;
            i13 = 63;
        } else {
            NumberTheme numberTheme3 = null;
            Gradient gradient3 = null;
            StringTheme stringTheme3 = null;
            Lottie lottie3 = null;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                switch (mo114037p) {
                    case -1:
                        z11 = false;
                    case 0:
                        i14 = mo113968b.mo114011i(descriptor2, 0);
                        i16 |= 1;
                    case 1:
                        numberTheme3 = (NumberTheme) mo113968b.mo114012l(descriptor2, 1, NumberTheme$$serializer.INSTANCE, numberTheme3);
                        i16 |= 2;
                    case 2:
                        gradient3 = (Gradient) mo113968b.mo114012l(descriptor2, 2, Gradient$$serializer.INSTANCE, gradient3);
                        i16 |= 4;
                    case 3:
                        stringTheme3 = (StringTheme) mo113968b.mo114012l(descriptor2, 3, StringTheme$$serializer.INSTANCE, stringTheme3);
                        i16 |= 8;
                    case 4:
                        lottie3 = (Lottie) mo113968b.mo114012l(descriptor2, 4, Lottie$$serializer.INSTANCE, lottie3);
                        i16 |= 16;
                    case 5:
                        i15 = mo113968b.mo114011i(descriptor2, 5);
                        i16 |= 32;
                    default:
                        throw new UnknownFieldException(mo114037p);
                }
            }
            i11 = i14;
            i12 = i15;
            i13 = i16;
            numberTheme = numberTheme3;
            gradient = gradient3;
            stringTheme = stringTheme3;
            lottie = lottie3;
        }
        mo113968b.mo114009c(descriptor2);
        return new Display(i13, i11, numberTheme, gradient, stringTheme, lottie, i12, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, Display display) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(display, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        Display.write$Self$app_release(display, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
