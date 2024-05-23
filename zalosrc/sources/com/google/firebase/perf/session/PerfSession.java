package com.google.firebase.perf.session;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.config.C6662a;
import com.google.firebase.perf.util.Timer;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import p476r9.C25693a;
import p507s9.C26194k;
import p507s9.EnumC26195l;

/* loaded from: classes3.dex */
public class PerfSession implements Parcelable {
    public static final Parcelable.Creator<PerfSession> CREATOR = new C6698a();

    /* renamed from: p */
    private final String f36873p;

    /* renamed from: q */
    private final Timer f36874q;

    /* renamed from: r */
    private boolean f36875r;

    /* renamed from: com.google.firebase.perf.session.PerfSession$a */
    /* loaded from: classes3.dex */
    class C6698a implements Parcelable.Creator {
        C6698a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PerfSession createFromParcel(Parcel parcel) {
            return new PerfSession(parcel, (C6698a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public PerfSession[] newArray(int i11) {
            return new PerfSession[i11];
        }
    }

    /* synthetic */ PerfSession(Parcel parcel, C6698a c6698a) {
        this(parcel);
    }

    /* renamed from: b */
    public static C26194k[] m34243b(List list) {
        if (list.isEmpty()) {
            return null;
        }
        C26194k[] c26194kArr = new C26194k[list.size()];
        C26194k m34246a = ((PerfSession) list.get(0)).m34246a();
        boolean z11 = false;
        for (int i11 = 1; i11 < list.size(); i11++) {
            C26194k m34246a2 = ((PerfSession) list.get(i11)).m34246a();
            if (!z11 && ((PerfSession) list.get(i11)).m34250g()) {
                c26194kArr[0] = m34246a2;
                c26194kArr[i11] = m34246a;
                z11 = true;
            } else {
                c26194kArr[i11] = m34246a2;
            }
        }
        if (!z11) {
            c26194kArr[0] = m34246a;
        }
        return c26194kArr;
    }

    /* renamed from: c */
    public static PerfSession m34244c() {
        PerfSession perfSession = new PerfSession(UUID.randomUUID().toString().replace("-", ""), new C25693a());
        perfSession.m34252i(m34245j());
        return perfSession;
    }

    /* renamed from: j */
    public static boolean m34245j() {
        if (C6662a.m34042g().m34059K() && Math.random() < r0.m34055D()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public C26194k m34246a() {
        C26194k.c m134712B = C26194k.m134706S().m134712B(this.f36873p);
        if (this.f36875r) {
            m134712B.m134711A(EnumC26195l.GAUGES_AND_SYSTEM_EVENTS);
        }
        return (C26194k) m134712B.m35109q();
    }

    /* renamed from: d */
    public Timer m34247d() {
        return this.f36874q;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public boolean m34248e() {
        if (TimeUnit.MICROSECONDS.toMinutes(this.f36874q.m34292c()) > C6662a.m34042g().m34052A()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean m34249f() {
        return this.f36875r;
    }

    /* renamed from: g */
    public boolean m34250g() {
        return this.f36875r;
    }

    /* renamed from: h */
    public String m34251h() {
        return this.f36873p;
    }

    /* renamed from: i */
    public void m34252i(boolean z11) {
        this.f36875r = z11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f36873p);
        parcel.writeByte(this.f36875r ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f36874q, 0);
    }

    public PerfSession(String str, C25693a c25693a) {
        this.f36875r = false;
        this.f36873p = str;
        this.f36874q = c25693a.m132598a();
    }

    private PerfSession(Parcel parcel) {
        this.f36875r = false;
        this.f36873p = parcel.readString();
        this.f36875r = parcel.readByte() != 0;
        this.f36874q = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
    }
}
