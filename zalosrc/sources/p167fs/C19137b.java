package p167fs;

import bo.C3020p0;
import bo.C3039t0;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.TrackingSource;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import p509sp.C26359h;
import p509sp.C26360i;
import p691yr.C31060j;
import p726zr.C32546b;

/* renamed from: fs.b */
/* loaded from: classes4.dex */
public final class C19137b {

    /* renamed from: a */
    public static final C19137b f95167a = new C19137b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fs.b$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ String f95168q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(0);
            this.f95168q = str;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return this.f95168q;
        }
    }

    private C19137b() {
    }

    /* renamed from: a */
    public final void m100439a(TrackingSource trackingSource, C19138c c19138c) {
        AbstractC19074t.m100208f(c19138c, "trackingParams");
        if (trackingSource != null) {
            trackingSource.m40677a("react_context", Integer.valueOf(c19138c.m100448c()));
            trackingSource.m40677a("current_reaction_id", Integer.valueOf(c19138c.m100446a()));
            trackingSource.m40677a("new_reaction_id", Integer.valueOf(c19138c.m100447b()));
            trackingSource.m40677a("enable_reactions", Integer.valueOf(C31060j.f143193a.m150935M() ? 1 : 0));
        }
    }

    /* renamed from: b */
    public final C19138c m100440b(C3020p0 c3020p0) {
        int i11;
        C32546b c32546b;
        AbstractC19074t.m100208f(c3020p0, "feedItem");
        boolean z11 = c3020p0.f12064w;
        C3039t0 c3039t0 = c3020p0.f12025E;
        if (c3039t0 != null && (c32546b = c3039t0.f12247e) != null) {
            i11 = c32546b.m157605a();
        } else if (z11) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        return new C19138c(0, i11, !z11 ? 1 : 0);
    }

    /* renamed from: c */
    public final C19138c m100441c(ItemAlbumMobile itemAlbumMobile) {
        int i11;
        AbstractC19074t.m100208f(itemAlbumMobile, "photoItem");
        boolean m100204b = AbstractC19074t.m100204b(itemAlbumMobile.f42552E, "1");
        C32546b c32546b = itemAlbumMobile.f42563N;
        if (c32546b != null) {
            i11 = c32546b.m157605a();
        } else if (m100204b) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        return new C19138c(0, i11, !m100204b ? 1 : 0);
    }

    /* renamed from: d */
    public final C19138c m100442d(C3020p0 c3020p0, int i11) {
        int i12;
        C32546b c32546b;
        AbstractC19074t.m100208f(c3020p0, "feedItem");
        boolean z11 = c3020p0.f12064w;
        C3039t0 c3039t0 = c3020p0.f12025E;
        if (c3039t0 != null && (c32546b = c3039t0.f12247e) != null) {
            i12 = c32546b.m157605a();
        } else if (z11) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        return new C19138c(1, i12, i11);
    }

    /* renamed from: e */
    public final C19138c m100443e(ItemAlbumMobile itemAlbumMobile, int i11) {
        int i12;
        AbstractC19074t.m100208f(itemAlbumMobile, "photoItem");
        boolean m100204b = AbstractC19074t.m100204b(itemAlbumMobile.f42552E, "1");
        C32546b c32546b = itemAlbumMobile.f42563N;
        if (c32546b != null) {
            i12 = c32546b.m157605a();
        } else if (m100204b) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        return new C19138c(1, i12, i11);
    }

    /* renamed from: f */
    public final void m100444f(String str, String str2) {
        AbstractC19074t.m100208f(str, "action");
        AbstractC19074t.m100208f(str2, "info");
        if (C26360i.f125213a.m135694c("FEED_MULTI_REACTIONS")) {
            C26359h.f125209a.mo135685a("FEED_MULTI_REACTIONS", str, new a(str2));
        }
    }
}
