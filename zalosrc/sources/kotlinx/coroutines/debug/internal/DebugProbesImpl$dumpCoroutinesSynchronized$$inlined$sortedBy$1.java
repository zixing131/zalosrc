package kotlinx.coroutines.debug.internal;

import java.util.Comparator;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;
import sm0.AbstractC26327c;

/* loaded from: classes7.dex */
public final class DebugProbesImpl$dumpCoroutinesSynchronized$$inlined$sortedBy$1<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int m135478b;
        m135478b = AbstractC26327c.m135478b(Long.valueOf(((DebugProbesImpl.CoroutineOwner) obj).f106384q.f106361b), Long.valueOf(((DebugProbesImpl.CoroutineOwner) obj2).f106384q.f106361b));
        return m135478b;
    }
}
