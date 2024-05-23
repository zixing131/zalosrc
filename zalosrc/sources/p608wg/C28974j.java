package p608wg;

import android.os.Bundle;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.p077ui.picker.gallerypicker.GalleryPickerView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import p542ub.InterfaceC27218a;
import p608wg.InterfaceC28970f;

/* renamed from: wg.j */
/* loaded from: classes3.dex */
public final class C28974j implements InterfaceC28970f {

    /* renamed from: a */
    private final InterfaceC27218a f134097a;

    /* renamed from: b */
    private final Bundle f134098b;

    /* renamed from: c */
    private final SensitiveData f134099c;

    public C28974j(InterfaceC27218a interfaceC27218a, Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "bundle");
        this.f134097a = interfaceC27218a;
        this.f134098b = bundle;
        this.f134099c = new SensitiveData("gallery_action_media_picker", "action_common", null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m144686c(InterfaceC27218a interfaceC27218a, C28974j c28974j) {
        AbstractC19074t.m100208f(interfaceC27218a, "$it");
        AbstractC19074t.m100208f(c28974j, "this$0");
        interfaceC27218a.mo35579p().m93069k2(GalleryPickerView.class, c28974j.f134098b, 1, true);
    }

    @Override // p608wg.InterfaceC28970f
    /* renamed from: a */
    public String mo2446a(String str) {
        return InterfaceC28970f.a.m144682b(this, str);
    }

    @Override // p608wg.InterfaceC28970f
    /* renamed from: d */
    public void mo2447d() {
        final InterfaceC27218a interfaceC27218a = this.f134097a;
        if (interfaceC27218a != null) {
            this.f134098b.putBoolean("extra_send_from_action_list_media_picker", true);
            this.f134098b.putInt("extra_photo_type", 10);
            this.f134098b.putParcelable("EXTRA_SENSITIVE_DATA", this.f134099c);
            AbstractC19444a.m101697e(new Runnable() { // from class: wg.i
                @Override // java.lang.Runnable
                public final void run() {
                    C28974j.m144686c(InterfaceC27218a.this, this);
                }
            });
        }
    }

    public /* synthetic */ C28974j(InterfaceC27218a interfaceC27218a, Bundle bundle, int i11, AbstractC19060k abstractC19060k) {
        this(interfaceC27218a, (i11 & 2) != 0 ? new Bundle() : bundle);
    }
}
