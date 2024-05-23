package com.zing.zalo.shortvideo.data.remote.ws.response;

import com.zing.zalo.shortvideo.data.remote.ws.response.GetCommentLiveRes;
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
public final class GetCommentLiveRes$CommentData$$serializer implements InterfaceC26842x {
    public static final GetCommentLiveRes$CommentData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        GetCommentLiveRes$CommentData$$serializer getCommentLiveRes$CommentData$$serializer = new GetCommentLiveRes$CommentData$$serializer();
        INSTANCE = getCommentLiveRes$CommentData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.shortvideo.data.remote.ws.response.GetCommentLiveRes.CommentData", getCommentLiveRes$CommentData$$serializer, 9);
        pluginGeneratedSerialDescriptor.m114047n("cmtId", true);
        pluginGeneratedSerialDescriptor.m114047n("liveId", true);
        pluginGeneratedSerialDescriptor.m114047n("content", true);
        pluginGeneratedSerialDescriptor.m114047n("statusMsg", true);
        pluginGeneratedSerialDescriptor.m114047n("likes", true);
        pluginGeneratedSerialDescriptor.m114047n("createdTime", true);
        pluginGeneratedSerialDescriptor.m114047n("attributes", true);
        pluginGeneratedSerialDescriptor.m114047n("reportURL", true);
        pluginGeneratedSerialDescriptor.m114047n("owner", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private GetCommentLiveRes$CommentData$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26810m0 c26810m0 = C26810m0.f127024a;
        C26814n1 c26814n1 = C26814n1.f127034a;
        return new KSerializer[]{AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(c26810m0), AbstractC25935a.m133630u(C26783d0.f126989a), AbstractC25935a.m133630u(c26814n1), AbstractC25935a.m133630u(GetCommentLiveRes$Owner$$serializer.INSTANCE)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0087. Please report as an issue. */
    @Override // qn0.InterfaceC25386a
    public GetCommentLiveRes.CommentData deserialize(Decoder decoder) {
        int i11;
        String str;
        GetCommentLiveRes.Owner owner;
        Integer num;
        Long l11;
        Long l12;
        Long l13;
        Long l14;
        String str2;
        String str3;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        int i12 = 7;
        Long l15 = null;
        if (mo113968b.mo114015q()) {
            C26810m0 c26810m0 = C26810m0.f127024a;
            Long l16 = (Long) mo113968b.mo114018x(descriptor2, 0, c26810m0, null);
            Long l17 = (Long) mo113968b.mo114018x(descriptor2, 1, c26810m0, null);
            C26814n1 c26814n1 = C26814n1.f127034a;
            String str4 = (String) mo113968b.mo114018x(descriptor2, 2, c26814n1, null);
            String str5 = (String) mo113968b.mo114018x(descriptor2, 3, c26814n1, null);
            Long l18 = (Long) mo113968b.mo114018x(descriptor2, 4, c26810m0, null);
            Long l19 = (Long) mo113968b.mo114018x(descriptor2, 5, c26810m0, null);
            Integer num2 = (Integer) mo113968b.mo114018x(descriptor2, 6, C26783d0.f126989a, null);
            l11 = l19;
            str = (String) mo113968b.mo114018x(descriptor2, 7, c26814n1, null);
            num = num2;
            owner = (GetCommentLiveRes.Owner) mo113968b.mo114018x(descriptor2, 8, GetCommentLiveRes$Owner$$serializer.INSTANCE, null);
            str3 = str5;
            l12 = l18;
            str2 = str4;
            l14 = l17;
            l13 = l16;
            i11 = 511;
        } else {
            String str6 = null;
            GetCommentLiveRes.Owner owner2 = null;
            Integer num3 = null;
            Long l21 = null;
            Long l22 = null;
            Long l23 = null;
            String str7 = null;
            String str8 = null;
            int i13 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                switch (mo114037p) {
                    case -1:
                        i12 = 7;
                        z11 = false;
                    case 0:
                        l15 = (Long) mo113968b.mo114018x(descriptor2, 0, C26810m0.f127024a, l15);
                        i13 |= 1;
                        i12 = 7;
                    case 1:
                        l23 = (Long) mo113968b.mo114018x(descriptor2, 1, C26810m0.f127024a, l23);
                        i13 |= 2;
                        i12 = 7;
                    case 2:
                        str7 = (String) mo113968b.mo114018x(descriptor2, 2, C26814n1.f127034a, str7);
                        i13 |= 4;
                        i12 = 7;
                    case 3:
                        str8 = (String) mo113968b.mo114018x(descriptor2, 3, C26814n1.f127034a, str8);
                        i13 |= 8;
                        i12 = 7;
                    case 4:
                        l22 = (Long) mo113968b.mo114018x(descriptor2, 4, C26810m0.f127024a, l22);
                        i13 |= 16;
                        i12 = 7;
                    case 5:
                        l21 = (Long) mo113968b.mo114018x(descriptor2, 5, C26810m0.f127024a, l21);
                        i13 |= 32;
                        i12 = 7;
                    case 6:
                        num3 = (Integer) mo113968b.mo114018x(descriptor2, 6, C26783d0.f126989a, num3);
                        i13 |= 64;
                    case 7:
                        str6 = (String) mo113968b.mo114018x(descriptor2, i12, C26814n1.f127034a, str6);
                        i13 |= 128;
                    case 8:
                        owner2 = (GetCommentLiveRes.Owner) mo113968b.mo114018x(descriptor2, 8, GetCommentLiveRes$Owner$$serializer.INSTANCE, owner2);
                        i13 |= 256;
                    default:
                        throw new UnknownFieldException(mo114037p);
                }
            }
            i11 = i13;
            str = str6;
            owner = owner2;
            num = num3;
            l11 = l21;
            l12 = l22;
            l13 = l15;
            l14 = l23;
            str2 = str7;
            str3 = str8;
        }
        mo113968b.mo114009c(descriptor2);
        return new GetCommentLiveRes.CommentData(i11, l13, l14, str2, str3, l12, l11, num, str, owner, (AbstractC26805k1) null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, GetCommentLiveRes.CommentData commentData) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(commentData, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        GetCommentLiveRes.CommentData.m51642e(commentData, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
