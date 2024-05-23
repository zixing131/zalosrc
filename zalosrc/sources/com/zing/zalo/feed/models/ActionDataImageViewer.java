package com.zing.zalo.feed.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.zing.zalo.AbstractC8020f0;
import me0.AbstractC23136l9;

/* loaded from: classes4.dex */
public class ActionDataImageViewer implements Parcelable {
    public static final Parcelable.Creator<ActionDataImageViewer> CREATOR = new C8462a();

    /* renamed from: p */
    public boolean f45945p;

    /* renamed from: q */
    public String f45946q;

    /* renamed from: r */
    public int f45947r;

    /* renamed from: com.zing.zalo.feed.models.ActionDataImageViewer$a */
    /* loaded from: classes4.dex */
    class C8462a implements Parcelable.Creator {
        C8462a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ActionDataImageViewer createFromParcel(Parcel parcel) {
            return new ActionDataImageViewer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ActionDataImageViewer[] newArray(int i11) {
            return new ActionDataImageViewer[i11];
        }
    }

    private ActionDataImageViewer(boolean z11, String str, int i11) {
        this.f45945p = z11;
        this.f45946q = str;
        this.f45947r = i11;
    }

    /* renamed from: a */
    public static ActionDataImageViewer m45080a() {
        return new ActionDataImageViewer(true, AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_avatar), 2);
    }

    /* renamed from: b */
    public static ActionDataImageViewer m45081b() {
        return new ActionDataImageViewer(true, AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_cover), 1);
    }

    /* renamed from: c */
    public static ActionDataImageViewer m45082c() {
        return new ActionDataImageViewer(true, AbstractC23136l9.m118743r0(AbstractC8020f0.str_menu_reuse_avatar), 3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeByte(this.f45945p ? (byte) 1 : (byte) 0);
        String str = this.f45946q;
        if (str == null) {
            str = "";
        }
        parcel.writeString(str);
        parcel.writeInt(this.f45947r);
    }

    public ActionDataImageViewer(Parcel parcel) {
        this.f45945p = parcel.readByte() != 0;
        this.f45946q = parcel.readString();
        this.f45947r = parcel.readInt();
    }
}
