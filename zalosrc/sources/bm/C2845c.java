package bm;

import android.os.Build;
import androidx.work.AbstractC2151i0;
import androidx.work.C2135a0;
import androidx.work.C2142e;
import androidx.work.EnumC2240j;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p062db.backup.BackupRestorableDbWorker;
import java.util.concurrent.TimeUnit;

/* renamed from: bm.c */
/* loaded from: classes.dex */
public final class C2845c {

    /* renamed from: a */
    public static final C2845c f11343a = new C2845c();

    private C2845c() {
    }

    /* renamed from: a */
    public final void m13732a() {
        C2142e m11513a;
        if (Build.VERSION.SDK_INT >= 23) {
            m11513a = new C2142e.a().m11516d(true).m11513a();
        } else {
            m11513a = new C2142e.a().m11513a();
        }
        AbstractC2151i0.m11547h(MainApplication.Companion.m35500c()).mo11553e("BackupRestorableDb", EnumC2240j.KEEP, (C2135a0) ((C2135a0.a) new C2135a0.a(BackupRestorableDbWorker.class, 24L, TimeUnit.HOURS).m11869j(m11513a)).m11863b());
    }
}
