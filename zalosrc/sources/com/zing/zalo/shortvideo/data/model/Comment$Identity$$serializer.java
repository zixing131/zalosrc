package com.zing.zalo.shortvideo.data.model;

import com.zing.zalo.shortvideo.data.model.Comment;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
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
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes5.dex */
public final class Comment$Identity$$serializer implements InterfaceC26842x {
    public static final Comment$Identity$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Comment$Identity$$serializer comment$Identity$$serializer = new Comment$Identity$$serializer();
        INSTANCE = comment$Identity$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.model.Comment.Identity", comment$Identity$$serializer, 9);
        pluginGeneratedSerialDescriptor.m114047n("id", false);
        pluginGeneratedSerialDescriptor.m114047n(ZinstantMetaConstant.IMPRESSION_META_TYPE, false);
        pluginGeneratedSerialDescriptor.m114047n("name", true);
        pluginGeneratedSerialDescriptor.m114047n("avatar", true);
        pluginGeneratedSerialDescriptor.m114047n("verifiedTitle", true);
        pluginGeneratedSerialDescriptor.m114047n("verifiedColor", true);
        pluginGeneratedSerialDescriptor.m114047n("verifiedIcon", true);
        pluginGeneratedSerialDescriptor.m114047n("verifiedLink", true);
        pluginGeneratedSerialDescriptor.m114047n("isBlocked", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Comment$Identity$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26814n1 c26814n1 = C26814n1.f127034a;
        return new KSerializer[]{c26814n1, C26783d0.f126989a, AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), C26794h.f127000a};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x007c. Please report as an issue. */
    @Override // qn0.InterfaceC25386a
    public Comment.Identity deserialize(Decoder decoder) {
        boolean z11;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i11;
        int i12;
        String str6;
        String str7;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        int i13 = 7;
        if (mo113968b.mo114015q()) {
            String mo114014o = mo113968b.mo114014o(descriptor2, 0);
            int mo114011i = mo113968b.mo114011i(descriptor2, 1);
            C26814n1 c26814n1 = C26814n1.f127034a;
            String str8 = (String) mo113968b.mo114018x(descriptor2, 2, c26814n1, null);
            String str9 = (String) mo113968b.mo114018x(descriptor2, 3, c26814n1, null);
            String str10 = (String) mo113968b.mo114018x(descriptor2, 4, c26814n1, null);
            String str11 = (String) mo113968b.mo114018x(descriptor2, 5, c26814n1, null);
            String str12 = (String) mo113968b.mo114018x(descriptor2, 6, c26814n1, null);
            str6 = mo114014o;
            str2 = (String) mo113968b.mo114018x(descriptor2, 7, c26814n1, null);
            str = str12;
            str3 = str11;
            str5 = str9;
            z11 = mo113968b.mo114004D(descriptor2, 8);
            str4 = str10;
            str7 = str8;
            i11 = mo114011i;
            i12 = 511;
        } else {
            String str13 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            boolean z12 = false;
            int i14 = 0;
            int i15 = 0;
            boolean z13 = true;
            while (z13) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                switch (mo114037p) {
                    case -1:
                        z13 = false;
                    case 0:
                        i15 |= 1;
                        str18 = mo113968b.mo114014o(descriptor2, 0);
                        i13 = 7;
                    case 1:
                        i14 = mo113968b.mo114011i(descriptor2, 1);
                        i15 |= 2;
                        i13 = 7;
                    case 2:
                        str19 = (String) mo113968b.mo114018x(descriptor2, 2, C26814n1.f127034a, str19);
                        i15 |= 4;
                        i13 = 7;
                    case 3:
                        str17 = (String) mo113968b.mo114018x(descriptor2, 3, C26814n1.f127034a, str17);
                        i15 |= 8;
                        i13 = 7;
                    case 4:
                        str16 = (String) mo113968b.mo114018x(descriptor2, 4, C26814n1.f127034a, str16);
                        i15 |= 16;
                        i13 = 7;
                    case 5:
                        str15 = (String) mo113968b.mo114018x(descriptor2, 5, C26814n1.f127034a, str15);
                        i15 |= 32;
                        i13 = 7;
                    case 6:
                        str13 = (String) mo113968b.mo114018x(descriptor2, 6, C26814n1.f127034a, str13);
                        i15 |= 64;
                    case 7:
                        str14 = (String) mo113968b.mo114018x(descriptor2, i13, C26814n1.f127034a, str14);
                        i15 |= 128;
                    case 8:
                        z12 = mo113968b.mo114004D(descriptor2, 8);
                        i15 |= 256;
                    default:
                        throw new UnknownFieldException(mo114037p);
                }
            }
            z11 = z12;
            str = str13;
            str2 = str14;
            str3 = str15;
            str4 = str16;
            str5 = str17;
            i11 = i14;
            i12 = i15;
            str6 = str18;
            str7 = str19;
        }
        mo113968b.mo114009c(descriptor2);
        return new Comment.Identity(i12, str6, i11, str7, str5, str4, str3, str, str2, z11, (AbstractC26805k1) null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, Comment.Identity identity) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(identity, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        Comment.Identity.m50851t(identity, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
