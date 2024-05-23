package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class pa3 {

    /* renamed from: b */
    static final pa3 f26147b = new pa3(new C4865a("Failure occurred while trying to finish a future."));

    /* renamed from: a */
    final Throwable f26148a;

    /* renamed from: com.google.android.gms.internal.ads.pa3$a */
    /* loaded from: classes2.dex */
    class C4865a extends Throwable {
        C4865a(String str) {
            super("Failure occurred while trying to finish a future.");
        }

        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public pa3(Throwable th2) {
        th2.getClass();
        this.f26148a = th2;
    }
}
