package com.zing.zalo.data.zalocloud.model.api;

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
import tn0.InterfaceC26842x;

/* loaded from: classes3.dex */
public final class CloudSettings$$serializer implements InterfaceC26842x {
    public static final CloudSettings$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        CloudSettings$$serializer cloudSettings$$serializer = new CloudSettings$$serializer();
        INSTANCE = cloudSettings$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.data.zalocloud.model.api.CloudSettings", cloudSettings$$serializer, 5);
        pluginGeneratedSerialDescriptor.m114047n("opt_in", false);
        pluginGeneratedSerialDescriptor.m114047n("cloud_media_file_size_limit", false);
        pluginGeneratedSerialDescriptor.m114047n("my_cloud_file_size_limit", false);
        pluginGeneratedSerialDescriptor.m114047n("enable_community", false);
        pluginGeneratedSerialDescriptor.m114047n("enable_offload", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CloudSettings$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26783d0 c26783d0 = C26783d0.f126989a;
        return new KSerializer[]{c26783d0, c26783d0, c26783d0, c26783d0, c26783d0};
    }

    @Override // qn0.InterfaceC25386a
    public CloudSettings deserialize(Decoder decoder) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            int mo114011i = mo113968b.mo114011i(descriptor2, 0);
            int mo114011i2 = mo113968b.mo114011i(descriptor2, 1);
            int mo114011i3 = mo113968b.mo114011i(descriptor2, 2);
            i11 = mo114011i;
            i12 = mo113968b.mo114011i(descriptor2, 3);
            i13 = mo113968b.mo114011i(descriptor2, 4);
            i14 = mo114011i3;
            i15 = mo114011i2;
            i16 = 31;
        } else {
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    i17 = mo113968b.mo114011i(descriptor2, 0);
                    i23 |= 1;
                } else if (mo114037p == 1) {
                    i22 = mo113968b.mo114011i(descriptor2, 1);
                    i23 |= 2;
                } else if (mo114037p == 2) {
                    i21 = mo113968b.mo114011i(descriptor2, 2);
                    i23 |= 4;
                } else if (mo114037p == 3) {
                    i18 = mo113968b.mo114011i(descriptor2, 3);
                    i23 |= 8;
                } else {
                    if (mo114037p != 4) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    i19 = mo113968b.mo114011i(descriptor2, 4);
                    i23 |= 16;
                }
            }
            i11 = i17;
            i12 = i18;
            i13 = i19;
            i14 = i21;
            i15 = i22;
            i16 = i23;
        }
        mo113968b.mo114009c(descriptor2);
        return new CloudSettings(i16, i11, i15, i14, i12, i13, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, CloudSettings cloudSettings) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(cloudSettings, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        CloudSettings.m41305j(cloudSettings, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
