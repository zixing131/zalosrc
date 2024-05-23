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
import tn0.C26810m0;
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes7.dex */
public final class MigrationInfo$$serializer implements InterfaceC26842x {
    public static final MigrationInfo$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        MigrationInfo$$serializer migrationInfo$$serializer = new MigrationInfo$$serializer();
        INSTANCE = migrationInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.zalocloud.info.MigrationInfo", migrationInfo$$serializer, 5);
        pluginGeneratedSerialDescriptor.m114047n("status", false);
        pluginGeneratedSerialDescriptor.m114047n("sub_status", false);
        pluginGeneratedSerialDescriptor.m114047n("last_flow", false);
        pluginGeneratedSerialDescriptor.m114047n("device_name", false);
        pluginGeneratedSerialDescriptor.m114047n("last_update", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MigrationInfo$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26783d0 c26783d0 = C26783d0.f126989a;
        return new KSerializer[]{c26783d0, SubStatus$$serializer.INSTANCE, c26783d0, C26814n1.f127034a, C26810m0.f127024a};
    }

    @Override // qn0.InterfaceC25386a
    public MigrationInfo deserialize(Decoder decoder) {
        int i11;
        int i12;
        int i13;
        long j11;
        SubStatus subStatus;
        String str;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            int mo114011i = mo113968b.mo114011i(descriptor2, 0);
            SubStatus subStatus2 = (SubStatus) mo113968b.mo114012l(descriptor2, 1, SubStatus$$serializer.INSTANCE, null);
            int mo114011i2 = mo113968b.mo114011i(descriptor2, 2);
            i11 = mo114011i;
            str = mo113968b.mo114014o(descriptor2, 3);
            i13 = mo114011i2;
            subStatus = subStatus2;
            j11 = mo113968b.mo114010f(descriptor2, 4);
            i12 = 31;
        } else {
            SubStatus subStatus3 = null;
            String str2 = null;
            long j12 = 0;
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
                    i15 |= 1;
                } else if (mo114037p == 1) {
                    subStatus3 = (SubStatus) mo113968b.mo114012l(descriptor2, 1, SubStatus$$serializer.INSTANCE, subStatus3);
                    i15 |= 2;
                } else if (mo114037p == 2) {
                    i16 = mo113968b.mo114011i(descriptor2, 2);
                    i15 |= 4;
                } else if (mo114037p == 3) {
                    str2 = mo113968b.mo114014o(descriptor2, 3);
                    i15 |= 8;
                } else {
                    if (mo114037p != 4) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    j12 = mo113968b.mo114010f(descriptor2, 4);
                    i15 |= 16;
                }
            }
            i11 = i14;
            i12 = i15;
            i13 = i16;
            j11 = j12;
            subStatus = subStatus3;
            str = str2;
        }
        mo113968b.mo114009c(descriptor2);
        return new MigrationInfo(i12, i11, subStatus, i13, str, j11, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, MigrationInfo migrationInfo) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(migrationInfo, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        MigrationInfo.m89822a(migrationInfo, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
