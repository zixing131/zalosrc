package com.zing.zalo.feed.mvp.storyprivacy;

import android.os.Bundle;
import com.zing.zalo.feed.models.PrivacyInfo;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p205hc.InterfaceC19969h;

/* renamed from: com.zing.zalo.feed.mvp.storyprivacy.b */
/* loaded from: classes4.dex */
public final class C8806b implements InterfaceC19969h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final PrivacyInfo f47130a;

    /* renamed from: b */
    private final String f47131b;

    /* renamed from: com.zing.zalo.feed.mvp.storyprivacy.b$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C8806b m47064a(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            PrivacyInfo privacyInfo = (PrivacyInfo) bundle.getParcelable("EXTRA_INITIAL_PRIVACY_TYPE");
            String string = bundle.getString("EXTRA_ENTRY_POINT_SOURCE", "story_editor");
            AbstractC19074t.m100207e(string, "getString(...)");
            return new C8806b(privacyInfo, string);
        }
    }

    public C8806b(PrivacyInfo privacyInfo, String str) {
        AbstractC19074t.m100208f(str, "entryPointSource");
        this.f47130a = privacyInfo;
        this.f47131b = str;
    }

    /* renamed from: a */
    public final String m47062a() {
        return this.f47131b;
    }

    /* renamed from: b */
    public final PrivacyInfo m47063b() {
        return this.f47130a;
    }
}
