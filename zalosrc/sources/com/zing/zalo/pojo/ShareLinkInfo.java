package com.zing.zalo.pojo;

import android.os.Parcel;
import android.os.Parcelable;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import sx.C26405g;

/* loaded from: classes4.dex */
public final class ShareLinkInfo implements Parcelable {

    /* renamed from: p */
    private final int f48488p;

    /* renamed from: q */
    private final String f48489q;

    /* renamed from: r */
    private C26405g f48490r;
    public static final C9047a Companion = new C9047a(null);
    public static final Parcelable.Creator<ShareLinkInfo> CREATOR = new C9048b();

    /* renamed from: com.zing.zalo.pojo.ShareLinkInfo$a */
    /* loaded from: classes4.dex */
    public static final class C9047a {
        private C9047a() {
        }

        public /* synthetic */ C9047a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.pojo.ShareLinkInfo$b */
    /* loaded from: classes4.dex */
    public static final class C9048b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ShareLinkInfo createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new ShareLinkInfo(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ShareLinkInfo[] newArray(int i11) {
            return new ShareLinkInfo[i11];
        }
    }

    public ShareLinkInfo(int i11, String str) {
        AbstractC19074t.m100208f(str, "linkData");
        this.f48488p = i11;
        this.f48489q = str;
        if (i11 == 1) {
            try {
                this.f48490r = C26405g.m136174b(new JSONObject(str));
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: a */
    public final String m48434a() {
        return this.f48489q;
    }

    /* renamed from: b */
    public final int m48435b() {
        return this.f48488p;
    }

    /* renamed from: c */
    public final C26405g m48436c() {
        return this.f48490r;
    }

    /* renamed from: d */
    public final String m48437d() {
        String str;
        if (this.f48488p == 1) {
            C26405g c26405g = this.f48490r;
            if (c26405g != null) {
                str = c26405g.f125481d;
            } else {
                str = null;
            }
            if (str == null) {
                return "";
            }
            return str;
        }
        return this.f48489q;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareLinkInfo)) {
            return false;
        }
        ShareLinkInfo shareLinkInfo = (ShareLinkInfo) obj;
        return this.f48488p == shareLinkInfo.f48488p && AbstractC19074t.m100204b(this.f48489q, shareLinkInfo.f48489q);
    }

    public int hashCode() {
        return (this.f48488p * 31) + this.f48489q.hashCode();
    }

    public String toString() {
        return "ShareLinkInfo(linkType=" + this.f48488p + ", linkData=" + this.f48489q + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeInt(this.f48488p);
        parcel.writeString(this.f48489q);
    }
}
