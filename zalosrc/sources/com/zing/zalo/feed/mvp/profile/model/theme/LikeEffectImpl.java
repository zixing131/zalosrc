package com.zing.zalo.feed.mvp.profile.model.theme;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;

@InterfaceC25392g
@Keep
/* loaded from: classes4.dex */
public final class LikeEffectImpl extends LikeEffect {
    private final String effectId;
    private final String iconLike;
    private final String iconUnlikeDark;
    private final String iconUnlikeLight;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LikeEffectImpl> CREATOR = new C8682a();

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return LikeEffectImpl$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.model.theme.LikeEffectImpl$a */
    /* loaded from: classes4.dex */
    public static final class C8682a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LikeEffectImpl createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new LikeEffectImpl(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LikeEffectImpl[] newArray(int i11) {
            return new LikeEffectImpl[i11];
        }
    }

    public LikeEffectImpl() {
        this((String) null, (String) null, (String) null, (String) null, 15, (AbstractC19060k) null);
    }

    public static /* synthetic */ LikeEffectImpl copy$default(LikeEffectImpl likeEffectImpl, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = likeEffectImpl.iconLike;
        }
        if ((i11 & 2) != 0) {
            str2 = likeEffectImpl.iconUnlikeDark;
        }
        if ((i11 & 4) != 0) {
            str3 = likeEffectImpl.iconUnlikeLight;
        }
        if ((i11 & 8) != 0) {
            str4 = likeEffectImpl.effectId;
        }
        return likeEffectImpl.copy(str, str2, str3, str4);
    }

    public static /* synthetic */ void getEffectId$annotations() {
    }

    public static /* synthetic */ void getIconLike$annotations() {
    }

    public static /* synthetic */ void getIconUnlikeDark$annotations() {
    }

    public static /* synthetic */ void getIconUnlikeLight$annotations() {
    }

    public static final /* synthetic */ void write$Self$app_release(LikeEffectImpl likeEffectImpl, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || !AbstractC19074t.m100204b(likeEffectImpl.getIconLike(), "")) {
            interfaceC21886d.mo114035z(serialDescriptor, 0, likeEffectImpl.getIconLike());
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || !AbstractC19074t.m100204b(likeEffectImpl.getIconUnlikeDark(), "")) {
            interfaceC21886d.mo114035z(serialDescriptor, 1, likeEffectImpl.getIconUnlikeDark());
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || !AbstractC19074t.m100204b(likeEffectImpl.getIconUnlikeLight(), "")) {
            interfaceC21886d.mo114035z(serialDescriptor, 2, likeEffectImpl.getIconUnlikeLight());
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || !AbstractC19074t.m100204b(likeEffectImpl.getEffectId(), "")) {
            interfaceC21886d.mo114035z(serialDescriptor, 3, likeEffectImpl.getEffectId());
        }
    }

    public final String component1() {
        return this.iconLike;
    }

    public final String component2() {
        return this.iconUnlikeDark;
    }

    public final String component3() {
        return this.iconUnlikeLight;
    }

    public final String component4() {
        return this.effectId;
    }

    public final LikeEffectImpl copy(String str, String str2, String str3, String str4) {
        AbstractC19074t.m100208f(str, "iconLike");
        AbstractC19074t.m100208f(str2, "iconUnlikeDark");
        AbstractC19074t.m100208f(str3, "iconUnlikeLight");
        AbstractC19074t.m100208f(str4, "effectId");
        return new LikeEffectImpl(str, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LikeEffectImpl)) {
            return false;
        }
        LikeEffectImpl likeEffectImpl = (LikeEffectImpl) obj;
        return AbstractC19074t.m100204b(this.iconLike, likeEffectImpl.iconLike) && AbstractC19074t.m100204b(this.iconUnlikeDark, likeEffectImpl.iconUnlikeDark) && AbstractC19074t.m100204b(this.iconUnlikeLight, likeEffectImpl.iconUnlikeLight) && AbstractC19074t.m100204b(this.effectId, likeEffectImpl.effectId);
    }

    public String getEffectId() {
        return this.effectId;
    }

    public String getIconLike() {
        return this.iconLike;
    }

    public String getIconUnlikeDark() {
        return this.iconUnlikeDark;
    }

    public String getIconUnlikeLight() {
        return this.iconUnlikeLight;
    }

    public int hashCode() {
        return (((((this.iconLike.hashCode() * 31) + this.iconUnlikeDark.hashCode()) * 31) + this.iconUnlikeLight.hashCode()) * 31) + this.effectId.hashCode();
    }

    public String toString() {
        return "LikeEffectImpl(iconLike=" + this.iconLike + ", iconUnlikeDark=" + this.iconUnlikeDark + ", iconUnlikeLight=" + this.iconUnlikeLight + ", effectId=" + this.effectId + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.iconLike);
        parcel.writeString(this.iconUnlikeDark);
        parcel.writeString(this.iconUnlikeLight);
        parcel.writeString(this.effectId);
    }

    public /* synthetic */ LikeEffectImpl(int i11, String str, String str2, String str3, String str4, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.iconLike = "";
        } else {
            this.iconLike = str;
        }
        if ((i11 & 2) == 0) {
            this.iconUnlikeDark = "";
        } else {
            this.iconUnlikeDark = str2;
        }
        if ((i11 & 4) == 0) {
            this.iconUnlikeLight = "";
        } else {
            this.iconUnlikeLight = str3;
        }
        if ((i11 & 8) == 0) {
            this.effectId = "";
        } else {
            this.effectId = str4;
        }
    }

    public /* synthetic */ LikeEffectImpl(String str, String str2, String str3, String str4, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? "" : str4);
    }

    public LikeEffectImpl(String str, String str2, String str3, String str4) {
        AbstractC19074t.m100208f(str, "iconLike");
        AbstractC19074t.m100208f(str2, "iconUnlikeDark");
        AbstractC19074t.m100208f(str3, "iconUnlikeLight");
        AbstractC19074t.m100208f(str4, "effectId");
        this.iconLike = str;
        this.iconUnlikeDark = str2;
        this.iconUnlikeLight = str3;
        this.effectId = str4;
    }
}
