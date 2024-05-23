package com.zing.zalo.feed.mvp.storyarchive;

import android.os.Bundle;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p205hc.InterfaceC19969h;

/* renamed from: com.zing.zalo.feed.mvp.storyarchive.a */
/* loaded from: classes4.dex */
public final class C8763a implements InterfaceC19969h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f47022a;

    /* renamed from: b */
    private final int f47023b;

    /* renamed from: c */
    private final int f47024c;

    /* renamed from: com.zing.zalo.feed.mvp.storyarchive.a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C8763a m46907a(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            String string = bundle.getString("EXTRA_REQUESTED_STORY_ID", "");
            AbstractC19074t.m100207e(string, "getString(...)");
            return new C8763a(string, bundle.getInt("EXTRA_SOURCE_OPEN_FROM", 0), bundle.getInt("EXTRA_INITIAL_TOTAL_ITEM", 0));
        }
    }

    public C8763a(String str, int i11, int i12) {
        AbstractC19074t.m100208f(str, "requestedStoryId");
        this.f47022a = str;
        this.f47023b = i11;
        this.f47024c = i12;
    }

    /* renamed from: a */
    public final int m46904a() {
        return this.f47024c;
    }

    /* renamed from: b */
    public final String m46905b() {
        return this.f47022a;
    }

    /* renamed from: c */
    public final int m46906c() {
        return this.f47023b;
    }
}
