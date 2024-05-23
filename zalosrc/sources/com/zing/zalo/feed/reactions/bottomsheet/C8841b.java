package com.zing.zalo.feed.reactions.bottomsheet;

import android.os.Bundle;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p205hc.InterfaceC19969h;
import p716zh.C32002l4;

/* renamed from: com.zing.zalo.feed.reactions.bottomsheet.b */
/* loaded from: classes4.dex */
public final class C8841b implements InterfaceC19969h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f47222a;

    /* renamed from: b */
    private final String f47223b;

    /* renamed from: c */
    private final String f47224c;

    /* renamed from: d */
    private final int f47225d;

    /* renamed from: e */
    private final int f47226e;

    /* renamed from: f */
    private final C32002l4 f47227f;

    /* renamed from: g */
    private final String f47228g;

    /* renamed from: com.zing.zalo.feed.reactions.bottomsheet.b$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C8841b m47209a(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            String string = bundle.getString("EXTRA_FEED_ID", "");
            AbstractC19074t.m100207e(string, "getString(...)");
            String string2 = bundle.getString("EXTRA_PHOTO_ID", "");
            AbstractC19074t.m100207e(string2, "getString(...)");
            String string3 = bundle.getString("EXTRA_CMT_ID", "");
            AbstractC19074t.m100207e(string3, "getString(...)");
            int i11 = bundle.getInt("EXTRA_MODE", 0);
            int i12 = bundle.getInt("EXTRA_STORY_TRACKING_SRC_VIEW", -1);
            C32002l4 m154292f = C32002l4.Companion.m154292f(bundle.getString("EXTRA_ENTRY_POINT_CHAIN", ""));
            String string4 = bundle.getString("EXTRA_FEED_OWNER_ID", "");
            AbstractC19074t.m100207e(string4, "getString(...)");
            return new C8841b(string, string2, string3, i11, i12, m154292f, string4);
        }
    }

    public C8841b(String str, String str2, String str3, int i11, int i12, C32002l4 c32002l4, String str4) {
        AbstractC19074t.m100208f(str, "feedId");
        AbstractC19074t.m100208f(str2, "photoId");
        AbstractC19074t.m100208f(str3, "cmtId");
        AbstractC19074t.m100208f(c32002l4, "entryPointChain");
        AbstractC19074t.m100208f(str4, "feedOwnerId");
        this.f47222a = str;
        this.f47223b = str2;
        this.f47224c = str3;
        this.f47225d = i11;
        this.f47226e = i12;
        this.f47227f = c32002l4;
        this.f47228g = str4;
    }

    /* renamed from: a */
    public final String m47202a() {
        return this.f47224c;
    }

    /* renamed from: b */
    public final C32002l4 m47203b() {
        return this.f47227f;
    }

    /* renamed from: c */
    public final String m47204c() {
        return this.f47222a;
    }

    /* renamed from: d */
    public final String m47205d() {
        return this.f47228g;
    }

    /* renamed from: e */
    public final int m47206e() {
        return this.f47225d;
    }

    /* renamed from: f */
    public final String m47207f() {
        return this.f47223b;
    }

    /* renamed from: g */
    public final int m47208g() {
        return this.f47226e;
    }
}
