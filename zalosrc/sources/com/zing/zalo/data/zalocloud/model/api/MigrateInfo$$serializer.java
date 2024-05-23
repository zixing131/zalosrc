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
import tn0.C26810m0;
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes3.dex */
public final class MigrateInfo$$serializer implements InterfaceC26842x {
    public static final MigrateInfo$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        MigrateInfo$$serializer migrateInfo$$serializer = new MigrateInfo$$serializer();
        INSTANCE = migrateInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.data.zalocloud.model.api.MigrateInfo", migrateInfo$$serializer, 4);
        pluginGeneratedSerialDescriptor.m114047n("status", false);
        pluginGeneratedSerialDescriptor.m114047n("last_flow", false);
        pluginGeneratedSerialDescriptor.m114047n("device_name", false);
        pluginGeneratedSerialDescriptor.m114047n("last_update", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MigrateInfo$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26783d0 c26783d0 = C26783d0.f126989a;
        return new KSerializer[]{c26783d0, c26783d0, C26814n1.f127034a, C26810m0.f127024a};
    }

    @Override // qn0.InterfaceC25386a
    public MigrateInfo deserialize(Decoder decoder) {
        int i11;
        int i12;
        String str;
        int i13;
        long j11;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            int mo114011i = mo113968b.mo114011i(descriptor2, 0);
            int mo114011i2 = mo113968b.mo114011i(descriptor2, 1);
            i11 = mo114011i;
            str = mo113968b.mo114014o(descriptor2, 2);
            i13 = mo114011i2;
            j11 = mo113968b.mo114010f(descriptor2, 3);
            i12 = 15;
        } else {
            long j12 = 0;
            int i14 = 0;
            int i15 = 0;
            boolean z11 = true;
            String str2 = null;
            int i16 = 0;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    i16 = mo113968b.mo114011i(descriptor2, 0);
                    i14 |= 1;
                } else if (mo114037p == 1) {
                    i15 = mo113968b.mo114011i(descriptor2, 1);
                    i14 |= 2;
                } else if (mo114037p == 2) {
                    str2 = mo113968b.mo114014o(descriptor2, 2);
                    i14 |= 4;
                } else {
                    if (mo114037p != 3) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    j12 = mo113968b.mo114010f(descriptor2, 3);
                    i14 |= 8;
                }
            }
            i11 = i16;
            i12 = i14;
            str = str2;
            i13 = i15;
            j11 = j12;
        }
        mo113968b.mo114009c(descriptor2);
        return new MigrateInfo(i12, i11, i13, str, j11, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, MigrateInfo migrateInfo) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(migrateInfo, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        MigrateInfo.m41356a(migrateInfo, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
