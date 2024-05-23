package com.zing.zalo.p077ui.zviews;

import ac.C0697c0;
import ae.C0766k;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import bn.C2913t1;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.miniapp.zinstant.MiniAppZinstantBaseView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import me0.AbstractC23093i;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p189gv.C19609h;
import p542ub.InterfaceC27218a;
import p649xl.C29800f8;
import zl0.AbstractC32226c;

/* loaded from: classes6.dex */
public class MiniAppZinstantView extends MiniAppZinstantBaseView implements View.OnClickListener {
    public static final C14618a Companion = new C14618a(null);

    /* renamed from: Y0 */
    private int f75165Y0;

    /* renamed from: Z0 */
    private View f75166Z0;

    /* renamed from: a1 */
    private View f75167a1;

    /* renamed from: b1 */
    private C29800f8 f75168b1;

    /* renamed from: com.zing.zalo.ui.zviews.MiniAppZinstantView$a */
    /* loaded from: classes6.dex */
    public static final class C14618a {
        private C14618a() {
        }

        public /* synthetic */ C14618a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ Bundle m81798b(C14618a c14618a, int i11, C19609h c19609h, String str, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                str = "";
            }
            return c14618a.m81799a(i11, c19609h, str);
        }

        /* renamed from: a */
        public final Bundle m81799a(int i11, C19609h c19609h, String str) {
            AbstractC19074t.m100208f(str, "title");
            Bundle bundle = new Bundle();
            bundle.putInt("MINI_APP_VIEW_TYPE_TAG", i11);
            bundle.putSerializable("MINI_APP_INFO_EXTRA", c19609h);
            bundle.putString("MINI_APP_TITLE", str);
            bundle.putInt("SHOW_WITH_FLAGS", 134217728);
            return bundle;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MiniAppZinstantView$b */
    /* loaded from: classes6.dex */
    public static final class C14619b implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ int f75170b;

        C14619b(int i11) {
            this.f75170b = i11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            MiniAppZinstantView.this.mo49315c4();
            if (MiniAppZinstantView.this.m92672lJ()) {
                ToastUtils.m89268p(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            MiniAppZinstantView.this.mo49315c4();
            if (MiniAppZinstantView.this.m92672lJ()) {
                ToastUtils.m89268p(AbstractC23136l9.m118743r0(this.f75170b));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RM */
    public static final void m81791RM(MiniAppZinstantView miniAppZinstantView, String str, int i11, String str2) {
        AbstractC19074t.m100208f(miniAppZinstantView, "this$0");
        AbstractC19074t.m100208f(str, "$miniAppUrl");
        miniAppZinstantView.m81797SM(i11, str2, str);
    }

    /* renamed from: TM */
    private final void m81792TM() {
        C19609h m87350EM = m87350EM();
        if (m87350EM != null) {
            C0697c0.Companion.m1052f(this, "appId", m87350EM.m102616j());
        }
    }

    /* renamed from: UM */
    private final void m81793UM() {
        m81796gM();
        m81795WM();
        View view = this.f75167a1;
        if (view != null) {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.zing.zalo.ui.zviews.ay
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    WindowInsets m81794VM;
                    m81794VM = MiniAppZinstantView.m81794VM(MiniAppZinstantView.this, view2, windowInsets);
                    return m81794VM;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VM */
    public static final WindowInsets m81794VM(MiniAppZinstantView miniAppZinstantView, View view, WindowInsets windowInsets) {
        AbstractC19074t.m100208f(miniAppZinstantView, "this$0");
        AbstractC19074t.m100208f(view, "<anonymous parameter 0>");
        AbstractC19074t.m100208f(windowInsets, "insets");
        miniAppZinstantView.m81795WM();
        return windowInsets;
    }

    /* renamed from: WM */
    private final void m81795WM() {
        View view;
        int i11 = this.f75165Y0;
        int m155409h = AbstractC32226c.m155409h(this.f75167a1);
        this.f75165Y0 = m155409h;
        if (m155409h != i11 && (view = this.f75166Z0) != null) {
            view.setPadding(0, m155409h, 0, 0);
        }
    }

    /* renamed from: gM */
    private final void m81796gM() {
        View view;
        Window window;
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null && (window = m92676n2.getWindow()) != null) {
            view = window.getDecorView();
        } else {
            view = null;
        }
        if (Build.VERSION.SDK_INT >= 23 && view != null) {
            if (!C23212s8.m119603k()) {
                view.setSystemUiVisibility(view.getSystemUiVisibility() & (-8193));
            } else {
                view.setSystemUiVisibility(view.getSystemUiVisibility() | 8192);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.miniapp.zinstant.MiniAppZinstantBaseView
    /* renamed from: CM */
    public ViewGroup mo81263CM() {
        C29800f8 c29800f8 = this.f75168b1;
        if (c29800f8 != null) {
            return c29800f8.f137749q;
        }
        return null;
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppPopupView, com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        super.mo37111CJ(bundle);
        C29800f8 m147946c = C29800f8.m147946c(layoutInflater, viewGroup, false);
        this.f75168b1 = m147946c;
        AbstractC19074t.m100205c(m147946c);
        this.f75167a1 = m147946c.getRoot();
        C29800f8 c29800f8 = this.f75168b1;
        AbstractC19074t.m100205c(c29800f8);
        this.f75166Z0 = c29800f8.f137750r;
        m81793UM();
        C29800f8 c29800f82 = this.f75168b1;
        AbstractC19074t.m100205c(c29800f82);
        c29800f82.f137751s.setOnClickListener(this);
        C29800f8 c29800f83 = this.f75168b1;
        AbstractC19074t.m100205c(c29800f83);
        LinearLayout root = c29800f83.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.zviews.miniapp.zinstant.MiniAppZinstantBaseView
    /* renamed from: IM */
    public MiniAppZinstantLayout mo81265IM() {
        C29800f8 c29800f8 = this.f75168b1;
        if (c29800f8 != null) {
            return c29800f8.f137753u;
        }
        return null;
    }

    @Override // com.zing.zalo.p077ui.zviews.miniapp.zinstant.MiniAppZinstantBaseView
    /* renamed from: JM */
    public void mo81426JM(String str, String str2) {
        final String m102620n;
        Context context;
        AbstractC19074t.m100208f(str, "action");
        if (AbstractC19074t.m100204b(str, "mini.app.report.abuse")) {
            C19609h m87350EM = m87350EM();
            if (m87350EM != null && (m102620n = m87350EM.m102620n()) != null) {
                InterfaceC27218a m92676n2 = m92676n2();
                if (m92676n2 != null) {
                    context = m92676n2.getContext();
                } else {
                    context = null;
                }
                KeyEventCallbackC17462c m118464q = AbstractC23093i.m118464q(context, new C2913t1.b() { // from class: com.zing.zalo.ui.zviews.zx
                    @Override // bn.C2913t1.b
                    /* renamed from: a */
                    public final void mo13056a(int i11, String str3) {
                        MiniAppZinstantView.m81791RM(MiniAppZinstantView.this, m102620n, i11, str3);
                    }
                }, AbstractC23136l9.m118743r0(AbstractC8020f0.str_link_report), AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), AbstractC23136l9.m118743r0(AbstractC8020f0.str_no));
                if (m118464q != null) {
                    m118464q.mo13822K();
                    return;
                }
                return;
            }
            return;
        }
        if (AbstractC19074t.m100204b(str, "mini.app.open.ma.permission.management")) {
            C17487o0 m92662fJ = m92662fJ();
            if (m92662fJ != null) {
                C14618a c14618a = Companion;
                C19609h m87350EM2 = m87350EM();
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_mini_app_permission);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                m92662fJ.m93069k2(MiniAppZinstantView.class, c14618a.m81799a(2, m87350EM2, m118743r0), 0, true);
                return;
            }
            return;
        }
        super.mo81426JM(str, str2);
    }

    /* renamed from: SM */
    protected void m81797SM(int i11, String str, String str2) {
        AbstractC19074t.m100208f(str2, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        try {
            int i12 = AbstractC8020f0.str_link_report_success;
            mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14619b(i12));
            c0766k.mo1787ya("", "10", "", str2, i11, str);
        } catch (Exception e11) {
            e11.printStackTrace();
            mo49315c4();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.miniapp.zinstant.MiniAppZinstantBaseView, com.zing.zalo.p077ui.zviews.MiniAppPopupView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        RobotoTextView robotoTextView;
        String str;
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        C29800f8 c29800f8 = this.f75168b1;
        if (c29800f8 != null) {
            robotoTextView = c29800f8.f137752t;
        } else {
            robotoTextView = null;
        }
        if (robotoTextView != null) {
            if (m92642L3() != null) {
                Bundle m92642L3 = m92642L3();
                AbstractC19074t.m100205c(m92642L3);
                if (m92642L3.containsKey("MINI_APP_TITLE")) {
                    Bundle m92642L32 = m92642L3();
                    AbstractC19074t.m100205c(m92642L32);
                    str = m92642L32.getString("MINI_APP_TITLE");
                    robotoTextView.setText(str);
                }
            }
            str = "";
            robotoTextView.setText(str);
        }
        m81792TM();
    }

    @Override // com.zing.zalo.p077ui.zviews.miniapp.zinstant.MiniAppZinstantBaseView, android.view.View.OnClickListener
    public void onClick(View view) {
        Integer num;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        int i11 = AbstractC6918a0.ma_menu_close;
        if (num != null && num.intValue() == i11) {
            finish();
        } else {
            super.onClick(view);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.miniapp.zinstant.MiniAppZinstantBaseView, com.zing.zalo.p077ui.zviews.MiniAppBaseView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        Window window;
        super.onResume();
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null) {
            window = m92676n2.getWindow();
        } else {
            window = null;
        }
        if (window != null) {
            window.setStatusBarColor(AbstractC23136l9.m118639A(AbstractC16801x.transparent));
        }
    }
}
