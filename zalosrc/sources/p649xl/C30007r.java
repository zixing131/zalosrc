package p649xl;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.databinding.InterfaceC1672f;
import androidx.databinding.ViewDataBinding;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.backuprestore.encryption.setup.passphrase.SecretPhaseView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zview.actionbar.ActionBar;

/* renamed from: xl.r */
/* loaded from: classes3.dex */
public class C30007r extends AbstractC29989q {

    /* renamed from: a0 */
    private static final SparseIntArray f139163a0;

    /* renamed from: Y */
    private final RelativeLayout f139164Y;

    /* renamed from: Z */
    private long f139165Z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f139163a0 = sparseIntArray;
        sparseIntArray.put(AbstractC6918a0.zalo_action_bar, 1);
        sparseIntArray.put(AbstractC6918a0.secretPhraseContainer, 2);
        sparseIntArray.put(AbstractC6918a0.tvTitle, 3);
        sparseIntArray.put(AbstractC6918a0.tvPrivateKey, 4);
        sparseIntArray.put(AbstractC6918a0.snackBarContainer, 5);
        sparseIntArray.put(AbstractC6918a0.bottomContainer, 6);
        sparseIntArray.put(AbstractC6918a0.bottomContainerConfirm, 7);
        sparseIntArray.put(AbstractC6918a0.btnSave, 8);
        sparseIntArray.put(AbstractC6918a0.btnContinue, 9);
    }

    public C30007r(InterfaceC1672f interfaceC1672f, View view) {
        this(interfaceC1672f, view, ViewDataBinding.m8484B(interfaceC1672f, view, 10, null, f139163a0));
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
            this.f139165Z = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo8512u() {
        synchronized (this) {
            try {
                if (this.f139165Z != 0) {
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
            this.f139165Z = 1L;
        }
        m8502I();
    }

    private C30007r(InterfaceC1672f interfaceC1672f, View view, Object[] objArr) {
        super(interfaceC1672f, view, 0, (FrameLayout) objArr[6], (LinearLayout) objArr[7], (Button) objArr[9], (Button) objArr[8], (LinearLayout) objArr[2], (FrameLayout) objArr[5], (SecretPhaseView) objArr[4], (RobotoTextView) objArr[3], (ActionBar) objArr[1]);
        this.f139165Z = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f139164Y = relativeLayout;
        relativeLayout.setTag(null);
        m8504K(view);
        mo8513x();
    }
}
