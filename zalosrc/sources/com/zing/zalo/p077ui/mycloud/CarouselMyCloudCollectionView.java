package com.zing.zalo.p077ui.mycloud;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.feed.uicontrols.FeedRecyclerView;
import com.zing.zalo.p077ui.mycloud.CarouselMyCloudCollectionView;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.Divider;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import java.util.ArrayList;
import java.util.List;
import kd0.C21693c;
import kw.C21955a;
import kw.C21956b;
import l80.C22122a0;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import me0.C23278z2;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import on0.AbstractC24341v;
import p193h0.AbstractC19694b;
import p246iw.C20843c0;
import p262jb.AbstractC21196a;
import p348mi.AbstractC23306f;
import p354n3.C23528a;
import p363nh.C23744a;
import p649xl.C29779e5;
import p649xl.C29797f5;
import p649xl.C29869j5;
import pk.C24799c;
import ui0.C27280g;

/* loaded from: classes6.dex */
public final class CarouselMyCloudCollectionView extends RelativeLayout implements C23744a.c {
    public static final C12467f Companion = new C12467f(null);

    /* renamed from: A */
    private boolean f65256A;

    /* renamed from: B */
    private float f65257B;

    /* renamed from: C */
    private int f65258C;

    /* renamed from: D */
    private boolean f65259D;

    /* renamed from: p */
    private RecyclerView f65260p;

    /* renamed from: q */
    private C29869j5 f65261q;

    /* renamed from: r */
    private C29779e5 f65262r;

    /* renamed from: s */
    private C29797f5 f65263s;

    /* renamed from: t */
    private FrameLayout f65264t;

    /* renamed from: u */
    private FrameLayout f65265u;

    /* renamed from: v */
    private CarouselMyCloudCollectionSkeletonView f65266v;

    /* renamed from: w */
    private C12465d f65267w;

    /* renamed from: x */
    private InterfaceC12466e f65268x;

    /* renamed from: y */
    private int f65269y;

    /* renamed from: z */
    private boolean f65270z;

    /* loaded from: classes6.dex */
    public static final class AddModuleView extends ModulesView {

        /* renamed from: K */
        private C16716d f65271K;

        /* renamed from: L */
        private C21693c f65272L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddModuleView(Context context) {
            super(context);
            AbstractC19074t.m100208f(context, "context");
            this.f65271K = new C16716d(context);
            this.f65272L = new C21693c(context);
            C16718f m89106L = this.f65271K.m89106L();
            int i11 = AbstractC23222t7.f112549a0;
            m89106L.m89028L(i11, i11);
            C21693c c21693c = this.f65272L;
            c21693c.m89106L().m89028L(-1, -1).m89025I(true);
            c21693c.m111929z1(6);
            c21693c.mo111925v1(C27280g.m139659b(context, AbstractC23322a.zds_ic_plus_line_24, AbstractC2808b.f150821b60));
            setBackground(AbstractC23136l9.m118665N(context, AbstractC16803z.bg_blue_round_8));
            this.f65271K.m89001g1(this.f65272L);
            mo69681L(this.f65271K);
        }
    }

    @SuppressLint({"ViewConstructor"})
    /* loaded from: classes6.dex */
    public static final class MyCloudCollectionModuleView extends ModulesView implements InterfaceC12464c {

        /* renamed from: K */
        private C23528a f65273K;

        /* renamed from: L */
        private C16716d f65274L;

        /* renamed from: M */
        private C22122a0 f65275M;

        /* renamed from: N */
        private C16716d f65276N;

        /* renamed from: O */
        private C22126c0 f65277O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MyCloudCollectionModuleView(Context context, C23528a c23528a) {
            super(context);
            AbstractC19074t.m100208f(context, "context");
            AbstractC19074t.m100208f(c23528a, "aQuery");
            this.f65273K = c23528a;
            this.f65274L = new C16716d(context);
            this.f65275M = new C22122a0(context);
            this.f65276N = new C16716d(context);
            this.f65277O = new C22126c0(context);
            this.f65274L.m89106L().m89028L(AbstractC23222t7.f112591v0, AbstractC23222t7.f112549a0);
            setBackground(AbstractC23136l9.m118665N(context, AbstractC16803z.bg_carousel_my_collection_item));
            setClipToOutline(true);
            this.f65276N.m89106L().m89028L(-1, -1);
            C22122a0 c22122a0 = this.f65275M;
            c22122a0.m89106L().m89028L(-1, -1);
            c22122a0.m111929z1(3);
            C22126c0 c22126c0 = this.f65277O;
            C16718f m89072y = c22126c0.m89106L().m89028L(-1, -2).m89072y(Boolean.TRUE);
            int i11 = AbstractC23222t7.f112576o;
            m89072y.m89032P(i11, i11, i11, i11);
            c22126c0.mo111964L1(AbstractC23222t7.f112582r);
            c22126c0.mo111965M1(1);
            c22126c0.m111962J1(Color.parseColor("#ffffff"));
            c22126c0.m111980v1(TextUtils.TruncateAt.END);
            c22126c0.m111953A1(2);
            this.f65274L.m89001g1(this.f65275M);
            this.f65274L.m89001g1(this.f65276N);
            this.f65274L.m89001g1(this.f65277O);
            mo69681L(this.f65274L);
        }

        @Override // com.zing.zalo.p077ui.mycloud.CarouselMyCloudCollectionView.InterfaceC12464c
        /* renamed from: b */
        public void mo70001b(C24799c c24799c, int i11, boolean z11) {
            boolean m127128x;
            int i12;
            AbstractC19074t.m100208f(c24799c, "item");
            try {
                this.f65277O.m111959G1(c24799c.m128821a());
                if (c24799c.m128832l()) {
                    this.f65275M.mo111925v1(AbstractC19694b.m103336d(getContext(), AbstractC16803z.ic_pin_collection_thumb));
                } else if (c24799c.m128831k()) {
                    this.f65275M.mo111925v1(AbstractC19694b.m103336d(getContext(), AbstractC16803z.ic_fake_collection_thumb));
                } else {
                    if (c24799c.m128830j().length() > 0) {
                        m127128x = AbstractC24341v.m127128x(c24799c.m128830j());
                        if (!m127128x) {
                            this.f65275M.m115375G1(this.f65273K, c24799c.m128830j(), C23278z2.m120161w0());
                        }
                    }
                    this.f65275M.mo111925v1(AbstractC19694b.m103336d(getContext(), AbstractC16803z.ic_fake_collection_thumb));
                }
                Context context = getContext();
                if (c24799c.m128832l()) {
                    i12 = AbstractC16803z.overlay_thumb_my_collection_pin;
                } else {
                    i12 = AbstractC16803z.overlay_thumb_my_collection;
                }
                this.f65276N.m89085A0(AbstractC23136l9.m118665N(context, i12));
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        public final C23528a getMAQ() {
            return this.f65273K;
        }

        public final void setMAQ(C23528a c23528a) {
            AbstractC19074t.m100208f(c23528a, "<set-?>");
            this.f65273K = c23528a;
        }
    }

    /* loaded from: classes6.dex */
    public static final class ViewAllModuleView extends ModulesView {

        /* renamed from: K */
        private C16716d f65278K;

        /* renamed from: L */
        private C22126c0 f65279L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewAllModuleView(Context context) {
            super(context);
            AbstractC19074t.m100208f(context, "context");
            this.f65278K = new C16716d(context);
            this.f65279L = new C22126c0(context);
            this.f65278K.m89106L().m89028L(AbstractC23222t7.f112591v0, AbstractC23222t7.f112549a0);
            C22126c0 c22126c0 = this.f65279L;
            c22126c0.m89106L().m89028L(-1, -2).m89070w(this.f65278K).m89034R(AbstractC23222t7.f112566j);
            c22126c0.mo111964L1(AbstractC23222t7.f112582r);
            c22126c0.mo111965M1(1);
            c22126c0.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
            c22126c0.m111961I1(Layout.Alignment.ALIGN_NORMAL);
            c22126c0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_view_all_list_collection));
            c22126c0.m111980v1(TextUtils.TruncateAt.END);
            this.f65278K.m89001g1(this.f65279L);
            mo69681L(this.f65278K);
        }

        public final C16716d getMContainer() {
            return this.f65278K;
        }

        public final C22126c0 getMTitle() {
            return this.f65279L;
        }

        public final void setMContainer(C16716d c16716d) {
            AbstractC19074t.m100208f(c16716d, "<set-?>");
            this.f65278K = c16716d;
        }

        public final void setMTitle(C22126c0 c22126c0) {
            AbstractC19074t.m100208f(c22126c0, "<set-?>");
            this.f65279L = c22126c0;
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.CarouselMyCloudCollectionView$a */
    /* loaded from: classes6.dex */
    public static final class C12462a extends C12463b {

        /* renamed from: I */
        private final ModulesView f65280I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12462a(ModulesView modulesView) {
            super(modulesView);
            AbstractC19074t.m100208f(modulesView, "itemView");
            this.f65280I = modulesView;
        }

        @Override // com.zing.zalo.p077ui.mycloud.CarouselMyCloudCollectionView.C12463b, com.zing.zalo.p077ui.mycloud.CarouselMyCloudCollectionView.InterfaceC12464c
        /* renamed from: b */
        public void mo70001b(C24799c c24799c, int i11, boolean z11) {
            AbstractC19074t.m100208f(c24799c, "item");
            ViewParent viewParent = this.f65280I;
            if (viewParent instanceof InterfaceC12464c) {
                ((InterfaceC12464c) viewParent).mo70001b(c24799c, i11, z11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.CarouselMyCloudCollectionView$b */
    /* loaded from: classes6.dex */
    public static class C12463b extends RecyclerView.AbstractC1876c0 implements InterfaceC12464c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12463b(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
        }

        /* renamed from: b */
        public abstract void mo70001b(C24799c c24799c, int i11, boolean z11);
    }

    /* renamed from: com.zing.zalo.ui.mycloud.CarouselMyCloudCollectionView$c */
    /* loaded from: classes6.dex */
    private interface InterfaceC12464c {
        /* renamed from: b */
        void mo70001b(C24799c c24799c, int i11, boolean z11);
    }

    /* renamed from: com.zing.zalo.ui.mycloud.CarouselMyCloudCollectionView$d */
    /* loaded from: classes6.dex */
    public static final class C12465d extends RecyclerView.AbstractC1880g {
        public static final a Companion = new a(null);

        /* renamed from: r */
        private final C23528a f65281r;

        /* renamed from: s */
        private final List f65282s;

        /* renamed from: t */
        private InterfaceC12466e f65283t;

        /* renamed from: com.zing.zalo.ui.mycloud.CarouselMyCloudCollectionView$d$a */
        /* loaded from: classes6.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        public C12465d(C23528a c23528a) {
            AbstractC19074t.m100208f(c23528a, "mAQ");
            this.f65281r = c23528a;
            this.f65282s = new ArrayList();
        }

        /* renamed from: O */
        public static final void m70003O(C12465d c12465d, int i11, View view) {
            AbstractC19074t.m100208f(c12465d, "this$0");
            InterfaceC12466e interfaceC12466e = c12465d.f65283t;
            if (interfaceC12466e != null) {
                interfaceC12466e.mo70011n(i11);
            }
        }

        /* renamed from: M */
        public final List m70004M() {
            return this.f65282s;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: N */
        public void mo9990A(C12463b c12463b, int i11) {
            AbstractC19074t.m100208f(c12463b, "holder");
            try {
                c12463b.mo70001b((C24799c) this.f65282s.get(i11), i11, false);
                c12463b.f7784p.setOnClickListener(new View.OnClickListener() { // from class: u80.h

                    /* renamed from: q */
                    public final /* synthetic */ int f127830q;

                    public /* synthetic */ ViewOnClickListenerC27127h(int i112) {
                        r2 = i112;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CarouselMyCloudCollectionView.C12465d.m70003O(CarouselMyCloudCollectionView.C12465d.this, r2, view);
                    }
                });
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: P */
        public C12463b mo9992C(ViewGroup viewGroup, int i11) {
            ModulesView viewAllModuleView;
            AbstractC19074t.m100208f(viewGroup, "parent");
            if (i11 != 1) {
                if (i11 != 2) {
                    Context context = viewGroup.getContext();
                    AbstractC19074t.m100207e(context, "getContext(...)");
                    viewAllModuleView = new MyCloudCollectionModuleView(context, this.f65281r);
                } else {
                    Context context2 = viewGroup.getContext();
                    AbstractC19074t.m100207e(context2, "getContext(...)");
                    viewAllModuleView = new AddModuleView(context2);
                }
            } else {
                Context context3 = viewGroup.getContext();
                AbstractC19074t.m100207e(context3, "getContext(...)");
                viewAllModuleView = new ViewAllModuleView(context3);
            }
            return new C12462a(viewAllModuleView);
        }

        /* renamed from: Q */
        public final void m70007Q(List list, int i11) {
            AbstractC19074t.m100208f(list, "itemList");
            this.f65282s.clear();
            this.f65282s.addAll(list);
            if (i11 == 0 && (!r1.isEmpty())) {
                this.f65282s.add(new C24799c(0L, null, 0, 0L, null, 0L, null, 0L, null, false, false, 2047, null));
            }
            m10008p();
        }

        /* renamed from: R */
        public final void m70008R(InterfaceC12466e interfaceC12466e) {
            this.f65283t = interfaceC12466e;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: k */
        public int mo10003k() {
            return this.f65282s.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
        /* renamed from: m */
        public int mo10005m(int i11) {
            if (i11 == mo10003k() - 1 && ((C24799c) this.f65282s.get(i11)).m128824d() == 0) {
                return 2;
            }
            return 0;
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.CarouselMyCloudCollectionView$e */
    /* loaded from: classes6.dex */
    public interface InterfaceC12466e {
        /* renamed from: a */
        void mo70009a();

        /* renamed from: b */
        void mo70010b(boolean z11);

        /* renamed from: n */
        void mo70011n(int i11);
    }

    /* renamed from: com.zing.zalo.ui.mycloud.CarouselMyCloudCollectionView$f */
    /* loaded from: classes6.dex */
    public static final class C12467f {
        private C12467f() {
        }

        public /* synthetic */ C12467f(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.CarouselMyCloudCollectionView$g */
    /* loaded from: classes6.dex */
    public static final class C12468g implements InterfaceC12466e {
        C12468g() {
        }

        @Override // com.zing.zalo.p077ui.mycloud.CarouselMyCloudCollectionView.InterfaceC12466e
        /* renamed from: a */
        public void mo70009a() {
        }

        @Override // com.zing.zalo.p077ui.mycloud.CarouselMyCloudCollectionView.InterfaceC12466e
        /* renamed from: b */
        public void mo70010b(boolean z11) {
            TransitionManager.beginDelayedTransition(CarouselMyCloudCollectionView.this);
        }

        @Override // com.zing.zalo.p077ui.mycloud.CarouselMyCloudCollectionView.InterfaceC12466e
        /* renamed from: n */
        public void mo70011n(int i11) {
            InterfaceC12466e listener = CarouselMyCloudCollectionView.this.getListener();
            if (listener != null) {
                listener.mo70011n(i11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.CarouselMyCloudCollectionView$h */
    /* loaded from: classes6.dex */
    public static final class C12469h extends RecyclerView.AbstractC1887n {
        C12469h() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(rect, "outRect");
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "state");
            super.mo10066g(rect, view, recyclerView, c1899z);
            int m9817A0 = recyclerView.m9817A0(view);
            if (m9817A0 == 0) {
                rect.left = AbstractC23222t7.f112586t;
            } else {
                rect.left = AbstractC23222t7.f112566j;
            }
            if (m9817A0 == c1899z.m10253b() - 1) {
                rect.right = AbstractC23222t7.f112586t;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.CarouselMyCloudCollectionView$i */
    /* loaded from: classes6.dex */
    public static final class C12470i implements FeedRecyclerView.InterfaceC8863b {
        C12470i() {
        }

        @Override // com.zing.zalo.feed.uicontrols.FeedRecyclerView.InterfaceC8863b
        /* renamed from: a */
        public void mo43265a() {
            CarouselMyCloudCollectionView.this.setAllowSlideBack(false);
        }

        @Override // com.zing.zalo.feed.uicontrols.FeedRecyclerView.InterfaceC8863b
        /* renamed from: b */
        public void mo43266b() {
            CarouselMyCloudCollectionView.this.setAllowSlideBack(true);
        }

        @Override // com.zing.zalo.feed.uicontrols.FeedRecyclerView.InterfaceC8863b
        /* renamed from: c */
        public void mo43267c() {
            CarouselMyCloudCollectionView.this.setAllowSlideBack(true);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CarouselMyCloudCollectionView(Context context, int i11) {
        this(context);
        AbstractC19074t.m100208f(context, "context");
        this.f65269y = i11;
        if (i11 == 1) {
            this.f65270z = false;
        }
    }

    /* renamed from: h */
    public static final void m69984h(CarouselMyCloudCollectionView carouselMyCloudCollectionView) {
        int i11;
        AbstractC19074t.m100208f(carouselMyCloudCollectionView, "this$0");
        carouselMyCloudCollectionView.m69995z();
        List m109048C0 = AbstractC23306f.m120602N0().m109048C0();
        carouselMyCloudCollectionView.setDataList(m109048C0);
        if (carouselMyCloudCollectionView.m69991r(m109048C0)) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        carouselMyCloudCollectionView.f65258C = i11;
        carouselMyCloudCollectionView.m69994y();
    }

    /* renamed from: i */
    public static final void m69985i(CarouselMyCloudCollectionView carouselMyCloudCollectionView) {
        AbstractC19074t.m100208f(carouselMyCloudCollectionView, "this$0");
        carouselMyCloudCollectionView.m69995z();
        List m109048C0 = AbstractC23306f.m120602N0().m109048C0();
        carouselMyCloudCollectionView.setDataList(m109048C0);
        if (carouselMyCloudCollectionView.m69991r(m109048C0)) {
            carouselMyCloudCollectionView.f65258C = 1;
        }
        carouselMyCloudCollectionView.m69994y();
    }

    /* renamed from: l */
    private final void m69986l() {
        int i11;
        setClickable(true);
        setBackgroundColor(C23212s8.m119607o(getContext(), AbstractC16781w.PrimaryBackgroundColor));
        C29869j5 m148112c = C29869j5.m148112c(LayoutInflater.from(getContext()));
        AbstractC19074t.m100207e(m148112c, "inflate(...)");
        this.f65261q = m148112c;
        View view = null;
        if (m148112c == null) {
            AbstractC19074t.m100223u("headerView");
            m148112c = null;
        }
        m148112c.getRoot().setId(AbstractC6918a0.collection_carousel_header);
        C29869j5 c29869j5 = this.f65261q;
        if (c29869j5 == null) {
            AbstractC19074t.m100223u("headerView");
            c29869j5 = null;
        }
        c29869j5.f138267q.setOnClickListener(new View.OnClickListener() { // from class: u80.d
            public /* synthetic */ ViewOnClickListenerC27111d() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CarouselMyCloudCollectionView.m69988n(CarouselMyCloudCollectionView.this, view2);
            }
        });
        int m119610r = C23212s8.m119610r(AbstractC2807a.icon_01);
        if (this.f65270z) {
            C29869j5 c29869j52 = this.f65261q;
            if (c29869j52 == null) {
                AbstractC19074t.m100223u("headerView");
                c29869j52 = null;
            }
            AppCompatImageView appCompatImageView = c29869j52.f138267q;
            Context context = getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            appCompatImageView.setImageDrawable(C27280g.m139659b(context, AbstractC23322a.zds_ic_chevron_down_line_16, m119610r));
        } else {
            C29869j5 c29869j53 = this.f65261q;
            if (c29869j53 == null) {
                AbstractC19074t.m100223u("headerView");
                c29869j53 = null;
            }
            AppCompatImageView appCompatImageView2 = c29869j53.f138267q;
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "getContext(...)");
            appCompatImageView2.setImageDrawable(C27280g.m139659b(context2, AbstractC23322a.zds_ic_chevron_up_line_16, m119610r));
        }
        C29869j5 c29869j54 = this.f65261q;
        if (c29869j54 == null) {
            AbstractC19074t.m100223u("headerView");
            c29869j54 = null;
        }
        c29869j54.getRoot().setOnClickListener(new View.OnClickListener() { // from class: u80.e
            public /* synthetic */ ViewOnClickListenerC27115e() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CarouselMyCloudCollectionView.m69989p(CarouselMyCloudCollectionView.this, view2);
            }
        });
        C29779e5 m147892c = C29779e5.m147892c(LayoutInflater.from(getContext()));
        AbstractC19074t.m100207e(m147892c, "inflate(...)");
        this.f65262r = m147892c;
        if (m147892c == null) {
            AbstractC19074t.m100223u("emptyView");
            m147892c = null;
        }
        Button button = m147892c.f137656q;
        button.setIdTracking("btn_create_my_cloud_collection");
        button.setOnClickListener(new View.OnClickListener() { // from class: u80.f
            public /* synthetic */ ViewOnClickListenerC27119f() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CarouselMyCloudCollectionView.m69990q(CarouselMyCloudCollectionView.this, view2);
            }
        });
        m147892c.getRoot().setVisibility(8);
        C29797f5 m147937c = C29797f5.m147937c(LayoutInflater.from(getContext()));
        AbstractC19074t.m100207e(m147937c, "inflate(...)");
        this.f65263s = m147937c;
        if (m147937c == null) {
            AbstractC19074t.m100223u("errorView");
            m147937c = null;
        }
        AppCompatImageView appCompatImageView3 = m147937c.f137740r;
        if (C23212s8.m119603k()) {
            i11 = AbstractC2808b.light_icon_02;
        } else {
            i11 = AbstractC2808b.dark_icon_02;
        }
        Context context3 = getContext();
        if (context3 != null) {
            AbstractC19074t.m100205c(context3);
            appCompatImageView3.setImageDrawable(C27280g.m139659b(context3, AbstractC23322a.zds_ic_warning_circle_line_24, i11));
        }
        Button button2 = m147937c.f137739q;
        button2.setIdTracking("btn_retry_sync_my_cloud_collection");
        button2.setOnClickListener(new View.OnClickListener() { // from class: u80.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CarouselMyCloudCollectionView.m69987m(view2);
            }
        });
        button2.m90539c(AbstractC2814h.ButtonSmall_SecondaryNeutral);
        m147937c.getRoot().setVisibility(8);
        CarouselMyCloudCollectionSkeletonView carouselMyCloudCollectionSkeletonView = this.f65266v;
        carouselMyCloudCollectionSkeletonView.m69977d();
        carouselMyCloudCollectionSkeletonView.setVisibility(8);
        C12465d c12465d = new C12465d(new C23528a(getContext()));
        c12465d.m70008R(new C12468g());
        this.f65267w = c12465d;
        FeedRecyclerView feedRecyclerView = new FeedRecyclerView(getContext());
        feedRecyclerView.setLayoutManager(new LinearLayoutManager(feedRecyclerView.getContext(), 0, false));
        C12465d c12465d2 = this.f65267w;
        if (c12465d2 == null) {
            AbstractC19074t.m100223u("rvAdapter");
            c12465d2 = null;
        }
        feedRecyclerView.setAdapter(c12465d2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        feedRecyclerView.setPadding(0, AbstractC23222t7.f112556e, 0, AbstractC23222t7.f112566j);
        feedRecyclerView.setLayoutParams(layoutParams);
        feedRecyclerView.m9816A(new C12469h());
        feedRecyclerView.setCatchTouchEventListener(new C12470i());
        this.f65260p = feedRecyclerView;
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(AbstractC6918a0.collection_carousel_content);
        RecyclerView recyclerView = this.f65260p;
        if (recyclerView == null) {
            AbstractC19074t.m100223u("rvCollectionList");
            recyclerView = null;
        }
        frameLayout.addView(recyclerView);
        C29779e5 c29779e5 = this.f65262r;
        if (c29779e5 == null) {
            AbstractC19074t.m100223u("emptyView");
            c29779e5 = null;
        }
        frameLayout.addView(c29779e5.getRoot());
        C29797f5 c29797f5 = this.f65263s;
        if (c29797f5 == null) {
            AbstractC19074t.m100223u("errorView");
            c29797f5 = null;
        }
        frameLayout.addView(c29797f5.getRoot());
        frameLayout.addView(this.f65266v);
        this.f65264t = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        frameLayout2.setBackgroundColor(C23212s8.m119607o(frameLayout2.getContext(), AbstractC16781w.PrimaryBackgroundColor));
        frameLayout2.setVisibility(8);
        frameLayout2.setClickable(true);
        frameLayout2.setFocusable(true);
        frameLayout2.setAlpha(0.6f);
        this.f65265u = frameLayout2;
        C29869j5 c29869j55 = this.f65261q;
        if (c29869j55 == null) {
            AbstractC19074t.m100223u("headerView");
            c29869j55 = null;
        }
        addView(c29869j55.getRoot(), new RelativeLayout.LayoutParams(-1, -2));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(3, AbstractC6918a0.collection_carousel_header);
        View view2 = this.f65264t;
        if (view2 == null) {
            AbstractC19074t.m100223u("contentContainerLayout");
            view2 = null;
        }
        addView(view2, layoutParams2);
        View view3 = this.f65265u;
        if (view3 == null) {
            AbstractC19074t.m100223u("disableOverlayView");
        } else {
            view = view3;
        }
        addView(view);
        Context context4 = getContext();
        AbstractC19074t.m100207e(context4, "getContext(...)");
        Divider divider = new Divider(context4);
        divider.m90563c(0, 0, 0, 0);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(3, AbstractC6918a0.collection_carousel_content);
        addView(divider, layoutParams3);
        m69995z();
    }

    /* renamed from: m */
    public static final void m69987m(View view) {
        C20843c0.Companion.m109092a().m109049C1();
    }

    /* renamed from: n */
    public static final void m69988n(CarouselMyCloudCollectionView carouselMyCloudCollectionView, View view) {
        AbstractC19074t.m100208f(carouselMyCloudCollectionView, "this$0");
        carouselMyCloudCollectionView.m69992s(!carouselMyCloudCollectionView.f65270z);
    }

    /* renamed from: p */
    public static final void m69989p(CarouselMyCloudCollectionView carouselMyCloudCollectionView, View view) {
        AbstractC19074t.m100208f(carouselMyCloudCollectionView, "this$0");
        carouselMyCloudCollectionView.m69992s(!carouselMyCloudCollectionView.f65270z);
    }

    /* renamed from: q */
    public static final void m69990q(CarouselMyCloudCollectionView carouselMyCloudCollectionView, View view) {
        AbstractC19074t.m100208f(carouselMyCloudCollectionView, "this$0");
        InterfaceC12466e interfaceC12466e = carouselMyCloudCollectionView.f65268x;
        if (interfaceC12466e != null) {
            interfaceC12466e.mo70009a();
        }
    }

    /* renamed from: r */
    private final boolean m69991r(List list) {
        return list.isEmpty();
    }

    /* renamed from: s */
    private final void m69992s(boolean z11) {
        int i11;
        if (this.f65270z == z11) {
            return;
        }
        this.f65270z = z11;
        m69993v();
        RecyclerView recyclerView = this.f65260p;
        if (recyclerView == null) {
            AbstractC19074t.m100223u("rvCollectionList");
            recyclerView = null;
        }
        if (this.f65270z) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        recyclerView.setVisibility(i11);
        m69994y();
        InterfaceC12466e interfaceC12466e = this.f65268x;
        if (interfaceC12466e != null) {
            interfaceC12466e.mo70010b(this.f65270z);
        }
        C21955a.f108070a.m114649p(!this.f65270z);
        this.f65256A = this.f65270z;
    }

    /* renamed from: v */
    private final void m69993v() {
        float f11;
        float f12 = this.f65257B;
        float f13 = 360.0f;
        if (f12 == 360.0f) {
            f11 = 0.0f;
        } else {
            f11 = f12;
        }
        if (f12 != 180.0f) {
            f13 = 180.0f;
        }
        RotateAnimation rotateAnimation = new RotateAnimation(f11, f13, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(200L);
        rotateAnimation.setFillAfter(true);
        C29869j5 c29869j5 = this.f65261q;
        C29869j5 c29869j52 = null;
        if (c29869j5 == null) {
            AbstractC19074t.m100223u("headerView");
            c29869j5 = null;
        }
        c29869j5.f138267q.clearAnimation();
        C29869j5 c29869j53 = this.f65261q;
        if (c29869j53 == null) {
            AbstractC19074t.m100223u("headerView");
        } else {
            c29869j52 = c29869j53;
        }
        c29869j52.f138267q.startAnimation(rotateAnimation);
        this.f65257B = f13;
    }

    /* renamed from: y */
    private final void m69994y() {
        int i11 = this.f65258C;
        int i12 = 0;
        FrameLayout frameLayout = null;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        RecyclerView recyclerView = this.f65260p;
                        if (recyclerView == null) {
                            AbstractC19074t.m100223u("rvCollectionList");
                            recyclerView = null;
                        }
                        recyclerView.setVisibility(0);
                        this.f65266v.setVisibility(8);
                        C29797f5 c29797f5 = this.f65263s;
                        if (c29797f5 == null) {
                            AbstractC19074t.m100223u("errorView");
                            c29797f5 = null;
                        }
                        c29797f5.getRoot().setVisibility(8);
                        C29779e5 c29779e5 = this.f65262r;
                        if (c29779e5 == null) {
                            AbstractC19074t.m100223u("emptyView");
                            c29779e5 = null;
                        }
                        c29779e5.getRoot().setVisibility(8);
                    }
                } else {
                    C29779e5 c29779e52 = this.f65262r;
                    if (c29779e52 == null) {
                        AbstractC19074t.m100223u("emptyView");
                        c29779e52 = null;
                    }
                    c29779e52.getRoot().setVisibility(0);
                    this.f65266v.setVisibility(8);
                    C29797f5 c29797f52 = this.f65263s;
                    if (c29797f52 == null) {
                        AbstractC19074t.m100223u("errorView");
                        c29797f52 = null;
                    }
                    c29797f52.getRoot().setVisibility(8);
                    RecyclerView recyclerView2 = this.f65260p;
                    if (recyclerView2 == null) {
                        AbstractC19074t.m100223u("rvCollectionList");
                        recyclerView2 = null;
                    }
                    recyclerView2.setVisibility(8);
                }
            } else {
                C29797f5 c29797f53 = this.f65263s;
                if (c29797f53 == null) {
                    AbstractC19074t.m100223u("errorView");
                    c29797f53 = null;
                }
                c29797f53.getRoot().setVisibility(0);
                this.f65266v.setVisibility(8);
                C29779e5 c29779e53 = this.f65262r;
                if (c29779e53 == null) {
                    AbstractC19074t.m100223u("emptyView");
                    c29779e53 = null;
                }
                c29779e53.getRoot().setVisibility(8);
                RecyclerView recyclerView3 = this.f65260p;
                if (recyclerView3 == null) {
                    AbstractC19074t.m100223u("rvCollectionList");
                    recyclerView3 = null;
                }
                recyclerView3.setVisibility(8);
            }
        } else {
            this.f65266v.setVisibility(0);
            C29779e5 c29779e54 = this.f65262r;
            if (c29779e54 == null) {
                AbstractC19074t.m100223u("emptyView");
                c29779e54 = null;
            }
            c29779e54.getRoot().setVisibility(8);
            C29797f5 c29797f54 = this.f65263s;
            if (c29797f54 == null) {
                AbstractC19074t.m100223u("errorView");
                c29797f54 = null;
            }
            c29797f54.getRoot().setVisibility(8);
            RecyclerView recyclerView4 = this.f65260p;
            if (recyclerView4 == null) {
                AbstractC19074t.m100223u("rvCollectionList");
                recyclerView4 = null;
            }
            recyclerView4.setVisibility(8);
        }
        FrameLayout frameLayout2 = this.f65264t;
        if (frameLayout2 == null) {
            AbstractC19074t.m100223u("contentContainerLayout");
        } else {
            frameLayout = frameLayout2;
        }
        if (this.f65270z) {
            i12 = 8;
        }
        frameLayout.setVisibility(i12);
        requestLayout();
    }

    /* renamed from: z */
    private final void m69995z() {
        String m118743r0;
        int m109065O0 = C20843c0.Companion.m109092a().m109065O0();
        String valueOf = String.valueOf(m109065O0);
        if (m109065O0 > 1) {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_collection_listing_title_singular);
        } else {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_collection_listing_title_plural);
        }
        AbstractC19074t.m100205c(m118743r0);
        SpannableString spannableString = new SpannableString(m118743r0 + "  " + valueOf);
        spannableString.setSpan(new ForegroundColorSpan(C23212s8.m119606n(AbstractC2807a.section_label)), 0, m118743r0.length(), 18);
        spannableString.setSpan(new ForegroundColorSpan(C23212s8.m119607o(getContext(), AbstractC2807a.text_02)), spannableString.length() - valueOf.length(), spannableString.length(), 18);
        C29869j5 c29869j5 = this.f65261q;
        if (c29869j5 == null) {
            AbstractC19074t.m100223u("headerView");
            c29869j5 = null;
        }
        c29869j5.f138268r.setText(spannableString);
    }

    /* renamed from: g */
    public final void m69996g(boolean z11) {
        int i11;
        if (this.f65270z == z11) {
            return;
        }
        if (!z11 && this.f65256A) {
            return;
        }
        this.f65270z = z11;
        m69993v();
        RecyclerView recyclerView = this.f65260p;
        if (recyclerView == null) {
            AbstractC19074t.m100223u("rvCollectionList");
            recyclerView = null;
        }
        if (this.f65270z) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        recyclerView.setVisibility(i11);
        m69994y();
    }

    public final boolean getAllowSlideBack() {
        return this.f65259D;
    }

    public final InterfaceC12466e getListener() {
        return this.f65268x;
    }

    /* renamed from: j */
    public final C24799c m69997j(int i11) {
        C12465d c12465d = this.f65267w;
        if (c12465d == null) {
            AbstractC19074t.m100223u("rvAdapter");
            c12465d = null;
        }
        return (C24799c) c12465d.m70004M().get(i11);
    }

    /* renamed from: k */
    public final int m69998k(int i11) {
        C12465d c12465d = this.f65267w;
        if (c12465d == null) {
            AbstractC19074t.m100223u("rvAdapter");
            c12465d = null;
        }
        return c12465d.mo10005m(i11);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        int i11;
        super.onAttachedToWindow();
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124115b(this, 5201);
        bVar.m124119a().m124115b(this, 5203);
        bVar.m124119a().m124115b(this, 5205);
        bVar.m124119a().m124115b(this, 5204);
        bVar.m124119a().m124115b(this, 5209);
        m69994y();
        List m109048C0 = AbstractC23306f.m120602N0().m109048C0();
        if (m69991r(m109048C0)) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        this.f65258C = i11;
        setDataList(m109048C0);
        if (!m69991r(m109048C0)) {
            m69994y();
        } else if (this.f65269y == 1) {
            if (!AbstractC23306f.m120602N0().m109087s1()) {
                AbstractC23306f.m120602N0().m109049C1();
            } else {
                m69994y();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124117e(this, 5201);
        bVar.m124119a().m124117e(this, 5203);
        bVar.m124119a().m124117e(this, 5205);
        bVar.m124119a().m124117e(this, 5204);
        bVar.m124119a().m124117e(this, 5209);
    }

    public final void setAllowSlideBack(boolean z11) {
        this.f65259D = z11;
    }

    public final void setDataList(List<C24799c> list) {
        AbstractC19074t.m100208f(list, "listCollection");
        C12465d c12465d = this.f65267w;
        if (c12465d == null) {
            AbstractC19074t.m100223u("rvAdapter");
            c12465d = null;
        }
        c12465d.m70007Q(list, this.f65269y);
    }

    public final void setListener(InterfaceC12466e interfaceC12466e) {
        this.f65268x = interfaceC12466e;
    }

    /* renamed from: u */
    public final void m69999u(boolean z11) {
        int i11;
        C29869j5 c29869j5 = this.f65261q;
        if (c29869j5 == null) {
            AbstractC19074t.m100223u("headerView");
            c29869j5 = null;
        }
        LinearLayout root = c29869j5.getRoot();
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        root.setVisibility(i11);
    }

    /* renamed from: w */
    public final void m70000w(boolean z11) {
        int i11;
        FrameLayout frameLayout = this.f65265u;
        FrameLayout frameLayout2 = null;
        if (frameLayout == null) {
            AbstractC19074t.m100223u("disableOverlayView");
            frameLayout = null;
        }
        if (z11) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        frameLayout.setVisibility(i11);
        if (!z11) {
            FrameLayout frameLayout3 = this.f65265u;
            if (frameLayout3 == null) {
                AbstractC19074t.m100223u("disableOverlayView");
            } else {
                frameLayout2 = frameLayout3;
            }
            frameLayout2.getLayoutParams().height = getHeight();
        }
    }

    @Override // p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 != 5201) {
            if (i11 == 5209) {
                C21956b.m114657g("SMLMyCloudCollection", "Post event [NOTIFY_SYNC_LIST_COLLECTION_FROM_SERVER_ERROR]");
                AbstractC19444a.m101697e(new Runnable() { // from class: u80.c
                    public /* synthetic */ RunnableC27107c() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        CarouselMyCloudCollectionView.m69985i(CarouselMyCloudCollectionView.this);
                    }
                });
                return;
            } else {
                switch (i11) {
                    case 5203:
                    case 5204:
                    case 5205:
                        break;
                    default:
                        return;
                }
            }
        }
        AbstractC19444a.m101697e(new Runnable() { // from class: u80.b
            public /* synthetic */ RunnableC27103b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                CarouselMyCloudCollectionView.m69984h(CarouselMyCloudCollectionView.this);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselMyCloudCollectionView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        this.f65266v = new CarouselMyCloudCollectionSkeletonView(context2);
        this.f65270z = true;
        this.f65256A = true;
        this.f65259D = true;
        m69986l();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselMyCloudCollectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        this.f65266v = new CarouselMyCloudCollectionSkeletonView(context2);
        this.f65270z = true;
        this.f65256A = true;
        this.f65259D = true;
        m69986l();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselMyCloudCollectionView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        this.f65266v = new CarouselMyCloudCollectionSkeletonView(context2);
        this.f65270z = true;
        this.f65256A = true;
        this.f65259D = true;
        m69986l();
    }
}
