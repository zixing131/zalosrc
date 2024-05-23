package com.zing.zalo.feed.mvp.profile.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.zing.zalo.feed.mvp.profile.model.theme.ThemeItem;
import com.zing.zalo.feed.mvp.profile.model.theme.ThemeItemImpl;
import com.zing.zalo.feed.mvp.profile.model.theme.ThemeItemImpl$$serializer;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jn0.AbstractC21317c;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qm0.AbstractC25332a0;
import qm0.AbstractC25366r;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;
import tn0.C26788f;

@InterfaceC25392g
@Keep
/* loaded from: classes4.dex */
public final class ProfileAlbumThemeCollectionImpl implements ProfileAlbumThemeCollection {
    private final List<ThemeItemImpl> themes;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ProfileAlbumThemeCollectionImpl> CREATOR = new C8668a();
    private static final KSerializer[] $childSerializers = {new C26788f(ThemeItemImpl$$serializer.INSTANCE)};

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return ProfileAlbumThemeCollectionImpl$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.model.ProfileAlbumThemeCollectionImpl$a */
    /* loaded from: classes4.dex */
    public static final class C8668a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ProfileAlbumThemeCollectionImpl createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i11 = 0; i11 != readInt; i11++) {
                arrayList.add(ThemeItemImpl.CREATOR.createFromParcel(parcel));
            }
            return new ProfileAlbumThemeCollectionImpl(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ProfileAlbumThemeCollectionImpl[] newArray(int i11) {
            return new ProfileAlbumThemeCollectionImpl[i11];
        }
    }

    public ProfileAlbumThemeCollectionImpl() {
        this((List) null, 1, (AbstractC19060k) (0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProfileAlbumThemeCollectionImpl copy$default(ProfileAlbumThemeCollectionImpl profileAlbumThemeCollectionImpl, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = profileAlbumThemeCollectionImpl.themes;
        }
        return profileAlbumThemeCollectionImpl.copy(list);
    }

    public static final /* synthetic */ void write$Self$app_release(ProfileAlbumThemeCollectionImpl profileAlbumThemeCollectionImpl, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        List m131496e;
        KSerializer[] kSerializerArr = $childSerializers;
        if (!interfaceC21886d.mo114019A(serialDescriptor, 0)) {
            List<ThemeItemImpl> themes = profileAlbumThemeCollectionImpl.getThemes();
            ThemeItem m46365a = ThemeItem.Companion.m46365a();
            AbstractC19074t.m100206d(m46365a, "null cannot be cast to non-null type com.zing.zalo.feed.mvp.profile.model.theme.ThemeItemImpl");
            m131496e = AbstractC25366r.m131496e((ThemeItemImpl) m46365a);
            if (AbstractC19074t.m100204b(themes, m131496e)) {
                return;
            }
        }
        interfaceC21886d.mo114029i(serialDescriptor, 0, kSerializerArr[0], profileAlbumThemeCollectionImpl.getThemes());
    }

    public final List<ThemeItemImpl> component1() {
        return this.themes;
    }

    public final ProfileAlbumThemeCollectionImpl copy(List<ThemeItemImpl> list) {
        AbstractC19074t.m100208f(list, "themes");
        return new ProfileAlbumThemeCollectionImpl(list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProfileAlbumThemeCollectionImpl) && AbstractC19074t.m100204b(this.themes, ((ProfileAlbumThemeCollectionImpl) obj).themes);
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.ProfileAlbumThemeCollection
    public ThemeItem getTheme(int i11) {
        Object obj;
        Iterator<T> it = getThemes().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((ThemeItemImpl) obj).getId() == i11) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        ThemeItemImpl themeItemImpl = (ThemeItemImpl) obj;
        if (themeItemImpl == null) {
            return ThemeItem.Companion.m46365a();
        }
        return themeItemImpl;
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.ProfileAlbumThemeCollection
    public List<ThemeItemImpl> getThemes() {
        return this.themes;
    }

    public int hashCode() {
        return this.themes.hashCode();
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.ProfileAlbumThemeCollection
    public ThemeItem randomizeTheme() {
        Object m131224x0;
        Object m131205e0;
        if (getThemes().isEmpty()) {
            return ThemeItem.Companion.m46365a();
        }
        List<ThemeItemImpl> themes = getThemes();
        ArrayList arrayList = new ArrayList();
        for (Object obj : themes) {
            if (((ThemeItemImpl) obj).getId() != 0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            m131205e0 = AbstractC25332a0.m131205e0(getThemes());
            return (ThemeItemImpl) m131205e0;
        }
        m131224x0 = AbstractC25332a0.m131224x0(arrayList, AbstractC21317c.f103810p);
        return (ThemeItemImpl) m131224x0;
    }

    public String toString() {
        return "ProfileAlbumThemeCollectionImpl(themes=" + this.themes + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        List<ThemeItemImpl> list = this.themes;
        parcel.writeInt(list.size());
        Iterator<ThemeItemImpl> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i11);
        }
    }

    public /* synthetic */ ProfileAlbumThemeCollectionImpl(int i11, List list, AbstractC26805k1 abstractC26805k1) {
        List<ThemeItemImpl> m131496e;
        if ((i11 & 1) != 0) {
            this.themes = list;
            return;
        }
        ThemeItem m46365a = ThemeItem.Companion.m46365a();
        AbstractC19074t.m100206d(m46365a, "null cannot be cast to non-null type com.zing.zalo.feed.mvp.profile.model.theme.ThemeItemImpl");
        m131496e = AbstractC25366r.m131496e((ThemeItemImpl) m46365a);
        this.themes = m131496e;
    }

    public ProfileAlbumThemeCollectionImpl(List<ThemeItemImpl> list) {
        AbstractC19074t.m100208f(list, "themes");
        this.themes = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ProfileAlbumThemeCollectionImpl(List list, int i11, AbstractC19060k abstractC19060k) {
        this(list);
        if ((i11 & 1) != 0) {
            ThemeItem m46365a = ThemeItem.Companion.m46365a();
            AbstractC19074t.m100206d(m46365a, "null cannot be cast to non-null type com.zing.zalo.feed.mvp.profile.model.theme.ThemeItemImpl");
            list = AbstractC25366r.m131496e((ThemeItemImpl) m46365a);
        }
    }
}
