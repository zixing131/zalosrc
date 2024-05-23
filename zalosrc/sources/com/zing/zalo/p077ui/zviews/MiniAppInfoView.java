package com.zing.zalo.p077ui.zviews;

import ae.C0766k;
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
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import me0.AbstractC23093i;
import me0.AbstractC23136l9;
import me0.C23278z2;
import org.json.JSONObject;
import p189gv.C19609h;
import p307kv.AbstractC21954k;
import p354n3.C23528a;
import p542ub.InterfaceC27218a;
import p649xl.C29764d8;
import zl0.AbstractC32226c;

/* loaded from: classes6.dex */
public final class MiniAppInfoView extends MiniAppBaseView implements View.OnClickListener {
    public static final C14599a Companion = new C14599a(null);

    /* renamed from: P0 */
    private C29764d8 f75110P0;

    /* renamed from: Q0 */
    private int f75111Q0;

    /* renamed from: R0 */
    private C19609h f75112R0;

    /* renamed from: com.zing.zalo.ui.zviews.MiniAppInfoView$a */
    /* loaded from: classes6.dex */
    public static final class C14599a {
        private C14599a() {
        }

        public /* synthetic */ C14599a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MiniAppInfoView$b */
    /* loaded from: classes6.dex */
    public static final class C14600b implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ int f75114b;

        C14600b(int i11) {
            this.f75114b = i11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            MiniAppInfoView.this.mo49315c4();
            if (MiniAppInfoView.this.m92672lJ()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            MiniAppInfoView.this.mo49315c4();
            if (MiniAppInfoView.this.m92672lJ()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(this.f75114b));
            }
        }
    }

    /* renamed from: jM */
    private final void m81721jM() {
        KeyEventCallbackC17462c m118464q = AbstractC23093i.m118464q(m92648SI(), new C2913t1.b() { // from class: com.zing.zalo.ui.zviews.tx
            @Override // bn.C2913t1.b
            /* renamed from: a */
            public final void mo13056a(int i11, String str) {
                MiniAppInfoView.m81722kM(MiniAppInfoView.this, i11, str);
            }
        }, AbstractC23136l9.m118743r0(AbstractC8020f0.str_link_report), AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), AbstractC23136l9.m118743r0(AbstractC8020f0.str_no));
        if (m118464q != null) {
            m118464q.mo13822K();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kM */
    public static final void m81722kM(MiniAppInfoView miniAppInfoView, int i11, String str) {
        AbstractC19074t.m100208f(miniAppInfoView, "this$0");
        miniAppInfoView.m81725nM(i11, str);
    }

    /* renamed from: lM */
    private final void m81723lM() {
        String str;
        String str2;
        JSONObject m102614h;
        JSONObject m102614h2;
        JSONObject m102614h3;
        JSONObject m102614h4;
        C19609h c19609h = this.f75112R0;
        if (c19609h != null) {
            C29764d8 c29764d8 = this.f75110P0;
            String str3 = null;
            if (c29764d8 == null) {
                AbstractC19074t.m100223u("vb");
                c29764d8 = null;
            }
            c29764d8.f137520x.setText(c19609h.m102619m());
            C23528a c23528a = new C23528a(getContext());
            C29764d8 c29764d82 = this.f75110P0;
            if (c29764d82 == null) {
                AbstractC19074t.m100223u("vb");
                c29764d82 = null;
            }
            C23528a c23528a2 = (C23528a) c23528a.m123612r(c29764d82.f137519w);
            C19609h c19609h2 = this.f75112R0;
            if (c19609h2 != null) {
                str = c19609h2.m102612f();
            } else {
                str = null;
            }
            c23528a2.m123618x(str, C23278z2.f112845a.m120171i1());
            C29764d8 c29764d83 = this.f75110P0;
            if (c29764d83 == null) {
                AbstractC19074t.m100223u("vb");
                c29764d83 = null;
            }
            RobotoTextView robotoTextView = c29764d83.f137517u;
            C19609h c19609h3 = this.f75112R0;
            String str4 = "...";
            if (c19609h3 == null || (m102614h3 = c19609h3.m102614h()) == null || !m102614h3.has("shareUrl")) {
                str2 = "...";
            } else {
                C19609h c19609h4 = this.f75112R0;
                if (c19609h4 != null && (m102614h4 = c19609h4.m102614h()) != null) {
                    str2 = m102614h4.getString("appCategory");
                } else {
                    str2 = null;
                }
            }
            robotoTextView.setText(str2);
            C29764d8 c29764d84 = this.f75110P0;
            if (c29764d84 == null) {
                AbstractC19074t.m100223u("vb");
                c29764d84 = null;
            }
            RobotoTextView robotoTextView2 = c29764d84.f137509A;
            C19609h c19609h5 = this.f75112R0;
            if (c19609h5 != null && (m102614h = c19609h5.m102614h()) != null && m102614h.has("appDesc")) {
                C19609h c19609h6 = this.f75112R0;
                if (c19609h6 != null && (m102614h2 = c19609h6.m102614h()) != null) {
                    str3 = m102614h2.getString("appDesc");
                }
                str4 = str3;
            }
            robotoTextView2.setText(str4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mM */
    public static final WindowInsets m81724mM(MiniAppInfoView miniAppInfoView, View view, WindowInsets windowInsets) {
        AbstractC19074t.m100208f(miniAppInfoView, "this$0");
        AbstractC19074t.m100208f(view, "<anonymous parameter 0>");
        AbstractC19074t.m100208f(windowInsets, "insets");
        miniAppInfoView.m81727pM();
        return windowInsets;
    }

    /* renamed from: nM */
    private final void m81725nM(int i11, String str) {
        String m102620n;
        try {
            C19609h c19609h = this.f75112R0;
            if (c19609h != null && (m102620n = c19609h.m102620n()) != null) {
                int i12 = AbstractC8020f0.str_link_report_success;
                mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new C14600b(i12));
                c0766k.mo1787ya("", "10", "", m102620n, i11, str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            mo49315c4();
        }
    }

    /* renamed from: oM */
    private final void m81726oM() {
        C29764d8 c29764d8 = this.f75110P0;
        C29764d8 c29764d82 = null;
        if (c29764d8 == null) {
            AbstractC19074t.m100223u("vb");
            c29764d8 = null;
        }
        c29764d8.f137518v.setOnClickListener(this);
        C29764d8 c29764d83 = this.f75110P0;
        if (c29764d83 == null) {
            AbstractC19074t.m100223u("vb");
            c29764d83 = null;
        }
        c29764d83.f137521y.setOnClickListener(this);
        C29764d8 c29764d84 = this.f75110P0;
        if (c29764d84 == null) {
            AbstractC19074t.m100223u("vb");
            c29764d84 = null;
        }
        c29764d84.f137522z.setIdTracking("ma_info_report");
        C29764d8 c29764d85 = this.f75110P0;
        if (c29764d85 == null) {
            AbstractC19074t.m100223u("vb");
        } else {
            c29764d82 = c29764d85;
        }
        c29764d82.f137522z.setOnClickListener(this);
    }

    /* renamed from: pM */
    private final void m81727pM() {
        int i11 = this.f75111Q0;
        C29764d8 c29764d8 = this.f75110P0;
        C29764d8 c29764d82 = null;
        if (c29764d8 == null) {
            AbstractC19074t.m100223u("vb");
            c29764d8 = null;
        }
        int m155409h = AbstractC32226c.m155409h(c29764d8.getRoot());
        this.f75111Q0 = m155409h;
        if (m155409h != i11) {
            C29764d8 c29764d83 = this.f75110P0;
            if (c29764d83 == null) {
                AbstractC19074t.m100223u("vb");
            } else {
                c29764d82 = c29764d83;
            }
            c29764d82.f137513q.setPadding(0, this.f75111Q0, 0, 0);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19609h c19609h;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29764d8 m147853c = C29764d8.m147853c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m147853c, "inflate(...)");
        this.f75110P0 = m147853c;
        m81726oM();
        Bundle m92642L3 = m92642L3();
        C29764d8 c29764d8 = null;
        if (m92642L3 != null) {
            c19609h = (C19609h) AbstractC21954k.Companion.m114622q(m92642L3, "MINI_APP_INFO", C19609h.class);
        } else {
            c19609h = null;
        }
        this.f75112R0 = c19609h;
        if (c19609h != null) {
            m81723lM();
        }
        m81727pM();
        C29764d8 c29764d82 = this.f75110P0;
        if (c29764d82 == null) {
            AbstractC19074t.m100223u("vb");
            c29764d82 = null;
        }
        c29764d82.getRoot().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.zing.zalo.ui.zviews.sx
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsets m81724mM;
                m81724mM = MiniAppInfoView.m81724mM(MiniAppInfoView.this, view, windowInsets);
                return m81724mM;
            }
        });
        C29764d8 c29764d83 = this.f75110P0;
        if (c29764d83 == null) {
            AbstractC19074t.m100223u("vb");
        } else {
            c29764d8 = c29764d83;
        }
        LinearLayout root = c29764d8.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppBaseView, ac.InterfaceC0733x
    public String getTrackingKey() {
        return "MAInfoView";
    }

    @Override // android.view.View.OnClickListener
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
            return;
        }
        int i12 = AbstractC6918a0.ma_permission_view;
        if (num == null || num.intValue() != i12) {
            int i13 = AbstractC6918a0.ma_report_view;
            if (num != null && num.intValue() == i13) {
                m81721jM();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppBaseView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
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
            window.setStatusBarColor(AbstractC23136l9.m118641B(m92689tK(), AbstractC16801x.transparent));
        }
    }
}
