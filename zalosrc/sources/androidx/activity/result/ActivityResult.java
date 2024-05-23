package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes2.dex */
public final class ActivityResult implements Parcelable {
    public static final Parcelable.Creator<ActivityResult> CREATOR = new C1015a();

    /* renamed from: p */
    private final int f3594p;

    /* renamed from: q */
    private final Intent f3595q;

    /* renamed from: androidx.activity.result.ActivityResult$a */
    /* loaded from: classes2.dex */
    class C1015a implements Parcelable.Creator {
        C1015a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ActivityResult createFromParcel(Parcel parcel) {
            return new ActivityResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ActivityResult[] newArray(int i11) {
            return new ActivityResult[i11];
        }
    }

    public ActivityResult(int i11, Intent intent) {
        this.f3594p = i11;
        this.f3595q = intent;
    }

    /* renamed from: c */
    public static String m4668c(int i11) {
        if (i11 != -1) {
            if (i11 != 0) {
                return String.valueOf(i11);
            }
            return "RESULT_CANCELED";
        }
        return "RESULT_OK";
    }

    /* renamed from: a */
    public Intent m4669a() {
        return this.f3595q;
    }

    /* renamed from: b */
    public int m4670b() {
        return this.f3594p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + m4668c(this.f3594p) + ", data=" + this.f3595q + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int i12;
        parcel.writeInt(this.f3594p);
        if (this.f3595q == null) {
            i12 = 0;
        } else {
            i12 = 1;
        }
        parcel.writeInt(i12);
        Intent intent = this.f3595q;
        if (intent != null) {
            intent.writeToParcel(parcel, i11);
        }
    }

    ActivityResult(Parcel parcel) {
        this.f3594p = parcel.readInt();
        this.f3595q = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
