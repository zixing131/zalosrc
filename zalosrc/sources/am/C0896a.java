package am;

import android.content.ContentValues;
import android.content.Context;
import android.os.SystemClock;
import com.zing.zalo.p062db.C7966k;
import com.zing.zalo.p062db.SQLiteDatabase;
import me0.AbstractC23149n0;
import rh0.AbstractC25803k;

/* renamed from: am.a */
/* loaded from: classes.dex */
public class C0896a extends SQLiteDatabase {
    public C0896a(Context context, String str, InterfaceC0911g interfaceC0911g) {
        super(context, str, interfaceC0911g);
    }

    @Override // com.zing.zalo.p062db.SQLiteDatabase, am.InterfaceC0947y
    /* renamed from: B */
    public int mo2770B(String str, String str2, String[] strArr) {
        StringBuilder m118858f = AbstractC23149n0.m118858f(Thread.currentThread().getStackTrace(), true, false);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int mo2770B = super.mo2770B(str, str2, strArr);
        AbstractC25803k.m132972l(m118858f.toString(), SystemClock.elapsedRealtime() - elapsedRealtime);
        return mo2770B;
    }

    @Override // com.zing.zalo.p062db.SQLiteDatabase, am.InterfaceC0947y
    /* renamed from: C */
    public long mo2771C(String str, String str2, ContentValues contentValues) {
        StringBuilder m118858f = AbstractC23149n0.m118858f(Thread.currentThread().getStackTrace(), true, false);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long mo2771C = super.mo2771C(str, str2, contentValues);
        AbstractC25803k.m132972l(m118858f.toString(), SystemClock.elapsedRealtime() - elapsedRealtime);
        return mo2771C;
    }

    @Override // com.zing.zalo.p062db.SQLiteDatabase, am.InterfaceC0947y
    /* renamed from: E */
    public C7966k mo2775p(String str, Object... objArr) {
        StringBuilder m118858f = AbstractC23149n0.m118858f(Thread.currentThread().getStackTrace(), true, true);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C7966k mo2775p = super.mo2775p(str, objArr);
        if (AbstractC23149n0.m118864l(str)) {
            AbstractC25803k.m132972l(m118858f.toString(), SystemClock.elapsedRealtime() - elapsedRealtime);
        }
        return mo2775p;
    }

    @Override // com.zing.zalo.p062db.SQLiteDatabase, am.InterfaceC0947y
    /* renamed from: h */
    public C7966k mo2777u(String str) {
        StringBuilder m118858f = AbstractC23149n0.m118858f(Thread.currentThread().getStackTrace(), true, true);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C7966k mo2777u = super.mo2777u(str);
        if (AbstractC23149n0.m118864l(str)) {
            AbstractC25803k.m132972l(m118858f.toString(), SystemClock.elapsedRealtime() - elapsedRealtime);
        }
        return mo2777u;
    }

    @Override // com.zing.zalo.p062db.SQLiteDatabase, am.InterfaceC0947y
    /* renamed from: n */
    public boolean mo2774n(String str) {
        StringBuilder m118858f = AbstractC23149n0.m118858f(Thread.currentThread().getStackTrace(), true, false);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean mo2774n = super.mo2774n(str);
        if (AbstractC23149n0.m118865m(str)) {
            AbstractC25803k.m132972l(m118858f.toString(), SystemClock.elapsedRealtime() - elapsedRealtime);
        }
        return mo2774n;
    }

    @Override // com.zing.zalo.p062db.SQLiteDatabase, am.InterfaceC0947y
    /* renamed from: q */
    public int mo2776q(String str, ContentValues contentValues, String str2, String[] strArr) {
        StringBuilder m118858f = AbstractC23149n0.m118858f(Thread.currentThread().getStackTrace(), true, false);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int mo2776q = super.mo2776q(str, contentValues, str2, strArr);
        AbstractC25803k.m132972l(m118858f.toString(), SystemClock.elapsedRealtime() - elapsedRealtime);
        return mo2776q;
    }

    @Override // com.zing.zalo.p062db.SQLiteDatabase, am.InterfaceC0947y
    /* renamed from: v */
    public boolean mo2778v(String str, Object... objArr) {
        StringBuilder m118858f = AbstractC23149n0.m118858f(Thread.currentThread().getStackTrace(), true, false);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean mo2778v = super.mo2778v(str, objArr);
        if (AbstractC23149n0.m118865m(str)) {
            AbstractC25803k.m132972l(m118858f.toString(), SystemClock.elapsedRealtime() - elapsedRealtime);
        }
        return mo2778v;
    }

    public C0896a(Context context, String str) {
        super(context, str);
    }
}
