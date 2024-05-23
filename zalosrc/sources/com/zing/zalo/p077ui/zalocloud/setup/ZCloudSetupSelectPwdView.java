package com.zing.zalo.p077ui.zalocloud.setup;

import am.AbstractC0924m0;
import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.backuprestore.encryption.setup.BackupKeySetupView;
import com.zing.zalo.p077ui.widget.ScrollView;
import com.zing.zalo.p077ui.zalocloud.setup.ZCloudSetupSelectPwdView;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hc0.EnumC19985o;
import me0.C23212s8;
import mj0.AbstractC23322a;
import p649xl.AbstractC29843hf;
import pm0.C24848g0;
import tg0.C26676b;
import ui0.C27280g;

/* loaded from: classes6.dex */
public final class ZCloudSetupSelectPwdView extends BaseSetupZaloCloudView<AbstractC29843hf> {

    /* renamed from: com.zing.zalo.ui.zalocloud.setup.ZCloudSetupSelectPwdView$a */
    /* loaded from: classes6.dex */
    static final class C14003a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C14003a f72009q = new C14003a();

        C14003a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long mo12V4() {
            return Long.valueOf(AbstractC0924m0.m3774e8());
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.setup.ZCloudSetupSelectPwdView$b */
    /* loaded from: classes6.dex */
    static final class C14004b extends AbstractC19075u implements InterfaceC18494a {
        C14004b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m77900a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m77900a() {
            AbstractC0924m0.m4153qr(ZCloudSetupSelectPwdView.this.m77757mM().mo124314i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BM */
    public static final void m77894BM(ZCloudSetupSelectPwdView zCloudSetupSelectPwdView, View view) {
        AbstractC19074t.m100208f(zCloudSetupSelectPwdView, "this$0");
        C26676b.f126324a.m136967F(BackupKeySetupView.EnumC11021b.f55687r, BaseSetupZaloCloudView.m77745vM(zCloudSetupSelectPwdView, false, 1, null));
        BaseSetupZaloCloudView.m77746xM(zCloudSetupSelectPwdView, EnumC19985o.f98297z, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CM */
    public static final void m77895CM(ZCloudSetupSelectPwdView zCloudSetupSelectPwdView, View view) {
        AbstractC19074t.m100208f(zCloudSetupSelectPwdView, "this$0");
        C26676b.f126324a.m136967F(BackupKeySetupView.EnumC11021b.f55688s, BaseSetupZaloCloudView.m77745vM(zCloudSetupSelectPwdView, false, 1, null));
        BaseSetupZaloCloudView.m77746xM(zCloudSetupSelectPwdView, EnumC19985o.f98296y, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public static final void m77896DM(ZCloudSetupSelectPwdView zCloudSetupSelectPwdView) {
        AbstractC19074t.m100208f(zCloudSetupSelectPwdView, "this$0");
        ScrollView scrollView = ((AbstractC29843hf) zCloudSetupSelectPwdView.m77756kM()).f138071U;
        AbstractC19074t.m100207e(scrollView, "scrollView");
        boolean z11 = true;
        int height = (scrollView.getChildAt(scrollView.getChildCount() - 1).getHeight() - scrollView.getHeight()) - scrollView.getScrollY();
        scrollView.getScrollY();
        LinearLayout linearLayout = ((AbstractC29843hf) zCloudSetupSelectPwdView.m77756kM()).f138066P;
        AbstractC19074t.m100207e(linearLayout, "bottomContainer");
        int height2 = height - (((AbstractC29843hf) zCloudSetupSelectPwdView.m77756kM()).f138070T.getHeight() / 2);
        int i11 = 0;
        if (height2 >= 0) {
            z11 = false;
        }
        if (!z11) {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        Context context;
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar == null || (context = getContext()) == null) {
            return;
        }
        actionBar.setBackButtonDrawable(C27280g.m139660c(context, AbstractC23322a.zds_ic_arrow_left_line_24, AbstractC2807a.icon_primary));
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView, ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ZCloudSetUpSelectPwd";
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: jM */
    public int mo57575jM() {
        return AbstractC7409c0.z_cloud_setup_select_pwd_view;
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: nM */
    public void mo57729nM() {
        super.mo57729nM();
        m77754gM(C14003a.f72009q, new C14004b());
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: oM */
    public void mo57577oM() {
        int i11;
        super.mo57577oM();
        AppCompatImageView appCompatImageView = ((AbstractC29843hf) m77756kM()).f138072V;
        if (C23212s8.m119603k()) {
            i11 = AbstractC16803z.ic_zcloud_lock_light;
        } else {
            i11 = AbstractC16803z.ic_zcloud_lock_dark;
        }
        appCompatImageView.setImageResource(i11);
        ((AbstractC29843hf) m77756kM()).f138068R.setOnClickListener(new View.OnClickListener() { // from class: hc0.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZCloudSetupSelectPwdView.m77894BM(ZCloudSetupSelectPwdView.this, view);
            }
        });
        ((AbstractC29843hf) m77756kM()).f138067Q.setOnClickListener(new View.OnClickListener() { // from class: hc0.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZCloudSetupSelectPwdView.m77895CM(ZCloudSetupSelectPwdView.this, view);
            }
        });
        ((AbstractC29843hf) m77756kM()).f138071U.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: hc0.y
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                ZCloudSetupSelectPwdView.m77896DM(ZCloudSetupSelectPwdView.this);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: qM */
    public void mo57606qM() {
        if (!m77748tM().m77929b0() && !m77748tM().m77930c0()) {
            super.mo57606qM();
            return;
        }
        ZaloView m92650VI = m92650VI();
        if (m92650VI != null) {
            m92650VI.finish();
        }
    }
}
