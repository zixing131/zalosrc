package com.zing.zalo.feed.mvp.profile.model.theme;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.zing.zalo.AbstractC16781w;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import me0.C23212s8;
import p400oq.AbstractC24410a;
import qm0.AbstractC25368s;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;
import tn0.C26788f;

@InterfaceC25392g
@Keep
/* loaded from: classes4.dex */
public final class DecorAlbumImpl extends DecorAlbum {
    private final int _bgColor;
    private final List<ImageImpl> images;
    private final TopGradientImpl topGradient;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DecorAlbumImpl> CREATOR = new C8678a();
    private static final KSerializer[] $childSerializers = {null, new C26788f(ImageImpl$$serializer.INSTANCE), null};

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return DecorAlbumImpl$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.model.theme.DecorAlbumImpl$a */
    /* loaded from: classes4.dex */
    public static final class C8678a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DecorAlbumImpl createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i11 = 0; i11 != readInt2; i11++) {
                arrayList.add(ImageImpl.CREATOR.createFromParcel(parcel));
            }
            return new DecorAlbumImpl(readInt, arrayList, TopGradientImpl.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DecorAlbumImpl[] newArray(int i11) {
            return new DecorAlbumImpl[i11];
        }
    }

    public DecorAlbumImpl() {
        this(0, (List) null, (TopGradientImpl) null, 7, (AbstractC19060k) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DecorAlbumImpl copy$default(DecorAlbumImpl decorAlbumImpl, int i11, List list, TopGradientImpl topGradientImpl, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = decorAlbumImpl._bgColor;
        }
        if ((i12 & 2) != 0) {
            list = decorAlbumImpl.images;
        }
        if ((i12 & 4) != 0) {
            topGradientImpl = decorAlbumImpl.topGradient;
        }
        return decorAlbumImpl.copy(i11, list, topGradientImpl);
    }

    public static /* synthetic */ void getImages$annotations() {
    }

    public static /* synthetic */ void getTopGradient$annotations() {
    }

    public static /* synthetic */ void get_bgColor$annotations() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:            if (fn0.AbstractC19074t.m100204b(r3, r4) == false) goto L13;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$app_release(DecorAlbumImpl decorAlbumImpl, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        List m131502j;
        KSerializer[] kSerializerArr = $childSerializers;
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || decorAlbumImpl._bgColor != 0) {
            interfaceC21886d.mo114033x(serialDescriptor, 0, decorAlbumImpl._bgColor);
        }
        if (!interfaceC21886d.mo114019A(serialDescriptor, 1)) {
            List<ImageImpl> images = decorAlbumImpl.getImages();
            m131502j = AbstractC25368s.m131502j();
        }
        interfaceC21886d.mo114029i(serialDescriptor, 1, kSerializerArr[1], decorAlbumImpl.getImages());
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || !AbstractC19074t.m100204b(decorAlbumImpl.getTopGradient(), new TopGradientImpl(0, 0, 3, (AbstractC19060k) null))) {
            interfaceC21886d.mo114029i(serialDescriptor, 2, TopGradientImpl$$serializer.INSTANCE, decorAlbumImpl.getTopGradient());
        }
    }

    public final int component1() {
        return this._bgColor;
    }

    public final List<ImageImpl> component2() {
        return this.images;
    }

    public final TopGradientImpl component3() {
        return this.topGradient;
    }

    public final DecorAlbumImpl copy(int i11, List<ImageImpl> list, TopGradientImpl topGradientImpl) {
        AbstractC19074t.m100208f(list, "images");
        AbstractC19074t.m100208f(topGradientImpl, "topGradient");
        return new DecorAlbumImpl(i11, list, topGradientImpl);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DecorAlbumImpl)) {
            return false;
        }
        DecorAlbumImpl decorAlbumImpl = (DecorAlbumImpl) obj;
        return this._bgColor == decorAlbumImpl._bgColor && AbstractC19074t.m100204b(this.images, decorAlbumImpl.images) && AbstractC19074t.m100204b(this.topGradient, decorAlbumImpl.topGradient);
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.theme.DecorAlbum
    public int getBgColor() {
        return AbstractC24410a.m127667a(this._bgColor, 0, C23212s8.m119606n(AbstractC16781w.FeedDetailThemeDefaultBackgroundColor));
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.theme.DecorAlbum
    public List<ImageImpl> getImages() {
        return this.images;
    }

    public TopGradientImpl getTopGradient() {
        return this.topGradient;
    }

    public final int get_bgColor() {
        return this._bgColor;
    }

    public int hashCode() {
        return (((this._bgColor * 31) + this.images.hashCode()) * 31) + this.topGradient.hashCode();
    }

    public String toString() {
        return "DecorAlbumImpl(_bgColor=" + this._bgColor + ", images=" + this.images + ", topGradient=" + this.topGradient + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeInt(this._bgColor);
        List<ImageImpl> list = this.images;
        parcel.writeInt(list.size());
        Iterator<ImageImpl> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i11);
        }
        this.topGradient.writeToParcel(parcel, i11);
    }

    public /* synthetic */ DecorAlbumImpl(int i11, int i12, List list, TopGradientImpl topGradientImpl, AbstractC26805k1 abstractC26805k1) {
        List<ImageImpl> m131502j;
        if ((i11 & 1) == 0) {
            this._bgColor = 0;
        } else {
            this._bgColor = i12;
        }
        if ((i11 & 2) == 0) {
            m131502j = AbstractC25368s.m131502j();
            this.images = m131502j;
        } else {
            this.images = list;
        }
        if ((i11 & 4) == 0) {
            this.topGradient = new TopGradientImpl(0, 0, 3, (AbstractC19060k) null);
        } else {
            this.topGradient = topGradientImpl;
        }
    }

    public /* synthetic */ DecorAlbumImpl(int i11, List list, TopGradientImpl topGradientImpl, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? AbstractC25368s.m131502j() : list, (i12 & 4) != 0 ? new TopGradientImpl(0, 0, 3, (AbstractC19060k) null) : topGradientImpl);
    }

    public DecorAlbumImpl(int i11, List<ImageImpl> list, TopGradientImpl topGradientImpl) {
        AbstractC19074t.m100208f(list, "images");
        AbstractC19074t.m100208f(topGradientImpl, "topGradient");
        this._bgColor = i11;
        this.images = list;
        this.topGradient = topGradientImpl;
    }
}
