package p597w4;

import android.os.Looper;
import android.os.Message;
import p518t5.HandlerC26488f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: w4.c */
/* loaded from: classes.dex */
public final class HandlerC28725c extends HandlerC26488f {

    /* renamed from: a */
    final /* synthetic */ C28723a f133253a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC28725c(C28723a c28723a, Looper looper) {
        super(looper);
        this.f133253a = c28723a;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C28723a.m143856d(this.f133253a, message);
    }
}
