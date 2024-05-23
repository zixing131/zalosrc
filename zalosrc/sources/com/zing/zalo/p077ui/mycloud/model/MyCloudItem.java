package com.zing.zalo.p077ui.mycloud.model;

import android.os.Parcel;
import android.os.Parcelable;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes6.dex */
public class MyCloudItem implements Parcelable {

    /* renamed from: p */
    private int f65861p;

    /* renamed from: q */
    private CharSequence f65862q;

    /* renamed from: r */
    private long f65863r;

    /* renamed from: s */
    private boolean f65864s;
    public static final C12633b Companion = new C12633b(null);
    public static final Parcelable.Creator<MyCloudItem> CREATOR = new C12632a();

    /* renamed from: com.zing.zalo.ui.mycloud.model.MyCloudItem$a */
    /* loaded from: classes6.dex */
    public static final class C12632a implements Parcelable.Creator {
        C12632a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MyCloudItem createFromParcel(Parcel parcel) {
            if (parcel != null) {
                return new MyCloudItem(parcel);
            }
            return null;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MyCloudItem[] newArray(int i11) {
            return new MyCloudItem[i11];
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.model.MyCloudItem$b */
    /* loaded from: classes6.dex */
    public static final class C12633b {
        private C12633b() {
        }

        public /* synthetic */ C12633b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public MyCloudItem(int i11) {
        this.f65861p = i11;
    }

    /* renamed from: a */
    public final CharSequence m71019a() {
        return this.f65862q;
    }

    /* renamed from: d */
    public final long m71020d() {
        return this.f65863r;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final int m71021e() {
        return this.f65861p;
    }

    /* renamed from: f */
    public final boolean m71022f() {
        return this.f65864s;
    }

    /* renamed from: g */
    public final void m71023g(CharSequence charSequence) {
        this.f65862q = charSequence;
    }

    /* renamed from: h */
    public final void m71024h(long j11) {
        this.f65863r = j11;
    }

    /* renamed from: i */
    public final void m71025i(boolean z11) {
        this.f65864s = z11;
    }

    /* renamed from: j */
    public final void m71026j(int i11) {
        this.f65861p = i11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "dest");
        parcel.writeInt(this.f65861p);
        parcel.writeString((String) this.f65862q);
        parcel.writeLong(this.f65863r);
        parcel.writeByte(this.f65864s ? (byte) 1 : (byte) 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MyCloudItem(Parcel parcel) {
        this(parcel.readInt());
        AbstractC19074t.m100208f(parcel, "parcel");
        this.f65862q = parcel.readString();
        this.f65863r = parcel.readLong();
        this.f65864s = parcel.readByte() != 0;
    }
}
