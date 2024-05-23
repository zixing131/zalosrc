package com.zing.zalo.feed.formpostfeed.data;

import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.encoding.InterfaceC21886d;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import tn0.AbstractC26805k1;
import tn0.InterfaceC26842x;

/* loaded from: classes4.dex */
public final class Decorations$$serializer implements InterfaceC26842x {
    public static final Decorations$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Decorations$$serializer decorations$$serializer = new Decorations$$serializer();
        INSTANCE = decorations$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.feed.formpostfeed.data.Decorations", decorations$$serializer, 2);
        pluginGeneratedSerialDescriptor.m114047n("left", true);
        pluginGeneratedSerialDescriptor.m114047n("right", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Decorations$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        Element$$serializer element$$serializer = Element$$serializer.INSTANCE;
        return new KSerializer[]{element$$serializer, element$$serializer};
    }

    @Override // qn0.InterfaceC25386a
    public Decorations deserialize(Decoder decoder) {
        Element element;
        int i11;
        Element element2;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            Element$$serializer element$$serializer = Element$$serializer.INSTANCE;
            element2 = (Element) mo113968b.mo114012l(descriptor2, 0, element$$serializer, null);
            element = (Element) mo113968b.mo114012l(descriptor2, 1, element$$serializer, null);
            i11 = 3;
        } else {
            element = null;
            Element element3 = null;
            int i12 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    element3 = (Element) mo113968b.mo114012l(descriptor2, 0, Element$$serializer.INSTANCE, element3);
                    i12 |= 1;
                } else {
                    if (mo114037p != 1) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    element = (Element) mo113968b.mo114012l(descriptor2, 1, Element$$serializer.INSTANCE, element);
                    i12 |= 2;
                }
            }
            i11 = i12;
            element2 = element3;
        }
        mo113968b.mo114009c(descriptor2);
        return new Decorations(i11, element2, element, (AbstractC26805k1) null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, Decorations decorations) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(decorations, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        Decorations.write$Self$app_release(decorations, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
