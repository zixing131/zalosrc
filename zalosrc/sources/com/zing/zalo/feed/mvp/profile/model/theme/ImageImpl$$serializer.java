package com.zing.zalo.feed.mvp.profile.model.theme;

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
import tn0.C26814n1;
import tn0.C26839w;
import tn0.InterfaceC26842x;

/* loaded from: classes4.dex */
public final class ImageImpl$$serializer implements InterfaceC26842x {
    public static final ImageImpl$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ImageImpl$$serializer imageImpl$$serializer = new ImageImpl$$serializer();
        INSTANCE = imageImpl$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.feed.mvp.profile.model.theme.ImageImpl", imageImpl$$serializer, 6);
        pluginGeneratedSerialDescriptor.m114047n("url_res", true);
        pluginGeneratedSerialDescriptor.m114047n("anchorType", true);
        pluginGeneratedSerialDescriptor.m114047n("translateX", true);
        pluginGeneratedSerialDescriptor.m114047n("translateY", true);
        pluginGeneratedSerialDescriptor.m114047n("scaleType", true);
        pluginGeneratedSerialDescriptor.m114047n("scale", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ImageImpl$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26814n1 c26814n1 = C26814n1.f127034a;
        C26839w c26839w = C26839w.f127098a;
        return new KSerializer[]{c26814n1, C26783d0.f126989a, c26839w, c26839w, c26814n1, c26839w};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0052. Please report as an issue. */
    @Override // qn0.InterfaceC25386a
    public ImageImpl deserialize(Decoder decoder) {
        String str;
        float f11;
        float f12;
        String str2;
        float f13;
        int i11;
        int i12;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            String mo114014o = mo113968b.mo114014o(descriptor2, 0);
            int mo114011i = mo113968b.mo114011i(descriptor2, 1);
            float mo114017v = mo113968b.mo114017v(descriptor2, 2);
            float mo114017v2 = mo113968b.mo114017v(descriptor2, 3);
            String mo114014o2 = mo113968b.mo114014o(descriptor2, 4);
            str = mo114014o;
            f11 = mo113968b.mo114017v(descriptor2, 5);
            f12 = mo114017v2;
            str2 = mo114014o2;
            f13 = mo114017v;
            i11 = mo114011i;
            i12 = 63;
        } else {
            String str3 = null;
            float f14 = 0.0f;
            String str4 = null;
            float f15 = 0.0f;
            float f16 = 0.0f;
            int i13 = 0;
            int i14 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                switch (mo114037p) {
                    case -1:
                        z11 = false;
                    case 0:
                        str3 = mo113968b.mo114014o(descriptor2, 0);
                        i14 |= 1;
                    case 1:
                        i13 = mo113968b.mo114011i(descriptor2, 1);
                        i14 |= 2;
                    case 2:
                        f16 = mo113968b.mo114017v(descriptor2, 2);
                        i14 |= 4;
                    case 3:
                        f15 = mo113968b.mo114017v(descriptor2, 3);
                        i14 |= 8;
                    case 4:
                        str4 = mo113968b.mo114014o(descriptor2, 4);
                        i14 |= 16;
                    case 5:
                        f14 = mo113968b.mo114017v(descriptor2, 5);
                        i14 |= 32;
                    default:
                        throw new UnknownFieldException(mo114037p);
                }
            }
            str = str3;
            f11 = f14;
            f12 = f15;
            str2 = str4;
            f13 = f16;
            i11 = i13;
            i12 = i14;
        }
        mo113968b.mo114009c(descriptor2);
        return new ImageImpl(i12, str, i11, f13, f12, str2, f11, (AbstractC26805k1) null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, ImageImpl imageImpl) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(imageImpl, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        ImageImpl.write$Self$app_release(imageImpl, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
