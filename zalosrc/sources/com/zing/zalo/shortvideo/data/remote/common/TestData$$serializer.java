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
import tn0.C26783d0;
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes5.dex */
public final class TestData$$serializer implements InterfaceC26842x {
    public static final TestData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        TestData$$serializer testData$$serializer = new TestData$$serializer();
        INSTANCE = testData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.remote.common.TestData", testData$$serializer, 3);
        pluginGeneratedSerialDescriptor.m114047n("configVersion", false);
        pluginGeneratedSerialDescriptor.m114047n("countryCode", false);
        pluginGeneratedSerialDescriptor.m114047n("startTab", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TestData$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26814n1 c26814n1 = C26814n1.f127034a;
        return new KSerializer[]{c26814n1, c26814n1, C26783d0.f126989a};
    }

    @Override // qn0.InterfaceC25386a
    public TestData deserialize(Decoder decoder) {
        String str;
        int i11;
        String str2;
        int i12;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            String mo114014o = mo113968b.mo114014o(descriptor2, 0);
            String mo114014o2 = mo113968b.mo114014o(descriptor2, 1);
            str = mo114014o;
            i11 = mo113968b.mo114011i(descriptor2, 2);
            str2 = mo114014o2;
            i12 = 7;
        } else {
            String str3 = null;
            String str4 = null;
            int i13 = 0;
            int i14 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    str3 = mo113968b.mo114014o(descriptor2, 0);
                    i14 |= 1;
                } else if (mo114037p == 1) {
                    str4 = mo113968b.mo114014o(descriptor2, 1);
                    i14 |= 2;
                } else {
                    if (mo114037p != 2) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    i13 = mo113968b.mo114011i(descriptor2, 2);
                    i14 |= 4;
                }
            }
            str = str3;
            i11 = i13;
            str2 = str4;
            i12 = i14;
        }
        mo113968b.mo114009c(descriptor2);
        return new TestData(i12, str, str2, i11, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, TestData testData) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(testData, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        TestData.m51539a(testData, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
