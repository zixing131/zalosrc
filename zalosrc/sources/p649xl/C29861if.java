package p649xl;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.InterfaceC1672f;
import androidx.databinding.ViewDataBinding;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.ScrollView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zview.actionbar.ActionBar;

/* renamed from: xl.if */
/* loaded from: classes3.dex */
public class C29861if extends AbstractC29843hf {

    /* renamed from: a0 */
    private static final SparseIntArray f138211a0;

    /* renamed from: Y */
    private final RelativeLayout f138212Y;

    /* renamed from: Z */
    private long f138213Z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f138211a0 = sparseIntArray;
        sparseIntArray.put(AbstractC6918a0.zalo_action_bar, 1);
        sparseIntArray.put(AbstractC6918a0.scrollView, 2);
        sparseIntArray.put(AbstractC6918a0.titleIcon, 3);
        sparseIntArray.put(AbstractC6918a0.tvTitle, 4);
        sparseIntArray.put(AbstractC6918a0.descriptionContainer, 5);
        sparseIntArray.put(AbstractC6918a0.btnUsePin, 6);
        sparseIntArray.put(AbstractC6918a0.fakeView, 7);
        sparseIntArray.put(AbstractC6918a0.bottomContainer, 8);
        sparseIntArray.put(AbstractC6918a0.btnUsePassphrase, 9);
    }

    public C29861if(InterfaceC1672f interfaceC1672f, View view) {
        this(interfaceC1672f, view, ViewDataBinding.m8484B(interfaceC1672f, view, 10, null, f138211a0));
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
            this.f138213Z = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo8512u() {
        synchronized (this) {
            try {
                if (this.f138213Z != 0) {
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
            this.f138213Z = 1L;
        }
        m8502I();
    }

    private C29861if(InterfaceC1672f interfaceC1672f, View view, Object[] objArr) {
        super(interfaceC1672f, view, 0, (LinearLayout) objArr[8], (Button) objArr[9], (Button) objArr[6], (LinearLayout) objArr[5], (View) objArr[7], (ScrollView) objArr[2], (AppCompatImageView) objArr[3], (RobotoTextView) objArr[4], (ActionBar) objArr[1]);
        this.f138213Z = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f138212Y = relativeLayout;
        relativeLayout.setTag(null);
        m8504K(view);
        mo8513x();
    }
}
