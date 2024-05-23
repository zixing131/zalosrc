package com.zing.zalo.shortvideo.p072ui.model;

import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.encoding.InterfaceC21886d;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import tn0.C26794h;
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes5.dex */
public final class PersonalizeVideo$$serializer implements InterfaceC26842x {
    public static final PersonalizeVideo$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PersonalizeVideo$$serializer personalizeVideo$$serializer = new PersonalizeVideo$$serializer();
        INSTANCE = personalizeVideo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.ui.model.PersonalizeVideo", personalizeVideo$$serializer, 9);
        pluginGeneratedSerialDescriptor.m114047n("videoId", false);
        pluginGeneratedSerialDescriptor.m114047n("channelId", false);
        pluginGeneratedSerialDescriptor.m114047n("isLiked", true);
        pluginGeneratedSerialDescriptor.m114047n("isBookmarked", true);
        pluginGeneratedSerialDescriptor.m114047n("isFollowingChannel", true);
        pluginGeneratedSerialDescriptor.m114047n("userBlockedByOwner", true);
        pluginGeneratedSerialDescriptor.m114047n("channelBlockedByOwner", true);
        pluginGeneratedSerialDescriptor.m114047n("isShareSuggestion", true);
        pluginGeneratedSerialDescriptor.m114047n("isLikeSuggestion", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PersonalizeVideo$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26814n1 c26814n1 = C26814n1.f127034a;
        C26794h c26794h = C26794h.f127000a;
        return new KSerializer[]{c26814n1, c26814n1, c26794h, c26794h, c26794h, c26794h, c26794h, c26794h, c26794h};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0070. Please report as an issue. */
    @Override // qn0.InterfaceC25386a
    public PersonalizeVideo deserialize(Decoder decoder) {
        String str;
        int i11;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        String str2;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        int i12 = 0;
        if (mo113968b.mo114015q()) {
            String mo114014o = mo113968b.mo114014o(descriptor2, 0);
            String mo114014o2 = mo113968b.mo114014o(descriptor2, 1);
            boolean mo114004D = mo113968b.mo114004D(descriptor2, 2);
            boolean mo114004D2 = mo113968b.mo114004D(descriptor2, 3);
            boolean mo114004D3 = mo113968b.mo114004D(descriptor2, 4);
            boolean mo114004D4 = mo113968b.mo114004D(descriptor2, 5);
            boolean mo114004D5 = mo113968b.mo114004D(descriptor2, 6);
            str = mo114014o;
            z11 = mo113968b.mo114004D(descriptor2, 7);
            z12 = mo114004D5;
            z13 = mo114004D4;
            z14 = mo114004D2;
            z15 = mo113968b.mo114004D(descriptor2, 8);
            z16 = mo114004D3;
            z17 = mo114004D;
            str2 = mo114014o2;
            i11 = 511;
        } else {
            String str3 = null;
            String str4 = null;
            boolean z18 = false;
            boolean z19 = false;
            boolean z21 = false;
            boolean z22 = false;
            boolean z23 = false;
            boolean z24 = false;
            boolean z25 = false;
            boolean z26 = true;
            while (z26) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                switch (mo114037p) {
                    case -1:
                        z26 = false;
                    case 0:
                        i12 |= 1;
                        str3 = mo113968b.mo114014o(descriptor2, 0);
                    case 1:
                        str4 = mo113968b.mo114014o(descriptor2, 1);
                        i12 |= 2;
                    case 2:
                        z25 = mo113968b.mo114004D(descriptor2, 2);
                        i12 |= 4;
                    case 3:
                        z22 = mo113968b.mo114004D(descriptor2, 3);
                        i12 |= 8;
                    case 4:
                        z24 = mo113968b.mo114004D(descriptor2, 4);
                        i12 |= 16;
                    case 5:
                        z21 = mo113968b.mo114004D(descriptor2, 5);
                        i12 |= 32;
                    case 6:
                        z19 = mo113968b.mo114004D(descriptor2, 6);
                        i12 |= 64;
                    case 7:
                        z18 = mo113968b.mo114004D(descriptor2, 7);
                        i12 |= 128;
                    case 8:
                        z23 = mo113968b.mo114004D(descriptor2, 8);
                        i12 |= 256;
                    default:
                        throw new UnknownFieldException(mo114037p);
                }
            }
            str = str3;
            i11 = i12;
            z11 = z18;
            z12 = z19;
            z13 = z21;
            z14 = z22;
            z15 = z23;
            z16 = z24;
            z17 = z25;
            str2 = str4;
        }
        mo113968b.mo114009c(descriptor2);
        return new PersonalizeVideo(i11, str, str2, z17, z14, z16, z13, z12, z11, z15, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, PersonalizeVideo personalizeVideo) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(personalizeVideo, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        PersonalizeVideo.m52811j(personalizeVideo, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
