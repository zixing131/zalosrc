package com.zing.zalo.shortvideo.data.model.config;

import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
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
import tn0.C26783d0;
import tn0.C26794h;
import tn0.C26810m0;
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes5.dex */
public final class CoreConfig$$serializer implements InterfaceC26842x {
    public static final CoreConfig$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        CoreConfig$$serializer coreConfig$$serializer = new CoreConfig$$serializer();
        INSTANCE = coreConfig$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.model.config.CoreConfig", coreConfig$$serializer, 23);
        pluginGeneratedSerialDescriptor.m114047n("delaySearchMillis", true);
        pluginGeneratedSerialDescriptor.m114047n("verifyEKycUrl", true);
        pluginGeneratedSerialDescriptor.m114047n("contentFeedbacks", true);
        pluginGeneratedSerialDescriptor.m114047n("isShowBookmarkBtn", true);
        pluginGeneratedSerialDescriptor.m114047n("isShowDislikeBtn", true);
        pluginGeneratedSerialDescriptor.m114047n("maxNoneSwipeSession", true);
        pluginGeneratedSerialDescriptor.m114047n("delayUserGuideMillis", true);
        pluginGeneratedSerialDescriptor.m114047n("delayDismissUserGuideMillis", true);
        pluginGeneratedSerialDescriptor.m114047n("maxPageFindJustWatchedVideo", true);
        pluginGeneratedSerialDescriptor.m114047n("timeoutFindJustWatchedMillis", true);
        pluginGeneratedSerialDescriptor.m114047n("delayHighlightFollowMillis", true);
        pluginGeneratedSerialDescriptor.m114047n("followSuggestChannelCapacity", true);
        pluginGeneratedSerialDescriptor.m114047n("followSuggestVideoPerChannel", true);
        pluginGeneratedSerialDescriptor.m114047n("followSuggestWatchTimeMillis", true);
        pluginGeneratedSerialDescriptor.m114047n("userNotiCategories", true);
        pluginGeneratedSerialDescriptor.m114047n("channelNotiCategories", true);
        pluginGeneratedSerialDescriptor.m114047n("shareSuggestion", true);
        pluginGeneratedSerialDescriptor.m114047n("likeSuggestion", true);
        pluginGeneratedSerialDescriptor.m114047n("delaySearchInChannelMillis", true);
        pluginGeneratedSerialDescriptor.m114047n("dailyToastQuota", true);
        pluginGeneratedSerialDescriptor.m114047n("dailyToastMsg", true);
        pluginGeneratedSerialDescriptor.m114047n("dataUsageWarningInterval", true);
        pluginGeneratedSerialDescriptor.m114047n("adVersion", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CoreConfig$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = CoreConfig.f50115x;
        C26810m0 c26810m0 = C26810m0.f127024a;
        C26814n1 c26814n1 = C26814n1.f127034a;
        C26794h c26794h = C26794h.f127000a;
        C26783d0 c26783d0 = C26783d0.f126989a;
        return new KSerializer[]{AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(kSerializerArr[2]), AbstractC25935a.m133630u(c26794h), AbstractC25935a.m133630u(c26794h), AbstractC25935a.m133630u(c26783d0), AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(c26783d0), AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(c26783d0), AbstractC25935a.m133630u(c26783d0), AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(kSerializerArr[14]), AbstractC25935a.m133630u(kSerializerArr[15]), AbstractC25935a.m133630u(ShareSuggestionConfig$$serializer.INSTANCE), AbstractC25935a.m133630u(LikeSuggestionConfig$$serializer.INSTANCE), AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(c26783d0), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(c26783d0)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0154. Please report as an issue. */
    @Override // qn0.InterfaceC25386a
    public CoreConfig deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        Long l11;
        Boolean bool;
        String str;
        Integer num;
        Long l12;
        Long l13;
        LikeSuggestionConfig likeSuggestionConfig;
        Long l14;
        List list;
        ShareSuggestionConfig shareSuggestionConfig;
        int i11;
        Integer num2;
        List list2;
        Integer num3;
        Integer num4;
        Long l15;
        String str2;
        List list3;
        Boolean bool2;
        Integer num5;
        Long l16;
        Long l17;
        Integer num6;
        Long l18;
        Integer num7;
        int i12;
        List list4;
        Boolean bool3;
        KSerializer[] kSerializerArr2;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        kSerializerArr = CoreConfig.f50115x;
        Long l19 = null;
        if (mo113968b.mo114015q()) {
            C26810m0 c26810m0 = C26810m0.f127024a;
            Long l21 = (Long) mo113968b.mo114018x(descriptor2, 0, c26810m0, null);
            C26814n1 c26814n1 = C26814n1.f127034a;
            String str3 = (String) mo113968b.mo114018x(descriptor2, 1, c26814n1, null);
            List list5 = (List) mo113968b.mo114018x(descriptor2, 2, kSerializerArr[2], null);
            C26794h c26794h = C26794h.f127000a;
            Boolean bool4 = (Boolean) mo113968b.mo114018x(descriptor2, 3, c26794h, null);
            Boolean bool5 = (Boolean) mo113968b.mo114018x(descriptor2, 4, c26794h, null);
            C26783d0 c26783d0 = C26783d0.f126989a;
            Integer num8 = (Integer) mo113968b.mo114018x(descriptor2, 5, c26783d0, null);
            Long l22 = (Long) mo113968b.mo114018x(descriptor2, 6, c26810m0, null);
            Long l23 = (Long) mo113968b.mo114018x(descriptor2, 7, c26810m0, null);
            Integer num9 = (Integer) mo113968b.mo114018x(descriptor2, 8, c26783d0, null);
            Long l24 = (Long) mo113968b.mo114018x(descriptor2, 9, c26810m0, null);
            Long l25 = (Long) mo113968b.mo114018x(descriptor2, 10, c26810m0, null);
            Integer num10 = (Integer) mo113968b.mo114018x(descriptor2, 11, c26783d0, null);
            Integer num11 = (Integer) mo113968b.mo114018x(descriptor2, 12, c26783d0, null);
            Long l26 = (Long) mo113968b.mo114018x(descriptor2, 13, c26810m0, null);
            List list6 = (List) mo113968b.mo114018x(descriptor2, 14, kSerializerArr[14], null);
            List list7 = (List) mo113968b.mo114018x(descriptor2, 15, kSerializerArr[15], null);
            ShareSuggestionConfig shareSuggestionConfig2 = (ShareSuggestionConfig) mo113968b.mo114018x(descriptor2, 16, ShareSuggestionConfig$$serializer.INSTANCE, null);
            LikeSuggestionConfig likeSuggestionConfig2 = (LikeSuggestionConfig) mo113968b.mo114018x(descriptor2, 17, LikeSuggestionConfig$$serializer.INSTANCE, null);
            Long l27 = (Long) mo113968b.mo114018x(descriptor2, 18, c26810m0, null);
            Integer num12 = (Integer) mo113968b.mo114018x(descriptor2, 19, c26783d0, null);
            str = (String) mo113968b.mo114018x(descriptor2, 20, c26814n1, null);
            l12 = (Long) mo113968b.mo114018x(descriptor2, 21, c26810m0, null);
            list2 = list6;
            l13 = l27;
            num6 = num9;
            bool2 = bool5;
            str2 = str3;
            l11 = l21;
            num2 = (Integer) mo113968b.mo114018x(descriptor2, 22, c26783d0, null);
            l17 = l23;
            l16 = l22;
            num5 = num8;
            num = num12;
            likeSuggestionConfig = likeSuggestionConfig2;
            shareSuggestionConfig = shareSuggestionConfig2;
            list = list7;
            list3 = list5;
            l14 = l26;
            num3 = num11;
            num4 = num10;
            l15 = l25;
            l18 = l24;
            bool = bool4;
            i11 = 8388607;
        } else {
            List list8 = null;
            String str4 = null;
            Integer num13 = null;
            Integer num14 = null;
            Long l28 = null;
            Long l29 = null;
            LikeSuggestionConfig likeSuggestionConfig3 = null;
            List list9 = null;
            ShareSuggestionConfig shareSuggestionConfig3 = null;
            Integer num15 = null;
            Integer num16 = null;
            Long l31 = null;
            String str5 = null;
            List list10 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            Integer num17 = null;
            Long l32 = null;
            Long l33 = null;
            Integer num18 = null;
            Long l34 = null;
            Long l35 = null;
            int i13 = 0;
            boolean z11 = true;
            while (z11) {
                Integer num19 = num15;
                int mo114037p = mo113968b.mo114037p(descriptor2);
                switch (mo114037p) {
                    case -1:
                        list4 = list8;
                        bool3 = bool6;
                        num14 = num14;
                        num15 = num19;
                        kSerializerArr = kSerializerArr;
                        z11 = false;
                        bool6 = bool3;
                        list8 = list4;
                    case 0:
                        list4 = list8;
                        bool3 = bool6;
                        kSerializerArr2 = kSerializerArr;
                        l31 = (Long) mo113968b.mo114018x(descriptor2, 0, C26810m0.f127024a, l31);
                        i13 |= 1;
                        num14 = num14;
                        num15 = num19;
                        str5 = str5;
                        kSerializerArr = kSerializerArr2;
                        bool6 = bool3;
                        list8 = list4;
                    case 1:
                        list4 = list8;
                        bool3 = bool6;
                        kSerializerArr2 = kSerializerArr;
                        str5 = (String) mo113968b.mo114018x(descriptor2, 1, C26814n1.f127034a, str5);
                        i13 |= 2;
                        num14 = num14;
                        num15 = num19;
                        list10 = list10;
                        kSerializerArr = kSerializerArr2;
                        bool6 = bool3;
                        list8 = list4;
                    case 2:
                        list4 = list8;
                        bool3 = bool6;
                        kSerializerArr2 = kSerializerArr;
                        list10 = (List) mo113968b.mo114018x(descriptor2, 2, kSerializerArr[2], list10);
                        i13 |= 4;
                        num14 = num14;
                        num15 = num19;
                        kSerializerArr = kSerializerArr2;
                        bool6 = bool3;
                        list8 = list4;
                    case 3:
                        bool6 = (Boolean) mo113968b.mo114018x(descriptor2, 3, C26794h.f127000a, bool6);
                        i13 |= 8;
                        list8 = list8;
                        num14 = num14;
                        num15 = num19;
                        bool7 = bool7;
                    case 4:
                        bool7 = (Boolean) mo113968b.mo114018x(descriptor2, 4, C26794h.f127000a, bool7);
                        i13 |= 16;
                        list8 = list8;
                        num14 = num14;
                        num15 = num19;
                        num17 = num17;
                    case 5:
                        num17 = (Integer) mo113968b.mo114018x(descriptor2, 5, C26783d0.f126989a, num17);
                        i13 |= 32;
                        list8 = list8;
                        num14 = num14;
                        num15 = num19;
                        l32 = l32;
                    case 6:
                        l32 = (Long) mo113968b.mo114018x(descriptor2, 6, C26810m0.f127024a, l32);
                        i13 |= 64;
                        list8 = list8;
                        num14 = num14;
                        num15 = num19;
                        l33 = l33;
                    case 7:
                        l33 = (Long) mo113968b.mo114018x(descriptor2, 7, C26810m0.f127024a, l33);
                        i13 |= 128;
                        list8 = list8;
                        num14 = num14;
                        num15 = num19;
                        num18 = num18;
                    case 8:
                        num18 = (Integer) mo113968b.mo114018x(descriptor2, 8, C26783d0.f126989a, num18);
                        i13 |= 256;
                        list8 = list8;
                        num14 = num14;
                        num15 = num19;
                        l34 = l34;
                    case 9:
                        l34 = (Long) mo113968b.mo114018x(descriptor2, 9, C26810m0.f127024a, l34);
                        i13 |= 512;
                        list8 = list8;
                        num14 = num14;
                        num15 = num19;
                        l35 = l35;
                    case 10:
                        l35 = (Long) mo113968b.mo114018x(descriptor2, 10, C26810m0.f127024a, l35);
                        i13 |= 1024;
                        list8 = list8;
                        num14 = num14;
                        num15 = num19;
                    case 11:
                        List list11 = list8;
                        Integer num20 = (Integer) mo113968b.mo114018x(descriptor2, 11, C26783d0.f126989a, num19);
                        i13 |= ZVideoUtilMetadata.FF_PROFILE_H264_INTRA;
                        num15 = num20;
                        list8 = list11;
                        num14 = num14;
                    case 12:
                        num14 = (Integer) mo113968b.mo114018x(descriptor2, 12, C26783d0.f126989a, num14);
                        i13 |= 4096;
                        list8 = list8;
                        num15 = num19;
                    case 13:
                        num7 = num14;
                        l19 = (Long) mo113968b.mo114018x(descriptor2, 13, C26810m0.f127024a, l19);
                        i13 |= 8192;
                        num15 = num19;
                        num14 = num7;
                    case 14:
                        num7 = num14;
                        list8 = (List) mo113968b.mo114018x(descriptor2, 14, kSerializerArr[14], list8);
                        i13 |= 16384;
                        num15 = num19;
                        num14 = num7;
                    case 15:
                        num7 = num14;
                        list9 = (List) mo113968b.mo114018x(descriptor2, 15, kSerializerArr[15], list9);
                        i13 |= 32768;
                        num15 = num19;
                        num14 = num7;
                    case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                        num7 = num14;
                        shareSuggestionConfig3 = (ShareSuggestionConfig) mo113968b.mo114018x(descriptor2, 16, ShareSuggestionConfig$$serializer.INSTANCE, shareSuggestionConfig3);
                        i12 = 65536;
                        i13 |= i12;
                        num15 = num19;
                        num14 = num7;
                    case 17:
                        num7 = num14;
                        likeSuggestionConfig3 = (LikeSuggestionConfig) mo113968b.mo114018x(descriptor2, 17, LikeSuggestionConfig$$serializer.INSTANCE, likeSuggestionConfig3);
                        i12 = 131072;
                        i13 |= i12;
                        num15 = num19;
                        num14 = num7;
                    case 18:
                        num7 = num14;
                        l29 = (Long) mo113968b.mo114018x(descriptor2, 18, C26810m0.f127024a, l29);
                        i12 = 262144;
                        i13 |= i12;
                        num15 = num19;
                        num14 = num7;
                    case 19:
                        num7 = num14;
                        num13 = (Integer) mo113968b.mo114018x(descriptor2, 19, C26783d0.f126989a, num13);
                        i12 = 524288;
                        i13 |= i12;
                        num15 = num19;
                        num14 = num7;
                    case 20:
                        num7 = num14;
                        str4 = (String) mo113968b.mo114018x(descriptor2, 20, C26814n1.f127034a, str4);
                        i12 = ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE;
                        i13 |= i12;
                        num15 = num19;
                        num14 = num7;
                    case 21:
                        num7 = num14;
                        l28 = (Long) mo113968b.mo114018x(descriptor2, 21, C26810m0.f127024a, l28);
                        i12 = 2097152;
                        i13 |= i12;
                        num15 = num19;
                        num14 = num7;
                    case 22:
                        num7 = num14;
                        num16 = (Integer) mo113968b.mo114018x(descriptor2, 22, C26783d0.f126989a, num16);
                        i12 = 4194304;
                        i13 |= i12;
                        num15 = num19;
                        num14 = num7;
                    default:
                        throw new UnknownFieldException(mo114037p);
                }
            }
            l11 = l31;
            bool = bool6;
            str = str4;
            num = num13;
            l12 = l28;
            l13 = l29;
            likeSuggestionConfig = likeSuggestionConfig3;
            l14 = l19;
            list = list9;
            shareSuggestionConfig = shareSuggestionConfig3;
            i11 = i13;
            num2 = num16;
            list2 = list8;
            num3 = num14;
            num4 = num15;
            l15 = l35;
            str2 = str5;
            list3 = list10;
            bool2 = bool7;
            num5 = num17;
            l16 = l32;
            l17 = l33;
            num6 = num18;
            l18 = l34;
        }
        mo113968b.mo114009c(descriptor2);
        return new CoreConfig(i11, l11, str2, list3, bool, bool2, num5, l16, l17, num6, l18, l15, num4, num3, l14, list2, list, shareSuggestionConfig, likeSuggestionConfig, l13, num, str, l12, num2, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, CoreConfig coreConfig) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(coreConfig, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        CoreConfig.m51438y(coreConfig, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
