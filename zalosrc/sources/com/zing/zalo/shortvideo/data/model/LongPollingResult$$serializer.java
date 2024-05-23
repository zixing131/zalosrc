package com.zing.zalo.shortvideo.data.model;

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
import tn0.InterfaceC26842x;

/* loaded from: classes5.dex */
public final class LongPollingResult$$serializer implements InterfaceC26842x {
    public static final LongPollingResult$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        LongPollingResult$$serializer longPollingResult$$serializer = new LongPollingResult$$serializer();
        INSTANCE = longPollingResult$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.model.LongPollingResult", longPollingResult$$serializer, 1);
        pluginGeneratedSerialDescriptor.m114047n(ZinstantMetaConstant.IMPRESSION_META_TYPE, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LongPollingResult$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        return new KSerializer[]{C26783d0.f126989a};
    }

    @Override // qn0.InterfaceC25386a
    public LongPollingResult deserialize(Decoder decoder) {
        int i11;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        int i12 = 1;
        if (mo113968b.mo114015q()) {
            i11 = mo113968b.mo114011i(descriptor2, 0);
        } else {
            i11 = 0;
            int i13 = 0;
            while (i12 != 0) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    i12 = 0;
                } else {
                    if (mo114037p != 0) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    i11 = mo113968b.mo114011i(descriptor2, 0);
                    i13 |= 1;
                }
            }
            i12 = i13;
        }
        mo113968b.mo114009c(descriptor2);
        return new LongPollingResult(i12, i11, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, LongPollingResult longPollingResult) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(longPollingResult, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        mo113984b.mo114033x(descriptor2, 0, longPollingResult.f49905a);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
