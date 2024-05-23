package p649xl;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.InterfaceC1672f;
import androidx.databinding.ViewDataBinding;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zalocloud.customviews.StepperListView;
import com.zing.zalo.zdesign.component.Button;

/* renamed from: xl.ne */
/* loaded from: classes3.dex */
public class C29950ne extends AbstractC29932me {

    /* renamed from: Z */
    private static final SparseIntArray f138818Z;

    /* renamed from: X */
    private final RelativeLayout f138819X;

    /* renamed from: Y */
    private long f138820Y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f138818Z = sparseIntArray;
        sparseIntArray.put(AbstractC6918a0.toolBarContainer, 1);
        sparseIntArray.put(AbstractC6918a0.titleContainer, 2);
        sparseIntArray.put(AbstractC6918a0.titleIcon, 3);
        sparseIntArray.put(AbstractC6918a0.ivVipStatus, 4);
        sparseIntArray.put(AbstractC6918a0.tvTitle, 5);
        sparseIntArray.put(AbstractC6918a0.stepperView, 6);
        sparseIntArray.put(AbstractC6918a0.snackBarContainer, 7);
        sparseIntArray.put(AbstractC6918a0.btnStart, 8);
    }

    public C29950ne(InterfaceC1672f interfaceC1672f, View view) {
        this(interfaceC1672f, view, ViewDataBinding.m8484B(interfaceC1672f, view, 9, null, f138818Z));
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
            this.f138820Y = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo8512u() {
        synchronized (this) {
            try {
                if (this.f138820Y != 0) {
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
            this.f138820Y = 1L;
        }
        m8502I();
    }

    private C29950ne(InterfaceC1672f interfaceC1672f, View view, Object[] objArr) {
        super(interfaceC1672f, view, 0, (Button) objArr[8], (AppCompatImageView) objArr[4], (FrameLayout) objArr[7], (StepperListView) objArr[6], (LinearLayout) objArr[2], (AppCompatImageView) objArr[3], (RelativeLayout) objArr[1], (RobotoTextView) objArr[5]);
        this.f138820Y = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f138819X = relativeLayout;
        relativeLayout.setTag(null);
        m8504K(view);
        mo8513x();
    }
}
