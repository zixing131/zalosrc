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
import android.widget.ProgressBar;
import androidx.lifecycle.C1755a0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.RecyclerView;
import c30.C3245i;
import c30.C3251l;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.p077ui.StickerView;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.InterfaceC12972v;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.InterfaceC19066n;
import gg0.AbstractC19444a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p134el.C18468g;
import p134el.C18469h;
import p134el.C18471j;
import p134el.C18472k;
import p134el.C18475n;
import p134el.C18476o;
import p134el.C18477p;
import p227i3.C20218v;
import p354n3.C23528a;
import p379o3.AbstractC24006q;
import p379o3.C23995f;
import p379o3.C23999j;
import p471r3.C25630b;
import p485rj.C25809a;
import p485rj.C25811c;
import p588vw.C28644j;
import p649xl.C29948nc;
import p649xl.C29984pc;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import qm0.AbstractC25332a0;
import qm0.AbstractC25377w0;
import vg.C28020b3;
import x90.C29517b;

/* renamed from: x90.b */
/* loaded from: classes6.dex */
public final class C29517b extends RecyclerView.AbstractC1880g implements C28644j.o {
    public static final h Companion = new h(null);

    /* renamed from: A */
    private final C1761c0 f136184A;

    /* renamed from: B */
    private final C1761c0 f136185B;

    /* renamed from: C */
    private final C1761c0 f136186C;

    /* renamed from: D */
    private final C1761c0 f136187D;

    /* renamed from: E */
    private final C1761c0 f136188E;

    /* renamed from: r */
    private final LayoutInflater f136189r;

    /* renamed from: s */
    private final C23528a f136190s;

    /* renamed from: t */
    private final C1755a0 f136191t;

    /* renamed from: u */
    private final InterfaceC12972v f136192u;

    /* renamed from: v */
    private final List f136193v;

    /* renamed from: w */
    private C3245i f136194w;

    /* renamed from: x */
    private int f136195x;

    /* renamed from: y */
    private final C1761c0 f136196y;

    /* renamed from: z */
    private final C1761c0 f136197z;

    /* renamed from: x90.b$a */
    /* loaded from: classes6.dex */
    static final class a extends AbstractC19075u implements InterfaceC18505l {
        a() {
            super(1);
        }

        /* renamed from: a */
        public final void m146743a(C18475n c18475n) {
            C29517b.this.m146738N().mo9224q(c18475n);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m146743a((C18475n) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: x90.b$b */
    /* loaded from: classes6.dex */
    static final class b extends AbstractC19075u implements InterfaceC18505l {
        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m146744a(C18476o c18476o) {
            C29517b.this.m146738N().mo9224q(c18476o);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m146744a((C18476o) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: x90.b$c */
    /* loaded from: classes6.dex */
    static final class c extends AbstractC19075u implements InterfaceC18505l {
        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m146745a(C18477p c18477p) {
            C29517b.this.m146738N().mo9224q(c18477p);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m146745a((C18477p) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: x90.b$d */
    /* loaded from: classes6.dex */
    static final class d extends AbstractC19075u implements InterfaceC18505l {
        d() {
            super(1);
        }

        /* renamed from: a */
        public final void m146746a(C18468g c18468g) {
            C29517b.this.m146738N().mo9224q(c18468g);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m146746a((C18468g) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: x90.b$e */
    /* loaded from: classes6.dex */
    static final class e extends AbstractC19075u implements InterfaceC18505l {
        e() {
            super(1);
        }

        /* renamed from: a */
        public final void m146747a(C18469h c18469h) {
            C29517b.this.m146738N().mo9224q(c18469h);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m146747a((C18469h) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: x90.b$f */
    /* loaded from: classes6.dex */
    static final class f extends AbstractC19075u implements InterfaceC18505l {
        f() {
            super(1);
        }

        /* renamed from: a */
        public final void m146748a(C18471j c18471j) {
            C29517b.this.m146738N().mo9224q(c18471j);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m146748a((C18471j) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: x90.b$g */
    /* loaded from: classes6.dex */
    static final class g extends AbstractC19075u implements InterfaceC18505l {
        g() {
            super(1);
        }

        /* renamed from: a */
        public final void m146749a(C18472k c18472k) {
            C29517b.this.m146738N().mo9224q(c18472k);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m146749a((C18472k) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: x90.b$h */
    /* loaded from: classes6.dex */
    public static final class h {
        private h() {
        }

        public /* synthetic */ h(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: x90.b$i */
    /* loaded from: classes6.dex */
    public static final class i extends k {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public i(C29984pc c29984pc) {
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

    /* renamed from: x90.b$j */
    /* loaded from: classes6.dex */
    private static final class j extends l {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(C3245i c3245i, int i11) {
            super(1, c3245i);
            AbstractC19074t.m100208f(c3245i, "stickerCategory");
            m146753d(("FAKE_VIEW_ID" + i11).hashCode());
        }
    }

    /* renamed from: x90.b$k */
    /* loaded from: classes6.dex */
    public static class k extends RecyclerView.AbstractC1876c0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
        }
    }

    /* renamed from: x90.b$l */
    /* loaded from: classes6.dex */
    public static class l {

        /* renamed from: a */
        private final C3245i f136205a;

        /* renamed from: b */
        private int f136206b;

        /* renamed from: c */
        private long f136207c;

        public l(int i11, C3245i c3245i) {
            AbstractC19074t.m100208f(c3245i, "stickerCategory");
            this.f136205a = c3245i;
            this.f136206b = i11;
        }

        /* renamed from: a */
        public final C3245i m146750a() {
            return this.f136205a;
        }

        /* renamed from: b */
        public final int m146751b() {
            return this.f136206b;
        }

        /* renamed from: c */
        public final long m146752c() {
            return this.f136207c;
        }

        /* renamed from: d */
        protected final void m146753d(long j11) {
            this.f136207c = j11;
        }
    }

    /* renamed from: x90.b$m */
    /* loaded from: classes6.dex */
    public static final class m extends k {

        /* renamed from: I */
        private final C3245i f136208I;

        /* renamed from: J */
        private final C29948nc f136209J;

        /* renamed from: K */
        private final C1761c0 f136210K;

        /* renamed from: L */
        private final C1761c0 f136211L;

        /* renamed from: M */
        private final C1761c0 f136212M;

        /* renamed from: N */
        private final C1761c0 f136213N;

        /* renamed from: O */
        private final C1761c0 f136214O;

        /* renamed from: P */
        private final C1761c0 f136215P;

        /* renamed from: Q */
        private final C1761c0 f136216Q;

        /* renamed from: R */
        private n f136217R;

        /* renamed from: S */
        private final C3977j f136218S;

        /* renamed from: T */
        private final View.OnTouchListener f136219T;

        /* renamed from: x90.b$m$a */
        /* loaded from: classes6.dex */
        public static final class a extends C23999j {

            /* renamed from: m1 */
            final /* synthetic */ String f136221m1;

            /* renamed from: n1 */
            final /* synthetic */ C3977j f136222n1;

            /* renamed from: o1 */
            final /* synthetic */ StickerView f136223o1;

            a(String str, C3977j c3977j, StickerView stickerView) {
                this.f136221m1 = str;
                this.f136222n1 = c3977j;
                this.f136223o1 = stickerView;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // p379o3.C23999j
            /* renamed from: O1 */
            public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
                AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                AbstractC19074t.m100208f(interfaceC3968a, "iv");
                AbstractC19074t.m100208f(c3979l, "bm");
                AbstractC19074t.m100208f(c23995f, "status");
                n nVar = m.this.f136217R;
                if (nVar != null && nVar.m146786e().m16517g() && AbstractC19074t.m100204b(nVar.m146786e().m16515e(), this.f136221m1)) {
                    if (c23995f.m125657h() == 200) {
                        this.f136222n1.setImageInfo(c3979l, false);
                        if (c3979l.m18839c() != null) {
                            this.f136223o1.setImageBitmap(c3979l.m18839c());
                        }
                    } else {
                        this.f136222n1.setImageInfo(c3979l, false);
                    }
                    this.f136223o1.invalidate();
                }
            }
        }

        /* renamed from: x90.b$m$b */
        /* loaded from: classes6.dex */
        public static final class b extends C23999j {

            /* renamed from: m1 */
            final /* synthetic */ String f136225m1;

            /* renamed from: n1 */
            final /* synthetic */ C3977j f136226n1;

            /* renamed from: o1 */
            final /* synthetic */ StickerView f136227o1;

            b(String str, C3977j c3977j, StickerView stickerView) {
                this.f136225m1 = str;
                this.f136226n1 = c3977j;
                this.f136227o1 = stickerView;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // p379o3.C23999j
            /* renamed from: O1 */
            public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
                AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                AbstractC19074t.m100208f(interfaceC3968a, "iv");
                AbstractC19074t.m100208f(c3979l, "bm");
                AbstractC19074t.m100208f(c23995f, "status");
                n nVar = m.this.f136217R;
                if (nVar != null && nVar.m146786e().m16518h() && AbstractC19074t.m100204b(nVar.m146786e().m16515e(), this.f136225m1)) {
                    if (c23995f.m125657h() == 200) {
                        this.f136226n1.setImageInfo(c3979l, false);
                        if (c3979l.m18839c() != null) {
                            this.f136227o1.setImageBitmap(c3979l.m18839c());
                        }
                    } else {
                        this.f136226n1.setImageInfo(c3979l, false);
                    }
                    this.f136227o1.invalidate();
                }
            }
        }

        /* renamed from: x90.b$m$c */
        /* loaded from: classes6.dex */
        public static final class c extends C28020b3.b {

            /* renamed from: b */
            final /* synthetic */ InterfaceC3968a f136229b;

            c(InterfaceC3968a interfaceC3968a) {
                this.f136229b = interfaceC3968a;
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
                n nVar = m.this.f136217R;
                if (nVar != null && nVar.m146786e().m16519i() && (m16514d = nVar.m146786e().m16514d()) != null && m16514d.m132429g() == c25630b.m132429g()) {
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
                n nVar = m.this.f136217R;
                if (nVar != null && nVar.m146786e().m16519i() && (m16514d = nVar.m146786e().m16514d()) != null && m16514d.m132429g() == c25630b.m132429g()) {
                    super.mo35607b(str, c25630b, this.f136229b, c3979l, c23995f);
                    C28020b3.f130648a.m141179B(c25630b, this.f136229b, c3979l, true, "", false);
                }
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public m(C3245i c3245i, C29948nc c29948nc, C1761c0 c1761c0, C1761c0 c1761c02, C1761c0 c1761c03, C1761c0 c1761c04, C1761c0 c1761c05, C1761c0 c1761c06, C1761c0 c1761c07) {
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
            this.f136208I = c3245i;
            this.f136209J = c29948nc;
            this.f136210K = c1761c0;
            this.f136211L = c1761c02;
            this.f136212M = c1761c03;
            this.f136213N = c1761c04;
            this.f136214O = c1761c05;
            this.f136215P = c1761c06;
            this.f136216Q = c1761c07;
            Context context = c29948nc.getRoot().getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            this.f136218S = new C3977j(context);
            this.f136219T = new View.OnTouchListener() { // from class: x90.g
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean m146767N0;
                    m146767N0 = C29517b.m.m146767N0(C29517b.m.this, view, motionEvent);
                    return m146767N0;
                }
            };
            c29948nc.f138809r.setVisibility(8);
        }

        /* renamed from: A0 */
        private final void m146754A0(C23528a c23528a, C3977j c3977j, n nVar, InterfaceC12972v interfaceC12972v) {
            StickerView stickerView = this.f136209J.f138810s;
            C25630b m143290W = C28644j.m143233Y().m143290W(nVar.m146786e().m16512b());
            AbstractC19074t.m100207e(m143290W, "getAnimationInfo(...)");
            if (m143290W.m132448z()) {
                if (((Boolean) interfaceC12972v.get()).booleanValue() && !C28020b3.f130648a.m141181D(m143290W)) {
                    c3977j.setImageInfo(null, false);
                    stickerView.setImageDrawable(C23278z2.m120091Q0().f116261b);
                } else {
                    AbstractC19074t.m100205c(stickerView);
                    m146761H0(stickerView, m143290W);
                }
            } else if (AbstractC24006q.m125853Z1(m143290W.m132446x())) {
                C3979l m125837F1 = AbstractC24006q.m125837F1(m143290W.m132446x());
                if (m125837F1 != null) {
                    c3977j.setImageInfo(m125837F1, false);
                    stickerView.setImageBitmap(m125837F1.m18839c());
                } else {
                    c3977j.setImageInfo(null, false);
                    stickerView.setImageDrawable(C23278z2.m120091Q0().f116261b);
                }
            } else if (!((Boolean) interfaceC12972v.get()).booleanValue()) {
                AbstractC19074t.m100205c(stickerView);
                ProgressBar progressBar = this.f136209J.f138808q;
                AbstractC19074t.m100207e(progressBar, "progressId");
                m146760G0(c23528a, m143290W, c3977j, stickerView, progressBar);
            } else {
                c3977j.setImageInfo(null, false);
                stickerView.setImageDrawable(C23278z2.m120091Q0().f116261b);
            }
            stickerView.setEmoticon(nVar.m146786e().m16512b());
            stickerView.setOnClickListener(new View.OnClickListener() { // from class: x90.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C29517b.m.m146756C0(C29517b.m.this, view);
                }
            });
            stickerView.setOnLongClickListener(new View.OnLongClickListener() { // from class: x90.i
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean m146755B0;
                    m146755B0 = C29517b.m.m146755B0(C29517b.m.this, view);
                    return m146755B0;
                }
            });
            stickerView.setOnTouchListener(this.f136219T);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: B0 */
        public static final boolean m146755B0(m mVar, View view) {
            AbstractC19074t.m100208f(mVar, "this$0");
            AbstractC19074t.m100205c(view);
            return mVar.m146765L0(view);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: C0 */
        public static final void m146756C0(m mVar, View view) {
            AbstractC19074t.m100208f(mVar, "this$0");
            AbstractC19074t.m100205c(view);
            mVar.m146764K0(view);
        }

        /* renamed from: D0 */
        private final boolean m146757D0(n nVar, n nVar2) {
            String str;
            String str2;
            Integer num;
            if (nVar2 == null || !AbstractC19074t.m100204b(nVar2, nVar)) {
                return true;
            }
            if (nVar2.m146786e().m16519i() && !nVar.m146786e().m16519i()) {
                return true;
            }
            if (nVar2.m146786e().m16517g() && !nVar.m146786e().m16517g()) {
                return true;
            }
            if (nVar2.m146786e().m16518h() && !nVar.m146786e().m16518h()) {
                return true;
            }
            Object obj = null;
            if (nVar2.m146786e().m16519i()) {
                C25630b m16514d = nVar2.m146786e().m16514d();
                if (m16514d != null) {
                    num = Integer.valueOf(m16514d.m132429g());
                } else {
                    num = null;
                }
                C25630b m16514d2 = nVar.m146786e().m16514d();
                if (m16514d2 != null) {
                    obj = Integer.valueOf(m16514d2.m132429g());
                }
                if (!AbstractC19074t.m100204b(num, obj)) {
                    return true;
                }
                return false;
            }
            if (nVar2.m146786e().m16517g()) {
                C25809a m16511a = nVar2.m146786e().m16511a();
                if (m16511a != null) {
                    str2 = m16511a.m133081c();
                } else {
                    str2 = null;
                }
                C25809a m16511a2 = nVar.m146786e().m16511a();
                if (m16511a2 != null) {
                    obj = m16511a2.m133081c();
                }
                if (!AbstractC19074t.m100204b(str2, obj)) {
                    return true;
                }
                return false;
            }
            if (nVar2.m146786e().m16518h()) {
                C25811c m16513c = nVar2.m146786e().m16513c();
                if (m16513c != null) {
                    str = m16513c.m133092d();
                } else {
                    str = null;
                }
                C25811c m16513c2 = nVar.m146786e().m16513c();
                if (m16513c2 != null) {
                    obj = m16513c2.m133092d();
                }
                if (!AbstractC19074t.m100204b(str, obj)) {
                    return true;
                }
                return false;
            }
            return false;
        }

        /* renamed from: E0 */
        private final void m146758E0(C23528a c23528a, C3977j c3977j, StickerView stickerView, String str) {
            ((C23528a) c23528a.m123612r(c3977j)).m123579C(str, C23278z2.m120123e0(), new a(str, c3977j, stickerView));
        }

        /* renamed from: F0 */
        private final void m146759F0(C23528a c23528a, C3977j c3977j, StickerView stickerView, String str) {
            ((C23528a) c23528a.m123612r(c3977j)).m123579C(str, C23278z2.m120091Q0(), new b(str, c3977j, stickerView));
        }

        /* renamed from: G0 */
        private final void m146760G0(C23528a c23528a, C25630b c25630b, C3977j c3977j, InterfaceC3968a interfaceC3968a, ProgressBar progressBar) {
            if (!c25630b.m132448z()) {
                C28020b3.f130648a.m141182F(c3977j, c23528a, c25630b, progressBar, true, new c(interfaceC3968a));
                return;
            }
            throw new RuntimeException("Not load sticker DEFAULT by Aquery");
        }

        /* renamed from: H0 */
        private final void m146761H0(final StickerView stickerView, final C25630b c25630b) {
            Bitmap m141205v = C28020b3.f130648a.m141205v(c25630b, false);
            if (m141205v != null) {
                stickerView.setImageBitmap(m141205v);
            } else {
                AbstractC0840r.m2251h(new Runnable() { // from class: x90.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        C29517b.m.m146762I0(C29517b.m.this, c25630b, stickerView);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: I0 */
        public static final void m146762I0(final m mVar, final C25630b c25630b, final StickerView stickerView) {
            AbstractC19074t.m100208f(mVar, "this$0");
            AbstractC19074t.m100208f(c25630b, "$stickerInfo");
            AbstractC19074t.m100208f(stickerView, "$imageView");
            AbstractC19444a.m101695c(new Runnable() { // from class: x90.k
                @Override // java.lang.Runnable
                public final void run() {
                    C29517b.m.m146763J0(C29517b.m.this, c25630b, stickerView);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: J0 */
        public static final void m146763J0(m mVar, C25630b c25630b, StickerView stickerView) {
            C25630b m16514d;
            AbstractC19074t.m100208f(mVar, "this$0");
            AbstractC19074t.m100208f(c25630b, "$stickerInfo");
            AbstractC19074t.m100208f(stickerView, "$imageView");
            n nVar = mVar.f136217R;
            if (nVar != null && nVar.m146786e().m16519i() && (m16514d = nVar.m146786e().m16514d()) != null && m16514d.m132429g() == c25630b.m132429g()) {
                stickerView.setImageBitmap(C28020b3.f130648a.m141206w(c25630b));
            }
        }

        /* renamed from: K0 */
        private final void m146764K0(View view) {
            C3245i c3245i;
            if ((view instanceof StickerView) && (c3245i = this.f136208I) != null) {
                this.f136210K.mo9224q(new C18475n((StickerView) view, c3245i.f13854b));
            }
        }

        /* renamed from: L0 */
        private final boolean m146765L0(View view) {
            int i11;
            C3245i c3245i = this.f136208I;
            if (c3245i != null && (view instanceof StickerView)) {
                if (c3245i.f13854b == -2) {
                    i11 = 7;
                } else if (C28644j.m143233Y().m143312x0(c3245i.f13854b)) {
                    i11 = 5;
                } else {
                    i11 = 6;
                }
                this.f136211L.mo9224q(new C18476o((StickerView) view, c3245i.f13854b, i11));
                return true;
            }
            return true;
        }

        /* renamed from: M0 */
        private final boolean m146766M0(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if ((action == 1 || action == 3) && (view instanceof StickerView)) {
                this.f136216Q.mo9224q(new C18477p(((StickerView) view).getEmoticon()));
                return false;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: N0 */
        public static final boolean m146767N0(m mVar, View view, MotionEvent motionEvent) {
            AbstractC19074t.m100208f(mVar, "this$0");
            AbstractC19074t.m100208f(view, C20218v.f100059b);
            AbstractC19074t.m100208f(motionEvent, "event");
            return mVar.m146766M0(view, motionEvent);
        }

        /* renamed from: t0 */
        private final void m146778t0(C23528a c23528a, C3977j c3977j, final n nVar, InterfaceC12972v interfaceC12972v) {
            String m16515e = nVar.m146786e().m16515e();
            StickerView stickerView = this.f136209J.f138810s;
            stickerView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            if (C23999j.m125696L2(m16515e, C23278z2.m120123e0())) {
                C3979l m125676A2 = C23999j.m125676A2(m16515e, C23278z2.m120123e0().f116260a, C23278z2.m120123e0().f116266g);
                if (m125676A2 != null) {
                    c3977j.setImageInfo(m125676A2, false);
                    stickerView.setImageBitmap(m125676A2.m18839c());
                } else {
                    c3977j.setImageInfo(null, false);
                    stickerView.setImageDrawable(C23278z2.m120123e0().f116261b);
                }
            } else if (!((Boolean) interfaceC12972v.get()).booleanValue()) {
                AbstractC19074t.m100205c(stickerView);
                m146758E0(c23528a, c3977j, stickerView, m16515e);
            } else {
                c3977j.setImageInfo(null, false);
                stickerView.setImageDrawable(C23278z2.m120123e0().f116261b);
            }
            stickerView.setOnClickListener(new View.OnClickListener() { // from class: x90.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C29517b.m.m146779u0(C29517b.m.this, nVar, view);
                }
            });
            stickerView.setOnLongClickListener(new View.OnLongClickListener() { // from class: x90.d
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean m146780v0;
                    m146780v0 = C29517b.m.m146780v0(C29517b.m.this, nVar, view);
                    return m146780v0;
                }
            });
            stickerView.setOnTouchListener(this.f136219T);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: u0 */
        public static final void m146779u0(m mVar, n nVar, View view) {
            AbstractC19074t.m100208f(mVar, "this$0");
            AbstractC19074t.m100208f(nVar, "$itemSticker");
            mVar.f136212M.mo9224q(new C18468g(nVar.m146786e()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: v0 */
        public static final boolean m146780v0(m mVar, n nVar, View view) {
            AbstractC19074t.m100208f(mVar, "this$0");
            AbstractC19074t.m100208f(nVar, "$itemSticker");
            mVar.f136213N.mo9224q(new C18469h(nVar.m146786e(), 7));
            return true;
        }

        /* renamed from: w0 */
        private final void m146781w0() {
            StickerView stickerView = this.f136209J.f138810s;
            stickerView.setOnClickListener(null);
            stickerView.setOnLongClickListener(null);
            stickerView.setOnTouchListener(null);
        }

        /* renamed from: x0 */
        private final void m146782x0(C23528a c23528a, C3977j c3977j, final n nVar, InterfaceC12972v interfaceC12972v) {
            String m16515e = nVar.m146786e().m16515e();
            StickerView stickerView = this.f136209J.f138810s;
            stickerView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            if (C23999j.m125696L2(m16515e, C23278z2.m120091Q0())) {
                C3979l m125676A2 = C23999j.m125676A2(m16515e, C23278z2.m120091Q0().f116260a, C23278z2.m120091Q0().f116266g);
                if (m125676A2 != null) {
                    c3977j.setImageInfo(m125676A2, false);
                    stickerView.setImageBitmap(m125676A2.m18839c());
                } else {
                    c3977j.setImageInfo(null, false);
                    stickerView.setImageDrawable(C23278z2.m120091Q0().f116261b);
                }
            } else if (!((Boolean) interfaceC12972v.get()).booleanValue()) {
                AbstractC19074t.m100205c(stickerView);
                m146759F0(c23528a, c3977j, stickerView, m16515e);
            } else {
                c3977j.setImageInfo(null, false);
                stickerView.setImageDrawable(C23278z2.m120091Q0().f116261b);
            }
            stickerView.setOnClickListener(new View.OnClickListener() { // from class: x90.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C29517b.m.m146783y0(C29517b.m.this, nVar, view);
                }
            });
            stickerView.setOnLongClickListener(new View.OnLongClickListener() { // from class: x90.f
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean m146784z0;
                    m146784z0 = C29517b.m.m146784z0(C29517b.m.this, nVar, view);
                    return m146784z0;
                }
            });
            stickerView.setOnTouchListener(this.f136219T);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: y0 */
        public static final void m146783y0(m mVar, n nVar, View view) {
            AbstractC19074t.m100208f(mVar, "this$0");
            AbstractC19074t.m100208f(nVar, "$itemSticker");
            mVar.f136214O.mo9224q(new C18471j(nVar.m146786e(), null, 2, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: z0 */
        public static final boolean m146784z0(m mVar, n nVar, View view) {
            AbstractC19074t.m100208f(mVar, "this$0");
            AbstractC19074t.m100208f(nVar, "$itemSticker");
            mVar.f136215P.mo9224q(new C18472k(nVar.m146786e(), 7));
            return true;
        }

        /* renamed from: s0 */
        public final void m146785s0(C23528a c23528a, l lVar, InterfaceC12972v interfaceC12972v) {
            AbstractC19074t.m100208f(c23528a, "aQuery");
            AbstractC19074t.m100208f(lVar, "newItem");
            AbstractC19074t.m100208f(interfaceC12972v, "isScrolling");
            if (!(lVar instanceof n)) {
                AbstractC23350e.m122774d("CameraStickersAdapter", "not valid StickerRowItem");
                return;
            }
            n nVar = (n) lVar;
            if (!m146757D0(nVar, this.f136217R)) {
                return;
            }
            this.f136217R = nVar;
            this.f136209J.f138808q.setVisibility(8);
            this.f136209J.f138810s.m56980l();
            if (nVar.m146786e().m16519i()) {
                m146754A0(c23528a, this.f136218S, nVar, interfaceC12972v);
                return;
            }
            if (nVar.m146786e().m16517g()) {
                m146778t0(c23528a, this.f136218S, nVar, interfaceC12972v);
            } else if (nVar.m146786e().m16518h()) {
                m146782x0(c23528a, this.f136218S, nVar, interfaceC12972v);
            } else {
                m146781w0();
            }
        }
    }

    /* renamed from: x90.b$n */
    /* loaded from: classes6.dex */
    public static final class n extends l {

        /* renamed from: d */
        private final C3251l f136230d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(C3245i c3245i, C3251l c3251l, int i11) {
            super(0, c3245i);
            C25811c m16513c;
            String m133092d;
            C25809a m16511a;
            AbstractC19074t.m100208f(c3245i, "curCate");
            AbstractC19074t.m100208f(c3251l, "stickerGifInfo");
            this.f136230d = c3251l;
            if (c3251l.m16519i()) {
                int i12 = m146750a().f13854b;
                C25630b m16514d = c3251l.m16514d();
                int m132429g = m16514d != null ? m16514d.m132429g() : 0;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i12);
                sb2.append(m132429g);
                m133092d = sb2.toString();
            } else if (!c3251l.m16517g() ? !c3251l.m16518h() || (m16513c = c3251l.m16513c()) == null || (m133092d = m16513c.m133092d()) == null : (m16511a = c3251l.m16511a()) == null || (m133092d = m16511a.m133081c()) == null) {
                m133092d = "";
            }
            m133092d = m133092d.length() == 0 ? "NO_INFO_VIEW_ID" : m133092d;
            StringBuilder sb3 = new StringBuilder();
            sb3.append((Object) m133092d);
            sb3.append(i11);
            m146753d(sb3.toString().hashCode());
        }

        /* renamed from: e */
        public final C3251l m146786e() {
            return this.f136230d;
        }
    }

    /* renamed from: x90.b$o */
    /* loaded from: classes6.dex */
    static final class o implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f136231p;

        o(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f136231p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f136231p;
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
            this.f136231p.mo205i9(obj);
        }
    }

    public C29517b(LayoutInflater layoutInflater, C23528a c23528a, C1755a0 c1755a0, InterfaceC12972v interfaceC12972v) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC19074t.m100208f(c23528a, "aQuery");
        AbstractC19074t.m100208f(c1755a0, "viewActionLiveData");
        AbstractC19074t.m100208f(interfaceC12972v, "isScrolling");
        this.f136189r = layoutInflater;
        this.f136190s = c23528a;
        this.f136191t = c1755a0;
        this.f136192u = interfaceC12972v;
        this.f136193v = new ArrayList();
        this.f136195x = -1;
        C1761c0 c1761c0 = new C1761c0();
        this.f136196y = c1761c0;
        C1761c0 c1761c02 = new C1761c0();
        this.f136197z = c1761c02;
        C1761c0 c1761c03 = new C1761c0();
        this.f136184A = c1761c03;
        C1761c0 c1761c04 = new C1761c0();
        this.f136185B = c1761c04;
        C1761c0 c1761c05 = new C1761c0();
        this.f136186C = c1761c05;
        C1761c0 c1761c06 = new C1761c0();
        this.f136187D = c1761c06;
        C1761c0 c1761c07 = new C1761c0();
        this.f136188E = c1761c07;
        c1755a0.m9256r(c1761c0, new o(new a()));
        c1755a0.m9256r(c1761c04, new o(new b()));
        c1755a0.m9256r(c1761c07, new o(new c()));
        c1755a0.m9256r(c1761c02, new o(new d()));
        c1755a0.m9256r(c1761c05, new o(new e()));
        c1755a0.m9256r(c1761c03, new o(new f()));
        c1755a0.m9256r(c1761c06, new o(new g()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public static final void m146736Q(int i11, C29517b c29517b, ArrayList arrayList) {
        AbstractC19074t.m100208f(c29517b, "this$0");
        AbstractC19074t.m100208f(arrayList, "$result");
        C3245i c3245i = c29517b.f136194w;
        if (c3245i != null && i11 == c3245i.m16463e()) {
            c29517b.f136193v.clear();
            c29517b.f136193v.addAll(arrayList);
            c29517b.m10008p();
        }
    }

    /* renamed from: M */
    public final Integer m146737M() {
        C3245i c3245i = this.f136194w;
        if (c3245i != null) {
            return Integer.valueOf(c3245i.m16463e());
        }
        return null;
    }

    /* renamed from: N */
    public final C1755a0 m146738N() {
        return this.f136191t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo9990A(k kVar, int i11) {
        AbstractC19074t.m100208f(kVar, "holder");
        if (kVar instanceof m) {
            ((m) kVar).m146785s0(this.f136190s, (l) this.f136193v.get(i11), this.f136192u);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public k mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        if (i11 == 1) {
            C29984pc m148374c = C29984pc.m148374c(this.f136189r, viewGroup, false);
            AbstractC19074t.m100207e(m148374c, "inflate(...)");
            return new i(m148374c);
        }
        C29948nc m148293c = C29948nc.m148293c(this.f136189r, viewGroup, false);
        AbstractC19074t.m100207e(m148293c, "inflate(...)");
        return new m(this.f136194w, m148293c, this.f136196y, this.f136185B, this.f136197z, this.f136186C, this.f136184A, this.f136187D, this.f136188E);
    }

    /* renamed from: R */
    public final void m146741R(C3245i c3245i) {
        Set m131538d;
        List<C3251l> m131185M0;
        AbstractC19074t.m100208f(c3245i, "stickerCategory");
        C3245i c3245i2 = this.f136194w;
        if (c3245i2 != null && c3245i.m16463e() == c3245i2.m16463e() && C28644j.m143233Y().m143278K(c3245i.f13854b)) {
            return;
        }
        this.f136194w = c3245i;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        if (C28644j.m143233Y().m143278K(c3245i.f13854b)) {
            LinkedHashMap m143301f0 = C28644j.m143233Y().m143301f0(c3245i.f13854b);
            if (m143301f0 != null) {
                Collection values = m143301f0.values();
                AbstractC19074t.m100207e(values, "<get-values>(...)");
                m131185M0 = AbstractC25332a0.m131185M0(values);
                for (C3251l c3251l : m131185M0) {
                    AbstractC19074t.m100205c(c3251l);
                    arrayList.add(new n(c3245i, c3251l, i11));
                    i11++;
                }
            }
        } else {
            int i12 = c3245i.f13868p;
            int i13 = 0;
            while (i11 < i12) {
                arrayList.add(new j(c3245i, i13));
                i11++;
                i13++;
            }
            C28644j m143233Y = C28644j.m143233Y();
            m131538d = AbstractC25377w0.m131538d(Integer.valueOf(c3245i.m16463e()));
            m143233Y.m143300e0(new ArrayList(m131538d), this, this);
        }
        this.f136193v.clear();
        this.f136193v.addAll(arrayList);
        m10008p();
    }

    /* renamed from: S */
    public final void m146742S(int i11) {
        this.f136195x = i11;
    }

    @Override // p588vw.C28644j.o
    /* renamed from: f1 */
    public void mo16628f1(List list, List list2) {
        List<C3251l> m131185M0;
        AbstractC19074t.m100208f(list, "cateIds");
        AbstractC19074t.m100208f(list2, "listResults");
        C3245i c3245i = this.f136194w;
        int i11 = 0;
        final int intValue = ((Number) list.get(0)).intValue();
        if (c3245i != null && c3245i.m16463e() == intValue) {
            Collection values = ((LinkedHashMap) list2.get(0)).values();
            AbstractC19074t.m100207e(values, "<get-values>(...)");
            m131185M0 = AbstractC25332a0.m131185M0(values);
            final ArrayList arrayList = new ArrayList();
            for (C3251l c3251l : m131185M0) {
                AbstractC19074t.m100205c(c3251l);
                arrayList.add(new n(c3245i, c3251l, i11));
                i11++;
            }
            AbstractC19444a.m101695c(new Runnable() { // from class: x90.a
                @Override // java.lang.Runnable
                public final void run() {
                    C29517b.m146736Q(intValue, this, arrayList);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f136193v.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        return ((l) this.f136193v.get(i11)).m146752c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        return ((l) this.f136193v.get(i11)).m146751b();
    }
}
