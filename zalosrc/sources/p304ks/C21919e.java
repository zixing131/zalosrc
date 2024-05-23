package p304ks;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ls.C22642b;

/* renamed from: ks.e */
/* loaded from: classes4.dex */
public class C21919e {

    /* renamed from: a */
    Map f107764a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b */
    Map f107765b = Collections.synchronizedMap(new HashMap());

    /* renamed from: a */
    public void m114262a() {
        this.f107764a.clear();
        this.f107765b.clear();
    }

    /* renamed from: b */
    public C22642b m114263b(String str) {
        Map map = this.f107765b;
        if (map != null) {
            return (C22642b) map.get(str);
        }
        return null;
    }

    /* renamed from: c */
    public C22642b m114264c(String str) {
        Map map = this.f107764a;
        if (map != null) {
            return (C22642b) map.get(str);
        }
        return null;
    }

    /* renamed from: d */
    public List m114265d() {
        return new ArrayList(this.f107765b.values());
    }

    /* renamed from: e */
    public boolean m114266e(String str) {
        return this.f107765b.containsKey(str);
    }

    /* renamed from: f */
    public boolean m114267f(String str) {
        return this.f107764a.containsKey(str);
    }

    /* renamed from: g */
    public void m114268g(C22642b c22642b) {
        if (c22642b == null) {
            return;
        }
        if (!TextUtils.isEmpty(c22642b.f111042a)) {
            this.f107764a.put(c22642b.f111042a, c22642b);
        }
        if (!TextUtils.isEmpty(c22642b.f111043b)) {
            this.f107765b.put(c22642b.f111043b, c22642b);
        }
    }

    /* renamed from: h */
    public int m114269h() {
        return Math.min(this.f107764a.size(), this.f107765b.size());
    }
}
