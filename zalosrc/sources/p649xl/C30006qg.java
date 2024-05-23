package p649xl;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.InterfaceC1672f;
import androidx.databinding.ViewDataBinding;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.TrackingTextView;
import com.zing.zalo.zlottie.widget.LottieImageView;

/* renamed from: xl.qg */
/* loaded from: classes3.dex */
public class C30006qg extends AbstractC29988pg {

    /* renamed from: b0 */
    private static final SparseIntArray f139160b0;

    /* renamed from: Z */
    private final FrameLayout f139161Z;

    /* renamed from: a0 */
    private long f139162a0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f139160b0 = sparseIntArray;
        sparseIntArray.put(AbstractC6918a0.layout_migrating, 1);
        sparseIntArray.put(AbstractC6918a0.ivLottieLoading, 2);
        sparseIntArray.put(AbstractC6918a0.text_content_title, 3);
        sparseIntArray.put(AbstractC6918a0.layout_full_storage, 4);
        sparseIntArray.put(AbstractC6918a0.text_full_storage_title, 5);
        sparseIntArray.put(AbstractC6918a0.text_full_storage_desc, 6);
        sparseIntArray.put(AbstractC6918a0.text_instructions, 7);
        sparseIntArray.put(AbstractC6918a0.text_warning_full_storage, 8);
        sparseIntArray.put(AbstractC6918a0.btn_storage_manager, 9);
        sparseIntArray.put(AbstractC6918a0.btn_retry, 10);
    }

    public C30006qg(InterfaceC1672f interfaceC1672f, View view) {
        this(interfaceC1672f, view, ViewDataBinding.m8484B(interfaceC1672f, view, 11, null, f139160b0));
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
            this.f139162a0 = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo8512u() {
        synchronized (this) {
            try {
                if (this.f139162a0 != 0) {
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
            this.f139162a0 = 1L;
        }
        m8502I();
    }

    private C30006qg(InterfaceC1672f interfaceC1672f, View view, Object[] objArr) {
        super(interfaceC1672f, view, 0, (Button) objArr[10], (Button) objArr[9], (LottieImageView) objArr[2], (LinearLayoutCompat) objArr[4], (LinearLayoutCompat) objArr[1], (RobotoTextView) objArr[3], (RobotoTextView) objArr[6], (RobotoTextView) objArr[5], (TrackingTextView) objArr[7], (RobotoTextView) objArr[8]);
        this.f139162a0 = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f139161Z = frameLayout;
        frameLayout.setTag(null);
        m8504K(view);
        mo8513x();
    }
}
