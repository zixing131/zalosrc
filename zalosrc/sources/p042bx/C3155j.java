package p042bx;

import android.content.Context;
import android.os.Debug;
import android.os.SystemClock;
import android.text.TextUtils;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bx.j */
/* loaded from: classes4.dex */
public class C3155j extends AbstractC3147b {

    /* renamed from: r */
    private static final LinkedHashMap f13334r = new LinkedHashMap();

    /* renamed from: m */
    private int f13335m;

    /* renamed from: n */
    private Thread f13336n;

    /* renamed from: o */
    private String f13337o;

    /* renamed from: p */
    private String f13338p;

    /* renamed from: q */
    private a f13339q;

    /* renamed from: bx.j$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void mo15879a(int i11, int i12);
    }

    public C3155j(Context context, Thread thread, long j11, long j12) {
        this(context, thread, 100, j11, j12);
    }

    /* renamed from: m */
    private boolean m15880m(Context context, String str) {
        return true;
    }

    @Override // p042bx.AbstractC3147b
    /* renamed from: f */
    protected void mo15835f(Context context) {
        StringBuilder sb2 = new StringBuilder();
        for (StackTraceElement stackTraceElement : this.f13336n.getStackTrace()) {
            String stackTraceElement2 = stackTraceElement.toString();
            if (m15880m(context, stackTraceElement2)) {
                sb2.append("at ");
                sb2.append(stackTraceElement2);
                sb2.append("\n");
            }
        }
        String sb3 = sb2.toString();
        if (TextUtils.isEmpty(sb3) || this.f13337o.equalsIgnoreCase(sb3)) {
            return;
        }
        this.f13337o = sb3;
        String substring = sb3.substring(0, sb3.length() - 1);
        LinkedHashMap linkedHashMap = f13334r;
        synchronized (linkedHashMap) {
            try {
                int size = linkedHashMap.size();
                int i11 = this.f13335m;
                if (size == i11 && i11 > 0) {
                    linkedHashMap.remove(linkedHashMap.keySet().iterator().next());
                }
                linkedHashMap.put(Long.valueOf(SystemClock.elapsedRealtime()), "[New_stack]" + substring);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p042bx.AbstractC3147b
    /* renamed from: j */
    void mo15839j(int i11, int i12, int i13) {
        int i14;
        if (i11 != i12 || Debug.isDebuggerConnected()) {
            return;
        }
        if (this.f13336n.getState() == Thread.State.RUNNABLE) {
            i14 = 0;
        } else if (this.f13336n.getState() != Thread.State.WAITING && this.f13336n.getState() != Thread.State.TIMED_WAITING) {
            if (this.f13336n.getState() == Thread.State.BLOCKED) {
                i14 = 2;
            } else if (this.f13336n.getState() == Thread.State.NEW) {
                i14 = 3;
            } else if (this.f13336n.getState() == Thread.State.TERMINATED) {
                i14 = 4;
            } else {
                i14 = -1;
            }
        } else {
            i14 = 1;
        }
        this.f13339q.mo15879a(i14, i13);
    }

    /* renamed from: k */
    public ArrayList m15881k(long j11, long j12) {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = f13334r;
        synchronized (linkedHashMap) {
            try {
                for (Long l11 : linkedHashMap.keySet()) {
                    if (j11 < l11.longValue() && l11.longValue() < j12) {
                        arrayList.add((String) f13334r.get(l11));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    /* renamed from: l */
    public void m15882l(a aVar) {
        this.f13339q = aVar;
    }

    public C3155j(Context context, Thread thread, int i11, long j11, long j12) {
        super(j11, j12, context);
        this.f13337o = "";
        this.f13338p = "";
        this.f13336n = thread;
        this.f13335m = i11;
    }
}
