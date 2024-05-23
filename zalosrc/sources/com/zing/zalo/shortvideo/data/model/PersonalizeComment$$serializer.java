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
import tn0.C26794h;
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes5.dex */
public final class PersonalizeComment$$serializer implements InterfaceC26842x {
    public static final PersonalizeComment$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PersonalizeComment$$serializer personalizeComment$$serializer = new PersonalizeComment$$serializer();
        INSTANCE = personalizeComment$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.model.PersonalizeComment", personalizeComment$$serializer, 3);
        pluginGeneratedSerialDescriptor.m114047n("cmtId", false);
        pluginGeneratedSerialDescriptor.m114047n("isLiked", true);
        pluginGeneratedSerialDescriptor.m114047n("isBlock", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PersonalizeComment$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26794h c26794h = C26794h.f127000a;
        return new KSerializer[]{C26814n1.f127034a, c26794h, c26794h};
    }

    @Override // qn0.InterfaceC25386a
    public PersonalizeComment deserialize(Decoder decoder) {
        String str;
        boolean z11;
        boolean z12;
        int i11;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            String mo114014o = mo113968b.mo114014o(descriptor2, 0);
            boolean mo114004D = mo113968b.mo114004D(descriptor2, 1);
            str = mo114014o;
            z11 = mo113968b.mo114004D(descriptor2, 2);
            z12 = mo114004D;
            i11 = 7;
        } else {
            String str2 = null;
            boolean z13 = false;
            boolean z14 = false;
            int i12 = 0;
            boolean z15 = true;
            while (z15) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z15 = false;
                } else if (mo114037p == 0) {
                    str2 = mo113968b.mo114014o(descriptor2, 0);
                    i12 |= 1;
                } else if (mo114037p == 1) {
                    z14 = mo113968b.mo114004D(descriptor2, 1);
                    i12 |= 2;
                } else {
                    if (mo114037p != 2) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    z13 = mo113968b.mo114004D(descriptor2, 2);
                    i12 |= 4;
                }
            }
            str = str2;
            z11 = z13;
            z12 = z14;
            i11 = i12;
        }
        mo113968b.mo114009c(descriptor2);
        return new PersonalizeComment(i11, str, z12, z11, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, PersonalizeComment personalizeComment) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(personalizeComment, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        PersonalizeComment.m51107d(personalizeComment, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
