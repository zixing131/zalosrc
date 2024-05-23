package p649xl;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.InterfaceC1672f;
import androidx.databinding.ViewDataBinding;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.AbstractC6918a0;

/* renamed from: xl.p7 */
/* loaded from: classes3.dex */
public class C29979p7 extends AbstractC29961o7 {

    /* renamed from: T */
    private static final SparseIntArray f138972T;

    /* renamed from: Q */
    private final C30063u4 f138973Q;

    /* renamed from: R */
    private final FrameLayout f138974R;

    /* renamed from: S */
    private long f138975S;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f138972T = sparseIntArray;
        sparseIntArray.put(AbstractC6918a0.pager, 2);
    }

    public C29979p7(InterfaceC1672f interfaceC1672f, View view) {
        this(interfaceC1672f, view, ViewDataBinding.m8484B(interfaceC1672f, view, 3, null, f138972T));
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
            this.f138975S = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo8512u() {
        synchronized (this) {
            try {
                if (this.f138975S != 0) {
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
            this.f138975S = 1L;
        }
        m8502I();
    }

    private C29979p7(InterfaceC1672f interfaceC1672f, View view, Object[] objArr) {
        super(interfaceC1672f, view, 0, (ViewPager) objArr[2]);
        this.f138975S = -1L;
        Object obj = objArr[1];
        this.f138973Q = obj != null ? C30063u4.m148563a((View) obj) : null;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f138974R = frameLayout;
        frameLayout.setTag(null);
        m8504K(view);
        mo8513x();
    }
}
