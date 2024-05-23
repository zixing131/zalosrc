package com.zing.zalo.zalocloud.info;

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

/* loaded from: classes7.dex */
public final class SubStatus$$serializer implements InterfaceC26842x {
    public static final SubStatus$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SubStatus$$serializer subStatus$$serializer = new SubStatus$$serializer();
        INSTANCE = subStatus$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.zalocloud.info.SubStatus", subStatus$$serializer, 3);
        pluginGeneratedSerialDescriptor.m114047n("cloud_media", false);
        pluginGeneratedSerialDescriptor.m114047n("my_cloud", false);
        pluginGeneratedSerialDescriptor.m114047n("message_backup", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SubStatus$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26783d0 c26783d0 = C26783d0.f126989a;
        return new KSerializer[]{c26783d0, c26783d0, c26783d0};
    }

    @Override // qn0.InterfaceC25386a
    public SubStatus deserialize(Decoder decoder) {
        int i11;
        int i12;
        int i13;
        int i14;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            int mo114011i = mo113968b.mo114011i(descriptor2, 0);
            int mo114011i2 = mo113968b.mo114011i(descriptor2, 1);
            i11 = mo114011i;
            i12 = mo113968b.mo114011i(descriptor2, 2);
            i13 = mo114011i2;
            i14 = 7;
        } else {
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    i15 = mo113968b.mo114011i(descriptor2, 0);
                    i18 |= 1;
                } else if (mo114037p == 1) {
                    i17 = mo113968b.mo114011i(descriptor2, 1);
                    i18 |= 2;
                } else {
                    if (mo114037p != 2) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    i16 = mo113968b.mo114011i(descriptor2, 2);
                    i18 |= 4;
                }
            }
            i11 = i15;
            i12 = i16;
            i13 = i17;
            i14 = i18;
        }
        mo113968b.mo114009c(descriptor2);
        return new SubStatus(i14, i11, i13, i12, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, SubStatus subStatus) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(subStatus, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        SubStatus.m89823a(subStatus, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
