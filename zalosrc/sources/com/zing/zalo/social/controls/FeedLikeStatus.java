package com.zing.zalo.social.controls;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import bo.C3051w0;
import ho0.AbstractC20110a;
import org.json.JSONObject;
import p726zr.C32546b;

/* loaded from: classes5.dex */
public class FeedLikeStatus implements Parcelable {
    public static final Parcelable.Creator<FeedLikeStatus> CREATOR = new C10859a();

    /* renamed from: p */
    private int f54774p;

    /* renamed from: q */
    private boolean f54775q;

    /* renamed from: r */
    private String f54776r;

    /* renamed from: s */
    private int f54777s;

    /* renamed from: t */
    private C3051w0 f54778t;

    /* renamed from: u */
    private C32546b f54779u;

    /* renamed from: v */
    private int f54780v;

    /* renamed from: com.zing.zalo.social.controls.FeedLikeStatus$a */
    /* loaded from: classes5.dex */
    class C10859a implements Parcelable.Creator {
        C10859a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public FeedLikeStatus createFromParcel(Parcel parcel) {
            return new FeedLikeStatus(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public FeedLikeStatus[] newArray(int i11) {
            return new FeedLikeStatus[i11];
        }
    }

    public FeedLikeStatus() {
    }

    /* renamed from: a */
    public int m56313a() {
        return this.f54777s;
    }

    /* renamed from: b */
    public String m56314b() {
        return this.f54776r;
    }

    /* renamed from: c */
    public C32546b m56315c() {
        return this.f54779u;
    }

    /* renamed from: d */
    public int m56316d() {
        return this.f54774p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public C3051w0 m56317e() {
        return this.f54778t;
    }

    /* renamed from: f */
    public int m56318f() {
        return this.f54780v;
    }

    /* renamed from: g */
    public boolean m56319g() {
        if (!TextUtils.isEmpty(this.f54776r) && this.f54774p >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public boolean m56320h() {
        return this.f54775q;
    }

    /* renamed from: i */
    public void m56321i(int i11) {
        this.f54777s = i11;
    }

    /* renamed from: j */
    public void m56322j(String str) {
        this.f54776r = str;
    }

    /* renamed from: k */
    public void m56323k(C32546b c32546b) {
        this.f54779u = c32546b;
    }

    /* renamed from: l */
    public void m56324l(int i11) {
        this.f54774p = i11;
    }

    /* renamed from: m */
    public void m56325m(C3051w0 c3051w0) {
        C3051w0 c3051w02;
        if (c3051w0 != null) {
            c3051w02 = new C3051w0(c3051w0);
        } else {
            c3051w02 = null;
        }
        this.f54778t = c3051w02;
    }

    /* renamed from: n */
    public void m56326n(int i11) {
        this.f54780v = i11;
    }

    /* renamed from: o */
    public void m56327o(boolean z11) {
        this.f54775q = z11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        String str;
        parcel.writeInt(this.f54774p);
        parcel.writeInt(this.f54775q ? 1 : 0);
        parcel.writeString(this.f54776r);
        parcel.writeInt(this.f54777s);
        C3051w0 c3051w0 = this.f54778t;
        String str2 = "";
        if (c3051w0 == null) {
            str = "";
        } else {
            str = c3051w0.m14638b().toString();
        }
        parcel.writeString(str);
        C32546b c32546b = this.f54779u;
        if (c32546b != null) {
            str2 = c32546b.m157608d().toString();
        }
        parcel.writeString(str2);
        parcel.writeInt(this.f54780v);
    }

    public FeedLikeStatus(Parcel parcel) {
        if (parcel != null) {
            this.f54774p = parcel.readInt();
            this.f54775q = parcel.readInt() == 1;
            this.f54776r = parcel.readString();
            this.f54777s = parcel.readInt();
            try {
                String readString = parcel.readString();
                this.f54778t = !TextUtils.isEmpty(readString) ? new C3051w0(new JSONObject(readString)) : null;
                String readString2 = parcel.readString();
                this.f54779u = TextUtils.isEmpty(readString2) ? null : C32546b.Companion.m157609a(new JSONObject(readString2));
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
            this.f54780v = parcel.readInt();
        }
    }
}
