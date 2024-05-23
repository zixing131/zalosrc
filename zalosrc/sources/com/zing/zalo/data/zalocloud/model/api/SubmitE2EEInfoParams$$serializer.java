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
public final class SubmitE2EEInfoParams$$serializer implements InterfaceC26842x {
    public static final SubmitE2EEInfoParams$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SubmitE2EEInfoParams$$serializer submitE2EEInfoParams$$serializer = new SubmitE2EEInfoParams$$serializer();
        INSTANCE = submitE2EEInfoParams$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.data.zalocloud.model.api.SubmitE2EEInfoParams", submitE2EEInfoParams$$serializer, 3);
        pluginGeneratedSerialDescriptor.m114047n("noiseId", false);
        pluginGeneratedSerialDescriptor.m114047n("encryptInfo", false);
        pluginGeneratedSerialDescriptor.m114047n("mediaExtInfo", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SubmitE2EEInfoParams$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        return new KSerializer[]{C26814n1.f127034a, EncryptInfo$$serializer.INSTANCE, MediaExtInfo$$serializer.INSTANCE};
    }

    @Override // qn0.InterfaceC25386a
    public SubmitE2EEInfoParams deserialize(Decoder decoder) {
        int i11;
        String str;
        EncryptInfo encryptInfo;
        MediaExtInfo mediaExtInfo;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        String str2 = null;
        if (mo113968b.mo114015q()) {
            String mo114014o = mo113968b.mo114014o(descriptor2, 0);
            EncryptInfo encryptInfo2 = (EncryptInfo) mo113968b.mo114012l(descriptor2, 1, EncryptInfo$$serializer.INSTANCE, null);
            str = mo114014o;
            mediaExtInfo = (MediaExtInfo) mo113968b.mo114012l(descriptor2, 2, MediaExtInfo$$serializer.INSTANCE, null);
            encryptInfo = encryptInfo2;
            i11 = 7;
        } else {
            EncryptInfo encryptInfo3 = null;
            MediaExtInfo mediaExtInfo2 = null;
            int i12 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    str2 = mo113968b.mo114014o(descriptor2, 0);
                    i12 |= 1;
                } else if (mo114037p == 1) {
                    encryptInfo3 = (EncryptInfo) mo113968b.mo114012l(descriptor2, 1, EncryptInfo$$serializer.INSTANCE, encryptInfo3);
                    i12 |= 2;
                } else {
                    if (mo114037p != 2) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    mediaExtInfo2 = (MediaExtInfo) mo113968b.mo114012l(descriptor2, 2, MediaExtInfo$$serializer.INSTANCE, mediaExtInfo2);
                    i12 |= 4;
                }
            }
            i11 = i12;
            str = str2;
            encryptInfo = encryptInfo3;
            mediaExtInfo = mediaExtInfo2;
        }
        mo113968b.mo114009c(descriptor2);
        return new SubmitE2EEInfoParams(i11, str, encryptInfo, mediaExtInfo, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, SubmitE2EEInfoParams submitE2EEInfoParams) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(submitE2EEInfoParams, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        SubmitE2EEInfoParams.m41384b(submitE2EEInfoParams, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
