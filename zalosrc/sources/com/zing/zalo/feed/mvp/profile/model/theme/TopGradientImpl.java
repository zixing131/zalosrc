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
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;

@InterfaceC25392g
@Keep
/* loaded from: classes4.dex */
public final class TopGradientImpl extends TopGradient {
    private final int end;
    private final int start;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<TopGradientImpl> CREATOR = new C8686a();

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return TopGradientImpl$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.model.theme.TopGradientImpl$a */
    /* loaded from: classes4.dex */
    public static final class C8686a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TopGradientImpl createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new TopGradientImpl(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final TopGradientImpl[] newArray(int i11) {
            return new TopGradientImpl[i11];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TopGradientImpl() {
        this(r2, r2, 3, (AbstractC19060k) null);
        int i11 = 0;
    }

    public static /* synthetic */ TopGradientImpl copy$default(TopGradientImpl topGradientImpl, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = topGradientImpl.start;
        }
        if ((i13 & 2) != 0) {
            i12 = topGradientImpl.end;
        }
        return topGradientImpl.copy(i11, i12);
    }

    public static final /* synthetic */ void write$Self$app_release(TopGradientImpl topGradientImpl, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || topGradientImpl.getStart() != C23212s8.m119606n(AbstractC16781w.ProfileSectionPhotoStartGradientBackgroundColor)) {
            interfaceC21886d.mo114033x(serialDescriptor, 0, topGradientImpl.getStart());
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || topGradientImpl.getEnd() != C23212s8.m119606n(AbstractC16781w.ProfileSectionPhotoEndGradientBackgroundColor)) {
            interfaceC21886d.mo114033x(serialDescriptor, 1, topGradientImpl.getEnd());
        }
    }

    public final int component1() {
        return this.start;
    }

    public final int component2() {
        return this.end;
    }

    public final TopGradientImpl copy(int i11, int i12) {
        return new TopGradientImpl(i11, i12);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopGradientImpl)) {
            return false;
        }
        TopGradientImpl topGradientImpl = (TopGradientImpl) obj;
        return this.start == topGradientImpl.start && this.end == topGradientImpl.end;
    }

    public int getEnd() {
        return this.end;
    }

    public int getStart() {
        return this.start;
    }

    public int hashCode() {
        return (this.start * 31) + this.end;
    }

    public String toString() {
        return "TopGradientImpl(start=" + this.start + ", end=" + this.end + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeInt(this.start);
        parcel.writeInt(this.end);
    }

    public /* synthetic */ TopGradientImpl(int i11, int i12, int i13, AbstractC26805k1 abstractC26805k1) {
        this.start = (i11 & 1) == 0 ? C23212s8.m119606n(AbstractC16781w.ProfileSectionPhotoStartGradientBackgroundColor) : i12;
        if ((i11 & 2) == 0) {
            this.end = C23212s8.m119606n(AbstractC16781w.ProfileSectionPhotoEndGradientBackgroundColor);
        } else {
            this.end = i13;
        }
    }

    public /* synthetic */ TopGradientImpl(int i11, int i12, int i13, AbstractC19060k abstractC19060k) {
        this((i13 & 1) != 0 ? C23212s8.m119606n(AbstractC16781w.ProfileSectionPhotoStartGradientBackgroundColor) : i11, (i13 & 2) != 0 ? C23212s8.m119606n(AbstractC16781w.ProfileSectionPhotoEndGradientBackgroundColor) : i12);
    }

    public TopGradientImpl(int i11, int i12) {
        this.start = i11;
        this.end = i12;
    }
}
