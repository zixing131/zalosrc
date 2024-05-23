package com.zing.zalo.feed.mvp.feed.view.component;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.AbstractC1673g;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.AbstractC1803x;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.feed.mvp.feed.view.component.OnboardingMoveTabBottomSheet;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.zdesign.component.Avatar;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC17017m;
import com.zing.zalo.zdesign.component.avatar.C16948d;
import com.zing.zalo.zdesign.component.avatar.EnumC16949e;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import is.C20832y0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import me0.AbstractC23136l9;
import mj0.AbstractC23322a;
import p649xl.AbstractC29783e9;
import p723zo.C32522a;
import p723zo.C32523b;
import p723zo.C32531j;
import p723zo.EnumC32524c;
import p723zo.InterfaceC32526e;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import ui0.C27280g;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* loaded from: classes4.dex */
public final class OnboardingMoveTabBottomSheet extends BottomSheet {

    /* renamed from: b1 */
    private AbstractC29783e9 f46283b1;

    /* renamed from: c1 */
    private String f46284c1 = "";

    /* renamed from: d1 */
    private String f46285d1 = "";

    /* renamed from: e1 */
    private String f46286e1 = "";

    /* renamed from: f1 */
    private boolean f46287f1;

    /* renamed from: com.zing.zalo.feed.mvp.feed.view.component.OnboardingMoveTabBottomSheet$a */
    /* loaded from: classes4.dex */
    static final class C8570a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f46288t;

        C8570a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C8570a(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f46288t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC32526e m157495a = C32531j.f150273a.m157495a();
                EnumC32524c enumC32524c = EnumC32524c.f150247p;
                this.f46288t = 1;
                obj = m157495a.mo157490a(enumC32524c, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type com.zing.zalo.feed.mvp.feed.view.component.datatransfer.BottomSheetEventManager.OnboardingConfirmMoveTabRequest");
            C32522a c32522a = (C32522a) obj;
            OnboardingMoveTabBottomSheet.this.m45681OL(c32522a.m157487d());
            OnboardingMoveTabBottomSheet.this.m45679ML(c32522a.m157485b());
            OnboardingMoveTabBottomSheet.this.m45680NL(c32522a.m157486c());
            OnboardingMoveTabBottomSheet.this.m45678PL();
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C8570a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: KL */
    private final void m45676KL() {
        this.f46287f1 = true;
        close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LL */
    public static final void m45677LL(OnboardingMoveTabBottomSheet onboardingMoveTabBottomSheet, View view) {
        AbstractC19074t.m100208f(onboardingMoveTabBottomSheet, "this$0");
        onboardingMoveTabBottomSheet.m45676KL();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PL */
    public final void m45678PL() {
        AbstractC29783e9 abstractC29783e9 = this.f46283b1;
        AbstractC29783e9 abstractC29783e92 = null;
        if (abstractC29783e9 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29783e9 = null;
        }
        abstractC29783e9.f137672P.m90478m(new C16948d(1, this.f46284c1, this.f46286e1, this.f46285d1));
        String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_onboarding_move_tab_title, this.f46286e1);
        AbstractC19074t.m100207e(m118746s0, "getString(...)");
        int m118722k0 = AbstractC23136l9.m118722k0() - (AbstractC23136l9.m118742r(24.0f) * 2);
        C20832y0 c20832y0 = C20832y0.f102396a;
        AbstractC29783e9 abstractC29783e93 = this.f46283b1;
        if (abstractC29783e93 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29783e93 = null;
        }
        float textSize = abstractC29783e93.f137678V.getTextSize();
        AbstractC29783e9 abstractC29783e94 = this.f46283b1;
        if (abstractC29783e94 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29783e94 = null;
        }
        Context context = abstractC29783e94.getRoot().getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        String m108877e = c20832y0.m108877e(new C20832y0.a(m118746s0, textSize, C13718q1.m76694c(context, 7)), this.f46286e1, m118722k0, 2, C20832y0.b.f102402q);
        AbstractC29783e9 abstractC29783e95 = this.f46283b1;
        if (abstractC29783e95 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            abstractC29783e92 = abstractC29783e95;
        }
        abstractC29783e92.f137678V.setText(m108877e);
    }

    /* renamed from: ML */
    public final void m45679ML(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f46285d1 = str;
    }

    /* renamed from: NL */
    public final void m45680NL(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f46286e1 = str;
    }

    /* renamed from: OL */
    public final void m45681OL(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f46284c1 = str;
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    public void close() {
        C32531j.f150273a.m157495a().mo157491c(new C32523b(this.f46284c1, this.f46287f1));
        super.close();
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        if (linearLayout == null) {
            return;
        }
        m90533zL(EnumC17017m.HUG_CONTENT);
        ViewDataBinding m8554e = AbstractC1673g.m8554e(layoutInflater, AbstractC7409c0.onboarding_move_tab_bottom_sheet_layout, linearLayout, true);
        AbstractC19074t.m100207e(m8554e, "inflate(...)");
        AbstractC29783e9 abstractC29783e9 = (AbstractC29783e9) m8554e;
        this.f46283b1 = abstractC29783e9;
        if (abstractC29783e9 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29783e9 = null;
        }
        Avatar avatar = abstractC29783e9.f137672P;
        Context context = linearLayout.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        avatar.m90481x(context, EnumC16949e.SIZE_96);
        AbstractC29783e9 abstractC29783e92 = this.f46283b1;
        if (abstractC29783e92 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29783e92 = null;
        }
        abstractC29783e92.f137673Q.setIdTracking("bottom_sheet_confirm_move_tab_other");
        AbstractC29783e9 abstractC29783e93 = this.f46283b1;
        if (abstractC29783e93 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29783e93 = null;
        }
        abstractC29783e93.f137673Q.m90539c(AbstractC2814h.ButtonLarge_Tertiary);
        AbstractC29783e9 abstractC29783e94 = this.f46283b1;
        if (abstractC29783e94 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29783e94 = null;
        }
        abstractC29783e94.f137673Q.setOnClickListener(new View.OnClickListener() { // from class: yo.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OnboardingMoveTabBottomSheet.m45677LL(OnboardingMoveTabBottomSheet.this, view);
            }
        });
        AbstractC29783e9 abstractC29783e95 = this.f46283b1;
        if (abstractC29783e95 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29783e95 = null;
        }
        ImageView imageView = abstractC29783e95.f137675S;
        MainApplication.C6895a c6895a = MainApplication.Companion;
        imageView.setImageDrawable(C27280g.m139660c(c6895a.m35500c(), AbstractC23322a.zds_ic_clock_2_line_24, AbstractC2807a.icon_02));
        AbstractC29783e9 abstractC29783e96 = this.f46283b1;
        if (abstractC29783e96 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29783e96 = null;
        }
        abstractC29783e96.f137676T.setImageDrawable(C27280g.m139660c(c6895a.m35500c(), AbstractC23322a.zds_ic_notif_off_line_24, AbstractC2807a.icon_02));
        AbstractC29783e9 abstractC29783e97 = this.f46283b1;
        if (abstractC29783e97 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29783e97 = null;
        }
        abstractC29783e97.f137674R.setImageDrawable(C27280g.m139660c(c6895a.m35500c(), AbstractC23322a.zds_ic_posts_move_solid_24, AbstractC16781w.AvatarCornerIconColor));
        BuildersKt__Builders_commonKt.m112540d(AbstractC1803x.m9388a(this), null, null, new C8570a(null), 3, null);
    }
}
