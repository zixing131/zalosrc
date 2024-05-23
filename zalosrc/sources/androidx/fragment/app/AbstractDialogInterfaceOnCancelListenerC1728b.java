package androidx.fragment.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;

/* renamed from: androidx.fragment.app.b */
/* loaded from: classes2.dex */
public abstract class AbstractDialogInterfaceOnCancelListenerC1728b extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: n0 */
    private Handler f7027n0;

    /* renamed from: o0 */
    private Runnable f7028o0 = new a();

    /* renamed from: p0 */
    int f7029p0 = 0;

    /* renamed from: q0 */
    int f7030q0 = 0;

    /* renamed from: r0 */
    boolean f7031r0 = true;

    /* renamed from: s0 */
    boolean f7032s0 = true;

    /* renamed from: t0 */
    int f7033t0 = -1;

    /* renamed from: u0 */
    Dialog f7034u0;

    /* renamed from: v0 */
    boolean f7035v0;

    /* renamed from: w0 */
    boolean f7036w0;

    /* renamed from: x0 */
    boolean f7037x0;

    /* renamed from: androidx.fragment.app.b$a */
    /* loaded from: classes2.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractDialogInterfaceOnCancelListenerC1728b abstractDialogInterfaceOnCancelListenerC1728b = AbstractDialogInterfaceOnCancelListenerC1728b.this;
            Dialog dialog = abstractDialogInterfaceOnCancelListenerC1728b.f7034u0;
            if (dialog != null) {
                abstractDialogInterfaceOnCancelListenerC1728b.onDismiss(dialog);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: R */
    public void mo8817R(Bundle bundle) {
        Bundle bundle2;
        super.mo8817R(bundle);
        if (!this.f7032s0) {
            return;
        }
        View m8799H = m8799H();
        if (m8799H != null) {
            if (m8799H.getParent() == null) {
                this.f7034u0.setContentView(m8799H);
            } else {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
        }
        FragmentActivity m8852h = m8852h();
        if (m8852h != null) {
            this.f7034u0.setOwnerActivity(m8852h);
        }
        this.f7034u0.setCancelable(this.f7031r0);
        this.f7034u0.setOnCancelListener(this);
        this.f7034u0.setOnDismissListener(this);
        if (bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f7034u0.onRestoreInstanceState(bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: U */
    public void mo8823U(Context context) {
        super.mo8823U(context);
        if (!this.f7037x0) {
            this.f7036w0 = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: X */
    public void mo8829X(Bundle bundle) {
        boolean z11;
        super.mo8829X(bundle);
        this.f7027n0 = new Handler();
        if (this.f6928L == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f7032s0 = z11;
        if (bundle != null) {
            this.f7029p0 = bundle.getInt("android:style", 0);
            this.f7030q0 = bundle.getInt("android:theme", 0);
            this.f7031r0 = bundle.getBoolean("android:cancelable", true);
            this.f7032s0 = bundle.getBoolean("android:showsDialog", this.f7032s0);
            this.f7033t0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: e0 */
    public void mo8845e0() {
        super.mo8845e0();
        Dialog dialog = this.f7034u0;
        if (dialog != null) {
            this.f7035v0 = true;
            dialog.setOnDismissListener(null);
            this.f7034u0.dismiss();
            if (!this.f7036w0) {
                onDismiss(this.f7034u0);
            }
            this.f7034u0 = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: f0 */
    public void mo8847f0() {
        super.mo8847f0();
        if (!this.f7037x0 && !this.f7036w0) {
            this.f7036w0 = true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: g0 */
    public LayoutInflater mo8850g0(Bundle bundle) {
        if (!this.f7032s0) {
            return super.mo8850g0(bundle);
        }
        Dialog mo8953m1 = mo8953m1(bundle);
        this.f7034u0 = mo8953m1;
        if (mo8953m1 != null) {
            m8955o1(mo8953m1, this.f7029p0);
            return (LayoutInflater) this.f7034u0.getContext().getSystemService("layout_inflater");
        }
        return (LayoutInflater) this.f6924H.m8988e().getSystemService("layout_inflater");
    }

    /* renamed from: l1 */
    void m8952l1(boolean z11, boolean z12) {
        if (this.f7036w0) {
            return;
        }
        this.f7036w0 = true;
        this.f7037x0 = false;
        Dialog dialog = this.f7034u0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f7034u0.dismiss();
            if (!z12) {
                if (Looper.myLooper() == this.f7027n0.getLooper()) {
                    onDismiss(this.f7034u0);
                } else {
                    this.f7027n0.post(this.f7028o0);
                }
            }
        }
        this.f7035v0 = true;
        if (this.f7033t0 >= 0) {
            m8830X0().mo8996g(this.f7033t0, 1);
            this.f7033t0 = -1;
            return;
        }
        AbstractC1736j mo8990a = m8830X0().mo8990a();
        mo8990a.mo8937g(this);
        if (z11) {
            mo8990a.mo8935e();
        } else {
            mo8990a.mo8934d();
        }
    }

    /* renamed from: m1 */
    public abstract Dialog mo8953m1(Bundle bundle);

    /* renamed from: n1 */
    public void m8954n1(boolean z11) {
        this.f7032s0 = z11;
    }

    /* renamed from: o1 */
    public void m8955o1(Dialog dialog, int i11) {
        if (i11 != 1 && i11 != 2) {
            if (i11 == 3) {
                dialog.getWindow().addFlags(24);
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f7035v0) {
            m8952l1(true, true);
        }
    }

    /* renamed from: p1 */
    public void mo8956p1(AbstractC1733g abstractC1733g, String str) {
        this.f7036w0 = false;
        this.f7037x0 = true;
        AbstractC1736j mo8990a = abstractC1733g.mo8990a();
        mo8990a.m9139b(this, str);
        mo8990a.mo8934d();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: t0 */
    public void mo8881t0(Bundle bundle) {
        Bundle onSaveInstanceState;
        super.mo8881t0(bundle);
        Dialog dialog = this.f7034u0;
        if (dialog != null && (onSaveInstanceState = dialog.onSaveInstanceState()) != null) {
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i11 = this.f7029p0;
        if (i11 != 0) {
            bundle.putInt("android:style", i11);
        }
        int i12 = this.f7030q0;
        if (i12 != 0) {
            bundle.putInt("android:theme", i12);
        }
        boolean z11 = this.f7031r0;
        if (!z11) {
            bundle.putBoolean("android:cancelable", z11);
        }
        boolean z12 = this.f7032s0;
        if (!z12) {
            bundle.putBoolean("android:showsDialog", z12);
        }
        int i13 = this.f7033t0;
        if (i13 != -1) {
            bundle.putInt("android:backStackId", i13);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: u0 */
    public void mo8883u0() {
        super.mo8883u0();
        Dialog dialog = this.f7034u0;
        if (dialog != null) {
            this.f7035v0 = false;
            dialog.show();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: v0 */
    public void mo8885v0() {
        super.mo8885v0();
        Dialog dialog = this.f7034u0;
        if (dialog != null) {
            dialog.hide();
        }
    }
}
