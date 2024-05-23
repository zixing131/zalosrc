package com.zing.zalo.shortvideo.data.remote.ws.response;

import com.zing.zalo.shortvideo.data.remote.ws.response.LiveChannel;
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

/* loaded from: classes5.dex */
public final class LiveChannel$$serializer implements InterfaceC26842x {
    public static final LiveChannel$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        LiveChannel$$serializer liveChannel$$serializer = new LiveChannel$$serializer();
        INSTANCE = liveChannel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.remote.ws.response.LiveChannel", liveChannel$$serializer, 11);
        pluginGeneratedSerialDescriptor.m114047n("channelId", true);
        pluginGeneratedSerialDescriptor.m114047n("userId", true);
        pluginGeneratedSerialDescriptor.m114047n("name", true);
        pluginGeneratedSerialDescriptor.m114047n("alias", true);
        pluginGeneratedSerialDescriptor.m114047n("avatar", true);
        pluginGeneratedSerialDescriptor.m114047n("bio", true);
        pluginGeneratedSerialDescriptor.m114047n("shareURL", true);
        pluginGeneratedSerialDescriptor.m114047n("reportURL", true);
        pluginGeneratedSerialDescriptor.m114047n("createdTime", true);
        pluginGeneratedSerialDescriptor.m114047n("attributes", true);
        pluginGeneratedSerialDescriptor.m114047n("stat", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LiveChannel$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26810m0 c26810m0 = C26810m0.f127024a;
        C26814n1 c26814n1 = C26814n1.f127034a;
        return new KSerializer[]{AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(LiveChannel$Stat$$serializer.INSTANCE)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x009b. Please report as an issue. */
    @Override // qn0.InterfaceC25386a
    public LiveChannel deserialize(Decoder decoder) {
        int i11;
        Long l11;
        Long l12;
        String str;
        String str2;
        LiveChannel.Stat stat;
        String str3;
        String str4;
        String str5;
        String str6;
        Long l13;
        Long l14;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        int i12 = 10;
        Long l15 = null;
        if (mo113968b.mo114015q()) {
            C26810m0 c26810m0 = C26810m0.f127024a;
            Long l16 = (Long) mo113968b.mo114018x(descriptor2, 0, c26810m0, null);
            Long l17 = (Long) mo113968b.mo114018x(descriptor2, 1, c26810m0, null);
            C26814n1 c26814n1 = C26814n1.f127034a;
            String str7 = (String) mo113968b.mo114018x(descriptor2, 2, c26814n1, null);
            String str8 = (String) mo113968b.mo114018x(descriptor2, 3, c26814n1, null);
            String str9 = (String) mo113968b.mo114018x(descriptor2, 4, c26814n1, null);
            String str10 = (String) mo113968b.mo114018x(descriptor2, 5, c26814n1, null);
            String str11 = (String) mo113968b.mo114018x(descriptor2, 6, c26814n1, null);
            String str12 = (String) mo113968b.mo114018x(descriptor2, 7, c26814n1, null);
            Long l18 = (Long) mo113968b.mo114018x(descriptor2, 8, c26810m0, null);
            l11 = (Long) mo113968b.mo114018x(descriptor2, 9, c26810m0, null);
            stat = (LiveChannel.Stat) mo113968b.mo114018x(descriptor2, 10, LiveChannel$Stat$$serializer.INSTANCE, null);
            str = str12;
            str3 = str11;
            str2 = str10;
            str5 = str8;
            l12 = l18;
            str4 = str9;
            str6 = str7;
            l14 = l17;
            l13 = l16;
            i11 = 2047;
        } else {
            Long l19 = null;
            Long l21 = null;
            String str13 = null;
            String str14 = null;
            LiveChannel.Stat stat2 = null;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            Long l22 = null;
            int i13 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                switch (mo114037p) {
                    case -1:
                        i12 = 10;
                        z11 = false;
                    case 0:
                        l15 = (Long) mo113968b.mo114018x(descriptor2, 0, C26810m0.f127024a, l15);
                        i13 |= 1;
                        i12 = 10;
                    case 1:
                        l22 = (Long) mo113968b.mo114018x(descriptor2, 1, C26810m0.f127024a, l22);
                        i13 |= 2;
                        i12 = 10;
                    case 2:
                        str18 = (String) mo113968b.mo114018x(descriptor2, 2, C26814n1.f127034a, str18);
                        i13 |= 4;
                        i12 = 10;
                    case 3:
                        str17 = (String) mo113968b.mo114018x(descriptor2, 3, C26814n1.f127034a, str17);
                        i13 |= 8;
                        i12 = 10;
                    case 4:
                        str16 = (String) mo113968b.mo114018x(descriptor2, 4, C26814n1.f127034a, str16);
                        i13 |= 16;
                        i12 = 10;
                    case 5:
                        str14 = (String) mo113968b.mo114018x(descriptor2, 5, C26814n1.f127034a, str14);
                        i13 |= 32;
                        i12 = 10;
                    case 6:
                        str15 = (String) mo113968b.mo114018x(descriptor2, 6, C26814n1.f127034a, str15);
                        i13 |= 64;
                        i12 = 10;
                    case 7:
                        str13 = (String) mo113968b.mo114018x(descriptor2, 7, C26814n1.f127034a, str13);
                        i13 |= 128;
                        i12 = 10;
                    case 8:
                        l21 = (Long) mo113968b.mo114018x(descriptor2, 8, C26810m0.f127024a, l21);
                        i13 |= 256;
                        i12 = 10;
                    case 9:
                        l19 = (Long) mo113968b.mo114018x(descriptor2, 9, C26810m0.f127024a, l19);
                        i13 |= 512;
                        i12 = 10;
                    case 10:
                        stat2 = (LiveChannel.Stat) mo113968b.mo114018x(descriptor2, i12, LiveChannel$Stat$$serializer.INSTANCE, stat2);
                        i13 |= 1024;
                    default:
                        throw new UnknownFieldException(mo114037p);
                }
            }
            i11 = i13;
            l11 = l19;
            l12 = l21;
            str = str13;
            str2 = str14;
            stat = stat2;
            str3 = str15;
            str4 = str16;
            str5 = str17;
            str6 = str18;
            l13 = l15;
            l14 = l22;
        }
        mo113968b.mo114009c(descriptor2);
        return new LiveChannel(i11, l13, l14, str6, str5, str4, str2, str3, str, l12, l11, stat, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, LiveChannel liveChannel) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(liveChannel, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        LiveChannel.m51674b(liveChannel, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
