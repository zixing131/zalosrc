package kotlinx.coroutines.debug;

import android.annotation.SuppressLint;
import java.lang.instrument.ClassFileTransformer;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;
import pm0.AbstractC24862s;
import pm0.C24861r;

@SuppressLint({"all"})
/* loaded from: classes7.dex */
public final class AgentPremain {

    /* renamed from: a */
    public static final AgentPremain f106324a = new AgentPremain();

    /* renamed from: b */
    private static final boolean f106325b;

    /* loaded from: classes7.dex */
    public static final class DebugProbesTransformer implements ClassFileTransformer {

        /* renamed from: a */
        public static final DebugProbesTransformer f106326a = new DebugProbesTransformer();

        private DebugProbesTransformer() {
        }
    }

    static {
        Object m129218b;
        boolean m113250e;
        Boolean bool;
        Object obj = null;
        try {
            C24861r.a aVar = C24861r.f119264q;
            String property = System.getProperty("kotlinx.coroutines.debug.enable.creation.stack.trace");
            if (property != null) {
                bool = Boolean.valueOf(Boolean.parseBoolean(property));
            } else {
                bool = null;
            }
            m129218b = C24861r.m129218b(bool);
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        if (!C24861r.m129223g(m129218b)) {
            obj = m129218b;
        }
        Boolean bool2 = (Boolean) obj;
        if (bool2 != null) {
            m113250e = bool2.booleanValue();
        } else {
            m113250e = DebugProbesImpl.f106373a.m113250e();
        }
        f106325b = m113250e;
    }

    private AgentPremain() {
    }
}
