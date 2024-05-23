package com.zing.zalo.shortvideo.data.model.config;

import com.zing.zalo.shortvideo.data.utils.AbstractC9465b;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import kotlinx.serialization.json.JsonObject;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;
import tn0.C26783d0;
import tn0.C26814n1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class UpdateInfoConfig {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final Integer f50153a;

    /* renamed from: b */
    private final Integer f50154b;

    /* renamed from: c */
    private final String f50155c;

    /* renamed from: d */
    private final String f50156d;

    /* renamed from: e */
    private final String f50157e;

    /* renamed from: f */
    private final String f50158f;

    /* renamed from: g */
    private final String f50159g;

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final UpdateInfoConfig m51498a(JsonObject jsonObject) {
            if (jsonObject == null) {
                return null;
            }
            return new UpdateInfoConfig(Integer.valueOf(AbstractC9465b.m51728i(jsonObject, new String[]{"version"}, 0, 2, null)), Integer.valueOf(AbstractC9465b.m51728i(jsonObject, new String[]{ZinstantMetaConstant.IMPRESSION_META_TYPE}, 0, 2, null)), AbstractC9465b.m51742w(jsonObject, new String[]{"title"}, null, 2, null), AbstractC9465b.m51742w(jsonObject, new String[]{"msg"}, null, 2, null), AbstractC9465b.m51742w(jsonObject, new String[]{ZMediaPlayer.OnNativeInvokeListener.ARG_URL}, null, 2, null), AbstractC9465b.m51742w(jsonObject, new String[]{"btnYes"}, null, 2, null), AbstractC9465b.m51742w(jsonObject, new String[]{"btnCancel"}, null, 2, null));
        }

        public final KSerializer serializer() {
            return UpdateInfoConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UpdateInfoConfig(int i11, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f50153a = null;
        } else {
            this.f50153a = num;
        }
        if ((i11 & 2) == 0) {
            this.f50154b = null;
        } else {
            this.f50154b = num2;
        }
        if ((i11 & 4) == 0) {
            this.f50155c = null;
        } else {
            this.f50155c = str;
        }
        if ((i11 & 8) == 0) {
            this.f50156d = null;
        } else {
            this.f50156d = str2;
        }
        if ((i11 & 16) == 0) {
            this.f50157e = null;
        } else {
            this.f50157e = str3;
        }
        if ((i11 & 32) == 0) {
            this.f50158f = null;
        } else {
            this.f50158f = str4;
        }
        if ((i11 & 64) == 0) {
            this.f50159g = null;
        } else {
            this.f50159g = str5;
        }
    }

    /* renamed from: h */
    public static final /* synthetic */ void m51490h(UpdateInfoConfig updateInfoConfig, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || updateInfoConfig.f50153a != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, C26783d0.f126989a, updateInfoConfig.f50153a);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || updateInfoConfig.f50154b != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, C26783d0.f126989a, updateInfoConfig.f50154b);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || updateInfoConfig.f50155c != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 2, C26814n1.f127034a, updateInfoConfig.f50155c);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || updateInfoConfig.f50156d != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 3, C26814n1.f127034a, updateInfoConfig.f50156d);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || updateInfoConfig.f50157e != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 4, C26814n1.f127034a, updateInfoConfig.f50157e);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 5) || updateInfoConfig.f50158f != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 5, C26814n1.f127034a, updateInfoConfig.f50158f);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 6) || updateInfoConfig.f50159g != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 6, C26814n1.f127034a, updateInfoConfig.f50159g);
        }
    }

    /* renamed from: a */
    public final String m51491a() {
        return this.f50159g;
    }

    /* renamed from: b */
    public final String m51492b() {
        return this.f50158f;
    }

    /* renamed from: c */
    public final String m51493c() {
        return this.f50156d;
    }

    /* renamed from: d */
    public final String m51494d() {
        return this.f50155c;
    }

    /* renamed from: e */
    public final Integer m51495e() {
        return this.f50154b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateInfoConfig)) {
            return false;
        }
        UpdateInfoConfig updateInfoConfig = (UpdateInfoConfig) obj;
        return AbstractC19074t.m100204b(this.f50153a, updateInfoConfig.f50153a) && AbstractC19074t.m100204b(this.f50154b, updateInfoConfig.f50154b) && AbstractC19074t.m100204b(this.f50155c, updateInfoConfig.f50155c) && AbstractC19074t.m100204b(this.f50156d, updateInfoConfig.f50156d) && AbstractC19074t.m100204b(this.f50157e, updateInfoConfig.f50157e) && AbstractC19074t.m100204b(this.f50158f, updateInfoConfig.f50158f) && AbstractC19074t.m100204b(this.f50159g, updateInfoConfig.f50159g);
    }

    /* renamed from: f */
    public final String m51496f() {
        return this.f50157e;
    }

    /* renamed from: g */
    public final boolean m51497g() {
        Integer num;
        Integer num2;
        String str;
        String str2;
        String str3;
        Integer num3 = this.f50153a;
        if (num3 != null && CoreUtility.f89236l < num3.intValue() && ((((num = this.f50154b) != null && num.intValue() == 1) || ((num2 = this.f50154b) != null && num2.intValue() == 2)) && (str = this.f50155c) != null && str.length() != 0 && (str2 = this.f50156d) != null && str2.length() != 0 && (str3 = this.f50157e) != null && str3.length() != 0)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f50153a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f50154b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f50155c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f50156d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f50157e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f50158f;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f50159g;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "UpdateInfoConfig(version=" + this.f50153a + ", type=" + this.f50154b + ", title=" + this.f50155c + ", msg=" + this.f50156d + ", url=" + this.f50157e + ", btnYes=" + this.f50158f + ", btnCancel=" + this.f50159g + ")";
    }

    public UpdateInfoConfig(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5) {
        this.f50153a = num;
        this.f50154b = num2;
        this.f50155c = str;
        this.f50156d = str2;
        this.f50157e = str3;
        this.f50158f = str4;
        this.f50159g = str5;
    }
}
