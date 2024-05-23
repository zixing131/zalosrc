package com.zing.zalo.shortvideo.data.remote.common;

import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.encoding.InterfaceC21886d;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import rn0.AbstractC25935a;
import tn0.C26783d0;
import tn0.C26810m0;
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes5.dex */
public final class RestResponse$$serializer<T> implements InterfaceC26842x {
    private final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;
    private final /* synthetic */ KSerializer typeSerial0;

    private RestResponse$$serializer() {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.remote.common.RestResponse", this, 4);
        pluginGeneratedSerialDescriptor.m114047n("code", false);
        pluginGeneratedSerialDescriptor.m114047n("msg", false);
        pluginGeneratedSerialDescriptor.m114047n("data", false);
        pluginGeneratedSerialDescriptor.m114047n("serverTime", false);
        this.descriptor = pluginGeneratedSerialDescriptor;
    }

    private final KSerializer getTypeSerial0() {
        return this.typeSerial0;
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        return new KSerializer[]{C26783d0.f126989a, C26814n1.f127034a, AbstractC25935a.m133630u(this.typeSerial0), C26810m0.f127024a};
    }

    @Override // qn0.InterfaceC25386a
    public RestResponse<T> deserialize(Decoder decoder) {
        int i11;
        int i12;
        long j11;
        String str;
        Object obj;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor);
        if (mo113968b.mo114015q()) {
            int mo114011i = mo113968b.mo114011i(descriptor, 0);
            String mo114014o = mo113968b.mo114014o(descriptor, 1);
            i11 = mo114011i;
            obj = mo113968b.mo114018x(descriptor, 2, this.typeSerial0, null);
            str = mo114014o;
            j11 = mo113968b.mo114010f(descriptor, 3);
            i12 = 15;
        } else {
            long j12 = 0;
            String str2 = null;
            Object obj2 = null;
            int i13 = 0;
            int i14 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    i13 = mo113968b.mo114011i(descriptor, 0);
                    i14 |= 1;
                } else if (mo114037p == 1) {
                    str2 = mo113968b.mo114014o(descriptor, 1);
                    i14 |= 2;
                } else if (mo114037p == 2) {
                    obj2 = mo113968b.mo114018x(descriptor, 2, this.typeSerial0, obj2);
                    i14 |= 4;
                } else {
                    if (mo114037p != 3) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    j12 = mo113968b.mo114010f(descriptor, 3);
                    i14 |= 8;
                }
            }
            i11 = i13;
            i12 = i14;
            j11 = j12;
            str = str2;
            obj = obj2;
        }
        mo113968b.mo114009c(descriptor);
        return new RestResponse<>(i12, i11, str, obj, j11, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, RestResponse<T> restResponse) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(restResponse, "value");
        SerialDescriptor descriptor = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor);
        RestResponse.m51530e(restResponse, mo113984b, descriptor, this.typeSerial0);
        mo113984b.mo114026c(descriptor);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return new KSerializer[]{this.typeSerial0};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RestResponse$$serializer(KSerializer kSerializer) {
        this();
        AbstractC19074t.m100208f(kSerializer, "typeSerial0");
        this.typeSerial0 = kSerializer;
    }
}
