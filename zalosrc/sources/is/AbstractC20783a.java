package is;

import android.content.Context;
import com.zing.zalo.AbstractC7921d0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hm0.C20096c;
import me0.AbstractC23136l9;
import on0.AbstractC24341v;

/* renamed from: is.a */
/* loaded from: classes4.dex */
public abstract class AbstractC20783a {
    public static final a Companion = new a(null);

    /* renamed from: is.a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final String m108432a(int i11) {
            String quantityString = MainApplication.Companion.m35500c().getResources().getQuantityString(AbstractC7921d0.str_number_photo, i11, Integer.valueOf(i11));
            AbstractC19074t.m100207e(quantityString, "getQuantityString(...)");
            return quantityString;
        }

        /* renamed from: b */
        public final String m108433b(int i11) {
            String quantityString = MainApplication.Companion.m35500c().getResources().getQuantityString(AbstractC7921d0.str_number_video, i11, Integer.valueOf(i11));
            AbstractC19074t.m100207e(quantityString, "getQuantityString(...)");
            return quantityString;
        }

        /* renamed from: c */
        public final void m108434c(Context context, C20096c c20096c) {
            String m118743r0;
            boolean m127128x;
            AbstractC19074t.m100208f(context, "context");
            AbstractC19074t.m100208f(c20096c, "p0");
            switch (c20096c.m104491c()) {
                case 10000:
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_album_create_album_empty_title);
                    break;
                case 10001:
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_album_create_album_title_too_long);
                    break;
                case 10002:
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_album_create_album_desc_too_long);
                    break;
                case 10003:
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_album_create_album_full_album);
                    break;
                default:
                    m118743r0 = "";
                    break;
            }
            AbstractC19074t.m100205c(m118743r0);
            m127128x = AbstractC24341v.m127128x(m118743r0);
            if (!(!m127128x)) {
                m118743r0 = null;
            }
            if (m118743r0 != null) {
                a aVar = AbstractC20783a.Companion;
                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_alert_feed_album_privacy_confirm);
                AbstractC19074t.m100207e(m118743r02, "getString(...)");
                aVar.m108436e(context, m118743r0, m118743r02);
            }
        }

        /* renamed from: d */
        public final void m108435d(Context context) {
            AbstractC19074t.m100208f(context, "context");
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_album_create_album_full_album);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_alert_feed_album_privacy_confirm);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            m108436e(context, m118743r0, m118743r02);
        }

        /* renamed from: e */
        public final void m108436e(Context context, String str, String str2) {
            AbstractC19074t.m100208f(context, "context");
            AbstractC19074t.m100208f(str, "title");
            AbstractC19074t.m100208f(str2, "positiveButton");
            new C8009j.a(context).m43159h(4).m43162k(str).m43170s(str2, new InterfaceC17463d.b()).m43152a().mo13822K();
        }
    }

    /* renamed from: a */
    public static final void m108431a(Context context) {
        Companion.m108435d(context);
    }
}
