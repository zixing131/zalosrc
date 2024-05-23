package com.zing.zalo.feed.mvp.profile.model.theme;

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
import tn0.C26783d0;
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes4.dex */
public final class DecorItemImpl$$serializer implements InterfaceC26842x {
    public static final DecorItemImpl$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        DecorItemImpl$$serializer decorItemImpl$$serializer = new DecorItemImpl$$serializer();
        INSTANCE = decorItemImpl$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.feed.mvp.profile.model.theme.DecorItemImpl", decorItemImpl$$serializer, 3);
        pluginGeneratedSerialDescriptor.m114047n("bg_color", true);
        pluginGeneratedSerialDescriptor.m114047n("bg_stroke_color", true);
        pluginGeneratedSerialDescriptor.m114047n("image_url", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DecorItemImpl$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26783d0 c26783d0 = C26783d0.f126989a;
        return new KSerializer[]{c26783d0, c26783d0, C26814n1.f127034a};
    }

    @Override // qn0.InterfaceC25386a
    public DecorItemImpl deserialize(Decoder decoder) {
        int i11;
        String str;
        int i12;
        int i13;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            int mo114011i = mo113968b.mo114011i(descriptor2, 0);
            int mo114011i2 = mo113968b.mo114011i(descriptor2, 1);
            i11 = mo114011i;
            str = mo113968b.mo114014o(descriptor2, 2);
            i12 = mo114011i2;
            i13 = 7;
        } else {
            String str2 = null;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    i14 = mo113968b.mo114011i(descriptor2, 0);
                    i16 |= 1;
                } else if (mo114037p == 1) {
                    i15 = mo113968b.mo114011i(descriptor2, 1);
                    i16 |= 2;
                } else {
                    if (mo114037p != 2) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    str2 = mo113968b.mo114014o(descriptor2, 2);
                    i16 |= 4;
                }
            }
            i11 = i14;
            str = str2;
            i12 = i15;
            i13 = i16;
        }
        mo113968b.mo114009c(descriptor2);
        return new DecorItemImpl(i13, i11, i12, str, (AbstractC26805k1) null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, DecorItemImpl decorItemImpl) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(decorItemImpl, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        DecorItemImpl.write$Self$app_release(decorItemImpl, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
