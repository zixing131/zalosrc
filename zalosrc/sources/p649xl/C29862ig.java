package p649xl;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.InterfaceC1672f;
import androidx.databinding.ViewDataBinding;

/* renamed from: xl.ig */
/* loaded from: classes3.dex */
public class C29862ig extends AbstractC29844hg {

    /* renamed from: R */
    private static final SparseIntArray f138214R = null;

    /* renamed from: Q */
    private long f138215Q;

    public C29862ig(InterfaceC1672f interfaceC1672f, View view) {
        this(interfaceC1672f, view, ViewDataBinding.m8484B(interfaceC1672f, view, 1, null, f138214R));
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
            this.f138215Q = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo8512u() {
        synchronized (this) {
            try {
                if (this.f138215Q != 0) {
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
            this.f138215Q = 1L;
        }
        m8502I();
    }

    private C29862ig(InterfaceC1672f interfaceC1672f, View view, Object[] objArr) {
        super(interfaceC1672f, view, 0, (FrameLayout) objArr[0]);
        this.f138215Q = -1L;
        this.f138075P.setTag(null);
        m8504K(view);
        mo8513x();
    }
}