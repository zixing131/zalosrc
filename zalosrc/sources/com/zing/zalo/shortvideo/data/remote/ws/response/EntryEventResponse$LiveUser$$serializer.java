package com.zing.zalo.shortvideo.data.remote.ws.response;

import com.zing.zalo.shortvideo.data.remote.ws.response.EntryEventResponse;
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
import tn0.C26794h;
import tn0.C26810m0;
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes5.dex */
public final class EntryEventResponse$LiveUser$$serializer implements InterfaceC26842x {
    public static final EntryEventResponse$LiveUser$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        EntryEventResponse$LiveUser$$serializer entryEventResponse$LiveUser$$serializer = new EntryEventResponse$LiveUser$$serializer();
        INSTANCE = entryEventResponse$LiveUser$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.remote.ws.response.EntryEventResponse.LiveUser", entryEventResponse$LiveUser$$serializer, 4);
        pluginGeneratedSerialDescriptor.m114047n("userId", true);
        pluginGeneratedSerialDescriptor.m114047n("isEKYC", true);
        pluginGeneratedSerialDescriptor.m114047n("displayName", true);
        pluginGeneratedSerialDescriptor.m114047n("avatar", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EntryEventResponse$LiveUser$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26814n1 c26814n1 = C26814n1.f127034a;
        return new KSerializer[]{AbstractC25935a.m133630u(C26810m0.f127024a), AbstractC25935a.m133630u(C26794h.f127000a), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1)};
    }

    @Override // qn0.InterfaceC25386a
    public EntryEventResponse.LiveUser deserialize(Decoder decoder) {
        int i11;
        Long l11;
        Boolean bool;
        String str;
        String str2;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        Long l12 = null;
        if (mo113968b.mo114015q()) {
            Long l13 = (Long) mo113968b.mo114018x(descriptor2, 0, C26810m0.f127024a, null);
            Boolean bool2 = (Boolean) mo113968b.mo114018x(descriptor2, 1, C26794h.f127000a, null);
            C26814n1 c26814n1 = C26814n1.f127034a;
            String str3 = (String) mo113968b.mo114018x(descriptor2, 2, c26814n1, null);
            l11 = l13;
            str2 = (String) mo113968b.mo114018x(descriptor2, 3, c26814n1, null);
            str = str3;
            bool = bool2;
            i11 = 15;
        } else {
            Boolean bool3 = null;
            String str4 = null;
            String str5 = null;
            int i12 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    l12 = (Long) mo113968b.mo114018x(descriptor2, 0, C26810m0.f127024a, l12);
                    i12 |= 1;
                } else if (mo114037p == 1) {
                    bool3 = (Boolean) mo113968b.mo114018x(descriptor2, 1, C26794h.f127000a, bool3);
                    i12 |= 2;
                } else if (mo114037p == 2) {
                    str4 = (String) mo113968b.mo114018x(descriptor2, 2, C26814n1.f127034a, str4);
                    i12 |= 4;
                } else {
                    if (mo114037p != 3) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    str5 = (String) mo113968b.mo114018x(descriptor2, 3, C26814n1.f127034a, str5);
                    i12 |= 8;
                }
            }
            i11 = i12;
            l11 = l12;
            bool = bool3;
            str = str4;
            str2 = str5;
        }
        mo113968b.mo114009c(descriptor2);
        return new EntryEventResponse.LiveUser(i11, l11, bool, str, str2, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, EntryEventResponse.LiveUser liveUser) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(liveUser, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        EntryEventResponse.LiveUser.m51635a(liveUser, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
