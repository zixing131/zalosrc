package p632x4;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.AbstractC1733g;
import androidx.fragment.app.AbstractDialogInterfaceOnCancelListenerC1728b;
import com.google.android.gms.common.internal.AbstractC4205o;

/* renamed from: x4.h */
/* loaded from: classes2.dex */
public class C29322h extends AbstractDialogInterfaceOnCancelListenerC1728b {

    /* renamed from: A0 */
    private Dialog f135803A0;

    /* renamed from: y0 */
    private Dialog f135804y0;

    /* renamed from: z0 */
    private DialogInterface.OnCancelListener f135805z0;

    /* renamed from: q1 */
    public static C29322h m146469q1(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C29322h c29322h = new C29322h();
        Dialog dialog2 = (Dialog) AbstractC4205o.m19723l(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        c29322h.f135804y0 = dialog2;
        if (onCancelListener != null) {
            c29322h.f135805z0 = onCancelListener;
        }
        return c29322h;
    }

    @Override // androidx.fragment.app.AbstractDialogInterfaceOnCancelListenerC1728b
    /* renamed from: m1 */
    public Dialog mo8953m1(Bundle bundle) {
        Dialog dialog = this.f135804y0;
        if (dialog == null) {
            m8954n1(false);
            if (this.f135803A0 == null) {
                this.f135803A0 = new AlertDialog.Builder((Context) AbstractC4205o.m19722k(m8868n())).create();
            }
            return this.f135803A0;
        }
        return dialog;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f135805z0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.AbstractDialogInterfaceOnCancelListenerC1728b
    /* renamed from: p1 */
    public void mo8956p1(AbstractC1733g abstractC1733g, String str) {
        super.mo8956p1(abstractC1733g, str);
    }
}
