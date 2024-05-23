package p375o;

import java.util.ArrayList;
import java.util.List;

/* renamed from: o.b */
/* loaded from: classes2.dex */
public final class C23971b {

    /* renamed from: a */
    private String f116023a;

    /* renamed from: b */
    private List f116024b;

    /* renamed from: c */
    private List f116025c;

    /* renamed from: b */
    private String m125452b(List list) {
        StringBuffer stringBuffer = new StringBuffer();
        if (list == null) {
            return "";
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            stringBuffer.append(((String) list.get(i11)).toString());
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public String m125453a() {
        return this.f116023a;
    }

    /* renamed from: c */
    public void m125454c(String str) {
        this.f116023a = str;
    }

    /* renamed from: d */
    public List m125455d() {
        if (this.f116024b == null) {
            this.f116024b = new ArrayList();
        }
        return this.f116024b;
    }

    /* renamed from: e */
    public void m125456e(List list) {
        this.f116024b = list;
    }

    public String toString() {
        return "VASTVideoClicks [clickThrough=" + this.f116023a + ", clickTracking=[" + m125452b(this.f116024b) + "], customClick=[" + m125452b(this.f116025c) + "] ]";
    }
}
