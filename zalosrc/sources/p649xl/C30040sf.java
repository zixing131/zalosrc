package p649xl;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.InterfaceC1672f;
import androidx.databinding.ViewDataBinding;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zview.actionbar.ActionBar;

/* renamed from: xl.sf */
/* loaded from: classes3.dex */
public class C30040sf extends AbstractC30023rf {

    /* renamed from: V */
    private static final SparseIntArray f139347V;

    /* renamed from: T */
    private final RelativeLayout f139348T;

    /* renamed from: U */
    private long f139349U;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f139347V = sparseIntArray;
        sparseIntArray.put(AbstractC6918a0.zalo_action_bar, 1);
        sparseIntArray.put(AbstractC6918a0.tvTitle, 2);
        sparseIntArray.put(AbstractC6918a0.tvDescription, 3);
        sparseIntArray.put(AbstractC6918a0.btnSetup, 4);
    }

    public C30040sf(InterfaceC1672f interfaceC1672f, View view) {
        this(interfaceC1672f, view, ViewDataBinding.m8484B(interfaceC1672f, view, 5, null, f139347V));
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
            this.f139349U = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo8512u() {
        synchronized (this) {
            try {
                if (this.f139349U != 0) {
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
            this.f139349U = 1L;
        }
        m8502I();
    }

    private C30040sf(InterfaceC1672f interfaceC1672f, View view, Object[] objArr) {
        super(interfaceC1672f, view, 0, (Button) objArr[4], (RobotoTextView) objArr[3], (RobotoTextView) objArr[2], (ActionBar) objArr[1]);
        this.f139349U = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f139348T = relativeLayout;
        relativeLayout.setTag(null);
        m8504K(view);
        mo8513x();
    }
}
