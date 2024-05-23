package ki;

import android.content.Context;
import android.widget.Toast;
import com.zing.zalo.crashhandler.C7919a;
import mm0.AbstractC23350e;

/* renamed from: ki.d */
/* loaded from: classes3.dex */
public final class C21732d {

    /* renamed from: a */
    public static final C21732d f105520a = new C21732d();

    private C21732d() {
    }

    /* renamed from: a */
    public static final void m112156a(Context context, int i11, int i12) {
        try {
            Toast.makeText(context, i11, i12).show();
        } catch (RuntimeException e11) {
            AbstractC23350e.m122775e(C7919a.f42840f, "Could not send crash Toast", e11);
        }
    }
}
