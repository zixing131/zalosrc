package is;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import bo.C2971f1;
import bo.C3020p0;
import bo.C3025q0;
import c30.C3255n;
import com.androidquery.util.AbstractC3972e;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.feed.uicontrols.InterfaceC8899z;
import com.zing.zalo.p077ui.widget.C13647i0;
import com.zing.zalo.stickers.FeedStickerView;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import l80.C22122a0;
import me0.AbstractC23080g8;
import me0.C23278z2;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p471r3.C25630b;
import p588vw.C28644j;
import vg.C28020b3;

/* renamed from: is.s0 */
/* loaded from: classes4.dex */
public final class C20820s0 {

    /* renamed from: a */
    public static final C20820s0 f102338a = new C20820s0();

    /* renamed from: is.s0$a */
    /* loaded from: classes4.dex */
    public static final class a extends C22122a0.d {

        /* renamed from: c */
        final /* synthetic */ C13647i0 f102339c;

        a(C13647i0 c13647i0) {
            this.f102339c = c13647i0;
        }

        @Override // l80.C22122a0.d
        /* renamed from: h */
        public void mo43943h(String str, C22122a0 c22122a0, C3979l c3979l, C23995f c23995f, boolean z11) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(c22122a0, "imageModule");
            AbstractC19074t.m100208f(c3979l, "imageInfo");
            AbstractC19074t.m100208f(c23995f, "status");
            try {
                this.f102339c.m115387U1(c3979l, false);
                this.f102339c.setThumbBitmap(c3979l.m18839c());
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: is.s0$b */
    /* loaded from: classes4.dex */
    public static final class b extends C23999j {
        b() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(interfaceC3968a, "iv");
            AbstractC19074t.m100208f(c3979l, "bm");
            AbstractC19074t.m100208f(c23995f, "status");
            try {
                FeedStickerView feedStickerView = (FeedStickerView) interfaceC3968a;
                feedStickerView.setImageInfo(c3979l, false);
                if (c3979l.m18839c() != null) {
                    feedStickerView.setThumbBitmap(c3979l.m18839c());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: is.s0$c */
    /* loaded from: classes4.dex */
    public static final class c extends C22122a0.e {

        /* renamed from: a */
        final /* synthetic */ C13647i0 f102340a;

        /* renamed from: b */
        final /* synthetic */ String f102341b;

        /* renamed from: c */
        final /* synthetic */ C2971f1 f102342c;

        /* renamed from: d */
        final /* synthetic */ C23528a f102343d;

        c(C13647i0 c13647i0, String str, C2971f1 c2971f1, C23528a c23528a) {
            this.f102340a = c13647i0;
            this.f102341b = str;
            this.f102342c = c2971f1;
            this.f102343d = c23528a;
        }

        @Override // l80.C22122a0.e
        /* renamed from: a */
        public void mo108745a(String str, C25630b c25630b, C22122a0 c22122a0, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(c25630b, "gif");
            AbstractC19074t.m100208f(c22122a0, "imageModule");
            AbstractC19074t.m100208f(c23995f, "status");
            super.mo108745a(str, c25630b, c22122a0, c23995f);
            C20820s0.f102338a.m108735i(this.f102340a, this.f102342c, this.f102343d);
        }

        @Override // l80.C22122a0.e
        /* renamed from: b */
        public void mo108746b(String str, C25630b c25630b, C22122a0 c22122a0, C3979l c3979l, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(c25630b, "gif");
            AbstractC19074t.m100208f(c22122a0, "imageModule");
            AbstractC19074t.m100208f(c3979l, "imageInfo");
            AbstractC19074t.m100208f(c23995f, "status");
            super.mo108746b(str, c25630b, c22122a0, c3979l, c23995f);
            try {
                this.f102340a.setThumbBitmap(c3979l.m18839c());
                this.f102340a.mo47512e(c25630b, this.f102341b, true, false, true);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: is.s0$d */
    /* loaded from: classes4.dex */
    public static final class d extends C28020b3.b {

        /* renamed from: a */
        final /* synthetic */ String f102344a;

        /* renamed from: b */
        final /* synthetic */ C2971f1 f102345b;

        /* renamed from: c */
        final /* synthetic */ C23528a f102346c;

        d(String str, C2971f1 c2971f1, C23528a c23528a) {
            this.f102344a = str;
            this.f102345b = c2971f1;
            this.f102346c = c23528a;
        }

        @Override // vg.C28020b3.b
        /* renamed from: a */
        public void mo36247a(String str, C25630b c25630b, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(c25630b, "stickerInfo");
            AbstractC19074t.m100208f(interfaceC3968a, "iv");
            AbstractC19074t.m100208f(c3979l, "bm");
            AbstractC19074t.m100208f(c23995f, "status");
            super.mo36247a(str, c25630b, interfaceC3968a, c3979l, c23995f);
            try {
                C28020b3.f130648a.m141189R(c23995f);
                C20820s0.f102338a.m108737k((FeedStickerView) interfaceC3968a, this.f102345b, this.f102346c);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }

        @Override // vg.C28020b3.b
        /* renamed from: b */
        public void mo35607b(String str, C25630b c25630b, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(c25630b, "stickerInfo");
            AbstractC19074t.m100208f(interfaceC3968a, "iv");
            AbstractC19074t.m100208f(c3979l, "bm");
            AbstractC19074t.m100208f(c23995f, "status");
            super.mo35607b(str, c25630b, interfaceC3968a, c3979l, c23995f);
            try {
                FeedStickerView feedStickerView = (FeedStickerView) interfaceC3968a;
                if (c3979l.m18839c() != null) {
                    feedStickerView.setImageInfo(c3979l, false);
                    feedStickerView.setThumbBitmap(c3979l.m18839c());
                }
                feedStickerView.mo47512e(c25630b, this.f102344a, true, false, true);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    private C20820s0() {
    }

    /* renamed from: c */
    private final String m108729c(String str, String str2, C25630b c25630b) {
        String m108730d = m108730d(str, str2, c25630b);
        if (m108730d.length() == 0) {
            return String.valueOf(System.currentTimeMillis());
        }
        return m108730d;
    }

    /* renamed from: d */
    private final String m108730d(String str, String str2, C25630b c25630b) {
        String m16572l = C3255n.m16562n().m16572l(str2, str, c25630b);
        AbstractC19074t.m100207e(m16572l, "generatePlayingId(...)");
        return m16572l;
    }

    /* renamed from: e */
    private final C25630b m108731e(C3020p0 c3020p0) {
        C25630b c25630b = new C25630b();
        c25630b.m132405O(c3020p0.f12023C.f12132w);
        c25630b.m132404N(c3020p0.f12023C.f12133x);
        c25630b.m132414X(c3020p0.f12023C.f12133x);
        C25630b m143282P0 = C28644j.m143233Y().m143282P0(c25630b);
        AbstractC19074t.m100207e(m143282P0, "prepareStickerInfo(...)");
        return m143282P0;
    }

    /* renamed from: f */
    private final String m108732f(C25630b c25630b, C3020p0 c3020p0) {
        C3025q0 c3025q0;
        if (c25630b != null) {
            String m18757N = AbstractC3972e.m18757N(c25630b.m132439q(), c25630b.m132430h());
            AbstractC19074t.m100205c(m18757N);
            if (m18757N.length() > 0) {
                return m18757N;
            }
            if (c25630b.m132444v().length() > 0) {
                return c25630b.m132444v();
            }
        }
        if (c3020p0 != null && (c3025q0 = c3020p0.f12023C) != null) {
            String str = c3025q0.f12130u;
            AbstractC19074t.m100207e(str, "stickerThumbUrl");
            if (str.length() > 0) {
                String str2 = c3020p0.f12023C.f12130u;
                AbstractC19074t.m100207e(str2, "stickerThumbUrl");
                return str2;
            }
            return "";
        }
        return "";
    }

    /* renamed from: g */
    private final void m108733g(InterfaceC8899z interfaceC8899z, Bitmap bitmap) {
        interfaceC8899z.setThumbBitmap(bitmap);
    }

    /* renamed from: h */
    private final void m108734h(C13647i0 c13647i0, C2971f1 c2971f1, C23528a c23528a) {
        String m108732f = m108732f(c2971f1.m14055b(), c2971f1.m14054a());
        if (m108732f.length() > 0) {
            c13647i0.m115381O1(c23528a, m108732f, C23278z2.m120089P0(), new a(c13647i0));
        }
    }

    /* renamed from: i */
    public final void m108735i(C13647i0 c13647i0, C2971f1 c2971f1, C23528a c23528a) {
        Bitmap bitmap;
        try {
            C25630b m14055b = c2971f1.m14055b();
            if (m14055b != null) {
                bitmap = C28020b3.f130648a.m141206w(m14055b);
            } else {
                bitmap = null;
            }
            if (bitmap != null) {
                m108733g(c13647i0, bitmap);
            } else {
                m108734h(c13647i0, c2971f1, c23528a);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: j */
    private final void m108736j(FeedStickerView feedStickerView, C2971f1 c2971f1, C23528a c23528a) {
        String m108732f = m108732f(c2971f1.m14055b(), c2971f1.m14054a());
        if (m108732f.length() > 0) {
            ((C23528a) c23528a.m123612r(feedStickerView)).m123579C(m108732f, C23278z2.m120089P0(), new b());
        }
    }

    /* renamed from: k */
    public final void m108737k(FeedStickerView feedStickerView, C2971f1 c2971f1, C23528a c23528a) {
        Bitmap bitmap;
        try {
            C25630b m14055b = c2971f1.m14055b();
            if (m14055b != null) {
                bitmap = C28020b3.f130648a.m141206w(m14055b);
            } else {
                bitmap = null;
            }
            if (bitmap != null) {
                m108733g(feedStickerView, bitmap);
            } else {
                m108736j(feedStickerView, c2971f1, c23528a);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: l */
    private final void m108738l(InterfaceC8899z interfaceC8899z, C25630b c25630b, String str) {
        interfaceC8899z.mo47512e(c25630b, str, true, false, true);
    }

    /* renamed from: m */
    private final void m108739m(C13647i0 c13647i0, C2971f1 c2971f1, String str, C23528a c23528a) {
        try {
            C25630b m14055b = c2971f1.m14055b();
            if (m14055b == null) {
                return;
            }
            if (m14055b.m132448z()) {
                m108738l(c13647i0, m14055b, str);
            } else {
                Drawable drawable = C23278z2.m120091Q0().f116261b;
                if (!TextUtils.isEmpty(m14055b.m132446x())) {
                    c13647i0.m115383Q1(c23528a, m14055b, drawable, C23278z2.m120089P0().f116262c, new c(c13647i0, str, c2971f1, c23528a));
                } else {
                    m108735i(c13647i0, c2971f1, c23528a);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: n */
    public static final void m108740n(FeedStickerView feedStickerView, C2971f1 c2971f1, C23528a c23528a) {
        C25630b c25630b;
        AbstractC19074t.m100208f(feedStickerView, "feedStickerView");
        AbstractC19074t.m100208f(c23528a, "aq");
        if (c2971f1 == null) {
            return;
        }
        C3020p0 m14054a = c2971f1.m14054a();
        C25630b m14055b = c2971f1.m14055b();
        if (m14055b != null) {
            c25630b = C28644j.m143233Y().m143282P0(m14055b);
        } else {
            c25630b = null;
        }
        if (m14054a != null) {
            c25630b = f102338a.m108731e(m14054a);
        }
        if (c25630b != null) {
            C20820s0 c20820s0 = f102338a;
            String m108729c = c20820s0.m108729c(c2971f1.m14057d(), c2971f1.m14056c(), c25630b);
            c2971f1.m14059f(c25630b);
            c20820s0.m108744r(feedStickerView, c2971f1, m108729c, c23528a);
        }
    }

    /* renamed from: o */
    public static final void m108741o(C13647i0 c13647i0, C2971f1 c2971f1, C23528a c23528a) {
        C25630b c25630b;
        AbstractC19074t.m100208f(c13647i0, "feedStickerView");
        AbstractC19074t.m100208f(c23528a, "aq");
        if (c2971f1 == null) {
            return;
        }
        C3020p0 m14054a = c2971f1.m14054a();
        C25630b m14055b = c2971f1.m14055b();
        if (m14055b != null) {
            c25630b = C28644j.m143233Y().m143282P0(m14055b);
        } else {
            c25630b = null;
        }
        if (m14054a != null) {
            c25630b = f102338a.m108731e(m14054a);
        }
        if (c25630b != null) {
            C20820s0 c20820s0 = f102338a;
            String m108729c = c20820s0.m108729c(c2971f1.m14057d(), c2971f1.m14056c(), c25630b);
            c2971f1.m14059f(c25630b);
            c20820s0.m108743q(c13647i0, c2971f1, m108729c, c23528a);
        }
    }

    /* renamed from: p */
    private final void m108742p(FeedStickerView feedStickerView, C2971f1 c2971f1, String str, C23528a c23528a) {
        try {
            C25630b m14055b = c2971f1.m14055b();
            if (m14055b == null) {
                return;
            }
            if (m14055b.m132448z()) {
                m108738l(feedStickerView, m14055b, str);
            } else if (m14055b.m132446x().length() > 0) {
                C28020b3.m141166H(C28020b3.f130648a, feedStickerView, c23528a, m14055b, null, false, new d(str, c2971f1, c23528a), 12, null);
            } else {
                m108737k(feedStickerView, c2971f1, c23528a);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: q */
    private final void m108743q(C13647i0 c13647i0, C2971f1 c2971f1, String str, C23528a c23528a) {
        try {
            C25630b m14055b = c2971f1.m14055b();
            if (m14055b != null) {
                if (AbstractC23080g8.m118403h(m14055b.m132429g(), m14055b.m132427f())) {
                    f102338a.m108739m(c13647i0, c2971f1, str, c23528a);
                } else {
                    f102338a.m108735i(c13647i0, c2971f1, c23528a);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: r */
    private final void m108744r(FeedStickerView feedStickerView, C2971f1 c2971f1, String str, C23528a c23528a) {
        try {
            C25630b m14055b = c2971f1.m14055b();
            if (m14055b != null) {
                feedStickerView.setVisibility(0);
                if (AbstractC23080g8.m118403h(m14055b.m132429g(), m14055b.m132427f())) {
                    f102338a.m108742p(feedStickerView, c2971f1, str, c23528a);
                } else {
                    f102338a.m108737k(feedStickerView, c2971f1, c23528a);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
