package com.zing.zalo.shortvideo.data.remote.ws.response;

import com.zing.zalo.shortvideo.data.remote.ws.response.StreamData;
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
import tn0.InterfaceC26842x;

/* loaded from: classes5.dex */
public final class StreamData$Stat$$serializer implements InterfaceC26842x {
    public static final StreamData$Stat$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        StreamData$Stat$$serializer streamData$Stat$$serializer = new StreamData$Stat$$serializer();
        INSTANCE = streamData$Stat$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.remote.ws.response.StreamData.Stat", streamData$Stat$$serializer, 6);
        pluginGeneratedSerialDescriptor.m114047n("liveId", true);
        pluginGeneratedSerialDescriptor.m114047n("views", false);
        pluginGeneratedSerialDescriptor.m114047n("likes", false);
        pluginGeneratedSerialDescriptor.m114047n("currentViewer", false);
        pluginGeneratedSerialDescriptor.m114047n("shares", false);
        pluginGeneratedSerialDescriptor.m114047n("cmts", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private StreamData$Stat$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26810m0 c26810m0 = C26810m0.f127024a;
        return new KSerializer[]{AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(c26810m0)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0061. Please report as an issue. */
    @Override // qn0.InterfaceC25386a
    public StreamData.Stat deserialize(Decoder decoder) {
        int i11;
        Long l11;
        Long l12;
        Long l13;
        Long l14;
        Long l15;
        Long l16;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        int i12 = 5;
        Long l17 = null;
        if (mo113968b.mo114015q()) {
            C26810m0 c26810m0 = C26810m0.f127024a;
            Long l18 = (Long) mo113968b.mo114018x(descriptor2, 0, c26810m0, null);
            Long l19 = (Long) mo113968b.mo114018x(descriptor2, 1, c26810m0, null);
            Long l21 = (Long) mo113968b.mo114018x(descriptor2, 2, c26810m0, null);
            Long l22 = (Long) mo113968b.mo114018x(descriptor2, 3, c26810m0, null);
            Long l23 = (Long) mo113968b.mo114018x(descriptor2, 4, c26810m0, null);
            l16 = (Long) mo113968b.mo114018x(descriptor2, 5, c26810m0, null);
            l14 = l22;
            l15 = l23;
            l13 = l21;
            l12 = l19;
            l11 = l18;
            i11 = 63;
        } else {
            Long l24 = null;
            Long l25 = null;
            Long l26 = null;
            Long l27 = null;
            Long l28 = null;
            int i13 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                switch (mo114037p) {
                    case -1:
                        i12 = 5;
                        z11 = false;
                    case 0:
                        l17 = (Long) mo113968b.mo114018x(descriptor2, 0, C26810m0.f127024a, l17);
                        i13 |= 1;
                        i12 = 5;
                    case 1:
                        l24 = (Long) mo113968b.mo114018x(descriptor2, 1, C26810m0.f127024a, l24);
                        i13 |= 2;
                    case 2:
                        l25 = (Long) mo113968b.mo114018x(descriptor2, 2, C26810m0.f127024a, l25);
                        i13 |= 4;
                    case 3:
                        l26 = (Long) mo113968b.mo114018x(descriptor2, 3, C26810m0.f127024a, l26);
                        i13 |= 8;
                    case 4:
                        l27 = (Long) mo113968b.mo114018x(descriptor2, 4, C26810m0.f127024a, l27);
                        i13 |= 16;
                    case 5:
                        l28 = (Long) mo113968b.mo114018x(descriptor2, i12, C26810m0.f127024a, l28);
                        i13 |= 32;
                    default:
                        throw new UnknownFieldException(mo114037p);
                }
            }
            i11 = i13;
            l11 = l17;
            l12 = l24;
            l13 = l25;
            l14 = l26;
            l15 = l27;
            l16 = l28;
        }
        mo113968b.mo114009c(descriptor2);
        return new StreamData.Stat(i11, l11, l12, l13, l14, l15, l16, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, StreamData.Stat stat) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(stat, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        StreamData.Stat.m51698c(stat, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
