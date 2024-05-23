package com.google.firebase.perf.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class Timer implements Parcelable {
    public static final Parcelable.Creator<Timer> CREATOR = new C6712a();

    /* renamed from: p */
    private long f36910p;

    /* renamed from: q */
    private long f36911q;

    /* renamed from: com.google.firebase.perf.util.Timer$a */
    /* loaded from: classes3.dex */
    class C6712a implements Parcelable.Creator {
        C6712a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Timer createFromParcel(Parcel parcel) {
            return new Timer(parcel, (C6712a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Timer[] newArray(int i11) {
            return new Timer[i11];
        }
    }

    /* synthetic */ Timer(Parcel parcel, C6712a c6712a) {
        this(parcel);
    }

    /* renamed from: a */
    private static long m34288a() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    /* renamed from: f */
    public static Timer m34289f(long j11) {
        long micros = TimeUnit.MILLISECONDS.toMicros(j11);
        return new Timer(m34290h() + (micros - m34288a()), micros);
    }

    /* renamed from: h */
    private static long m34290h() {
        return TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
    }

    /* renamed from: b */
    public long m34291b() {
        return this.f36910p + m34292c();
    }

    /* renamed from: c */
    public long m34292c() {
        return m34293d(new Timer());
    }

    /* renamed from: d */
    public long m34293d(Timer timer) {
        return timer.f36911q - this.f36911q;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public long m34294e() {
        return this.f36910p;
    }

    /* renamed from: g */
    public void m34295g() {
        this.f36910p = m34290h();
        this.f36911q = m34288a();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeLong(this.f36910p);
        parcel.writeLong(this.f36911q);
    }

    public Timer() {
        this(m34290h(), m34288a());
    }

    Timer(long j11, long j12) {
        this.f36910p = j11;
        this.f36911q = j12;
    }

    private Timer(Parcel parcel) {
        this(parcel.readLong(), parcel.readLong());
    }
}
