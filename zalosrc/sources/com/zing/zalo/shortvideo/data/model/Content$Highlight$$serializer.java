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
import tn0.C26783d0;
import tn0.C26814n1;
import tn0.C26839w;
import tn0.InterfaceC26842x;

/* loaded from: classes5.dex */
public final class Content$Highlight$$serializer implements InterfaceC26842x {
    public static final Content$Highlight$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Content$Highlight$$serializer content$Highlight$$serializer = new Content$Highlight$$serializer();
        INSTANCE = content$Highlight$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.model.Content.Highlight", content$Highlight$$serializer, 4);
        pluginGeneratedSerialDescriptor.m114047n("start", true);
        pluginGeneratedSerialDescriptor.m114047n("end", true);
        pluginGeneratedSerialDescriptor.m114047n("color", true);
        pluginGeneratedSerialDescriptor.m114047n("alpha", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Content$Highlight$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26783d0 c26783d0 = C26783d0.f126989a;
        return new KSerializer[]{AbstractC25935a.m133630u(c26783d0), AbstractC25935a.m133630u(c26783d0), AbstractC25935a.m133630u(C26814n1.f127034a), AbstractC25935a.m133630u(C26839w.f127098a)};
    }

    @Override // qn0.InterfaceC25386a
    public Content.Highlight deserialize(Decoder decoder) {
        int i11;
        Integer num;
        Integer num2;
        String str;
        Float f11;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        Integer num3 = null;
        if (mo113968b.mo114015q()) {
            C26783d0 c26783d0 = C26783d0.f126989a;
            Integer num4 = (Integer) mo113968b.mo114018x(descriptor2, 0, c26783d0, null);
            Integer num5 = (Integer) mo113968b.mo114018x(descriptor2, 1, c26783d0, null);
            String str2 = (String) mo113968b.mo114018x(descriptor2, 2, C26814n1.f127034a, null);
            num2 = num5;
            f11 = (Float) mo113968b.mo114018x(descriptor2, 3, C26839w.f127098a, null);
            str = str2;
            num = num4;
            i11 = 15;
        } else {
            Integer num6 = null;
            String str3 = null;
            Float f12 = null;
            int i12 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    num3 = (Integer) mo113968b.mo114018x(descriptor2, 0, C26783d0.f126989a, num3);
                    i12 |= 1;
                } else if (mo114037p == 1) {
                    num6 = (Integer) mo113968b.mo114018x(descriptor2, 1, C26783d0.f126989a, num6);
                    i12 |= 2;
                } else if (mo114037p == 2) {
                    str3 = (String) mo113968b.mo114018x(descriptor2, 2, C26814n1.f127034a, str3);
                    i12 |= 4;
                } else {
                    if (mo114037p != 3) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    f12 = (Float) mo113968b.mo114018x(descriptor2, 3, C26839w.f127098a, f12);
                    i12 |= 8;
                }
            }
            i11 = i12;
            num = num3;
            num2 = num6;
            str = str3;
            f11 = f12;
        }
        mo113968b.mo114009c(descriptor2);
        return new Content.Highlight(i11, num, num2, str, f11, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, Content.Highlight highlight) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(highlight, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        Content.Highlight.m50897e(highlight, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
