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
import rn0.AbstractC25935a;
import tn0.C26783d0;
import tn0.C26810m0;
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes3.dex */
public final class CloudMediaItemResponse$$serializer implements InterfaceC26842x {
    public static final CloudMediaItemResponse$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        CloudMediaItemResponse$$serializer cloudMediaItemResponse$$serializer = new CloudMediaItemResponse$$serializer();
        INSTANCE = cloudMediaItemResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.data.zalocloud.model.api.CloudMediaItemResponse", cloudMediaItemResponse$$serializer, 8);
        pluginGeneratedSerialDescriptor.m114047n("noiseId", false);
        pluginGeneratedSerialDescriptor.m114047n("action", false);
        pluginGeneratedSerialDescriptor.m114047n("actionType", false);
        pluginGeneratedSerialDescriptor.m114047n("ts", false);
        pluginGeneratedSerialDescriptor.m114047n("cliTs", false);
        pluginGeneratedSerialDescriptor.m114047n("msgInfo", false);
        pluginGeneratedSerialDescriptor.m114047n("mediaInfo", false);
        pluginGeneratedSerialDescriptor.m114047n("encryptInfo", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CloudMediaItemResponse$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26783d0 c26783d0 = C26783d0.f126989a;
        C26810m0 c26810m0 = C26810m0.f127024a;
        return new KSerializer[]{C26814n1.f127034a, c26783d0, c26783d0, c26810m0, c26810m0, MsgInfo$$serializer.INSTANCE, MediaInfo$$serializer.INSTANCE, AbstractC25935a.m133630u(EncryptInfo$$serializer.INSTANCE)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0073. Please report as an issue. */
    @Override // qn0.InterfaceC25386a
    public CloudMediaItemResponse deserialize(Decoder decoder) {
        int i11;
        EncryptInfo encryptInfo;
        MediaInfo mediaInfo;
        MsgInfo msgInfo;
        int i12;
        long j11;
        int i13;
        String str;
        long j12;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            String mo114014o = mo113968b.mo114014o(descriptor2, 0);
            int mo114011i = mo113968b.mo114011i(descriptor2, 1);
            int mo114011i2 = mo113968b.mo114011i(descriptor2, 2);
            long mo114010f = mo113968b.mo114010f(descriptor2, 3);
            long mo114010f2 = mo113968b.mo114010f(descriptor2, 4);
            MsgInfo msgInfo2 = (MsgInfo) mo113968b.mo114012l(descriptor2, 5, MsgInfo$$serializer.INSTANCE, null);
            MediaInfo mediaInfo2 = (MediaInfo) mo113968b.mo114012l(descriptor2, 6, MediaInfo$$serializer.INSTANCE, null);
            str = mo114014o;
            encryptInfo = (EncryptInfo) mo113968b.mo114018x(descriptor2, 7, EncryptInfo$$serializer.INSTANCE, null);
            mediaInfo = mediaInfo2;
            msgInfo = msgInfo2;
            j11 = mo114010f2;
            i11 = mo114011i2;
            i12 = mo114011i;
            j12 = mo114010f;
            i13 = 255;
        } else {
            long j13 = 0;
            EncryptInfo encryptInfo2 = null;
            MediaInfo mediaInfo3 = null;
            MsgInfo msgInfo3 = null;
            String str2 = null;
            long j14 = 0;
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
                        i16 |= 1;
                        str2 = mo113968b.mo114014o(descriptor2, 0);
                    case 1:
                        i16 |= 2;
                        i15 = mo113968b.mo114011i(descriptor2, 1);
                    case 2:
                        i16 |= 4;
                        i14 = mo113968b.mo114011i(descriptor2, 2);
                    case 3:
                        j14 = mo113968b.mo114010f(descriptor2, 3);
                        i16 |= 8;
                    case 4:
                        j13 = mo113968b.mo114010f(descriptor2, 4);
                        i16 |= 16;
                    case 5:
                        msgInfo3 = (MsgInfo) mo113968b.mo114012l(descriptor2, 5, MsgInfo$$serializer.INSTANCE, msgInfo3);
                        i16 |= 32;
                    case 6:
                        mediaInfo3 = (MediaInfo) mo113968b.mo114012l(descriptor2, 6, MediaInfo$$serializer.INSTANCE, mediaInfo3);
                        i16 |= 64;
                    case 7:
                        encryptInfo2 = (EncryptInfo) mo113968b.mo114018x(descriptor2, 7, EncryptInfo$$serializer.INSTANCE, encryptInfo2);
                        i16 |= 128;
                    default:
                        throw new UnknownFieldException(mo114037p);
                }
            }
            i11 = i14;
            encryptInfo = encryptInfo2;
            mediaInfo = mediaInfo3;
            msgInfo = msgInfo3;
            i12 = i15;
            j11 = j13;
            i13 = i16;
            str = str2;
            j12 = j14;
        }
        mo113968b.mo114009c(descriptor2);
        return new CloudMediaItemResponse(i13, str, i12, i11, j12, j11, msgInfo, mediaInfo, encryptInfo, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, CloudMediaItemResponse cloudMediaItemResponse) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(cloudMediaItemResponse, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        CloudMediaItemResponse.m41292g(cloudMediaItemResponse, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
