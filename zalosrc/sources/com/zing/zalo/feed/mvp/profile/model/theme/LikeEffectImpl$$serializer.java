package com.zing.zalo.feed.mvp.profile.model.theme;

import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.encoding.InterfaceC21886d;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import tn0.AbstractC26805k1;
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes4.dex */
public final class LikeEffectImpl$$serializer implements InterfaceC26842x {
    public static final LikeEffectImpl$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        LikeEffectImpl$$serializer likeEffectImpl$$serializer = new LikeEffectImpl$$serializer();
        INSTANCE = likeEffectImpl$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.feed.mvp.profile.model.theme.LikeEffectImpl", likeEffectImpl$$serializer, 4);
        pluginGeneratedSerialDescriptor.m114047n("icon_like", true);
        pluginGeneratedSerialDescriptor.m114047n("icon_unlike_dark", true);
        pluginGeneratedSerialDescriptor.m114047n("icon_unlike_light", true);
        pluginGeneratedSerialDescriptor.m114047n("effect_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LikeEffectImpl$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26814n1 c26814n1 = C26814n1.f127034a;
        return new KSerializer[]{c26814n1, c26814n1, c26814n1, c26814n1};
    }

    @Override // qn0.InterfaceC25386a
    public LikeEffectImpl deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        int i11;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            String mo114014o = mo113968b.mo114014o(descriptor2, 0);
            String mo114014o2 = mo113968b.mo114014o(descriptor2, 1);
            String mo114014o3 = mo113968b.mo114014o(descriptor2, 2);
            str = mo114014o;
            str2 = mo113968b.mo114014o(descriptor2, 3);
            str3 = mo114014o3;
            str4 = mo114014o2;
            i11 = 15;
        } else {
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            int i12 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                if (mo114037p == -1) {
                    z11 = false;
                } else if (mo114037p == 0) {
                    str5 = mo113968b.mo114014o(descriptor2, 0);
                    i12 |= 1;
                } else if (mo114037p == 1) {
                    str8 = mo113968b.mo114014o(descriptor2, 1);
                    i12 |= 2;
                } else if (mo114037p == 2) {
                    str7 = mo113968b.mo114014o(descriptor2, 2);
                    i12 |= 4;
                } else {
                    if (mo114037p != 3) {
                        throw new UnknownFieldException(mo114037p);
                    }
                    str6 = mo113968b.mo114014o(descriptor2, 3);
                    i12 |= 8;
                }
            }
            str = str5;
            str2 = str6;
            str3 = str7;
            str4 = str8;
            i11 = i12;
        }
        mo113968b.mo114009c(descriptor2);
        return new LikeEffectImpl(i11, str, str4, str3, str2, (AbstractC26805k1) null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, LikeEffectImpl likeEffectImpl) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(likeEffectImpl, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        LikeEffectImpl.write$Self$app_release(likeEffectImpl, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
