package km0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.core.content.AbstractC1388a;
import fn0.AbstractC19074t;

/* renamed from: km0.g */
/* loaded from: classes7.dex */
public final class C21772g extends AbstractC21770e {

    /* renamed from: f */
    private final ConnectivityManager f105729f;

    /* renamed from: g */
    private boolean f105730g;

    /* renamed from: h */
    private boolean f105731h;

    public C21772g(Context context) {
        AbstractC19074t.m100208f(context, "context");
        this.f105729f = (ConnectivityManager) AbstractC1388a.m6969k(context, ConnectivityManager.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // km0.AbstractC21770e
    /* renamed from: b */
    public void mo112301b(boolean z11) {
        this.f105730g = z11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // km0.AbstractC21770e
    /* renamed from: d */
    public void mo112302d(boolean z11) {
        this.f105731h = z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:            if (r0.isAvailable() == true) goto L24;     */
    @Override // km0.AbstractC21770e
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo112303e() {
        NetworkInfo networkInfo;
        boolean z11;
        ConnectivityManager connectivityManager = this.f105729f;
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null) {
            z11 = true;
        }
        z11 = false;
        mo112301b(z11);
        return this.f105730g;
    }
}
