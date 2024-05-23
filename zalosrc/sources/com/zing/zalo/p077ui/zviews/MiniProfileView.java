package com.zing.zalo.p077ui.zviews;

import ac.C0708i;
import ac.C0732w;
import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.C0815e1;
import ag0.C0824j;
import am.AbstractC0939u;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.C1929v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ap0.C2279a;
import au.AbstractC2364o0;
import au.C2370r0;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.adapters.C7118k5;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.feed.adapters.C8050a;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.MiniProfileView;
import com.zing.zalo.uicomponents.framelayout.DragToCloseLayout;
import com.zing.zalo.uicontrol.NoPredictiveItemAnimLinearLayoutMngr;
import com.zing.zalo.uicontrol.recyclerview.ZRecyclerView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.utils.systemui.SystemUI;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.animation.AnimationTarget;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import i40.C20275e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import me0.AbstractC23034c6;
import me0.AbstractC23047d8;
import me0.AbstractC23057e7;
import me0.AbstractC23059e9;
import me0.AbstractC23063f2;
import me0.AbstractC23074g2;
import me0.AbstractC23088h5;
import me0.AbstractC23136l9;
import me0.AbstractC23144m6;
import me0.AbstractC23152n3;
import me0.AbstractC23161o1;
import me0.AbstractC23181q;
import me0.AbstractC23216t1;
import me0.C23055e5;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p142ey.C18644n;
import p172fy.C19171b;
import p207he.C20024r;
import p266jg.C21243a;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p304ks.C21933s;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p510sq.C26365a;
import p716zh.C31874cb;
import p716zh.C31900e7;
import p716zh.C31965ic;
import p716zh.C32002l4;
import p716zh.C32006l8;
import v50.C27870vb;
import vg.C28203u6;

/* loaded from: classes6.dex */
public class MiniProfileView extends BaseZaloView implements C7118k5.c, ZaloView.InterfaceC17421f, View.OnClickListener, InterfaceC17463d.d, InterfaceC0733x, C23744a.c {

    /* renamed from: A1 */
    protected static int f75174A1 = 0;

    /* renamed from: B1 */
    protected static final Map f75175B1 = new HashMap();

    /* renamed from: C1 */
    protected static final Map f75176C1 = new HashMap();

    /* renamed from: z1 */
    static final String f75177z1 = "MiniProfileView";

    /* renamed from: M0 */
    View f75178M0;

    /* renamed from: N0 */
    ZRecyclerView f75179N0;

    /* renamed from: O0 */
    C7118k5 f75180O0;

    /* renamed from: P0 */
    LinearLayoutManager f75181P0;

    /* renamed from: T0 */
    RobotoTextView f75185T0;

    /* renamed from: U0 */
    DragToCloseLayout f75186U0;

    /* renamed from: a1 */
    Handler f75192a1;

    /* renamed from: f1 */
    View f75197f1;

    /* renamed from: g1 */
    View f75198g1;

    /* renamed from: i1 */
    String f75200i1;

    /* renamed from: j1 */
    C32006l8 f75201j1;

    /* renamed from: Q0 */
    int f75182Q0 = AbstractC23136l9.m118722k0();

    /* renamed from: R0 */
    int f75183R0 = AbstractC23136l9.m118713h0();

    /* renamed from: S0 */
    int f75184S0 = AbstractC23136l9.m118742r(60.0f);

    /* renamed from: V0 */
    int f75187V0 = 0;

    /* renamed from: W0 */
    int f75188W0 = 0;

    /* renamed from: X0 */
    int f75189X0 = -1;

    /* renamed from: Y0 */
    int f75190Y0 = 2;

    /* renamed from: Z0 */
    String f75191Z0 = "";

    /* renamed from: b1 */
    String f75193b1 = "";

    /* renamed from: c1 */
    List f75194c1 = new ArrayList();

    /* renamed from: d1 */
    boolean f75195d1 = false;

    /* renamed from: e1 */
    String f75196e1 = "";

    /* renamed from: h1 */
    int f75199h1 = 0;

    /* renamed from: k1 */
    ContactProfile f75202k1 = null;

    /* renamed from: l1 */
    boolean f75203l1 = false;

    /* renamed from: m1 */
    boolean f75204m1 = false;

    /* renamed from: n1 */
    InterfaceC20094a f75205n1 = new C14627h();

    /* renamed from: o1 */
    boolean f75206o1 = false;

    /* renamed from: p1 */
    InterfaceC20094a f75207p1 = new C14628i();

    /* renamed from: q1 */
    boolean f75208q1 = false;

    /* renamed from: r1 */
    boolean f75209r1 = false;

    /* renamed from: s1 */
    boolean f75210s1 = false;

    /* renamed from: t1 */
    InterfaceC0765j f75211t1 = new C0766k();

    /* renamed from: u1 */
    InterfaceC20094a f75212u1 = new C14620a();

    /* renamed from: v1 */
    boolean f75213v1 = false;

    /* renamed from: w1 */
    boolean f75214w1 = false;

    /* renamed from: x1 */
    int f75215x1 = 1;

    /* renamed from: y1 */
    int f75216y1 = 2;

    /* renamed from: com.zing.zalo.ui.zviews.MiniProfileView$a */
    /* loaded from: classes6.dex */
    class C14620a implements InterfaceC20094a {
        C14620a() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    ToastUtils.showMess(MiniProfileView.this.m92652XI(AbstractC8020f0.str_hint_sendFriendRequestFail));
                } catch (Resources.NotFoundException e11) {
                    e11.printStackTrace();
                }
            } finally {
                MiniProfileView miniProfileView = MiniProfileView.this;
                miniProfileView.f75210s1 = false;
                miniProfileView.mo78960q3();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            try {
                try {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    if (!jSONObject2.isNull("data") && (jSONObject = jSONObject2.getJSONObject("data")) != null && !jSONObject.isNull("code")) {
                        int i11 = jSONObject.getInt("code");
                        if (i11 == 0) {
                            MiniProfileView miniProfileView = MiniProfileView.this;
                            String str = miniProfileView.f75200i1;
                            miniProfileView.f75196e1 = str;
                            AbstractC23059e9.m118317F(str);
                            AbstractC23074g2.m118375a(0, MiniProfileView.this.f75200i1, "", 7);
                            MiniProfileView miniProfileView2 = MiniProfileView.this;
                            miniProfileView2.m81825LM(0, miniProfileView2.f75200i1);
                            AbstractC23063f2.m118349a(MiniProfileView.this.f75201j1.m154300a());
                        } else {
                            AbstractC23063f2.m118357i(i11, MiniProfileView.this.f75200i1);
                            if (i11 != -40 && i11 != -41 && i11 != -42 && i11 != -43 && i11 != -44) {
                                if (!AbstractC23216t1.m119641f(MiniProfileView.this.f72421L0, i11, false)) {
                                    ToastUtils.m89259g(i11);
                                }
                            }
                            MiniProfileView.this.f75193b1 = AbstractC23161o1.m119317b(i11);
                            AbstractC2364o0.m12373p(MiniProfileView.this, 100);
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                MiniProfileView miniProfileView3 = MiniProfileView.this;
                miniProfileView3.f75210s1 = false;
                miniProfileView3.mo78960q3();
            } catch (Throwable th2) {
                MiniProfileView miniProfileView4 = MiniProfileView.this;
                miniProfileView4.f75210s1 = false;
                miniProfileView4.mo78960q3();
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MiniProfileView$b */
    /* loaded from: classes6.dex */
    public class C14621b implements C21933s.w {
        C14621b() {
        }

        /* renamed from: e */
        public /* synthetic */ void m81841e() {
            MiniProfileView.this.m81824KM(false, true);
        }

        /* renamed from: f */
        public /* synthetic */ void m81842f() {
            MiniProfileView.this.m81824KM(false, false);
            MiniProfileView.this.m81820GM();
        }

        @Override // p304ks.C21933s.w
        /* renamed from: a */
        public void mo81843a(boolean z11, int i11, List list) {
            MiniProfileView miniProfileView = MiniProfileView.this;
            miniProfileView.f75213v1 = false;
            miniProfileView.f75214w1 = z11;
            miniProfileView.f75215x1 = i11;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C31874cb c31874cb = (C31874cb) it.next();
                    C32006l8 c32006l8 = new C32006l8(c31874cb.f146385a);
                    c32006l8.f147282i = c31874cb.f146390f;
                    c32006l8.f147290q = c31874cb.f146400p;
                    c32006l8.f147276c = c31874cb.f146393i;
                    c32006l8.f147274a = c31874cb.f146387c;
                    c32006l8.f147284k = c31874cb.f146386b;
                    c32006l8.f147286m = c31874cb.f146399o;
                    c32006l8.f147287n = c31874cb.f146389e;
                    c32006l8.f147275b = c31874cb.f146394j;
                    c32006l8.f147291r = c31874cb.f146396l;
                    c32006l8.f147297x = c31874cb.f146381C;
                    c32006l8.f147298y = c31874cb.f146384F;
                    MiniProfileView miniProfileView2 = MiniProfileView.this;
                    if (!miniProfileView2.m81837sM(miniProfileView2.f75194c1, c32006l8)) {
                        MiniProfileView.this.f75194c1.add(c32006l8);
                    }
                }
            }
            MiniProfileView.this.f75192a1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.hy
                public /* synthetic */ RunnableC15716hy() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MiniProfileView.C14621b.this.m81842f();
                }
            });
        }

        @Override // p304ks.C21933s.w
        /* renamed from: b */
        public void mo81844b(C20096c c20096c) {
            MiniProfileView miniProfileView = MiniProfileView.this;
            miniProfileView.f75213v1 = false;
            miniProfileView.f75192a1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.iy
                public /* synthetic */ RunnableC15752iy() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MiniProfileView.C14621b.this.m81841e();
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MiniProfileView$c */
    /* loaded from: classes6.dex */
    public class C14622c extends RecyclerView.AbstractC1892s {
        C14622c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            C32006l8 c32006l8;
            super.mo952b(recyclerView, i11);
            try {
                if (i11 == 0) {
                    int i12 = 0;
                    MiniProfileView.this.f75180O0.m36278T(false);
                    MiniProfileView.this.f75180O0.m10008p();
                    MiniProfileView miniProfileView = MiniProfileView.this;
                    if (miniProfileView.f75187V0 == 8) {
                        int m9737T1 = miniProfileView.f75181P0.m9737T1();
                        C31900e7 m36273N = MiniProfileView.this.f75180O0.m36273N(m9737T1);
                        if (m36273N != null && (c32006l8 = m36273N.f146548b) != null && !TextUtils.isEmpty(c32006l8.f147278e)) {
                            AbstractC23059e9.m118317F(m36273N.f146548b.f147278e);
                            if (C21933s.m114404I().m114486q0(m36273N.f146548b.f147278e)) {
                                C21933s.m114404I().m114417F0(m36273N.f146548b.f147278e);
                            }
                            int i13 = MiniProfileView.this.f75199h1;
                            if (i13 >= 0 && m9737T1 != i13) {
                                C0815e1 m2075D = C0815e1.m2075D();
                                String[] strArr = new String[4];
                                strArr[0] = m36273N.f146548b.f147278e;
                                if (m9737T1 <= MiniProfileView.this.f75199h1) {
                                    i12 = 1;
                                }
                                strArr[1] = String.valueOf(i12);
                                strArr[2] = "";
                                strArr[3] = "";
                                m2075D.m2099U(3, 5, 39, strArr);
                            }
                        }
                        MiniProfileView.this.f75199h1 = m9737T1;
                        return;
                    }
                    return;
                }
                MiniProfileView.this.f75180O0.m36278T(true);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            C7118k5 c7118k5;
            super.mo10176d(recyclerView, i11, i12);
            try {
                MiniProfileView miniProfileView = MiniProfileView.this;
                int i13 = miniProfileView.f75187V0;
                if (i13 != 6 && i13 != 7) {
                    if (miniProfileView.f75181P0.m9740Y1() + MiniProfileView.this.f75181P0.m10110a() >= MiniProfileView.this.f75181P0.m10127i() - 1) {
                        MiniProfileView miniProfileView2 = MiniProfileView.this;
                        if (miniProfileView2.f75214w1 && !miniProfileView2.f75213v1 && (c7118k5 = miniProfileView2.f75180O0) != null && !c7118k5.f38936y) {
                            miniProfileView2.m81831mM();
                            return;
                        }
                        return;
                    }
                    return;
                }
                AbstractC23647d.m123897g("3000215");
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MiniProfileView$d */
    /* loaded from: classes6.dex */
    public class C14623d extends RecyclerView.AbstractC1887n {

        /* renamed from: a */
        final int f75220a = AbstractC23136l9.m118742r(30.0f);

        /* renamed from: b */
        final int f75221b = AbstractC23136l9.m118742r(5.0f);

        C14623d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            if (recyclerView.m9817A0(view) == 0) {
                rect.set(this.f75220a, 0, this.f75221b, 0);
            } else if (recyclerView.m9817A0(view) == recyclerView.getAdapter().mo10003k() - 1) {
                rect.set(this.f75221b, 0, this.f75220a, 0);
            } else {
                int i11 = this.f75221b;
                rect.set(i11, 0, i11, 0);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MiniProfileView$e */
    /* loaded from: classes6.dex */
    public class C14624e implements DragToCloseLayout.InterfaceC16432a {

        /* renamed from: com.zing.zalo.ui.zviews.MiniProfileView$e$a */
        /* loaded from: classes6.dex */
        class a extends AnimatorListenerAdapter {
            a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                MiniProfileView.this.finish();
            }
        }

        /* renamed from: com.zing.zalo.ui.zviews.MiniProfileView$e$b */
        /* loaded from: classes6.dex */
        class b extends AnimatorListenerAdapter {
            b() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                View view = MiniProfileView.this.f75178M0;
                if (view != null) {
                    view.setBackgroundColor(AbstractC23136l9.m118641B(view.getContext(), AbstractC16801x.black_80));
                }
                RobotoTextView robotoTextView = MiniProfileView.this.f75185T0;
                if (robotoTextView != null) {
                    robotoTextView.setVisibility(0);
                }
            }
        }

        C14624e() {
        }

        @Override // com.zing.zalo.uicomponents.framelayout.DragToCloseLayout.InterfaceC16432a
        /* renamed from: Dg */
        public void mo38328Dg(float f11) {
            try {
                View view = MiniProfileView.this.f75178M0;
                if (view != null && view.getHeight() > 0) {
                    int height = (int) (204.0d - ((((int) f11) * 204.0d) / MiniProfileView.this.f75178M0.getHeight()));
                    View view2 = MiniProfileView.this.f75178M0;
                    if (height <= 0) {
                        height = 0;
                    }
                    view2.setBackgroundColor(Color.argb(height, 0, 0, 0));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.uicomponents.framelayout.DragToCloseLayout.InterfaceC16432a
        /* renamed from: EC */
        public void mo38329EC(boolean z11) {
            try {
                if (!z11) {
                    DragToCloseLayout dragToCloseLayout = MiniProfileView.this.f75186U0;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(dragToCloseLayout, "translationY", dragToCloseLayout.getTranslationY(), MiniProfileView.this.f75178M0.getHeight());
                    ofFloat.setDuration(200L);
                    ofFloat.addListener(new a());
                    ofFloat.start();
                } else {
                    DragToCloseLayout dragToCloseLayout2 = MiniProfileView.this.f75186U0;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(dragToCloseLayout2, "translationY", dragToCloseLayout2.getTranslationY(), 0.0f);
                    ofFloat2.setDuration(200L);
                    ofFloat2.addListener(new b());
                    ofFloat2.start();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.uicomponents.framelayout.DragToCloseLayout.InterfaceC16432a
        /* renamed from: f2 */
        public void mo38330f2() {
            RobotoTextView robotoTextView = MiniProfileView.this.f75185T0;
            if (robotoTextView != null) {
                robotoTextView.setVisibility(8);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MiniProfileView$f */
    /* loaded from: classes6.dex */
    class C14625f implements AnimationTarget {

        /* renamed from: p */
        final /* synthetic */ AnimationTarget f75226p;

        C14625f(AnimationTarget animationTarget) {
            this.f75226p = animationTarget;
        }

        @Override // com.zing.zalo.zview.animation.AnimationTarget
        public Rect getAnimTargetLocationOnScreen() {
            Rect animTargetLocationOnScreen;
            AnimationTarget animationTarget = this.f75226p;
            if (animationTarget != null && (animTargetLocationOnScreen = animationTarget.getAnimTargetLocationOnScreen()) != null) {
                int i11 = animTargetLocationOnScreen.left;
                int i12 = MiniProfileView.this.f75184S0;
                return new Rect(i11 + (i12 / 2), animTargetLocationOnScreen.top, animTargetLocationOnScreen.right + (i12 / 2), animTargetLocationOnScreen.bottom);
            }
            return null;
        }

        @Override // com.zing.zalo.zview.animation.AnimationTarget
        public void setAnimTargetVisibility(int i11) {
            AnimationTarget animationTarget = this.f75226p;
            if (animationTarget != null) {
                animationTarget.setAnimTargetVisibility(i11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MiniProfileView$g */
    /* loaded from: classes6.dex */
    public class C14626g implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C31874cb f75228a;

        C14626g(C31874cb c31874cb) {
            this.f75228a = c31874cb;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    ToastUtils.showMess(c20096c.m104492d());
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                MiniProfileView miniProfileView = MiniProfileView.this;
                miniProfileView.f75203l1 = false;
                miniProfileView.mo78960q3();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    C31874cb c31874cb = this.f75228a;
                    if (c31874cb.f146399o == 2) {
                        AbstractC23059e9.m118317F(c31874cb.f146385a);
                    }
                    AbstractC23063f2.m118364p(this.f75228a.f146385a);
                    AbstractC23074g2.m118375a(1, this.f75228a.f146385a, "", 7);
                    MiniProfileView.this.m81825LM(1, this.f75228a.f146385a);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                MiniProfileView miniProfileView = MiniProfileView.this;
                miniProfileView.f75203l1 = false;
                miniProfileView.mo78960q3();
            } catch (Throwable th2) {
                MiniProfileView miniProfileView2 = MiniProfileView.this;
                miniProfileView2.f75203l1 = false;
                miniProfileView2.mo78960q3();
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.MiniProfileView$h */
    /* loaded from: classes6.dex */
    public class C14627h implements InterfaceC20094a {

        /* renamed from: com.zing.zalo.ui.zviews.MiniProfileView$h$a */
        /* loaded from: classes6.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f75231a;

            a(ContactProfile contactProfile) {
                this.f75231a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42349b8(this.f75231a);
            }
        }

        C14627h() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            MiniProfileView miniProfileView;
            try {
                try {
                    ToastUtils.m89264l(c20096c);
                    miniProfileView = MiniProfileView.this;
                    miniProfileView.f75204m1 = false;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    MiniProfileView.this.f75204m1 = false;
                    miniProfileView = MiniProfileView.this;
                }
                miniProfileView.mo78960q3();
            } catch (Throwable th2) {
                MiniProfileView miniProfileView2 = MiniProfileView.this;
                miniProfileView2.f75204m1 = false;
                miniProfileView2.mo78960q3();
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            String str;
            String str2;
            int i11;
            JSONObject optJSONObject;
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject.has("error_code") && jSONObject.has("data") && jSONObject.optInt("error_code", -1000) == 0) {
                        if (!jSONObject.has("data") || jSONObject.isNull("data") || (optJSONObject = jSONObject.optJSONObject("data")) == null) {
                            str = "";
                            str2 = str;
                            i11 = 0;
                        } else {
                            i11 = optJSONObject.optInt("action", 0);
                            str2 = optJSONObject.optString("alias");
                            str = optJSONObject.optString("desc");
                        }
                        C28203u6 c28203u6 = C28203u6.f131407a;
                        ContactProfile m141809c = c28203u6.m141809c(MiniProfileView.this.f75200i1);
                        if (m141809c == null) {
                            MiniProfileView miniProfileView = MiniProfileView.this;
                            miniProfileView.f75204m1 = false;
                            miniProfileView.mo78960q3();
                            return;
                        }
                        Map map = AbstractC23304d.f113405l;
                        if (map.containsKey(MiniProfileView.this.f75200i1)) {
                            m141809c.f42438s0 = ((C31965ic) map.get(MiniProfileView.this.f75200i1)).m153681a();
                        }
                        m141809c.f42441t0 = true;
                        m141809c.f42456y0 = i11;
                        if (!TextUtils.isEmpty(str2)) {
                            m141809c.f42442t1 = str2;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            m141809c.f42436r1 = new SpannableStringBuilder(str);
                        }
                        if (C21927m.m114302u().m114357s() != null) {
                            if (!C21927m.m114302u().m114357s().m153137g(MiniProfileView.this.f75200i1)) {
                                C21927m.m114302u().m114357s().add(m141809c);
                                C0824j.m2153b(new a(m141809c));
                            } else if (C21927m.m114302u().m114357s().m153138j(MiniProfileView.this.f75200i1) != null) {
                                m141809c = C21927m.m114302u().m114357s().m153138j(MiniProfileView.this.f75200i1);
                                m141809c.f42456y0 = i11;
                                if (!TextUtils.isEmpty(str2)) {
                                    m141809c.f42442t1 = str2;
                                }
                                if (!TextUtils.isEmpty(str)) {
                                    m141809c.f42436r1 = new SpannableStringBuilder(str);
                                }
                            }
                        }
                        AbstractC23074g2.m118375a(0, MiniProfileView.this.f75200i1, "", 1);
                        MiniProfileView miniProfileView2 = MiniProfileView.this;
                        miniProfileView2.m81825LM(0, miniProfileView2.f75200i1);
                        C31965ic c31965ic = (C31965ic) map.get(CoreUtility.f89233i);
                        if (c31965ic != null) {
                            ((C31965ic) map.get(CoreUtility.f89233i)).m153684d(c31965ic.m153681a() + 1);
                        }
                        c28203u6.m141806D(MiniProfileView.this.f75200i1, false);
                        if (!TextUtils.isEmpty(m141809c.f42434r)) {
                            AbstractC23181q.m119431d(m141809c.f42434r, true);
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                MiniProfileView miniProfileView3 = MiniProfileView.this;
                miniProfileView3.f75204m1 = false;
                miniProfileView3.mo78960q3();
            } catch (Throwable th2) {
                MiniProfileView miniProfileView4 = MiniProfileView.this;
                miniProfileView4.f75204m1 = false;
                miniProfileView4.mo78960q3();
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MiniProfileView$i */
    /* loaded from: classes6.dex */
    public class C14628i implements InterfaceC20094a {
        C14628i() {
        }

        /* renamed from: d */
        public /* synthetic */ void m81846d(Bundle bundle) {
            if (MiniProfileView.this.m92662fJ() != null) {
                MiniProfileView.this.m92662fJ().m93066i2(WriteInvitationView.class, bundle, 1085, 1, true);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    ToastUtils.showMess(MiniProfileView.this.m92652XI(AbstractC8020f0.error_message));
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                MiniProfileView miniProfileView = MiniProfileView.this;
                miniProfileView.f75206o1 = false;
                miniProfileView.mo78960q3();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            MiniProfileView miniProfileView;
            int i11;
            int i12;
            int i13;
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    boolean z11 = true;
                    if (jSONObject != null && !jSONObject.isNull("data")) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                        if (jSONObject2.isNull("isRequested")) {
                            i11 = 0;
                        } else {
                            i11 = jSONObject2.getInt("isRequested");
                        }
                        if (jSONObject2.isNull("isFriend")) {
                            i12 = 0;
                        } else {
                            i12 = jSONObject2.getInt("isFriend");
                        }
                        if (jSONObject2.isNull("isRequesting")) {
                            i13 = 0;
                        } else {
                            i13 = jSONObject2.getInt("isRequesting");
                        }
                        int optInt = jSONObject2.optInt("addFriendPrivacy", 1);
                        int optInt2 = jSONObject2.optInt("ranking", 0);
                        if (optInt == 1) {
                            if (i11 == 0 && i13 == 0) {
                                if (i12 == 0) {
                                    if (!C18644n.m98531l().m98558u(MiniProfileView.this.f75200i1)) {
                                        TrackingSource trackingSource = new TrackingSource(MiniProfileView.this.f75201j1.f147287n);
                                        trackingSource.m40677a("sourceView", Integer.valueOf(MiniProfileView.this.m81835qM()));
                                        C21927m.m114302u().m114330e0(MiniProfileView.this.f75201j1.f147278e, trackingSource);
                                        MiniProfileView miniProfileView2 = MiniProfileView.this;
                                        if (!miniProfileView2.f75209r1 && !miniProfileView2.m81812tM()) {
                                            MiniProfileView miniProfileView3 = MiniProfileView.this;
                                            C32006l8 c32006l8 = miniProfileView3.f75201j1;
                                            miniProfileView3.m81823JM(c32006l8.f147278e, c32006l8.f147287n);
                                            z11 = false;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("uid", MiniProfileView.this.f75201j1.f147278e);
                                        bundle.putString("dpn", MiniProfileView.this.f75201j1.f147274a);
                                        bundle.putString("phone", MiniProfileView.this.f75201j1.f147275b);
                                        bundle.putString("avatar", MiniProfileView.this.f75201j1.f147276c);
                                        MiniProfileView.this.f75192a1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.jy

                                            /* renamed from: q */
                                            public final /* synthetic */ Bundle f80829q;

                                            public /* synthetic */ RunnableC15789jy(Bundle bundle2) {
                                                r2 = bundle2;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                MiniProfileView.C14628i.this.m81846d(r2);
                                            }
                                        });
                                        MiniProfileView miniProfileView4 = MiniProfileView.this;
                                        if (miniProfileView4.f75209r1) {
                                            miniProfileView4.finish();
                                        }
                                    } else {
                                        ToastUtils.showMess(MiniProfileView.this.m92652XI(AbstractC8020f0.str_hint_alreadyFriend));
                                        AbstractC23059e9.m118317F(MiniProfileView.this.f75200i1);
                                        AbstractC23074g2.m118375a(0, MiniProfileView.this.f75200i1, "", 7);
                                        MiniProfileView miniProfileView5 = MiniProfileView.this;
                                        miniProfileView5.m81825LM(0, miniProfileView5.f75200i1);
                                    }
                                } else if (i12 == 1) {
                                    ToastUtils.showMess(MiniProfileView.this.m92652XI(AbstractC8020f0.str_hint_alreadyFriend));
                                    AbstractC23059e9.m118317F(MiniProfileView.this.f75200i1);
                                    AbstractC23074g2.m118375a(0, MiniProfileView.this.f75200i1, "", 7);
                                    MiniProfileView miniProfileView6 = MiniProfileView.this;
                                    miniProfileView6.m81825LM(0, miniProfileView6.f75200i1);
                                    if (!AbstractC21935u.m114558y(MiniProfileView.this.f75200i1)) {
                                        MiniProfileView miniProfileView7 = MiniProfileView.this;
                                        miniProfileView7.m81827NM(miniProfileView7.f75200i1);
                                    }
                                }
                            } else if (i13 != 0) {
                                ContactProfile mo98491j = AbstractC23063f2.m118350b(false).mo98491j(MiniProfileView.this.f75200i1);
                                if (mo98491j != null) {
                                    mo98491j.f42369Q = optInt2;
                                }
                                C7960e.m41971c6().m42566vd(MiniProfileView.this.f75200i1, optInt2);
                                AbstractC2364o0.m12373p(MiniProfileView.this, 1);
                            } else if (i11 != 0) {
                                AbstractC23063f2.m118349a(C28203u6.f131407a.m141809c(MiniProfileView.this.f75200i1));
                                ToastUtils.showMess(MiniProfileView.this.m92652XI(AbstractC8020f0.str_already_send_friend_request_new));
                                AbstractC23059e9.m118317F(MiniProfileView.this.f75200i1);
                                AbstractC23074g2.m118375a(0, MiniProfileView.this.f75200i1, "", 7);
                                MiniProfileView miniProfileView8 = MiniProfileView.this;
                                miniProfileView8.m81825LM(0, miniProfileView8.f75200i1);
                            }
                        } else if (optInt < 0) {
                            if (optInt != -40 && optInt != -41 && optInt != -42 && optInt != -43 && optInt != -44) {
                                if (!AbstractC23216t1.m119641f(MiniProfileView.this.f72421L0, optInt, false)) {
                                    ToastUtils.m89259g(optInt);
                                }
                            }
                            MiniProfileView.this.f75193b1 = AbstractC23161o1.m119317b(optInt);
                            AbstractC2364o0.m12373p(MiniProfileView.this, 100);
                        }
                    }
                    miniProfileView = MiniProfileView.this;
                    miniProfileView.f75206o1 = false;
                    if (!z11) {
                        return;
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    miniProfileView = MiniProfileView.this;
                    miniProfileView.f75206o1 = false;
                }
                miniProfileView.mo78960q3();
            } catch (Throwable th2) {
                MiniProfileView miniProfileView9 = MiniProfileView.this;
                miniProfileView9.f75206o1 = false;
                miniProfileView9.mo78960q3();
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MiniProfileView$j */
    /* loaded from: classes6.dex */
    public class C14629j implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C32006l8 f75234a;

        C14629j(C32006l8 c32006l8) {
            this.f75234a = c32006l8;
        }

        /* renamed from: d */
        public /* synthetic */ void m81848d() {
            try {
                AbstractC23088h5.m118426g();
                MiniProfileView.this.m81826MM();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            int m104491c;
            if (c20096c != null) {
                try {
                    m104491c = c20096c.m104491c();
                } catch (Exception unused) {
                } catch (Throwable th2) {
                    MiniProfileView.this.mo78960q3();
                    MiniProfileView.this.f75208q1 = false;
                    throw th2;
                }
            } else {
                m104491c = -1000;
            }
            if (MiniProfileView.this.m92672lJ()) {
                ToastUtils.m89259g(m104491c);
            }
            MiniProfileView.this.mo78960q3();
            MiniProfileView.this.f75208q1 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            int parseInt;
            try {
                try {
                    jSONObject = (JSONObject) obj;
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                if (jSONObject.has("data") && (parseInt = Integer.parseInt(new JSONObject(jSONObject.getString("data")).getString("code"))) != 0) {
                    MiniProfileView.this.mo78960q3();
                    ToastUtils.m89259g(parseInt);
                    MiniProfileView miniProfileView = MiniProfileView.this;
                    miniProfileView.f75208q1 = false;
                    miniProfileView.mo78960q3();
                    MiniProfileView.this.f75208q1 = false;
                    return;
                }
                C32006l8 c32006l8 = this.f75234a;
                AbstractC21935u.m114532V(false, c32006l8.f147278e, c32006l8.m154300a());
                if (MiniProfileView.this.m92672lJ()) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_alertAlreadyUnblock));
                }
                if (MiniProfileView.this.m92676n2() != null) {
                    MiniProfileView.this.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.ky
                        public /* synthetic */ RunnableC15832ky() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            MiniProfileView.C14629j.this.m81848d();
                        }
                    });
                }
            } finally {
                MiniProfileView.this.mo78960q3();
                MiniProfileView.this.f75208q1 = false;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MiniProfileView$k */
    /* loaded from: classes6.dex */
    public class C14630k implements InterfaceC20094a {

        /* renamed from: com.zing.zalo.ui.zviews.MiniProfileView$k$a */
        /* loaded from: classes6.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f75237a;

            a(ContactProfile contactProfile) {
                this.f75237a = contactProfile;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42234Pb(this.f75237a.f42434r);
            }
        }

        C14630k() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            if (obj != null) {
                try {
                    ContactProfile contactProfile = new ContactProfile((JSONObject) obj);
                    C18644n.m98531l().m98543e(contactProfile);
                    C0824j.m2153b(new a(contactProfile));
                    C18644n.m98524E();
                } catch (Exception e11) {
                    AbstractC23350e.m122776f(MiniProfileView.f75177z1, e11);
                }
            }
        }
    }

    /* renamed from: CM */
    private void m81801CM(ContactProfile contactProfile) {
        try {
            TrackingSource trackingSource = new TrackingSource(contactProfile.f42373R0);
            trackingSource.m40677a("sourceView", 5);
            C21927m.m114302u().m114328d0(contactProfile.f42434r, trackingSource);
            AbstractC21935u.m114522L(contactProfile, 0, new C26365a.b(contactProfile.f42434r, C32002l4.m154264g(1)).m135739F("3904").m135743b(), this.f72421L0, new Callable() { // from class: com.zing.zalo.ui.zviews.ey

                /* renamed from: b */
                public final /* synthetic */ ContactProfile f80290b;

                public /* synthetic */ CallableC15605ey(ContactProfile contactProfile2) {
                    r2 = contactProfile2;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void m81814vM;
                    m81814vM = MiniProfileView.this.m81814vM(r2);
                    return m81814vM;
                }
            });
        } catch (Exception unused) {
        }
    }

    /* renamed from: DM */
    public static void m81802DM(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                f75175B1.put(str, str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: EM */
    public static void m81803EM(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                f75176C1.put(str, str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: FM */
    private int m81804FM(C32006l8 c32006l8) {
        int i11 = this.f75189X0;
        if (i11 == -1) {
            i11 = c32006l8.f147287n;
        }
        TrackingSource trackingSource = new TrackingSource(i11);
        trackingSource.m40677a("sourceView", Integer.valueOf(m81835qM()));
        int i12 = 8;
        if (c32006l8.f147298y == 8) {
            if (!AbstractC23057e7.m118297d()) {
                i12 = 13;
            }
            if (!AbstractC23309i.m120901Eg() && AbstractC23034c6.m118116D(MainApplication.getAppContext(), AbstractC23034c6.f112032i)) {
                i12 = 14;
            }
            trackingSource.m40677a("sourceView", Integer.valueOf(i12));
        }
        C21927m.m114302u().m114330e0(c32006l8.f147278e, trackingSource);
        return i11;
    }

    /* renamed from: kM */
    public static void m81811kM() {
        try {
            f75176C1.clear();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: tM */
    public boolean m81812tM() {
        int i11 = this.f75190Y0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        return AbstractC21935u.m114553t(0);
                    }
                    return AbstractC21935u.m114553t(6);
                }
                return AbstractC21935u.m114553t(2);
            }
            return AbstractC21935u.m114553t(1);
        }
        if (this.f75187V0 == 4) {
            return AbstractC21935u.m114553t(4);
        }
        return AbstractC21935u.m114553t(5);
    }

    /* renamed from: uM */
    public /* synthetic */ void m81813uM(int i11) {
        ZRecyclerView zRecyclerView = this.f75179N0;
        if (zRecyclerView != null) {
            zRecyclerView.mo9854S1(i11);
        }
    }

    /* renamed from: vM */
    public /* synthetic */ Void m81814vM(ContactProfile contactProfile) {
        m81825LM(0, contactProfile.f42434r);
        return null;
    }

    /* renamed from: wM */
    public /* synthetic */ void m81815wM() {
        try {
            if (!this.f75194c1.isEmpty()) {
                C7118k5 c7118k5 = this.f75180O0;
                if (c7118k5 != null) {
                    c7118k5.m36276R(this.f75194c1);
                    this.f75180O0.m10008p();
                }
                m81829jM();
                return;
            }
            finish();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: xM */
    public /* synthetic */ void m81816xM(boolean z11, boolean z12) {
        if (z11 || z12) {
            try {
                ZRecyclerView zRecyclerView = this.f75179N0;
                if (zRecyclerView != null) {
                    zRecyclerView.m88425c2(false);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: yM */
    public /* synthetic */ void m81817yM(boolean z11, boolean z12) {
        try {
            C7118k5 c7118k5 = this.f75180O0;
            if (c7118k5 != null) {
                c7118k5.m10008p();
            }
            this.f75192a1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.gy

                /* renamed from: q */
                public final /* synthetic */ boolean f80510q;

                /* renamed from: r */
                public final /* synthetic */ boolean f80511r;

                public /* synthetic */ RunnableC15679gy(boolean z112, boolean z122) {
                    r2 = z112;
                    r3 = z122;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MiniProfileView.this.m81816xM(r2, r3);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: AM */
    void m81818AM() {
        try {
            if (!AbstractC23057e7.m118300g(m92648SI())) {
                if (C23055e5.m118272g(true)) {
                    if (C20024r.m103941j()) {
                        if (TextUtils.equals(String.valueOf(C20024r.m103938d()), this.f75202k1.f42434r)) {
                            C20024r.m103949w();
                        } else {
                            ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.str_warning_make_newcall_while_calling));
                        }
                    } else if (AbstractC23034c6.m118167n(m92648SI(), new String[]{"android.permission.RECORD_AUDIO"}) != 0) {
                        AbstractC23034c6.m118184v0(this, new String[]{"android.permission.RECORD_AUDIO"}, 117);
                    } else {
                        C2279a m120722w0 = AbstractC23306f.m120722w0();
                        ContactProfile contactProfile = this.f75202k1;
                        m120722w0.m101508a(new C2279a.a(contactProfile.f42434r, contactProfile.m40383Q(true, false), this.f75202k1.f42446v, false, 19));
                    }
                }
            } else {
                ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.str_warningMsgcantuseVoiceCall));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: BM */
    void m81819BM(String str) {
        try {
            List<C32006l8> list = this.f75194c1;
            if (list != null) {
                for (C32006l8 c32006l8 : list) {
                    if (c32006l8.f147278e.equals(str)) {
                        c32006l8.f147290q = 3;
                        return;
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        int m118713h0;
        super.mo37111CJ(bundle);
        f75174A1++;
        m81838zM("number instance Mini -- " + f75174A1);
        this.f75192a1 = new Handler(Looper.getMainLooper());
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            this.f75187V0 = m92642L3.getInt("extra_from_source", 0);
            this.f75216y1 = m92642L3.getInt("extra_id_type");
            this.f75188W0 = m92642L3.getInt("extra_type", 0);
            this.f75190Y0 = m92642L3.getInt("extra_mode_data", 2);
            this.f75215x1 = m92642L3.getInt("extra_init_page", 1);
            this.f75214w1 = m92642L3.getBoolean("extra_allow_loading_more", false);
            this.f75191Z0 = m92642L3.getString("extr_init_user_id", "");
            this.f75189X0 = m92642L3.getInt("extra_reqSrc", -1);
        }
        if (m92676n2().mo35576n3()) {
            m118713h0 = AbstractC23136l9.m118713h0() - C21243a.f103539n;
        } else {
            m118713h0 = AbstractC23136l9.m118713h0();
        }
        this.f75183R0 = m118713h0;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 1) {
            if (i11 != 100) {
                return null;
            }
            C8009j.a aVar = new C8009j.a(m92648SI());
            aVar.m43159h(5).m43172u(m92652XI(AbstractC8020f0.str_title_dialog_send_friend_request_error)).m43162k(this.f75193b1).m43165n(m92652XI(AbstractC8020f0.str_tv_sendmes), this).m43170s(m92652XI(AbstractC8020f0.str_btn_dialog_send_friend_request_error), new InterfaceC17463d.b());
            return aVar.m43152a();
        }
        C8009j.a aVar2 = new C8009j.a(m92648SI());
        aVar2.m43172u(m92652XI(AbstractC8020f0.str_titleDlg2)).m43162k(m92652XI(AbstractC8020f0.str_ask_to_accept_friend_request_new)).m43159h(4).m43165n(m92652XI(AbstractC8020f0.str_close), new InterfaceC17463d.b()).m43170s(m92652XI(AbstractC8020f0.btn_accept_Invitation), this);
        return aVar2.m43152a();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f75178M0 = layoutInflater.inflate(AbstractC7409c0.layout_mini_profile, viewGroup, false);
        m81836rM();
        return this.f75178M0;
    }

    /* renamed from: GM */
    void m81820GM() {
        if (m92676n2() != null) {
            m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.dy
                public /* synthetic */ RunnableC15568dy() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MiniProfileView.this.m81815wM();
                }
            });
        }
    }

    /* renamed from: HM */
    public void m81821HM(C32006l8 c32006l8) {
        if (c32006l8 != null) {
            try {
                if (!this.f75208q1) {
                    this.f75208q1 = true;
                    mo46829Y();
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new C14629j(c32006l8));
                    c0766k.mo1448Ha(c32006l8.f147278e, 7);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // com.zing.zalo.adapters.C7118k5.c
    /* renamed from: I3 */
    public void mo36290I3(C32006l8 c32006l8) {
        String str;
        if (c32006l8 == null) {
            return;
        }
        C0708i c0708i = new C0708i();
        if (AbstractC21935u.m114554u(c32006l8.f147278e)) {
            str = "friend";
        } else {
            str = "stranger";
        }
        c0708i.m1075f("profile_type", str);
        C0732w.Companion.m1189a().m1187q("mini_profile_close_button", "", c0708i, null);
        C31874cb c31874cb = new C31874cb();
        c31874cb.f146385a = c32006l8.f147278e;
        c31874cb.f146399o = c32006l8.f147286m;
        c31874cb.f146400p = c32006l8.f147290q;
        c31874cb.f146389e = c32006l8.f147287n;
        m81830lM(c31874cb);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        try {
            f75174A1--;
            m81838zM("number instance Mini -- " + f75174A1);
            if (f75174A1 <= 0) {
                m81838zM("Clear map done remove Mini -- ");
                f75175B1.clear();
                f75176C1.clear();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: IM */
    void m81822IM(String str) {
        try {
            List<C32006l8> list = this.f75194c1;
            if (list != null) {
                for (C32006l8 c32006l8 : list) {
                    if (c32006l8.f147278e.equals(str)) {
                        this.f75194c1.remove(c32006l8);
                        return;
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.adapters.C7118k5.c
    /* renamed from: J7 */
    public void mo36291J7(C32006l8 c32006l8, int i11) {
        if (c32006l8 == null) {
            return;
        }
        try {
            this.f75201j1 = c32006l8;
            if (m92676n2() != null) {
                m92676n2().mo35579p();
            }
            boolean z11 = false;
            String str = "stranger";
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 5) {
                                if (i11 == 6) {
                                    m81821HM(c32006l8);
                                    return;
                                }
                                return;
                            } else {
                                m81804FM(c32006l8);
                                new C19171b().m101508a(new C19171b.a(this.f72421L0.m92676n2(), new C26365a.b(c32006l8.f147278e, C32002l4.m154265h(1, 10)).m135743b(), 0, 1));
                                return;
                            }
                        }
                        this.f75202k1 = c32006l8.m154300a();
                        m81818AM();
                        C0708i c0708i = new C0708i();
                        if (AbstractC21935u.m114554u(c32006l8.f147278e)) {
                            str = "friend";
                        }
                        c0708i.m1075f("profile_type", str);
                        C0732w.Companion.m1189a().m1187q("mini_profile_call_button", "", c0708i, null);
                        return;
                    }
                    m81804FM(c32006l8);
                    AbstractC23152n3.m119032a0(c32006l8.m154300a(), m92676n2());
                    AbstractC23647d.m123897g("782020");
                    C0708i c0708i2 = new C0708i();
                    if (AbstractC21935u.m114554u(c32006l8.f147278e)) {
                        str = "friend";
                    }
                    c0708i2.m1075f("profile_type", str);
                    C0732w.Companion.m1189a().m1187q("mini_profile_chat_button", "", c0708i2, null);
                    return;
                }
                if (c32006l8.f147286m == 2 || AbstractC23063f2.m118360l(c32006l8.f147278e)) {
                    this.f75200i1 = c32006l8.f147278e;
                    m81801CM(c32006l8.m154300a());
                    C0708i c0708i3 = new C0708i();
                    if (AbstractC21935u.m114554u(c32006l8.f147278e)) {
                        str = "friend";
                    }
                    c0708i3.m1075f("profile_type", str);
                    C0732w.Companion.m1189a().m1187q("mini_profile_accept_friend_button", "", c0708i3, null);
                }
                AbstractC23647d.m123897g("782016");
                return;
            }
            if (c32006l8.f147282i > 0) {
                if (C21927m.m114302u().m114357s().m153137g(c32006l8.f147278e)) {
                    ToastUtils.showMess(m92652XI(AbstractC8020f0.str_already_follow_page));
                } else {
                    String str2 = c32006l8.f147278e;
                    this.f75200i1 = str2;
                    m81833oM(Integer.parseInt(str2));
                }
            } else {
                String str3 = c32006l8.f147278e;
                this.f75200i1 = str3;
                int i12 = this.f75187V0;
                if (i12 == 6 || i12 == 7) {
                    z11 = true;
                }
                m81834pM(str3, z11);
                C0708i c0708i4 = new C0708i();
                if (AbstractC21935u.m114554u(c32006l8.f147278e)) {
                    str = "friend";
                }
                c0708i4.m1075f("profile_type", str);
                C0732w.Companion.m1189a().m1187q("mini_profile_add_friend_button", "", c0708i4, null);
            }
            AbstractC23647d.m123897g("782017");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: JM */
    public void m81823JM(String str, int i11) {
        String str2;
        if (this.f75210s1) {
            return;
        }
        TrackingSource m114310H = C21927m.m114302u().m114310H(str);
        if (m114310H == null) {
            str2 = "";
        } else {
            str2 = m114310H.m40682o();
        }
        this.f75210s1 = true;
        this.f75211t1.mo1704o8(this.f75212u1);
        this.f75211t1.mo1620d7(str, "", i11, str2);
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        if (i11 == -1) {
            if (interfaceC17463d.mo92862f() == 1) {
                interfaceC17463d.dismiss();
                m81801CM(this.f75201j1.m154300a());
                return;
            }
            return;
        }
        if (i11 == -2 && interfaceC17463d.mo92862f() == 100) {
            interfaceC17463d.dismiss();
            C32006l8 c32006l8 = this.f75201j1;
            if (c32006l8 != null && !TextUtils.isEmpty(c32006l8.f147278e)) {
                ContactProfile contactProfile = new ContactProfile(this.f75201j1.f147278e);
                C32006l8 c32006l82 = this.f75201j1;
                contactProfile.f42446v = c32006l82.f147276c;
                contactProfile.f42455y = c32006l82.f147275b;
                contactProfile.f42437s = c32006l82.f147274a;
                contactProfile.f42437s = contactProfile.m40383Q(true, false);
                Bundle m140776b = new C27870vb(contactProfile.mo2478b()).m140780g(contactProfile).m140776b();
                if (m92676n2() != null) {
                    m92676n2().mo35573l4(ChatView.class, m140776b, 1, true);
                }
            }
        }
    }

    /* renamed from: KM */
    public void m81824KM(boolean z11, boolean z12) {
        try {
            C7118k5 c7118k5 = this.f75180O0;
            if (c7118k5 != null) {
                c7118k5.m36280V(z11);
                this.f75180O0.m36279U(z12);
            }
            this.f75192a1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.cy

                /* renamed from: q */
                public final /* synthetic */ boolean f80067q;

                /* renamed from: r */
                public final /* synthetic */ boolean f80068r;

                public /* synthetic */ RunnableC15527cy(boolean z112, boolean z122) {
                    r2 = z112;
                    r3 = z122;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MiniProfileView.this.m81817yM(r2, r3);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: LM */
    void m81825LM(int i11, String str) {
        try {
            if (i11 == 0) {
                m81819BM(str);
            } else if (i11 == 1) {
                m81822IM(str);
            }
            m81820GM();
            if (this.f75190Y0 == 0) {
                if (i11 == 0) {
                    C21933s.m114404I().m114454a(str);
                    C21933s.m114404I().f107931t = true;
                    C21933s.m114404I().f107932u = true;
                } else if (i11 == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(str);
                    C21933s.m114404I().m114459c0(arrayList);
                    C21933s.m114404I().f107931t = true;
                    C21933s.m114404I().f107932u = true;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.adapters.C7118k5.c
    /* renamed from: Lj */
    public void mo36292Lj(C32006l8 c32006l8) {
        String str;
        AbstractC23047d8.m118260l(c32006l8.f147278e, C8050a.d0.GRID, m92662fJ(), 0, C32002l4.m154265h(1, 3));
        C0708i c0708i = new C0708i();
        if (AbstractC21935u.m114554u(c32006l8.f147278e)) {
            str = "friend";
        } else {
            str = "stranger";
        }
        c0708i.m1075f("profile_type", str);
        C0732w.Companion.m1189a().m1187q("mini_profile_social_image_list", "", c0708i, null);
    }

    /* renamed from: MM */
    void m81826MM() {
        try {
            m81838zM("syncDataFromMapDoneRemove -- ");
            List<C32006l8> list = this.f75194c1;
            if (list != null) {
                boolean z11 = false;
                for (C32006l8 c32006l8 : list) {
                    if (f75175B1.containsKey(c32006l8.f147278e)) {
                        c32006l8.f147290q = 3;
                        z11 = true;
                    }
                    if (m81828OM(c32006l8)) {
                        z11 = true;
                    }
                }
                Iterator it = this.f75194c1.iterator();
                while (it.hasNext()) {
                    if (f75176C1.containsKey(((C32006l8) it.next()).f147278e)) {
                        it.remove();
                        z11 = true;
                    }
                }
                if (z11) {
                    m81820GM();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: NM */
    public void m81827NM(String str) {
        int i11;
        try {
            ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
            if (m141809c != null) {
                i11 = m141809c.f42385V0;
            } else {
                i11 = 0;
            }
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14630k());
            c0766k.mo1514Q4(str, i11, new TrackingSource((short) 1034));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: OM */
    boolean m81828OM(C32006l8 c32006l8) {
        boolean z11 = false;
        if (c32006l8 == null || !c32006l8.f147297x) {
            return false;
        }
        String str = c32006l8.f147278e;
        boolean m98558u = C18644n.m98531l().m98558u(str);
        boolean m114518H = AbstractC21935u.m114518H(str);
        boolean m153137g = C21927m.m114302u().m114357s().m153137g(str);
        if (m114518H && m153137g) {
            z11 = true;
        }
        c32006l8.f147290q = -1;
        if (m98558u || z11) {
            c32006l8.f147290q = 3;
        }
        return true;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        C23744a.m124114c().m124117e(this, 6086);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
        SystemUI m89412p = SystemUI.m89412p(view);
        m89412p.m89427V(0);
        m89412p.m89426U(Boolean.FALSE);
    }

    @Override // com.zing.zalo.adapters.C7118k5.c
    /* renamed from: d3 */
    public void mo36293d3(int i11) {
        try {
            View view = this.f75197f1;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = i11;
                this.f75197f1.setLayoutParams(layoutParams);
            }
            View view2 = this.f75198g1;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                layoutParams2.height = i11;
                this.f75198g1.setLayoutParams(layoutParams2);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return f75177z1;
    }

    /* renamed from: jM */
    public void m81829jM() {
        int i11;
        try {
            if (!TextUtils.isEmpty(this.f75196e1)) {
                List list = this.f75194c1;
                if (list != null && list.size() > 0) {
                    for (int i12 = 0; i12 < this.f75194c1.size(); i12++) {
                        if (((C32006l8) this.f75194c1.get(i12)).f147278e.equals(this.f75196e1)) {
                            i11 = i12 + 1;
                            break;
                        }
                    }
                }
                i11 = -1;
                if (i11 != -1) {
                    this.f75192a1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.fy

                        /* renamed from: q */
                        public final /* synthetic */ int f80408q;

                        public /* synthetic */ RunnableC15642fy(int i112) {
                            r2 = i112;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            MiniProfileView.this.m81813uM(r2);
                        }
                    }, 300L);
                }
                this.f75196e1 = "";
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: lM */
    void m81830lM(C31874cb c31874cb) {
        try {
            if (!this.f75203l1 && c31874cb != null) {
                this.f75203l1 = true;
                if (c31874cb.f146400p == 3) {
                    AbstractC23074g2.m118375a(1, c31874cb.f146385a, "", 7);
                    m81825LM(1, c31874cb.f146385a);
                    this.f75203l1 = false;
                } else {
                    mo46829Y();
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new C14626g(c31874cb));
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c31874cb);
                    c0766k.mo1453I7(arrayList, TrackingSource.m40665d(m81835qM()));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: mM */
    void m81831mM() {
        try {
            if (this.f75213v1) {
                return;
            }
            this.f75213v1 = true;
            m81824KM(true, false);
            C14621b c14621b = new C14621b();
            String str = "0";
            List list = this.f75194c1;
            if (list != null && list.size() > 0) {
                List list2 = this.f75194c1;
                str = ((C32006l8) list2.get(list2.size() - 1)).f147278e;
            }
            int i11 = this.f75190Y0;
            if (i11 != 2 && i11 != 3) {
                if (i11 == 1) {
                    C21933s.m114404I().m114433O(this.f75215x1, c14621b, str);
                    return;
                } else {
                    if (i11 == 0) {
                        C21933s.m114404I().m114431N(this.f75216y1, this.f75215x1, c14621b, str);
                        return;
                    }
                    return;
                }
            }
            C21933s.m114404I().m114435P(this.f75215x1, c14621b, str);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: nM */
    void m81832nM() {
        List m114406A = C21933s.m114404I().m114406A();
        if (m114406A != null && !m114406A.isEmpty()) {
            int size = m114406A.size();
            this.f75194c1.clear();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                C31874cb c31874cb = (C31874cb) m114406A.get(i12);
                C32006l8 c32006l8 = new C32006l8(c31874cb.f146385a);
                c32006l8.f147282i = c31874cb.f146390f;
                c32006l8.f147290q = c31874cb.f146400p;
                c32006l8.f147276c = c31874cb.f146393i;
                c32006l8.f147274a = c31874cb.f146387c;
                c32006l8.f147284k = c31874cb.f146386b;
                c32006l8.f147286m = c31874cb.f146399o;
                c32006l8.f147287n = c31874cb.f146389e;
                c32006l8.f147292s = c31874cb.f146397m;
                c32006l8.f147291r = c31874cb.f146396l;
                c32006l8.f147275b = c31874cb.f146394j;
                c32006l8.f147297x = c31874cb.f146381C;
                c32006l8.f147298y = c31874cb.f146384F;
                c32006l8.f147280g = c31874cb.f146398n;
                this.f75194c1.add(c32006l8);
            }
            this.f75180O0.m36276R(this.f75194c1);
            this.f75180O0.m10008p();
            if (!TextUtils.isEmpty(this.f75191Z0)) {
                if (this.f75194c1 != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 >= this.f75194c1.size()) {
                            break;
                        }
                        if (((C32006l8) this.f75194c1.get(i13)).f147278e.equals(this.f75191Z0)) {
                            this.f75199h1 = i13;
                            i11 = i13;
                            break;
                        }
                        i13++;
                    }
                }
                this.f75181P0.m9721B2(i11, this.f75184S0 / 2);
                return;
            }
            return;
        }
        finish();
    }

    @Override // com.zing.zalo.adapters.C7118k5.c
    /* renamed from: nw */
    public void mo36294nw(View view, C23528a c23528a, String str, Bundle bundle, int i11, int i12, AnimationTarget animationTarget) {
        try {
            C14625f c14625f = new C14625f(animationTarget);
            C20275e c20275e = new C20275e();
            c20275e.m105861G(new C2370r0(view));
            c20275e.m105865K(i11);
            c20275e.m105857C(null);
            c20275e.m105887z(false);
            if (bundle != null) {
                bundle.putString("extra_entry_point_flow", C32002l4.m154265h(1, 4).m154277l());
            }
            if (m92676n2() != null) {
                m92676n2().mo35551H2(c14625f, str, bundle, c20275e, i12);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: oM */
    void m81833oM(int i11) {
        try {
            if (this.f75204m1) {
                return;
            }
            mo78950cq(m92652XI(AbstractC8020f0.str_isProcessing));
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(this.f75205n1);
            this.f75204m1 = true;
            if (this.f75189X0 != -1) {
                c0766k.mo1578Y4(i11, new TrackingSource(this.f75189X0));
            } else {
                int m114307E = C21927m.m114302u().m114307E(String.valueOf(i11));
                if (m114307E == -1) {
                    m114307E = 202;
                }
                c0766k.mo1578Y4(i11, new TrackingSource(m114307E));
            }
        } catch (Exception e11) {
            this.f75204m1 = false;
            mo78960q3();
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 1085 && i12 == -1) {
            String str = this.f75200i1;
            this.f75196e1 = str;
            m81825LM(0, str);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            int id2 = view.getId();
            if (id2 == AbstractC6918a0.btn_close) {
                finish();
                AbstractC23647d.m123897g("782010");
            } else if (id2 == AbstractC6918a0.top_fake_view || id2 == AbstractC6918a0.bottom_fake_view) {
                finish();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            try {
                AbstractC23647d.m123897g("782011");
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        if (i11 == 117) {
            try {
                if (AbstractC23034c6.m118136V(iArr) && AbstractC23034c6.m118165m(m92648SI(), "android.permission.RECORD_AUDIO") == 0) {
                    if (this.f75202k1 != null) {
                        C2279a m120722w0 = AbstractC23306f.m120722w0();
                        ContactProfile contactProfile = this.f75202k1;
                        m120722w0.m101508a(new C2279a.a(contactProfile.f42434r, contactProfile.m40383Q(true, false), this.f75202k1.f42446v, false, 19));
                    }
                } else {
                    AbstractC23034c6.m118162k0(this, 117);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        super.onRequestPermissionsResult(i11, strArr, iArr);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        try {
            if (AbstractC23304d.f113374d1) {
                m81832nM();
                AbstractC23304d.f113374d1 = false;
            }
            m81826MM();
            C23744a.m124114c().m124115b(this, 6086);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: pM */
    public void m81834pM(String str, boolean z11) {
        try {
            if (this.f75206o1) {
                return;
            }
            mo78950cq(m92652XI(AbstractC8020f0.str_isProcessing));
            this.f75209r1 = z11;
            this.f75206o1 = true;
            this.f75200i1 = str;
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(this.f75207p1);
            c0766k.mo1615ca(str);
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f75206o1 = false;
            mo78960q3();
        }
    }

    /* renamed from: qM */
    public int m81835qM() {
        switch (this.f75187V0) {
            case 0:
                return 3;
            case 1:
                return 1;
            case 3:
                int i11 = this.f75190Y0;
                if (i11 != 0) {
                    if (i11 == 1) {
                        return 1;
                    }
                    if (i11 != 2) {
                        return i11 != 3 ? -1 : 12;
                    }
                    return 3;
                }
            case 2:
                return 2;
            case 4:
                return 6;
            case 5:
                return 10;
            case 6:
            case 7:
                return 8;
            case 8:
                return 35;
            default:
                return -1;
        }
    }

    /* renamed from: rM */
    void m81836rM() {
        this.f75185T0 = (RobotoTextView) this.f75178M0.findViewById(AbstractC6918a0.btn_close);
        if (m92676n2().mo35576n3() && (this.f75185T0.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            ((FrameLayout.LayoutParams) this.f75185T0.getLayoutParams()).setMargins(AbstractC23136l9.m118742r(12.0f), AbstractC23136l9.m118742r(12.0f), 0, 0);
        }
        this.f75185T0.setOnClickListener(this);
        NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr = new NoPredictiveItemAnimLinearLayoutMngr(m92648SI());
        this.f75181P0 = noPredictiveItemAnimLinearLayoutMngr;
        noPredictiveItemAnimLinearLayoutMngr.m9723C2(0);
        ZRecyclerView zRecyclerView = (ZRecyclerView) this.f75178M0.findViewById(AbstractC6918a0.recycler_view);
        this.f75179N0 = zRecyclerView;
        zRecyclerView.setLayoutManager(this.f75181P0);
        this.f75179N0.m9826E(new C14622c());
        new C1929v().mo10397b(this.f75179N0);
        this.f75179N0.setScaleType(1);
        this.f75179N0.m9816A(new C14623d());
        C7118k5 c7118k5 = new C7118k5(MainApplication.getAppContext(), this.f75182Q0 - this.f75184S0, this.f75183R0);
        this.f75180O0 = c7118k5;
        c7118k5.m36277S(this);
        this.f75179N0.setAdapter(this.f75180O0);
        DragToCloseLayout dragToCloseLayout = (DragToCloseLayout) this.f75178M0.findViewById(AbstractC6918a0.drag_close_view);
        this.f75186U0 = dragToCloseLayout;
        dragToCloseLayout.setMinFlingVelocity((int) (ViewConfiguration.get(m92648SI()).getScaledMinimumFlingVelocity() * 0.5f));
        this.f75186U0.setMinDistanceToClose(this.f75183R0 / 5);
        this.f75186U0.setOnDragToCloseListener(new C14624e());
        View findViewById = this.f75178M0.findViewById(AbstractC6918a0.top_fake_view);
        this.f75197f1 = findViewById;
        findViewById.setOnClickListener(this);
        View findViewById2 = this.f75178M0.findViewById(AbstractC6918a0.bottom_fake_view);
        this.f75198g1 = findViewById2;
        findViewById2.setOnClickListener(this);
    }

    @Override // com.zing.zalo.adapters.C7118k5.c
    /* renamed from: sH */
    public void mo36295sH() {
        if (C23055e5.m118272g(true)) {
            m81831mM();
        }
    }

    /* renamed from: sM */
    boolean m81837sM(List list, C32006l8 c32006l8) {
        if (list != null) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((C32006l8) it.next()).f147278e.equals(c32006l8.f147278e)) {
                        return true;
                    }
                }
                return false;
            } catch (Exception e11) {
                e11.printStackTrace();
                return false;
            }
        }
        return false;
    }

    @Override // com.zing.zalo.adapters.C7118k5.c
    /* renamed from: t4 */
    public void mo36296t4(C32006l8 c32006l8) {
        try {
            List<C32006l8> list = this.f75194c1;
            if (list != null) {
                for (C32006l8 c32006l82 : list) {
                    if (c32006l82.f147278e.equals(c32006l8.f147278e)) {
                        AbstractC23144m6.m118823d(c32006l82, c32006l8);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.adapters.C7118k5.c
    /* renamed from: uC */
    public void mo36297uC(C32006l8 c32006l8) {
        AbstractC23074g2.m118381g(c32006l8.f147278e, c32006l8.f147286m, m81804FM(c32006l8), 0L, m92662fJ(), 0, C32002l4.m154265h(1, 2));
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 == 6086) {
            m81820GM();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        C21933s.m114404I().m114499x(this.f75187V0, this.f75188W0);
        m81832nM();
    }

    /* renamed from: zM */
    void m81838zM(String str) {
    }
}
