package com.zing.zalo.p077ui.imageviewer;

import ag0.C0853x0;
import am.AbstractC0939u;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.util.C1483e;
import androidx.core.view.AbstractC1579n0;
import b40.C2535j;
import com.androidquery.util.C3979l;
import com.androidquery.util.C3980m;
import com.androidquery.util.RecyclingImageView;
import com.showingphotolib.view.HackyViewPager;
import com.zing.p058v4.view.AbstractC6881a;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.imageviewer.C12063c;
import com.zing.zalo.p077ui.mediastore.MediaStorePopulatePage;
import com.zing.zalo.photoview.PhotoView;
import com.zing.zalo.photoview.ViewOnTouchListenerC9043a;
import com.zing.zalo.uicomponents.framelayout.DragToCloseLayout;
import com.zing.zalo.uicontrol.C16641r;
import com.zing.zalo.uicontrol.C16649s0;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zmedia.view.ZVideoView;
import dj.C17945a0;
import g60.C19258d;
import gg0.AbstractC19444a;
import gw.AbstractC19646n0;
import ho0.AbstractC20110a;
import j70.RunnableC21023i0;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import me0.AbstractC23041d2;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p542ub.InterfaceC27218a;
import p649xl.C30111x1;
import p698yz.AbstractC31125u;
import p698yz.C31126v;
import p698yz.EnumC31127w;
import p716zh.AbstractC32146v5;
import tg0.C26676b;

/* renamed from: com.zing.zalo.ui.imageviewer.c */
/* loaded from: classes5.dex */
public class C12063c extends AbstractC6881a {

    /* renamed from: H */
    static final String f62927H = "c";

    /* renamed from: B */
    d f62929B;

    /* renamed from: C */
    a f62930C;

    /* renamed from: D */
    MediaStorePopulatePage.InterfaceC12300b f62931D;

    /* renamed from: E */
    C19258d f62932E;

    /* renamed from: r */
    Handler f62935r;

    /* renamed from: s */
    InterfaceC27218a f62936s;

    /* renamed from: t */
    LayoutInflater f62937t;

    /* renamed from: u */
    ArrayList f62938u = new ArrayList();

    /* renamed from: v */
    c f62939v = null;

    /* renamed from: w */
    int f62940w = -1;

    /* renamed from: x */
    SparseArray f62941x = new SparseArray();

    /* renamed from: y */
    public boolean f62942y = true;

    /* renamed from: z */
    Matrix f62943z = null;

    /* renamed from: A */
    ItemAlbumMobile f62928A = null;

    /* renamed from: F */
    public boolean f62933F = false;

    /* renamed from: G */
    boolean f62934G = false;

    /* renamed from: com.zing.zalo.ui.imageviewer.c$a */
    /* loaded from: classes5.dex */
    public interface a {
        /* renamed from: Al */
        void mo66808Al(g gVar, int i11);

        /* renamed from: B3 */
        void mo66809B3(float f11);

        /* renamed from: Co */
        boolean mo66814Co();

        /* renamed from: Ee */
        void mo66697Ee(c cVar, int i11);

        /* renamed from: Ev */
        void mo66817Ev(g gVar, int i11);

        /* renamed from: F1 */
        void mo66818F1(boolean z11, String str);

        /* renamed from: G6 */
        void mo66820G6(g gVar, int i11);

        /* renamed from: Ic */
        void mo66699Ic(g gVar, f fVar, int i11, int i12);

        /* renamed from: Qo */
        f mo66829Qo(g gVar, ItemAlbumMobile itemAlbumMobile);

        /* renamed from: Uw */
        void mo66838Uw(g gVar, f fVar, int i11);

        /* renamed from: bz */
        String mo66853bz();

        /* renamed from: dr */
        void mo66711dr(g gVar, int i11, float f11);

        /* renamed from: ea */
        int mo66858ea();

        /* renamed from: el */
        void mo66859el(g gVar);

        /* renamed from: la */
        boolean mo66724la();

        /* renamed from: mF */
        void mo66872mF(g gVar, int i11);

        /* renamed from: mp */
        void mo66726mp(g gVar, f fVar, int i11, C3979l c3979l);

        /* renamed from: ns */
        void mo66875ns(g gVar, int i11);

        /* renamed from: q9 */
        void mo66878q9(g gVar, f fVar, int i11);

        /* renamed from: r7 */
        void mo66880r7(g gVar, int i11);

        /* renamed from: sn */
        void mo66883sn(g gVar, int i11);

        /* renamed from: ue */
        View mo66886ue();

        /* renamed from: wm */
        void mo66889wm(boolean z11);

        /* renamed from: yr */
        boolean mo66892yr();
    }

    /* renamed from: com.zing.zalo.ui.imageviewer.c$b */
    /* loaded from: classes5.dex */
    public static class b implements c {

        /* renamed from: a */
        MediaStorePopulatePage f62944a;

        /* renamed from: b */
        Handler f62945b;

        /* renamed from: c */
        a f62946c;

        /* renamed from: d */
        d f62947d;

        /* renamed from: e */
        int f62948e;

        /* renamed from: f */
        boolean f62949f = true;

        public b(View view, Handler handler, a aVar, d dVar) {
            this.f62945b = handler;
            this.f62946c = aVar;
            this.f62947d = dVar;
            MediaStorePopulatePage mediaStorePopulatePage = (MediaStorePopulatePage) view;
            this.f62944a = mediaStorePopulatePage;
            mediaStorePopulatePage.setMDelegate(aVar);
        }

        @Override // com.zing.zalo.p077ui.imageviewer.C12063c.c
        /* renamed from: a */
        public void mo67293a() {
            this.f62944a.setAnimationState(false);
            this.f62949f = true;
        }

        @Override // com.zing.zalo.p077ui.imageviewer.C12063c.c
        /* renamed from: b */
        public PhotoView mo67294b() {
            return null;
        }

        @Override // com.zing.zalo.p077ui.imageviewer.C12063c.c
        /* renamed from: c */
        public void mo67295c(ItemAlbumMobile itemAlbumMobile, int i11) {
            this.f62948e = i11;
            this.f62944a.m69134s(i11);
        }

        @Override // com.zing.zalo.p077ui.imageviewer.C12063c.c
        /* renamed from: d */
        public void mo67296d() {
            this.f62944a.m69134s(this.f62948e);
            if (this.f62949f) {
                this.f62944a.m69135u(this.f62948e);
            } else {
                this.f62944a.setAnimationState(false);
            }
        }

        /* renamed from: e */
        public void m67297e(boolean z11) {
            this.f62949f = z11;
        }

        @Override // com.zing.zalo.p077ui.imageviewer.C12063c.c
        public View getView() {
            return this.f62944a;
        }
    }

    /* renamed from: com.zing.zalo.ui.imageviewer.c$c */
    /* loaded from: classes5.dex */
    public interface c {
        /* renamed from: a */
        void mo67293a();

        /* renamed from: b */
        PhotoView mo67294b();

        /* renamed from: c */
        void mo67295c(ItemAlbumMobile itemAlbumMobile, int i11);

        /* renamed from: d */
        void mo67296d();

        View getView();
    }

    /* renamed from: com.zing.zalo.ui.imageviewer.c$d */
    /* loaded from: classes5.dex */
    public interface d {

        /* renamed from: com.zing.zalo.ui.imageviewer.c$d$a */
        /* loaded from: classes5.dex */
        public interface a {
            /* renamed from: a */
            void mo67298a(f fVar, int i11, C3979l c3979l, int i12);
        }

        /* renamed from: CE */
        C3979l mo66811CE(String str, int i11, e eVar);

        /* renamed from: Ot */
        void mo66826Ot(RecyclingImageView recyclingImageView, f fVar, int i11, a aVar);

        /* renamed from: Rd */
        File mo66832Rd(String str, int i11);
    }

    /* renamed from: com.zing.zalo.ui.imageviewer.c$e */
    /* loaded from: classes5.dex */
    public interface e {
        /* renamed from: a */
        void mo67299a();

        /* renamed from: b */
        void mo67300b();
    }

    /* renamed from: com.zing.zalo.ui.imageviewer.c$f */
    /* loaded from: classes5.dex */
    public static class f {

        /* renamed from: a */
        public ItemAlbumMobile f62950a;

        /* renamed from: b */
        public final String f62951b;

        /* renamed from: c */
        public final int f62952c;

        /* renamed from: d */
        public final int f62953d;

        /* renamed from: e */
        public boolean f62954e;

        public f(String str, int i11, int i12) {
            this.f62951b = str;
            this.f62952c = i11;
            this.f62953d = i12;
        }

        public boolean equals(Object obj) {
            if (obj != this) {
                if (obj instanceof f) {
                    f fVar = (f) obj;
                    if (!TextUtils.equals(this.f62951b, fVar.f62951b) || this.f62952c != fVar.f62952c) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Objects.hash(this.f62951b, Integer.valueOf(this.f62952c));
        }
    }

    /* renamed from: com.zing.zalo.ui.imageviewer.c$g */
    /* loaded from: classes5.dex */
    public static class g implements c {

        /* renamed from: a */
        InterfaceC27218a f62955a;

        /* renamed from: b */
        Handler f62956b;

        /* renamed from: c */
        a f62957c;

        /* renamed from: d */
        d f62958d;

        /* renamed from: e */
        View f62959e;

        /* renamed from: f */
        PhotoView f62960f;

        /* renamed from: g */
        View f62961g;

        /* renamed from: h */
        FrameLayout f62962h;

        /* renamed from: i */
        C30111x1 f62963i;

        /* renamed from: j */
        ItemAlbumMobile f62964j;

        /* renamed from: k */
        int f62965k;

        /* renamed from: l */
        public f f62966l;

        /* renamed from: m */
        public f f62967m;

        /* renamed from: n */
        public f f62968n;

        /* renamed from: r */
        boolean f62972r;

        /* renamed from: s */
        public boolean f62973s;

        /* renamed from: u */
        public boolean f62975u;

        /* renamed from: o */
        public boolean f62969o = false;

        /* renamed from: p */
        public boolean f62970p = false;

        /* renamed from: q */
        public boolean f62971q = false;

        /* renamed from: t */
        public int f62974t = 0;

        /* renamed from: v */
        public String f62976v = "";

        /* renamed from: w */
        private boolean f62977w = false;

        /* renamed from: x */
        e f62978x = new a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.imageviewer.c$g$a */
        /* loaded from: classes5.dex */
        public class a implements e {
            a() {
            }

            @Override // com.zing.zalo.p077ui.imageviewer.C12063c.e
            /* renamed from: a */
            public void mo67299a() {
                g gVar = g.this;
                gVar.f62957c.mo66859el(gVar);
            }

            @Override // com.zing.zalo.p077ui.imageviewer.C12063c.e
            /* renamed from: b */
            public void mo67300b() {
                g gVar = g.this;
                if (gVar.f62961g == null) {
                    gVar.f62961g = gVar.f62959e.findViewById(AbstractC6918a0.pbLoading);
                }
            }
        }

        /* renamed from: com.zing.zalo.ui.imageviewer.c$g$b */
        /* loaded from: classes5.dex */
        public class b implements ViewOnTouchListenerC9043a.j {
            b() {
            }

            @Override // com.zing.zalo.photoview.ViewOnTouchListenerC9043a.j
            /* renamed from: a */
            public void mo48415a(float f11, float f12, float f13) {
                g gVar = g.this;
                gVar.f62957c.mo66711dr(gVar, gVar.f62965k, f11);
            }

            @Override // com.zing.zalo.photoview.ViewOnTouchListenerC9043a.j
            /* renamed from: b */
            public void mo48416b(View view, float f11, float f12) {
                g gVar = g.this;
                gVar.f62957c.mo66880r7(gVar, gVar.f62965k);
            }
        }

        /* renamed from: com.zing.zalo.ui.imageviewer.c$g$c */
        /* loaded from: classes5.dex */
        public class c implements ViewOnTouchListenerC9043a.i {
            c() {
            }

            @Override // com.zing.zalo.photoview.ViewOnTouchListenerC9043a.i
            /* renamed from: a */
            public void mo48410a(float f11) {
            }

            @Override // com.zing.zalo.photoview.ViewOnTouchListenerC9043a.i
            /* renamed from: b */
            public void mo48411b() {
                g.this.m67332N();
                g gVar = g.this;
                gVar.f62957c.mo66872mF(gVar, gVar.f62965k);
            }

            @Override // com.zing.zalo.photoview.ViewOnTouchListenerC9043a.i
            /* renamed from: c */
            public void mo48412c() {
                g gVar = g.this;
                gVar.f62957c.mo66875ns(gVar, gVar.f62965k);
            }

            @Override // com.zing.zalo.photoview.ViewOnTouchListenerC9043a.i
            /* renamed from: d */
            public void mo48413d() {
                g gVar = g.this;
                gVar.f62957c.mo66808Al(gVar, gVar.f62965k);
            }

            @Override // com.zing.zalo.photoview.ViewOnTouchListenerC9043a.i
            /* renamed from: e */
            public void mo48414e() {
                g.this.m67331M();
                g gVar = g.this;
                gVar.f62957c.mo66883sn(gVar, gVar.f62965k);
            }
        }

        /* renamed from: com.zing.zalo.ui.imageviewer.c$g$d */
        /* loaded from: classes5.dex */
        public class d extends AbstractC0939u {
            d() {
            }

            /* renamed from: d */
            public /* synthetic */ void m67346d(f fVar) {
                g.this.m67329K(fVar);
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                boolean z11;
                String m40504N;
                f m155118a;
                try {
                    if (!TextUtils.isEmpty(g.this.f62964j.f42609y) && AbstractC23041d2.m118194A(g.this.f62964j.f42609y)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    C26676b.m136952b(C12063c.f62927H, "preparePhotoData: localPath = " + g.this.f62964j.f42609y);
                    g gVar = g.this;
                    if (z11) {
                        m40504N = gVar.f62964j.f42609y;
                    } else {
                        m40504N = gVar.f62964j.m40504N();
                    }
                    gVar.f62976v = m40504N;
                    g gVar2 = g.this;
                    ItemAlbumMobile itemAlbumMobile = gVar2.f62964j;
                    if (itemAlbumMobile.f42546B) {
                        f m155118a2 = AbstractC32146v5.m155118a(gVar2.f62976v, 1);
                        m155118a = new f(m155118a2.f62951b, 2, m155118a2.f62953d);
                    } else {
                        if (itemAlbumMobile.f42566Q && !TextUtils.isEmpty(itemAlbumMobile.f42544A)) {
                            if (!AbstractC23304d.f113361a3.contains(g.this.f62964j.f42544A)) {
                                g gVar3 = g.this;
                                File mo66832Rd = gVar3.f62958d.mo66832Rd(gVar3.f62964j.f42544A, 2);
                                if (mo66832Rd != null && mo66832Rd.exists()) {
                                    g.this.f62975u = true;
                                }
                            } else {
                                g.this.f62964j.f42566Q = false;
                            }
                        }
                        g gVar4 = g.this;
                        if (gVar4.f62975u) {
                            m155118a = AbstractC32146v5.m155118a(gVar4.f62964j.f42544A, 2);
                        } else {
                            m155118a = AbstractC32146v5.m155118a(gVar4.f62976v, 1);
                        }
                    }
                    m155118a.f62950a = g.this.f62964j;
                    m155118a.f62954e = z11;
                    AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.imageviewer.d

                        /* renamed from: q */
                        public final /* synthetic */ C12063c.f f62997q;

                        public /* synthetic */ RunnableC12065d(C12063c.f m155118a3) {
                            r2 = m155118a3;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C12063c.g.d.this.m67346d(r2);
                        }
                    });
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
        }

        public g(View view, Handler handler, InterfaceC27218a interfaceC27218a, a aVar, d dVar, boolean z11) {
            this.f62959e = view;
            this.f62956b = handler;
            this.f62955a = interfaceC27218a;
            this.f62957c = aVar;
            this.f62958d = dVar;
            this.f62972r = z11;
            this.f62960f = (PhotoView) view.findViewById(AbstractC6918a0.photo_view);
            this.f62961g = view.findViewById(AbstractC6918a0.pbLoading);
        }

        /* renamed from: A */
        public /* synthetic */ void m67301A(f fVar, f fVar2, int i11, C3979l c3979l, int i12) {
            ItemAlbumMobile itemAlbumMobile;
            try {
                if (i11 != this.f62965k || !fVar2.equals(this.f62967m) || !AbstractC1579n0.m7862d0(this.f62959e)) {
                    return;
                }
                if (m67316o(i12, fVar2, this.f62964j, c3979l)) {
                    if (fVar2.f62952c == 2) {
                        i12 = 3;
                    } else {
                        i12 = 7;
                    }
                }
                if (i12 == 10 && (itemAlbumMobile = fVar2.f62950a) != null && itemAlbumMobile.f42591p != 2) {
                    this.f62964j.f42566Q = false;
                    m67326H(fVar2, i12);
                    return;
                }
                if (!m67306T(i12)) {
                    if (i12 == 3 || i12 == 1 || i12 == 6) {
                        this.f62964j.f42566Q = false;
                    }
                    m67326H(fVar2, i12);
                    return;
                }
                if (c3979l != null && c3979l.m18839c() != null && c3979l.m18839c().getWidth() > 1 && c3979l.m18839c().getHeight() > 1) {
                    m67322y(fVar2, c3979l);
                    return;
                }
                if (fVar2.f62952c == 2 && this.f62957c.mo66892yr()) {
                    C3979l imageInfo = this.f62960f.getImageInfo();
                    if (imageInfo != null) {
                        m67322y(fVar2, imageInfo);
                        return;
                    }
                    C26676b.m136952b(C12063c.f62927H, "loadPhoto ENTRY 2");
                    f m155118a = AbstractC32146v5.m155118a(this.f62976v, 1);
                    m155118a.f62950a = fVar.f62950a;
                    this.f62958d.mo66826Ot(this.f62960f, m155118a, i11, new d.a() { // from class: j70.h0

                        /* renamed from: b */
                        public final /* synthetic */ C12063c.f f102960b;

                        public /* synthetic */ C21019h0(C12063c.f fVar22) {
                            r2 = fVar22;
                        }

                        @Override // com.zing.zalo.p077ui.imageviewer.C12063c.d.a
                        /* renamed from: a */
                        public final void mo67298a(C12063c.f fVar3, int i13, C3979l c3979l2, int i14) {
                            C12063c.g.this.m67323z(r2, fVar3, i13, c3979l2, i14);
                        }
                    });
                    return;
                }
                m67342q(fVar22, i12);
            } catch (Exception e11) {
                this.f62960f.setAllowScale(true);
                e11.printStackTrace();
            }
        }

        /* renamed from: B */
        public /* synthetic */ void m67302B(f fVar, boolean z11) {
            m67324F(fVar, z11, false);
        }

        /* renamed from: C */
        public /* synthetic */ boolean m67303C(View view) {
            this.f62957c.mo66817Ev(this, this.f62965k);
            return true;
        }

        /* renamed from: D */
        public /* synthetic */ void m67304D(float f11) {
            this.f62957c.mo66809B3(f11);
        }

        /* renamed from: E */
        public /* synthetic */ void m67305E(View view) {
            this.f62957c.mo66880r7(this, this.f62965k);
        }

        /* renamed from: T */
        private boolean m67306T(int i11) {
            return (i11 == 3 || i11 == 4 || i11 == 1 || i11 == 7 || i11 == 6) ? false : true;
        }

        /* renamed from: o */
        private boolean m67316o(int i11, f fVar, ItemAlbumMobile itemAlbumMobile, C3979l c3979l) {
            boolean z11 = false;
            if (i11 != 0) {
                if (i11 != 3) {
                    if (i11 != 8) {
                        if (i11 == 404) {
                            if (m67319v(i11, itemAlbumMobile)) {
                                itemAlbumMobile.f42584i0 = true;
                                itemAlbumMobile.f42583h0 = true;
                                z11 = true;
                            }
                        }
                    } else if (m67319v(i11, itemAlbumMobile)) {
                        if (fVar.f62952c == 2) {
                            AbstractC23304d.f113361a3.add(fVar.f62951b);
                            itemAlbumMobile.f42584i0 = true;
                            return true;
                        }
                        itemAlbumMobile.f42583h0 = true;
                        return true;
                    }
                    return false;
                }
                itemAlbumMobile.f42584i0 = true;
                return true;
            }
            if (c3979l == null && m67318u(itemAlbumMobile, fVar.f62951b)) {
                itemAlbumMobile.f42583h0 = true;
                return true;
            }
            return z11;
        }

        /* renamed from: t */
        private boolean m67317t(String str) {
            if (!str.startsWith("http://") && !str.startsWith("https://")) {
                return true;
            }
            return false;
        }

        /* renamed from: u */
        private boolean m67318u(ItemAlbumMobile itemAlbumMobile, String str) {
            C17945a0 c17945a0;
            if (!m67317t(str) || itemAlbumMobile == null || !itemAlbumMobile.m40509T() || AbstractC23041d2.m118194A(str)) {
                return false;
            }
            if (itemAlbumMobile.m40496C() != null) {
                c17945a0 = AbstractC19646n0.m102950Z(itemAlbumMobile.f42579d0, itemAlbumMobile.m40496C());
            } else {
                c17945a0 = null;
            }
            if (c17945a0 == null || AbstractC19646n0.m103038v1(c17945a0.m95295x4(), c17945a0.m94974P4())) {
                return false;
            }
            return true;
        }

        /* renamed from: v */
        private boolean m67319v(int i11, ItemAlbumMobile itemAlbumMobile) {
            C17945a0 c17945a0;
            if ((i11 != 404 && i11 != 8) || itemAlbumMobile == null || !itemAlbumMobile.m40509T()) {
                return false;
            }
            if (itemAlbumMobile.m40496C() != null) {
                c17945a0 = AbstractC19646n0.m102950Z(itemAlbumMobile.f42579d0, itemAlbumMobile.m40496C());
            } else {
                c17945a0 = null;
            }
            if (c17945a0 == null || !c17945a0.m95302y1(404)) {
                return false;
            }
            return true;
        }

        /* renamed from: w */
        public /* synthetic */ void m67320w(C3979l c3979l) {
            this.f62960f.getPhotoViewAttacher().m48358P();
            this.f62960f.setImageInfo(c3979l);
        }

        /* renamed from: x */
        public /* synthetic */ void m67321x(f fVar) {
            m67324F(fVar, this.f62973s, true);
        }

        /* renamed from: z */
        public /* synthetic */ void m67323z(f fVar, f fVar2, int i11, C3979l c3979l, int i12) {
            if (i11 != this.f62965k || !AbstractC1579n0.m7862d0(this.f62959e)) {
                return;
            }
            AbstractC19444a.m101697e(new Runnable() { // from class: j70.j0

                /* renamed from: q */
                public final /* synthetic */ C12063c.f f102974q;

                /* renamed from: r */
                public final /* synthetic */ C3979l f102975r;

                public /* synthetic */ RunnableC21027j0(C12063c.f fVar3, C3979l c3979l2) {
                    r2 = fVar3;
                    r3 = c3979l2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C12063c.g.this.m67322y(r2, r3);
                }
            });
        }

        /* renamed from: F */
        void m67324F(f fVar, boolean z11, boolean z12) {
            PhotoView photoView;
            try {
                f fVar2 = this.f62968n;
                if (fVar2 != null && fVar2.f62952c > fVar.f62952c) {
                    return;
                }
                this.f62970p = true;
                this.f62967m = fVar;
                this.f62973s = z11;
                if (fVar2 != null && fVar2.equals(fVar) && (photoView = this.f62960f) != null && photoView.getImageInfo() != null) {
                    m67322y(fVar, this.f62960f.getImageInfo());
                    return;
                }
                if (!z12) {
                    this.f62974t = 0;
                }
                if (!TextUtils.isEmpty(this.f62967m.f62951b)) {
                    if (!z12) {
                        m67328J(this.f62967m);
                    }
                    C26676b.m136952b(C12063c.f62927H, "loadPhoto ENTRY 1");
                    this.f62958d.mo66826Ot(this.f62960f, fVar, this.f62965k, new d.a() { // from class: j70.d0

                        /* renamed from: b */
                        public final /* synthetic */ C12063c.f f102934b;

                        public /* synthetic */ C21003d0(C12063c.f fVar3) {
                            r2 = fVar3;
                        }

                        @Override // com.zing.zalo.p077ui.imageviewer.C12063c.d.a
                        /* renamed from: a */
                        public final void mo67298a(C12063c.f fVar3, int i11, C3979l c3979l, int i12) {
                            C12063c.g.this.m67301A(r2, fVar3, i11, c3979l, i12);
                        }
                    });
                    return;
                }
                m67326H(fVar3, 2);
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C12063c.f62927H, e11);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
        /* renamed from: G */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        C1483e m67325G() {
            boolean z11;
            C3979l mo66811CE;
            String m40504N = this.f62964j.m40504N();
            int i11 = 1;
            if (!TextUtils.isEmpty(this.f62964j.f42609y)) {
                ItemAlbumMobile itemAlbumMobile = this.f62964j;
                if (!TextUtils.equals(itemAlbumMobile.f42609y, itemAlbumMobile.m40504N())) {
                    z11 = true;
                    mo66811CE = this.f62958d.mo66811CE(m40504N, 1, this.f62978x);
                    if (mo66811CE == null && z11) {
                        m40504N = this.f62964j.f42609y;
                        mo66811CE = this.f62958d.mo66811CE(m40504N, 1, this.f62978x);
                    }
                    if (mo66811CE == null && !TextUtils.isEmpty(this.f62964j.f42550D)) {
                        m40504N = this.f62964j.f42550D;
                        mo66811CE = this.f62958d.mo66811CE(m40504N, 0, this.f62978x);
                        i11 = 0;
                    }
                    if (mo66811CE == null) {
                        m40504N = this.f62964j.m40504N();
                        mo66811CE = this.f62958d.mo66811CE(m40504N, 2, this.f62978x);
                        i11 = 0;
                    }
                    if (mo66811CE == null && z11) {
                        m40504N = this.f62964j.f42609y;
                        mo66811CE = this.f62958d.mo66811CE(m40504N, 2, this.f62978x);
                    }
                    if (mo66811CE == null && !TextUtils.isEmpty(this.f62964j.f42548C)) {
                        m40504N = this.f62964j.f42548C;
                        mo66811CE = this.f62958d.mo66811CE(m40504N, 0, this.f62978x);
                    }
                    return new C1483e(AbstractC32146v5.m155118a(m40504N, i11), mo66811CE);
                }
            }
            z11 = false;
            mo66811CE = this.f62958d.mo66811CE(m40504N, 1, this.f62978x);
            if (mo66811CE == null) {
                m40504N = this.f62964j.f42609y;
                mo66811CE = this.f62958d.mo66811CE(m40504N, 1, this.f62978x);
            }
            if (mo66811CE == null) {
                m40504N = this.f62964j.f42550D;
                mo66811CE = this.f62958d.mo66811CE(m40504N, 0, this.f62978x);
                i11 = 0;
            }
            if (mo66811CE == null) {
            }
            if (mo66811CE == null) {
                m40504N = this.f62964j.f42609y;
                mo66811CE = this.f62958d.mo66811CE(m40504N, 2, this.f62978x);
            }
            if (mo66811CE == null) {
                m40504N = this.f62964j.f42548C;
                mo66811CE = this.f62958d.mo66811CE(m40504N, 0, this.f62978x);
            }
            return new C1483e(AbstractC32146v5.m155118a(m40504N, i11), mo66811CE);
        }

        /* renamed from: H */
        public void m67326H(f fVar, int i11) {
            ItemAlbumMobile itemAlbumMobile;
            if (fVar.f62952c == 1 && i11 == 7 && (itemAlbumMobile = this.f62964j) != null && itemAlbumMobile.f42566Q) {
                f m155118a = AbstractC32146v5.m155118a(itemAlbumMobile.f42544A, 2);
                m155118a.f62950a = fVar.f62950a;
                m67324F(m155118a, this.f62973s, true);
            } else {
                m67335Q();
                this.f62957c.mo66699Ic(this, fVar, this.f62965k, i11);
            }
        }

        /* renamed from: I */
        public void m67322y(f fVar, C3979l c3979l) {
            boolean z11 = this.f62973s;
            mo67340n(fVar, c3979l);
            m67335Q();
            this.f62957c.mo66726mp(this, fVar, this.f62965k, c3979l);
            if (this.f62965k == this.f62957c.mo66858ea() && fVar.f62952c < 2 && !TextUtils.isEmpty(this.f62964j.f42544A) && z11) {
                f m155118a = AbstractC32146v5.m155118a(this.f62964j.f42544A, 2);
                this.f62966l = m155118a;
                m155118a.f62950a = fVar.f62950a;
                m67324F(m155118a, true, false);
            }
            if (fVar.f62952c == 2) {
                this.f62975u = true;
            }
        }

        /* renamed from: J */
        public void m67328J(f fVar) {
            this.f62957c.mo66878q9(this, fVar, this.f62965k);
        }

        /* renamed from: K */
        public void m67329K(f fVar) {
            f fVar2;
            ItemAlbumMobile itemAlbumMobile;
            try {
                this.f62966l = fVar;
                boolean z11 = true;
                this.f62969o = true;
                this.f62957c.mo66838Uw(this, fVar, this.f62965k);
                if (this.f62957c.mo66858ea() == this.f62965k) {
                    fVar2 = this.f62966l;
                } else {
                    if (!this.f62971q && (itemAlbumMobile = this.f62964j) != null) {
                        fVar2 = this.f62957c.mo66829Qo(this, itemAlbumMobile);
                        if (fVar2 != null) {
                            fVar2.f62950a = this.f62966l.f62950a;
                        }
                        if (fVar2 != null) {
                            f fVar3 = this.f62966l;
                            if (fVar3.f62952c == fVar2.f62952c) {
                                fVar2 = fVar3;
                            }
                        }
                    } else {
                        fVar2 = null;
                    }
                    z11 = false;
                }
                if (fVar2 != null) {
                    if (this.f62965k == this.f62957c.mo66858ea()) {
                        m67324F(fVar2, z11, false);
                    } else {
                        this.f62956b.postDelayed(new Runnable() { // from class: j70.g0

                            /* renamed from: q */
                            public final /* synthetic */ C12063c.f f102953q;

                            /* renamed from: r */
                            public final /* synthetic */ boolean f102954r;

                            public /* synthetic */ RunnableC21015g0(C12063c.f fVar22, boolean z112) {
                                r2 = fVar22;
                                r3 = z112;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                C12063c.g.this.m67302B(r2, r3);
                            }
                        }, 200L);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: L */
        public void m67330L() {
            this.f62957c.mo66820G6(this, this.f62965k);
        }

        /* renamed from: M */
        void m67331M() {
            AbstractC32146v5.m155119b(this.f62961g);
        }

        /* renamed from: N */
        void m67332N() {
            AbstractC32146v5.m155120c(this.f62961g);
        }

        /* renamed from: O */
        void mo67333O(f fVar, C3979l c3979l) {
            if (c3979l != null && c3979l.m18839c() != null) {
                mo67340n(fVar, c3979l);
                this.f62971q = true;
            }
        }

        /* renamed from: P */
        protected void m67334P() {
            try {
                if (this.f62964j == null) {
                    return;
                }
                m67330L();
                C0853x0.m2381b(new d());
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        /* renamed from: Q */
        public void m67335Q() {
            this.f62970p = false;
            this.f62967m = null;
            this.f62973s = false;
            this.f62974t = 0;
        }

        /* renamed from: R */
        public void m67336R(Matrix matrix) {
            PhotoView photoView = this.f62960f;
            if (photoView != null && matrix != null) {
                photoView.m48337p(matrix);
            }
        }

        /* renamed from: S */
        protected void m67337S(ItemAlbumMobile itemAlbumMobile) {
            PhotoView photoView = this.f62960f;
            if (photoView != null && photoView.getPhotoViewAttacher() != null) {
                this.f62960f.setAllowScale(true);
                this.f62960f.setKeepMatrix(true);
                this.f62960f.setEnableZoomPhotoFitWidth(this.f62957c.mo66724la());
                this.f62960f.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.f62960f.setOnViewTapListener(new b());
                this.f62960f.setOnLongClickListener(new View.OnLongClickListener() { // from class: j70.b0
                    public /* synthetic */ ViewOnLongClickListenerC20995b0() {
                    }

                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        boolean m67303C;
                        m67303C = C12063c.g.this.m67303C(view);
                        return m67303C;
                    }
                });
                this.f62960f.getPhotoViewAttacher().m48370b0(new c());
                this.f62960f.getPhotoViewAttacher().m48368a0(new ViewOnTouchListenerC9043a.h() { // from class: j70.c0
                    public /* synthetic */ C20999c0() {
                    }

                    @Override // com.zing.zalo.photoview.ViewOnTouchListenerC9043a.h
                    /* renamed from: B3 */
                    public final void mo48409B3(float f11) {
                        C12063c.g.this.m67304D(f11);
                    }
                });
                if (itemAlbumMobile.f42567R) {
                    this.f62960f.setBackgroundColor(-1);
                }
                this.f62960f.setTag(HackyViewPager.VIEW_PAGER_OBJECT_TAG + this.f62965k);
            }
        }

        /* renamed from: U */
        public void m67338U(boolean z11) {
            int i11;
            View view = this.f62961g;
            if (view != null) {
                if (z11) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                view.setVisibility(i11);
            }
        }

        /* renamed from: V */
        public void m67339V(boolean z11) {
            MessageId messageId;
            C17945a0 c17945a0;
            FrameLayout frameLayout;
            if (z11 == this.f62977w) {
                return;
            }
            this.f62977w = z11;
            if (z11) {
                if (this.f62962h == null) {
                    this.f62962h = (FrameLayout) this.f62959e.findViewById(AbstractC6918a0.layout_roll_error);
                }
                if (this.f62963i == null) {
                    this.f62963i = AbstractC31125u.m151163U(this.f62959e.getContext(), this.f62962h);
                }
                ItemAlbumMobile itemAlbumMobile = this.f62964j;
                if (itemAlbumMobile != null) {
                    messageId = itemAlbumMobile.m40496C();
                } else {
                    messageId = null;
                }
                if (messageId != null) {
                    c17945a0 = AbstractC23306f.m120584H0().m2635r(messageId);
                } else {
                    c17945a0 = null;
                }
                if (c17945a0 != null && (frameLayout = this.f62962h) != null) {
                    frameLayout.setVisibility(0);
                    AbstractC31125u.m151151I(new C31126v(EnumC31127w.f143380q, this.f62955a, c17945a0, this.f62963i, null, null));
                    this.f62962h.setOnClickListener(new View.OnClickListener() { // from class: j70.f0
                        public /* synthetic */ ViewOnClickListenerC21011f0() {
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C12063c.g.this.m67305E(view);
                        }
                    });
                }
                this.f62960f.setImageDrawable(null);
                return;
            }
            FrameLayout frameLayout2 = this.f62962h;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }

        @Override // com.zing.zalo.p077ui.imageviewer.C12063c.c
        /* renamed from: a */
        public void mo67293a() {
            this.f62973s = false;
            f fVar = this.f62968n;
            if (fVar != null && fVar.f62952c == 2) {
                m67341p();
            }
        }

        @Override // com.zing.zalo.p077ui.imageviewer.C12063c.c
        /* renamed from: b */
        public PhotoView mo67294b() {
            return this.f62960f;
        }

        @Override // com.zing.zalo.p077ui.imageviewer.C12063c.c
        /* renamed from: c */
        public void mo67295c(ItemAlbumMobile itemAlbumMobile, int i11) {
            String m40504N;
            if (itemAlbumMobile != null) {
                this.f62964j = itemAlbumMobile;
                this.f62965k = i11;
                if (!TextUtils.isEmpty(itemAlbumMobile.f42609y)) {
                    m40504N = this.f62964j.f42609y;
                } else {
                    m40504N = this.f62964j.m40504N();
                }
                f m155118a = AbstractC32146v5.m155118a(m40504N, 1);
                this.f62966l = m155118a;
                m155118a.f62950a = itemAlbumMobile;
                this.f62976v = m155118a.f62951b;
                m67337S(itemAlbumMobile);
                m67341p();
                m67334P();
            }
        }

        @Override // com.zing.zalo.p077ui.imageviewer.C12063c.c
        /* renamed from: d */
        public void mo67296d() {
            f fVar;
            ItemAlbumMobile itemAlbumMobile = this.f62964j;
            boolean z11 = true;
            if (itemAlbumMobile != null && itemAlbumMobile.m40511V()) {
                m67338U(false);
                m67339V(true);
                C2535j.f10308a.m12773q(this.f62957c.mo66853bz(), this.f62964j, true);
            } else if (this.f62969o && (fVar = this.f62966l) != null) {
                if (!this.f62975u && !this.f62957c.mo66814Co()) {
                    z11 = false;
                }
                m67324F(fVar, z11, false);
            }
        }

        @Override // com.zing.zalo.p077ui.imageviewer.C12063c.c
        public View getView() {
            return this.f62959e;
        }

        /* renamed from: n */
        public void mo67340n(f fVar, C3979l c3979l) {
            C3979l c3979l2;
            try {
                this.f62968n = fVar;
                PhotoView photoView = this.f62960f;
                if (photoView != null) {
                    if (this.f62972r) {
                        C3979l imageInfo = photoView.getImageInfo();
                        if (imageInfo == c3979l) {
                            return;
                        }
                        if (imageInfo != null && c3979l != null) {
                            if (imageInfo instanceof C3980m) {
                                imageInfo = ((C3980m) imageInfo).m18857u();
                            }
                            if (c3979l instanceof C3980m) {
                                c3979l2 = ((C3980m) c3979l).m18857u();
                            } else {
                                c3979l2 = c3979l;
                            }
                            if (imageInfo != c3979l2 && Math.abs(m67343r(imageInfo.m18839c()) - m67343r(c3979l2.m18839c())) > 0.01d) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(imageInfo);
                                arrayList.add(c3979l2);
                                C3980m c3980m = new C3980m(arrayList);
                                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f62959e.getContext().getResources(), imageInfo.m18839c());
                                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
                                C16641r c16641r = new C16641r(new Drawable[]{new C16649s0(bitmapDrawable, scaleType), new C16649s0(new BitmapDrawable(this.f62959e.getContext().getResources(), c3979l2.m18839c()), scaleType)});
                                c16641r.m88419c(new C16641r.a() { // from class: j70.e0

                                    /* renamed from: b */
                                    public final /* synthetic */ C3979l f102940b;

                                    public /* synthetic */ C21007e0(C3979l c3979l22) {
                                        r2 = c3979l22;
                                    }

                                    @Override // com.zing.zalo.uicontrol.C16641r.a
                                    /* renamed from: a */
                                    public final void mo88421a() {
                                        C12063c.g.this.m67320w(r2);
                                    }
                                });
                                c16641r.m88418b(true);
                                this.f62960f.setImageDrawable(c16641r);
                                c16641r.m88420d(IMediaPlayer.MEDIA_INFO_VIDEO_TRACK_LAGGING);
                                this.f62960f.setImageInfo(c3980m, false);
                            } else {
                                this.f62960f.setImageInfo(c3979l);
                            }
                        } else {
                            this.f62960f.setImageInfo(c3979l);
                        }
                    } else {
                        photoView.setImageInfo(c3979l);
                    }
                    if (c3979l != null) {
                        this.f62960f.setVisibility(0);
                        this.f62960f.setAllowScale(true);
                    }
                    this.f62960f.setMediumScale(2.5f);
                    if (this.f62968n.f62952c == 2) {
                        this.f62960f.setMaximumScale(6.0f);
                    } else {
                        this.f62960f.setMaximumScale(4.0f);
                    }
                    this.f62960f.m48335j();
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        /* renamed from: p */
        void m67341p() {
            C1483e m67325G = m67325G();
            mo67333O((f) m67325G.f6374a, (C3979l) m67325G.f6375b);
        }

        /* renamed from: q */
        void m67342q(f fVar, int i11) {
            long j11;
            int i12 = this.f62974t;
            if (i12 < 3) {
                this.f62974t = i12 + 1;
                Handler handler = this.f62956b;
                RunnableC21023i0 runnableC21023i0 = new Runnable() { // from class: j70.i0

                    /* renamed from: q */
                    public final /* synthetic */ C12063c.f f102968q;

                    public /* synthetic */ RunnableC21023i0(C12063c.f fVar2) {
                        r2 = fVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C12063c.g.this.m67321x(r2);
                    }
                };
                int i13 = this.f62974t;
                if (i13 == 3) {
                    j11 = 2000;
                } else {
                    j11 = i13 * 500;
                }
                handler.postDelayed(runnableC21023i0, j11);
                return;
            }
            int i14 = 404;
            if (i11 != 404) {
                i14 = 2;
            }
            m67326H(fVar2, i14);
        }

        /* renamed from: r */
        public double m67343r(Bitmap bitmap) {
            if (bitmap != null) {
                return bitmap.getWidth() / bitmap.getHeight();
            }
            return 0.0d;
        }

        /* renamed from: s */
        public String m67344s() {
            return this.f62976v;
        }
    }

    /* renamed from: com.zing.zalo.ui.imageviewer.c$h */
    /* loaded from: classes5.dex */
    public static class h extends g {

        /* renamed from: A */
        public ZVideoView f62983A;

        /* renamed from: B */
        C19258d f62984B;

        /* renamed from: C */
        boolean f62985C;

        /* renamed from: D */
        ValueAnimator f62986D;

        /* renamed from: E */
        C3979l f62987E;

        /* renamed from: y */
        DragToCloseLayout f62988y;

        /* renamed from: z */
        View f62989z;

        /* renamed from: com.zing.zalo.ui.imageviewer.c$h$a */
        /* loaded from: classes5.dex */
        public class a implements DragToCloseLayout.InterfaceC16432a {

            /* renamed from: com.zing.zalo.ui.imageviewer.c$h$a$a */
            /* loaded from: classes5.dex */
            class C32763a extends AnimatorListenerAdapter {
                C32763a() {
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    h hVar = h.this;
                    hVar.f62957c.mo66808Al(hVar, hVar.f62965k);
                }
            }

            /* renamed from: com.zing.zalo.ui.imageviewer.c$h$a$b */
            /* loaded from: classes5.dex */
            class b extends AnimatorListenerAdapter {
                b() {
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    h.this.m67331M();
                    h hVar = h.this;
                    hVar.f62957c.mo66883sn(hVar, hVar.f62965k);
                }
            }

            a() {
            }

            /* renamed from: c */
            public /* synthetic */ void m67354c(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                h.this.f62988y.setTranslationY(intValue);
                View view = h.this.f62989z;
                if (view != null && view.getHeight() > 0) {
                    h.this.f62989z.setBackgroundColor(Color.argb(Math.max(255 - ((Math.abs(intValue) * 255) / h.this.f62989z.getHeight()), 0), 0, 0, 0));
                }
            }

            /* renamed from: d */
            public /* synthetic */ void m67355d(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                h.this.f62988y.setTranslationY(intValue);
                View view = h.this.f62989z;
                if (view != null && view.getHeight() > 0) {
                    h.this.f62989z.setBackgroundColor(Color.argb(Math.max(255 - ((Math.abs(intValue) * 255) / h.this.f62989z.getHeight()), 0), 0, 0, 0));
                }
            }

            @Override // com.zing.zalo.uicomponents.framelayout.DragToCloseLayout.InterfaceC16432a
            /* renamed from: Dg */
            public void mo38328Dg(float f11) {
                h hVar = h.this;
                hVar.f62957c.mo66875ns(hVar, hVar.f62965k);
                View view = h.this.f62989z;
                if (view != null && view.getHeight() > 0) {
                    h.this.f62989z.setBackgroundColor(Color.argb(Math.max(255 - ((((int) Math.abs(f11)) * 255) / h.this.f62989z.getHeight()), 0), 0, 0, 0));
                }
            }

            @Override // com.zing.zalo.uicomponents.framelayout.DragToCloseLayout.InterfaceC16432a
            /* renamed from: EC */
            public void mo38329EC(boolean z11) {
                h hVar = h.this;
                hVar.f62985C = false;
                if (!z11) {
                    int translationY = (int) hVar.f62988y.getTranslationY();
                    int height = h.this.f62988y.getHeight();
                    if (translationY < 0) {
                        height = -height;
                    }
                    h.this.f62986D = ValueAnimator.ofInt(translationY, height);
                    h.this.f62986D.setDuration(300L);
                    h.this.f62986D.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.imageviewer.e
                        public /* synthetic */ C12067e() {
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            C12063c.h.a.this.m67354c(valueAnimator);
                        }
                    });
                    h.this.f62986D.addListener(new C32763a());
                } else {
                    hVar.f62986D = ValueAnimator.ofInt((int) hVar.f62988y.getTranslationY(), 0);
                    h.this.f62986D.setDuration(300L);
                    h.this.f62986D.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.imageviewer.f
                        public /* synthetic */ C12068f() {
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            C12063c.h.a.this.m67355d(valueAnimator);
                        }
                    });
                    h.this.f62986D.addListener(new b());
                }
                h.this.f62986D.start();
            }

            @Override // com.zing.zalo.uicomponents.framelayout.DragToCloseLayout.InterfaceC16432a
            /* renamed from: f2 */
            public void mo38330f2() {
                ValueAnimator valueAnimator = h.this.f62986D;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                h hVar = h.this;
                hVar.f62985C = true;
                hVar.m67332N();
                h hVar2 = h.this;
                hVar2.f62957c.mo66872mF(hVar2, hVar2.f62965k);
            }
        }

        public h(View view, Handler handler, InterfaceC27218a interfaceC27218a, a aVar, d dVar, boolean z11, C19258d c19258d) {
            super(view, handler, interfaceC27218a, aVar, dVar, z11);
            this.f62985C = false;
            this.f62987E = null;
            this.f62988y = (DragToCloseLayout) view.findViewById(AbstractC6918a0.video_drag_to_close_layout);
            this.f62989z = aVar.mo66886ue();
            this.f62983A = (ZVideoView) view.findViewById(AbstractC6918a0.video_view);
            this.f62984B = c19258d;
        }

        /* renamed from: X */
        private void m67347X() {
            this.f62988y.setDirection(2);
            this.f62988y.setOnDragToCloseListener(new a());
        }

        @Override // com.zing.zalo.p077ui.imageviewer.C12063c.g
        /* renamed from: O */
        void mo67333O(f fVar, C3979l c3979l) {
            super.mo67333O(fVar, c3979l);
            this.f62987E = c3979l;
        }

        /* renamed from: W */
        public C3979l m67348W() {
            return this.f62987E;
        }

        /* renamed from: Y */
        public void m67349Y(boolean z11, String str) {
            this.f62957c.mo66818F1(z11, str);
        }

        /* renamed from: Z */
        public void m67350Z(boolean z11) {
            this.f62957c.mo66889wm(z11);
        }

        @Override // com.zing.zalo.p077ui.imageviewer.C12063c.g, com.zing.zalo.p077ui.imageviewer.C12063c.c
        /* renamed from: a */
        public void mo67293a() {
            super.mo67293a();
            PhotoView photoView = this.f62960f;
            if (photoView != null) {
                photoView.setVisibility(0);
            }
        }

        /* renamed from: a0 */
        public void m67351a0() {
            C19258d c19258d = this.f62984B;
            if (c19258d != null) {
                c19258d.m100967z(this.f62983A);
            }
        }

        @Override // com.zing.zalo.p077ui.imageviewer.C12063c.g, com.zing.zalo.p077ui.imageviewer.C12063c.c
        /* renamed from: c */
        public void mo67295c(ItemAlbumMobile itemAlbumMobile, int i11) {
            super.mo67295c(itemAlbumMobile, i11);
            ZVideoView zVideoView = this.f62983A;
            zVideoView.setBackgroundColor(AbstractC23136l9.m118641B(zVideoView.getContext(), AbstractC16801x.transparent));
            m67347X();
        }

        @Override // com.zing.zalo.p077ui.imageviewer.C12063c.g, com.zing.zalo.p077ui.imageviewer.C12063c.c
        /* renamed from: d */
        public void mo67296d() {
            super.mo67296d();
            PhotoView photoView = this.f62960f;
            if (photoView != null) {
                photoView.setVisibility(4);
            }
        }

        @Override // com.zing.zalo.p077ui.imageviewer.C12063c.g
        /* renamed from: n */
        public void mo67340n(f fVar, C3979l c3979l) {
            int i11;
            PhotoView photoView = this.f62960f;
            if (photoView != null) {
                photoView.setImageInfo(c3979l);
                PhotoView photoView2 = this.f62960f;
                if (this.f62965k == this.f62957c.mo66858ea()) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                photoView2.setVisibility(i11);
            }
        }
    }

    public C12063c(InterfaceC27218a interfaceC27218a, d dVar, Handler handler, a aVar, C19258d c19258d) {
        this.f62936s = interfaceC27218a;
        this.f62929B = dVar;
        this.f62935r = handler;
        this.f62930C = aVar;
        this.f62932E = c19258d;
        this.f62937t = (LayoutInflater) interfaceC27218a.getContext().getSystemService("layout_inflater");
    }

    /* renamed from: B */
    private c m67284B(ViewGroup viewGroup, int i11, a aVar) {
        ItemAlbumMobile m67290x = m67290x(i11);
        if (m67290x != null) {
            int i12 = m67290x.f42591p;
            if (i12 != -1) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        return new h(this.f62937t.inflate(AbstractC7409c0.video_pager_view, viewGroup, false), this.f62935r, this.f62936s, aVar, this.f62929B, this.f62933F, this.f62932E);
                    }
                } else {
                    return new g(this.f62937t.inflate(AbstractC7409c0.photo_pager_view, viewGroup, false), this.f62935r, this.f62936s, aVar, this.f62929B, this.f62933F);
                }
            } else {
                MediaStorePopulatePage mediaStorePopulatePage = new MediaStorePopulatePage(viewGroup.getContext());
                mediaStorePopulatePage.setMMediaStorePopulateListener(this.f62931D);
                mediaStorePopulatePage.m69131B();
                mediaStorePopulatePage.setBackgroundView(aVar.mo66886ue());
                return new b(mediaStorePopulatePage, this.f62935r, aVar, this.f62929B);
            }
        }
        return null;
    }

    /* renamed from: D */
    private void m67285D(c cVar, ItemAlbumMobile itemAlbumMobile) {
        ItemAlbumMobile itemAlbumMobile2;
        if (this.f62943z != null && (itemAlbumMobile2 = this.f62928A) != null && itemAlbumMobile2.equals(itemAlbumMobile) && (cVar instanceof g)) {
            ((g) cVar).m67336R(this.f62943z);
            this.f62943z = null;
            this.f62928A = null;
        }
    }

    /* renamed from: A */
    public void m67286A(int i11) {
        try {
            c m67291y = m67291y(i11);
            ItemAlbumMobile m67290x = m67290x(i11);
            if ((m67291y instanceof g) && m67290x != null) {
                g gVar = (g) m67291y;
                f fVar = gVar.f62966l;
                if (fVar != null && fVar.f62952c >= 2) {
                    gVar.m67324F(fVar, true, false);
                }
                if (!TextUtils.isEmpty(gVar.f62964j.f42544A) && !AbstractC23304d.f113361a3.contains(gVar.f62964j.f42544A)) {
                    f m155118a = AbstractC32146v5.m155118a(gVar.f62964j.f42544A, 2);
                    gVar.f62966l = m155118a;
                    gVar.m67324F(m155118a, true, false);
                } else {
                    this.f62930C.mo66699Ic(gVar, AbstractC32146v5.m155118a("", 2), i11, 1);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: C */
    public void m67287C(int i11) {
        c m67291y;
        int i12 = this.f62940w;
        this.f62940w = i11;
        c m67291y2 = m67291y(i11);
        this.f62939v = m67291y2;
        if (m67291y2 == null) {
            return;
        }
        if (m67291y2 instanceof b) {
            if (this.f62934G) {
                ((b) m67291y2).m67297e(false);
            }
            this.f62934G = true;
        } else {
            this.f62934G = false;
        }
        m67291y2.mo67296d();
        if (i12 != this.f62940w && i12 >= 0 && (m67291y = m67291y(i12)) != null) {
            m67291y.mo67293a();
        }
    }

    /* renamed from: E */
    public void m67288E(List list) {
        Matrix matrix;
        this.f62938u = new ArrayList(list);
        c cVar = this.f62939v;
        if (cVar instanceof g) {
            this.f62928A = ((g) cVar).f62964j;
            if (cVar.mo67294b() != null) {
                matrix = this.f62939v.mo67294b().getDisplayMatrix();
            } else {
                matrix = null;
            }
            this.f62943z = matrix;
        }
        mo35341m();
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: d */
    public void mo35332d(ViewGroup viewGroup, int i11, Object obj) {
        viewGroup.removeView((View) obj);
        c cVar = (c) this.f62941x.get(i11);
        if ((cVar instanceof h) && cVar.getView() == obj) {
            h hVar = (h) cVar;
            C19258d c19258d = this.f62932E;
            if (c19258d != null && c19258d.m100959l() == hVar) {
                this.f62932E.m100955I();
            }
            hVar.m67351a0();
        }
        this.f62941x.remove(i11);
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: g */
    public int mo35335g() {
        return this.f62938u.size();
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: h */
    public int mo35336h(Object obj) {
        return -2;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: l */
    public boolean mo35340l(View view, Object obj) {
        return view == obj;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: m */
    public void mo35341m() {
        this.f62942y = true;
        super.mo35341m();
    }

    /* renamed from: w */
    public c m67289w() {
        return this.f62939v;
    }

    /* renamed from: x */
    public ItemAlbumMobile m67290x(int i11) {
        if (this.f62938u.size() > i11 && i11 >= 0) {
            return (ItemAlbumMobile) this.f62938u.get(i11);
        }
        return null;
    }

    /* renamed from: y */
    public c m67291y(int i11) {
        return (c) this.f62941x.get(i11);
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: z */
    public View mo35339k(ViewGroup viewGroup, int i11) {
        View view;
        c m67284B = m67284B(viewGroup, i11, this.f62930C);
        if (m67284B != null) {
            ItemAlbumMobile m67290x = m67290x(i11);
            m67284B.mo67295c(m67290x, i11);
            if (i11 == this.f62930C.mo66858ea()) {
                m67285D(m67284B, m67290x);
            }
            view = m67284B.getView();
            viewGroup.addView(view, -1, -1);
            this.f62941x.put(i11, m67284B);
        } else {
            this.f62941x.remove(i11);
            view = null;
        }
        if (i11 == this.f62930C.mo66858ea()) {
            this.f62939v = m67284B;
        }
        this.f62930C.mo66697Ee(m67284B, i11);
        this.f62942y = false;
        return view;
    }
}
