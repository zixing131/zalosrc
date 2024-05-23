package com.zing.zalo.p077ui.chat.transfer;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes5.dex */
public final class DrawDoodleResult implements Parcelable {

    /* renamed from: p */
    private final String f60929p;

    /* renamed from: q */
    private final int f60930q;

    /* renamed from: r */
    private final int f60931r;

    /* renamed from: s */
    private final String f60932s;
    public static final C11718a Companion = new C11718a(null);
    public static final Parcelable.Creator<DrawDoodleResult> CREATOR = new C11719b();

    /* renamed from: com.zing.zalo.ui.chat.transfer.DrawDoodleResult$a */
    /* loaded from: classes5.dex */
    public static final class C11718a {
        private C11718a() {
        }

        public /* synthetic */ C11718a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final DrawDoodleResult m65304a(Intent intent) {
            if (intent != null) {
                return (DrawDoodleResult) intent.getParcelableExtra("EXTRA_DOODLE_RESULT");
            }
            return null;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.transfer.DrawDoodleResult$b */
    /* loaded from: classes5.dex */
    public static final class C11719b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DrawDoodleResult createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new DrawDoodleResult(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DrawDoodleResult[] newArray(int i11) {
            return new DrawDoodleResult[i11];
        }
    }

    public DrawDoodleResult(String str, int i11, int i12, String str2) {
        AbstractC19074t.m100208f(str, "path");
        AbstractC19074t.m100208f(str2, "decorLog");
        this.f60929p = str;
        this.f60930q = i11;
        this.f60931r = i12;
        this.f60932s = str2;
    }

    /* renamed from: a */
    public static final DrawDoodleResult m65301a(Intent intent) {
        return Companion.m65304a(intent);
    }

    /* renamed from: b */
    public final String m65302b() {
        return this.f60932s;
    }

    /* renamed from: c */
    public final String m65303c() {
        return this.f60929p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DrawDoodleResult)) {
            return false;
        }
        DrawDoodleResult drawDoodleResult = (DrawDoodleResult) obj;
        return AbstractC19074t.m100204b(this.f60929p, drawDoodleResult.f60929p) && this.f60930q == drawDoodleResult.f60930q && this.f60931r == drawDoodleResult.f60931r && AbstractC19074t.m100204b(this.f60932s, drawDoodleResult.f60932s);
    }

    public final int getHeight() {
        return this.f60931r;
    }

    public final int getWidth() {
        return this.f60930q;
    }

    public int hashCode() {
        return (((((this.f60929p.hashCode() * 31) + this.f60930q) * 31) + this.f60931r) * 31) + this.f60932s.hashCode();
    }

    public String toString() {
        return "DrawDoodleResult(path=" + this.f60929p + ", width=" + this.f60930q + ", height=" + this.f60931r + ", decorLog=" + this.f60932s + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f60929p);
        parcel.writeInt(this.f60930q);
        parcel.writeInt(this.f60931r);
        parcel.writeString(this.f60932s);
    }
}
