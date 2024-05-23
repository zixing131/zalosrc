package kotlinx.coroutines.scheduling;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.SystemPropsKt;
import kotlinx.coroutines.internal.SystemPropsKt__SystemProps_commonKt;
import ln0.AbstractC22543l;

/* loaded from: classes.dex */
public final class TasksKt {

    /* renamed from: a */
    public static final String f107490a = SystemPropsKt.m113717e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* renamed from: b */
    public static final long f107491b;

    /* renamed from: c */
    public static final int f107492c;

    /* renamed from: d */
    public static final int f107493d;

    /* renamed from: e */
    public static final long f107494e;

    /* renamed from: f */
    public static SchedulerTimeSource f107495f;

    /* renamed from: g */
    public static final TaskContext f107496g;

    /* renamed from: h */
    public static final TaskContext f107497h;

    static {
        long m113728f;
        int m116580c;
        int m113727e;
        int m113727e2;
        long m113728f2;
        m113728f = SystemPropsKt__SystemProps_commonKt.m113728f("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        f107491b = m113728f;
        m116580c = AbstractC22543l.m116580c(SystemPropsKt.m113713a(), 2);
        m113727e = SystemPropsKt__SystemProps_commonKt.m113727e("kotlinx.coroutines.scheduler.core.pool.size", m116580c, 1, 0, 8, null);
        f107492c = m113727e;
        m113727e2 = SystemPropsKt__SystemProps_commonKt.m113727e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);
        f107493d = m113727e2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        m113728f2 = SystemPropsKt__SystemProps_commonKt.m113728f("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null);
        f107494e = timeUnit.toNanos(m113728f2);
        f107495f = NanoTimeSource.f107480a;
        f107496g = new TaskContextImpl(0);
        f107497h = new TaskContextImpl(1);
    }
}
