package com.zing.zalo.feed.mvp.bottomsheetmenu;

import android.os.Bundle;
import com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuBundleData;
import com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuResult;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p205hc.InterfaceC19969h;

/* renamed from: com.zing.zalo.feed.mvp.bottomsheetmenu.a */
/* loaded from: classes4.dex */
public final class C8538a implements InterfaceC19969h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private BottomSheetMenuBundleData f46149a;

    /* renamed from: b */
    private BottomSheetMenuResult f46150b;

    /* renamed from: com.zing.zalo.feed.mvp.bottomsheetmenu.a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C8538a m45471a(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            C8538a c8538a = new C8538a();
            c8538a.m45469c((BottomSheetMenuBundleData) bundle.getParcelable("EXTRA_BUNDLE_DATA"));
            return c8538a;
        }

        /* renamed from: b */
        public final C8538a m45472b(BottomSheetMenuResult bottomSheetMenuResult) {
            AbstractC19074t.m100208f(bottomSheetMenuResult, "result");
            C8538a c8538a = new C8538a();
            c8538a.m45470d(bottomSheetMenuResult);
            return c8538a;
        }
    }

    /* renamed from: a */
    public final BottomSheetMenuBundleData m45467a() {
        return this.f46149a;
    }

    /* renamed from: b */
    public final BottomSheetMenuResult m45468b() {
        return this.f46150b;
    }

    /* renamed from: c */
    public final void m45469c(BottomSheetMenuBundleData bottomSheetMenuBundleData) {
        this.f46149a = bottomSheetMenuBundleData;
    }

    /* renamed from: d */
    public final void m45470d(BottomSheetMenuResult bottomSheetMenuResult) {
        this.f46150b = bottomSheetMenuResult;
    }
}
