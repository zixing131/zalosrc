package p649xl;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.InterfaceC1672f;
import androidx.databinding.ViewDataBinding;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;

/* renamed from: xl.i7 */
/* loaded from: classes3.dex */
public class C29853i7 extends AbstractC29835h7 {

    /* renamed from: T */
    private static final SparseIntArray f138150T;

    /* renamed from: R */
    private final RelativeLayout f138151R;

    /* renamed from: S */
    private long f138152S;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f138150T = sparseIntArray;
        sparseIntArray.put(AbstractC6918a0.divider, 1);
        sparseIntArray.put(AbstractC6918a0.tv_date, 2);
    }

    public C29853i7(InterfaceC1672f interfaceC1672f, View view) {
        this(interfaceC1672f, view, ViewDataBinding.m8484B(interfaceC1672f, view, 3, null, f138150T));
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
            this.f138152S = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo8512u() {
        synchronized (this) {
            try {
                if (this.f138152S != 0) {
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
            this.f138152S = 1L;
        }
        m8502I();
    }

    private C29853i7(InterfaceC1672f interfaceC1672f, View view, Object[] objArr) {
        super(interfaceC1672f, view, 0, (View) objArr[1], (RobotoTextView) objArr[2]);
        this.f138152S = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f138151R = relativeLayout;
        relativeLayout.setTag(null);
        m8504K(view);
        mo8513x();
    }
}
