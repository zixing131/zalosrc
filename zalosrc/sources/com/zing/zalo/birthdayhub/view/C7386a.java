package com.zing.zalo.birthdayhub.view;

import android.os.Bundle;
import fn0.AbstractC19060k;
import p205hc.InterfaceC19969h;

/* renamed from: com.zing.zalo.birthdayhub.view.a */
/* loaded from: classes3.dex */
public final class C7386a implements InterfaceC19969h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final int f40173a;

    /* renamed from: com.zing.zalo.birthdayhub.view.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C7386a m37511a(Bundle bundle) {
            if (bundle != null) {
                return new C7386a(bundle.getInt("extra_key_source"));
            }
            return null;
        }
    }

    public C7386a(int i11) {
        this.f40173a = i11;
    }
}
