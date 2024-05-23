package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC4205o;

/* loaded from: classes2.dex */
public class ErrorDialogFragment extends DialogFragment {

    /* renamed from: p */
    private Dialog f16141p;

    /* renamed from: q */
    private DialogInterface.OnCancelListener f16142q;

    /* renamed from: r */
    private Dialog f16143r;

    /* renamed from: a */
    public static ErrorDialogFragment m19189a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        ErrorDialogFragment errorDialogFragment = new ErrorDialogFragment();
        Dialog dialog2 = (Dialog) AbstractC4205o.m19723l(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        errorDialogFragment.f16141p = dialog2;
        if (onCancelListener != null) {
            errorDialogFragment.f16142q = onCancelListener;
        }
        return errorDialogFragment;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f16142q;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f16141p;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f16143r == null) {
                this.f16143r = new AlertDialog.Builder((Context) AbstractC4205o.m19722k(getActivity())).create();
            }
            return this.f16143r;
        }
        return dialog;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
