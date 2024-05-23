package k50;

import android.net.Uri;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import h50.C19881b;

/* renamed from: k50.f */
/* loaded from: classes5.dex */
public final class C21478f extends C19881b {

    /* renamed from: d */
    private boolean f104515d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C21478f(String str, Uri uri, int i11, boolean z11, int i12, AbstractC19060k abstractC19060k) {
        this(str, uri, (i12 & 4) != 0 ? 2 : i11, (i12 & 8) != 0 ? false : z11);
        if ((i12 & 2) != 0) {
            uri = Uri.EMPTY;
            AbstractC19074t.m100207e(uri, "EMPTY");
        }
    }

    /* renamed from: e */
    public final boolean m111097e() {
        return this.f104515d;
    }

    /* renamed from: f */
    public final void m111098f(boolean z11) {
        this.f104515d = z11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21478f(String str, Uri uri, int i11, boolean z11) {
        super(str, i11, uri);
        AbstractC19074t.m100208f(str, "name");
        AbstractC19074t.m100208f(uri, "uri");
        this.f104515d = z11;
    }
}
