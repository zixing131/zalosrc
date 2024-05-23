package r30;

import android.text.TextUtils;
import fg0.ThreadFactoryC18928a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import p142ey.C18644n;
import p304ks.C21927m;

/* renamed from: r30.c */
/* loaded from: classes5.dex */
public abstract class AbstractC25633c {

    /* renamed from: a */
    private final List f122584a = Collections.synchronizedList(new C25631a());

    /* renamed from: b */
    protected final ExecutorService f122585b = Executors.newSingleThreadExecutor(new ThreadFactoryC18928a("BaseHighlight"));

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m132457i(List list) {
        try {
            StringBuilder sb2 = new StringBuilder("[");
            Iterator it = list.iterator();
            boolean z11 = true;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!TextUtils.isEmpty(str)) {
                    if (!z11) {
                        sb2.append(",");
                    }
                    sb2.append(str);
                    z11 = false;
                }
            }
            sb2.append("]");
            mo132469n(sb2.toString());
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public void m132458b() {
        try {
            boolean z11 = false;
            for (int size = this.f122584a.size() - 1; size >= 0; size--) {
                String str = (String) this.f122584a.get(size);
                if (!C18644n.m98531l().m98558u(str) && !C21927m.m114302u().m114312J().m153137g(str)) {
                }
                this.f122584a.remove(size);
                z11 = true;
            }
            if (z11) {
                m132470o();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: c */
    public void m132459c() {
        this.f122584a.clear();
        m132470o();
    }

    /* renamed from: d */
    public boolean m132460d(String str) {
        return this.f122584a.contains(str);
    }

    /* renamed from: e */
    protected abstract Object mo132461e(String str);

    /* renamed from: f */
    public List m132462f() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f122584a.iterator();
        while (it.hasNext()) {
            Object mo132461e = mo132461e((String) it.next());
            if (mo132461e != null) {
                arrayList.add(mo132461e);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public int m132463g() {
        return this.f122584a.size();
    }

    /* renamed from: h */
    public void m132464h() {
        try {
            this.f122584a.clear();
            String mo132465j = mo132465j();
            if (!TextUtils.isEmpty(mo132465j)) {
                ArrayList arrayList = new ArrayList();
                JSONArray jSONArray = new JSONArray(mo132465j);
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    arrayList.add(jSONArray.optString(i11));
                }
                this.f122584a.addAll(arrayList);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: j */
    protected abstract String mo132465j();

    /* renamed from: k */
    public void m132466k(String str) {
        if (!this.f122584a.contains(str)) {
            boolean z11 = false;
            if (this.f122584a.size() >= 6) {
                this.f122584a.remove(0);
                z11 = true;
            }
            if (this.f122584a.add(str) || z11) {
                m132470o();
            }
        }
    }

    /* renamed from: l */
    public void m132467l(String str) {
        if (this.f122584a.remove(str)) {
            m132470o();
        }
    }

    /* renamed from: m */
    public void m132468m(String str) {
        this.f122584a.remove(str);
    }

    /* renamed from: n */
    protected abstract void mo132469n(String str);

    /* renamed from: o */
    protected void m132470o() {
        final List list = this.f122584a;
        this.f122585b.execute(new Runnable() { // from class: r30.b
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC25633c.this.m132457i(list);
            }
        });
    }
}
