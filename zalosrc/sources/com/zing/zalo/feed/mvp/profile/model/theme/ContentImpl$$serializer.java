package com.zing.zalo.feed.mvp.profile.model.theme;

import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
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
import tn0.C26783d0;
import tn0.C26814n1;
import tn0.InterfaceC26842x;

/* loaded from: classes4.dex */
public final class ContentImpl$$serializer implements InterfaceC26842x {
    public static final ContentImpl$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ContentImpl$$serializer contentImpl$$serializer = new ContentImpl$$serializer();
        INSTANCE = contentImpl$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.zing.zalo.feed.mvp.profile.model.theme.ContentImpl", contentImpl$$serializer, 13);
        pluginGeneratedSerialDescriptor.m114047n("text_color_01", true);
        pluginGeneratedSerialDescriptor.m114047n("text_color_02", true);
        pluginGeneratedSerialDescriptor.m114047n("arrow_color", true);
        pluginGeneratedSerialDescriptor.m114047n("icon_color", true);
        pluginGeneratedSerialDescriptor.m114047n("bg_icon_color", true);
        pluginGeneratedSerialDescriptor.m114047n("text_icon_color", true);
        pluginGeneratedSerialDescriptor.m114047n("empty_border_color", true);
        pluginGeneratedSerialDescriptor.m114047n("thumb", true);
        pluginGeneratedSerialDescriptor.m114047n("title_color", true);
        pluginGeneratedSerialDescriptor.m114047n("desc_color", true);
        pluginGeneratedSerialDescriptor.m114047n("like_effect", true);
        pluginGeneratedSerialDescriptor.m114047n("title", true);
        pluginGeneratedSerialDescriptor.m114047n("title_typoid", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ContentImpl$$serializer() {
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] childSerializers() {
        C26783d0 c26783d0 = C26783d0.f126989a;
        C26814n1 c26814n1 = C26814n1.f127034a;
        return new KSerializer[]{c26783d0, c26783d0, c26783d0, c26783d0, c26783d0, c26783d0, c26783d0, c26814n1, c26783d0, c26783d0, LikeEffectImpl$$serializer.INSTANCE, c26814n1, c26783d0};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x00a3. Please report as an issue. */
    @Override // qn0.InterfaceC25386a
    public ContentImpl deserialize(Decoder decoder) {
        int i11;
        int i12;
        LikeEffectImpl likeEffectImpl;
        String str;
        String str2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        AbstractC19074t.m100208f(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21885c mo113968b = decoder.mo113968b(descriptor2);
        if (mo113968b.mo114015q()) {
            int mo114011i = mo113968b.mo114011i(descriptor2, 0);
            int mo114011i2 = mo113968b.mo114011i(descriptor2, 1);
            int mo114011i3 = mo113968b.mo114011i(descriptor2, 2);
            int mo114011i4 = mo113968b.mo114011i(descriptor2, 3);
            int mo114011i5 = mo113968b.mo114011i(descriptor2, 4);
            int mo114011i6 = mo113968b.mo114011i(descriptor2, 5);
            int mo114011i7 = mo113968b.mo114011i(descriptor2, 6);
            String mo114014o = mo113968b.mo114014o(descriptor2, 7);
            int mo114011i8 = mo113968b.mo114011i(descriptor2, 8);
            int mo114011i9 = mo113968b.mo114011i(descriptor2, 9);
            i11 = mo114011i;
            likeEffectImpl = (LikeEffectImpl) mo113968b.mo114012l(descriptor2, 10, LikeEffectImpl$$serializer.INSTANCE, null);
            str2 = mo113968b.mo114014o(descriptor2, 11);
            i13 = mo113968b.mo114011i(descriptor2, 12);
            i14 = mo114011i9;
            str = mo114014o;
            i15 = mo114011i7;
            i16 = mo114011i6;
            i17 = mo114011i4;
            i18 = mo114011i8;
            i19 = mo114011i5;
            i21 = mo114011i3;
            i22 = mo114011i2;
            i12 = 8191;
        } else {
            int i23 = 12;
            LikeEffectImpl likeEffectImpl2 = null;
            String str3 = null;
            String str4 = null;
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            int i27 = 0;
            int i28 = 0;
            int i29 = 0;
            int i31 = 0;
            int i32 = 0;
            int i33 = 0;
            int i34 = 0;
            int i35 = 0;
            boolean z11 = true;
            while (z11) {
                int mo114037p = mo113968b.mo114037p(descriptor2);
                switch (mo114037p) {
                    case -1:
                        i23 = 12;
                        z11 = false;
                    case 0:
                        i25 |= 1;
                        i24 = mo113968b.mo114011i(descriptor2, 0);
                        i23 = 12;
                    case 1:
                        i35 = mo113968b.mo114011i(descriptor2, 1);
                        i25 |= 2;
                        i23 = 12;
                    case 2:
                        i34 = mo113968b.mo114011i(descriptor2, 2);
                        i25 |= 4;
                    case 3:
                        i31 = mo113968b.mo114011i(descriptor2, 3);
                        i25 |= 8;
                    case 4:
                        i33 = mo113968b.mo114011i(descriptor2, 4);
                        i25 |= 16;
                    case 5:
                        i29 = mo113968b.mo114011i(descriptor2, 5);
                        i25 |= 32;
                    case 6:
                        i28 = mo113968b.mo114011i(descriptor2, 6);
                        i25 |= 64;
                    case 7:
                        str3 = mo113968b.mo114014o(descriptor2, 7);
                        i25 |= 128;
                    case 8:
                        i32 = mo113968b.mo114011i(descriptor2, 8);
                        i25 |= 256;
                    case 9:
                        i27 = mo113968b.mo114011i(descriptor2, 9);
                        i25 |= 512;
                    case 10:
                        likeEffectImpl2 = (LikeEffectImpl) mo113968b.mo114012l(descriptor2, 10, LikeEffectImpl$$serializer.INSTANCE, likeEffectImpl2);
                        i25 |= 1024;
                    case 11:
                        str4 = mo113968b.mo114014o(descriptor2, 11);
                        i25 |= ZVideoUtilMetadata.FF_PROFILE_H264_INTRA;
                    case 12:
                        i26 = mo113968b.mo114011i(descriptor2, i23);
                        i25 |= 4096;
                    default:
                        throw new UnknownFieldException(mo114037p);
                }
            }
            i11 = i24;
            i12 = i25;
            likeEffectImpl = likeEffectImpl2;
            str = str3;
            str2 = str4;
            i13 = i26;
            i14 = i27;
            i15 = i28;
            i16 = i29;
            i17 = i31;
            i18 = i32;
            i19 = i33;
            i21 = i34;
            i22 = i35;
        }
        mo113968b.mo114009c(descriptor2);
        return new ContentImpl(i12, i11, i22, i21, i17, i19, i16, i15, str, i18, i14, likeEffectImpl, str2, i13, (AbstractC26805k1) null);
    }

    @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // qn0.InterfaceC25393h
    public void serialize(Encoder encoder, ContentImpl contentImpl) {
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(contentImpl, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC21886d mo113984b = encoder.mo113984b(descriptor2);
        ContentImpl.write$Self$app_release(contentImpl, mo113984b, descriptor2);
        mo113984b.mo114026c(descriptor2);
    }

    @Override // tn0.InterfaceC26842x
    public KSerializer[] typeParametersSerializers() {
        return InterfaceC26842x.a.m137988a(this);
    }
}
