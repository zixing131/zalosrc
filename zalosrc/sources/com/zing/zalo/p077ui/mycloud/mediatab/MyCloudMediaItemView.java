package com.zing.zalo.p077ui.mycloud.mediatab;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.AbstractC1388a;
import b40.C2535j;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import ch0.AbstractC3489d;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView;
import com.zing.zalo.p077ui.mycloud.mediatab.MyCloudMediaItemView;
import com.zing.zalo.p077ui.mycloud.model.MyCloudMessageItem;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zview.animation.AnimationTarget;
import dj.C17945a0;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import gw.AbstractC19646n0;
import ho0.AbstractC20110a;
import java.util.Arrays;
import kd0.C21691a;
import kd0.C21693c;
import l80.C22122a0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p354n3.C23528a;
import p716zh.C32175x6;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import u80.InterfaceC27158o2;
import ui0.C27280g;
import x70.C29428k0;

/* loaded from: classes6.dex */
public final class MyCloudMediaItemView extends ModulesView implements AnimationTarget {

    /* renamed from: K */
    private C21691a f65834K;

    /* renamed from: L */
    private C21693c f65835L;

    /* renamed from: M */
    private C22122a0 f65836M;

    /* renamed from: N */
    private C16716d f65837N;

    /* renamed from: O */
    private final RecyclingImageView f65838O;

    /* renamed from: P */
    private GradientDrawable f65839P;

    /* renamed from: Q */
    private C21693c f65840Q;

    /* renamed from: R */
    private C21693c f65841R;

    /* renamed from: S */
    private C23528a f65842S;

    /* renamed from: T */
    private MyCloudMessageItem f65843T;

    /* renamed from: U */
    private int f65844U;

    /* renamed from: V */
    private int f65845V;

    /* renamed from: W */
    private int f65846W;

    /* renamed from: a0 */
    private C29428k0 f65847a0;

    /* renamed from: b0 */
    private final InterfaceC24854k f65848b0;

    /* renamed from: c0 */
    private final InterfaceC24854k f65849c0;

    /* renamed from: d0 */
    private BaseMyCloudTabView.AbstractC12510b f65850d0;

    /* renamed from: e0 */
    private InterfaceC27158o2 f65851e0;

    /* renamed from: f0 */
    private boolean f65852f0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.mycloud.mediatab.MyCloudMediaItemView$a */
    /* loaded from: classes6.dex */
    public static final class C12626a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ MyCloudMessageItem f65853q;

        /* renamed from: r */
        final /* synthetic */ MyCloudMediaItemView f65854r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12626a(MyCloudMessageItem myCloudMessageItem, MyCloudMediaItemView myCloudMediaItemView) {
            super(0);
            this.f65853q = myCloudMessageItem;
            this.f65854r = myCloudMediaItemView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m71010a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m71010a() {
            if (this.f65853q.m71033m().m94849A8()) {
                MyCloudMediaItemView myCloudMediaItemView = this.f65854r;
                C21693c c21693c = myCloudMediaItemView.f65841R;
                if (c21693c == null) {
                    AbstractC19074t.m100223u("outCloudIcon");
                    c21693c = null;
                }
                myCloudMediaItemView.mo69681L(c21693c);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.mediatab.MyCloudMediaItemView$b */
    /* loaded from: classes6.dex */
    public static final class C12627b implements C29428k0.h {

        /* renamed from: b */
        final /* synthetic */ C17945a0 f65856b;

        C12627b(C17945a0 c17945a0) {
            this.f65856b = c17945a0;
        }

        @Override // x70.C29428k0.h
        /* renamed from: a */
        public void mo65107a(C29428k0.a aVar, C32175x6 c32175x6) {
            AbstractC19074t.m100208f(aVar, "photoEntity");
            AbstractC19074t.m100208f(c32175x6, "photoItem");
        }

        @Override // x70.C29428k0.h
        /* renamed from: b */
        public void mo65108b(C29428k0.a aVar, C32175x6 c32175x6) {
            C17945a0 c17945a0;
            AbstractC19074t.m100208f(aVar, "photoEntity");
            MyCloudMessageItem data = MyCloudMediaItemView.this.getData();
            if (data != null) {
                c17945a0 = data.m71033m();
            } else {
                c17945a0 = null;
            }
            if (!AbstractC19074t.m100204b(c17945a0, this.f65856b)) {
                return;
            }
            MyCloudMediaItemView.this.m71009p0(c17945a0, c17945a0.m95022U7());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.mycloud.mediatab.MyCloudMediaItemView$c */
    /* loaded from: classes6.dex */
    public static final class C12628c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f65857q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12628c(Context context) {
            super(0);
            this.f65857q = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Drawable mo12V4() {
            return AbstractC23136l9.m118665N(this.f65857q, AbstractC16803z.btn_radio_on_holo_light);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.mycloud.mediatab.MyCloudMediaItemView$d */
    /* loaded from: classes6.dex */
    public static final class C12629d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f65858q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12629d(Context context) {
            super(0);
            this.f65858q = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Drawable mo12V4() {
            return AbstractC23136l9.m118665N(this.f65858q, AbstractC16803z.ic_unchecked_radio_button_header);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyCloudMediaItemView(Context context) {
        super(context);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(context, "context");
        this.f65838O = new RecyclingImageView(context);
        this.f65842S = new C23528a(context);
        m129210a = AbstractC24856m.m129210a(new C12629d(context));
        this.f65848b0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C12628c(context));
        this.f65849c0 = m129210a2;
        m71008m0();
    }

    /* renamed from: c0 */
    private final void m70996c0() {
        int i11;
        if (this.f65835L == null) {
            C21693c c21693c = new C21693c(getContext());
            c21693c.m89106L().m89028L(-1, -1);
            c21693c.mo89109M0(new C16719g.c() { // from class: a90.c
                public /* synthetic */ C0665c() {
                }

                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    MyCloudMediaItemView.m70998e0(MyCloudMediaItemView.this, c16719g);
                }
            });
            c21693c.m89111N0(new C16719g.d() { // from class: a90.d
                public /* synthetic */ C0666d() {
                }

                @Override // com.zing.zalo.uidrawing.C16719g.d
                /* renamed from: f */
                public final void mo942f(C16719g c16719g) {
                    MyCloudMediaItemView.m70999f0(MyCloudMediaItemView.this, c16719g);
                }
            });
            this.f65835L = c21693c;
        }
        if (this.f65834K == null) {
            C21691a c21691a = new C21691a(getContext());
            c21691a.m89106L().m89060k0(AbstractC23222t7.f112514B).m89030N(AbstractC23222t7.f112514B).m89017A(Boolean.TRUE).m89036T(AbstractC23222t7.f112566j).m89035S(AbstractC23222t7.f112566j);
            c21691a.m111906k1(getMDrawableNormal());
            c21691a.m111905j1(getMDrawableChecked());
            c21691a.mo89107L0(new C16719g.b() { // from class: a90.e
                public /* synthetic */ C0667e() {
                }

                @Override // com.zing.zalo.uidrawing.C16719g.b
                /* renamed from: a */
                public final void mo945a(C16719g c16719g, boolean z11) {
                    MyCloudMediaItemView.m70997d0(MyCloudMediaItemView.this, c16719g, z11);
                }
            });
            this.f65834K = c21691a;
        }
        C21693c c21693c2 = this.f65835L;
        boolean z11 = false;
        if (c21693c2 != null) {
            MyCloudMessageItem myCloudMessageItem = this.f65843T;
            if (myCloudMessageItem != null && myCloudMessageItem.m71022f()) {
                i11 = AbstractC23136l9.m118641B(getContext(), AbstractC16801x.black_60);
            } else {
                i11 = 0;
            }
            c21693c2.mo89161z0(i11);
            mo69681L(c21693c2);
        }
        C21691a c21691a2 = this.f65834K;
        if (c21691a2 != null) {
            MyCloudMessageItem myCloudMessageItem2 = this.f65843T;
            if (myCloudMessageItem2 != null) {
                z11 = myCloudMessageItem2.m71022f();
            }
            c21691a2.mo89091D0(z11);
            mo69681L(c21691a2);
        }
    }

    /* renamed from: d0 */
    public static final void m70997d0(MyCloudMediaItemView myCloudMediaItemView, C16719g c16719g, boolean z11) {
        AbstractC19074t.m100208f(myCloudMediaItemView, "this$0");
        MyCloudMessageItem myCloudMessageItem = myCloudMediaItemView.f65843T;
        if (myCloudMessageItem == null || z11 != myCloudMessageItem.m71022f()) {
            myCloudMediaItemView.m71006o0(z11);
        }
    }

    /* renamed from: e0 */
    public static final void m70998e0(MyCloudMediaItemView myCloudMediaItemView, C16719g c16719g) {
        C21691a c21691a;
        AbstractC19074t.m100208f(myCloudMediaItemView, "this$0");
        if (myCloudMediaItemView.f65852f0 && (c21691a = myCloudMediaItemView.f65834K) != null) {
            c21691a.mo89091D0(!c21691a.m89141i0());
        }
    }

    /* renamed from: f0 */
    public static final void m70999f0(MyCloudMediaItemView myCloudMediaItemView, C16719g c16719g) {
        MyCloudMessageItem myCloudMessageItem;
        InterfaceC27158o2 interfaceC27158o2;
        AbstractC19074t.m100208f(myCloudMediaItemView, "this$0");
        if (myCloudMediaItemView.f65852f0 && (myCloudMessageItem = myCloudMediaItemView.f65843T) != null && (interfaceC27158o2 = myCloudMediaItemView.f65851e0) != null) {
            InterfaceC27158o2.a.m139263a(interfaceC27158o2, myCloudMessageItem, myCloudMediaItemView.f65844U, null, 4, null);
        }
    }

    /* renamed from: g0 */
    private final void m71000g0() {
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format("image#%s", Arrays.copyOf(new Object[]{Integer.valueOf(this.f65844U)}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        setTag(format);
        m71003k0();
        m71005n0();
    }

    private final Drawable getMDrawableChecked() {
        return (Drawable) this.f65849c0.getValue();
    }

    private final Drawable getMDrawableNormal() {
        return (Drawable) this.f65848b0.getValue();
    }

    /* renamed from: i0 */
    public static final boolean m71001i0(MyCloudMediaItemView myCloudMediaItemView, MyCloudMessageItem myCloudMessageItem, int i11, View view) {
        AbstractC19074t.m100208f(myCloudMediaItemView, "this$0");
        AbstractC19074t.m100208f(myCloudMessageItem, "$data");
        InterfaceC27158o2 interfaceC27158o2 = myCloudMediaItemView.f65851e0;
        if (interfaceC27158o2 != null) {
            InterfaceC27158o2.a.m139263a(interfaceC27158o2, myCloudMessageItem, i11, null, 4, null);
            return false;
        }
        return false;
    }

    /* renamed from: j0 */
    public static final void m71002j0(MyCloudMediaItemView myCloudMediaItemView, MyCloudMessageItem myCloudMessageItem, View view) {
        AbstractC19074t.m100208f(myCloudMediaItemView, "this$0");
        AbstractC19074t.m100208f(myCloudMessageItem, "$data");
        BaseMyCloudTabView.AbstractC12510b abstractC12510b = myCloudMediaItemView.f65850d0;
        if (abstractC12510b != null) {
            abstractC12510b.mo70381C(myCloudMediaItemView, myCloudMessageItem.m71033m());
        }
    }

    /* renamed from: k0 */
    private final void m71003k0() {
        if (this.f65839P == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(C23212s8.m119607o(getContext(), AbstractC16781w.PrimaryBackgroundColor));
            this.f65839P = gradientDrawable;
        }
    }

    /* renamed from: l0 */
    private final void m71004l0() {
        int i11;
        C22122a0 c22122a0 = new C22122a0(getContext());
        c22122a0.m89106L().m89028L(-1, -1);
        c22122a0.m111929z1(5);
        this.f65836M = c22122a0;
        mo69681L(c22122a0);
        Drawable m6964f = AbstractC1388a.m6964f(getContext(), AbstractC16803z.icon_video);
        C21693c c21693c = new C21693c(getContext());
        c21693c.mo111925v1(m6964f);
        int i12 = 0;
        if (m6964f != null) {
            i11 = m6964f.getIntrinsicWidth();
        } else {
            i11 = 0;
        }
        if (m6964f != null) {
            i12 = m6964f.getIntrinsicHeight();
        }
        c21693c.m89106L().m89060k0(i11).m89030N(i12).m89034R(AbstractC23222t7.f112554d).m89036T(AbstractC23222t7.f112554d);
        this.f65840Q = c21693c;
        mo69681L(c21693c);
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        Drawable m139660c = C27280g.m139660c(context, AbstractC2810d.zds_ic_cloud_slash_solid_24, AbstractC2807a.icon_04);
        C21693c c21693c2 = new C21693c(getContext());
        c21693c2.mo111925v1(m139660c);
        c21693c2.m89085A0(AbstractC23136l9.m118663M(AbstractC16803z.bg_out_cloud_icon));
        c21693c2.m89106L().m89060k0(AbstractC23136l9.m118742r(20.0f)).m89030N(AbstractC23136l9.m118742r(20.0f)).m89034R(AbstractC23222t7.f112562h).m89033Q(AbstractC23222t7.f112562h).m89072y(Boolean.TRUE).m89041Y(AbstractC23222t7.f112552c);
        this.f65841R = c21693c2;
        mo69681L(c21693c2);
    }

    /* renamed from: n0 */
    private final void m71005n0() {
        MyCloudMessageItem myCloudMessageItem = this.f65843T;
        if (myCloudMessageItem == null) {
            return;
        }
        try {
            C17945a0 m71033m = myCloudMessageItem.m71033m();
            if (m71033m.m95022U7()) {
                m71009p0(m71033m, true);
                return;
            }
            m71009p0(m71033m, false);
            C29428k0 c29428k0 = this.f65847a0;
            if (c29428k0 == null) {
                Context context = getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                C23528a c23528a = this.f65842S;
                C22122a0 c22122a0 = this.f65836M;
                if (c22122a0 == null) {
                    AbstractC19074t.m100223u("imageModule");
                    c22122a0 = null;
                }
                C29428k0 c29428k02 = new C29428k0(3, context, c23528a, c22122a0, this.f65838O, new C29428k0.b(m71033m));
                c29428k02.m146628d0(2);
                c29428k02.m146624Z(this.f65839P);
                c29428k02.m146627c0(new C12627b(m71033m));
                c29428k02.m146623O();
                this.f65847a0 = c29428k02;
                return;
            }
            if (c29428k0 != null) {
                c29428k0.m146624Z(this.f65839P);
                c29428k0.m146626b0(new C29428k0.b(m71033m));
                c29428k0.m146623O();
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: o0 */
    private final void m71006o0(boolean z11) {
        InterfaceC27158o2 interfaceC27158o2;
        int i11;
        C21693c c21693c = this.f65835L;
        if (c21693c != null) {
            if (z11) {
                i11 = AbstractC23136l9.m118641B(getContext(), AbstractC16801x.black_60);
            } else {
                i11 = 0;
            }
            c21693c.mo89161z0(i11);
        }
        MyCloudMessageItem myCloudMessageItem = this.f65843T;
        if (myCloudMessageItem != null && (interfaceC27158o2 = this.f65851e0) != null) {
            interfaceC27158o2.mo70518a(myCloudMessageItem, z11);
        }
    }

    @Override // com.zing.zalo.zview.animation.AnimationTarget
    public Rect getAnimTargetLocationOnScreen() {
        C17945a0 c17945a0;
        MyCloudMessageItem myCloudMessageItem = this.f65843T;
        if (myCloudMessageItem != null) {
            c17945a0 = myCloudMessageItem.m71033m();
        } else {
            c17945a0 = null;
        }
        if (c17945a0 == null) {
            return null;
        }
        Rect rect = new Rect();
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        int i11 = iArr[0];
        rect.left = i11;
        int i12 = iArr[1];
        rect.top = i12;
        rect.right = i11 + this.f65845V;
        rect.bottom = i12 + this.f65846W;
        return rect;
    }

    public final MyCloudMessageItem getData() {
        return this.f65843T;
    }

    public final BaseMyCloudTabView.AbstractC12510b getDelegate() {
        return this.f65850d0;
    }

    public final boolean getEnableMultiSelection() {
        return this.f65852f0;
    }

    public final InterfaceC27158o2 getSelectEventListener() {
        return this.f65851e0;
    }

    /* renamed from: h0 */
    public final void m71007h0(MyCloudMessageItem myCloudMessageItem, int i11, int i12, int i13) {
        AbstractC19074t.m100208f(myCloudMessageItem, "data");
        this.f65845V = i12;
        this.f65846W = i13;
        setLayoutParams(new ViewGroup.LayoutParams(i12, i13));
        this.f65844U = i11;
        this.f65843T = myCloudMessageItem;
        mo44090O();
        C22122a0 c22122a0 = this.f65836M;
        C21693c c21693c = null;
        if (c22122a0 == null) {
            AbstractC19074t.m100223u("imageModule");
            c22122a0 = null;
        }
        mo69681L(c22122a0);
        if (AbstractC19646n0.m102886D1(myCloudMessageItem.m71033m().m95041W4())) {
            C21693c c21693c2 = this.f65840Q;
            if (c21693c2 == null) {
                AbstractC19074t.m100223u("videoIcon");
                c21693c2 = null;
            }
            mo69681L(c21693c2);
        }
        if (myCloudMessageItem.m71033m().m94849A8()) {
            C21693c c21693c3 = this.f65841R;
            if (c21693c3 == null) {
                AbstractC19074t.m100223u("outCloudIcon");
            } else {
                c21693c = c21693c3;
            }
            mo69681L(c21693c);
        }
        m71000g0();
        setOnLongClickListener(new View.OnLongClickListener() { // from class: a90.a

            /* renamed from: q */
            public final /* synthetic */ MyCloudMessageItem f2220q;

            /* renamed from: r */
            public final /* synthetic */ int f2221r;

            public /* synthetic */ ViewOnLongClickListenerC0663a(MyCloudMessageItem myCloudMessageItem2, int i112) {
                r2 = myCloudMessageItem2;
                r3 = i112;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean m71001i0;
                m71001i0 = MyCloudMediaItemView.m71001i0(MyCloudMediaItemView.this, r2, r3, view);
                return m71001i0;
            }
        });
        setOnClickListener(new View.OnClickListener() { // from class: a90.b

            /* renamed from: q */
            public final /* synthetic */ MyCloudMessageItem f2223q;

            public /* synthetic */ ViewOnClickListenerC0664b(MyCloudMessageItem myCloudMessageItem2) {
                r2 = myCloudMessageItem2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyCloudMediaItemView.m71002j0(MyCloudMediaItemView.this, r2, view);
            }
        });
        if (this.f65852f0) {
            m70996c0();
        }
        AbstractC3489d.m17517y(myCloudMessageItem2.m71033m(), new C12626a(myCloudMessageItem2, this));
    }

    /* renamed from: m0 */
    public final void m71008m0() {
        m71004l0();
    }

    /* renamed from: p0 */
    public final void m71009p0(C17945a0 c17945a0, boolean z11) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        C21693c c21693c = null;
        if (z11) {
            C16716d c16716d = new C16716d(getContext());
            c16716d.m89087B0(AbstractC16803z.chat_icloud_default);
            c16716d.m89106L().m89060k0(-1).m89030N(-1).m89041Y(AbstractC23222t7.f112566j).m89029M(15);
            C21693c c21693c2 = new C21693c(getContext());
            c21693c2.m89106L().m89060k0(-2).m89030N(-2).m89026J(true);
            c21693c2.m111929z1(4);
            if (AbstractC19646n0.m102886D1(c17945a0.m95041W4())) {
                Context context = c21693c2.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                Drawable m139660c = C27280g.m139660c(context, AbstractC2810d.zds_ic_video_failed_solid_24, AbstractC2807a.icon_03);
                if (m139660c != null) {
                    c21693c2.mo111925v1(m139660c);
                }
            } else {
                Context context2 = c21693c2.getContext();
                AbstractC19074t.m100207e(context2, "getContext(...)");
                Drawable m139660c2 = C27280g.m139660c(context2, AbstractC2810d.zds_ic_photo_error_solid_24, AbstractC2807a.icon_03);
                if (m139660c2 != null) {
                    c21693c2.mo111925v1(m139660c2);
                }
            }
            c16716d.m89001g1(c21693c2);
            this.f65837N = c16716d;
            mo69681L(c16716d);
            c16716d.mo44614b1(0);
            C21693c c21693c3 = this.f65840Q;
            if (c21693c3 == null) {
                AbstractC19074t.m100223u("videoIcon");
                c21693c3 = null;
            }
            c21693c3.mo44614b1(8);
            C21693c c21693c4 = this.f65841R;
            if (c21693c4 == null) {
                AbstractC19074t.m100223u("outCloudIcon");
            } else {
                c21693c = c21693c4;
            }
            c21693c.mo44614b1(8);
        } else {
            C16716d c16716d2 = this.f65837N;
            if (c16716d2 != null) {
                c16716d2.mo44614b1(8);
            }
            C21693c c21693c5 = this.f65840Q;
            if (c21693c5 == null) {
                AbstractC19074t.m100223u("videoIcon");
                c21693c5 = null;
            }
            c21693c5.mo44614b1(0);
            if (c17945a0.m94849A8()) {
                C21693c c21693c6 = this.f65841R;
                if (c21693c6 == null) {
                    AbstractC19074t.m100223u("outCloudIcon");
                } else {
                    c21693c = c21693c6;
                }
                c21693c.mo44614b1(0);
            }
        }
        C2535j.f10308a.m12775s("csc", c17945a0, z11);
    }

    @Override // com.zing.zalo.zview.animation.AnimationTarget
    public void setAnimTargetVisibility(int i11) {
    }

    public final void setCheckBoModuleState(boolean z11) {
        int i11;
        C21693c c21693c = this.f65835L;
        if (c21693c != null) {
            if (z11) {
                i11 = AbstractC23136l9.m118641B(getContext(), AbstractC16801x.black_60);
            } else {
                i11 = 0;
            }
            c21693c.mo89161z0(i11);
        }
        C21691a c21691a = this.f65834K;
        if (c21691a != null) {
            c21691a.mo89091D0(z11);
        }
    }

    public final void setData(MyCloudMessageItem myCloudMessageItem) {
        this.f65843T = myCloudMessageItem;
    }

    public final void setDelegate(BaseMyCloudTabView.AbstractC12510b abstractC12510b) {
        this.f65850d0 = abstractC12510b;
    }

    public final void setEnableMultiSelection(boolean z11) {
        this.f65852f0 = z11;
    }

    public final void setSelectEventListener(InterfaceC27158o2 interfaceC27158o2) {
        this.f65851e0 = interfaceC27158o2;
    }
}
