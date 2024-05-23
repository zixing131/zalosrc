package com.zing.zalo.zalocloud.configs;

import com.zing.zalo.zalocloud.configs.AuditorConfig;
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
import tn0.C26810m0;
import tn0.InterfaceC26842x;

/* loaded from: classes7.dex */
public final class AuditorConfig$DataCorrection$$serializer implements InterfaceC26842x {
    public static final AuditorConfig$DataCorrection$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        AuditorConfig$DataCorrection$$serializer auditorConfig$DataCorrection$$serializer = new AuditorConfig$DataCorrection$$serializer();
        INSTANCE = auditorConfig$DataCorrection$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.zalocloud.configs.AuditorConfig.DataCorrection", auditorConfig$DataCorrection$$serializer, 2);
        pluginGeneratedSerialDescriptor.m114047n("enable", true);
        pluginGeneratedSerialDescriptor.m114047n("msg_delta_time", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AuditorConfig$DataCorrection$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        return new KSerializer[]{C26783d0.f126989a, C26810m0.f127024a};
    }

    @Override // qn0.InterfaceC25386a
    public AuditorConfig.DataCorrection deserialize(Decoder decoder) {
        int i11;
        long j11;
        int i12;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            i11 = mo113968b.mo114011i(descriptor2, 0);
            j11 = mo113968b.mo114010f(descriptor2, 1);
            i12 = 3;
        } else {
            long j12 = 0;
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
                } else {
                    if (mo114037p != 1) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    j12 = mo113968b.mo114010f(descriptor2, 1);
                    i14 |= 2;
                }
            }
            i11 = i13;
            j11 = j12;
            i12 = i14;
        }
        mo113968b.mo114009c(descriptor2);
        return new AuditorConfig.DataCorrection(i12, i11, j11, (AbstractC26805k1) null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, AuditorConfig.DataCorrection dataCorrection) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(dataCorrection, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        AuditorConfig.DataCorrection.m89752c(dataCorrection, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
