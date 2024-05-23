package p001a.p005d;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.adtima.Adtima;

/* renamed from: a.d.a */
/* loaded from: classes2.dex */
class HandlerC0006a extends Handler {
    /* JADX INFO: Access modifiers changed from: package-private */
    public HandlerC0006a(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public void dispatchMessage(Message message) {
        StringBuilder sb2;
        String str;
        try {
            super.dispatchMessage(message);
        } catch (Error e11) {
            e = e11;
            sb2 = new StringBuilder();
            str = "dispatchMessage error ";
            sb2.append(str);
            sb2.append(message);
            sb2.append(" , ");
            sb2.append(e);
            Adtima.m18326d("SafeSchedulerHandler", sb2.toString());
        } catch (Exception e12) {
            e = e12;
            sb2 = new StringBuilder();
            str = "dispatchMessage Exception ";
            sb2.append(str);
            sb2.append(message);
            sb2.append(" , ");
            sb2.append(e);
            Adtima.m18326d("SafeSchedulerHandler", sb2.toString());
        }
    }
}
