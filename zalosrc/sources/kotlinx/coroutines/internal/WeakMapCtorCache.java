package kotlinx.coroutines.internal;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes7.dex */
final class WeakMapCtorCache extends CtorCache {

    /* renamed from: a */
    public static final WeakMapCtorCache f107439a = new WeakMapCtorCache();

    /* renamed from: b */
    private static final ReentrantReadWriteLock f107440b = new ReentrantReadWriteLock();

    /* renamed from: c */
    private static final WeakHashMap f107441c = new WeakHashMap();

    private WeakMapCtorCache() {
    }
}
