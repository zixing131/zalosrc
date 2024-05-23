package p649xl;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.InterfaceC1672f;
import androidx.databinding.ViewDataBinding;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;

/* renamed from: xl.bg */
/* loaded from: classes3.dex */
public class C29736bg extends AbstractC29718ag {

    /* renamed from: W */
    private static final SparseIntArray f137365W;

    /* renamed from: U */
    private final FrameLayout f137366U;

    /* renamed from: V */
    private long f137367V;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f137365W = sparseIntArray;
        sparseIntArray.put(AbstractC6918a0.tv_title, 1);
        sparseIntArray.put(AbstractC6918a0.tvTime, 2);
        sparseIntArray.put(AbstractC6918a0.btnPositiveAction, 3);
        sparseIntArray.put(AbstractC6918a0.btnNegativeAction, 4);
        sparseIntArray.put(AbstractC6918a0.zds_action_bar, 5);
    }

    public C29736bg(InterfaceC1672f interfaceC1672f, View view) {
        this(interfaceC1672f, view, ViewDataBinding.m8484B(interfaceC1672f, view, 6, null, f137365W));
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
            this.f137367V = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo8512u() {
        synchronized (this) {
            try {
                if (this.f137367V != 0) {
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
            this.f137367V = 1L;
        }
        m8502I();
    }

    private C29736bg(InterfaceC1672f interfaceC1672f, View view, Object[] objArr) {
        super(interfaceC1672f, view, 0, (Button) objArr[4], (Button) objArr[3], (RobotoTextView) objArr[2], (RobotoTextView) objArr[1], (ZdsActionBar) objArr[5]);
        this.f137367V = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f137366U = frameLayout;
        frameLayout.setTag(null);
        m8504K(view);
        mo8513x();
    }
}
