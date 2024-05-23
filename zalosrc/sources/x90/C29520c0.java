package x90;

import ag0.AbstractC0840r;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.C1755a0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.RecyclerView;
import c30.C3251l;
import c30.C3254m0;
import c30.C3255n;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.p077ui.StickerView;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.InterfaceC12972v;
import com.zing.zalo.p077ui.widget.stickerpanel.TrendingGifView;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.InterfaceC19066n;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me0.C23278z2;
import p038bl.C2834f;
import p133ek.AbstractC18458a;
import p134el.C18469h;
import p134el.C18472k;
import p134el.C18476o;
import p134el.C18477p;
import p134el.C18478q;
import p134el.C18479r;
import p134el.C18480s;
import p354n3.C23528a;
import p363nh.C23744a;
import p379o3.AbstractC24006q;
import p379o3.C23995f;
import p379o3.C23999j;
import p471r3.C25630b;
import p485rj.C25809a;
import p485rj.C25810b;
import p485rj.C25811c;
import p588vw.C28644j;
import p649xl.C29738c0;
import p649xl.C29796f4;
import p649xl.C29948nc;
import p649xl.C30140yd;
import p716zh.C31933ga;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import vg.C28020b3;
import x90.C29520c0;

/* renamed from: x90.c0 */
/* loaded from: classes6.dex */
public final class C29520c0 extends RecyclerView.AbstractC1880g {
    public static final j Companion = new j(null);

    /* renamed from: A */
    private final C1761c0 f136236A;

    /* renamed from: B */
    private final C1761c0 f136237B;

    /* renamed from: C */
    private final C1761c0 f136238C;

    /* renamed from: D */
    private final C1761c0 f136239D;

    /* renamed from: E */
    private List f136240E;

    /* renamed from: F */
    private final Map f136241F;

    /* renamed from: G */
    private final List f136242G;

    /* renamed from: H */
    private int f136243H;

    /* renamed from: I */
    private final View.OnTouchListener f136244I;

    /* renamed from: r */
    private final LayoutInflater f136245r;

    /* renamed from: s */
    private final C23528a f136246s;

    /* renamed from: t */
    private final C1755a0 f136247t;

    /* renamed from: u */
    private final InterfaceC12972v f136248u;

    /* renamed from: v */
    private final boolean f136249v;

    /* renamed from: w */
    private final String f136250w;

    /* renamed from: x */
    private final C1761c0 f136251x;

    /* renamed from: y */
    private final C1761c0 f136252y;

    /* renamed from: z */
    private final C1761c0 f136253z;

    /* renamed from: x90.c0$a */
    /* loaded from: classes6.dex */
    static final class a extends AbstractC19075u implements InterfaceC18505l {
        a() {
            super(1);
        }

        /* renamed from: a */
        public final void m146804a(C18480s c18480s) {
            C29520c0.this.f136247t.mo9224q(c18480s);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m146804a((C18480s) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: x90.c0$b */
    /* loaded from: classes6.dex */
    static final class b extends AbstractC19075u implements InterfaceC18505l {
        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m146805a(C18478q c18478q) {
            C29520c0.this.f136247t.mo9224q(c18478q);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m146805a((C18478q) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: x90.c0$c */
    /* loaded from: classes6.dex */
    static final class c extends AbstractC19075u implements InterfaceC18505l {
        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m146806a(C18479r c18479r) {
            C29520c0.this.f136247t.mo9224q(c18479r);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m146806a((C18479r) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: x90.c0$d */
    /* loaded from: classes6.dex */
    static final class d extends AbstractC19075u implements InterfaceC18505l {
        d() {
            super(1);
        }

        /* renamed from: a */
        public final void m146807a(C18476o c18476o) {
            C29520c0.this.f136247t.mo9224q(c18476o);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m146807a((C18476o) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: x90.c0$e */
    /* loaded from: classes6.dex */
    static final class e extends AbstractC19075u implements InterfaceC18505l {
        e() {
            super(1);
        }

        /* renamed from: a */
        public final void m146808a(C18469h c18469h) {
            C29520c0.this.f136247t.mo9224q(c18469h);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m146808a((C18469h) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: x90.c0$f */
    /* loaded from: classes6.dex */
    static final class f extends AbstractC19075u implements InterfaceC18505l {
        f() {
            super(1);
        }

        /* renamed from: a */
        public final void m146809a(C18472k c18472k) {
            C29520c0.this.f136247t.mo9224q(c18472k);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m146809a((C18472k) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: x90.c0$g */
    /* loaded from: classes6.dex */
    static final class g extends AbstractC19075u implements InterfaceC18505l {
        g() {
            super(1);
        }

        /* renamed from: a */
        public final void m146810a(C18477p c18477p) {
            C29520c0.this.f136247t.mo9224q(c18477p);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m146810a((C18477p) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x90.c0$h */
    /* loaded from: classes6.dex */
    public static final class h extends r {

        /* renamed from: e */
        private final String f136261e;

        /* renamed from: f */
        private final C3254m0 f136262f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, C3254m0 c3254m0, int i11) {
            super(2, i11, 0, 4, null);
            AbstractC19074t.m100208f(str, "bannerUrl");
            AbstractC19074t.m100208f(c3254m0, "keyword");
            this.f136261e = str;
            this.f136262f = c3254m0;
            m146860c(str.hashCode());
        }

        /* renamed from: d */
        public final String m146811d() {
            return this.f136261e;
        }

        /* renamed from: e */
        public final C3254m0 m146812e() {
            return this.f136262f;
        }
    }

    /* renamed from: x90.c0$i */
    /* loaded from: classes6.dex */
    public static final class i extends m {

        /* renamed from: I */
        private final C29738c0 f136263I;

        /* renamed from: J */
        private View.OnClickListener f136264J;

        /* renamed from: K */
        private int f136265K;

        /* renamed from: L */
        private h f136266L;

        /* renamed from: M */
        private C3977j f136267M;

        /* renamed from: x90.c0$i$a */
        /* loaded from: classes6.dex */
        public static final class a extends C23999j {
            a() {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // p379o3.C23999j
            /* renamed from: O1 */
            public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
                Bitmap bitmap;
                AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                AbstractC19074t.m100208f(interfaceC3968a, "iv");
                AbstractC19074t.m100208f(c23995f, "status");
                h hVar = i.this.f136266L;
                if (hVar != null && AbstractC19074t.m100204b(hVar.m146811d(), str)) {
                    if (c3979l != null) {
                        bitmap = c3979l.m18839c();
                    } else {
                        bitmap = null;
                    }
                    if (bitmap != null) {
                        i.this.f136267M.setImageInfo(c3979l, false);
                        i.this.f136263I.f137377q.setImageBitmap(c3979l.m18839c());
                    } else {
                        i.this.f136267M.setImageInfo(null);
                        i.this.f136263I.f137377q.setImageDrawable(C23278z2.m120116c().f116261b);
                    }
                }
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public i(C29738c0 c29738c0) {
            super(r0);
            AbstractC19074t.m100208f(c29738c0, "binding");
            FrameLayout root = c29738c0.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            this.f136263I = c29738c0;
            this.f136265K = -1;
            Context context = c29738c0.getRoot().getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            this.f136267M = new C3977j(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n0 */
        public static final void m146817n0(i iVar, View view) {
            AbstractC19074t.m100208f(iVar, "this$0");
            if (!C28644j.m143233Y().m143312x0(iVar.f136265K) && !C3255n.m16562n().m16580x(iVar.f136265K)) {
                if (iVar.f136265K != -1) {
                    C23744a.Companion.m124119a().m124116d(143, Integer.valueOf(iVar.f136265K), 2);
                }
            } else {
                C31933ga.f146718a.m153476s(iVar.f136265K);
                C2834f.f11325a.m13686e();
            }
        }

        /* renamed from: o0 */
        private final boolean m146818o0(h hVar, h hVar2) {
            if (hVar2 == null || !AbstractC19074t.m100204b(hVar2, hVar) || hVar.m146812e().f13933r != hVar2.m146812e().f13933r || !AbstractC19074t.m100204b(hVar.m146811d(), hVar2.m146811d())) {
                return true;
            }
            return false;
        }

        /* renamed from: m0 */
        public final void m146819m0(C23528a c23528a, r rVar) {
            AbstractC19074t.m100208f(c23528a, "aQuery");
            AbstractC19074t.m100208f(rVar, "newItem");
            if (!(rVar instanceof h)) {
                AbstractC20110a.f98889a.mo104551d("TrendingStickers", "not valid BannerRowItem");
                return;
            }
            h hVar = (h) rVar;
            if (!m146818o0(hVar, this.f136266L)) {
                return;
            }
            this.f136265K = hVar.m146812e().f13933r;
            this.f136266L = hVar;
            if (this.f136264J == null) {
                this.f136264J = new View.OnClickListener() { // from class: x90.d0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C29520c0.i.m146817n0(C29520c0.i.this, view);
                    }
                };
            }
            this.f136263I.f137377q.setOnClickListener(this.f136264J);
            ((C23528a) c23528a.m123612r(this.f136267M)).m123579C(hVar.m146811d(), C23278z2.m120116c(), new a());
        }
    }

    /* renamed from: x90.c0$j */
    /* loaded from: classes6.dex */
    public static final class j {
        private j() {
        }

        public /* synthetic */ j(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x90.c0$k */
    /* loaded from: classes6.dex */
    public static final class k extends r {

        /* renamed from: e */
        private final C3254m0.b f136269e;

        /* renamed from: f */
        private final C3254m0 f136270f;

        /* renamed from: g */
        private final int f136271g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(C3254m0.b bVar, C3254m0 c3254m0, int i11, int i12, int i13) {
            super(3, i12, i13);
            int i14;
            AbstractC19074t.m100208f(bVar, "gifInfo");
            AbstractC19074t.m100208f(c3254m0, "keyword");
            this.f136269e = bVar;
            this.f136270f = c3254m0;
            this.f136271g = i11;
            String str = bVar.f13938f;
            if (str != null) {
                i14 = str.hashCode();
            } else {
                i14 = 0;
            }
            m146860c(i14);
        }

        /* renamed from: d */
        public final C3254m0.b m146820d() {
            return this.f136269e;
        }

        /* renamed from: e */
        public final C3254m0 m146821e() {
            return this.f136270f;
        }

        /* renamed from: f */
        public final int m146822f() {
            return this.f136271g;
        }
    }

    /* renamed from: x90.c0$l */
    /* loaded from: classes6.dex */
    public static final class l extends m {

        /* renamed from: I */
        private final C29796f4 f136272I;

        /* renamed from: J */
        private final View.OnTouchListener f136273J;

        /* renamed from: K */
        private final C1761c0 f136274K;

        /* renamed from: L */
        private final C1761c0 f136275L;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public l(C29796f4 c29796f4, View.OnTouchListener onTouchListener, C1761c0 c1761c0, C1761c0 c1761c02) {
            super(r0);
            AbstractC19074t.m100208f(c29796f4, "binding");
            AbstractC19074t.m100208f(onTouchListener, "touchListener");
            AbstractC19074t.m100208f(c1761c0, "gifClickLD");
            AbstractC19074t.m100208f(c1761c02, "gifLongClickLD");
            TrendingGifView root = c29796f4.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            this.f136272I = c29796f4;
            this.f136273J = onTouchListener;
            this.f136274K = c1761c0;
            this.f136275L = c1761c02;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l0 */
        public static final boolean m146825l0(l lVar, C3251l c3251l, View view) {
            AbstractC19074t.m100208f(lVar, "this$0");
            AbstractC19074t.m100208f(c3251l, "$stickerGifInfo");
            lVar.f136275L.mo9224q(new C18469h(c3251l, 14));
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m0 */
        public static final void m146826m0(r rVar, l lVar, C3251l c3251l, int i11, View view) {
            String str;
            AbstractC19074t.m100208f(rVar, "$item");
            AbstractC19074t.m100208f(lVar, "this$0");
            AbstractC19074t.m100208f(c3251l, "$stickerGifInfo");
            if (AbstractC19074t.m100204b(AbstractC18458a.f93019a, "vi")) {
                k kVar = (k) rVar;
                if (kVar.m146821e().f13919d.length() > 0) {
                    str = kVar.m146821e().f13919d;
                }
                str = "";
            } else {
                k kVar2 = (k) rVar;
                if (kVar2.m146821e().f13918c.length() > 0) {
                    str = kVar2.m146821e().f13918c;
                }
                str = "";
            }
            lVar.f136274K.mo9224q(new C18478q(c3251l, 14, ((k) rVar).m146822f(), i11, str));
        }

        /* renamed from: k0 */
        public final void m146827k0(final r rVar, int i11, final int i12) {
            String str;
            String str2;
            int i13;
            String str3;
            String str4;
            String str5;
            String str6;
            AbstractC19074t.m100208f(rVar, "item");
            int i14 = 0;
            if (!(rVar instanceof k)) {
                AbstractC20110a.f98889a.mo104551d("TrendingStickers", "not valid GifRowItem");
                return;
            }
            C29796f4 c29796f4 = this.f136272I;
            C3254m0.b m146820d = ((k) rVar).m146820d();
            c29796f4.f137737q.m77036c(m146820d, i11);
            c29796f4.f137737q.setVisibility(0);
            C25810b c25810b = m146820d.f13934b;
            if (c25810b == null || (str6 = c25810b.f123105a) == null) {
                str = "";
            } else {
                str = str6;
            }
            C25810b c25810b2 = m146820d.f13936d;
            if (c25810b2 == null || (str2 = c25810b2.f123105a) == null) {
                str2 = "";
            }
            if (c25810b2 != null) {
                i13 = c25810b2.f123106b;
            } else {
                i13 = 0;
            }
            if (c25810b2 != null) {
                i14 = c25810b2.f123107c;
            }
            C25810b c25810b3 = m146820d.f13935c;
            if (c25810b3 == null || (str5 = c25810b3.f123105a) == null) {
                str3 = "";
            } else {
                str3 = str5;
            }
            String str7 = m146820d.f13938f;
            if (str7 == null) {
                str4 = "";
            } else {
                str4 = str7;
            }
            C25809a c25809a = new C25809a(str, str2, i13, i14, str3, str4);
            final C3251l c3251l = new C3251l(1);
            c3251l.m16520j(c25809a);
            c29796f4.f137737q.setOnLongClickListener(new View.OnLongClickListener() { // from class: x90.e0
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean m146825l0;
                    m146825l0 = C29520c0.l.m146825l0(C29520c0.l.this, c3251l, view);
                    return m146825l0;
                }
            });
            c29796f4.f137737q.setOnClickListener(new View.OnClickListener() { // from class: x90.f0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C29520c0.l.m146826m0(C29520c0.r.this, this, c3251l, i12, view);
                }
            });
            c29796f4.f137737q.setOnTouchListener(this.f136273J);
        }
    }

    /* renamed from: x90.c0$m */
    /* loaded from: classes6.dex */
    public static class m extends RecyclerView.AbstractC1876c0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x90.c0$n */
    /* loaded from: classes6.dex */
    public static final class n extends r {

        /* renamed from: e */
        private final String f136276e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str, int i11) {
            super(0, i11, 0, 4, null);
            AbstractC19074t.m100208f(str, "label");
            this.f136276e = str;
            m146860c(str.hashCode());
        }

        /* renamed from: d */
        public final String m146828d() {
            return this.f136276e;
        }
    }

    /* renamed from: x90.c0$o */
    /* loaded from: classes6.dex */
    public static final class o extends m {

        /* renamed from: I */
        private final C30140yd f136277I;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public o(C30140yd c30140yd) {
            super(r0);
            AbstractC19074t.m100208f(c30140yd, "binding");
            LinearLayout root = c30140yd.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            this.f136277I = c30140yd;
        }

        /* renamed from: i0 */
        public final void m146829i0(r rVar) {
            AbstractC19074t.m100208f(rVar, "item");
            if (!(rVar instanceof n)) {
                AbstractC20110a.f98889a.mo104551d("TrendingStickers", "not valid LabelRowItem");
            } else {
                this.f136277I.f140052q.setText(((n) rVar).m146828d());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x90.c0$p */
    /* loaded from: classes6.dex */
    public static final class p extends r {

        /* renamed from: e */
        private final C3251l f136278e;

        /* renamed from: f */
        private final C3254m0 f136279f;

        /* renamed from: g */
        private final int f136280g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(C3251l c3251l, C3254m0 c3254m0, int i11, int i12, int i13) {
            super(1, i12, i13);
            int m132429g;
            long j11;
            String m133092d;
            AbstractC19074t.m100208f(c3251l, "stickerInfo");
            AbstractC19074t.m100208f(c3254m0, "keyword");
            this.f136278e = c3251l;
            this.f136279f = c3254m0;
            this.f136280g = i11;
            if (c3251l.m16518h()) {
                C25811c m16513c = c3251l.m16513c();
                if (m16513c != null && (m133092d = m16513c.m133092d()) != null) {
                    m132429g = m133092d.hashCode();
                    j11 = m132429g;
                }
                j11 = i11;
            } else {
                C25630b m16514d = c3251l.m16514d();
                if (m16514d != null) {
                    m132429g = m16514d.m132429g();
                    j11 = m132429g;
                }
                j11 = i11;
            }
            m146860c(j11);
        }

        /* renamed from: d */
        public final C3254m0 m146830d() {
            return this.f136279f;
        }

        /* renamed from: e */
        public final int m146831e() {
            return this.f136280g;
        }

        /* renamed from: f */
        public final C3251l m146832f() {
            return this.f136278e;
        }
    }

    /* renamed from: x90.c0$q */
    /* loaded from: classes6.dex */
    public static final class q extends m {

        /* renamed from: I */
        private final C29948nc f136281I;

        /* renamed from: J */
        private final View.OnTouchListener f136282J;

        /* renamed from: K */
        private final C1761c0 f136283K;

        /* renamed from: L */
        private final C1761c0 f136284L;

        /* renamed from: M */
        private final C1761c0 f136285M;

        /* renamed from: N */
        private final C1761c0 f136286N;

        /* renamed from: O */
        private final InterfaceC12972v f136287O;

        /* renamed from: P */
        private final boolean f136288P;

        /* renamed from: Q */
        private final String f136289Q;

        /* renamed from: R */
        private final C23528a f136290R;

        /* renamed from: S */
        private p f136291S;

        /* renamed from: x90.c0$q$a */
        /* loaded from: classes6.dex */
        public static final class a extends C28020b3.b {
            a() {
            }

            @Override // vg.C28020b3.b
            /* renamed from: a */
            public void mo36247a(String str, C25630b c25630b, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
                C25630b m16514d;
                AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                AbstractC19074t.m100208f(c25630b, "stickerInfo");
                AbstractC19074t.m100208f(interfaceC3968a, "iv");
                AbstractC19074t.m100208f(c3979l, "bm");
                AbstractC19074t.m100208f(c23995f, "status");
                p pVar = q.this.f136291S;
                if (pVar != null && pVar.m146832f().m16519i() && (m16514d = pVar.m146832f().m16514d()) != null && m16514d.m132429g() == c25630b.m132429g()) {
                    super.mo36247a(str, c25630b, interfaceC3968a, c3979l, c23995f);
                    C28020b3.f130648a.m141178A(c25630b, interfaceC3968a, c23995f, true);
                }
            }

            @Override // vg.C28020b3.b
            /* renamed from: b */
            public void mo35607b(String str, C25630b c25630b, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
                C25630b m16514d;
                AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                AbstractC19074t.m100208f(c25630b, "stickerInfo");
                AbstractC19074t.m100208f(interfaceC3968a, "iv");
                AbstractC19074t.m100208f(c3979l, "bm");
                AbstractC19074t.m100208f(c23995f, "status");
                p pVar = q.this.f136291S;
                if (pVar != null && pVar.m146832f().m16519i() && (m16514d = pVar.m146832f().m16514d()) != null && m16514d.m132429g() == c25630b.m132429g()) {
                    super.mo35607b(str, c25630b, interfaceC3968a, c3979l, c23995f);
                    C28020b3.f130648a.m141179B(c25630b, interfaceC3968a, c3979l, true, "", false);
                }
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public q(C29948nc c29948nc, View.OnTouchListener onTouchListener, C1761c0 c1761c0, C1761c0 c1761c02, C1761c0 c1761c03, C1761c0 c1761c04, InterfaceC12972v interfaceC12972v, boolean z11, String str, C23528a c23528a) {
            super(r0);
            AbstractC19074t.m100208f(c29948nc, "binding");
            AbstractC19074t.m100208f(onTouchListener, "touchListener");
            AbstractC19074t.m100208f(c1761c0, "stickerClickLD");
            AbstractC19074t.m100208f(c1761c02, "stickerLongClickLD");
            AbstractC19074t.m100208f(c1761c03, "pStickerClickLD");
            AbstractC19074t.m100208f(c1761c04, "pStickerLongClickLD");
            AbstractC19074t.m100208f(interfaceC12972v, "isScrolling");
            AbstractC19074t.m100208f(str, "autoPlayStickerPrefix");
            AbstractC19074t.m100208f(c23528a, "aQuery");
            FrameLayout root = c29948nc.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            this.f136281I = c29948nc;
            this.f136282J = onTouchListener;
            this.f136283K = c1761c0;
            this.f136284L = c1761c02;
            this.f136285M = c1761c03;
            this.f136286N = c1761c04;
            this.f136287O = interfaceC12972v;
            this.f136288P = z11;
            this.f136289Q = str;
            this.f136290R = c23528a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: A0 */
        public static final void m146833A0(p pVar, C1761c0 c1761c0, C25630b c25630b, View view) {
            String str;
            AbstractC19074t.m100208f(pVar, "$item");
            AbstractC19074t.m100208f(c1761c0, "$clickLD");
            AbstractC19074t.m100208f(c25630b, "$stickerInfo");
            if (view instanceof StickerView) {
                if (AbstractC19074t.m100204b(AbstractC18458a.f93019a, "vi")) {
                    if (pVar.m146830d().f13922g.length() > 0) {
                        str = pVar.m146830d().f13922g;
                    }
                    str = "";
                } else {
                    if (pVar.m146830d().f13917b.length() > 0) {
                        str = pVar.m146830d().f13917b;
                    }
                    str = "";
                }
                c1761c0.mo9224q(new C18480s((StickerView) view, c25630b.m132432j(), 13, str));
            }
        }

        /* renamed from: B0 */
        private final View.OnLongClickListener m146834B0(final C1761c0 c1761c0, final C25630b c25630b) {
            return new View.OnLongClickListener() { // from class: x90.g0
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean m146835C0;
                    m146835C0 = C29520c0.q.m146835C0(C1761c0.this, c25630b, view);
                    return m146835C0;
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: C0 */
        public static final boolean m146835C0(C1761c0 c1761c0, C25630b c25630b, View view) {
            AbstractC19074t.m100208f(c1761c0, "$longClickLD");
            AbstractC19074t.m100208f(c25630b, "$stickerInfo");
            if (view instanceof StickerView) {
                c1761c0.mo9224q(new C18476o((StickerView) view, c25630b.m132432j(), 13));
                return true;
            }
            return true;
        }

        /* renamed from: D0 */
        private final void m146836D0(C25630b c25630b, StickerView stickerView) {
            if (c25630b.m132448z()) {
                AbstractC20110a.f98889a.mo104551d("Not load sticker DEFAULT by Aquery", new Object[0]);
            } else {
                C28020b3.m141166H(C28020b3.f130648a, stickerView, this.f136290R, c25630b, null, true, new a(), 4, null);
            }
        }

        /* renamed from: E0 */
        private final void m146837E0(final StickerView stickerView, final C25630b c25630b) {
            Bitmap m141205v = C28020b3.f130648a.m141205v(c25630b, false);
            if (m141205v != null) {
                stickerView.setImageBitmap(m141205v);
            } else {
                AbstractC0840r.m2251h(new Runnable() { // from class: x90.k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C29520c0.q.m146838F0(C29520c0.q.this, c25630b, stickerView);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: F0 */
        public static final void m146838F0(final q qVar, final C25630b c25630b, final StickerView stickerView) {
            AbstractC19074t.m100208f(qVar, "this$0");
            AbstractC19074t.m100208f(c25630b, "$stickerInfo");
            AbstractC19074t.m100208f(stickerView, "$itemView");
            AbstractC19444a.m101695c(new Runnable() { // from class: x90.l0
                @Override // java.lang.Runnable
                public final void run() {
                    C29520c0.q.m146839G0(C29520c0.q.this, c25630b, stickerView);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: G0 */
        public static final void m146839G0(q qVar, C25630b c25630b, StickerView stickerView) {
            C25630b m16514d;
            AbstractC19074t.m100208f(qVar, "this$0");
            AbstractC19074t.m100208f(c25630b, "$stickerInfo");
            AbstractC19074t.m100208f(stickerView, "$itemView");
            p pVar = qVar.f136291S;
            if (pVar != null && pVar.m146832f().m16519i() && (m16514d = pVar.m146832f().m16514d()) != null && m16514d.m132429g() == c25630b.m132429g()) {
                stickerView.setImageBitmap(C28020b3.f130648a.m141206w(c25630b));
            }
        }

        /* renamed from: p0 */
        private final void m146847p0(StickerView stickerView) {
            stickerView.setOnClickListener(null);
            stickerView.setOnLongClickListener(null);
            stickerView.setOnTouchListener(null);
        }

        /* renamed from: q0 */
        private final void m146848q0(StickerView stickerView, p pVar, C3251l c3251l) {
            stickerView.setOnClickListener(m146852v0(this.f136285M, pVar, c3251l));
            stickerView.setOnLongClickListener(m146854x0(this.f136286N, c3251l));
            stickerView.setOnTouchListener(this.f136282J);
            m146850t0(this.f136290R, stickerView, c3251l);
        }

        /* renamed from: r0 */
        private final void m146849r0(StickerView stickerView, p pVar, C3251l c3251l) {
            stickerView.setEmoticon(c3251l.m16512b());
            C25630b m143290W = C28644j.m143233Y().m143290W(c3251l.m16512b());
            AbstractC19074t.m100207e(m143290W, "getAnimationInfo(...)");
            stickerView.setOnClickListener(m146856z0(this.f136283K, pVar, m143290W));
            stickerView.setOnLongClickListener(m146834B0(this.f136284L, m143290W));
            stickerView.setOnTouchListener(this.f136282J);
            m146851u0(stickerView, m143290W, this.f136287O);
        }

        /* renamed from: t0 */
        private final void m146850t0(C23528a c23528a, StickerView stickerView, C3251l c3251l) {
            String m16515e = c3251l.m16515e();
            boolean m125696L2 = C23999j.m125696L2(m16515e, C23278z2.m120123e0());
            if (!((Boolean) this.f136287O.get()).booleanValue() || m125696L2) {
                ((C23528a) c23528a.m123612r(stickerView)).m123619y(m16515e, C23278z2.m120123e0(), 10);
            }
        }

        /* renamed from: u0 */
        private final void m146851u0(StickerView stickerView, C25630b c25630b, InterfaceC12972v interfaceC12972v) {
            if (c25630b.m132448z()) {
                if (!((Boolean) interfaceC12972v.get()).booleanValue()) {
                    if (this.f136288P) {
                        stickerView.m56978i(c25630b);
                        C3255n m16562n = C3255n.m16562n();
                        String str = this.f136289Q;
                        long currentTimeMillis = System.currentTimeMillis();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(currentTimeMillis);
                        String m16572l = m16562n.m16572l(str, sb2.toString(), c25630b);
                        AbstractC19074t.m100205c(m16572l);
                        StickerView.m56977k(stickerView, c25630b, m16572l, true, false, false, true, 24, null);
                        return;
                    }
                    m146837E0(stickerView, c25630b);
                    return;
                }
                if (C28020b3.f130648a.m141181D(c25630b)) {
                    m146837E0(stickerView, c25630b);
                    return;
                }
                return;
            }
            if (!((Boolean) interfaceC12972v.get()).booleanValue()) {
                m146836D0(c25630b, stickerView);
                return;
            }
            if (AbstractC24006q.m125853Z1(c25630b.m132446x())) {
                C3979l m125837F1 = AbstractC24006q.m125837F1(c25630b.m132446x());
                if (m125837F1 != null) {
                    stickerView.setImageBitmap(m125837F1.m18839c());
                    return;
                } else {
                    stickerView.setImageDrawable(C23278z2.m120091Q0().f116261b);
                    return;
                }
            }
            stickerView.setImageDrawable(C23278z2.m120091Q0().f116261b);
        }

        /* renamed from: v0 */
        private final View.OnClickListener m146852v0(final C1761c0 c1761c0, final p pVar, final C3251l c3251l) {
            return new View.OnClickListener() { // from class: x90.j0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C29520c0.q.m146853w0(C29520c0.p.this, c1761c0, c3251l, view);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w0 */
        public static final void m146853w0(p pVar, C1761c0 c1761c0, C3251l c3251l, View view) {
            String str;
            AbstractC19074t.m100208f(pVar, "$item");
            AbstractC19074t.m100208f(c1761c0, "$clickLD");
            AbstractC19074t.m100208f(c3251l, "$itemStickerInfo");
            if (view instanceof StickerView) {
                if (AbstractC19074t.m100204b(AbstractC18458a.f93019a, "vi")) {
                    if (!TextUtils.isEmpty(pVar.m146830d().f13919d)) {
                        str = pVar.m146830d().f13919d;
                    }
                    str = "";
                } else {
                    if (!TextUtils.isEmpty(pVar.m146830d().f13918c)) {
                        str = pVar.m146830d().f13918c;
                    }
                    str = "";
                }
                c1761c0.mo9224q(new C18479r((StickerView) view, c3251l, 15, str));
            }
        }

        /* renamed from: x0 */
        private final View.OnLongClickListener m146854x0(final C1761c0 c1761c0, final C3251l c3251l) {
            return new View.OnLongClickListener() { // from class: x90.h0
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean m146855y0;
                    m146855y0 = C29520c0.q.m146855y0(C1761c0.this, c3251l, view);
                    return m146855y0;
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: y0 */
        public static final boolean m146855y0(C1761c0 c1761c0, C3251l c3251l, View view) {
            AbstractC19074t.m100208f(c1761c0, "$longClickLD");
            AbstractC19074t.m100208f(c3251l, "$itemStickerInfo");
            c1761c0.mo9224q(new C18472k(c3251l, 15));
            return true;
        }

        /* renamed from: z0 */
        private final View.OnClickListener m146856z0(final C1761c0 c1761c0, final p pVar, final C25630b c25630b) {
            return new View.OnClickListener() { // from class: x90.i0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C29520c0.q.m146833A0(C29520c0.p.this, c1761c0, c25630b, view);
                }
            };
        }

        /* renamed from: s0 */
        public final void m146857s0(r rVar, int i11) {
            AbstractC19074t.m100208f(rVar, "newItem");
            if (!(rVar instanceof p)) {
                AbstractC20110a.f98889a.mo104551d("TrendingStickers", "not valid StickerRowItem");
                return;
            }
            p pVar = (p) rVar;
            this.f136291S = pVar;
            StickerView stickerView = this.f136281I.f138810s;
            stickerView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            stickerView.setIndicatorIndex(i11);
            stickerView.setRowIndex(pVar.m146831e());
            stickerView.setVisibility(0);
            stickerView.m56980l();
            C3251l m146832f = pVar.m146832f();
            int m16516f = m146832f.m16516f();
            if (m16516f != 0) {
                if (m16516f != 2) {
                    AbstractC19074t.m100205c(stickerView);
                    m146847p0(stickerView);
                    return;
                } else {
                    AbstractC19074t.m100205c(stickerView);
                    m146848q0(stickerView, pVar, m146832f);
                    return;
                }
            }
            AbstractC19074t.m100205c(stickerView);
            m146849r0(stickerView, pVar, m146832f);
        }
    }

    /* renamed from: x90.c0$r */
    /* loaded from: classes6.dex */
    public static class r {

        /* renamed from: a */
        private final int f136293a;

        /* renamed from: b */
        private final int f136294b;

        /* renamed from: c */
        private final int f136295c;

        /* renamed from: d */
        private long f136296d;

        public r(int i11, int i12, int i13) {
            this.f136293a = i11;
            this.f136294b = i12;
            this.f136295c = i13;
        }

        /* renamed from: a */
        public final int m146858a() {
            return this.f136293a;
        }

        /* renamed from: b */
        public final long m146859b() {
            return this.f136296d;
        }

        /* renamed from: c */
        public final void m146860c(long j11) {
            this.f136296d = j11;
        }

        public /* synthetic */ r(int i11, int i12, int i13, int i14, AbstractC19060k abstractC19060k) {
            this((i14 & 1) != 0 ? 0 : i11, (i14 & 2) != 0 ? -1 : i12, (i14 & 4) != 0 ? -1 : i13);
        }
    }

    /* renamed from: x90.c0$s */
    /* loaded from: classes6.dex */
    static final class s implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f136297p;

        s(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f136297p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f136297p;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1764d0) && (obj instanceof InterfaceC19066n)) {
                return AbstractC19074t.m100204b(mo9368c(), ((InterfaceC19066n) obj).mo9368c());
            }
            return false;
        }

        public final int hashCode() {
            return mo9368c().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final /* synthetic */ void mo8524qp(Object obj) {
            this.f136297p.mo205i9(obj);
        }
    }

    public C29520c0(LayoutInflater layoutInflater, C23528a c23528a, C1755a0 c1755a0, InterfaceC12972v interfaceC12972v, boolean z11, String str) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC19074t.m100208f(c23528a, "aQuery");
        AbstractC19074t.m100208f(c1755a0, "animViewLiveData");
        AbstractC19074t.m100208f(interfaceC12972v, "isScrolling");
        AbstractC19074t.m100208f(str, "autoPlayStickerPrefix");
        this.f136245r = layoutInflater;
        this.f136246s = c23528a;
        this.f136247t = c1755a0;
        this.f136248u = interfaceC12972v;
        this.f136249v = z11;
        this.f136250w = str;
        C1761c0 c1761c0 = new C1761c0();
        this.f136251x = c1761c0;
        C1761c0 c1761c02 = new C1761c0();
        this.f136252y = c1761c02;
        C1761c0 c1761c03 = new C1761c0();
        this.f136253z = c1761c03;
        C1761c0 c1761c04 = new C1761c0();
        this.f136236A = c1761c04;
        C1761c0 c1761c05 = new C1761c0();
        this.f136237B = c1761c05;
        C1761c0 c1761c06 = new C1761c0();
        this.f136238C = c1761c06;
        C1761c0 c1761c07 = new C1761c0();
        this.f136239D = c1761c07;
        this.f136240E = new ArrayList();
        this.f136241F = new LinkedHashMap();
        this.f136242G = new ArrayList();
        this.f136243H = -1;
        this.f136244I = new View.OnTouchListener() { // from class: x90.a0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m146794U;
                m146794U = C29520c0.m146794U(C29520c0.this, view, motionEvent);
                return m146794U;
            }
        };
        c1755a0.m9256r(c1761c0, new s(new a()));
        c1755a0.m9256r(c1761c02, new s(new b()));
        c1755a0.m9256r(c1761c03, new s(new c()));
        c1755a0.m9256r(c1761c04, new s(new d()));
        c1755a0.m9256r(c1761c05, new s(new e()));
        c1755a0.m9256r(c1761c06, new s(new f()));
        c1755a0.m9256r(c1761c07, new s(new g()));
    }

    /* renamed from: O */
    private final i m146790O(ViewGroup viewGroup) {
        C29738c0 m147792c = C29738c0.m147792c(this.f136245r, viewGroup, false);
        AbstractC19074t.m100207e(m147792c, "inflate(...)");
        return new i(m147792c);
    }

    /* renamed from: P */
    private final l m146791P(ViewGroup viewGroup, View.OnTouchListener onTouchListener, C1761c0 c1761c0, C1761c0 c1761c02) {
        C29796f4 m147934c = C29796f4.m147934c(this.f136245r, viewGroup, false);
        AbstractC19074t.m100207e(m147934c, "inflate(...)");
        return new l(m147934c, onTouchListener, c1761c0, c1761c02);
    }

    /* renamed from: Q */
    private final o m146792Q(ViewGroup viewGroup) {
        C30140yd m148751c = C30140yd.m148751c(this.f136245r, viewGroup, false);
        AbstractC19074t.m100207e(m148751c, "inflate(...)");
        return new o(m148751c);
    }

    /* renamed from: R */
    private final q m146793R(ViewGroup viewGroup, View.OnTouchListener onTouchListener, C1761c0 c1761c0, C1761c0 c1761c02, C1761c0 c1761c03, C1761c0 c1761c04, InterfaceC12972v interfaceC12972v, boolean z11, String str, C23528a c23528a) {
        C29948nc m148293c = C29948nc.m148293c(this.f136245r, viewGroup, false);
        AbstractC19074t.m100207e(m148293c, "inflate(...)");
        return new q(m148293c, onTouchListener, c1761c0, c1761c02, c1761c03, c1761c04, interfaceC12972v, z11, str, c23528a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public static final boolean m146794U(C29520c0 c29520c0, View view, MotionEvent motionEvent) {
        AbstractC19074t.m100208f(c29520c0, "this$0");
        if (view != null && motionEvent != null) {
            int action = motionEvent.getAction();
            if (action == 1 || action == 3) {
                if (view instanceof StickerView) {
                    c29520c0.f136239D.mo9224q(new C18477p(((StickerView) view).getEmoticon()));
                    return false;
                }
                if (view instanceof TrendingGifView) {
                    c29520c0.f136239D.mo9224q(new C18477p(""));
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: V */
    private final List m146795V() {
        int i11;
        C3251l c3251l;
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        int i13 = 0;
        for (C3254m0 c3254m0 : this.f136240E) {
            int i14 = i13 + 1;
            if (c3254m0.f13931p && c3254m0.f13920e.length() > 0) {
                arrayList.add(new h(c3254m0.f13920e, c3254m0, i13));
            } else if (AbstractC19074t.m100204b(AbstractC18458a.f93019a, "vi") && c3254m0.f13919d.length() > 0) {
                arrayList.add(new n(c3254m0.f13919d, i13));
            } else if (c3254m0.f13918c.length() > 0) {
                arrayList.add(new n(c3254m0.f13918c, i13));
            }
            if (!c3254m0.f13930o.isEmpty()) {
                int i15 = c3254m0.f13928m;
                if (i15 != 0 && i15 != 2) {
                    if (i15 == 1) {
                        i11 = i12;
                        int i16 = 0;
                        int i17 = 0;
                        for (C3254m0.c cVar : c3254m0.f13930o) {
                            if (cVar instanceof C3254m0.b) {
                                int i18 = i11 + 1;
                                arrayList.add(new k((C3254m0.b) cVar, c3254m0, i16, i13, i11));
                                i17++;
                                if (i17 % 2 == 0) {
                                    i16++;
                                }
                                i11 = i18;
                            }
                        }
                    }
                } else {
                    i11 = i12;
                    int i19 = 0;
                    int i21 = 0;
                    for (C3254m0.c cVar2 : c3254m0.f13930o) {
                        if (cVar2 instanceof C3254m0.e) {
                            c3251l = (C3251l) this.f136241F.get(String.valueOf(((C3254m0.e) cVar2).f13945c));
                        } else if (cVar2 instanceof C3254m0.d) {
                            c3251l = (C3251l) this.f136241F.get(((C3254m0.d) cVar2).f13943e);
                        } else {
                            c3251l = null;
                        }
                        C3251l c3251l2 = c3251l;
                        if (c3251l2 != null) {
                            int i22 = i11 + 1;
                            arrayList.add(new p(c3251l2, c3254m0, i19, i13, i11));
                            i21++;
                            if (i21 % 4 == 0) {
                                i19++;
                            }
                            i11 = i22;
                        }
                    }
                }
                i12 = i11;
            }
            i13 = i14;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public static final void m146796Z(C29520c0 c29520c0, List list) {
        AbstractC19074t.m100208f(c29520c0, "this$0");
        AbstractC19074t.m100208f(list, "$result");
        c29520c0.f136242G.clear();
        c29520c0.f136242G.addAll(list);
        c29520c0.m10008p();
    }

    /* renamed from: S */
    public final boolean m146797S(int i11) {
        if (((r) this.f136242G.get(i11)).m146858a() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: T */
    public final boolean m146798T(int i11) {
        if (((r) this.f136242G.get(i11)).m146858a() == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public void mo9990A(m mVar, int i11) {
        AbstractC19074t.m100208f(mVar, "holder");
        if (mVar instanceof i) {
            ((i) mVar).m146819m0(this.f136246s, (r) this.f136242G.get(i11));
            return;
        }
        if (mVar instanceof o) {
            ((o) mVar).m146829i0((r) this.f136242G.get(i11));
        } else if (mVar instanceof q) {
            ((q) mVar).m146857s0((r) this.f136242G.get(i11), this.f136243H);
        } else if (mVar instanceof l) {
            ((l) mVar).m146827k0((r) this.f136242G.get(i11), i11, this.f136243H);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public m mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        return m146792Q(viewGroup);
                    }
                    return m146791P(viewGroup, this.f136244I, this.f136252y, this.f136237B);
                }
                return m146790O(viewGroup);
            }
            return m146793R(viewGroup, this.f136244I, this.f136251x, this.f136236A, this.f136253z, this.f136238C, this.f136248u, this.f136249v, this.f136250w, this.f136246s);
        }
        return m146792Q(viewGroup);
    }

    /* renamed from: Y */
    public final void m146801Y(List list, Map map) {
        AbstractC19074t.m100208f(list, "kwdList");
        AbstractC19074t.m100208f(map, "map");
        this.f136240E.clear();
        this.f136240E.addAll(list);
        this.f136241F.clear();
        this.f136241F.putAll(map);
        final List m146795V = m146795V();
        AbstractC19444a.m101695c(new Runnable() { // from class: x90.b0
            @Override // java.lang.Runnable
            public final void run() {
                C29520c0.m146796Z(C29520c0.this, m146795V);
            }
        });
    }

    /* renamed from: a */
    public final boolean m146802a(int i11) {
        if (((r) this.f136242G.get(i11)).m146858a() != 2 && ((r) this.f136242G.get(i11)).m146858a() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a0 */
    public final void m146803a0(int i11) {
        this.f136243H = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f136242G.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        return ((r) this.f136242G.get(i11)).m146859b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        return ((r) this.f136242G.get(i11)).m146858a();
    }
}
