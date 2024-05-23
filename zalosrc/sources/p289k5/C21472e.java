package p289k5;

import android.content.Context;

/* renamed from: k5.e */
/* loaded from: classes.dex */
public class C21472e {

    /* renamed from: b */
    private static C21472e f104485b = new C21472e();

    /* renamed from: a */
    private C21471d f104486a = null;

    /* renamed from: a */
    public static C21471d m111067a(Context context) {
        return f104485b.m111068b(context);
    }

    /* renamed from: b */
    public final synchronized C21471d m111068b(Context context) {
        try {
            if (this.f104486a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f104486a = new C21471d(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f104486a;
    }
}
