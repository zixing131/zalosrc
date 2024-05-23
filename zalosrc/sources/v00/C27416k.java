package v00;

import android.graphics.Bitmap;
import fn0.AbstractC19060k;
import java.util.Random;
import yt.AbstractC31072b;

/* renamed from: v00.k */
/* loaded from: classes5.dex */
public final class C27416k extends AbstractC31072b {

    /* renamed from: p */
    private final Bitmap f129053p;

    /* renamed from: q */
    private final String f129054q;

    public /* synthetic */ C27416k(Bitmap bitmap, String str, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? null : bitmap, (i11 & 2) != 0 ? null : str);
    }

    @Override // yt.AbstractC31072b
    /* renamed from: a */
    public Bitmap mo102607a() {
        return this.f129053p;
    }

    @Override // yt.AbstractC31072b
    /* renamed from: b */
    public String mo102608b() {
        return this.f129054q;
    }

    @Override // yt.AbstractC31072b
    /* renamed from: d */
    public String mo102610d() {
        return String.valueOf(new Random().nextLong());
    }

    @Override // yt.AbstractC31072b
    /* renamed from: e */
    public String mo102611e() {
        return null;
    }

    public C27416k(Bitmap bitmap, String str) {
        this.f129053p = bitmap;
        this.f129054q = str;
    }
}
