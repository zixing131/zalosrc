package c30;

import android.content.Context;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.zing.zalo.gifplayer.C8917b;
import com.zing.zalo.uicontrol.ZSimpleGIFView;
import com.zing.zalo.zview.dialog.C17465f;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import me0.AbstractC23136l9;
import p485rj.C25810b;
import p716zh.C31902e9;

/* renamed from: c30.g */
/* loaded from: classes5.dex */
public class C3241g extends KeyEventCallbackC17462c {

    /* renamed from: c30.g$a */
    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a */
        private final Context f13841a;

        /* renamed from: b */
        private final C31902e9 f13842b;

        public a(Context context, C31902e9 c31902e9) {
            this.f13842b = c31902e9;
            this.f13841a = context;
        }

        /* renamed from: a */
        public C3241g m16451a() {
            String str;
            String str2;
            int i11;
            int i12;
            int i13;
            int i14;
            String str3;
            C3241g c3241g = new C3241g(this.f13841a);
            c3241g.m92870v(1);
            ZSimpleGIFView zSimpleGIFView = new ZSimpleGIFView(this.f13841a);
            C31902e9 c31902e9 = this.f13842b;
            if (c31902e9 != null && c31902e9.m153311c() != null) {
                C25810b m145108b = this.f13842b.m153311c().m145108b();
                C25810b m145109c = this.f13842b.m153311c().m145109c();
                C25810b m145110d = this.f13842b.m153311c().m145110d();
                C25810b m145111e = this.f13842b.m153311c().m145111e();
                if (m145111e != null) {
                    str = m145111e.f123105a;
                    i12 = m145111e.f123106b;
                    i11 = m145111e.f123107c;
                    str2 = str;
                } else {
                    str = "";
                    str2 = str;
                    i11 = 1;
                    i12 = 1;
                }
                if (m145108b != null) {
                    i14 = m145108b.f123106b;
                    i13 = m145108b.f123107c;
                    if (i14 * i13 * 4 <= C8917b.f47666W) {
                        str = m145108b.f123105a;
                        str3 = str;
                        zSimpleGIFView.m88227l(new ZSimpleGIFView.C16554f(str3, str2, i14, i13, "GifPreviewDialog"), 0, null);
                        zSimpleGIFView.m88224g(100L);
                    }
                }
                if (m145109c != null) {
                    int i15 = m145109c.f123106b;
                    int i16 = m145109c.f123107c;
                    if (i15 * i16 * 4 <= C8917b.f47666W) {
                        str3 = m145109c.f123105a;
                        i13 = i16;
                        i14 = i15;
                        zSimpleGIFView.m88227l(new ZSimpleGIFView.C16554f(str3, str2, i14, i13, "GifPreviewDialog"), 0, null);
                        zSimpleGIFView.m88224g(100L);
                    }
                }
                if (m145110d != null) {
                    String str4 = m145110d.f123105a;
                    str3 = str4;
                    i14 = m145110d.f123106b;
                    i13 = m145110d.f123107c;
                    zSimpleGIFView.m88227l(new ZSimpleGIFView.C16554f(str3, str2, i14, i13, "GifPreviewDialog"), 0, null);
                    zSimpleGIFView.m88224g(100L);
                } else {
                    i13 = i11;
                    i14 = i12;
                    str3 = str;
                    zSimpleGIFView.m88227l(new ZSimpleGIFView.C16554f(str3, str2, i14, i13, "GifPreviewDialog"), 0, null);
                    zSimpleGIFView.m88224g(100L);
                }
            }
            c3241g.m92852C(zSimpleGIFView, new ViewGroup.LayoutParams(-1, -1));
            c3241g.m92874z(false);
            C17465f m92867k = c3241g.m92867k();
            WindowManager.LayoutParams m92901h = m92867k.m92901h();
            m92901h.gravity = 49;
            m92901h.y = AbstractC23136l9.m118767z0(this.f13841a);
            m92901h.width = AbstractC23136l9.m118722k0() - AbstractC23136l9.m118742r(20.0f);
            m92867k.m92912v(m92901h);
            return c3241g;
        }
    }

    public C3241g(Context context) {
        super(context);
    }
}
