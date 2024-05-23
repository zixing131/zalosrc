package com.zing.zalo.shortvideo.data.model.config;

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
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes5.dex */
public final class ContentFeedback$$serializer implements InterfaceC26842x {
    public static final ContentFeedback$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ContentFeedback$$serializer contentFeedback$$serializer = new ContentFeedback$$serializer();
        INSTANCE = contentFeedback$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.model.config.ContentFeedback", contentFeedback$$serializer, 3);
        pluginGeneratedSerialDescriptor.m114047n("id", true);
        pluginGeneratedSerialDescriptor.m114047n("viText", true);
        pluginGeneratedSerialDescriptor.m114047n("enText", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ContentFeedback$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26814n1 c26814n1 = C26814n1.f127034a;
        return new KSerializer[]{AbstractC25935a.m133630u(C26783d0.f126989a), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1)};
    }

    @Override // qn0.InterfaceC25386a
    public ContentFeedback deserialize(Decoder decoder) {
        int i11;
        Integer num;
        String str;
        String str2;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        Integer num2 = null;
        if (mo113968b.mo114015q()) {
            Integer num3 = (Integer) mo113968b.mo114018x(descriptor2, 0, C26783d0.f126989a, null);
            C26814n1 c26814n1 = C26814n1.f127034a;
            String str3 = (String) mo113968b.mo114018x(descriptor2, 1, c26814n1, null);
            num = num3;
            str2 = (String) mo113968b.mo114018x(descriptor2, 2, c26814n1, null);
            str = str3;
            i11 = 7;
        } else {
            String str4 = null;
            String str5 = null;
            int i12 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    num2 = (Integer) mo113968b.mo114018x(descriptor2, 0, C26783d0.f126989a, num2);
                    i12 |= 1;
                } else if (mo114037p == 1) {
                    str4 = (String) mo113968b.mo114018x(descriptor2, 1, C26814n1.f127034a, str4);
                    i12 |= 2;
                } else {
                    if (mo114037p != 2) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    str5 = (String) mo113968b.mo114018x(descriptor2, 2, C26814n1.f127034a, str5);
                    i12 |= 4;
                }
            }
            i11 = i12;
            num = num2;
            str = str4;
            str2 = str5;
        }
        mo113968b.mo114009c(descriptor2);
        return new ContentFeedback(i11, num, str, str2, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, ContentFeedback contentFeedback) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(contentFeedback, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        ContentFeedback.m51433d(contentFeedback, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
