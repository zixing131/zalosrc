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

/* renamed from: xl.kf */
/* loaded from: classes3.dex */
public class C29897kf extends AbstractC29879jf {

    /* renamed from: U */
    private static final SparseIntArray f138507U;

    /* renamed from: S */
    private final RelativeLayout f138508S;

    /* renamed from: T */
    private long f138509T;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f138507U = sparseIntArray;
        sparseIntArray.put(AbstractC6918a0.zalo_action_bar, 1);
        sparseIntArray.put(AbstractC6918a0.tvTitle, 2);
        sparseIntArray.put(AbstractC6918a0.btnStart, 3);
    }

    public C29897kf(InterfaceC1672f interfaceC1672f, View view) {
        this(interfaceC1672f, view, ViewDataBinding.m8484B(interfaceC1672f, view, 4, null, f138507U));
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
            this.f138509T = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo8512u() {
        synchronized (this) {
            try {
                if (this.f138509T != 0) {
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
            this.f138509T = 1L;
        }
        m8502I();
    }

    private C29897kf(InterfaceC1672f interfaceC1672f, View view, Object[] objArr) {
        super(interfaceC1672f, view, 0, (Button) objArr[3], (RobotoTextView) objArr[2], (ActionBar) objArr[1]);
        this.f138509T = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f138508S = relativeLayout;
        relativeLayout.setTag(null);
        m8504K(view);
        mo8513x();
    }
}
