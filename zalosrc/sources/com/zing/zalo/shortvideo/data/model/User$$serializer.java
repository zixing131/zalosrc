package com.zing.zalo.shortvideo.data.model;

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
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes5.dex */
public final class User$$serializer implements InterfaceC26842x {
    public static final User$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        User$$serializer user$$serializer = new User$$serializer();
        INSTANCE = user$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.model.User", user$$serializer, 19);
        pluginGeneratedSerialDescriptor.m114047n("id", false);
        pluginGeneratedSerialDescriptor.m114047n("encodedId", false);
        pluginGeneratedSerialDescriptor.m114047n("name", false);
        pluginGeneratedSerialDescriptor.m114047n("avatar", false);
        pluginGeneratedSerialDescriptor.m114047n("registerUrl", true);
        pluginGeneratedSerialDescriptor.m114047n("tncUrl", true);
        pluginGeneratedSerialDescriptor.m114047n("privacyUrl", true);
        pluginGeneratedSerialDescriptor.m114047n("shouldShowFriendTab", true);
        pluginGeneratedSerialDescriptor.m114047n("isAllowShareMessage", true);
        pluginGeneratedSerialDescriptor.m114047n("isAllowShareTimeline", true);
        pluginGeneratedSerialDescriptor.m114047n("isAllowShareLink", true);
        pluginGeneratedSerialDescriptor.m114047n("isAllowShareOther", true);
        pluginGeneratedSerialDescriptor.m114047n("isAllowLike", true);
        pluginGeneratedSerialDescriptor.m114047n("isAllowComment", true);
        pluginGeneratedSerialDescriptor.m114047n("hasDirectShareAction", true);
        pluginGeneratedSerialDescriptor.m114047n("segment", true);
        pluginGeneratedSerialDescriptor.m114047n("isEKYC", true);
        pluginGeneratedSerialDescriptor.m114047n("btSheet", true);
        pluginGeneratedSerialDescriptor.m114047n("descriptionAction", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private User$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = User.f49986I;
        C26814n1 c26814n1 = C26814n1.f127034a;
        C26794h c26794h = C26794h.f127000a;
        return new KSerializer[]{c26814n1, c26814n1, c26814n1, c26814n1, AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), c26794h, c26794h, c26794h, c26794h, c26794h, c26794h, c26794h, c26794h, AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26794h), AbstractC25935a.m133630u(kSerializerArr[17]), AbstractC25935a.m133630u(C26783d0.f126989a)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x00fe. Please report as an issue. */
    @Override // qn0.InterfaceC25386a
    public User deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i11;
        String str;
        String str2;
        String str3;
        boolean z11;
        boolean z12;
        Integer num;
        List list;
        Boolean bool;
        String str4;
        boolean z13;
        boolean z14;
        String str5;
        String str6;
        String str7;
        String str8;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        int i12;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        kSerializerArr = User.f49986I;
        int i13 = 10;
        if (mo113968b.mo114015q()) {
            String mo114014o = mo113968b.mo114014o(descriptor2, 0);
            String mo114014o2 = mo113968b.mo114014o(descriptor2, 1);
            String mo114014o3 = mo113968b.mo114014o(descriptor2, 2);
            String mo114014o4 = mo113968b.mo114014o(descriptor2, 3);
            C26814n1 c26814n1 = C26814n1.f127034a;
            String str9 = (String) mo113968b.mo114018x(descriptor2, 4, c26814n1, null);
            String str10 = (String) mo113968b.mo114018x(descriptor2, 5, c26814n1, null);
            String str11 = (String) mo113968b.mo114018x(descriptor2, 6, c26814n1, null);
            boolean mo114004D = mo113968b.mo114004D(descriptor2, 7);
            boolean mo114004D2 = mo113968b.mo114004D(descriptor2, 8);
            boolean mo114004D3 = mo113968b.mo114004D(descriptor2, 9);
            boolean mo114004D4 = mo113968b.mo114004D(descriptor2, 10);
            boolean mo114004D5 = mo113968b.mo114004D(descriptor2, 11);
            boolean mo114004D6 = mo113968b.mo114004D(descriptor2, 12);
            boolean mo114004D7 = mo113968b.mo114004D(descriptor2, 13);
            boolean mo114004D8 = mo113968b.mo114004D(descriptor2, 14);
            String str12 = (String) mo113968b.mo114018x(descriptor2, 15, c26814n1, null);
            Boolean bool2 = (Boolean) mo113968b.mo114018x(descriptor2, 16, C26794h.f127000a, null);
            List list2 = (List) mo113968b.mo114018x(descriptor2, 17, kSerializerArr[17], null);
            num = (Integer) mo113968b.mo114018x(descriptor2, 18, C26783d0.f126989a, null);
            bool = bool2;
            z14 = mo114004D2;
            str3 = str9;
            str7 = mo114014o3;
            str6 = mo114014o2;
            z15 = mo114004D5;
            z16 = mo114004D4;
            z17 = mo114004D3;
            z18 = mo114004D;
            str4 = str11;
            str2 = str10;
            list = list2;
            str8 = mo114014o4;
            z13 = mo114004D8;
            z12 = mo114004D7;
            z11 = mo114004D6;
            str5 = mo114014o;
            str = str12;
            i11 = 524287;
        } else {
            int i14 = 0;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            Integer num2 = null;
            List list3 = null;
            Boolean bool3 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            boolean z19 = false;
            boolean z21 = false;
            boolean z22 = false;
            boolean z23 = false;
            boolean z24 = false;
            boolean z25 = false;
            boolean z26 = false;
            boolean z27 = false;
            boolean z28 = true;
            while (z28) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                switch (mo114037p) {
                    case -1:
                        z28 = false;
                    case 0:
                        str17 = mo113968b.mo114014o(descriptor2, 0);
                        i14 |= 1;
                        i13 = 10;
                    case 1:
                        str18 = mo113968b.mo114014o(descriptor2, 1);
                        i14 |= 2;
                        i13 = 10;
                    case 2:
                        str19 = mo113968b.mo114014o(descriptor2, 2);
                        i14 |= 4;
                        i13 = 10;
                    case 3:
                        str20 = mo113968b.mo114014o(descriptor2, 3);
                        i14 |= 8;
                        i13 = 10;
                    case 4:
                        str15 = (String) mo113968b.mo114018x(descriptor2, 4, C26814n1.f127034a, str15);
                        i14 |= 16;
                        i13 = 10;
                    case 5:
                        str14 = (String) mo113968b.mo114018x(descriptor2, 5, C26814n1.f127034a, str14);
                        i14 |= 32;
                        i13 = 10;
                    case 6:
                        str16 = (String) mo113968b.mo114018x(descriptor2, 6, C26814n1.f127034a, str16);
                        i14 |= 64;
                        i13 = 10;
                    case 7:
                        z27 = mo113968b.mo114004D(descriptor2, 7);
                        i14 |= 128;
                    case 8:
                        z23 = mo113968b.mo114004D(descriptor2, 8);
                        i14 |= 256;
                    case 9:
                        z26 = mo113968b.mo114004D(descriptor2, 9);
                        i14 |= 512;
                    case 10:
                        z25 = mo113968b.mo114004D(descriptor2, i13);
                        i14 |= 1024;
                    case 11:
                        z24 = mo113968b.mo114004D(descriptor2, 11);
                        i14 |= ZVideoUtilMetadata.FF_PROFILE_H264_INTRA;
                    case 12:
                        i14 |= 4096;
                        z19 = mo113968b.mo114004D(descriptor2, 12);
                    case 13:
                        i14 |= 8192;
                        z21 = mo113968b.mo114004D(descriptor2, 13);
                    case 14:
                        z22 = mo113968b.mo114004D(descriptor2, 14);
                        i14 |= 16384;
                    case 15:
                        str13 = (String) mo113968b.mo114018x(descriptor2, 15, C26814n1.f127034a, str13);
                        i12 = 32768;
                        i14 |= i12;
                    case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                        bool3 = (Boolean) mo113968b.mo114018x(descriptor2, 16, C26794h.f127000a, bool3);
                        i12 = 65536;
                        i14 |= i12;
                    case 17:
                        list3 = (List) mo113968b.mo114018x(descriptor2, 17, kSerializerArr[17], list3);
                        i12 = 131072;
                        i14 |= i12;
                    case 18:
                        num2 = (Integer) mo113968b.mo114018x(descriptor2, 18, C26783d0.f126989a, num2);
                        i14 |= 262144;
                    default:
                        throw new UnknownFieldException(mo114037p);
                }
            }
            i11 = i14;
            str = str13;
            str2 = str14;
            str3 = str15;
            z11 = z19;
            z12 = z21;
            num = num2;
            list = list3;
            bool = bool3;
            str4 = str16;
            z13 = z22;
            z14 = z23;
            str5 = str17;
            str6 = str18;
            str7 = str19;
            str8 = str20;
            z15 = z24;
            z16 = z25;
            z17 = z26;
            z18 = z27;
        }
        mo113968b.mo114009c(descriptor2);
        return new User(i11, str5, str6, str7, str8, str3, str2, str4, z18, z14, z17, z16, z15, z11, z12, z13, str, bool, list, num, (AbstractC26805k1) null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, User user) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(user, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        User.m51220K(user, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
