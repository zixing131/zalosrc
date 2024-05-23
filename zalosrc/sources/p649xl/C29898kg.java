package p649xl;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.databinding.C1681o;
import androidx.databinding.InterfaceC1672f;
import androidx.databinding.ViewDataBinding;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.zdesign.component.ListItem;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;

/* renamed from: xl.kg */
/* loaded from: classes3.dex */
public class C29898kg extends AbstractC29880jg {

    /* renamed from: X */
    private static final SparseIntArray f138510X;

    /* renamed from: V */
    private final LinearLayout f138511V;

    /* renamed from: W */
    private long f138512W;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f138510X = sparseIntArray;
        sparseIntArray.put(AbstractC6918a0.zds_action_bar, 1);
        sparseIntArray.put(AbstractC6918a0.stub_banner_migration_drive, 2);
        sparseIntArray.put(AbstractC6918a0.dataProtectionSection, 3);
        sparseIntArray.put(AbstractC6918a0.liAutoFreeUpStorage, 4);
        sparseIntArray.put(AbstractC6918a0.migrateNetworkSection, 5);
        sparseIntArray.put(AbstractC6918a0.sizeSettingSection, 6);
    }

    public C29898kg(InterfaceC1672f interfaceC1672f, View view) {
        this(interfaceC1672f, view, ViewDataBinding.m8484B(interfaceC1672f, view, 7, null, f138510X));
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
            this.f138512W = 0L;
        }
        if (this.f138357T.m8568g() != null) {
            ViewDataBinding.m8495n(this.f138357T.m8568g());
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo8512u() {
        synchronized (this) {
            try {
                if (this.f138512W != 0) {
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
            this.f138512W = 1L;
        }
        m8502I();
    }

    private C29898kg(InterfaceC1672f interfaceC1672f, View view, Object[] objArr) {
        super(interfaceC1672f, view, 0, (ListItem) objArr[3], (ListItem) objArr[4], (ListItem) objArr[5], (ListItem) objArr[6], new C1681o((ViewStub) objArr[2]), (ZdsActionBar) objArr[1]);
        this.f138512W = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f138511V = linearLayout;
        linearLayout.setTag(null);
        this.f138357T.m8571j(this);
        m8504K(view);
        mo8513x();
    }
}
