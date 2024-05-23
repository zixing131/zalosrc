package com.zing.zalo.data.backuprestore.model.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes3.dex */
public final class BackupCloudInfo implements Parcelable {
    public static final C7925a CREATOR = new C7925a(null);

    /* renamed from: p */
    private String f42887p;

    /* renamed from: q */
    private long f42888q;

    /* renamed from: r */
    private String f42889r;

    /* renamed from: com.zing.zalo.data.backuprestore.model.media.BackupCloudInfo$a */
    /* loaded from: classes3.dex */
    public static final class C7925a implements Parcelable.Creator {
        private C7925a() {
        }

        public /* synthetic */ C7925a(AbstractC19060k abstractC19060k) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BackupCloudInfo createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new BackupCloudInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public BackupCloudInfo[] newArray(int i11) {
            return new BackupCloudInfo[i11];
        }
    }

    public BackupCloudInfo(String str, long j11, String str2) {
        this.f42887p = str;
        this.f42888q = j11;
        this.f42889r = str2;
    }

    /* renamed from: a */
    public final String m40982a() {
        return this.f42887p;
    }

    /* renamed from: b */
    public final String m40983b() {
        return this.f42889r;
    }

    /* renamed from: c */
    public final long m40984c() {
        return this.f42888q;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean isValid() {
        if (!TextUtils.isEmpty(this.f42887p) && !TextUtils.isEmpty(this.f42889r) && this.f42888q > 0) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "dest");
        parcel.writeString(this.f42887p);
        parcel.writeLong(this.f42888q);
        parcel.writeString(this.f42889r);
    }

    protected BackupCloudInfo(Parcel parcel) {
        AbstractC19074t.m100208f(parcel, "in");
        this.f42887p = parcel.readString();
        this.f42888q = parcel.readLong();
        this.f42889r = parcel.readString();
    }
}
