package com.zing.zalo.shortvideo.data.model;

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
import tn0.C26794h;
import tn0.C26810m0;
import tn0.C26814n1;
import tn0.C26839w;
import tn0.InterfaceC26842x;

/* loaded from: classes5.dex */
public final class LivestreamData$$serializer implements InterfaceC26842x {
    public static final LivestreamData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        LivestreamData$$serializer livestreamData$$serializer = new LivestreamData$$serializer();
        INSTANCE = livestreamData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.model.LivestreamData", livestreamData$$serializer, 27);
        pluginGeneratedSerialDescriptor.m114047n("id", false);
        pluginGeneratedSerialDescriptor.m114047n("title", true);
        pluginGeneratedSerialDescriptor.m114047n("thumb", true);
        pluginGeneratedSerialDescriptor.m114047n("streamUrl", true);
        pluginGeneratedSerialDescriptor.m114047n("status", true);
        pluginGeneratedSerialDescriptor.m114047n("shareUrl", true);
        pluginGeneratedSerialDescriptor.m114047n("reportURL", true);
        pluginGeneratedSerialDescriptor.m114047n("createdTime", true);
        pluginGeneratedSerialDescriptor.m114047n("scheduledStartTime", true);
        pluginGeneratedSerialDescriptor.m114047n("scheduledEndTime", true);
        pluginGeneratedSerialDescriptor.m114047n("startTime", true);
        pluginGeneratedSerialDescriptor.m114047n("endTime", true);
        pluginGeneratedSerialDescriptor.m114047n("ratio", true);
        pluginGeneratedSerialDescriptor.m114047n("volume", true);
        pluginGeneratedSerialDescriptor.m114047n("channel", false);
        pluginGeneratedSerialDescriptor.m114047n("numOfView", true);
        pluginGeneratedSerialDescriptor.m114047n("numOfLike", true);
        pluginGeneratedSerialDescriptor.m114047n("numOfComment", true);
        pluginGeneratedSerialDescriptor.m114047n("numOfShare", true);
        pluginGeneratedSerialDescriptor.m114047n("attribute", true);
        pluginGeneratedSerialDescriptor.m114047n("isPersonalBlockCmt", true);
        pluginGeneratedSerialDescriptor.m114047n("isPersonalBlockLike", true);
        pluginGeneratedSerialDescriptor.m114047n("extra", true);
        pluginGeneratedSerialDescriptor.m114047n("source", true);
        pluginGeneratedSerialDescriptor.m114047n("sourceInfo", true);
        pluginGeneratedSerialDescriptor.m114047n("listIndex", true);
        pluginGeneratedSerialDescriptor.m114047n("domain", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LivestreamData$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26814n1 c26814n1 = C26814n1.f127034a;
        C26783d0 c26783d0 = C26783d0.f126989a;
        C26810m0 c26810m0 = C26810m0.f127024a;
        C26839w c26839w = C26839w.f127098a;
        C26794h c26794h = C26794h.f127000a;
        return new KSerializer[]{c26814n1, AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), c26783d0, AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), c26810m0, c26810m0, c26810m0, c26810m0, c26810m0, c26839w, c26839w, Channel$$serializer.INSTANCE, c26810m0, c26810m0, c26810m0, c26810m0, AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(c26794h), AbstractC25935a.m133630u(c26794h), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26783d0), AbstractC25935a.m133630u(c26814n1)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0160. Please report as an issue. */
    @Override // qn0.InterfaceC25386a
    public LivestreamData deserialize(Decoder decoder) {
        Boolean bool;
        String str;
        Integer num;
        int i11;
        String str2;
        String str3;
        String str4;
        String str5;
        Boolean bool2;
        Long l11;
        Channel channel;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        float f11;
        int i12;
        float f12;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        String str11;
        int i13;
        int i14;
        String str12;
        String str13;
        String str14;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        int i15 = 0;
        if (mo113968b.mo114015q()) {
            String mo114014o = mo113968b.mo114014o(descriptor2, 0);
            C26814n1 c26814n1 = C26814n1.f127034a;
            String str15 = (String) mo113968b.mo114018x(descriptor2, 1, c26814n1, null);
            String str16 = (String) mo113968b.mo114018x(descriptor2, 2, c26814n1, null);
            String str17 = (String) mo113968b.mo114018x(descriptor2, 3, c26814n1, null);
            int mo114011i = mo113968b.mo114011i(descriptor2, 4);
            String str18 = (String) mo113968b.mo114018x(descriptor2, 5, c26814n1, null);
            String str19 = (String) mo113968b.mo114018x(descriptor2, 6, c26814n1, null);
            long mo114010f = mo113968b.mo114010f(descriptor2, 7);
            long mo114010f2 = mo113968b.mo114010f(descriptor2, 8);
            long mo114010f3 = mo113968b.mo114010f(descriptor2, 9);
            long mo114010f4 = mo113968b.mo114010f(descriptor2, 10);
            long mo114010f5 = mo113968b.mo114010f(descriptor2, 11);
            float mo114017v = mo113968b.mo114017v(descriptor2, 12);
            float mo114017v2 = mo113968b.mo114017v(descriptor2, 13);
            Channel channel2 = (Channel) mo113968b.mo114012l(descriptor2, 14, Channel$$serializer.INSTANCE, null);
            long mo114010f6 = mo113968b.mo114010f(descriptor2, 15);
            long mo114010f7 = mo113968b.mo114010f(descriptor2, 16);
            long mo114010f8 = mo113968b.mo114010f(descriptor2, 17);
            long mo114010f9 = mo113968b.mo114010f(descriptor2, 18);
            Long l12 = (Long) mo113968b.mo114018x(descriptor2, 19, C26810m0.f127024a, null);
            C26794h c26794h = C26794h.f127000a;
            Boolean bool3 = (Boolean) mo113968b.mo114018x(descriptor2, 20, c26794h, null);
            Boolean bool4 = (Boolean) mo113968b.mo114018x(descriptor2, 21, c26794h, null);
            String str20 = (String) mo113968b.mo114018x(descriptor2, 22, c26814n1, null);
            String str21 = (String) mo113968b.mo114018x(descriptor2, 23, c26814n1, null);
            String str22 = (String) mo113968b.mo114018x(descriptor2, 24, c26814n1, null);
            channel = channel2;
            num = (Integer) mo113968b.mo114018x(descriptor2, 25, C26783d0.f126989a, null);
            str2 = (String) mo113968b.mo114018x(descriptor2, 26, c26814n1, null);
            f12 = mo114017v;
            str8 = str16;
            f11 = mo114017v2;
            j11 = mo114010f5;
            j12 = mo114010f3;
            str10 = str19;
            str6 = str18;
            str9 = str17;
            l11 = l12;
            j13 = mo114010f7;
            str = str15;
            str7 = mo114014o;
            i12 = mo114011i;
            j14 = mo114010f;
            j15 = mo114010f2;
            j16 = mo114010f4;
            j17 = mo114010f6;
            j18 = mo114010f8;
            j19 = mo114010f9;
            bool2 = bool3;
            bool = bool4;
            str4 = str21;
            str3 = str22;
            str5 = str20;
            i11 = 134217727;
        } else {
            Integer num2 = null;
            String str23 = null;
            String str24 = null;
            Boolean bool5 = null;
            String str25 = null;
            String str26 = null;
            String str27 = null;
            String str28 = null;
            String str29 = null;
            Boolean bool6 = null;
            Long l13 = null;
            Channel channel3 = null;
            String str30 = null;
            String str31 = null;
            long j21 = 0;
            long j22 = 0;
            long j23 = 0;
            long j24 = 0;
            long j25 = 0;
            long j26 = 0;
            long j27 = 0;
            long j28 = 0;
            long j29 = 0;
            float f13 = 0.0f;
            int i16 = 0;
            float f14 = 0.0f;
            boolean z11 = true;
            String str32 = null;
            while (z11) {
                String str33 = str23;
                int mo114037p = mo113968b.mo114037p(descriptor2);
                switch (mo114037p) {
                    case -1:
                        str23 = str33;
                        str25 = str25;
                        str24 = str24;
                        z11 = false;
                    case 0:
                        str12 = str24;
                        str13 = str25;
                        str14 = str33;
                        str32 = mo113968b.mo114014o(descriptor2, 0);
                        i15 |= 1;
                        str23 = str14;
                        str25 = str13;
                        str24 = str12;
                    case 1:
                        str12 = str24;
                        str13 = str25;
                        str14 = str33;
                        str31 = (String) mo113968b.mo114018x(descriptor2, 1, C26814n1.f127034a, str31);
                        i15 |= 2;
                        str23 = str14;
                        str25 = str13;
                        str24 = str12;
                    case 2:
                        str12 = str24;
                        str13 = str25;
                        str23 = (String) mo113968b.mo114018x(descriptor2, 2, C26814n1.f127034a, str33);
                        i15 |= 4;
                        str25 = str13;
                        str24 = str12;
                    case 3:
                        i15 |= 8;
                        str25 = (String) mo113968b.mo114018x(descriptor2, 3, C26814n1.f127034a, str25);
                        str24 = str24;
                        str23 = str33;
                    case 4:
                        str11 = str25;
                        i16 = mo113968b.mo114011i(descriptor2, 4);
                        i15 |= 16;
                        str23 = str33;
                        str25 = str11;
                    case 5:
                        str11 = str25;
                        str30 = (String) mo113968b.mo114018x(descriptor2, 5, C26814n1.f127034a, str30);
                        i15 |= 32;
                        str23 = str33;
                        str25 = str11;
                    case 6:
                        str11 = str25;
                        str24 = (String) mo113968b.mo114018x(descriptor2, 6, C26814n1.f127034a, str24);
                        i15 |= 64;
                        str23 = str33;
                        str25 = str11;
                    case 7:
                        str11 = str25;
                        j24 = mo113968b.mo114010f(descriptor2, 7);
                        i15 |= 128;
                        str23 = str33;
                        str25 = str11;
                    case 8:
                        str11 = str25;
                        j25 = mo113968b.mo114010f(descriptor2, 8);
                        i15 |= 256;
                        str23 = str33;
                        str25 = str11;
                    case 9:
                        str11 = str25;
                        j22 = mo113968b.mo114010f(descriptor2, 9);
                        i15 |= 512;
                        str23 = str33;
                        str25 = str11;
                    case 10:
                        str11 = str25;
                        j26 = mo113968b.mo114010f(descriptor2, 10);
                        i15 |= 1024;
                        str23 = str33;
                        str25 = str11;
                    case 11:
                        str11 = str25;
                        j21 = mo113968b.mo114010f(descriptor2, 11);
                        i15 |= ZVideoUtilMetadata.FF_PROFILE_H264_INTRA;
                        str23 = str33;
                        str25 = str11;
                    case 12:
                        str11 = str25;
                        f14 = mo113968b.mo114017v(descriptor2, 12);
                        i15 |= 4096;
                        str23 = str33;
                        str25 = str11;
                    case 13:
                        str11 = str25;
                        f13 = mo113968b.mo114017v(descriptor2, 13);
                        i15 |= 8192;
                        str23 = str33;
                        str25 = str11;
                    case 14:
                        str11 = str25;
                        channel3 = (Channel) mo113968b.mo114012l(descriptor2, 14, Channel$$serializer.INSTANCE, channel3);
                        i15 |= 16384;
                        str23 = str33;
                        str25 = str11;
                    case 15:
                        str11 = str25;
                        j27 = mo113968b.mo114010f(descriptor2, 15);
                        i13 = 32768;
                        i15 |= i13;
                        str23 = str33;
                        str25 = str11;
                    case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                        str11 = str25;
                        j23 = mo113968b.mo114010f(descriptor2, 16);
                        i13 = 65536;
                        i15 |= i13;
                        str23 = str33;
                        str25 = str11;
                    case 17:
                        str11 = str25;
                        j28 = mo113968b.mo114010f(descriptor2, 17);
                        i13 = 131072;
                        i15 |= i13;
                        str23 = str33;
                        str25 = str11;
                    case 18:
                        str11 = str25;
                        j29 = mo113968b.mo114010f(descriptor2, 18);
                        i15 |= 262144;
                        str23 = str33;
                        str25 = str11;
                    case 19:
                        str11 = str25;
                        l13 = (Long) mo113968b.mo114018x(descriptor2, 19, C26810m0.f127024a, l13);
                        i14 = 524288;
                        i15 |= i14;
                        str23 = str33;
                        str25 = str11;
                    case 20:
                        str11 = str25;
                        bool6 = (Boolean) mo113968b.mo114018x(descriptor2, 20, C26794h.f127000a, bool6);
                        i14 = ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE;
                        i15 |= i14;
                        str23 = str33;
                        str25 = str11;
                    case 21:
                        str11 = str25;
                        bool5 = (Boolean) mo113968b.mo114018x(descriptor2, 21, C26794h.f127000a, bool5);
                        i14 = 2097152;
                        i15 |= i14;
                        str23 = str33;
                        str25 = str11;
                    case 22:
                        str11 = str25;
                        str29 = (String) mo113968b.mo114018x(descriptor2, 22, C26814n1.f127034a, str29);
                        i14 = 4194304;
                        i15 |= i14;
                        str23 = str33;
                        str25 = str11;
                    case 23:
                        str11 = str25;
                        str28 = (String) mo113968b.mo114018x(descriptor2, 23, C26814n1.f127034a, str28);
                        i14 = 8388608;
                        i15 |= i14;
                        str23 = str33;
                        str25 = str11;
                    case 24:
                        str11 = str25;
                        str27 = (String) mo113968b.mo114018x(descriptor2, 24, C26814n1.f127034a, str27);
                        i14 = 16777216;
                        i15 |= i14;
                        str23 = str33;
                        str25 = str11;
                    case 25:
                        str11 = str25;
                        num2 = (Integer) mo113968b.mo114018x(descriptor2, 25, C26783d0.f126989a, num2);
                        i14 = 33554432;
                        i15 |= i14;
                        str23 = str33;
                        str25 = str11;
                    case 26:
                        str11 = str25;
                        str26 = (String) mo113968b.mo114018x(descriptor2, 26, C26814n1.f127034a, str26);
                        i14 = 67108864;
                        i15 |= i14;
                        str23 = str33;
                        str25 = str11;
                    default:
                        throw new UnknownFieldException(mo114037p);
                }
            }
            bool = bool5;
            str = str31;
            num = num2;
            i11 = i15;
            str2 = str26;
            str3 = str27;
            str4 = str28;
            str5 = str29;
            bool2 = bool6;
            l11 = l13;
            channel = channel3;
            str6 = str30;
            str7 = str32;
            str8 = str23;
            str9 = str25;
            str10 = str24;
            f11 = f13;
            i12 = i16;
            f12 = f14;
            j11 = j21;
            j12 = j22;
            j13 = j23;
            j14 = j24;
            j15 = j25;
            j16 = j26;
            j17 = j27;
            j18 = j28;
            j19 = j29;
        }
        mo113968b.mo114009c(descriptor2);
        return new LivestreamData(i11, str7, str, str8, str9, i12, str6, str10, j14, j15, j12, j16, j11, f12, f11, channel, j17, j13, j18, j19, l11, bool2, bool, str5, str4, str3, num, str2, (AbstractC26805k1) null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, LivestreamData livestreamData) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(livestreamData, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        LivestreamData.m50986i0(livestreamData, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
