package tg;

import java.util.List;

/* renamed from: tg.g */
/* loaded from: classes3.dex */
public class C26656g extends AbstractC26651b {

    /* renamed from: d */
    private final a f126154d;

    /* renamed from: e */
    private final b f126155e = new b() { // from class: tg.f
        public /* synthetic */ C26655f() {
        }

        @Override // tg.C26656g.b
        /* renamed from: a */
        public final void mo136814a(List list, int i11, List list2, byte b11) {
            C26656g.this.m136816e(list, i11, list2, b11);
        }
    };

    /* renamed from: tg.g$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo136818a(List list, int i11, List list2, byte b11);
    }

    /* renamed from: tg.g$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: a */
        void mo136814a(List list, int i11, List list2, byte b11);
    }

    public C26656g(a aVar) {
        this.f126154d = aVar;
    }

    /* renamed from: e */
    public /* synthetic */ void m136816e(List list, int i11, List list2, byte b11) {
        try {
            this.f126154d.mo136818a(list, i11, list2, b11);
            for (int i12 = 0; i12 < list.size(); i12++) {
                this.f126128a.remove(list.get(i12));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: f */
    public synchronized void m136817f(List list, byte b11) {
        int i11 = 0;
        while (i11 < list.size()) {
            try {
                try {
                    if (m136799b((String) list.get(i11))) {
                        list.remove(i11);
                    } else {
                        i11++;
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (list.size() == 0) {
            return;
        }
        RunnableC26653d runnableC26653d = new RunnableC26653d(list, b11, this.f126155e);
        for (int i12 = 0; i12 < list.size(); i12++) {
            this.f126128a.put((String) list.get(i12), runnableC26653d);
        }
        AbstractC26651b.f126127c.execute(runnableC26653d);
    }
}
