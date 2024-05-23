package com.zing.zalo.camera.common.models.inputparams;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class SendInputParams implements Parcelable {
    public static final Parcelable.Creator<SendInputParams> CREATOR = new C7583a();

    /* renamed from: p */
    private final int f41143p;

    /* renamed from: q */
    private final int f41144q;

    /* renamed from: com.zing.zalo.camera.common.models.inputparams.SendInputParams$a */
    /* loaded from: classes3.dex */
    class C7583a implements Parcelable.Creator {
        C7583a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SendInputParams createFromParcel(Parcel parcel) {
            return new SendInputParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public SendInputParams[] newArray(int i11) {
            return new SendInputParams[i11];
        }
    }

    public SendInputParams(int i11) {
        this.f41143p = i11;
        this.f41144q = -1;
    }

    /* renamed from: a */
    public int m39219a() {
        return this.f41143p;
    }

    /* renamed from: b */
    public int m39220b() {
        return this.f41144q;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "SendInputParams{BtnFinishStyle=" + this.f41143p + ", FinishAction=" + this.f41144q + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f41143p);
        parcel.writeInt(this.f41144q);
    }

    public SendInputParams(int i11, int i12) {
        this.f41143p = i11;
        this.f41144q = i12;
    }

    protected SendInputParams(Parcel parcel) {
        this.f41143p = parcel.readInt();
        this.f41144q = parcel.readInt();
    }
}
