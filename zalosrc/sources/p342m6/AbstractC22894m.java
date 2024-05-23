package p342m6;

import com.google.android.gms.common.internal.AbstractC4205o;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: m6.m */
/* loaded from: classes.dex */
public abstract class AbstractC22894m {
    /* renamed from: a */
    public static Object m117599a(AbstractC22888j abstractC22888j) {
        AbstractC4205o.m19720i();
        AbstractC4205o.m19723l(abstractC22888j, "Task must not be null");
        if (abstractC22888j.mo117587p()) {
            return m117609k(abstractC22888j);
        }
        C22901q c22901q = new C22901q(null);
        m117610l(abstractC22888j, c22901q);
        c22901q.m117620a();
        return m117609k(abstractC22888j);
    }

    /* renamed from: b */
    public static Object m117600b(AbstractC22888j abstractC22888j, long j11, TimeUnit timeUnit) {
        AbstractC4205o.m19720i();
        AbstractC4205o.m19723l(abstractC22888j, "Task must not be null");
        AbstractC4205o.m19723l(timeUnit, "TimeUnit must not be null");
        if (abstractC22888j.mo117587p()) {
            return m117609k(abstractC22888j);
        }
        C22901q c22901q = new C22901q(null);
        m117610l(abstractC22888j, c22901q);
        if (c22901q.m117621c(j11, timeUnit)) {
            return m117609k(abstractC22888j);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    /* renamed from: c */
    public static AbstractC22888j m117601c(Executor executor, Callable callable) {
        AbstractC4205o.m19723l(executor, "Executor must not be null");
        AbstractC4205o.m19723l(callable, "Callback must not be null");
        C22897n0 c22897n0 = new C22897n0();
        executor.execute(new RunnableC22899o0(c22897n0, callable));
        return c22897n0;
    }

    /* renamed from: d */
    public static AbstractC22888j m117602d() {
        C22897n0 c22897n0 = new C22897n0();
        c22897n0.m117617v();
        return c22897n0;
    }

    /* renamed from: e */
    public static AbstractC22888j m117603e(Exception exc) {
        C22897n0 c22897n0 = new C22897n0();
        c22897n0.m117615t(exc);
        return c22897n0;
    }

    /* renamed from: f */
    public static AbstractC22888j m117604f(Object obj) {
        C22897n0 c22897n0 = new C22897n0();
        c22897n0.m117616u(obj);
        return c22897n0;
    }

    /* renamed from: g */
    public static AbstractC22888j m117605g(Collection collection) {
        if (collection != null && !collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (((AbstractC22888j) it.next()) == null) {
                    throw new NullPointerException("null tasks are not accepted");
                }
            }
            C22897n0 c22897n0 = new C22897n0();
            C22903s c22903s = new C22903s(collection.size(), c22897n0);
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                m117610l((AbstractC22888j) it2.next(), c22903s);
            }
            return c22897n0;
        }
        return m117604f(null);
    }

    /* renamed from: h */
    public static AbstractC22888j m117606h(AbstractC22888j... abstractC22888jArr) {
        if (abstractC22888jArr != null && abstractC22888jArr.length != 0) {
            return m117605g(Arrays.asList(abstractC22888jArr));
        }
        return m117604f(null);
    }

    /* renamed from: i */
    public static AbstractC22888j m117607i(Collection collection) {
        if (collection != null && !collection.isEmpty()) {
            return m117605g(collection).mo117581j(AbstractC22892l.f111514a, new C22898o(collection));
        }
        return m117604f(Collections.emptyList());
    }

    /* renamed from: j */
    public static AbstractC22888j m117608j(AbstractC22888j... abstractC22888jArr) {
        if (abstractC22888jArr != null && abstractC22888jArr.length != 0) {
            return m117607i(Arrays.asList(abstractC22888jArr));
        }
        return m117604f(Collections.emptyList());
    }

    /* renamed from: k */
    private static Object m117609k(AbstractC22888j abstractC22888j) {
        if (abstractC22888j.mo117588q()) {
            return abstractC22888j.mo117584m();
        }
        if (abstractC22888j.mo117586o()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(abstractC22888j.mo117583l());
    }

    /* renamed from: l */
    private static void m117610l(AbstractC22888j abstractC22888j, InterfaceC22902r interfaceC22902r) {
        Executor executor = AbstractC22892l.f111515b;
        abstractC22888j.mo117577f(executor, interfaceC22902r);
        abstractC22888j.mo117575d(executor, interfaceC22902r);
        abstractC22888j.mo117572a(executor, interfaceC22902r);
    }
}
