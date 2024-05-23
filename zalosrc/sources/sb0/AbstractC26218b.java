package sb0;

import android.view.View;
import wl0.InterfaceC29091d;

/* renamed from: sb0.b */
/* loaded from: classes6.dex */
public abstract class AbstractC26218b {
    /* renamed from: b */
    public static void m134778b(View view, final InterfaceC29091d interfaceC29091d, final InterfaceC29091d.b bVar, final int i11) {
        if (view == null) {
            return;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: sb0.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AbstractC26218b.m134779c(InterfaceC29091d.b.this, interfaceC29091d, i11, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m134779c(InterfaceC29091d.b bVar, InterfaceC29091d interfaceC29091d, int i11, View view) {
        if (bVar != null) {
            bVar.mo87262a(interfaceC29091d, i11);
        }
    }
}
