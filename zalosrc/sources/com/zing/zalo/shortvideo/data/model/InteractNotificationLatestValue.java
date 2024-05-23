package com.zing.zalo.shortvideo.data.model;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;
import tn0.C26810m0;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class InteractNotificationLatestValue {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final Long f49864a;

    /* renamed from: b */
    private final Long f49865b;

    /* renamed from: c */
    private final Long f49866c;

    /* renamed from: d */
    private final Long f49867d;

    /* renamed from: e */
    private final Long f49868e;

    /* renamed from: f */
    private final Long f49869f;

    /* renamed from: g */
    private final Long f49870g;

    /* renamed from: h */
    private final Long f49871h;

    /* renamed from: i */
    private final Long f49872i;

    /* renamed from: j */
    private final Long f49873j;

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return InteractNotificationLatestValue$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InteractNotificationLatestValue(int i11, Long l11, Long l12, Long l13, Long l14, Long l15, Long l16, Long l17, Long l18, Long l19, Long l21, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f49864a = null;
        } else {
            this.f49864a = l11;
        }
        if ((i11 & 2) == 0) {
            this.f49865b = null;
        } else {
            this.f49865b = l12;
        }
        if ((i11 & 4) == 0) {
            this.f49866c = null;
        } else {
            this.f49866c = l13;
        }
        if ((i11 & 8) == 0) {
            this.f49867d = null;
        } else {
            this.f49867d = l14;
        }
        if ((i11 & 16) == 0) {
            this.f49868e = null;
        } else {
            this.f49868e = l15;
        }
        if ((i11 & 32) == 0) {
            this.f49869f = null;
        } else {
            this.f49869f = l16;
        }
        if ((i11 & 64) == 0) {
            this.f49870g = null;
        } else {
            this.f49870g = l17;
        }
        if ((i11 & 128) == 0) {
            this.f49871h = null;
        } else {
            this.f49871h = l18;
        }
        if ((i11 & 256) == 0) {
            this.f49872i = null;
        } else {
            this.f49872i = l19;
        }
        if ((i11 & 512) == 0) {
            this.f49873j = null;
        } else {
            this.f49873j = l21;
        }
    }

    /* renamed from: k */
    public static final /* synthetic */ void m50975k(InteractNotificationLatestValue interactNotificationLatestValue, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || interactNotificationLatestValue.f49864a != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, C26810m0.f127024a, interactNotificationLatestValue.f49864a);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || interactNotificationLatestValue.f49865b != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, C26810m0.f127024a, interactNotificationLatestValue.f49865b);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || interactNotificationLatestValue.f49866c != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 2, C26810m0.f127024a, interactNotificationLatestValue.f49866c);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || interactNotificationLatestValue.f49867d != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 3, C26810m0.f127024a, interactNotificationLatestValue.f49867d);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || interactNotificationLatestValue.f49868e != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 4, C26810m0.f127024a, interactNotificationLatestValue.f49868e);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 5) || interactNotificationLatestValue.f49869f != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 5, C26810m0.f127024a, interactNotificationLatestValue.f49869f);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 6) || interactNotificationLatestValue.f49870g != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 6, C26810m0.f127024a, interactNotificationLatestValue.f49870g);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 7) || interactNotificationLatestValue.f49871h != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 7, C26810m0.f127024a, interactNotificationLatestValue.f49871h);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 8) || interactNotificationLatestValue.f49872i != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 8, C26810m0.f127024a, interactNotificationLatestValue.f49872i);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 9) || interactNotificationLatestValue.f49873j != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 9, C26810m0.f127024a, interactNotificationLatestValue.f49873j);
        }
    }

    /* renamed from: a */
    public final Long m50976a() {
        return this.f49866c;
    }

    /* renamed from: b */
    public final Long m50977b() {
        return this.f49868e;
    }

    /* renamed from: c */
    public final Long m50978c() {
        return this.f49867d;
    }

    /* renamed from: d */
    public final Long m50979d() {
        return this.f49865b;
    }

    /* renamed from: e */
    public final Long m50980e() {
        return this.f49864a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InteractNotificationLatestValue)) {
            return false;
        }
        InteractNotificationLatestValue interactNotificationLatestValue = (InteractNotificationLatestValue) obj;
        return AbstractC19074t.m100204b(this.f49864a, interactNotificationLatestValue.f49864a) && AbstractC19074t.m100204b(this.f49865b, interactNotificationLatestValue.f49865b) && AbstractC19074t.m100204b(this.f49866c, interactNotificationLatestValue.f49866c) && AbstractC19074t.m100204b(this.f49867d, interactNotificationLatestValue.f49867d) && AbstractC19074t.m100204b(this.f49868e, interactNotificationLatestValue.f49868e) && AbstractC19074t.m100204b(this.f49869f, interactNotificationLatestValue.f49869f) && AbstractC19074t.m100204b(this.f49870g, interactNotificationLatestValue.f49870g) && AbstractC19074t.m100204b(this.f49871h, interactNotificationLatestValue.f49871h) && AbstractC19074t.m100204b(this.f49872i, interactNotificationLatestValue.f49872i) && AbstractC19074t.m100204b(this.f49873j, interactNotificationLatestValue.f49873j);
    }

    /* renamed from: f */
    public final Long m50981f() {
        return this.f49872i;
    }

    /* renamed from: g */
    public final Long m50982g() {
        return this.f49873j;
    }

    /* renamed from: h */
    public final Long m50983h() {
        return this.f49870g;
    }

    public int hashCode() {
        Long l11 = this.f49864a;
        int hashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        Long l12 = this.f49865b;
        int hashCode2 = (hashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.f49866c;
        int hashCode3 = (hashCode2 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.f49867d;
        int hashCode4 = (hashCode3 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.f49868e;
        int hashCode5 = (hashCode4 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Long l16 = this.f49869f;
        int hashCode6 = (hashCode5 + (l16 == null ? 0 : l16.hashCode())) * 31;
        Long l17 = this.f49870g;
        int hashCode7 = (hashCode6 + (l17 == null ? 0 : l17.hashCode())) * 31;
        Long l18 = this.f49871h;
        int hashCode8 = (hashCode7 + (l18 == null ? 0 : l18.hashCode())) * 31;
        Long l19 = this.f49872i;
        int hashCode9 = (hashCode8 + (l19 == null ? 0 : l19.hashCode())) * 31;
        Long l21 = this.f49873j;
        return hashCode9 + (l21 != null ? l21.hashCode() : 0);
    }

    /* renamed from: i */
    public final Long m50984i() {
        return this.f49871h;
    }

    /* renamed from: j */
    public final Long m50985j() {
        return this.f49869f;
    }

    public String toString() {
        return "InteractNotificationLatestValue(delayMillis=" + this.f49864a + ", channelSystemNoti=" + this.f49865b + ", channelCommentNoti=" + this.f49866c + ", channelLikeNoti=" + this.f49867d + ", channelFollowNoti=" + this.f49868e + ", userSystemNoti=" + this.f49869f + ", userCommentNoti=" + this.f49870g + ", userLikeNoti=" + this.f49871h + ", newFollowingVideos=" + this.f49872i + ", newFriendVideos=" + this.f49873j + ")";
    }
}
