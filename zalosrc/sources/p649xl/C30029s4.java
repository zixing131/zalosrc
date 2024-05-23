package p649xl;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.InterfaceC1672f;
import androidx.databinding.ViewDataBinding;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.CheckBox;
import com.zing.zalo.zdesign.component.Switch;

/* renamed from: xl.s4 */
/* loaded from: classes3.dex */
public class C30029s4 extends AbstractC30012r4 {

    /* renamed from: b0 */
    private static final SparseIntArray f139287b0;

    /* renamed from: Z */
    private final LinearLayout f139288Z;

    /* renamed from: a0 */
    private long f139289a0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f139287b0 = sparseIntArray;
        sparseIntArray.put(AbstractC6918a0.btnExpandOrCollapseContainer, 1);
        sparseIntArray.put(AbstractC6918a0.title, 2);
        sparseIntArray.put(AbstractC6918a0.btnExpandOrCollapse, 3);
        sparseIntArray.put(AbstractC6918a0.checkBoxContainer, 4);
        sparseIntArray.put(AbstractC6918a0.checkBox, 5);
        sparseIntArray.put(AbstractC6918a0.expandContainer, 6);
        sparseIntArray.put(AbstractC6918a0.description, 7);
        sparseIntArray.put(AbstractC6918a0.llAdditionalConfig, 8);
        sparseIntArray.put(AbstractC6918a0.tvTitleSubConfig, 9);
        sparseIntArray.put(AbstractC6918a0.ssConfigAutoBackup, 10);
    }

    public C30029s4(InterfaceC1672f interfaceC1672f, View view) {
        this(interfaceC1672f, view, ViewDataBinding.m8484B(interfaceC1672f, view, 11, null, f139287b0));
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
            this.f139289a0 = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo8512u() {
        synchronized (this) {
            try {
                if (this.f139289a0 != 0) {
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
            this.f139289a0 = 1L;
        }
        m8502I();
    }

    private C30029s4(InterfaceC1672f interfaceC1672f, View view, Object[] objArr) {
        super(interfaceC1672f, view, 0, (AppCompatImageView) objArr[3], (LinearLayout) objArr[1], (CheckBox) objArr[5], (FrameLayout) objArr[4], (RobotoTextView) objArr[7], (LinearLayout) objArr[6], (LinearLayout) objArr[8], (Switch) objArr[10], (RobotoTextView) objArr[2], (RobotoTextView) objArr[9]);
        this.f139289a0 = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f139288Z = linearLayout;
        linearLayout.setTag(null);
        m8504K(view);
        mo8513x();
    }
}
