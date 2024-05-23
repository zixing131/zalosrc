package p649xl;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.ZAppCompatImageView;
import androidx.databinding.InterfaceC1672f;
import androidx.databinding.ViewDataBinding;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.ProgressBar;
import com.zing.zalo.zview.actionbar.ActionBar;

/* renamed from: xl.af */
/* loaded from: classes3.dex */
public class C29717af extends AbstractC30158ze {

    /* renamed from: k0 */
    private static final SparseIntArray f137268k0;

    /* renamed from: i0 */
    private final RelativeLayout f137269i0;

    /* renamed from: j0 */
    private long f137270j0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f137268k0 = sparseIntArray;
        sparseIntArray.put(AbstractC6918a0.zalo_action_bar, 1);
        sparseIntArray.put(AbstractC6918a0.titleIcon, 2);
        sparseIntArray.put(AbstractC6918a0.tvTitle, 3);
        sparseIntArray.put(AbstractC6918a0.summaryDetailsContainer, 4);
        sparseIntArray.put(AbstractC6918a0.calculatingContainer, 5);
        sparseIntArray.put(AbstractC6918a0.progressBarMigrate, 6);
        sparseIntArray.put(AbstractC6918a0.detailsContainer, 7);
        sparseIntArray.put(AbstractC6918a0.tvMediaSize, 8);
        sparseIntArray.put(AbstractC6918a0.btnMoreInfo, 9);
        sparseIntArray.put(AbstractC6918a0.tvAvailableOnDeviceSize, 10);
        sparseIntArray.put(AbstractC6918a0.tvDownloadedSize, 11);
        sparseIntArray.put(AbstractC6918a0.parentBottomContainer, 12);
        sparseIntArray.put(AbstractC6918a0.bottomContainer, 13);
        sparseIntArray.put(AbstractC6918a0.errorContainer, 14);
        sparseIntArray.put(AbstractC6918a0.ivLeadingIcon, 15);
        sparseIntArray.put(AbstractC6918a0.tvStorageError, 16);
        sparseIntArray.put(AbstractC6918a0.btnFreeUp, 17);
        sparseIntArray.put(AbstractC6918a0.tvAvailable, 18);
        sparseIntArray.put(AbstractC6918a0.btnStart, 19);
    }

    public C29717af(InterfaceC1672f interfaceC1672f, View view) {
        this(interfaceC1672f, view, ViewDataBinding.m8484B(interfaceC1672f, view, 20, null, f137268k0));
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
            this.f137270j0 = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo8512u() {
        synchronized (this) {
            try {
                if (this.f137270j0 != 0) {
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
            this.f137270j0 = 1L;
        }
        m8502I();
    }

    private C29717af(InterfaceC1672f interfaceC1672f, View view, Object[] objArr) {
        super(interfaceC1672f, view, 0, (LinearLayout) objArr[13], (Button) objArr[17], (AppCompatImageView) objArr[9], (Button) objArr[19], (FrameLayout) objArr[5], (LinearLayout) objArr[7], (RelativeLayout) objArr[14], (ZAppCompatImageView) objArr[15], (FrameLayout) objArr[12], (ProgressBar) objArr[6], (FrameLayout) objArr[4], (AppCompatImageView) objArr[2], (RobotoTextView) objArr[18], (RobotoTextView) objArr[10], (RobotoTextView) objArr[11], (RobotoTextView) objArr[8], (RobotoTextView) objArr[16], (RobotoTextView) objArr[3], (ActionBar) objArr[1]);
        this.f137270j0 = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f137269i0 = relativeLayout;
        relativeLayout.setTag(null);
        m8504K(view);
        mo8513x();
    }
}
