package com.zing.zalo.shortvideo.utils.other;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.AbstractC1438d;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.CtaItem;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;
import pm0.AbstractC24866w;
import pm0.C24859p;
import pm0.C24860q;
import v00.C27417l;

/* loaded from: classes5.dex */
public final class CommentSource implements Parcelable {
    public static final C10856a CREATOR = new C10856a(null);

    /* renamed from: p */
    private final Bundle f54750p;

    /* renamed from: com.zing.zalo.shortvideo.utils.other.CommentSource$a */
    /* loaded from: classes5.dex */
    public static final class C10856a implements Parcelable.Creator {
        private C10856a() {
        }

        public /* synthetic */ C10856a(AbstractC19060k abstractC19060k) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CommentSource createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new CommentSource(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public CommentSource[] newArray(int i11) {
            return new CommentSource[i11];
        }
    }

    private CommentSource(Bundle bundle) {
        this.f54750p = bundle;
    }

    /* renamed from: a */
    public final String m56268a() {
        return this.f54750p.getString("CHANNEL_NAME", "");
    }

    /* renamed from: b */
    public final int m56269b() {
        return this.f54750p.getInt("TOTAL_COMMENT");
    }

    /* renamed from: c */
    public final CtaItem[] m56270c() {
        Object[] parcelableArray;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableArray = this.f54750p.getParcelableArray("CTA_ITEM", CtaItem.class);
            return (CtaItem[]) parcelableArray;
        }
        Parcelable[] parcelableArray2 = this.f54750p.getParcelableArray("CTA_ITEM");
        if (parcelableArray2 instanceof CtaItem[]) {
            return (CtaItem[]) parcelableArray2;
        }
        return null;
    }

    /* renamed from: d */
    public final String m56271d() {
        String string = this.f54750p.getString("ID", "Unknown");
        AbstractC19074t.m100207e(string, "getString(...)");
        return string;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m56272e() {
        String string = this.f54750p.getString("OWNER_AVATAR", "");
        AbstractC19074t.m100207e(string, "getString(...)");
        return string;
    }

    /* renamed from: f */
    public final String m56273f() {
        String string = this.f54750p.getString("OWNER_ID", "Unknown");
        AbstractC19074t.m100207e(string, "getString(...)");
        return string;
    }

    /* renamed from: g */
    public final String m56274g() {
        return this.f54750p.getString("SOURCE");
    }

    /* renamed from: h */
    public final int m56275h() {
        return this.f54750p.getInt("TYPE");
    }

    /* renamed from: i */
    public final String m56276i() {
        return this.f54750p.getString("VERIFIED_ICON", "");
    }

    /* renamed from: j */
    public final String m56277j() {
        return this.f54750p.getString("VIDEO_DESCRIPTION", "");
    }

    /* renamed from: k */
    public final boolean m56278k() {
        return this.f54750p.getBoolean("COMMENT_CENSORED");
    }

    /* renamed from: l */
    public final boolean m56279l() {
        return this.f54750p.getBoolean("BLOCK_COMMENT");
    }

    /* renamed from: m */
    public final boolean m56280m() {
        return this.f54750p.getBoolean("BLOCK_MY_CHANNEL");
    }

    /* renamed from: n */
    public final boolean m56281n() {
        return this.f54750p.getBoolean("BLOCK_MY_USER");
    }

    /* renamed from: o */
    public final boolean m56282o() {
        String str = null;
        if (m56275h() == 1) {
            String m56273f = m56273f();
            Channel m140377a = C27417l.f129055a.m140377a();
            if (m140377a != null) {
                str = m140377a.m50769l();
            }
            return AbstractC19074t.m100204b(m56273f, str);
        }
        throw new C24859p(null, 1, null);
    }

    /* renamed from: p */
    public final void m56283p(boolean z11) {
        this.f54750p.putBoolean("BLOCK_COMMENT", z11);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "parcel");
        parcel.writeBundle(this.f54750p);
    }

    public CommentSource() {
        this(AbstractC1438d.m7341b(AbstractC24866w.m129235a("TYPE", 0)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CommentSource(Parcel parcel) {
        this(r2);
        AbstractC19074t.m100208f(parcel, "parcel");
        Bundle readBundle = parcel.readBundle(Bundle.class.getClassLoader());
        readBundle = readBundle == null ? AbstractC1438d.m7340a() : readBundle;
        AbstractC19074t.m100205c(readBundle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CommentSource(String str, Video video) {
        this(AbstractC1438d.m7341b(r0));
        Channel m140377a;
        AbstractC19074t.m100208f(video, "video");
        C24860q[] c24860qArr = new C24860q[14];
        c24860qArr[0] = AbstractC24866w.m129235a("SOURCE", str);
        boolean z11 = true;
        c24860qArr[1] = AbstractC24866w.m129235a("TYPE", 1);
        c24860qArr[2] = AbstractC24866w.m129235a("ID", video.m52911t());
        c24860qArr[3] = AbstractC24866w.m129235a("OWNER_ID", video.m52887f().m50769l());
        c24860qArr[4] = AbstractC24866w.m129235a("TOTAL_COMMENT", Long.valueOf(video.m52837C()));
        c24860qArr[5] = AbstractC24866w.m129235a("BLOCK_COMMENT", Boolean.valueOf(video.m52886e0()));
        c24860qArr[6] = AbstractC24866w.m129235a("BLOCK_MY_USER", Boolean.valueOf(video.m52893i0() || !C27417l.f129055a.m140378b().m51241n()));
        if (!video.m52891h0() && ((m140377a = C27417l.f129055a.m140377a()) == null || m140377a.m50734K())) {
            z11 = false;
        }
        c24860qArr[7] = AbstractC24866w.m129235a("BLOCK_MY_CHANNEL", Boolean.valueOf(z11));
        c24860qArr[8] = AbstractC24866w.m129235a("OWNER_AVATAR", video.m52887f().m50754c());
        c24860qArr[9] = AbstractC24866w.m129235a("COMMENT_CENSORED", video.m52897k0());
        c24860qArr[10] = AbstractC24866w.m129235a("VIDEO_DESCRIPTION", video.m52894j());
        c24860qArr[11] = AbstractC24866w.m129235a("CHANNEL_NAME", video.m52887f().m50775o());
        c24860qArr[12] = AbstractC24866w.m129235a("VERIFIED_ICON", video.m52887f().m50725F());
        List m52892i = video.m52892i();
        c24860qArr[13] = AbstractC24866w.m129235a("CTA_ITEM", m52892i != null ? (CtaItem[]) m52892i.toArray(new CtaItem[0]) : null);
    }
}
