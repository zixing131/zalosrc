package com.zing.zalo.feed.mvp.profile.model.theme;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.biometric.AbstractC7354t0;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import p400oq.AbstractC24410a;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;

@InterfaceC25392g
@Keep
/* loaded from: classes4.dex */
public final class ContentImpl extends Content {
    private final int _arrowColor;
    private final int _bgIconColor;
    private final int _descColor;
    private final int _emptyBorderColor;
    private final int _iconColor;
    private final int _textColor01;
    private final int _textColor02;
    private final int _textIconColor;
    private int _titleColor;
    private final LikeEffectImpl likeEffect;
    private String thumb;
    private String title;
    private final int titleTypoid;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ContentImpl> CREATOR = new C8677a();

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return ContentImpl$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.model.theme.ContentImpl$a */
    /* loaded from: classes4.dex */
    public static final class C8677a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ContentImpl createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new ContentImpl(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), LikeEffectImpl.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ContentImpl[] newArray(int i11) {
            return new ContentImpl[i11];
        }
    }

    public ContentImpl() {
        this(0, 0, 0, 0, 0, 0, 0, (String) null, 0, 0, (LikeEffectImpl) null, (String) null, 0, 8191, (AbstractC19060k) null);
    }

    public static /* synthetic */ void getLikeEffect$annotations() {
    }

    public static /* synthetic */ void getTitleTypoid$annotations() {
    }

    public static /* synthetic */ void get_arrowColor$annotations() {
    }

    public static /* synthetic */ void get_bgIconColor$annotations() {
    }

    public static /* synthetic */ void get_descColor$annotations() {
    }

    public static /* synthetic */ void get_emptyBorderColor$annotations() {
    }

    public static /* synthetic */ void get_iconColor$annotations() {
    }

    public static /* synthetic */ void get_textColor01$annotations() {
    }

    public static /* synthetic */ void get_textColor02$annotations() {
    }

    public static /* synthetic */ void get_textIconColor$annotations() {
    }

    public static /* synthetic */ void get_titleColor$annotations() {
    }

    public static final /* synthetic */ void write$Self$app_release(ContentImpl contentImpl, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || contentImpl._textColor01 != 0) {
            interfaceC21886d.mo114033x(serialDescriptor, 0, contentImpl._textColor01);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || contentImpl._textColor02 != 0) {
            interfaceC21886d.mo114033x(serialDescriptor, 1, contentImpl._textColor02);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || contentImpl._arrowColor != 0) {
            interfaceC21886d.mo114033x(serialDescriptor, 2, contentImpl._arrowColor);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || contentImpl._iconColor != 0) {
            interfaceC21886d.mo114033x(serialDescriptor, 3, contentImpl._iconColor);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || contentImpl._bgIconColor != 0) {
            interfaceC21886d.mo114033x(serialDescriptor, 4, contentImpl._bgIconColor);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 5) || contentImpl._textIconColor != 0) {
            interfaceC21886d.mo114033x(serialDescriptor, 5, contentImpl._textIconColor);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 6) || contentImpl._emptyBorderColor != 0) {
            interfaceC21886d.mo114033x(serialDescriptor, 6, contentImpl._emptyBorderColor);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 7) || !AbstractC19074t.m100204b(contentImpl.getThumb(), "")) {
            interfaceC21886d.mo114035z(serialDescriptor, 7, contentImpl.getThumb());
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 8) || contentImpl._titleColor != 0) {
            interfaceC21886d.mo114033x(serialDescriptor, 8, contentImpl._titleColor);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 9) || contentImpl._descColor != 0) {
            interfaceC21886d.mo114033x(serialDescriptor, 9, contentImpl._descColor);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 10) || !AbstractC19074t.m100204b(contentImpl.getLikeEffect(), new LikeEffectImpl((String) null, (String) null, (String) null, (String) null, 15, (AbstractC19060k) null))) {
            interfaceC21886d.mo114029i(serialDescriptor, 10, LikeEffectImpl$$serializer.INSTANCE, contentImpl.getLikeEffect());
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 11) || !AbstractC19074t.m100204b(contentImpl.getTitle(), "")) {
            interfaceC21886d.mo114035z(serialDescriptor, 11, contentImpl.getTitle());
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 12) || contentImpl.getTitleTypoid() != 0) {
            interfaceC21886d.mo114033x(serialDescriptor, 12, contentImpl.getTitleTypoid());
        }
    }

    public final int component1() {
        return this._textColor01;
    }

    public final int component10() {
        return this._descColor;
    }

    public final LikeEffectImpl component11() {
        return this.likeEffect;
    }

    public final String component12() {
        return this.title;
    }

    public final int component13() {
        return this.titleTypoid;
    }

    public final int component2() {
        return this._textColor02;
    }

    public final int component3() {
        return this._arrowColor;
    }

    public final int component4() {
        return this._iconColor;
    }

    public final int component5() {
        return this._bgIconColor;
    }

    public final int component6() {
        return this._textIconColor;
    }

    public final int component7() {
        return this._emptyBorderColor;
    }

    public final String component8() {
        return this.thumb;
    }

    public final int component9() {
        return this._titleColor;
    }

    public final ContentImpl copy(int i11, int i12, int i13, int i14, int i15, int i16, int i17, String str, int i18, int i19, LikeEffectImpl likeEffectImpl, String str2, int i21) {
        AbstractC19074t.m100208f(str, "thumb");
        AbstractC19074t.m100208f(likeEffectImpl, "likeEffect");
        AbstractC19074t.m100208f(str2, "title");
        return new ContentImpl(i11, i12, i13, i14, i15, i16, i17, str, i18, i19, likeEffectImpl, str2, i21);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentImpl)) {
            return false;
        }
        ContentImpl contentImpl = (ContentImpl) obj;
        return this._textColor01 == contentImpl._textColor01 && this._textColor02 == contentImpl._textColor02 && this._arrowColor == contentImpl._arrowColor && this._iconColor == contentImpl._iconColor && this._bgIconColor == contentImpl._bgIconColor && this._textIconColor == contentImpl._textIconColor && this._emptyBorderColor == contentImpl._emptyBorderColor && AbstractC19074t.m100204b(this.thumb, contentImpl.thumb) && this._titleColor == contentImpl._titleColor && this._descColor == contentImpl._descColor && AbstractC19074t.m100204b(this.likeEffect, contentImpl.likeEffect) && AbstractC19074t.m100204b(this.title, contentImpl.title) && this.titleTypoid == contentImpl.titleTypoid;
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.theme.Content
    public int getArrowColor() {
        return AbstractC24410a.m127667a(this._arrowColor, 0, C23212s8.m119606n(AbstractC2807a.icon_01));
    }

    public int getBgIconColor() {
        return AbstractC24410a.m127667a(this._bgIconColor, 0, -723465);
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.theme.Content
    public int getDescColor() {
        return AbstractC24410a.m127667a(this._descColor, 0, C23212s8.m119606n(AbstractC2807a.text_02));
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.theme.Content
    public int getEmptyBorderColor() {
        return AbstractC24410a.m127667a(this._emptyBorderColor, 0, C23212s8.m119606n(AbstractC16781w.HeaderFormBottomLineColor));
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.theme.Content
    public int getIconColor() {
        return AbstractC24410a.m127667a(this._iconColor, 0, C23212s8.m119606n(AbstractC7354t0.NormalIconWhiteHeaderColor));
    }

    public LikeEffectImpl getLikeEffect() {
        return this.likeEffect;
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.theme.Content
    public int getTextColor01() {
        return AbstractC24410a.m127667a(this._textColor01, 0, C23212s8.m119606n(AbstractC2807a.text_01));
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.theme.Content
    public int getTextColor02() {
        return AbstractC24410a.m127667a(this._textColor02, 0, C23212s8.m119606n(AbstractC2807a.text_02));
    }

    public int getTextIconColor() {
        return AbstractC24410a.m127667a(this._textIconColor, 0, C23212s8.m119606n(AbstractC21196a.TextColor2));
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.theme.Content
    public String getThumb() {
        return this.thumb;
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.theme.Content
    public String getTitle() {
        return this.title;
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.theme.Content
    public int getTitleColor() {
        return AbstractC24410a.m127667a(this._titleColor, 0, C23212s8.m119606n(AbstractC2807a.text_01));
    }

    public int getTitleTypoid() {
        return this.titleTypoid;
    }

    public final int get_arrowColor() {
        return this._arrowColor;
    }

    public final int get_bgIconColor() {
        return this._bgIconColor;
    }

    public final int get_descColor() {
        return this._descColor;
    }

    public final int get_emptyBorderColor() {
        return this._emptyBorderColor;
    }

    public final int get_iconColor() {
        return this._iconColor;
    }

    public final int get_textColor01() {
        return this._textColor01;
    }

    public final int get_textColor02() {
        return this._textColor02;
    }

    public final int get_textIconColor() {
        return this._textIconColor;
    }

    public final int get_titleColor() {
        return this._titleColor;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this._textColor01 * 31) + this._textColor02) * 31) + this._arrowColor) * 31) + this._iconColor) * 31) + this._bgIconColor) * 31) + this._textIconColor) * 31) + this._emptyBorderColor) * 31) + this.thumb.hashCode()) * 31) + this._titleColor) * 31) + this._descColor) * 31) + this.likeEffect.hashCode()) * 31) + this.title.hashCode()) * 31) + this.titleTypoid;
    }

    public void setThumb(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.thumb = str;
    }

    public void setTitle(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.title = str;
    }

    public final void set_titleColor(int i11) {
        this._titleColor = i11;
    }

    public String toString() {
        return "ContentImpl(_textColor01=" + this._textColor01 + ", _textColor02=" + this._textColor02 + ", _arrowColor=" + this._arrowColor + ", _iconColor=" + this._iconColor + ", _bgIconColor=" + this._bgIconColor + ", _textIconColor=" + this._textIconColor + ", _emptyBorderColor=" + this._emptyBorderColor + ", thumb=" + this.thumb + ", _titleColor=" + this._titleColor + ", _descColor=" + this._descColor + ", likeEffect=" + this.likeEffect + ", title=" + this.title + ", titleTypoid=" + this.titleTypoid + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeInt(this._textColor01);
        parcel.writeInt(this._textColor02);
        parcel.writeInt(this._arrowColor);
        parcel.writeInt(this._iconColor);
        parcel.writeInt(this._bgIconColor);
        parcel.writeInt(this._textIconColor);
        parcel.writeInt(this._emptyBorderColor);
        parcel.writeString(this.thumb);
        parcel.writeInt(this._titleColor);
        parcel.writeInt(this._descColor);
        this.likeEffect.writeToParcel(parcel, i11);
        parcel.writeString(this.title);
        parcel.writeInt(this.titleTypoid);
    }

    public /* synthetic */ ContentImpl(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, String str, int i19, int i21, LikeEffectImpl likeEffectImpl, String str2, int i22, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this._textColor01 = 0;
        } else {
            this._textColor01 = i12;
        }
        if ((i11 & 2) == 0) {
            this._textColor02 = 0;
        } else {
            this._textColor02 = i13;
        }
        if ((i11 & 4) == 0) {
            this._arrowColor = 0;
        } else {
            this._arrowColor = i14;
        }
        if ((i11 & 8) == 0) {
            this._iconColor = 0;
        } else {
            this._iconColor = i15;
        }
        if ((i11 & 16) == 0) {
            this._bgIconColor = 0;
        } else {
            this._bgIconColor = i16;
        }
        if ((i11 & 32) == 0) {
            this._textIconColor = 0;
        } else {
            this._textIconColor = i17;
        }
        if ((i11 & 64) == 0) {
            this._emptyBorderColor = 0;
        } else {
            this._emptyBorderColor = i18;
        }
        if ((i11 & 128) == 0) {
            this.thumb = "";
        } else {
            this.thumb = str;
        }
        if ((i11 & 256) == 0) {
            this._titleColor = 0;
        } else {
            this._titleColor = i19;
        }
        if ((i11 & 512) == 0) {
            this._descColor = 0;
        } else {
            this._descColor = i21;
        }
        this.likeEffect = (i11 & 1024) == 0 ? new LikeEffectImpl((String) null, (String) null, (String) null, (String) null, 15, (AbstractC19060k) null) : likeEffectImpl;
        if ((i11 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i11 & 4096) == 0) {
            this.titleTypoid = 0;
        } else {
            this.titleTypoid = i22;
        }
    }

    public /* synthetic */ ContentImpl(int i11, int i12, int i13, int i14, int i15, int i16, int i17, String str, int i18, int i19, LikeEffectImpl likeEffectImpl, String str2, int i21, int i22, AbstractC19060k abstractC19060k) {
        this((i22 & 1) != 0 ? 0 : i11, (i22 & 2) != 0 ? 0 : i12, (i22 & 4) != 0 ? 0 : i13, (i22 & 8) != 0 ? 0 : i14, (i22 & 16) != 0 ? 0 : i15, (i22 & 32) != 0 ? 0 : i16, (i22 & 64) != 0 ? 0 : i17, (i22 & 128) != 0 ? "" : str, (i22 & 256) != 0 ? 0 : i18, (i22 & 512) != 0 ? 0 : i19, (i22 & 1024) != 0 ? new LikeEffectImpl((String) null, (String) null, (String) null, (String) null, 15, (AbstractC19060k) null) : likeEffectImpl, (i22 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) == 0 ? str2 : "", (i22 & 4096) == 0 ? i21 : 0);
    }

    public ContentImpl(int i11, int i12, int i13, int i14, int i15, int i16, int i17, String str, int i18, int i19, LikeEffectImpl likeEffectImpl, String str2, int i21) {
        AbstractC19074t.m100208f(str, "thumb");
        AbstractC19074t.m100208f(likeEffectImpl, "likeEffect");
        AbstractC19074t.m100208f(str2, "title");
        this._textColor01 = i11;
        this._textColor02 = i12;
        this._arrowColor = i13;
        this._iconColor = i14;
        this._bgIconColor = i15;
        this._textIconColor = i16;
        this._emptyBorderColor = i17;
        this.thumb = str;
        this._titleColor = i18;
        this._descColor = i19;
        this.likeEffect = likeEffectImpl;
        this.title = str2;
        this.titleTypoid = i21;
    }
}
