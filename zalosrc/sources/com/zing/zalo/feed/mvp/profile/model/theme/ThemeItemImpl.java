package com.zing.zalo.feed.mvp.profile.model.theme;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import bi0.AbstractC2807a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import me0.C23212s8;
import org.json.JSONObject;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;
import un0.AbstractC27323a;

@InterfaceC25392g
@Keep
/* loaded from: classes4.dex */
public final class ThemeItemImpl extends ThemeItem {
    private final ContentImpl _content;
    private final ContentImpl _content_dm;
    private final DecorAlbumImpl _decorAlbum;
    private final DecorAlbumImpl _decorAlbum_dm;
    private final DecorItemImpl _decorItem;
    private final DecorItemImpl _decorItem_dm;
    private final int _id;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ThemeItemImpl> CREATOR = new C8685a();

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return ThemeItemImpl$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.model.theme.ThemeItemImpl$a */
    /* loaded from: classes4.dex */
    public static final class C8685a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final ThemeItemImpl createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            int readInt = parcel.readInt();
            Parcelable.Creator<DecorItemImpl> creator = DecorItemImpl.CREATOR;
            DecorItemImpl createFromParcel = creator.createFromParcel(parcel);
            DecorItemImpl createFromParcel2 = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
            Parcelable.Creator<DecorAlbumImpl> creator2 = DecorAlbumImpl.CREATOR;
            DecorAlbumImpl createFromParcel3 = creator2.createFromParcel(parcel);
            DecorAlbumImpl createFromParcel4 = parcel.readInt() == 0 ? null : creator2.createFromParcel(parcel);
            Parcelable.Creator<ContentImpl> creator3 = ContentImpl.CREATOR;
            return new ThemeItemImpl(readInt, createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, creator3.createFromParcel(parcel), parcel.readInt() != 0 ? creator3.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final ThemeItemImpl[] newArray(int i11) {
            return new ThemeItemImpl[i11];
        }
    }

    public ThemeItemImpl() {
        this(0, (DecorItemImpl) null, (DecorItemImpl) null, (DecorAlbumImpl) null, (DecorAlbumImpl) null, (ContentImpl) null, (ContentImpl) null, 127, (AbstractC19060k) null);
    }

    public static /* synthetic */ ThemeItemImpl copy$default(ThemeItemImpl themeItemImpl, int i11, DecorItemImpl decorItemImpl, DecorItemImpl decorItemImpl2, DecorAlbumImpl decorAlbumImpl, DecorAlbumImpl decorAlbumImpl2, ContentImpl contentImpl, ContentImpl contentImpl2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = themeItemImpl._id;
        }
        if ((i12 & 2) != 0) {
            decorItemImpl = themeItemImpl._decorItem;
        }
        DecorItemImpl decorItemImpl3 = decorItemImpl;
        if ((i12 & 4) != 0) {
            decorItemImpl2 = themeItemImpl._decorItem_dm;
        }
        DecorItemImpl decorItemImpl4 = decorItemImpl2;
        if ((i12 & 8) != 0) {
            decorAlbumImpl = themeItemImpl._decorAlbum;
        }
        DecorAlbumImpl decorAlbumImpl3 = decorAlbumImpl;
        if ((i12 & 16) != 0) {
            decorAlbumImpl2 = themeItemImpl._decorAlbum_dm;
        }
        DecorAlbumImpl decorAlbumImpl4 = decorAlbumImpl2;
        if ((i12 & 32) != 0) {
            contentImpl = themeItemImpl._content;
        }
        ContentImpl contentImpl3 = contentImpl;
        if ((i12 & 64) != 0) {
            contentImpl2 = themeItemImpl._content_dm;
        }
        return themeItemImpl.copy(i11, decorItemImpl3, decorItemImpl4, decorAlbumImpl3, decorAlbumImpl4, contentImpl3, contentImpl2);
    }

    public static /* synthetic */ void get_content$annotations() {
    }

    public static /* synthetic */ void get_content_dm$annotations() {
    }

    public static /* synthetic */ void get_decorAlbum$annotations() {
    }

    public static /* synthetic */ void get_decorAlbum_dm$annotations() {
    }

    public static /* synthetic */ void get_decorItem$annotations() {
    }

    public static /* synthetic */ void get_decorItem_dm$annotations() {
    }

    public static /* synthetic */ void get_id$annotations() {
    }

    public static final /* synthetic */ void write$Self$app_release(ThemeItemImpl themeItemImpl, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || themeItemImpl._id != -1) {
            interfaceC21886d.mo114033x(serialDescriptor, 0, themeItemImpl._id);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || !AbstractC19074t.m100204b(themeItemImpl._decorItem, new DecorItemImpl(0, 0, (String) null, 7, (AbstractC19060k) null))) {
            interfaceC21886d.mo114029i(serialDescriptor, 1, DecorItemImpl$$serializer.INSTANCE, themeItemImpl._decorItem);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || themeItemImpl._decorItem_dm != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 2, DecorItemImpl$$serializer.INSTANCE, themeItemImpl._decorItem_dm);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || !AbstractC19074t.m100204b(themeItemImpl._decorAlbum, new DecorAlbumImpl(0, (List) null, (TopGradientImpl) null, 7, (AbstractC19060k) null))) {
            interfaceC21886d.mo114029i(serialDescriptor, 3, DecorAlbumImpl$$serializer.INSTANCE, themeItemImpl._decorAlbum);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || themeItemImpl._decorAlbum_dm != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 4, DecorAlbumImpl$$serializer.INSTANCE, themeItemImpl._decorAlbum_dm);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 5) || !AbstractC19074t.m100204b(themeItemImpl._content, new ContentImpl(0, 0, 0, 0, 0, 0, 0, (String) null, 0, 0, (LikeEffectImpl) null, (String) null, 0, 8191, (AbstractC19060k) null))) {
            interfaceC21886d.mo114029i(serialDescriptor, 5, ContentImpl$$serializer.INSTANCE, themeItemImpl._content);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 6) || themeItemImpl._content_dm != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 6, ContentImpl$$serializer.INSTANCE, themeItemImpl._content_dm);
        }
    }

    public final int component1() {
        return this._id;
    }

    public final DecorItemImpl component2() {
        return this._decorItem;
    }

    public final DecorItemImpl component3() {
        return this._decorItem_dm;
    }

    public final DecorAlbumImpl component4() {
        return this._decorAlbum;
    }

    public final DecorAlbumImpl component5() {
        return this._decorAlbum_dm;
    }

    public final ContentImpl component6() {
        return this._content;
    }

    public final ContentImpl component7() {
        return this._content_dm;
    }

    public final ThemeItemImpl copy(int i11, DecorItemImpl decorItemImpl, DecorItemImpl decorItemImpl2, DecorAlbumImpl decorAlbumImpl, DecorAlbumImpl decorAlbumImpl2, ContentImpl contentImpl, ContentImpl contentImpl2) {
        AbstractC19074t.m100208f(decorItemImpl, "_decorItem");
        AbstractC19074t.m100208f(decorAlbumImpl, "_decorAlbum");
        AbstractC19074t.m100208f(contentImpl, "_content");
        return new ThemeItemImpl(i11, decorItemImpl, decorItemImpl2, decorAlbumImpl, decorAlbumImpl2, contentImpl, contentImpl2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThemeItemImpl)) {
            return false;
        }
        ThemeItemImpl themeItemImpl = (ThemeItemImpl) obj;
        return this._id == themeItemImpl._id && AbstractC19074t.m100204b(this._decorItem, themeItemImpl._decorItem) && AbstractC19074t.m100204b(this._decorItem_dm, themeItemImpl._decorItem_dm) && AbstractC19074t.m100204b(this._decorAlbum, themeItemImpl._decorAlbum) && AbstractC19074t.m100204b(this._decorAlbum_dm, themeItemImpl._decorAlbum_dm) && AbstractC19074t.m100204b(this._content, themeItemImpl._content) && AbstractC19074t.m100204b(this._content_dm, themeItemImpl._content_dm);
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.theme.ThemeItem
    public int getAlbumCaptionColor() {
        if (isThemeDefault()) {
            return C23212s8.m119606n(AbstractC2807a.text_02);
        }
        return getContent().getTitleColor();
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.theme.ThemeItem
    public Content getContent() {
        ContentImpl contentImpl;
        if (C23212s8.m119603k() || (contentImpl = this._content_dm) == null) {
            return this._content;
        }
        return contentImpl;
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.theme.ThemeItem
    public DecorAlbum getDecorAlbum() {
        DecorAlbumImpl decorAlbumImpl;
        if (C23212s8.m119603k() || (decorAlbumImpl = this._decorAlbum_dm) == null) {
            return this._decorAlbum;
        }
        return decorAlbumImpl;
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.theme.ThemeItem
    public DecorItem getDecorItem() {
        DecorItemImpl decorItemImpl;
        if (C23212s8.m119603k() || (decorItemImpl = this._decorItem_dm) == null) {
            return this._decorItem;
        }
        return decorItemImpl;
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.theme.ThemeItem
    public int getId() {
        int i11 = this._id;
        if (i11 == -1) {
            return 0;
        }
        return i11;
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.theme.ThemeItem
    public int getLineDividerColor() {
        if (isThemeDefault()) {
            return C23212s8.m119606n(AbstractC2807a.divider_02);
        }
        return getContent().getDescColor();
    }

    public final ContentImpl get_content() {
        return this._content;
    }

    public final ContentImpl get_content_dm() {
        return this._content_dm;
    }

    public final DecorAlbumImpl get_decorAlbum() {
        return this._decorAlbum;
    }

    public final DecorAlbumImpl get_decorAlbum_dm() {
        return this._decorAlbum_dm;
    }

    public final DecorItemImpl get_decorItem() {
        return this._decorItem;
    }

    public final DecorItemImpl get_decorItem_dm() {
        return this._decorItem_dm;
    }

    public final int get_id() {
        return this._id;
    }

    public int hashCode() {
        int hashCode = ((this._id * 31) + this._decorItem.hashCode()) * 31;
        DecorItemImpl decorItemImpl = this._decorItem_dm;
        int hashCode2 = (((hashCode + (decorItemImpl == null ? 0 : decorItemImpl.hashCode())) * 31) + this._decorAlbum.hashCode()) * 31;
        DecorAlbumImpl decorAlbumImpl = this._decorAlbum_dm;
        int hashCode3 = (((hashCode2 + (decorAlbumImpl == null ? 0 : decorAlbumImpl.hashCode())) * 31) + this._content.hashCode()) * 31;
        ContentImpl contentImpl = this._content_dm;
        return hashCode3 + (contentImpl != null ? contentImpl.hashCode() : 0);
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.theme.ThemeItem
    public JSONObject toJsonObject() {
        AbstractC27323a.a aVar = AbstractC27323a.f128573d;
        aVar.mo131586a();
        return new JSONObject(aVar.mo131597b(Companion.serializer(), this));
    }

    public String toJsonString() {
        AbstractC27323a.a aVar = AbstractC27323a.f128573d;
        aVar.mo131586a();
        return aVar.mo131597b(Companion.serializer(), this);
    }

    public String toString() {
        return "ThemeItemImpl(_id=" + this._id + ", _decorItem=" + this._decorItem + ", _decorItem_dm=" + this._decorItem_dm + ", _decorAlbum=" + this._decorAlbum + ", _decorAlbum_dm=" + this._decorAlbum_dm + ", _content=" + this._content + ", _content_dm=" + this._content_dm + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeInt(this._id);
        this._decorItem.writeToParcel(parcel, i11);
        DecorItemImpl decorItemImpl = this._decorItem_dm;
        if (decorItemImpl == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            decorItemImpl.writeToParcel(parcel, i11);
        }
        this._decorAlbum.writeToParcel(parcel, i11);
        DecorAlbumImpl decorAlbumImpl = this._decorAlbum_dm;
        if (decorAlbumImpl == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            decorAlbumImpl.writeToParcel(parcel, i11);
        }
        this._content.writeToParcel(parcel, i11);
        ContentImpl contentImpl = this._content_dm;
        if (contentImpl == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            contentImpl.writeToParcel(parcel, i11);
        }
    }

    public /* synthetic */ ThemeItemImpl(int i11, int i12, DecorItemImpl decorItemImpl, DecorItemImpl decorItemImpl2, DecorAlbumImpl decorAlbumImpl, DecorAlbumImpl decorAlbumImpl2, ContentImpl contentImpl, ContentImpl contentImpl2, AbstractC26805k1 abstractC26805k1) {
        this._id = (i11 & 1) == 0 ? -1 : i12;
        this._decorItem = (i11 & 2) == 0 ? new DecorItemImpl(0, 0, (String) null, 7, (AbstractC19060k) null) : decorItemImpl;
        if ((i11 & 4) == 0) {
            this._decorItem_dm = null;
        } else {
            this._decorItem_dm = decorItemImpl2;
        }
        this._decorAlbum = (i11 & 8) == 0 ? new DecorAlbumImpl(0, (List) null, (TopGradientImpl) null, 7, (AbstractC19060k) null) : decorAlbumImpl;
        if ((i11 & 16) == 0) {
            this._decorAlbum_dm = null;
        } else {
            this._decorAlbum_dm = decorAlbumImpl2;
        }
        this._content = (i11 & 32) == 0 ? new ContentImpl(0, 0, 0, 0, 0, 0, 0, (String) null, 0, 0, (LikeEffectImpl) null, (String) null, 0, 8191, (AbstractC19060k) null) : contentImpl;
        if ((i11 & 64) == 0) {
            this._content_dm = null;
        } else {
            this._content_dm = contentImpl2;
        }
    }

    public /* synthetic */ ThemeItemImpl(int i11, DecorItemImpl decorItemImpl, DecorItemImpl decorItemImpl2, DecorAlbumImpl decorAlbumImpl, DecorAlbumImpl decorAlbumImpl2, ContentImpl contentImpl, ContentImpl contentImpl2, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? -1 : i11, (i12 & 2) != 0 ? new DecorItemImpl(0, 0, (String) null, 7, (AbstractC19060k) null) : decorItemImpl, (i12 & 4) != 0 ? null : decorItemImpl2, (i12 & 8) != 0 ? new DecorAlbumImpl(0, (List) null, (TopGradientImpl) null, 7, (AbstractC19060k) null) : decorAlbumImpl, (i12 & 16) != 0 ? null : decorAlbumImpl2, (i12 & 32) != 0 ? new ContentImpl(0, 0, 0, 0, 0, 0, 0, (String) null, 0, 0, (LikeEffectImpl) null, (String) null, 0, 8191, (AbstractC19060k) null) : contentImpl, (i12 & 64) == 0 ? contentImpl2 : null);
    }

    public ThemeItemImpl(int i11, DecorItemImpl decorItemImpl, DecorItemImpl decorItemImpl2, DecorAlbumImpl decorAlbumImpl, DecorAlbumImpl decorAlbumImpl2, ContentImpl contentImpl, ContentImpl contentImpl2) {
        AbstractC19074t.m100208f(decorItemImpl, "_decorItem");
        AbstractC19074t.m100208f(decorAlbumImpl, "_decorAlbum");
        AbstractC19074t.m100208f(contentImpl, "_content");
        this._id = i11;
        this._decorItem = decorItemImpl;
        this._decorItem_dm = decorItemImpl2;
        this._decorAlbum = decorAlbumImpl;
        this._decorAlbum_dm = decorAlbumImpl2;
        this._content = contentImpl;
        this._content_dm = contentImpl2;
    }
}
