package x00;

import android.content.Context;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import pm0.AbstractC24866w;
import pm0.C24860q;

/* renamed from: x00.e */
/* loaded from: classes5.dex */
public final class C29284e implements InterfaceC29283d {

    /* renamed from: a */
    private final ConcurrentHashMap f135714a;

    /* renamed from: b */
    private final ConcurrentHashMap f135715b;

    /* renamed from: c */
    private final ConcurrentHashMap f135716c;

    /* renamed from: d */
    private final List f135717d;

    /* renamed from: e */
    private final ConcurrentHashMap f135718e;

    /* renamed from: f */
    private final List f135719f;

    /* renamed from: g */
    private boolean f135720g;

    /* renamed from: h */
    private boolean f135721h;

    /* renamed from: i */
    private boolean f135722i;

    /* renamed from: j */
    private boolean f135723j;

    /* renamed from: k */
    private final ConcurrentHashMap f135724k;

    public C29284e(Context context) {
        AbstractC19074t.m100208f(context, "context");
        this.f135714a = new ConcurrentHashMap();
        this.f135715b = new ConcurrentHashMap();
        this.f135716c = new ConcurrentHashMap();
        this.f135717d = new ArrayList();
        this.f135718e = new ConcurrentHashMap();
        this.f135719f = new ArrayList();
        this.f135724k = new ConcurrentHashMap();
    }

    @Override // x00.InterfaceC29283d
    /* renamed from: a */
    public List mo146362a() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f135719f);
        this.f135719f.clear();
        return arrayList;
    }

    @Override // x00.InterfaceC29283d
    /* renamed from: b */
    public void mo146363b(boolean z11) {
        this.f135722i = z11;
    }

    @Override // x00.InterfaceC29283d
    /* renamed from: c */
    public void mo146364c(Video video) {
        AbstractC19074t.m100208f(video, "video");
        if (this.f135720g) {
            this.f135717d.add(video);
        }
    }

    @Override // x00.InterfaceC29283d
    public void clear() {
        this.f135714a.clear();
        this.f135715b.clear();
        this.f135716c.clear();
        this.f135717d.clear();
        this.f135718e.clear();
        this.f135719f.clear();
        this.f135720g = false;
        this.f135721h = false;
        this.f135722i = false;
    }

    @Override // x00.InterfaceC29283d
    /* renamed from: d */
    public List mo146365d() {
        ConcurrentHashMap concurrentHashMap = this.f135716c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (!((Boolean) ((C24860q) entry.getValue()).m129215c()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        return arrayList;
    }

    @Override // x00.InterfaceC29283d
    /* renamed from: e */
    public void mo146366e(Video video) {
        AbstractC19074t.m100208f(video, "video");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f135717d);
        arrayList.remove(video);
        this.f135717d.clear();
        List list = this.f135717d;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!AbstractC19074t.m100204b(((Video) obj).m52911t(), video.m52911t())) {
                arrayList2.add(obj);
            }
        }
        list.addAll(arrayList2);
    }

    @Override // x00.InterfaceC29283d
    /* renamed from: f */
    public boolean mo146367f() {
        return this.f135722i;
    }

    @Override // x00.InterfaceC29283d
    /* renamed from: g */
    public void mo146368g(Video video) {
        AbstractC19074t.m100208f(video, "video");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f135719f);
        arrayList.remove(video);
        this.f135719f.clear();
        List list = this.f135719f;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!AbstractC19074t.m100204b(((Video) obj).m52911t(), video.m52911t())) {
                arrayList2.add(obj);
            }
        }
        list.addAll(arrayList2);
    }

    @Override // x00.InterfaceC29283d
    /* renamed from: h */
    public List mo146369h() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f135717d);
        this.f135717d.clear();
        return arrayList;
    }

    @Override // x00.InterfaceC29283d
    /* renamed from: i */
    public List mo146370i() {
        ConcurrentHashMap concurrentHashMap = this.f135718e;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (!((Boolean) ((C24860q) entry.getValue()).m129215c()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        return arrayList;
    }

    @Override // x00.InterfaceC29283d
    /* renamed from: j */
    public void mo146371j(String str, Section section) {
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(section, "section");
        this.f135714a.put(str, section);
    }

    @Override // x00.InterfaceC29283d
    /* renamed from: k */
    public void mo146372k(boolean z11) {
        this.f135723j = z11;
    }

    @Override // x00.InterfaceC29283d
    /* renamed from: l */
    public void mo146373l(Video video) {
        AbstractC19074t.m100208f(video, "video");
        if (this.f135721h) {
            this.f135719f.add(video);
        }
    }

    @Override // x00.InterfaceC29283d
    /* renamed from: m */
    public boolean mo146374m() {
        return this.f135723j;
    }

    @Override // x00.InterfaceC29283d
    /* renamed from: n */
    public void mo146375n(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "id");
        this.f135715b.put(str, Boolean.valueOf(z11));
    }

    @Override // x00.InterfaceC29283d
    /* renamed from: o */
    public void mo146376o(boolean z11) {
        this.f135721h = z11;
    }

    @Override // x00.InterfaceC29283d
    /* renamed from: p */
    public Boolean mo146377p(String str) {
        AbstractC19074t.m100208f(str, "id");
        return (Boolean) this.f135715b.get(str);
    }

    @Override // x00.InterfaceC29283d
    /* renamed from: q */
    public void mo146378q(boolean z11) {
        this.f135720g = z11;
    }

    @Override // x00.InterfaceC29283d
    /* renamed from: r */
    public C24860q mo146379r(String str) {
        AbstractC19074t.m100208f(str, "id");
        return (C24860q) this.f135716c.get(str);
    }

    @Override // x00.InterfaceC29283d
    /* renamed from: s */
    public C24860q mo146380s(String str) {
        AbstractC19074t.m100208f(str, "id");
        return (C24860q) this.f135718e.get(str);
    }

    @Override // x00.InterfaceC29283d
    /* renamed from: t */
    public Section mo146381t(String str) {
        AbstractC19074t.m100208f(str, "id");
        return (Section) this.f135714a.remove(str);
    }

    @Override // x00.InterfaceC29283d
    /* renamed from: u */
    public void mo146382u(String str, Boolean bool, Long l11) {
        AbstractC19074t.m100208f(str, "id");
        ConcurrentHashMap concurrentHashMap = this.f135716c;
        if (bool == null) {
            C24860q c24860q = (C24860q) concurrentHashMap.get(str);
            if (c24860q != null) {
                bool = (Boolean) c24860q.m129215c();
            } else {
                bool = null;
            }
            if (bool == null) {
                return;
            }
        }
        Boolean valueOf = Boolean.valueOf(bool.booleanValue());
        if (l11 == null) {
            C24860q c24860q2 = (C24860q) this.f135716c.get(str);
            if (c24860q2 != null) {
                l11 = (Long) c24860q2.m129216d();
            } else {
                l11 = null;
            }
        }
        concurrentHashMap.put(str, AbstractC24866w.m129235a(valueOf, l11));
    }

    @Override // x00.InterfaceC29283d
    /* renamed from: v */
    public void mo146383v(String str, Boolean bool, Long l11) {
        AbstractC19074t.m100208f(str, "id");
        ConcurrentHashMap concurrentHashMap = this.f135718e;
        if (bool == null) {
            C24860q c24860q = (C24860q) concurrentHashMap.get(str);
            if (c24860q != null) {
                bool = (Boolean) c24860q.m129215c();
            } else {
                bool = null;
            }
            if (bool == null) {
                return;
            }
        }
        Boolean valueOf = Boolean.valueOf(bool.booleanValue());
        if (l11 == null) {
            C24860q c24860q2 = (C24860q) this.f135718e.get(str);
            if (c24860q2 != null) {
                l11 = (Long) c24860q2.m129216d();
            } else {
                l11 = null;
            }
        }
        concurrentHashMap.put(str, AbstractC24866w.m129235a(valueOf, l11));
    }
}
