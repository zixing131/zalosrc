package com.zing.zalo.feed.mvp.profile.model;

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
import tn0.InterfaceC26842x;

/* loaded from: classes4.dex */
public final class SmartCropInfo$$serializer implements InterfaceC26842x {
    public static final SmartCropInfo$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SmartCropInfo$$serializer smartCropInfo$$serializer = new SmartCropInfo$$serializer();
        INSTANCE = smartCropInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.feed.mvp.profile.model.SmartCropInfo", smartCropInfo$$serializer, 4);
        pluginGeneratedSerialDescriptor.m114047n("x", true);
        pluginGeneratedSerialDescriptor.m114047n("y", true);
        pluginGeneratedSerialDescriptor.m114047n("width", true);
        pluginGeneratedSerialDescriptor.m114047n("height", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SmartCropInfo$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26783d0 c26783d0 = C26783d0.f126989a;
        return new KSerializer[]{c26783d0, c26783d0, c26783d0, c26783d0};
    }

    @Override // qn0.InterfaceC25386a
    public SmartCropInfo deserialize(Decoder decoder) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            int mo114011i = mo113968b.mo114011i(descriptor2, 0);
            int mo114011i2 = mo113968b.mo114011i(descriptor2, 1);
            int mo114011i3 = mo113968b.mo114011i(descriptor2, 2);
            i11 = mo114011i;
            i12 = mo113968b.mo114011i(descriptor2, 3);
            i13 = mo114011i3;
            i14 = mo114011i2;
            i15 = 15;
        } else {
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i21 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    i16 = mo113968b.mo114011i(descriptor2, 0);
                    i21 |= 1;
                } else if (mo114037p == 1) {
                    i19 = mo113968b.mo114011i(descriptor2, 1);
                    i21 |= 2;
                } else if (mo114037p == 2) {
                    i18 = mo113968b.mo114011i(descriptor2, 2);
                    i21 |= 4;
                } else {
                    if (mo114037p != 3) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    i17 = mo113968b.mo114011i(descriptor2, 3);
                    i21 |= 8;
                }
            }
            i11 = i16;
            i12 = i17;
            i13 = i18;
            i14 = i19;
            i15 = i21;
        }
        mo113968b.mo114009c(descriptor2);
        return new SmartCropInfo(i15, i11, i14, i13, i12, (AbstractC26805k1) null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, SmartCropInfo smartCropInfo) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(smartCropInfo, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        SmartCropInfo.write$Self$app_release(smartCropInfo, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
