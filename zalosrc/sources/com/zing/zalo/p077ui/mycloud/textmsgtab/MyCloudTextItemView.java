package com.zing.zalo.p077ui.mycloud.textmsgtab;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import com.showingphotolib.view.SimpleAnimationTarget;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView;
import com.zing.zalo.p077ui.mycloud.model.MyCloudItem;
import com.zing.zalo.p077ui.mycloud.model.MyCloudMessageItem;
import com.zing.zalo.p077ui.mycloud.textmsgtab.MyCloudTextItemView;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zview.animation.AnimationTarget;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import ib0.C20500d;
import ib0.C20503g;
import kd0.C21691a;
import kd0.C21693c;
import l80.C22126c0;
import ln0.AbstractC22543l;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import nb0.C23671b;
import on0.AbstractC24342w;
import p588vw.C28652r;
import ti0.C26705d;
import ti0.C26707f;
import u80.InterfaceC27158o2;

/* loaded from: classes6.dex */
public final class MyCloudTextItemView extends ModulesView {

    /* renamed from: K */
    private C22126c0 f65872K;

    /* renamed from: L */
    private C21691a f65873L;

    /* renamed from: M */
    private C21693c f65874M;

    /* renamed from: N */
    private C20503g f65875N;

    /* renamed from: O */
    private MyCloudItem f65876O;

    /* renamed from: P */
    private final int f65877P;

    /* renamed from: Q */
    private final int f65878Q;

    /* renamed from: R */
    private boolean f65879R;

    /* renamed from: S */
    private BaseMyCloudTabView.AbstractC12510b f65880S;

    /* renamed from: T */
    private Drawable f65881T;

    /* renamed from: U */
    private Drawable f65882U;

    /* renamed from: V */
    private InterfaceC27158o2 f65883V;

    /* renamed from: W */
    private boolean f65884W;

    /* renamed from: a0 */
    private int f65885a0;

    /* renamed from: com.zing.zalo.ui.mycloud.textmsgtab.MyCloudTextItemView$a */
    /* loaded from: classes6.dex */
    public static final class C12636a extends SimpleAnimationTarget {
        C12636a() {
        }

        @Override // com.showingphotolib.view.SimpleAnimationTarget, com.zing.zalo.zview.animation.AnimationTarget
        public Rect getAnimTargetLocationOnScreen() {
            int[] iArr = new int[2];
            MyCloudTextItemView.this.getLocationOnScreen(iArr);
            int i11 = iArr[0];
            return new Rect(i11, iArr[1], MyCloudTextItemView.this.getWidth() + i11, iArr[1] + MyCloudTextItemView.this.getHeight());
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.textmsgtab.MyCloudTextItemView$b */
    /* loaded from: classes6.dex */
    public static final class C12637b extends ClickableSpan {
        C12637b() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            AbstractC19074t.m100208f(view, "widget");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setColor(C23212s8.m119607o(MyCloudTextItemView.this.getContext(), AbstractC16781w.LinkColor));
            textPaint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.textmsgtab.MyCloudTextItemView$c */
    /* loaded from: classes6.dex */
    public static final class C12638c extends C20500d.a {
        C12638c() {
        }

        @Override // ib0.C20500d.a
        /* renamed from: c */
        public void mo35612c(String str) {
            MyCloudMessageItem myCloudMessageItem;
            BaseMyCloudTabView.AbstractC12510b delegate;
            MyCloudTextItemView.this.m71063q0();
            MyCloudItem myCloudItem = MyCloudTextItemView.this.f65876O;
            if (myCloudItem instanceof MyCloudMessageItem) {
                myCloudMessageItem = (MyCloudMessageItem) myCloudItem;
            } else {
                myCloudMessageItem = null;
            }
            if (myCloudMessageItem != null && (delegate = MyCloudTextItemView.this.getDelegate()) != null) {
                delegate.mo70395n(myCloudMessageItem.m71033m(), str);
            }
        }

        @Override // ib0.C20500d.a
        /* renamed from: d */
        public void mo35613d() {
            MyCloudMessageItem myCloudMessageItem;
            MyCloudTextItemView myCloudTextItemView;
            BaseMyCloudTabView.AbstractC12510b delegate;
            MyCloudItem myCloudItem = MyCloudTextItemView.this.f65876O;
            if (myCloudItem instanceof MyCloudMessageItem) {
                myCloudMessageItem = (MyCloudMessageItem) myCloudItem;
            } else {
                myCloudMessageItem = null;
            }
            if (myCloudMessageItem != null && (delegate = (myCloudTextItemView = MyCloudTextItemView.this).getDelegate()) != null) {
                delegate.mo70404w(myCloudMessageItem, myCloudTextItemView.getAnimationTarget());
            }
        }

        @Override // ib0.C20500d.a
        /* renamed from: e */
        public void mo70938e() {
            MyCloudMessageItem myCloudMessageItem;
            MyCloudTextItemView myCloudTextItemView;
            InterfaceC27158o2 selectEventListener;
            MyCloudItem myCloudItem = MyCloudTextItemView.this.f65876O;
            if (myCloudItem instanceof MyCloudMessageItem) {
                myCloudMessageItem = (MyCloudMessageItem) myCloudItem;
            } else {
                myCloudMessageItem = null;
            }
            MyCloudMessageItem myCloudMessageItem2 = myCloudMessageItem;
            if (myCloudMessageItem2 != null && (selectEventListener = (myCloudTextItemView = MyCloudTextItemView.this).getSelectEventListener()) != null) {
                InterfaceC27158o2.a.m139263a(selectEventListener, myCloudMessageItem2, myCloudTextItemView.f65885a0, null, 4, null);
            }
        }

        @Override // ib0.C20500d.a
        /* renamed from: f */
        public void mo70060f(String str) {
            MyCloudTextItemView.this.m71063q0();
            BaseMyCloudTabView.AbstractC12510b delegate = MyCloudTextItemView.this.getDelegate();
            if (delegate != null) {
                delegate.mo70398q(str);
            }
        }
    }

    public MyCloudTextItemView(Context context) {
        super(context);
        this.f65877P = 3;
        this.f65878Q = AbstractC23136l9.m118722k0() - AbstractC23222t7.f112545X;
        this.f65879R = true;
        this.f65885a0 = -1;
        m71067m0();
    }

    /* renamed from: g0 */
    private final void m71055g0() {
        boolean z11;
        Context context;
        int i11;
        if (this.f65881T == null) {
            this.f65881T = AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_unchecked_radio_button_header);
        }
        if (this.f65882U == null) {
            this.f65882U = AbstractC23136l9.m118665N(getContext(), AbstractC16803z.btn_radio_on_holo_light);
        }
        if (this.f65874M == null) {
            C21693c c21693c = new C21693c(getContext());
            c21693c.m89106L().m89028L(-1, -1);
            c21693c.m89085A0(AbstractC23136l9.m118665N(c21693c.getContext(), AbstractC16803z.bg_black60_corner_8));
            c21693c.mo89109M0(new C16719g.c() { // from class: c90.d
                public /* synthetic */ C3376d() {
                }

                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    MyCloudTextItemView.m71057i0(MyCloudTextItemView.this, c16719g);
                }
            });
            c21693c.m89111N0(new C16719g.d() { // from class: c90.e
                public /* synthetic */ C3377e() {
                }

                @Override // com.zing.zalo.uidrawing.C16719g.d
                /* renamed from: f */
                public final void mo942f(C16719g c16719g) {
                    MyCloudTextItemView.m71056h0(MyCloudTextItemView.this, c16719g);
                }
            });
            mo69681L(c21693c);
            this.f65874M = c21693c;
        }
        C21693c c21693c2 = this.f65874M;
        if (c21693c2 != null) {
            MyCloudItem myCloudItem = this.f65876O;
            if (myCloudItem != null && myCloudItem.m71022f()) {
                context = getContext();
                i11 = AbstractC16803z.bg_black60_corner_8;
            } else {
                context = getContext();
                i11 = AbstractC16803z.bg_transparent_corner_8;
            }
            c21693c2.m89085A0(AbstractC23136l9.m118665N(context, i11));
        }
        if (this.f65873L == null) {
            C21691a c21691a = new C21691a(getContext());
            c21691a.m89106L().m89060k0(AbstractC23222t7.f112514B).m89030N(AbstractC23222t7.f112514B).m89017A(Boolean.TRUE).m89036T(AbstractC23222t7.f112566j).m89035S(AbstractC23222t7.f112566j);
            c21691a.m111906k1(this.f65881T);
            c21691a.m111905j1(this.f65882U);
            c21691a.mo89107L0(new C16719g.b() { // from class: c90.f
                public /* synthetic */ C3378f() {
                }

                @Override // com.zing.zalo.uidrawing.C16719g.b
                /* renamed from: a */
                public final void mo945a(C16719g c16719g, boolean z12) {
                    MyCloudTextItemView.m71058j0(MyCloudTextItemView.this, c16719g, z12);
                }
            });
            mo69681L(c21691a);
            this.f65873L = c21691a;
        }
        C21691a c21691a2 = this.f65873L;
        if (c21691a2 != null) {
            MyCloudItem myCloudItem2 = this.f65876O;
            if (myCloudItem2 != null) {
                z11 = myCloudItem2.m71022f();
            } else {
                z11 = false;
            }
            c21691a2.mo89091D0(z11);
        }
    }

    public final AnimationTarget getAnimationTarget() {
        return new C12636a();
    }

    /* renamed from: h0 */
    public static final void m71056h0(MyCloudTextItemView myCloudTextItemView, C16719g c16719g) {
        MyCloudMessageItem myCloudMessageItem;
        InterfaceC27158o2 interfaceC27158o2;
        AbstractC19074t.m100208f(myCloudTextItemView, "this$0");
        MyCloudItem myCloudItem = myCloudTextItemView.f65876O;
        if (myCloudItem instanceof MyCloudMessageItem) {
            myCloudMessageItem = (MyCloudMessageItem) myCloudItem;
        } else {
            myCloudMessageItem = null;
        }
        MyCloudMessageItem myCloudMessageItem2 = myCloudMessageItem;
        if (myCloudMessageItem2 != null && (interfaceC27158o2 = myCloudTextItemView.f65883V) != null) {
            InterfaceC27158o2.a.m139263a(interfaceC27158o2, myCloudMessageItem2, myCloudTextItemView.f65885a0, null, 4, null);
        }
    }

    /* renamed from: i0 */
    public static final void m71057i0(MyCloudTextItemView myCloudTextItemView, C16719g c16719g) {
        C21691a c21691a;
        AbstractC19074t.m100208f(myCloudTextItemView, "this$0");
        if (myCloudTextItemView.f65884W && (c21691a = myCloudTextItemView.f65873L) != null) {
            c21691a.mo89091D0(!c21691a.m89141i0());
        }
    }

    /* renamed from: j0 */
    public static final void m71058j0(MyCloudTextItemView myCloudTextItemView, C16719g c16719g, boolean z11) {
        AbstractC19074t.m100208f(myCloudTextItemView, "this$0");
        MyCloudItem myCloudItem = myCloudTextItemView.f65876O;
        if (myCloudItem == null || z11 != myCloudItem.m71022f()) {
            myCloudTextItemView.m71062p0(z11);
        }
    }

    /* renamed from: l0 */
    private final SpannableStringBuilder m71059l0(CharSequence charSequence, int i11) {
        StaticLayout staticLayout;
        int m116584g;
        int m127178g0;
        int m127178g02;
        CharSequence subSequence;
        StaticLayout.Builder obtain;
        StaticLayout.Builder lineSpacing;
        StaticLayout.Builder alignment;
        StaticLayout.Builder includePad;
        C13704p1 c13704p1 = new C13704p1(1);
        c13704p1.setTypeface(Typeface.DEFAULT);
        c13704p1.setTextSize(AbstractC23222t7.f112584s);
        AbstractC11531v0.x3 x3Var = AbstractC11531v0.Companion;
        ((TextPaint) c13704p1).linkColor = x3Var.m62540U0();
        c13704p1.setColor(x3Var.m62543V0());
        if (Build.VERSION.SDK_INT >= 24) {
            obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), c13704p1, i11);
            lineSpacing = obtain.setLineSpacing(0.0f, 1.0f);
            alignment = lineSpacing.setAlignment(Layout.Alignment.ALIGN_NORMAL);
            includePad = alignment.setIncludePad(false);
            staticLayout = includePad.build();
        } else {
            staticLayout = new StaticLayout(charSequence, c13704p1, i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        AbstractC19074t.m100205c(staticLayout);
        if (staticLayout.getLineCount() > this.f65877P) {
            m116584g = AbstractC22543l.m116584g(staticLayout.getLineCount(), this.f65877P);
            int lineStart = staticLayout.getLineStart(m116584g);
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.btn_see_more);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            if (lineStart > m118743r0.length() + 10) {
                lineStart -= m118743r0.length() + 10;
            }
            String property = System.getProperty("line.separator");
            if (property == null) {
                property = "\n";
            }
            int i12 = lineStart - 1;
            m127178g0 = AbstractC24342w.m127178g0(charSequence, " ", i12, false, 4, null);
            m127178g02 = AbstractC24342w.m127178g0(charSequence, property, i12, false, 4, null);
            if (m127178g0 > 0) {
                subSequence = charSequence.subSequence(0, m127178g0);
            } else if (m127178g02 > 0) {
                subSequence = charSequence.subSequence(0, m127178g02);
            } else {
                subSequence = charSequence.subSequence(0, i12);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(subSequence);
            spannableStringBuilder.append((CharSequence) (" ... " + m118743r0));
            spannableStringBuilder.setSpan(new C12637b(), subSequence.length() + 5, subSequence.length() + 5 + m118743r0.length(), 33);
            return spannableStringBuilder;
        }
        return new SpannableStringBuilder(charSequence);
    }

    /* renamed from: n0 */
    public static final void m71060n0(MyCloudTextItemView myCloudTextItemView, View view) {
        MyCloudMessageItem myCloudMessageItem;
        BaseMyCloudTabView.AbstractC12510b abstractC12510b;
        AbstractC19074t.m100208f(myCloudTextItemView, "this$0");
        if (myCloudTextItemView.f65884W) {
            C21691a c21691a = myCloudTextItemView.f65873L;
            if (c21691a != null) {
                c21691a.mo89091D0(!c21691a.m89141i0());
                return;
            }
            return;
        }
        if (myCloudTextItemView.f65879R) {
            MyCloudItem myCloudItem = myCloudTextItemView.f65876O;
            if (myCloudItem instanceof MyCloudMessageItem) {
                myCloudMessageItem = (MyCloudMessageItem) myCloudItem;
            } else {
                myCloudMessageItem = null;
            }
            if (myCloudMessageItem != null && (abstractC12510b = myCloudTextItemView.f65880S) != null) {
                abstractC12510b.mo70404w(myCloudMessageItem, myCloudTextItemView.getAnimationTarget());
            }
        }
    }

    /* renamed from: o0 */
    public static final boolean m71061o0(MyCloudTextItemView myCloudTextItemView, View view) {
        MyCloudMessageItem myCloudMessageItem;
        InterfaceC27158o2 interfaceC27158o2;
        AbstractC19074t.m100208f(myCloudTextItemView, "this$0");
        myCloudTextItemView.mo88988c();
        MyCloudItem myCloudItem = myCloudTextItemView.f65876O;
        if (myCloudItem instanceof MyCloudMessageItem) {
            myCloudMessageItem = (MyCloudMessageItem) myCloudItem;
        } else {
            myCloudMessageItem = null;
        }
        MyCloudMessageItem myCloudMessageItem2 = myCloudMessageItem;
        if (myCloudMessageItem2 != null && (interfaceC27158o2 = myCloudTextItemView.f65883V) != null) {
            InterfaceC27158o2.a.m139263a(interfaceC27158o2, myCloudMessageItem2, myCloudTextItemView.f65885a0, null, 4, null);
            return false;
        }
        return false;
    }

    /* renamed from: p0 */
    private final void m71062p0(boolean z11) {
        MyCloudMessageItem myCloudMessageItem;
        InterfaceC27158o2 interfaceC27158o2;
        int i11;
        C21693c c21693c = this.f65874M;
        if (c21693c != null) {
            Context context = getContext();
            if (z11) {
                i11 = AbstractC16803z.bg_black60_corner_8;
            } else {
                i11 = AbstractC16803z.bg_transparent_corner_8;
            }
            c21693c.m89085A0(AbstractC23136l9.m118665N(context, i11));
        }
        MyCloudItem myCloudItem = this.f65876O;
        if (myCloudItem instanceof MyCloudMessageItem) {
            myCloudMessageItem = (MyCloudMessageItem) myCloudItem;
        } else {
            myCloudMessageItem = null;
        }
        if (myCloudMessageItem != null && (interfaceC27158o2 = this.f65883V) != null) {
            interfaceC27158o2.mo70518a(myCloudMessageItem, z11);
        }
    }

    /* renamed from: q0 */
    public final void m71063q0() {
        this.f65879R = false;
        AbstractC19444a.m101694b(new Runnable() { // from class: c90.c
            public /* synthetic */ RunnableC3375c() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                MyCloudTextItemView.m71064r0(MyCloudTextItemView.this);
            }
        }, 100L);
    }

    /* renamed from: r0 */
    public static final void m71064r0(MyCloudTextItemView myCloudTextItemView) {
        AbstractC19074t.m100208f(myCloudTextItemView, "this$0");
        myCloudTextItemView.f65879R = true;
    }

    /* renamed from: s0 */
    private final CharSequence m71065s0(MyCloudMessageItem myCloudMessageItem) {
        CharSequence m71035o = myCloudMessageItem.m71035o();
        if (m71035o != null && m71035o.length() != 0) {
            CharSequence m71035o2 = myCloudMessageItem.m71035o();
            if (m71035o2 == null) {
                String spannableString = myCloudMessageItem.m71036p().toString();
                AbstractC19074t.m100207e(spannableString, "toString(...)");
                return spannableString;
            }
            return m71035o2;
        }
        SpannableStringBuilder m71059l0 = m71059l0(myCloudMessageItem.m71036p(), this.f65878Q);
        Object[] spans = m71059l0.getSpans(0, m71059l0.length(), Object.class);
        AbstractC19074t.m100207e(spans, "getSpans(...)");
        for (Object obj : spans) {
            if (obj instanceof C23671b) {
                C23671b c23671b = (C23671b) obj;
                c23671b.f114671t = false;
                if (c23671b.f114664C == 3) {
                    c23671b.f114662A = true;
                }
            }
        }
        myCloudMessageItem.m71041y(C28652r.m143349v().m143356G(m71059l0, AbstractC23222t7.f112584s));
        CharSequence m71035o3 = myCloudMessageItem.m71035o();
        if (m71035o3 == null) {
            return "";
        }
        return m71035o3;
    }

    public final BaseMyCloudTabView.AbstractC12510b getDelegate() {
        return this.f65880S;
    }

    public final boolean getEnableMultiSelection() {
        return this.f65884W;
    }

    public final InterfaceC27158o2 getSelectEventListener() {
        return this.f65883V;
    }

    /* renamed from: k0 */
    public final void m71066k0(MyCloudItem myCloudItem, int i11, boolean z11) {
        MyCloudMessageItem myCloudMessageItem;
        C22126c0 c22126c0;
        this.f65885a0 = i11;
        this.f65876O = myCloudItem;
        this.f65884W = z11;
        if (myCloudItem instanceof MyCloudMessageItem) {
            myCloudMessageItem = (MyCloudMessageItem) myCloudItem;
        } else {
            myCloudMessageItem = null;
        }
        if (myCloudMessageItem != null && (c22126c0 = this.f65872K) != null) {
            c22126c0.m111959G1(m71065s0(myCloudMessageItem));
        }
        if (z11) {
            m71055g0();
            C21693c c21693c = this.f65874M;
            if (c21693c != null) {
                c21693c.mo44614b1(0);
            }
            C21691a c21691a = this.f65873L;
            if (c21691a != null) {
                c21691a.mo44614b1(0);
                return;
            }
            return;
        }
        C21693c c21693c2 = this.f65874M;
        if (c21693c2 != null) {
            c21693c2.mo44614b1(8);
        }
        C21691a c21691a2 = this.f65873L;
        if (c21691a2 != null) {
            c21691a2.mo44614b1(8);
        }
    }

    /* renamed from: m0 */
    public final void m71067m0() {
        setBackground(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.bg_primarycolor_corner_8dp));
        C22126c0 c22126c0 = new C22126c0(getContext());
        c22126c0.m89106L().m89028L(-2, -2).m89041Y(AbstractC23222t7.f112576o);
        Context context = c22126c0.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        new C26707f(c22126c0).m137318a(C26705d.m137293a(context, AbstractC2814h.t_normal));
        c22126c0.m111962J1(C23212s8.m119607o(c22126c0.getContext(), AbstractC2807a.text_01));
        C20503g c20503g = new C20503g(false, true);
        this.f65875N = c20503g;
        c22126c0.m111955C1(c20503g);
        mo69681L(c22126c0);
        this.f65872K = c22126c0;
        C20503g c20503g2 = this.f65875N;
        if (c20503g2 != null) {
            c20503g2.m106543g(new C12638c());
        }
        setOnClickListener(new View.OnClickListener() { // from class: c90.a
            public /* synthetic */ ViewOnClickListenerC3373a() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyCloudTextItemView.m71060n0(MyCloudTextItemView.this, view);
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: c90.b
            public /* synthetic */ ViewOnLongClickListenerC3374b() {
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean m71061o0;
                m71061o0 = MyCloudTextItemView.m71061o0(MyCloudTextItemView.this, view);
                return m71061o0;
            }
        });
    }

    public final void setCheckBoModuleState(boolean z11) {
        int i11;
        C21693c c21693c = this.f65874M;
        if (c21693c != null) {
            Context context = getContext();
            if (z11) {
                i11 = AbstractC16803z.bg_black60_corner_8;
            } else {
                i11 = AbstractC16803z.bg_transparent_corner_8;
            }
            c21693c.m89085A0(AbstractC23136l9.m118665N(context, i11));
        }
        C21691a c21691a = this.f65873L;
        if (c21691a != null) {
            c21691a.mo89091D0(z11);
        }
    }

    public final void setDelegate(BaseMyCloudTabView.AbstractC12510b abstractC12510b) {
        this.f65880S = abstractC12510b;
    }

    public final void setEnableMultiSelection(boolean z11) {
        this.f65884W = z11;
    }

    public final void setSelectEventListener(InterfaceC27158o2 interfaceC27158o2) {
        this.f65883V = interfaceC27158o2;
    }
}
