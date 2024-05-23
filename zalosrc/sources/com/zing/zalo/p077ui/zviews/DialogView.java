package com.zing.zalo.p077ui.zviews;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.AbstractC1759b1;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.utils.systemui.C16772j;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes6.dex */
public class DialogView extends ZaloView implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public static final C14222a Companion = new C14222a(null);

    /* renamed from: B0 */
    private Dialog f73143B0;

    /* renamed from: C0 */
    private boolean f73144C0;

    /* renamed from: D0 */
    private boolean f73145D0;

    /* renamed from: E0 */
    private boolean f73146E0;

    /* renamed from: w0 */
    private int f73147w0;

    /* renamed from: x0 */
    private int f73148x0;

    /* renamed from: y0 */
    private boolean f73149y0 = true;

    /* renamed from: z0 */
    private boolean f73150z0 = true;

    /* renamed from: A0 */
    private int f73142A0 = -1;

    /* renamed from: com.zing.zalo.ui.zviews.DialogView$a */
    /* loaded from: classes6.dex */
    public static final class C14222a {
        private C14222a() {
        }

        public /* synthetic */ C14222a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        boolean z11;
        super.mo37111CJ(bundle);
        if (m79279KK() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f73150z0 = z11;
        if (bundle != null) {
            this.f73147w0 = bundle.getInt("android:style", 0);
            this.f73148x0 = bundle.getInt("android:theme", 0);
            this.f73149y0 = bundle.getBoolean("android:cancelable", true);
            this.f73150z0 = bundle.getBoolean("android:showsDialog", this.f73150z0);
            this.f73142A0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        Dialog dialog = this.f73143B0;
        if (dialog != null) {
            this.f73144C0 = true;
            if (dialog != null) {
                dialog.dismiss();
            }
            this.f73143B0 = null;
        }
    }

    /* renamed from: JK */
    public final void m79278JK(boolean z11) {
        if (this.f73145D0) {
            return;
        }
        this.f73145D0 = true;
        this.f73146E0 = false;
        Dialog dialog = this.f73143B0;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.f73144C0 = true;
        if (this.f73142A0 >= 0) {
            this.f73142A0 = -1;
        } else {
            m92693xK().mo92702G1(this, this.f88756W);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        if (!this.f73146E0 && !this.f73145D0) {
            this.f73145D0 = true;
        }
    }

    /* renamed from: KK */
    protected final int m79279KK() {
        return 0;
    }

    /* renamed from: LK */
    public final Dialog m79280LK() {
        return this.f73143B0;
    }

    /* renamed from: MK */
    public int mo49167MK() {
        return this.f73148x0;
    }

    /* renamed from: NK */
    public Dialog mo49168NK(Bundle bundle) {
        return new Dialog(m92686rK(), mo49167MK());
    }

    /* renamed from: OK */
    public final void m79281OK(Dialog dialog, int i11) {
        AbstractC19074t.m100208f(dialog, "dialog");
        if (i11 != 1 && i11 != 2) {
            if (i11 == 3) {
                Window window = dialog.getWindow();
                AbstractC19074t.m100205c(window);
                window.addFlags(24);
                dialog.requestWindowFeature(1);
                return;
            }
            return;
        }
        dialog.requestWindowFeature(1);
    }

    /* renamed from: PK */
    public final void m79282PK(C17487o0 c17487o0, String str) {
        this.f73145D0 = false;
        this.f73146E0 = true;
        if (c17487o0 != null) {
            c17487o0.m93060e2(0, this, str, 0, false);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        Bundle bundle2;
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        Dialog dialog = this.f73143B0;
        if (dialog != null) {
            if (dialog != null) {
                bundle2 = dialog.onSaveInstanceState();
            } else {
                bundle2 = null;
            }
            bundle.putBundle("android:savedDialogState", bundle2);
        }
        int i11 = this.f73147w0;
        if (i11 != 0) {
            bundle.putInt("android:style", i11);
        }
        int i12 = this.f73148x0;
        if (i12 != 0) {
            bundle.putInt("android:theme", i12);
        }
        if (!this.f73149y0) {
            bundle.putBoolean("android:cancelable", false);
        }
        if (!this.f73150z0) {
            bundle.putBoolean("android:showsDialog", false);
        }
        int i13 = this.f73142A0;
        if (i13 != -1) {
            bundle.putInt("android:backStackId", i13);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: UI */
    public LayoutInflater mo79283UI(Bundle bundle) {
        if (!this.f73150z0) {
            LayoutInflater mo79283UI = super.mo79283UI(bundle);
            AbstractC19074t.m100207e(mo79283UI, "getLayoutInflater(...)");
            return mo79283UI;
        }
        Dialog mo49168NK = mo49168NK(bundle);
        this.f73143B0 = mo49168NK;
        if (mo49168NK != null) {
            AbstractC19074t.m100205c(mo49168NK);
            m79281OK(mo49168NK, this.f73147w0);
            Dialog dialog = this.f73143B0;
            AbstractC19074t.m100205c(dialog);
            Object systemService = dialog.getContext().getSystemService("layout_inflater");
            AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
            return (LayoutInflater) systemService;
        }
        Context context = getContext();
        AbstractC19074t.m100205c(context);
        Object systemService2 = context.getSystemService("layout_inflater");
        AbstractC19074t.m100206d(systemService2, "null cannot be cast to non-null type android.view.LayoutInflater");
        return (LayoutInflater) systemService2;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        View view;
        Window window;
        super.mo37584UJ();
        Dialog dialog = this.f73143B0;
        if (dialog != null) {
            this.f73144C0 = false;
            if (dialog != null) {
                dialog.show();
            }
            Dialog dialog2 = this.f73143B0;
            if (dialog2 != null && (window = dialog2.getWindow()) != null) {
                view = window.getDecorView();
            } else {
                view = null;
            }
            if (view != null) {
                AbstractC1759b1.m9260b(view, this);
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        Dialog dialog = this.f73143B0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        AbstractC19074t.m100208f(dialogInterface, "dialog");
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        AbstractC19074t.m100208f(dialogInterface, "dialog");
        if (!this.f73144C0) {
            m79278JK(true);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        Dialog dialog;
        Bundle bundle2;
        super.mo37135xJ(bundle);
        if (!this.f73150z0 || (dialog = this.f73143B0) == null) {
            return;
        }
        View m92656bJ = m92656bJ();
        if (m92656bJ != null) {
            if (m92656bJ.getParent() == null) {
                dialog.setContentView(m92656bJ);
                C16772j.Companion.m89536d(this);
            } else {
                throw new IllegalStateException("DialogFragment can not be attached to a container view".toString());
            }
        }
        Object m92676n2 = m92676n2();
        if (m92676n2 instanceof Activity) {
            dialog.setOwnerActivity((Activity) m92676n2);
        }
        dialog.setCancelable(this.f73149y0);
        dialog.setOnCancelListener(this);
        dialog.setOnDismissListener(this);
        if (bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            dialog.onRestoreInstanceState(bundle2);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        if (!this.f73146E0) {
            this.f73145D0 = false;
        }
    }
}
