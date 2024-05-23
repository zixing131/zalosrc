package com.zing.zalo.feed.mvp.profile.model.theme;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
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
public final class ImageImpl extends Image {
    private int anchorType;
    private float scale;
    private final String scaleType;
    private float translateX;
    private float translateY;
    private final String url;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ImageImpl> CREATOR = new C8681a();

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return ImageImpl$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.model.theme.ImageImpl$a */
    /* loaded from: classes4.dex */
    public static final class C8681a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ImageImpl createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new ImageImpl(parcel.readString(), parcel.readInt(), parcel.readFloat(), parcel.readFloat(), parcel.readString(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ImageImpl[] newArray(int i11) {
            return new ImageImpl[i11];
        }
    }

    public ImageImpl() {
        this((String) null, 0, 0.0f, 0.0f, (String) null, 0.0f, 63, (AbstractC19060k) null);
    }

    public static /* synthetic */ ImageImpl copy$default(ImageImpl imageImpl, String str, int i11, float f11, float f12, String str2, float f13, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = imageImpl.url;
        }
        if ((i12 & 2) != 0) {
            i11 = imageImpl.anchorType;
        }
        int i13 = i11;
        if ((i12 & 4) != 0) {
            f11 = imageImpl.translateX;
        }
        float f14 = f11;
        if ((i12 & 8) != 0) {
            f12 = imageImpl.translateY;
        }
        float f15 = f12;
        if ((i12 & 16) != 0) {
            str2 = imageImpl.scaleType;
        }
        String str3 = str2;
        if ((i12 & 32) != 0) {
            f13 = imageImpl.scale;
        }
        return imageImpl.copy(str, i13, f14, f15, str3, f13);
    }

    public static /* synthetic */ void getUrl$annotations() {
    }

    public static final /* synthetic */ void write$Self$app_release(ImageImpl imageImpl, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || !AbstractC19074t.m100204b(imageImpl.getUrl(), "")) {
            interfaceC21886d.mo114035z(serialDescriptor, 0, imageImpl.getUrl());
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || imageImpl.getAnchorType() != 1) {
            interfaceC21886d.mo114033x(serialDescriptor, 1, imageImpl.getAnchorType());
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || Float.compare(imageImpl.getTranslateX(), 0.0f) != 0) {
            interfaceC21886d.mo114032t(serialDescriptor, 2, imageImpl.getTranslateX());
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || Float.compare(imageImpl.getTranslateY(), 0.0f) != 0) {
            interfaceC21886d.mo114032t(serialDescriptor, 3, imageImpl.getTranslateY());
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || !AbstractC19074t.m100204b(imageImpl.getScaleType(), Image.SCALE_TYPE_NONE)) {
            interfaceC21886d.mo114035z(serialDescriptor, 4, imageImpl.getScaleType());
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 5) || Float.compare(imageImpl.getScale(), 0.0f) != 0) {
            interfaceC21886d.mo114032t(serialDescriptor, 5, imageImpl.getScale());
        }
    }

    public final String component1() {
        return this.url;
    }

    public final int component2() {
        return this.anchorType;
    }

    public final float component3() {
        return this.translateX;
    }

    public final float component4() {
        return this.translateY;
    }

    public final String component5() {
        return this.scaleType;
    }

    public final float component6() {
        return this.scale;
    }

    public final ImageImpl copy(String str, int i11, float f11, float f12, String str2, float f13) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(str2, "scaleType");
        return new ImageImpl(str, i11, f11, f12, str2, f13);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageImpl)) {
            return false;
        }
        ImageImpl imageImpl = (ImageImpl) obj;
        return AbstractC19074t.m100204b(this.url, imageImpl.url) && this.anchorType == imageImpl.anchorType && Float.compare(this.translateX, imageImpl.translateX) == 0 && Float.compare(this.translateY, imageImpl.translateY) == 0 && AbstractC19074t.m100204b(this.scaleType, imageImpl.scaleType) && Float.compare(this.scale, imageImpl.scale) == 0;
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.theme.Image
    public int getAnchorType() {
        return this.anchorType;
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.theme.Image
    public float getScale() {
        return this.scale;
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.theme.Image
    public String getScaleType() {
        return this.scaleType;
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.theme.Image
    public float getTranslateX() {
        return this.translateX;
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.theme.Image
    public float getTranslateY() {
        return this.translateY;
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.theme.Image
    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((((((((this.url.hashCode() * 31) + this.anchorType) * 31) + Float.floatToIntBits(this.translateX)) * 31) + Float.floatToIntBits(this.translateY)) * 31) + this.scaleType.hashCode()) * 31) + Float.floatToIntBits(this.scale);
    }

    public void setAnchorType(int i11) {
        this.anchorType = i11;
    }

    public void setScale(float f11) {
        this.scale = f11;
    }

    public void setTranslateX(float f11) {
        this.translateX = f11;
    }

    public void setTranslateY(float f11) {
        this.translateY = f11;
    }

    public String toString() {
        return "ImageImpl(url=" + this.url + ", anchorType=" + this.anchorType + ", translateX=" + this.translateX + ", translateY=" + this.translateY + ", scaleType=" + this.scaleType + ", scale=" + this.scale + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.url);
        parcel.writeInt(this.anchorType);
        parcel.writeFloat(this.translateX);
        parcel.writeFloat(this.translateY);
        parcel.writeString(this.scaleType);
        parcel.writeFloat(this.scale);
    }

    public /* synthetic */ ImageImpl(int i11, String str, int i12, float f11, float f12, String str2, float f13, AbstractC26805k1 abstractC26805k1) {
        this.url = (i11 & 1) == 0 ? "" : str;
        if ((i11 & 2) == 0) {
            this.anchorType = 1;
        } else {
            this.anchorType = i12;
        }
        if ((i11 & 4) == 0) {
            this.translateX = 0.0f;
        } else {
            this.translateX = f11;
        }
        if ((i11 & 8) == 0) {
            this.translateY = 0.0f;
        } else {
            this.translateY = f12;
        }
        if ((i11 & 16) == 0) {
            this.scaleType = Image.SCALE_TYPE_NONE;
        } else {
            this.scaleType = str2;
        }
        if ((i11 & 32) == 0) {
            this.scale = 0.0f;
        } else {
            this.scale = f13;
        }
    }

    public /* synthetic */ ImageImpl(String str, int i11, float f11, float f12, String str2, float f13, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? 1 : i11, (i12 & 4) != 0 ? 0.0f : f11, (i12 & 8) != 0 ? 0.0f : f12, (i12 & 16) != 0 ? Image.SCALE_TYPE_NONE : str2, (i12 & 32) == 0 ? f13 : 0.0f);
    }

    public ImageImpl(String str, int i11, float f11, float f12, String str2, float f13) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(str2, "scaleType");
        this.url = str;
        this.anchorType = i11;
        this.translateX = f11;
        this.translateY = f12;
        this.scaleType = str2;
        this.scale = f13;
    }
}
