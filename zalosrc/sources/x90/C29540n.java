package x90;

import ag0.AbstractC0840r;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.C1755a0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.RecyclerView;
import b40.C2522b;
import bi0.AbstractC2814h;
import c30.C3229a;
import c30.C3245i;
import c30.C3251l;
import c30.C3255n;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.adapters.C7110j8;
import com.zing.zalo.p077ui.StickerView;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.AbstractC12964n;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.InterfaceC12972v;
import com.zing.zalo.uicomponents.reddot.RedDotImageView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.InterfaceC19066n;
import gg0.AbstractC19444a;
import gn.C19515b;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me0.AbstractC23136l9;
import me0.C23278z2;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import p134el.C18468g;
import p134el.C18469h;
import p134el.C18471j;
import p134el.C18472k;
import p134el.C18473l;
import p134el.C18474m;
import p134el.C18475n;
import p134el.C18476o;
import p134el.C18477p;
import p193h0.AbstractC19694b;
import p227i3.C20218v;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p379o3.AbstractC24006q;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24002m;
import p394oj.C24280f;
import p471r3.C25630b;
import p485rj.C25809a;
import p485rj.C25811c;
import p588vw.C28644j;
import p649xl.C29761d5;
import p649xl.C29948nc;
import p649xl.C29966oc;
import p649xl.C29984pc;
import p649xl.C30020rc;
import p649xl.C30148z4;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import qm0.AbstractC25332a0;
import th.AbstractC26683d;
import ui0.C27280g;
import vg.AbstractC28025b8;
import vg.AbstractC28236y3;
import vg.C28020b3;
import vg.C28212v6;
import vl0.AbstractC28291a;
import x90.C29540n;

/* renamed from: x90.n */
/* loaded from: classes6.dex */
public final class C29540n extends RecyclerView.AbstractC1880g implements C28644j.p {
    public static final h Companion = new h(null);

    /* renamed from: A */
    private final boolean f136339A;

    /* renamed from: B */
    private final String f136340B;

    /* renamed from: C */
    private final boolean f136341C;

    /* renamed from: D */
    private final C1761c0 f136342D;

    /* renamed from: E */
    private final boolean f136343E;

    /* renamed from: F */
    private final StickerView.InterfaceC10959a f136344F;

    /* renamed from: G */
    private final List f136345G;

    /* renamed from: H */
    private final Map f136346H;

    /* renamed from: I */
    private final Map f136347I;

    /* renamed from: J */
    private final Map f136348J;

    /* renamed from: K */
    private final C1761c0 f136349K;

    /* renamed from: L */
    private final C1761c0 f136350L;

    /* renamed from: M */
    private final C1761c0 f136351M;

    /* renamed from: N */
    private final C1761c0 f136352N;

    /* renamed from: O */
    private final C1761c0 f136353O;

    /* renamed from: P */
    private final C1761c0 f136354P;

    /* renamed from: Q */
    private final C1761c0 f136355Q;

    /* renamed from: r */
    private final LayoutInflater f136356r;

    /* renamed from: s */
    private final C23528a f136357s;

    /* renamed from: t */
    private final C1755a0 f136358t;

    /* renamed from: u */
    private final C1761c0 f136359u;

    /* renamed from: v */
    private final C1761c0 f136360v;

    /* renamed from: w */
    private final C1761c0 f136361w;

    /* renamed from: x */
    private final C7110j8.d f136362x;

    /* renamed from: y */
    private final int f136363y;

    /* renamed from: z */
    private final InterfaceC12972v f136364z;

    /* renamed from: x90.n$a */
    /* loaded from: classes6.dex */
    static final class a extends AbstractC19075u implements InterfaceC18505l {
        a() {
            super(1);
        }

        /* renamed from: a */
        public final void m146877a(C18475n c18475n) {
            C29540n.this.m146870S().mo9224q(c18475n);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m146877a((C18475n) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: x90.n$b */
    /* loaded from: classes6.dex */
    static final class b extends AbstractC19075u implements InterfaceC18505l {
        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m146878a(C18476o c18476o) {
            C29540n.this.m146870S().mo9224q(c18476o);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m146878a((C18476o) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: x90.n$c */
    /* loaded from: classes6.dex */
    static final class c extends AbstractC19075u implements InterfaceC18505l {
        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m146879a(C18477p c18477p) {
            C29540n.this.m146870S().mo9224q(c18477p);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m146879a((C18477p) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: x90.n$d */
    /* loaded from: classes6.dex */
    static final class d extends AbstractC19075u implements InterfaceC18505l {
        d() {
            super(1);
        }

        /* renamed from: a */
        public final void m146880a(C18468g c18468g) {
            C29540n.this.m146870S().mo9224q(c18468g);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m146880a((C18468g) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: x90.n$e */
    /* loaded from: classes6.dex */
    static final class e extends AbstractC19075u implements InterfaceC18505l {
        e() {
            super(1);
        }

        /* renamed from: a */
        public final void m146881a(C18469h c18469h) {
            C29540n.this.m146870S().mo9224q(c18469h);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m146881a((C18469h) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: x90.n$f */
    /* loaded from: classes6.dex */
    static final class f extends AbstractC19075u implements InterfaceC18505l {
        f() {
            super(1);
        }

        /* renamed from: a */
        public final void m146882a(C18471j c18471j) {
            C29540n.this.m146870S().mo9224q(c18471j);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m146882a((C18471j) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: x90.n$g */
    /* loaded from: classes6.dex */
    static final class g extends AbstractC19075u implements InterfaceC18505l {
        g() {
            super(1);
        }

        /* renamed from: a */
        public final void m146883a(C18472k c18472k) {
            C29540n.this.m146870S().mo9224q(c18472k);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m146883a((C18472k) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: x90.n$h */
    /* loaded from: classes6.dex */
    public static final class h {
        private h() {
        }

        public /* synthetic */ h(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: x90.n$i */
    /* loaded from: classes6.dex */
    private static final class i extends v {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C3245i c3245i, int i11) {
            super(6, c3245i);
            AbstractC19074t.m100208f(c3245i, "stickerCategory");
            m146936d(("CREATE_AI_VIEW_ID_PREFIX" + i11).hashCode());
        }
    }

    /* renamed from: x90.n$j */
    /* loaded from: classes6.dex */
    public static final class j extends q {

        /* renamed from: I */
        private final C30148z4 f136372I;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public j(C30148z4 c30148z4) {
            super(r0);
            AbstractC19074t.m100208f(c30148z4, "binding");
            LinearLayout root = c30148z4.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            this.f136372I = c30148z4;
        }

        /* renamed from: i0 */
        public final void m146884i0() {
            C30148z4 c30148z4 = this.f136372I;
            AppCompatImageView appCompatImageView = c30148z4.f140098q;
            Context context = c30148z4.getRoot().getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            appCompatImageView.setImageDrawable(C27280g.m139660c(context, AbstractC23322a.zds_ic_ai_symbol_solid_24, AbstractC28291a.button_tertiary_text));
        }
    }

    /* renamed from: x90.n$k */
    /* loaded from: classes6.dex */
    private static final class k extends v {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(C3245i c3245i, int i11) {
            super(5, c3245i);
            AbstractC19074t.m100208f(c3245i, "stickerCategory");
            m146936d(("EMPTY_AI_VIEW_ID" + i11).hashCode());
        }
    }

    /* renamed from: x90.n$l */
    /* loaded from: classes6.dex */
    public static final class l extends q {

        /* renamed from: I */
        private final C29761d5 f136373I;

        /* renamed from: J */
        private final C1761c0 f136374J;

        /* renamed from: x90.n$l$a */
        /* loaded from: classes6.dex */
        public static final class a extends C23999j {
            a() {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // p379o3.C23999j
            /* renamed from: O1 */
            public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
                Bitmap m18839c;
                super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
                if (c3979l != null && (m18839c = c3979l.m18839c()) != null) {
                    l.this.m146888l0().f137491r.setImageBitmap(m18839c);
                }
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public l(C29761d5 c29761d5, C1761c0 c1761c0) {
            super(r0);
            AbstractC19074t.m100208f(c29761d5, "binding");
            AbstractC19074t.m100208f(c1761c0, "openAIStickerMp");
            LinearLayout root = c29761d5.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            this.f136373I = c29761d5;
            this.f136374J = c1761c0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k0 */
        public static final void m146886k0(l lVar, View view) {
            AbstractC19074t.m100208f(lVar, "this$0");
            lVar.f136374J.mo9221n(C24848g0.f119245a);
        }

        /* renamed from: j0 */
        public final void m146887j0(C23528a c23528a) {
            int i11;
            AbstractC19074t.m100208f(c23528a, "aQuery");
            this.f136373I.f137491r.setImageDrawable(AbstractC28236y3.m142191b(AbstractC11531v0.Companion.m62485C()));
            C23528a c23528a2 = (C23528a) c23528a.m123612r(new RecyclingImageView(this.f136373I.getRoot().getContext()));
            C3229a c3229a = C3229a.f13790a;
            c23528a2.m123579C(c3229a.m16389c(), C23278z2.m120135k(), new a());
            this.f136373I.f137492s.setText(c3229a.m16390d());
            this.f136373I.f137490q.m90539c(AbstractC2814h.ButtonMedium_Secondary);
            C29761d5 c29761d5 = this.f136373I;
            Button button = c29761d5.f137490q;
            Context context = c29761d5.getRoot().getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            button.setSupportiveIcon(C27280g.m139660c(context, AbstractC23322a.zds_ic_ai_symbol_solid_24, AbstractC28291a.button_secondary_text));
            this.f136373I.f137490q.setOnClickListener(new View.OnClickListener() { // from class: x90.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C29540n.l.m146886k0(C29540n.l.this, view);
                }
            });
            Button button2 = this.f136373I.f137490q;
            if (c3229a.m16392f().length() > 0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            button2.setVisibility(i11);
        }

        /* renamed from: l0 */
        public final C29761d5 m146888l0() {
            return this.f136373I;
        }
    }

    /* renamed from: x90.n$m */
    /* loaded from: classes6.dex */
    public static final class m extends q {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public m(C29984pc c29984pc) {
            super(r0);
            AbstractC19074t.m100208f(c29984pc, "binding");
            StickerView root = c29984pc.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            StickerView stickerView = c29984pc.f139027q;
            stickerView.setOnClickListener(null);
            stickerView.setOnLongClickListener(null);
            stickerView.setOnTouchListener(null);
        }
    }

    /* renamed from: x90.n$n */
    /* loaded from: classes6.dex */
    private static final class n extends v {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(C3245i c3245i, int i11) {
            super(3, c3245i);
            AbstractC19074t.m100208f(c3245i, "stickerCategory");
            m146936d(("FAKE_VIEW_ID" + i11).hashCode());
        }
    }

    /* renamed from: x90.n$o */
    /* loaded from: classes6.dex */
    public static final class o extends q {

        /* renamed from: I */
        private final C29966oc f136376I;

        /* renamed from: J */
        private final int f136377J;

        /* renamed from: K */
        private final C1761c0 f136378K;

        /* renamed from: L */
        private p f136379L;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public o(C29966oc c29966oc, int i11, C1761c0 c1761c0) {
            super(r0);
            AbstractC19074t.m100208f(c29966oc, "binding");
            AbstractC19074t.m100208f(c1761c0, "openPopupLiveData");
            RelativeLayout root = c29966oc.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            this.f136376I = c29966oc;
            this.f136377J = i11;
            this.f136378K = c1761c0;
            c29966oc.f138899r.setImageDrawable(AbstractC19694b.m103336d(MainApplication.Companion.m35500c(), AbstractC16803z.icn_csc_sticker_option));
            if (i11 == 250) {
                C28212v6 m141453i = AbstractC28025b8.m141453i("tip.csc.sticker.promotion");
                boolean z11 = false;
                c29966oc.f138899r.setLeftRedDot(false);
                c29966oc.f138899r.setRedDotMargin(AbstractC23136l9.m118742r(4.0f));
                RedDotImageView redDotImageView = c29966oc.f138899r;
                if (m141453i != null && m141453i.m142167f() && m141453i.f131580f) {
                    z11 = true;
                }
                redDotImageView.setEnableNoti(z11);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k0 */
        public static final void m146890k0(C29966oc c29966oc, o oVar, v vVar, View view) {
            AbstractC19074t.m100208f(c29966oc, "$this_with");
            AbstractC19074t.m100208f(oVar, "this$0");
            AbstractC19074t.m100208f(vVar, "$item");
            AbstractC23647d.m123897g("9597");
            int[] iArr = new int[2];
            c29966oc.f138899r.getLocationInWindow(iArr);
            int i11 = iArr[0];
            oVar.f136378K.mo9224q(new C18473l(i11, iArr[1], i11 + c29966oc.f138899r.getWidth(), iArr[1] + c29966oc.f138899r.getHeight(), vVar.m146933a()));
        }

        /* renamed from: j0 */
        public final void m146891j0(final v vVar) {
            String str;
            String str2;
            AbstractC19074t.m100208f(vVar, "item");
            if (!(vVar instanceof p)) {
                AbstractC23350e.m122774d("StickersAdapter", "not valid HeaderRow");
                return;
            }
            p pVar = this.f136379L;
            if (pVar != null) {
                str = pVar.m146893e();
            } else {
                str = null;
            }
            p pVar2 = (p) vVar;
            boolean z11 = !AbstractC19074t.m100204b(str, pVar2.m146893e());
            this.f136379L = pVar2;
            final C29966oc c29966oc = this.f136376I;
            if (pVar2.m146893e().length() < 43) {
                str2 = pVar2.m146893e();
            } else {
                String substring = pVar2.m146893e().substring(0, 43);
                AbstractC19074t.m100207e(substring, "substring(...)");
                str2 = substring + "...";
            }
            c29966oc.f138901t.setText(str2);
            if (z11) {
                if (vVar.m146933a().f13854b != -2 && vVar.m146933a().f13854b != -3 && vVar.m146933a().f13854b != -10) {
                    c29966oc.f138900s.setVisibility(0);
                    c29966oc.f138900s.setOnClickListener(new View.OnClickListener() { // from class: x90.p
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C29540n.o.m146890k0(C29966oc.this, this, vVar, view);
                        }
                    });
                } else {
                    c29966oc.f138900s.setVisibility(8);
                }
            }
        }

        /* renamed from: l0 */
        public final RedDotImageView m146892l0() {
            RedDotImageView redDotImageView = this.f136376I.f138899r;
            AbstractC19074t.m100207e(redDotImageView, "more");
            return redDotImageView;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x90.n$p */
    /* loaded from: classes6.dex */
    public static final class p extends v {

        /* renamed from: d */
        private final String f136380d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(C3245i c3245i) {
            super(0, c3245i);
            AbstractC19074t.m100208f(c3245i, "stickerCategory");
            m146936d(c3245i.f13854b);
            String m16464f = c3245i.m16464f();
            AbstractC19074t.m100207e(m16464f, "getName(...)");
            this.f136380d = m16464f;
        }

        /* renamed from: e */
        public final String m146893e() {
            return this.f136380d;
        }
    }

    /* renamed from: x90.n$q */
    /* loaded from: classes6.dex */
    public static class q extends RecyclerView.AbstractC1876c0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
        }
    }

    /* renamed from: x90.n$r */
    /* loaded from: classes6.dex */
    public static final class r extends q {

        /* renamed from: I */
        private final C29948nc f136381I;

        /* renamed from: J */
        private final C1761c0 f136382J;

        /* renamed from: K */
        private final C1761c0 f136383K;

        /* renamed from: L */
        private final C1761c0 f136384L;

        /* renamed from: M */
        private final C1761c0 f136385M;

        /* renamed from: N */
        private final C1761c0 f136386N;

        /* renamed from: O */
        private final C1761c0 f136387O;

        /* renamed from: P */
        private final C1761c0 f136388P;

        /* renamed from: Q */
        private final StickerView.InterfaceC10959a f136389Q;

        /* renamed from: R */
        private C3245i f136390R;

        /* renamed from: S */
        private s f136391S;

        /* renamed from: T */
        private final View.OnClickListener f136392T;

        /* renamed from: U */
        private final View.OnLongClickListener f136393U;

        /* renamed from: V */
        private final View.OnTouchListener f136394V;

        /* renamed from: x90.n$r$a */
        /* loaded from: classes6.dex */
        public static final class a extends C24002m {

            /* renamed from: A0 */
            final /* synthetic */ C24280f f136395A0;

            /* renamed from: B0 */
            final /* synthetic */ String f136396B0;

            /* renamed from: C0 */
            final /* synthetic */ s f136397C0;

            /* renamed from: z0 */
            final /* synthetic */ StickerView f136399z0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(StickerView stickerView, C24280f c24280f, String str, s sVar) {
                super(3);
                this.f136399z0 = stickerView;
                this.f136395A0 = c24280f;
                this.f136396B0 = str;
                this.f136397C0 = sVar;
            }

            @Override // p379o3.C24002m
            /* renamed from: E1 */
            protected void mo16457E1(String str, InterfaceC3968a interfaceC3968a, File file, C23995f c23995f) {
                C25811c m16513c;
                C24280f m133098j;
                AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                AbstractC19074t.m100208f(interfaceC3968a, "iv");
                AbstractC19074t.m100208f(file, "file");
                AbstractC19074t.m100208f(c23995f, "status");
                s sVar = r.this.f136391S;
                if (sVar == null || !sVar.m146927f().m16518h() || (m16513c = sVar.m146927f().m16513c()) == null || (m133098j = m16513c.m133098j()) == null || !AbstractC19074t.m100204b(str, m133098j.f117261a)) {
                    return;
                }
                String path = file.getPath();
                if (path != null && path.length() != 0) {
                    C28020b3 c28020b3 = C28020b3.f130648a;
                    String path2 = file.getPath();
                    AbstractC19074t.m100207e(path2, "getPath(...)");
                    c28020b3.m141188Q(str, path2);
                    r.this.m146903K0(this.f136399z0, this.f136395A0, this.f136396B0, this.f136397C0);
                }
                r.this.f136381I.f138810s.invalidate();
            }
        }

        /* renamed from: x90.n$r$b */
        /* loaded from: classes6.dex */
        public static final class b extends C23999j {

            /* renamed from: m1 */
            final /* synthetic */ StickerView f136401m1;

            b(StickerView stickerView) {
                this.f136401m1 = stickerView;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // p379o3.C23999j
            /* renamed from: O1 */
            public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
                Bitmap m18839c;
                super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
                if (c3979l != null && (m18839c = c3979l.m18839c()) != null) {
                    this.f136401m1.setImageBitmap(m18839c);
                }
                r.this.f136381I.f138810s.invalidate();
            }
        }

        /* renamed from: x90.n$r$c */
        /* loaded from: classes6.dex */
        public static final class c extends C28020b3.b {

            /* renamed from: b */
            final /* synthetic */ boolean f136403b;

            /* renamed from: c */
            final /* synthetic */ String f136404c;

            /* renamed from: d */
            final /* synthetic */ InterfaceC12972v f136405d;

            c(boolean z11, String str, InterfaceC12972v interfaceC12972v) {
                this.f136403b = z11;
                this.f136404c = str;
                this.f136405d = interfaceC12972v;
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
                s sVar = r.this.f136391S;
                if (sVar != null && sVar.m146927f().m16519i() && (m16514d = sVar.m146927f().m16514d()) != null && m16514d.m132429g() == c25630b.m132429g()) {
                    super.mo36247a(str, c25630b, interfaceC3968a, c3979l, c23995f);
                    C28020b3.f130648a.m141178A(c25630b, interfaceC3968a, c23995f, this.f136403b);
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
                s sVar = r.this.f136391S;
                if (sVar != null && sVar.m146927f().m16519i() && (m16514d = sVar.m146927f().m16514d()) != null && m16514d.m132429g() == c25630b.m132429g()) {
                    super.mo35607b(str, c25630b, interfaceC3968a, c3979l, c23995f);
                    C28020b3.f130648a.m141179B(c25630b, interfaceC3968a, c3979l, this.f136403b, this.f136404c, ((Boolean) this.f136405d.get()).booleanValue());
                }
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public r(C29948nc c29948nc, C1761c0 c1761c0, C1761c0 c1761c02, C1761c0 c1761c03, C1761c0 c1761c04, C1761c0 c1761c05, C1761c0 c1761c06, C1761c0 c1761c07, StickerView.InterfaceC10959a interfaceC10959a) {
            super(r0);
            AbstractC19074t.m100208f(c29948nc, "binding");
            AbstractC19074t.m100208f(c1761c0, "stickerClickLiveData");
            AbstractC19074t.m100208f(c1761c02, "stickerLongClickLiveData");
            AbstractC19074t.m100208f(c1761c03, "gifClickLiveData");
            AbstractC19074t.m100208f(c1761c04, "gifLongClickLiveData");
            AbstractC19074t.m100208f(c1761c05, "photoStickerClickLiveData");
            AbstractC19074t.m100208f(c1761c06, "photoStickerLongClickLiveData");
            AbstractC19074t.m100208f(c1761c07, "viewTouchUpLiveData");
            FrameLayout root = c29948nc.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            this.f136381I = c29948nc;
            this.f136382J = c1761c0;
            this.f136383K = c1761c02;
            this.f136384L = c1761c03;
            this.f136385M = c1761c04;
            this.f136386N = c1761c05;
            this.f136387O = c1761c06;
            this.f136388P = c1761c07;
            this.f136389Q = interfaceC10959a;
            c29948nc.f138810s.setDelegate(interfaceC10959a);
            this.f136392T = new View.OnClickListener() { // from class: x90.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C29540n.r.m146904L0(C29540n.r.this, view);
                }
            };
            this.f136393U = new View.OnLongClickListener() { // from class: x90.v
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean m146905M0;
                    m146905M0 = C29540n.r.m146905M0(C29540n.r.this, view);
                    return m146905M0;
                }
            };
            this.f136394V = new View.OnTouchListener() { // from class: x90.w
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean m146906N0;
                    m146906N0 = C29540n.r.m146906N0(C29540n.r.this, view, motionEvent);
                    return m146906N0;
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: A0 */
        public static final boolean m146894A0(r rVar, s sVar, View view) {
            AbstractC19074t.m100208f(rVar, "this$0");
            AbstractC19074t.m100208f(sVar, "$newItem");
            rVar.f136387O.mo9224q(new C18472k(sVar.m146927f(), 7));
            return true;
        }

        /* renamed from: B0 */
        private final void m146895B0(C23528a c23528a, boolean z11, String str, InterfaceC12972v interfaceC12972v, s sVar, boolean z12) {
            StickerView stickerView;
            StickerView stickerView2 = this.f136381I.f138810s;
            if (z12) {
                stickerView2.m56980l();
            }
            C25630b m143290W = C28644j.m143233Y().m143290W(sVar.m146927f().m16512b());
            AbstractC19074t.m100207e(m143290W, "getAnimationInfo(...)");
            stickerView2.setStickerInfo(m143290W);
            if (m143290W.m132448z()) {
                if (!((Boolean) interfaceC12972v.get()).booleanValue()) {
                    if (z11) {
                        stickerView2.m56978i(m143290W);
                        C3255n m16562n = C3255n.m16562n();
                        long currentTimeMillis = System.currentTimeMillis();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(currentTimeMillis);
                        String m16572l = m16562n.m16572l(str, sb2.toString(), m143290W);
                        AbstractC19074t.m100205c(stickerView2);
                        AbstractC19074t.m100205c(m16572l);
                        stickerView = stickerView2;
                        StickerView.m56977k(stickerView, m143290W, m16572l, true, false, false, true, 24, null);
                    } else {
                        AbstractC19074t.m100205c(stickerView2);
                        m146897E0(stickerView2, m143290W);
                    }
                } else if (C28020b3.f130648a.m141181D(m143290W)) {
                    AbstractC19074t.m100205c(stickerView2);
                    m146897E0(stickerView2, m143290W);
                }
                stickerView = stickerView2;
            } else if (!((Boolean) interfaceC12972v.get()).booleanValue()) {
                AbstractC19074t.m100205c(stickerView2);
                ProgressBar progressBar = this.f136381I.f138808q;
                AbstractC19074t.m100207e(progressBar, "progressId");
                stickerView = stickerView2;
                m146896D0(c23528a, m143290W, stickerView2, progressBar, z11, str, interfaceC12972v);
            } else {
                stickerView = stickerView2;
                if (AbstractC24006q.m125853Z1(m143290W.m132446x())) {
                    stickerView.setImageInfo(AbstractC24006q.m125837F1(m143290W.m132446x()));
                }
            }
            stickerView.invalidate();
            stickerView.setEmoticon(sVar.m146927f().m16512b());
            stickerView.setOnClickListener(this.f136392T);
            stickerView.setOnLongClickListener(this.f136393U);
            stickerView.setOnTouchListener(this.f136394V);
        }

        /* renamed from: D0 */
        private final void m146896D0(C23528a c23528a, C25630b c25630b, InterfaceC3968a interfaceC3968a, ProgressBar progressBar, boolean z11, String str, InterfaceC12972v interfaceC12972v) {
            if (!c25630b.m132448z()) {
                c25630b.m132403L(true);
                C28020b3.f130648a.m141182F(interfaceC3968a, c23528a, c25630b, progressBar, true, new c(z11, str, interfaceC12972v));
                return;
            }
            throw new RuntimeException("Not load sticker DEFAULT by Aquery");
        }

        /* renamed from: E0 */
        private final void m146897E0(final StickerView stickerView, final C25630b c25630b) {
            Bitmap m141205v = C28020b3.f130648a.m141205v(c25630b, false);
            if (m141205v != null) {
                stickerView.setImageBitmap(m141205v);
                this.f136381I.f138810s.invalidate();
            } else {
                AbstractC0840r.m2251h(new Runnable() { // from class: x90.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        C29540n.r.m146898F0(C29540n.r.this, c25630b, stickerView);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: F0 */
        public static final void m146898F0(final r rVar, final C25630b c25630b, final StickerView stickerView) {
            AbstractC19074t.m100208f(rVar, "this$0");
            AbstractC19074t.m100208f(c25630b, "$stickerInfo");
            AbstractC19074t.m100208f(stickerView, "$stickerView");
            AbstractC19444a.m101695c(new Runnable() { // from class: x90.y
                @Override // java.lang.Runnable
                public final void run() {
                    C29540n.r.m146899G0(C29540n.r.this, c25630b, stickerView);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: G0 */
        public static final void m146899G0(r rVar, C25630b c25630b, StickerView stickerView) {
            C25630b m16514d;
            AbstractC19074t.m100208f(rVar, "this$0");
            AbstractC19074t.m100208f(c25630b, "$stickerInfo");
            AbstractC19074t.m100208f(stickerView, "$stickerView");
            s sVar = rVar.f136391S;
            if (sVar != null && sVar.m146927f().m16519i() && (m16514d = sVar.m146927f().m16514d()) != null && m16514d.m132429g() == c25630b.m132429g()) {
                stickerView.setImageBitmap(C28020b3.f130648a.m141206w(c25630b));
                rVar.f136381I.f138810s.invalidate();
            }
        }

        /* renamed from: H0 */
        private final void m146900H0(View view) {
            C3245i c3245i;
            if ((view instanceof StickerView) && (c3245i = this.f136390R) != null) {
                this.f136382J.mo9224q(new C18475n((StickerView) view, c3245i.f13854b));
            }
        }

        /* renamed from: I0 */
        private final boolean m146901I0(View view) {
            int i11;
            C3245i c3245i = this.f136390R;
            if (c3245i != null && (view instanceof StickerView)) {
                if (c3245i.f13854b == -2) {
                    i11 = 7;
                } else if (C28644j.m143233Y().m143312x0(c3245i.f13854b)) {
                    i11 = 5;
                } else {
                    i11 = 6;
                }
                this.f136383K.mo9224q(new C18476o((StickerView) view, c3245i.f13854b, i11));
                return true;
            }
            return true;
        }

        /* renamed from: J0 */
        private final boolean m146902J0(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if ((action == 1 || action == 3) && (view instanceof StickerView)) {
                this.f136388P.mo9224q(new C18477p(((StickerView) view).getEmoticon()));
                return false;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: K0 */
        public final void m146903K0(StickerView stickerView, C24280f c24280f, String str, s sVar) {
            String str2 = c24280f.f117261a;
            String m141209z = C28020b3.f130648a.m141209z(str2);
            if (m141209z.length() > 0 && str2.length() > 0) {
                C25630b m16514d = sVar.m146927f().m16514d();
                if (m16514d == null) {
                    m16514d = new C25630b();
                }
                C25630b c25630b = m16514d;
                c25630b.m132418a0(1);
                c25630b.m132416Z(2);
                c25630b.m132428f0(str2);
                c25630b.m132407Q(m141209z);
                StickerView.m56977k(stickerView, c25630b, str + c25630b.m132446x(), true, false, false, true, 24, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: L0 */
        public static final void m146904L0(r rVar, View view) {
            AbstractC19074t.m100208f(rVar, "this$0");
            AbstractC19074t.m100208f(view, C20218v.f100059b);
            rVar.m146900H0(view);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: M0 */
        public static final boolean m146905M0(r rVar, View view) {
            AbstractC19074t.m100208f(rVar, "this$0");
            AbstractC19074t.m100208f(view, C20218v.f100059b);
            return rVar.m146901I0(view);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: N0 */
        public static final boolean m146906N0(r rVar, View view, MotionEvent motionEvent) {
            AbstractC19074t.m100208f(rVar, "this$0");
            AbstractC19074t.m100208f(view, C20218v.f100059b);
            AbstractC19074t.m100208f(motionEvent, "event");
            return rVar.m146902J0(view, motionEvent);
        }

        /* renamed from: u0 */
        private final void m146919u0(C23528a c23528a, InterfaceC12972v interfaceC12972v, final s sVar, boolean z11) {
            StickerView stickerView = this.f136381I.f138810s;
            String m16515e = sVar.m146927f().m16515e();
            if (z11) {
                stickerView.m56980l();
            }
            stickerView.setStickerInfo(sVar.m146927f().m16514d());
            if (((Boolean) interfaceC12972v.get()).booleanValue() && !C23999j.m125696L2(m16515e, C23278z2.m120123e0())) {
                stickerView.invalidate();
            } else {
                ((C23528a) c23528a.m123612r(stickerView)).m123618x(m16515e, C23278z2.m120123e0());
            }
            stickerView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            stickerView.setOnClickListener(new View.OnClickListener() { // from class: x90.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C29540n.r.m146920v0(C29540n.r.this, sVar, view);
                }
            });
            stickerView.setOnLongClickListener(new View.OnLongClickListener() { // from class: x90.r
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean m146921w0;
                    m146921w0 = C29540n.r.m146921w0(C29540n.r.this, sVar, view);
                    return m146921w0;
                }
            });
            stickerView.setOnTouchListener(this.f136394V);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: v0 */
        public static final void m146920v0(r rVar, s sVar, View view) {
            AbstractC19074t.m100208f(rVar, "this$0");
            AbstractC19074t.m100208f(sVar, "$newItem");
            rVar.f136384L.mo9224q(new C18468g(sVar.m146927f()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w0 */
        public static final boolean m146921w0(r rVar, s sVar, View view) {
            AbstractC19074t.m100208f(rVar, "this$0");
            AbstractC19074t.m100208f(sVar, "$newItem");
            rVar.f136385M.mo9224q(new C18469h(sVar.m146927f(), 7));
            return true;
        }

        /* renamed from: x0 */
        private final void m146922x0() {
            StickerView stickerView = this.f136381I.f138810s;
            stickerView.setOnClickListener(null);
            stickerView.setOnLongClickListener(null);
            stickerView.setOnTouchListener(null);
        }

        /* renamed from: y0 */
        private final void m146923y0(C23528a c23528a, boolean z11, String str, InterfaceC12972v interfaceC12972v, final s sVar, final C2522b c2522b, boolean z12) {
            C24280f c24280f;
            String m133092d;
            C3979l m125676A2;
            Bitmap m18839c;
            StickerView stickerView = this.f136381I.f138810s;
            String m16515e = sVar.m146927f().m16515e();
            C25811c m16513c = sVar.m146927f().m16513c();
            if (m16513c != null) {
                c24280f = m16513c.m133098j();
            } else {
                c24280f = null;
            }
            C24280f c24280f2 = c24280f;
            String str2 = "";
            if (m16515e.length() == 0 && (c24280f2 == null || (m16515e = c24280f2.f117261a) == null)) {
                m16515e = "";
            }
            if (z12) {
                stickerView.m56980l();
            }
            stickerView.setStickerInfo(sVar.m146927f().m16514d());
            stickerView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            if (!((Boolean) interfaceC12972v.get()).booleanValue() && c24280f2 != null && z11 && AbstractC26683d.f126407z) {
                if (C23999j.m125696L2(m16515e, C23278z2.m120091Q0()) && (m125676A2 = C23999j.m125676A2(m16515e, C23278z2.m120091Q0().f116260a, C23278z2.m120091Q0().f116266g)) != null && (m18839c = m125676A2.m18839c()) != null) {
                    AbstractC19074t.m100205c(m18839c);
                    stickerView.setImageBitmap(m18839c);
                }
                String str3 = c24280f2.f117261a;
                if (C28020b3.f130648a.m141209z(str3).length() > 0) {
                    AbstractC19074t.m100205c(stickerView);
                    m146903K0(stickerView, c24280f2, str, sVar);
                } else {
                    AbstractC19074t.m100205c(stickerView);
                    ((C23528a) c23528a.m123612r(stickerView)).m123602g(str3, new a(stickerView, c24280f2, str, sVar));
                }
            } else {
                ((C23528a) c23528a.m123612r(stickerView)).m123579C(m16515e, C23278z2.m120091Q0(), new b(stickerView));
            }
            C25811c m16513c2 = sVar.m146927f().m16513c();
            if (m16513c2 != null && (m133092d = m16513c2.m133092d()) != null) {
                str2 = m133092d;
            }
            stickerView.setEmoticon(str2);
            stickerView.setOnClickListener(new View.OnClickListener() { // from class: x90.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C29540n.r.m146924z0(C29540n.r.this, sVar, c2522b, view);
                }
            });
            stickerView.setOnLongClickListener(new View.OnLongClickListener() { // from class: x90.t
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean m146894A0;
                    m146894A0 = C29540n.r.m146894A0(C29540n.r.this, sVar, view);
                    return m146894A0;
                }
            });
            stickerView.setOnTouchListener(this.f136394V);
            this.f136381I.f138810s.invalidate();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: z0 */
        public static final void m146924z0(r rVar, s sVar, C2522b c2522b, View view) {
            AbstractC19074t.m100208f(rVar, "this$0");
            AbstractC19074t.m100208f(sVar, "$newItem");
            rVar.f136386N.mo9224q(new C18471j(sVar.m146927f(), c2522b));
        }

        /* renamed from: C0 */
        public final void m146925C0(C23528a c23528a, v vVar, InterfaceC12972v interfaceC12972v, boolean z11, String str, C2522b c2522b) {
            String str2;
            C24280f m133098j;
            C3251l m146927f;
            C25811c m16513c;
            C24280f m133098j2;
            C3251l m146927f2;
            Integer num;
            C3251l m146927f3;
            C25630b m16514d;
            AbstractC19074t.m100208f(c23528a, "aQuery");
            AbstractC19074t.m100208f(vVar, "newItem");
            AbstractC19074t.m100208f(interfaceC12972v, "isScrolling");
            AbstractC19074t.m100208f(str, "autoPlayStickerPrefix");
            if (!(vVar instanceof s)) {
                AbstractC23350e.m122774d("StickersAdapter", "not valid ItemsRowItem");
                return;
            }
            this.f136390R = vVar.m146933a();
            s sVar = this.f136391S;
            s sVar2 = (s) vVar;
            this.f136391S = sVar2;
            this.f136381I.f138809r.setVisibility(8);
            this.f136381I.f138808q.setVisibility(8);
            Object obj = null;
            if (sVar2.m146927f().m16519i()) {
                if (sVar != null && (m146927f3 = sVar.m146927f()) != null && (m16514d = m146927f3.m16514d()) != null) {
                    num = Integer.valueOf(m16514d.m132429g());
                } else {
                    num = null;
                }
                C25630b m16514d2 = sVar2.m146927f().m16514d();
                if (m16514d2 != null) {
                    obj = Integer.valueOf(m16514d2.m132429g());
                }
                m146895B0(c23528a, z11, str, interfaceC12972v, sVar2, !AbstractC19074t.m100204b(num, obj));
                return;
            }
            if (sVar2.m146927f().m16517g()) {
                if (sVar != null && (m146927f2 = sVar.m146927f()) != null) {
                    obj = m146927f2.m16515e();
                }
                m146919u0(c23528a, interfaceC12972v, sVar2, !AbstractC19074t.m100204b(obj, sVar2.m146927f().m16515e()));
                return;
            }
            if (sVar2.m146927f().m16518h()) {
                if (sVar != null && (m146927f = sVar.m146927f()) != null && (m16513c = m146927f.m16513c()) != null && (m133098j2 = m16513c.m133098j()) != null) {
                    str2 = m133098j2.f117261a;
                } else {
                    str2 = null;
                }
                C25811c m16513c2 = sVar2.m146927f().m16513c();
                if (m16513c2 != null && (m133098j = m16513c2.m133098j()) != null) {
                    obj = m133098j.f117261a;
                }
                m146923y0(c23528a, z11, str, interfaceC12972v, sVar2, c2522b, !AbstractC19074t.m100204b(str2, obj));
                return;
            }
            m146922x0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x90.n$s */
    /* loaded from: classes6.dex */
    public static final class s extends v {

        /* renamed from: d */
        private final C3251l f136406d;

        /* renamed from: e */
        private final int f136407e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(C3245i c3245i, C3251l c3251l, int i11) {
            super(2, c3245i);
            C25811c m16513c;
            String m133092d;
            C25809a m16511a;
            int i12;
            AbstractC19074t.m100208f(c3245i, "stickerCategory");
            AbstractC19074t.m100208f(c3251l, "stickerGifInfo");
            this.f136406d = c3251l;
            this.f136407e = i11;
            if (c3251l.m16519i()) {
                int i13 = c3245i.f13854b;
                C25630b m16514d = c3251l.m16514d();
                if (m16514d != null) {
                    i12 = m16514d.m132429g();
                } else {
                    i12 = 0;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i13);
                sb2.append(i12);
                m133092d = sb2.toString();
            } else if (!c3251l.m16517g() ? !c3251l.m16518h() || (m16513c = c3251l.m16513c()) == null || (m133092d = m16513c.m133092d()) == null : (m16511a = c3251l.m16511a()) == null || (m133092d = m16511a.m133081c()) == null) {
                m133092d = "";
            }
            m133092d = m133092d.length() == 0 ? "NO_INFO_VIEW_ID" : m133092d;
            StringBuilder sb3 = new StringBuilder();
            sb3.append((Object) m133092d);
            sb3.append(i11);
            m146936d(sb3.toString().hashCode());
        }

        /* renamed from: e */
        public final int m146926e() {
            return this.f136407e;
        }

        /* renamed from: f */
        public final C3251l m146927f() {
            return this.f136406d;
        }
    }

    /* renamed from: x90.n$t */
    /* loaded from: classes6.dex */
    public static final class t extends q {

        /* renamed from: I */
        private final C30020rc f136408I;

        /* renamed from: J */
        private final C1761c0 f136409J;

        /* renamed from: K */
        private u f136410K;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public t(C30020rc c30020rc, C1761c0 c1761c0) {
            super(r0);
            AbstractC19074t.m100208f(c30020rc, "binding");
            AbstractC19074t.m100208f(c1761c0, "startDownloadStickerLiveData");
            RelativeLayout root = c30020rc.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            this.f136408I = c30020rc;
            this.f136409J = c1761c0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k0 */
        public static final void m146929k0(t tVar, v vVar, View view) {
            AbstractC19074t.m100208f(tVar, "this$0");
            AbstractC19074t.m100208f(vVar, "$item");
            tVar.f136409J.mo9224q(new C18474m((u) vVar));
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
        /* renamed from: j0 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m146930j0(final v vVar) {
            String str;
            boolean z11;
            C30020rc c30020rc;
            AbstractC19074t.m100208f(vVar, "item");
            if (!(vVar instanceof u)) {
                AbstractC23350e.m122774d("StickersAdapter", "not valid PromotionHeaderRow");
                return;
            }
            u uVar = this.f136410K;
            String str2 = null;
            if (uVar != null) {
                str = uVar.m146932f();
            } else {
                str = null;
            }
            u uVar2 = (u) vVar;
            if (AbstractC19074t.m100204b(str, uVar2.m146932f())) {
                u uVar3 = this.f136410K;
                if (uVar3 != null) {
                    str2 = uVar3.m146931e();
                }
                if (AbstractC19074t.m100204b(str2, uVar2.m146931e())) {
                    z11 = false;
                    this.f136410K = uVar2;
                    c30020rc = this.f136408I;
                    c30020rc.f139241v.setText(uVar2.m146932f());
                    if (uVar2.m146931e().length() <= 0 && !AbstractC19074t.m100204b(uVar2.m146931e(), "null")) {
                        c30020rc.f139239t.setText(uVar2.m146931e());
                    } else {
                        c30020rc.f139239t.setText(MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_sticker_promote_description_default));
                    }
                    if (!C19515b.Companion.m102006a().m102002j(vVar.m146933a().f13854b)) {
                        c30020rc.f139236q.setClickable(false);
                        c30020rc.f139236q.setText("");
                        c30020rc.f139237r.setVisibility(0);
                    } else {
                        c30020rc.f139236q.setClickable(true);
                        c30020rc.f139236q.setText(MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_msg_file_start_download));
                        c30020rc.f139237r.setVisibility(8);
                    }
                    if (!z11) {
                        c30020rc.f139236q.setOnClickListener(new View.OnClickListener() { // from class: x90.z
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                C29540n.t.m146929k0(C29540n.t.this, vVar, view);
                            }
                        });
                        return;
                    }
                    return;
                }
            }
            z11 = true;
            this.f136410K = uVar2;
            c30020rc = this.f136408I;
            c30020rc.f139241v.setText(uVar2.m146932f());
            if (uVar2.m146931e().length() <= 0) {
            }
            c30020rc.f139239t.setText(MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_sticker_promote_description_default));
            if (!C19515b.Companion.m102006a().m102002j(vVar.m146933a().f13854b)) {
            }
            if (!z11) {
            }
        }
    }

    /* renamed from: x90.n$u */
    /* loaded from: classes6.dex */
    public static final class u extends v {

        /* renamed from: d */
        private final String f136411d;

        /* renamed from: e */
        private final String f136412e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(C3245i c3245i) {
            super(1, c3245i);
            AbstractC19074t.m100208f(c3245i, "stickerCategory");
            m146936d(c3245i.f13854b);
            String m16464f = c3245i.m16464f();
            AbstractC19074t.m100207e(m16464f, "getName(...)");
            this.f136411d = m16464f;
            String str = c3245i.f13856d;
            AbstractC19074t.m100207e(str, "desc");
            this.f136412e = str;
        }

        /* renamed from: e */
        public final String m146931e() {
            return this.f136412e;
        }

        /* renamed from: f */
        public final String m146932f() {
            return this.f136411d;
        }
    }

    /* renamed from: x90.n$v */
    /* loaded from: classes6.dex */
    public static class v {

        /* renamed from: a */
        private final C3245i f136413a;

        /* renamed from: b */
        private int f136414b;

        /* renamed from: c */
        private long f136415c;

        public v(int i11, C3245i c3245i) {
            AbstractC19074t.m100208f(c3245i, "stickerCategory");
            this.f136413a = c3245i;
            this.f136414b = i11;
        }

        /* renamed from: a */
        public final C3245i m146933a() {
            return this.f136413a;
        }

        /* renamed from: b */
        public final int m146934b() {
            return this.f136414b;
        }

        /* renamed from: c */
        public final long m146935c() {
            return this.f136415c;
        }

        /* renamed from: d */
        protected final void m146936d(long j11) {
            this.f136415c = j11;
        }
    }

    /* renamed from: x90.n$w */
    /* loaded from: classes6.dex */
    static final class w implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f136416p;

        w(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f136416p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f136416p;
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
            this.f136416p.mo205i9(obj);
        }
    }

    public C29540n(LayoutInflater layoutInflater, C23528a c23528a, C1755a0 c1755a0, C1761c0 c1761c0, C1761c0 c1761c02, C1761c0 c1761c03, C7110j8.d dVar, int i11, InterfaceC12972v interfaceC12972v, boolean z11, String str, boolean z12, C1761c0 c1761c04, boolean z13, StickerView.InterfaceC10959a interfaceC10959a) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC19074t.m100208f(c23528a, "aQuery");
        AbstractC19074t.m100208f(c1755a0, "viewActionLiveData");
        AbstractC19074t.m100208f(c1761c0, "openPopupLiveData");
        AbstractC19074t.m100208f(c1761c02, "refreshPanelLiveData");
        AbstractC19074t.m100208f(c1761c03, "startDownloadStickerLiveData");
        AbstractC19074t.m100208f(interfaceC12972v, "isScrolling");
        AbstractC19074t.m100208f(str, "autoPlayStickerPrefix");
        AbstractC19074t.m100208f(c1761c04, "openAIStickerMpLiveData");
        this.f136356r = layoutInflater;
        this.f136357s = c23528a;
        this.f136358t = c1755a0;
        this.f136359u = c1761c0;
        this.f136360v = c1761c02;
        this.f136361w = c1761c03;
        this.f136362x = dVar;
        this.f136363y = i11;
        this.f136364z = interfaceC12972v;
        this.f136339A = z11;
        this.f136340B = str;
        this.f136341C = z12;
        this.f136342D = c1761c04;
        this.f136343E = z13;
        this.f136344F = interfaceC10959a;
        this.f136345G = new ArrayList();
        this.f136346H = new HashMap();
        this.f136347I = new HashMap();
        this.f136348J = new HashMap();
        C1761c0 c1761c05 = new C1761c0();
        this.f136349K = c1761c05;
        C1761c0 c1761c06 = new C1761c0();
        this.f136350L = c1761c06;
        C1761c0 c1761c07 = new C1761c0();
        this.f136351M = c1761c07;
        C1761c0 c1761c08 = new C1761c0();
        this.f136352N = c1761c08;
        C1761c0 c1761c09 = new C1761c0();
        this.f136353O = c1761c09;
        C1761c0 c1761c010 = new C1761c0();
        this.f136354P = c1761c010;
        C1761c0 c1761c011 = new C1761c0();
        this.f136355Q = c1761c011;
        c1755a0.m9256r(c1761c05, new w(new a()));
        c1755a0.m9256r(c1761c08, new w(new b()));
        c1755a0.m9256r(c1761c011, new w(new c()));
        c1755a0.m9256r(c1761c06, new w(new d()));
        c1755a0.m9256r(c1761c09, new w(new e()));
        c1755a0.m9256r(c1761c07, new w(new f()));
        c1755a0.m9256r(c1761c010, new w(new g()));
    }

    /* renamed from: N */
    private final List m146863N(Collection collection) {
        if (collection.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(collection);
        if (this.f136341C) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((C3251l) it.next()).m16519i()) {
                    it.remove();
                }
            }
        }
        if (!this.f136343E) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C25630b m16514d = ((C3251l) it2.next()).m16514d();
                if (m16514d != null && m16514d.m132447y()) {
                    it2.remove();
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public static final void m146864X(C29540n c29540n, View view) {
        AbstractC19074t.m100208f(c29540n, "this$0");
        c29540n.f136342D.mo9221n(C24848g0.f119245a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public static final void m146865Z(C29540n c29540n, ArrayList arrayList) {
        AbstractC19074t.m100208f(c29540n, "this$0");
        AbstractC19074t.m100208f(arrayList, "$result");
        c29540n.f136345G.clear();
        c29540n.f136345G.addAll(arrayList);
        c29540n.m10008p();
    }

    /* renamed from: O */
    public final Map m146866O() {
        return this.f136348J;
    }

    /* renamed from: P */
    public final Map m146867P() {
        return this.f136347I;
    }

    /* renamed from: Q */
    public final Map m146868Q() {
        return this.f136346H;
    }

    /* renamed from: R */
    public final Integer m146869R(int i11) {
        if (i11 >= 0 && i11 < this.f136345G.size()) {
            return Integer.valueOf(((v) this.f136345G.get(i11)).m146933a().m16463e());
        }
        return null;
    }

    /* renamed from: S */
    public final C1755a0 m146870S() {
        return this.f136358t;
    }

    /* renamed from: T */
    public final boolean m146871T(int i11) {
        if (i11 >= 0 && i11 < this.f136345G.size() && ((v) this.f136345G.get(i11)).m146934b() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: U */
    public final boolean m146872U(int i11) {
        if (i11 >= 0 && i11 < this.f136345G.size() && ((v) this.f136345G.get(i11)).m146934b() == 5) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public void mo9990A(q qVar, int i11) {
        s sVar;
        C25630b m16514d;
        int i12;
        String str;
        AbstractC19074t.m100208f(qVar, "holder");
        if (qVar instanceof o) {
            ((o) qVar).m146891j0((v) this.f136345G.get(i11));
            return;
        }
        if (qVar instanceof t) {
            ((t) qVar).m146930j0((v) this.f136345G.get(i11));
            return;
        }
        if (qVar instanceof r) {
            Object obj = this.f136345G.get(i11);
            C2522b c2522b = null;
            if (obj instanceof s) {
                sVar = (s) obj;
            } else {
                sVar = null;
            }
            if (sVar != null && (m16514d = sVar.m146927f().m16514d()) != null && m16514d.m132447y()) {
                int m146926e = sVar.m146926e();
                Integer num = (Integer) this.f136346H.get(Integer.valueOf(sVar.m146933a().f13854b));
                if (num != null) {
                    i12 = num.intValue();
                } else {
                    i12 = 0;
                }
                int i13 = m146926e - i12;
                if (sVar.m146933a().f13854b == -10 && C3229a.f13790a.m16392f().length() > 0) {
                    i13--;
                }
                int i14 = sVar.m146933a().f13854b;
                if (i14 != -10) {
                    if (i14 != -2) {
                        str = "";
                    } else {
                        str = "recent_panel";
                    }
                } else {
                    str = "ai_sticker_panel";
                }
                c2522b = new C2522b(i13, str);
            }
            ((r) qVar).m146925C0(this.f136357s, (v) this.f136345G.get(i11), this.f136364z, this.f136339A, this.f136340B, c2522b);
            return;
        }
        if (qVar instanceof l) {
            ((l) qVar).m146887j0(this.f136357s);
        } else if (qVar instanceof j) {
            ((j) qVar).m146884i0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public q mo9992C(ViewGroup viewGroup, int i11) {
        q oVar;
        AbstractC19074t.m100208f(viewGroup, "parent");
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        if (i11 != 6) {
                            C29948nc m148293c = C29948nc.m148293c(this.f136356r, viewGroup, false);
                            AbstractC19074t.m100207e(m148293c, "inflate(...)");
                            return new r(m148293c, this.f136349K, this.f136352N, this.f136350L, this.f136353O, this.f136351M, this.f136354P, this.f136355Q, this.f136344F);
                        }
                        C30148z4 m148769c = C30148z4.m148769c(this.f136356r, viewGroup, false);
                        AbstractC19074t.m100207e(m148769c, "inflate(...)");
                        m148769c.getRoot().setOnClickListener(new View.OnClickListener() { // from class: x90.l
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                C29540n.m146864X(C29540n.this, view);
                            }
                        });
                        oVar = new j(m148769c);
                    } else {
                        C29761d5 m147845c = C29761d5.m147845c(this.f136356r, viewGroup, false);
                        AbstractC19074t.m100207e(m147845c, "inflate(...)");
                        oVar = new l(m147845c, this.f136342D);
                    }
                } else {
                    C29984pc m148374c = C29984pc.m148374c(this.f136356r, viewGroup, false);
                    AbstractC19074t.m100207e(m148374c, "inflate(...)");
                    oVar = new m(m148374c);
                }
            } else {
                C30020rc m148458c = C30020rc.m148458c(this.f136356r, viewGroup, false);
                AbstractC19074t.m100207e(m148458c, "inflate(...)");
                oVar = new t(m148458c, this.f136361w);
            }
        } else {
            C29966oc m148334c = C29966oc.m148334c(this.f136356r, viewGroup, false);
            AbstractC19074t.m100207e(m148334c, "inflate(...)");
            oVar = new o(m148334c, this.f136363y, this.f136359u);
        }
        return oVar;
    }

    /* renamed from: Y */
    public final void m146875Y(List list, List list2) {
        List m131185M0;
        AbstractC19074t.m100208f(list, "downloadedCategories");
        AbstractC19074t.m100208f(list2, "promotionCategories");
        final ArrayList arrayList = new ArrayList();
        this.f136346H.clear();
        this.f136347I.clear();
        this.f136348J.clear();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        int i11 = 0;
        int i12 = 0;
        while (it.hasNext()) {
            C3245i m72862c = ((AbstractC12964n) it.next()).m72862c();
            this.f136348J.put(Integer.valueOf(m72862c.f13854b), m72862c);
            ArrayList arrayList3 = new ArrayList();
            int i13 = i11 + 1;
            this.f136347I.put(Integer.valueOf(m72862c.f13854b), Integer.valueOf(i11));
            arrayList.add(new p(m72862c));
            int i14 = i12 + 1;
            this.f136346H.put(Integer.valueOf(m72862c.f13854b), Integer.valueOf(i12));
            if (C28644j.m143233Y().m143278K(m72862c.f13854b)) {
                LinkedHashMap m143301f0 = C28644j.m143233Y().m143301f0(m72862c.f13854b);
                if (m143301f0 != null) {
                    if (m72862c.f13854b == -2) {
                        Collection values = m143301f0.values();
                        AbstractC19074t.m100207e(values, "<get-values>(...)");
                        m131185M0 = m146863N(values);
                    } else {
                        Collection values2 = m143301f0.values();
                        AbstractC19074t.m100207e(values2, "<get-values>(...)");
                        m131185M0 = AbstractC25332a0.m131185M0(values2);
                    }
                    if (m131185M0.isEmpty()) {
                        if (m72862c.f13854b == -10) {
                            arrayList3.add(new k(m72862c, i14));
                            i14 = i12 + 2;
                        }
                    } else {
                        if (m72862c.f13854b == -10 && C3229a.f13790a.m16392f().length() > 0) {
                            arrayList3.add(new i(m72862c, i14));
                            i14 = i12 + 2;
                        }
                        Iterator it2 = m131185M0.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(new s(m72862c, (C3251l) it2.next(), i14));
                            i14++;
                        }
                    }
                }
            } else {
                if (m72862c.f13868p == 0) {
                    if (m72862c.f13854b == -10) {
                        arrayList3.add(new k(m72862c, i14));
                        i14 = i12 + 2;
                    }
                } else {
                    if (m72862c.f13854b == -10 && C3229a.f13790a.m16392f().length() > 0) {
                        arrayList3.add(new i(m72862c, i14));
                        i14 = i12 + 2;
                    }
                    int i15 = m72862c.f13868p;
                    int i16 = 0;
                    while (i16 < i15) {
                        arrayList3.add(new n(m72862c, i14));
                        i16++;
                        i14++;
                    }
                }
                int i17 = m72862c.f13875w;
                if (i17 < 3) {
                    m72862c.f13875w = i17 + 1;
                    arrayList2.add(Integer.valueOf(m72862c.f13854b));
                }
            }
            i12 = i14;
            arrayList.addAll(arrayList3);
            i11 = i13;
        }
        C28644j.m143233Y().m143300e0(arrayList2, this, this);
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            C3245i m72862c2 = ((AbstractC12964n) it3.next()).m72862c();
            this.f136348J.put(Integer.valueOf(m72862c2.f13854b), m72862c2);
            ArrayList arrayList5 = new ArrayList();
            int i18 = i11 + 1;
            this.f136347I.put(Integer.valueOf(m72862c2.f13854b), Integer.valueOf(i11));
            arrayList.add(new u(m72862c2));
            int i19 = i12 + 1;
            this.f136346H.put(Integer.valueOf(m72862c2.f13854b), Integer.valueOf(i12));
            if (C28644j.m143233Y().m143280L(m72862c2.f13854b)) {
                ArrayList m143304h0 = C28644j.m143233Y().m143304h0(m72862c2.f13854b);
                if (m143304h0 != null) {
                    Iterator it4 = m143304h0.iterator();
                    while (it4.hasNext()) {
                        C3251l c3251l = (C3251l) it4.next();
                        AbstractC19074t.m100205c(c3251l);
                        arrayList5.add(new s(m72862c2, c3251l, i19));
                        i19++;
                    }
                }
            } else {
                int i21 = m72862c2.f13868p;
                int i22 = 0;
                while (i22 < i21) {
                    arrayList5.add(new n(m72862c2, i19));
                    i22++;
                    i19++;
                }
                int i23 = m72862c2.f13875w;
                if (i23 < 3) {
                    m72862c2.f13875w = i23 + 1;
                    arrayList4.add(m72862c2);
                }
            }
            i12 = i19;
            arrayList.addAll(arrayList5);
            i11 = i18;
        }
        C28644j.m143233Y().m143303g0(arrayList4, this);
        AbstractC19444a.m101695c(new Runnable() { // from class: x90.m
            @Override // java.lang.Runnable
            public final void run() {
                C29540n.m146865Z(C29540n.this, arrayList);
            }
        });
    }

    /* renamed from: a */
    public final boolean m146876a(int i11) {
        if (i11 >= 0 && i11 < this.f136345G.size() && (((v) this.f136345G.get(i11)).m146934b() == 0 || ((v) this.f136345G.get(i11)).m146934b() == 1)) {
            return true;
        }
        return false;
    }

    @Override // p588vw.C28644j.o
    /* renamed from: f1 */
    public void mo16628f1(List list, List list2) {
        AbstractC19074t.m100208f(list, "cateIds");
        AbstractC19074t.m100208f(list2, "listResults");
        this.f136360v.mo9221n(C24848g0.f119245a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f136345G.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        return ((v) this.f136345G.get(i11)).m146935c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        return ((v) this.f136345G.get(i11)).m146934b();
    }

    @Override // p588vw.C28644j.p
    /* renamed from: n0 */
    public void mo36242n0(List list) {
        AbstractC19074t.m100208f(list, "listResults");
        this.f136360v.mo9221n(C24848g0.f119245a);
    }
}
