package p649xl;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.databinding.InterfaceC1672f;
import androidx.databinding.ViewDataBinding;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.ListItem;
import com.zing.zalo.zview.actionbar.ActionBar;

/* renamed from: xl.o */
/* loaded from: classes3.dex */
public class C29953o extends AbstractC29935n {

    /* renamed from: Y */
    private static final SparseIntArray f138838Y;

    /* renamed from: W */
    private final RelativeLayout f138839W;

    /* renamed from: X */
    private long f138840X;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f138838Y = sparseIntArray;
        sparseIntArray.put(AbstractC6918a0.zalo_action_bar, 1);
        sparseIntArray.put(AbstractC6918a0.tvTitle, 2);
        sparseIntArray.put(AbstractC6918a0.passwordContainer, 3);
        sparseIntArray.put(AbstractC6918a0.headerListItemPassword, 4);
        sparseIntArray.put(AbstractC6918a0.secretPhraseContainer, 5);
        sparseIntArray.put(AbstractC6918a0.headerListItemSecretPhrase, 6);
        sparseIntArray.put(AbstractC6918a0.btnContinue, 7);
    }

    public C29953o(InterfaceC1672f interfaceC1672f, View view) {
        this(interfaceC1672f, view, ViewDataBinding.m8484B(interfaceC1672f, view, 8, null, f138838Y));
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
            this.f138840X = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo8512u() {
        synchronized (this) {
            try {
                if (this.f138840X != 0) {
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
            this.f138840X = 1L;
        }
        m8502I();
    }

    private C29953o(InterfaceC1672f interfaceC1672f, View view, Object[] objArr) {
        super(interfaceC1672f, view, 0, (Button) objArr[7], (ListItem) objArr[4], (ListItem) objArr[6], (LinearLayout) objArr[3], (LinearLayout) objArr[5], (RobotoTextView) objArr[2], (ActionBar) objArr[1]);
        this.f138840X = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f138839W = relativeLayout;
        relativeLayout.setTag(null);
        m8504K(view);
        mo8513x();
    }
}
