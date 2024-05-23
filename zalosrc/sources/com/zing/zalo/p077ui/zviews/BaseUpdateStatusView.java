package com.zing.zalo.p077ui.zviews;

import ag0.C0820h;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC10919t;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.adapters.C7145n;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.uicontrols.FeedRecyclerView;
import com.zing.zalo.p077ui.picker.stickerpanel.StickerPanelView;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.p077ui.widget.KeyboardFrameLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.BaseUpdateStatusView;
import com.zing.zalo.social.widget.StatusComposeEditText;
import com.zing.zalo.uicomponents.reddot.RedDotImageButton;
import com.zing.zalo.uicontrol.MenuListPopupView;
import com.zing.zalo.uicontrol.NoPredictiveItemAnimLinearLayoutMngr;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.AbstractC23244v8;
import me0.C23212s8;
import org.json.JSONObject;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p500s1.C26087b;
import p588vw.C28652r;
import p716zh.C31845ac;
import p716zh.C31890dc;
import p716zh.C32002l4;
import v20.C27477e;
import vg.C28020b3;
import y90.EnumC30861e;
import z90.AbstractC31727b;

/* loaded from: classes6.dex */
public abstract class BaseUpdateStatusView extends SlidableZaloView implements View.OnClickListener, TextWatcher, C23744a.c {

    /* renamed from: B1 */
    private static final int f72365B1 = AbstractC23309i.m121778c4();

    /* renamed from: C1 */
    private static final int f72366C1 = AbstractC23136l9.m118742r(32.0f);

    /* renamed from: A1 */
    boolean f72367A1;

    /* renamed from: P0 */
    C32002l4 f72368P0;

    /* renamed from: Q0 */
    View f72369Q0;

    /* renamed from: R0 */
    View f72370R0;

    /* renamed from: S0 */
    ScrollView f72371S0;

    /* renamed from: T0 */
    StatusComposeEditText f72372T0;

    /* renamed from: U0 */
    RobotoTextView f72373U0;

    /* renamed from: V0 */
    RedDotImageButton f72374V0;

    /* renamed from: W0 */
    FeedRecyclerView f72375W0;

    /* renamed from: X0 */
    LinearLayoutManager f72376X0;

    /* renamed from: Y0 */
    C27477e f72377Y0;

    /* renamed from: Z0 */
    ImageView f72378Z0;

    /* renamed from: a1 */
    StickerPanelView f72379a1;

    /* renamed from: b1 */
    KeyboardFrameLayout f72380b1;

    /* renamed from: c1 */
    Button f72381c1;

    /* renamed from: d1 */
    boolean f72382d1 = true;

    /* renamed from: e1 */
    boolean f72383e1 = true;

    /* renamed from: f1 */
    boolean f72384f1 = false;

    /* renamed from: g1 */
    boolean f72385g1 = false;

    /* renamed from: h1 */
    C31890dc f72386h1;

    /* renamed from: i1 */
    C31890dc f72387i1;

    /* renamed from: j1 */
    int f72388j1;

    /* renamed from: k1 */
    boolean f72389k1;

    /* renamed from: l1 */
    boolean f72390l1;

    /* renamed from: m1 */
    int f72391m1;

    /* renamed from: n1 */
    PrivacyInfo f72392n1;

    /* renamed from: o1 */
    ContactProfile f72393o1;

    /* renamed from: p1 */
    MenuListPopupView f72394p1;

    /* renamed from: q1 */
    View f72395q1;

    /* renamed from: r1 */
    RobotoTextView f72396r1;

    /* renamed from: s1 */
    RobotoTextView f72397s1;

    /* renamed from: t1 */
    int f72398t1;

    /* renamed from: u1 */
    Handler f72399u1;

    /* renamed from: v1 */
    final Runnable f72400v1;

    /* renamed from: w1 */
    C0820h.a f72401w1;

    /* renamed from: x1 */
    Editable f72402x1;

    /* renamed from: y1 */
    Runnable f72403y1;

    /* renamed from: z1 */
    boolean f72404z1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.BaseUpdateStatusView$a */
    /* loaded from: classes6.dex */
    public class C14094a extends AnimatorListenerAdapter {
        C14094a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            try {
                BaseUpdateStatusView.this.f72375W0.setVisibility(8);
                for (int i11 = 0; i11 < BaseUpdateStatusView.this.f72375W0.getChildCount(); i11++) {
                    BaseUpdateStatusView.this.f72375W0.getChildAt(i11).setTranslationX(0.0f);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.BaseUpdateStatusView$b */
    /* loaded from: classes6.dex */
    class RunnableC14095b implements Runnable {
        RunnableC14095b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            float f11;
            try {
                BaseUpdateStatusView baseUpdateStatusView = BaseUpdateStatusView.this;
                if (baseUpdateStatusView.f72402x1 == null) {
                    return;
                }
                C31890dc c31890dc = baseUpdateStatusView.f72387i1;
                if (c31890dc != null) {
                    f11 = c31890dc.f146497c;
                } else {
                    f11 = 16.0f;
                }
                float m118742r = AbstractC23136l9.m118742r(f11);
                BaseUpdateStatusView baseUpdateStatusView2 = BaseUpdateStatusView.this;
                if (baseUpdateStatusView2.f72385g1) {
                    baseUpdateStatusView2.f72385g1 = false;
                } else {
                    C28652r.m143349v().m143362X(BaseUpdateStatusView.this.f72402x1, m118742r);
                    C0820h.f2880z = null;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.BaseUpdateStatusView$c */
    /* loaded from: classes6.dex */
    public class C14096c extends C7145n.g {
        C14096c() {
        }

        @Override // com.zing.zalo.adapters.C7145n.g, com.zing.zalo.adapters.C7145n.a
        /* renamed from: a */
        public void mo36357a(int i11) {
            try {
                if (i11 == 70) {
                    BaseUpdateStatusView.this.m78480TM(new ArrayList());
                } else if (i11 == 80) {
                    AbstractC23647d.m123893c();
                    BaseUpdateStatusView.this.m78487f4();
                } else if (i11 == 90) {
                    BaseUpdateStatusView.this.m78479SM((ArrayList) BaseUpdateStatusView.this.f72392n1.m45138e());
                } else {
                    BaseUpdateStatusView.this.m78492oN(i11, false);
                    BaseUpdateStatusView.this.m78481U2();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.adapters.C7145n.g, com.zing.zalo.adapters.C7145n.a
        /* renamed from: c */
        public void mo36359c(int i11) {
            try {
                BaseUpdateStatusView.this.m78480TM((ArrayList) BaseUpdateStatusView.this.f72392n1.m45138e());
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.BaseUpdateStatusView$d */
    /* loaded from: classes6.dex */
    public class C14097d extends AbstractC31727b {
        C14097d() {
        }

        @Override // z90.AbstractC31727b
        /* renamed from: d */
        public void mo38306d(String str, int i11, int i12) {
            char charAt;
            try {
                if (BaseUpdateStatusView.this.f72372T0 != null && (BaseUpdateStatusView.f72365B1 - BaseUpdateStatusView.this.f72372T0.length()) - str.length() >= 0) {
                    StringBuilder sb2 = new StringBuilder();
                    int selectionEnd = BaseUpdateStatusView.this.f72372T0.getSelectionEnd();
                    float f11 = 16.0f;
                    if (selectionEnd == BaseUpdateStatusView.this.m78470sM() && AbstractC23309i.m121379Rd() == 1) {
                        if (selectionEnd > 0 && (charAt = BaseUpdateStatusView.this.m78496tM().charAt(selectionEnd - 1)) != '\t' && charAt != '\n' && charAt != ' ') {
                            sb2.append(" ");
                            sb2.append(str);
                        }
                        if (selectionEnd == BaseUpdateStatusView.this.m78470sM()) {
                            if (sb2.length() == 0) {
                                sb2.append(str);
                                sb2.append(" ");
                            } else {
                                sb2.append(" ");
                            }
                        }
                        if (sb2.length() > 0 && sb2.toString().trim().equals(str)) {
                            str = sb2.toString();
                        }
                        if (BaseUpdateStatusView.this.f72372T0 != null && (BaseUpdateStatusView.f72365B1 - BaseUpdateStatusView.this.f72372T0.length()) - str.length() >= 0) {
                            C31890dc c31890dc = BaseUpdateStatusView.this.f72387i1;
                            if (c31890dc != null) {
                                f11 = c31890dc.f146497c;
                            }
                            C0820h.m2140c(BaseUpdateStatusView.this.m78469rM(), selectionEnd, str, AbstractC23136l9.m118742r(f11), BaseUpdateStatusView.this.f72401w1);
                            return;
                        }
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.limit_input_text));
                        return;
                    }
                    C31890dc c31890dc2 = BaseUpdateStatusView.this.f72387i1;
                    if (c31890dc2 != null) {
                        f11 = c31890dc2.f146497c;
                    }
                    C0820h.m2140c(BaseUpdateStatusView.this.m78469rM(), selectionEnd, str, AbstractC23136l9.m118742r(f11), BaseUpdateStatusView.this.f72401w1);
                    return;
                }
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.limit_input_text));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // z90.AbstractC31727b
        /* renamed from: e */
        public void mo39093e(int i11) {
            try {
                if (i11 == 0) {
                    BaseUpdateStatusView baseUpdateStatusView = BaseUpdateStatusView.this;
                    baseUpdateStatusView.f72399u1.postDelayed(baseUpdateStatusView.f72400v1, 400L);
                } else if (i11 == 1 || i11 == 3) {
                    BaseUpdateStatusView baseUpdateStatusView2 = BaseUpdateStatusView.this;
                    baseUpdateStatusView2.f72399u1.removeCallbacks(baseUpdateStatusView2.f72400v1);
                    BaseUpdateStatusView baseUpdateStatusView3 = BaseUpdateStatusView.this;
                    baseUpdateStatusView3.f72398t1++;
                    if (!baseUpdateStatusView3.f72399u1.hasMessages(1)) {
                        BaseUpdateStatusView.this.f72399u1.sendEmptyMessage(1);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.BaseUpdateStatusView$e */
    /* loaded from: classes6.dex */
    class HandlerC14098e extends Handler {
        HandlerC14098e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                if (message.what == 1) {
                    BaseUpdateStatusView.this.m78463mN();
                    BaseUpdateStatusView baseUpdateStatusView = BaseUpdateStatusView.this;
                    int i11 = baseUpdateStatusView.f72398t1 - 1;
                    baseUpdateStatusView.f72398t1 = i11;
                    if (i11 > 0) {
                        sendEmptyMessageDelayed(1, 50L);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.BaseUpdateStatusView$f */
    /* loaded from: classes6.dex */
    public class C14099f implements C27477e.b {
        C14099f() {
        }

        @Override // v20.C27477e.b
        /* renamed from: a */
        public void mo78503a(C31890dc c31890dc, int i11) {
            try {
                C31845ac.m152996J().m153029G(c31890dc, new C14107n(), (byte) 2);
                BaseUpdateStatusView.this.m78451cN(i11, true);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // v20.C27477e.b
        /* renamed from: b */
        public void mo78504b(C31890dc c31890dc, int i11) {
            try {
                C31845ac m152996J = C31845ac.m152996J();
                BaseUpdateStatusView baseUpdateStatusView = BaseUpdateStatusView.this;
                m152996J.m153074y0(baseUpdateStatusView.f72372T0, c31890dc, baseUpdateStatusView.f72382d1);
                BaseUpdateStatusView.this.m78488gN(c31890dc);
                BaseUpdateStatusView.this.m78450aN();
                BaseUpdateStatusView.this.m78451cN(i11, true);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.BaseUpdateStatusView$g */
    /* loaded from: classes6.dex */
    public class C14100g extends RecyclerView.AbstractC1887n {
        C14100g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            rect.right = AbstractC23136l9.m118742r(5.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.BaseUpdateStatusView$h */
    /* loaded from: classes6.dex */
    public class C14101h implements FeedRecyclerView.InterfaceC8863b {
        C14101h() {
        }

        @Override // com.zing.zalo.feed.uicontrols.FeedRecyclerView.InterfaceC8863b
        /* renamed from: a */
        public void mo43265a() {
            BaseUpdateStatusView.this.f72383e1 = false;
        }

        @Override // com.zing.zalo.feed.uicontrols.FeedRecyclerView.InterfaceC8863b
        /* renamed from: b */
        public void mo43266b() {
            BaseUpdateStatusView.this.f72383e1 = true;
        }

        @Override // com.zing.zalo.feed.uicontrols.FeedRecyclerView.InterfaceC8863b
        /* renamed from: c */
        public void mo43267c() {
            BaseUpdateStatusView.this.f72383e1 = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.BaseUpdateStatusView$i */
    /* loaded from: classes6.dex */
    public class C14102i extends RecyclerView.AbstractC1892s {
        C14102i() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            try {
                super.mo952b(recyclerView, i11);
                if (i11 == 0) {
                    BaseUpdateStatusView.this.f72377Y0.m140550e0(false);
                    BaseUpdateStatusView.this.f72377Y0.m10008p();
                } else {
                    BaseUpdateStatusView.this.f72377Y0.m140550e0(true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.BaseUpdateStatusView$j */
    /* loaded from: classes6.dex */
    class RunnableC14103j implements Runnable {
        RunnableC14103j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (BaseUpdateStatusView.this.m78470sM() > 0) {
                    BaseUpdateStatusView.this.m78463mN();
                    BaseUpdateStatusView baseUpdateStatusView = BaseUpdateStatusView.this;
                    baseUpdateStatusView.f72399u1.postDelayed(baseUpdateStatusView.f72400v1, 50L);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.BaseUpdateStatusView$k */
    /* loaded from: classes6.dex */
    public class C14104k implements C0820h.a {
        C14104k() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m78506c(Editable editable, int i11, int i12) {
            try {
                BaseUpdateStatusView baseUpdateStatusView = BaseUpdateStatusView.this;
                StatusComposeEditText statusComposeEditText = baseUpdateStatusView.f72372T0;
                if (statusComposeEditText != null) {
                    int i13 = 1;
                    baseUpdateStatusView.f72385g1 = true;
                    statusComposeEditText.setText(editable);
                    if (i11 != BaseUpdateStatusView.this.m78470sM() || AbstractC23309i.m121379Rd() != 1) {
                        i13 = 0;
                    }
                    BaseUpdateStatusView.this.f72372T0.setSelection(i12 + i13);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // ag0.C0820h.a
        /* renamed from: a */
        public void mo2144a(final Editable editable, final int i11, final int i12) {
            BaseUpdateStatusView.this.f72399u1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.p2
                @Override // java.lang.Runnable
                public final void run() {
                    BaseUpdateStatusView.C14104k.this.m78506c(editable, i11, i12);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.BaseUpdateStatusView$l */
    /* loaded from: classes6.dex */
    public class C14105l implements KeyboardFrameLayout.InterfaceC13508a {
        C14105l() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m78508b() {
            BaseUpdateStatusView baseUpdateStatusView = BaseUpdateStatusView.this;
            if (baseUpdateStatusView.f72391m1 != 2) {
                baseUpdateStatusView.f72380b1.setPaddingBottom(0);
                BaseUpdateStatusView.this.f72380b1.requestLayout();
            }
        }

        @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
        /* renamed from: y1 */
        public void mo37136y1(int i11) {
            try {
                BaseUpdateStatusView baseUpdateStatusView = BaseUpdateStatusView.this;
                baseUpdateStatusView.f72384f1 = false;
                baseUpdateStatusView.f72399u1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.q2
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseUpdateStatusView.C14105l.this.m78508b();
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
        /* renamed from: z3 */
        public void mo37138z3(int i11) {
            BaseUpdateStatusView.this.f72384f1 = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.BaseUpdateStatusView$m */
    /* loaded from: classes6.dex */
    public class ViewTreeObserverOnPreDrawListenerC14106m implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: p */
        final /* synthetic */ Animation f72417p;

        /* renamed from: com.zing.zalo.ui.zviews.BaseUpdateStatusView$m$a */
        /* loaded from: classes6.dex */
        class a extends AnimatorListenerAdapter {
            a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                try {
                    if (BaseUpdateStatusView.this.f72375W0.getVisibility() == 8) {
                        BaseUpdateStatusView.this.f72375W0.setVisibility(0);
                        BaseUpdateStatusView.this.f72375W0.clearAnimation();
                        ViewTreeObserverOnPreDrawListenerC14106m viewTreeObserverOnPreDrawListenerC14106m = ViewTreeObserverOnPreDrawListenerC14106m.this;
                        BaseUpdateStatusView.this.f72375W0.startAnimation(viewTreeObserverOnPreDrawListenerC14106m.f72417p);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        ViewTreeObserverOnPreDrawListenerC14106m(Animation animation) {
            this.f72417p = animation;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            try {
                BaseUpdateStatusView.this.f72375W0.getViewTreeObserver().removeOnPreDrawListener(this);
                if (BaseUpdateStatusView.this.m78477NM()) {
                    int childCount = BaseUpdateStatusView.this.f72375W0.getChildCount();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList = new ArrayList();
                    for (int i11 = childCount - 1; i11 >= 0; i11--) {
                        View childAt = BaseUpdateStatusView.this.f72375W0.getChildAt(i11);
                        childAt.setTranslationX((-childAt.getLeft()) - childAt.getWidth());
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, "translationX", 0.0f);
                        ofFloat.setStartDelay((r1 - i11) * 50);
                        ofFloat.setDuration(300L);
                        arrayList.add(ofFloat);
                    }
                    animatorSet.playTogether(arrayList);
                    animatorSet.setInterpolator(new C26087b());
                    animatorSet.start();
                    animatorSet.addListener(new a());
                } else {
                    BaseUpdateStatusView.this.f72375W0.clearAnimation();
                    BaseUpdateStatusView.this.f72375W0.startAnimation(this.f72417p);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.ui.zviews.BaseUpdateStatusView$n */
    /* loaded from: classes6.dex */
    public class C14107n implements C31845ac.g {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m78511e() {
            if (BaseUpdateStatusView.this.m92672lJ()) {
                BaseUpdateStatusView.this.m78484ZM(true, true);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m78512f(String str, C31890dc c31890dc) {
            try {
                if (!BaseUpdateStatusView.this.m92672lJ()) {
                    return;
                }
                BaseUpdateStatusView.this.m78483YM(C31845ac.m152996J().m153035N());
                C31890dc m140541R = BaseUpdateStatusView.this.f72377Y0.m140541R();
                if (m140541R != null) {
                    if (str.equals(m140541R.f146495a + "")) {
                        if (c31890dc.m153250u()) {
                            C31845ac m152996J = C31845ac.m152996J();
                            BaseUpdateStatusView baseUpdateStatusView = BaseUpdateStatusView.this;
                            m152996J.m153074y0(baseUpdateStatusView.f72372T0, c31890dc, baseUpdateStatusView.f72382d1);
                            BaseUpdateStatusView.this.m78488gN(c31890dc);
                        } else {
                            BaseUpdateStatusView.this.m78484ZM(true, true);
                        }
                    }
                }
                BaseUpdateStatusView.this.m78450aN();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // p716zh.C31845ac.g
        /* renamed from: a */
        public void mo71404a(int i11, String str) {
            BaseUpdateStatusView.this.f72399u1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.r2
                @Override // java.lang.Runnable
                public final void run() {
                    BaseUpdateStatusView.C14107n.this.m78511e();
                }
            });
        }

        @Override // p716zh.C31845ac.g
        /* renamed from: b */
        public void mo71405b(final String str, final C31890dc c31890dc) {
            BaseUpdateStatusView.this.f72399u1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.s2
                @Override // java.lang.Runnable
                public final void run() {
                    BaseUpdateStatusView.C14107n.this.m78512f(str, c31890dc);
                }
            });
        }

        private C14107n() {
        }
    }

    public BaseUpdateStatusView() {
        C31890dc m153044X = C31845ac.m152996J().m153044X();
        this.f72386h1 = m153044X;
        this.f72387i1 = m153044X;
        this.f72388j1 = 0;
        this.f72391m1 = 0;
        this.f72392n1 = new PrivacyInfo();
        this.f72399u1 = new HandlerC14098e(Looper.getMainLooper());
        this.f72400v1 = new RunnableC14103j();
        this.f72401w1 = new C14104k();
        this.f72403y1 = new RunnableC14095b();
        this.f72404z1 = false;
        this.f72367A1 = false;
    }

    /* renamed from: BM */
    private void m78436BM(int i11, Intent intent) {
        ArrayList arrayList;
        try {
            if (i11 == -1 && intent != null) {
                if (intent.hasExtra("extra_selected_profiles")) {
                    arrayList = intent.getParcelableArrayListExtra("extra_selected_profiles");
                } else {
                    arrayList = null;
                }
                if (arrayList != null && arrayList.size() != 0) {
                    m78492oN(PrivacyInfo.m45129a(arrayList), true);
                    return;
                }
                m78492oN(50, true);
                return;
            }
            mo78490kN();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: DM */
    private void m78437DM(View view) {
        ImageView imageView = (ImageView) view.findViewById(AbstractC6918a0.imv_emo_sticker);
        this.f72378Z0 = imageView;
        imageView.setOnClickListener(this);
    }

    /* renamed from: EM */
    private void m78438EM(View view) {
        KeyboardFrameLayout keyboardFrameLayout = (KeyboardFrameLayout) view.findViewById(AbstractC6918a0.layout_keyboard_frame);
        this.f72380b1 = keyboardFrameLayout;
        keyboardFrameLayout.setTopViewGroup(this.f72370R0);
        ArrayList<View> arrayList = new ArrayList<>();
        View findViewById = view.findViewById(AbstractC6918a0.sticker_panel_container);
        if (findViewById != null) {
            arrayList.add(findViewById);
        }
        this.f72380b1.setBottomViewsGroup(arrayList);
        this.f72380b1.setOnKeyboardListener(new C14105l());
    }

    /* renamed from: FM */
    private void m78439FM(View view) {
        StatusComposeEditText statusComposeEditText = (StatusComposeEditText) view.findViewById(AbstractC6918a0.edt_status_compose);
        this.f72372T0 = statusComposeEditText;
        statusComposeEditText.addTextChangedListener(this);
        this.f72372T0.setOnClickListener(this);
    }

    /* renamed from: GM */
    private void m78440GM(int i11) {
        Bundle m72638dN = StickerPanelView.m72638dN(EnumC30861e.f142417p, 0, false, true, null, null, false, 0, C28020b3.f130648a.m141208y("STICKER_PANEL_", this.f72421L0.m92676n2()), false, 1, AbstractC16781w.indicator_bg_color, false, i11, false, false);
        StickerPanelView stickerPanelView = new StickerPanelView();
        this.f72379a1 = stickerPanelView;
        stickerPanelView.mo60305zK(m72638dN);
        if (!super.mo60294yp()) {
            m92649TI().m93058d2(AbstractC6918a0.sticker_panel_container, this.f72379a1, 0, "STICKER_PANEL_VIEW_TAG", 0, false);
            m78441HM();
        }
    }

    /* renamed from: HM */
    private void m78441HM() {
        this.f72379a1.m72709oO(new C14097d());
    }

    /* renamed from: IM */
    private void m78442IM(View view) {
        RobotoTextView robotoTextView = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_tag_location_preview);
        this.f72373U0 = robotoTextView;
        robotoTextView.setHighlightColor(0);
    }

    /* renamed from: JM */
    private void m78443JM(View view) {
        this.f72374V0 = (RedDotImageButton) view.findViewById(AbstractC6918a0.imv_entry_typo);
        this.f72375W0 = (FeedRecyclerView) view.findViewById(AbstractC6918a0.lv_typo);
        this.f72374V0.setOnClickListener(this);
        this.f72374V0.setRedDotMargin(AbstractC23136l9.m118742r(6.0f));
        NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr = new NoPredictiveItemAnimLinearLayoutMngr(m92648SI());
        this.f72376X0 = noPredictiveItemAnimLinearLayoutMngr;
        noPredictiveItemAnimLinearLayoutMngr.m9723C2(0);
        C27477e c27477e = new C27477e(getContext(), C27477e.d.TYPO_FEED);
        this.f72377Y0 = c27477e;
        c27477e.m140552g0(new C14099f());
        this.f72375W0.setLayoutManager(this.f72376X0);
        this.f72375W0.m9816A(new C14100g());
        this.f72375W0.setCatchTouchEventListener(new C14101h());
        this.f72375W0.m9826E(new C14102i());
        this.f72377Y0.m140551f0(this.f72386h1);
        this.f72375W0.setAdapter(this.f72377Y0);
        this.f72375W0.setVisibility(8);
        m78449WM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OM */
    public /* synthetic */ void m78444OM(int i11) {
        if (i11 == 58) {
            try {
                m78449WM();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PM */
    public /* synthetic */ void m78445PM(View view) {
        m78478RM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QM */
    public /* synthetic */ void m78446QM(int i11) {
        m78451cN(i11, true);
    }

    /* renamed from: UM */
    private void m78447UM() {
        try {
            if (this.f72393o1 != null) {
                return;
            }
            MenuListPopupView menuListPopupView = this.f72394p1;
            if (menuListPopupView != null && menuListPopupView.m87763vL() > 0 && System.currentTimeMillis() - this.f72394p1.m87763vL() < 300) {
                this.f72394p1.m87753BL();
                return;
            }
            MenuListPopupView menuListPopupView2 = this.f72394p1;
            if (menuListPopupView2 != null && menuListPopupView2.m92687sJ()) {
                m78481U2();
            } else {
                AbstractC2379w.m12430d(this.f72372T0);
                mo78490kN();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: VM */
    private void m78448VM() {
        boolean z11;
        C31890dc c31890dc;
        try {
            if (this.f72386h1 != null && this.f72387i1 != null) {
                int m119758v = AbstractC23244v8.m119758v(m78496tM(), System.getProperty("line.separator"));
                if (m78496tM().trim().length() <= 70 && m119758v <= 2) {
                    int i11 = this.f72388j1;
                    m78453fN(0);
                    if (this.f72386h1.f146495a != this.f72387i1.f146495a) {
                        C31845ac.m152996J().m153074y0(this.f72372T0, this.f72386h1, true);
                        this.f72387i1 = this.f72386h1;
                        m78450aN();
                    }
                    if (i11 == 1 && !this.f72389k1 && (c31890dc = this.f72387i1) != null && !c31890dc.m153249t()) {
                        mo78489iN(true, true);
                        return;
                    }
                    return;
                }
                m78453fN(1);
                if (m119758v > 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f72390l1 = z11;
                if (this.f72389k1) {
                    mo78489iN(false, true);
                }
                if (!this.f72386h1.m153249t() && !this.f72387i1.m153249t()) {
                    C31890dc m153044X = C31845ac.m152996J().m153044X();
                    C31845ac.m152996J().m153074y0(this.f72372T0, m153044X, true);
                    this.f72387i1 = m153044X;
                    m78450aN();
                    if (this.f72390l1) {
                        if (!this.f72367A1) {
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_over_line_applied_typo));
                            this.f72367A1 = true;
                            return;
                        }
                        return;
                    }
                    if (!this.f72404z1) {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_over_limit_applied_typo));
                        this.f72404z1 = true;
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: WM */
    private void m78449WM() {
        try {
            List m153035N = C31845ac.m152996J().m153035N();
            if (m153035N != null && m153035N.size() > 1) {
                m78483YM(m153035N);
                this.f72374V0.setVisibility(0);
            } else {
                this.f72374V0.setVisibility(8);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aN */
    public void m78450aN() {
        float f11;
        try {
            C31890dc c31890dc = this.f72387i1;
            if (c31890dc != null) {
                f11 = c31890dc.f146497c;
            } else {
                f11 = 16.0f;
            }
            float m118742r = AbstractC23136l9.m118742r(f11);
            if (!TextUtils.isEmpty(m78496tM())) {
                C28652r.m143349v().m143362X(m78469rM(), m118742r);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cN */
    public void m78451cN(int i11, boolean z11) {
        C27477e c27477e = this.f72377Y0;
        if (c27477e != null) {
            c27477e.m140544Y(i11, this.f72375W0, this.f72376X0, z11);
        }
    }

    /* renamed from: dN */
    private void m78452dN(final int i11) {
        this.f72399u1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.o2
            @Override // java.lang.Runnable
            public final void run() {
                BaseUpdateStatusView.this.m78446QM(i11);
            }
        }, 200L);
    }

    /* renamed from: fN */
    private void m78453fN(int i11) {
        this.f72388j1 = i11;
        m78493pN(i11);
    }

    /* renamed from: hN */
    private void m78456hN(ZaloView zaloView, boolean z11) {
        if (zaloView != null) {
            try {
                C17487o0 m92649TI = m92649TI();
                if (z11) {
                    m92649TI.m93077o2(zaloView);
                    if (zaloView.m92656bJ() != null) {
                        zaloView.m92656bJ().bringToFront();
                    }
                } else {
                    m92649TI.m93045X0(zaloView);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jN */
    public void m78459jN() {
        try {
            if (!this.f72384f1) {
                m78474Ka(1);
            }
            if (this.f72372T0 != null) {
                this.f72372T0.setSelection(m78496tM().length());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mN */
    public void m78463mN() {
        try {
            C0820h.f2880z = null;
            StatusComposeEditText statusComposeEditText = this.f72372T0;
            if (statusComposeEditText != null) {
                statusComposeEditText.dispatchKeyEvent(new KeyEvent(0L, 0L, 0, 67, 0));
                this.f72372T0.dispatchKeyEvent(new KeyEvent(0L, 0L, 1, 67, 0));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: nN */
    private void m78465nN() {
        ZaloView m92996E0 = m92649TI().m92996E0("STICKER_PANEL_VIEW_TAG");
        if (m92996E0 instanceof StickerPanelView) {
            this.f72379a1 = (StickerPanelView) m92996E0;
        }
        if (this.f72379a1 != null) {
            m78441HM();
        }
    }

    /* renamed from: qN */
    private void m78468qN() {
        Button button = this.f72381c1;
        if (button != null) {
            button.setEnabled(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rM */
    public Editable m78469rM() {
        StatusComposeEditText statusComposeEditText = this.f72372T0;
        if (statusComposeEditText != null) {
            return statusComposeEditText.getText();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sM */
    public int m78470sM() {
        Editable m78469rM = m78469rM();
        if (m78469rM != null) {
            return m78469rM.length();
        }
        return 0;
    }

    /* renamed from: AM */
    public void m78471AM(int i11, Intent intent) {
        ArrayList arrayList;
        int i12;
        try {
            if (i11 == -1 && intent != null) {
                if (intent.hasExtra("extra_selected_profiles")) {
                    arrayList = intent.getParcelableArrayListExtra("extra_selected_profiles");
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    PrivacyInfo.m45127K(arrayList);
                    if (arrayList.size() == 0) {
                        i12 = 40;
                    } else {
                        i12 = 90;
                    }
                    m78492oN(i12, true);
                    return;
                }
                return;
            }
            mo78490kN();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m92637BK(true);
        C31845ac.m152996J().m153054l();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: CM */
    public void mo78472CM(Bundle bundle) {
        if (bundle != null) {
            if (bundle.containsKey("entry_point_chain")) {
                this.f72368P0 = C32002l4.m154269m(bundle.getString("entry_point_chain")).m154271a(mo78497uM());
            } else {
                this.f72368P0 = C32002l4.m154264g(mo78497uM());
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        try {
            actionBarMenu.m92750r();
            Button button = (Button) actionBarMenu.m92744k(AbstractC6918a0.menu_next, AbstractC7409c0.action_bar_menu_item_blue_text_only);
            this.f72381c1 = button;
            button.setText(mo78501yM());
            m78468qN();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(mo78499wM(), viewGroup, false);
        this.f72369Q0 = inflate;
        mo78473KM(inflate);
        return this.f72369Q0;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        try {
            super.mo39024IJ();
            C0820h.m2142e();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.m124114c().m124117e(this, 58);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: KM */
    public void mo78473KM(View view) {
        this.f72370R0 = view.findViewById(AbstractC6918a0.layout_content);
        this.f72371S0 = (ScrollView) view.findViewById(AbstractC6918a0.view_scroll_status);
        m78439FM(view);
        m78442IM(view);
        m78443JM(view);
        m78437DM(view);
        m78438EM(view);
    }

    /* renamed from: Ka */
    public void m78474Ka(int i11) {
        this.f72391m1 = i11;
        int m122007i5 = AbstractC23309i.m122007i5(MainApplication.getAppContext());
        try {
            int i12 = this.f72391m1;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        AbstractC2379w.m12430d(this.f72372T0);
                        ImageView imageView = this.f72378Z0;
                        imageView.setImageDrawable(AbstractC23136l9.m118665N(imageView.getContext(), AbstractC16803z.ic_postfeed_keyboard));
                        this.f72380b1.setPaddingBottom(m122007i5);
                        this.f72380b1.requestLayout();
                        if (this.f72379a1 == null) {
                            m78440GM(m122007i5);
                        } else {
                            C23744a.m124114c().m124116d(8006, Integer.valueOf(m122007i5));
                        }
                        m78456hN(this.f72379a1, true);
                        return;
                    }
                    return;
                }
                m78456hN(this.f72379a1, false);
                ImageView imageView2 = this.f72378Z0;
                imageView2.setImageDrawable(AbstractC23136l9.m118665N(imageView2.getContext(), AbstractC16803z.bg_btn_postfeed_addsticker));
                this.f72380b1.setPaddingBottom(m122007i5);
                this.f72380b1.requestLayout();
                AbstractC2379w.m12432f(this.f72372T0);
                return;
            }
            AbstractC2379w.m12430d(this.f72372T0);
            m78456hN(this.f72379a1, false);
            ImageView imageView3 = this.f72378Z0;
            imageView3.setImageDrawable(AbstractC23136l9.m118665N(imageView3.getContext(), AbstractC16803z.bg_btn_postfeed_addsticker));
            this.f72380b1.setPaddingBottom(0);
            this.f72380b1.requestLayout();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: LM */
    protected boolean mo78475LM() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        if (super.mo37488Li() && this.f72383e1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: MM */
    public boolean m78476MM() {
        return this.f72393o1 != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: NM */
    public boolean m78477NM() {
        try {
            int childCount = this.f72375W0.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                if (this.f72375W0.getChildAt(i11).getWidth() < f72366C1) {
                    return false;
                }
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        return super.mo37491QJ(i11);
    }

    /* renamed from: RM */
    protected void m78478RM() {
        m78447UM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        try {
            bundle.putString("saved_caption", m78496tM());
            PrivacyInfo privacyInfo = this.f72392n1;
            if (privacyInfo != null) {
                bundle.putInt("saved_privacy_type", privacyInfo.f45973p);
                bundle.putInt("saved_privacy_id", this.f72392n1.f45977t);
            }
            bundle.putBoolean("saved_is_showing_typo", this.f72389k1);
            bundle.putBoolean("saved_is_over_num_enter", this.f72390l1);
            C31890dc c31890dc = this.f72386h1;
            if (c31890dc != null) {
                bundle.putString("saved_selected_typo", c31890dc.m153253y());
            }
            C31890dc c31890dc2 = this.f72387i1;
            if (c31890dc2 != null) {
                bundle.putString("saved_selected_typo", c31890dc2.m153253y());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: SM */
    public void m78479SM(ArrayList arrayList) {
        try {
            m78481U2();
            Bundle m83055pM = ProfilePickerView.m83055pM(arrayList, 100, AbstractC23136l9.m118743r0(AbstractC8020f0.str_privacy_except_friends));
            m83055pM.putBoolean("extra_show_text_instead_icon", true);
            m83055pM.putBoolean("extra_type_exclude_friends", true);
            this.f72421L0.m92662fJ().m93066i2(ProfilePickerView.class, m83055pM, 102, 1, true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setBackgroundResource(AbstractC16803z.bg_postfeed_actionbar);
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back);
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
                if (this.f72395q1 == null) {
                    this.f72395q1 = LayoutInflater.from(this.f72421L0.getContext()).inflate(AbstractC7409c0.actionbar_leftview_compose_feed, (ViewGroup) null, false);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.gravity = 16;
                    layoutParams.leftMargin = AbstractC23222t7.f112545X;
                    this.f88760a0.m92707b(this.f72395q1, layoutParams);
                    View view = this.f72395q1;
                    if (view != null) {
                        RobotoTextView robotoTextView = (RobotoTextView) view.findViewById(AbstractC6918a0.titleTv);
                        this.f72396r1 = robotoTextView;
                        if (robotoTextView != null) {
                            robotoTextView.setMaxScaledTextSize(AbstractC23222t7.f112586t);
                            this.f72396r1.setTextSize(0, AbstractC23222t7.f112586t);
                            this.f72396r1.setTypeface(C13718q1.m76694c(getContext(), 7));
                        }
                        RobotoTextView robotoTextView2 = (RobotoTextView) this.f72395q1.findViewById(AbstractC6918a0.subtitleTv);
                        this.f72397s1 = robotoTextView2;
                        if (robotoTextView2 != null) {
                            robotoTextView2.setMaxScaledTextSize(AbstractC23222t7.f112576o);
                            this.f72397s1.setTextSize(0, AbstractC23222t7.f112576o);
                        }
                        this.f72395q1.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.m2
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                BaseUpdateStatusView.this.m78445PM(view2);
                            }
                        });
                    }
                }
                mo78482XM();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: TM */
    public void m78480TM(ArrayList arrayList) {
        try {
            m78481U2();
            Bundle m83055pM = ProfilePickerView.m83055pM(arrayList, 100, AbstractC23136l9.m118743r0(AbstractC8020f0.str_privacy_select_title));
            m83055pM.putBoolean("extra_show_text_instead_icon", true);
            this.f72421L0.m92662fJ().m93066i2(ProfilePickerView.class, m83055pM, 100, 1, true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: U2 */
    public void m78481U2() {
        try {
            MenuListPopupView menuListPopupView = this.f72394p1;
            if (menuListPopupView != null) {
                menuListPopupView.dismiss();
            } else {
                ZaloView m92996E0 = this.f72421L0.m92649TI().m92996E0("MenuListPopupView");
                if (m92996E0 != null) {
                    m92996E0.finish();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        if (z11 && this.f72421L0.m92676n2() != null && this.f72421L0.m92676n2().getWindow() != null) {
            this.f72421L0.m92676n2().mo35554O(18);
        }
        if (z11 && !z12) {
            try {
                if (this.f72421L0.m92676n2() != null && this.f72421L0.m92676n2().getWindow() != null) {
                    this.f72421L0.m92676n2().getWindow().setBackgroundDrawable(new ColorDrawable(C23212s8.m119607o(m92676n2().getContext(), AbstractC16781w.PrimaryBackgroundColor)));
                }
                this.f72399u1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.n2
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseUpdateStatusView.this.m78459jN();
                    }
                }, 100L);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: XM */
    protected void mo78482XM() {
        String m118743r0;
        String m118743r02;
        String m118743r03;
        PrivacyInfo privacyInfo = this.f72392n1;
        String str = "";
        int i11 = -1;
        if (privacyInfo != null) {
            int i12 = privacyInfo.f45973p;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            m118743r0 = "";
                        } else {
                            m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_privacy_except_friends_count_title);
                            i11 = AbstractC16803z.icn_profile_form_except;
                            m118743r03 = String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_privacy_except_friends_count), Integer.valueOf(this.f72392n1.f45974q.size()));
                        }
                    } else {
                        m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_privacy_to_friend_count_title);
                        i11 = AbstractC16803z.icn_profile_form_selected_friends;
                        m118743r03 = String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_privacy_to_friend_count), Integer.valueOf(this.f72392n1.f45974q.size()));
                    }
                } else {
                    m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_privacy_share_only_me_title);
                    i11 = AbstractC16803z.icn_profile_form_private;
                    m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_privacy_share_only_me_new);
                }
            } else {
                m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_privacy_share_all_title);
                i11 = AbstractC16803z.icn_profile_form_friends;
                m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_privacy_share_all_new);
            }
            String str2 = m118743r02;
            str = m118743r03;
            m118743r0 = str2;
        } else {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_privacy);
        }
        m78495rN(m118743r0, str, i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: YM */
    public void m78483YM(List list) {
        try {
            this.f72377Y0.m140548c0(list);
            this.f72377Y0.m10008p();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: ZM */
    public void m78484ZM(boolean z11, boolean z12) {
        try {
            C31890dc m153044X = C31845ac.m152996J().m153044X();
            C31845ac.m152996J().m153074y0(this.f72372T0, m153044X, this.f72382d1);
            this.f72377Y0.m140551f0(m153044X);
            m78488gN(m153044X);
            if (z12) {
                m78452dN(0);
            }
            if (z11) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_download_failed_typo));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        try {
            this.f72402x1 = editable;
            String trim = m78496tM().trim();
            int length = trim.length();
            int i11 = f72365B1;
            if (length > i11) {
                this.f72372T0.setText(trim.substring(0, i11));
                this.f72372T0.setSelection(i11);
                ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_status_content_limit, Integer.valueOf(i11)));
            }
            this.f72399u1.removeCallbacks(this.f72403y1);
            this.f72399u1.postDelayed(this.f72403y1, 150L);
            m78448VM();
            this.f72372T0.setHintTextColor(this.f72387i1.m153238c());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: bN */
    public void mo78485bN(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            if (bundle.containsKey("saved_caption")) {
                String string = bundle.getString("saved_caption", "");
                StatusComposeEditText statusComposeEditText = this.f72372T0;
                if (statusComposeEditText != null) {
                    statusComposeEditText.setText(string);
                }
            }
            if (this.f72392n1 != null) {
                if (bundle.containsKey("saved_privacy_type")) {
                    this.f72392n1.f45973p = bundle.getInt("saved_privacy_type");
                }
                if (bundle.containsKey("saved_privacy_id")) {
                    this.f72392n1.f45977t = bundle.getInt("saved_privacy_id");
                }
                m78492oN(this.f72392n1.f45977t, true);
            }
            int i11 = bundle.getInt("saved_state_entry_typo", 0);
            this.f72388j1 = i11;
            m78453fN(i11);
            this.f72389k1 = bundle.getBoolean("saved_is_showing_typo", false);
            this.f72390l1 = bundle.getBoolean("saved_is_over_num_enter", false);
            mo78489iN(this.f72389k1, true);
            if (bundle.containsKey("saved_selected_typo")) {
                String string2 = bundle.getString("saved_selected_typo");
                if (!TextUtils.isEmpty(string2)) {
                    C31890dc c31890dc = new C31890dc(new JSONObject(string2));
                    this.f72386h1 = c31890dc;
                    C27477e c27477e = this.f72377Y0;
                    if (c27477e != null) {
                        c27477e.m140551f0(c31890dc);
                    }
                }
            }
            if (bundle.containsKey("saved_applied_typo")) {
                String string3 = bundle.getString("saved_applied_typo");
                if (!TextUtils.isEmpty(string3)) {
                    this.f72387i1 = new C31890dc(new JSONObject(string3));
                    C31845ac.m152996J().m153074y0(this.f72372T0, this.f72387i1, this.f72382d1);
                }
            }
            m78465nN();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: eN */
    public void m78486eN(C31890dc c31890dc) {
        C27477e c27477e = this.f72377Y0;
        if (c27477e != null) {
            c27477e.m140551f0(c31890dc);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f4 */
    public void m78487f4() {
        try {
            m78481U2();
            this.f72421L0.m92662fJ().m93066i2(PrivacyPickGroupView.class, null, 101, 1, true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: gN */
    public void m78488gN(C31890dc c31890dc) {
        this.f72386h1 = c31890dc;
        this.f72387i1 = c31890dc;
        AbstractC23309i.m121803cs(c31890dc.f146495a);
    }

    /* renamed from: iN */
    protected void mo78489iN(boolean z11, boolean z12) {
        int i11 = 0;
        try {
            if (z12) {
                if (z11) {
                    Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), AbstractC10919t.fade_in);
                    this.f72377Y0.m140546a0(this.f72386h1, this.f72375W0, this.f72376X0, false);
                    this.f72375W0.setVisibility(0);
                    this.f72375W0.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC14106m(loadAnimation));
                } else {
                    int childCount = this.f72375W0.getChildCount();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList = new ArrayList();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f72375W0.getChildAt(i12), "translationX", (-r4.getLeft()) - r4.getWidth());
                        ofFloat.setStartDelay(i12 * 50);
                        ofFloat.setDuration(300L);
                        arrayList.add(ofFloat);
                    }
                    animatorSet.playTogether(arrayList);
                    animatorSet.setInterpolator(new C26087b());
                    animatorSet.addListener(new C14094a());
                    animatorSet.start();
                }
            } else {
                FeedRecyclerView feedRecyclerView = this.f72375W0;
                if (!z11) {
                    i11 = 8;
                }
                feedRecyclerView.setVisibility(i11);
            }
            this.f72389k1 = z11;
            m78493pN(this.f72388j1);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: kN */
    protected void mo78490kN() {
        try {
            MenuListPopupView m87747qL = MenuListPopupView.m87747qL(m92689tK(), mo78475LM(), this.f72392n1, new C14096c(), mo78502zM());
            this.f72394p1 = m87747qL;
            m87747qL.m92602UK(this.f72421L0.m92649TI(), "MenuListPopupView");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: lN */
    public void m78491lN(Class cls, Bundle bundle) {
        bundle.putInt("SHOW_WITH_FLAGS", 33554432);
        this.f72421L0.m92662fJ().m93069k2(cls, bundle, 1, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: oN */
    public void m78492oN(int i11, boolean z11) {
        PrivacyInfo privacyInfo = this.f72392n1;
        if (i11 != privacyInfo.f45977t || z11) {
            privacyInfo.f45977t = i11;
            if (i11 != 40) {
                if (i11 != 50) {
                    if (i11 != 90) {
                        this.f72392n1 = PrivacyInfo.m45134q(i11);
                    } else {
                        this.f72392n1 = PrivacyInfo.m45133i();
                    }
                } else {
                    privacyInfo.f45973p = 1;
                }
            } else {
                privacyInfo.f45973p = 0;
            }
            mo78482XM();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        try {
            switch (i11) {
                case 100:
                case 101:
                    m78436BM(i12, intent);
                    break;
                case 102:
                    m78471AM(i12, intent);
                    break;
            }
            super.onActivityResult(i11, i12, intent);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i11;
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.edt_status_compose) {
            if (!this.f72384f1) {
                m78474Ka(1);
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.imv_emo_sticker) {
            if (this.f72391m1 == 2 && !this.f72384f1) {
                m78474Ka(1);
                return;
            } else {
                m78474Ka(2);
                return;
            }
        }
        if (id2 == AbstractC6918a0.imv_entry_typo) {
            if (this.f72388j1 == 0) {
                mo78489iN(!this.f72389k1, true);
                return;
            }
            if (this.f72390l1) {
                i11 = AbstractC8020f0.str_over_line_applied_typo;
            } else {
                i11 = AbstractC8020f0.str_over_limit_applied_typo;
            }
            ToastUtils.showMess(AbstractC23136l9.m118743r0(i11));
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            if (this.f77813M0) {
                if (this.f72421L0.m92656bJ() != null) {
                    this.f72421L0.m92656bJ().onKeyUp(i11, keyEvent);
                }
                return true;
            }
            if (this.f72384f1) {
                return true;
            }
            StickerPanelView stickerPanelView = this.f72379a1;
            if (stickerPanelView != null && !stickerPanelView.m92679oJ()) {
                m78474Ka(0);
            } else {
                mo78494qM();
            }
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        m78468qN();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: pN */
    public void m78493pN(int i11) {
        RedDotImageButton redDotImageButton = this.f72374V0;
        if (redDotImageButton == null) {
            return;
        }
        if (i11 != 0) {
            if (i11 == 1) {
                redDotImageButton.setImageResource(AbstractC16803z.icn_postfeed_typo_disable);
            }
        } else if (this.f72389k1) {
            redDotImageButton.setImageResource(AbstractC16803z.icn_postfeed_typo_back);
        } else {
            redDotImageButton.setImageResource(AbstractC16803z.icn_postfeed_typo_normal);
        }
    }

    /* renamed from: qM */
    protected void mo78494qM() {
        AbstractC2379w.m12430d(this.f72372T0);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: rN */
    public void m78495rN(String str, String str2, int i11) {
        Drawable drawable;
        try {
            RobotoTextView robotoTextView = this.f72396r1;
            if (robotoTextView != null) {
                robotoTextView.setText(str);
                Drawable m118665N = AbstractC23136l9.m118665N(this.f72396r1.getContext(), AbstractC16803z.ic_icn_form_dropdown);
                int m118742r = AbstractC23136l9.m118742r(22.0f);
                m118665N.setBounds(0, 0, m118742r, m118742r);
                if (i11 != -1) {
                    drawable = AbstractC23136l9.m118665N(this.f72396r1.getContext(), i11);
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    drawable.setBounds(0, 0, AbstractC23136l9.m118742r(22.0f), AbstractC23136l9.m118742r(16.0f));
                }
                this.f72396r1.setCompoundDrawables(drawable, null, m118665N, null);
                this.f72396r1.setCompoundDrawablePadding(AbstractC23136l9.m118742r(2.0f));
            }
            RobotoTextView robotoTextView2 = this.f72397s1;
            if (robotoTextView2 != null) {
                robotoTextView2.setText(str2);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: tM */
    public String m78496tM() {
        Editable editable;
        StatusComposeEditText statusComposeEditText = this.f72372T0;
        if (statusComposeEditText != null) {
            editable = statusComposeEditText.getText();
        } else {
            editable = null;
        }
        if (editable != null) {
            return editable.toString();
        }
        return "";
    }

    /* renamed from: uM */
    protected int mo78497uM() {
        return 10000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: vM */
    public C31890dc m78498vM() {
        List list;
        int m120855D7 = AbstractC23309i.m120855D7();
        C31845ac m152996J = C31845ac.m152996J();
        C27477e c27477e = this.f72377Y0;
        if (c27477e != null) {
            list = c27477e.m140539P();
        } else {
            list = null;
        }
        return m152996J.m153028F(list, m120855D7, -100, 0);
    }

    /* renamed from: wM */
    protected int mo78499wM() {
        return AbstractC7409c0.base_update_status_view;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(final int i11, Object... objArr) {
        this.f72399u1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.l2
            @Override // java.lang.Runnable
            public final void run() {
                BaseUpdateStatusView.this.m78444OM(i11);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        mo78472CM(m92642L3());
        mo78485bN(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: xM */
    public List m78500xM() {
        C27477e c27477e = this.f72377Y0;
        if (c27477e != null) {
            return c27477e.m140539P();
        }
        return new ArrayList();
    }

    /* renamed from: yM */
    protected String mo78501yM() {
        return AbstractC23136l9.m118743r0(AbstractC8020f0.str_saved);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.m124114c().m124115b(this, 58);
    }

    /* renamed from: zM */
    protected int mo78502zM() {
        return 0;
    }
}
