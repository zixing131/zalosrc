package kotlinx.coroutines;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25368s;
import vm0.AbstractC28298d;

/* loaded from: classes7.dex */
public final class AwaitKt {
    /* renamed from: a */
    public static final Object m112521a(Collection collection, Continuation continuation) {
        List m131502j;
        if (collection.isEmpty()) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        return new AwaitAll((Deferred[]) collection.toArray(new Deferred[0])).m112513c(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m112522b(Collection collection, Continuation continuation) {
        AwaitKt$joinAll$3 awaitKt$joinAll$3;
        Object m142578e;
        int i11;
        Iterator it;
        if (continuation instanceof AwaitKt$joinAll$3) {
            awaitKt$joinAll$3 = (AwaitKt$joinAll$3) continuation;
            int i12 = awaitKt$joinAll$3.f105807u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                awaitKt$joinAll$3.f105807u = i12 - Integer.MIN_VALUE;
                Object obj = awaitKt$joinAll$3.f105806t;
                m142578e = AbstractC28298d.m142578e();
                i11 = awaitKt$joinAll$3.f105807u;
                if (i11 == 0) {
                    if (i11 == 1) {
                        it = (Iterator) awaitKt$joinAll$3.f105805s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    it = collection.iterator();
                }
                while (it.hasNext()) {
                    Job job = (Job) it.next();
                    awaitKt$joinAll$3.f105805s = it;
                    awaitKt$joinAll$3.f105807u = 1;
                    if (job.mo112736c0(awaitKt$joinAll$3) == m142578e) {
                        return m142578e;
                    }
                }
                return C24848g0.f119245a;
            }
        }
        awaitKt$joinAll$3 = new AwaitKt$joinAll$3(continuation);
        Object obj2 = awaitKt$joinAll$3.f105806t;
        m142578e = AbstractC28298d.m142578e();
        i11 = awaitKt$joinAll$3.f105807u;
        if (i11 == 0) {
        }
        while (it.hasNext()) {
        }
        return C24848g0.f119245a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0052 -> B:10:0x0055). Please report as a decompilation issue!!! */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m112523c(Job[] jobArr, Continuation continuation) {
        AwaitKt$joinAll$1 awaitKt$joinAll$1;
        Object m142578e;
        int i11;
        int i12;
        Job[] jobArr2;
        int length;
        if (continuation instanceof AwaitKt$joinAll$1) {
            awaitKt$joinAll$1 = (AwaitKt$joinAll$1) continuation;
            int i13 = awaitKt$joinAll$1.f105804w;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                awaitKt$joinAll$1.f105804w = i13 - Integer.MIN_VALUE;
                Object obj = awaitKt$joinAll$1.f105803v;
                m142578e = AbstractC28298d.m142578e();
                i11 = awaitKt$joinAll$1.f105804w;
                if (i11 == 0) {
                    if (i11 == 1) {
                        length = awaitKt$joinAll$1.f105802u;
                        i12 = awaitKt$joinAll$1.f105801t;
                        Job[] jobArr3 = (Job[]) awaitKt$joinAll$1.f105800s;
                        AbstractC24862s.m129228b(obj);
                        jobArr2 = jobArr3;
                        i12++;
                        if (i12 < length) {
                            Job job = jobArr2[i12];
                            awaitKt$joinAll$1.f105800s = jobArr2;
                            awaitKt$joinAll$1.f105801t = i12;
                            awaitKt$joinAll$1.f105802u = length;
                            awaitKt$joinAll$1.f105804w = 1;
                            if (job.mo112736c0(awaitKt$joinAll$1) == m142578e) {
                                return m142578e;
                            }
                            i12++;
                            if (i12 < length) {
                                return C24848g0.f119245a;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    i12 = 0;
                    jobArr2 = jobArr;
                    length = jobArr.length;
                    if (i12 < length) {
                    }
                }
            }
        }
        awaitKt$joinAll$1 = new AwaitKt$joinAll$1(continuation);
        Object obj2 = awaitKt$joinAll$1.f105803v;
        m142578e = AbstractC28298d.m142578e();
        i11 = awaitKt$joinAll$1.f105804w;
        if (i11 == 0) {
        }
    }
}
