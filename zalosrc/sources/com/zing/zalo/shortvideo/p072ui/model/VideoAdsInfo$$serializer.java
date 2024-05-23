package com.zing.zalo.shortvideo.p072ui.model;

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
import tn0.C26810m0;
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes5.dex */
public final class VideoAdsInfo$$serializer implements InterfaceC26842x {
    public static final VideoAdsInfo$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        VideoAdsInfo$$serializer videoAdsInfo$$serializer = new VideoAdsInfo$$serializer();
        INSTANCE = videoAdsInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.ui.model.VideoAdsInfo", videoAdsInfo$$serializer, 13);
        pluginGeneratedSerialDescriptor.m114047n("index", false);
        pluginGeneratedSerialDescriptor.m114047n("adsType", false);
        pluginGeneratedSerialDescriptor.m114047n("templateId", false);
        pluginGeneratedSerialDescriptor.m114047n("adId", false);
        pluginGeneratedSerialDescriptor.m114047n("adSrc", false);
        pluginGeneratedSerialDescriptor.m114047n("tag", false);
        pluginGeneratedSerialDescriptor.m114047n("watchTimeChangeAction", false);
        pluginGeneratedSerialDescriptor.m114047n("actionBefore", false);
        pluginGeneratedSerialDescriptor.m114047n("actionAfter", false);
        pluginGeneratedSerialDescriptor.m114047n("ended", false);
        pluginGeneratedSerialDescriptor.m114047n("shareUrl", false);
        pluginGeneratedSerialDescriptor.m114047n("reportUrl", false);
        pluginGeneratedSerialDescriptor.m114047n("btSheet", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private VideoAdsInfo$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = VideoAdsInfo.f51419C;
        C26783d0 c26783d0 = C26783d0.f126989a;
        C26814n1 c26814n1 = C26814n1.f127034a;
        Action$$serializer action$$serializer = Action$$serializer.INSTANCE;
        return new KSerializer[]{c26783d0, c26783d0, c26783d0, AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), Tag$$serializer.INSTANCE, C26810m0.f127024a, AbstractC25935a.m133630u(action$$serializer), action$$serializer, AbstractC25935a.m133630u(Ended$$serializer.INSTANCE), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(kSerializerArr[12])};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x00bb. Please report as an issue. */
    @Override // qn0.InterfaceC25386a
    public VideoAdsInfo deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i11;
        int i12;
        String str;
        String str2;
        List list;
        String str3;
        Ended ended;
        String str4;
        Action action;
        Tag tag;
        Action action2;
        long j11;
        int i13;
        int i14;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        kSerializerArr = VideoAdsInfo.f51419C;
        if (mo113968b.mo114015q()) {
            int mo114011i = mo113968b.mo114011i(descriptor2, 0);
            int mo114011i2 = mo113968b.mo114011i(descriptor2, 1);
            int mo114011i3 = mo113968b.mo114011i(descriptor2, 2);
            C26814n1 c26814n1 = C26814n1.f127034a;
            String str5 = (String) mo113968b.mo114018x(descriptor2, 3, c26814n1, null);
            String str6 = (String) mo113968b.mo114018x(descriptor2, 4, c26814n1, null);
            Tag tag2 = (Tag) mo113968b.mo114012l(descriptor2, 5, Tag$$serializer.INSTANCE, null);
            long mo114010f = mo113968b.mo114010f(descriptor2, 6);
            Action$$serializer action$$serializer = Action$$serializer.INSTANCE;
            Action action3 = (Action) mo113968b.mo114018x(descriptor2, 7, action$$serializer, null);
            Action action4 = (Action) mo113968b.mo114012l(descriptor2, 8, action$$serializer, null);
            Ended ended2 = (Ended) mo113968b.mo114018x(descriptor2, 9, Ended$$serializer.INSTANCE, null);
            String str7 = (String) mo113968b.mo114018x(descriptor2, 10, c26814n1, null);
            String str8 = (String) mo113968b.mo114018x(descriptor2, 11, c26814n1, null);
            list = (List) mo113968b.mo114018x(descriptor2, 12, kSerializerArr[12], null);
            str3 = str8;
            tag = tag2;
            action = action4;
            action2 = action3;
            j11 = mo114010f;
            str = str5;
            str4 = str7;
            str2 = str6;
            i13 = mo114011i3;
            i14 = mo114011i2;
            ended = ended2;
            i11 = mo114011i;
            i12 = 8191;
        } else {
            List list2 = null;
            String str9 = null;
            Ended ended3 = null;
            String str10 = null;
            Action action5 = null;
            Tag tag3 = null;
            Action action6 = null;
            long j12 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            boolean z11 = true;
            String str11 = null;
            String str12 = null;
            int i18 = 0;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                switch (mo114037p) {
                    case -1:
                        z11 = false;
                    case 0:
                        i18 |= 1;
                        i15 = mo113968b.mo114011i(descriptor2, 0);
                    case 1:
                        i17 = mo113968b.mo114011i(descriptor2, 1);
                        i18 |= 2;
                    case 2:
                        i16 = mo113968b.mo114011i(descriptor2, 2);
                        i18 |= 4;
                    case 3:
                        str11 = (String) mo113968b.mo114018x(descriptor2, 3, C26814n1.f127034a, str11);
                        i18 |= 8;
                    case 4:
                        str12 = (String) mo113968b.mo114018x(descriptor2, 4, C26814n1.f127034a, str12);
                        i18 |= 16;
                    case 5:
                        tag3 = (Tag) mo113968b.mo114012l(descriptor2, 5, Tag$$serializer.INSTANCE, tag3);
                        i18 |= 32;
                    case 6:
                        j12 = mo113968b.mo114010f(descriptor2, 6);
                        i18 |= 64;
                    case 7:
                        action6 = (Action) mo113968b.mo114018x(descriptor2, 7, Action$$serializer.INSTANCE, action6);
                        i18 |= 128;
                    case 8:
                        action5 = (Action) mo113968b.mo114012l(descriptor2, 8, Action$$serializer.INSTANCE, action5);
                        i18 |= 256;
                    case 9:
                        ended3 = (Ended) mo113968b.mo114018x(descriptor2, 9, Ended$$serializer.INSTANCE, ended3);
                        i18 |= 512;
                    case 10:
                        str10 = (String) mo113968b.mo114018x(descriptor2, 10, C26814n1.f127034a, str10);
                        i18 |= 1024;
                    case 11:
                        str9 = (String) mo113968b.mo114018x(descriptor2, 11, C26814n1.f127034a, str9);
                        i18 |= ZVideoUtilMetadata.FF_PROFILE_H264_INTRA;
                    case 12:
                        list2 = (List) mo113968b.mo114018x(descriptor2, 12, kSerializerArr[12], list2);
                        i18 |= 4096;
                    default:
                        throw new UnknownFieldException(mo114037p);
                }
            }
            i11 = i15;
            i12 = i18;
            str = str11;
            str2 = str12;
            list = list2;
            str3 = str9;
            ended = ended3;
            str4 = str10;
            action = action5;
            tag = tag3;
            action2 = action6;
            j11 = j12;
            i13 = i16;
            i14 = i17;
        }
        mo113968b.mo114009c(descriptor2);
        return new VideoAdsInfo(i12, i11, i14, i13, str, str2, tag, j11, action2, action, ended, str4, str3, list, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, VideoAdsInfo videoAdsInfo) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(videoAdsInfo, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        VideoAdsInfo.m52925o(videoAdsInfo, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
