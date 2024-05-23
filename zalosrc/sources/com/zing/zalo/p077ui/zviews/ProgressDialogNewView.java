package com.zing.zalo.p077ui.zviews;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.ProgressBar;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.DialogView;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import p649xl.C30135y8;
import ui0.C27280g;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* loaded from: classes6.dex */
public final class ProgressDialogNewView extends DialogView {

    /* renamed from: H0 */
    private C30135y8 f76495H0;

    /* renamed from: I0 */
    private final String f76496I0 = "ProgressDialogNewView";

    /* renamed from: J0 */
    private String f76497J0 = "";

    /* renamed from: K0 */
    private boolean f76498K0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zing.zalo.ui.zviews.ProgressDialogNewView$a */
    /* loaded from: classes6.dex */
    public static final class EnumC14810a {

        /* renamed from: p */
        public static final EnumC14810a f76499p = new EnumC14810a("Loading", 0);

        /* renamed from: q */
        public static final EnumC14810a f76500q = new EnumC14810a("Successful", 1);

        /* renamed from: r */
        public static final EnumC14810a f76501r = new EnumC14810a("Failed", 2);

        /* renamed from: s */
        private static final /* synthetic */ EnumC14810a[] f76502s;

        /* renamed from: t */
        private static final /* synthetic */ InterfaceC30165a f76503t;

        static {
            EnumC14810a[] m83096b = m83096b();
            f76502s = m83096b;
            f76503t = AbstractC30166b.m148796a(m83096b);
        }

        private EnumC14810a(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC14810a[] m83096b() {
            return new EnumC14810a[]{f76499p, f76500q, f76501r};
        }

        public static EnumC14810a valueOf(String str) {
            return (EnumC14810a) Enum.valueOf(EnumC14810a.class, str);
        }

        public static EnumC14810a[] values() {
            return (EnumC14810a[]) f76502s.clone();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ProgressDialogNewView$b */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C14811b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f76504a;

        static {
            int[] iArr = new int[EnumC14810a.values().length];
            try {
                iArr[EnumC14810a.f76499p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC14810a.f76500q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC14810a.f76501r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f76504a = iArr;
        }
    }

    public ProgressDialogNewView() {
        m92601SK(0, AbstractC8915g0.alertdialog);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aL */
    public static final void m83091aL(ProgressDialogNewView progressDialogNewView) {
        AbstractC19074t.m100208f(progressDialogNewView, "this$0");
        progressDialogNewView.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bL */
    public static final void m83092bL(ProgressDialogNewView progressDialogNewView) {
        AbstractC19074t.m100208f(progressDialogNewView, "this$0");
        progressDialogNewView.dismiss();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C30135y8 m148737c = C30135y8.m148737c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148737c, "inflate(...)");
        this.f76495H0 = m148737c;
        if (m148737c == null) {
            AbstractC19074t.m100223u("binding");
            m148737c = null;
        }
        LinearLayout root = m148737c.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.zview.DialogView
    /* renamed from: MK */
    public void mo43041MK(boolean z11) {
        this.f76498K0 = z11;
        m92596NK(z11);
        super.mo43041MK(z11);
    }

    @Override // com.zing.zalo.zview.DialogView
    /* renamed from: TK */
    public void mo83093TK(C17487o0 c17487o0) {
        super.m92602UK(c17487o0, this.f76496I0);
    }

    /* renamed from: YK */
    public final void m83094YK(String str) {
        AbstractC19074t.m100208f(str, "msg");
        this.f76497J0 = str;
        if (this.f76495H0 != null && str.length() > 0) {
            C30135y8 c30135y8 = this.f76495H0;
            C30135y8 c30135y82 = null;
            if (c30135y8 == null) {
                AbstractC19074t.m100223u("binding");
                c30135y8 = null;
            }
            RobotoTextView robotoTextView = c30135y8.f140027s;
            AbstractC19074t.m100207e(robotoTextView, "progressDialogMsg");
            robotoTextView.setVisibility(0);
            C30135y8 c30135y83 = this.f76495H0;
            if (c30135y83 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c30135y82 = c30135y83;
            }
            c30135y82.f140027s.setText(str);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        mo43041MK(this.f76498K0);
        C30135y8 c30135y8 = null;
        if (this.f76497J0.length() > 0) {
            C30135y8 c30135y82 = this.f76495H0;
            if (c30135y82 == null) {
                AbstractC19074t.m100223u("binding");
                c30135y82 = null;
            }
            c30135y82.f140027s.setText(this.f76497J0);
            C30135y8 c30135y83 = this.f76495H0;
            if (c30135y83 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c30135y8 = c30135y83;
            }
            RobotoTextView robotoTextView = c30135y8.f140027s;
            AbstractC19074t.m100207e(robotoTextView, "progressDialogMsg");
            robotoTextView.setVisibility(0);
            return;
        }
        C30135y8 c30135y84 = this.f76495H0;
        if (c30135y84 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30135y8 = c30135y84;
        }
        RobotoTextView robotoTextView2 = c30135y8.f140027s;
        AbstractC19074t.m100207e(robotoTextView2, "progressDialogMsg");
        robotoTextView2.setVisibility(8);
    }

    /* renamed from: ZK */
    public final void m83095ZK(EnumC14810a enumC14810a, String str) {
        AbstractC19074t.m100208f(enumC14810a, "status");
        AbstractC19074t.m100208f(str, "newMsg");
        int i11 = C14811b.f76504a[enumC14810a.ordinal()];
        C30135y8 c30135y8 = null;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    C30135y8 c30135y82 = this.f76495H0;
                    if (c30135y82 == null) {
                        AbstractC19074t.m100223u("binding");
                        c30135y82 = null;
                    }
                    ZAppCompatImageView zAppCompatImageView = c30135y82.f140026r;
                    AbstractC19074t.m100207e(zAppCompatImageView, "ivStatus");
                    zAppCompatImageView.setVisibility(0);
                    C30135y8 c30135y83 = this.f76495H0;
                    if (c30135y83 == null) {
                        AbstractC19074t.m100223u("binding");
                    } else {
                        c30135y8 = c30135y83;
                    }
                    ProgressBar progressBar = c30135y8.f140025q;
                    AbstractC19074t.m100207e(progressBar, "holoCircularProgressBar");
                    progressBar.setVisibility(8);
                    mo43041MK(true);
                    m83094YK(str);
                    AbstractC19444a.m101694b(new Runnable() { // from class: com.zing.zalo.ui.zviews.e80
                        @Override // java.lang.Runnable
                        public final void run() {
                            ProgressDialogNewView.m83092bL(ProgressDialogNewView.this);
                        }
                    }, 3000L);
                    return;
                }
                return;
            }
            C30135y8 c30135y84 = this.f76495H0;
            if (c30135y84 == null) {
                AbstractC19074t.m100223u("binding");
                c30135y84 = null;
            }
            ZAppCompatImageView zAppCompatImageView2 = c30135y84.f140026r;
            AbstractC19074t.m100207e(zAppCompatImageView2, "ivStatus");
            zAppCompatImageView2.setVisibility(0);
            C30135y8 c30135y85 = this.f76495H0;
            if (c30135y85 == null) {
                AbstractC19074t.m100223u("binding");
                c30135y85 = null;
            }
            ZAppCompatImageView zAppCompatImageView3 = c30135y85.f140026r;
            Context m92689tK = m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            zAppCompatImageView3.setImageDrawable(C27280g.m139660c(m92689tK, AbstractC2810d.zds_ic_check_circle_solid_24, AbstractC2807a.success_icon));
            C30135y8 c30135y86 = this.f76495H0;
            if (c30135y86 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c30135y8 = c30135y86;
            }
            ProgressBar progressBar2 = c30135y8.f140025q;
            AbstractC19074t.m100207e(progressBar2, "holoCircularProgressBar");
            progressBar2.setVisibility(8);
            mo43041MK(true);
            m83094YK(str);
            AbstractC19444a.m101694b(new Runnable() { // from class: com.zing.zalo.ui.zviews.d80
                @Override // java.lang.Runnable
                public final void run() {
                    ProgressDialogNewView.m83091aL(ProgressDialogNewView.this);
                }
            }, 3000L);
            return;
        }
        C30135y8 c30135y87 = this.f76495H0;
        if (c30135y87 == null) {
            AbstractC19074t.m100223u("binding");
            c30135y87 = null;
        }
        ZAppCompatImageView zAppCompatImageView4 = c30135y87.f140026r;
        AbstractC19074t.m100207e(zAppCompatImageView4, "ivStatus");
        zAppCompatImageView4.setVisibility(8);
        C30135y8 c30135y88 = this.f76495H0;
        if (c30135y88 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30135y8 = c30135y88;
        }
        ProgressBar progressBar3 = c30135y8.f140025q;
        AbstractC19074t.m100207e(progressBar3, "holoCircularProgressBar");
        progressBar3.setVisibility(0);
        m83094YK(this.f76497J0);
        mo43041MK(this.f76498K0);
    }
}
