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
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes5.dex */
public final class VideoLocationHeader$$serializer implements InterfaceC26842x {
    public static final VideoLocationHeader$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        VideoLocationHeader$$serializer videoLocationHeader$$serializer = new VideoLocationHeader$$serializer();
        INSTANCE = videoLocationHeader$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.ui.model.VideoLocationHeader", videoLocationHeader$$serializer, 2);
        pluginGeneratedSerialDescriptor.m114047n("title", false);
        pluginGeneratedSerialDescriptor.m114047n("desc", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private VideoLocationHeader$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26814n1 c26814n1 = C26814n1.f127034a;
        return new KSerializer[]{AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1)};
    }

    @Override // qn0.InterfaceC25386a
    public VideoLocationHeader deserialize(Decoder decoder) {
        String str;
        int i11;
        String str2;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            C26814n1 c26814n1 = C26814n1.f127034a;
            str2 = (String) mo113968b.mo114018x(descriptor2, 0, c26814n1, null);
            str = (String) mo113968b.mo114018x(descriptor2, 1, c26814n1, null);
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
                    str3 = (String) mo113968b.mo114018x(descriptor2, 0, C26814n1.f127034a, str3);
                    i12 |= 1;
                } else {
                    if (mo114037p != 1) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    str = (String) mo113968b.mo114018x(descriptor2, 1, C26814n1.f127034a, str);
                    i12 |= 2;
                }
            }
            i11 = i12;
            str2 = str3;
        }
        mo113968b.mo114009c(descriptor2);
        return new VideoLocationHeader(i11, str2, str, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, VideoLocationHeader videoLocationHeader) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(videoLocationHeader, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        VideoLocationHeader.m52952c(videoLocationHeader, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
