package com.zing.zalo.data.backuprestore.model.media;

import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.encoding.InterfaceC21886d;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import tn0.C26810m0;
import tn0.InterfaceC26842x;

/* loaded from: classes3.dex */
public final class DriveStorageQuota$$serializer implements InterfaceC26842x {
    public static final DriveStorageQuota$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        DriveStorageQuota$$serializer driveStorageQuota$$serializer = new DriveStorageQuota$$serializer();
        INSTANCE = driveStorageQuota$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.data.backuprestore.model.media.DriveStorageQuota", driveStorageQuota$$serializer, 2);
        pluginGeneratedSerialDescriptor.m114047n("limit", false);
        pluginGeneratedSerialDescriptor.m114047n("usage", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DriveStorageQuota$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26810m0 c26810m0 = C26810m0.f127024a;
        return new KSerializer[]{c26810m0, c26810m0};
    }

    @Override // qn0.InterfaceC25386a
    public DriveStorageQuota deserialize(Decoder decoder) {
        int i11;
        long j11;
        long j12;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            long mo114010f = mo113968b.mo114010f(descriptor2, 0);
            j11 = mo113968b.mo114010f(descriptor2, 1);
            j12 = mo114010f;
            i11 = 3;
        } else {
            long j13 = 0;
            long j14 = 0;
            int i12 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    j14 = mo113968b.mo114010f(descriptor2, 0);
                    i12 |= 1;
                } else {
                    if (mo114037p != 1) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    j13 = mo113968b.mo114010f(descriptor2, 1);
                    i12 |= 2;
                }
            }
            i11 = i12;
            j11 = j13;
            j12 = j14;
        }
        mo113968b.mo114009c(descriptor2);
        return new DriveStorageQuota(i11, j12, j11, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, DriveStorageQuota driveStorageQuota) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(driveStorageQuota, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        DriveStorageQuota.m40987c(driveStorageQuota, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
