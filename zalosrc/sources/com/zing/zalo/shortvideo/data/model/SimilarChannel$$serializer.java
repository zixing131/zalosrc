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
import tn0.AbstractC26805k1;
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes5.dex */
public final class SimilarChannel$$serializer implements InterfaceC26842x {
    public static final SimilarChannel$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SimilarChannel$$serializer similarChannel$$serializer = new SimilarChannel$$serializer();
        INSTANCE = similarChannel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.model.SimilarChannel", similarChannel$$serializer, 4);
        pluginGeneratedSerialDescriptor.m114047n("channelId", true);
        pluginGeneratedSerialDescriptor.m114047n("name", true);
        pluginGeneratedSerialDescriptor.m114047n("avatar", true);
        pluginGeneratedSerialDescriptor.m114047n("followerNum", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SimilarChannel$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26814n1 c26814n1 = C26814n1.f127034a;
        return new KSerializer[]{AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1)};
    }

    @Override // qn0.InterfaceC25386a
    public SimilarChannel deserialize(Decoder decoder) {
        int i11;
        String str;
        String str2;
        String str3;
        String str4;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        String str5 = null;
        if (mo113968b.mo114015q()) {
            C26814n1 c26814n1 = C26814n1.f127034a;
            String str6 = (String) mo113968b.mo114018x(descriptor2, 0, c26814n1, null);
            String str7 = (String) mo113968b.mo114018x(descriptor2, 1, c26814n1, null);
            String str8 = (String) mo113968b.mo114018x(descriptor2, 2, c26814n1, null);
            str4 = (String) mo113968b.mo114018x(descriptor2, 3, c26814n1, null);
            str3 = str8;
            str2 = str7;
            str = str6;
            i11 = 15;
        } else {
            String str9 = null;
            String str10 = null;
            String str11 = null;
            int i12 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    str5 = (String) mo113968b.mo114018x(descriptor2, 0, C26814n1.f127034a, str5);
                    i12 |= 1;
                } else if (mo114037p == 1) {
                    str9 = (String) mo113968b.mo114018x(descriptor2, 1, C26814n1.f127034a, str9);
                    i12 |= 2;
                } else if (mo114037p == 2) {
                    str10 = (String) mo113968b.mo114018x(descriptor2, 2, C26814n1.f127034a, str10);
                    i12 |= 4;
                } else {
                    if (mo114037p != 3) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    str11 = (String) mo113968b.mo114018x(descriptor2, 3, C26814n1.f127034a, str11);
                    i12 |= 8;
                }
            }
            i11 = i12;
            str = str5;
            str2 = str9;
            str3 = str10;
            str4 = str11;
        }
        mo113968b.mo114009c(descriptor2);
        return new SimilarChannel(i11, str, str2, str3, str4, (AbstractC26805k1) null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, SimilarChannel similarChannel) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(similarChannel, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        SimilarChannel.m51199k(similarChannel, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
