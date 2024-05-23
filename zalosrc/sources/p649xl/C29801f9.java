package p649xl;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.InterfaceC1672f;
import androidx.databinding.ViewDataBinding;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Avatar;
import com.zing.zalo.zdesign.component.Button;

/* renamed from: xl.f9 */
/* loaded from: classes3.dex */
public class C29801f9 extends AbstractC29783e9 {

    /* renamed from: X */
    private static final SparseIntArray f137754X;

    /* renamed from: W */
    private long f137755W;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f137754X = sparseIntArray;
        sparseIntArray.put(AbstractC6918a0.avatar, 1);
        sparseIntArray.put(AbstractC6918a0.icon_corner, 2);
        sparseIntArray.put(AbstractC6918a0.title, 3);
        sparseIntArray.put(AbstractC6918a0.icon_first, 4);
        sparseIntArray.put(AbstractC6918a0.icon_second, 5);
        sparseIntArray.put(AbstractC6918a0.cta, 6);
    }

    public C29801f9(InterfaceC1672f interfaceC1672f, View view) {
        this(interfaceC1672f, view, ViewDataBinding.m8484B(interfaceC1672f, view, 7, null, f137754X));
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
            this.f137755W = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo8512u() {
        synchronized (this) {
            try {
                if (this.f137755W != 0) {
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
            this.f137755W = 1L;
        }
        m8502I();
    }

    private C29801f9(InterfaceC1672f interfaceC1672f, View view, Object[] objArr) {
        super(interfaceC1672f, view, 0, (Avatar) objArr[1], (Button) objArr[6], (ImageView) objArr[2], (ImageView) objArr[4], (ImageView) objArr[5], (LinearLayout) objArr[0], (RobotoTextView) objArr[3]);
        this.f137755W = -1L;
        this.f137677U.setTag(null);
        m8504K(view);
        mo8513x();
    }
}
