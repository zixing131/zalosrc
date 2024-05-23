package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.AbstractC2252t;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import fn0.AbstractC19074t;

/* loaded from: classes2.dex */
public final class CombineContinuationsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineContinuationsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(workerParameters, "workerParams");
    }

    @Override // androidx.work.Worker
    public AbstractC2252t.a doWork() {
        AbstractC2252t.a m11892d = AbstractC2252t.a.m11892d(getInputData());
        AbstractC19074t.m100207e(m11892d, "success(inputData)");
        return m11892d;
    }
}
