package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public class Counter implements Parcelable {
    public static final Parcelable.Creator<Counter> CREATOR = new C6691a();

    /* renamed from: p */
    private final String f36846p;

    /* renamed from: q */
    private final AtomicLong f36847q;

    /* renamed from: com.google.firebase.perf.metrics.Counter$a */
    /* loaded from: classes3.dex */
    class C6691a implements Parcelable.Creator {
        C6691a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Counter createFromParcel(Parcel parcel) {
            return new Counter(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Counter[] newArray(int i11) {
            return new Counter[i11];
        }
    }

    /* synthetic */ Counter(Parcel parcel, C6691a c6691a) {
        this(parcel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public long m34153a() {
        return this.f36847q.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public String m34154b() {
        return this.f36846p;
    }

    /* renamed from: c */
    public void m34155c(long j11) {
        this.f36847q.addAndGet(j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m34156d(long j11) {
        this.f36847q.set(j11);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f36846p);
        parcel.writeLong(this.f36847q.get());
    }

    public Counter(String str) {
        this.f36846p = str;
        this.f36847q = new AtomicLong(0L);
    }

    private Counter(Parcel parcel) {
        this.f36846p = parcel.readString();
        this.f36847q = new AtomicLong(parcel.readLong());
    }
}
