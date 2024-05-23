package kotlinx.coroutines;

/* loaded from: classes.dex */
public class JobImpl extends JobSupport implements CompletableJob {

    /* renamed from: r */
    private final boolean f105900r;

    public JobImpl(Job job) {
        super(true);
        m112817J0(job);
        this.f105900r = m112746p1();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:            r0 = r0.m112814F0();     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:            if ((r0 instanceof kotlinx.coroutines.ChildHandleNode) == false) goto L18;     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:            r0 = (kotlinx.coroutines.ChildHandleNode) r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:            if (r0 == null) goto L24;     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:            r0 = r0.m112774s();     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:            if (r0 != null) goto L26;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002a, code lost:            r0 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x001d, code lost:            return true;     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:            if (r0 != null) goto L11;     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:            if (r0.mo112747C0() == false) goto L15;     */
    /* renamed from: p1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean m112746p1() {
        ChildHandleNode childHandleNode;
        ChildHandle m112814F0 = m112814F0();
        if (m112814F0 instanceof ChildHandleNode) {
            childHandleNode = (ChildHandleNode) m112814F0;
        } else {
            childHandleNode = null;
        }
        if (childHandleNode != null) {
            JobSupport m112774s = childHandleNode.m112774s();
        }
        return false;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: C0 */
    public boolean mo112747C0() {
        return this.f105900r;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: D0 */
    public boolean mo112597D0() {
        return true;
    }
}
