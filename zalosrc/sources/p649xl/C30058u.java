package p649xl;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.databinding.InterfaceC1672f;
import androidx.databinding.ViewDataBinding;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.PasswordField;
import com.zing.zalo.zview.actionbar.ActionBar;

/* renamed from: xl.u */
/* loaded from: classes3.dex */
public class C30058u extends AbstractC30041t {

    /* renamed from: W */
    private static final SparseIntArray f139521W;

    /* renamed from: U */
    private final RelativeLayout f139522U;

    /* renamed from: V */
    private long f139523V;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f139521W = sparseIntArray;
        sparseIntArray.put(AbstractC6918a0.zalo_action_bar, 1);
        sparseIntArray.put(AbstractC6918a0.passwordField, 2);
        sparseIntArray.put(AbstractC6918a0.bottomContainerConfirm, 3);
        sparseIntArray.put(AbstractC6918a0.btnContinue, 4);
        sparseIntArray.put(AbstractC6918a0.btnForgotPassword, 5);
    }

    public C30058u(InterfaceC1672f interfaceC1672f, View view) {
        this(interfaceC1672f, view, ViewDataBinding.m8484B(interfaceC1672f, view, 6, null, f139521W));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: C */
    protected boolean mo8500C(int i11, Object obj, int i12) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: l */
    protected void mo8508l() {
        synchronized (this) {
            this.f139523V = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo8512u() {
        synchronized (this) {
            try {
                if (this.f139523V != 0) {
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: x */
    public void mo8513x() {
        synchronized (this) {
            this.f139523V = 1L;
        }
        m8502I();
    }

    private C30058u(InterfaceC1672f interfaceC1672f, View view, Object[] objArr) {
        super(interfaceC1672f, view, 0, (LinearLayout) objArr[3], (Button) objArr[4], (Button) objArr[5], (PasswordField) objArr[2], (ActionBar) objArr[1]);
        this.f139523V = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f139522U = relativeLayout;
        relativeLayout.setTag(null);
        m8504K(view);
        mo8513x();
    }
}
