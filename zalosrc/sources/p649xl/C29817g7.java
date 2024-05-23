package p649xl;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.InterfaceC1672f;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;

/* renamed from: xl.g7 */
/* loaded from: classes3.dex */
public class C29817g7 extends AbstractC29799f7 {

    /* renamed from: S */
    private static final SparseIntArray f137870S;

    /* renamed from: Q */
    private final LinearLayout f137871Q;

    /* renamed from: R */
    private long f137872R;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f137870S = sparseIntArray;
        sparseIntArray.put(AbstractC6918a0.recycle_view_sort_by, 1);
    }

    public C29817g7(InterfaceC1672f interfaceC1672f, View view) {
        this(interfaceC1672f, view, ViewDataBinding.m8484B(interfaceC1672f, view, 2, null, f137870S));
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
            this.f137872R = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo8512u() {
        synchronized (this) {
            try {
                if (this.f137872R != 0) {
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
            this.f137872R = 1L;
        }
        m8502I();
    }

    private C29817g7(InterfaceC1672f interfaceC1672f, View view, Object[] objArr) {
        super(interfaceC1672f, view, 0, (RecyclerView) objArr[1]);
        this.f137872R = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f137871Q = linearLayout;
        linearLayout.setTag(null);
        m8504K(view);
        mo8513x();
    }
}
