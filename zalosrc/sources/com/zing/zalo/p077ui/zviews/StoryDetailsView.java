package com.zing.zalo.p077ui.zviews;

import ac.C0732w;
import ac.InterfaceC0733x;
import ae.C0766k;
import ag0.AbstractC0837p0;
import ag0.C0815e1;
import ag0.C0824j;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.lifecycle.InterfaceC1766e0;
import androidx.lifecycle.InterfaceC1799v;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import bn.C2913t1;
import bo.EnumC2963d3;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.adapters.C7286z8;
import com.zing.zalo.camera.ZaloCameraView;
import com.zing.zalo.camera.common.models.CameraInputParams;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.models.SongInfo;
import com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuBundleData;
import com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuResult;
import com.zing.zalo.feed.mvp.storyprivacy.StoryPrivacyBottomSheetView;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.p077ui.showcase.ShowcaseView;
import com.zing.zalo.p077ui.widget.KeyboardFrameLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.StoryDetailsView;
import com.zing.zalo.social.controls.LikeContactItem;
import com.zing.zalo.uicomponents.framelayout.DragToCloseLayout;
import com.zing.zalo.uicomponents.imageview.ActiveImageColorButton;
import com.zing.zalo.uicontrol.BaseStoryItemView;
import com.zing.zalo.uicontrol.StoryAdsItemView;
import com.zing.zalo.uicontrol.StoryFriendItemView;
import com.zing.zalo.uicontrol.StoryMineItemView;
import com.zing.zalo.uicontrol.StoryReactionOnboardingBottomSheet;
import com.zing.zalo.uicontrol.StoryViewPager;
import com.zing.zalo.uicontrol.StoryViewerAndReactionBottomSheet;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.utils.systemui.SystemUI;
import com.zing.zalo.zdesign.component.ProgressBar;
import com.zing.zalo.zdesign.component.Snackbar;
import com.zing.zalo.zdesign.component.TooltipView;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18505l;
import er.C18578b;
import er.C18587k;
import er.C18588l;
import ge0.C19431d;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import i40.AbstractC20279i;
import i40.C20274d;
import io.C20638b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kr.InterfaceC21910a;
import l30.AbstractC22055v0;
import l30.C22018d;
import l30.C22021e0;
import l30.C22033k0;
import l30.C22037m0;
import l30.C22052u;
import lr.C22640a;
import me0.AbstractC23034c6;
import me0.AbstractC23041d2;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23055e5;
import me0.C23212s8;
import me0.C23278z2;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import mr.InterfaceC23431j;
import nh0.C23793c;
import nr.C23929b;
import org.json.JSONArray;
import org.json.JSONObject;
import p108dr.C18055a;
import p108dr.C18061g;
import p172fy.C19171b;
import p173fz.C19172a;
import p205hc.C19964c;
import p205hc.C19965d;
import p304ks.AbstractC21935u;
import p322lf.AbstractC22470k;
import p348mi.AbstractC23304d;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p363nh.C23744a;
import p401or.C24417g;
import p458qr.C25482o;
import p509sp.C26361j;
import p510sq.C26365a;
import p542ub.InterfaceC27218a;
import p604wb.C28905e;
import p716zh.C31877d;
import p716zh.C31980jc;
import p716zh.C32002l4;
import p716zh.C32017m4;
import p716zh.C32123ta;
import pm0.C24848g0;
import pm0.C24860q;
import qi0.C25297f;
import qi0.EnumC25293b;
import sa0.C26209i;
import sn.C26333b;
import ui0.C27280g;
import vg.AbstractC28025b8;
import vg.AbstractC28065f8;
import vg.AbstractC28207v1;
import vg.C28195t7;
import vg.C28203u6;
import vg.C28204u7;
import vg.C28212v6;

/* loaded from: classes6.dex */
public class StoryDetailsView extends SlidableZaloView implements DragToCloseLayout.InterfaceC16432a, C23744a.c, InterfaceC0733x, InterfaceC23431j, InterfaceC1799v {

    /* renamed from: A1 */
    Map f77905A1;

    /* renamed from: B1 */
    C23929b f77906B1;

    /* renamed from: C1 */
    boolean f77907C1;

    /* renamed from: D1 */
    private C18055a f77908D1;

    /* renamed from: K1 */
    private C13306b f77915K1;

    /* renamed from: M1 */
    Animator f77917M1;

    /* renamed from: R0 */
    View f77924R0;

    /* renamed from: S0 */
    DragToCloseLayout f77926S0;

    /* renamed from: S1 */
    ValueAnimator f77927S1;

    /* renamed from: T0 */
    StoryViewPager f77928T0;

    /* renamed from: U0 */
    C28204u7 f77930U0;

    /* renamed from: V0 */
    C7286z8 f77932V0;

    /* renamed from: W0 */
    ViewPager.InterfaceC6875j f77934W0;

    /* renamed from: W1 */
    AbstractC15101b0 f77935W1;

    /* renamed from: X0 */
    C28195t7 f77936X0;

    /* renamed from: g1 */
    C32123ta f77949g1;

    /* renamed from: h1 */
    C23528a f77950h1;

    /* renamed from: j1 */
    Animator f77952j1;

    /* renamed from: x1 */
    C3977j f77966x1;

    /* renamed from: y1 */
    C18587k f77967y1;

    /* renamed from: z1 */
    ArrayList f77968z1;

    /* renamed from: P0 */
    int f77920P0 = 0;

    /* renamed from: Q0 */
    int f77922Q0 = 334;

    /* renamed from: Y0 */
    boolean f77938Y0 = false;

    /* renamed from: Z0 */
    boolean f77940Z0 = false;

    /* renamed from: a1 */
    boolean f77942a1 = false;

    /* renamed from: b1 */
    boolean f77944b1 = false;

    /* renamed from: c1 */
    int f77945c1 = -1;

    /* renamed from: d1 */
    int f77946d1 = 0;

    /* renamed from: e1 */
    int f77947e1 = -1;

    /* renamed from: f1 */
    C32123ta f77948f1 = null;

    /* renamed from: i1 */
    List f77951i1 = new ArrayList();

    /* renamed from: k1 */
    boolean f77953k1 = false;

    /* renamed from: l1 */
    boolean f77954l1 = false;

    /* renamed from: m1 */
    boolean f77955m1 = false;

    /* renamed from: n1 */
    boolean f77956n1 = false;

    /* renamed from: o1 */
    boolean f77957o1 = false;

    /* renamed from: p1 */
    boolean f77958p1 = false;

    /* renamed from: q1 */
    boolean f77959q1 = false;

    /* renamed from: r1 */
    String f77960r1 = "";

    /* renamed from: s1 */
    String f77961s1 = "";

    /* renamed from: t1 */
    boolean f77962t1 = false;

    /* renamed from: u1 */
    ArrayList f77963u1 = new ArrayList();

    /* renamed from: v1 */
    int f77964v1 = -1;

    /* renamed from: w1 */
    int f77965w1 = 0;

    /* renamed from: E1 */
    boolean f77909E1 = false;

    /* renamed from: F1 */
    boolean f77910F1 = false;

    /* renamed from: G1 */
    private boolean f77911G1 = false;

    /* renamed from: H1 */
    private Snackbar f77912H1 = null;

    /* renamed from: I1 */
    private View f77913I1 = null;

    /* renamed from: J1 */
    Handler f77914J1 = new Handler(Looper.getMainLooper(), new C15110k());

    /* renamed from: L1 */
    private final C13306b.c f77916L1 = new C15120u();

    /* renamed from: N1 */
    int f77918N1 = 0;

    /* renamed from: O1 */
    long f77919O1 = Long.MAX_VALUE;

    /* renamed from: P1 */
    long f77921P1 = 0;

    /* renamed from: Q1 */
    boolean f77923Q1 = false;

    /* renamed from: R1 */
    Map f77925R1 = new HashMap();

    /* renamed from: T1 */
    boolean f77929T1 = false;

    /* renamed from: U1 */
    InterfaceC17463d.c f77931U1 = new InterfaceC17463d.c() { // from class: com.zing.zalo.ui.zviews.sm0
        public /* synthetic */ sm0() {
        }

        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
        /* renamed from: p7 */
        public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
            StoryDetailsView.this.m84573OO(interfaceC17463d);
        }
    };

    /* renamed from: V1 */
    private final InterfaceC17463d.d f77933V1 = new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.tm0
        public /* synthetic */ tm0() {
        }

        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
        /* renamed from: K8 */
        public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
            StoryDetailsView.this.m84575PO(interfaceC17463d, i11);
        }
    };

    /* renamed from: X1 */
    float f77937X1 = -1.0f;

    /* renamed from: Y1 */
    float f77939Y1 = -1.0f;

    /* renamed from: Z1 */
    C7286z8.c f77941Z1 = new C15117r();

    /* renamed from: a2 */
    AbstractC22055v0.l f77943a2 = new C15118s();

    /* loaded from: classes6.dex */
    public static class KeepBelowZaloWebView extends ZaloWebView implements ZaloView.InterfaceC17421f {

        /* renamed from: h2 */
        AnimatorSet f77969h2;

        /* renamed from: com.zing.zalo.ui.zviews.StoryDetailsView$KeepBelowZaloWebView$a */
        /* loaded from: classes6.dex */
        class C15097a extends AnimatorListenerAdapter {
            C15097a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                KeepBelowZaloWebView.super.finish();
            }
        }

        @Override // com.zing.zalo.p077ui.zviews.ZaloWebView, com.zing.zalo.zview.ZaloView
        public void finish() {
            if (m92656bJ() == null) {
                super.finish();
                return;
            }
            AnimatorSet animatorSet = this.f77969h2;
            if (animatorSet == null || !animatorSet.isRunning()) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f77969h2 = animatorSet2;
                animatorSet2.play(ObjectAnimator.ofFloat(m92656bJ(), "translationY", m92656bJ().getHeight()));
                this.f77969h2.setDuration(200L);
                this.f77969h2.addListener(new C15097a());
                this.f77969h2.start();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.StoryDetailsView$a */
    /* loaded from: classes6.dex */
    class C15098a implements C28195t7.i {
        C15098a() {
        }

        @Override // vg.C28195t7.i
        /* renamed from: D */
        public void mo84723D(int i11) {
            C28195t7 c28195t7;
            if (StoryDetailsView.this.m84647pO() && (c28195t7 = StoryDetailsView.this.f77936X0) != null && c28195t7.m141780f() != null) {
                StoryDetailsView storyDetailsView = StoryDetailsView.this;
                storyDetailsView.f77906B1.m125116N0(storyDetailsView.f77936X0.m141780f().f148138h, i11, (int) StoryDetailsView.this.f77936X0.m141779e());
            }
        }

        @Override // vg.C28195t7.i
        public boolean onInfo(IMediaPlayer iMediaPlayer, int i11, int i12, Object obj) {
            StoryDetailsView storyDetailsView = StoryDetailsView.this;
            C28195t7 c28195t7 = storyDetailsView.f77936X0;
            if (c28195t7 != null) {
                c28195t7.m141788p(storyDetailsView.m84546FP());
            }
            C28195t7 c28195t72 = StoryDetailsView.this.f77936X0;
            if (c28195t72 != null && c28195t72.m141780f() != null && StoryDetailsView.this.m84647pO()) {
                StoryDetailsView storyDetailsView2 = StoryDetailsView.this;
                if (storyDetailsView2.f77907C1) {
                    storyDetailsView2.f77906B1.m125115M0(storyDetailsView2.f77936X0.m141780f().f148138h, i11, (int) StoryDetailsView.this.f77936X0.m141779e());
                    return false;
                }
                return false;
            }
            return false;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.StoryDetailsView$a0 */
    /* loaded from: classes6.dex */
    class C15099a0 implements C28195t7.h {
        C15099a0() {
        }

        @Override // vg.C28195t7.h
        /* renamed from: a */
        public boolean mo84724a(C32123ta c32123ta) {
            try {
                C31980jc c31980jc = (C31980jc) StoryDetailsView.this.f77951i1.get(StoryDetailsView.this.f77928T0.getCurrentItem());
                if (c31980jc.f147017B >= c31980jc.f147031x.size() - 1) {
                    AbstractC23647d.m123906p("49153092");
                    AbstractC23647d.m123893c();
                }
                BaseStoryItemView m84681MN = StoryDetailsView.this.m84681MN();
                if (m84681MN instanceof StoryFriendItemView) {
                    ((StoryFriendItemView) m84681MN).m88091k0();
                } else if (m84681MN instanceof StoryAdsItemView) {
                    ((StoryAdsItemView) m84681MN).m88073u0();
                }
                StoryDetailsView.this.m84709tP(true);
                return true;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return false;
            }
        }

        @Override // vg.C28195t7.h
        /* renamed from: b */
        public void mo84725b(C32123ta c32123ta) {
            if (StoryDetailsView.this.f77908D1 != null) {
                StoryDetailsView.this.f77908D1.m95990o0(c32123ta, StoryDetailsView.this.f77922Q0);
            }
            BaseStoryItemView m84681MN = StoryDetailsView.this.m84681MN();
            if (m84681MN instanceof StoryAdsItemView) {
                ((StoryAdsItemView) m84681MN).m88072q0();
            }
        }

        @Override // vg.C28195t7.h
        /* renamed from: c */
        public void mo84726c(C32123ta c32123ta) {
            StoryDetailsView.this.m84697hO(c32123ta);
        }

        @Override // vg.C28195t7.h
        /* renamed from: d */
        public void mo84727d(C32123ta c32123ta) {
            try {
                int currentItem = StoryDetailsView.this.f77928T0.getCurrentItem();
                BaseStoryItemView baseStoryItemView = (BaseStoryItemView) StoryDetailsView.this.f77932V0.f39936x.get(currentItem);
                C31980jc c31980jc = (C31980jc) StoryDetailsView.this.f77951i1.get(currentItem);
                if (c31980jc != null && c31980jc.m153825r() != null && c32123ta.f148138h.equals(c31980jc.m153825r().f148138h) && c32123ta.f148126b == 1) {
                    baseStoryItemView.mo87702a0(2, c32123ta, null);
                    if (StoryDetailsView.this.m84710uN()) {
                        baseStoryItemView.setShowLoading(true);
                        View view = baseStoryItemView.f83096J;
                        if (view != null) {
                            view.setVisibility(8);
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // vg.C28195t7.h
        /* renamed from: e */
        public boolean mo84728e(C32123ta c32123ta) {
            BaseStoryItemView m84681MN = StoryDetailsView.this.m84681MN();
            if (m84681MN != null) {
                m84681MN.mo87692Q();
                if (c32123ta.f148126b != 2 || c32123ta.f148128c != 2) {
                    AbstractC23136l9.m118744r1(m84681MN.f83096J, 8);
                    m84681MN.setBottomBarVisibility(0);
                }
                if (m84681MN instanceof StoryMineItemView) {
                    ((StoryMineItemView) m84681MN).m88125q0(true);
                }
            }
            StoryDetailsView.this.m84721zP();
            return StoryDetailsView.this.m84720zN();
        }

        @Override // vg.C28195t7.h
        /* renamed from: f */
        public void mo84729f(C32123ta c32123ta) {
            C31980jc c31980jc;
            AbstractC15101b0 abstractC15101b0;
            int currentItem = StoryDetailsView.this.f77928T0.getCurrentItem();
            C32123ta c32123ta2 = null;
            if (currentItem >= 0 && currentItem < StoryDetailsView.this.f77951i1.size()) {
                c31980jc = (C31980jc) StoryDetailsView.this.f77951i1.get(currentItem);
            } else {
                c31980jc = null;
            }
            if (c31980jc != null) {
                c32123ta2 = c31980jc.m153825r();
            }
            if (c31980jc != null && c32123ta2 != null && c32123ta != null && TextUtils.equals(c32123ta2.f148138h, c32123ta.f148138h) && (abstractC15101b0 = StoryDetailsView.this.f77935W1) != null) {
                abstractC15101b0.mo17198f(c31980jc, c32123ta2);
            }
        }

        @Override // vg.C28195t7.h
        /* renamed from: g */
        public void mo84730g(C32123ta c32123ta, long j11) {
            StoryDetailsView.this.m84696fO(c32123ta, j11);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.StoryDetailsView$b */
    /* loaded from: classes6.dex */
    class C15100b extends WindowInsetsAnimation.Callback {
        C15100b(int i11) {
            super(i11);
        }

        @Override // android.view.WindowInsetsAnimation.Callback
        public WindowInsets onProgress(WindowInsets windowInsets, List list) {
            return windowInsets;
        }

        @Override // android.view.WindowInsetsAnimation.Callback
        public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
            ((KeyboardFrameLayout) StoryDetailsView.this.f77924R0.findViewById(AbstractC6918a0.story_detail_keyboard_framelayout)).requestLayout();
            return super.onStart(windowInsetsAnimation, bounds);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.StoryDetailsView$b0 */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC15101b0 {
        /* renamed from: a */
        public AbstractC20279i.a mo17180a(C31980jc c31980jc) {
            return null;
        }

        /* renamed from: b */
        public void mo17181b(boolean z11) {
        }

        /* renamed from: c */
        public void mo17182c(boolean z11) {
        }

        /* renamed from: d */
        public void mo17183d(boolean z11) {
        }

        /* renamed from: e */
        public void mo17197e(C31980jc c31980jc) {
        }

        /* renamed from: f */
        public void mo17198f(C31980jc c31980jc, C32123ta c32123ta) {
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.StoryDetailsView$c */
    /* loaded from: classes6.dex */
    public class C15102c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C32123ta f77974a;

        C15102c(C32123ta c32123ta) {
            this.f77974a = c32123ta;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                StoryDetailsView.this.f77925R1.remove(this.f77974a.f148138h);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C32123ta m153826s;
            try {
                if (StoryDetailsView.this.m84681MN() != null && StoryDetailsView.this.m84681MN().f83110a0 != null && (m153826s = StoryDetailsView.this.m84681MN().f83110a0.m153826s(this.f77974a.f148138h)) != null) {
                    m153826s.f148152r = true;
                }
                StoryDetailsView.this.f77925R1.remove(this.f77974a.f148138h);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.StoryDetailsView$d */
    /* loaded from: classes6.dex */
    public class C15103d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ PrivacyInfo f77976a;

        /* renamed from: b */
        final /* synthetic */ String f77977b;

        /* renamed from: c */
        final /* synthetic */ int f77978c;

        C15103d(PrivacyInfo privacyInfo, String str, int i11) {
            this.f77976a = privacyInfo;
            this.f77977b = str;
            this.f77978c = i11;
        }

        /* renamed from: e */
        public /* synthetic */ void m84733e(String str, PrivacyInfo privacyInfo, int i11) {
            C32123ta m153825r;
            C31980jc c31980jc = (C31980jc) StoryDetailsView.this.f77951i1.get(StoryDetailsView.this.f77928T0.getCurrentItem());
            if (c31980jc != null && (m153825r = c31980jc.m153825r()) != null && str.equals(m153825r.f148138h)) {
                AbstractC28025b8.m141442M("tip.story.privacy_setting");
                StoryDetailsView.this.m84542EN("tip.story.privacy_setting");
                StoryDetailsView.this.m84648pP(privacyInfo, i11);
            }
            StoryDetailsView.this.mo49315c4();
            StoryDetailsView.this.m84715wP();
        }

        /* renamed from: f */
        public /* synthetic */ void m84734f(C20096c c20096c) {
            ToastUtils.showMess(c20096c.m104492d());
            StoryDetailsView.this.mo49315c4();
            StoryDetailsView.this.m84715wP();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            StoryDetailsView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.fo0

                /* renamed from: q */
                public final /* synthetic */ C20096c f80383q;

                public /* synthetic */ fo0(C20096c c20096c2) {
                    r2 = c20096c2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    StoryDetailsView.C15103d.this.m84734f(r2);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject != null) {
                    JSONArray optJSONArray = optJSONObject.optJSONArray("list");
                    ArrayList arrayList = new ArrayList();
                    if (optJSONArray != null && optJSONArray.length() > 0) {
                        for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                            JSONObject jSONObject = (JSONObject) optJSONArray.get(i11);
                            String string = jSONObject.getString("uid");
                            String string2 = jSONObject.getString("avt");
                            String string3 = jSONObject.getString("dispname");
                            if (AbstractC21935u.m114558y(string)) {
                                arrayList.add(new LikeContactItem(string, AbstractC21935u.m114542i(string, string3), string2));
                            }
                        }
                    }
                    this.f77976a.m45136H(arrayList);
                }
                StoryDetailsView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.eo0

                    /* renamed from: q */
                    public final /* synthetic */ String f80264q;

                    /* renamed from: r */
                    public final /* synthetic */ PrivacyInfo f80265r;

                    /* renamed from: s */
                    public final /* synthetic */ int f80266s;

                    public /* synthetic */ eo0(String str, PrivacyInfo privacyInfo, int i12) {
                        r2 = str;
                        r3 = privacyInfo;
                        r4 = i12;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        StoryDetailsView.C15103d.this.m84733e(r2, r3, r4);
                    }
                });
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.StoryDetailsView$e */
    /* loaded from: classes6.dex */
    public class C15104e implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C32123ta f77980a;

        /* renamed from: b */
        final /* synthetic */ PrivacyInfo f77981b;

        /* renamed from: c */
        final /* synthetic */ C31980jc f77982c;

        C15104e(C32123ta c32123ta, PrivacyInfo privacyInfo, C31980jc c31980jc) {
            this.f77980a = c32123ta;
            this.f77981b = privacyInfo;
            this.f77982c = c31980jc;
        }

        /* renamed from: e */
        public /* synthetic */ void m84737e() {
            StoryDetailsView.this.m84549GP(AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_privacy_update_success), 0, 0, "", null, -1);
            StoryDetailsView.this.m84716xN(false);
            StoryDetailsView.this.mo49315c4();
            StoryDetailsView.this.m84715wP();
        }

        /* renamed from: f */
        public /* synthetic */ void m84738f(C20096c c20096c) {
            ToastUtils.showMess(c20096c.m104492d());
            StoryDetailsView.this.mo49315c4();
            StoryDetailsView.this.m84715wP();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            StoryDetailsView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.go0

                /* renamed from: q */
                public final /* synthetic */ C20096c f80485q;

                public /* synthetic */ go0(C20096c c20096c2) {
                    r2 = c20096c2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    StoryDetailsView.C15104e.this.m84738f(r2);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            this.f77980a.f148149o = this.f77981b;
            C22021e0.m114963p().m114981R(this.f77982c.f147023p);
            StoryDetailsView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.ho0
                public /* synthetic */ ho0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    StoryDetailsView.C15104e.this.m84737e();
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.StoryDetailsView$f */
    /* loaded from: classes6.dex */
    public class C15105f implements C22033k0.i {

        /* renamed from: a */
        final /* synthetic */ int f77984a;

        C15105f(int i11) {
            this.f77984a = i11;
        }

        @Override // l30.C22033k0.i
        /* renamed from: O */
        public void mo45897O() {
        }

        @Override // l30.C22033k0.i
        /* renamed from: a */
        public void mo45898a(String str, C22033k0.g gVar) {
            if (StoryDetailsView.this.m92672lJ() && StoryDetailsView.this.m92687sJ()) {
                ToastUtils.showMess(str);
                mo45897O();
            }
        }

        @Override // l30.C22033k0.i
        /* renamed from: b */
        public void mo45899b(Bundle bundle, C22033k0.h hVar) {
            C17487o0 c17487o0;
            StoryDetailsView storyDetailsView = StoryDetailsView.this;
            if (!storyDetailsView.m92672lJ()) {
                return;
            }
            if (storyDetailsView.m92676n2() != null) {
                c17487o0 = storyDetailsView.m92676n2().mo35579p();
            } else {
                c17487o0 = null;
            }
            C17487o0 c17487o02 = c17487o0;
            if (c17487o02 != null) {
                if (bundle != null) {
                    bundle.putInt("srcType", this.f77984a);
                    bundle.putBoolean("EXTRA_FLAG_VIEW_SELECTED_USER_STORY_ONLY", true);
                    bundle.putBoolean("EXTRA_JUMP_TO_LAST_STORY_ITEM", true);
                }
                c17487o02.mo89694j2(StoryDetailsView.class, bundle, 0, null, 0, true);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.StoryDetailsView$g */
    /* loaded from: classes6.dex */
    public class C15106g implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C31980jc f77986a;

        /* renamed from: b */
        final /* synthetic */ C32123ta f77987b;

        C15106g(C31980jc c31980jc, C32123ta c32123ta) {
            this.f77986a = c31980jc;
            this.f77987b = c32123ta;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            StoryDetailsView.this.mo49315c4();
            if (c20096c != null) {
                try {
                    ToastUtils.showMess(c20096c.m104492d());
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                    return;
                }
            }
            StoryDetailsView.this.f77914J1.sendEmptyMessage(4);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                StoryDetailsView.this.mo49315c4();
                C31980jc m114986i = C22021e0.m114963p().m114986i(this.f77986a.f147023p, this.f77987b.f148138h);
                if (m114986i != null) {
                    C7960e.m41971c6().m42449ke(m114986i.f147023p, m114986i.m153815E().toString(), m114986i.m153823o().toString(), m114986i.m153824p().toString());
                }
                int i11 = StoryDetailsView.this.f77920P0;
                if (i11 == 3 || i11 == 4) {
                    this.f77986a.m153822n(this.f77987b.f148138h);
                }
                if (StoryDetailsView.this.f77920P0 == 5) {
                    this.f77986a.m153822n(this.f77987b.f148138h);
                    StoryDetailsView storyDetailsView = StoryDetailsView.this;
                    if (storyDetailsView.f77968z1 == null) {
                        storyDetailsView.f77968z1 = new ArrayList();
                    }
                    StoryDetailsView.this.f77968z1.add(this.f77987b.f148138h);
                    C18578b.f93336a.m98046d(this.f77987b.f148138h);
                    C0815e1.m2075D().m2100V(new C23648e(29, "", 0, "archive_story_delete", new String[0]), false);
                }
                StoryDetailsView.this.m84689VN(this.f77986a);
                ToastUtils.m89266n(AbstractC8020f0.str_delete_story_success, new Object[0]);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.StoryDetailsView$h */
    /* loaded from: classes6.dex */
    public class C15107h implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C31980jc f77989a;

        /* renamed from: b */
        final /* synthetic */ C32123ta f77990b;

        C15107h(C31980jc c31980jc, C32123ta c32123ta) {
            this.f77989a = c31980jc;
            this.f77990b = c32123ta;
        }

        /* renamed from: e */
        public /* synthetic */ void m84741e(View view) {
            StoryDetailsView.this.m84685QN();
        }

        /* renamed from: f */
        public /* synthetic */ void m84742f() {
            StoryDetailsView.this.m84549GP(AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_archive_snack_bar_add_success), 0, 0, AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_archive_snack_bar_view), new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.jo0
                public /* synthetic */ jo0() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StoryDetailsView.C15107h.this.m84741e(view);
                }
            }, Integer.MAX_VALUE);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            String m118743r0;
            StoryDetailsView.this.mo49315c4();
            if (c20096c != null) {
                try {
                    if (c20096c.m104491c() == 50001) {
                        m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_archive_story_failed_network);
                    } else {
                        m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_archive_story_failed_general);
                    }
                    ToastUtils.showMess(m118743r0);
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                    return;
                }
            }
            StoryDetailsView.this.f77914J1.sendEmptyMessage(4);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                StoryDetailsView.this.mo78960q3();
                C31980jc m114986i = C22021e0.m114963p().m114986i(this.f77989a.f147023p, this.f77990b.f148138h);
                if (m114986i != null) {
                    C7960e.m41971c6().m42449ke(m114986i.f147023p, m114986i.m153815E().toString(), m114986i.m153823o().toString(), m114986i.m153824p().toString());
                }
                int i11 = StoryDetailsView.this.f77920P0;
                if (i11 == 3 || i11 == 4) {
                    this.f77989a.m153822n(this.f77990b.f148138h);
                }
                C0815e1.m2075D().m2100V(new C23648e(29, "", 0, "story_archive_story", new String[0]), false);
                StoryDetailsView.this.m84689VN(this.f77989a);
                StoryDetailsView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.io0
                    public /* synthetic */ io0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        StoryDetailsView.C15107h.this.m84742f();
                    }
                });
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.StoryDetailsView$i */
    /* loaded from: classes6.dex */
    public class C15108i extends Snackbar.AbstractC16924b {
        C15108i() {
        }

        @Override // com.zing.zalo.zdesign.component.Snackbar.AbstractC16924b
        /* renamed from: a */
        public void mo49166a(Snackbar snackbar, int i11) {
            super.mo49166a(snackbar, i11);
            long m84572ON = StoryDetailsView.this.m84572ON(snackbar);
            StoryDetailsView storyDetailsView = StoryDetailsView.this;
            if (m84572ON == storyDetailsView.m84572ON(storyDetailsView.f77912H1)) {
                StoryDetailsView.this.f77912H1 = null;
            }
        }

        @Override // com.zing.zalo.zdesign.component.Snackbar.AbstractC16924b
        /* renamed from: b */
        public void mo84743b(Snackbar snackbar) {
            super.mo84743b(snackbar);
            StoryDetailsView.this.f77912H1 = snackbar;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.StoryDetailsView$j */
    /* loaded from: classes6.dex */
    public class C15109j implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C31980jc f77993a;

        /* renamed from: b */
        final /* synthetic */ BaseStoryItemView f77994b;

        C15109j(C31980jc c31980jc, BaseStoryItemView baseStoryItemView) {
            this.f77993a = c31980jc;
            this.f77994b = baseStoryItemView;
        }

        /* renamed from: d */
        private void m84745d() {
            StoryDetailsView.this.mo49315c4();
            StoryDetailsView.this.f77914J1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.ko0

                /* renamed from: q */
                public final /* synthetic */ C31980jc f80928q;

                /* renamed from: r */
                public final /* synthetic */ BaseStoryItemView f80929r;

                public /* synthetic */ ko0(C31980jc c31980jc, BaseStoryItemView baseStoryItemView) {
                    r2 = c31980jc;
                    r3 = baseStoryItemView;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    StoryDetailsView.C15109j.this.m84746e(r2, r3);
                }
            });
        }

        /* renamed from: e */
        public /* synthetic */ void m84746e(C31980jc c31980jc, BaseStoryItemView baseStoryItemView) {
            if (c31980jc.f147031x.isEmpty()) {
                StoryDetailsView.this.m84678HN(c31980jc, true);
                return;
            }
            c31980jc.f147017B = 0;
            StoryDetailsView.this.m84661vO();
            if (baseStoryItemView != null) {
                StoryDetailsView.this.m84691aO(c31980jc.m153825r(), baseStoryItemView);
                StoryDetailsView.this.m84706sN(c31980jc);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            m84745d();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            m84745d();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.StoryDetailsView$k */
    /* loaded from: classes6.dex */
    class C15110k implements Handler.Callback {
        C15110k() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00e6, code lost:            return false;     */
        @Override // android.os.Handler.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean handleMessage(Message message) {
            C32123ta c32123ta;
            C32123ta c32123ta2;
            switch (message.what) {
                case 1:
                    StoryDetailsView.this.f77921P1 = System.currentTimeMillis();
                    if (StoryDetailsView.this.m84720zN()) {
                        StoryDetailsView.this.m84713vP(true, true);
                        break;
                    } else if (!StoryDetailsView.this.m92672lJ()) {
                        StoryDetailsView.this.m84721zP();
                        BaseStoryItemView m84681MN = StoryDetailsView.this.m84681MN();
                        if (m84681MN != null && m84681MN.f83096J != null) {
                            m84681MN.setShowLoading(false);
                            m84681MN.mo87702a0(1, null, null);
                            break;
                        }
                    } else {
                        StoryDetailsView.this.m84713vP(true, true);
                        break;
                    }
                    break;
                case 2:
                    if (!StoryDetailsView.this.m78935DL()) {
                        StoryDetailsView.this.mo49282B8(null, true);
                        break;
                    }
                    break;
                case 3:
                    StoryDetailsView.this.mo49315c4();
                    break;
                case 4:
                    StoryDetailsView.this.m84715wP();
                    break;
                case 5:
                    if (StoryDetailsView.this.m92672lJ() && (c32123ta = (C32123ta) message.obj) != null) {
                        StoryDetailsView storyDetailsView = StoryDetailsView.this;
                        if (storyDetailsView.f77938Y0) {
                            storyDetailsView.m84537CP(c32123ta, 5);
                            break;
                        } else {
                            storyDetailsView.m84707sP(c32123ta);
                            break;
                        }
                    }
                    break;
                case 6:
                    if (StoryDetailsView.this.m92672lJ() && (c32123ta2 = (C32123ta) message.obj) != null) {
                        StoryDetailsView storyDetailsView2 = StoryDetailsView.this;
                        if (storyDetailsView2.f77938Y0) {
                            storyDetailsView2.m84537CP(c32123ta2, 6);
                            break;
                        } else {
                            storyDetailsView2.m84670AP(c32123ta2);
                            break;
                        }
                    }
                    break;
                case 7:
                    StoryDetailsView storyDetailsView3 = StoryDetailsView.this;
                    if (storyDetailsView3.f77906B1 != null && storyDetailsView3.f77936X0.m141780f() != null && C26361j.f125215a.m135702h(StoryDetailsView.this.f77936X0.m141780f())) {
                        StoryDetailsView storyDetailsView4 = StoryDetailsView.this;
                        storyDetailsView4.f77906B1.m125110G0(storyDetailsView4.f77936X0.m141780f().f148138h, (int) StoryDetailsView.this.f77936X0.m141779e());
                        break;
                    }
                    break;
                case 8:
                    if (StoryDetailsView.this.m92672lJ()) {
                        StoryDetailsView.this.m84552HP((C23929b.h) message.obj);
                        break;
                    }
                    break;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.StoryDetailsView$l */
    /* loaded from: classes6.dex */
    public class C15111l extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C31980jc f77997a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f77998b;

        C15111l(C31980jc c31980jc, ArrayList arrayList) {
            this.f77997a = c31980jc;
            this.f77998b = arrayList;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                C7960e m41971c6 = C7960e.m41971c6();
                C31980jc c31980jc = this.f77997a;
                m41971c6.m42449ke(c31980jc.f147023p, c31980jc.m153815E().toString(), this.f77997a.m153823o().toString(), this.f77997a.m153824p().toString());
                Iterator it = this.f77998b.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (str != null && !str.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add("0");
                        C7960e.m41971c6().m42271T3(str, arrayList);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.StoryDetailsView$m */
    /* loaded from: classes6.dex */
    public class C15112m extends AbstractC0939u {
        C15112m() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42589y3();
            C7960e.m41971c6().m42125G(C22021e0.f108429m);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.StoryDetailsView$n */
    /* loaded from: classes6.dex */
    public class RunnableC15113n implements Runnable {

        /* renamed from: p */
        final /* synthetic */ BaseStoryItemView f78001p;

        /* renamed from: com.zing.zalo.ui.zviews.StoryDetailsView$n$a */
        /* loaded from: classes6.dex */
        class a extends AnimatorListenerAdapter {
            a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                StoryDetailsView.this.m84673C8();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                StoryDetailsView storyDetailsView = StoryDetailsView.this;
                if (storyDetailsView.f77936X0.f131381h) {
                    storyDetailsView.m84690ZN();
                }
            }
        }

        RunnableC15113n(BaseStoryItemView baseStoryItemView) {
            this.f78001p = baseStoryItemView;
        }

        @Override // java.lang.Runnable
        public void run() {
            StoryDetailsView storyDetailsView = StoryDetailsView.this;
            storyDetailsView.f77952j1 = storyDetailsView.m84564LN(this.f78001p, false, new a());
            StoryDetailsView storyDetailsView2 = StoryDetailsView.this;
            Animator animator = storyDetailsView2.f77952j1;
            if (animator != null) {
                storyDetailsView2.f88756W = 0;
                animator.start();
            } else {
                storyDetailsView2.m84673C8();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.StoryDetailsView$o */
    /* loaded from: classes6.dex */
    public class C15114o implements InterfaceC20094a {
        C15114o() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                ToastUtils.showMess(StoryDetailsView.this.m92652XI(AbstractC8020f0.error_message));
                StoryDetailsView.this.mo49315c4();
                StoryDetailsView.this.f77914J1.sendEmptyMessage(4);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                ToastUtils.showMess(StoryDetailsView.this.m92652XI(AbstractC8020f0.str_story_report_success));
                StoryDetailsView.this.mo49315c4();
                StoryDetailsView.this.m84715wP();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.StoryDetailsView$p */
    /* loaded from: classes6.dex */
    class C15115p extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ boolean f78005p;

        C15115p(boolean z11) {
            this.f78005p = z11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f78005p) {
                View view = StoryDetailsView.this.f77924R0;
                if (view != null) {
                    view.setBackgroundColor(-16777216);
                }
                StoryDetailsView.this.m92693xK().m93094z(false);
                StoryDetailsView.this.m84715wP();
                return;
            }
            AbstractC23647d.m123906p("4915303");
            AbstractC23647d.m123893c();
            C0732w.Companion.m1189a().m1187q("swipe_close_story", "", null, null);
            StoryDetailsView storyDetailsView = StoryDetailsView.this;
            storyDetailsView.f88756W = 0;
            storyDetailsView.f77953k1 = true;
            storyDetailsView.finish();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.StoryDetailsView$q */
    /* loaded from: classes6.dex */
    public class C15116q implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ Runnable f78007a;

        C15116q(Runnable runnable) {
            this.f78007a = runnable;
        }

        /* renamed from: e */
        public /* synthetic */ void m84749e() {
            try {
                if (StoryDetailsView.this.m92672lJ()) {
                    StoryDetailsView.this.m84716xN(false);
                    StoryDetailsView.this.m84711uP(true);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        /* renamed from: f */
        public /* synthetic */ void m84750f() {
            try {
                if (StoryDetailsView.this.m92672lJ()) {
                    StoryDetailsView storyDetailsView = StoryDetailsView.this;
                    storyDetailsView.f77932V0.m37059A(storyDetailsView.f77951i1);
                    StoryDetailsView.this.f77914J1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.mo0
                        public /* synthetic */ mo0() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            StoryDetailsView.C15116q.this.m84749e();
                        }
                    }, 100L);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            StoryDetailsView.this.f77914J1.post(this.f78007a);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            List list = C22021e0.f108432p;
            if (!list.isEmpty()) {
                StoryDetailsView.this.f77951i1.clear();
                StoryDetailsView.this.f77951i1.addAll(list);
                StoryDetailsView.this.f77914J1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.lo0
                    public /* synthetic */ lo0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        StoryDetailsView.C15116q.this.m84750f();
                    }
                });
                return;
            }
            StoryDetailsView.this.f77914J1.post(this.f78007a);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.StoryDetailsView$r */
    /* loaded from: classes6.dex */
    public class C15117r implements C7286z8.c {

        /* renamed from: com.zing.zalo.ui.zviews.StoryDetailsView$r$a */
        /* loaded from: classes6.dex */
        public class a implements Runnable {

            /* renamed from: p */
            final /* synthetic */ BaseStoryItemView f78010p;

            /* renamed from: com.zing.zalo.ui.zviews.StoryDetailsView$r$a$a */
            /* loaded from: classes6.dex */
            class C32788a extends AnimatorListenerAdapter {
                C32788a() {
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    StoryDetailsView storyDetailsView = StoryDetailsView.this;
                    storyDetailsView.f77938Y0 = false;
                    storyDetailsView.f77952j1 = null;
                    storyDetailsView.m84626jP();
                }
            }

            a(BaseStoryItemView baseStoryItemView) {
                this.f78010p = baseStoryItemView;
            }

            /* renamed from: b */
            public /* synthetic */ void m84792b(BaseStoryItemView baseStoryItemView) {
                baseStoryItemView.setVisibility(0);
                StoryDetailsView.this.f77952j1.start();
            }

            @Override // java.lang.Runnable
            public void run() {
                if (StoryDetailsView.this.mo60294yp()) {
                    return;
                }
                StoryDetailsView storyDetailsView = StoryDetailsView.this;
                storyDetailsView.f77952j1 = storyDetailsView.m84564LN(this.f78010p, true, new C32788a());
                StoryDetailsView storyDetailsView2 = StoryDetailsView.this;
                if (storyDetailsView2.f77952j1 != null) {
                    storyDetailsView2.f77938Y0 = true;
                    storyDetailsView2.f77924R0.setBackgroundColor(0);
                    this.f78010p.setVisibility(4);
                    Handler handler = StoryDetailsView.this.f77914J1;
                    if (handler != null) {
                        handler.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.oo0

                            /* renamed from: q */
                            public final /* synthetic */ BaseStoryItemView f81495q;

                            public /* synthetic */ oo0(BaseStoryItemView baseStoryItemView) {
                                r2 = baseStoryItemView;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                StoryDetailsView.C15117r.a.this.m84792b(r2);
                            }
                        });
                    }
                    StoryDetailsView.this.m84715wP();
                    return;
                }
                storyDetailsView2.f77938Y0 = false;
                storyDetailsView2.f77924R0.setBackgroundColor(-16777216);
                this.f78010p.setVisibility(0);
                StoryDetailsView storyDetailsView3 = StoryDetailsView.this;
                if (storyDetailsView3.f77920P0 == 2 && !TextUtils.isEmpty(storyDetailsView3.f77961s1)) {
                    StoryDetailsView.this.m84686RN();
                } else {
                    StoryDetailsView.this.m84715wP();
                }
                StoryDetailsView.this.m84626jP();
            }
        }

        /* renamed from: com.zing.zalo.ui.zviews.StoryDetailsView$r$b */
        /* loaded from: classes6.dex */
        class b extends AbstractC28207v1.g0 {
            b() {
            }

            @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
            /* renamed from: m */
            public void mo40748m(String str) {
                super.mo40748m(str);
                AbstractC19444a.m101694b(new po0(StoryDetailsView.this), 500L);
            }

            @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
            /* renamed from: q */
            public void mo40752q(String str) {
                super.mo40752q(str);
                StoryDetailsView.this.mo46829Y();
            }

            @Override // vg.AbstractC28207v1.g0, p483rh.InterfaceC25792a.b
            /* renamed from: s */
            public void mo40754s(String str) {
                super.mo40754s(str);
                AbstractC19444a.m101694b(new po0(StoryDetailsView.this), 500L);
            }
        }

        C15117r() {
        }

        /* renamed from: P */
        public /* synthetic */ void m84752P(String str, String str2) {
            StoryDetailsView.this.m84715wP();
        }

        @Override // com.zing.zalo.uicontrol.BaseStoryItemView.InterfaceC16456f
        /* renamed from: A */
        public void mo84753A(boolean z11) {
            if (StoryDetailsView.this.f77908D1 != null) {
                if (z11) {
                    StoryDetailsView.this.f77908D1.m95982g0();
                } else {
                    StoryDetailsView.this.f77908D1.m95981f0();
                }
            }
        }

        @Override // com.zing.zalo.uicontrol.BaseStoryItemView.InterfaceC16456f
        /* renamed from: B */
        public boolean mo84754B() {
            return StoryDetailsView.this.m84715wP();
        }

        @Override // com.zing.zalo.uicontrol.BaseStoryItemView.InterfaceC16456f
        /* renamed from: C */
        public void mo84755C() {
            try {
                int currentItem = StoryDetailsView.this.f77928T0.getCurrentItem();
                C31980jc c31980jc = (C31980jc) StoryDetailsView.this.f77951i1.get(currentItem);
                StoryDetailsView storyDetailsView = StoryDetailsView.this;
                C7286z8 c7286z8 = storyDetailsView.f77932V0;
                if (c7286z8 != null) {
                    c7286z8.m37062y(c31980jc, storyDetailsView.m84681MN(), currentItem);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // com.zing.zalo.uicontrol.BaseStoryItemView.InterfaceC16456f
        /* renamed from: D */
        public void mo84756D() {
            StoryDetailsView.this.finish();
        }

        @Override // com.zing.zalo.uicontrol.BaseStoryItemView.InterfaceC16456f
        /* renamed from: E */
        public int mo84757E() {
            return StoryDetailsView.this.f77920P0;
        }

        @Override // com.zing.zalo.uicontrol.BaseStoryItemView.InterfaceC16456f
        /* renamed from: F */
        public ZaloView mo84758F(C32123ta c32123ta, C31980jc c31980jc, BaseStoryItemView baseStoryItemView) {
            ZaloView zaloView = null;
            if (c31980jc != null && c32123ta != null && !TextUtils.isEmpty(c32123ta.f148158x)) {
                Bundle bundle = new Bundle();
                bundle.putString("EXTRA_WEB_URL", c32123ta.f148158x);
                if (!StoryDetailsView.this.m92692wK().mo35576n3()) {
                    StoryDetailsView.this.m84566LP(false);
                    zaloView = StoryDetailsView.this.m92693xK().mo57057c2(baseStoryItemView.f83105S.getId(), KeepBelowZaloWebView.class, bundle, 1020, null, 0, true);
                } else {
                    ZaloWebView.m87105iS(StoryDetailsView.this.m92692wK(), c32123ta.f148158x, bundle);
                }
                StoryDetailsView.this.f77928T0.setDisableScrolling(true);
            }
            return zaloView;
        }

        @Override // com.zing.zalo.uicontrol.BaseStoryItemView.InterfaceC16456f
        /* renamed from: G */
        public void mo84759G() {
            if (StoryDetailsView.this.f77911G1) {
                return;
            }
            String[] strArr = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
            if (AbstractC23034c6.m118167n(StoryDetailsView.this.m92686rK(), strArr) != 0) {
                StoryDetailsView.this.f77911G1 = true;
                AbstractC23034c6.m118186w0(StoryDetailsView.this.m92692wK(), strArr, 115);
                return;
            }
            CameraInputParams m39205o = CameraInputParams.m39205o();
            m39205o.f41138w0 = new SensitiveData("timeline_post_story_from_story", "social_timeline");
            Bundle bundle = new Bundle();
            bundle.putParcelable("TRACKING_SOURCE_POST_STORY_KEY", new TrackingSource(2));
            AbstractC22470k.m116168t(StoryDetailsView.this.f72421L0.m92676n2(), 11116, 0, m39205o, bundle);
        }

        @Override // com.zing.zalo.uicontrol.BaseStoryItemView.InterfaceC16456f
        /* renamed from: H */
        public void mo84760H(String str) {
            if (!TextUtils.isEmpty(str)) {
                new C19171b().m101508a(new C19171b.a(StoryDetailsView.this.f72421L0.m92676n2(), new C26365a.b(str, C32002l4.m154265h(IMediaPlayer.MEDIA_INFO_VIDEO_SEEK_RENDERING_START, 1)).m135743b(), 1025, 1));
            }
        }

        @Override // com.zing.zalo.uicontrol.BaseStoryItemView.InterfaceC16456f
        /* renamed from: I */
        public void mo84761I(BaseStoryItemView baseStoryItemView) {
            StoryDetailsView.this.m84566LP(true);
            StoryDetailsView storyDetailsView = StoryDetailsView.this;
            storyDetailsView.f77945c1 = storyDetailsView.f77928T0.getCurrentItem();
        }

        @Override // com.zing.zalo.uicontrol.BaseStoryItemView.InterfaceC16456f
        /* renamed from: J */
        public void mo84762J(boolean z11) {
            StoryViewPager storyViewPager = StoryDetailsView.this.f77928T0;
            if (storyViewPager != null) {
                storyViewPager.setDisableScrolling(z11);
            }
        }

        @Override // com.zing.zalo.uicontrol.BaseStoryItemView.InterfaceC16456f
        /* renamed from: K */
        public void mo84763K(C32123ta c32123ta) {
            if (StoryDetailsView.this.f77908D1 != null && c32123ta != null) {
                StoryDetailsView.this.f77908D1.m95977N0(c32123ta);
            }
        }

        @Override // com.zing.zalo.uicontrol.BaseStoryItemView.InterfaceC16456f
        /* renamed from: L */
        public void mo84764L(BaseStoryItemView baseStoryItemView, boolean z11) {
            StoryViewPager storyViewPager = StoryDetailsView.this.f77928T0;
            if (storyViewPager != null) {
                storyViewPager.setDisableScrolling(z11);
            }
        }

        @Override // com.zing.zalo.uicontrol.BaseStoryItemView.InterfaceC16456f
        /* renamed from: M */
        public void mo84765M(String str, int i11, int i12) {
            StoryDetailsView.this.m84700nO();
            C28204u7 c28204u7 = StoryDetailsView.this.f77930U0;
            if (c28204u7 != null) {
                c28204u7.m141841j(str, i11, i12);
            }
        }

        @Override // com.zing.zalo.adapters.C7286z8.c
        /* renamed from: N */
        public boolean mo37069N() {
            int i11;
            StoryDetailsView storyDetailsView = StoryDetailsView.this;
            if (!storyDetailsView.f77958p1 && !storyDetailsView.f77959q1 && (i11 = storyDetailsView.f77920P0) != 3 && i11 != 5) {
                return true;
            }
            return false;
        }

        @Override // com.zing.zalo.uicontrol.BaseStoryItemView.InterfaceC16456f
        /* renamed from: a */
        public void mo84766a(C32123ta c32123ta) {
            if (StoryDetailsView.this.m84703qO(c32123ta)) {
                StoryDetailsView.this.m84677GN();
            }
        }

        @Override // com.zing.zalo.uicontrol.BaseStoryItemView.InterfaceC16456f
        /* renamed from: b */
        public void mo84767b(C32123ta c32123ta) {
            StoryDetailsView storyDetailsView = StoryDetailsView.this;
            C28204u7 c28204u7 = storyDetailsView.f77930U0;
            if (c28204u7 == null) {
                storyDetailsView.m84537CP(c32123ta, 5);
            } else if (c28204u7.m141838e() == 1) {
                StoryDetailsView.this.m84537CP(c32123ta, 6);
            } else if (StoryDetailsView.this.f77930U0.m141838e() == 0) {
                StoryDetailsView.this.m84537CP(c32123ta, 5);
            }
        }

        @Override // com.zing.zalo.uicontrol.BaseStoryItemView.InterfaceC16456f
        /* renamed from: c */
        public void mo84768c(C32123ta c32123ta) {
            if (StoryDetailsView.this.f77908D1 != null) {
                StoryDetailsView.this.f77908D1.m95993r0(c32123ta);
            }
        }

        @Override // com.zing.zalo.uicontrol.BaseStoryItemView.InterfaceC16456f
        /* renamed from: d */
        public void mo84769d() {
            StoryDetailsView.this.m84705rP();
        }

        @Override // com.zing.zalo.uicontrol.BaseStoryItemView.InterfaceC16456f
        /* renamed from: e */
        public void mo84770e() {
            StoryDetailsView.this.m84529AN(1);
        }

        @Override // com.zing.zalo.uicontrol.BaseStoryItemView.InterfaceC16456f
        /* renamed from: f */
        public void mo84771f(String str, int i11, int i12, int i13) {
            C17487o0 mo35579p;
            if (StoryDetailsView.this.f77910F1) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_STORY_ID", str);
            bundle.putInt("EXTRA_CURRENT_VIEWER_COUNT", i11);
            bundle.putInt("EXTRA_CURRENT_REACTION_COUNT", i12);
            bundle.putInt("EXTRA_SOURCE_FROM", i13);
            if (StoryDetailsView.this.m92676n2() != null && (mo35579p = StoryDetailsView.this.m92676n2().mo35579p()) != null) {
                mo35579p.m93066i2(StoryViewerAndReactionBottomSheet.class, bundle, 1027, 0, true);
            }
        }

        @Override // com.zing.zalo.uicontrol.BaseStoryItemView.InterfaceC16456f
        /* renamed from: g */
        public boolean mo84772g() {
            if (StoryDetailsView.this.m84720zN()) {
                StoryDetailsView.this.m84711uP(true);
                return true;
            }
            return false;
        }

        @Override // com.zing.zalo.uicontrol.BaseStoryItemView.InterfaceC16456f
        /* renamed from: h */
        public void mo84773h(String str, int i11, int i12, int i13, String str2, View.OnClickListener onClickListener) {
            StoryDetailsView.this.m84549GP(str, i12, i13, str2, onClickListener, Integer.MAX_VALUE);
        }

        @Override // com.zing.zalo.uicontrol.BaseStoryItemView.InterfaceC16456f
        /* renamed from: i */
        public void mo84774i(BaseStoryItemView baseStoryItemView, int i11) {
        }

        @Override // com.zing.zalo.uicontrol.BaseStoryItemView.InterfaceC16456f
        /* renamed from: j */
        public void mo84775j(C32123ta c32123ta) {
            StoryDetailsView.this.m84537CP(c32123ta, 5);
        }

        @Override // com.zing.zalo.uicontrol.BaseStoryItemView.InterfaceC16456f
        /* renamed from: k */
        public void mo84776k(int i11) {
            if (i11 == 1007) {
                StoryDetailsView.this.m84704qP();
            } else {
                StoryDetailsView.this.f72421L0.showDialog(i11);
            }
            StoryDetailsView.this.m84690ZN();
        }

        @Override // com.zing.zalo.uicontrol.BaseStoryItemView.InterfaceC16456f
        /* renamed from: l */
        public void mo84777l(C32123ta c32123ta) {
            if (c32123ta != null) {
                C22052u.m115085y().m115094Y(c32123ta.f148138h);
            }
        }

        @Override // com.zing.zalo.uicontrol.BaseStoryItemView.InterfaceC16456f
        /* renamed from: m */
        public void mo84778m() {
            StoryDetailsView.this.m84693cO();
        }

        @Override // com.zing.zalo.uicontrol.BaseStoryItemView.InterfaceC16456f
        /* renamed from: n */
        public void mo84779n(String str, String str2, C31877d c31877d) {
            StoryDetailsView.this.m84690ZN();
            AbstractC28207v1.m141989h3(str, 4, StoryDetailsView.this.f72421L0.m92676n2(), StoryDetailsView.this, str2, new AbstractC28207v1.h0() { // from class: com.zing.zalo.ui.zviews.no0
                public /* synthetic */ no0() {
                }

                @Override // vg.AbstractC28207v1.h0, p483rh.InterfaceC25792a.c
                /* renamed from: a */
                public final void mo39930a(String str3, String str4) {
                    StoryDetailsView.C15117r.this.m84752P(str3, str4);
                }
            }, "", new b(), c31877d);
        }

        @Override // com.zing.zalo.uicontrol.BaseStoryItemView.InterfaceC16456f
        /* renamed from: o */
        public boolean mo84780o() {
            return StoryDetailsView.this.f77940Z0;
        }

        @Override // com.zing.zalo.uicontrol.BaseStoryItemView.InterfaceC16456f
        /* renamed from: p */
        public void mo84781p(String str, String str2, String str3) {
            if (StoryDetailsView.this.f77908D1 != null) {
                StoryDetailsView.this.f77908D1.m95980e0(str, str2, str3);
            }
        }

        @Override // com.zing.zalo.uicontrol.BaseStoryItemView.InterfaceC16456f
        /* renamed from: q */
        public boolean mo84782q() {
            Animator animator;
            StoryDetailsView storyDetailsView = StoryDetailsView.this;
            if (!storyDetailsView.f77938Y0 && !storyDetailsView.mo60294yp() && ((animator = StoryDetailsView.this.f77952j1) == null || !animator.isStarted())) {
                return true;
            }
            return false;
        }

        @Override // com.zing.zalo.uicontrol.BaseStoryItemView.InterfaceC16456f
        /* renamed from: r */
        public void mo84783r() {
            if (StoryDetailsView.this.f77908D1 != null) {
                StoryDetailsView.this.f77908D1.m95986k0();
            }
        }

        @Override // com.zing.zalo.uicontrol.BaseStoryItemView.InterfaceC16456f
        /* renamed from: s */
        public void mo84784s(String str) {
            StoryDetailsView.this.m84539DN(str);
        }

        @Override // com.zing.zalo.uicontrol.BaseStoryItemView.InterfaceC16456f
        /* renamed from: t */
        public boolean mo84785t() {
            return StoryDetailsView.this.f77923Q1;
        }

        @Override // com.zing.zalo.uicontrol.BaseStoryItemView.InterfaceC16456f
        /* renamed from: u */
        public void mo84786u(long j11) {
            if (StoryDetailsView.this.f77908D1 != null && j11 > ViewConfiguration.getTapTimeout() + ViewConfiguration.getPressedStateDuration()) {
                StoryDetailsView.this.f77908D1.m95983h0(j11, StoryDetailsView.this.m84683NN());
            }
        }

        @Override // com.zing.zalo.uicontrol.BaseStoryItemView.InterfaceC16456f
        /* renamed from: v */
        public void mo84787v() {
            StoryDetailsView.this.m84690ZN();
        }

        @Override // com.zing.zalo.uicontrol.BaseStoryItemView.InterfaceC16456f
        /* renamed from: w */
        public boolean mo84788w(String str, boolean z11, boolean z12) {
            if (StoryDetailsView.this.f77908D1 != null) {
                return StoryDetailsView.this.f77908D1.m95976M0(StoryDetailsView.this.m84683NN(), str, z11, z12);
            }
            return false;
        }

        @Override // com.zing.zalo.uicontrol.BaseStoryItemView.InterfaceC16456f
        /* renamed from: x */
        public boolean mo84789x(boolean z11) {
            return StoryDetailsView.this.m84709tP(z11);
        }

        @Override // com.zing.zalo.uicontrol.BaseStoryItemView.InterfaceC16456f
        /* renamed from: y */
        public void mo84790y(boolean z11) {
            StoryDetailsView.this.f77926S0.setCanInterceptTouch(!z11);
        }

        @Override // com.zing.zalo.adapters.C7286z8.c
        /* renamed from: z */
        public void mo37070z() {
            BaseStoryItemView baseStoryItemView;
            StoryDetailsView storyDetailsView = StoryDetailsView.this;
            storyDetailsView.f77954l1 = true;
            int currentItem = storyDetailsView.f77928T0.getCurrentItem();
            if (currentItem < StoryDetailsView.this.f77951i1.size() && ((C31980jc) StoryDetailsView.this.f77951i1.get(currentItem)).f147031x.size() > 0) {
                StoryDetailsView.this.m84661vO();
                StoryDetailsView.this.m84717xP();
                ViewPager.InterfaceC6875j interfaceC6875j = StoryDetailsView.this.f77934W0;
                if (interfaceC6875j != null) {
                    interfaceC6875j.onPageSelected(currentItem);
                }
            }
            C7286z8 c7286z8 = StoryDetailsView.this.f77932V0;
            if (c7286z8 != null && c7286z8.f39936x.size() > 0) {
                baseStoryItemView = (BaseStoryItemView) StoryDetailsView.this.f77932V0.f39936x.get(currentItem);
            } else {
                baseStoryItemView = null;
            }
            if (baseStoryItemView != null) {
                if (!StoryDetailsView.this.f77951i1.isEmpty()) {
                }
                StoryDetailsView.this.f77924R0.setBackgroundColor(0);
                baseStoryItemView.setVisibility(4);
                StoryDetailsView.this.f77938Y0 = true;
                baseStoryItemView.post(new a(baseStoryItemView));
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.StoryDetailsView$s */
    /* loaded from: classes6.dex */
    public class C15118s extends AbstractC22055v0.l {

        /* renamed from: com.zing.zalo.ui.zviews.StoryDetailsView$s$a */
        /* loaded from: classes6.dex */
        class a implements C22033k0.i {

            /* renamed from: a */
            final /* synthetic */ AbstractC22055v0.n f78015a;

            /* renamed from: b */
            final /* synthetic */ C31980jc f78016b;

            /* renamed from: c */
            final /* synthetic */ int f78017c;

            a(AbstractC22055v0.n nVar, C31980jc c31980jc, int i11) {
                this.f78015a = nVar;
                this.f78016b = c31980jc;
                this.f78017c = i11;
            }

            @Override // l30.C22033k0.i
            /* renamed from: O */
            public void mo45897O() {
                try {
                    AbstractC22055v0.n nVar = this.f78015a;
                    if (nVar != null) {
                        nVar.mo17230p(this.f78016b, StoryDetailsView.this.f77950h1);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }

            @Override // l30.C22033k0.i
            /* renamed from: a */
            public void mo45898a(String str, C22033k0.g gVar) {
                if (StoryDetailsView.this.m92672lJ() && StoryDetailsView.this.m92687sJ()) {
                    ToastUtils.showMess(str);
                }
                mo45897O();
            }

            @Override // l30.C22033k0.i
            /* renamed from: b */
            public void mo45899b(Bundle bundle, C22033k0.h hVar) {
                if (StoryDetailsView.this.m92672lJ() && StoryDetailsView.this.m92687sJ() && hVar != null) {
                    AbstractC23647d.m123897g("49150053");
                    bundle.putInt("SHOW_WITH_FLAGS", 134217728);
                    bundle.putBoolean("EXTRA_FLAG_EXCLUDE_MY_STORY", true);
                    if (this.f78015a == null) {
                        bundle.putBoolean("EXTRA_FLAG_VIEW_SELECTED_USER_STORY_ONLY", true);
                    }
                    bundle.putInt("srcType", this.f78017c);
                    AbstractC22055v0.m115127Q(hVar, this.f78015a, StoryDetailsView.this.f72421L0.m92676n2(), bundle, 1021);
                }
            }
        }

        C15118s() {
        }

        @Override // l30.AbstractC22055v0.l
        /* renamed from: c */
        public void mo47172c(C31980jc c31980jc, AbstractC22055v0.n nVar, int i11) {
            try {
                C22033k0.m115006h().m115018r(c31980jc, i11, new a(nVar, c31980jc, i11));
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.StoryDetailsView$t */
    /* loaded from: classes6.dex */
    public class C15119t implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ Runnable f78019a;

        C15119t(Runnable runnable) {
            this.f78019a = runnable;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            StoryDetailsView.this.mo49315c4();
            if (c20096c != null && c20096c.m104491c() != -2) {
                StoryDetailsView.this.f77914J1.post(this.f78019a);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            StoryDetailsView.this.mo49315c4();
            StoryDetailsView.this.f77914J1.post(this.f78019a);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.StoryDetailsView$u */
    /* loaded from: classes6.dex */
    class C15120u extends C13306b.c {
        C15120u() {
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: a */
        public boolean mo66900a(C28212v6 c28212v6) {
            if (c28212v6 != null && "tip.story.reshare_story_archive".equals(c28212v6.f131577c)) {
                if (StoryDetailsView.this.f77920P0 == 5 && !AbstractC28025b8.m141450f("tip.story.reshare_story_archive")) {
                    return true;
                }
                return false;
            }
            return super.mo66900a(c28212v6);
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: c */
        public void mo74715c(String str, C28212v6 c28212v6, C25297f c25297f) {
            if (TextUtils.equals(str, "tip.story.story_reaction")) {
                c25297f.m130911Q(AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_privacy_onboard_gotit));
                c25297f.m130920Z(true);
                c25297f.m130912R(EnumC25293b.RECTANGLE);
                c25297f.m130923b0(AbstractC23222t7.f112566j);
            }
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: f */
        public String[] mo66902f() {
            return AbstractC28025b8.f130856m;
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: h */
        public C26209i mo66903h(String str) {
            if (str.equals("tip.story.privacy_setting")) {
                BaseStoryItemView m84681MN = StoryDetailsView.this.m84681MN();
                if (m84681MN instanceof StoryMineItemView) {
                    return new C26209i(((StoryMineItemView) m84681MN).getIconPrivacySetting());
                }
                return null;
            }
            if (str.equals("tip.story.story_reaction")) {
                BaseStoryItemView m84681MN2 = StoryDetailsView.this.m84681MN();
                if (m84681MN2 instanceof StoryFriendItemView) {
                    StoryFriendItemView storyFriendItemView = (StoryFriendItemView) m84681MN2;
                    C26209i c26209i = new C26209i(storyFriendItemView.getReactionBar());
                    c26209i.f124547b = storyFriendItemView.getReactionBarTipRect();
                    return c26209i;
                }
                return null;
            }
            if (str.equals("tip.story.reshare_story_archive")) {
                BaseStoryItemView m84681MN3 = StoryDetailsView.this.m84681MN();
                if (m84681MN3 instanceof StoryMineItemView) {
                    return new C26209i(((StoryMineItemView) m84681MN3).getButtonReShare());
                }
                return null;
            }
            return null;
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: k */
        public void mo74719k(ShowcaseView showcaseView, C28212v6 c28212v6, int i11, boolean z11) {
            super.mo74719k(showcaseView, c28212v6, i11, z11);
            StoryDetailsView.this.m84693cO();
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: l */
        public void mo74720l(TooltipView tooltipView, C28212v6 c28212v6, int i11, boolean z11) {
            super.mo74720l(tooltipView, c28212v6, i11, z11);
            StoryDetailsView.this.m84693cO();
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: m */
        public void mo66905m(ShowcaseView showcaseView, C28212v6 c28212v6) {
            super.mo66905m(showcaseView, c28212v6);
            StoryDetailsView.this.m84690ZN();
        }

        @Override // com.zing.zalo.p077ui.showcase.C13306b.c
        /* renamed from: n */
        public void mo74721n(TooltipView tooltipView, C28212v6 c28212v6) {
            super.mo74721n(tooltipView, c28212v6);
            StoryDetailsView.this.m84690ZN();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.StoryDetailsView$v */
    /* loaded from: classes6.dex */
    public class C15121v extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ boolean f78022p;

        /* renamed from: q */
        final /* synthetic */ BaseStoryItemView f78023q;

        C15121v(boolean z11, BaseStoryItemView baseStoryItemView) {
            this.f78022p = z11;
            this.f78023q = baseStoryItemView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f78022p && !StoryDetailsView.this.m92681pJ()) {
                StoryDetailsView storyDetailsView = StoryDetailsView.this;
                if (animator == storyDetailsView.f77952j1) {
                    storyDetailsView.f77924R0.setBackgroundColor(-16777216);
                }
            }
            if (this.f78022p) {
                this.f78023q.f83125p.setAlpha(1.0f);
            }
            this.f78023q.f83101O.setVisibility(8);
            AbstractC15101b0 abstractC15101b0 = StoryDetailsView.this.f77935W1;
            if (abstractC15101b0 != null) {
                abstractC15101b0.mo17181b(this.f78022p);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            StoryDetailsView.this.f77924R0.setBackgroundColor(0);
            AbstractC15101b0 abstractC15101b0 = StoryDetailsView.this.f77935W1;
            if (abstractC15101b0 != null) {
                abstractC15101b0.mo17182c(this.f78022p);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.StoryDetailsView$w */
    /* loaded from: classes6.dex */
    class C15122w implements KeyboardFrameLayout.InterfaceC13508a {
        C15122w() {
        }

        @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
        /* renamed from: y1 */
        public void mo37136y1(int i11) {
            StoryDetailsView.this.m84591WN(i11);
        }

        @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
        /* renamed from: z3 */
        public void mo37138z3(int i11) {
            StoryDetailsView.this.m84594XN(i11);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.StoryDetailsView$x */
    /* loaded from: classes6.dex */
    class C15123x implements C7286z8.b {
        C15123x() {
        }

        @Override // com.zing.zalo.adapters.C7286z8.b
        /* renamed from: a */
        public void mo37067a(BaseStoryItemView baseStoryItemView, C32123ta c32123ta) {
            baseStoryItemView.mo87710r(c32123ta);
            StoryDetailsView.this.m84698iP(c32123ta);
        }

        @Override // com.zing.zalo.adapters.C7286z8.b
        /* renamed from: b */
        public void mo37068b(BaseStoryItemView baseStoryItemView, C31980jc c31980jc) {
            baseStoryItemView.mo87709q(c31980jc);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.StoryDetailsView$y */
    /* loaded from: classes6.dex */
    class C15124y implements C7286z8.d {
        C15124y() {
        }

        @Override // com.zing.zalo.adapters.C7286z8.d
        /* renamed from: a */
        public void mo37071a(C32123ta c32123ta, BaseStoryItemView baseStoryItemView) {
            StoryDetailsView.this.m84691aO(c32123ta, baseStoryItemView);
        }

        @Override // com.zing.zalo.adapters.C7286z8.d
        public void onStop() {
            StoryDetailsView.this.m84695eO();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.StoryDetailsView$z */
    /* loaded from: classes6.dex */
    public class C15125z extends ViewPager.C6879n {

        /* renamed from: p */
        private int f78028p = 0;

        C15125z() {
        }

        /* renamed from: b */
        public /* synthetic */ void m84794b() {
            StoryDetailsView.this.m84542EN("tip.story.story_reaction");
            StoryDetailsView.this.m84542EN("tip.story.reshare_story_archive");
        }

        @Override // com.zing.p058v4.view.ViewPager.C6879n, com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrollStateChanged(int i11) {
            boolean z11;
            BaseStoryItemView m84681MN;
            if (i11 != 0 && this.f78028p == 0 && (m84681MN = StoryDetailsView.this.m84681MN()) != null) {
                m84681MN.m87701Z(false, true);
            }
            this.f78028p = i11;
            StoryDetailsView storyDetailsView = StoryDetailsView.this;
            if (i11 != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            storyDetailsView.f77940Z0 = z11;
            if (i11 == 1) {
                storyDetailsView.f77947e1 = storyDetailsView.f77945c1;
            }
            if (i11 == 0) {
                int currentItem = storyDetailsView.f77928T0.getCurrentItem();
                StoryDetailsView storyDetailsView2 = StoryDetailsView.this;
                if (storyDetailsView2.f77945c1 == currentItem) {
                    storyDetailsView2.m84693cO();
                }
                StoryDetailsView storyDetailsView3 = StoryDetailsView.this;
                storyDetailsView3.f77945c1 = -1;
                int i12 = storyDetailsView3.f77947e1;
                if (i12 > -1) {
                    if (currentItem > i12) {
                        AbstractC23647d.m123906p("49153091");
                        if (StoryDetailsView.this.f77908D1 != null) {
                            StoryDetailsView.this.f77908D1.m95985j0();
                        }
                    } else {
                        AbstractC23647d.m123906p("49153090");
                        if (StoryDetailsView.this.f77908D1 != null) {
                            StoryDetailsView.this.f77908D1.m95984i0();
                        }
                    }
                    StoryDetailsView storyDetailsView4 = StoryDetailsView.this;
                    C31980jc c31980jc = (C31980jc) storyDetailsView4.f77951i1.get(storyDetailsView4.f77947e1);
                    if (c31980jc != null) {
                        ZMediaPlayer.closeUserStory(ZMediaPlayerSettings.getVideoConfig(2), c31980jc.f147023p);
                    }
                    AbstractC23647d.m123893c();
                }
                StoryDetailsView storyDetailsView5 = StoryDetailsView.this;
                storyDetailsView5.f77947e1 = -1;
                if (storyDetailsView5.f77962t1 && currentItem <= storyDetailsView5.f77965w1) {
                    Iterator it = storyDetailsView5.f77963u1.iterator();
                    boolean z12 = false;
                    while (it.hasNext()) {
                        C31980jc c31980jc2 = (C31980jc) it.next();
                        if (c31980jc2 != null && c31980jc2.f147031x != null) {
                            for (int i13 = 0; i13 < c31980jc2.f147031x.size(); i13++) {
                                if (!((C32123ta) c31980jc2.f147031x.get(i13)).f148152r) {
                                    break;
                                }
                            }
                        }
                        int lastIndexOf = StoryDetailsView.this.f77951i1.lastIndexOf(c31980jc2);
                        if (lastIndexOf > StoryDetailsView.this.f77965w1 && lastIndexOf > currentItem) {
                            it.remove();
                            StoryDetailsView.this.f77951i1.remove(lastIndexOf);
                            z12 = true;
                        }
                    }
                    if (z12) {
                        StoryDetailsView storyDetailsView6 = StoryDetailsView.this;
                        storyDetailsView6.f77932V0.m37059A(storyDetailsView6.f77951i1);
                    }
                }
                StoryDetailsView.this.m84671BN();
            }
        }

        @Override // com.zing.p058v4.view.ViewPager.C6879n, com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrolled(int i11, float f11, int i12) {
            super.onPageScrolled(i11, f11, i12);
            if (f11 > 0.0f) {
                int currentItem = StoryDetailsView.this.f77928T0.getCurrentItem();
                C31980jc m84684PN = StoryDetailsView.this.m84684PN(currentItem - 1);
                C31980jc m84684PN2 = StoryDetailsView.this.m84684PN(currentItem + 1);
                if (m84684PN != null && m84684PN.f147029v == 2) {
                    AbstractC22055v0.m115166z(m84684PN.m153825r(), 40);
                }
                if (m84684PN2 != null && m84684PN2.f147029v == 2) {
                    AbstractC22055v0.m115166z(m84684PN2.m153825r(), 40);
                }
            }
        }

        @Override // com.zing.p058v4.view.ViewPager.C6879n, com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageSelected(int i11) {
            try {
                StoryDetailsView.this.m84680KP();
                int i12 = 0;
                while (true) {
                    boolean z11 = true;
                    if (i12 >= StoryDetailsView.this.f77932V0.f39936x.size()) {
                        break;
                    }
                    int keyAt = StoryDetailsView.this.f77932V0.f39936x.keyAt(i12);
                    BaseStoryItemView baseStoryItemView = (BaseStoryItemView) StoryDetailsView.this.f77932V0.f39936x.get(keyAt);
                    if (baseStoryItemView != null) {
                        if (keyAt != i11) {
                            z11 = false;
                        }
                        baseStoryItemView.m87688M(z11);
                    }
                    i12++;
                }
                BaseStoryItemView baseStoryItemView2 = (BaseStoryItemView) StoryDetailsView.this.f77932V0.f39936x.get(i11);
                if (!StoryDetailsView.this.f77951i1.isEmpty()) {
                    C31980jc c31980jc = (C31980jc) StoryDetailsView.this.f77951i1.get(i11);
                    AbstractC15101b0 abstractC15101b0 = StoryDetailsView.this.f77935W1;
                    if (abstractC15101b0 != null) {
                        abstractC15101b0.mo17197e(c31980jc);
                    }
                    if (c31980jc.f147031x.size() > 0) {
                        if (c31980jc.m153825r() == null) {
                            c31980jc.f147017B = 0;
                        }
                        StoryDetailsView.this.m84661vO();
                        if (baseStoryItemView2 != null && c31980jc.m153825r() != null) {
                            StoryDetailsView.this.m84695eO();
                            if (StoryDetailsView.this.m84720zN()) {
                                StoryDetailsView.this.m84691aO(c31980jc.m153825r(), baseStoryItemView2);
                                StoryDetailsView.this.m84717xP();
                                StoryDetailsView.this.m84706sN(c31980jc);
                            }
                        }
                    }
                    StoryDetailsView.this.mo78955kl(new Runnable() { // from class: com.zing.zalo.ui.zviews.qo0
                        public /* synthetic */ qo0() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            StoryDetailsView.C15125z.this.m84794b();
                        }
                    }, 250L);
                }
                if (baseStoryItemView2 != null) {
                    baseStoryItemView2.m87701Z(false, true);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: AN */
    public void m84529AN(int i11) {
        PrivacyInfo privacyInfo;
        C31980jc c31980jc = (C31980jc) this.f77951i1.get(this.f77928T0.getCurrentItem());
        if (c31980jc != null) {
            C32123ta m153825r = c31980jc.m153825r();
            if (m153825r != null) {
                privacyInfo = m153825r.f148149o;
            } else {
                privacyInfo = null;
            }
            if (privacyInfo != null) {
                if (privacyInfo.m45153y()) {
                    String str = m153825r.f148138h;
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new C15103d(privacyInfo, str, i11));
                    mo46829Y();
                    this.f77936X0.m141782j();
                    c0766k.mo1673k6(str);
                    return;
                }
                m84648pP(privacyInfo, i11);
            }
        }
    }

    /* renamed from: AO */
    public /* synthetic */ void m84530AO() {
        try {
            if (m92672lJ()) {
                this.f77942a1 = false;
                for (int i11 = 0; i11 < this.f77928T0.getChildCount(); i11++) {
                    View childAt = this.f77928T0.getChildAt(i11);
                    if (childAt instanceof StoryFriendItemView) {
                        ((StoryFriendItemView) childAt).m88093q0();
                    } else if (childAt instanceof StoryAdsItemView) {
                        ((StoryAdsItemView) childAt).m88075z0();
                    }
                }
                this.f77926S0.setCanInterceptTouch(true);
                if (m92672lJ()) {
                    m84715wP();
                    m84566LP(true);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: BO */
    public /* synthetic */ void m84532BO() {
        try {
            if (m92672lJ()) {
                this.f77942a1 = true;
                this.f77926S0.setCanInterceptTouch(false);
                m84690ZN();
                BaseStoryItemView m84681MN = m84681MN();
                if (m84681MN instanceof StoryFriendItemView) {
                    ((StoryFriendItemView) m84681MN).m88094r0();
                } else if (m84681MN instanceof StoryAdsItemView) {
                    ((StoryAdsItemView) m84681MN).m88071A0();
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: BP */
    private void m84533BP() {
        m84560JP();
        m84682MP();
    }

    /* renamed from: CN */
    private void m84535CN() {
        C32123ta m153825r;
        C31980jc m84683NN = m84683NN();
        if (m84683NN != null && m84683NN.f147029v == 2 && (m153825r = m84683NN.m153825r()) != null && m153825r.f148131d0.equals("action.follow.oa")) {
            m84661vO();
        }
    }

    /* renamed from: CO */
    public /* synthetic */ void m84536CO(View view) {
        try {
            C22033k0.m115006h().m115018r(AbstractC22055v0.m115161u(CoreUtility.f89233i), 362, new C15105f(362));
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: CP */
    public void m84537CP(C32123ta c32123ta, int i11) {
        Handler handler = this.f77914J1;
        if (handler != null) {
            handler.removeMessages(i11);
            Message message = new Message();
            message.what = i11;
            message.obj = c32123ta;
            this.f77914J1.sendMessageDelayed(message, 100L);
        }
    }

    /* renamed from: DN */
    public void m84539DN(String str) {
        C31980jc m84683NN = m84683NN();
        if (m84683NN != null && m84683NN.m153825r() != null && m84683NN.m153825r().f148138h.equals(str)) {
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.vn0
                public /* synthetic */ vn0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    StoryDetailsView.this.m84657tO();
                }
            });
        }
    }

    /* renamed from: DO */
    public /* synthetic */ void m84540DO(CameraInputParams cameraInputParams) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("TRACKING_SOURCE_POST_STORY_KEY", new TrackingSource(7));
        AbstractC22470k.m116168t(m92692wK(), 1029, 2, cameraInputParams, bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054 A[SYNTHETIC] */
    /* renamed from: EN */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m84542EN(String str) {
        ActiveImageColorButton iconPrivacySetting;
        boolean z11;
        int i11 = 0;
        while (true) {
            try {
                String[] strArr = AbstractC28025b8.f130856m;
                if (i11 >= strArr.length) {
                    break;
                }
                String str2 = strArr[i11];
                if (TextUtils.equals(str, "tip.any") || TextUtils.equals(str, str2)) {
                    C28212v6 m141453i = AbstractC28025b8.m141453i(str2);
                    if (str2.hashCode() == 526069901 && str2.equals("tip.story.privacy_setting")) {
                        BaseStoryItemView m84681MN = m84681MN();
                        if (m84681MN instanceof StoryMineItemView) {
                            iconPrivacySetting = ((StoryMineItemView) m84681MN).getIconPrivacySetting();
                            if (iconPrivacySetting != null) {
                                if (m141453i != null && m141453i.m142167f() && m141453i.f131580f) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                iconPrivacySetting.setShowRedDot(z11);
                            }
                        }
                    }
                    iconPrivacySetting = null;
                    if (iconPrivacySetting != null) {
                    }
                }
                i11++;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return;
            }
        }
        C13306b c13306b = this.f77915K1;
        if (c13306b != null) {
            c13306b.m74700f(str, Boolean.TRUE);
        }
    }

    /* renamed from: EO */
    public /* synthetic */ void m84543EO(C18055a.a aVar) {
        m84549GP(aVar.m96002a(), aVar.m96004c(), aVar.m96003b(), null, null, Integer.MAX_VALUE);
        m84715wP();
    }

    /* renamed from: FO */
    public /* synthetic */ void m84545FO(String str) {
        ZaloWebView.m87103hS(m92692wK(), str);
    }

    /* renamed from: FP */
    public boolean m84546FP() {
        C28195t7 c28195t7;
        if (!this.f77907C1 || (c28195t7 = this.f77936X0) == null || c28195t7.m141780f() == null || this.f77936X0.m141780f().f148140i != 2) {
            return false;
        }
        C32123ta m141780f = this.f77936X0.m141780f();
        if (C22640a.f111031a.mo117210a() && !C26361j.f125215a.m135702h(m141780f)) {
            return false;
        }
        return true;
    }

    /* renamed from: GO */
    public /* synthetic */ void m84548GO(C24860q c24860q) {
        C31980jc c31980jc = (C31980jc) c24860q.m129215c();
        c31980jc.m153822n(((C32123ta) c24860q.m129216d()).f148138h);
        if (c31980jc.f147031x.isEmpty()) {
            m84678HN(c31980jc, false);
        }
    }

    /* renamed from: GP */
    public void m84549GP(String str, int i11, int i12, String str2, View.OnClickListener onClickListener, int i13) {
        Drawable drawable;
        try {
            if (m84643oO()) {
                return;
            }
            BaseStoryItemView baseStoryItemView = (BaseStoryItemView) this.f77932V0.f39936x.get(this.f77928T0.getCurrentItem());
            if (i11 != 0) {
                if (i12 != 0) {
                    drawable = C27280g.m139659b(baseStoryItemView.getContext(), i11, i12);
                } else {
                    drawable = C27280g.m139658a(baseStoryItemView.getContext(), i11);
                }
            } else {
                drawable = null;
            }
            Snackbar m90634w = Snackbar.m90634w(baseStoryItemView, str, i13);
            m90634w.m90644J(drawable);
            if (!TextUtils.isEmpty(str2)) {
                m90634w.m90636A(str2, new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.mn0

                    /* renamed from: p */
                    public final /* synthetic */ View.OnClickListener f81167p;

                    public /* synthetic */ mn0(View.OnClickListener onClickListener2) {
                        r1 = onClickListener2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        StoryDetailsView.m84612fP(r1, view);
                    }
                });
            }
            m90634w.m90645K(AbstractC23222t7.f112559f0);
            m90634w.m90659r().setTag(AbstractC6918a0.story_snack_bar_tag_key, Long.valueOf(System.currentTimeMillis()));
            m90634w.m90640F(new C15108i());
            m84625jO();
            m90634w.m90648N();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: HO */
    public /* synthetic */ void m84551HO(C24848g0 c24848g0) {
        m84690ZN();
    }

    /* renamed from: HP */
    public void m84552HP(C23929b.h hVar) {
        String str;
        int currentItem = this.f77928T0.getCurrentItem();
        C32123ta m153825r = ((C31980jc) this.f77951i1.get(currentItem)).m153825r();
        if (((BaseStoryItemView) this.f77932V0.f39936x.get(currentItem)) != null && m153825r != null && (str = m153825r.f148138h) != null && str.equals(hVar.m125158e())) {
            m84549GP(hVar.m125155b(), hVar.m125156c(), C23212s8.m119610r(AbstractC2807a.icon_02), hVar.m125154a(), new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.tn0

                /* renamed from: q */
                public final /* synthetic */ C23929b.h f82221q;

                public /* synthetic */ tn0(C23929b.h hVar2) {
                    r2 = hVar2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StoryDetailsView.this.m84616gP(r2, view);
                }
            }, Integer.MAX_VALUE);
        }
    }

    /* renamed from: IN */
    private void m84554IN(boolean z11) {
        C32123ta c32123ta;
        C31980jc m84683NN = m84683NN();
        BaseStoryItemView m84681MN = m84681MN();
        if (m84681MN != null) {
            c32123ta = m84681MN.getLastBindStoryItem();
        } else {
            c32123ta = null;
        }
        C18055a c18055a = this.f77908D1;
        if (c18055a != null) {
            c18055a.m95991p0(c32123ta, m84683NN, z11);
        }
    }

    /* renamed from: IO */
    public /* synthetic */ void m84555IO(C24848g0 c24848g0) {
        m84715wP();
    }

    /* renamed from: IP */
    private void m84556IP(long j11) {
        try {
            if (this.f77913I1 == null) {
                View inflate = LayoutInflater.from(getContext()).inflate(AbstractC7409c0.story_download_loading_popup, (ViewGroup) null, false);
                this.f77913I1 = inflate;
                View findViewById = inflate.findViewById(AbstractC6918a0.btn_cancel);
                if (findViewById != null) {
                    findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.kn0
                        public /* synthetic */ kn0() {
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            StoryDetailsView.this.m84619hP(view);
                        }
                    });
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 17;
                ((KeyboardFrameLayout) this.f77924R0).addView(this.f77913I1, layoutParams);
            }
            RobotoTextView robotoTextView = (RobotoTextView) this.f77913I1.findViewById(AbstractC6918a0.dialog_title);
            if (robotoTextView != null) {
                robotoTextView.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_story_reshare_downloading, Long.valueOf(j11)));
            }
            ProgressBar progressBar = (ProgressBar) this.f77913I1.findViewById(AbstractC6918a0.progress_story_download_popup);
            if (progressBar != null) {
                progressBar.m90611e((float) j11, true);
            }
            AbstractC23136l9.m118744r1(this.f77913I1, 0);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: JN */
    private void m84558JN(C32123ta c32123ta) {
        try {
            C18055a c18055a = this.f77908D1;
            if (c18055a != null) {
                c18055a.m95975L0(c32123ta);
            }
            if (this.f77920P0 == 5) {
                C0815e1.m2075D().m2100V(new C23648e(29, "", 0, "archive_story_download", new String[0]), false);
            }
            m84715wP();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: JO */
    public /* synthetic */ void m84559JO(Boolean bool) {
        if (bool.booleanValue()) {
            this.f77914J1.sendEmptyMessage(2);
        } else {
            this.f77914J1.sendEmptyMessage(3);
        }
    }

    /* renamed from: JP */
    private void m84560JP() {
        for (C31980jc c31980jc : this.f77951i1) {
            C32123ta m153825r = c31980jc.m153825r();
            ArrayList arrayList = c31980jc.f147031x;
            if (arrayList != null && !arrayList.isEmpty()) {
                AbstractC22055v0.m115138a0(c31980jc.f147031x, !this.f77958p1);
            }
            if (m153825r != null && c31980jc.f147031x != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= c31980jc.f147031x.size()) {
                        break;
                    }
                    if (TextUtils.equals(m153825r.f148138h, ((C32123ta) c31980jc.f147031x.get(i11)).f148138h)) {
                        c31980jc.f147017B = i11;
                        break;
                    }
                    i11++;
                }
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.zing.zalo.ui.zviews.qn0.<init>(float, float, float, float, android.view.View, i40.d):void, class status: GENERATED_AND_UNLOADED
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
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: LN */
    public android.animation.Animator m84564LN(com.zing.zalo.uicontrol.BaseStoryItemView r24, boolean r25, android.animation.Animator.AnimatorListener r26) {
        /*
            Method dump skipped, instructions count: 888
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.p077ui.zviews.StoryDetailsView.m84564LN(com.zing.zalo.uicontrol.BaseStoryItemView, boolean, android.animation.Animator$AnimatorListener):android.animation.Animator");
    }

    /* renamed from: LO */
    public /* synthetic */ void m84565LO(String str) {
        try {
            if (m92672lJ()) {
                m84566LP(false);
                Bundle bundle = new Bundle();
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add(str);
                bundle.putStringArrayList("path", arrayList);
                bundle.putBoolean("fromShareVia", true);
                bundle.putString("extra_tracking_source", new TrackingSource(25).m40686z());
                InterfaceC27218a m92692wK = m92692wK();
                if (m92692wK.mo35579p() != null) {
                    m92692wK.mo35579p().m93069k2(UpdateStatusView.class, bundle, 1, true);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: LP */
    public void m84566LP(boolean z11) {
        if (!m92692wK().mo35576n3()) {
            AbstractC23136l9.m118686X0(m92692wK().getWindow(), z11);
        }
    }

    /* renamed from: MO */
    public /* synthetic */ void m84568MO(C24848g0 c24848g0) {
        try {
            if (m92672lJ()) {
                ToastUtils.m89266n(AbstractC8020f0.str_story_post_on_timeline_failed, new Object[0]);
                m84715wP();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: NO */
    public /* synthetic */ void m84570NO(C18055a.b bVar) {
        if (bVar.m96006b()) {
            m84556IP(bVar.m96005a());
            m84690ZN();
        } else {
            m84629kO();
            m84715wP();
        }
    }

    /* renamed from: ON */
    public long m84572ON(Snackbar snackbar) {
        if (snackbar != null) {
            try {
                if (snackbar.m90659r().getTag(AbstractC6918a0.story_snack_bar_tag_key) instanceof Long) {
                    return ((Long) snackbar.m90659r().getTag(AbstractC6918a0.story_snack_bar_tag_key)).longValue();
                }
                return -1L;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return -1L;
            }
        }
        return -1L;
    }

    /* renamed from: OO */
    public /* synthetic */ void m84573OO(InterfaceC17463d interfaceC17463d) {
        m84715wP();
    }

    /* renamed from: PO */
    public /* synthetic */ void m84575PO(InterfaceC17463d interfaceC17463d, int i11) {
        try {
            int mo92862f = interfaceC17463d.mo92862f();
            if (mo92862f != 1001) {
                if (mo92862f == 1005) {
                    if (i11 == -1) {
                        interfaceC17463d.dismiss();
                        m84708tN();
                    } else if (i11 == -2) {
                        interfaceC17463d.cancel();
                    }
                }
            } else if (i11 == -1) {
                interfaceC17463d.dismiss();
                m84676FN();
            } else if (i11 == -2) {
                interfaceC17463d.cancel();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: QO */
    public /* synthetic */ C24848g0 m84577QO(C23929b.b bVar) {
        if (bVar instanceof C23929b.f) {
            C23929b.f fVar = (C23929b.f) bVar;
            m84644oP(fVar.m125150b(), fVar.m125149a());
            return null;
        }
        if (bVar instanceof C23929b.c) {
            mo78936E(((C23929b.c) bVar).m125128a());
            return null;
        }
        return null;
    }

    /* renamed from: RO */
    public /* synthetic */ void m84579RO(C19964c c19964c) {
        String str;
        C23929b.i iVar = (C23929b.i) c19964c.m103749a();
        if (iVar instanceof C23929b.g) {
            if (m84683NN() != null && m84683NN().m153825r() != null) {
                str = m84683NN().m153825r().f148138h;
            } else {
                str = "";
            }
            C23929b.h m125152a = ((C23929b.g) iVar).m125152a();
            if (!TextUtils.isEmpty(str) && str.equals(m125152a.m125158e())) {
                Message message = new Message();
                message.what = 8;
                message.obj = m125152a;
                this.f77914J1.removeMessages(8);
                this.f77914J1.sendMessageDelayed(message, 600L);
            }
        }
    }

    /* renamed from: SO */
    public /* synthetic */ void m84581SO() {
        if (m84720zN()) {
            m84711uP(true);
        }
    }

    /* renamed from: TN */
    private void m84583TN() {
        C28195t7 c28195t7 = this.f77936X0;
        if (c28195t7 != null && c28195t7.m141780f() != null && this.f77936X0.m141781g() != null && C26361j.f125215a.m135699e(this.f77936X0.m141780f()) && !C22640a.f111031a.m117213d()) {
            m84586UN(this.f77936X0.m141780f(), this.f77936X0.m141781g(), true);
        }
    }

    /* renamed from: TO */
    public /* synthetic */ void m84584TO() {
        C7286z8 c7286z8 = this.f77932V0;
        if (c7286z8 != null) {
            c7286z8.m37059A(this.f77951i1);
        }
        StoryViewPager storyViewPager = this.f77928T0;
        if (storyViewPager != null) {
            storyViewPager.setCurrentItem(this.f77946d1, false);
            this.f77928T0.setFirstOpenedPage(this.f77946d1);
            this.f77928T0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.wn0
                public /* synthetic */ wn0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    StoryDetailsView.this.m84581SO();
                }
            });
        }
    }

    /* renamed from: UN */
    private void m84586UN(C32123ta c32123ta, BaseStoryItemView baseStoryItemView, boolean z11) {
        C28195t7 c28195t7;
        String str;
        if (c32123ta != null && (c28195t7 = this.f77936X0) != null && c28195t7.m141780f() != null && this.f77936X0.m141780f().f148138h.equals(c32123ta.f148138h)) {
            if (this.f77907C1 && C26361j.f125215a.m135702h(c32123ta)) {
                m84701nP(c32123ta.f148138h, z11);
                C23744a.m124114c().m124116d(6040, new Object[0]);
                return;
            }
            if (c32123ta.f148140i == 2) {
                C22640a c22640a = C22640a.f111031a;
                c22640a.mo117211b(!c22640a.mo117210a());
                baseStoryItemView.m87704c0(c22640a.mo117210a());
                this.f77936X0.m141788p(!c22640a.mo117210a());
                if (this.f77967y1 != null) {
                    this.f77906B1.m125114L0(c22640a.mo117210a());
                }
                C23648e m154346U = C32017m4.m154326S().m154346U(C32002l4.m154264g(IMediaPlayer.MEDIA_INFO_VIDEO_SEEK_RENDERING_START).m154284u(78));
                String str2 = "1";
                if (!c22640a.mo117210a()) {
                    str = "1";
                } else {
                    str = "0";
                }
                if (!z11) {
                    str2 = "2";
                }
                if (m154346U != null) {
                    m154346U.m123919l()[0] = str;
                    m154346U.m123919l()[1] = str2;
                }
                C0815e1.m2075D().m2100V(m154346U, false);
                C23744a.m124114c().m124116d(6040, new Object[0]);
            }
        }
    }

    /* renamed from: UO */
    public /* synthetic */ void m84587UO(List list) {
        try {
            if (this.f77920P0 == 5) {
                C31980jc c31980jc = (C31980jc) this.f77951i1.get(this.f77928T0.getCurrentItem());
                String str = "";
                if (c31980jc != null && c31980jc.m153825r() != null) {
                    str = c31980jc.m153825r().f148138h;
                }
                m84679KN();
                int i11 = 0;
                while (true) {
                    if (i11 < this.f77951i1.size()) {
                        C31980jc c31980jc2 = (C31980jc) this.f77951i1.get(i11);
                        if (c31980jc2 != null && c31980jc2.m153821k(str)) {
                            this.f77946d1 = i11;
                            break;
                        }
                        i11++;
                    } else {
                        break;
                    }
                }
                Iterator it = this.f77951i1.iterator();
                while (it.hasNext()) {
                    ((C31980jc) it.next()).m153812B(str);
                }
                mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.rn0
                    public /* synthetic */ rn0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        StoryDetailsView.this.m84584TO();
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: WN */
    public void m84591WN(int i11) {
        this.f77914J1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.jn0
            public /* synthetic */ jn0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                StoryDetailsView.this.m84530AO();
            }
        });
    }

    /* renamed from: WO */
    public /* synthetic */ void m84592WO(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        m84558JN(this.f77949g1);
    }

    /* renamed from: XN */
    public void m84594XN(int i11) {
        this.f77914J1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.on0
            public /* synthetic */ on0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                StoryDetailsView.this.m84532BO();
            }
        });
    }

    /* renamed from: XO */
    public /* synthetic */ void m84595XO(InterfaceC17463d interfaceC17463d, int i11) {
        this.f72421L0.removeDialog(ZAbstractBase.ZVU_BLEND_PERCENTAGE);
        this.f72421L0.showDialog(ZAbstractBase.ZVU_BLEND_GEN_THUMB);
        AbstractC23647d.m123906p("49153063");
        AbstractC23647d.m123893c();
    }

    /* renamed from: YN */
    public void m84597YN(InterfaceC21910a interfaceC21910a) {
        m84712vN(interfaceC21910a);
    }

    /* renamed from: YO */
    public /* synthetic */ void m84598YO(int i11, String str) {
        C31980jc c31980jc = (C31980jc) this.f77951i1.get(this.f77928T0.getCurrentItem());
        if (c31980jc.m153825r() != null) {
            m84719yP(c31980jc.f147023p, c31980jc.m153825r().f148138h, i11, str);
        }
    }

    /* renamed from: ZO */
    public /* synthetic */ void m84600ZO(C32123ta c32123ta, InterfaceC17463d interfaceC17463d, int i11) {
        this.f72421L0.removeDialog(1004);
        try {
            if (i11 == 0) {
                AbstractC23647d.m123906p("49153062");
                AbstractC23647d.m123893c();
                this.f72421L0.showDialog(1001);
            } else if (i11 == 1) {
                m84558JN(c32123ta);
                m84715wP();
            } else if (i11 == 2) {
                C18055a c18055a = this.f77908D1;
                if (c18055a != null) {
                    c18055a.m95992q0(c32123ta);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: aP */
    public /* synthetic */ void m84602aP(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        C18055a c18055a = this.f77908D1;
        if (c18055a != null) {
            c18055a.m95978O0(m84683NN());
        }
    }

    /* renamed from: bP */
    public /* synthetic */ void m84604bP(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f77926S0.setTranslationY(intValue);
        View view = this.f77924R0;
        if (view != null && view.getHeight() > 0) {
            this.f77924R0.setBackgroundColor(Color.argb(Math.max(255 - ((Math.abs(intValue) * 255) / this.f77924R0.getHeight()), 0), 0, 0, 0));
        }
    }

    /* renamed from: cP */
    public /* synthetic */ void m84606cP() {
        m84542EN("tip.story.privacy_setting");
    }

    /* renamed from: dP */
    public /* synthetic */ void m84608dP(PrivacyInfo privacyInfo, int i11) {
        C17487o0 mo35579p;
        Bundle bundle = new Bundle();
        bundle.putParcelable("EXTRA_INITIAL_PRIVACY_TYPE", privacyInfo);
        if (i11 == 1) {
            bundle.putString("EXTRA_ENTRY_POINT_SOURCE", "story_detail");
        } else if (i11 == 2) {
            bundle.putString("EXTRA_ENTRY_POINT_SOURCE", "story_detail_bottom_sheet");
        }
        if (m92676n2() != null && (mo35579p = m92676n2().mo35579p()) != null) {
            mo35579p.m93066i2(StoryPrivacyBottomSheetView.class, bundle, 1023, 1, true);
        }
    }

    /* renamed from: eP */
    public /* synthetic */ void m84610eP(C31980jc c31980jc, BaseStoryItemView baseStoryItemView) {
        boolean z11 = true;
        if (c31980jc.f147017B >= c31980jc.f147031x.size() - 1) {
            if (this.f77928T0.getCurrentItem() < this.f77932V0.mo35335g() - 1) {
                C18055a c18055a = this.f77908D1;
                if (c18055a != null && baseStoryItemView != null) {
                    c18055a.m95989n0(m84683NN(), baseStoryItemView.getLastBindStoryItem(), baseStoryItemView.getStoryMessageToSend(), true, true);
                }
                StoryViewPager storyViewPager = this.f77928T0;
                storyViewPager.setCurrentItem(storyViewPager.getCurrentItem() + 1, true);
                return;
            }
            if (c31980jc.f147031x.size() == 0) {
                int i11 = this.f77920P0;
                if (i11 != 0 && i11 != 4) {
                    z11 = false;
                }
                this.f77953k1 = z11;
            }
            finish();
            return;
        }
        C18055a c18055a2 = this.f77908D1;
        if (c18055a2 != null && baseStoryItemView != null) {
            c18055a2.m95989n0(m84683NN(), baseStoryItemView.getLastBindStoryItem(), baseStoryItemView.getStoryMessageToSend(), true, true);
        }
        c31980jc.f147017B++;
        m84661vO();
        if (baseStoryItemView != null) {
            m84691aO(c31980jc.m153825r(), baseStoryItemView);
            m84706sN(c31980jc);
        }
    }

    /* renamed from: fP */
    public static /* synthetic */ void m84612fP(View.OnClickListener onClickListener, View view) {
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* renamed from: gO */
    private void m84615gO(Intent intent) {
        m84549GP(AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_reshare_snackbar_success), AbstractC23322a.zds_ic_check_circle_solid_24, AbstractC2808b.gr60, AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_reshare_snackbar_view), new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.nn0
            public /* synthetic */ nn0() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StoryDetailsView.this.m84536CO(view);
            }
        }, Integer.MAX_VALUE);
    }

    /* renamed from: gP */
    public /* synthetic */ void m84616gP(C23929b.h hVar, View view) {
        m84699kb(hVar.m125158e(), hVar.m125157d());
    }

    /* renamed from: hP */
    public /* synthetic */ void m84619hP(View view) {
        C18055a c18055a = this.f77908D1;
        if (c18055a != null) {
            c18055a.m95988m0();
        }
    }

    /* renamed from: iO */
    private void m84622iO(Intent intent) {
        C32123ta m153825r;
        try {
            C7286z8.c cVar = this.f77941Z1;
            if (cVar != null) {
                cVar.mo84790y(false);
                this.f77941Z1.mo84762J(false);
            }
            if (intent != null) {
                String stringExtra = intent.getStringExtra("EXTRA_STORY_ID");
                int currentItem = this.f77928T0.getCurrentItem();
                if (currentItem >= 0 && currentItem < this.f77951i1.size()) {
                    C31980jc c31980jc = (C31980jc) this.f77951i1.get(currentItem);
                    if (c31980jc != null && (m153825r = c31980jc.m153825r()) != null && m153825r.f148138h.equals(stringExtra)) {
                        int intExtra = intent.getIntExtra("EXTRA_TOTAL_VIEWER_COUNT", m153825r.f148142j);
                        int intExtra2 = intent.getIntExtra("EXTRA_TOTAL_REACTION_COUNT", m153825r.f148113P);
                        m153825r.f148142j = intExtra;
                        m153825r.f148113P = intExtra2;
                        BaseStoryItemView m84681MN = m84681MN();
                        if (m84681MN instanceof StoryMineItemView) {
                            ((StoryMineItemView) m84681MN).m88124F0(intExtra, intExtra2);
                        }
                    }
                    if (intent.getBooleanExtra("EXTRA_NEED_RE_SORT_STORY", false)) {
                        m84533BP();
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: jO */
    private void m84625jO() {
        Snackbar snackbar = this.f77912H1;
        if (snackbar != null && snackbar.m90661t()) {
            this.f77912H1.m90655n();
            this.f77912H1 = null;
        }
        this.f77914J1.removeMessages(8);
    }

    /* renamed from: jP */
    public void m84626jP() {
        C31980jc m84683NN = m84683NN();
        boolean z11 = false;
        if (C19172a.m100600k("social@story@story_ads@enable", 0) == 1 && C22018d.m114948i(this.f77922Q0)) {
            z11 = true;
        }
        if (m84683NN != null) {
            C25482o.f122075a.m132014v(m84683NN.f147023p, z11);
        }
    }

    /* renamed from: kO */
    private void m84629kO() {
        AbstractC23136l9.m118744r1(this.f77913I1, 8);
        this.f77913I1 = null;
    }

    /* renamed from: kP */
    private void m84630kP() {
        this.f77906B1.m125117k0().m9219j(this, new C19965d(new InterfaceC18505l() { // from class: com.zing.zalo.ui.zviews.yn0
            public /* synthetic */ yn0() {
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public final Object mo205i9(Object obj) {
                C24848g0 m84577QO;
                m84577QO = StoryDetailsView.this.m84577QO((C23929b.b) obj);
                return m84577QO;
            }
        }));
    }

    /* renamed from: lO */
    private void m84633lO() {
        C18055a c18055a = (C18055a) new C1802w0(this, new C18061g(this, null)).m9378a(C18055a.class);
        this.f77908D1 = c18055a;
        c18055a.m95969C0().m9219j(this, new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.um0
            public /* synthetic */ um0() {
            }

            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                StoryDetailsView.this.m84559JO((Boolean) obj);
            }
        });
        this.f77908D1.m95968B0().m9219j(this, new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.xm0
            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                ToastUtils.showMess((String) obj);
            }
        });
        this.f77908D1.m95997v0().m9219j(this, new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.ym0
            public /* synthetic */ ym0() {
            }

            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                StoryDetailsView.this.m84565LO((String) obj);
            }
        });
        this.f77908D1.m95995t0().m9219j(this, new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.zm0
            public /* synthetic */ zm0() {
            }

            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                StoryDetailsView.this.m84568MO((C24848g0) obj);
            }
        });
        this.f77908D1.m96001z0().m9219j(this, new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.an0
            public /* synthetic */ an0() {
            }

            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                StoryDetailsView.this.m84570NO((C18055a.b) obj);
            }
        });
        this.f77908D1.m95996u0().m9219j(this, new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.bn0
            public /* synthetic */ bn0() {
            }

            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                StoryDetailsView.this.m84540DO((CameraInputParams) obj);
            }
        });
        this.f77908D1.m95967A0().m9219j(this, new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.cn0
            public /* synthetic */ cn0() {
            }

            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                StoryDetailsView.this.m84543EO((C18055a.a) obj);
            }
        });
        this.f77908D1.m95998w0().m9219j(this, new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.dn0
            public /* synthetic */ dn0() {
            }

            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                StoryDetailsView.this.m84545FO((String) obj);
            }
        });
        this.f77908D1.m95994s0().m9219j(this, new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.en0
            public /* synthetic */ en0() {
            }

            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                StoryDetailsView.this.m84548GO((C24860q) obj);
            }
        });
        this.f77908D1.m95999x0().m9219j(this, new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.fn0
            public /* synthetic */ fn0() {
            }

            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                StoryDetailsView.this.m84551HO((C24848g0) obj);
            }
        });
        this.f77908D1.m96000y0().m9219j(this, new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.vm0
            public /* synthetic */ vm0() {
            }

            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                StoryDetailsView.this.m84555IO((C24848g0) obj);
            }
        });
    }

    /* renamed from: lP */
    private void m84634lP() {
        this.f77906B1.m125118l0().m9219j(this, new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.om0
            public /* synthetic */ om0() {
            }

            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                StoryDetailsView.this.m84597YN((InterfaceC21910a) obj);
            }
        });
    }

    /* renamed from: mO */
    private void m84637mO() {
        this.f77906B1 = (C23929b) new C1802w0(this, new C23929b.d(this, null)).m9378a(C23929b.class);
        boolean m4226ta = AbstractC0924m0.m4226ta();
        this.f77907C1 = m4226ta;
        if (m4226ta) {
            m84634lP();
            m84630kP();
            m84638mP();
        }
    }

    /* renamed from: mP */
    private void m84638mP() {
        this.f77906B1.m125119m0().m9219j(this, new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.ao0
            public /* synthetic */ ao0() {
            }

            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                StoryDetailsView.this.m84579RO((C19964c) obj);
            }
        });
    }

    /* renamed from: oO */
    private boolean m84643oO() {
        BaseStoryItemView baseStoryItemView = (BaseStoryItemView) this.f77932V0.f39936x.get(this.f77928T0.getCurrentItem());
        if (baseStoryItemView != null && baseStoryItemView.m87685A()) {
            return true;
        }
        return false;
    }

    /* renamed from: oP */
    private void m84644oP(String str, SongInfo songInfo) {
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", 13);
        bundle.putString("extra_song_id", songInfo.m45182d());
        bundle.putString("extra_story_id", str);
        bundle.putParcelable("extra_song_info", songInfo);
        InterfaceC27218a m92692wK = m92692wK();
        if (m92692wK.mo35579p() != null) {
            m92692wK.mo35579p().m93066i2(FrameLayoutKeepBtmSheetZaloView.class, bundle, 1024, 1, true);
        }
    }

    /* renamed from: pO */
    public boolean m84647pO() {
        C32123ta m141780f;
        C28195t7 c28195t7 = this.f77936X0;
        if (c28195t7 == null || (m141780f = c28195t7.m141780f()) == null || m141780f.m155068H() || !C26361j.f125215a.m135702h(this.f77936X0.m141780f())) {
            return false;
        }
        return true;
    }

    /* renamed from: pP */
    public void m84648pP(PrivacyInfo privacyInfo, int i11) {
        m84690ZN();
        AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.zviews.ln0

            /* renamed from: q */
            public final /* synthetic */ PrivacyInfo f81035q;

            /* renamed from: r */
            public final /* synthetic */ int f81036r;

            public /* synthetic */ ln0(PrivacyInfo privacyInfo2, int i112) {
                r2 = privacyInfo2;
                r3 = i112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                StoryDetailsView.this.m84608dP(r2, r3);
            }
        });
    }

    /* renamed from: rO */
    public /* synthetic */ void m84653rO(C32123ta c32123ta, BaseStoryItemView baseStoryItemView, View view) {
        m84586UN(c32123ta, baseStoryItemView, false);
    }

    /* renamed from: sO */
    public /* synthetic */ void m84655sO() {
        C17487o0 mo35579p;
        Bundle bundle = new Bundle();
        if (m92676n2() != null && (mo35579p = m92676n2().mo35579p()) != null) {
            mo35579p.m93066i2(StoryReactionOnboardingBottomSheet.class, bundle, 1028, 0, true);
        }
    }

    /* renamed from: tO */
    public /* synthetic */ void m84657tO() {
        if (C22037m0.f108553a.m115034h() && !AbstractC0924m0.m4168rc()) {
            AbstractC0924m0.m3940jo(true);
            Handler handler = this.f77914J1;
            if (handler != null) {
                handler.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.xn0
                    public /* synthetic */ xn0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        StoryDetailsView.this.m84655sO();
                    }
                }, 200L);
            }
        }
    }

    /* renamed from: uO */
    public /* synthetic */ void m84659uO(Object[] objArr) {
        C32123ta m153825r;
        C32123ta m153826s;
        try {
            if (objArr.length > 0) {
                int intValue = ((Integer) objArr[0]).intValue();
                if (intValue == 1) {
                    String str = (String) objArr[1];
                    String str2 = (String) objArr[2];
                    C31980jc c31980jc = (C31980jc) this.f77951i1.get(this.f77928T0.getCurrentItem());
                    if (c31980jc.f147023p.equals(CoreUtility.f89233i) && c31980jc.m153825r() != null && c31980jc.m153825r().f148138h.equals(str2)) {
                        m84716xN(false);
                        if (this.f77936X0.m141780f() != null && this.f77936X0.m141780f().f148138h.equals(str)) {
                            C32123ta m153825r2 = c31980jc.m153825r();
                            this.f77936X0.m141787o(m153825r2);
                            m84697hO(m153825r2);
                            BaseZaloView baseZaloView = this.f72421L0;
                            if (baseZaloView != null && baseZaloView.m92672lJ() && this.f77906B1 != null) {
                                C26361j c26361j = C26361j.f125215a;
                                if (c26361j.m135702h(m153825r2) && c26361j.m135703i(m153825r2)) {
                                    this.f77906B1.m125113K0(m153825r2);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (intValue != 2 && intValue != 4) {
                    if (intValue == 3) {
                        String str3 = (String) objArr[1];
                        C31980jc c31980jc2 = (C31980jc) this.f77951i1.get(this.f77928T0.getCurrentItem());
                        if (c31980jc2 != null && (m153826s = c31980jc2.m153826s(str3)) != null) {
                            m84695eO();
                            C22021e0.m114963p().m114986i(c31980jc2.f147023p, m153826s.f148138h);
                            m84689VN(c31980jc2);
                            ToastUtils.m89266n(AbstractC8020f0.media_picker_image_full_dont_exist, new Object[0]);
                            return;
                        }
                        return;
                    }
                    return;
                }
                String str4 = (String) objArr[1];
                int currentItem = this.f77928T0.getCurrentItem();
                C31980jc c31980jc3 = (C31980jc) this.f77951i1.get(currentItem);
                if (c31980jc3.f147023p.equals(CoreUtility.f89233i) && (m153825r = c31980jc3.m153825r()) != null && m153825r.f148138h.equals(str4)) {
                    if (intValue == 2) {
                        if (m153825r.m155065A() == 50001) {
                            ToastUtils.m89266n(AbstractC8020f0.str_connection_error, new Object[0]);
                        } else {
                            ToastUtils.m89266n(AbstractC8020f0.str_story_upload_fail, new Object[0]);
                        }
                    }
                    m84716xN(false);
                    if (m153825r.f148140i == 2 && m153825r.f148101D == null && this.f77932V0.f39936x.get(currentItem) != null) {
                        m84691aO(m153825r, (BaseStoryItemView) this.f77932V0.f39936x.get(currentItem));
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: wO */
    public static /* synthetic */ void m84663wO(BaseStoryItemView baseStoryItemView, C3979l c3979l) {
        if (c3979l != null) {
            try {
                baseStoryItemView.f83102P.setImageInfo(c3979l);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: xO */
    public static /* synthetic */ void m84665xO(float f11, float f12, float f13, float f14, View view, C20274d c20274d, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        int i11 = (int) (f11 + ((f12 - f11) * animatedFraction));
        int i12 = (int) (f13 + ((f14 - f13) * animatedFraction));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && (i11 != layoutParams.width || i12 != layoutParams.height)) {
            layoutParams.width = i11;
            layoutParams.height = i12;
            view.setLayoutParams(layoutParams);
        }
        if (c20274d != null) {
            c20274d.f100178u = i11;
            c20274d.f100179v = i12;
            c20274d.onAnimationUpdate(valueAnimator);
        }
    }

    /* renamed from: yO */
    public /* synthetic */ void m84667yO() {
        try {
            if (m92672lJ()) {
                m84711uP(true);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: zO */
    public /* synthetic */ void m84669zO(C31980jc c31980jc) {
        int i11;
        try {
            BaseStoryItemView baseStoryItemView = (BaseStoryItemView) this.f77932V0.f39936x.get(this.f77928T0.getCurrentItem());
            if (c31980jc.f147031x.isEmpty()) {
                if (!this.f77958p1 && ((i11 = this.f77920P0) == 0 || i11 == 4)) {
                    if (c31980jc.f147019D) {
                        c31980jc.f147020E = 0;
                        c31980jc.f147021F = "0";
                        mo78950cq(m92651WI().getString(AbstractC8020f0.str_story_loading));
                        C22021e0.m114963p().m114989l(c31980jc.f147023p, new C15109j(c31980jc, baseStoryItemView));
                    } else {
                        m84678HN(c31980jc, true);
                    }
                } else {
                    m84678HN(c31980jc, false);
                }
            } else {
                int i12 = c31980jc.f147017B;
                if (i12 == 0) {
                    if (m92672lJ()) {
                        m84661vO();
                        m84691aO(c31980jc.m153825r(), baseStoryItemView);
                        m84706sN(c31980jc);
                    }
                } else if (i12 >= c31980jc.f147031x.size()) {
                    c31980jc.f147017B = c31980jc.f147031x.size() - 1;
                    if (m92672lJ()) {
                        m84709tP(true);
                    }
                } else {
                    c31980jc.f147017B--;
                    if (m92672lJ()) {
                        m84709tP(true);
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: AP */
    void m84670AP(C32123ta c32123ta) {
        if (m84718yN(c32123ta)) {
            m84700nO();
            this.f77930U0.m141843m(c32123ta);
        } else if (m84703qO(c32123ta)) {
            m84677GN();
        }
    }

    /* renamed from: BN */
    void m84671BN() {
        C18587k c18587k;
        try {
            if (this.f77920P0 == 5) {
                int currentItem = this.f77928T0.getCurrentItem();
                if (currentItem == this.f77951i1.size() - 1) {
                    C18587k c18587k2 = this.f77967y1;
                    if (c18587k2 != null) {
                        c18587k2.m98125y0(true, 0);
                    }
                } else if (currentItem == 0 && (c18587k = this.f77967y1) != null) {
                    c18587k.m98125y0(true, -1);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // mr.InterfaceC23431j
    /* renamed from: Bn */
    public void mo84672Bn(String str, SongInfo songInfo, EnumC2963d3 enumC2963d3) {
        C23929b c23929b = this.f77906B1;
        if (c23929b != null) {
            c23929b.m125104A0(str, songInfo, enumC2963d3, C32002l4.m154264g(IMediaPlayer.MEDIA_INFO_VIDEO_SEEK_RENDERING_START));
        }
    }

    /* renamed from: C8 */
    void m84673C8() {
        boolean z11;
        try {
            try {
                Bundle m92642L3 = m92642L3();
                if (m92642L3 != null && m92642L3.getBoolean("EXTRA_FLAG_VIEW_SELECTED_USER_STORY_ONLY", false)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.f77920P0 == 0 && z11) {
                    C22021e0.m114957O(this.f77961s1);
                } else {
                    C22021e0.m114956N();
                }
                C18055a c18055a = this.f77908D1;
                if (c18055a != null && this.f77920P0 != 5) {
                    c18055a.m95987l0(this.f77951i1);
                }
                if (!m92692wK().mo35576n3()) {
                    if (m92693xK().m93029Q(MainTabView.class)) {
                        if (!this.f77813M0) {
                            this.f88756W = 1;
                        }
                        super.finish();
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putInt("SHOW_WITH_FLAGS", 67108864);
                        m92693xK().m93069k2(MainTabView.class, bundle, 2, true);
                    }
                }
                C23744a.m124114c().m124116d(3002, this.f77961s1);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                C23744a.m124114c().m124116d(3002, this.f77961s1);
            }
        } catch (Throwable th2) {
            C23744a.m124114c().m124116d(3002, this.f77961s1);
            throw th2;
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        C18055a c18055a;
        int i11;
        C31980jc c31980jc;
        ArrayList arrayList;
        super.mo37111CJ(bundle);
        C13306b.f68380m.addAll(Arrays.asList(AbstractC28025b8.f130856m));
        getLifecycle().mo9335a(this);
        C18587k c18587k = (C18587k) new C1802w0(this, new C18588l(C18578b.f93336a)).m9378a(C18587k.class);
        this.f77967y1 = c18587k;
        C31980jc c31980jc2 = null;
        c18587k.m98098B0(null);
        m84633lO();
        this.f77951i1.clear();
        m84637mO();
        if (m92642L3() != null) {
            Bundle m92642L3 = m92642L3();
            this.f77955m1 = m92642L3.getBoolean("extra_show_list_viewer", false);
            this.f77920P0 = m92642L3.getInt("extra_view_mode", 0);
            this.f77956n1 = m92642L3.getBoolean("extra_show_unseen_story", false);
            this.f77957o1 = m92642L3.getBoolean("EXTRA_FLAG_EXCLUDE_MY_STORY", false);
            this.f77922Q0 = m92642L3.getInt("srcType", 334);
            int i12 = this.f77920P0;
            if (i12 == 0) {
                String string = m92642L3.getString("extra_uid", "");
                this.f77961s1 = string;
                boolean z11 = m92642L3.getBoolean("EXTRA_FLAG_VIEW_SELECTED_USER_STORY_ONLY", false);
                this.f77946d1 = 0;
                synchronized (C22021e0.f108429m) {
                    int i13 = 0;
                    while (true) {
                        try {
                            List list = C22021e0.f108429m;
                            if (i13 >= list.size()) {
                                break;
                            }
                            C31980jc c31980jc3 = (C31980jc) list.get(i13);
                            if ((!this.f77957o1 || !TextUtils.equals(CoreUtility.f89233i, c31980jc3.f147023p)) && ((!this.f77956n1 || !c31980jc3.f147026s) && (!z11 || TextUtils.equals(string, c31980jc3.f147023p)))) {
                                this.f77951i1.add(c31980jc3);
                            }
                            i13++;
                        } finally {
                        }
                    }
                }
                if (!z11) {
                    int i14 = 0;
                    while (true) {
                        if (i14 >= this.f77951i1.size()) {
                            break;
                        }
                        if (TextUtils.equals(string, ((C31980jc) this.f77951i1.get(i14)).f147023p)) {
                            this.f77946d1 = i14;
                            break;
                        }
                        i14++;
                    }
                } else {
                    this.f77946d1 = 0;
                }
                int i15 = this.f77946d1;
                this.f77964v1 = i15;
                if (this.f77956n1 && i15 > 0) {
                    this.f77965w1 = this.f77951i1.size() - 1;
                    for (int i16 = 0; i16 < this.f77946d1; i16++) {
                        C31980jc c31980jc4 = (C31980jc) this.f77951i1.get(i16);
                        if (c31980jc4 != null && !c31980jc4.f147028u) {
                            this.f77963u1.add(c31980jc4);
                        }
                    }
                    if (this.f77963u1.size() > 0) {
                        this.f77962t1 = true;
                        this.f77951i1.addAll(this.f77963u1);
                    }
                }
                boolean z12 = m92642L3.getBoolean("EXTRA_JUMP_TO_LAST_STORY_ITEM", false);
                this.f77959q1 = z12;
                if (z12) {
                    for (C31980jc c31980jc5 : this.f77951i1) {
                        if (c31980jc5 != null && c31980jc5.f147023p.equals(string) && (arrayList = c31980jc5.f147031x) != null && !arrayList.isEmpty()) {
                            c31980jc5.f147017B = c31980jc5.f147031x.size() - 1;
                        }
                    }
                }
                if (C22018d.m114948i(this.f77922Q0)) {
                    C22018d.m114944e(this.f77951i1, this.f77946d1);
                }
            } else if (i12 == 5) {
                try {
                    this.f77946d1 = m92642L3.getInt("extra_user_story_position", 0);
                    m84679KN();
                    boolean z13 = m92642L3.getBoolean("extra_story_archive_has_more_backward", false);
                    boolean z14 = m92642L3.getBoolean("extra_story_archive_has_more_forward", false);
                    C18587k c18587k2 = this.f77967y1;
                    if (c18587k2 != null) {
                        c18587k2.m98099E0(z13);
                        this.f77967y1.m98100F0(z14);
                    }
                    String string2 = m92642L3.getString("extra_story_id", "");
                    List list2 = this.f77951i1;
                    if (list2 != null && (i11 = this.f77946d1) >= 0 && i11 < list2.size() && (c31980jc = (C31980jc) this.f77951i1.get(this.f77946d1)) != null) {
                        c31980jc.m153812B(string2);
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            } else {
                this.f77946d1 = 0;
                this.f77961s1 = m92642L3.getString("extra_uid");
                String string3 = m92642L3.getString("extra_story_id");
                this.f77960r1 = string3;
                AbstractC22055v0.m115148h(string3);
                List list3 = C22021e0.f108432p;
                if (!list3.isEmpty() && !((C31980jc) list3.get(0)).m153831x() && ((C31980jc) list3.get(0)).f147023p.equals(this.f77961s1)) {
                    if (this.f77920P0 == 2) {
                        Iterator it = list3.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C31980jc c31980jc6 = (C31980jc) it.next();
                            String str = c31980jc6.f147023p;
                            if (str != null && str.equals(this.f77961s1)) {
                                c31980jc6.f147021F = this.f77960r1;
                                break;
                            }
                        }
                    }
                } else {
                    String str2 = "";
                    String str3 = "";
                    ContactProfile m141809c = C28203u6.f131407a.m141809c(this.f77961s1);
                    if (m141809c != null) {
                        str2 = AbstractC21935u.m114542i(this.f77961s1, m141809c.f42437s);
                        str3 = m141809c.f42446v;
                    }
                    C31980jc c31980jc7 = new C31980jc(this.f77961s1, str2, str3, "", false, false);
                    c31980jc7.f147021F = this.f77960r1;
                    list3.clear();
                    list3.add(c31980jc7);
                }
                this.f77951i1.addAll(C22021e0.f108432p);
                this.f77958p1 = m92642L3.getBoolean("EXTRA_FLAG_VIEW_LATEST_TO_OLDEST", false);
                m84560JP();
            }
            if (this.f77920P0 == 2) {
                AbstractC23647d.m123906p("49150045");
                AbstractC23647d.m123893c();
            }
        }
        this.f77950h1 = new C23528a(m92648SI());
        this.f77936X0 = new C28195t7();
        this.f77915K1 = new C13306b(m92648SI());
        if (bundle != null && (c18055a = this.f77908D1) != null) {
            c18055a.m95974K0(bundle.getString("extra_save_story_reaction_map", ""));
        }
        try {
            C22037m0 c22037m0 = C22037m0.f108553a;
            if (!c22037m0.m115039m()) {
                String m3652a6 = AbstractC0924m0.m3652a6();
                if (!TextUtils.isEmpty(m3652a6)) {
                    c22037m0.m115041o(new JSONObject(m3652a6), false);
                }
                c22037m0.m115042p();
            }
        } catch (Exception e12) {
            AbstractC23350e.m122778h(e12);
        }
        C18055a c18055a2 = this.f77908D1;
        if (c18055a2 != null) {
            c18055a2.m95979P0(this.f77951i1);
            int i17 = this.f77946d1;
            if (i17 >= 0 && i17 < this.f77951i1.size()) {
                c31980jc2 = (C31980jc) this.f77951i1.get(this.f77946d1);
            }
            if (c31980jc2 != null) {
                this.f77908D1.m95970E0(c31980jc2.f147023p);
            }
        }
        this.f77909E1 = false;
        this.f77910F1 = false;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        int i12;
        if (i11 == 1001) {
            if (((C31980jc) this.f77951i1.get(this.f77928T0.getCurrentItem())).m153825r() != null) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_remove_story_archive);
                C8009j.a aVar = new C8009j.a(m92648SI());
                aVar.m43159h(7).m43162k(m118743r0).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_popup_story_delete_cancel), this.f77933V1).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_popup_story_delete_confirm), this.f77933V1);
                aVar.m43167p(this.f77931U1);
                return aVar.m43152a();
            }
        } else {
            if (i11 == 1005) {
                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_archive_dialog_confirm_title);
                String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_archive_dialog_confirm_desc);
                C8009j.a aVar2 = new C8009j.a(m92648SI());
                aVar2.m43159h(4).m43172u(m118743r02).m43162k(m118743r03).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_archive_dialog_confirm_negative), this.f77933V1).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_archive_dialog_confirm_positive), this.f77933V1);
                aVar2.m43167p(this.f77931U1);
                return aVar2.m43152a();
            }
            if (i11 == 1006) {
                C8009j.a aVar3 = new C8009j.a(m92648SI());
                aVar3.m43159h(4).m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_music_popup_download_title)).m43156e(AbstractC16803z.bg_story_music_download).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_music_popup_download_desc)).m43164m(AbstractC8020f0.str_story_music_popup_download_cancel, new InterfaceC17463d.a()).m43169r(AbstractC8020f0.str_story_music_popup_download_confirm, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.bo0
                    public /* synthetic */ bo0() {
                    }

                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i13) {
                        StoryDetailsView.this.m84592WO(interfaceC17463d, i13);
                    }
                });
                return aVar3.m43152a();
            }
            if (i11 == 1002) {
                C8009j.a aVar4 = new C8009j.a(m92648SI());
                aVar4.m43153b(new ArrayAdapter(m92648SI(), AbstractC7409c0.chat_context_menu_item, AbstractC6918a0.context_item_name, new String[]{m92652XI(AbstractC8020f0.str_reportabuse)}), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.co0
                    public /* synthetic */ co0() {
                    }

                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i13) {
                        StoryDetailsView.this.m84595XO(interfaceC17463d, i13);
                    }
                });
                aVar4.m43167p(this.f77931U1);
                return aVar4.m43152a();
            }
            if (i11 == 1003) {
                C2913t1.a m13861a = new C2913t1(getContext()).m13865e(new C2913t1.b() { // from class: com.zing.zalo.ui.zviews.do0
                    public /* synthetic */ do0() {
                    }

                    @Override // bn.C2913t1.b
                    /* renamed from: a */
                    public final void mo13056a(int i13, String str) {
                        StoryDetailsView.this.m84598YO(i13, str);
                    }
                }).m13862b(m92652XI(AbstractC8020f0.str_story_report_dialog_msg), m92652XI(AbstractC8020f0.str_yes), m92652XI(AbstractC8020f0.str_no)).m13861a();
                m13861a.m92854E(this.f77931U1);
                return m13861a;
            }
            if (i11 == 1004) {
                C8009j.a aVar5 = new C8009j.a(m92648SI());
                C32123ta m153825r = ((C31980jc) this.f77951i1.get(this.f77928T0.getCurrentItem())).m153825r();
                ArrayList arrayList = new ArrayList();
                arrayList.add(m92652XI(AbstractC8020f0.str_story_delete_this_story));
                if (m153825r != null && (i12 = m153825r.f148128c) != 1 && i12 != 5) {
                    if (!m153825r.m155070J()) {
                        arrayList.add(m92652XI(AbstractC8020f0.str_story_save_this_story));
                    }
                    if (m153825r.f148140i == 1) {
                        arrayList.add(m92652XI(AbstractC8020f0.str_story_post_on_timeline));
                    }
                }
                aVar5.m43153b(new ArrayAdapter(m92648SI(), AbstractC7409c0.chat_context_menu_item, AbstractC6918a0.context_item_name, (String[]) arrayList.toArray(new String[0])), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.mm0

                    /* renamed from: q */
                    public final /* synthetic */ C32123ta f81165q;

                    public /* synthetic */ mm0(C32123ta m153825r2) {
                        r2 = m153825r2;
                    }

                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i13) {
                        StoryDetailsView.this.m84600ZO(r2, interfaceC17463d, i13);
                    }
                });
                aVar5.m43167p(this.f77931U1);
                return aVar5.m43152a();
            }
            if (i11 == 1008) {
                C8009j.a aVar6 = new C8009j.a(getContext());
                aVar6.m43172u(m92652XI(AbstractC8020f0.str_title_popup_unfollow_oa)).m43173v(2).m43159h(7).m43162k(m92652XI(AbstractC8020f0.str_ask_to_unfollow_vip_acc)).m43165n(m92652XI(AbstractC8020f0.str_button_no_unfollow), new InterfaceC17463d.b()).m43170s(m92652XI(AbstractC8020f0.str_button_yes_unfollow), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.nm0
                    public /* synthetic */ nm0() {
                    }

                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i13) {
                        StoryDetailsView.this.m84602aP(interfaceC17463d, i13);
                    }
                }).m43167p(this.f77931U1);
                return aVar6.m43152a();
            }
        }
        return super.mo39014DJ(i11);
    }

    /* renamed from: DP */
    public void m84674DP(float f11, float f12) {
        this.f77937X1 = f11;
        this.f77939Y1 = f12;
    }

    @Override // com.zing.zalo.uicomponents.framelayout.DragToCloseLayout.InterfaceC16432a
    /* renamed from: Dg */
    public void mo38328Dg(float f11) {
        if (!(m92693xK().m93004H0() instanceof StoryDetailsView)) {
            m84566LP(false);
        }
        View view = this.f77924R0;
        if (view != null && view.getHeight() > 0) {
            this.f77924R0.setBackgroundColor(Color.argb(Math.max(255 - ((((int) Math.abs(f11)) * 255) / this.f77924R0.getHeight()), 0), 0, 0, 0));
        }
    }

    @Override // com.zing.zalo.uicomponents.framelayout.DragToCloseLayout.InterfaceC16432a
    /* renamed from: EC */
    public void mo38329EC(boolean z11) {
        int i11 = 0;
        this.f77929T1 = false;
        if (z11) {
            m84566LP(true);
            AbstractC15101b0 abstractC15101b0 = this.f77935W1;
            if (abstractC15101b0 != null) {
                abstractC15101b0.mo17183d(true);
            }
        } else {
            this.f77910F1 = true;
        }
        int translationY = (int) this.f77926S0.getTranslationY();
        if (!z11) {
            i11 = this.f77926S0.getHeight();
            if (translationY < 0) {
                i11 = -i11;
            }
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(translationY, i11);
        this.f77927S1 = ofInt;
        ofInt.setDuration(300L);
        this.f77927S1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.zviews.sn0
            public /* synthetic */ sn0() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                StoryDetailsView.this.m84604bP(valueAnimator);
            }
        });
        this.f77927S1.addListener(new C15115p(z11));
        this.f77927S1.start();
    }

    /* renamed from: EP */
    public void m84675EP(AbstractC15101b0 abstractC15101b0) {
        this.f77935W1 = abstractC15101b0;
    }

    /* renamed from: FN */
    void m84676FN() {
        C32123ta c32123ta;
        try {
            C31980jc c31980jc = (C31980jc) this.f77951i1.get(this.f77928T0.getCurrentItem());
            if (c31980jc != null && (c32123ta = (C32123ta) c31980jc.f147031x.get(c31980jc.f147017B)) != null) {
                int i11 = 2;
                if (c32123ta.f148126b == 2) {
                    m84695eO();
                    C22021e0.m114963p().m114986i(c31980jc.f147023p, c32123ta.f148138h);
                    C22052u.m115085y().m115102v(c32123ta.f148138h);
                    AbstractC20110a.m104543l("[Flow post video]").mo104556o(8, "[BaseStoryItemView] clicked delete async story, storyId=%s", c32123ta.f148138h);
                    m84689VN(c31980jc);
                    ToastUtils.m89266n(AbstractC8020f0.str_delete_story_success, new Object[0]);
                    return;
                }
                m84690ZN();
                BaseStoryItemView m84681MN = m84681MN();
                if (m84681MN != null) {
                    m84681MN.m87713v(false);
                }
                mo46829Y();
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new C15106g(c31980jc, c32123ta));
                if (this.f77920P0 != 5) {
                    i11 = 0;
                }
                c0766k.mo1749u5(c32123ta.f148138h, i11);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.story_detail_view, viewGroup, false);
        this.f77924R0 = inflate;
        DragToCloseLayout dragToCloseLayout = (DragToCloseLayout) inflate.findViewById(AbstractC6918a0.story_detail_dragtoclose);
        this.f77926S0 = dragToCloseLayout;
        dragToCloseLayout.setOnDragToCloseListener(this);
        this.f77926S0.setMinDistanceToClose(AbstractC23136l9.m118713h0() / 10);
        ((KeyboardFrameLayout) this.f77924R0.findViewById(AbstractC6918a0.story_detail_keyboard_framelayout)).setOnKeyboardListener(new C15122w());
        return this.f77924R0;
    }

    /* renamed from: GN */
    void m84677GN() {
        C28204u7 c28204u7 = this.f77930U0;
        if (c28204u7 != null) {
            c28204u7.m141837d();
        }
    }

    /* renamed from: HN */
    void m84678HN(C31980jc c31980jc, boolean z11) {
        if (z11) {
            C22021e0.m114963p().m114987j(c31980jc.f147023p);
        }
        this.f77951i1.removeAll(Collections.singleton(c31980jc));
        if (this.f77962t1 && this.f77963u1.remove(c31980jc)) {
            this.f77964v1--;
            this.f77965w1--;
        }
        if (this.f77951i1.isEmpty()) {
            this.f77953k1 = true;
            finish();
            return;
        }
        this.f77932V0.m37059A(this.f77951i1);
        ViewPager.InterfaceC6875j interfaceC6875j = this.f77934W0;
        if (interfaceC6875j != null) {
            interfaceC6875j.onPageSelected(this.f77928T0.getCurrentItem());
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        try {
            this.f77936X0.m141784l();
            for (int i11 = 0; i11 < this.f77932V0.f39936x.size(); i11++) {
                BaseStoryItemView baseStoryItemView = (BaseStoryItemView) this.f77932V0.f39936x.valueAt(i11);
                if (baseStoryItemView != null) {
                    baseStoryItemView.m87700Y();
                }
            }
            this.f77935W1 = null;
            C22033k0.m115006h().m115020t(null);
            C31980jc m84683NN = m84683NN();
            if (m84683NN != null) {
                ZMediaPlayer.closeUserStory(ZMediaPlayerSettings.getVideoConfig(2), m84683NN.mo17216b());
            }
            ZMediaPlayer.setStopAllUrlCaching(ZMediaPlayerSettings.getVideoConfig(2));
            C3977j c3977j = this.f77966x1;
            if (c3977j != null) {
                c3977j.setImageInfo(null);
            }
            C13306b.f68380m.removeAll(Arrays.asList(AbstractC28025b8.f130856m));
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        getLifecycle().mo9338d(this);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        this.f77928T0.removeOnPageChangeListener(this.f77934W0);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.m124114c().m124117e(this, 28);
        C23744a.m124114c().m124117e(this, 41);
        C23744a.m124114c().m124117e(this, 6040);
        C23744a.m124114c().m124117e(this, 60063);
        C23744a.m124114c().m124117e(this, 60064);
        C23744a.m124114c().m124117e(this, 60065);
        this.f77935W1 = null;
    }

    /* renamed from: KN */
    void m84679KN() {
        C31980jc c31980jc;
        ArrayList arrayList;
        C32123ta c32123ta;
        C18587k c18587k;
        ArrayList arrayList2;
        C32123ta c32123ta2;
        C18587k c18587k2;
        try {
            this.f77951i1.clear();
            C18578b c18578b = C18578b.f93336a;
            synchronized (c18578b.m98050h()) {
                try {
                    List m98058p = c18578b.m98058p();
                    C31980jc c31980jc2 = null;
                    if (m98058p.isEmpty()) {
                        c31980jc = null;
                    } else {
                        c31980jc = (C31980jc) m98058p.get(0);
                    }
                    if (c31980jc != null && (arrayList2 = c31980jc.f147031x) != null && (c32123ta2 = (C32123ta) arrayList2.get(0)) != null && (c18587k2 = this.f77967y1) != null) {
                        c18587k2.m98101G0(c32123ta2.f148138h);
                    }
                    if (!m98058p.isEmpty()) {
                        c31980jc2 = (C31980jc) m98058p.get(m98058p.size() - 1);
                    }
                    if (c31980jc2 != null && (arrayList = c31980jc2.f147031x) != null && (c32123ta = (C32123ta) arrayList.get(arrayList.size() - 1)) != null && (c18587k = this.f77967y1) != null) {
                        c18587k.m98102I0(c32123ta.f148138h);
                    }
                    this.f77951i1.addAll(m98058p);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: KP */
    void m84680KP() {
        C28204u7 c28204u7 = this.f77930U0;
        if (c28204u7 != null) {
            c28204u7.m141845p();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        return false;
    }

    /* renamed from: MN */
    BaseStoryItemView m84681MN() {
        try {
            C7286z8 c7286z8 = this.f77932V0;
            if (c7286z8 == null || c7286z8.f39936x.size() <= 0) {
                return null;
            }
            return (BaseStoryItemView) this.f77932V0.f39936x.get(this.f77928T0.getCurrentItem());
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return null;
        }
    }

    /* renamed from: MP */
    void m84682MP() {
        C31980jc c31980jc;
        try {
            C28195t7 c28195t7 = this.f77936X0;
            if (c28195t7 != null && c28195t7.m141780f() != null) {
                C32123ta m141780f = this.f77936X0.m141780f();
                BaseStoryItemView m84681MN = m84681MN();
                if (m84681MN != null && (c31980jc = m84681MN.f83110a0) != null) {
                    C32123ta m153825r = c31980jc.m153825r();
                    if (m153825r != null && m141780f != null && !m153825r.f148138h.equals(m141780f.f148138h)) {
                        int i11 = 0;
                        while (true) {
                            if (i11 < m84681MN.f83110a0.f147031x.size()) {
                                if (((C32123ta) m84681MN.f83110a0.f147031x.get(i11)).f148138h.equals(m141780f.f148138h)) {
                                    m84681MN.f83110a0.f147017B = i11;
                                    break;
                                }
                                i11++;
                            } else {
                                this.f77936X0.m141787o(null);
                                if (m84681MN instanceof StoryMineItemView) {
                                    ((StoryMineItemView) m84681MN).m88126u0(false);
                                }
                            }
                        }
                    }
                    m84681MN.setupStoryItemCount(m84681MN.f83110a0);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: NJ */
    public boolean mo39030NJ(int i11, KeyEvent keyEvent) {
        if (i11 == 24) {
            m84583TN();
        }
        return super.mo39030NJ(i11, keyEvent);
    }

    /* renamed from: NN */
    public C31980jc m84683NN() {
        try {
            return m84684PN(this.f77928T0.getCurrentItem());
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return null;
        }
    }

    /* renamed from: PN */
    public C31980jc m84684PN(int i11) {
        try {
            List list = this.f77951i1;
            if (list != null && list.size() > i11) {
                return (C31980jc) this.f77951i1.get(i11);
            }
            return null;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return null;
        }
    }

    /* renamed from: QN */
    void m84685QN() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("source", 2);
            C31877d c31877d = new C31877d();
            Bundle bundle = new Bundle();
            bundle.putInt(C31877d.f146414i, 1026);
            c31877d.m153185d(bundle);
            AbstractC28207v1.m141994i3("action.open.story_archive", 7, this.f72421L0.m92676n2(), this.f72421L0, jSONObject.toString(), c31877d);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        ZaloView m93012K0 = m92693xK().m93012K0();
        if (!(m93012K0 instanceof StoryDetailsView) && !(m93012K0 instanceof ZaloCameraView)) {
            m84566LP(false);
        }
        this.f77924R0.setKeepScreenOn(false);
        m84690ZN();
        Animator animator = this.f77952j1;
        if (animator != null && animator.isStarted()) {
            this.f77952j1.end();
        }
        C13306b c13306b = this.f77915K1;
        if (c13306b != null) {
            c13306b.m74709u();
        }
        C26333b.f125013a.m135515e();
        C28905e.m144373n().m144391j(C23793c.m124316k().mo124311f());
    }

    /* renamed from: RN */
    void m84686RN() {
        C22021e0.m114963p().m114992o(this.f77961s1, new C15116q(new Runnable() { // from class: com.zing.zalo.ui.zviews.un0
            public /* synthetic */ un0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                StoryDetailsView.this.m84667yO();
            }
        }));
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        try {
            super.mo37118SJ(bundle);
            C18055a c18055a = this.f77908D1;
            if (c18055a != null) {
                bundle.putString("extra_save_story_reaction_map", c18055a.m95973J0());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview
    /* renamed from: SL */
    public void mo68807SL() {
        super.mo68807SL();
        this.f77948f1 = null;
        m84715wP();
    }

    /* renamed from: SN */
    void m84687SN(Intent intent) {
        BottomSheetMenuResult bottomSheetMenuResult;
        C32123ta c32123ta;
        if (intent != null) {
            try {
                if (intent.hasExtra("EXTRA_BUNDLE_DATA_RESULT") && (bottomSheetMenuResult = (BottomSheetMenuResult) intent.getParcelableExtra("EXTRA_BUNDLE_DATA_RESULT")) != null && bottomSheetMenuResult.m45568d() != null && bottomSheetMenuResult.m45569e() == 11 && bottomSheetMenuResult.m45571g() != 0) {
                    C31980jc m107555a = bottomSheetMenuResult.m45568d().m107555a();
                    if (m107555a != null) {
                        c32123ta = m107555a.m153825r();
                    } else {
                        c32123ta = null;
                    }
                    int m45571g = bottomSheetMenuResult.m45571g();
                    if (m45571g != 45) {
                        if (m45571g != 46) {
                            switch (m45571g) {
                                case 35:
                                    this.f72421L0.showDialog(1005);
                                    return;
                                case 36:
                                    if (C26361j.f125215a.m135702h(c32123ta)) {
                                        this.f77949g1 = c32123ta;
                                        this.f72421L0.showDialog(1006);
                                        return;
                                    } else {
                                        m84558JN(c32123ta);
                                        return;
                                    }
                                case 37:
                                    C18055a c18055a = this.f77908D1;
                                    if (c18055a != null) {
                                        c18055a.m95992q0(c32123ta);
                                        return;
                                    }
                                    return;
                                case 38:
                                    AbstractC23647d.m123897g("49153062");
                                    this.f72421L0.showDialog(1001);
                                    return;
                                case 39:
                                    AbstractC23647d.m123897g("49153063");
                                    this.f72421L0.showDialog(ZAbstractBase.ZVU_BLEND_GEN_THUMB);
                                    return;
                                case 40:
                                    m84529AN(2);
                                    return;
                                default:
                                    return;
                            }
                        }
                        m84554IN(false);
                        return;
                    }
                    m84554IN(true);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        C13306b c13306b = this.f77915K1;
        if (c13306b != null) {
            c13306b.m74697c(this.f77916L1);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            m92691vK().setWindowInsetsAnimationCallback(new C15100b(0));
        }
    }

    @Override // mr.InterfaceC23431j
    /* renamed from: Ug */
    public void mo84688Ug(String str, SongInfo songInfo, EnumC2963d3 enumC2963d3) {
        if (enumC2963d3 == EnumC2963d3.f11684s) {
            m84552HP(new C23929b.h(str, songInfo.m45182d(), AbstractC23136l9.m118743r0(AbstractC8020f0.str_social_music_location_not_supported_description), AbstractC23322a.zds_ic_info_circle_solid_24, ZAbstractBase.ZVU_PROCESS_FLUSH, ""));
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        m84677GN();
        C13306b c13306b = this.f77915K1;
        if (c13306b != null) {
            c13306b.m74701i();
        }
        if (Build.VERSION.SDK_INT >= 30) {
            m92691vK().setWindowInsetsAnimationCallback(null);
        }
    }

    /* renamed from: VN */
    void m84689VN(C31980jc c31980jc) {
        AbstractC28065f8.m141534d(c31980jc);
        this.f77914J1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.in0

            /* renamed from: q */
            public final /* synthetic */ C31980jc f80702q;

            public /* synthetic */ in0(C31980jc c31980jc2) {
                r2 = c31980jc2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                StoryDetailsView.this.m84669zO(r2);
            }
        });
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        if (z11) {
            if (this.f72421L0.m92676n2() != null && this.f72421L0.m92676n2().getWindow() != null) {
                this.f72421L0.m92676n2().mo35554O(34);
            }
            mo78955kl(new Runnable() { // from class: com.zing.zalo.ui.zviews.zn0
                public /* synthetic */ zn0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    StoryDetailsView.this.m84606cP();
                }
            }, 200L);
        }
        if (z11 && z12) {
            m84566LP(true);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        ZaloView m92996E0;
        super.mo37125ZJ(view, bundle);
        SystemUI m89412p = SystemUI.m89412p(view);
        m89412p.m89427V(-16777216);
        m89412p.m89426U(Boolean.FALSE);
        this.f77966x1 = new C3977j(view.getContext());
        this.f77928T0 = (StoryViewPager) view.findViewById(AbstractC6918a0.story_pager);
        C7286z8 c7286z8 = new C7286z8(this, this.f77941Z1, this.f77920P0, this.f77936X0);
        this.f77932V0 = c7286z8;
        c7286z8.m37059A(this.f77951i1);
        this.f77932V0.m37060B(new C15123x());
        this.f77932V0.m37061C(new C15124y());
        this.f77928T0.setAdapter(this.f77932V0);
        StoryViewPager storyViewPager = this.f77928T0;
        C15125z c15125z = new C15125z();
        this.f77934W0 = c15125z;
        storyViewPager.addOnPageChangeListener(c15125z);
        this.f77928T0.setCurrentItem(this.f77946d1);
        this.f77928T0.setFirstOpenedPage(this.f77946d1);
        this.f77936X0.m141786n(new C15099a0());
        if (this.f77951i1.isEmpty()) {
            this.f77953k1 = true;
            finish();
            return;
        }
        this.f77936X0.m141789q(new C15098a());
        if (m92683qJ() && (m92996E0 = m92649TI().m92996E0("MenuListPopupView")) != null) {
            m92996E0.finish();
        }
    }

    /* renamed from: ZN */
    void m84690ZN() {
        C28195t7 c28195t7 = this.f77936X0;
        if (c28195t7 != null) {
            c28195t7.m141782j();
            if (this.f77906B1 != null && this.f77936X0.m141780f() != null) {
                this.f77906B1.m125108E0(this.f77936X0.m141780f().f148138h);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: aO */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m84691aO(C32123ta c32123ta, BaseStoryItemView baseStoryItemView) {
        C28195t7 c28195t7 = this.f77936X0;
        if (c28195t7 != null && c32123ta != null && baseStoryItemView != null) {
            c28195t7.m141783k(c32123ta, baseStoryItemView);
            if (this.f77906B1 != null && !c32123ta.m155068H()) {
                C26361j c26361j = C26361j.f125215a;
                if (c26361j.m135702h(c32123ta) && c26361j.m135703i(c32123ta)) {
                    this.f77906B1.m125109F0(c32123ta.f148138h);
                    if (this.f77908D1 == null) {
                        C31980jc m84683NN = m84683NN();
                        if (m84683NN != null) {
                            this.f77908D1.m95972G0(m84683NN.f147023p);
                        }
                        this.f77908D1.m95971F0(c32123ta.f148138h);
                        return;
                    }
                    return;
                }
            }
            baseStoryItemView.m87712u();
            if (this.f77908D1 == null) {
            }
        }
    }

    /* renamed from: bO */
    void m84692bO(Intent intent) {
        C32123ta m153825r;
        if (intent != null) {
            C31980jc c31980jc = (C31980jc) this.f77951i1.get(this.f77928T0.getCurrentItem());
            if (c31980jc != null && (m153825r = c31980jc.m153825r()) != null && m153825r.f148126b != 2) {
                PrivacyInfo privacyInfo = (PrivacyInfo) intent.getParcelableExtra("EXTRA_PRIVACY_INFO_RESULT");
                if (Boolean.TRUE.equals(new C19431d().m101509a(new C19431d.a(m153825r.f148149o, privacyInfo)))) {
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new C15104e(m153825r, privacyInfo, c31980jc));
                    mo46829Y();
                    C24417g c24417g = C24417g.f117907a;
                    c24417g.m127707i(privacyInfo.f45973p, true);
                    c24417g.m127706h(privacyInfo.f45973p, privacyInfo.f45974q);
                    this.f77936X0.m141782j();
                    c0766k.mo1633f4(m153825r.f148138h, privacyInfo);
                }
            }
        }
    }

    /* renamed from: cO */
    public void m84693cO() {
        if (this.f77936X0 != null && m84720zN()) {
            this.f77936X0.m141785m();
            if (this.f77906B1 != null && this.f77936X0.m141780f() != null && !this.f77936X0.m141780f().m155068H() && C26361j.f125215a.m135702h(this.f77936X0.m141780f())) {
                this.f77906B1.m125110G0(this.f77936X0.m141780f().f148138h, (int) this.f77936X0.m141779e());
            }
        }
    }

    /* renamed from: dO */
    void m84694dO() {
        if (this.f77906B1 != null && this.f77936X0.m141780f() != null) {
            this.f77906B1.m125111I0(this.f77936X0.m141780f().f148138h);
        }
    }

    /* renamed from: eO */
    void m84695eO() {
        C28195t7 c28195t7 = this.f77936X0;
        if (c28195t7 != null) {
            c28195t7.m141790r();
            m84694dO();
        }
    }

    @Override // com.zing.zalo.uicomponents.framelayout.DragToCloseLayout.InterfaceC16432a
    /* renamed from: f2 */
    public void mo38330f2() {
        ValueAnimator valueAnimator = this.f77927S1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.f77924R0;
        if (view != null) {
            view.setBackgroundColor(-16777216);
        }
        this.f77929T1 = true;
        m84690ZN();
        m92693xK().m93094z(true);
    }

    /* renamed from: fO */
    void m84696fO(C32123ta c32123ta, long j11) {
        if (this.f77906B1 != null && m84647pO() && c32123ta != null) {
            this.f77906B1.m125112J0(c32123ta.f148138h, j11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        BaseStoryItemView baseStoryItemView;
        this.f77909E1 = true;
        int currentItem = this.f77928T0.getCurrentItem();
        BaseStoryItemView m84681MN = m84681MN();
        if (m84681MN != null) {
            C18055a c18055a = this.f77908D1;
            if (c18055a != null) {
                c18055a.m95989n0(m84683NN(), m84681MN.getLastBindStoryItem(), m84681MN.getStoryMessageToSend(), true, true);
            }
            m84695eO();
            m84681MN.m87712u();
        }
        Intent intent = new Intent();
        intent.putExtra("EXTRA_RESULT_CURRENT_USER_STORY_INDEX", currentItem);
        if (this.f77920P0 == 5) {
            ArrayList arrayList = this.f77968z1;
            if (arrayList != null && !arrayList.isEmpty()) {
                intent.putExtra("EXTRA_RESULT_DELETED_STORY_IDS", this.f77968z1);
            }
            Map map = this.f77905A1;
            if (map != null) {
                intent.putExtra("EXTRA_RESULT_VIEWED_STORY_COUNT", map.size());
            }
        }
        this.f72421L0.mo50035CK(-1, intent);
        int i11 = this.f77920P0;
        if (i11 != 0 && i11 != 4 && i11 != 5) {
            C22021e0.f108432p.clear();
            if (C22021e0.f108429m.isEmpty()) {
                Iterator it = C7960e.m41971c6().m42520r6(0L, 20).iterator();
                while (it.hasNext()) {
                    C22021e0.m114963p().m114982e((C31980jc) it.next(), false);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<C31980jc> list = C22021e0.f108429m;
            synchronized (list) {
                try {
                    for (C31980jc c31980jc : list) {
                        linkedHashMap.put(c31980jc.f147023p, c31980jc);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            boolean z11 = false;
            for (C31980jc c31980jc2 : this.f77951i1) {
                C31980jc c31980jc3 = (C31980jc) linkedHashMap.get(c31980jc2.f147023p);
                if (c31980jc3 != null) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    Iterator it2 = c31980jc3.f147031x.iterator();
                    while (it2.hasNext()) {
                        C32123ta c32123ta = (C32123ta) it2.next();
                        linkedHashMap2.put(c32123ta.f148138h, c32123ta);
                    }
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    Iterator it3 = c31980jc3.f147032y.iterator();
                    while (it3.hasNext()) {
                        C32123ta c32123ta2 = (C32123ta) it3.next();
                        linkedHashMap3.put(c32123ta2.f148138h, c32123ta2);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it4 = c31980jc2.f147031x.iterator();
                    boolean z12 = false;
                    while (it4.hasNext()) {
                        C32123ta c32123ta3 = (C32123ta) it4.next();
                        if (c32123ta3.f148152r) {
                            C32123ta c32123ta4 = (C32123ta) linkedHashMap2.get(c32123ta3.f148138h);
                            if (c32123ta4 != null && !c32123ta4.f148152r) {
                                c32123ta4.f148152r = true;
                                z12 = true;
                            }
                            if (linkedHashMap3.containsKey(c32123ta3.f148138h)) {
                                C32123ta c32123ta5 = (C32123ta) linkedHashMap3.remove(c32123ta3.f148138h);
                                if (!linkedHashMap2.containsKey(c32123ta3.f148138h)) {
                                    arrayList2.add(c32123ta3.f148138h);
                                    linkedHashMap2.put(c32123ta3.f148138h, c32123ta5);
                                    c31980jc3.f147031x.add(c32123ta5);
                                    c31980jc3.f147027t++;
                                }
                                z12 = true;
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        intent.putExtra("EXTRA_RESULT_UPDATE_SEEN_STORIES", arrayList2);
                    }
                    if (z12) {
                        c31980jc3.f147032y.clear();
                        c31980jc3.f147032y.addAll(linkedHashMap3.values());
                        c31980jc3.m153816F();
                        C0824j.m2153b(new C15111l(c31980jc3, arrayList2));
                        AbstractC23304d.f113364b1 = true;
                    }
                } else if (c31980jc2.f147031x.size() > 0) {
                    c31980jc2.m153816F();
                    C22021e0.m114963p().m114982e(c31980jc2, true);
                    z11 = true;
                }
            }
            if (z11) {
                C0824j.m2153b(new C15112m());
            }
        }
        Animator animator = this.f77952j1;
        if (animator == null || !animator.isStarted()) {
            if (!this.f77953k1 && m92693xK().m93004H0() != null) {
                C7286z8 c7286z8 = this.f77932V0;
                if (c7286z8 != null && c7286z8.f39936x.size() > 0) {
                    baseStoryItemView = (BaseStoryItemView) this.f77932V0.f39936x.get(this.f77928T0.getCurrentItem());
                } else {
                    baseStoryItemView = null;
                }
                if (baseStoryItemView != null) {
                    m92693xK().m93094z(true);
                    this.f77914J1.post(new RunnableC15113n(baseStoryItemView));
                    return;
                }
            }
            m84673C8();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "StoryDetailsView";
    }

    /* renamed from: hO */
    void m84697hO(C32123ta c32123ta) {
        if (c32123ta != null) {
            try {
                if (!this.f77925R1.containsKey(c32123ta.f148138h)) {
                    int i11 = c32123ta.f148126b;
                    if (i11 != 2 || c32123ta.f148128c != 1) {
                        if (i11 == 2) {
                            c32123ta.f148152r = true;
                            return;
                        }
                        if (m84683NN() != null && m84683NN().f147029v == 2) {
                            return;
                        }
                        Map map = this.f77925R1;
                        String str = c32123ta.f148138h;
                        map.put(str, str);
                        AbstractC22055v0.m115148h(c32123ta.f148138h);
                        C0766k c0766k = new C0766k();
                        c0766k.mo1704o8(new C15102c(c32123ta));
                        c0766k.mo1395B6(c32123ta.f148138h, this.f77922Q0);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: iP */
    public void m84698iP(C32123ta c32123ta) {
        if (this.f77907C1 && this.f77906B1 != null && c32123ta != null && !c32123ta.m155068H()) {
            C26361j c26361j = C26361j.f125215a;
            if (c26361j.m135702h(c32123ta) && c26361j.m135703i(c32123ta)) {
                this.f77906B1.m125121v0(c32123ta.f148138h, c32123ta.f148119V, c32123ta.f148120W);
            }
        }
    }

    /* renamed from: kb */
    public void m84699kb(String str, String str2) {
        C28195t7 c28195t7;
        C23929b c23929b = this.f77906B1;
        if (c23929b != null && (c28195t7 = this.f77936X0) != null) {
            c23929b.m125123x0(str, str2, (int) c28195t7.m141779e());
        }
    }

    /* renamed from: nO */
    void m84700nO() {
        float f11;
        if (this.f77930U0 == null) {
            this.f77930U0 = new C28204u7(m92676n2(), this.f77926S0);
            int m118742r = AbstractC23136l9.m118742r(56.0f);
            if (C22037m0.f108553a.m115034h()) {
                f11 = 100.0f;
            } else {
                f11 = 16.0f;
            }
            int m118742r2 = AbstractC23136l9.m118742r(f11);
            this.f77930U0.m141844o(m118742r2, AbstractC23136l9.m118713h0() - m118742r);
        }
    }

    /* renamed from: nP */
    public void m84701nP(String str, boolean z11) {
        C23929b c23929b = this.f77906B1;
        if (c23929b != null) {
            c23929b.m125122w0(str, C32002l4.m154264g(IMediaPlayer.MEDIA_INFO_VIDEO_SEEK_RENDERING_START), z11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 1021 || i11 == 1025 || i11 == 1026) {
            m84533BP();
        }
        if (i11 == 1020) {
            BaseStoryItemView m84681MN = m84681MN();
            if (m84681MN != null && m84681MN.m87717z()) {
                m84681MN.m87713v(false);
            }
            this.f77928T0.setDisableScrolling(false);
        } else if (i11 == 1022 && i12 == -1) {
            m84687SN(intent);
        } else if (i11 == 1023 && i12 == -1) {
            m84692bO(intent);
        } else if (i11 == 1027 && i12 == -1) {
            m84622iO(intent);
        } else if (i11 == 1028) {
            m84716xN(false);
        } else if (i11 == 1029) {
            if (i12 == -1) {
                m84615gO(intent);
            } else if (i12 == 0 && intent != null) {
                AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.gn0

                    /* renamed from: p */
                    public final /* synthetic */ String f80482p;

                    public /* synthetic */ gn0(String str) {
                        r1 = str;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC23041d2.m118208g(r1);
                    }
                });
            }
        }
        super.onActivityResult(i11, i12, intent);
    }

    @InterfaceC1766e0(AbstractC1785o.a.ON_STOP)
    void onEnterBackground() {
        C23929b c23929b = this.f77906B1;
        if (c23929b != null) {
            c23929b.m125105B0();
        }
    }

    @InterfaceC1766e0(AbstractC1785o.a.ON_RESUME)
    void onEnterForeground() {
        C23929b c23929b = this.f77906B1;
        if (c23929b != null) {
            c23929b.m125106C0();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            if (this.f77940Z0) {
                return true;
            }
            BaseStoryItemView m84681MN = m84681MN();
            if (m84681MN != null && m84681MN.m87717z()) {
                m84681MN.m87713v(true);
                m84693cO();
            } else {
                this.f77953k1 = false;
                finish();
            }
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        if (i11 == 115) {
            this.f77911G1 = false;
            for (int i12 : iArr) {
                if (i12 != 0) {
                    return;
                }
            }
            this.f77941Z1.mo84759G();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        m84566LP(true);
        this.f77924R0.setKeepScreenOn(true);
        if (this.f77954l1) {
            m84715wP();
        }
        C13306b c13306b = this.f77915K1;
        if (c13306b != null) {
            c13306b.m74710v();
        }
        m84535CN();
    }

    @Override // mr.InterfaceC23431j
    /* renamed from: or */
    public void mo84702or(String str, SongInfo songInfo, EnumC2963d3 enumC2963d3) {
        C23929b c23929b = this.f77906B1;
        if (c23929b != null) {
            c23929b.m125125z0(str, songInfo, enumC2963d3, C32002l4.m154264g(IMediaPlayer.MEDIA_INFO_VIDEO_SEEK_RENDERING_START));
        }
    }

    /* renamed from: qO */
    boolean m84703qO(C32123ta c32123ta) {
        try {
            StoryViewPager storyViewPager = this.f77928T0;
            if (storyViewPager != null && this.f77951i1 != null) {
                return ((C31980jc) this.f77951i1.get(storyViewPager.getCurrentItem())).m153825r().f148138h.equals(c32123ta.f148138h);
            }
            return false;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return false;
        }
    }

    /* renamed from: qP */
    void m84704qP() {
        C20638b c20638b = new C20638b();
        c20638b.m107557c((C31980jc) this.f77951i1.get(this.f77928T0.getCurrentItem()));
        c20638b.m107558d(this.f77920P0);
        BottomSheetMenuBundleData bottomSheetMenuBundleData = new BottomSheetMenuBundleData();
        bottomSheetMenuBundleData.m45511l(11);
        bottomSheetMenuBundleData.m45510k(c20638b);
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", 6);
        bundle.putParcelable("EXTRA_BUNDLE_DATA", bottomSheetMenuBundleData);
        if (m92676n2() != null && m92676n2().mo35576n3()) {
            m92693xK().mo57057c2(AbstractC6918a0.chat_head_full_container, FrameLayoutKeepBtmSheetZaloView.class, bundle, 1022, null, 1, true);
        } else {
            m92693xK().m93066i2(FrameLayoutKeepBtmSheetZaloView.class, bundle, 1022, 1, true);
        }
    }

    /* renamed from: rP */
    void m84705rP() {
        C28204u7 c28204u7 = this.f77930U0;
        if (c28204u7 != null) {
            c28204u7.m141839g();
        }
    }

    /* renamed from: sN */
    void m84706sN(C31980jc c31980jc) {
        if (c31980jc != null && c31980jc.m153825r() != null) {
            if (this.f77905A1 == null) {
                this.f77905A1 = new HashMap();
            }
            this.f77905A1.put(c31980jc.m153825r().f148138h, c31980jc.m153825r().f148138h);
        }
    }

    /* renamed from: sP */
    void m84707sP(C32123ta c32123ta) {
        if (m84718yN(c32123ta)) {
            m84700nO();
            this.f77930U0.m141840h(c32123ta);
        } else if (m84703qO(c32123ta)) {
            m84677GN();
        }
    }

    /* renamed from: tN */
    void m84708tN() {
        C32123ta c32123ta;
        int i11;
        try {
            C31980jc c31980jc = (C31980jc) this.f77951i1.get(this.f77928T0.getCurrentItem());
            if (c31980jc != null && (c32123ta = (C32123ta) c31980jc.f147031x.get(c31980jc.f147017B)) != null) {
                if (c32123ta.f148126b == 2) {
                    m84695eO();
                    C22021e0.m114963p().m114986i(c31980jc.f147023p, c32123ta.f148138h);
                    C22052u.m115085y().m115102v(c32123ta.f148138h);
                    m84689VN(c31980jc);
                    if (c32123ta.f148140i == 2) {
                        i11 = AbstractC8020f0.str_delete_story_video_success;
                    } else {
                        i11 = AbstractC8020f0.str_delete_story_photo_success;
                    }
                    ToastUtils.m89266n(i11, new Object[0]);
                    return;
                }
                m84690ZN();
                BaseStoryItemView m84681MN = m84681MN();
                if (m84681MN != null) {
                    m84681MN.m87713v(false);
                }
                mo46829Y();
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new C15107h(c31980jc, c32123ta));
                c0766k.mo1749u5(c32123ta.f148138h, 1);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: tP */
    boolean m84709tP(boolean z11) {
        C31980jc c31980jc;
        SparseArray sparseArray;
        m84680KP();
        m84721zP();
        int currentItem = this.f77928T0.getCurrentItem();
        List list = this.f77951i1;
        BaseStoryItemView baseStoryItemView = null;
        if (list != null && currentItem >= 0 && currentItem < list.size()) {
            c31980jc = (C31980jc) this.f77951i1.get(currentItem);
        } else {
            c31980jc = null;
        }
        C7286z8 c7286z8 = this.f77932V0;
        if (c7286z8 != null && (sparseArray = c7286z8.f39936x) != null) {
            baseStoryItemView = (BaseStoryItemView) sparseArray.get(currentItem);
        }
        m84694dO();
        m84625jO();
        if (c31980jc == null) {
            return false;
        }
        boolean z12 = true;
        if (!z11) {
            if (c31980jc.f147017B <= 0) {
                if (currentItem > 0) {
                    this.f77928T0.setCurrentItem(currentItem - 1, true);
                }
                z12 = false;
            } else {
                C18055a c18055a = this.f77908D1;
                if (c18055a != null && baseStoryItemView != null) {
                    c18055a.m95989n0(m84683NN(), baseStoryItemView.getLastBindStoryItem(), baseStoryItemView.getStoryMessageToSend(), true, true);
                }
                c31980jc.f147017B--;
                m84661vO();
                if (baseStoryItemView != null) {
                    m84691aO(c31980jc.m153825r(), baseStoryItemView);
                    m84706sN(c31980jc);
                }
                z12 = false;
            }
        } else {
            lm0 lm0Var = new Runnable() { // from class: com.zing.zalo.ui.zviews.lm0

                /* renamed from: q */
                public final /* synthetic */ C31980jc f81031q;

                /* renamed from: r */
                public final /* synthetic */ BaseStoryItemView f81032r;

                public /* synthetic */ lm0(C31980jc c31980jc2, BaseStoryItemView baseStoryItemView2) {
                    r2 = c31980jc2;
                    r3 = baseStoryItemView2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    StoryDetailsView.this.m84610eP(r2, r3);
                }
            };
            if (this.f77920P0 == 5) {
                m84671BN();
                lm0Var.run();
            } else if (c31980jc2.f147017B >= c31980jc2.f147031x.size() - 1) {
                if (!this.f77958p1 && this.f77920P0 != 3 && c31980jc2.m153825r() != null && !c31980jc2.m153825r().m155068H()) {
                    if (c31980jc2.f147019D) {
                        mo78950cq(m92651WI().getString(AbstractC8020f0.str_story_loading));
                    }
                    C15119t c15119t = new C15119t(lm0Var);
                    int i11 = this.f77920P0;
                    if (i11 != 0 && i11 != 4) {
                        C22021e0.m114963p().m114991n(c31980jc2.f147023p, this.f77920P0, c15119t);
                    } else {
                        C22021e0.m114963p().m114989l(c31980jc2.f147023p, c15119t);
                    }
                } else {
                    lm0Var.run();
                }
            } else {
                C18055a c18055a2 = this.f77908D1;
                if (c18055a2 != null && baseStoryItemView2 != null) {
                    c18055a2.m95989n0(m84683NN(), baseStoryItemView2.getLastBindStoryItem(), baseStoryItemView2.getStoryMessageToSend(), true, true);
                }
                c31980jc2.f147017B++;
                m84661vO();
                if (baseStoryItemView2 != null) {
                    m84691aO(c31980jc2.m153825r(), baseStoryItemView2);
                    m84717xP();
                    m84706sN(c31980jc2);
                }
            }
            z12 = false;
        }
        if (baseStoryItemView2 != null) {
            baseStoryItemView2.m87713v(false);
        }
        return z12;
    }

    /* renamed from: uN */
    boolean m84710uN() {
        return false;
    }

    /* renamed from: uP */
    void m84711uP(boolean z11) {
        m84713vP(z11, false);
    }

    /* renamed from: vN */
    public void m84712vN(InterfaceC21910a interfaceC21910a) {
        String str;
        try {
            int currentItem = this.f77928T0.getCurrentItem();
            C32123ta m153825r = ((C31980jc) this.f77951i1.get(currentItem)).m153825r();
            BaseStoryItemView baseStoryItemView = (BaseStoryItemView) this.f77932V0.f39936x.get(currentItem);
            if (baseStoryItemView != null && m153825r != null && (str = m153825r.f148138h) != null && str.equals(interfaceC21910a.mo46940d()) && !this.f77909E1) {
                baseStoryItemView.m87707n(interfaceC21910a, this);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: vP */
    void m84713vP(boolean z11, boolean z12) {
        SparseArray sparseArray;
        StoryViewPager storyViewPager;
        try {
            C7286z8 c7286z8 = this.f77932V0;
            if (c7286z8 != null && (sparseArray = c7286z8.f39936x) != null && sparseArray.size() > 0 && (storyViewPager = this.f77928T0) != null) {
                int currentItem = storyViewPager.getCurrentItem();
                if (this.f77951i1.size() > 0 && currentItem < this.f77951i1.size()) {
                    C31980jc c31980jc = (C31980jc) this.f77951i1.get(currentItem);
                    if (c31980jc.f147031x.size() > 0) {
                        if (c31980jc.m153825r() == null) {
                            c31980jc.f147017B = 0;
                        }
                        BaseStoryItemView m84681MN = m84681MN();
                        if (m84681MN != null && c31980jc.m153825r() != null && (!this.f77936X0.f131381h || z11)) {
                            m84691aO(((C31980jc) this.f77951i1.get(this.f77928T0.getCurrentItem())).m153825r(), m84681MN);
                        }
                    }
                }
            }
            if (this.f77955m1) {
                BaseStoryItemView m84681MN2 = m84681MN();
                if ((m84681MN2 instanceof StoryMineItemView) && m84681MN2.f83110a0 != null) {
                    ((StoryMineItemView) m84681MN2).m88123D0(3);
                }
                this.f77955m1 = false;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: wN */
    public void m84661vO() {
        m84716xN(true);
    }

    /* renamed from: wP */
    boolean m84715wP() {
        if (!m84720zN()) {
            return false;
        }
        if (m84681MN() == this.f77936X0.m141781g() && this.f77936X0.m141780f() != null) {
            m84693cO();
            return true;
        }
        m84711uP(false);
        return true;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        C32123ta m153825r;
        try {
            if (i11 == 28) {
                this.f77914J1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.pm0

                    /* renamed from: q */
                    public final /* synthetic */ Object[] f81613q;

                    public /* synthetic */ pm0(Object[] objArr2) {
                        r2 = objArr2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        StoryDetailsView.this.m84659uO(r2);
                    }
                });
            } else if (i11 == 41) {
                this.f77914J1.sendEmptyMessageDelayed(7, 400L);
            } else if (i11 == 6040) {
                BaseStoryItemView m84681MN = m84681MN();
                if (m84683NN() != null && m84681MN != null && (m153825r = m84683NN().m153825r()) != null && C26361j.f125215a.m135699e(m153825r) && this.f77907C1) {
                    m84681MN.m87704c0(C22640a.f111031a.mo117210a());
                    if (m153825r.f148140i == 2 && this.f77936X0.m141780f() != null && this.f77936X0.m141780f().f148138h.equals(m153825r.f148138h)) {
                        this.f77936X0.m141788p(m84546FP());
                    }
                }
            } else if (i11 == 60063) {
                if (objArr2.length >= 2) {
                    String str = (String) objArr2[0];
                    int intValue = ((Integer) objArr2[1]).intValue();
                    m84700nO();
                    C28204u7 c28204u7 = this.f77930U0;
                    if (c28204u7 != null) {
                        c28204u7.m141842k(str, intValue);
                    }
                }
            } else if (i11 == 60064) {
                Handler handler = this.f77914J1;
                if (handler != null) {
                    handler.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.qm0
                        public /* synthetic */ qm0() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            StoryDetailsView.this.m84693cO();
                        }
                    });
                }
            } else if (i11 == 60065) {
                Handler handler2 = this.f77914J1;
                if (handler2 != null) {
                    handler2.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.rm0
                        public /* synthetic */ rm0() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            StoryDetailsView.this.m84661vO();
                        }
                    });
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        C18587k c18587k = this.f77967y1;
        if (c18587k != null) {
            c18587k.m98119n0().m9219j(this, new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.hn0
                public /* synthetic */ hn0() {
                }

                @Override // androidx.lifecycle.InterfaceC1764d0
                /* renamed from: qp */
                public final void mo8524qp(Object obj) {
                    StoryDetailsView.this.m84587UO((List) obj);
                }
            });
        }
        C13306b c13306b = this.f77915K1;
        if (c13306b != null) {
            c13306b.m74687C((ViewGroup) this.f77924R0);
        }
    }

    /* renamed from: xN */
    public void m84716xN(boolean z11) {
        try {
            int currentItem = this.f77928T0.getCurrentItem();
            C31980jc c31980jc = (C31980jc) this.f77951i1.get(currentItem);
            C32123ta m153825r = c31980jc.m153825r();
            BaseStoryItemView baseStoryItemView = (BaseStoryItemView) this.f77932V0.f39936x.get(currentItem);
            if (baseStoryItemView != null) {
                if (z11) {
                    baseStoryItemView.mo87709q(c31980jc);
                }
                baseStoryItemView.m87708p(m153825r, C22640a.f111031a, new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.wm0

                    /* renamed from: q */
                    public final /* synthetic */ C32123ta f82535q;

                    /* renamed from: r */
                    public final /* synthetic */ BaseStoryItemView f82536r;

                    public /* synthetic */ wm0(C32123ta m153825r2, BaseStoryItemView baseStoryItemView2) {
                        r2 = m153825r2;
                        r3 = baseStoryItemView2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        StoryDetailsView.this.m84653rO(r2, r3, view);
                    }
                }, this.f77907C1);
                baseStoryItemView2.mo87710r(m153825r2);
                m84698iP(m153825r2);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: xP */
    void m84717xP() {
        C32123ta c32123ta;
        try {
            int currentItem = this.f77928T0.getCurrentItem();
            C31980jc c31980jc = (C31980jc) this.f77951i1.get(currentItem);
            if (c31980jc.f147017B + 1 < c31980jc.f147031x.size()) {
                c32123ta = (C32123ta) c31980jc.f147031x.get(c31980jc.f147017B + 1);
            } else {
                int i11 = currentItem + 1;
                if (i11 < this.f77951i1.size()) {
                    c32123ta = ((C31980jc) this.f77951i1.get(i11)).m153825r();
                } else {
                    c32123ta = null;
                }
            }
            if (c32123ta != null) {
                int i12 = c32123ta.f148140i;
                if (i12 == 2) {
                    if (!TextUtils.isEmpty(c32123ta.f148146l)) {
                        ((C23528a) this.f77950h1.m123612r(this.f77966x1)).m123618x(c32123ta.f148146l, C23278z2.m120105X0());
                    }
                } else {
                    if (i12 == 1 && !TextUtils.isEmpty(c32123ta.f148147m)) {
                        ((C23528a) this.f77950h1.m123612r(this.f77966x1)).m123618x(c32123ta.f148147m, C23278z2.m120099U0());
                    }
                    if (!TextUtils.isEmpty(c32123ta.f148146l)) {
                        ((C23528a) this.f77950h1.m123612r(this.f77966x1)).m123618x(c32123ta.f148146l, C23278z2.m120103W0());
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: yN */
    boolean m84718yN(C32123ta c32123ta) {
        try {
            BaseStoryItemView m84681MN = m84681MN();
            if (c32123ta != null && m84681MN != null && !m92692wK().mo35576n3() && this.f77920P0 != 5) {
                boolean m84703qO = m84703qO(c32123ta);
                boolean equals = c32123ta.f148136g.equals(CoreUtility.f89233i);
                boolean m87717z = m84681MN.m87717z();
                if (!m84703qO || !equals || m87717z) {
                    return false;
                }
                return true;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return false;
    }

    /* renamed from: yP */
    void m84719yP(String str, String str2, int i11, String str3) {
        if (C23055e5.m118272g(true)) {
            mo46829Y();
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C15114o());
            c0766k.mo1787ya(str, "11", str2, "", i11, str3);
            return;
        }
        m84715wP();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.m124114c().m124115b(this, 28);
        C23744a.m124114c().m124115b(this, 41);
        C23744a.m124114c().m124115b(this, 6040);
        C23744a.m124114c().m124115b(this, 60063);
        C23744a.m124114c().m124115b(this, 60064);
        C23744a.m124114c().m124115b(this, 60065);
    }

    /* renamed from: zN */
    boolean m84720zN() {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        BaseStoryItemView m84681MN = m84681MN();
        if (m84681MN instanceof StoryFriendItemView) {
            z11 = m84681MN.m87717z();
            z12 = m84681MN.m87686B();
            z13 = ((StoryFriendItemView) m84681MN).m88092o0();
        } else {
            z11 = false;
            z12 = false;
            z13 = false;
        }
        if (m84681MN instanceof StoryAdsItemView) {
            z13 = ((StoryAdsItemView) m84681MN).m88074x0();
        }
        C13306b c13306b = this.f77915K1;
        if (c13306b != null && c13306b.m74707p()) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (!m92672lJ() || m92664gJ() || z11 || z13 || this.f77948f1 != null || this.f77929T1 || z12 || z14) {
            return false;
        }
        return true;
    }

    /* renamed from: zP */
    void m84721zP() {
        this.f77923Q1 = false;
        this.f77918N1 = 0;
        this.f77919O1 = Long.MAX_VALUE;
        this.f77921P1 = 0L;
        this.f77914J1.removeMessages(1);
    }
}
