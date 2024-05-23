package com.zing.zalo.p077ui.toolstoragev1.list;

import android.os.Bundle;
import fn0.AbstractC19060k;
import p205hc.InterfaceC19969h;

/* renamed from: com.zing.zalo.ui.toolstoragev1.list.a */
/* loaded from: classes6.dex */
public final class C13466a implements InterfaceC19969h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final long f68939a;

    /* renamed from: b */
    private final long f68940b;

    /* renamed from: com.zing.zalo.ui.toolstoragev1.list.a$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C13466a m75525a(Bundle bundle) {
            C13466a c13466a = new C13466a(0L, 0L, 3, null);
            if (bundle == null) {
                return c13466a;
            }
            return new C13466a(bundle.getLong("size_conversation", 0L), bundle.getLong("size_cache", 0L));
        }
    }

    public C13466a(long j11, long j12) {
        this.f68939a = j11;
        this.f68940b = j12;
    }

    /* renamed from: a */
    public final long m75523a() {
        return this.f68940b;
    }

    /* renamed from: b */
    public final long m75524b() {
        return this.f68939a;
    }

    public /* synthetic */ C13466a(long j11, long j12, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? 0L : j11, (i11 & 2) != 0 ? 0L : j12);
    }
}
