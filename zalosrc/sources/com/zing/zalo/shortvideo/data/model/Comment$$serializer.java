package com.zing.zalo.shortvideo.data.model;

import com.zing.zalo.shortvideo.data.model.Comment;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.model.Video$$serializer;
import com.zing.zalo.zinstant.zom.node.ZOM;
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
import tn0.AbstractC26805k1;
import tn0.C26783d0;
import tn0.C26794h;
import tn0.C26810m0;
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes5.dex */
public final class Comment$$serializer implements InterfaceC26842x {
    public static final Comment$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Comment$$serializer comment$$serializer = new Comment$$serializer();
        INSTANCE = comment$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.model.Comment", comment$$serializer, 19);
        pluginGeneratedSerialDescriptor.m114047n("id", false);
        pluginGeneratedSerialDescriptor.m114047n("owner", false);
        pluginGeneratedSerialDescriptor.m114047n("sourceId", false);
        pluginGeneratedSerialDescriptor.m114047n("mention", true);
        pluginGeneratedSerialDescriptor.m114047n("content", true);
        pluginGeneratedSerialDescriptor.m114047n("message", true);
        pluginGeneratedSerialDescriptor.m114047n("isLiked", true);
        pluginGeneratedSerialDescriptor.m114047n("isLikedByAuthor", true);
        pluginGeneratedSerialDescriptor.m114047n("numOfLike", true);
        pluginGeneratedSerialDescriptor.m114047n("numOfReply", true);
        pluginGeneratedSerialDescriptor.m114047n("parentId", true);
        pluginGeneratedSerialDescriptor.m114047n("reply", true);
        pluginGeneratedSerialDescriptor.m114047n("replies", true);
        pluginGeneratedSerialDescriptor.m114047n("createdTime", true);
        pluginGeneratedSerialDescriptor.m114047n("reportURL", true);
        pluginGeneratedSerialDescriptor.m114047n("sendingStatus", true);
        pluginGeneratedSerialDescriptor.m114047n("btSheet", true);
        pluginGeneratedSerialDescriptor.m114047n("attachVideo", true);
        pluginGeneratedSerialDescriptor.m114047n("canPin", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Comment$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = Comment.f49783I;
        C26814n1 c26814n1 = C26814n1.f127034a;
        Comment$Identity$$serializer comment$Identity$$serializer = Comment$Identity$$serializer.INSTANCE;
        C26794h c26794h = C26794h.f127000a;
        C26810m0 c26810m0 = C26810m0.f127024a;
        Comment$$serializer comment$$serializer = INSTANCE;
        return new KSerializer[]{c26814n1, comment$Identity$$serializer, c26814n1, AbstractC25935a.m133630u(comment$Identity$$serializer), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), c26794h, c26794h, c26810m0, c26810m0, AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(comment$$serializer), AbstractC25935a.m133630u(Section.CREATOR.serializer(comment$$serializer)), c26810m0, AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(C26783d0.f126989a), AbstractC25935a.m133630u(kSerializerArr[16]), AbstractC25935a.m133630u(Video$$serializer.INSTANCE), AbstractC25935a.m133630u(c26794h)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x010d. Please report as an issue. */
    @Override // qn0.InterfaceC25386a
    public Comment deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        Comment.Identity identity;
        Boolean bool;
        String str;
        Integer num;
        String str2;
        String str3;
        int i11;
        Video video;
        List list;
        String str4;
        Section section;
        Comment comment;
        String str5;
        Comment.Identity identity2;
        String str6;
        boolean z11;
        boolean z12;
        long j11;
        long j12;
        long j13;
        Comment.Identity identity3;
        int i12;
        int i13;
        KSerializer[] kSerializerArr2;
        Comment.Identity identity4;
        Comment.Identity identity5;
        KSerializer[] kSerializerArr3;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        kSerializerArr = Comment.f49783I;
        if (mo113968b.mo114015q()) {
            String mo114014o = mo113968b.mo114014o(descriptor2, 0);
            Comment$Identity$$serializer comment$Identity$$serializer = Comment$Identity$$serializer.INSTANCE;
            Comment.Identity identity6 = (Comment.Identity) mo113968b.mo114012l(descriptor2, 1, comment$Identity$$serializer, null);
            String mo114014o2 = mo113968b.mo114014o(descriptor2, 2);
            Comment.Identity identity7 = (Comment.Identity) mo113968b.mo114018x(descriptor2, 3, comment$Identity$$serializer, null);
            C26814n1 c26814n1 = C26814n1.f127034a;
            String str7 = (String) mo113968b.mo114018x(descriptor2, 4, c26814n1, null);
            String str8 = (String) mo113968b.mo114018x(descriptor2, 5, c26814n1, null);
            boolean mo114004D = mo113968b.mo114004D(descriptor2, 6);
            boolean mo114004D2 = mo113968b.mo114004D(descriptor2, 7);
            long mo114010f = mo113968b.mo114010f(descriptor2, 8);
            long mo114010f2 = mo113968b.mo114010f(descriptor2, 9);
            String str9 = (String) mo113968b.mo114018x(descriptor2, 10, c26814n1, null);
            Comment$$serializer comment$$serializer = INSTANCE;
            Comment comment2 = (Comment) mo113968b.mo114018x(descriptor2, 11, comment$$serializer, null);
            Section section2 = (Section) mo113968b.mo114018x(descriptor2, 12, Section.CREATOR.serializer(comment$$serializer), null);
            long mo114010f3 = mo113968b.mo114010f(descriptor2, 13);
            String str10 = (String) mo113968b.mo114018x(descriptor2, 14, c26814n1, null);
            Integer num2 = (Integer) mo113968b.mo114018x(descriptor2, 15, C26783d0.f126989a, null);
            List list2 = (List) mo113968b.mo114018x(descriptor2, 16, kSerializerArr[16], null);
            Video video2 = (Video) mo113968b.mo114018x(descriptor2, 17, Video$$serializer.INSTANCE, null);
            bool = (Boolean) mo113968b.mo114018x(descriptor2, 18, C26794h.f127000a, null);
            num = num2;
            identity2 = identity7;
            str2 = str9;
            str3 = str7;
            str5 = mo114014o2;
            identity = identity6;
            str4 = str10;
            comment = comment2;
            z11 = mo114004D2;
            z12 = mo114004D;
            str = str8;
            video = video2;
            list = list2;
            section = section2;
            str6 = mo114014o;
            j11 = mo114010f;
            j12 = mo114010f2;
            j13 = mo114010f3;
            i11 = 524287;
        } else {
            Boolean bool2 = null;
            String str11 = null;
            Integer num3 = null;
            String str12 = null;
            String str13 = null;
            Comment.Identity identity8 = null;
            Comment.Identity identity9 = null;
            Video video3 = null;
            List list3 = null;
            String str14 = null;
            Section section3 = null;
            Comment comment3 = null;
            String str15 = null;
            long j14 = 0;
            long j15 = 0;
            long j16 = 0;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = true;
            String str16 = null;
            int i14 = 0;
            while (z15) {
                Comment.Identity identity10 = identity9;
                int mo114037p = mo113968b.mo114037p(descriptor2);
                switch (mo114037p) {
                    case -1:
                        identity9 = identity10;
                        identity8 = identity8;
                        kSerializerArr = kSerializerArr;
                        z15 = false;
                    case 0:
                        kSerializerArr2 = kSerializerArr;
                        identity4 = identity8;
                        identity5 = identity10;
                        str15 = mo113968b.mo114014o(descriptor2, 0);
                        i14 |= 1;
                        identity9 = identity5;
                        identity8 = identity4;
                        kSerializerArr = kSerializerArr2;
                    case 1:
                        kSerializerArr2 = kSerializerArr;
                        identity4 = identity8;
                        identity5 = (Comment.Identity) mo113968b.mo114012l(descriptor2, 1, Comment$Identity$$serializer.INSTANCE, identity10);
                        i14 |= 2;
                        identity9 = identity5;
                        identity8 = identity4;
                        kSerializerArr = kSerializerArr2;
                    case 2:
                        kSerializerArr3 = kSerializerArr;
                        str16 = mo113968b.mo114014o(descriptor2, 2);
                        i14 |= 4;
                        identity8 = identity8;
                        kSerializerArr = kSerializerArr3;
                        identity9 = identity10;
                    case 3:
                        kSerializerArr3 = kSerializerArr;
                        identity8 = (Comment.Identity) mo113968b.mo114018x(descriptor2, 3, Comment$Identity$$serializer.INSTANCE, identity8);
                        i14 |= 8;
                        kSerializerArr = kSerializerArr3;
                        identity9 = identity10;
                    case 4:
                        identity3 = identity8;
                        str13 = (String) mo113968b.mo114018x(descriptor2, 4, C26814n1.f127034a, str13);
                        i14 |= 16;
                        identity9 = identity10;
                        identity8 = identity3;
                    case 5:
                        identity3 = identity8;
                        str11 = (String) mo113968b.mo114018x(descriptor2, 5, C26814n1.f127034a, str11);
                        i14 |= 32;
                        identity9 = identity10;
                        identity8 = identity3;
                    case 6:
                        identity3 = identity8;
                        z14 = mo113968b.mo114004D(descriptor2, 6);
                        i14 |= 64;
                        identity9 = identity10;
                        identity8 = identity3;
                    case 7:
                        identity3 = identity8;
                        z13 = mo113968b.mo114004D(descriptor2, 7);
                        i14 |= 128;
                        identity9 = identity10;
                        identity8 = identity3;
                    case 8:
                        identity3 = identity8;
                        j14 = mo113968b.mo114010f(descriptor2, 8);
                        i14 |= 256;
                        identity9 = identity10;
                        identity8 = identity3;
                    case 9:
                        identity3 = identity8;
                        j15 = mo113968b.mo114010f(descriptor2, 9);
                        i14 |= 512;
                        identity9 = identity10;
                        identity8 = identity3;
                    case 10:
                        identity3 = identity8;
                        str12 = (String) mo113968b.mo114018x(descriptor2, 10, C26814n1.f127034a, str12);
                        i14 |= 1024;
                        identity9 = identity10;
                        identity8 = identity3;
                    case 11:
                        identity3 = identity8;
                        comment3 = (Comment) mo113968b.mo114018x(descriptor2, 11, INSTANCE, comment3);
                        i14 |= ZVideoUtilMetadata.FF_PROFILE_H264_INTRA;
                        identity9 = identity10;
                        identity8 = identity3;
                    case 12:
                        identity3 = identity8;
                        section3 = (Section) mo113968b.mo114018x(descriptor2, 12, Section.CREATOR.serializer(INSTANCE), section3);
                        i14 |= 4096;
                        identity9 = identity10;
                        identity8 = identity3;
                    case 13:
                        identity3 = identity8;
                        j16 = mo113968b.mo114010f(descriptor2, 13);
                        i14 |= 8192;
                        identity9 = identity10;
                        identity8 = identity3;
                    case 14:
                        identity3 = identity8;
                        str14 = (String) mo113968b.mo114018x(descriptor2, 14, C26814n1.f127034a, str14);
                        i14 |= 16384;
                        identity9 = identity10;
                        identity8 = identity3;
                    case 15:
                        identity3 = identity8;
                        num3 = (Integer) mo113968b.mo114018x(descriptor2, 15, C26783d0.f126989a, num3);
                        i12 = 32768;
                        i14 |= i12;
                        identity9 = identity10;
                        identity8 = identity3;
                    case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                        identity3 = identity8;
                        list3 = (List) mo113968b.mo114018x(descriptor2, 16, kSerializerArr[16], list3);
                        i12 = 65536;
                        i14 |= i12;
                        identity9 = identity10;
                        identity8 = identity3;
                    case 17:
                        identity3 = identity8;
                        video3 = (Video) mo113968b.mo114018x(descriptor2, 17, Video$$serializer.INSTANCE, video3);
                        i13 = 131072;
                        i14 |= i13;
                        identity9 = identity10;
                        identity8 = identity3;
                    case 18:
                        identity3 = identity8;
                        bool2 = (Boolean) mo113968b.mo114018x(descriptor2, 18, C26794h.f127000a, bool2);
                        i13 = 262144;
                        i14 |= i13;
                        identity9 = identity10;
                        identity8 = identity3;
                    default:
                        throw new UnknownFieldException(mo114037p);
                }
            }
            identity = identity9;
            bool = bool2;
            str = str11;
            num = num3;
            str2 = str12;
            str3 = str13;
            i11 = i14;
            video = video3;
            list = list3;
            str4 = str14;
            section = section3;
            comment = comment3;
            str5 = str16;
            identity2 = identity8;
            str6 = str15;
            z11 = z13;
            z12 = z14;
            j11 = j14;
            j12 = j15;
            j13 = j16;
        }
        mo113968b.mo114009c(descriptor2);
        return new Comment(i11, str6, identity, str5, identity2, str3, str, z12, z11, j11, j12, str2, comment, section, j13, str4, num, list, video, bool, (AbstractC26805k1) null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, Comment comment) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(comment, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        Comment.m50809W(comment, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
