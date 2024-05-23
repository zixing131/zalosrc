package com.zing.zalo.shortvideo.data.remote.ws.response;

import com.zing.zalo.shortvideo.data.remote.ws.response.StreamData;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
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
import tn0.C26783d0;
import tn0.C26810m0;
import tn0.C26814n1;
import tn0.C26839w;
import tn0.InterfaceC26842x;

/* loaded from: classes5.dex */
public final class StreamData$$serializer implements InterfaceC26842x {
    public static final StreamData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        StreamData$$serializer streamData$$serializer = new StreamData$$serializer();
        INSTANCE = streamData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.remote.ws.response.StreamData", streamData$$serializer, 23);
        pluginGeneratedSerialDescriptor.m114047n("id", true);
        pluginGeneratedSerialDescriptor.m114047n("liveIntervalMillis", true);
        pluginGeneratedSerialDescriptor.m114047n("statIntervalMillis", true);
        pluginGeneratedSerialDescriptor.m114047n("cmtIntervalMillis", true);
        pluginGeneratedSerialDescriptor.m114047n("title", true);
        pluginGeneratedSerialDescriptor.m114047n("shareURL", true);
        pluginGeneratedSerialDescriptor.m114047n("streamURL", true);
        pluginGeneratedSerialDescriptor.m114047n("reportURL", true);
        pluginGeneratedSerialDescriptor.m114047n("createdTime", true);
        pluginGeneratedSerialDescriptor.m114047n("channelId", true);
        pluginGeneratedSerialDescriptor.m114047n("status", true);
        pluginGeneratedSerialDescriptor.m114047n("scheduledStartTime", true);
        pluginGeneratedSerialDescriptor.m114047n("scheduledEndTime", true);
        pluginGeneratedSerialDescriptor.m114047n("startTime", true);
        pluginGeneratedSerialDescriptor.m114047n("endTime", true);
        pluginGeneratedSerialDescriptor.m114047n("thumbnail", true);
        pluginGeneratedSerialDescriptor.m114047n("channel", true);
        pluginGeneratedSerialDescriptor.m114047n("stat", true);
        pluginGeneratedSerialDescriptor.m114047n("volume", true);
        pluginGeneratedSerialDescriptor.m114047n("ratio", true);
        pluginGeneratedSerialDescriptor.m114047n("firstFrame", true);
        pluginGeneratedSerialDescriptor.m114047n("duration", true);
        pluginGeneratedSerialDescriptor.m114047n("attributes", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private StreamData$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26810m0 c26810m0 = C26810m0.f127024a;
        C26814n1 c26814n1 = C26814n1.f127034a;
        C26839w c26839w = C26839w.f127098a;
        return new KSerializer[]{AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(C26783d0.f126989a), AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(LiveChannel$$serializer.INSTANCE), AbstractC25935a.m133630u(StreamData$Stat$$serializer.INSTANCE), c26839w, c26839w, AbstractC25935a.m133630u(c26814n1), c26810m0, AbstractC25935a.m133630u(c26810m0)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0146. Please report as an issue. */
    @Override // qn0.InterfaceC25386a
    public StreamData deserialize(Decoder decoder) {
        Long l11;
        StreamData.Stat stat;
        String str;
        Long l12;
        LiveChannel liveChannel;
        String str2;
        int i11;
        Long l13;
        Long l14;
        Long l15;
        Integer num;
        Long l16;
        Long l17;
        Long l18;
        Long l19;
        String str3;
        String str4;
        String str5;
        String str6;
        Long l21;
        Long l22;
        float f11;
        float f12;
        long j11;
        Long l23;
        int i12;
        Long l24;
        Long l25;
        String str7;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            C26810m0 c26810m0 = C26810m0.f127024a;
            Long l26 = (Long) mo113968b.mo114018x(descriptor2, 0, c26810m0, null);
            Long l27 = (Long) mo113968b.mo114018x(descriptor2, 1, c26810m0, null);
            Long l28 = (Long) mo113968b.mo114018x(descriptor2, 2, c26810m0, null);
            Long l29 = (Long) mo113968b.mo114018x(descriptor2, 3, c26810m0, null);
            C26814n1 c26814n1 = C26814n1.f127034a;
            String str8 = (String) mo113968b.mo114018x(descriptor2, 4, c26814n1, null);
            String str9 = (String) mo113968b.mo114018x(descriptor2, 5, c26814n1, null);
            String str10 = (String) mo113968b.mo114018x(descriptor2, 6, c26814n1, null);
            String str11 = (String) mo113968b.mo114018x(descriptor2, 7, c26814n1, null);
            Long l31 = (Long) mo113968b.mo114018x(descriptor2, 8, c26810m0, null);
            Long l32 = (Long) mo113968b.mo114018x(descriptor2, 9, c26810m0, null);
            Integer num2 = (Integer) mo113968b.mo114018x(descriptor2, 10, C26783d0.f126989a, null);
            Long l33 = (Long) mo113968b.mo114018x(descriptor2, 11, c26810m0, null);
            Long l34 = (Long) mo113968b.mo114018x(descriptor2, 12, c26810m0, null);
            Long l35 = (Long) mo113968b.mo114018x(descriptor2, 13, c26810m0, null);
            Long l36 = (Long) mo113968b.mo114018x(descriptor2, 14, c26810m0, null);
            String str12 = (String) mo113968b.mo114018x(descriptor2, 15, c26814n1, null);
            LiveChannel liveChannel2 = (LiveChannel) mo113968b.mo114018x(descriptor2, 16, LiveChannel$$serializer.INSTANCE, null);
            StreamData.Stat stat2 = (StreamData.Stat) mo113968b.mo114018x(descriptor2, 17, StreamData$Stat$$serializer.INSTANCE, null);
            float mo114017v = mo113968b.mo114017v(descriptor2, 18);
            float mo114017v2 = mo113968b.mo114017v(descriptor2, 19);
            String str13 = (String) mo113968b.mo114018x(descriptor2, 20, c26814n1, null);
            long mo114010f = mo113968b.mo114010f(descriptor2, 21);
            stat = stat2;
            l16 = (Long) mo113968b.mo114018x(descriptor2, 22, c26810m0, null);
            str = str13;
            f11 = mo114017v;
            l21 = l31;
            l18 = l28;
            l17 = l27;
            f12 = mo114017v2;
            l15 = l33;
            l12 = l32;
            str6 = str11;
            str5 = str10;
            str4 = str9;
            l11 = l26;
            liveChannel = liveChannel2;
            str2 = str12;
            l22 = l36;
            l14 = l35;
            l13 = l34;
            num = num2;
            l19 = l29;
            str3 = str8;
            j11 = mo114010f;
            i11 = 8388607;
        } else {
            Long l37 = null;
            StreamData.Stat stat3 = null;
            String str14 = null;
            Long l38 = null;
            LiveChannel liveChannel3 = null;
            String str15 = null;
            Long l39 = null;
            Long l41 = null;
            Long l42 = null;
            Integer num3 = null;
            Long l43 = null;
            String str16 = null;
            Long l44 = null;
            Long l45 = null;
            Long l46 = null;
            Long l47 = null;
            Long l48 = null;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            long j12 = 0;
            int i13 = 0;
            float f13 = 0.0f;
            float f14 = 0.0f;
            boolean z11 = true;
            while (z11) {
                String str20 = str16;
                int mo114037p = mo113968b.mo114037p(descriptor2);
                switch (mo114037p) {
                    case -1:
                        str16 = str20;
                        l37 = l37;
                        z11 = false;
                    case 0:
                        l24 = l37;
                        l25 = l43;
                        str7 = str20;
                        l45 = (Long) mo113968b.mo114018x(descriptor2, 0, C26810m0.f127024a, l45);
                        i13 |= 1;
                        l46 = l46;
                        str16 = str7;
                        l43 = l25;
                        l37 = l24;
                    case 1:
                        l24 = l37;
                        l25 = l43;
                        str7 = str20;
                        l46 = (Long) mo113968b.mo114018x(descriptor2, 1, C26810m0.f127024a, l46);
                        i13 |= 2;
                        l47 = l47;
                        str16 = str7;
                        l43 = l25;
                        l37 = l24;
                    case 2:
                        l24 = l37;
                        l25 = l43;
                        str7 = str20;
                        l47 = (Long) mo113968b.mo114018x(descriptor2, 2, C26810m0.f127024a, l47);
                        i13 |= 4;
                        l48 = l48;
                        str16 = str7;
                        l43 = l25;
                        l37 = l24;
                    case 3:
                        l24 = l37;
                        l25 = l43;
                        str7 = str20;
                        l48 = (Long) mo113968b.mo114018x(descriptor2, 3, C26810m0.f127024a, l48);
                        i13 |= 8;
                        str17 = str17;
                        str16 = str7;
                        l43 = l25;
                        l37 = l24;
                    case 4:
                        l24 = l37;
                        l25 = l43;
                        str7 = str20;
                        str17 = (String) mo113968b.mo114018x(descriptor2, 4, C26814n1.f127034a, str17);
                        i13 |= 16;
                        str18 = str18;
                        str16 = str7;
                        l43 = l25;
                        l37 = l24;
                    case 5:
                        l24 = l37;
                        l25 = l43;
                        str7 = str20;
                        str18 = (String) mo113968b.mo114018x(descriptor2, 5, C26814n1.f127034a, str18);
                        i13 |= 32;
                        str19 = str19;
                        str16 = str7;
                        l43 = l25;
                        l37 = l24;
                    case 6:
                        l24 = l37;
                        l25 = l43;
                        str7 = str20;
                        str19 = (String) mo113968b.mo114018x(descriptor2, 6, C26814n1.f127034a, str19);
                        i13 |= 64;
                        str16 = str7;
                        l43 = l25;
                        l37 = l24;
                    case 7:
                        l24 = l37;
                        l25 = l43;
                        i13 |= 128;
                        str16 = (String) mo113968b.mo114018x(descriptor2, 7, C26814n1.f127034a, str20);
                        l43 = l25;
                        l37 = l24;
                    case 8:
                        l43 = (Long) mo113968b.mo114018x(descriptor2, 8, C26810m0.f127024a, l43);
                        i13 |= 256;
                        l37 = l37;
                        str16 = str20;
                    case 9:
                        l23 = l43;
                        l38 = (Long) mo113968b.mo114018x(descriptor2, 9, C26810m0.f127024a, l38);
                        i13 |= 512;
                        str16 = str20;
                        l43 = l23;
                    case 10:
                        l23 = l43;
                        num3 = (Integer) mo113968b.mo114018x(descriptor2, 10, C26783d0.f126989a, num3);
                        i13 |= 1024;
                        str16 = str20;
                        l43 = l23;
                    case 11:
                        l23 = l43;
                        l42 = (Long) mo113968b.mo114018x(descriptor2, 11, C26810m0.f127024a, l42);
                        i13 |= ZVideoUtilMetadata.FF_PROFILE_H264_INTRA;
                        str16 = str20;
                        l43 = l23;
                    case 12:
                        l23 = l43;
                        l39 = (Long) mo113968b.mo114018x(descriptor2, 12, C26810m0.f127024a, l39);
                        i13 |= 4096;
                        str16 = str20;
                        l43 = l23;
                    case 13:
                        l23 = l43;
                        l41 = (Long) mo113968b.mo114018x(descriptor2, 13, C26810m0.f127024a, l41);
                        i13 |= 8192;
                        str16 = str20;
                        l43 = l23;
                    case 14:
                        l23 = l43;
                        l37 = (Long) mo113968b.mo114018x(descriptor2, 14, C26810m0.f127024a, l37);
                        i13 |= 16384;
                        str16 = str20;
                        l43 = l23;
                    case 15:
                        l23 = l43;
                        str15 = (String) mo113968b.mo114018x(descriptor2, 15, C26814n1.f127034a, str15);
                        i12 = 32768;
                        i13 |= i12;
                        str16 = str20;
                        l43 = l23;
                    case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                        l23 = l43;
                        liveChannel3 = (LiveChannel) mo113968b.mo114018x(descriptor2, 16, LiveChannel$$serializer.INSTANCE, liveChannel3);
                        i12 = 65536;
                        i13 |= i12;
                        str16 = str20;
                        l43 = l23;
                    case 17:
                        l23 = l43;
                        stat3 = (StreamData.Stat) mo113968b.mo114018x(descriptor2, 17, StreamData$Stat$$serializer.INSTANCE, stat3);
                        i12 = 131072;
                        i13 |= i12;
                        str16 = str20;
                        l43 = l23;
                    case 18:
                        l23 = l43;
                        f13 = mo113968b.mo114017v(descriptor2, 18);
                        i13 |= 262144;
                        str16 = str20;
                        l43 = l23;
                    case 19:
                        l23 = l43;
                        f14 = mo113968b.mo114017v(descriptor2, 19);
                        i13 |= 524288;
                        str16 = str20;
                        l43 = l23;
                    case 20:
                        l23 = l43;
                        str14 = (String) mo113968b.mo114018x(descriptor2, 20, C26814n1.f127034a, str14);
                        i12 = ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE;
                        i13 |= i12;
                        str16 = str20;
                        l43 = l23;
                    case 21:
                        l23 = l43;
                        j12 = mo113968b.mo114010f(descriptor2, 21);
                        i12 = 2097152;
                        i13 |= i12;
                        str16 = str20;
                        l43 = l23;
                    case 22:
                        l23 = l43;
                        l44 = (Long) mo113968b.mo114018x(descriptor2, 22, C26810m0.f127024a, l44);
                        i12 = 4194304;
                        i13 |= i12;
                        str16 = str20;
                        l43 = l23;
                    default:
                        throw new UnknownFieldException(mo114037p);
                }
            }
            l11 = l45;
            stat = stat3;
            str = str14;
            l12 = l38;
            liveChannel = liveChannel3;
            str2 = str15;
            i11 = i13;
            l13 = l39;
            l14 = l41;
            l15 = l42;
            num = num3;
            l16 = l44;
            l17 = l46;
            l18 = l47;
            l19 = l48;
            str3 = str17;
            str4 = str18;
            str5 = str19;
            str6 = str16;
            l21 = l43;
            l22 = l37;
            f11 = f13;
            f12 = f14;
            j11 = j12;
        }
        mo113968b.mo114009c(descriptor2);
        return new StreamData(i11, l11, l17, l18, l19, str3, str4, str5, str6, l21, l12, num, l15, l13, l14, l22, str2, liveChannel, stat, f11, f12, str, j11, l16, (AbstractC26805k1) null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, StreamData streamData) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(streamData, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        StreamData.m51684n(streamData, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
