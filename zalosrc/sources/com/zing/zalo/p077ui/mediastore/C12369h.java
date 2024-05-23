package com.zing.zalo.p077ui.mediastore;

import android.os.Bundle;
import au.EnumC2382z;
import com.zing.zalo.control.mediastore.CreateMediaStoreParam;
import com.zing.zalo.p077ui.mediastore.search.MediaStoreSearchPage;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p205hc.InterfaceC19969h;

/* renamed from: com.zing.zalo.ui.mediastore.h */
/* loaded from: classes6.dex */
public final class C12369h implements InterfaceC19969h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private CreateMediaStoreParam f64372a;

    /* renamed from: b */
    private EnumC2382z f64373b = EnumC2382z.f9945r;

    /* renamed from: c */
    private MediaStoreSearchPage.EnumC12391a f64374c;

    /* renamed from: com.zing.zalo.ui.mediastore.h$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C12369h m69542a(Bundle bundle) {
            MediaStoreSearchPage.EnumC12391a enumC12391a;
            EnumC2382z enumC2382z;
            C12369h c12369h = new C12369h();
            if (bundle != null) {
                c12369h.m69539d(CreateMediaStoreParam.Companion.m40914a(bundle));
                EnumC2382z[] values = EnumC2382z.values();
                int length = values.length;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    enumC12391a = null;
                    if (i12 < length) {
                        enumC2382z = values[i12];
                        if (enumC2382z.m12438c() == bundle.getInt("extra_current_type")) {
                            break;
                        }
                        i12++;
                    } else {
                        enumC2382z = null;
                        break;
                    }
                }
                if (enumC2382z == null) {
                    enumC2382z = EnumC2382z.f9945r;
                }
                c12369h.m69540e(enumC2382z);
                MediaStoreSearchPage.EnumC12391a[] values2 = MediaStoreSearchPage.EnumC12391a.values();
                int length2 = values2.length;
                while (true) {
                    if (i11 >= length2) {
                        break;
                    }
                    MediaStoreSearchPage.EnumC12391a enumC12391a2 = values2[i11];
                    if (enumC12391a2.ordinal() == bundle.getInt("EXTRA_MODE_SEARCH", MediaStoreSearchPage.EnumC12391a.f64469p.ordinal())) {
                        enumC12391a = enumC12391a2;
                        break;
                    }
                    i11++;
                }
                c12369h.m69541f(enumC12391a);
            }
            return c12369h;
        }
    }

    /* renamed from: a */
    public final CreateMediaStoreParam m69536a() {
        return this.f64372a;
    }

    /* renamed from: b */
    public final EnumC2382z m69537b() {
        return this.f64373b;
    }

    /* renamed from: c */
    public final MediaStoreSearchPage.EnumC12391a m69538c() {
        return this.f64374c;
    }

    /* renamed from: d */
    public final void m69539d(CreateMediaStoreParam createMediaStoreParam) {
        this.f64372a = createMediaStoreParam;
    }

    /* renamed from: e */
    public final void m69540e(EnumC2382z enumC2382z) {
        AbstractC19074t.m100208f(enumC2382z, "<set-?>");
        this.f64373b = enumC2382z;
    }

    /* renamed from: f */
    public final void m69541f(MediaStoreSearchPage.EnumC12391a enumC12391a) {
        this.f64374c = enumC12391a;
    }
}
