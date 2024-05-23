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
import tn0.C26794h;
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes3.dex */
public final class BaseResponse$$serializer implements InterfaceC26842x {
    public static final BaseResponse$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BaseResponse$$serializer baseResponse$$serializer = new BaseResponse$$serializer();
        INSTANCE = baseResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.data.zalocloud.model.api.BaseResponse", baseResponse$$serializer, 3);
        pluginGeneratedSerialDescriptor.m114047n("error_code", false);
        pluginGeneratedSerialDescriptor.m114047n("error_message", false);
        pluginGeneratedSerialDescriptor.m114047n("isError", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BaseResponse$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        return new KSerializer[]{C26783d0.f126989a, C26814n1.f127034a, C26794h.f127000a};
    }

    @Override // qn0.InterfaceC25386a
    public BaseResponse deserialize(Decoder decoder) {
        int i11;
        boolean z11;
        String str;
        int i12;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            int mo114011i = mo113968b.mo114011i(descriptor2, 0);
            String mo114014o = mo113968b.mo114014o(descriptor2, 1);
            i11 = mo114011i;
            z11 = mo113968b.mo114004D(descriptor2, 2);
            str = mo114014o;
            i12 = 7;
        } else {
            String str2 = null;
            int i13 = 0;
            boolean z12 = false;
            int i14 = 0;
            boolean z13 = true;
            while (z13) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z13 = false;
                } else if (mo114037p == 0) {
                    i13 = mo113968b.mo114011i(descriptor2, 0);
                    i14 |= 1;
                } else if (mo114037p == 1) {
                    str2 = mo113968b.mo114014o(descriptor2, 1);
                    i14 |= 2;
                } else {
                    if (mo114037p != 2) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    z12 = mo113968b.mo114004D(descriptor2, 2);
                    i14 |= 4;
                }
            }
            i11 = i13;
            z11 = z12;
            str = str2;
            i12 = i14;
        }
        mo113968b.mo114009c(descriptor2);
        return new BaseResponse(i12, i11, str, z11, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, BaseResponse baseResponse) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(baseResponse, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        BaseResponse.m41270d(baseResponse, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
