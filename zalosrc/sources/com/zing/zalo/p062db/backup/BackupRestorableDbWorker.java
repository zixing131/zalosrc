package com.zing.zalo.p062db.backup;

import android.content.Context;
import androidx.work.AbstractC2252t;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.zing.zalo.p062db.C7965j;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes.dex */
public final class BackupRestorableDbWorker extends Worker {
    public static final C7957a Companion = new C7957a(null);

    /* renamed from: com.zing.zalo.db.backup.BackupRestorableDbWorker$a */
    /* loaded from: classes3.dex */
    public static final class C7957a {
        private C7957a() {
        }

        public /* synthetic */ C7957a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackupRestorableDbWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(workerParameters, "workerParams");
    }

    @Override // androidx.work.Worker
    public AbstractC2252t.a doWork() {
        if (C7965j.Companion.m42695a().m42689c()) {
            AbstractC2252t.a m11891c = AbstractC2252t.a.m11891c();
            AbstractC19074t.m100205c(m11891c);
            return m11891c;
        }
        AbstractC2252t.a m11890b = AbstractC2252t.a.m11890b();
        AbstractC19074t.m100205c(m11890b);
        return m11890b;
    }
}
