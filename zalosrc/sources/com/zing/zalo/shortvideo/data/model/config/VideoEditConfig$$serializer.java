package com.zing.zalo.shortvideo.data.model.config;

import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import fn0.AbstractC19074t;
import java.util.List;
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
public final class VideoEditConfig$$serializer implements InterfaceC26842x {
    public static final VideoEditConfig$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        VideoEditConfig$$serializer videoEditConfig$$serializer = new VideoEditConfig$$serializer();
        INSTANCE = videoEditConfig$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.model.config.VideoEditConfig", videoEditConfig$$serializer, 16);
        pluginGeneratedSerialDescriptor.m114047n("minDuration", true);
        pluginGeneratedSerialDescriptor.m114047n("maxDuration", true);
        pluginGeneratedSerialDescriptor.m114047n("maxPickedSize", true);
        pluginGeneratedSerialDescriptor.m114047n("compressBitrateBlend", true);
        pluginGeneratedSerialDescriptor.m114047n("compressProfile", true);
        pluginGeneratedSerialDescriptor.m114047n("compressBitrate", true);
        pluginGeneratedSerialDescriptor.m114047n("compressPreset", true);
        pluginGeneratedSerialDescriptor.m114047n("compressFrameRate", true);
        pluginGeneratedSerialDescriptor.m114047n("compressResolution", true);
        pluginGeneratedSerialDescriptor.m114047n("bypassCompressBitrateMax", true);
        pluginGeneratedSerialDescriptor.m114047n("bypassCompressFpsMax", true);
        pluginGeneratedSerialDescriptor.m114047n("bypassCompressAreaMax", true);
        pluginGeneratedSerialDescriptor.m114047n("bypassCompressProfileH264LevelMax", true);
        pluginGeneratedSerialDescriptor.m114047n("bypassCompressFileSizeMax", true);
        pluginGeneratedSerialDescriptor.m114047n("bypassCompressDimensionMax", true);
        pluginGeneratedSerialDescriptor.m114047n("bypassCompressProfileH264", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private VideoEditConfig$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = VideoEditConfig.f50160q;
        C26810m0 c26810m0 = C26810m0.f127024a;
        C26814n1 c26814n1 = C26814n1.f127034a;
        return new KSerializer[]{AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(kSerializerArr[15])};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x00e8. Please report as an issue. */
    @Override // qn0.InterfaceC25386a
    public VideoEditConfig deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        Long l11;
        Long l12;
        Long l13;
        Long l14;
        int i11;
        Long l15;
        Long l16;
        Long l17;
        String str;
        String str2;
        Long l18;
        Long l19;
        Long l21;
        Long l22;
        Long l23;
        Long l24;
        List list;
        Long l25;
        KSerializer[] kSerializerArr2;
        Long l26;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        kSerializerArr = VideoEditConfig.f50160q;
        if (mo113968b.mo114015q()) {
            C26810m0 c26810m0 = C26810m0.f127024a;
            Long l27 = (Long) mo113968b.mo114018x(descriptor2, 0, c26810m0, null);
            Long l28 = (Long) mo113968b.mo114018x(descriptor2, 1, c26810m0, null);
            Long l29 = (Long) mo113968b.mo114018x(descriptor2, 2, c26810m0, null);
            Long l31 = (Long) mo113968b.mo114018x(descriptor2, 3, c26810m0, null);
            C26814n1 c26814n1 = C26814n1.f127034a;
            String str3 = (String) mo113968b.mo114018x(descriptor2, 4, c26814n1, null);
            Long l32 = (Long) mo113968b.mo114018x(descriptor2, 5, c26810m0, null);
            String str4 = (String) mo113968b.mo114018x(descriptor2, 6, c26814n1, null);
            Long l33 = (Long) mo113968b.mo114018x(descriptor2, 7, c26810m0, null);
            Long l34 = (Long) mo113968b.mo114018x(descriptor2, 8, c26810m0, null);
            Long l35 = (Long) mo113968b.mo114018x(descriptor2, 9, c26810m0, null);
            Long l36 = (Long) mo113968b.mo114018x(descriptor2, 10, c26810m0, null);
            Long l37 = (Long) mo113968b.mo114018x(descriptor2, 11, c26810m0, null);
            Long l38 = (Long) mo113968b.mo114018x(descriptor2, 12, c26810m0, null);
            Long l39 = (Long) mo113968b.mo114018x(descriptor2, 13, c26810m0, null);
            Long l41 = (Long) mo113968b.mo114018x(descriptor2, 14, c26810m0, null);
            list = (List) mo113968b.mo114018x(descriptor2, 15, kSerializerArr[15], null);
            l21 = l41;
            l14 = l28;
            l11 = l27;
            str = str4;
            l18 = l35;
            l17 = l33;
            l16 = l34;
            l19 = l32;
            l12 = l31;
            l15 = l36;
            str2 = str3;
            l23 = l39;
            l24 = l38;
            l22 = l37;
            l13 = l29;
            i11 = 65535;
        } else {
            Long l42 = null;
            Long l43 = null;
            Long l44 = null;
            Long l45 = null;
            Long l46 = null;
            Long l47 = null;
            Long l48 = null;
            String str5 = null;
            String str6 = null;
            Long l49 = null;
            Long l51 = null;
            Long l52 = null;
            Long l53 = null;
            Long l54 = null;
            Long l55 = null;
            List list2 = null;
            int i12 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                switch (mo114037p) {
                    case -1:
                        l25 = l55;
                        kSerializerArr = kSerializerArr;
                        z11 = false;
                        l55 = l25;
                    case 0:
                        kSerializerArr2 = kSerializerArr;
                        l25 = l55;
                        l45 = (Long) mo113968b.mo114018x(descriptor2, 0, C26810m0.f127024a, l45);
                        i12 |= 1;
                        l52 = l52;
                        kSerializerArr = kSerializerArr2;
                        l55 = l25;
                    case 1:
                        kSerializerArr2 = kSerializerArr;
                        l26 = l45;
                        l25 = l55;
                        l44 = (Long) mo113968b.mo114018x(descriptor2, 1, C26810m0.f127024a, l44);
                        i12 |= 2;
                        l45 = l26;
                        kSerializerArr = kSerializerArr2;
                        l55 = l25;
                    case 2:
                        kSerializerArr2 = kSerializerArr;
                        l26 = l45;
                        l25 = l55;
                        l43 = (Long) mo113968b.mo114018x(descriptor2, 2, C26810m0.f127024a, l43);
                        i12 |= 4;
                        l45 = l26;
                        kSerializerArr = kSerializerArr2;
                        l55 = l25;
                    case 3:
                        kSerializerArr2 = kSerializerArr;
                        l26 = l45;
                        l25 = l55;
                        l42 = (Long) mo113968b.mo114018x(descriptor2, 3, C26810m0.f127024a, l42);
                        i12 |= 8;
                        l45 = l26;
                        kSerializerArr = kSerializerArr2;
                        l55 = l25;
                    case 4:
                        kSerializerArr2 = kSerializerArr;
                        l26 = l45;
                        l25 = l55;
                        str6 = (String) mo113968b.mo114018x(descriptor2, 4, C26814n1.f127034a, str6);
                        i12 |= 16;
                        l45 = l26;
                        kSerializerArr = kSerializerArr2;
                        l55 = l25;
                    case 5:
                        kSerializerArr2 = kSerializerArr;
                        l26 = l45;
                        l25 = l55;
                        l51 = (Long) mo113968b.mo114018x(descriptor2, 5, C26810m0.f127024a, l51);
                        i12 |= 32;
                        l45 = l26;
                        kSerializerArr = kSerializerArr2;
                        l55 = l25;
                    case 6:
                        kSerializerArr2 = kSerializerArr;
                        l26 = l45;
                        l25 = l55;
                        str5 = (String) mo113968b.mo114018x(descriptor2, 6, C26814n1.f127034a, str5);
                        i12 |= 64;
                        l45 = l26;
                        kSerializerArr = kSerializerArr2;
                        l55 = l25;
                    case 7:
                        kSerializerArr2 = kSerializerArr;
                        l26 = l45;
                        l25 = l55;
                        l48 = (Long) mo113968b.mo114018x(descriptor2, 7, C26810m0.f127024a, l48);
                        i12 |= 128;
                        l45 = l26;
                        kSerializerArr = kSerializerArr2;
                        l55 = l25;
                    case 8:
                        kSerializerArr2 = kSerializerArr;
                        l26 = l45;
                        l25 = l55;
                        l47 = (Long) mo113968b.mo114018x(descriptor2, 8, C26810m0.f127024a, l47);
                        i12 |= 256;
                        l45 = l26;
                        kSerializerArr = kSerializerArr2;
                        l55 = l25;
                    case 9:
                        kSerializerArr2 = kSerializerArr;
                        l26 = l45;
                        l25 = l55;
                        l49 = (Long) mo113968b.mo114018x(descriptor2, 9, C26810m0.f127024a, l49);
                        i12 |= 512;
                        l45 = l26;
                        kSerializerArr = kSerializerArr2;
                        l55 = l25;
                    case 10:
                        kSerializerArr2 = kSerializerArr;
                        l26 = l45;
                        l25 = l55;
                        l46 = (Long) mo113968b.mo114018x(descriptor2, 10, C26810m0.f127024a, l46);
                        i12 |= 1024;
                        l45 = l26;
                        kSerializerArr = kSerializerArr2;
                        l55 = l25;
                    case 11:
                        kSerializerArr2 = kSerializerArr;
                        l26 = l45;
                        l25 = l55;
                        l52 = (Long) mo113968b.mo114018x(descriptor2, 11, C26810m0.f127024a, l52);
                        i12 |= ZVideoUtilMetadata.FF_PROFILE_H264_INTRA;
                        l53 = l53;
                        l45 = l26;
                        kSerializerArr = kSerializerArr2;
                        l55 = l25;
                    case 12:
                        kSerializerArr2 = kSerializerArr;
                        l26 = l45;
                        l25 = l55;
                        l53 = (Long) mo113968b.mo114018x(descriptor2, 12, C26810m0.f127024a, l53);
                        i12 |= 4096;
                        l54 = l54;
                        l45 = l26;
                        kSerializerArr = kSerializerArr2;
                        l55 = l25;
                    case 13:
                        kSerializerArr2 = kSerializerArr;
                        l26 = l45;
                        l25 = l55;
                        l54 = (Long) mo113968b.mo114018x(descriptor2, 13, C26810m0.f127024a, l54);
                        i12 |= 8192;
                        l45 = l26;
                        kSerializerArr = kSerializerArr2;
                        l55 = l25;
                    case 14:
                        i12 |= 16384;
                        list2 = list2;
                        l45 = l45;
                        kSerializerArr = kSerializerArr;
                        l55 = (Long) mo113968b.mo114018x(descriptor2, 14, C26810m0.f127024a, l55);
                    case 15:
                        list2 = (List) mo113968b.mo114018x(descriptor2, 15, kSerializerArr[15], list2);
                        i12 |= 32768;
                        l45 = l45;
                        kSerializerArr = kSerializerArr;
                    default:
                        throw new UnknownFieldException(mo114037p);
                }
            }
            l11 = l45;
            l12 = l42;
            l13 = l43;
            l14 = l44;
            i11 = i12;
            l15 = l46;
            l16 = l47;
            l17 = l48;
            str = str5;
            str2 = str6;
            l18 = l49;
            l19 = l51;
            l21 = l55;
            l22 = l52;
            l23 = l54;
            l24 = l53;
            list = list2;
        }
        mo113968b.mo114009c(descriptor2);
        return new VideoEditConfig(i11, l11, l14, l13, l12, str2, l19, str, l17, l16, l18, l15, l22, l24, l23, l21, list, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, VideoEditConfig videoEditConfig) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(videoEditConfig, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        VideoEditConfig.m51500r(videoEditConfig, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
