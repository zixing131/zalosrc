package com.zing.zalo.p077ui.zviews;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.text.AbstractC1463b;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.WebViewMPActivity;
import com.zing.zalo.p077ui.zviews.MPPermissionPolicyView;
import com.zing.zalo.zdesign.component.Button;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.C23278z2;
import p189gv.C19609h;
import p307kv.AbstractC21954k;
import p354n3.C23528a;
import p379o3.C23999j;
import p542ub.InterfaceC27218a;
import p649xl.C29872j8;
import p716zh.C31903ea;

/* loaded from: classes6.dex */
public final class MiniProgramDialog extends MiniAppPopupView implements View.OnClickListener {
    public static final C14632a Companion = new C14632a(null);

    /* renamed from: R0 */
    private C29872j8 f75241R0;

    /* renamed from: S0 */
    private InterfaceC14633b f75242S0;

    /* renamed from: V0 */
    private View f75245V0;

    /* renamed from: W0 */
    private boolean f75246W0;

    /* renamed from: X0 */
    private C14634c f75247X0;

    /* renamed from: Y0 */
    private Drawable f75248Y0;

    /* renamed from: Z0 */
    private boolean f75249Z0;

    /* renamed from: b1 */
    private String f75251b1;

    /* renamed from: c1 */
    private String f75252c1;

    /* renamed from: d1 */
    private String f75253d1;

    /* renamed from: e1 */
    private String f75254e1;

    /* renamed from: T0 */
    private String f75243T0 = "";

    /* renamed from: U0 */
    private String f75244U0 = "";

    /* renamed from: a1 */
    private boolean f75250a1 = true;

    /* renamed from: com.zing.zalo.ui.zviews.MiniProgramDialog$a */
    /* loaded from: classes6.dex */
    public static final class C14632a {
        private C14632a() {
        }

        public /* synthetic */ C14632a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final synchronized void m81864a(InterfaceC27218a interfaceC27218a, String str, String str2, InterfaceC14633b interfaceC14633b, View view, Drawable drawable, boolean z11, String str3, String str4, C19609h c19609h, String str5, String str6) {
            try {
                AbstractC19074t.m100208f(str, "title");
                AbstractC19074t.m100208f(str2, "contentRequest");
                AbstractC19074t.m100208f(str5, "trackingAcceptButtonId");
                AbstractC19074t.m100208f(str6, "trackingCancelButtonId");
                if (interfaceC27218a == null) {
                    return;
                }
                MiniProgramDialog miniProgramDialog = new MiniProgramDialog();
                miniProgramDialog.m81861yM(str2);
                miniProgramDialog.m81852BM(str);
                miniProgramDialog.m81859wM(drawable);
                miniProgramDialog.m81858vM(z11);
                if (str3 != null) {
                    miniProgramDialog.m81862zM(str3);
                }
                if (str4 != null) {
                    miniProgramDialog.m81851AM(str4);
                }
                if (view != null) {
                    miniProgramDialog.m81857uM(view);
                }
                miniProgramDialog.m81856tM(!(interfaceC27218a instanceof WebViewMPActivity));
                miniProgramDialog.m81860xM(interfaceC14633b);
                miniProgramDialog.m81853CM(str5, str6);
                Bundle m78535kL = BottomPickerView.m78535kL();
                m78535kL.putSerializable("EXTRA_MINI_PROGRAM_INFO", c19609h);
                miniProgramDialog.mo60305zK(m78535kL);
                interfaceC27218a.mo35579p().mo89693h2(miniProgramDialog, "MiniAppBottomMenu", 0, true);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MiniProgramDialog$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC14633b {
        /* renamed from: a */
        void mo81419a(boolean z11);
    }

    /* renamed from: com.zing.zalo.ui.zviews.MiniProgramDialog$c */
    /* loaded from: classes6.dex */
    public final class C14634c {

        /* renamed from: a */
        private MPPermissionPolicyView f75255a;

        /* renamed from: com.zing.zalo.ui.zviews.MiniProgramDialog$c$a */
        /* loaded from: classes6.dex */
        public static final class a implements MPPermissionPolicyView.InterfaceC14534a {

            /* renamed from: a */
            final /* synthetic */ MiniProgramDialog f75257a;

            a(MiniProgramDialog miniProgramDialog) {
                this.f75257a = miniProgramDialog;
            }

            @Override // com.zing.zalo.p077ui.zviews.MPPermissionPolicyView.InterfaceC14534a
            /* renamed from: J */
            public void mo81293J() {
                this.f75257a.m81854DM(false);
            }
        }

        public C14634c() {
        }

        /* renamed from: a */
        public final void m81865a() {
            View view;
            ViewStub viewStub;
            if (this.f75255a == null && MiniProgramDialog.this.m81855sM() != null) {
                C29872j8 m81855sM = MiniProgramDialog.this.m81855sM();
                if (m81855sM != null && (viewStub = m81855sM.f138280C) != null) {
                    view = viewStub.inflate();
                } else {
                    view = null;
                }
                MPPermissionPolicyView mPPermissionPolicyView = (MPPermissionPolicyView) view;
                this.f75255a = mPPermissionPolicyView;
                AbstractC19074t.m100205c(mPPermissionPolicyView);
                mPPermissionPolicyView.setPermissionPolicyListener(new a(MiniProgramDialog.this));
            }
        }

        /* renamed from: b */
        public final void m81866b(boolean z11) {
            int i11;
            MPPermissionPolicyView mPPermissionPolicyView = this.f75255a;
            if (mPPermissionPolicyView != null) {
                if (z11) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                mPPermissionPolicyView.setVisibility(i11);
            }
        }
    }

    public MiniProgramDialog() {
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_mini_dialog_accept_button);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        this.f75251b1 = m118743r0;
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_mini_dialog_reject_button);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        this.f75252c1 = m118743r02;
        this.f75253d1 = "";
        this.f75254e1 = "";
    }

    /* renamed from: AM */
    public final void m81851AM(String str) {
        Button button;
        AbstractC19074t.m100208f(str, "text");
        this.f75252c1 = str;
        C29872j8 c29872j8 = this.f75241R0;
        if (c29872j8 != null) {
            button = c29872j8.f138291z;
        } else {
            button = null;
        }
        if (button != null) {
            button.setText(str);
        }
    }

    /* renamed from: BM */
    public final void m81852BM(String str) {
        TextView textView;
        int i11;
        AbstractC19074t.m100208f(str, "title");
        this.f75244U0 = str;
        C29872j8 c29872j8 = this.f75241R0;
        TextView textView2 = null;
        if (c29872j8 != null) {
            textView = c29872j8.f138290y;
        } else {
            textView = null;
        }
        if (textView != null) {
            if (str.length() == 0) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            textView.setVisibility(i11);
        }
        C29872j8 c29872j82 = this.f75241R0;
        if (c29872j82 != null) {
            textView2 = c29872j82.f138290y;
        }
        if (textView2 != null) {
            textView2.setText(AbstractC1463b.m7440a(str, 0));
        }
    }

    /* renamed from: CM */
    public final void m81853CM(String str, String str2) {
        Button button;
        Button button2;
        AbstractC19074t.m100208f(str, "trackingAcceptButtonId");
        AbstractC19074t.m100208f(str2, "trackingCancelButtonId");
        this.f75253d1 = str;
        this.f75254e1 = str2;
        C29872j8 c29872j8 = this.f75241R0;
        if (c29872j8 != null && (button2 = c29872j8.f138284s) != null) {
            button2.setIdTracking(str);
        }
        C29872j8 c29872j82 = this.f75241R0;
        if (c29872j82 != null && (button = c29872j82.f138291z) != null) {
            button.setIdTracking(str2);
        }
    }

    /* renamed from: DM */
    public final void m81854DM(boolean z11) {
        RelativeLayout relativeLayout;
        int i11;
        C14634c c14634c;
        if (z11 && (c14634c = this.f75247X0) != null) {
            c14634c.m81865a();
        }
        C14634c c14634c2 = this.f75247X0;
        if (c14634c2 != null) {
            c14634c2.m81866b(z11);
        }
        C29872j8 c29872j8 = this.f75241R0;
        if (c29872j8 != null) {
            relativeLayout = c29872j8.f138278A;
        } else {
            relativeLayout = null;
        }
        if (relativeLayout != null) {
            if (z11) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            relativeLayout.setVisibility(i11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppPopupView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        C19609h c19609h;
        String str;
        TextView textView;
        TextView textView2;
        RecyclingImageView recyclingImageView;
        ImageButton imageButton;
        Button button;
        int i11;
        int i12;
        int i13;
        int i14;
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        Bundle m92642L3 = m92642L3();
        Button button2 = null;
        if (m92642L3 != null) {
            c19609h = (C19609h) AbstractC21954k.Companion.m114622q(m92642L3, "EXTRA_MINI_PROGRAM_INFO", C19609h.class);
        } else {
            c19609h = null;
        }
        C23528a m153338c = C31903ea.f146582a.m153338c();
        C29872j8 c29872j8 = this.f75241R0;
        AbstractC19074t.m100205c(c29872j8);
        C23528a c23528a = (C23528a) m153338c.m123612r(c29872j8.f138286u);
        if (c19609h != null) {
            str = c19609h.m102612f();
        } else {
            str = null;
        }
        c23528a.m123579C(str, C23278z2.m120143n(), new C23999j());
        C29872j8 c29872j82 = this.f75241R0;
        if (c29872j82 != null) {
            textView = c29872j82.f138290y;
        } else {
            textView = null;
        }
        int i15 = 8;
        if (textView != null) {
            if (this.f75244U0.length() == 0) {
                i14 = 8;
            } else {
                i14 = 0;
            }
            textView.setVisibility(i14);
        }
        C29872j8 c29872j83 = this.f75241R0;
        if (c29872j83 != null) {
            textView2 = c29872j83.f138285t;
        } else {
            textView2 = null;
        }
        if (textView2 != null) {
            if (this.f75243T0.length() == 0) {
                i13 = 8;
            } else {
                i13 = 0;
            }
            textView2.setVisibility(i13);
        }
        C29872j8 c29872j84 = this.f75241R0;
        if (c29872j84 != null) {
            recyclingImageView = c29872j84.f138286u;
        } else {
            recyclingImageView = null;
        }
        if (recyclingImageView != null) {
            if (this.f75249Z0) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            recyclingImageView.setVisibility(i12);
        }
        C29872j8 c29872j85 = this.f75241R0;
        if (c29872j85 != null) {
            imageButton = c29872j85.f138289x;
        } else {
            imageButton = null;
        }
        if (imageButton != null) {
            if (this.f75250a1) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            imageButton.setVisibility(i11);
        }
        C29872j8 c29872j86 = this.f75241R0;
        AbstractC19074t.m100205c(c29872j86);
        c29872j86.f138290y.setText(this.f75244U0);
        C29872j8 c29872j87 = this.f75241R0;
        if (c29872j87 != null) {
            button = c29872j87.f138284s;
        } else {
            button = null;
        }
        if (button != null) {
            button.setText(this.f75251b1);
        }
        C29872j8 c29872j88 = this.f75241R0;
        if (c29872j88 != null) {
            button2 = c29872j88.f138291z;
        }
        if (button2 != null) {
            button2.setText(this.f75252c1);
        }
        View view2 = this.f75245V0;
        if (view2 != null) {
            AbstractC19074t.m100205c(view2);
            ViewParent parent = view2.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(this.f75245V0);
            }
            C29872j8 c29872j89 = this.f75241R0;
            AbstractC19074t.m100205c(c29872j89);
            c29872j89.f138279B.removeAllViews();
            C29872j8 c29872j810 = this.f75241R0;
            AbstractC19074t.m100205c(c29872j810);
            c29872j810.f138279B.addView(this.f75245V0);
        }
        C29872j8 c29872j811 = this.f75241R0;
        AbstractC19074t.m100205c(c29872j811);
        c29872j811.f138285t.setText(AbstractC1463b.m7440a(this.f75243T0, 0));
        C29872j8 c29872j812 = this.f75241R0;
        AbstractC19074t.m100205c(c29872j812);
        c29872j812.f138288w.setBackground(this.f75248Y0);
        C29872j8 c29872j813 = this.f75241R0;
        AbstractC19074t.m100205c(c29872j813);
        FrameLayout frameLayout = c29872j813.f138288w;
        if (this.f75248Y0 != null) {
            i15 = 0;
        }
        frameLayout.setVisibility(i15);
        C29872j8 c29872j814 = this.f75241R0;
        AbstractC19074t.m100205c(c29872j814);
        c29872j814.f138284s.setIdTracking(this.f75253d1);
        C29872j8 c29872j815 = this.f75241R0;
        AbstractC19074t.m100205c(c29872j815);
        c29872j815.f138291z.setIdTracking(this.f75254e1);
        C29872j8 c29872j816 = this.f75241R0;
        AbstractC19074t.m100205c(c29872j816);
        c29872j816.f138291z.setOnClickListener(this);
        C29872j8 c29872j817 = this.f75241R0;
        AbstractC19074t.m100205c(c29872j817);
        c29872j817.f138284s.setOnClickListener(this);
        C29872j8 c29872j818 = this.f75241R0;
        AbstractC19074t.m100205c(c29872j818);
        c29872j818.f138289x.setOnClickListener(this);
        C29872j8 c29872j819 = this.f75241R0;
        AbstractC19074t.m100205c(c29872j819);
        c29872j819.f138282q.setOnClickListener(this);
        C29872j8 c29872j820 = this.f75241R0;
        AbstractC19074t.m100205c(c29872j820);
        c29872j820.f138283r.setOnClickListener(this);
        this.f75247X0 = new C14634c();
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppPopupView
    /* renamed from: kM */
    public View mo81267kM(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29872j8 m148118a = C29872j8.m148118a(layoutInflater.inflate(AbstractC7409c0.mp_bottom_dialog, viewGroup, false));
        this.f75241R0 = m148118a;
        if (m148118a != null) {
            return m148118a.getRoot();
        }
        return null;
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppPopupView
    /* renamed from: nM */
    public View mo81268nM() {
        C29872j8 c29872j8 = this.f75241R0;
        if (c29872j8 != null) {
            return c29872j8.f138282q;
        }
        return null;
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppPopupView
    /* renamed from: oM */
    public View mo81269oM() {
        C29872j8 c29872j8 = this.f75241R0;
        if (c29872j8 != null) {
            return c29872j8.f138283r;
        }
        return null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Integer num;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        int i11 = AbstractC6918a0.mp_dialog_accept_bt;
        if (num != null && num.intValue() == i11) {
            this.f75246W0 = true;
            MiniAppPopupView.m81730mM(this, false, false, null, 7, null);
            return;
        }
        int i12 = AbstractC6918a0.mp_dialog_cancel_bt;
        if (num != null && num.intValue() == i12) {
            MiniAppPopupView.m81730mM(this, false, false, null, 7, null);
            return;
        }
        int i13 = AbstractC6918a0.mp_dialog_app_info;
        if (num != null && num.intValue() == i13) {
            m81854DM(true);
            return;
        }
        int i14 = AbstractC6918a0.containerView;
        if (num != null && num.intValue() == i14) {
            MiniAppPopupView.m81730mM(this, false, false, null, 7, null);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.MiniAppPopupView
    /* renamed from: qM */
    public void mo81270qM(boolean z11) {
        InterfaceC14633b interfaceC14633b = this.f75242S0;
        if (interfaceC14633b != null) {
            interfaceC14633b.mo81419a(this.f75246W0);
        }
    }

    /* renamed from: sM */
    public final C29872j8 m81855sM() {
        return this.f75241R0;
    }

    /* renamed from: tM */
    public final void m81856tM(boolean z11) {
        ImageButton imageButton;
        int i11;
        C29872j8 c29872j8 = this.f75241R0;
        if (c29872j8 != null) {
            imageButton = c29872j8.f138289x;
        } else {
            imageButton = null;
        }
        if (imageButton != null) {
            if (z11) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            imageButton.setVisibility(i11);
        }
        this.f75250a1 = z11;
    }

    /* renamed from: uM */
    public final void m81857uM(View view) {
        FrameLayout frameLayout;
        this.f75245V0 = view;
        C29872j8 c29872j8 = this.f75241R0;
        if (c29872j8 != null && (frameLayout = c29872j8.f138279B) != null) {
            frameLayout.addView(view);
        }
    }

    /* renamed from: vM */
    public final void m81858vM(boolean z11) {
        RecyclingImageView recyclingImageView;
        int i11;
        C29872j8 c29872j8 = this.f75241R0;
        if (c29872j8 != null) {
            recyclingImageView = c29872j8.f138286u;
        } else {
            recyclingImageView = null;
        }
        if (recyclingImageView != null) {
            if (z11) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            recyclingImageView.setVisibility(i11);
        }
        this.f75249Z0 = z11;
    }

    /* renamed from: wM */
    public final void m81859wM(Drawable drawable) {
        FrameLayout frameLayout;
        C29872j8 c29872j8 = this.f75241R0;
        if (c29872j8 != null) {
            frameLayout = c29872j8.f138288w;
        } else {
            frameLayout = null;
        }
        if (frameLayout != null) {
            frameLayout.setBackground(drawable);
        }
        this.f75248Y0 = drawable;
    }

    /* renamed from: xM */
    public final void m81860xM(InterfaceC14633b interfaceC14633b) {
        this.f75242S0 = interfaceC14633b;
    }

    /* renamed from: yM */
    public final void m81861yM(String str) {
        TextView textView;
        int i11;
        AbstractC19074t.m100208f(str, "message");
        this.f75243T0 = str;
        C29872j8 c29872j8 = this.f75241R0;
        TextView textView2 = null;
        if (c29872j8 != null) {
            textView = c29872j8.f138285t;
        } else {
            textView = null;
        }
        if (textView != null) {
            if (str.length() == 0) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            textView.setVisibility(i11);
        }
        C29872j8 c29872j82 = this.f75241R0;
        if (c29872j82 != null) {
            textView2 = c29872j82.f138285t;
        }
        if (textView2 != null) {
            textView2.setText(AbstractC1463b.m7440a(str, 0));
        }
    }

    /* renamed from: zM */
    public final void m81862zM(String str) {
        Button button;
        AbstractC19074t.m100208f(str, "text");
        this.f75251b1 = str;
        C29872j8 c29872j8 = this.f75241R0;
        if (c29872j8 != null) {
            button = c29872j8.f138284s;
        } else {
            button = null;
        }
        if (button != null) {
            button.setText(str);
        }
    }
}
