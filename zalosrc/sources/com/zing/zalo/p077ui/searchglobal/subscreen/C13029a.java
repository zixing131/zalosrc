package com.zing.zalo.p077ui.searchglobal.subscreen;

import android.os.Bundle;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p205hc.InterfaceC19969h;
import p612wk.AbstractC29076h;
import p612wk.AbstractC29080l;

/* renamed from: com.zing.zalo.ui.searchglobal.subscreen.a */
/* loaded from: classes6.dex */
public final class C13029a implements InterfaceC19969h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f67303a;

    /* renamed from: b */
    private final String f67304b;

    /* renamed from: c */
    private final String f67305c;

    /* renamed from: d */
    private final int f67306d;

    /* renamed from: e */
    private final AbstractC29080l f67307e;

    /* renamed from: f */
    private final AbstractC29076h f67308f;

    /* renamed from: g */
    private final long f67309g;

    /* renamed from: h */
    private final int f67310h;

    /* renamed from: com.zing.zalo.ui.searchglobal.subscreen.a$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C13029a m73245a(Bundle bundle) {
            String str;
            String str2;
            String str3;
            int i11;
            int i12;
            int i13;
            long j11;
            int i14;
            if (bundle == null || (str = bundle.getString("TEXT_SEARCH")) == null) {
                str = "";
            }
            AbstractC19074t.m100205c(str);
            if (bundle == null || (str2 = bundle.getString("OWNER_UID")) == null) {
                str2 = "";
            }
            AbstractC19074t.m100205c(str2);
            if (bundle == null || (str3 = bundle.getString("OWNER_DISPLAY_NAME")) == null) {
                str3 = "";
            }
            AbstractC19074t.m100205c(str3);
            if (bundle != null) {
                i11 = bundle.getInt("FILTER_FLAGS");
            } else {
                i11 = 0;
            }
            AbstractC29080l.b bVar = AbstractC29080l.Companion;
            if (bundle != null) {
                i12 = bundle.getInt("TAB_TYPE");
            } else {
                i12 = 0;
            }
            AbstractC29080l m145313a = bVar.m145313a(i12);
            AbstractC29076h.a aVar = AbstractC29076h.Companion;
            if (bundle != null) {
                i13 = bundle.getInt("SECTION_TYPE");
            } else {
                i13 = 0;
            }
            AbstractC29076h m145260a = aVar.m145260a(i13);
            if (bundle != null) {
                j11 = bundle.getLong("SEARCH_START_SESSION_TIME");
            } else {
                j11 = 0;
            }
            if (bundle != null) {
                i14 = bundle.getInt("SEARCH_MESSAGE_ITEM_CLICK_COUNT");
            } else {
                i14 = 0;
            }
            return new C13029a(str, str2, str3, i11, m145313a, m145260a, j11, i14);
        }
    }

    public C13029a(String str, String str2, String str3, int i11, AbstractC29080l abstractC29080l, AbstractC29076h abstractC29076h, long j11, int i12) {
        AbstractC19074t.m100208f(str, "textSearch");
        AbstractC19074t.m100208f(str2, "ownerUid");
        AbstractC19074t.m100208f(str3, "ownerDisplayName");
        this.f67303a = str;
        this.f67304b = str2;
        this.f67305c = str3;
        this.f67306d = i11;
        this.f67307e = abstractC29080l;
        this.f67308f = abstractC29076h;
        this.f67309g = j11;
        this.f67310h = i12;
    }

    /* renamed from: a */
    public final int m73237a() {
        return this.f67306d;
    }

    /* renamed from: b */
    public final String m73238b() {
        return this.f67305c;
    }

    /* renamed from: c */
    public final String m73239c() {
        return this.f67304b;
    }

    /* renamed from: d */
    public final int m73240d() {
        return this.f67310h;
    }

    /* renamed from: e */
    public final long m73241e() {
        return this.f67309g;
    }

    /* renamed from: f */
    public final AbstractC29076h m73242f() {
        return this.f67308f;
    }

    /* renamed from: g */
    public final AbstractC29080l m73243g() {
        return this.f67307e;
    }

    /* renamed from: h */
    public final String m73244h() {
        return this.f67303a;
    }
}
