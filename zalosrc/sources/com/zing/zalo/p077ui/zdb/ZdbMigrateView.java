package com.zing.zalo.p077ui.zdb;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1764d0;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.lottie.LottieConfig;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zlottie.widget.LottieImageView;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.InterfaceC19066n;
import ho0.AbstractC20110a;
import me0.AbstractC23152n3;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import p494rv.C25979a;
import p645xh.C29628e;
import p649xl.AbstractC29988pg;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import ti0.C26705d;
import ti0.C26708g;
import vg.AbstractC28207v1;

/* loaded from: classes6.dex */
public final class ZdbMigrateView extends BaseZaloView implements View.OnClickListener {

    /* renamed from: M0 */
    private AbstractC29988pg f72048M0;

    /* renamed from: N0 */
    private final InterfaceC24854k f72049N0 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(ZdbMigrateViewModel.class), new C14016h(new C14015g(this)), null);

    /* renamed from: com.zing.zalo.ui.zdb.ZdbMigrateView$a */
    /* loaded from: classes6.dex */
    static final class C14009a extends AbstractC19075u implements InterfaceC18505l {
        C14009a() {
            super(1);
        }

        /* renamed from: a */
        public final void m77946a(Boolean bool) {
            AbstractC19074t.m100205c(bool);
            if (bool.booleanValue()) {
                ZdbMigrateView.this.finish();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m77946a((Boolean) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zdb.ZdbMigrateView$b */
    /* loaded from: classes6.dex */
    static final class C14010b extends AbstractC19075u implements InterfaceC18505l {
        C14010b() {
            super(1);
        }

        /* renamed from: a */
        public final void m77947a(Boolean bool) {
            AbstractC19074t.m100205c(bool);
            AbstractC29988pg abstractC29988pg = null;
            if (bool.booleanValue()) {
                AbstractC29988pg abstractC29988pg2 = ZdbMigrateView.this.f72048M0;
                if (abstractC29988pg2 == null) {
                    AbstractC19074t.m100223u("binding");
                    abstractC29988pg2 = null;
                }
                abstractC29988pg2.f139048S.setVisibility(0);
                AbstractC29988pg abstractC29988pg3 = ZdbMigrateView.this.f72048M0;
                if (abstractC29988pg3 == null) {
                    AbstractC19074t.m100223u("binding");
                    abstractC29988pg3 = null;
                }
                abstractC29988pg3.f139049T.setVisibility(8);
                AbstractC29988pg abstractC29988pg4 = ZdbMigrateView.this.f72048M0;
                if (abstractC29988pg4 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    abstractC29988pg = abstractC29988pg4;
                }
                abstractC29988pg.f139047R.m92150E();
                return;
            }
            AbstractC29988pg abstractC29988pg5 = ZdbMigrateView.this.f72048M0;
            if (abstractC29988pg5 == null) {
                AbstractC19074t.m100223u("binding");
                abstractC29988pg5 = null;
            }
            abstractC29988pg5.f139048S.setVisibility(8);
            AbstractC29988pg abstractC29988pg6 = ZdbMigrateView.this.f72048M0;
            if (abstractC29988pg6 == null) {
                AbstractC19074t.m100223u("binding");
                abstractC29988pg6 = null;
            }
            abstractC29988pg6.f139049T.setVisibility(0);
            AbstractC29988pg abstractC29988pg7 = ZdbMigrateView.this.f72048M0;
            if (abstractC29988pg7 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                abstractC29988pg = abstractC29988pg7;
            }
            abstractC29988pg.f139047R.m92155v();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m77947a((Boolean) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zdb.ZdbMigrateView$c */
    /* loaded from: classes6.dex */
    static final class C14011c extends AbstractC19075u implements InterfaceC18505l {
        C14011c() {
            super(1);
        }

        /* renamed from: a */
        public final void m77948a(Boolean bool) {
            AbstractC19074t.m100205c(bool);
            if (bool.booleanValue()) {
                AbstractC29988pg abstractC29988pg = ZdbMigrateView.this.f72048M0;
                AbstractC29988pg abstractC29988pg2 = null;
                if (abstractC29988pg == null) {
                    AbstractC19074t.m100223u("binding");
                    abstractC29988pg = null;
                }
                abstractC29988pg.f139048S.setVisibility(8);
                AbstractC29988pg abstractC29988pg3 = ZdbMigrateView.this.f72048M0;
                if (abstractC29988pg3 == null) {
                    AbstractC19074t.m100223u("binding");
                    abstractC29988pg3 = null;
                }
                abstractC29988pg3.f139049T.setVisibility(0);
                AbstractC29988pg abstractC29988pg4 = ZdbMigrateView.this.f72048M0;
                if (abstractC29988pg4 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    abstractC29988pg2 = abstractC29988pg4;
                }
                abstractC29988pg2.f139047R.m92155v();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m77948a((Boolean) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zdb.ZdbMigrateView$d */
    /* loaded from: classes6.dex */
    static final class C14012d extends AbstractC19075u implements InterfaceC18505l {
        C14012d() {
            super(1);
        }

        /* renamed from: a */
        public final void m77949a(Integer num) {
            String m92652XI = ZdbMigrateView.this.m92652XI(AbstractC8020f0.str_title_zdb_loading);
            AbstractC19074t.m100205c(num);
            if (num.intValue() > 0) {
                m92652XI = m92652XI + "(" + num + "%)";
            }
            AbstractC29988pg abstractC29988pg = ZdbMigrateView.this.f72048M0;
            if (abstractC29988pg == null) {
                AbstractC19074t.m100223u("binding");
                abstractC29988pg = null;
            }
            abstractC29988pg.f139050U.setText(m92652XI);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m77949a((Integer) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zdb.ZdbMigrateView$e */
    /* loaded from: classes6.dex */
    static final class C14013e extends AbstractC19075u implements InterfaceC18505l {
        C14013e() {
            super(1);
        }

        /* renamed from: a */
        public final void m77950a(Integer num) {
            int m127173b0;
            String m127114D;
            String m92652XI = ZdbMigrateView.this.m92652XI(AbstractC8020f0.str_zdb_migrate_full_storage_desc);
            String str = num + "MB";
            AbstractC19074t.m100205c(m92652XI);
            m127173b0 = AbstractC24342w.m127173b0(m92652XI, "<space>", 0, false, 6, null);
            m127114D = AbstractC24341v.m127114D(m92652XI, "<space>", str, false, 4, null);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m127114D);
            if (m127173b0 >= 0) {
                spannableStringBuilder.setSpan(new StyleSpan(1), m127173b0, str.length() + m127173b0, 18);
            }
            AbstractC29988pg abstractC29988pg = ZdbMigrateView.this.f72048M0;
            if (abstractC29988pg == null) {
                AbstractC19074t.m100223u("binding");
                abstractC29988pg = null;
            }
            abstractC29988pg.f139051V.setText(spannableStringBuilder);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m77950a((Integer) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zdb.ZdbMigrateView$f */
    /* loaded from: classes6.dex */
    static final class C14014f implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f72055p;

        C14014f(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f72055p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f72055p;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1764d0) && (obj instanceof InterfaceC19066n)) {
                return AbstractC19074t.m100204b(mo9368c(), ((InterfaceC19066n) obj).mo9368c());
            }
            return false;
        }

        public final int hashCode() {
            return mo9368c().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final /* synthetic */ void mo8524qp(Object obj) {
            this.f72055p.mo205i9(obj);
        }
    }

    /* renamed from: com.zing.zalo.ui.zdb.ZdbMigrateView$g */
    /* loaded from: classes6.dex */
    public static final class C14015g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f72056q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14015g(ZaloView zaloView) {
            super(0);
            this.f72056q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final ZaloView mo12V4() {
            return this.f72056q;
        }
    }

    /* renamed from: com.zing.zalo.ui.zdb.ZdbMigrateView$h */
    /* loaded from: classes6.dex */
    public static final class C14016h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f72057q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14016h(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f72057q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f72057q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* renamed from: eM */
    private final ZdbMigrateViewModel m77945eM() {
        return (ZdbMigrateViewModel) this.f72049N0.getValue();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        C29628e.m147249E0().m147268V0();
        super.mo37111CJ(bundle);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int m127172a0;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC29988pg m148380Q = AbstractC29988pg.m148380Q(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148380Q, "inflate(...)");
        LottieImageView lottieImageView = m148380Q.f139047R;
        try {
            lottieImageView.m92157y("loading_lottie.json", true);
            AbstractC19074t.m100205c(lottieImageView);
            C25979a.m133810a(lottieImageView, new LottieConfig.C8999a().m48112f("fixed_screen").m48107a());
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        m148380Q.f139045P.setIdTracking("btn_zdb_retry");
        m148380Q.f139045P.setOnClickListener(this);
        m148380Q.f139053X.setIdTracking("btn_zdb_view_instruction");
        m148380Q.f139053X.setOnClickListener(this);
        m148380Q.f139046Q.setIdTracking("btn_zdb_free_up_space");
        Button button = m148380Q.f139046Q;
        if (AbstractC23152n3.m119051k(button.getContext())) {
            button.setVisibility(0);
            button.setOnClickListener(this);
        } else {
            button.setVisibility(8);
            m148380Q.f139045P.m90539c(AbstractC2814h.ButtonLarge_Secondary);
            Button button2 = m148380Q.f139045P;
            AbstractC19074t.m100207e(button2, "btnRetry");
            C26708g c26708g = new C26708g(button2);
            Context context = button.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            c26708g.m137319a(C26705d.m137293a(context, AbstractC2814h.ButtonLarge_Secondary));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m92652XI(AbstractC8020f0.str_zdb_migrate_full_storage_warning));
        m127172a0 = AbstractC24342w.m127172a0(spannableStringBuilder, '\n', 0, false, 6, null);
        if (m127172a0 > 0) {
            spannableStringBuilder.setSpan(new StyleSpan(1), 0, m127172a0, 18);
        }
        m148380Q.f139054Y.setText(spannableStringBuilder);
        this.f72048M0 = m148380Q;
        ZdbMigrateViewModel m77945eM = m77945eM();
        m77945eM.m77959Q().m9219j(this, new C14014f(new C14009a()));
        m77945eM.m77963U().m9219j(this, new C14014f(new C14010b()));
        m77945eM.m77962T().m9219j(this, new C14014f(new C14011c()));
        m77945eM.m77960R().m9219j(this, new C14014f(new C14012d()));
        m77945eM.m77961S().m9219j(this, new C14014f(new C14013e()));
        getLifecycle().mo9335a(m77945eM);
        AbstractC29988pg abstractC29988pg = this.f72048M0;
        if (abstractC29988pg == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29988pg = null;
        }
        View root = abstractC29988pg.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        m77945eM().m77966X(bundle);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        m77945eM().m77965W(ZdbMigrateViewModel.Companion.m77967a(bundle));
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        C29628e.m147249E0().m147292u1();
        Bundle bundle = new Bundle();
        bundle.putInt("SHOW_WITH_FLAGS", 67108864);
        C17487o0 m92662fJ = m92662fJ();
        AbstractC19074t.m100205c(m92662fJ);
        m92662fJ.m93069k2(MainTabView.class, bundle, 0, true);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ZdbMigrateView";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC29988pg abstractC29988pg = this.f72048M0;
        AbstractC29988pg abstractC29988pg2 = null;
        if (abstractC29988pg == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29988pg = null;
        }
        if (AbstractC19074t.m100204b(view, abstractC29988pg.f139046Q)) {
            AbstractC23152n3.m119078x0(getContext());
            return;
        }
        AbstractC29988pg abstractC29988pg3 = this.f72048M0;
        if (abstractC29988pg3 == null) {
            AbstractC19074t.m100223u("binding");
            abstractC29988pg3 = null;
        }
        if (AbstractC19074t.m100204b(view, abstractC29988pg3.f139045P)) {
            m77945eM().m77964V();
            return;
        }
        AbstractC29988pg abstractC29988pg4 = this.f72048M0;
        if (abstractC29988pg4 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            abstractC29988pg2 = abstractC29988pg4;
        }
        if (AbstractC19074t.m100204b(view, abstractC29988pg2.f139053X)) {
            AbstractC28207v1.m141994i3("action.open.outapp", 7, m92676n2(), this, "https://help.zalo.me/huong-dan/chuyen-muc/quan-ly-tai-khoan-zalo/giai-phong-dung-luong-dien-thoai-de-su-dung-zalo", null);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        return true;
    }
}
