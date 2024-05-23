package com.zing.zalo.shortvideo.data.model;

import com.zing.zalo.shortvideo.data.model.Content;
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
public final class Content$$serializer implements InterfaceC26842x {
    public static final Content$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Content$$serializer content$$serializer = new Content$$serializer();
        INSTANCE = content$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.model.Content", content$$serializer, 2);
        pluginGeneratedSerialDescriptor.m114047n("msg", false);
        pluginGeneratedSerialDescriptor.m114047n("highlights", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Content$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = Content.f49823r;
        return new KSerializer[]{C26814n1.f127034a, AbstractC25935a.m133630u(kSerializerArr[1])};
    }

    @Override // qn0.InterfaceC25386a
    public Content deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        Content.Highlight[] highlightArr;
        String str;
        int i11;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        kSerializerArr = Content.f49823r;
        if (mo113968b.mo114015q()) {
            str = mo113968b.mo114014o(descriptor2, 0);
            highlightArr = (Content.Highlight[]) mo113968b.mo114018x(descriptor2, 1, kSerializerArr[1], null);
            i11 = 3;
        } else {
            Content.Highlight[] highlightArr2 = null;
            String str2 = null;
            int i12 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    str2 = mo113968b.mo114014o(descriptor2, 0);
                    i12 |= 1;
                } else {
                    if (mo114037p != 1) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    highlightArr2 = (Content.Highlight[]) mo113968b.mo114018x(descriptor2, 1, kSerializerArr[1], highlightArr2);
                    i12 |= 2;
                }
            }
            highlightArr = highlightArr2;
            str = str2;
            i11 = i12;
        }
        mo113968b.mo114009c(descriptor2);
        return new Content(i11, str, highlightArr, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, Content content) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(content, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        Content.m50894d(content, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
