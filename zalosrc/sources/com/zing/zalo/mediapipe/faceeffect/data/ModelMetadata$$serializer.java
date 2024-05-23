package com.zing.zalo.mediapipe.faceeffect.data;

import com.zing.zalo.zmedia.player.ZMediaPlayer;
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

/* loaded from: classes4.dex */
public final class ModelMetadata$$serializer implements InterfaceC26842x {
    public static final ModelMetadata$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ModelMetadata$$serializer modelMetadata$$serializer = new ModelMetadata$$serializer();
        INSTANCE = modelMetadata$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.mediapipe.faceeffect.data.ModelMetadata", modelMetadata$$serializer, 4);
        pluginGeneratedSerialDescriptor.m114047n("version", false);
        pluginGeneratedSerialDescriptor.m114047n(ZMediaPlayer.OnNativeInvokeListener.ARG_URL, false);
        pluginGeneratedSerialDescriptor.m114047n("checksumZip", false);
        pluginGeneratedSerialDescriptor.m114047n("checksumFolder", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ModelMetadata$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26814n1 c26814n1 = C26814n1.f127034a;
        return new KSerializer[]{C26783d0.f126989a, c26814n1, c26814n1, c26814n1};
    }

    @Override // qn0.InterfaceC25386a
    public ModelMetadata deserialize(Decoder decoder) {
        int i11;
        String str;
        String str2;
        String str3;
        int i12;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            int mo114011i = mo113968b.mo114011i(descriptor2, 0);
            String mo114014o = mo113968b.mo114014o(descriptor2, 1);
            String mo114014o2 = mo113968b.mo114014o(descriptor2, 2);
            i11 = mo114011i;
            str = mo113968b.mo114014o(descriptor2, 3);
            str2 = mo114014o2;
            str3 = mo114014o;
            i12 = 15;
        } else {
            String str4 = null;
            String str5 = null;
            String str6 = null;
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
                    str6 = mo113968b.mo114014o(descriptor2, 1);
                    i14 |= 2;
                } else if (mo114037p == 2) {
                    str5 = mo113968b.mo114014o(descriptor2, 2);
                    i14 |= 4;
                } else {
                    if (mo114037p != 3) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    str4 = mo113968b.mo114014o(descriptor2, 3);
                    i14 |= 8;
                }
            }
            i11 = i13;
            str = str4;
            str2 = str5;
            str3 = str6;
            i12 = i14;
        }
        mo113968b.mo114009c(descriptor2);
        return new ModelMetadata(i12, i11, str3, str2, str, null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, ModelMetadata modelMetadata) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(modelMetadata, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        ModelMetadata.m48224g(modelMetadata, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
