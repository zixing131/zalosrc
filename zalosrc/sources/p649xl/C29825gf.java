package p649xl;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.InterfaceC1672f;
import androidx.databinding.ViewDataBinding;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zview.actionbar.ActionBar;

/* renamed from: xl.gf */
/* loaded from: classes3.dex */
public class C29825gf extends AbstractC29807ff {

    /* renamed from: Y */
    private static final SparseIntArray f137914Y;

    /* renamed from: W */
    private final RelativeLayout f137915W;

    /* renamed from: X */
    private long f137916X;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f137914Y = sparseIntArray;
        sparseIntArray.put(AbstractC6918a0.zalo_action_bar, 1);
        sparseIntArray.put(AbstractC6918a0.titleIcon, 2);
        sparseIntArray.put(AbstractC6918a0.tvTitle, 3);
        sparseIntArray.put(AbstractC6918a0.tvDescription, 4);
        sparseIntArray.put(AbstractC6918a0.bottomContainerConfirm, 5);
        sparseIntArray.put(AbstractC6918a0.btnGotIt, 6);
        sparseIntArray.put(AbstractC6918a0.btnCreateNewCode, 7);
    }

    public C29825gf(InterfaceC1672f interfaceC1672f, View view) {
        this(interfaceC1672f, view, ViewDataBinding.m8484B(interfaceC1672f, view, 8, null, f137914Y));
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
            this.f137916X = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo8512u() {
        synchronized (this) {
            try {
                if (this.f137916X != 0) {
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
            this.f137916X = 1L;
        }
        m8502I();
    }

    private C29825gf(InterfaceC1672f interfaceC1672f, View view, Object[] objArr) {
        super(interfaceC1672f, view, 0, (LinearLayout) objArr[5], (Button) objArr[7], (Button) objArr[6], (AppCompatImageView) objArr[2], (RobotoTextView) objArr[4], (RobotoTextView) objArr[3], (ActionBar) objArr[1]);
        this.f137916X = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f137915W = relativeLayout;
        relativeLayout.setTag(null);
        m8504K(view);
        mo8513x();
    }
}
