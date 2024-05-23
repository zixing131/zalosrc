package p649xl;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.databinding.C1681o;
import androidx.databinding.InterfaceC1672f;
import androidx.databinding.ViewDataBinding;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.uicomponents.imagebutton.ActiveImageButton;

/* renamed from: xl.c3 */
/* loaded from: classes3.dex */
public class C29741c3 extends AbstractC29723b3 {

    /* renamed from: U */
    private static final SparseIntArray f137388U;

    /* renamed from: S */
    private final LinearLayout f137389S;

    /* renamed from: T */
    private long f137390T;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f137388U = sparseIntArray;
        sparseIntArray.put(AbstractC6918a0.btnClose, 1);
        sparseIntArray.put(AbstractC6918a0.stubE2eeUpgradeStateView, 2);
        sparseIntArray.put(AbstractC6918a0.stubOldE2eeIntroView, 3);
    }

    public C29741c3(InterfaceC1672f interfaceC1672f, View view) {
        this(interfaceC1672f, view, ViewDataBinding.m8484B(interfaceC1672f, view, 4, null, f137388U));
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
            this.f137390T = 0L;
        }
        if (this.f137295Q.m8568g() != null) {
            ViewDataBinding.m8495n(this.f137295Q.m8568g());
        }
        if (this.f137296R.m8568g() != null) {
            ViewDataBinding.m8495n(this.f137296R.m8568g());
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo8512u() {
        synchronized (this) {
            try {
                if (this.f137390T != 0) {
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
            this.f137390T = 1L;
        }
        m8502I();
    }

    private C29741c3(InterfaceC1672f interfaceC1672f, View view, Object[] objArr) {
        super(interfaceC1672f, view, 0, (ActiveImageButton) objArr[1], new C1681o((ViewStub) objArr[2]), new C1681o((ViewStub) objArr[3]));
        this.f137390T = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f137389S = linearLayout;
        linearLayout.setTag(null);
        this.f137295Q.m8571j(this);
        this.f137296R.m8571j(this);
        m8504K(view);
        mo8513x();
    }
}
