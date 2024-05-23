package com.zing.zalo.shortvideo.data.model;

import com.zing.zalo.shortvideo.p072ui.model.Ended;
import com.zing.zalo.shortvideo.p072ui.model.Ended$$serializer;
import com.zing.zalo.shortvideo.p072ui.model.Tag;
import com.zing.zalo.shortvideo.p072ui.model.Tag$$serializer;
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
public final class VideoAdsData$$serializer implements InterfaceC26842x {
    public static final VideoAdsData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        VideoAdsData$$serializer videoAdsData$$serializer = new VideoAdsData$$serializer();
        INSTANCE = videoAdsData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.model.VideoAdsData", videoAdsData$$serializer, 15);
        pluginGeneratedSerialDescriptor.m114047n("index", false);
        pluginGeneratedSerialDescriptor.m114047n("adsType", false);
        pluginGeneratedSerialDescriptor.m114047n("templateId", false);
        pluginGeneratedSerialDescriptor.m114047n("adId", false);
        pluginGeneratedSerialDescriptor.m114047n("adSrc", false);
        pluginGeneratedSerialDescriptor.m114047n("video", false);
        pluginGeneratedSerialDescriptor.m114047n("tag", false);
        pluginGeneratedSerialDescriptor.m114047n("watchTimeChangeAction", false);
        pluginGeneratedSerialDescriptor.m114047n("actionBefore", false);
        pluginGeneratedSerialDescriptor.m114047n("actionAfter", false);
        pluginGeneratedSerialDescriptor.m114047n("ended", false);
        pluginGeneratedSerialDescriptor.m114047n("shareUrl", false);
        pluginGeneratedSerialDescriptor.m114047n("reportURL", false);
        pluginGeneratedSerialDescriptor.m114047n("isForce", false);
        pluginGeneratedSerialDescriptor.m114047n("btSheet", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private VideoAdsData$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = VideoAdsData.f50011E;
        C26783d0 c26783d0 = C26783d0.f126989a;
        C26814n1 c26814n1 = C26814n1.f127034a;
        com.zing.zalo.shortvideo.p072ui.model.Action$$serializer action$$serializer = com.zing.zalo.shortvideo.p072ui.model.Action$$serializer.INSTANCE;
        return new KSerializer[]{c26783d0, c26783d0, c26783d0, AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), VideoData$$serializer.INSTANCE, Tag$$serializer.INSTANCE, C26810m0.f127024a, AbstractC25935a.m133630u(action$$serializer), action$$serializer, AbstractC25935a.m133630u(Ended$$serializer.INSTANCE), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), C26794h.f127000a, AbstractC25935a.m133630u(kSerializerArr[14])};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x00d3. Please report as an issue. */
    @Override // qn0.InterfaceC25386a
    public VideoAdsData deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i11;
        String str;
        String str2;
        List list;
        String str3;
        Ended ended;
        com.zing.zalo.shortvideo.p072ui.model.Action action;
        Tag tag;
        String str4;
        com.zing.zalo.shortvideo.p072ui.model.Action action2;
        VideoData videoData;
        int i12;
        int i13;
        boolean z11;
        long j11;
        int i14;
        int mo114011i;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        kSerializerArr = VideoAdsData.f50011E;
        if (mo113968b.mo114015q()) {
            int mo114011i2 = mo113968b.mo114011i(descriptor2, 0);
            int mo114011i3 = mo113968b.mo114011i(descriptor2, 1);
            int mo114011i4 = mo113968b.mo114011i(descriptor2, 2);
            C26814n1 c26814n1 = C26814n1.f127034a;
            String str5 = (String) mo113968b.mo114018x(descriptor2, 3, c26814n1, null);
            String str6 = (String) mo113968b.mo114018x(descriptor2, 4, c26814n1, null);
            VideoData videoData2 = (VideoData) mo113968b.mo114012l(descriptor2, 5, VideoData$$serializer.INSTANCE, null);
            Tag tag2 = (Tag) mo113968b.mo114012l(descriptor2, 6, Tag$$serializer.INSTANCE, null);
            long mo114010f = mo113968b.mo114010f(descriptor2, 7);
            com.zing.zalo.shortvideo.p072ui.model.Action$$serializer action$$serializer = com.zing.zalo.shortvideo.p072ui.model.Action$$serializer.INSTANCE;
            com.zing.zalo.shortvideo.p072ui.model.Action action3 = (com.zing.zalo.shortvideo.p072ui.model.Action) mo113968b.mo114018x(descriptor2, 8, action$$serializer, null);
            com.zing.zalo.shortvideo.p072ui.model.Action action4 = (com.zing.zalo.shortvideo.p072ui.model.Action) mo113968b.mo114012l(descriptor2, 9, action$$serializer, null);
            Ended ended2 = (Ended) mo113968b.mo114018x(descriptor2, 10, Ended$$serializer.INSTANCE, null);
            String str7 = (String) mo113968b.mo114018x(descriptor2, 11, c26814n1, null);
            String str8 = (String) mo113968b.mo114018x(descriptor2, 12, c26814n1, null);
            boolean mo114004D = mo113968b.mo114004D(descriptor2, 13);
            str4 = str8;
            list = (List) mo113968b.mo114018x(descriptor2, 14, kSerializerArr[14], null);
            i12 = mo114011i3;
            i13 = mo114011i4;
            videoData = videoData2;
            action = action4;
            ended = ended2;
            tag = tag2;
            action2 = action3;
            str2 = str5;
            str3 = str7;
            str = str6;
            z11 = mo114004D;
            i14 = mo114011i2;
            j11 = mo114010f;
            i11 = 32767;
        } else {
            String str9 = null;
            String str10 = null;
            List list2 = null;
            String str11 = null;
            Ended ended3 = null;
            com.zing.zalo.shortvideo.p072ui.model.Action action5 = null;
            Tag tag3 = null;
            String str12 = null;
            com.zing.zalo.shortvideo.p072ui.model.Action action6 = null;
            VideoData videoData3 = null;
            long j12 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            boolean z12 = false;
            boolean z13 = true;
            while (true) {
                int i19 = i16;
                if (z13) {
                    int mo114037p = mo113968b.mo114037p(descriptor2);
                    switch (mo114037p) {
                        case -1:
                            i16 = i19;
                            z13 = false;
                        case 0:
                            i15 |= 1;
                            i17 = i17;
                            i16 = mo113968b.mo114011i(descriptor2, 0);
                        case 1:
                            mo114011i = mo113968b.mo114011i(descriptor2, 1);
                            i15 |= 2;
                            i17 = mo114011i;
                            i16 = i19;
                        case 2:
                            mo114011i = i17;
                            i18 = mo113968b.mo114011i(descriptor2, 2);
                            i15 |= 4;
                            i17 = mo114011i;
                            i16 = i19;
                        case 3:
                            mo114011i = i17;
                            str10 = (String) mo113968b.mo114018x(descriptor2, 3, C26814n1.f127034a, str10);
                            i15 |= 8;
                            i17 = mo114011i;
                            i16 = i19;
                        case 4:
                            mo114011i = i17;
                            str9 = (String) mo113968b.mo114018x(descriptor2, 4, C26814n1.f127034a, str9);
                            i15 |= 16;
                            i17 = mo114011i;
                            i16 = i19;
                        case 5:
                            mo114011i = i17;
                            videoData3 = (VideoData) mo113968b.mo114012l(descriptor2, 5, VideoData$$serializer.INSTANCE, videoData3);
                            i15 |= 32;
                            i17 = mo114011i;
                            i16 = i19;
                        case 6:
                            mo114011i = i17;
                            tag3 = (Tag) mo113968b.mo114012l(descriptor2, 6, Tag$$serializer.INSTANCE, tag3);
                            i15 |= 64;
                            i17 = mo114011i;
                            i16 = i19;
                        case 7:
                            mo114011i = i17;
                            j12 = mo113968b.mo114010f(descriptor2, 7);
                            i15 |= 128;
                            i17 = mo114011i;
                            i16 = i19;
                        case 8:
                            mo114011i = i17;
                            action6 = (com.zing.zalo.shortvideo.p072ui.model.Action) mo113968b.mo114018x(descriptor2, 8, com.zing.zalo.shortvideo.p072ui.model.Action$$serializer.INSTANCE, action6);
                            i15 |= 256;
                            i17 = mo114011i;
                            i16 = i19;
                        case 9:
                            mo114011i = i17;
                            action5 = (com.zing.zalo.shortvideo.p072ui.model.Action) mo113968b.mo114012l(descriptor2, 9, com.zing.zalo.shortvideo.p072ui.model.Action$$serializer.INSTANCE, action5);
                            i15 |= 512;
                            i17 = mo114011i;
                            i16 = i19;
                        case 10:
                            mo114011i = i17;
                            ended3 = (Ended) mo113968b.mo114018x(descriptor2, 10, Ended$$serializer.INSTANCE, ended3);
                            i15 |= 1024;
                            i17 = mo114011i;
                            i16 = i19;
                        case 11:
                            mo114011i = i17;
                            str11 = (String) mo113968b.mo114018x(descriptor2, 11, C26814n1.f127034a, str11);
                            i15 |= ZVideoUtilMetadata.FF_PROFILE_H264_INTRA;
                            i17 = mo114011i;
                            i16 = i19;
                        case 12:
                            mo114011i = i17;
                            str12 = (String) mo113968b.mo114018x(descriptor2, 12, C26814n1.f127034a, str12);
                            i15 |= 4096;
                            i17 = mo114011i;
                            i16 = i19;
                        case 13:
                            mo114011i = i17;
                            z12 = mo113968b.mo114004D(descriptor2, 13);
                            i15 |= 8192;
                            i17 = mo114011i;
                            i16 = i19;
                        case 14:
                            mo114011i = i17;
                            list2 = (List) mo113968b.mo114018x(descriptor2, 14, kSerializerArr[14], list2);
                            i15 |= 16384;
                            i17 = mo114011i;
                            i16 = i19;
                        default:
                            throw new UnknownFieldException(mo114037p);
                    }
                } else {
                    i11 = i15;
                    str = str9;
                    str2 = str10;
                    list = list2;
                    str3 = str11;
                    ended = ended3;
                    action = action5;
                    tag = tag3;
                    str4 = str12;
                    action2 = action6;
                    videoData = videoData3;
                    i12 = i17;
                    i13 = i18;
                    z11 = z12;
                    j11 = j12;
                    i14 = i19;
                }
            }
        }
        mo113968b.mo114009c(descriptor2);
        return new VideoAdsData(i11, i14, i12, i13, str2, str, videoData, tag, j11, action2, action, ended, str3, str4, z11, list, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, VideoAdsData videoAdsData) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(videoAdsData, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        VideoAdsData.m51262q(videoAdsData, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
