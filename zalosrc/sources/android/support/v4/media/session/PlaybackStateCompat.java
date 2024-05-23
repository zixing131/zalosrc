package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes2.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0990a();

    /* renamed from: p */
    final int f3527p;

    /* renamed from: q */
    final long f3528q;

    /* renamed from: r */
    final long f3529r;

    /* renamed from: s */
    final float f3530s;

    /* renamed from: t */
    final long f3531t;

    /* renamed from: u */
    final int f3532u;

    /* renamed from: v */
    final CharSequence f3533v;

    /* renamed from: w */
    final long f3534w;

    /* renamed from: x */
    List f3535x;

    /* renamed from: y */
    final long f3536y;

    /* renamed from: z */
    final Bundle f3537z;

    /* loaded from: classes2.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0989a();

        /* renamed from: p */
        private final String f3538p;

        /* renamed from: q */
        private final CharSequence f3539q;

        /* renamed from: r */
        private final int f3540r;

        /* renamed from: s */
        private final Bundle f3541s;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$a */
        /* loaded from: classes2.dex */
        static class C0989a implements Parcelable.Creator {
            C0989a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public CustomAction[] newArray(int i11) {
                return new CustomAction[i11];
            }
        }

        CustomAction(Parcel parcel) {
            this.f3538p = parcel.readString();
            this.f3539q = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f3540r = parcel.readInt();
            this.f3541s = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f3539q) + ", mIcon=" + this.f3540r + ", mExtras=" + this.f3541s;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeString(this.f3538p);
            TextUtils.writeToParcel(this.f3539q, parcel, i11);
            parcel.writeInt(this.f3540r);
            parcel.writeBundle(this.f3541s);
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    /* loaded from: classes2.dex */
    static class C0990a implements Parcelable.Creator {
        C0990a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat[] newArray(int i11) {
            return new PlaybackStateCompat[i11];
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f3527p = parcel.readInt();
        this.f3528q = parcel.readLong();
        this.f3530s = parcel.readFloat();
        this.f3534w = parcel.readLong();
        this.f3529r = parcel.readLong();
        this.f3531t = parcel.readLong();
        this.f3533v = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3535x = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f3536y = parcel.readLong();
        this.f3537z = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f3532u = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f3527p + ", position=" + this.f3528q + ", buffered position=" + this.f3529r + ", speed=" + this.f3530s + ", updated=" + this.f3534w + ", actions=" + this.f3531t + ", error code=" + this.f3532u + ", error message=" + this.f3533v + ", custom actions=" + this.f3535x + ", active item id=" + this.f3536y + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f3527p);
        parcel.writeLong(this.f3528q);
        parcel.writeFloat(this.f3530s);
        parcel.writeLong(this.f3534w);
        parcel.writeLong(this.f3529r);
        parcel.writeLong(this.f3531t);
        TextUtils.writeToParcel(this.f3533v, parcel, i11);
        parcel.writeTypedList(this.f3535x);
        parcel.writeLong(this.f3536y);
        parcel.writeBundle(this.f3537z);
        parcel.writeInt(this.f3532u);
    }
}
