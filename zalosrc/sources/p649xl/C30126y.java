package p649xl;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.InterfaceC1672f;
import androidx.databinding.ViewDataBinding;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.ScrollView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.OtpField;
import com.zing.zalo.zview.actionbar.ActionBar;

/* renamed from: xl.y */
/* loaded from: classes3.dex */
public class C30126y extends AbstractC30109x {

    /* renamed from: a0 */
    private static final SparseIntArray f139979a0;

    /* renamed from: Y */
    private final RelativeLayout f139980Y;

    /* renamed from: Z */
    private long f139981Z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f139979a0 = sparseIntArray;
        sparseIntArray.put(AbstractC6918a0.zalo_action_bar, 1);
        sparseIntArray.put(AbstractC6918a0.scrollView, 2);
        sparseIntArray.put(AbstractC6918a0.tvTitle, 3);
        sparseIntArray.put(AbstractC6918a0.optFiled, 4);
        sparseIntArray.put(AbstractC6918a0.infoContainer, 5);
        sparseIntArray.put(AbstractC6918a0.ivIconInfo, 6);
        sparseIntArray.put(AbstractC6918a0.infoContainerBottom, 7);
        sparseIntArray.put(AbstractC6918a0.ivIconInfoBottom, 8);
        sparseIntArray.put(AbstractC6918a0.btnContinue, 9);
    }

    public C30126y(InterfaceC1672f interfaceC1672f, View view) {
        this(interfaceC1672f, view, ViewDataBinding.m8484B(interfaceC1672f, view, 10, null, f139979a0));
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
            this.f139981Z = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo8512u() {
        synchronized (this) {
            try {
                if (this.f139981Z != 0) {
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
            this.f139981Z = 1L;
        }
        m8502I();
    }

    private C30126y(InterfaceC1672f interfaceC1672f, View view, Object[] objArr) {
        super(interfaceC1672f, view, 0, (Button) objArr[9], (RelativeLayout) objArr[5], (RelativeLayout) objArr[7], (AppCompatImageView) objArr[6], (AppCompatImageView) objArr[8], (OtpField) objArr[4], (ScrollView) objArr[2], (RobotoTextView) objArr[3], (ActionBar) objArr[1]);
        this.f139981Z = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f139980Y = relativeLayout;
        relativeLayout.setTag(null);
        m8504K(view);
        mo8513x();
    }
}
