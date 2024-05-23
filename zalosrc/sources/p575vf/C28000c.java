package p575vf;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import mm0.AbstractC23350e;

/* renamed from: vf.c */
/* loaded from: classes3.dex */
public class C28000c {

    /* renamed from: d */
    private static final C28000c f130584d = new C28000c();

    /* renamed from: a */
    private final Object f130585a = new Object();

    /* renamed from: b */
    private Hashtable f130586b = new Hashtable();

    /* renamed from: c */
    private int f130587c = 0;

    /* renamed from: b */
    public static C28000c m141116b() {
        return f130584d;
    }

    /* renamed from: a */
    public void m141117a() {
        synchronized (this.f130585a) {
            try {
                Iterator it = this.f130586b.keySet().iterator();
                while (it.hasNext()) {
                    LinkedList linkedList = (LinkedList) this.f130586b.get((C27999b) it.next());
                    if (linkedList != null) {
                        Iterator it2 = linkedList.iterator();
                        while (it2.hasNext()) {
                            ((C27998a) it2.next()).m141110d();
                        }
                    }
                }
                this.f130586b.clear();
                this.f130587c++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public C27998a m141118c(int i11, int i12) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("getOrCreate(");
        sb2.append(i11);
        sb2.append(",");
        sb2.append(i12);
        sb2.append(")");
        synchronized (this.f130585a) {
            try {
                C27999b c27999b = new C27999b(i11, i12, (int) Thread.currentThread().getId());
                LinkedList linkedList = (LinkedList) this.f130586b.get(c27999b);
                if (linkedList != null && linkedList.size() != 0) {
                    C27998a c27998a = (C27998a) linkedList.removeFirst();
                    if (c27998a != null) {
                        return c27998a;
                    }
                    return new C27998a(c27999b, this.f130587c);
                }
                return new C27998a(c27999b, this.f130587c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public void m141119d(C27998a c27998a) {
        synchronized (this.f130585a) {
            try {
                if (c27998a.m141112f() != this.f130587c) {
                    AbstractC23350e.m122774d("FBPool", "FrameBuffer invalid");
                    if (c27998a.m141111e() != null && c27998a.m141111e().f130583c == Thread.currentThread().getId()) {
                        c27998a.m141110d();
                    }
                    return;
                }
                LinkedList linkedList = (LinkedList) this.f130586b.get(c27998a.m141111e());
                if (linkedList == null) {
                    linkedList = new LinkedList();
                    c27998a.m141114i();
                    this.f130586b.put(c27998a.m141111e(), linkedList);
                }
                linkedList.add(c27998a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
