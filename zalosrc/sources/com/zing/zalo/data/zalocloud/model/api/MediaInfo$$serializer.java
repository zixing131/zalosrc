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
import tn0.C26810m0;
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes3.dex */
public final class MediaInfo$$serializer implements InterfaceC26842x {
    public static final MediaInfo$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        MediaInfo$$serializer mediaInfo$$serializer = new MediaInfo$$serializer();
        INSTANCE = mediaInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.data.zalocloud.model.api.MediaInfo", mediaInfo$$serializer, 3);
        pluginGeneratedSerialDescriptor.m114047n("mediaSize", false);
        pluginGeneratedSerialDescriptor.m114047n("checksum", true);
        pluginGeneratedSerialDescriptor.m114047n("mediaExtInfo", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MediaInfo$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        return new KSerializer[]{C26810m0.f127024a, C26814n1.f127034a, AbstractC25935a.m133630u(MediaExtInfo$$serializer.INSTANCE)};
    }

    @Override // qn0.InterfaceC25386a
    public MediaInfo deserialize(Decoder decoder) {
        int i11;
        String str;
        MediaExtInfo mediaExtInfo;
        long j11;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        String str2 = null;
        if (mo113968b.mo114015q()) {
            long mo114010f = mo113968b.mo114010f(descriptor2, 0);
            str = mo113968b.mo114014o(descriptor2, 1);
            mediaExtInfo = (MediaExtInfo) mo113968b.mo114018x(descriptor2, 2, MediaExtInfo$$serializer.INSTANCE, null);
            j11 = mo114010f;
            i11 = 7;
        } else {
            long j12 = 0;
            int i12 = 0;
            boolean z11 = true;
            MediaExtInfo mediaExtInfo2 = null;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    j12 = mo113968b.mo114010f(descriptor2, 0);
                    i12 |= 1;
                } else if (mo114037p == 1) {
                    str2 = mo113968b.mo114014o(descriptor2, 1);
                    i12 |= 2;
                } else {
                    if (mo114037p != 2) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    mediaExtInfo2 = (MediaExtInfo) mo113968b.mo114018x(descriptor2, 2, MediaExtInfo$$serializer.INSTANCE, mediaExtInfo2);
                    i12 |= 4;
                }
            }
            i11 = i12;
            str = str2;
            mediaExtInfo = mediaExtInfo2;
            j11 = j12;
        }
        mo113968b.mo114009c(descriptor2);
        return new MediaInfo(i11, j11, str, mediaExtInfo, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, MediaInfo mediaInfo) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(mediaInfo, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        MediaInfo.m41352d(mediaInfo, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
