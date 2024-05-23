package com.zing.zalo.shortvideo.data.remote.common;

import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.Channel$$serializer;
import com.zing.zalo.shortvideo.data.model.User;
import com.zing.zalo.shortvideo.data.model.User$$serializer;
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
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes5.dex */
public final class AuthInfo$$serializer implements InterfaceC26842x {
    public static final AuthInfo$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        AuthInfo$$serializer authInfo$$serializer = new AuthInfo$$serializer();
        INSTANCE = authInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.remote.common.AuthInfo", authInfo$$serializer, 3);
        pluginGeneratedSerialDescriptor.m114047n("session", false);
        pluginGeneratedSerialDescriptor.m114047n("user", false);
        pluginGeneratedSerialDescriptor.m114047n("channel", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AuthInfo$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        return new KSerializer[]{C26814n1.f127034a, User$$serializer.INSTANCE, AbstractC25935a.m133630u(Channel$$serializer.INSTANCE)};
    }

    @Override // qn0.InterfaceC25386a
    public AuthInfo deserialize(Decoder decoder) {
        int i11;
        String str;
        User user;
        Channel channel;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        String str2 = null;
        if (mo113968b.mo114015q()) {
            String mo114014o = mo113968b.mo114014o(descriptor2, 0);
            User user2 = (User) mo113968b.mo114012l(descriptor2, 1, User$$serializer.INSTANCE, null);
            str = mo114014o;
            channel = (Channel) mo113968b.mo114018x(descriptor2, 2, Channel$$serializer.INSTANCE, null);
            user = user2;
            i11 = 7;
        } else {
            User user3 = null;
            Channel channel2 = null;
            int i12 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    str2 = mo113968b.mo114014o(descriptor2, 0);
                    i12 |= 1;
                } else if (mo114037p == 1) {
                    user3 = (User) mo113968b.mo114012l(descriptor2, 1, User$$serializer.INSTANCE, user3);
                    i12 |= 2;
                } else {
                    if (mo114037p != 2) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    channel2 = (Channel) mo113968b.mo114018x(descriptor2, 2, Channel$$serializer.INSTANCE, channel2);
                    i12 |= 4;
                }
            }
            i11 = i12;
            str = str2;
            user = user3;
            channel = channel2;
        }
        mo113968b.mo114009c(descriptor2);
        return new AuthInfo(i11, str, user, channel, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, AuthInfo authInfo) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(authInfo, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        AuthInfo.m51518d(authInfo, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
