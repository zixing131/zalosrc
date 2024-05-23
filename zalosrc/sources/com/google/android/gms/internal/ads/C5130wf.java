package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wf */
/* loaded from: classes2.dex */
public final class C5130wf extends AbstractCallableC4316ag {
    public C5130wf(C4719le c4719le, String str, String str2, C4939ra c4939ra, int i11, int i12) {
        super(c4719le, "6CWPidOWJZFxRWI8V7yi3OiMbOhIWZX/jTayTGRwqCM0W8dtKHQOPe60TuQicfhG", "gYPijpNio6OwLgbzbH6IuWSNtvp7bCV5UMbKZJCVNdg=", c4939ra, i11, 48);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4316ag
    /* renamed from: a */
    protected final void mo20111a() {
        this.f17024e.m26026d0(3);
        boolean booleanValue = ((Boolean) this.f17025f.invoke(null, this.f17021b.m24240b())).booleanValue();
        synchronized (this.f17024e) {
            try {
                if (booleanValue) {
                    this.f17024e.m26026d0(2);
                } else {
                    this.f17024e.m26026d0(1);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
