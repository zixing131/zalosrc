package com.zing.zalo.shortvideo.data.model.config;

import com.zing.zalo.shortvideo.data.utils.AbstractC9465b;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import kotlinx.serialization.json.JsonObject;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;
import tn0.C26810m0;
import tn0.C26814n1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class EditProfileConfig {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f50139a;

    /* renamed from: b */
    private final Long f50140b;

    /* renamed from: c */
    private final Long f50141c;

    /* renamed from: d */
    private final Long f50142d;

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final EditProfileConfig m51468a(JsonObject jsonObject) {
            if (jsonObject == null) {
                return null;
            }
            return new EditProfileConfig(AbstractC9465b.m51742w(jsonObject, new String[]{"domain"}, null, 2, null), Long.valueOf(AbstractC9465b.m51736q(jsonObject, new String[]{"editAvatarInSecs"}, 0L, 2, null) * 1000), Long.valueOf(AbstractC9465b.m51736q(jsonObject, new String[]{"editBioInSecs"}, 0L, 2, null) * 1000), Long.valueOf(AbstractC9465b.m51736q(jsonObject, new String[]{"editNameInSecs"}, 0L, 2, null) * 1000));
        }

        public final KSerializer serializer() {
            return EditProfileConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EditProfileConfig(int i11, String str, Long l11, Long l12, Long l13, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f50139a = null;
        } else {
            this.f50139a = str;
        }
        if ((i11 & 2) == 0) {
            this.f50140b = null;
        } else {
            this.f50140b = l11;
        }
        if ((i11 & 4) == 0) {
            this.f50141c = null;
        } else {
            this.f50141c = l12;
        }
        if ((i11 & 8) == 0) {
            this.f50142d = null;
        } else {
            this.f50142d = l13;
        }
    }

    /* renamed from: e */
    public static final /* synthetic */ void m51463e(EditProfileConfig editProfileConfig, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || editProfileConfig.f50139a != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, C26814n1.f127034a, editProfileConfig.f50139a);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || editProfileConfig.f50140b != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, C26810m0.f127024a, editProfileConfig.f50140b);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || editProfileConfig.f50141c != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 2, C26810m0.f127024a, editProfileConfig.f50141c);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || editProfileConfig.f50142d != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 3, C26810m0.f127024a, editProfileConfig.f50142d);
        }
    }

    /* renamed from: a */
    public final String m51464a() {
        return this.f50139a;
    }

    /* renamed from: b */
    public final Long m51465b() {
        return this.f50140b;
    }

    /* renamed from: c */
    public final Long m51466c() {
        return this.f50141c;
    }

    /* renamed from: d */
    public final Long m51467d() {
        return this.f50142d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditProfileConfig)) {
            return false;
        }
        EditProfileConfig editProfileConfig = (EditProfileConfig) obj;
        return AbstractC19074t.m100204b(this.f50139a, editProfileConfig.f50139a) && AbstractC19074t.m100204b(this.f50140b, editProfileConfig.f50140b) && AbstractC19074t.m100204b(this.f50141c, editProfileConfig.f50141c) && AbstractC19074t.m100204b(this.f50142d, editProfileConfig.f50142d);
    }

    public int hashCode() {
        String str = this.f50139a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l11 = this.f50140b;
        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.f50141c;
        int hashCode3 = (hashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.f50142d;
        return hashCode3 + (l13 != null ? l13.hashCode() : 0);
    }

    public String toString() {
        return "EditProfileConfig(domain=" + this.f50139a + ", editAvatarInSecs=" + this.f50140b + ", editBioInSecs=" + this.f50141c + ", editNameInSecs=" + this.f50142d + ")";
    }

    public EditProfileConfig(String str, Long l11, Long l12, Long l13) {
        this.f50139a = str;
        this.f50140b = l11;
        this.f50141c = l12;
        this.f50142d = l13;
    }
}
