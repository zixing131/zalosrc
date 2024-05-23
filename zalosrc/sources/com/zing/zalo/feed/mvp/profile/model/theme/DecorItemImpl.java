package com.zing.zalo.feed.mvp.profile.model.theme;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.zing.zalo.AbstractC16781w;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import me0.C23212s8;
import p400oq.AbstractC24410a;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;

@InterfaceC25392g
@Keep
/* loaded from: classes4.dex */
public final class DecorItemImpl extends DecorItem {
    private final int _bgColor;
    private final int _bgStrokeColor;
    private final String decorUrl;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DecorItemImpl> CREATOR = new C8679a();

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return DecorItemImpl$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.model.theme.DecorItemImpl$a */
    /* loaded from: classes4.dex */
    public static final class C8679a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DecorItemImpl createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new DecorItemImpl(parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DecorItemImpl[] newArray(int i11) {
            return new DecorItemImpl[i11];
        }
    }

    public DecorItemImpl() {
        this(0, 0, (String) null, 7, (AbstractC19060k) null);
    }

    public static /* synthetic */ DecorItemImpl copy$default(DecorItemImpl decorItemImpl, int i11, int i12, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = decorItemImpl._bgColor;
        }
        if ((i13 & 2) != 0) {
            i12 = decorItemImpl._bgStrokeColor;
        }
        if ((i13 & 4) != 0) {
            str = decorItemImpl.decorUrl;
        }
        return decorItemImpl.copy(i11, i12, str);
    }

    public static /* synthetic */ void getDecorUrl$annotations() {
    }

    public static /* synthetic */ void get_bgColor$annotations() {
    }

    public static /* synthetic */ void get_bgStrokeColor$annotations() {
    }

    public static final /* synthetic */ void write$Self$app_release(DecorItemImpl decorItemImpl, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || decorItemImpl._bgColor != 0) {
            interfaceC21886d.mo114033x(serialDescriptor, 0, decorItemImpl._bgColor);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || decorItemImpl._bgStrokeColor != 0) {
            interfaceC21886d.mo114033x(serialDescriptor, 1, decorItemImpl._bgStrokeColor);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || !AbstractC19074t.m100204b(decorItemImpl.getDecorUrl(), "")) {
            interfaceC21886d.mo114035z(serialDescriptor, 2, decorItemImpl.getDecorUrl());
        }
    }

    public final int component1() {
        return this._bgColor;
    }

    public final int component2() {
        return this._bgStrokeColor;
    }

    public final String component3() {
        return this.decorUrl;
    }

    public final DecorItemImpl copy(int i11, int i12, String str) {
        AbstractC19074t.m100208f(str, "decorUrl");
        return new DecorItemImpl(i11, i12, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DecorItemImpl)) {
            return false;
        }
        DecorItemImpl decorItemImpl = (DecorItemImpl) obj;
        return this._bgColor == decorItemImpl._bgColor && this._bgStrokeColor == decorItemImpl._bgStrokeColor && AbstractC19074t.m100204b(this.decorUrl, decorItemImpl.decorUrl);
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.theme.DecorItem
    public int getBgColor() {
        return AbstractC24410a.m127667a(this._bgColor, 0, C23212s8.m119606n(AbstractC16781w.FeedAlbumThemeDefaultBackgroundColor));
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.theme.DecorItem
    public int getBgStrokeColor() {
        return AbstractC24410a.m127667a(this._bgStrokeColor, 0, C23212s8.m119606n(AbstractC16781w.FeedAlbumThemeDefaultStrokeColor));
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.theme.DecorItem
    public String getDecorUrl() {
        return this.decorUrl;
    }

    public final int get_bgColor() {
        return this._bgColor;
    }

    public final int get_bgStrokeColor() {
        return this._bgStrokeColor;
    }

    public int hashCode() {
        return (((this._bgColor * 31) + this._bgStrokeColor) * 31) + this.decorUrl.hashCode();
    }

    public String toString() {
        return "DecorItemImpl(_bgColor=" + this._bgColor + ", _bgStrokeColor=" + this._bgStrokeColor + ", decorUrl=" + this.decorUrl + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeInt(this._bgColor);
        parcel.writeInt(this._bgStrokeColor);
        parcel.writeString(this.decorUrl);
    }

    public /* synthetic */ DecorItemImpl(int i11, int i12, int i13, String str, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this._bgColor = 0;
        } else {
            this._bgColor = i12;
        }
        if ((i11 & 2) == 0) {
            this._bgStrokeColor = 0;
        } else {
            this._bgStrokeColor = i13;
        }
        if ((i11 & 4) == 0) {
            this.decorUrl = "";
        } else {
            this.decorUrl = str;
        }
    }

    public /* synthetic */ DecorItemImpl(int i11, int i12, String str, int i13, AbstractC19060k abstractC19060k) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12, (i13 & 4) != 0 ? "" : str);
    }

    public DecorItemImpl(int i11, int i12, String str) {
        AbstractC19074t.m100208f(str, "decorUrl");
        this._bgColor = i11;
        this._bgStrokeColor = i12;
        this.decorUrl = str;
    }
}
