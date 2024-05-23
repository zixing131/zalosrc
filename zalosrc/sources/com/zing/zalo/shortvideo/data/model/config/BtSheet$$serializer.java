package com.zing.zalo.shortvideo.data.model.config;

import fn0.AbstractC19074t;
import java.util.HashMap;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.encoding.InterfaceC21886d;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import rn0.AbstractC25935a;
import tn0.InterfaceC26842x;

/* loaded from: classes5.dex */
public final class BtSheet$$serializer implements InterfaceC26842x {
    public static final BtSheet$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BtSheet$$serializer btSheet$$serializer = new BtSheet$$serializer();
        INSTANCE = btSheet$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.model.config.BtSheet", btSheet$$serializer, 1);
        pluginGeneratedSerialDescriptor.m114047n("sheet", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BtSheet$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = BtSheet.f50102b;
        return new KSerializer[]{AbstractC25935a.m133630u(kSerializerArr[0])};
    }

    @Override // qn0.InterfaceC25386a
    public BtSheet deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        HashMap hashMap;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        kSerializerArr = BtSheet.f50102b;
        int i11 = 1;
        if (mo113968b.mo114015q()) {
            hashMap = (HashMap) mo113968b.mo114018x(descriptor2, 0, kSerializerArr[0], null);
        } else {
            HashMap hashMap2 = null;
            int i12 = 0;
            while (i11 != 0) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    i11 = 0;
                } else {
                    if (mo114037p != 0) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    hashMap2 = (HashMap) mo113968b.mo114018x(descriptor2, 0, kSerializerArr[0], hashMap2);
                    i12 |= 1;
                }
            }
            hashMap = hashMap2;
            i11 = i12;
        }
        mo113968b.mo114009c(descriptor2);
        return new BtSheet(i11, hashMap, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, BtSheet btSheet) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(btSheet, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        BtSheet.m51420c(btSheet, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
