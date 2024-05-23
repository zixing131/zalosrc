package com.zing.zalo.shortvideo.p072ui.model;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
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
import tn0.InterfaceC26842x;

/* loaded from: classes5.dex */
public final class Action$$serializer implements InterfaceC26842x {
    public static final Action$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Action$$serializer action$$serializer = new Action$$serializer();
        INSTANCE = action$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.ui.model.Action", action$$serializer, 3);
        pluginGeneratedSerialDescriptor.m114047n(ZinstantMetaConstant.IMPRESSION_META_TYPE, false);
        pluginGeneratedSerialDescriptor.m114047n("banner", false);
        pluginGeneratedSerialDescriptor.m114047n("button", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Action$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        return new KSerializer[]{C26783d0.f126989a, AbstractC25935a.m133630u(Banner$$serializer.INSTANCE), AbstractC25935a.m133630u(Button$$serializer.INSTANCE)};
    }

    @Override // qn0.InterfaceC25386a
    public Action deserialize(Decoder decoder) {
        int i11;
        int i12;
        Banner banner;
        Button button;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            int mo114011i = mo113968b.mo114011i(descriptor2, 0);
            Banner banner2 = (Banner) mo113968b.mo114018x(descriptor2, 1, Banner$$serializer.INSTANCE, null);
            i11 = mo114011i;
            button = (Button) mo113968b.mo114018x(descriptor2, 2, Button$$serializer.INSTANCE, null);
            banner = banner2;
            i12 = 7;
        } else {
            Banner banner3 = null;
            Button button2 = null;
            int i13 = 0;
            int i14 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    i13 = mo113968b.mo114011i(descriptor2, 0);
                    i14 |= 1;
                } else if (mo114037p == 1) {
                    banner3 = (Banner) mo113968b.mo114018x(descriptor2, 1, Banner$$serializer.INSTANCE, banner3);
                    i14 |= 2;
                } else {
                    if (mo114037p != 2) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    button2 = (Button) mo113968b.mo114018x(descriptor2, 2, Button$$serializer.INSTANCE, button2);
                    i14 |= 4;
                }
            }
            i11 = i13;
            i12 = i14;
            banner = banner3;
            button = button2;
        }
        mo113968b.mo114009c(descriptor2);
        return new Action(i12, i11, banner, button, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, Action action) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(action, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        Action.m52773c(action, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
