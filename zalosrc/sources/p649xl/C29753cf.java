package p649xl;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.InterfaceC1672f;
import androidx.databinding.ViewDataBinding;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zview.actionbar.ActionBar;

/* renamed from: xl.cf */
/* loaded from: classes3.dex */
public class C29753cf extends AbstractC29735bf {

    /* renamed from: X */
    private static final SparseIntArray f137449X;

    /* renamed from: V */
    private final RelativeLayout f137450V;

    /* renamed from: W */
    private long f137451W;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f137449X = sparseIntArray;
        sparseIntArray.put(AbstractC6918a0.zalo_action_bar, 1);
        sparseIntArray.put(AbstractC6918a0.tvMainTitle, 2);
        sparseIntArray.put(AbstractC6918a0.tvTimeBackupInfo, 3);
        sparseIntArray.put(AbstractC6918a0.tvDeviceBackupInfo, 4);
        sparseIntArray.put(AbstractC6918a0.btnKeepData, 5);
        sparseIntArray.put(AbstractC6918a0.btnDeleteData, 6);
    }

    public C29753cf(InterfaceC1672f interfaceC1672f, View view) {
        this(interfaceC1672f, view, ViewDataBinding.m8484B(interfaceC1672f, view, 7, null, f137449X));
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
            this.f137451W = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo8512u() {
        synchronized (this) {
            try {
                if (this.f137451W != 0) {
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
            this.f137451W = 1L;
        }
        m8502I();
    }

    private C29753cf(InterfaceC1672f interfaceC1672f, View view, Object[] objArr) {
        super(interfaceC1672f, view, 0, (Button) objArr[6], (Button) objArr[5], (RobotoTextView) objArr[4], (RobotoTextView) objArr[2], (RobotoTextView) objArr[3], (ActionBar) objArr[1]);
        this.f137451W = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.f137450V = relativeLayout;
        relativeLayout.setTag(null);
        m8504K(view);
        mo8513x();
    }
}
