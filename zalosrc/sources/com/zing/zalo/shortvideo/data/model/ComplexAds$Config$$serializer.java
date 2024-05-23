package com.zing.zalo.shortvideo.data.model;

import com.zing.zalo.shortvideo.data.model.ComplexAds;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.encoding.InterfaceC21886d;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import tn0.C26783d0;
import tn0.C26810m0;
import tn0.InterfaceC26842x;

/* loaded from: classes5.dex */
public final class ComplexAds$Config$$serializer implements InterfaceC26842x {
    public static final ComplexAds$Config$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ComplexAds$Config$$serializer complexAds$Config$$serializer = new ComplexAds$Config$$serializer();
        INSTANCE = complexAds$Config$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.model.ComplexAds.Config", complexAds$Config$$serializer, 5);
        pluginGeneratedSerialDescriptor.m114047n("minDistance", false);
        pluginGeneratedSerialDescriptor.m114047n("distanceForceShowAds", false);
        pluginGeneratedSerialDescriptor.m114047n("numVideosHappy", false);
        pluginGeneratedSerialDescriptor.m114047n("videoWatchTimeHappy", false);
        pluginGeneratedSerialDescriptor.m114047n("distanceRecheckAds", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ComplexAds$Config$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26783d0 c26783d0 = C26783d0.f126989a;
        return new KSerializer[]{c26783d0, c26783d0, c26783d0, C26810m0.f127024a, c26783d0};
    }

    @Override // qn0.InterfaceC25386a
    public ComplexAds.Config deserialize(Decoder decoder) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j11;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            int mo114011i = mo113968b.mo114011i(descriptor2, 0);
            int mo114011i2 = mo113968b.mo114011i(descriptor2, 1);
            int mo114011i3 = mo113968b.mo114011i(descriptor2, 2);
            long mo114010f = mo113968b.mo114010f(descriptor2, 3);
            i11 = mo114011i;
            i12 = mo113968b.mo114011i(descriptor2, 4);
            i14 = mo114011i3;
            i15 = mo114011i2;
            j11 = mo114010f;
            i13 = 31;
        } else {
            long j12 = 0;
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
                    i18 |= 1;
                } else if (mo114037p == 1) {
                    i21 = mo113968b.mo114011i(descriptor2, 1);
                    i18 |= 2;
                } else if (mo114037p == 2) {
                    i19 = mo113968b.mo114011i(descriptor2, 2);
                    i18 |= 4;
                } else if (mo114037p == 3) {
                    j12 = mo113968b.mo114010f(descriptor2, 3);
                    i18 |= 8;
                } else {
                    if (mo114037p != 4) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    i17 = mo113968b.mo114011i(descriptor2, 4);
                    i18 |= 16;
                }
            }
            i11 = i16;
            i12 = i17;
            i13 = i18;
            i14 = i19;
            i15 = i21;
            j11 = j12;
        }
        mo113968b.mo114009c(descriptor2);
        return new ComplexAds.Config(i13, i11, i15, i14, j11, i12, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, ComplexAds.Config config) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(config, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        ComplexAds.Config.m50880f(config, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
