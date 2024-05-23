package p565v2;

import androidx.work.impl.WorkDatabase;
import fn0.AbstractC19074t;
import java.util.concurrent.Callable;

/* renamed from: v2.k */
/* loaded from: classes.dex */
public final class C27457k {

    /* renamed from: a */
    private final WorkDatabase f129190a;

    public C27457k(WorkDatabase workDatabase) {
        AbstractC19074t.m100208f(workDatabase, "workDatabase");
        this.f129190a = workDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final Integer m140496d(C27457k c27457k) {
        int m140503d;
        AbstractC19074t.m100208f(c27457k, "this$0");
        m140503d = AbstractC27458l.m140503d(c27457k.f129190a, "next_alarm_manager_id");
        return Integer.valueOf(m140503d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final Integer m140497f(C27457k c27457k, int i11, int i12) {
        int m140503d;
        AbstractC19074t.m100208f(c27457k, "this$0");
        m140503d = AbstractC27458l.m140503d(c27457k.f129190a, "next_job_scheduler_id");
        if (i11 > m140503d || m140503d > i12) {
            AbstractC27458l.m140504e(c27457k.f129190a, "next_job_scheduler_id", i11 + 1);
        } else {
            i11 = m140503d;
        }
        return Integer.valueOf(i11);
    }

    /* renamed from: c */
    public final int m140498c() {
        Object m337C = this.f129190a.m337C(new Callable() { // from class: v2.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer m140496d;
                m140496d = C27457k.m140496d(C27457k.this);
                return m140496d;
            }
        });
        AbstractC19074t.m100207e(m337C, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        return ((Number) m337C).intValue();
    }

    /* renamed from: e */
    public final int m140499e(final int i11, final int i12) {
        Object m337C = this.f129190a.m337C(new Callable() { // from class: v2.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer m140497f;
                m140497f = C27457k.m140497f(C27457k.this, i11, i12);
                return m140497f;
            }
        });
        AbstractC19074t.m100207e(m337C, "workDatabase.runInTransa…            id\n        })");
        return ((Number) m337C).intValue();
    }
}
