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
public final class Element$$serializer implements InterfaceC26842x {
    public static final Element$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Element$$serializer element$$serializer = new Element$$serializer();
        INSTANCE = element$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.feed.formpostfeed.data.Element", element$$serializer, 2);
        pluginGeneratedSerialDescriptor.m114047n("display", true);
        pluginGeneratedSerialDescriptor.m114047n("size", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Element$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        return new KSerializer[]{Display$$serializer.INSTANCE, Size$$serializer.INSTANCE};
    }

    @Override // qn0.InterfaceC25386a
    public Element deserialize(Decoder decoder) {
        Display display;
        Size size;
        int i11;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            display = (Display) mo113968b.mo114012l(descriptor2, 0, Display$$serializer.INSTANCE, null);
            size = (Size) mo113968b.mo114012l(descriptor2, 1, Size$$serializer.INSTANCE, null);
            i11 = 3;
        } else {
            display = null;
            Size size2 = null;
            int i12 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    display = (Display) mo113968b.mo114012l(descriptor2, 0, Display$$serializer.INSTANCE, display);
                    i12 |= 1;
                } else {
                    if (mo114037p != 1) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    size2 = (Size) mo113968b.mo114012l(descriptor2, 1, Size$$serializer.INSTANCE, size2);
                    i12 |= 2;
                }
            }
            size = size2;
            i11 = i12;
        }
        mo113968b.mo114009c(descriptor2);
        return new Element(i11, display, size, (AbstractC26805k1) null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, Element element) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(element, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        Element.write$Self$app_release(element, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
