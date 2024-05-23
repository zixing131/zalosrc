package com.zing.zalo.p077ui.zviews;

import android.os.Bundle;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p205hc.InterfaceC19969h;

/* renamed from: com.zing.zalo.ui.zviews.l1 */
/* loaded from: classes6.dex */
public final class C15836l1 implements InterfaceC19969h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f80960a;

    /* renamed from: b */
    private final String f80961b;

    /* renamed from: c */
    private final String f80962c;

    /* renamed from: d */
    private final int f80963d;

    /* renamed from: com.zing.zalo.ui.zviews.l1$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C15836l1 m87334a(Bundle bundle) {
            if (bundle == null) {
                return new C15836l1(null, null, null, 0, 15, null);
            }
            String string = bundle.getString("EXTRA_KEY_ZINSTANT_API_INFO", "");
            String string2 = bundle.getString("EXTRA_KEY_APP_ID", "");
            String string3 = bundle.getString("EXTRA_KEY_URL", "");
            int i11 = bundle.getInt("EXTRA_KEY_SOURCE", 6);
            AbstractC19074t.m100205c(string);
            AbstractC19074t.m100205c(string2);
            AbstractC19074t.m100205c(string3);
            return new C15836l1(string, string2, string3, i11);
        }
    }

    public C15836l1(String str, String str2, String str3, int i11) {
        AbstractC19074t.m100208f(str, "zinstantApiInfo");
        AbstractC19074t.m100208f(str2, "appId");
        AbstractC19074t.m100208f(str3, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        this.f80960a = str;
        this.f80961b = str2;
        this.f80962c = str3;
        this.f80963d = i11;
    }

    /* renamed from: a */
    public final String m87330a() {
        return this.f80961b;
    }

    /* renamed from: b */
    public final int m87331b() {
        return this.f80963d;
    }

    /* renamed from: c */
    public final String m87332c() {
        return this.f80962c;
    }

    /* renamed from: d */
    public final String m87333d() {
        return this.f80960a;
    }

    public /* synthetic */ C15836l1(String str, String str2, String str3, int i11, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? "" : str2, (i12 & 4) != 0 ? "" : str3, (i12 & 8) != 0 ? 6 : i11);
    }
}
