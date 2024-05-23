package com.zing.zalo.p077ui.mediastore;

import android.os.Bundle;
import au.EnumC2344e0;
import com.zing.zalo.control.mediastore.CreateMediaStoreParam;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p205hc.InterfaceC19969h;

/* renamed from: com.zing.zalo.ui.mediastore.g */
/* loaded from: classes6.dex */
public final class C12368g implements InterfaceC19969h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private EnumC2344e0 f64369a = EnumC2344e0.f9852q;

    /* renamed from: b */
    private String f64370b = "";

    /* renamed from: c */
    private CreateMediaStoreParam f64371c;

    /* renamed from: com.zing.zalo.ui.mediastore.g$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C12368g m69535a(Bundle bundle) {
            EnumC2344e0 enumC2344e0;
            C12368g c12368g = new C12368g();
            if (bundle != null) {
                c12368g.m69532d(CreateMediaStoreParam.Companion.m40914a(bundle));
                EnumC2344e0[] values = EnumC2344e0.values();
                int length = values.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length) {
                        enumC2344e0 = values[i11];
                        if (enumC2344e0.ordinal() == bundle.getInt("extra_type_id")) {
                            break;
                        }
                        i11++;
                    } else {
                        enumC2344e0 = null;
                        break;
                    }
                }
                if (enumC2344e0 == null) {
                    enumC2344e0 = EnumC2344e0.f9852q;
                }
                c12368g.m69533e(enumC2344e0);
                String string = bundle.getString("extra_media_store_source_local");
                if (string == null) {
                    string = "";
                } else {
                    AbstractC19074t.m100205c(string);
                }
                c12368g.m69534f(string);
            }
            return c12368g;
        }
    }

    /* renamed from: a */
    public final CreateMediaStoreParam m69529a() {
        return this.f64371c;
    }

    /* renamed from: b */
    public final EnumC2344e0 m69530b() {
        return this.f64369a;
    }

    /* renamed from: c */
    public final String m69531c() {
        return this.f64370b;
    }

    /* renamed from: d */
    public final void m69532d(CreateMediaStoreParam createMediaStoreParam) {
        this.f64371c = createMediaStoreParam;
    }

    /* renamed from: e */
    public final void m69533e(EnumC2344e0 enumC2344e0) {
        AbstractC19074t.m100208f(enumC2344e0, "<set-?>");
        this.f64369a = enumC2344e0;
    }

    /* renamed from: f */
    public final void m69534f(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f64370b = str;
    }
}
