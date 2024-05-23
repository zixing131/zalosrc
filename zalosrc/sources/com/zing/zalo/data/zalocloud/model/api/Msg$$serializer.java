package com.zing.zalo.data.zalocloud.model.api;

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
import tn0.C26783d0;
import tn0.C26810m0;
import tn0.InterfaceC26842x;

/* loaded from: classes3.dex */
public final class Msg$$serializer implements InterfaceC26842x {
    public static final Msg$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Msg$$serializer msg$$serializer = new Msg$$serializer();
        INSTANCE = msg$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.data.zalocloud.model.api.Msg", msg$$serializer, 7);
        pluginGeneratedSerialDescriptor.m114047n(ZinstantMetaConstant.IMPRESSION_META_TYPE, false);
        pluginGeneratedSerialDescriptor.m114047n("uidFrom", false);
        pluginGeneratedSerialDescriptor.m114047n("uidTo", false);
        pluginGeneratedSerialDescriptor.m114047n("clientDelMsgId", false);
        pluginGeneratedSerialDescriptor.m114047n("globalDelMsgId", false);
        pluginGeneratedSerialDescriptor.m114047n("destId", false);
        pluginGeneratedSerialDescriptor.m114047n("mediaSize", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Msg$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26810m0 c26810m0 = C26810m0.f127024a;
        return new KSerializer[]{C26783d0.f126989a, c26810m0, c26810m0, c26810m0, c26810m0, c26810m0, c26810m0};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0060. Please report as an issue. */
    @Override // qn0.InterfaceC25386a
    public Msg deserialize(Decoder decoder) {
        int i11;
        long j11;
        long j12;
        int i12;
        long j13;
        long j14;
        long j15;
        long j16;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            int mo114011i = mo113968b.mo114011i(descriptor2, 0);
            long mo114010f = mo113968b.mo114010f(descriptor2, 1);
            long mo114010f2 = mo113968b.mo114010f(descriptor2, 2);
            long mo114010f3 = mo113968b.mo114010f(descriptor2, 3);
            long mo114010f4 = mo113968b.mo114010f(descriptor2, 4);
            long mo114010f5 = mo113968b.mo114010f(descriptor2, 5);
            i11 = mo114011i;
            j11 = mo113968b.mo114010f(descriptor2, 6);
            j12 = mo114010f4;
            j13 = mo114010f;
            j14 = mo114010f2;
            j15 = mo114010f3;
            j16 = mo114010f5;
            i12 = 127;
        } else {
            long j17 = 0;
            long j18 = 0;
            long j19 = 0;
            long j21 = 0;
            long j22 = 0;
            long j23 = 0;
            int i13 = 0;
            int i14 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                switch (mo114037p) {
                    case -1:
                        z11 = false;
                    case 0:
                        i13 = mo113968b.mo114011i(descriptor2, 0);
                        i14 |= 1;
                    case 1:
                        j19 = mo113968b.mo114010f(descriptor2, 1);
                        i14 |= 2;
                    case 2:
                        j21 = mo113968b.mo114010f(descriptor2, 2);
                        i14 |= 4;
                    case 3:
                        j22 = mo113968b.mo114010f(descriptor2, 3);
                        i14 |= 8;
                    case 4:
                        j18 = mo113968b.mo114010f(descriptor2, 4);
                        i14 |= 16;
                    case 5:
                        j23 = mo113968b.mo114010f(descriptor2, 5);
                        i14 |= 32;
                    case 6:
                        j17 = mo113968b.mo114010f(descriptor2, 6);
                        i14 |= 64;
                    default:
                        throw new UnknownFieldException(mo114037p);
                }
            }
            i11 = i13;
            j11 = j17;
            j12 = j18;
            i12 = i14;
            j13 = j19;
            j14 = j21;
            j15 = j22;
            j16 = j23;
        }
        mo113968b.mo114009c(descriptor2);
        return new Msg(i12, i11, j13, j14, j15, j12, j16, j11, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, Msg msg) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(msg, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        Msg.m41357c(msg, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
