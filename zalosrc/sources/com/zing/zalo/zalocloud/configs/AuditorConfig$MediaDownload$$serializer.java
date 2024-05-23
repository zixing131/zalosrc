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
public final class AuditorConfig$MediaDownload$$serializer implements InterfaceC26842x {
    public static final AuditorConfig$MediaDownload$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        AuditorConfig$MediaDownload$$serializer auditorConfig$MediaDownload$$serializer = new AuditorConfig$MediaDownload$$serializer();
        INSTANCE = auditorConfig$MediaDownload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.zalocloud.configs.AuditorConfig.MediaDownload", auditorConfig$MediaDownload$$serializer, 3);
        pluginGeneratedSerialDescriptor.m114047n("enable", true);
        pluginGeneratedSerialDescriptor.m114047n("max_file_size", true);
        pluginGeneratedSerialDescriptor.m114047n("sampling", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AuditorConfig$MediaDownload$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        return new KSerializer[]{C26783d0.f126989a, C26810m0.f127024a, AuditorConfig$MediaDownload$Sampling$$serializer.INSTANCE};
    }

    @Override // qn0.InterfaceC25386a
    public AuditorConfig.MediaDownload deserialize(Decoder decoder) {
        int i11;
        int i12;
        long j11;
        AuditorConfig.MediaDownload.Sampling sampling;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            int mo114011i = mo113968b.mo114011i(descriptor2, 0);
            long mo114010f = mo113968b.mo114010f(descriptor2, 1);
            i11 = mo114011i;
            sampling = (AuditorConfig.MediaDownload.Sampling) mo113968b.mo114012l(descriptor2, 2, AuditorConfig$MediaDownload$Sampling$$serializer.INSTANCE, null);
            j11 = mo114010f;
            i12 = 7;
        } else {
            long j12 = 0;
            AuditorConfig.MediaDownload.Sampling sampling2 = null;
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
                    j12 = mo113968b.mo114010f(descriptor2, 1);
                    i14 |= 2;
                } else {
                    if (mo114037p != 2) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    sampling2 = (AuditorConfig.MediaDownload.Sampling) mo113968b.mo114012l(descriptor2, 2, AuditorConfig$MediaDownload$Sampling$$serializer.INSTANCE, sampling2);
                    i14 |= 4;
                }
            }
            i11 = i13;
            i12 = i14;
            j11 = j12;
            sampling = sampling2;
        }
        mo113968b.mo114009c(descriptor2);
        return new AuditorConfig.MediaDownload(i12, i11, j11, sampling, (AbstractC26805k1) null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, AuditorConfig.MediaDownload mediaDownload) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(mediaDownload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        AuditorConfig.MediaDownload.m89755d(mediaDownload, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
