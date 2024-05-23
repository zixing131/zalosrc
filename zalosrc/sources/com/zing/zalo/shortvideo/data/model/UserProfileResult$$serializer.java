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
import tn0.InterfaceC26842x;

/* loaded from: classes5.dex */
public final class UserProfileResult$$serializer implements InterfaceC26842x {
    public static final UserProfileResult$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        UserProfileResult$$serializer userProfileResult$$serializer = new UserProfileResult$$serializer();
        INSTANCE = userProfileResult$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.model.UserProfileResult", userProfileResult$$serializer, 2);
        pluginGeneratedSerialDescriptor.m114047n("user", false);
        pluginGeneratedSerialDescriptor.m114047n("channel", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UserProfileResult$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        return new KSerializer[]{User$$serializer.INSTANCE, AbstractC25935a.m133630u(Channel$$serializer.INSTANCE)};
    }

    @Override // qn0.InterfaceC25386a
    public UserProfileResult deserialize(Decoder decoder) {
        User user;
        Channel channel;
        int i11;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            user = (User) mo113968b.mo114012l(descriptor2, 0, User$$serializer.INSTANCE, null);
            channel = (Channel) mo113968b.mo114018x(descriptor2, 1, Channel$$serializer.INSTANCE, null);
            i11 = 3;
        } else {
            user = null;
            Channel channel2 = null;
            int i12 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    user = (User) mo113968b.mo114012l(descriptor2, 0, User$$serializer.INSTANCE, user);
                    i12 |= 1;
                } else {
                    if (mo114037p != 1) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    channel2 = (Channel) mo113968b.mo114018x(descriptor2, 1, Channel$$serializer.INSTANCE, channel2);
                    i12 |= 2;
                }
            }
            channel = channel2;
            i11 = i12;
        }
        mo113968b.mo114009c(descriptor2);
        return new UserProfileResult(i11, user, channel, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, UserProfileResult userProfileResult) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(userProfileResult, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        UserProfileResult.m51256c(userProfileResult, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
