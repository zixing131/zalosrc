package p649xl;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.ZAppCompatImageView;
import androidx.databinding.InterfaceC1672f;
import androidx.databinding.ViewDataBinding;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.ProgressBar;
import com.zing.zalo.zview.actionbar.ActionBar;

/* renamed from: xl.we */
/* loaded from: classes3.dex */
public class C30107we extends AbstractC30090ve {

    /* renamed from: e0 */
    private static final SparseIntArray f139844e0;

    /* renamed from: c0 */
    private final RelativeLayout f139845c0;

    /* renamed from: d0 */
    private long f139846d0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f139844e0 = sparseIntArray;
        sparseIntArray.put(AbstractC6918a0.zalo_action_bar, 1);
        sparseIntArray.put(AbstractC6918a0.titleIcon, 2);
        sparseIntArray.put(AbstractC6918a0.tvTitle, 3);
        sparseIntArray.put(AbstractC6918a0.summaryDetailsContainer, 4);
        sparseIntArray.put(AbstractC6918a0.tvMediaSize, 5);
        sparseIntArray.put(AbstractC6918a0.downloadingContainer, 6);
        sparseIntArray.put(AbstractC6918a0.tvDownloadStatus, 7);
        sparseIntArray.put(AbstractC6918a0.tvProgress, 8);
        sparseIntArray.put(AbstractC6918a0.progressBar, 9);
        sparseIntArray.put(AbstractC6918a0.errorContainer, 10);
        sparseIntArray.put(AbstractC6918a0.ivLeadingIcon, 11);
        sparseIntArray.put(AbstractC6918a0.mainContent, 12);
        sparseIntArray.put(AbstractC6918a0.tvError, 13);
    }

    public C30107we(InterfaceC1672f interfaceC1672f, View view) {
        this(interfaceC1672f, view, ViewDataBinding.m8484B(interfaceC1672f, view, 14, null, f139844e0));
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
            this.f139846d0 = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo8512u() {
        synchronized (this) {
            try {
                if (this.f139846d0 != 0) {
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
            this.f139846d0 = 1L;
        }
        m8502I();
    }

    private C30107we(InterfaceC1672f interfaceC1672f, View view, Object[] objArr) {
        super(interfaceC1672f, view, 0, (LinearLayout) objArr[6], (RelativeLayout) objArr[10], (ZAppCompatImageView) objArr[11], (LinearLayout) objArr[12], (ProgressBar) objArr[9], (LinearLayout) objArr[4], (AppCompatImageView) objArr[2], (RobotoTextView) objArr[7], (RobotoTextView) objArr[13], (RobotoTextView) objArr[5], (RobotoTextView) objArr[8], (RobotoTextView) objArr[3], (ActionBar) objArr[1]);
        this.f139846d0 = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f139845c0 = relativeLayout;
        relativeLayout.setTag(null);
        m8504K(view);
        mo8513x();
    }
}
