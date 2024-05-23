package com.zing.zalo.p077ui.picker.mycloud.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj.C17945a0;
import fn0.AbstractC19074t;

/* loaded from: classes6.dex */
public final class SelectedItemData implements Parcelable {
    public static final Parcelable.Creator<SelectedItemData> CREATOR = new C12871a();

    /* renamed from: p */
    private final String f66871p;

    /* renamed from: q */
    private C17945a0 f66872q;

    /* renamed from: com.zing.zalo.ui.picker.mycloud.model.SelectedItemData$a */
    /* loaded from: classes6.dex */
    public static final class C12871a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SelectedItemData createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new SelectedItemData(parcel.readString(), (C17945a0) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SelectedItemData[] newArray(int i11) {
            return new SelectedItemData[i11];
        }
    }

    public SelectedItemData(String str, C17945a0 c17945a0) {
        AbstractC19074t.m100208f(str, "tabType");
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        this.f66871p = str;
        this.f66872q = c17945a0;
    }

    /* renamed from: a */
    public final C17945a0 m72576a() {
        return this.f66872q;
    }

    /* renamed from: b */
    public final String m72577b() {
        return this.f66871p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof SelectedItemData) {
                SelectedItemData selectedItemData = (SelectedItemData) obj;
                if (!AbstractC19074t.m100204b(selectedItemData.f66872q.m95029V3(), this.f66872q.m95029V3()) || !AbstractC19074t.m100204b(selectedItemData.f66871p, this.f66871p)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f66872q.m95029V3().hashCode() * 31) + this.f66871p.hashCode();
    }

    public String toString() {
        return "SelectedItemData(tabType=" + this.f66871p + ", chatContent=" + this.f66872q + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f66871p);
        parcel.writeSerializable(this.f66872q);
    }
}
