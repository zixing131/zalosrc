package p586vt;

import f40.C18719a;
import fn0.AbstractC19074t;
import java.util.Map;
import nh0.C23793c;
import p586vt.C28624i;

/* renamed from: vt.a */
/* loaded from: classes.dex */
public final class C28616a implements C28624i.b {

    /* renamed from: a */
    private C28628m f132689a;

    /* renamed from: b */
    private Map f132690b;

    public C28616a() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28616a(C28628m c28628m, Map map) {
        this();
        AbstractC19074t.m100208f(c28628m, "jobStorage");
        AbstractC19074t.m100208f(map, "jobStateMap");
        this.f132689a = c28628m;
        this.f132690b = map;
    }

    @Override // p586vt.C28624i.b
    /* renamed from: a */
    public void mo143118a(AbstractC28617b abstractC28617b) {
        AbstractC19074t.m100208f(abstractC28617b, "job");
        try {
            C28628m c28628m = this.f132689a;
            if (c28628m == null) {
                AbstractC19074t.m100223u("jobStorage");
                c28628m = null;
            }
            c28628m.m143187e(abstractC28617b, 3);
            Map map = this.f132690b;
            if (map == null) {
                AbstractC19074t.m100223u("jobStateMap");
                map = null;
            }
            map.put(abstractC28617b, 3);
            C18719a.m98713f("onJobResume(): Queue=" + abstractC28617b.mo96987d() + ", ID=" + abstractC28617b.m143125c() + ", " + abstractC28617b, null, 2, null);
        } catch (Exception e11) {
            C28624i.Companion.m143167b(e11);
        }
    }

    @Override // p586vt.C28624i.b
    /* renamed from: b */
    public void mo143119b(AbstractC28617b abstractC28617b) {
        AbstractC19074t.m100208f(abstractC28617b, "job");
        try {
            C28628m c28628m = this.f132689a;
            if (c28628m == null) {
                AbstractC19074t.m100223u("jobStorage");
                c28628m = null;
            }
            c28628m.m143187e(abstractC28617b, 1);
            Map map = this.f132690b;
            if (map == null) {
                AbstractC19074t.m100223u("jobStateMap");
                map = null;
            }
            map.put(abstractC28617b, 1);
            C18719a.m98713f("onJobStart(): Queue=" + abstractC28617b.mo96987d() + ", ID=" + abstractC28617b.m143125c() + ", " + abstractC28617b, null, 2, null);
        } catch (Exception e11) {
            C28624i.Companion.m143167b(e11);
        }
    }

    @Override // p586vt.C28624i.b
    /* renamed from: c */
    public void mo143120c(AbstractC28617b abstractC28617b, AbstractC28626k abstractC28626k) {
        AbstractC19074t.m100208f(abstractC28617b, "job");
        AbstractC19074t.m100208f(abstractC28626k, "jobResult");
        try {
            C28628m c28628m = this.f132689a;
            if (c28628m == null) {
                AbstractC19074t.m100223u("jobStorage");
                c28628m = null;
            }
            c28628m.m143186d(abstractC28617b, abstractC28626k, C23793c.Companion.m124321a().mo124310e());
            Map map = this.f132690b;
            if (map == null) {
                AbstractC19074t.m100223u("jobStateMap");
                map = null;
            }
            map.put(abstractC28617b, 2);
            C18719a.m98713f("onJobRunCompleted(): Queue=" + abstractC28617b.mo96987d() + ", ID=" + abstractC28617b.m143125c() + ", " + abstractC28617b, null, 2, null);
        } catch (Exception e11) {
            C28624i.Companion.m143167b(e11);
        }
    }

    @Override // p586vt.C28624i.b
    /* renamed from: d */
    public void mo143121d(AbstractC28617b abstractC28617b) {
        AbstractC19074t.m100208f(abstractC28617b, "job");
        try {
            C28628m c28628m = this.f132689a;
            if (c28628m == null) {
                AbstractC19074t.m100223u("jobStorage");
                c28628m = null;
            }
            c28628m.m143187e(abstractC28617b, 5);
            Map map = this.f132690b;
            if (map == null) {
                AbstractC19074t.m100223u("jobStateMap");
                map = null;
            }
            map.put(abstractC28617b, 5);
            C18719a.m98713f("onJobRetry(): Queue=" + abstractC28617b.mo96987d() + ", ID=" + abstractC28617b.m143125c() + ", " + abstractC28617b, null, 2, null);
        } catch (Exception e11) {
            C28624i.Companion.m143167b(e11);
        }
    }

    @Override // p586vt.C28624i.b
    /* renamed from: e */
    public void mo143122e(AbstractC28617b abstractC28617b) {
        AbstractC19074t.m100208f(abstractC28617b, "job");
        try {
            C28628m c28628m = this.f132689a;
            if (c28628m == null) {
                AbstractC19074t.m100223u("jobStorage");
                c28628m = null;
            }
            c28628m.m143187e(abstractC28617b, 0);
            Map map = this.f132690b;
            if (map == null) {
                AbstractC19074t.m100223u("jobStateMap");
                map = null;
            }
            map.put(abstractC28617b, 0);
            C18719a.m98713f("onJobSummitInQueue(): Queue=" + abstractC28617b.mo96987d() + ", ID=" + abstractC28617b.m143125c() + ", " + abstractC28617b, null, 2, null);
        } catch (Exception e11) {
            C28624i.Companion.m143167b(e11);
        }
    }

    @Override // p586vt.C28624i.b
    /* renamed from: f */
    public void mo143123f(AbstractC28617b abstractC28617b, AbstractC28626k abstractC28626k) {
        AbstractC19074t.m100208f(abstractC28617b, "job");
        AbstractC19074t.m100208f(abstractC28626k, "jobResult");
        try {
            C28628m c28628m = this.f132689a;
            if (c28628m == null) {
                AbstractC19074t.m100223u("jobStorage");
                c28628m = null;
            }
            c28628m.m143186d(abstractC28617b, abstractC28626k, C23793c.Companion.m124321a().mo124310e());
            Map map = this.f132690b;
            if (map == null) {
                AbstractC19074t.m100223u("jobStateMap");
                map = null;
            }
            map.put(abstractC28617b, 4);
            C18719a.m98713f("onJobRunCompleted(): job=" + abstractC28617b + ", result=" + abstractC28626k + ", " + abstractC28617b, null, 2, null);
        } catch (Exception e11) {
            C28624i.Companion.m143167b(e11);
        }
    }
}
