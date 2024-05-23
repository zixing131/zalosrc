package p243ip;

import android.os.Bundle;
import fn0.AbstractC19060k;
import p205hc.InterfaceC19969h;

/* renamed from: ip.d */
/* loaded from: classes4.dex */
public final class C20648d implements InterfaceC19969h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    public int f101592a;

    /* renamed from: e */
    public int f101596e;

    /* renamed from: b */
    public String f101593b = "";

    /* renamed from: c */
    public String f101594c = "";

    /* renamed from: d */
    public String f101595d = "";

    /* renamed from: f */
    public String f101597f = "";

    /* renamed from: ip.d$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C20648d m107628a(Bundle bundle) {
            C20648d c20648d = new C20648d();
            if (bundle == null) {
                return c20648d;
            }
            c20648d.f101592a = bundle.getInt("EXTRA_LIKE_MODE");
            String string = bundle.getString("EXTRA_LIKE_FEED_ID");
            String str = "";
            if (string == null) {
                string = "";
            }
            c20648d.f101593b = string;
            String string2 = bundle.getString("EXTRA_LIKE_PHOTO_ID");
            if (string2 == null) {
                string2 = "";
            }
            c20648d.f101594c = string2;
            String string3 = bundle.getString("EXTRA_LIKE_COMMENT_ID");
            if (string3 == null) {
                string3 = "";
            }
            c20648d.f101595d = string3;
            String string4 = bundle.getString("EXTRA_OWNER_ID", "");
            if (string4 != null) {
                str = string4;
            }
            c20648d.f101597f = str;
            return c20648d;
        }
    }

    /* renamed from: a */
    public static final C20648d m107627a(Bundle bundle) {
        return Companion.m107628a(bundle);
    }
}
