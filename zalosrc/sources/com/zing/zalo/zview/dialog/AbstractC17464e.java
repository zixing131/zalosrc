package com.zing.zalo.zview.dialog;

import android.view.View;
import com.zing.zalo.zview.dialog.AbstractC17464e;
import com.zing.zalo.zview.dialog.InterfaceC17463d;

/* renamed from: com.zing.zalo.zview.dialog.e */
/* loaded from: classes7.dex */
public abstract class AbstractC17464e {
    /* renamed from: b */
    public static void m92876b(View view, final InterfaceC17463d interfaceC17463d, final InterfaceC17463d.d dVar, final int i11) {
        if (view == null) {
            return;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: wl0.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AbstractC17464e.m92877c(InterfaceC17463d.d.this, interfaceC17463d, i11, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m92877c(InterfaceC17463d.d dVar, InterfaceC17463d interfaceC17463d, int i11, View view) {
        if (dVar != null) {
            dVar.mo605K8(interfaceC17463d, i11);
        }
    }

    /* renamed from: d */
    public static void m92878d(KeyEventCallbackC17462c keyEventCallbackC17462c) {
        if (keyEventCallbackC17462c != null && keyEventCallbackC17462c.m92868m()) {
            keyEventCallbackC17462c.dismiss();
        }
    }
}
