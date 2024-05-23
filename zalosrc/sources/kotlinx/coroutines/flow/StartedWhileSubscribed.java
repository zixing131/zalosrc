package kotlinx.coroutines.flow;

import androidx.work.AbstractC2147g0;
import java.util.List;
import qm0.AbstractC25332a0;
import qm0.AbstractC25366r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class StartedWhileSubscribed implements SharingStarted {

    /* renamed from: b */
    private final long f107152b;

    /* renamed from: c */
    private final long f107153c;

    public StartedWhileSubscribed(long j11, long j12) {
        this.f107152b = j11;
        this.f107153c = j12;
        if (j11 >= 0) {
            if (j12 >= 0) {
                return;
            }
            throw new IllegalArgumentException(("replayExpiration(" + j12 + " ms) cannot be negative").toString());
        }
        throw new IllegalArgumentException(("stopTimeout(" + j11 + " ms) cannot be negative").toString());
    }

    @Override // kotlinx.coroutines.flow.SharingStarted
    /* renamed from: a */
    public Flow mo113489a(StateFlow stateFlow) {
        return FlowKt.m113298p(FlowKt.m113299q(FlowKt.m113282R(stateFlow, new StartedWhileSubscribed$command$1(this, null)), new StartedWhileSubscribed$command$2(null)));
    }

    public boolean equals(Object obj) {
        if (obj instanceof StartedWhileSubscribed) {
            StartedWhileSubscribed startedWhileSubscribed = (StartedWhileSubscribed) obj;
            if (this.f107152b == startedWhileSubscribed.f107152b && this.f107153c == startedWhileSubscribed.f107153c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (AbstractC2147g0.m11521a(this.f107152b) * 31) + AbstractC2147g0.m11521a(this.f107153c);
    }

    public String toString() {
        List m131495d;
        List m131492a;
        String m131214n0;
        m131495d = AbstractC25366r.m131495d(2);
        if (this.f107152b > 0) {
            m131495d.add("stopTimeout=" + this.f107152b + "ms");
        }
        if (this.f107153c < Long.MAX_VALUE) {
            m131495d.add("replayExpiration=" + this.f107153c + "ms");
        }
        m131492a = AbstractC25366r.m131492a(m131495d);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SharingStarted.WhileSubscribed(");
        m131214n0 = AbstractC25332a0.m131214n0(m131492a, null, null, null, 0, null, null, 63, null);
        sb2.append(m131214n0);
        sb2.append(')');
        return sb2.toString();
    }
}
