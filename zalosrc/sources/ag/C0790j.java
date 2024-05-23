package ag;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.Toast;
import fn0.AbstractC19074t;

/* renamed from: ag.j */
/* loaded from: classes3.dex */
public final class C0790j implements Handler.Callback {

    /* renamed from: p */
    private final Context f2725p;

    /* renamed from: q */
    private final Handler f2726q;

    public C0790j(Context context) {
        AbstractC19074t.m100208f(context, "appContext");
        this.f2725p = context;
        this.f2726q = new Handler(Looper.getMainLooper(), this);
    }

    /* renamed from: a */
    public final void m1989a() {
        if (this.f2726q.hasMessages(2)) {
            this.f2726q.removeMessages(2);
        } else {
            this.f2726q.sendEmptyMessageDelayed(1, 1000L);
        }
    }

    /* renamed from: b */
    public final void m1990b(int i11, int i12) {
        if (this.f2726q.hasMessages(1)) {
            this.f2726q.removeMessages(1);
        } else {
            this.f2726q.sendEmptyMessage(2);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        AbstractC19074t.m100208f(message, "msg");
        if (message.what != 1) {
            return false;
        }
        Toast.makeText(this.f2725p, "onSurfaceChange not called before timeout", 0).show();
        return true;
    }
}
