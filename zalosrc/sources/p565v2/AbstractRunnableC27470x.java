package p565v2;

import androidx.work.impl.C2221r0;
import androidx.work.impl.utils.futures.C2230c;
import com.google.common.util.concurrent.InterfaceFutureC6534a;
import java.util.List;
import p535u2.C26976w;

/* renamed from: v2.x */
/* loaded from: classes2.dex */
public abstract class AbstractRunnableC27470x implements Runnable {

    /* renamed from: p */
    private final C2230c f129210p = C2230c.m11809t();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v2.x$a */
    /* loaded from: classes2.dex */
    public class a extends AbstractRunnableC27470x {

        /* renamed from: q */
        final /* synthetic */ C2221r0 f129211q;

        /* renamed from: r */
        final /* synthetic */ String f129212r;

        a(C2221r0 c2221r0, String str) {
            this.f129211q = c2221r0;
            this.f129212r = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p565v2.AbstractRunnableC27470x
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public List mo140527c() {
            return (List) C26976w.f127496z.apply(this.f129211q.m11740w().mo11565L().mo139012n(this.f129212r));
        }
    }

    /* renamed from: a */
    public static AbstractRunnableC27470x m140525a(C2221r0 c2221r0, String str) {
        return new a(c2221r0, str);
    }

    /* renamed from: b */
    public InterfaceFutureC6534a m140526b() {
        return this.f129210p;
    }

    /* renamed from: c */
    abstract Object mo140527c();

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f129210p.mo11798p(mo140527c());
        } catch (Throwable th2) {
            this.f129210p.mo11799q(th2);
        }
    }
}
