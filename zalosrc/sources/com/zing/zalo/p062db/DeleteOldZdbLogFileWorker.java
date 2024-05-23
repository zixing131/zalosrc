package com.zing.zalo.p062db;

import android.content.Context;
import androidx.work.AbstractC2252t;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.io.File;
import mm0.AbstractC23350e;
import on0.AbstractC24341v;
import p405ov.C24559a;

/* loaded from: classes3.dex */
public final class DeleteOldZdbLogFileWorker extends Worker {
    public static final C7951a Companion = new C7951a(null);

    /* renamed from: com.zing.zalo.db.DeleteOldZdbLogFileWorker$a */
    /* loaded from: classes3.dex */
    public static final class C7951a {
        private C7951a() {
        }

        public /* synthetic */ C7951a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteOldZdbLogFileWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(workerParameters, "workerParams");
    }

    @Override // androidx.work.Worker
    public AbstractC2252t.a doWork() {
        boolean m127120J;
        try {
            File[] listFiles = new File(C7967l.Companion.m42750d()).listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    if (file.isFile()) {
                        String name = file.getName();
                        AbstractC19074t.m100207e(name, "getName(...)");
                        m127120J = AbstractC24341v.m127120J(name, "zdb_log_", false, 2, null);
                        if (m127120J) {
                            file.delete();
                        }
                    }
                }
            }
            C24559a.m127933c("DeleteOldZdbLogFileWorker", "Delete old ZDB log success");
            AbstractC2252t.a m11891c = AbstractC2252t.a.m11891c();
            AbstractC19074t.m100207e(m11891c, "success(...)");
            return m11891c;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DeleteOldZdbLogFileWorker", e11);
            AbstractC2252t.a m11890b = AbstractC2252t.a.m11890b();
            AbstractC19074t.m100207e(m11890b, "retry(...)");
            return m11890b;
        }
    }
}
