package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ag0.C0815e1;
import ag0.C0824j;
import am.AbstractC0939u;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.widget.SimpleAdapter;
import au.AbstractC2379w;
import bo.C3000l0;
import bo.C3003l3;
import bo.C3020p0;
import bo.C3060y1;
import bo.C3063z0;
import com.zing.zalo.AbstractC10919t;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.adapters.C7145n;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.feed.components.FeedItemZInstantLifecycleHelper;
import com.zing.zalo.feed.components.FeedMemoryPreview;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.uicontrols.FeedRecyclerView;
import com.zing.zalo.feed.utils.FeedActionZUtils;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.picker.location.LocationPickerView;
import com.zing.zalo.p077ui.picker.location.ShareLocationWithMapView;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.p077ui.widget.C13778s1;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.ShareMemoryView;
import com.zing.zalo.social.controls.AbstractC10875n;
import com.zing.zalo.social.controls.CustomMovementMethod;
import com.zing.zalo.social.controls.LikeContactItem;
import com.zing.zalo.social.widget.StatusComposeEditText;
import com.zing.zalo.tracking.actionlogv2.ActionLogChatLocation;
import com.zing.zalo.uicontrol.MenuListPopupView;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zinstant.C17244x0;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zview.DialogView;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import ho0.AbstractC20110a;
import is.AbstractC20826v0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import lk0.InterfaceC22508f;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import nh0.C23793c;
import org.json.JSONArray;
import org.json.JSONObject;
import p133ek.C18460c;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23304d;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p363nh.C23744a;
import p500s1.C26087b;
import p716zh.C31845ac;
import p716zh.C31890dc;
import p716zh.C32017m4;
import tn.C26747f0;
import tn.C26761p;
import tn.C26767v;
import vg.C28203u6;

/* loaded from: classes6.dex */
public class ShareMemoryView extends BaseUpdateStatusView implements InterfaceC0733x {

    /* renamed from: R1 */
    private static final double f77698R1 = (AbstractC23136l9.m118722k0() * 1.0d) / AbstractC23136l9.m118655I(AbstractC16802y.memory_feed_skeleton_height);

    /* renamed from: D1 */
    View f77699D1;

    /* renamed from: E1 */
    RobotoTextView f77700E1;

    /* renamed from: F1 */
    RobotoTextView f77701F1;

    /* renamed from: G1 */
    FeedMemoryPreview f77702G1;

    /* renamed from: I1 */
    TrackingSource f77704I1;

    /* renamed from: K1 */
    C3063z0 f77706K1;

    /* renamed from: L1 */
    C8009j f77707L1;

    /* renamed from: O1 */
    C3060y1 f77710O1;

    /* renamed from: P1 */
    boolean f77711P1;

    /* renamed from: H1 */
    boolean f77703H1 = true;

    /* renamed from: J1 */
    LinkedHashMap f77705J1 = new LinkedHashMap();

    /* renamed from: M1 */
    EnumC15073k f77708M1 = EnumC15073k.OFF;

    /* renamed from: N1 */
    AtomicInteger f77709N1 = new AtomicInteger();

    /* renamed from: Q1 */
    LocationPickerView.InterfaceC12771b f77712Q1 = new C15065c();

    /* loaded from: classes6.dex */
    public static class ShareMemoryFragmentDialog extends DialogView {

        /* renamed from: H0 */
        ShareMemoryView f77713H0;

        /* renamed from: I0 */
        InterfaceC17463d.d f77714I0 = new C15062a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.zviews.ShareMemoryView$ShareMemoryFragmentDialog$a */
        /* loaded from: classes6.dex */
        public class C15062a implements InterfaceC17463d.d {
            C15062a() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                try {
                    if (ShareMemoryFragmentDialog.this.m92642L3().getInt("id") == 1) {
                        if (interfaceC17463d != null) {
                            try {
                                interfaceC17463d.dismiss();
                            } catch (Exception e11) {
                                e11.printStackTrace();
                                return;
                            }
                        }
                        ShareMemoryView shareMemoryView = ShareMemoryFragmentDialog.this.f77713H0;
                        if (shareMemoryView != null) {
                            shareMemoryView.m84335FN(0, null);
                        }
                    }
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
            }
        }

        /* renamed from: WK */
        public static ShareMemoryFragmentDialog m84371WK(int i11, ShareMemoryView shareMemoryView) {
            ShareMemoryFragmentDialog shareMemoryFragmentDialog = new ShareMemoryFragmentDialog();
            shareMemoryFragmentDialog.m84372XK(shareMemoryView);
            Bundle bundle = new Bundle();
            bundle.putInt("id", i11);
            shareMemoryFragmentDialog.mo60305zK(bundle);
            return shareMemoryFragmentDialog;
        }

        @Override // com.zing.zalo.zview.DialogView
        /* renamed from: LK */
        public KeyEventCallbackC17462c mo13885LK(Bundle bundle) {
            try {
                if (this.f77713H0 == null) {
                    dismiss();
                    return super.mo13885LK(bundle);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            try {
                if (m92642L3().getInt("id") != 1) {
                    return null;
                }
                C8009j.a aVar = new C8009j.a(m92648SI());
                aVar.m43159h(7).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_discard_dialog_msg_general_v2)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_stay), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_leave), this.f77714I0);
                return aVar.m43152a();
            } catch (Exception e12) {
                e12.printStackTrace();
                return null;
            }
        }

        @Override // com.zing.zalo.zview.DialogView, com.zing.zalo.zview.dialog.InterfaceC17463d.e
        /* renamed from: Tv */
        public void mo12457Tv(InterfaceC17463d interfaceC17463d) {
            super.mo12457Tv(interfaceC17463d);
            ShareMemoryView shareMemoryView = this.f77713H0;
            if (shareMemoryView != null) {
                shareMemoryView.m78474Ka(0);
            }
        }

        /* renamed from: XK */
        void m84372XK(ShareMemoryView shareMemoryView) {
            this.f77713H0 = shareMemoryView;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ShareMemoryView$a */
    /* loaded from: classes6.dex */
    public class C15063a extends ClickableSpan {
        C15063a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            ShareMemoryView.this.m84353XN();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            try {
                if (C13778s1.m76960a()) {
                    textPaint.setTypeface(C13718q1.m76694c(MainApplication.getAppContext(), 7));
                } else {
                    textPaint.setTypeface(Typeface.DEFAULT_BOLD);
                }
                textPaint.setColor(MainApplication.getAppContext().getResources().getColor(AbstractC16801x.cMtxt2));
                textPaint.setUnderlineText(false);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ShareMemoryView$b */
    /* loaded from: classes6.dex */
    public class C15064b extends AbstractC10875n {
        C15064b(int i11, int i12) {
            super(i11, i12);
        }

        @Override // com.zing.zalo.social.controls.AbstractC10875n
        /* renamed from: e */
        public void mo56513e(View view, String str) {
            ShareMemoryView.this.m84359fO();
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            ShareMemoryView.this.m84358eO();
        }

        @Override // com.zing.zalo.social.controls.AbstractC10875n, android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            try {
                if (C13778s1.m76960a()) {
                    textPaint.setTypeface(C13718q1.m76694c(MainApplication.getAppContext(), 7));
                } else {
                    textPaint.setTypeface(Typeface.DEFAULT_BOLD);
                }
                textPaint.setColor(MainApplication.getAppContext().getResources().getColor(AbstractC16801x.cMtxt2));
                textPaint.setUnderlineText(false);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ShareMemoryView$c */
    /* loaded from: classes6.dex */
    class C15065c implements LocationPickerView.InterfaceC12771b {
        C15065c() {
        }

        @Override // com.zing.zalo.p077ui.picker.location.LocationPickerView.InterfaceC12771b
        /* renamed from: a */
        public void mo60384a(C18460c c18460c, String str, String str2, int i11, ActionLogChatLocation.FooterLogData footerLogData) {
            String str3;
            boolean z11;
            C3063z0 c3063z0;
            try {
                ShareMemoryView.this.m84336GN();
                if (!TextUtils.isEmpty(c18460c.f93021b)) {
                    str3 = c18460c.f93021b;
                } else if (!TextUtils.isEmpty(c18460c.f93022c)) {
                    str3 = c18460c.f93022c;
                } else {
                    str3 = "";
                }
                String str4 = str3;
                if (c18460c.f93025f != -1.0d && c18460c.f93026g != -1.0d && !TextUtils.isEmpty(str4)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ShareMemoryView shareMemoryView = ShareMemoryView.this;
                if (z11) {
                    c3063z0 = new C3063z0(c18460c.f93020a, c18460c.f93025f, c18460c.f93026g, str4, true);
                } else {
                    c3063z0 = null;
                }
                shareMemoryView.f77706K1 = c3063z0;
                ShareMemoryView.this.m84356aO();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.p077ui.picker.location.LocationPickerView.InterfaceC12771b
        /* renamed from: h */
        public void mo60385h() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.ShareMemoryView$d */
    /* loaded from: classes6.dex */
    public class ViewTreeObserverOnPreDrawListenerC15066d implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: com.zing.zalo.ui.zviews.ShareMemoryView$d$a */
        /* loaded from: classes6.dex */
        class a extends AnimatorListenerAdapter {
            a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                try {
                    ShareMemoryView.this.m84360gO(EnumC15072j.DECREASE);
                    ShareMemoryView shareMemoryView = ShareMemoryView.this;
                    if (shareMemoryView.f77708M1 == EnumC15073k.ON && shareMemoryView.f77709N1.get() == 0) {
                        ShareMemoryView shareMemoryView2 = ShareMemoryView.this;
                        shareMemoryView2.f72377Y0.m140546a0(shareMemoryView2.f72386h1, shareMemoryView2.f72375W0, shareMemoryView2.f72376X0, true);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        ViewTreeObserverOnPreDrawListenerC15066d() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            try {
                ShareMemoryView.this.f72375W0.getViewTreeObserver().removeOnPreDrawListener(this);
                if (ShareMemoryView.this.m78477NM()) {
                    ShareMemoryView.this.m84360gO(EnumC15072j.INCREASE);
                    int childCount = ShareMemoryView.this.f72375W0.getChildCount();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList = new ArrayList();
                    for (int i11 = childCount - 1; i11 >= 0; i11--) {
                        View childAt = ShareMemoryView.this.f72375W0.getChildAt(i11);
                        childAt.setTranslationX((-childAt.getLeft()) - childAt.getWidth());
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, "translationX", 0.0f);
                        ofFloat.setStartDelay((r1 - i11) * 50);
                        ofFloat.setDuration(300L);
                        arrayList.add(ofFloat);
                    }
                    animatorSet.playTogether(arrayList);
                    animatorSet.setInterpolator(new C26087b());
                    animatorSet.addListener(new a());
                    animatorSet.start();
                } else {
                    ShareMemoryView.this.f72375W0.clearAnimation();
                    ShareMemoryView shareMemoryView = ShareMemoryView.this;
                    shareMemoryView.f72375W0.startAnimation(AnimationUtils.loadAnimation(shareMemoryView.getContext(), AbstractC10919t.fade_in));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return true;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ShareMemoryView$e */
    /* loaded from: classes6.dex */
    class C15067e extends AnimatorListenerAdapter {
        C15067e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            try {
                ShareMemoryView.this.m84360gO(EnumC15072j.DECREASE);
                ShareMemoryView shareMemoryView = ShareMemoryView.this;
                if (shareMemoryView.f77708M1 == EnumC15073k.OFF) {
                    shareMemoryView.f72375W0.setVisibility(8);
                    ShareMemoryView.this.f77699D1.setVisibility(0);
                }
                for (int i11 = 0; i11 < ShareMemoryView.this.f72375W0.getChildCount(); i11++) {
                    ShareMemoryView.this.f72375W0.getChildAt(i11).setTranslationX(0.0f);
                }
                ShareMemoryView shareMemoryView2 = ShareMemoryView.this;
                if (shareMemoryView2.f77708M1 == EnumC15073k.ON && shareMemoryView2.f77709N1.get() == 0) {
                    ShareMemoryView shareMemoryView3 = ShareMemoryView.this;
                    shareMemoryView3.f72377Y0.m140546a0(shareMemoryView3.f72386h1, shareMemoryView3.f72375W0, shareMemoryView3.f72376X0, true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ShareMemoryView$f */
    /* loaded from: classes6.dex */
    public class C15068f implements FeedActionZUtils.InterfaceC8912j {

        /* renamed from: a */
        final /* synthetic */ List f77722a;

        C15068f(List list) {
            this.f77722a = list;
        }

        @Override // com.zing.zalo.feed.utils.FeedActionZUtils.InterfaceC8912j
        /* renamed from: a */
        public void mo47574a() {
        }

        @Override // com.zing.zalo.feed.utils.FeedActionZUtils.InterfaceC8912j
        /* renamed from: b */
        public void mo47575b() {
            try {
                ShareMemoryView.this.m84355ZN();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.feed.utils.FeedActionZUtils.InterfaceC8912j
        /* renamed from: c */
        public void mo47576c(List list) {
            int i11;
            try {
                this.f77722a.removeAll(list);
                PrivacyInfo.m45127K(this.f77722a);
                ShareMemoryView shareMemoryView = ShareMemoryView.this;
                if (this.f77722a.size() == 0) {
                    i11 = 40;
                } else {
                    i11 = 90;
                }
                shareMemoryView.m78492oN(i11, true);
                ShareMemoryView.this.m84355ZN();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ShareMemoryView$g */
    /* loaded from: classes6.dex */
    public class C15069g extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C3000l0 f77724a;

        /* renamed from: b */
        final /* synthetic */ String f77725b;

        C15069g(C3000l0 c3000l0, String str) {
            this.f77724a = c3000l0;
            this.f77725b = str;
        }

        /* renamed from: d */
        public /* synthetic */ void m84374d(C3000l0 c3000l0) {
            ShareMemoryView.this.mo78960q3();
            ShareMemoryView.this.m84337HN(c3000l0.f11895q);
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                C3020p0 m14322a0 = this.f77724a.m14322a0();
                if (m14322a0 != null && m14322a0.f12058q == 22 && m14322a0.f12023C != null) {
                    C26747f0.m137582I().m137664N0(m14322a0.f12023C.f12101J);
                }
                C7960e m41971c6 = C7960e.m41971c6();
                String str = AbstractC23304d.f113368c0.f42434r;
                C3000l0 c3000l0 = this.f77724a;
                m41971c6.m42073B7(str, c3000l0.f11895q, this.f77725b, c3000l0.m14339j0(), this.f77724a.m14341k0());
                C26767v.m137782d().m137783a(this.f77724a);
                C26761p.m137741q().m137753F(this.f77724a);
                ShareMemoryView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.kk0

                    /* renamed from: q */
                    public final /* synthetic */ C3000l0 f80918q;

                    public /* synthetic */ kk0(C3000l0 c3000l02) {
                        r2 = c3000l02;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ShareMemoryView.C15069g.this.m84374d(r2);
                    }
                });
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ShareMemoryView$h */
    /* loaded from: classes6.dex */
    class C15070h extends C7145n.g {
        C15070h() {
        }

        @Override // com.zing.zalo.adapters.C7145n.g, com.zing.zalo.adapters.C7145n.a
        /* renamed from: a */
        public void mo36357a(int i11) {
            ArrayList arrayList;
            try {
                if (i11 == 70) {
                    List list = PrivacyInfo.f45971u;
                    if (list != null && list.size() == 2) {
                        AbstractC23647d.m123906p("13441");
                    } else {
                        AbstractC23647d.m123906p("13440");
                    }
                    AbstractC23647d.m123893c();
                    ShareMemoryView.this.m78480TM(new ArrayList());
                    return;
                }
                if (i11 == 80) {
                    List list2 = PrivacyInfo.f45971u;
                    if (list2 != null && list2.size() == 2) {
                        AbstractC23647d.m123906p("13451");
                    } else {
                        AbstractC23647d.m123906p("13450");
                    }
                    AbstractC23647d.m123893c();
                    ShareMemoryView.this.m78487f4();
                    return;
                }
                if (i11 == 90) {
                    ArrayList arrayList2 = new ArrayList();
                    PrivacyInfo privacyInfo = PrivacyInfo.f45972v;
                    if (privacyInfo != null && (arrayList = privacyInfo.f45974q) != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            LikeContactItem likeContactItem = (LikeContactItem) it.next();
                            arrayList2.add(new InviteContactProfile(likeContactItem.m56333d(), likeContactItem.m56330a(), likeContactItem.m56331b()));
                        }
                    }
                    ShareMemoryView.this.m78479SM(arrayList2);
                    return;
                }
                ShareMemoryView.this.m78492oN(i11, false);
                ShareMemoryView.this.m78481U2();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.zing.zalo.adapters.C7145n.g, com.zing.zalo.adapters.C7145n.a
        /* renamed from: c */
        public void mo36359c(int i11) {
            try {
                AbstractC23647d.m123906p("13431");
                AbstractC23647d.m123893c();
                ShareMemoryView.this.m78480TM((ArrayList) PrivacyInfo.m45134q(i11).m45138e());
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ShareMemoryView$i */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C15071i {

        /* renamed from: a */
        static final /* synthetic */ int[] f77728a;

        static {
            int[] iArr = new int[EnumC15072j.values().length];
            f77728a = iArr;
            try {
                iArr[EnumC15072j.INCREASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f77728a[EnumC15072j.DECREASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ShareMemoryView$j */
    /* loaded from: classes6.dex */
    enum EnumC15072j {
        INCREASE,
        DECREASE
    }

    /* renamed from: com.zing.zalo.ui.zviews.ShareMemoryView$k */
    /* loaded from: classes6.dex */
    enum EnumC15073k {
        ON,
        OFF
    }

    /* renamed from: FN */
    public void m84335FN(int i11, Intent intent) {
        AbstractC2379w.m12430d(this.f72372T0);
        if (this.f72421L0.m92662fJ().m93009J0() > 0) {
            this.f72421L0.mo50035CK(i11, intent);
            this.f72421L0.finish();
        } else {
            m78491lN(MainTabView.class, new Bundle());
        }
    }

    /* renamed from: GN */
    public void m84336GN() {
        try {
            ZaloView m92996E0 = this.f72421L0.m92662fJ().m92996E0("location_picker_view_tag");
            if (m92996E0 instanceof ShareLocationChatPickerView) {
                ((ShareLocationChatPickerView) m92996E0).dismiss();
            } else if (m92996E0 instanceof ShareLocationWithMapView) {
                m92996E0.f88756W = 0;
                m92996E0.finish();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: HN */
    public void m84337HN(String str) {
        C23744a.m124114c().m124116d(22, str);
        m84335FN(-1, null);
    }

    /* renamed from: IN */
    private C3003l3 m84338IN() {
        InviteContactProfile inviteContactProfile;
        C3003l3 c3003l3 = new C3003l3();
        try {
            LinkedHashMap linkedHashMap = this.f77705J1;
            if (linkedHashMap != null && linkedHashMap.size() > 0) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                int i11 = 0;
                for (String str : this.f77705J1.keySet()) {
                    if (!TextUtils.isEmpty(str)) {
                        inviteContactProfile = (InviteContactProfile) this.f77705J1.get(str);
                    } else {
                        inviteContactProfile = null;
                    }
                    if (inviteContactProfile != null) {
                        linkedHashMap2.put(str, inviteContactProfile.m40383Q(true, false));
                    }
                    i11++;
                }
                c3003l3.f11957b = linkedHashMap2;
                c3003l3.f11956a = i11;
                c3003l3.f11960e = true;
                c3003l3.mo14398k();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return c3003l3;
    }

    /* renamed from: JN */
    private double m84339JN() {
        FeedMemoryPreview feedMemoryPreview = this.f77702G1;
        if (feedMemoryPreview != null) {
            return feedMemoryPreview.getPreviewViewRatio();
        }
        return (AbstractC23136l9.m118722k0() * 1.0d) / AbstractC23136l9.m118655I(AbstractC16802y.memory_feed_skeleton_height);
    }

    /* renamed from: KN */
    private String m84340KN() {
        LinkedHashMap linkedHashMap = this.f77705J1;
        if (linkedHashMap != null && linkedHashMap.size() != 0) {
            Iterator it = this.f77705J1.values().iterator();
            if (this.f77705J1.size() == 1) {
                return ((InviteContactProfile) it.next()).f42437s;
            }
            if (this.f77705J1.size() == 2) {
                return AbstractC23136l9.m118746s0(AbstractC8020f0.str_status_tagged_x_and_y, ((InviteContactProfile) it.next()).f42437s, ((InviteContactProfile) it.next()).f42437s);
            }
            return AbstractC23136l9.m118746s0(AbstractC8020f0.str_status_tagged_x_and_y_and_others, ((InviteContactProfile) it.next()).f42437s, ((InviteContactProfile) it.next()).f42437s, Integer.valueOf(this.f77705J1.size() - 2));
        }
        return null;
    }

    /* renamed from: LN */
    private void m84341LN(int i11, Intent intent) {
        if (i11 == -1 && intent != null) {
            try {
                this.f77706K1 = LocationPickerView.m71998dN(intent);
                m84356aO();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: MN */
    private void m84342MN(int i11, Intent intent) {
        if (i11 == -1 && intent != null) {
            try {
                if (intent.hasExtra("extra_selected_profiles")) {
                    ArrayList<InviteContactProfile> parcelableArrayListExtra = intent.getParcelableArrayListExtra("extra_selected_profiles");
                    this.f77705J1.clear();
                    if (parcelableArrayListExtra != null) {
                        for (InviteContactProfile inviteContactProfile : parcelableArrayListExtra) {
                            if (inviteContactProfile != null && !TextUtils.isEmpty(inviteContactProfile.f42434r)) {
                                inviteContactProfile.f42437s = AbstractC21935u.m114542i(inviteContactProfile.f42434r, inviteContactProfile.f42437s);
                                this.f77705J1.put(inviteContactProfile.f42434r, inviteContactProfile);
                            }
                        }
                    }
                    m84356aO();
                    mo78482XM();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: NN */
    private boolean m84343NN() {
        C3063z0 c3063z0 = this.f77706K1;
        if (c3063z0 != null && c3063z0.m14731j()) {
            return true;
        }
        return false;
    }

    /* renamed from: ON */
    private void m84344ON(View view) {
        FeedMemoryPreview feedMemoryPreview = (FeedMemoryPreview) view.findViewById(AbstractC6918a0.layout_feed_memory_preview);
        this.f77702G1 = feedMemoryPreview;
        feedMemoryPreview.m44402j(getContext());
        FeedItemZInstantLifecycleHelper.m44299a(getLifecycle(), this.f77702G1);
    }

    /* renamed from: PN */
    private void m84345PN(View view) {
        int i11;
        this.f77699D1 = view.findViewById(AbstractC6918a0.view_tag_location);
        this.f77700E1 = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_add_location);
        this.f77701F1 = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_tag_friend);
        this.f77700E1.setOnClickListener(this);
        RobotoTextView robotoTextView = this.f77700E1;
        if (this.f77703H1) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        robotoTextView.setVisibility(i11);
        this.f77701F1.setOnClickListener(this);
    }

    /* renamed from: QN */
    public /* synthetic */ void m84346QN(int i11, String str, C31890dc c31890dc) {
        try {
            if (i11 == 0 && c31890dc != null) {
                m78483YM(C31845ac.m152996J().m153035N());
                C31845ac.m152996J().m153074y0(this.f72372T0, c31890dc, true);
                m78488gN(c31890dc);
                m78486eN(c31890dc);
            } else {
                m78484ZM(false, false);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: RN */
    public /* synthetic */ void m84347RN(InterfaceC17463d interfaceC17463d, int i11) {
        C26761p.m137741q().m137755H();
        m84354YN();
        interfaceC17463d.dismiss();
    }

    /* renamed from: TN */
    public /* synthetic */ void m84349TN(SimpleAdapter simpleAdapter, InterfaceC17463d interfaceC17463d, int i11) {
        C8009j c8009j;
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        int intValue = ((Integer) ((HashMap) simpleAdapter.getItem(i11)).get("id")).intValue();
        if (intValue == AbstractC8020f0.str_remove_location_tag) {
            this.f77706K1 = null;
            m84356aO();
        } else if (intValue == AbstractC8020f0.str_continue_edit && (c8009j = this.f77707L1) != null) {
            c8009j.dismiss();
        }
    }

    /* renamed from: UN */
    private void m84350UN() {
        C17244x0 c17244x0;
        FeedMemoryPreview feedMemoryPreview;
        try {
            C3060y1 c3060y1 = this.f77710O1;
            InterfaceC22508f interfaceC22508f = null;
            if (c3060y1 != null) {
                c17244x0 = c3060y1.f12370d;
            } else {
                c17244x0 = null;
            }
            if (c17244x0 != null) {
                interfaceC22508f = c17244x0.m92064b();
            }
            if (interfaceC22508f != null && (feedMemoryPreview = this.f77702G1) != null) {
                feedMemoryPreview.setFeedMemoryId(this.f77710O1.f12368b);
                this.f77702G1.setLayoutRatio(f77698R1);
                this.f77702G1.m44401h(interfaceC22508f);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: VN */
    private void m84351VN() {
        m78483YM(C31845ac.m152996J().m153035N());
        C31890dc m78498vM = m78498vM();
        if (m78498vM == null) {
            m78498vM = C31845ac.m152996J().m153043V(m78500xM());
        }
        if (m78498vM == null) {
            m78498vM = C31845ac.m152996J().m153044X();
        }
        m78486eN(m78498vM);
        C31845ac.m152996J().m153057o0(m78498vM.f146495a, new C31845ac.e() { // from class: com.zing.zalo.ui.zviews.gk0
            public /* synthetic */ gk0() {
            }

            @Override // p716zh.C31845ac.e
            /* renamed from: a */
            public final void mo39491a(int i11, String str, C31890dc c31890dc) {
                ShareMemoryView.this.m84346QN(i11, str, c31890dc);
            }
        });
    }

    /* renamed from: WN */
    private void m84352WN() {
        String str;
        try {
            ArrayList<C3000l0> m137786e = C26767v.m137782d().m137786e();
            long mo124311f = C23793c.m124316k().mo124311f();
            JSONArray jSONArray = new JSONArray();
            if (m137786e != null) {
                for (C3000l0 c3000l0 : m137786e) {
                    if (c3000l0 != null && c3000l0.m14322a0() != null) {
                        JSONObject jSONObject = new JSONObject();
                        if (c3000l0.m14322a0().m14488S()) {
                            str = "1";
                        } else {
                            str = "0";
                        }
                        jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, str);
                        jSONObject.put("time_in_queue", Math.round(((float) (mo124311f - c3000l0.m14322a0().f12062u)) / 3600000.0f));
                        jSONArray.put(jSONObject);
                    }
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("size", jSONArray.length());
            jSONObject2.put("local_feeds", jSONArray);
            C0815e1.m2075D().m2100V(new C23648e(57, "form_post_feed", 0, "post_feed_with_queue_local", jSONObject2.toString()), false);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: XN */
    public void m84353XN() {
        try {
            if (this.f72384f1) {
                AbstractC2379w.m12430d(this.f72372T0);
            }
            if (this.f72421L0.m92648SI() != null) {
                Bundle m83056qM = ProfilePickerView.m83056qM(new ArrayList(this.f77705J1.values()), 20, AbstractC23136l9.m118743r0(AbstractC8020f0.profile_picker_tag_activity_title));
                m83056qM.putBoolean("extra_show_text_instead_icon", true);
                m83056qM.putBoolean("allow_empty_pick", true);
                this.f72421L0.m92662fJ().m93066i2(ProfilePickerView.class, m83056qM, 201, 1, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: YN */
    private void m84354YN() {
        PrivacyInfo privacyInfo = this.f72392n1;
        if (privacyInfo != null && privacyInfo.f45973p == 3 && this.f77705J1 != null) {
            List m45138e = privacyInfo.m45138e();
            FeedActionZUtils.m47513A(m45138e, m84338IN().f11957b, this, new C15068f(m45138e));
        } else {
            m84355ZN();
        }
    }

    /* renamed from: ZN */
    public void m84355ZN() {
        C17244x0 c17244x0;
        String str;
        int i11;
        C31890dc m153044X;
        if (this.f77711P1) {
            return;
        }
        m84352WN();
        if (C26761p.m137741q().m137768s()) {
            m84369cO();
            return;
        }
        C3060y1 c3060y1 = this.f77710O1;
        if (c3060y1 != null) {
            c17244x0 = c3060y1.f12370d;
        } else {
            c17244x0 = null;
        }
        C17244x0 c17244x02 = c17244x0;
        if (c3060y1 != null) {
            str = c3060y1.f12368b;
        } else {
            str = "";
        }
        String str2 = str;
        if (c3060y1 != null) {
            i11 = c3060y1.f12369c;
        } else {
            i11 = 0;
        }
        if (c17244x02 != null && !TextUtils.isEmpty(str2)) {
            this.f77711P1 = true;
            AbstractC2379w.m12430d(this.f72372T0);
            String m78496tM = m78496tM();
            if (this.f72387i1 != null && !TextUtils.isEmpty(m78496tM)) {
                m153044X = this.f72387i1;
            } else {
                m153044X = C31845ac.m152996J().m153044X();
            }
            m84357bO(C3000l0.m14279y(m78496tM, str2, i11, c17244x02, m84338IN(), this.f77706K1, this.f72392n1, m153044X.f146495a, m84339JN(), C32017m4.m154326S().m154336H(this.f72368P0), ""));
        }
    }

    /* renamed from: aO */
    public void m84356aO() {
        String str;
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String m84340KN = m84340KN();
            boolean m84343NN = m84343NN();
            if (m84340KN != null && !m84343NN) {
                str = AbstractC23136l9.m118746s0(AbstractC8020f0.str_status_tagged_with, m84340KN);
            } else if (m84340KN == null && m84343NN) {
                str = AbstractC23136l9.m118746s0(AbstractC8020f0.str_status_tagged_at, this.f77706K1.m14727f());
            } else if (m84340KN != null && m84343NN) {
                str = AbstractC23136l9.m118746s0(AbstractC8020f0.str_status_tagged_with_at, m84340KN, this.f77706K1.m14727f());
            } else {
                str = null;
            }
            if (str != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(" — ");
                spannableStringBuilder2.append((CharSequence) str);
                spannableStringBuilder2.setSpan(new StatusComposeEditText.TagColorSpan(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.cMtxt5)), 0, spannableStringBuilder2.length(), 33);
                if (m84340KN != null) {
                    int indexOf = spannableStringBuilder2.toString().indexOf(m84340KN);
                    int length = m84340KN.length() + indexOf;
                    spannableStringBuilder2.setSpan(new StyleSpan(0), indexOf, length, 33);
                    spannableStringBuilder2.setSpan(new C15063a(), indexOf, length, 33);
                }
                if (m84343NN) {
                    int indexOf2 = spannableStringBuilder2.toString().indexOf(this.f77706K1.m14727f());
                    int length2 = this.f77706K1.m14727f().length() + indexOf2;
                    spannableStringBuilder2.setSpan(new StyleSpan(0), indexOf2, length2, 33);
                    spannableStringBuilder2.setSpan(new C15064b(indexOf2, length2), indexOf2, length2, 33);
                }
                spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
            }
            if (spannableStringBuilder.length() > 0) {
                this.f72373U0.setMovementMethod(CustomMovementMethod.m56305e());
                this.f72373U0.setVisibility(0);
                this.f72373U0.setText(spannableStringBuilder);
                return;
            }
            this.f72373U0.setVisibility(8);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: bO */
    private void m84357bO(C3000l0 c3000l0) {
        boolean z11;
        if (c3000l0 != null) {
            try {
                c3000l0.f11869R = MainApplication.getAppContext().getString(AbstractC8020f0.profile_today);
                if (this.f72393o1 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                c3000l0.f11868Q = z11;
                C0824j.m2153b(new C15069g(c3000l0, AbstractC20826v0.m108827p(c3000l0).toString()));
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: eO */
    public void m84358eO() {
        try {
            AbstractC2379w.m12430d(this.f72372T0);
            SensitiveData sensitiveData = new SensitiveData("timeline_post_compose_location", "social_timeline");
            ShareLocationWithMapView shareLocationWithMapView = new ShareLocationWithMapView();
            shareLocationWithMapView.m72065nM(this.f77712Q1);
            Bundle bundle = new Bundle();
            bundle.putInt("EXTRA_MODE_LIVE_LOCATION", 0);
            shareLocationWithMapView.mo60305zK(bundle);
            shareLocationWithMapView.m72061jM(sensitiveData);
            shareLocationWithMapView.m72060iM(this.f72421L0.getContext());
            shareLocationWithMapView.mo60305zK(bundle);
            this.f72421L0.m92662fJ().mo89693h2(shareLocationWithMapView, "location_picker_view_tag", 1, true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: fO */
    public void m84359fO() {
        try {
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = new HashMap();
            hashMap.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.str_remove_location_tag));
            hashMap.put("id", Integer.valueOf(AbstractC8020f0.str_remove_location_tag));
            arrayList.add(hashMap);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("name", AbstractC23136l9.m118743r0(AbstractC8020f0.str_continue_edit));
            hashMap2.put("id", Integer.valueOf(AbstractC8020f0.str_continue_edit));
            arrayList.add(hashMap2);
            SimpleAdapter simpleAdapter = new SimpleAdapter(this.f72421L0.m92648SI(), arrayList, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
            C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
            aVar.m43155d(true);
            aVar.m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.jk0

                /* renamed from: q */
                public final /* synthetic */ SimpleAdapter f80799q;

                public /* synthetic */ jk0(SimpleAdapter simpleAdapter2) {
                    r2 = simpleAdapter2;
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    ShareMemoryView.this.m84349TN(r2, interfaceC17463d, i11);
                }
            });
            C8009j m43152a = aVar.m43152a();
            this.f77707L1 = m43152a;
            if (m43152a != null && !m43152a.m92868m()) {
                this.f77707L1.mo13822K();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: gO */
    public int m84360gO(EnumC15072j enumC15072j) {
        int i11 = C15071i.f77728a[enumC15072j.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                if (this.f77709N1.get() > 0) {
                    return this.f77709N1.decrementAndGet();
                }
                this.f77709N1.set(0);
            }
        } else if (this.f77709N1.get() <= 0) {
            this.f77709N1.set(1);
        } else {
            return this.f77709N1.incrementAndGet();
        }
        return this.f77709N1.get();
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseUpdateStatusView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BaseUpdateStatusView
    /* renamed from: CM */
    public void mo78472CM(Bundle bundle) {
        String str;
        String str2;
        super.mo78472CM(bundle);
        if (bundle != null) {
            String string = bundle.getString("extra_tracking_source", "");
            if (!string.isEmpty()) {
                this.f77704I1 = new TrackingSource(string);
            } else {
                this.f77704I1 = new TrackingSource(0);
            }
            String string2 = bundle.getString("uid");
            if (!TextUtils.isEmpty(string2)) {
                ContactProfile m141809c = C28203u6.f131407a.m141809c(string2);
                this.f72393o1 = m141809c;
                if (m141809c == null) {
                    ContactProfile contactProfile = new ContactProfile(string2);
                    this.f72393o1 = contactProfile;
                    if (!bundle.containsKey("avt")) {
                        str = "";
                    } else {
                        str = bundle.getString("avt");
                    }
                    contactProfile.f42446v = str;
                    ContactProfile contactProfile2 = this.f72393o1;
                    if (!bundle.containsKey("dpn")) {
                        str2 = "";
                    } else {
                        str2 = bundle.getString("dpn");
                    }
                    contactProfile2.f42437s = str2;
                }
            }
            String string3 = bundle.getString("memory_entry_attachment", "");
            if (!TextUtils.isEmpty(string3)) {
                try {
                    this.f77710O1 = new C3060y1(new JSONObject(string3));
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseUpdateStatusView, com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BaseUpdateStatusView
    /* renamed from: KM */
    public void mo78473KM(View view) {
        super.mo78473KM(view);
        m84345PN(view);
        m84344ON(view);
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseUpdateStatusView
    /* renamed from: LM */
    protected boolean mo78475LM() {
        return true;
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseUpdateStatusView, com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseUpdateStatusView, com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == AbstractC6918a0.menu_next) {
            AbstractC2379w.m12430d(this.f72372T0);
            m84354YN();
            return true;
        }
        if (i11 == 16908332) {
            mo78494qM();
            return true;
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseUpdateStatusView, com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        String m14727f;
        super.mo37118SJ(bundle);
        LinkedHashMap linkedHashMap = this.f77705J1;
        if (linkedHashMap != null && !linkedHashMap.isEmpty()) {
            bundle.putParcelableArrayList("saved_tag_profiles", new ArrayList<>(this.f77705J1.values()));
        }
        C3063z0 c3063z0 = this.f77706K1;
        String str = "";
        if (c3063z0 != null && c3063z0.m14731j()) {
            bundle.putDouble("saved_location_longitude", this.f77706K1.m153170b());
            bundle.putDouble("saved_location_latitude", this.f77706K1.m153169a());
            if (this.f77706K1.m14727f() == null) {
                m14727f = "";
            } else {
                m14727f = this.f77706K1.m14727f();
            }
            bundle.putString("saved_location_des", m14727f);
            String str2 = this.f77706K1.f12383h;
            if (str2 == null) {
                str2 = "";
            }
            bundle.putString("saved_location_id", str2);
        }
        C3060y1 c3060y1 = this.f77710O1;
        if (c3060y1 != null) {
            str = c3060y1.m14711c().toString();
        }
        bundle.putString("saved_memory_entry_attachment", str);
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseUpdateStatusView
    /* renamed from: XM */
    protected void mo78482XM() {
        String m118743r0;
        String m118743r02;
        String m118743r03;
        PrivacyInfo privacyInfo = this.f72392n1;
        String str = "";
        int i11 = -1;
        if (privacyInfo != null) {
            if (this.f72393o1 != null) {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_privacy_to_friend_count_title);
                i11 = AbstractC16803z.icn_profile_form_selected_friends;
                str = this.f72392n1.f45975r;
                if (this.f77705J1.size() > 0) {
                    str = str + " (+)";
                }
            } else {
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
                            if (this.f77705J1.size() > 0) {
                                m118743r03 = m118743r03 + " (+)";
                            }
                        }
                    } else {
                        m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_privacy_share_only_me_title);
                        i11 = AbstractC16803z.icn_profile_form_private;
                        m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_privacy_share_only_me_new);
                        if (this.f77705J1.size() > 0) {
                            m118743r03 = m118743r03 + " (+)";
                        }
                    }
                } else {
                    m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_privacy_share_all_title);
                    i11 = AbstractC16803z.icn_profile_form_friends;
                    m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_privacy_share_all_new);
                }
                String str2 = m118743r02;
                str = m118743r03;
                m118743r0 = str2;
            }
        } else {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_privacy);
        }
        m78495rN(m118743r0, str, i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BaseUpdateStatusView
    /* renamed from: bN */
    public void mo78485bN(Bundle bundle) {
        ArrayList parcelableArrayList;
        if (bundle == null) {
            return;
        }
        super.mo78485bN(bundle);
        try {
            this.f77705J1.clear();
            if (bundle.containsKey("saved_tag_profiles") && (parcelableArrayList = bundle.getParcelableArrayList("saved_tag_profiles")) != null && parcelableArrayList.size() > 0) {
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    InviteContactProfile inviteContactProfile = (InviteContactProfile) it.next();
                    if (inviteContactProfile != null && !TextUtils.isEmpty(inviteContactProfile.f42434r)) {
                        this.f77705J1.put(inviteContactProfile.f42434r, inviteContactProfile);
                    }
                }
            }
            double d11 = bundle.getDouble("saved_location_longitude", -1.0d);
            double d12 = bundle.getDouble("saved_location_latitude", -1.0d);
            String string = bundle.getString("saved_location_id", "");
            String string2 = bundle.getString("saved_location_des", "");
            if (d11 != -1.0d || d12 != -1.0d || !TextUtils.isEmpty(string2)) {
                this.f77706K1 = new C3063z0(string, d11, d12, string2, true);
            }
            m84356aO();
            String string3 = bundle.getString("saved_memory_entry_attachment", "");
            if (!TextUtils.isEmpty(string3)) {
                this.f77710O1 = new C3060y1(new JSONObject(string3));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: cO */
    protected void m84369cO() {
        new C16972e0.a(m92689tK()).m90949z(AbstractC23136l9.m118746s0(AbstractC8020f0.str_notif_max_async_feed_new, Integer.valueOf(C26761p.m137741q().m137750B()))).m90932i(C16972e0.b.DIALOG_INFORMATION).m90942s(AbstractC8020f0.str_max_async_feed_continue_btn, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.hk0
            public /* synthetic */ hk0() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                ShareMemoryView.this.m84347RN(interfaceC17463d, i11);
            }
        }).m90933j(AbstractC8020f0.str_max_async_feed_no_btn, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.ik0
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                interfaceC17463d.dismiss();
            }
        }).m90927d().mo13822K();
    }

    /* renamed from: dO */
    public void m84370dO(int i11) {
        try {
            ShareMemoryFragmentDialog m84371WK = ShareMemoryFragmentDialog.m84371WK(i11, this);
            if (m84371WK.m92687sJ()) {
                m84371WK.dismiss();
            }
            m84371WK.mo83093TK(this.f72421L0.m92649TI());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ShareMemoryView";
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseUpdateStatusView
    /* renamed from: iN */
    protected void mo78489iN(boolean z11, boolean z12) {
        int i11;
        EnumC15073k enumC15073k;
        int i12 = 8;
        try {
            if (z12) {
                if (z11) {
                    enumC15073k = EnumC15073k.ON;
                } else {
                    enumC15073k = EnumC15073k.OFF;
                }
                this.f77708M1 = enumC15073k;
                if (z11) {
                    this.f72375W0.setVisibility(0);
                    this.f77699D1.setVisibility(8);
                    this.f72375W0.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC15066d());
                } else {
                    m84360gO(EnumC15072j.INCREASE);
                    int childCount = this.f72375W0.getChildCount();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList = new ArrayList();
                    for (int i13 = 0; i13 < childCount; i13++) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f72375W0.getChildAt(i13), "translationX", (-r4.getLeft()) - r4.getWidth());
                        ofFloat.setStartDelay(i13 * 50);
                        ofFloat.setDuration(300L);
                        arrayList.add(ofFloat);
                    }
                    animatorSet.playTogether(arrayList);
                    animatorSet.setInterpolator(new C26087b());
                    animatorSet.addListener(new C15067e());
                    animatorSet.start();
                }
            } else {
                FeedRecyclerView feedRecyclerView = this.f72375W0;
                if (z11) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                feedRecyclerView.setVisibility(i11);
                View view = this.f77699D1;
                if (!z11) {
                    i12 = 0;
                }
                view.setVisibility(i12);
            }
            this.f72389k1 = z11;
            m78493pN(this.f72388j1);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseUpdateStatusView
    /* renamed from: kN */
    protected void mo78490kN() {
        try {
            if (m78476MM()) {
                return;
            }
            MenuListPopupView m87745oL = MenuListPopupView.m87745oL(getContext(), mo78475LM(), this.f72392n1, new C15070h(), mo78502zM());
            this.f72394p1 = m87745oL;
            if (m87745oL != null) {
                m87745oL.m92602UK(this.f72421L0.m92649TI(), "MenuListPopupView");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseUpdateStatusView, com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        try {
            if (i11 != 200) {
                if (i11 == 201) {
                    m84342MN(i12, intent);
                }
            } else {
                m84341LN(i12, intent);
            }
            super.onActivityResult(i11, i12, intent);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseUpdateStatusView, android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.tv_add_location) {
            m84358eO();
        } else if (id2 == AbstractC6918a0.tv_tag_friend) {
            m84353XN();
        } else {
            super.onClick(view);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseUpdateStatusView
    /* renamed from: qM */
    protected void mo78494qM() {
        m84370dO(1);
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseUpdateStatusView
    /* renamed from: uM */
    protected int mo78497uM() {
        return 7;
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseUpdateStatusView
    /* renamed from: wM */
    public int mo78499wM() {
        return AbstractC7409c0.share_memory_view;
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseUpdateStatusView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        m84351VN();
        m84350UN();
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseUpdateStatusView
    /* renamed from: yM */
    protected String mo78501yM() {
        return AbstractC23136l9.m118743r0(AbstractC8020f0.str_menu_item_share);
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseUpdateStatusView
    /* renamed from: zM */
    protected int mo78502zM() {
        LinkedHashMap linkedHashMap = this.f77705J1;
        if (linkedHashMap != null) {
            return linkedHashMap.size();
        }
        return 0;
    }
}
