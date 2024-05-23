package com.zing.zalo.data.zalocloud.model.api;

import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.encoding.InterfaceC21886d;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes3.dex */
public final class MediaExtInfo$$serializer implements InterfaceC26842x {
    public static final MediaExtInfo$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        MediaExtInfo$$serializer mediaExtInfo$$serializer = new MediaExtInfo$$serializer();
        INSTANCE = mediaExtInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.data.zalocloud.model.api.MediaExtInfo", mediaExtInfo$$serializer, 2);
        pluginGeneratedSerialDescriptor.m114047n("data", false);
        pluginGeneratedSerialDescriptor.m114047n("encryptInfo", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MediaExtInfo$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        return new KSerializer[]{C26814n1.f127034a, MediaExtEncryptInfo$$serializer.INSTANCE};
    }

    @Override // qn0.InterfaceC25386a
    public MediaExtInfo deserialize(Decoder decoder) {
        String str;
        MediaExtEncryptInfo mediaExtEncryptInfo;
        int i11;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            str = mo113968b.mo114014o(descriptor2, 0);
            mediaExtEncryptInfo = (MediaExtEncryptInfo) mo113968b.mo114012l(descriptor2, 1, MediaExtEncryptInfo$$serializer.INSTANCE, null);
            i11 = 3;
        } else {
            str = null;
            MediaExtEncryptInfo mediaExtEncryptInfo2 = null;
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
                    mediaExtEncryptInfo2 = (MediaExtEncryptInfo) mo113968b.mo114012l(descriptor2, 1, MediaExtEncryptInfo$$serializer.INSTANCE, mediaExtEncryptInfo2);
                    i12 |= 2;
                }
            }
            mediaExtEncryptInfo = mediaExtEncryptInfo2;
            i11 = i12;
        }
        mo113968b.mo114009c(descriptor2);
        return new MediaExtInfo(i11, str, mediaExtEncryptInfo, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, MediaExtInfo mediaExtInfo) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(mediaExtInfo, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        MediaExtInfo.m41349c(mediaExtInfo, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
