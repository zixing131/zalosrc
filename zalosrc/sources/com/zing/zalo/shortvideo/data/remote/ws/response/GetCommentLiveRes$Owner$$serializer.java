package com.zing.zalo.shortvideo.data.remote.ws.response;

import com.zing.zalo.shortvideo.data.remote.ws.response.GetCommentLiveRes;
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
import rn0.AbstractC25935a;
import tn0.AbstractC26805k1;
import tn0.C26783d0;
import tn0.C26810m0;
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes5.dex */
public final class GetCommentLiveRes$Owner$$serializer implements InterfaceC26842x {
    public static final GetCommentLiveRes$Owner$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        GetCommentLiveRes$Owner$$serializer getCommentLiveRes$Owner$$serializer = new GetCommentLiveRes$Owner$$serializer();
        INSTANCE = getCommentLiveRes$Owner$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.remote.ws.response.GetCommentLiveRes.Owner", getCommentLiveRes$Owner$$serializer, 5);
        pluginGeneratedSerialDescriptor.m114047n("id", true);
        pluginGeneratedSerialDescriptor.m114047n(ZinstantMetaConstant.IMPRESSION_META_TYPE, true);
        pluginGeneratedSerialDescriptor.m114047n("attributes", true);
        pluginGeneratedSerialDescriptor.m114047n("name", true);
        pluginGeneratedSerialDescriptor.m114047n("avatar", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GetCommentLiveRes$Owner$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26783d0 c26783d0 = C26783d0.f126989a;
        C26814n1 c26814n1 = C26814n1.f127034a;
        return new KSerializer[]{AbstractC25935a.m133630u(C26810m0.f127024a), AbstractC25935a.m133630u(c26783d0), AbstractC25935a.m133630u(c26783d0), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1)};
    }

    @Override // qn0.InterfaceC25386a
    public GetCommentLiveRes.Owner deserialize(Decoder decoder) {
        int i11;
        Long l11;
        Integer num;
        Integer num2;
        String str;
        String str2;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        Long l12 = null;
        if (mo113968b.mo114015q()) {
            Long l13 = (Long) mo113968b.mo114018x(descriptor2, 0, C26810m0.f127024a, null);
            C26783d0 c26783d0 = C26783d0.f126989a;
            Integer num3 = (Integer) mo113968b.mo114018x(descriptor2, 1, c26783d0, null);
            Integer num4 = (Integer) mo113968b.mo114018x(descriptor2, 2, c26783d0, null);
            C26814n1 c26814n1 = C26814n1.f127034a;
            l11 = l13;
            str = (String) mo113968b.mo114018x(descriptor2, 3, c26814n1, null);
            str2 = (String) mo113968b.mo114018x(descriptor2, 4, c26814n1, null);
            num2 = num4;
            num = num3;
            i11 = 31;
        } else {
            Integer num5 = null;
            Integer num6 = null;
            String str3 = null;
            String str4 = null;
            int i12 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    l12 = (Long) mo113968b.mo114018x(descriptor2, 0, C26810m0.f127024a, l12);
                    i12 |= 1;
                } else if (mo114037p == 1) {
                    num5 = (Integer) mo113968b.mo114018x(descriptor2, 1, C26783d0.f126989a, num5);
                    i12 |= 2;
                } else if (mo114037p == 2) {
                    num6 = (Integer) mo113968b.mo114018x(descriptor2, 2, C26783d0.f126989a, num6);
                    i12 |= 4;
                } else if (mo114037p == 3) {
                    str3 = (String) mo113968b.mo114018x(descriptor2, 3, C26814n1.f127034a, str3);
                    i12 |= 8;
                } else {
                    if (mo114037p != 4) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    str4 = (String) mo113968b.mo114018x(descriptor2, 4, C26814n1.f127034a, str4);
                    i12 |= 16;
                }
            }
            i11 = i12;
            l11 = l12;
            num = num5;
            num2 = num6;
            str = str3;
            str2 = str4;
        }
        mo113968b.mo114009c(descriptor2);
        return new GetCommentLiveRes.Owner(i11, l11, num, num2, str, str2, (AbstractC26805k1) null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, GetCommentLiveRes.Owner owner) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(owner, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        GetCommentLiveRes.Owner.m51650b(owner, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
