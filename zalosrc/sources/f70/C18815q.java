package f70;

import android.content.Context;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import fn0.AbstractC19074t;

/* renamed from: f70.q */
/* loaded from: classes5.dex */
public final class C18815q {

    /* renamed from: a */
    public static final C18815q f94092a = new C18815q();

    private C18815q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m98779c(InterfaceC17463d interfaceC17463d, int i11) {
    }

    /* renamed from: b */
    public final void m98780b(Context context, InterfaceC17463d.d dVar, boolean z11) {
        int i11;
        int i12;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(dVar, "onConfirm");
        C16972e0.a aVar = new C16972e0.a(context);
        aVar.m90932i(C16972e0.b.DIALOG_INFORMATION);
        if (z11) {
            i11 = AbstractC8020f0.str_leave_community_title;
        } else {
            i11 = AbstractC8020f0.str_leave_group_silently_bottom_sheet_title;
        }
        String string = context.getString(i11);
        AbstractC19074t.m100207e(string, "getString(...)");
        aVar.m90949z(string);
        aVar.m90921E(true);
        if (z11) {
            i12 = AbstractC8020f0.str_leave_community;
        } else {
            i12 = AbstractC8020f0.str_leave_group_silently_confirm_btn;
        }
        String string2 = context.getString(i12);
        AbstractC19074t.m100207e(string2, "getString(...)");
        aVar.m90943t(string2, dVar);
        String string3 = context.getString(AbstractC8020f0.str_leave_group_silently_cancel_btn);
        AbstractC19074t.m100207e(string3, "getString(...)");
        aVar.m90934k(string3, new InterfaceC17463d.d() { // from class: f70.p
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i13) {
                C18815q.m98779c(interfaceC17463d, i13);
            }
        });
        aVar.m90923G();
    }
}
