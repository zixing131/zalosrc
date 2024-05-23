package p30;

import android.os.Bundle;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p205hc.InterfaceC19969h;

/* renamed from: p30.a */
/* loaded from: classes5.dex */
public final class C24622a implements InterfaceC19969h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f118441a;

    /* renamed from: b */
    private final int f118442b;

    /* renamed from: c */
    private final int f118443c;

    /* renamed from: d */
    private final int f118444d;

    /* renamed from: p30.a$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C24622a m128128a(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            String string = bundle.getString("EXTRA_STORY_ID", "");
            AbstractC19074t.m100207e(string, "getString(...)");
            return new C24622a(string, bundle.getInt("EXTRA_CURRENT_VIEWER_COUNT", 0), bundle.getInt("EXTRA_CURRENT_REACTION_COUNT", 0), bundle.getInt("EXTRA_SOURCE_FROM", 0));
        }
    }

    public C24622a(String str, int i11, int i12, int i13) {
        AbstractC19074t.m100208f(str, "storyId");
        this.f118441a = str;
        this.f118442b = i11;
        this.f118443c = i12;
        this.f118444d = i13;
    }

    /* renamed from: a */
    public final int m128124a() {
        return this.f118443c;
    }

    /* renamed from: b */
    public final int m128125b() {
        return this.f118444d;
    }

    /* renamed from: c */
    public final String m128126c() {
        return this.f118441a;
    }

    /* renamed from: d */
    public final int m128127d() {
        return this.f118442b;
    }
}
