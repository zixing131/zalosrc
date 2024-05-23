package com.zing.zalo.p077ui.mycloud.base;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.TranslateAnimation;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b90.C2665b;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.custom.AbstractC11859g;
import com.zing.zalo.p077ui.custom.PhotoToggleButton;
import com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView;
import com.zing.zalo.p077ui.mycloud.filetab.MyCloudFileItemView;
import com.zing.zalo.p077ui.mycloud.gridtab.GridChatItemViewBase;
import com.zing.zalo.p077ui.mycloud.linktab.MyCloudLinkItemView;
import com.zing.zalo.p077ui.mycloud.mediatab.MyCloudMediaItemView;
import com.zing.zalo.p077ui.mycloud.model.MyCloudItem;
import com.zing.zalo.p077ui.mycloud.model.MyCloudMessageItem;
import com.zing.zalo.p077ui.mycloud.textmsgtab.MyCloudTextItemView;
import com.zing.zalo.p077ui.mycloud.widget.HeaderItemView;
import com.zing.zalo.p077ui.picker.mycloud.model.SelectedItemData;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.zview.AbstractC17466e;
import com.zing.zalo.zview.animation.AnimationTarget;
import dj.C17945a0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.Arrays;
import java.util.List;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import p239ih.C20556f;
import p363nh.C23744a;
import p365nk.C23805a;
import p542ub.InterfaceC27218a;
import p649xl.C29725b5;
import p649xl.C29852i6;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import q90.C25199b;
import q90.C25201d;
import u80.InterfaceC27126g2;
import u80.InterfaceC27130h2;
import v80.C27947a;
import vc0.AbstractC27964c;
import vc0.C27962a;
import vc0.C27966e;
import vc0.C27969h;
import vc0.InterfaceC27965d;
import w80.C28824u;

/* loaded from: classes6.dex */
public abstract class BaseMyCloudTabView extends BaseZaloView implements InterfaceC27130h2 {
    public static final C12509a Companion = new C12509a(null);

    /* renamed from: M0 */
    private final InterfaceC24854k f65416M0;

    /* renamed from: N0 */
    private C27947a f65417N0;

    /* renamed from: O0 */
    protected C29852i6 f65418O0;

    /* renamed from: P0 */
    private C29725b5 f65419P0;

    /* renamed from: Q0 */
    private C27969h f65420Q0;

    /* renamed from: R0 */
    private C27962a f65421R0;

    /* renamed from: S0 */
    private AbstractC11859g f65422S0;

    /* renamed from: T0 */
    private boolean f65423T0;

    /* renamed from: U0 */
    private int f65424U0;

    /* renamed from: V0 */
    private boolean f65425V0;

    /* renamed from: W0 */
    private final InterfaceC24854k f65426W0;

    /* renamed from: X0 */
    private final Handler f65427X0;

    /* renamed from: com.zing.zalo.ui.mycloud.base.BaseMyCloudTabView$a */
    /* loaded from: classes6.dex */
    public static final class C12509a {
        private C12509a() {
        }

        public /* synthetic */ C12509a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.base.BaseMyCloudTabView$b */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC12510b {
        /* renamed from: A */
        public abstract void mo70379A(boolean z11);

        /* renamed from: B */
        public abstract void mo70380B(boolean z11);

        /* renamed from: C */
        public abstract void mo70381C(AnimationTarget animationTarget, C17945a0 c17945a0);

        /* renamed from: a */
        public abstract boolean mo70382a(View view);

        /* renamed from: b */
        public abstract boolean mo70383b(SelectedItemData selectedItemData, boolean z11);

        /* renamed from: c */
        public abstract int mo70384c();

        /* renamed from: d */
        public abstract String mo70385d();

        /* renamed from: e */
        public abstract int mo70386e();

        /* renamed from: f */
        public abstract float mo70387f();

        /* renamed from: g */
        public abstract List mo70388g();

        /* renamed from: h */
        public abstract List mo70389h();

        /* renamed from: i */
        public boolean m70390i() {
            return false;
        }

        /* renamed from: j */
        public abstract void mo70391j(View view);

        /* renamed from: k */
        public abstract void mo70392k(C17945a0 c17945a0);

        /* renamed from: l */
        public abstract void mo70393l(C17945a0 c17945a0);

        /* renamed from: m */
        public abstract void mo70394m(SelectedItemData selectedItemData, boolean z11);

        /* renamed from: n */
        public abstract void mo70395n(C17945a0 c17945a0, String str);

        /* renamed from: o */
        public abstract void mo70396o(MyCloudMessageItem myCloudMessageItem);

        /* renamed from: p */
        public abstract void mo70397p(C17945a0 c17945a0);

        /* renamed from: q */
        public abstract void mo70398q(String str);

        /* renamed from: r */
        public abstract void mo70399r(Context context, C17945a0 c17945a0);

        /* renamed from: s */
        public abstract void mo70400s();

        /* renamed from: t */
        public abstract void mo70401t();

        /* renamed from: u */
        public abstract void mo70402u(C17945a0 c17945a0);

        /* renamed from: v */
        public abstract void mo70403v(C17945a0 c17945a0);

        /* renamed from: w */
        public abstract void mo70404w(MyCloudMessageItem myCloudMessageItem, AnimationTarget animationTarget);

        /* renamed from: x */
        public abstract void mo70405x(C17945a0 c17945a0, C20556f c20556f);

        /* renamed from: y */
        public abstract void mo70406y(C17945a0 c17945a0);

        /* renamed from: z */
        public abstract void mo70407z(C17945a0 c17945a0);
    }

    /* renamed from: com.zing.zalo.ui.mycloud.base.BaseMyCloudTabView$c */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C12511c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f65428a;

        static {
            int[] iArr = new int[C23805a.d.values().length];
            try {
                iArr[C23805a.d.f115057q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C23805a.d.f115058r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C23805a.d.f115056p.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C23805a.d.f115059s.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C23805a.d.f115060t.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f65428a = iArr;
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.base.BaseMyCloudTabView$d */
    /* loaded from: classes6.dex */
    public static final class RunnableC12512d implements Runnable {
        public RunnableC12512d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C27947a m70360nM = BaseMyCloudTabView.this.m70360nM();
            if (m70360nM != null) {
                m70360nM.m10013u(0, BaseMyCloudTabView.this.m70369sM().m9745c2());
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.base.BaseMyCloudTabView$e */
    /* loaded from: classes6.dex */
    public static final class ViewTreeObserverOnGlobalLayoutListenerC12513e implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC12513e() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            C27947a m70360nM;
            BaseMyCloudTabView.this.m70374vM().f138149r.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (BaseMyCloudTabView.this.m70321DM() && (m70360nM = BaseMyCloudTabView.this.m70360nM()) != null && !m70360nM.m140840V()) {
                BaseMyCloudTabView baseMyCloudTabView = BaseMyCloudTabView.this;
                baseMyCloudTabView.mo70328Hn(baseMyCloudTabView.m70373uM().mo70481T6(), true);
                BaseMyCloudTabView.this.m70336KM(false);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.base.BaseMyCloudTabView$f */
    /* loaded from: classes6.dex */
    public static final class C12514f extends RecyclerView.AbstractC1887n {
        C12514f() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(rect, "outRect");
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "state");
            super.mo10066g(rect, view, recyclerView, c1899z);
            BaseMyCloudTabView.this.m70373uM().mo16979gb(rect, view, recyclerView, c1899z);
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.base.BaseMyCloudTabView$g */
    /* loaded from: classes6.dex */
    public static final class C12515g extends RecyclerView.AbstractC1882i {
        C12515g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1882i
        /* renamed from: a */
        public void mo10026a() {
            BaseMyCloudTabView.this.m70373uM().mo70465Gj();
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.base.BaseMyCloudTabView$h */
    /* loaded from: classes6.dex */
    public static final class C12516h extends AbstractC11859g {

        /* renamed from: U */
        final /* synthetic */ BaseMyCloudTabView f65433U;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12516h(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, BaseMyCloudTabView baseMyCloudTabView, RecyclerView recyclerView) {
            super(recyclerView, stateListDrawable, drawable, stateListDrawable2, drawable2);
            this.f65433U = baseMyCloudTabView;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.p077ui.custom.AbstractC11859g
        /* renamed from: e0 */
        public void mo46065e0(int i11) {
            super.mo46065e0(i11);
            this.f65433U.m70373uM().mo70496do(this.f65433U.m70369sM().m9740Y1());
        }

        @Override // com.zing.zalo.p077ui.custom.AbstractC11859g
        /* renamed from: f0 */
        protected void mo46066f0() {
            this.f65433U.m70331IM();
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.base.BaseMyCloudTabView$i */
    /* loaded from: classes6.dex */
    public static final class C12517i extends RecyclerView.AbstractC1892s {
        C12517i() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            boolean z11;
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo952b(recyclerView, i11);
            C27947a m70360nM = BaseMyCloudTabView.this.m70360nM();
            if (m70360nM != null) {
                if (i11 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                m70360nM.m140850g0(z11);
            }
            if (i11 == 0) {
                C27947a m70360nM2 = BaseMyCloudTabView.this.m70360nM();
                if (m70360nM2 != null) {
                    m70360nM2.m10008p();
                }
                BaseMyCloudTabView.this.m70373uM().mo70506ni();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo10176d(recyclerView, i11, i12);
            BaseMyCloudTabView.this.f65424U0 = (BaseMyCloudTabView.this.mo70365qe() - 1) - BaseMyCloudTabView.this.m70369sM().m9745c2();
            BaseMyCloudTabView.this.m70373uM().mo70492b7(BaseMyCloudTabView.this.m70369sM().m9740Y1(), BaseMyCloudTabView.this.f65424U0, recyclerView.getScrollState(), i12);
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.base.BaseMyCloudTabView$j */
    /* loaded from: classes6.dex */
    static final class C12518j extends AbstractC19075u implements InterfaceC18494a {
        C12518j() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LinearLayoutManager mo12V4() {
            return BaseMyCloudTabView.this.mo70377zM();
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.base.BaseMyCloudTabView$k */
    /* loaded from: classes6.dex */
    static final class C12519k extends AbstractC19075u implements InterfaceC18494a {
        C12519k() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC27126g2 mo12V4() {
            return BaseMyCloudTabView.this.mo70318AM();
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.base.BaseMyCloudTabView$l */
    /* loaded from: classes6.dex */
    public static final class C12520l implements C27966e.b {
        C12520l() {
        }

        @Override // vc0.C27966e.b
        /* renamed from: a */
        public void mo68951a(int i11) {
            C27969h m70371tM = BaseMyCloudTabView.this.m70371tM();
            if (m70371tM != null) {
                m70371tM.m140957h();
            }
            BaseMyCloudTabView.this.f65425V0 = false;
        }

        @Override // vc0.C27966e.b
        /* renamed from: b */
        public void mo68952b(int i11) {
            C27969h m70371tM = BaseMyCloudTabView.this.m70371tM();
            if (m70371tM != null) {
                m70371tM.m140958i(BaseMyCloudTabView.this.m70373uM().mo70512v());
            }
            BaseMyCloudTabView.this.f65425V0 = true;
        }
    }

    public BaseMyCloudTabView() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(new C12518j());
        this.f65416M0 = m129210a;
        this.f65423T0 = true;
        this.f65424U0 = -1;
        m129210a2 = AbstractC24856m.m129210a(new C12519k());
        this.f65426W0 = m129210a2;
        this.f65427X0 = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: w80.r
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean m70304FM;
                m70304FM = BaseMyCloudTabView.m70304FM(BaseMyCloudTabView.this, message);
                return m70304FM;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CM */
    public static final void m70303CM(BaseMyCloudTabView baseMyCloudTabView, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        AbstractC19074t.m100208f(baseMyCloudTabView, "this$0");
        baseMyCloudTabView.m70373uM().mo70515xc(view.getHeight(), i18, i16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public static final boolean m70304FM(BaseMyCloudTabView baseMyCloudTabView, Message message) {
        AbstractC19074t.m100208f(baseMyCloudTabView, "this$0");
        AbstractC19074t.m100208f(message, "msg");
        try {
            int i11 = message.what;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        InterfaceC27126g2 m70373uM = baseMyCloudTabView.m70373uM();
                        Object obj = message.obj;
                        AbstractC19074t.m100207e(obj, "obj");
                        m70373uM.mo70469M8(obj);
                    }
                } else {
                    InterfaceC27126g2 m70373uM2 = baseMyCloudTabView.m70373uM();
                    Object obj2 = message.obj;
                    AbstractC19074t.m100207e(obj2, "obj");
                    m70373uM2.mo70473P9(obj2);
                }
            } else {
                InterfaceC27126g2 m70373uM3 = baseMyCloudTabView.m70373uM();
                Object obj3 = message.obj;
                AbstractC19074t.m100207e(obj3, "obj");
                m70373uM3.mo70472P5(obj3, baseMyCloudTabView.m70369sM().m9740Y1());
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: MM */
    private final void m70305MM() {
        this.f65421R0 = new C27962a().m140946z(new C27966e(new C27966e.a() { // from class: w80.s
            @Override // vc0.C27966e.a
            /* renamed from: a */
            public final void mo115544a(int i11, int i12, float f11, float f12, boolean z11, int i13) {
                BaseMyCloudTabView.m70306NM(BaseMyCloudTabView.this, i11, i12, f11, f12, z11, i13);
            }
        }, new C12520l())).m140944x(false);
        this.f65420Q0 = new C27969h(m70374vM().f138149r, new AbstractC27964c.a() { // from class: w80.t
            @Override // vc0.AbstractC27964c.a
            /* renamed from: a */
            public final void mo69546a(InterfaceC27965d interfaceC27965d, int i11, boolean z11) {
                BaseMyCloudTabView.m70307OM(BaseMyCloudTabView.this, interfaceC27965d, i11, z11);
            }
        });
        C27962a c27962a = this.f65421R0;
        if (c27962a != null) {
            m70374vM().f138149r.m9825D(c27962a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NM */
    public static final void m70306NM(BaseMyCloudTabView baseMyCloudTabView, int i11, int i12, float f11, float f12, boolean z11, int i13) {
        AbstractC19074t.m100208f(baseMyCloudTabView, "this$0");
        baseMyCloudTabView.m70373uM().mo70457Ap(i11, i12, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OM */
    public static final void m70307OM(BaseMyCloudTabView baseMyCloudTabView, InterfaceC27965d interfaceC27965d, int i11, boolean z11) {
        AbstractC19074t.m100208f(baseMyCloudTabView, "this$0");
        baseMyCloudTabView.m70373uM().mo70478Sd(interfaceC27965d, z11);
    }

    /* renamed from: xM */
    private final void m70316xM() {
        m70373uM().mo70460Dc();
        C29725b5 c29725b5 = this.f65419P0;
        C29725b5 c29725b52 = null;
        if (c29725b5 == null) {
            AbstractC19074t.m100223u("dockViewBinding");
            c29725b5 = null;
        }
        c29725b5.f137301q.setVisibility(8);
        C29725b5 c29725b53 = this.f65419P0;
        if (c29725b53 == null) {
            AbstractC19074t.m100223u("dockViewBinding");
        } else {
            c29725b52 = c29725b53;
        }
        c29725b52.f137301q.setOnCheckedChangeListener(new PhotoToggleButton.InterfaceC11847c() { // from class: w80.p
            @Override // com.zing.zalo.p077ui.custom.PhotoToggleButton.InterfaceC11847c
            /* renamed from: a */
            public final void mo37055a(PhotoToggleButton photoToggleButton, boolean z11) {
                BaseMyCloudTabView.m70317yM(BaseMyCloudTabView.this, photoToggleButton, z11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yM */
    public static final void m70317yM(BaseMyCloudTabView baseMyCloudTabView, PhotoToggleButton photoToggleButton, boolean z11) {
        AbstractC19074t.m100208f(baseMyCloudTabView, "this$0");
        try {
            baseMyCloudTabView.m70373uM().mo70483V7(z11);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: AM */
    public abstract InterfaceC27126g2 mo70318AM();

    @Override // u80.InterfaceC27130h2
    /* renamed from: Ag */
    public void mo70319Ag(C2665b c2665b) {
        AbstractC11859g abstractC11859g;
        AbstractC19074t.m100208f(c2665b, "data");
        C27947a c27947a = this.f65417N0;
        if (c27947a != null) {
            c27947a.m140845b0(c2665b, m70373uM().mo70488Y0());
        }
        m70373uM().mo70456A5(m70369sM().m9740Y1());
        if (this.f65424U0 >= 0 && (abstractC11859g = this.f65422S0) != null && abstractC11859g.m114868x()) {
            m70369sM().mo9756v1((m70369sM().m10127i() - 1) - this.f65424U0);
        }
        if (this.f65423T0) {
            m70374vM().f138149r.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC12513e());
        }
    }

    /* renamed from: BM */
    public void mo70320BM() {
        RecyclerView recyclerView = m70374vM().f138149r;
        recyclerView.setLayoutManager(m70369sM());
        C27947a mo70375wM = mo70375wM();
        this.f65417N0 = mo70375wM;
        recyclerView.setAdapter(mo70375wM);
        recyclerView.m9816A(m70367rM());
        recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: w80.q
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                BaseMyCloudTabView.m70303CM(BaseMyCloudTabView.this, view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        });
        recyclerView.m9826E(new C12517i());
        m70305MM();
        m70355i2();
    }

    /* renamed from: DM */
    protected final boolean m70321DM() {
        return this.f65423T0;
    }

    @Override // u80.InterfaceC27130h2
    /* renamed from: Da */
    public void mo70322Da(MessageId messageId) {
        AbstractC19074t.m100208f(messageId, "messageId");
        Message obtainMessage = this.f65427X0.obtainMessage(2, messageId);
        AbstractC19074t.m100207e(obtainMessage, "obtainMessage(...)");
        this.f65427X0.sendMessage(obtainMessage);
    }

    @Override // u80.InterfaceC27130h2
    /* renamed from: Dv */
    public int mo70323Dv(MyCloudItem myCloudItem) {
        List m140836R;
        AbstractC19074t.m100208f(myCloudItem, "item");
        C27947a c27947a = this.f65417N0;
        if (c27947a != null && (m140836R = c27947a.m140836R()) != null) {
            return m140836R.indexOf(myCloudItem);
        }
        return -1;
    }

    /* renamed from: EM */
    public final boolean m70324EM() {
        C27947a c27947a = this.f65417N0;
        if (c27947a == null || !c27947a.m140841W()) {
            return false;
        }
        return true;
    }

    @Override // u80.InterfaceC27130h2
    /* renamed from: FH */
    public View mo70325FH(int i11) {
        return m70369sM().mo9732P(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29852i6 m148072c = C29852i6.m148072c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148072c, "inflate(...)");
        m70337LM(m148072c);
        C29725b5 c29725b5 = m70374vM().f138148q;
        AbstractC19074t.m100207e(c29725b5, "dockViewLayout");
        this.f65419P0 = c29725b5;
        m70316xM();
        mo70320BM();
        return m70374vM().getRoot();
    }

    /* renamed from: GM */
    public final void m70326GM() {
        C27962a c27962a;
        if (this.f65425V0 && (c27962a = this.f65421R0) != null) {
            c27962a.m140942t();
        }
    }

    /* renamed from: HM */
    public final void m70327HM(String str, List list) {
        AbstractC19074t.m100208f(str, "keySearch");
        AbstractC19074t.m100208f(list, "searchResults");
        m70373uM().mo70476R3(str, list);
    }

    @Override // u80.InterfaceC27130h2
    /* renamed from: Hn */
    public void mo70328Hn(float f11, boolean z11) {
        m70373uM().mo70502kj(f11, z11, m70369sM().m9740Y1());
    }

    @Override // u80.InterfaceC27130h2
    /* renamed from: IF */
    public void mo70329IF(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "item");
        Message obtainMessage = this.f65427X0.obtainMessage(0, c17945a0);
        AbstractC19074t.m100207e(obtainMessage, "obtainMessage(...)");
        this.f65427X0.sendMessage(obtainMessage);
    }

    @Override // u80.InterfaceC27130h2
    /* renamed from: IH */
    public void mo70330IH(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        C27947a c27947a = this.f65417N0;
        if (c27947a != null) {
            c27947a.m140832L(c17945a0);
        }
        m70374vM().f138149r.postDelayed(new RunnableC12512d(), 300L);
    }

    /* renamed from: IM */
    public final void m70331IM() {
        C27947a c27947a = this.f65417N0;
        if (c27947a != null) {
            c27947a.m10008p();
        }
    }

    @Override // u80.InterfaceC27130h2
    /* renamed from: JC */
    public int mo70332JC() {
        return m70374vM().f138149r.computeVerticalScrollExtent();
    }

    @Override // u80.InterfaceC27130h2
    /* renamed from: JF */
    public void mo70333JF(MessageId messageId) {
        AbstractC19074t.m100208f(messageId, "messageId");
        C27947a c27947a = this.f65417N0;
        if (c27947a != null) {
            c27947a.m140844a0(messageId);
        }
    }

    /* renamed from: JM */
    public final void m70334JM(AbstractC12510b abstractC12510b) {
        AbstractC12521a abstractC12521a;
        AbstractC19074t.m100208f(abstractC12510b, "delegate");
        InterfaceC27126g2 m70373uM = m70373uM();
        if (m70373uM instanceof AbstractC12521a) {
            abstractC12521a = (AbstractC12521a) m70373uM;
        } else {
            abstractC12521a = null;
        }
        if (abstractC12521a != null) {
            abstractC12521a.m70495cr(abstractC12510b);
        }
    }

    @Override // u80.InterfaceC27130h2
    /* renamed from: K1 */
    public void mo70335K1(boolean z11) {
        int i11;
        m70373uM().mo70516zk();
        C29725b5 c29725b5 = this.f65419P0;
        C29725b5 c29725b52 = null;
        if (c29725b5 == null) {
            AbstractC19074t.m100223u("dockViewBinding");
            c29725b5 = null;
        }
        PhotoToggleButton photoToggleButton = c29725b5.f137301q;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        photoToggleButton.setVisibility(i11);
        if (!z11) {
            C29725b5 c29725b53 = this.f65419P0;
            if (c29725b53 == null) {
                AbstractC19074t.m100223u("dockViewBinding");
            } else {
                c29725b52 = c29725b53;
            }
            c29725b52.f137301q.setChecked(false);
        }
        C27947a c27947a = this.f65417N0;
        if (c27947a == null || c27947a.m140834O() != z11) {
            C27947a c27947a2 = this.f65417N0;
            if (c27947a2 != null) {
                c27947a2.m140847d0(z11);
            }
            C27947a c27947a3 = this.f65417N0;
            if (c27947a3 != null) {
                c27947a3.m10008p();
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124117e(this, 51);
        bVar.m124119a().m124117e(this, 6052);
        bVar.m124119a().m124117e(this, 9);
        bVar.m124119a().m124117e(this, 5202);
        bVar.m124119a().m124117e(this, 5208);
        bVar.m124119a().m124117e(this, 174);
        bVar.m124119a().m124117e(this, 175);
    }

    /* renamed from: KM */
    protected final void m70336KM(boolean z11) {
        this.f65423T0 = z11;
    }

    /* renamed from: LM */
    protected final void m70337LM(C29852i6 c29852i6) {
        AbstractC19074t.m100208f(c29852i6, "<set-?>");
        this.f65418O0 = c29852i6;
    }

    @Override // u80.InterfaceC27130h2
    /* renamed from: ME */
    public void mo70338ME(int i11, int i12) {
        if (i12 == 0) {
            m70369sM().mo9756v1(i11);
        } else {
            m70369sM().m9721B2(0, i12);
        }
    }

    @Override // u80.InterfaceC27130h2
    /* renamed from: Nu */
    public int mo70339Nu() {
        return m70374vM().f138149r.getMeasuredHeight();
    }

    @Override // u80.InterfaceC27130h2
    /* renamed from: OH */
    public void mo70340OH(C2665b c2665b) {
        AbstractC19074t.m100208f(c2665b, "data");
        Message obtainMessage = this.f65427X0.obtainMessage(1, c2665b);
        AbstractC19074t.m100207e(obtainMessage, "obtainMessage(...)");
        this.f65427X0.sendMessage(obtainMessage);
    }

    @Override // u80.InterfaceC27130h2
    /* renamed from: Or */
    public int mo70341Or() {
        return m70374vM().f138149r.computeVerticalScrollOffset();
    }

    @Override // u80.InterfaceC27130h2
    /* renamed from: Se */
    public MyCloudItem mo70342Se(int i11) {
        C27947a c27947a = this.f65417N0;
        if (c27947a == null || i11 < 0 || i11 >= c27947a.m140836R().size()) {
            return null;
        }
        return (MyCloudItem) c27947a.m140836R().get(i11);
    }

    @Override // u80.InterfaceC27130h2
    /* renamed from: Vm */
    public void mo70343Vm(MyCloudMessageItem myCloudMessageItem, boolean z11) {
        AbstractC19074t.m100208f(myCloudMessageItem, "item");
        C27969h c27969h = this.f65420Q0;
        if (c27969h != null) {
            c27969h.m140961l(myCloudMessageItem.mo40586c(), z11);
        }
    }

    @Override // u80.InterfaceC27130h2
    /* renamed from: XE */
    public void mo70344XE(boolean z11) {
        TranslateAnimation translateAnimation;
        C29725b5 c29725b5 = null;
        if (z11) {
            C29725b5 c29725b52 = this.f65419P0;
            if (c29725b52 == null) {
                AbstractC19074t.m100223u("dockViewBinding");
                c29725b52 = null;
            }
            translateAnimation = new TranslateAnimation(0.0f, 0.0f, -c29725b52.f137302r.getHeight(), 0.0f);
        } else {
            C29725b5 c29725b53 = this.f65419P0;
            if (c29725b53 == null) {
                AbstractC19074t.m100223u("dockViewBinding");
                c29725b53 = null;
            }
            translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -c29725b53.f137302r.getHeight());
        }
        translateAnimation.setDuration(150L);
        C29725b5 c29725b54 = this.f65419P0;
        if (c29725b54 == null) {
            AbstractC19074t.m100223u("dockViewBinding");
        } else {
            c29725b5 = c29725b54;
        }
        c29725b5.f137302r.startAnimation(translateAnimation);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        m70373uM().mo70479T(z11, z12);
    }

    @Override // u80.InterfaceC27130h2
    /* renamed from: Xg */
    public int mo70345Xg() {
        return m70374vM().f138149r.computeVerticalScrollRange();
    }

    @Override // u80.InterfaceC27130h2
    /* renamed from: YA */
    public void mo70346YA(float f11, float f12) {
        AbstractC11859g abstractC11859g = this.f65422S0;
        if (abstractC11859g != null) {
            abstractC11859g.m114859H(f11, f12);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        InterfaceC27126g2 m70373uM = m70373uM();
        AbstractC19074t.m100206d(m70373uM, "null cannot be cast to non-null type com.zing.zalo.ui.mycloud.base.BaseMyCloudTabPresenter");
        ((AbstractC12521a) m70373uM).m70477Rq(new C28824u(m92642L3()), null);
    }

    @Override // u80.InterfaceC27130h2
    /* renamed from: Zi */
    public int mo70347Zi() {
        C29725b5 c29725b5 = this.f65419P0;
        if (c29725b5 == null) {
            AbstractC19074t.m100223u("dockViewBinding");
            c29725b5 = null;
        }
        return c29725b5.f137302r.getBottom();
    }

    @Override // u80.InterfaceC27130h2
    /* renamed from: Zl */
    public void mo70348Zl(Runnable runnable, long j11) {
        AbstractC19074t.m100208f(runnable, "runnable");
        if (j11 == 0) {
            this.f72827B0.post(runnable);
        } else {
            this.f72827B0.postDelayed(runnable, j11);
        }
    }

    @Override // u80.InterfaceC27130h2
    /* renamed from: bk */
    public void mo70349bk(boolean z11) {
        C29725b5 c29725b5 = this.f65419P0;
        if (c29725b5 == null) {
            AbstractC19074t.m100223u("dockViewBinding");
            c29725b5 = null;
        }
        c29725b5.f137301q.setChecked(z11);
    }

    @Override // u80.InterfaceC27130h2
    /* renamed from: dd */
    public void mo70350dd() {
        m70374vM().f138149r.m9853S0();
    }

    @Override // u80.InterfaceC27130h2
    /* renamed from: do */
    public void mo70351do(String str) {
        AbstractC19074t.m100208f(str, "newTitle");
        C29725b5 c29725b5 = this.f65419P0;
        if (c29725b5 == null) {
            AbstractC19074t.m100223u("dockViewBinding");
            c29725b5 = null;
        }
        c29725b5.f137303s.setText(str);
    }

    @Override // u80.InterfaceC27130h2
    /* renamed from: e1 */
    public C25201d.a mo70352e1() {
        return null;
    }

    @Override // u80.InterfaceC27130h2
    public int getItemViewType(int i11) {
        C27947a c27947a = this.f65417N0;
        if (c27947a != null) {
            return c27947a.mo10005m(i11);
        }
        return -1;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "";
    }

    @Override // u80.InterfaceC27130h2
    /* renamed from: hD */
    public int mo70353hD() {
        C29725b5 c29725b5 = this.f65419P0;
        if (c29725b5 == null) {
            AbstractC19074t.m100223u("dockViewBinding");
            c29725b5 = null;
        }
        return c29725b5.f137302r.getVisibility();
    }

    @Override // u80.InterfaceC27130h2
    /* renamed from: hx */
    public void mo70354hx() {
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            m92642L3.putInt("extra_fake_header_height", m70373uM().mo70462E7());
        }
    }

    /* renamed from: i2 */
    public final void m70355i2() {
        Drawable m118665N = AbstractC23136l9.m118665N(getContext(), AbstractC16803z.thumb_drawable);
        AbstractC19074t.m100206d(m118665N, "null cannot be cast to non-null type android.graphics.drawable.StateListDrawable");
        StateListDrawable stateListDrawable = (StateListDrawable) m118665N;
        Drawable m118665N2 = AbstractC23136l9.m118665N(getContext(), AbstractC17466e.transparent);
        Drawable m118665N3 = AbstractC23136l9.m118665N(getContext(), AbstractC16803z.thumb_drawable);
        AbstractC19074t.m100206d(m118665N3, "null cannot be cast to non-null type android.graphics.drawable.StateListDrawable");
        this.f65422S0 = new C12516h(stateListDrawable, m118665N2, (StateListDrawable) m118665N3, AbstractC23136l9.m118665N(getContext(), AbstractC17466e.transparent), this, m70374vM().f138149r);
        m70373uM().mo70516zk();
    }

    @Override // u80.InterfaceC27130h2
    /* renamed from: l1 */
    public void mo70356l1(int i11) {
        C27969h c27969h = this.f65420Q0;
        if (c27969h != null) {
            c27969h.m140959j(i11);
        }
        C27962a c27962a = this.f65421R0;
        if (c27962a != null) {
            c27962a.m140943w(AbstractC23136l9.m118713h0() - AbstractC23136l9.m118655I(AbstractC16802y.height_ms_sticky_header_view));
            C29725b5 c29725b5 = this.f65419P0;
            if (c29725b5 == null) {
                AbstractC19074t.m100223u("dockViewBinding");
                c29725b5 = null;
            }
            c27962a.m140935A(c29725b5.f137302r.getHeight() + m70373uM().mo70462E7() + AbstractC23136l9.m118655I(AbstractC16802y.sub_tab_height));
        }
    }

    /* renamed from: lM */
    public final void m70357lM() {
        m70373uM().mo70513wp();
    }

    /* renamed from: mM */
    public final void m70358mM() {
        m70373uM().mo70455A1();
    }

    @Override // u80.InterfaceC27130h2
    /* renamed from: nC */
    public void mo70359nC(boolean z11, boolean z12) {
        m70373uM().mo70503km(z11, z12);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: nM */
    public final C27947a m70360nM() {
        return this.f65417N0;
    }

    /* renamed from: oM */
    public abstract C23805a.d mo70361oM();

    @Override // u80.InterfaceC27130h2
    /* renamed from: p9 */
    public C25199b.a mo70362p9() {
        return null;
    }

    /* renamed from: pM */
    public int m70363pM() {
        if (mo70353hD() == 0) {
            C29725b5 c29725b5 = this.f65419P0;
            if (c29725b5 == null) {
                AbstractC19074t.m100223u("dockViewBinding");
                c29725b5 = null;
            }
            return c29725b5.f137302r.getMeasuredHeight();
        }
        return 0;
    }

    /* renamed from: qM */
    public View m70364qM() {
        MyCloudMessageItem data;
        C17945a0 m71033m;
        int m9737T1 = m70369sM().m9737T1();
        int m9741Z1 = m70369sM().m9741Z1();
        if (m9737T1 < 0 || m9737T1 > m9741Z1 || m9737T1 > m9741Z1) {
            return null;
        }
        while (true) {
            View mo9732P = m70369sM().mo9732P(m9737T1);
            if ((mo9732P instanceof GridChatItemViewBase) && (data = ((GridChatItemViewBase) mo9732P).getData()) != null && (m71033m = data.m71033m()) != null && m71033m.m95278v8() && m70373uM().mo70501hb(mo9732P)) {
                return mo9732P;
            }
            if (m9737T1 != m9741Z1) {
                m9737T1++;
            } else {
                return null;
            }
        }
    }

    @Override // u80.InterfaceC27130h2
    /* renamed from: qe */
    public int mo70365qe() {
        C27947a c27947a = this.f65417N0;
        if (c27947a != null) {
            return c27947a.mo10003k();
        }
        return 0;
    }

    @Override // u80.InterfaceC27130h2
    /* renamed from: r8 */
    public void mo70366r8() {
        C27947a c27947a = this.f65417N0;
        if (c27947a != null) {
            c27947a.m140852i0(m70373uM().mo70499g7());
        }
    }

    /* renamed from: rM */
    public RecyclerView.AbstractC1887n m70367rM() {
        return new C12514f();
    }

    @Override // u80.InterfaceC27130h2
    /* renamed from: s2 */
    public void mo70368s2(int i11) {
        C27962a c27962a = this.f65421R0;
        if (c27962a != null) {
            c27962a.m140940r(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: sM */
    public final LinearLayoutManager m70369sM() {
        return (LinearLayoutManager) this.f65416M0.getValue();
    }

    @Override // u80.InterfaceC27130h2
    /* renamed from: sp */
    public void mo70370sp() {
        C29725b5 c29725b5 = this.f65419P0;
        if (c29725b5 != null) {
            if (c29725b5 == null) {
                AbstractC19074t.m100223u("dockViewBinding");
                c29725b5 = null;
            }
            RelativeLayout root = c29725b5.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = m70373uM().mo70462E7();
                root.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* renamed from: tM */
    protected final C27969h m70371tM() {
        return this.f65420Q0;
    }

    @Override // u80.InterfaceC27130h2
    /* renamed from: tr */
    public void mo70372tr() {
        C27947a c27947a = this.f65417N0;
        if (c27947a != null) {
            c27947a.m140848e0(m70373uM().mo70462E7());
            c27947a.m10008p();
        }
    }

    /* renamed from: uM */
    public InterfaceC27126g2 m70373uM() {
        return (InterfaceC27126g2) this.f65426W0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: vM */
    public final C29852i6 m70374vM() {
        C29852i6 c29852i6 = this.f65418O0;
        if (c29852i6 != null) {
            return c29852i6;
        }
        AbstractC19074t.m100223u("viewBinding");
        return null;
    }

    /* renamed from: wM */
    public C27947a mo70375wM() {
        Context context;
        boolean z11;
        AbstractC12521a abstractC12521a;
        InterfaceC27218a m92676n2 = m92676n2();
        AbstractC12510b abstractC12510b = null;
        if (m92676n2 != null) {
            context = m92676n2.getContext();
        } else {
            context = null;
        }
        InterfaceC27218a m92676n22 = m92676n2();
        if (m92676n22 != null) {
            z11 = m92676n22.mo35576n3();
        } else {
            z11 = false;
        }
        C27947a c27947a = new C27947a(context, z11, mo70361oM(), m70373uM().mo70499g7());
        InterfaceC27126g2 m70373uM = m70373uM();
        if (m70373uM instanceof AbstractC12521a) {
            abstractC12521a = (AbstractC12521a) m70373uM;
        } else {
            abstractC12521a = null;
        }
        if (abstractC12521a != null) {
            abstractC12510b = abstractC12521a.m70509pq();
        }
        c27947a.m140846c0(abstractC12510b);
        c27947a.m140848e0(m70373uM().mo70462E7());
        c27947a.m140851h0(m70373uM().mo70487Xh());
        c27947a.m9999J(true);
        c27947a.m9998I(new C12515g());
        return c27947a;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        super.mo17795x(i11, Arrays.copyOf(objArr, objArr.length));
        m70373uM().mo70514x(i11, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        m70373uM().mo70482Tk();
        m70373uM().mo70474Pb();
    }

    @Override // u80.InterfaceC27130h2
    /* renamed from: yw */
    public void mo70376yw(boolean z11) {
        int i11;
        C29725b5 c29725b5 = this.f65419P0;
        if (c29725b5 == null) {
            AbstractC19074t.m100223u("dockViewBinding");
            c29725b5 = null;
        }
        RelativeLayout relativeLayout = c29725b5.f137302r;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        relativeLayout.setVisibility(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124115b(this, 51);
        bVar.m124119a().m124115b(this, 6052);
        bVar.m124119a().m124115b(this, 9);
        bVar.m124119a().m124115b(this, 5202);
        bVar.m124119a().m124115b(this, 5208);
        bVar.m124119a().m124115b(this, 174);
        bVar.m124119a().m124115b(this, 175);
    }

    /* renamed from: zM */
    public LinearLayoutManager mo70377zM() {
        return new LinearLayoutManager(getContext());
    }

    @Override // u80.InterfaceC27130h2
    /* renamed from: zn */
    public boolean mo70378zn(int i11, boolean z11, boolean z12) {
        MyCloudLinkItemView m140866o0;
        HeaderItemView m140865n0;
        RecyclerView.AbstractC1876c0 m9900t0 = m70374vM().f138149r.m9900t0(i11);
        if (m9900t0 instanceof C27947a.b) {
            if (z12 && (m140865n0 = ((C27947a.b) m9900t0).m140865n0()) != null) {
                m140865n0.setCheckBoModuleState(z11);
            }
            int i12 = C12511c.f65428a[mo70361oM().ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5 && (m140866o0 = ((C27947a.b) m9900t0).m140866o0()) != null) {
                                m140866o0.setCheckBoModuleState(z11);
                            }
                        } else {
                            MyCloudFileItemView m140863l0 = ((C27947a.b) m9900t0).m140863l0();
                            if (m140863l0 != null) {
                                m140863l0.setCheckBoModuleState(z11);
                            }
                        }
                    } else {
                        MyCloudMediaItemView m140868q0 = ((C27947a.b) m9900t0).m140868q0();
                        if (m140868q0 != null) {
                            m140868q0.setCheckBoModuleState(z11);
                        }
                    }
                } else {
                    MyCloudTextItemView m140869u0 = ((C27947a.b) m9900t0).m140869u0();
                    if (m140869u0 != null) {
                        m140869u0.setCheckBoModuleState(z11);
                    }
                }
            } else {
                GridChatItemViewBase m140864m0 = ((C27947a.b) m9900t0).m140864m0();
                if (m140864m0 != null) {
                    m140864m0.setCheckBoModuleState(z11);
                }
            }
            return true;
        }
        return false;
    }
}
