package com.zing.zalo.p077ui.mycloud;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import b40.C2526d;
import bi0.AbstractC2807a;
import bi0.AbstractC2809c;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.mycloud.DetailTextMessageView;
import com.zing.zalo.p077ui.mycloud.collection.PopupAddItemsToCollection;
import com.zing.zalo.p077ui.mycloud.model.MyCloudMessageItem;
import com.zing.zalo.p077ui.zviews.BottomPickerView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.photoview.ViewOnTouchListenerC9043a;
import com.zing.zalo.uicomponents.framelayout.DragToCloseLayout;
import com.zing.zalo.zview.AbstractC17454d;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import dj.C17945a0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import gw.AbstractC19646n0;
import i60.C20338d;
import ib0.C20500d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kw.C21955a;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23222t7;
import me0.ClipboardManagerOnPrimaryClipChangedListenerC23245w;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import mw.AbstractC23463h;
import mw.InterfaceC23456a;
import nb0.C23671b;
import p246iw.C20843c0;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p500s1.C26087b;
import p542ub.InterfaceC27218a;
import p588vw.C28652r;
import p649xl.C29707a5;
import pk.C24799c;
import qm0.AbstractC25370t;
import ui0.C27280g;

/* loaded from: classes6.dex */
public final class DetailTextMessageView extends SlidableZaloView implements ZaloView.InterfaceC17421f {
    public static final C12472a Companion = new C12472a(null);

    /* renamed from: P0 */
    private C29707a5 f65291P0;

    /* renamed from: R0 */
    private Rect f65293R0;

    /* renamed from: U0 */
    private boolean f65296U0;

    /* renamed from: V0 */
    private MyCloudMessageItem f65297V0;

    /* renamed from: W0 */
    private long f65298W0;

    /* renamed from: Q0 */
    private C20500d f65292Q0 = new C20500d(true);

    /* renamed from: S0 */
    private final long f65294S0 = 300;

    /* renamed from: T0 */
    private final C26087b f65295T0 = new C26087b();

    /* renamed from: X0 */
    private String f65299X0 = "";

    /* renamed from: com.zing.zalo.ui.mycloud.DetailTextMessageView$a */
    /* loaded from: classes6.dex */
    public static final class C12472a {
        private C12472a() {
        }

        public /* synthetic */ C12472a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.DetailTextMessageView$b */
    /* loaded from: classes6.dex */
    public static final class C12473b implements DragToCloseLayout.InterfaceC16432a {

        /* renamed from: com.zing.zalo.ui.mycloud.DetailTextMessageView$b$a */
        /* loaded from: classes6.dex */
        public static final class a extends AnimatorListenerAdapter {

            /* renamed from: p */
            final /* synthetic */ DetailTextMessageView f65301p;

            a(DetailTextMessageView detailTextMessageView) {
                this.f65301p = detailTextMessageView;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                AbstractC19074t.m100208f(animator, "animation");
                this.f65301p.finish();
            }
        }

        /* renamed from: com.zing.zalo.ui.mycloud.DetailTextMessageView$b$b */
        /* loaded from: classes6.dex */
        public static final class b extends AnimatorListenerAdapter {

            /* renamed from: p */
            final /* synthetic */ DetailTextMessageView f65302p;

            b(DetailTextMessageView detailTextMessageView) {
                this.f65302p = detailTextMessageView;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                C17487o0 m92662fJ;
                AbstractC19074t.m100208f(animator, "animation");
                if (!this.f65302p.mo60294yp() && (m92662fJ = this.f65302p.m92662fJ()) != null) {
                    m92662fJ.m93094z(false);
                }
                C29707a5 c29707a5 = this.f65302p.f65291P0;
                if (c29707a5 == null) {
                    AbstractC19074t.m100223u("viewBinding");
                    c29707a5 = null;
                }
                c29707a5.f137208v.setAlpha(1.0f);
            }
        }

        C12473b() {
        }

        /* renamed from: c */
        public static final void m70058c(DetailTextMessageView detailTextMessageView, ValueAnimator valueAnimator) {
            AbstractC19074t.m100208f(detailTextMessageView, "this$0");
            AbstractC19074t.m100208f(valueAnimator, "valueAnimator");
            Object animatedValue = valueAnimator.getAnimatedValue();
            AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) animatedValue).intValue();
            C29707a5 c29707a5 = detailTextMessageView.f65291P0;
            if (c29707a5 == null) {
                AbstractC19074t.m100223u("viewBinding");
                c29707a5 = null;
            }
            c29707a5.f137208v.setTranslationY(intValue);
            detailTextMessageView.m70055PM(intValue);
        }

        /* renamed from: d */
        public static final void m70059d(DetailTextMessageView detailTextMessageView, ValueAnimator valueAnimator) {
            AbstractC19074t.m100208f(detailTextMessageView, "this$0");
            AbstractC19074t.m100208f(valueAnimator, "valueAnimator");
            Object animatedValue = valueAnimator.getAnimatedValue();
            AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) animatedValue).intValue();
            C29707a5 c29707a5 = detailTextMessageView.f65291P0;
            if (c29707a5 == null) {
                AbstractC19074t.m100223u("viewBinding");
                c29707a5 = null;
            }
            c29707a5.f137208v.setTranslationY(intValue);
            detailTextMessageView.m70055PM(intValue);
        }

        @Override // com.zing.zalo.uicomponents.framelayout.DragToCloseLayout.InterfaceC16432a
        /* renamed from: Dg */
        public void mo38328Dg(float f11) {
            DetailTextMessageView.this.m70055PM((int) f11);
            DetailTextMessageView.this.m70033TM(false);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
            jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: u80.z.<init>(com.zing.zalo.ui.mycloud.DetailTextMessageView):void, class status: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
            	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
            */
        @Override // com.zing.zalo.uicomponents.framelayout.DragToCloseLayout.InterfaceC16432a
        /* renamed from: EC */
        public void mo38329EC(boolean r7) {
            /*
                r6 = this;
                r0 = 200(0xc8, double:9.9E-322)
                r2 = 0
                java.lang.String r3 = "viewBinding"
                if (r7 != 0) goto L69
                com.zing.zalo.ui.mycloud.DetailTextMessageView r7 = com.zing.zalo.p077ui.mycloud.DetailTextMessageView.this     // Catch: java.lang.Exception -> L14
                xl.a5 r7 = com.zing.zalo.p077ui.mycloud.DetailTextMessageView.m70044qM(r7)     // Catch: java.lang.Exception -> L14
                if (r7 != 0) goto L17
                fn0.AbstractC19074t.m100223u(r3)     // Catch: java.lang.Exception -> L14
                r7 = r2
                goto L17
            L14:
                r7 = move-exception
                goto La8
            L17:
                com.zing.zalo.uicomponents.framelayout.DragToCloseLayout r7 = r7.f137208v     // Catch: java.lang.Exception -> L14
                float r7 = r7.getTranslationY()     // Catch: java.lang.Exception -> L14
                int r7 = (int) r7     // Catch: java.lang.Exception -> L14
                if (r7 >= 0) goto L35
                com.zing.zalo.ui.mycloud.DetailTextMessageView r4 = com.zing.zalo.p077ui.mycloud.DetailTextMessageView.this     // Catch: java.lang.Exception -> L14
                xl.a5 r4 = com.zing.zalo.p077ui.mycloud.DetailTextMessageView.m70044qM(r4)     // Catch: java.lang.Exception -> L14
                if (r4 != 0) goto L2c
                fn0.AbstractC19074t.m100223u(r3)     // Catch: java.lang.Exception -> L14
                goto L2d
            L2c:
                r2 = r4
            L2d:
                com.zing.zalo.uicomponents.framelayout.DragToCloseLayout r2 = r2.f137208v     // Catch: java.lang.Exception -> L14
                int r2 = r2.getHeight()     // Catch: java.lang.Exception -> L14
                int r2 = -r2
                goto L48
            L35:
                com.zing.zalo.ui.mycloud.DetailTextMessageView r4 = com.zing.zalo.p077ui.mycloud.DetailTextMessageView.this     // Catch: java.lang.Exception -> L14
                xl.a5 r4 = com.zing.zalo.p077ui.mycloud.DetailTextMessageView.m70044qM(r4)     // Catch: java.lang.Exception -> L14
                if (r4 != 0) goto L41
                fn0.AbstractC19074t.m100223u(r3)     // Catch: java.lang.Exception -> L14
                goto L42
            L41:
                r2 = r4
            L42:
                com.zing.zalo.uicomponents.framelayout.DragToCloseLayout r2 = r2.f137208v     // Catch: java.lang.Exception -> L14
                int r2 = r2.getHeight()     // Catch: java.lang.Exception -> L14
            L48:
                int[] r7 = new int[]{r7, r2}     // Catch: java.lang.Exception -> L14
                android.animation.ValueAnimator r7 = android.animation.ValueAnimator.ofInt(r7)     // Catch: java.lang.Exception -> L14
                com.zing.zalo.ui.mycloud.DetailTextMessageView r2 = com.zing.zalo.p077ui.mycloud.DetailTextMessageView.this     // Catch: java.lang.Exception -> L14
                r7.setDuration(r0)     // Catch: java.lang.Exception -> L14
                u80.z r0 = new u80.z     // Catch: java.lang.Exception -> L14
                r0.<init>()     // Catch: java.lang.Exception -> L14
                r7.addUpdateListener(r0)     // Catch: java.lang.Exception -> L14
                com.zing.zalo.ui.mycloud.DetailTextMessageView$b$a r0 = new com.zing.zalo.ui.mycloud.DetailTextMessageView$b$a     // Catch: java.lang.Exception -> L14
                r0.<init>(r2)     // Catch: java.lang.Exception -> L14
                r7.addListener(r0)     // Catch: java.lang.Exception -> L14
                r7.start()     // Catch: java.lang.Exception -> L14
                goto Lab
            L69:
                com.zing.zalo.ui.mycloud.DetailTextMessageView r7 = com.zing.zalo.p077ui.mycloud.DetailTextMessageView.this     // Catch: java.lang.Exception -> L14
                r4 = 1
                com.zing.zalo.p077ui.mycloud.DetailTextMessageView.m70047tM(r7, r4)     // Catch: java.lang.Exception -> L14
                r7 = 2
                int[] r7 = new int[r7]     // Catch: java.lang.Exception -> L14
                com.zing.zalo.ui.mycloud.DetailTextMessageView r5 = com.zing.zalo.p077ui.mycloud.DetailTextMessageView.this     // Catch: java.lang.Exception -> L14
                xl.a5 r5 = com.zing.zalo.p077ui.mycloud.DetailTextMessageView.m70044qM(r5)     // Catch: java.lang.Exception -> L14
                if (r5 != 0) goto L7e
                fn0.AbstractC19074t.m100223u(r3)     // Catch: java.lang.Exception -> L14
                goto L7f
            L7e:
                r2 = r5
            L7f:
                com.zing.zalo.uicomponents.framelayout.DragToCloseLayout r2 = r2.f137208v     // Catch: java.lang.Exception -> L14
                float r2 = r2.getTranslationY()     // Catch: java.lang.Exception -> L14
                int r2 = (int) r2     // Catch: java.lang.Exception -> L14
                r3 = 0
                r7[r3] = r2     // Catch: java.lang.Exception -> L14
                r7[r4] = r3     // Catch: java.lang.Exception -> L14
                android.animation.ValueAnimator r7 = android.animation.ValueAnimator.ofInt(r7)     // Catch: java.lang.Exception -> L14
                com.zing.zalo.ui.mycloud.DetailTextMessageView r2 = com.zing.zalo.p077ui.mycloud.DetailTextMessageView.this     // Catch: java.lang.Exception -> L14
                r7.setDuration(r0)     // Catch: java.lang.Exception -> L14
                u80.a0 r0 = new u80.a0     // Catch: java.lang.Exception -> L14
                r0.<init>()     // Catch: java.lang.Exception -> L14
                r7.addUpdateListener(r0)     // Catch: java.lang.Exception -> L14
                com.zing.zalo.ui.mycloud.DetailTextMessageView$b$b r0 = new com.zing.zalo.ui.mycloud.DetailTextMessageView$b$b     // Catch: java.lang.Exception -> L14
                r0.<init>(r2)     // Catch: java.lang.Exception -> L14
                r7.addListener(r0)     // Catch: java.lang.Exception -> L14
                r7.start()     // Catch: java.lang.Exception -> L14
                goto Lab
            La8:
                mm0.AbstractC23350e.m122778h(r7)
            Lab:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.p077ui.mycloud.DetailTextMessageView.C12473b.mo38329EC(boolean):void");
        }

        @Override // com.zing.zalo.uicomponents.framelayout.DragToCloseLayout.InterfaceC16432a
        /* renamed from: f2 */
        public void mo38330f2() {
            C17487o0 m92662fJ = DetailTextMessageView.this.m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93094z(true);
            }
            DetailTextMessageView.this.m70033TM(false);
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.DetailTextMessageView$c */
    /* loaded from: classes6.dex */
    public static final class C12474c extends C20500d.a {

        /* renamed from: com.zing.zalo.ui.mycloud.DetailTextMessageView$c$a */
        /* loaded from: classes6.dex */
        public static final class a implements InterfaceC23456a {

            /* renamed from: a */
            final /* synthetic */ DetailTextMessageView f65304a;

            a(DetailTextMessageView detailTextMessageView) {
                this.f65304a = detailTextMessageView;
            }

            @Override // mw.InterfaceC23456a
            /* renamed from: Y */
            public void mo70061Y() {
                this.f65304a.mo46829Y();
            }

            @Override // mw.InterfaceC23456a
            /* renamed from: a */
            public View mo70062a() {
                C29707a5 c29707a5 = this.f65304a.f65291P0;
                if (c29707a5 == null) {
                    AbstractC19074t.m100223u("viewBinding");
                    c29707a5 = null;
                }
                DragToCloseLayout root = c29707a5.getRoot();
                AbstractC19074t.m100207e(root, "getRoot(...)");
                return root;
            }

            @Override // mw.InterfaceC23456a
            /* renamed from: q3 */
            public void mo70063q3() {
                this.f65304a.mo78960q3();
            }
        }

        C12474c() {
        }

        @Override // ib0.C20500d.a
        /* renamed from: c */
        public void mo35612c(String str) {
            int m40666e = TrackingSource.m40666e();
            String m40669h = TrackingSource.m40669h(m40666e);
            AbstractC19074t.m100207e(m40669h, "genSourceParamChat(...)");
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_WEB_URL", str);
            bundle.putInt("EXTRA_SOURCE_LINK", m40666e);
            if (!TextUtils.isEmpty(m40669h)) {
                bundle.putString("EXTRA_SOURCE_PARAM", m40669h);
            }
            InterfaceC27218a m92676n2 = DetailTextMessageView.this.m92676n2();
            if (m92676n2 != null) {
                ZaloWebView.Companion.m87171F(m92676n2, str, bundle);
            }
        }

        @Override // ib0.C20500d.a
        /* renamed from: f */
        public void mo70060f(String str) {
            String str2;
            Context context = DetailTextMessageView.this.getContext();
            if (context == null) {
                return;
            }
            Bundle bundle = new Bundle();
            if (str != null) {
                str2 = str.substring(4);
                AbstractC19074t.m100207e(str2, "substring(...)");
            } else {
                str2 = null;
            }
            bundle.putString("text", str2);
            bundle.putParcelable("span", new URLSpan(str));
            bundle.putBoolean("is_link", false);
            DetailTextMessageView detailTextMessageView = DetailTextMessageView.this;
            KeyEventCallbackC17462c m123176d = AbstractC23463h.m123176d(detailTextMessageView, context, bundle, new a(detailTextMessageView));
            if (m123176d != null) {
                m123176d.mo13822K();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.DetailTextMessageView$d */
    /* loaded from: classes6.dex */
    public static final class C12475d extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ Runnable f65305p;

        C12475d(Runnable runnable) {
            this.f65305p = runnable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationEnd(animator);
            Runnable runnable = this.f65305p;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.DetailTextMessageView$e */
    /* loaded from: classes6.dex */
    public static final class ViewTreeObserverOnPreDrawListenerC12476e implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: q */
        final /* synthetic */ Rect f65307q;

        ViewTreeObserverOnPreDrawListenerC12476e(Rect rect) {
            this.f65307q = rect;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            C29707a5 c29707a5 = DetailTextMessageView.this.f65291P0;
            if (c29707a5 == null) {
                AbstractC19074t.m100223u("viewBinding");
                c29707a5 = null;
            }
            c29707a5.getRoot().getViewTreeObserver().removeOnPreDrawListener(this);
            DetailTextMessageView.this.m70031RM(this.f65307q);
            return false;
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.DetailTextMessageView$f */
    /* loaded from: classes6.dex */
    public static final class C12477f extends AnimatorListenerAdapter {
        C12477f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationEnd(animator);
            DetailTextMessageView.this.finish();
            DetailTextMessageView.this.f65296U0 = false;
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.DetailTextMessageView$g */
    /* loaded from: classes6.dex */
    public static final class C12478g extends AnimatorListenerAdapter {
        C12478g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationEnd(animator);
            DetailTextMessageView.this.f65296U0 = false;
        }
    }

    /* renamed from: AM */
    public static final void m70016AM(DetailTextMessageView detailTextMessageView, View view) {
        AbstractC19074t.m100208f(detailTextMessageView, "this$0");
        detailTextMessageView.m70024JM();
    }

    /* renamed from: BM */
    public static final void m70017BM(DetailTextMessageView detailTextMessageView, View view) {
        SpannableString spannableString;
        AbstractC19074t.m100208f(detailTextMessageView, "this$0");
        Context context = detailTextMessageView.getContext();
        if (context != null) {
            MyCloudMessageItem myCloudMessageItem = detailTextMessageView.f65297V0;
            C17945a0 c17945a0 = null;
            if (myCloudMessageItem != null) {
                spannableString = myCloudMessageItem.m71036p();
            } else {
                spannableString = null;
            }
            ClipboardManagerOnPrimaryClipChangedListenerC23245w.m119767f(context, String.valueOf(spannableString), new SensitiveData("clipboard_copy_text_mycloud_message_viewfull", "comm_csc", null, 4, null));
            C2526d c2526d = C2526d.f10270a;
            MyCloudMessageItem myCloudMessageItem2 = detailTextMessageView.f65297V0;
            if (myCloudMessageItem2 != null) {
                c17945a0 = myCloudMessageItem2.m71033m();
            }
            c2526d.m12678G(c17945a0, -1, detailTextMessageView.f65299X0, "4");
        }
    }

    /* renamed from: CM */
    public static final void m70018CM(DetailTextMessageView detailTextMessageView, View view) {
        C17945a0 c17945a0;
        AbstractC19074t.m100208f(detailTextMessageView, "this$0");
        InterfaceC27218a m92676n2 = detailTextMessageView.m92676n2();
        MyCloudMessageItem myCloudMessageItem = detailTextMessageView.f65297V0;
        if (myCloudMessageItem != null) {
            c17945a0 = myCloudMessageItem.m71033m();
        } else {
            c17945a0 = null;
        }
        AbstractC19646n0.m102966d0(m92676n2, c17945a0, false, -1, new TrackingSource(6).m40686z(), detailTextMessageView.m70051xM(), "4", -1);
    }

    /* renamed from: DM */
    public static final void m70019DM(DetailTextMessageView detailTextMessageView, View view) {
        C17945a0 m71033m;
        AbstractC19074t.m100208f(detailTextMessageView, "this$0");
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            HashMap hashMap = new HashMap();
            MyCloudMessageItem myCloudMessageItem = detailTextMessageView.f65297V0;
            if (myCloudMessageItem != null && (m71033m = myCloudMessageItem.m71033m()) != null) {
                arrayList.add(m71033m.m95029V3());
                if (detailTextMessageView.m70023HM()) {
                    hashMap.put(String.valueOf(AbstractC19646n0.m102878B(m71033m.m95041W4(), false)), 1);
                    C20843c0 m120602N0 = AbstractC23306f.m120602N0();
                    C24799c m109091x0 = m120602N0.m109091x0(detailTextMessageView.f65298W0);
                    if (m109091x0 != null) {
                        String m114637d = C21955a.f108070a.m114637d("detail_text_msgmenu", hashMap, m109091x0.m128832l());
                        AbstractC19074t.m100205c(m120602N0);
                        C20843c0.m108969V(m120602N0, m109091x0.m128824d(), arrayList, (byte) 1, m109091x0.m128825e(), false, m114637d, false, 64, null);
                    }
                    AbstractC19074t.m100205c(m120602N0);
                    return;
                }
                arrayList2.add(m71033m);
                detailTextMessageView.m70054IM(arrayList, C21955a.f108070a.m114643j(arrayList2));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: EM */
    private final void m70020EM() {
        MyCloudMessageItem myCloudMessageItem;
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            if (m92642L3.containsKey("EXTRA_DATA")) {
                Parcelable parcelable = m92642L3.getParcelable("EXTRA_DATA");
                if (parcelable instanceof MyCloudMessageItem) {
                    myCloudMessageItem = (MyCloudMessageItem) parcelable;
                } else {
                    myCloudMessageItem = null;
                }
                this.f65297V0 = myCloudMessageItem;
            }
            if (m92642L3.containsKey("EXTRA_COLLECTION_ID")) {
                this.f65298W0 = m92642L3.getLong("EXTRA_COLLECTION_ID");
            }
            if (m92642L3.containsKey("EXTRA_ORIGINAL_VIEW_RECT")) {
                this.f65293R0 = (Rect) m92642L3.getParcelable("EXTRA_ORIGINAL_VIEW_RECT");
            }
            String string = m92642L3.getString("EXTRA_ENTRYPOINT", "");
            AbstractC19074t.m100207e(string, "getString(...)");
            this.f65299X0 = string;
        }
    }

    /* renamed from: FM */
    private final void m70021FM() {
        C29707a5 c29707a5 = this.f65291P0;
        C29707a5 c29707a52 = null;
        if (c29707a5 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29707a5 = null;
        }
        c29707a5.f137208v.setDirection(1);
        C29707a5 c29707a53 = this.f65291P0;
        if (c29707a53 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29707a53 = null;
        }
        c29707a53.f137208v.setMinDistanceToClose(ViewOnTouchListenerC9043a.f48411h0);
        C29707a5 c29707a54 = this.f65291P0;
        if (c29707a54 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29707a54 = null;
        }
        c29707a54.f137208v.setOnDragToCloseListener(new C12473b());
        if (Build.VERSION.SDK_INT >= 23) {
            C29707a5 c29707a55 = this.f65291P0;
            if (c29707a55 == null) {
                AbstractC19074t.m100223u("viewBinding");
                c29707a55 = null;
            }
            c29707a55.f137211y.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: u80.q
                public /* synthetic */ ViewOnScrollChangeListenerC27163q() {
                }

                @Override // android.view.View.OnScrollChangeListener
                public final void onScrollChange(View view, int i11, int i12, int i13, int i14) {
                    DetailTextMessageView.m70022GM(DetailTextMessageView.this, view, i11, i12, i13, i14);
                }
            });
        }
        C20500d c20500d = this.f65292Q0;
        if (c20500d != null) {
            c20500d.m106538e(new C12474c());
        }
        C29707a5 c29707a56 = this.f65291P0;
        if (c29707a56 == null) {
            AbstractC19074t.m100223u("viewBinding");
        } else {
            c29707a52 = c29707a56;
        }
        c29707a52.f137212z.setMovementMethod(this.f65292Q0);
        m70030QM();
        m70053zM();
    }

    /* renamed from: GM */
    public static final void m70022GM(DetailTextMessageView detailTextMessageView, View view, int i11, int i12, int i13, int i14) {
        boolean z11;
        AbstractC19074t.m100208f(detailTextMessageView, "this$0");
        C29707a5 c29707a5 = detailTextMessageView.f65291P0;
        if (c29707a5 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29707a5 = null;
        }
        DragToCloseLayout dragToCloseLayout = c29707a5.f137208v;
        if (i12 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        dragToCloseLayout.setDisableTouch(z11);
    }

    /* renamed from: HM */
    private final boolean m70023HM() {
        return this.f65298W0 != 0;
    }

    /* renamed from: JM */
    private final void m70024JM() {
        ZaloView m92996E0;
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null && (m92996E0 = m92662fJ.m92996E0("ContextMenuBottomSheet")) != null) {
            m92996E0.finish();
        }
        Bundle bundle = new Bundle();
        bundle.putInt("SHOW_WITH_FLAGS", 16777216);
        bundle.putParcelable("EXTRA_DATA", this.f65297V0);
        bundle.putLong("COLLECTION_ID", this.f65298W0);
        m92693xK().mo89694j2(ContextMenuDetailTextMessageBottomSheet.class, bundle, 0, "ContextMenuBottomSheet", 2, true);
    }

    /* renamed from: KM */
    private final CharSequence m70025KM() {
        SpannableString m71036p;
        MyCloudMessageItem myCloudMessageItem = this.f65297V0;
        if (myCloudMessageItem != null && (m71036p = myCloudMessageItem.m71036p()) != null) {
            Object[] spans = m71036p.getSpans(0, m71036p.length(), Object.class);
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
            return C28652r.m143349v().m143355F(m71036p, AbstractC23222t7.f112584s);
        }
        return null;
    }

    /* renamed from: LM */
    private final void m70026LM() {
        RelativeLayout.LayoutParams layoutParams;
        this.f65296U0 = true;
        TransitionSet transitionSet = new TransitionSet();
        ActionBar actionBar = this.f88760a0;
        Fade fade = new Fade();
        if (actionBar != null) {
            fade.addTarget(actionBar);
        }
        C29707a5 c29707a5 = this.f65291P0;
        C29707a5 c29707a52 = null;
        if (c29707a5 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29707a5 = null;
        }
        fade.addTarget(c29707a5.f137206t);
        transitionSet.addTransition(fade);
        ChangeBounds changeBounds = new ChangeBounds();
        C29707a5 c29707a53 = this.f65291P0;
        if (c29707a53 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29707a53 = null;
        }
        transitionSet.addTransition(changeBounds.addTarget(c29707a53.f137205s));
        transitionSet.setDuration(this.f65294S0);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) this.f65295T0);
        C29707a5 c29707a54 = this.f65291P0;
        if (c29707a54 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29707a54 = null;
        }
        TransitionManager.beginDelayedTransition(c29707a54.getRoot(), transitionSet);
        ActionBar actionBar2 = this.f88760a0;
        if (actionBar2 != null) {
            actionBar2.setVisibility(8);
        }
        C29707a5 c29707a55 = this.f65291P0;
        if (c29707a55 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29707a55 = null;
        }
        c29707a55.f137206t.setVisibility(8);
        Rect rect = this.f65293R0;
        if (rect != null) {
            C29707a5 c29707a56 = this.f65291P0;
            if (c29707a56 == null) {
                AbstractC19074t.m100223u("viewBinding");
                c29707a56 = null;
            }
            ViewGroup.LayoutParams layoutParams2 = c29707a56.f137205s.getLayoutParams();
            if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
                layoutParams = (RelativeLayout.LayoutParams) layoutParams2;
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                layoutParams.removeRule(2);
                layoutParams.removeRule(3);
                layoutParams.width = rect.width();
                layoutParams.height = rect.height();
                int[] iArr = new int[2];
                C29707a5 c29707a57 = this.f65291P0;
                if (c29707a57 == null) {
                    AbstractC19074t.m100223u("viewBinding");
                    c29707a57 = null;
                }
                c29707a57.getRoot().getLocationOnScreen(iArr);
                layoutParams.leftMargin = rect.left - iArr[0];
                layoutParams.topMargin = rect.top - iArr[1];
                layoutParams.rightMargin = 0;
                layoutParams.bottomMargin = 0;
                C29707a5 c29707a58 = this.f65291P0;
                if (c29707a58 == null) {
                    AbstractC19074t.m100223u("viewBinding");
                } else {
                    c29707a52 = c29707a58;
                }
                c29707a52.f137205s.setLayoutParams(layoutParams);
            }
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(255, 0);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: u80.r
            public /* synthetic */ C27166r() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DetailTextMessageView.m70027MM(DetailTextMessageView.this, valueAnimator);
            }
        });
        ofInt.setDuration(this.f65294S0);
        ofInt.setInterpolator(this.f65295T0);
        ofInt.addListener(new C12477f());
        ofInt.start();
    }

    /* renamed from: MM */
    public static final void m70027MM(DetailTextMessageView detailTextMessageView, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(detailTextMessageView, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "it");
        C29707a5 c29707a5 = detailTextMessageView.f65291P0;
        if (c29707a5 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29707a5 = null;
        }
        DragToCloseLayout root = c29707a5.getRoot();
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        root.setBackgroundColor(Color.argb(((Integer) animatedValue).intValue(), 0, 0, 0));
    }

    /* renamed from: NM */
    private final void m70028NM() {
        TransitionSet transitionSet = new TransitionSet();
        ActionBar actionBar = this.f88760a0;
        Fade fade = new Fade();
        if (actionBar != null) {
            fade.addTarget(actionBar);
        }
        C29707a5 c29707a5 = this.f65291P0;
        RelativeLayout.LayoutParams layoutParams = null;
        if (c29707a5 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29707a5 = null;
        }
        fade.addTarget(c29707a5.f137206t);
        transitionSet.addTransition(fade);
        ChangeBounds changeBounds = new ChangeBounds();
        C29707a5 c29707a52 = this.f65291P0;
        if (c29707a52 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29707a52 = null;
        }
        transitionSet.addTransition(changeBounds.addTarget(c29707a52.f137205s));
        transitionSet.setDuration(this.f65294S0);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) this.f65295T0);
        C29707a5 c29707a53 = this.f65291P0;
        if (c29707a53 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29707a53 = null;
        }
        TransitionManager.beginDelayedTransition(c29707a53.getRoot(), transitionSet);
        ActionBar actionBar2 = this.f88760a0;
        if (actionBar2 != null) {
            actionBar2.setVisibility(0);
        }
        C29707a5 c29707a54 = this.f65291P0;
        if (c29707a54 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29707a54 = null;
        }
        c29707a54.f137206t.setVisibility(0);
        C29707a5 c29707a55 = this.f65291P0;
        if (c29707a55 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29707a55 = null;
        }
        ViewGroup.LayoutParams layoutParams2 = c29707a55.f137205s.getLayoutParams();
        if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
            layoutParams = (RelativeLayout.LayoutParams) layoutParams2;
        }
        if (layoutParams != null) {
            layoutParams.leftMargin = m92651WI().getDimensionPixelSize(AbstractC2809c.f11271u8);
            layoutParams.rightMargin = m92651WI().getDimensionPixelSize(AbstractC2809c.f11271u8);
            layoutParams.topMargin = m92651WI().getDimensionPixelSize(AbstractC2809c.f11267u4);
            layoutParams.bottomMargin = m92651WI().getDimensionPixelSize(AbstractC2809c.f11269u6);
            layoutParams.addRule(2, AbstractC6918a0.context_menu_container);
            layoutParams.addRule(3, AbstractC6918a0.zalo_action_bar);
            layoutParams.width = -1;
            layoutParams.height = -1;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: u80.p
            public /* synthetic */ C27159p() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DetailTextMessageView.m70029OM(DetailTextMessageView.this, valueAnimator);
            }
        });
        ofInt.addListener(new C12478g());
        ofInt.setDuration(this.f65294S0);
        ofInt.setInterpolator(this.f65295T0);
        ofInt.start();
    }

    /* renamed from: OM */
    public static final void m70029OM(DetailTextMessageView detailTextMessageView, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(detailTextMessageView, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "it");
        C29707a5 c29707a5 = detailTextMessageView.f65291P0;
        if (c29707a5 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29707a5 = null;
        }
        DragToCloseLayout root = c29707a5.getRoot();
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        root.setBackgroundColor(Color.argb(((Integer) animatedValue).intValue(), 0, 0, 0));
    }

    /* renamed from: QM */
    private final void m70030QM() {
        Drawable m139660c;
        Context context = getContext();
        if (context == null) {
            return;
        }
        if (m70023HM()) {
            m139660c = C27280g.m139660c(context, AbstractC23322a.zds_ic_minus_circle_line_24, AbstractC2807a.icon_04);
        } else {
            m139660c = C27280g.m139660c(context, AbstractC23322a.zds_ic_plus_circle_line_24, AbstractC2807a.icon_04);
        }
        C29707a5 c29707a5 = this.f65291P0;
        C29707a5 c29707a52 = null;
        if (c29707a5 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29707a5 = null;
        }
        c29707a5.f137203q.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, m139660c, (Drawable) null, (Drawable) null);
        C29707a5 c29707a53 = this.f65291P0;
        if (c29707a53 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29707a53 = null;
        }
        c29707a53.f137203q.setCompoundDrawablePadding(AbstractC23222t7.f112572m);
        Drawable m139660c2 = C27280g.m139660c(context, AbstractC23322a.zds_ic_share_line_24, AbstractC2807a.icon_04);
        C29707a5 c29707a54 = this.f65291P0;
        if (c29707a54 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29707a54 = null;
        }
        c29707a54.f137209w.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, m139660c2, (Drawable) null, (Drawable) null);
        C29707a5 c29707a55 = this.f65291P0;
        if (c29707a55 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29707a55 = null;
        }
        c29707a55.f137209w.setCompoundDrawablePadding(AbstractC23222t7.f112572m);
        Drawable m139660c3 = C27280g.m139660c(context, AbstractC23322a.zds_ic_copy_line_24, AbstractC2807a.icon_04);
        C29707a5 c29707a56 = this.f65291P0;
        if (c29707a56 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29707a56 = null;
        }
        c29707a56.f137207u.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, m139660c3, (Drawable) null, (Drawable) null);
        C29707a5 c29707a57 = this.f65291P0;
        if (c29707a57 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29707a57 = null;
        }
        c29707a57.f137207u.setCompoundDrawablePadding(AbstractC23222t7.f112572m);
        Drawable m139660c4 = C27280g.m139660c(context, AbstractC23322a.zds_ic_more_horizontal_line_24, AbstractC2807a.icon_04);
        C29707a5 c29707a58 = this.f65291P0;
        if (c29707a58 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29707a58 = null;
        }
        c29707a58.f137210x.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, m139660c4, (Drawable) null, (Drawable) null);
        C29707a5 c29707a59 = this.f65291P0;
        if (c29707a59 == null) {
            AbstractC19074t.m100223u("viewBinding");
        } else {
            c29707a52 = c29707a59;
        }
        c29707a52.f137210x.setCompoundDrawablePadding(AbstractC23222t7.f112572m);
    }

    /* renamed from: RM */
    public final void m70031RM(Rect rect) {
        RelativeLayout.LayoutParams layoutParams;
        this.f65296U0 = true;
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setVisibility(8);
        }
        C29707a5 c29707a5 = this.f65291P0;
        C29707a5 c29707a52 = null;
        if (c29707a5 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29707a5 = null;
        }
        c29707a5.f137206t.setVisibility(8);
        C29707a5 c29707a53 = this.f65291P0;
        if (c29707a53 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29707a53 = null;
        }
        c29707a53.getRoot().setBackgroundColor(0);
        C29707a5 c29707a54 = this.f65291P0;
        if (c29707a54 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29707a54 = null;
        }
        ViewGroup.LayoutParams layoutParams2 = c29707a54.f137205s.getLayoutParams();
        if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
            layoutParams = (RelativeLayout.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.removeRule(2);
            layoutParams.removeRule(3);
            layoutParams.width = rect.width();
            layoutParams.height = rect.height();
            int[] iArr = new int[2];
            C29707a5 c29707a55 = this.f65291P0;
            if (c29707a55 == null) {
                AbstractC19074t.m100223u("viewBinding");
                c29707a55 = null;
            }
            c29707a55.getRoot().getLocationOnScreen(iArr);
            layoutParams.leftMargin = rect.left - iArr[0];
            layoutParams.topMargin = rect.top - iArr[1];
            layoutParams.rightMargin = 0;
            layoutParams.bottomMargin = 0;
            C29707a5 c29707a56 = this.f65291P0;
            if (c29707a56 == null) {
                AbstractC19074t.m100223u("viewBinding");
            } else {
                c29707a52 = c29707a56;
            }
            c29707a52.f137205s.setLayoutParams(layoutParams);
            AbstractC19444a.m101694b(new Runnable() { // from class: u80.u
                public /* synthetic */ RunnableC27175u() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    DetailTextMessageView.m70032SM(DetailTextMessageView.this);
                }
            }, 200L);
        }
    }

    /* renamed from: SM */
    public static final void m70032SM(DetailTextMessageView detailTextMessageView) {
        AbstractC19074t.m100208f(detailTextMessageView, "this$0");
        detailTextMessageView.m70028NM();
    }

    /* renamed from: TM */
    public final void m70033TM(boolean z11) {
        int i11;
        C29707a5 c29707a5 = this.f65291P0;
        if (c29707a5 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29707a5 = null;
        }
        LinearLayout linearLayout = c29707a5.f137206t;
        int i12 = 4;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        linearLayout.setVisibility(i11);
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            if (z11) {
                i12 = 0;
            }
            actionBar.setVisibility(i12);
        }
    }

    /* renamed from: uM */
    public static final void m70048uM(DetailTextMessageView detailTextMessageView) {
        AbstractC19074t.m100208f(detailTextMessageView, "this$0");
        detailTextMessageView.m70050wM();
    }

    /* renamed from: vM */
    public static final void m70049vM(DetailTextMessageView detailTextMessageView) {
        AbstractC19074t.m100208f(detailTextMessageView, "this$0");
        detailTextMessageView.finish();
    }

    /* renamed from: wM */
    private final void m70050wM() {
        ZaloView m92996E0;
        if (this.f65296U0) {
            return;
        }
        if (this.f65293R0 != null) {
            m70026LM();
        } else {
            finish();
        }
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null && (m92996E0 = m92662fJ.m92996E0("ContextMenuBottomSheet")) != null) {
            m92996E0.finish();
        }
    }

    /* renamed from: xM */
    private final String m70051xM() {
        if (m70023HM()) {
            return "collection_detail";
        }
        return "chat_storedmedia";
    }

    /* renamed from: yM */
    private final String m70052yM() {
        if (m70023HM()) {
            String m92652XI = m92652XI(AbstractC8020f0.str_remove_from_collection);
            AbstractC19074t.m100205c(m92652XI);
            return m92652XI;
        }
        String m92652XI2 = m92652XI(AbstractC8020f0.str_btn_add_item_to_collection);
        AbstractC19074t.m100205c(m92652XI2);
        return m92652XI2;
    }

    /* renamed from: zM */
    private final void m70053zM() {
        C29707a5 c29707a5 = this.f65291P0;
        C29707a5 c29707a52 = null;
        if (c29707a5 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29707a5 = null;
        }
        c29707a5.f137210x.setOnClickListener(new View.OnClickListener() { // from class: u80.v
            public /* synthetic */ ViewOnClickListenerC27178v() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailTextMessageView.m70016AM(DetailTextMessageView.this, view);
            }
        });
        C29707a5 c29707a53 = this.f65291P0;
        if (c29707a53 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29707a53 = null;
        }
        c29707a53.f137207u.setOnClickListener(new View.OnClickListener() { // from class: u80.w
            public /* synthetic */ ViewOnClickListenerC27181w() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailTextMessageView.m70017BM(DetailTextMessageView.this, view);
            }
        });
        C29707a5 c29707a54 = this.f65291P0;
        if (c29707a54 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29707a54 = null;
        }
        c29707a54.f137209w.setOnClickListener(new View.OnClickListener() { // from class: u80.x
            public /* synthetic */ ViewOnClickListenerC27184x() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailTextMessageView.m70018CM(DetailTextMessageView.this, view);
            }
        });
        C29707a5 c29707a55 = this.f65291P0;
        if (c29707a55 == null) {
            AbstractC19074t.m100223u("viewBinding");
        } else {
            c29707a52 = c29707a55;
        }
        c29707a52.f137203q.setOnClickListener(new View.OnClickListener() { // from class: u80.y
            public /* synthetic */ ViewOnClickListenerC27187y() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailTextMessageView.m70019DM(DetailTextMessageView.this, view);
            }
        });
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        m70020EM();
        C29707a5 m147715c = C29707a5.m147715c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m147715c, "inflate(...)");
        this.f65291P0 = m147715c;
        m70021FM();
        C29707a5 c29707a5 = this.f65291P0;
        if (c29707a5 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29707a5 = null;
        }
        DragToCloseLayout root = c29707a5.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: HJ */
    public AnimatorSet mo39022HJ(boolean z11, Runnable runnable) {
        View m92656bJ;
        if (!z11 || (m92656bJ = m92656bJ()) == null) {
            return null;
        }
        float f11 = 0;
        m92656bJ.setAlpha(f11);
        m92656bJ.setAlpha(f11);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m92656bJ, "alpha", 0.0f, 1);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat);
        animatorSet.setDuration(500L);
        animatorSet.setInterpolator(new C26087b());
        animatorSet.addListener(new C12475d(runnable));
        return animatorSet;
    }

    /* renamed from: IM */
    public final void m70054IM(ArrayList arrayList, String str) {
        AbstractC19074t.m100208f(arrayList, "listMsgId");
        AbstractC19074t.m100208f(str, "jsDataLog");
        try {
            if (arrayList.size() == 0) {
                return;
            }
            Bundle m78535kL = BottomPickerView.m78535kL();
            m78535kL.putParcelableArrayList("listMsgId", arrayList);
            m78535kL.putString("entryPoint", "msg_fullscreen");
            m78535kL.putString("jsDataLog", str);
            m92693xK().m93066i2(PopupAddItemsToCollection.class, m78535kL, 0, 2, true);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124117e(this, 9);
        bVar.m124119a().m124117e(this, 5214);
    }

    /* renamed from: PM */
    public final void m70055PM(int i11) {
        float f11 = 255.0f;
        float abs = Math.abs(i11) * 255.0f;
        C29707a5 c29707a5 = this.f65291P0;
        C29707a5 c29707a52 = null;
        if (c29707a5 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29707a5 = null;
        }
        float height = 255.0f - (abs / c29707a5.f137208v.getHeight());
        if (height < 0.0f) {
            height = 0.0f;
        }
        if (height <= 255.0f) {
            f11 = height;
        }
        C29707a5 c29707a53 = this.f65291P0;
        if (c29707a53 == null) {
            AbstractC19074t.m100223u("viewBinding");
        } else {
            c29707a52 = c29707a53;
        }
        c29707a52.getRoot().setBackgroundColor(Color.argb((int) f11, 0, 0, 0));
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332) {
            m70050wM();
            return true;
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        long j11;
        C17945a0 m71033m;
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
            actionBar.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            actionBar.setActionBarHeight(AbstractC23136l9.m118655I(AbstractC17454d.action_bar_default_big_height));
            actionBar.setBigHeight(true);
            actionBar.setBackgroundResource(AbstractC16803z.action_bar_viewfull_gradient);
            actionBar.setTitle(AbstractC23304d.f113368c0.f42437s);
            MyCloudMessageItem myCloudMessageItem = this.f65297V0;
            if (myCloudMessageItem != null && (m71033m = myCloudMessageItem.m71033m()) != null) {
                j11 = m71033m.m94974P4();
            } else {
                j11 = 0;
            }
            actionBar.setSubtitle(AbstractC23160o0.m119181A(j11));
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        C29707a5 c29707a5 = this.f65291P0;
        C29707a5 c29707a52 = null;
        if (c29707a5 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29707a5 = null;
        }
        c29707a5.f137212z.setText(m70025KM());
        C29707a5 c29707a53 = this.f65291P0;
        if (c29707a53 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29707a53 = null;
        }
        c29707a53.f137203q.setText(m70052yM());
        Rect rect = this.f65293R0;
        if (rect != null) {
            C29707a5 c29707a54 = this.f65291P0;
            if (c29707a54 == null) {
                AbstractC19074t.m100223u("viewBinding");
            } else {
                c29707a52 = c29707a54;
            }
            c29707a52.getRoot().getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC12476e(rect));
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "DetailTextMessageView";
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            m70050wM();
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        C20338d c20338d;
        C17945a0 m71033m;
        boolean z11;
        List list;
        ArrayList<MessageId> arrayList;
        C17945a0 m71033m2;
        MessageId m95029V3;
        int m131511r;
        MessageId messageId;
        AbstractC19074t.m100208f(objArr, "args");
        super.mo17795x(i11, Arrays.copyOf(objArr, objArr.length));
        MessageId messageId2 = null;
        r2 = null;
        r2 = null;
        Long l11 = null;
        messageId2 = null;
        if (i11 != 9) {
            if (i11 == 5214) {
                try {
                    if (objArr.length == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        Object obj = objArr[0];
                        AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Long");
                        if (((Long) obj).longValue() == this.f65298W0) {
                            Object obj2 = objArr[1];
                            if (obj2 instanceof List) {
                                list = (List) obj2;
                            } else {
                                list = null;
                            }
                            if (list != null) {
                                List list2 = list;
                                m131511r = AbstractC25370t.m131511r(list2, 10);
                                arrayList = new ArrayList(m131511r);
                                for (Object obj3 : list2) {
                                    if (obj3 instanceof MessageId) {
                                        messageId = (MessageId) obj3;
                                    } else {
                                        messageId = null;
                                    }
                                    arrayList.add(messageId);
                                }
                            } else {
                                arrayList = new ArrayList();
                            }
                            MyCloudMessageItem myCloudMessageItem = this.f65297V0;
                            if (myCloudMessageItem != null && (m71033m2 = myCloudMessageItem.m71033m()) != null && (m95029V3 = m71033m2.m95029V3()) != null) {
                                l11 = Long.valueOf(m95029V3.m41045i());
                            }
                            for (MessageId messageId3 : arrayList) {
                                if (messageId3 != null) {
                                    long m41045i = messageId3.m41045i();
                                    if (l11 != null && m41045i == l11.longValue()) {
                                        AbstractC19444a.m101697e(new Runnable() { // from class: u80.t
                                            public /* synthetic */ RunnableC27172t() {
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                DetailTextMessageView.m70049vM(DetailTextMessageView.this);
                                            }
                                        });
                                        return;
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                    return;
                }
            }
            return;
        }
        if (objArr.length == 0) {
            return;
        }
        Object obj4 = objArr[0];
        if (obj4 instanceof C20338d) {
            c20338d = (C20338d) obj4;
        } else {
            c20338d = null;
        }
        if (c20338d != null && c20338d.m106046d() != null && AbstractC19074t.m100204b(c20338d.m106046d().mo95039W2(), "204278670")) {
            MessageId m95029V32 = c20338d.m106046d().m95029V3();
            MyCloudMessageItem myCloudMessageItem2 = this.f65297V0;
            if (myCloudMessageItem2 != null && (m71033m = myCloudMessageItem2.m71033m()) != null) {
                messageId2 = m71033m.m95029V3();
            }
            if (AbstractC19074t.m100204b(m95029V32, messageId2)) {
                AbstractC19444a.m101697e(new Runnable() { // from class: u80.s
                    public /* synthetic */ RunnableC27169s() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        DetailTextMessageView.m70048uM(DetailTextMessageView.this);
                    }
                });
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124115b(this, 9);
        bVar.m124119a().m124115b(this, 5214);
    }
}
