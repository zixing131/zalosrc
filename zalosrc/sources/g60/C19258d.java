package g60;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import b40.C2535j;
import bo.C3020p0;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowVideo;
import com.zing.zalo.p077ui.imageviewer.C12063c;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zmedia.cache.AbstractC17297a;
import com.zing.zalo.zmedia.cache.CacheException;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zmedia.view.InterfaceC17372n;
import com.zing.zalo.zmedia.view.VideoController;
import com.zing.zalo.zmedia.view.ViewOnClickListenerC17374o;
import com.zing.zalo.zmedia.view.ZVideoView;
import com.zing.zalo.zplayer.C17395R;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import gw.AbstractC19646n0;
import hf0.AbstractC20049k;
import hf0.C20043e;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import java.io.File;
import me0.AbstractC23006a0;
import me0.AbstractC23136l9;
import me0.AbstractC23238v2;
import mm0.AbstractC23350e;
import org.json.JSONException;
import org.json.JSONObject;
import p348mi.AbstractC23306f;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p396ol.C24302e;
import p461qu.AbstractC25495a;
import p487rl.C25821b;
import p559uv.C27373c;
import vg.C28075g8;
import xd0.C29604t;

/* renamed from: g60.d */
/* loaded from: classes5.dex */
public final class C19258d {

    /* renamed from: a */
    private boolean f95737a;

    /* renamed from: b */
    private boolean f95738b;

    /* renamed from: d */
    private ItemAlbumMobile f95740d;

    /* renamed from: e */
    private a f95741e;

    /* renamed from: f */
    private C20043e f95742f;

    /* renamed from: g */
    private C12063c.h f95743g;

    /* renamed from: i */
    private boolean f95745i;

    /* renamed from: j */
    private int f95746j;

    /* renamed from: k */
    private int f95747k;

    /* renamed from: c */
    private final C3977j f95739c = new C3977j(MainApplication.Companion.m35500c());

    /* renamed from: h */
    private String f95744h = "viewfull";

    /* renamed from: g60.d$a */
    /* loaded from: classes5.dex */
    public interface a {
        /* renamed from: a */
        boolean mo66908a(C12063c.h hVar, ItemAlbumMobile itemAlbumMobile);

        /* renamed from: b */
        void mo66909b(ItemAlbumMobile itemAlbumMobile, long j11, long j12);

        /* renamed from: c */
        void mo66910c(C12063c.h hVar, ItemAlbumMobile itemAlbumMobile);
    }

    /* renamed from: g60.d$b */
    /* loaded from: classes5.dex */
    public static final class b extends C23999j {

        /* renamed from: m1 */
        final /* synthetic */ ItemAlbumMobile f95749m1;

        /* renamed from: n1 */
        final /* synthetic */ C12063c.h f95750n1;

        b(ItemAlbumMobile itemAlbumMobile, C12063c.h hVar) {
            this.f95749m1 = itemAlbumMobile;
            this.f95750n1 = hVar;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            ZVideoView zVideoView;
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(interfaceC3968a, "iv");
            AbstractC19074t.m100208f(c23995f, "status");
            try {
                C19258d.this.f95739c.setImageInfo(c3979l, false);
                if (c3979l != null && AbstractC19074t.m100204b(this.f95749m1.f42607x, str) && (zVideoView = this.f95750n1.f62983A) != null) {
                    zVideoView.setLoadingViewImageInfo(c3979l);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: g60.d$c */
    /* loaded from: classes5.dex */
    public static final class c extends VideoController.AbstractC17311d {

        /* renamed from: a */
        final /* synthetic */ C12063c.h f95751a;

        /* renamed from: b */
        final /* synthetic */ C19258d f95752b;

        /* renamed from: c */
        final /* synthetic */ ItemAlbumMobile f95753c;

        c(C12063c.h hVar, C19258d c19258d, ItemAlbumMobile itemAlbumMobile) {
            this.f95751a = hVar;
            this.f95752b = c19258d;
            this.f95753c = itemAlbumMobile;
        }

        @Override // com.zing.zalo.zmedia.view.VideoController.AbstractC17311d
        /* renamed from: a */
        public void mo61749a(boolean z11) {
            this.f95751a.m67338U(z11);
        }

        @Override // com.zing.zalo.zmedia.view.VideoController.AbstractC17311d
        /* renamed from: c */
        public void mo81920c(boolean z11) {
            this.f95751a.m67350Z(z11);
        }

        @Override // com.zing.zalo.zmedia.view.VideoController.AbstractC17311d
        /* renamed from: d */
        public void mo61750d(ZVideoView zVideoView, long j11, long j12) {
            AbstractC19074t.m100208f(zVideoView, "zVideoView");
            a m100958k = this.f95752b.m100958k();
            if (m100958k != null) {
                m100958k.mo66909b(this.f95753c, j11, j12);
            }
            C19258d c19258d = this.f95752b;
            c19258d.m100952F(Math.max(c19258d.m100957h(), (int) j11));
            this.f95752b.m100951E((int) j12);
        }
    }

    /* renamed from: g60.d$d */
    /* loaded from: classes5.dex */
    public static final class d implements InterfaceC17372n {

        /* renamed from: q */
        final /* synthetic */ C12063c.h f95755q;

        d(C12063c.h hVar) {
            this.f95755q = hVar;
        }

        @Override // com.zing.zalo.zmedia.view.InterfaceC17372n
        /* renamed from: F1 */
        public void mo81899F1(boolean z11, String str) {
            this.f95755q.m67349Y(z11, str);
        }

        @Override // com.zing.zalo.zmedia.view.InterfaceC17372n
        /* renamed from: XC */
        public void mo79714XC(long j11) {
            C19258d.this.m100953G(true);
        }

        @Override // com.zing.zalo.zmedia.view.InterfaceC17372n
        /* renamed from: k3 */
        public boolean mo79717k3(View view) {
            if (view == null || view.getId() != C17395R.id.video_btn_snapshot || AbstractC23238v2.m119726k()) {
                return false;
            }
            ToastUtils.m89266n(AbstractC8020f0.str_error_full_sdcard_more_descriptive, new Object[0]);
            return true;
        }
    }

    /* renamed from: g60.d$e */
    /* loaded from: classes5.dex */
    public static final class e implements AbstractC17297a.b {

        /* renamed from: p */
        final /* synthetic */ ItemAlbumMobile f95756p;

        /* renamed from: q */
        final /* synthetic */ C19258d f95757q;

        e(ItemAlbumMobile itemAlbumMobile, C19258d c19258d) {
            this.f95756p = itemAlbumMobile;
            this.f95757q = c19258d;
        }

        @Override // com.zing.zalo.zmedia.cache.AbstractC17297a.b
        /* renamed from: cH */
        public void mo39665cH(C17391z c17391z, CacheException cacheException) {
            C17391z c17391z2 = this.f95756p.f42586k0;
            if (c17391z2 != null) {
                C19258d c19258d = this.f95757q;
                if (AbstractC19074t.m100204b(c17391z2, c17391z)) {
                    c19258d.m100961o();
                }
            }
        }

        @Override // com.zing.zalo.zmedia.cache.AbstractC17297a.b
        /* renamed from: qH */
        public void mo39666qH(C17391z c17391z) {
        }

        @Override // com.zing.zalo.zmedia.cache.AbstractC17297a.b
        /* renamed from: tE */
        public void mo39667tE(C17391z c17391z) {
        }
    }

    public C19258d(boolean z11) {
        this.f95738b = true;
        this.f95738b = z11;
    }

    /* renamed from: e */
    private final void m100937e() {
        this.f95737a = true;
    }

    /* renamed from: f */
    private final void m100938f() {
        this.f95737a = false;
    }

    /* renamed from: i */
    private final float m100939i(C23528a c23528a, String str, int i11, int i12) {
        float f11;
        if (i11 > 0 && i12 > 0) {
            f11 = i11 / i12;
        } else {
            f11 = 1.7777778f;
        }
        File m123603i = c23528a.m123603i(str);
        if (m123603i != null) {
            return ChatRowVideo.m61692B4(m123603i, f11);
        }
        return f11;
    }

    /* renamed from: j */
    private final int m100940j(ItemAlbumMobile itemAlbumMobile) {
        if (AbstractC25495a.m132079d(itemAlbumMobile.f42579d0)) {
            return 7;
        }
        MediaStoreItem mediaStoreItem = itemAlbumMobile.f42598s0;
        if (mediaStoreItem != null && mediaStoreItem.m40598l0()) {
            return 6;
        }
        C3020p0 c3020p0 = itemAlbumMobile.f42594q0;
        if (c3020p0 != null && c3020p0.m14483L()) {
            return 2;
        }
        return 0;
    }

    /* renamed from: n */
    private final void m100941n(ItemAlbumMobile itemAlbumMobile, C23528a c23528a, C12063c.h hVar) {
        C23528a c23528a2;
        String str = itemAlbumMobile.f42607x;
        if (str != null && str.length() != 0 && (c23528a2 = (C23528a) c23528a.m123612r(this.f95739c)) != null) {
        }
    }

    /* renamed from: p */
    private final void m100942p() {
        AbstractC19444a.m101697e(new Runnable() { // from class: g60.c
            public /* synthetic */ RunnableC19257c() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C19258d.m100943q(C19258d.this);
            }
        });
    }

    /* renamed from: q */
    public static final void m100943q(C19258d c19258d) {
        String str;
        ZVideoView zVideoView;
        Context context;
        AbstractC19074t.m100208f(c19258d, "this$0");
        C12063c.h hVar = c19258d.f95743g;
        if (hVar != null && (zVideoView = hVar.f62983A) != null && (context = zVideoView.getContext()) != null) {
            str = context.getString(AbstractC8020f0.str_zcloud_unable_to_access_this_item);
        } else {
            str = null;
        }
        ToastUtils.showMess(str);
        c19258d.m100961o();
    }

    /* renamed from: s */
    private final void m100944s(C23528a c23528a, ItemAlbumMobile itemAlbumMobile) {
        String str = itemAlbumMobile.f42587l0;
        AbstractC19074t.m100207e(str, "videoStr");
        if (str.length() > 0) {
            try {
                itemAlbumMobile.f42586k0 = new C17391z(new JSONObject(itemAlbumMobile.f42587l0));
            } catch (JSONException e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
        if (itemAlbumMobile.m40503M() == null) {
            C27373c c27373c = itemAlbumMobile.f42588m0;
            AbstractC19074t.m100205c(c27373c);
            String m140268v = c27373c.m140268v();
            AbstractC19074t.m100205c(m140268v);
            float m100939i = m100939i(c23528a, m140268v, c27373c.m140221F(), c27373c.m140272z());
            String str2 = itemAlbumMobile.f42595r;
            String m140253g = c27373c.m140253g();
            if (m140253g == null) {
                m140253g = "";
            }
            itemAlbumMobile.f42586k0 = new C17391z(str2, m140253g, c27373c.m140220E(), "", c27373c.m140268v(), AbstractC23006a0.m117875E(), false, 9, m100939i, c27373c.m140266t(), null, itemAlbumMobile.f42593q, 0);
        }
    }

    /* renamed from: w */
    public static final void m100945w(C19258d c19258d, C12063c.h hVar, ItemAlbumMobile itemAlbumMobile, int i11) {
        AbstractC19074t.m100208f(c19258d, "this$0");
        if (i11 != -1) {
            if (i11 == 2) {
                a aVar = c19258d.f95741e;
                if (aVar != null) {
                    AbstractC19074t.m100205c(aVar);
                    if (!aVar.mo66908a(hVar, itemAlbumMobile)) {
                        ZVideoView zVideoView = hVar.f62983A;
                        if (zVideoView != null) {
                            zVideoView.pause();
                            return;
                        }
                        return;
                    }
                }
                ZVideoView zVideoView2 = hVar.f62983A;
                if (zVideoView2 != null) {
                    zVideoView2.start();
                }
                c19258d.m100937e();
                c19258d.m100962r();
                return;
            }
            return;
        }
        c19258d.m100961o();
    }

    /* renamed from: x */
    public static final boolean m100946x(C12063c.h hVar, ItemAlbumMobile itemAlbumMobile, boolean z11, C19258d c19258d, C23528a c23528a, int i11, IMediaPlayer iMediaPlayer, int i12, int i13) {
        C17391z c17391z;
        boolean z12;
        boolean z13;
        MessageId m40496C;
        String str;
        String str2;
        AbstractC19074t.m100208f(c19258d, "this$0");
        AbstractC19074t.m100208f(c23528a, "$aQuery");
        ZVideoView zVideoView = hVar.f62983A;
        if (zVideoView == null || (c17391z = itemAlbumMobile.f42586k0) == null) {
            return false;
        }
        if (zVideoView != null) {
            z12 = zVideoView.m92407N(iMediaPlayer, i12, i13);
        } else {
            z12 = false;
        }
        ZVideoView zVideoView2 = hVar.f62983A;
        if (zVideoView2 != null) {
            z13 = zVideoView2.m92408O(iMediaPlayer, i12, i13);
        } else {
            z13 = false;
        }
        if (AbstractC19074t.m100204b(c17391z, zVideoView.getVideo()) && ((z12 || z13) && (m40496C = itemAlbumMobile.m40496C()) != null && (str = itemAlbumMobile.f42579d0) != null && str.length() != 0 && (str2 = itemAlbumMobile.f42593q) != null && str2.length() != 0)) {
            MessageId m40496C2 = itemAlbumMobile.m40496C();
            if (m40496C2 != null && AbstractC23306f.m120691m2().m2461l()) {
                C25821b m128917N = AbstractC23306f.m120639Z1().m128917N(m40496C2);
                if (m128917N != null) {
                    if (z11) {
                        try {
                            C27373c m102939V0 = AbstractC19646n0.m102939V0(m128917N);
                            if (m102939V0 != null) {
                                itemAlbumMobile.f42588m0 = m102939V0;
                                String m140268v = m102939V0.m140268v();
                                AbstractC19074t.m100205c(m140268v);
                                float m100939i = c19258d.m100939i(c23528a, m140268v, m102939V0.m140221F(), m102939V0.m140272z());
                                String str3 = itemAlbumMobile.f42595r;
                                String m140253g = m102939V0.m140253g();
                                if (m140253g == null) {
                                    m140253g = "";
                                }
                                itemAlbumMobile.f42586k0 = new C17391z(str3, m140253g, m102939V0.m140220E(), "", m102939V0.m140268v(), AbstractC23006a0.m117875E(), false, 9, m100939i, m102939V0.m140266t(), null, itemAlbumMobile.f42593q, 0);
                                c19258d.m100965v(c23528a, itemAlbumMobile, hVar, i11, false);
                                return false;
                            }
                        } catch (Exception e11) {
                            AbstractC23350e.m122778h(e11);
                            c19258d.m100942p();
                            return false;
                        }
                    } else {
                        c19258d.m100942p();
                        return false;
                    }
                } else {
                    c19258d.m100942p();
                }
            } else {
                c19258d.m100942p();
            }
            if (z12 && !AbstractC19646n0.m103038v1(1, itemAlbumMobile.f42564O)) {
                C29604t m120618S1 = AbstractC23306f.m120618S1();
                String str4 = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str4, "currentUserUid");
                String str5 = itemAlbumMobile.f42579d0;
                AbstractC19074t.m100207e(str5, "chatOwnerUid");
                String str6 = itemAlbumMobile.f42593q;
                AbstractC19074t.m100207e(str6, "ownerid");
                m120618S1.m101508a(new C29604t.a(str4, str5, m40496C, str6, c19258d.f95744h));
                if (C24302e.Companion.m126922m()) {
                    itemAlbumMobile.f42585j0 = true;
                }
            }
            C2535j.f10308a.m12773q(c19258d.f95744h, itemAlbumMobile, z12);
        }
        return false;
    }

    /* renamed from: A */
    public final void m100947A() {
        this.f95746j = 0;
        this.f95747k = 0;
    }

    /* renamed from: B */
    public final void m100948B(C23528a c23528a) {
        C12063c.h hVar;
        ZVideoView zVideoView;
        AbstractC19074t.m100208f(c23528a, "aQuery");
        ItemAlbumMobile itemAlbumMobile = this.f95740d;
        if (itemAlbumMobile != null && itemAlbumMobile.f42591p == 2 && (hVar = this.f95743g) != null && (zVideoView = hVar.f62983A) != null) {
            int currentState = zVideoView.getCurrentState();
            if (currentState != 0) {
                if (currentState != 2) {
                    if (currentState != 3) {
                        if (currentState != 4) {
                            if (currentState != 5 && currentState != 6) {
                                return;
                            }
                        }
                    }
                    m100937e();
                    return;
                }
                C20043e c20043e = this.f95742f;
                if (c20043e != null) {
                    c20043e.m104037s();
                    return;
                }
                return;
            }
            m100964u(c23528a, itemAlbumMobile, this.f95743g, -1);
        }
    }

    /* renamed from: C */
    public final void m100949C(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f95744h = str;
    }

    /* renamed from: D */
    public final void m100950D(int i11) {
        ZVideoView zVideoView;
        VideoController videoController;
        View bottomControlLayout;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i12;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int i13;
        C12063c.h hVar = this.f95743g;
        if (hVar != null && (zVideoView = hVar.f62983A) != null && (videoController = zVideoView.getVideoController()) != null && (bottomControlLayout = videoController.getBottomControlLayout()) != null) {
            int i14 = 0;
            bottomControlLayout.setBackgroundColor(0);
            ViewGroup.LayoutParams layoutParams = bottomControlLayout.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = null;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            if (marginLayoutParams != null) {
                i12 = marginLayoutParams.leftMargin;
            } else {
                i12 = 0;
            }
            ViewGroup.LayoutParams layoutParams2 = bottomControlLayout.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            } else {
                marginLayoutParams2 = null;
            }
            if (marginLayoutParams2 != null) {
                i13 = marginLayoutParams2.topMargin;
            } else {
                i13 = 0;
            }
            ViewGroup.LayoutParams layoutParams3 = bottomControlLayout.getLayoutParams();
            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
            }
            if (marginLayoutParams3 != null) {
                i14 = marginLayoutParams3.rightMargin;
            }
            if (i11 <= -1) {
                i11 = AbstractC23136l9.m118742r(60.0f);
            }
            videoController.m92292P(i12, i13, i14, i11);
        }
    }

    /* renamed from: E */
    public final void m100951E(int i11) {
        this.f95747k = i11;
    }

    /* renamed from: F */
    public final void m100952F(int i11) {
        this.f95746j = i11;
    }

    /* renamed from: G */
    public final void m100953G(boolean z11) {
        this.f95745i = z11;
    }

    /* renamed from: H */
    public final void m100954H(a aVar) {
        this.f95741e = aVar;
    }

    /* renamed from: I */
    public final void m100955I() {
        ZVideoView zVideoView;
        C20043e c20043e = this.f95742f;
        if (c20043e != null) {
            c20043e.m104039z();
        }
        C12063c.h hVar = this.f95743g;
        ZVideoView zVideoView2 = null;
        if (hVar != null && (zVideoView = hVar.f62983A) != null) {
            zVideoView.setOnPlayerStateChangedListener(null);
        }
        C12063c.h hVar2 = this.f95743g;
        if (hVar2 != null) {
            zVideoView2 = hVar2.f62983A;
        }
        if (zVideoView2 != null) {
            zVideoView2.setVisibility(8);
        }
        m100938f();
    }

    /* renamed from: g */
    public final int m100956g() {
        return this.f95747k;
    }

    /* renamed from: h */
    public final int m100957h() {
        return this.f95746j;
    }

    /* renamed from: k */
    public final a m100958k() {
        return this.f95741e;
    }

    /* renamed from: l */
    public final C12063c.h m100959l() {
        return this.f95743g;
    }

    /* renamed from: m */
    public final boolean m100960m() {
        return this.f95745i;
    }

    /* renamed from: o */
    public final void m100961o() {
        a aVar;
        ZVideoView zVideoView;
        m100938f();
        C12063c.h hVar = this.f95743g;
        if (hVar != null && (zVideoView = hVar.f62983A) != null && zVideoView.getVideoController() != null) {
            zVideoView.m92419m0(false);
            zVideoView.getVideoController().m92297U(false);
            zVideoView.setForceHideController(true);
        }
        C12063c.h hVar2 = this.f95743g;
        if (hVar2 != null && this.f95740d != null && (aVar = this.f95741e) != null) {
            AbstractC19074t.m100205c(hVar2);
            ItemAlbumMobile itemAlbumMobile = this.f95740d;
            AbstractC19074t.m100205c(itemAlbumMobile);
            aVar.mo66910c(hVar2, itemAlbumMobile);
        }
    }

    /* renamed from: r */
    public final void m100962r() {
        ZVideoView zVideoView;
        C12063c.h hVar = this.f95743g;
        if (hVar != null && (zVideoView = hVar.f62983A) != null && zVideoView.getVideoController() != null) {
            zVideoView.m92419m0(false);
            zVideoView.getVideoController().m92297U(false);
            zVideoView.setForceHideController(false);
            zVideoView.m92418l0(true);
        }
    }

    /* renamed from: t */
    public final void m100963t() {
        C20043e c20043e;
        if (this.f95740d != null && (c20043e = this.f95742f) != null) {
            c20043e.m104036r();
        }
        m100938f();
    }

    /* renamed from: u */
    public final void m100964u(C23528a c23528a, ItemAlbumMobile itemAlbumMobile, C12063c.h hVar, int i11) {
        AbstractC19074t.m100208f(c23528a, "aQuery");
        m100965v(c23528a, itemAlbumMobile, hVar, i11, true);
    }

    /* renamed from: v */
    public final void m100965v(C23528a c23528a, ItemAlbumMobile itemAlbumMobile, C12063c.h hVar, int i11, boolean z11) {
        RecyclingImageView loadingView;
        VideoController videoController;
        ViewOnClickListenerC17374o viewOnClickListenerC17374o;
        VideoController videoController2;
        VideoController videoController3;
        VideoController videoController4;
        VideoController videoController5;
        VideoController videoController6;
        ZVideoView zVideoView;
        VideoController videoController7;
        AbstractC19074t.m100208f(c23528a, "aQuery");
        if (itemAlbumMobile != null && hVar != null && itemAlbumMobile.f42588m0 != null) {
            ItemAlbumMobile itemAlbumMobile2 = this.f95740d;
            if (itemAlbumMobile2 != null) {
                if (itemAlbumMobile2.f42595r.equals(itemAlbumMobile.f42595r) && AbstractC19074t.m100204b(hVar, this.f95743g)) {
                    if (this.f95737a && itemAlbumMobile2.f42591p == 2 && itemAlbumMobile2.m40503M() != null) {
                        this.f95740d = itemAlbumMobile;
                        return;
                    }
                } else {
                    m100955I();
                }
            }
            this.f95740d = itemAlbumMobile;
            this.f95743g = hVar;
            this.f95745i = false;
            m100947A();
            m100944s(c23528a, itemAlbumMobile);
            int m100940j = m100940j(itemAlbumMobile);
            this.f95742f = new C20043e(hVar.f62983A, m100940j);
            if (itemAlbumMobile.f42585j0) {
                m100961o();
                return;
            }
            if (itemAlbumMobile.f42549C0 && (zVideoView = hVar.f62983A) != null && (videoController7 = zVideoView.getVideoController()) != null) {
                videoController7.setComponentEnabled(false);
            }
            ZVideoView zVideoView2 = hVar.f62983A;
            if (zVideoView2 != null && (videoController6 = zVideoView2.getVideoController()) != null) {
                videoController6.setAllowShowLoadingView(false);
            }
            ZVideoView zVideoView3 = hVar.f62983A;
            if (zVideoView3 != null && (videoController5 = zVideoView3.getVideoController()) != null) {
                videoController5.setEnableSnapshot(this.f95738b);
            }
            ZVideoView zVideoView4 = hVar.f62983A;
            if (zVideoView4 != null && (videoController4 = zVideoView4.getVideoController()) != null) {
                videoController4.setSnapShotFolder(AbstractC20130d.m104905y());
            }
            ZVideoView zVideoView5 = hVar.f62983A;
            if (zVideoView5 != null && (videoController3 = zVideoView5.getVideoController()) != null) {
                videoController3.setEnableFullScreen(false);
            }
            ZVideoView zVideoView6 = hVar.f62983A;
            if (zVideoView6 != null && (videoController2 = zVideoView6.getVideoController()) != null) {
                videoController2.m92307i(new c(hVar, this, itemAlbumMobile));
            }
            ZVideoView zVideoView7 = hVar.f62983A;
            if (zVideoView7 != null && (videoController = zVideoView7.getVideoController()) != null && (viewOnClickListenerC17374o = videoController.f88210s) != null) {
                viewOnClickListenerC17374o.m92523p(new d(hVar));
            }
            m100950D(i11 > -1 ? i11 : AbstractC23136l9.m118742r(60.0f));
            ZVideoView zVideoView8 = hVar.f62983A;
            if (zVideoView8 != null) {
                zVideoView8.setUseVideoRatio(false);
            }
            ZVideoView zVideoView9 = hVar.f62983A;
            if (zVideoView9 != null) {
                zVideoView9.setSkipShowControlWhenStart(true);
            }
            if (itemAlbumMobile.f42549C0) {
                ZVideoView zVideoView10 = hVar.f62983A;
                if (zVideoView10 != null) {
                    zVideoView10.setPlayConfig(ZMediaPlayerSettings.getPlayConfig(6));
                }
            } else {
                ZVideoView zVideoView11 = hVar.f62983A;
                if (zVideoView11 != null) {
                    zVideoView11.setPlayConfig(ZMediaPlayerSettings.getPlayConfig(2));
                }
            }
            ZVideoView zVideoView12 = hVar.f62983A;
            if (zVideoView12 != null) {
                zVideoView12.setOnPlayerStateChangedListener(new ZVideoView.InterfaceC17345q() { // from class: g60.a

                    /* renamed from: q */
                    public final /* synthetic */ C12063c.h f95728q;

                    /* renamed from: r */
                    public final /* synthetic */ ItemAlbumMobile f95729r;

                    public /* synthetic */ C19255a(C12063c.h hVar2, ItemAlbumMobile itemAlbumMobile3) {
                        r2 = hVar2;
                        r3 = itemAlbumMobile3;
                    }

                    @Override // com.zing.zalo.zmedia.view.ZVideoView.InterfaceC17345q
                    /* renamed from: D */
                    public final void mo44076D(int i12) {
                        C19258d.m100945w(C19258d.this, r2, r3, i12);
                    }
                });
            }
            ZVideoView zVideoView13 = hVar2.f62983A;
            if (zVideoView13 != null) {
                zVideoView13.setOnErrorListener(new IMediaPlayer.OnErrorListener() { // from class: g60.b

                    /* renamed from: q */
                    public final /* synthetic */ ItemAlbumMobile f95731q;

                    /* renamed from: r */
                    public final /* synthetic */ boolean f95732r;

                    /* renamed from: s */
                    public final /* synthetic */ C19258d f95733s;

                    /* renamed from: t */
                    public final /* synthetic */ C23528a f95734t;

                    /* renamed from: u */
                    public final /* synthetic */ int f95735u;

                    public /* synthetic */ C19256b(ItemAlbumMobile itemAlbumMobile3, boolean z112, C19258d this, C23528a c23528a2, int i112) {
                        r2 = itemAlbumMobile3;
                        r3 = z112;
                        r4 = this;
                        r5 = c23528a2;
                        r6 = i112;
                    }

                    @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnErrorListener
                    public final boolean onError(IMediaPlayer iMediaPlayer, int i12, int i13) {
                        boolean m100946x;
                        m100946x = C19258d.m100946x(C12063c.h.this, r2, r3, r4, r5, r6, iMediaPlayer, i12, i13);
                        return m100946x;
                    }
                });
            }
            ZVideoView zVideoView14 = hVar2.f62983A;
            if (zVideoView14 != null) {
                zVideoView14.setOnCacheListener(new e(itemAlbumMobile3, this));
            }
            ZVideoView zVideoView15 = hVar2.f62983A;
            if (zVideoView15 != null) {
                zVideoView15.setAudioFocusControl(C28075g8.m141538e());
            }
            C3979l m67348W = hVar2.m67348W();
            if (m67348W == null) {
                ZVideoView zVideoView16 = hVar2.f62983A;
                if (zVideoView16 != null && (loadingView = zVideoView16.getLoadingView()) != null) {
                    loadingView.setImageInfo(null);
                    loadingView.setBackgroundColor(-16777216);
                }
                m100941n(itemAlbumMobile3, c23528a2, hVar2);
            } else {
                ZVideoView zVideoView17 = hVar2.f62983A;
                if (zVideoView17 != null) {
                    zVideoView17.setLoadingViewImageInfo(m67348W);
                }
            }
            ZVideoView zVideoView18 = hVar2.f62983A;
            if (zVideoView18 != null) {
                zVideoView18.m92421n0(true);
            }
            ZVideoView zVideoView19 = hVar2.f62983A;
            if (zVideoView19 != null) {
                zVideoView19.setVisibility(0);
            }
            ZVideoView zVideoView20 = hVar2.f62983A;
            if (zVideoView20 != null) {
                zVideoView20.setIsFocusing(true);
            }
            ZVideoView zVideoView21 = hVar2.f62983A;
            if (zVideoView21 != null) {
                zVideoView21.setVideoPlayerMode(2);
            }
            C17391z c17391z = itemAlbumMobile3.f42586k0;
            if (c17391z != null) {
                AbstractC20049k.m104116j(hVar2.f62983A, c17391z, m100940j, c17391z.f88618a);
                return;
            }
            return;
        }
        m100955I();
    }

    /* renamed from: y */
    public final void m100966y() {
        ZVideoView zVideoView;
        if (this.f95740d != null) {
            this.f95740d = null;
        }
        C12063c.h hVar = this.f95743g;
        if (hVar != null) {
            zVideoView = hVar.f62983A;
        } else {
            zVideoView = null;
        }
        m100967z(zVideoView);
        this.f95743g = null;
        this.f95739c.setImageInfo(null);
        this.f95741e = null;
    }

    /* renamed from: z */
    public final void m100967z(ZVideoView zVideoView) {
        if (zVideoView != null) {
            try {
                zVideoView.setOnPlayerStateChangedListener(null);
                zVideoView.m92415i0();
                zVideoView.m92412f0(true);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }
}
