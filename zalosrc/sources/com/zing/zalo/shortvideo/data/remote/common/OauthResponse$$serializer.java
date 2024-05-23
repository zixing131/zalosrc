package com.zing.zalo.shortvideo.data.remote.common;

import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.encoding.InterfaceC21886d;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import tn0.C26783d0;
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes5.dex */
public final class OauthResponse$$serializer implements InterfaceC26842x {
    public static final OauthResponse$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        OauthResponse$$serializer oauthResponse$$serializer = new OauthResponse$$serializer();
        INSTANCE = oauthResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.remote.common.OauthResponse", oauthResponse$$serializer, 3);
        pluginGeneratedSerialDescriptor.m114047n("error_code", false);
        pluginGeneratedSerialDescriptor.m114047n("error_message", false);
        pluginGeneratedSerialDescriptor.m114047n("data", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private OauthResponse$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        return new KSerializer[]{C26783d0.f126989a, C26814n1.f127034a, OauthToken$$serializer.INSTANCE};
    }

    @Override // qn0.InterfaceC25386a
    public OauthResponse deserialize(Decoder decoder) {
        int i11;
        int i12;
        String str;
        OauthToken oauthToken;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            int mo114011i = mo113968b.mo114011i(descriptor2, 0);
            String mo114014o = mo113968b.mo114014o(descriptor2, 1);
            i11 = mo114011i;
            oauthToken = (OauthToken) mo113968b.mo114012l(descriptor2, 2, OauthToken$$serializer.INSTANCE, null);
            str = mo114014o;
            i12 = 7;
        } else {
            String str2 = null;
            OauthToken oauthToken2 = null;
            int i13 = 0;
            int i14 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    i13 = mo113968b.mo114011i(descriptor2, 0);
                    i14 |= 1;
                } else if (mo114037p == 1) {
                    str2 = mo113968b.mo114014o(descriptor2, 1);
                    i14 |= 2;
                } else {
                    if (mo114037p != 2) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    oauthToken2 = (OauthToken) mo113968b.mo114012l(descriptor2, 2, OauthToken$$serializer.INSTANCE, oauthToken2);
                    i14 |= 4;
                }
            }
            i11 = i13;
            i12 = i14;
            str = str2;
            oauthToken = oauthToken2;
        }
        mo113968b.mo114009c(descriptor2);
        return new OauthResponse(i12, i11, str, oauthToken, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, OauthResponse oauthResponse) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(oauthResponse, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        OauthResponse.m51524b(oauthResponse, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
