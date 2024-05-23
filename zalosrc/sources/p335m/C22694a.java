package p335m;

import java.util.ArrayList;
import java.util.List;

/* renamed from: m.a */
/* loaded from: classes2.dex */
public final class C22694a {

    /* renamed from: a */
    private String f111181a = null;

    /* renamed from: b */
    private List f111182b = null;

    /* renamed from: c */
    private List f111183c = null;

    /* renamed from: b */
    private String m117371b(List list) {
        StringBuffer stringBuffer = new StringBuffer();
        if (list == null) {
            return "";
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            stringBuffer.append((String) list.get(i11));
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public String m117372a() {
        return this.f111181a;
    }

    /* renamed from: c */
    public void m117373c(String str) {
        this.f111181a = str;
    }

    /* renamed from: d */
    public List m117374d() {
        if (this.f111182b == null) {
            this.f111182b = new ArrayList();
        }
        return this.f111182b;
    }

    /* renamed from: e */
    public void m117375e(List list) {
        this.f111182b = list;
    }

    public String toString() {
        return "DAASTAudioClicks [clickThrough=" + this.f111181a + ", clickTracking=[" + m117371b(this.f111182b) + "], clickCustom=[" + m117371b(this.f111183c) + "] ]";
    }
}
