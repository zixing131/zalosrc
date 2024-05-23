package com.zing.zalo.shortvideo.data.remote.ws.response;

import com.zing.zalo.shortvideo.data.model.Content;
import com.zing.zalo.shortvideo.data.model.Content$$serializer;
import com.zing.zalo.shortvideo.data.remote.ws.response.InteractEventResponse;
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
import tn0.C26810m0;
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes5.dex */
public final class InteractEventResponse$InteractItem$$serializer implements InterfaceC26842x {
    public static final InteractEventResponse$InteractItem$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        InteractEventResponse$InteractItem$$serializer interactEventResponse$InteractItem$$serializer = new InteractEventResponse$InteractItem$$serializer();
        INSTANCE = interactEventResponse$InteractItem$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.remote.ws.response.InteractEventResponse.InteractItem", interactEventResponse$InteractItem$$serializer, 3);
        pluginGeneratedSerialDescriptor.m114047n("id", true);
        pluginGeneratedSerialDescriptor.m114047n("icon", true);
        pluginGeneratedSerialDescriptor.m114047n("content", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private InteractEventResponse$InteractItem$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        return new KSerializer[]{AbstractC25935a.m133630u(C26810m0.f127024a), AbstractC25935a.m133630u(C26814n1.f127034a), AbstractC25935a.m133630u(Content$$serializer.INSTANCE)};
    }

    @Override // qn0.InterfaceC25386a
    public InteractEventResponse.InteractItem deserialize(Decoder decoder) {
        int i11;
        Long l11;
        String str;
        Content content;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        Long l12 = null;
        if (mo113968b.mo114015q()) {
            Long l13 = (Long) mo113968b.mo114018x(descriptor2, 0, C26810m0.f127024a, null);
            String str2 = (String) mo113968b.mo114018x(descriptor2, 1, C26814n1.f127034a, null);
            l11 = l13;
            content = (Content) mo113968b.mo114018x(descriptor2, 2, Content$$serializer.INSTANCE, null);
            str = str2;
            i11 = 7;
        } else {
            String str3 = null;
            Content content2 = null;
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
                    str3 = (String) mo113968b.mo114018x(descriptor2, 1, C26814n1.f127034a, str3);
                    i12 |= 2;
                } else {
                    if (mo114037p != 2) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    content2 = (Content) mo113968b.mo114018x(descriptor2, 2, Content$$serializer.INSTANCE, content2);
                    i12 |= 4;
                }
            }
            i11 = i12;
            l11 = l12;
            str = str3;
            content = content2;
        }
        mo113968b.mo114009c(descriptor2);
        return new InteractEventResponse.InteractItem(i11, l11, str, content, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, InteractEventResponse.InteractItem interactItem) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(interactItem, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        InteractEventResponse.InteractItem.m51666d(interactItem, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
