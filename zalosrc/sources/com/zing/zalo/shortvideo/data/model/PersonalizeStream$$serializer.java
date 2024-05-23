package com.zing.zalo.shortvideo.data.model;

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
import tn0.C26783d0;
import tn0.C26794h;
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes5.dex */
public final class PersonalizeStream$$serializer implements InterfaceC26842x {
    public static final PersonalizeStream$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PersonalizeStream$$serializer personalizeStream$$serializer = new PersonalizeStream$$serializer();
        INSTANCE = personalizeStream$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.model.PersonalizeStream", personalizeStream$$serializer, 7);
        pluginGeneratedSerialDescriptor.m114047n("liveId", false);
        pluginGeneratedSerialDescriptor.m114047n("channelId", false);
        pluginGeneratedSerialDescriptor.m114047n("isFollowingChannel", true);
        pluginGeneratedSerialDescriptor.m114047n("isBlockedCmt", true);
        pluginGeneratedSerialDescriptor.m114047n("isBlockedLike", true);
        pluginGeneratedSerialDescriptor.m114047n("isLiked", true);
        pluginGeneratedSerialDescriptor.m114047n("status", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PersonalizeStream$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26814n1 c26814n1 = C26814n1.f127034a;
        C26794h c26794h = C26794h.f127000a;
        return new KSerializer[]{c26814n1, c26814n1, c26794h, c26794h, c26794h, c26794h, AbstractC25935a.m133630u(C26783d0.f126989a)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0061. Please report as an issue. */
    @Override // qn0.InterfaceC25386a
    public PersonalizeStream deserialize(Decoder decoder) {
        boolean z11;
        Integer num;
        boolean z12;
        boolean z13;
        boolean z14;
        int i11;
        String str;
        String str2;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            String mo114014o = mo113968b.mo114014o(descriptor2, 0);
            String mo114014o2 = mo113968b.mo114014o(descriptor2, 1);
            boolean mo114004D = mo113968b.mo114004D(descriptor2, 2);
            boolean mo114004D2 = mo113968b.mo114004D(descriptor2, 3);
            boolean mo114004D3 = mo113968b.mo114004D(descriptor2, 4);
            boolean mo114004D4 = mo113968b.mo114004D(descriptor2, 5);
            str = mo114014o;
            num = (Integer) mo113968b.mo114018x(descriptor2, 6, C26783d0.f126989a, null);
            z11 = mo114004D4;
            z12 = mo114004D2;
            z13 = mo114004D3;
            z14 = mo114004D;
            str2 = mo114014o2;
            i11 = 127;
        } else {
            Integer num2 = null;
            String str3 = null;
            String str4 = null;
            boolean z15 = false;
            boolean z16 = false;
            boolean z17 = false;
            boolean z18 = false;
            int i12 = 0;
            boolean z19 = true;
            while (z19) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                switch (mo114037p) {
                    case -1:
                        z19 = false;
                    case 0:
                        i12 |= 1;
                        str3 = mo113968b.mo114014o(descriptor2, 0);
                    case 1:
                        str4 = mo113968b.mo114014o(descriptor2, 1);
                        i12 |= 2;
                    case 2:
                        z18 = mo113968b.mo114004D(descriptor2, 2);
                        i12 |= 4;
                    case 3:
                        z16 = mo113968b.mo114004D(descriptor2, 3);
                        i12 |= 8;
                    case 4:
                        z17 = mo113968b.mo114004D(descriptor2, 4);
                        i12 |= 16;
                    case 5:
                        z15 = mo113968b.mo114004D(descriptor2, 5);
                        i12 |= 32;
                    case 6:
                        num2 = (Integer) mo113968b.mo114018x(descriptor2, 6, C26783d0.f126989a, num2);
                        i12 |= 64;
                    default:
                        throw new UnknownFieldException(mo114037p);
                }
            }
            z11 = z15;
            num = num2;
            z12 = z16;
            z13 = z17;
            z14 = z18;
            i11 = i12;
            str = str3;
            str2 = str4;
        }
        mo113968b.mo114009c(descriptor2);
        return new PersonalizeStream(i11, str, str2, z14, z12, z13, z11, num, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, PersonalizeStream personalizeStream) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(personalizeStream, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        PersonalizeStream.m51113g(personalizeStream, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
